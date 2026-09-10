package com.badlogic.gdx.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.utils.GdxRuntimeException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.net.InetAddress;
import java.net.ServerSocket;

/* JADX INFO: loaded from: classes.dex */
public class RemoteInput implements Runnable, Input {
    public static int DEFAULT_PORT = 8190;
    private static final int MAX_TOUCHES = 20;
    private float[] accel;
    private float[] compass;
    private boolean connected;
    int[] deltaX;
    int[] deltaY;
    private float[] gyrate;
    public final String[] ips;
    boolean[] isTouched;
    boolean[] justPressedKeys;
    boolean justTouched;
    int keyCount;
    boolean keyJustPressed;
    boolean[] keys;
    private RemoteInputListener listener;
    private boolean multiTouch;
    private final int port;
    InputProcessor processor;
    private float remoteHeight;
    private float remoteWidth;
    private ServerSocket serverSocket;
    int[] touchX;
    int[] touchY;

    public class EventTrigger implements Runnable {
        KeyEvent keyEvent;
        TouchEvent touchEvent;

        public EventTrigger(TouchEvent touchEvent, KeyEvent keyEvent) {
            this.touchEvent = touchEvent;
            this.keyEvent = keyEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            RemoteInput remoteInput = RemoteInput.this;
            remoteInput.justTouched = false;
            if (remoteInput.keyJustPressed) {
                remoteInput.keyJustPressed = false;
                int i = 0;
                while (true) {
                    boolean[] zArr = RemoteInput.this.justPressedKeys;
                    if (i >= zArr.length) {
                        break;
                    }
                    zArr[i] = false;
                    i++;
                }
            }
            RemoteInput remoteInput2 = RemoteInput.this;
            InputProcessor inputProcessor = remoteInput2.processor;
            if (inputProcessor == null) {
                TouchEvent touchEvent = this.touchEvent;
                if (touchEvent != null) {
                    int i2 = touchEvent.type;
                    if (i2 == 0) {
                        int[] iArr = remoteInput2.deltaX;
                        int i3 = touchEvent.pointer;
                        iArr[i3] = 0;
                        remoteInput2.deltaY[i3] = 0;
                        remoteInput2.isTouched[i3] = true;
                        remoteInput2.justTouched = true;
                    } else if (i2 == 1) {
                        int[] iArr2 = remoteInput2.deltaX;
                        int i4 = touchEvent.pointer;
                        iArr2[i4] = 0;
                        remoteInput2.deltaY[i4] = 0;
                        remoteInput2.isTouched[i4] = false;
                    } else if (i2 == 2) {
                        int[] iArr3 = remoteInput2.deltaX;
                        int i5 = touchEvent.pointer;
                        iArr3[i5] = touchEvent.x - remoteInput2.touchX[i5];
                        remoteInput2.deltaY[i5] = touchEvent.y - remoteInput2.touchY[i5];
                    }
                    int[] iArr4 = remoteInput2.touchX;
                    int i6 = touchEvent.pointer;
                    iArr4[i6] = touchEvent.x;
                    remoteInput2.touchY[i6] = touchEvent.y;
                }
                KeyEvent keyEvent = this.keyEvent;
                if (keyEvent != null) {
                    int i7 = keyEvent.type;
                    if (i7 == 0) {
                        boolean[] zArr2 = remoteInput2.keys;
                        int i8 = keyEvent.keyCode;
                        if (!zArr2[i8]) {
                            remoteInput2.keyCount++;
                            zArr2[i8] = true;
                        }
                        remoteInput2.keyJustPressed = true;
                        remoteInput2.justPressedKeys[i8] = true;
                    }
                    if (i7 == 1) {
                        boolean[] zArr3 = remoteInput2.keys;
                        int i9 = keyEvent.keyCode;
                        if (zArr3[i9]) {
                            remoteInput2.keyCount--;
                            zArr3[i9] = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            TouchEvent touchEvent2 = this.touchEvent;
            if (touchEvent2 != null) {
                int i10 = touchEvent2.type;
                if (i10 == 0) {
                    int[] iArr5 = remoteInput2.deltaX;
                    int i11 = touchEvent2.pointer;
                    iArr5[i11] = 0;
                    remoteInput2.deltaY[i11] = 0;
                    inputProcessor.touchDown(touchEvent2.x, touchEvent2.y, i11, 0);
                    RemoteInput remoteInput3 = RemoteInput.this;
                    remoteInput3.isTouched[this.touchEvent.pointer] = true;
                    remoteInput3.justTouched = true;
                } else if (i10 == 1) {
                    int[] iArr6 = remoteInput2.deltaX;
                    int i12 = touchEvent2.pointer;
                    iArr6[i12] = 0;
                    remoteInput2.deltaY[i12] = 0;
                    inputProcessor.touchUp(touchEvent2.x, touchEvent2.y, i12, 0);
                    RemoteInput.this.isTouched[this.touchEvent.pointer] = false;
                } else if (i10 == 2) {
                    int[] iArr7 = remoteInput2.deltaX;
                    int i13 = touchEvent2.pointer;
                    int i14 = touchEvent2.x;
                    iArr7[i13] = i14 - remoteInput2.touchX[i13];
                    int[] iArr8 = remoteInput2.deltaY;
                    int i15 = touchEvent2.y;
                    iArr8[i13] = i15 - remoteInput2.touchY[i13];
                    inputProcessor.touchDragged(i14, i15, i13);
                }
                RemoteInput remoteInput4 = RemoteInput.this;
                int[] iArr9 = remoteInput4.touchX;
                TouchEvent touchEvent3 = this.touchEvent;
                int i16 = touchEvent3.pointer;
                iArr9[i16] = touchEvent3.x;
                remoteInput4.touchY[i16] = touchEvent3.y;
            }
            KeyEvent keyEvent2 = this.keyEvent;
            if (keyEvent2 != null) {
                int i17 = keyEvent2.type;
                if (i17 == 0) {
                    RemoteInput.this.processor.keyDown(keyEvent2.keyCode);
                    RemoteInput remoteInput5 = RemoteInput.this;
                    boolean[] zArr4 = remoteInput5.keys;
                    int i18 = this.keyEvent.keyCode;
                    if (!zArr4[i18]) {
                        remoteInput5.keyCount++;
                        zArr4[i18] = true;
                    }
                    remoteInput5.keyJustPressed = true;
                    remoteInput5.justPressedKeys[i18] = true;
                    return;
                }
                if (i17 != 1) {
                    if (i17 != 2) {
                        return;
                    }
                    RemoteInput.this.processor.keyTyped(keyEvent2.keyChar);
                    return;
                }
                RemoteInput.this.processor.keyUp(keyEvent2.keyCode);
                RemoteInput remoteInput6 = RemoteInput.this;
                boolean[] zArr5 = remoteInput6.keys;
                int i19 = this.keyEvent.keyCode;
                if (zArr5[i19]) {
                    remoteInput6.keyCount--;
                    zArr5[i19] = false;
                }
            }
        }
    }

    public class KeyEvent {
        static final int KEY_DOWN = 0;
        static final int KEY_TYPED = 2;
        static final int KEY_UP = 1;
        char keyChar;
        int keyCode;
        long timeStamp;
        int type;

        public KeyEvent() {
        }
    }

    public interface RemoteInputListener {
        void onConnected();

        void onDisconnected();
    }

    public class TouchEvent {
        static final int TOUCH_DOWN = 0;
        static final int TOUCH_DRAGGED = 2;
        static final int TOUCH_UP = 1;
        int pointer;
        long timeStamp;
        int type;
        int x;
        int y;

        public TouchEvent() {
        }
    }

    public RemoteInput() {
        this(DEFAULT_PORT);
    }

    @Override // com.badlogic.gdx.Input
    public void closeTextInputField(boolean z) {
    }

    @Override // com.badlogic.gdx.Input
    public float getAccelerometerX() {
        return this.accel[0];
    }

    @Override // com.badlogic.gdx.Input
    public float getAccelerometerY() {
        return this.accel[1];
    }

    @Override // com.badlogic.gdx.Input
    public float getAccelerometerZ() {
        return this.accel[2];
    }

    @Override // com.badlogic.gdx.Input
    public float getAzimuth() {
        return this.compass[0];
    }

    @Override // com.badlogic.gdx.Input
    public long getCurrentEventTime() {
        return 0L;
    }

    @Override // com.badlogic.gdx.Input
    public int getDeltaX() {
        return this.deltaX[0];
    }

    @Override // com.badlogic.gdx.Input
    public int getDeltaY() {
        return this.deltaY[0];
    }

    @Override // com.badlogic.gdx.Input
    public float getGyroscopeX() {
        return this.gyrate[0];
    }

    @Override // com.badlogic.gdx.Input
    public float getGyroscopeY() {
        return this.gyrate[1];
    }

    @Override // com.badlogic.gdx.Input
    public float getGyroscopeZ() {
        return this.gyrate[2];
    }

    public String[] getIPs() {
        return this.ips;
    }

    @Override // com.badlogic.gdx.Input
    public InputProcessor getInputProcessor() {
        return this.processor;
    }

    @Override // com.badlogic.gdx.Input
    public int getMaxPointers() {
        return 20;
    }

    @Override // com.badlogic.gdx.Input
    public Input.Orientation getNativeOrientation() {
        return Input.Orientation.Landscape;
    }

    @Override // com.badlogic.gdx.Input
    public float getPitch() {
        return this.compass[1];
    }

    @Override // com.badlogic.gdx.Input
    public float getPressure() {
        return getPressure(0);
    }

    @Override // com.badlogic.gdx.Input
    public float getRoll() {
        return this.compass[2];
    }

    @Override // com.badlogic.gdx.Input
    public int getRotation() {
        return 0;
    }

    @Override // com.badlogic.gdx.Input
    public void getRotationMatrix(float[] fArr) {
    }

    @Override // com.badlogic.gdx.Input
    public void getTextInput(Input.TextInputListener textInputListener, String str, String str2, String str3) {
        Gdx.app.getInput().getTextInput(textInputListener, str, str2, str3);
    }

    @Override // com.badlogic.gdx.Input
    public int getX() {
        return this.touchX[0];
    }

    @Override // com.badlogic.gdx.Input
    public int getY() {
        return this.touchY[0];
    }

    @Override // com.badlogic.gdx.Input
    public boolean isButtonJustPressed(int i) {
        return i == 0 && this.justTouched;
    }

    @Override // com.badlogic.gdx.Input
    public boolean isButtonPressed(int i) {
        if (i != 0) {
            return false;
        }
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.isTouched;
            if (i2 >= zArr.length) {
                return false;
            }
            if (zArr[i2]) {
                return true;
            }
            i2++;
        }
    }

    @Override // com.badlogic.gdx.Input
    public boolean isCatchKey(int i) {
        return false;
    }

    public boolean isConnected() {
        return this.connected;
    }

    @Override // com.badlogic.gdx.Input
    public boolean isCursorCatched() {
        return false;
    }

    @Override // com.badlogic.gdx.Input
    public boolean isKeyJustPressed(int i) {
        if (i == -1) {
            return this.keyJustPressed;
        }
        if (i < 0 || i > 255) {
            return false;
        }
        return this.justPressedKeys[i];
    }

    @Override // com.badlogic.gdx.Input
    public boolean isKeyPressed(int i) {
        if (i == -1) {
            return this.keyCount > 0;
        }
        if (i < 0 || i > 255) {
            return false;
        }
        return this.keys[i];
    }

    @Override // com.badlogic.gdx.Input
    public boolean isPeripheralAvailable(Input.Peripheral peripheral) {
        if (peripheral == Input.Peripheral.Accelerometer || peripheral == Input.Peripheral.Compass) {
            return true;
        }
        if (peripheral == Input.Peripheral.MultitouchScreen) {
            return this.multiTouch;
        }
        return false;
    }

    @Override // com.badlogic.gdx.Input
    public boolean isTouched() {
        return this.isTouched[0];
    }

    @Override // com.badlogic.gdx.Input
    public boolean justTouched() {
        return this.justTouched;
    }

    @Override // com.badlogic.gdx.Input
    public void openTextInputField(NativeInputConfiguration nativeInputConfiguration) {
    }

    /* JADX INFO: Infinite loop detected, blocks: 34, insns: 0 */
    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getId()" because "imPostDom" is null
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:190)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:72)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.input.RemoteInput.run():void");
    }

    @Override // com.badlogic.gdx.Input
    public void setCatchKey(int i, boolean z) {
    }

    @Override // com.badlogic.gdx.Input
    public void setCursorCatched(boolean z) {
    }

    @Override // com.badlogic.gdx.Input
    public void setCursorPosition(int i, int i2) {
    }

    @Override // com.badlogic.gdx.Input
    public void setInputProcessor(InputProcessor inputProcessor) {
        this.processor = inputProcessor;
    }

    @Override // com.badlogic.gdx.Input
    public void setKeyboardHeightObserver(Input.KeyboardHeightObserver keyboardHeightObserver) {
    }

    @Override // com.badlogic.gdx.Input
    public void setOnscreenKeyboardVisible(boolean z) {
    }

    @Override // com.badlogic.gdx.Input
    public void vibrate(int i) {
    }

    public RemoteInput(RemoteInputListener remoteInputListener) {
        this(DEFAULT_PORT, remoteInputListener);
    }

    @Override // com.badlogic.gdx.Input
    public int getDeltaX(int i) {
        return this.deltaX[i];
    }

    @Override // com.badlogic.gdx.Input
    public int getDeltaY(int i) {
        return this.deltaY[i];
    }

    @Override // com.badlogic.gdx.Input
    public float getPressure(int i) {
        return isTouched(i) ? 1.0f : 0.0f;
    }

    @Override // com.badlogic.gdx.Input
    public void getTextInput(Input.TextInputListener textInputListener, String str, String str2, String str3, Input.OnscreenKeyboardType onscreenKeyboardType) {
        Gdx.app.getInput().getTextInput(textInputListener, str, str2, str3, onscreenKeyboardType);
    }

    @Override // com.badlogic.gdx.Input
    public int getX(int i) {
        return this.touchX[i];
    }

    @Override // com.badlogic.gdx.Input
    public int getY(int i) {
        return this.touchY[i];
    }

    @Override // com.badlogic.gdx.Input
    public boolean isTouched(int i) {
        return this.isTouched[i];
    }

    @Override // com.badlogic.gdx.Input
    public void setOnscreenKeyboardVisible(boolean z, Input.OnscreenKeyboardType onscreenKeyboardType) {
    }

    @Override // com.badlogic.gdx.Input
    public void vibrate(int i, int i2, boolean z) {
    }

    public RemoteInput(int i) {
        this(i, null);
    }

    @Override // com.badlogic.gdx.Input
    public void vibrate(int i, boolean z) {
    }

    public RemoteInput(int i, RemoteInputListener remoteInputListener) {
        this.accel = new float[3];
        this.gyrate = new float[3];
        this.compass = new float[3];
        this.multiTouch = false;
        this.remoteWidth = 0.0f;
        this.remoteHeight = 0.0f;
        this.connected = false;
        this.keyCount = 0;
        this.keys = new boolean[256];
        this.keyJustPressed = false;
        this.justPressedKeys = new boolean[256];
        this.deltaX = new int[20];
        this.deltaY = new int[20];
        this.touchX = new int[20];
        this.touchY = new int[20];
        this.isTouched = new boolean[20];
        this.justTouched = false;
        this.processor = null;
        this.listener = remoteInputListener;
        try {
            this.port = i;
            this.serverSocket = new ServerSocket(i);
            Thread thread = new Thread(this);
            thread.setDaemon(true);
            thread.start();
            InetAddress[] allByName = InetAddress.getAllByName(InetAddress.getLocalHost().getHostName());
            this.ips = new String[allByName.length];
            for (int i2 = 0; i2 < allByName.length; i2++) {
                this.ips[i2] = allByName[i2].getHostAddress();
            }
        } catch (Exception e) {
            throw new GdxRuntimeException(AbstractC5044xl.g("Couldn't open listening socket at port '", i, "'"), e);
        }
    }

    @Override // com.badlogic.gdx.Input
    public void vibrate(Input.VibrationType vibrationType) {
    }
}
