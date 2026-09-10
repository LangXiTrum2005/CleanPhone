package com.badlogic.gdx.backends.android.surfaceview;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.backends.android.DefaultAndroidInput;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes.dex */
public class GLSurfaceView20 extends GLSurfaceView {
    private static final boolean DEBUG = false;
    static String TAG = "GL2JNIView";
    static int targetGLESVersion;
    public Input.OnscreenKeyboardType onscreenKeyboardType;
    final ResolutionStrategy resolutionStrategy;

    public static class ContextFactory implements GLSurfaceView.EGLContextFactory {
        private static int EGL_CONTEXT_CLIENT_VERSION = 12440;

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            String str = GLSurfaceView20.TAG;
            String str2 = GLSurfaceView20.TAG;
            GLSurfaceView20.checkEglError("Before eglCreateContext " + GLSurfaceView20.targetGLESVersion, egl10);
            EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{EGL_CONTEXT_CLIENT_VERSION, GLSurfaceView20.targetGLESVersion, 12344});
            if ((!GLSurfaceView20.checkEglError("After eglCreateContext " + GLSurfaceView20.targetGLESVersion, egl10) || eGLContextEglCreateContext == null) && GLSurfaceView20.targetGLESVersion > 2) {
                String str3 = GLSurfaceView20.TAG;
                GLSurfaceView20.targetGLESVersion = 2;
                return createContext(egl10, eGLDisplay, eGLConfig);
            }
            String str4 = GLSurfaceView20.TAG;
            String str5 = GLSurfaceView20.TAG;
            return eGLContextEglCreateContext;
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }
    }

    public GLSurfaceView20(Context context, ResolutionStrategy resolutionStrategy, int i) {
        super(context);
        this.onscreenKeyboardType = Input.OnscreenKeyboardType.Default;
        targetGLESVersion = i;
        this.resolutionStrategy = resolutionStrategy;
        init(false, 16, 0);
    }

    public static boolean checkEglError(String str, EGL10 egl10) {
        boolean z = true;
        while (true) {
            int iEglGetError = egl10.eglGetError();
            if (iEglGetError == 12288) {
                return z;
            }
            String.format("%s: EGL error: 0x%x", str, Integer.valueOf(iEglGetError));
            z = false;
        }
    }

    private void init(boolean z, int i, int i2) {
        if (z) {
            getHolder().setFormat(-3);
        }
        setEGLContextFactory(new ContextFactory());
        setEGLConfigChooser(z ? new ConfigChooser(8, 8, 8, 8, i, i2) : new ConfigChooser(8, 8, 8, 0, i, i2));
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (editorInfo != null) {
            editorInfo.imeOptions |= 268435456;
            editorInfo.inputType = DefaultAndroidInput.getAndroidInputType(this.onscreenKeyboardType, true);
        }
        return new BaseInputConnection(this, false) { // from class: com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20.1
            private void sendDownUpKeyEventForBackwardCompatibility(int i) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                super.sendKeyEvent(new KeyEvent(jUptimeMillis, jUptimeMillis, 0, i, 0, 0, -1, 0, 6));
                super.sendKeyEvent(new KeyEvent(SystemClock.uptimeMillis(), jUptimeMillis, 1, i, 0, 0, -1, 0, 6));
            }

            @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
            public boolean deleteSurroundingText(int i, int i2) {
                if (i != 1 || i2 != 0) {
                    return super.deleteSurroundingText(i, i2);
                }
                sendDownUpKeyEventForBackwardCompatibility(67);
                return true;
            }
        };
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        ResolutionStrategy.MeasuredDimension measuredDimensionCalcMeasures = this.resolutionStrategy.calcMeasures(i, i2);
        setMeasuredDimension(measuredDimensionCalcMeasures.width, measuredDimensionCalcMeasures.height);
    }

    public GLSurfaceView20(Context context, ResolutionStrategy resolutionStrategy) {
        this(context, resolutionStrategy, 2);
    }

    public static class ConfigChooser implements GLSurfaceView.EGLConfigChooser {
        private static int EGL_OPENGL_ES2_BIT = 4;
        private static int[] s_configAttribs2 = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};
        protected int mAlphaSize;
        protected int mBlueSize;
        protected int mDepthSize;
        protected int mGreenSize;
        protected int mRedSize;
        protected int mStencilSize;
        private int[] mValue = new int[1];

        public ConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
            this.mRedSize = i;
            this.mGreenSize = i2;
            this.mBlueSize = i3;
            this.mAlphaSize = i4;
            this.mDepthSize = i5;
            this.mStencilSize = i6;
        }

        private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.mValue) ? this.mValue[0] : i2;
        }

        private void printConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {12320, 12321, 12322, 12323, 12324, 12325, 12326, 12327, 12328, 12329, 12330, 12331, 12332, 12333, 12334, 12335, 12336, 12337, 12338, 12339, 12340, 12343, 12342, 12341, 12345, 12346, 12347, 12348, 12349, 12350, 12351, 12352, 12354};
            String[] strArr = {"EGL_BUFFER_SIZE", "EGL_ALPHA_SIZE", "EGL_BLUE_SIZE", "EGL_GREEN_SIZE", "EGL_RED_SIZE", "EGL_DEPTH_SIZE", "EGL_STENCIL_SIZE", "EGL_CONFIG_CAVEAT", "EGL_CONFIG_ID", "EGL_LEVEL", "EGL_MAX_PBUFFER_HEIGHT", "EGL_MAX_PBUFFER_PIXELS", "EGL_MAX_PBUFFER_WIDTH", "EGL_NATIVE_RENDERABLE", "EGL_NATIVE_VISUAL_ID", "EGL_NATIVE_VISUAL_TYPE", "EGL_PRESERVED_RESOURCES", "EGL_SAMPLES", "EGL_SAMPLE_BUFFERS", "EGL_SURFACE_TYPE", "EGL_TRANSPARENT_TYPE", "EGL_TRANSPARENT_RED_VALUE", "EGL_TRANSPARENT_GREEN_VALUE", "EGL_TRANSPARENT_BLUE_VALUE", "EGL_BIND_TO_TEXTURE_RGB", "EGL_BIND_TO_TEXTURE_RGBA", "EGL_MIN_SWAP_INTERVAL", "EGL_MAX_SWAP_INTERVAL", "EGL_LUMINANCE_SIZE", "EGL_ALPHA_MASK_SIZE", "EGL_COLOR_BUFFER_TYPE", "EGL_RENDERABLE_TYPE", "EGL_CONFORMANT"};
            int[] iArr2 = new int[1];
            for (int i = 0; i < 33; i++) {
                int i2 = iArr[i];
                String str = strArr[i];
                if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i2, iArr2)) {
                    String str2 = GLSurfaceView20.TAG;
                    String.format("  %s: %d\n", str, Integer.valueOf(iArr2[0]));
                } else {
                    while (egl10.eglGetError() != 12288) {
                    }
                }
            }
        }

        private void printConfigs(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            String str = GLSurfaceView20.TAG;
            String.format("%d configurations", Integer.valueOf(length));
            for (int i = 0; i < length; i++) {
                String str2 = GLSurfaceView20.TAG;
                String.format("Configuration %d:\n", Integer.valueOf(i));
                printConfig(egl10, eGLDisplay, eGLConfigArr[i]);
            }
        }

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            egl10.eglChooseConfig(eGLDisplay, s_configAttribs2, null, 0, iArr);
            int i = iArr[0];
            if (i <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            egl10.eglChooseConfig(eGLDisplay, s_configAttribs2, eGLConfigArr, i, iArr);
            return chooseConfig(egl10, eGLDisplay, eGLConfigArr);
        }

        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int iFindConfigAttrib = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int iFindConfigAttrib2 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (iFindConfigAttrib >= this.mDepthSize && iFindConfigAttrib2 >= this.mStencilSize) {
                    int iFindConfigAttrib3 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12324, 0);
                    int iFindConfigAttrib4 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12323, 0);
                    int iFindConfigAttrib5 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12322, 0);
                    int iFindConfigAttrib6 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12321, 0);
                    if (iFindConfigAttrib3 == this.mRedSize && iFindConfigAttrib4 == this.mGreenSize && iFindConfigAttrib5 == this.mBlueSize && iFindConfigAttrib6 == this.mAlphaSize) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }
    }

    public GLSurfaceView20(Context context, boolean z, int i, int i2, ResolutionStrategy resolutionStrategy) {
        super(context);
        this.onscreenKeyboardType = Input.OnscreenKeyboardType.Default;
        this.resolutionStrategy = resolutionStrategy;
        init(z, i, i2);
    }
}
