package framework.RWT;

import java.awt.event.KeyEvent;


public class RWTVirtualController {

	private boolean bKeyDown[][] = {
			{false, false, false, false, false, false, false, false,
				false,false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false, false, false, false}};
	private boolean rawKeyDown[] = {
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false
	};
	private boolean mouseButtonDown1 = false;
	private boolean mouseButtonDown2 = false;
	private boolean mouseButtonDown3 = false;
	private double mouseX = 0;
	private double mouseY = 0;
	private static RWTVirtualKey keyMap[] = new RWTVirtualKey[1000];

	public static final int UP = 0;
	public static final int DOWN = 1;
	public static final int RIGHT = 2;
	public static final int LEFT = 3;
	public static final int BUTTON_A = 4;
	public static final int BUTTON_B = 5;
	public static final int BUTTON_C = 6;
	public static final int BUTTON_D = 7;
	public static final int TURN_RIGHT = 7;
	public static final int BUTTON_E = 8;
	public static final int ATTACK_WEAPON=8;
	public static final int TURN_LEFT =9;
	public static final int USE_ITEM=10;
	public static final int UP2=11;
	public static final int DOWN2 = 12;
	public static final int RIGHT2 = 13;
	public static final int LEFT2 = 14;
	public static final int TURN_RIGHT2=15;
	public static final int TURN_LEFT2=16;
	public static final int USE_ITEM2=17;
	public static final int ATTACK_WEAPON2=18;

	public RWTVirtualController() {
		// player1用のkeyBindの初期化
		RWTVirtualController.keyBind(KeyEvent.VK_W, 0, RWTVirtualController.UP);	// w
		RWTVirtualController.keyBind(KeyEvent.VK_D, 0, RWTVirtualController.RIGHT);	//d
		RWTVirtualController.keyBind(KeyEvent.VK_A, 0, RWTVirtualController.LEFT);	// a
		RWTVirtualController.keyBind(KeyEvent.VK_S, 0, RWTVirtualController.DOWN);	// s
		RWTVirtualController.keyBind(KeyEvent.VK_V, 0, RWTVirtualController.BUTTON_B);	// v
		RWTVirtualController.keyBind(KeyEvent.VK_B, 0, RWTVirtualController.BUTTON_A);	// b
		RWTVirtualController.keyBind(KeyEvent.VK_SPACE, 0, RWTVirtualController.BUTTON_C);	// space
		RWTVirtualController.keyBind(KeyEvent.VK_E, 0, RWTVirtualController.BUTTON_D);	// e
		RWTVirtualController.keyBind(KeyEvent.VK_F, 0, RWTVirtualController.BUTTON_E);	// f
		RWTVirtualController.keyBind(KeyEvent.VK_Q, 0, RWTVirtualController.TURN_LEFT);	// q
		RWTVirtualController.keyBind(KeyEvent.VK_G, 0, RWTVirtualController.USE_ITEM);	// g

		// player2用のkeyBindの初期化
		RWTVirtualController.keyBind(KeyEvent.VK_O, 1, RWTVirtualController.UP2);	// o
		RWTVirtualController.keyBind(KeyEvent.VK_SEMICOLON, 1, RWTVirtualController.RIGHT2);	//;
		RWTVirtualController.keyBind(KeyEvent.VK_K, 1, RWTVirtualController.LEFT2);	// k
		RWTVirtualController.keyBind(KeyEvent.VK_L, 1, RWTVirtualController.DOWN2);	// l
		RWTVirtualController.keyBind(KeyEvent.VK_BACK_SLASH, 1, RWTVirtualController.BUTTON_B);	// \
		RWTVirtualController.keyBind(KeyEvent.VK_SHIFT, 1, RWTVirtualController.BUTTON_A);	// shift
		RWTVirtualController.keyBind(KeyEvent.VK_CONTROL, 1, RWTVirtualController.BUTTON_C);	// ctrl
		RWTVirtualController.keyBind(KeyEvent.VK_P, 1, RWTVirtualController.BUTTON_D);	// p
		RWTVirtualController.keyBind(KeyEvent.VK_ADD, 1, RWTVirtualController.USE_ITEM2);	//enter
		RWTVirtualController.keyBind(KeyEvent.VK_MULTIPLY



				, 1, RWTVirtualController.ATTACK_WEAPON2);	//plus



		//テンキー
		RWTVirtualController.keyBind(KeyEvent.VK_NUMPAD8, 1, RWTVirtualController.UP2);	// ↑
		RWTVirtualController.keyBind(KeyEvent.VK_NUMPAD6, 1, RWTVirtualController.RIGHT2);	//→
		RWTVirtualController.keyBind(KeyEvent.VK_NUMPAD4, 1, RWTVirtualController.LEFT2);	// ←
		RWTVirtualController.keyBind(KeyEvent.VK_NUMPAD5, 1, RWTVirtualController.DOWN2);	// ↓
		RWTVirtualController.keyBind(KeyEvent.VK_NUMPAD9, 1, RWTVirtualController.TURN_RIGHT2);
		RWTVirtualController.keyBind(KeyEvent.VK_NUMPAD7, 1, RWTVirtualController.TURN_LEFT2);

	}

	static public void keyBind(int keyCode, int playerNo, int buttonNo) {
		keyMap[keyCode] = new RWTVirtualKey(playerNo, keyCode, buttonNo);
	}

	public boolean isKeyDown(int player, int keyNo) {
		return bKeyDown[player][keyNo];
	}

	public boolean isKeyDown(int keyCode) {
		return rawKeyDown[keyCode];
	}

	public void setKeyDown(int keyCode, boolean b) {
		if (keyMap[keyCode] != null) {
			bKeyDown[keyMap[keyCode].getPlayer()][keyMap[keyCode].getVirtualKey()] = b;
		}
		rawKeyDown[keyCode] = b;
	}

	public RWTVirtualKey getVirtualKey(int keyCode) {
		return keyMap[keyCode];
	}

	public boolean isMouseButtonDown(int buttonNo) {
		switch (buttonNo) {
		case 0:
			return mouseButtonDown1;
		case 1:
			return mouseButtonDown2;
		case 2:
			return mouseButtonDown3;
		}
		return false;
	}

	public void setMouseButtonDown(int buttonNo, boolean b) {
		switch (buttonNo) {
		case 0:
			mouseButtonDown1 = b;
			break;
		case 1:
			mouseButtonDown2 = b;
			break;
		case 2:
			mouseButtonDown3 = b;
			break;
		}
	}

	public double getMouseX() {
		return mouseX;
	}

	public double getMouseY() {
		return mouseY;
	}

	public void setMousePosition(double x, double y) {
		mouseX = x;
		mouseY = y;
	}

	public void moveMousePosition(double dx, double dy) {
		mouseX += dx;
		mouseY += dy;
	}
}
