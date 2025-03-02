package hello;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class HelloJava extends JFrame {
    
    private final int BOARD_SIZE = 10; // 보드의 크기 (10x10)
    private final int NUMBER_OF_MINES = 15; // 지뢰의 수
    
    private JButton[][] boardButtons;
    private boolean[][] mineLocations;
    private boolean[][] revealed;
    
    public HelloJava() {
        setTitle("지뢰찾기");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mineLocations = new boolean[BOARD_SIZE][BOARD_SIZE];
        revealed = new boolean[BOARD_SIZE][BOARD_SIZE];
        
        initializeBoard();
        
        setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE));
        setVisible(true);
    }
    
    private void initializeBoard() {
        boardButtons = new JButton[BOARD_SIZE][BOARD_SIZE];
        
        // 보드 초기화
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                JButton button = new JButton();
                boardButtons[i][j] = button;
                final int row = i;
                final int col = j;
                button.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        if (SwingUtilities.isRightMouseButton(e)) {
                            // 우클릭하면 깃발 꽂기 (플래그 토글)
                            if (!revealed[row][col]) {
                                button.setText(button.getText().equals("F") ? "" : "F");
                            }
                        } else {
                            // 좌클릭하면 지뢰 찾기 시도
                            if (!revealed[row][col]) {
                                revealCell(row, col);
                            }
                        }
                    }
                });
                add(button);
            }
        }
        
        // 지뢰 배치
        placeMines();
        
        // 숫자 표시
        calculateAdjacentMines();
    }
    
    private void placeMines() {
        Random random = new Random();
        int minesPlaced = 0;
        while (minesPlaced < NUMBER_OF_MINES) {
            int row = random.nextInt(BOARD_SIZE);
            int col = random.nextInt(BOARD_SIZE);
            if (!mineLocations[row][col]) {
                mineLocations[row][col] = true;
                minesPlaced++;
            }
        }
    }
    
    private void calculateAdjacentMines() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (!mineLocations[i][j]) {
                    int count = 0;
                    // 검사하는 주변 8개의 칸에 지뢰가 있는지 확인
                    for (int dr = -1; dr <= 1; dr++) {
                        for (int dc = -1; dc <= 1; dc++) {
                            int nr = i + dr;
                            int nc = j + dc;
                            if (nr >= 0 && nr < BOARD_SIZE && nc >= 0 && nc < BOARD_SIZE && mineLocations[nr][nc]) {
                                count++;
                            }
                        }
                    }
                    if (count > 0) {
                        boardButtons[i][j].setText(Integer.toString(count));
                    }
                }
            }
        }
    }
    
    private void revealCell(int row, int col) {
        if (revealed[row][col]) {
            return;
        }
        
        revealed[row][col] = true;
        
        if (mineLocations[row][col]) {
            // 게임 오버 처리
            JOptionPane.showMessageDialog(this, "지뢰를 찾았습니다! 게임 오버!", "게임 오버", JOptionPane.INFORMATION_MESSAGE);
            revealAllMines();
        } else {
            // 주변에 지뢰가 없으면 주변 칸들을 재귀적으로 열기
            if (boardButtons[row][col].getText().isEmpty()) {
                for (int dr = -1; dr <= 1; dr++) {
                    for (int dc = -1; dc <= 1; dc++) {
                        int nr = row + dr;
                        int nc = col + dc;
                        if (nr >= 0 && nr < BOARD_SIZE && nc >= 0 && nc < BOARD_SIZE && !revealed[nr][nc]) {
                            revealCell(nr, nc);
                        }
                    }
                }
            }
        }
        
        checkGameWon();
    }
    
    private void revealAllMines() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (mineLocations[i][j]) {
                    boardButtons[i][j].setText("X");
                }
            }
        }
    }
    
    private void checkGameWon() {
        boolean won = true;
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (!mineLocations[i][j] && !revealed[i][j]) {
                    won = false;
                    break;
                }
            }
            if (!won) {
                break;
            }
        }
        
        if (won) {
            JOptionPane.showMessageDialog(this, "축하합니다! 모든 지뢰를 찾았습니다!", "게임 클리어", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HelloJava());
    }
}
