package com.charging.screenshow.battery.animations.themes.opengl.gl;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseConfigChooser implements EGLConfigChooser {

    public static class ComponentSizeChooser extends BaseConfigChooser {
        @Override // com.charging.screenshow.battery.animations.themes.opengl.gl.BaseConfigChooser
        public final EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            if (eGLConfigArr.length <= 0) {
                return null;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12325, null) || egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12326, null) || egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12324, null) || egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12323, null) || egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12322, null) || egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12321, null)) {
                throw null;
            }
            return eGLConfig;
        }
    }

    public abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] iArr = new int[1];
        if (!egl10.eglChooseConfig(eGLDisplay, null, null, 0, iArr)) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        int i2 = iArr[0];
        if (i2 <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i2];
        if (!egl10.eglChooseConfig(eGLDisplay, null, eGLConfigArr, i2, iArr)) {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        EGLConfig eGLConfigA = a(egl10, eGLDisplay, eGLConfigArr);
        if (eGLConfigA != null) {
            return eGLConfigA;
        }
        throw new IllegalArgumentException("No config chosen");
    }
}
