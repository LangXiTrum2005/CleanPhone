package com.badlogic.gdx.backends.android;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.badlogic.gdx.AbstractInput;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.backends.android.keyboardheight.KeyboardHeightObserver;
import com.badlogic.gdx.backends.android.keyboardheight.KeyboardHeightProvider;
import com.badlogic.gdx.backends.android.keyboardheight.StandardKeyboardHeightProvider;
import com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20;
import com.badlogic.gdx.input.NativeInputConfiguration;
import com.badlogic.gdx.input.TextInputWrapper;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.Pool;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DefaultAndroidInput extends AbstractInput implements AndroidInput, KeyboardHeightObserver {
    public static final int NUM_TOUCHES = 20;
    private SensorEventListener accelerometerListener;
    final Application app;
    private SensorEventListener compassListener;
    private final AndroidApplicationConfiguration config;
    final Context context;
    private SensorEventListener gyroscopeListener;
    private Handler handle;
    protected final AndroidHaptics haptics;
    final boolean hasMultitouch;
    boolean keyboardAvailable;
    private SensorManager manager;
    private final AndroidMouseHandler mouseHandler;
    private boolean multiline;
    protected final Input.Orientation nativeOrientation;
    private Input.KeyboardHeightObserver observer;
    private PredictiveBackHandler predictiveBackHandler;
    private InputProcessor processor;
    private SensorEventListener rotationVectorListener;
    private int sleepTime;
    private TextInputWrapper textInputWrapper;
    protected final AndroidTouchHandler touchHandler;
    Pool<KeyEvent> usedKeyEvents;
    Pool<TouchEvent> usedTouchEvents;
    ArrayList<View.OnKeyListener> keyListeners = new ArrayList<>();
    ArrayList<KeyEvent> keyEvents = new ArrayList<>();
    ArrayList<TouchEvent> touchEvents = new ArrayList<>();
    int[] touchX = new int[20];
    int[] touchY = new int[20];
    int[] deltaX = new int[20];
    int[] deltaY = new int[20];
    boolean[] touched = new boolean[20];
    int[] button = new int[20];
    int[] realId = new int[20];
    float[] pressure = new float[20];
    private boolean[] justPressedButtons = new boolean[20];
    public boolean accelerometerAvailable = false;
    protected final float[] accelerometerValues = new float[3];
    public boolean gyroscopeAvailable = false;
    protected final float[] gyroscopeValues = new float[3];
    private boolean compassAvailable = false;
    private boolean rotationVectorAvailable = false;
    protected final float[] magneticFieldValues = new float[3];
    protected final float[] rotationVectorValues = new float[3];
    private float azimuth = 0.0f;
    private float pitch = 0.0f;
    private float roll = 0.0f;
    private boolean justTouched = false;
    private long currentEventTimeStamp = 0;
    private final ArrayList<View.OnGenericMotionListener> genericMotionListeners = new ArrayList<>();
    boolean requestFocus = true;
    private boolean onscreenVisible = false;
    private RelativeLayout relativeLayoutField = null;
    boolean closeTriggered = false;
    final float[] R = new float[9];
    final float[] orientation = new float[3];

    /* JADX INFO: renamed from: com.badlogic.gdx.backends.android.DefaultAndroidInput$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        final /* synthetic */ String val$hint;
        final /* synthetic */ Input.OnscreenKeyboardType val$keyboardType;
        final /* synthetic */ Input.TextInputListener val$listener;
        final /* synthetic */ String val$text;
        final /* synthetic */ String val$title;

        public AnonymousClass3(String str, Input.OnscreenKeyboardType onscreenKeyboardType, String str2, String str3, Input.TextInputListener textInputListener) {
            this.val$title = str;
            this.val$keyboardType = onscreenKeyboardType;
            this.val$hint = str2;
            this.val$text = str3;
            this.val$listener = textInputListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertDialog.Builder builder = new AlertDialog.Builder(DefaultAndroidInput.this.context);
            builder.setTitle(this.val$title);
            final EditText editText = new EditText(DefaultAndroidInput.this.context);
            Input.OnscreenKeyboardType onscreenKeyboardType = this.val$keyboardType;
            if (onscreenKeyboardType != Input.OnscreenKeyboardType.Default) {
                editText.setInputType(DefaultAndroidInput.getAndroidInputType(onscreenKeyboardType, false));
            }
            editText.setHint(this.val$hint);
            editText.setText(this.val$text);
            editText.setSingleLine();
            if (this.val$keyboardType == Input.OnscreenKeyboardType.Password) {
                editText.setTransformationMethod(new PasswordTransformationMethod());
            }
            builder.setView(editText);
            builder.setPositiveButton(DefaultAndroidInput.this.context.getString(android.R.string.ok), new DialogInterface.OnClickListener() { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.3.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    Gdx.app.postRunnable(new Runnable() { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.3.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            AnonymousClass3.this.val$listener.input(editText.getText().toString());
                        }
                    });
                }
            });
            builder.setNegativeButton(DefaultAndroidInput.this.context.getString(android.R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.3.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    Gdx.app.postRunnable(new Runnable() { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.3.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass3.this.val$listener.canceled();
                        }
                    });
                }
            });
            builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.3.3
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    Gdx.app.postRunnable(new Runnable() { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.3.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass3.this.val$listener.canceled();
                        }
                    });
                }
            });
            builder.show();
        }
    }

    /* JADX INFO: renamed from: com.badlogic.gdx.backends.android.DefaultAndroidInput$8, reason: invalid class name */
    public class AnonymousClass8 implements Runnable {
        final /* synthetic */ boolean val$sendReturn;

        /* JADX INFO: renamed from: com.badlogic.gdx.backends.android.DefaultAndroidInput$8$1, reason: invalid class name */
        public class AnonymousClass1 implements Runnable {
            final /* synthetic */ int val$selection;
            final /* synthetic */ String val$text;
            final /* synthetic */ View val$view;
            TextInputWrapper wrapper;

            public AnonymousClass1(String str, int i, View view) {
                this.val$text = str;
                this.val$selection = i;
                this.val$view = view;
                this.wrapper = DefaultAndroidInput.this.textInputWrapper;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.wrapper.setText(this.val$text);
                this.wrapper.setPosition(this.val$selection);
                AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                if (anonymousClass8.val$sendReturn) {
                    DefaultAndroidInput.this.getInputProcessor().keyDown(66);
                    DefaultAndroidInput.this.getInputProcessor().keyTyped('\r');
                }
                Gdx.app.postRunnable(new Runnable() { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.8.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AnonymousClass1.this.wrapper.shouldClose()) {
                            DefaultAndroidInput.this.handle.post(new Runnable() { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.8.1.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    ((InputMethodManager) DefaultAndroidInput.this.context.getSystemService("input_method")).hideSoftInputFromWindow(AnonymousClass1.this.val$view.getWindowToken(), 0);
                                }
                            });
                        }
                    }
                });
            }
        }

        public AnonymousClass8(boolean z) {
            this.val$sendReturn = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!DefaultAndroidInput.this.isNativeInputOpen()) {
                DefaultAndroidInput.this.closeTriggered = false;
                return;
            }
            View view = ((AndroidGraphics) DefaultAndroidInput.this.app.getGraphics()).getView();
            view.requestFocus();
            AutoCompleteTextView editTextForNativeInput = DefaultAndroidInput.this.getEditTextForNativeInput();
            Gdx.app.postRunnable(new AnonymousClass1(editTextForNativeInput.getText().toString(), editTextForNativeInput.getSelectionStart(), view));
            if (DefaultAndroidInput.this.relativeLayoutField.getChildCount() > 1) {
                DefaultAndroidInput.this.relativeLayoutField.removeViews(1, DefaultAndroidInput.this.relativeLayoutField.getChildCount() - 1);
            }
            DefaultAndroidInput.this.relativeLayoutField.setVisibility(4);
            DefaultAndroidInput.this.closeTriggered = false;
        }
    }

    /* JADX INFO: renamed from: com.badlogic.gdx.backends.android.DefaultAndroidInput$9, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass9 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$Input$OnscreenKeyboardType;

        static {
            int[] iArr = new int[Input.OnscreenKeyboardType.values().length];
            $SwitchMap$com$badlogic$gdx$Input$OnscreenKeyboardType = iArr;
            try {
                iArr[Input.OnscreenKeyboardType.NumberPad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$Input$OnscreenKeyboardType[Input.OnscreenKeyboardType.PhonePad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$Input$OnscreenKeyboardType[Input.OnscreenKeyboardType.Email.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$Input$OnscreenKeyboardType[Input.OnscreenKeyboardType.Password.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$Input$OnscreenKeyboardType[Input.OnscreenKeyboardType.URI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static class KeyEvent {
        static final int KEY_DOWN = 0;
        static final int KEY_TYPED = 2;
        static final int KEY_UP = 1;
        char keyChar;
        int keyCode;
        long timeStamp;
        int type;
    }

    @TargetApi(33)
    public class PredictiveBackHandler {
        private final OnBackInvokedCallback callback;
        private final OnBackInvokedDispatcher dispatcher;

        private PredictiveBackHandler() {
            this.dispatcher = ((Activity) DefaultAndroidInput.this.context).getOnBackInvokedDispatcher();
            this.callback = new OnBackInvokedCallback() { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.PredictiveBackHandler.1
                @Override // android.window.OnBackInvokedCallback
                public void onBackInvoked() {
                    if (DefaultAndroidInput.this.processor != null) {
                        DefaultAndroidInput.this.processor.keyDown(4);
                    }
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void register() {
            this.dispatcher.registerOnBackInvokedCallback(0, this.callback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void unregister() {
            this.dispatcher.unregisterOnBackInvokedCallback(this.callback);
        }
    }

    public class SensorListener implements SensorEventListener {
        public SensorListener() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                DefaultAndroidInput defaultAndroidInput = DefaultAndroidInput.this;
                if (defaultAndroidInput.nativeOrientation == Input.Orientation.Portrait) {
                    float[] fArr = sensorEvent.values;
                    float[] fArr2 = defaultAndroidInput.accelerometerValues;
                    System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
                } else {
                    float[] fArr3 = defaultAndroidInput.accelerometerValues;
                    float[] fArr4 = sensorEvent.values;
                    fArr3[0] = fArr4[1];
                    fArr3[1] = -fArr4[0];
                    fArr3[2] = fArr4[2];
                }
            }
            if (sensorEvent.sensor.getType() == 2) {
                float[] fArr5 = sensorEvent.values;
                float[] fArr6 = DefaultAndroidInput.this.magneticFieldValues;
                System.arraycopy(fArr5, 0, fArr6, 0, fArr6.length);
            }
            if (sensorEvent.sensor.getType() == 4) {
                DefaultAndroidInput defaultAndroidInput2 = DefaultAndroidInput.this;
                if (defaultAndroidInput2.nativeOrientation == Input.Orientation.Portrait) {
                    float[] fArr7 = sensorEvent.values;
                    float[] fArr8 = defaultAndroidInput2.gyroscopeValues;
                    System.arraycopy(fArr7, 0, fArr8, 0, fArr8.length);
                } else {
                    float[] fArr9 = defaultAndroidInput2.gyroscopeValues;
                    float[] fArr10 = sensorEvent.values;
                    fArr9[0] = fArr10[1];
                    fArr9[1] = -fArr10[0];
                    fArr9[2] = fArr10[2];
                }
            }
            if (sensorEvent.sensor.getType() == 11) {
                DefaultAndroidInput defaultAndroidInput3 = DefaultAndroidInput.this;
                if (defaultAndroidInput3.nativeOrientation == Input.Orientation.Portrait) {
                    float[] fArr11 = sensorEvent.values;
                    float[] fArr12 = defaultAndroidInput3.rotationVectorValues;
                    System.arraycopy(fArr11, 0, fArr12, 0, fArr12.length);
                } else {
                    float[] fArr13 = defaultAndroidInput3.rotationVectorValues;
                    float[] fArr14 = sensorEvent.values;
                    fArr13[0] = fArr14[1];
                    fArr13[1] = -fArr14[0];
                    fArr13[2] = fArr14[2];
                }
            }
        }
    }

    public static class TouchEvent {
        static final int TOUCH_CANCELLED = 5;
        static final int TOUCH_DOWN = 0;
        static final int TOUCH_DRAGGED = 2;
        static final int TOUCH_MOVED = 4;
        static final int TOUCH_SCROLLED = 3;
        static final int TOUCH_UP = 1;
        int button;
        int pointer;
        int scrollAmountX;
        int scrollAmountY;
        long timeStamp;
        int type;
        int x;
        int y;
    }

    public DefaultAndroidInput(Application application, Context context, Object obj, AndroidApplicationConfiguration androidApplicationConfiguration) {
        int i = 16;
        int i2 = 1000;
        this.usedKeyEvents = new Pool<KeyEvent>(i, i2) { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.badlogic.gdx.utils.Pool
            public KeyEvent newObject() {
                return new KeyEvent();
            }
        };
        this.usedTouchEvents = new Pool<TouchEvent>(i, i2) { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.badlogic.gdx.utils.Pool
            public TouchEvent newObject() {
                return new TouchEvent();
            }
        };
        int i3 = 0;
        this.sleepTime = 0;
        if (obj instanceof View) {
            View view = (View) obj;
            view.setOnKeyListener(this);
            view.setOnTouchListener(this);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            view.setOnGenericMotionListener(this);
        }
        this.config = androidApplicationConfiguration;
        this.mouseHandler = new AndroidMouseHandler();
        while (true) {
            int[] iArr = this.realId;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = -1;
            i3++;
        }
        this.handle = new Handler();
        this.app = application;
        this.context = context;
        this.sleepTime = androidApplicationConfiguration.touchSleepTime;
        AndroidTouchHandler androidTouchHandler = new AndroidTouchHandler();
        this.touchHandler = androidTouchHandler;
        this.hasMultitouch = androidTouchHandler.supportsMultitouch(context);
        this.haptics = new AndroidHaptics(context);
        if (Build.VERSION.SDK_INT >= 33 && (context instanceof Activity)) {
            this.predictiveBackHandler = new PredictiveBackHandler();
        }
        int rotation = getRotation();
        Graphics.DisplayMode displayMode = application.getGraphics().getDisplayMode();
        if (((rotation == 0 || rotation == 180) && displayMode.width >= displayMode.height) || ((rotation == 90 || rotation == 270) && displayMode.width <= displayMode.height)) {
            this.nativeOrientation = Input.Orientation.Landscape;
        } else {
            this.nativeOrientation = Input.Orientation.Portrait;
        }
        setCatchKey(255, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createDefaultEditText() {
        ViewGroup viewGroup = (ViewGroup) ((AndroidGraphics) this.app.getGraphics()).getView().getParent();
        final RelativeLayout relativeLayout = new RelativeLayout(this.context);
        relativeLayout.setGravity(80);
        relativeLayout.setBackgroundColor(0);
        AutoCompleteTextView autoCompleteTextView = new AutoCompleteTextView(this.context) { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.6
            private int count = 0;

            @Override // android.widget.TextView, android.view.View
            public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
                return new InputConnectionWrapper(super.onCreateInputConnection(editorInfo), true) { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.6.1
                    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                    public boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
                        if (DefaultAndroidInput.this.multiline && keyEvent.getAction() == 0) {
                            if (keyEvent.getKeyCode() == 67) {
                                super.deleteSurroundingText(1, 0);
                                return true;
                            }
                            if (keyEvent.getKeyCode() == 66) {
                                commitText("\n", 0);
                                return true;
                            }
                        }
                        return super.sendKeyEvent(keyEvent);
                    }
                };
            }

            @Override // android.widget.AutoCompleteTextView, android.widget.Filter.FilterListener
            public void onFilterComplete(int i) {
                this.count = i;
                super.onFilterComplete(i);
            }

            @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
            public boolean onKeyPreIme(int i, android.view.KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 4) {
                    Gdx.input.closeTextInputField(false);
                }
                return super.onKeyPreIme(i, keyEvent);
            }

            @Override // android.widget.AutoCompleteTextView
            public void showDropDown() {
                int y = this.count * 165;
                if (y > (relativeLayout.getY() + relativeLayout.getHeight()) - getHeight()) {
                    y = (int) ((relativeLayout.getY() + relativeLayout.getHeight()) - getHeight());
                }
                if (y > 0) {
                    setDropDownHeight(y);
                }
                setDropDownVerticalOffset((-getDropDownHeight()) - getHeight());
                setDropDownWidth((int) (relativeLayout.getScaleX() * getWidth()));
                super.showDropDown();
            }
        };
        autoCompleteTextView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        relativeLayout.setVisibility(4);
        relativeLayout.addView(autoCompleteTextView);
        relativeLayout.requestLayout();
        viewGroup.addView(relativeLayout);
        this.relativeLayoutField = relativeLayout;
    }

    public static int getAndroidInputType(Input.OnscreenKeyboardType onscreenKeyboardType, boolean z) {
        int i = AnonymousClass9.$SwitchMap$com$badlogic$gdx$Input$OnscreenKeyboardType[onscreenKeyboardType.ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 33;
        }
        if (i == 4) {
            return 129;
        }
        if (i != 5) {
            return z ? 524433 : 1;
        }
        return 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AutoCompleteTextView getEditTextForNativeInput() {
        return (AutoCompleteTextView) this.relativeLayoutField.getChildAt(0);
    }

    private int getSoftButtonsBarHeight() {
        AndroidApplication androidApplication = (AndroidApplication) Gdx.app;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        androidApplication.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        androidApplication.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels;
        if (i2 > i) {
            return i2 - i;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isNativeInputOpen() {
        RelativeLayout relativeLayout = this.relativeLayoutField;
        return relativeLayout != null && relativeLayout.getVisibility() == 0;
    }

    private int[] resize(int[] iArr) {
        int[] iArr2 = new int[iArr.length + 2];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    private void updateOrientation() {
        if (this.rotationVectorAvailable) {
            SensorManager.getRotationMatrixFromVector(this.R, this.rotationVectorValues);
        } else if (!SensorManager.getRotationMatrix(this.R, null, this.accelerometerValues, this.magneticFieldValues)) {
            return;
        }
        SensorManager.getOrientation(this.R, this.orientation);
        this.azimuth = (float) Math.toDegrees(this.orientation[0]);
        this.pitch = (float) Math.toDegrees(this.orientation[1]);
        this.roll = (float) Math.toDegrees(this.orientation[2]);
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void addGenericMotionListener(View.OnGenericMotionListener onGenericMotionListener) {
        this.genericMotionListeners.add(onGenericMotionListener);
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void addKeyListener(View.OnKeyListener onKeyListener) {
        this.keyListeners.add(onKeyListener);
    }

    @Override // com.badlogic.gdx.Input
    public void closeTextInputField(boolean z) {
        if (!this.closeTriggered && isNativeInputOpen()) {
            this.closeTriggered = true;
            this.handle.post(new AnonymousClass8(z));
        }
    }

    @Override // com.badlogic.gdx.Input
    public float getAccelerometerX() {
        return this.accelerometerValues[0];
    }

    @Override // com.badlogic.gdx.Input
    public float getAccelerometerY() {
        return this.accelerometerValues[1];
    }

    @Override // com.badlogic.gdx.Input
    public float getAccelerometerZ() {
        return this.accelerometerValues[2];
    }

    @Override // com.badlogic.gdx.Input
    public float getAzimuth() {
        if (!this.compassAvailable && !this.rotationVectorAvailable) {
            return 0.0f;
        }
        updateOrientation();
        return this.azimuth;
    }

    @Override // com.badlogic.gdx.Input
    public long getCurrentEventTime() {
        return this.currentEventTimeStamp;
    }

    @Override // com.badlogic.gdx.Input
    public int getDeltaX() {
        return this.deltaX[0];
    }

    @Override // com.badlogic.gdx.Input
    public int getDeltaY() {
        return this.deltaY[0];
    }

    public int getFreePointerIndex() {
        int length = this.realId.length;
        for (int i = 0; i < length; i++) {
            if (this.realId[i] == -1) {
                return i;
            }
        }
        this.pressure = resize(this.pressure);
        this.realId = resize(this.realId);
        this.touchX = resize(this.touchX);
        this.touchY = resize(this.touchY);
        this.deltaX = resize(this.deltaX);
        this.deltaY = resize(this.deltaY);
        this.touched = resize(this.touched);
        this.button = resize(this.button);
        return length;
    }

    @Override // com.badlogic.gdx.Input
    public float getGyroscopeX() {
        return this.gyroscopeValues[0];
    }

    @Override // com.badlogic.gdx.Input
    public float getGyroscopeY() {
        return this.gyroscopeValues[1];
    }

    @Override // com.badlogic.gdx.Input
    public float getGyroscopeZ() {
        return this.gyroscopeValues[2];
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
        return this.nativeOrientation;
    }

    @Override // com.badlogic.gdx.Input
    public float getPitch() {
        if (!this.compassAvailable && !this.rotationVectorAvailable) {
            return 0.0f;
        }
        updateOrientation();
        return this.pitch;
    }

    @Override // com.badlogic.gdx.Input
    public float getPressure() {
        return getPressure(0);
    }

    @Override // com.badlogic.gdx.Input
    public float getRoll() {
        if (!this.compassAvailable && !this.rotationVectorAvailable) {
            return 0.0f;
        }
        updateOrientation();
        return this.roll;
    }

    @Override // com.badlogic.gdx.Input
    public int getRotation() {
        Context context = this.context;
        int rotation = context instanceof Activity ? ((Activity) context).getWindowManager().getDefaultDisplay().getRotation() : ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    @Override // com.badlogic.gdx.Input
    public void getRotationMatrix(float[] fArr) {
        if (this.rotationVectorAvailable) {
            SensorManager.getRotationMatrixFromVector(fArr, this.rotationVectorValues);
        } else {
            SensorManager.getRotationMatrix(fArr, null, this.accelerometerValues, this.magneticFieldValues);
        }
    }

    @Override // com.badlogic.gdx.Input
    public void getTextInput(Input.TextInputListener textInputListener, String str, String str2, String str3) {
        getTextInput(textInputListener, str, str2, str3, Input.OnscreenKeyboardType.Default);
    }

    @Override // com.badlogic.gdx.Input
    public int getX() {
        int i;
        synchronized (this) {
            i = this.touchX[0];
        }
        return i;
    }

    @Override // com.badlogic.gdx.Input
    public int getY() {
        int i;
        synchronized (this) {
            i = this.touchY[0];
        }
        return i;
    }

    @Override // com.badlogic.gdx.Input
    public boolean isButtonJustPressed(int i) {
        if (i < 0 || i > 20) {
            return false;
        }
        return this.justPressedButtons[i];
    }

    @Override // com.badlogic.gdx.Input
    public boolean isButtonPressed(int i) {
        synchronized (this) {
            try {
                boolean z = true;
                if (this.hasMultitouch) {
                    for (int i2 = 0; i2 < 20; i2++) {
                        if (this.touched[i2] && this.button[i2] == i) {
                            return true;
                        }
                    }
                }
                if (!this.touched[0] || this.button[0] != i) {
                    z = false;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.badlogic.gdx.Input
    public boolean isCursorCatched() {
        return false;
    }

    @Override // com.badlogic.gdx.Input
    public boolean isPeripheralAvailable(Input.Peripheral peripheral) {
        if (peripheral == Input.Peripheral.Accelerometer) {
            return this.accelerometerAvailable;
        }
        if (peripheral == Input.Peripheral.Gyroscope) {
            return this.gyroscopeAvailable;
        }
        if (peripheral == Input.Peripheral.Compass) {
            return this.compassAvailable;
        }
        if (peripheral == Input.Peripheral.HardwareKeyboard) {
            return this.keyboardAvailable;
        }
        if (peripheral == Input.Peripheral.OnscreenKeyboard) {
            return true;
        }
        if (peripheral == Input.Peripheral.Vibrator) {
            return this.haptics.hasVibratorAvailable();
        }
        if (peripheral == Input.Peripheral.HapticFeedback) {
            return this.haptics.hasHapticsSupport();
        }
        if (peripheral == Input.Peripheral.MultitouchScreen) {
            return this.hasMultitouch;
        }
        if (peripheral == Input.Peripheral.RotationVector) {
            return this.rotationVectorAvailable;
        }
        return peripheral == Input.Peripheral.Pressure;
    }

    @Override // com.badlogic.gdx.Input
    public boolean isTouched(int i) {
        boolean z;
        synchronized (this) {
            z = this.touched[i];
        }
        return z;
    }

    @Override // com.badlogic.gdx.Input
    public boolean justTouched() {
        return this.justTouched;
    }

    public int lookUpPointerIndex(int i) {
        int length = this.realId.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.realId[i2] == i) {
                return i2;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < length; i3++) {
            sb.append(i3 + ":" + this.realId[i3] + " ");
        }
        Application application = Gdx.app;
        StringBuilder sbQ = AbstractC5044xl.q("Pointer ID lookup failed: ", i, ", ");
        sbQ.append(sb.toString());
        application.log("AndroidInput", sbQ.toString());
        return -1;
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void onDreamingStarted() {
        registerSensorListeners();
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void onDreamingStopped() {
        unregisterSensorListeners();
    }

    @Override // android.view.View.OnGenericMotionListener
    public boolean onGenericMotion(View view, MotionEvent motionEvent) {
        if (this.mouseHandler.onGenericMotion(motionEvent, this)) {
            return true;
        }
        int size = this.genericMotionListeners.size();
        for (int i = 0; i < size; i++) {
            if (this.genericMotionListeners.get(i).onGenericMotion(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, android.view.KeyEvent keyEvent) {
        int size = this.keyListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.keyListeners.get(i2).onKey(view, i, keyEvent)) {
                return true;
            }
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() > 0) {
            return isCatchKey(i);
        }
        synchronized (this) {
            try {
                if (keyEvent.getKeyCode() == 0 && keyEvent.getAction() == 2) {
                    String characters = keyEvent.getCharacters();
                    for (int i3 = 0; i3 < characters.length(); i3++) {
                        KeyEvent keyEventObtain = this.usedKeyEvents.obtain();
                        keyEventObtain.timeStamp = System.nanoTime();
                        keyEventObtain.keyCode = 0;
                        keyEventObtain.keyChar = characters.charAt(i3);
                        keyEventObtain.type = 2;
                        this.keyEvents.add(keyEventObtain);
                    }
                    return false;
                }
                char unicodeChar = (char) keyEvent.getUnicodeChar();
                if (i == 67) {
                    unicodeChar = '\b';
                }
                if (keyEvent.getKeyCode() >= 0 && keyEvent.getKeyCode() <= 255) {
                    int action = keyEvent.getAction();
                    if (action == 0) {
                        KeyEvent keyEventObtain2 = this.usedKeyEvents.obtain();
                        keyEventObtain2.timeStamp = System.nanoTime();
                        keyEventObtain2.keyChar = (char) 0;
                        keyEventObtain2.keyCode = keyEvent.getKeyCode();
                        keyEventObtain2.type = 0;
                        if (i == 4 && keyEvent.isAltPressed()) {
                            keyEventObtain2.keyCode = 255;
                            i = 255;
                        }
                        this.keyEvents.add(keyEventObtain2);
                        boolean[] zArr = this.pressedKeys;
                        int i4 = keyEventObtain2.keyCode;
                        if (!zArr[i4]) {
                            this.pressedKeyCount++;
                            zArr[i4] = true;
                        }
                    } else if (action == 1) {
                        long jNanoTime = System.nanoTime();
                        KeyEvent keyEventObtain3 = this.usedKeyEvents.obtain();
                        keyEventObtain3.timeStamp = jNanoTime;
                        keyEventObtain3.keyChar = (char) 0;
                        keyEventObtain3.keyCode = keyEvent.getKeyCode();
                        keyEventObtain3.type = 1;
                        if (i == 4 && keyEvent.isAltPressed()) {
                            keyEventObtain3.keyCode = 255;
                            i = 255;
                        }
                        this.keyEvents.add(keyEventObtain3);
                        KeyEvent keyEventObtain4 = this.usedKeyEvents.obtain();
                        keyEventObtain4.timeStamp = jNanoTime;
                        keyEventObtain4.keyChar = unicodeChar;
                        keyEventObtain4.keyCode = 0;
                        keyEventObtain4.type = 2;
                        this.keyEvents.add(keyEventObtain4);
                        if (i == 255) {
                            boolean[] zArr2 = this.pressedKeys;
                            if (zArr2[255]) {
                                this.pressedKeyCount--;
                                zArr2[255] = false;
                            }
                        } else if (this.pressedKeys[keyEvent.getKeyCode()]) {
                            this.pressedKeyCount--;
                            this.pressedKeys[keyEvent.getKeyCode()] = false;
                        }
                    }
                    this.app.getGraphics().requestRendering();
                    return isCatchKey(i);
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.badlogic.gdx.backends.android.keyboardheight.KeyboardHeightObserver
    public void onKeyboardHeightChanged(int i, int i2, int i3, int i4) {
        KeyboardHeightProvider keyboardHeightProvider = ((AndroidApplication) this.app).getKeyboardHeightProvider();
        boolean z = keyboardHeightProvider instanceof StandardKeyboardHeightProvider;
        if (this.config.useImmersiveMode && z) {
            i += getSoftButtonsBarHeight();
        }
        if (!isNativeInputOpen()) {
            Input.KeyboardHeightObserver keyboardHeightObserver = this.observer;
            if (keyboardHeightObserver != null) {
                keyboardHeightObserver.onKeyboardHeightChanged(i);
                return;
            }
            return;
        }
        if (i != 0) {
            Input.KeyboardHeightObserver keyboardHeightObserver2 = this.observer;
            if (keyboardHeightObserver2 != null) {
                keyboardHeightObserver2.onKeyboardHeightChanged(getEditTextForNativeInput().getHeight() + i);
            }
            this.relativeLayoutField.setX(0.0f);
            this.relativeLayoutField.setScaleX(1.0f);
            this.relativeLayoutField.setY(0.0f);
            if ((((Activity) this.context).getWindow().getAttributes().softInputMode & PsExtractor.VIDEO_STREAM_MASK) != 48) {
                i = 0;
            }
            this.relativeLayoutField.animate().y(-i).scaleX(((Gdx.graphics.getWidth() - i3) - i2) / Gdx.graphics.getWidth()).x((i2 - i3) / 2.0f).setDuration(100L).setListener(new Animator.AnimatorListener() { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.5
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (DefaultAndroidInput.this.getEditTextForNativeInput().isPopupShowing()) {
                        DefaultAndroidInput.this.getEditTextForNativeInput().showDropDown();
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
            return;
        }
        if (!z && (keyboardHeightProvider.getKeyboardLandscapeHeight() != 0 || keyboardHeightProvider.getKeyboardPortraitHeight() != 0)) {
            closeTextInputField(false);
        }
        if (z && getEditTextForNativeInput().isPopupShowing()) {
            return;
        }
        Input.KeyboardHeightObserver keyboardHeightObserver3 = this.observer;
        if (keyboardHeightObserver3 != null) {
            keyboardHeightObserver3.onKeyboardHeightChanged(0);
        }
        this.relativeLayoutField.setY(0.0f);
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void onPause() {
        unregisterSensorListeners();
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void onResume() {
        registerSensorListeners();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.requestFocus && view != null) {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            this.requestFocus = false;
        }
        this.touchHandler.onTouch(motionEvent, this);
        int i = this.sleepTime;
        if (i != 0) {
            try {
                Thread.sleep(i);
            } catch (InterruptedException unused) {
            }
        }
        return true;
    }

    @Override // com.badlogic.gdx.Input
    public void openTextInputField(final NativeInputConfiguration nativeInputConfiguration) {
        nativeInputConfiguration.validate();
        if (isNativeInputOpen()) {
            if (!this.closeTriggered) {
                throw new GdxRuntimeException("Can't open keyboard if already open with openTextInputField");
            }
            while (this.closeTriggered) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
        if (this.onscreenVisible) {
            throw new GdxRuntimeException("Can't open keyboard if already open with setOnscreenKeyboardVisible");
        }
        this.textInputWrapper = nativeInputConfiguration.getTextInputWrapper();
        this.multiline = nativeInputConfiguration.isMultiLine();
        this.handle.post(new Runnable() { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.7
            @Override // java.lang.Runnable
            public void run() {
                if (DefaultAndroidInput.this.relativeLayoutField == null) {
                    DefaultAndroidInput.this.createDefaultEditText();
                }
                final AutoCompleteTextView editTextForNativeInput = DefaultAndroidInput.this.getEditTextForNativeInput();
                if (DefaultAndroidInput.this.isNativeInputOpen()) {
                    return;
                }
                InputMethodManager inputMethodManager = (InputMethodManager) DefaultAndroidInput.this.context.getSystemService("input_method");
                if (DefaultAndroidInput.this.relativeLayoutField.getChildCount() > 1) {
                    DefaultAndroidInput.this.relativeLayoutField.removeViews(1, DefaultAndroidInput.this.relativeLayoutField.getChildCount() - 1);
                }
                editTextForNativeInput.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.7.1
                    @Override // android.widget.TextView.OnEditorActionListener
                    public boolean onEditorAction(TextView textView, int i, android.view.KeyEvent keyEvent) {
                        if (i == 6) {
                            Gdx.input.closeTextInputField(true);
                        }
                        return true;
                    }
                });
                Input.OnscreenKeyboardType type = nativeInputConfiguration.getType();
                Input.OnscreenKeyboardType onscreenKeyboardType = Input.OnscreenKeyboardType.Password;
                if (type != onscreenKeyboardType) {
                    editTextForNativeInput.setTransformationMethod(null);
                }
                editTextForNativeInput.setInputType(DefaultAndroidInput.getAndroidInputType(nativeInputConfiguration.getType(), false));
                if (nativeInputConfiguration.isPreventCorrection()) {
                    editTextForNativeInput.setInputType(editTextForNativeInput.getInputType() | 524288);
                    editTextForNativeInput.setInputType(editTextForNativeInput.getInputType() & (-16385));
                } else {
                    editTextForNativeInput.setInputType(editTextForNativeInput.getInputType() | 49152);
                }
                editTextForNativeInput.setImeOptions(6);
                if (nativeInputConfiguration.isMultiLine()) {
                    editTextForNativeInput.setInputType(editTextForNativeInput.getInputType() | 131072);
                    editTextForNativeInput.setImeOptions(editTextForNativeInput.getImeOptions() | 33554432);
                    editTextForNativeInput.setWidth(Gdx.graphics.getWidth());
                    editTextForNativeInput.setLines(3);
                } else {
                    editTextForNativeInput.setImeOptions(editTextForNativeInput.getImeOptions() | 33554432);
                    editTextForNativeInput.setSingleLine();
                }
                editTextForNativeInput.setFilters(new InputFilter[0]);
                editTextForNativeInput.setText(DefaultAndroidInput.this.textInputWrapper.getText());
                editTextForNativeInput.setHint(nativeInputConfiguration.getPlaceholder());
                InputFilter inputFilter = new InputFilter() { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.7.2
                    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
                    @Override // android.text.InputFilter
                    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                        StringBuilder sb = new StringBuilder(i2 - i);
                        boolean z = true;
                        for (int i5 = i; i5 < i2; i5++) {
                            char cCharAt = charSequence.charAt(i5);
                            if (nativeInputConfiguration.getValidator() != null) {
                                if (nativeInputConfiguration.getValidator().validate(cCharAt + "")) {
                                    sb.append(cCharAt);
                                } else {
                                    z = false;
                                }
                            } else {
                                sb.append(cCharAt);
                            }
                        }
                        if (z) {
                            return null;
                        }
                        if (!(charSequence instanceof Spanned)) {
                            return sb;
                        }
                        SpannableString spannableString = new SpannableString(sb);
                        TextUtils.copySpansFrom((Spanned) charSequence, i, sb.length(), null, spannableString, 0);
                        return spannableString;
                    }
                };
                InputFilter[] inputFilterArr = {inputFilter};
                if (nativeInputConfiguration.getMaxLength() != null) {
                    inputFilterArr = new InputFilter[]{inputFilter, new InputFilter.LengthFilter(nativeInputConfiguration.getMaxLength().intValue())};
                }
                editTextForNativeInput.setFilters(inputFilterArr);
                if (nativeInputConfiguration.getAutoComplete() != null) {
                    editTextForNativeInput.setAdapter(new ArrayAdapter(DefaultAndroidInput.this.context, android.R.layout.simple_dropdown_item_1line, nativeInputConfiguration.getAutoComplete()));
                } else {
                    editTextForNativeInput.setAdapter(null);
                }
                editTextForNativeInput.setBackgroundColor(-1);
                if (nativeInputConfiguration.getType() == onscreenKeyboardType) {
                    editTextForNativeInput.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    if (nativeInputConfiguration.isShowPasswordButton()) {
                        final ImageView imageView = new ImageView(DefaultAndroidInput.this.context);
                        imageView.setImageResource(R.drawable.design_ic_visibility);
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams.addRule(11);
                        layoutParams.rightMargin = 10;
                        layoutParams.height = editTextForNativeInput.getHeight();
                        layoutParams.width = editTextForNativeInput.getHeight();
                        imageView.setLayoutParams(layoutParams);
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.7.3
                            private boolean isHidding = true;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                int selectionStart = editTextForNativeInput.getSelectionStart();
                                int selectionStart2 = editTextForNativeInput.getSelectionStart();
                                boolean z = !this.isHidding;
                                this.isHidding = z;
                                if (z) {
                                    editTextForNativeInput.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    imageView.setImageResource(R.drawable.design_ic_visibility);
                                } else {
                                    editTextForNativeInput.setTransformationMethod(null);
                                    imageView.setImageResource(R.drawable.design_ic_visibility_off);
                                }
                                editTextForNativeInput.setSelection(selectionStart, selectionStart2);
                            }
                        });
                        imageView.setAlpha(0.5f);
                        imageView.setPadding(5, 5, 5, 5);
                        DefaultAndroidInput.this.relativeLayoutField.addView(imageView);
                    }
                }
                editTextForNativeInput.setSelection(DefaultAndroidInput.this.textInputWrapper.getSelectionStart(), DefaultAndroidInput.this.textInputWrapper.getSelectionEnd());
                DefaultAndroidInput.this.relativeLayoutField.setVisibility(0);
                editTextForNativeInput.requestFocus();
                inputMethodManager.showSoftInput(editTextForNativeInput, 0);
            }
        });
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void processEvents() {
        synchronized (this) {
            try {
                if (this.justTouched) {
                    this.justTouched = false;
                    int i = 0;
                    while (true) {
                        boolean[] zArr = this.justPressedButtons;
                        if (i >= zArr.length) {
                            break;
                        }
                        zArr[i] = false;
                        i++;
                    }
                }
                if (this.keyJustPressed) {
                    this.keyJustPressed = false;
                    int i2 = 0;
                    while (true) {
                        boolean[] zArr2 = this.justPressedKeys;
                        if (i2 >= zArr2.length) {
                            break;
                        }
                        zArr2[i2] = false;
                        i2++;
                    }
                }
                InputProcessor inputProcessor = this.processor;
                if (inputProcessor != null) {
                    int size = this.keyEvents.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        KeyEvent keyEvent = this.keyEvents.get(i3);
                        this.currentEventTimeStamp = keyEvent.timeStamp;
                        int i4 = keyEvent.type;
                        if (i4 == 0) {
                            inputProcessor.keyDown(keyEvent.keyCode);
                            this.keyJustPressed = true;
                            this.justPressedKeys[keyEvent.keyCode] = true;
                        } else if (i4 == 1) {
                            inputProcessor.keyUp(keyEvent.keyCode);
                        } else if (i4 == 2) {
                            inputProcessor.keyTyped(keyEvent.keyChar);
                        }
                        this.usedKeyEvents.free(keyEvent);
                    }
                    int size2 = this.touchEvents.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        TouchEvent touchEvent = this.touchEvents.get(i5);
                        this.currentEventTimeStamp = touchEvent.timeStamp;
                        int i6 = touchEvent.type;
                        if (i6 == 0) {
                            inputProcessor.touchDown(touchEvent.x, touchEvent.y, touchEvent.pointer, touchEvent.button);
                            this.justTouched = true;
                            this.justPressedButtons[touchEvent.button] = true;
                        } else if (i6 == 1) {
                            inputProcessor.touchUp(touchEvent.x, touchEvent.y, touchEvent.pointer, touchEvent.button);
                        } else if (i6 == 2) {
                            inputProcessor.touchDragged(touchEvent.x, touchEvent.y, touchEvent.pointer);
                        } else if (i6 == 3) {
                            inputProcessor.scrolled(touchEvent.scrollAmountX, touchEvent.scrollAmountY);
                        } else if (i6 == 4) {
                            inputProcessor.mouseMoved(touchEvent.x, touchEvent.y);
                        } else if (i6 == 5) {
                            inputProcessor.touchCancelled(touchEvent.x, touchEvent.y, touchEvent.pointer, touchEvent.button);
                        }
                        this.usedTouchEvents.free(touchEvent);
                    }
                } else {
                    int size3 = this.touchEvents.size();
                    for (int i7 = 0; i7 < size3; i7++) {
                        TouchEvent touchEvent2 = this.touchEvents.get(i7);
                        if (touchEvent2.type == 0) {
                            this.justTouched = true;
                        }
                        this.usedTouchEvents.free(touchEvent2);
                    }
                    int size4 = this.keyEvents.size();
                    for (int i8 = 0; i8 < size4; i8++) {
                        this.usedKeyEvents.free(this.keyEvents.get(i8));
                    }
                }
                if (this.touchEvents.isEmpty()) {
                    int i9 = 0;
                    while (true) {
                        int[] iArr = this.deltaX;
                        if (i9 >= iArr.length) {
                            break;
                        }
                        iArr[0] = 0;
                        this.deltaY[0] = 0;
                        i9++;
                    }
                }
                this.keyEvents.clear();
                this.touchEvents.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void registerSensorListeners() {
        if (this.config.useAccelerometer) {
            SensorManager sensorManager = (SensorManager) this.context.getSystemService(bc.ac);
            this.manager = sensorManager;
            if (sensorManager.getSensorList(1).isEmpty()) {
                this.accelerometerAvailable = false;
            } else {
                Sensor sensor = this.manager.getSensorList(1).get(0);
                SensorListener sensorListener = new SensorListener();
                this.accelerometerListener = sensorListener;
                this.accelerometerAvailable = this.manager.registerListener(sensorListener, sensor, this.config.sensorDelay);
            }
        } else {
            this.accelerometerAvailable = false;
        }
        if (this.config.useGyroscope) {
            SensorManager sensorManager2 = (SensorManager) this.context.getSystemService(bc.ac);
            this.manager = sensorManager2;
            if (sensorManager2.getSensorList(4).isEmpty()) {
                this.gyroscopeAvailable = false;
            } else {
                Sensor sensor2 = this.manager.getSensorList(4).get(0);
                SensorListener sensorListener2 = new SensorListener();
                this.gyroscopeListener = sensorListener2;
                this.gyroscopeAvailable = this.manager.registerListener(sensorListener2, sensor2, this.config.sensorDelay);
            }
        } else {
            this.gyroscopeAvailable = false;
        }
        this.rotationVectorAvailable = false;
        if (this.config.useRotationVectorSensor) {
            if (this.manager == null) {
                this.manager = (SensorManager) this.context.getSystemService(bc.ac);
            }
            List<Sensor> sensorList = this.manager.getSensorList(11);
            if (!sensorList.isEmpty()) {
                this.rotationVectorListener = new SensorListener();
                for (Sensor sensor3 : sensorList) {
                    if (sensor3.getVendor().equals("Google Inc.") && sensor3.getVersion() == 3) {
                        this.rotationVectorAvailable = this.manager.registerListener(this.rotationVectorListener, sensor3, this.config.sensorDelay);
                        break;
                    }
                }
                if (!this.rotationVectorAvailable) {
                    this.rotationVectorAvailable = this.manager.registerListener(this.rotationVectorListener, sensorList.get(0), this.config.sensorDelay);
                }
            }
        }
        if (!this.config.useCompass || this.rotationVectorAvailable) {
            this.compassAvailable = false;
        } else {
            if (this.manager == null) {
                this.manager = (SensorManager) this.context.getSystemService(bc.ac);
            }
            Sensor defaultSensor = this.manager.getDefaultSensor(2);
            if (defaultSensor != null) {
                boolean z = this.accelerometerAvailable;
                this.compassAvailable = z;
                if (z) {
                    SensorListener sensorListener3 = new SensorListener();
                    this.compassListener = sensorListener3;
                    this.compassAvailable = this.manager.registerListener(sensorListener3, defaultSensor, this.config.sensorDelay);
                }
            } else {
                this.compassAvailable = false;
            }
        }
        Gdx.app.log("AndroidInput", "sensor listener setup");
    }

    @Override // com.badlogic.gdx.AbstractInput, com.badlogic.gdx.Input
    public void setCatchKey(int i, boolean z) {
        PredictiveBackHandler predictiveBackHandler;
        super.setCatchKey(i, z);
        if (i != 4 || (predictiveBackHandler = this.predictiveBackHandler) == null) {
            return;
        }
        if (z) {
            predictiveBackHandler.register();
        } else {
            predictiveBackHandler.unregister();
        }
    }

    @Override // com.badlogic.gdx.Input
    public void setCursorCatched(boolean z) {
    }

    @Override // com.badlogic.gdx.Input
    public void setCursorPosition(int i, int i2) {
    }

    @Override // com.badlogic.gdx.Input
    public void setInputProcessor(InputProcessor inputProcessor) {
        synchronized (this) {
            this.processor = inputProcessor;
        }
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void setKeyboardAvailable(boolean z) {
        this.keyboardAvailable = z;
    }

    @Override // com.badlogic.gdx.Input
    public void setKeyboardHeightObserver(Input.KeyboardHeightObserver keyboardHeightObserver) {
        this.observer = keyboardHeightObserver;
    }

    @Override // com.badlogic.gdx.Input
    public void setOnscreenKeyboardVisible(boolean z) {
        setOnscreenKeyboardVisible(z, Input.OnscreenKeyboardType.Default);
    }

    public void unregisterSensorListeners() {
        SensorManager sensorManager = this.manager;
        if (sensorManager != null) {
            SensorEventListener sensorEventListener = this.accelerometerListener;
            if (sensorEventListener != null) {
                sensorManager.unregisterListener(sensorEventListener);
                this.accelerometerListener = null;
            }
            SensorEventListener sensorEventListener2 = this.gyroscopeListener;
            if (sensorEventListener2 != null) {
                this.manager.unregisterListener(sensorEventListener2);
                this.gyroscopeListener = null;
            }
            SensorEventListener sensorEventListener3 = this.rotationVectorListener;
            if (sensorEventListener3 != null) {
                this.manager.unregisterListener(sensorEventListener3);
                this.rotationVectorListener = null;
            }
            SensorEventListener sensorEventListener4 = this.compassListener;
            if (sensorEventListener4 != null) {
                this.manager.unregisterListener(sensorEventListener4);
                this.compassListener = null;
            }
            this.manager = null;
        }
        Gdx.app.log("AndroidInput", "sensor listener tear down");
    }

    @Override // com.badlogic.gdx.Input
    public void vibrate(int i) {
        this.haptics.vibrate(i);
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
        return this.pressure[i];
    }

    @Override // com.badlogic.gdx.Input
    public void getTextInput(Input.TextInputListener textInputListener, String str, String str2, String str3, Input.OnscreenKeyboardType onscreenKeyboardType) {
        this.handle.post(new AnonymousClass3(str, onscreenKeyboardType, str3, str2, textInputListener));
    }

    @Override // com.badlogic.gdx.Input
    public void setOnscreenKeyboardVisible(final boolean z, final Input.OnscreenKeyboardType onscreenKeyboardType) {
        if (isNativeInputOpen()) {
            throw new GdxRuntimeException("Can't open keyboard if already open");
        }
        this.onscreenVisible = z;
        this.handle.post(new Runnable() { // from class: com.badlogic.gdx.backends.android.DefaultAndroidInput.4
            @Override // java.lang.Runnable
            public void run() {
                InputMethodManager inputMethodManager = (InputMethodManager) DefaultAndroidInput.this.context.getSystemService("input_method");
                if (!z) {
                    inputMethodManager.hideSoftInputFromWindow(((AndroidGraphics) DefaultAndroidInput.this.app.getGraphics()).getView().getWindowToken(), 0);
                    return;
                }
                View view = ((AndroidGraphics) DefaultAndroidInput.this.app.getGraphics()).getView();
                Input.OnscreenKeyboardType onscreenKeyboardType2 = onscreenKeyboardType;
                if (onscreenKeyboardType2 == null) {
                    onscreenKeyboardType2 = Input.OnscreenKeyboardType.Default;
                }
                GLSurfaceView20 gLSurfaceView20 = (GLSurfaceView20) view;
                if (gLSurfaceView20.onscreenKeyboardType != onscreenKeyboardType2) {
                    gLSurfaceView20.onscreenKeyboardType = onscreenKeyboardType2;
                    inputMethodManager.restartInput(view);
                }
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                inputMethodManager.showSoftInput(((AndroidGraphics) DefaultAndroidInput.this.app.getGraphics()).getView(), 0);
            }
        });
    }

    @Override // com.badlogic.gdx.Input
    public void vibrate(int i, boolean z) {
        this.haptics.vibrate(i);
    }

    private boolean[] resize(boolean[] zArr) {
        boolean[] zArr2 = new boolean[zArr.length + 2];
        System.arraycopy(zArr, 0, zArr2, 0, zArr.length);
        return zArr2;
    }

    @Override // com.badlogic.gdx.Input
    public void vibrate(int i, int i2, boolean z) {
        this.haptics.vibrate(i, i2, z);
    }

    @Override // com.badlogic.gdx.Input
    public int getX(int i) {
        int i2;
        synchronized (this) {
            i2 = this.touchX[i];
        }
        return i2;
    }

    @Override // com.badlogic.gdx.Input
    public int getY(int i) {
        int i2;
        synchronized (this) {
            i2 = this.touchY[i];
        }
        return i2;
    }

    @Override // com.badlogic.gdx.Input
    public boolean isTouched() {
        synchronized (this) {
            try {
                if (this.hasMultitouch) {
                    for (int i = 0; i < 20; i++) {
                        if (this.touched[i]) {
                            return true;
                        }
                    }
                }
                return this.touched[0];
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.badlogic.gdx.Input
    public void vibrate(Input.VibrationType vibrationType) {
        this.haptics.vibrate(vibrationType);
    }

    private float[] resize(float[] fArr) {
        float[] fArr2 = new float[fArr.length + 2];
        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        return fArr2;
    }
}
