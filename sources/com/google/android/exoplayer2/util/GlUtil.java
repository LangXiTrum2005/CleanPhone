package com.google.android.exoplayer2.util;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;

/* JADX INFO: loaded from: classes3.dex */
public final class GlUtil {

    public static final class Api17 {
        public static EGLContext a(EGLDisplay eGLDisplay, int i2, int[] iArr) throws GlException {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, g(eGLDisplay, iArr), EGL14.EGL_NO_CONTEXT, new int[]{12440, i2, 12344}, 0);
            if (eGLContextEglCreateContext != null) {
                GlUtil.b();
                return eGLContextEglCreateContext;
            }
            EGL14.eglTerminate(eGLDisplay);
            throw new GlException(android.support.v4.media.a.h(i2, "eglCreateContext() failed to create a valid context. The device may not support EGL version "));
        }

        public static EGLDisplay b() throws GlException {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            GlUtil.c("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
            GlUtil.c("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
            GlUtil.b();
            return eGLDisplayEglGetDisplay;
        }

        public static EGLSurface c(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) throws GlException {
            EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, g(eGLDisplay, iArr), iArr2, 0);
            GlUtil.a("Error creating surface");
            return eGLSurfaceEglCreatePbufferSurface;
        }

        public static void d(EGLDisplay eGLDisplay, EGLContext eGLContext) throws GlException {
            if (eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            GlUtil.a("Error releasing context");
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                GlUtil.a("Error destroying context");
            }
            EGL14.eglReleaseThread();
            GlUtil.a("Error releasing thread");
            EGL14.eglTerminate(eGLDisplay);
            GlUtil.a("Error terminating display");
        }

        public static void e(int i2, int i3, int i4) throws GlException {
            GlUtil.c("No current context", !Util.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT));
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(36006, iArr, 0);
            if (iArr[0] != i2) {
                GLES20.glBindFramebuffer(36160, i2);
            }
            GlUtil.b();
            GLES20.glViewport(0, 0, i3, i4);
            GlUtil.b();
        }

        public static void f(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i2, int i3, int i4) throws GlException {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            GlUtil.a("Error making context current");
            e(i2, i3, i4);
        }

        private static EGLConfig g(EGLDisplay eGLDisplay, int[] iArr) throws GlException {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                return eGLConfigArr[0];
            }
            throw new GlException("eglChooseConfig failed.");
        }

        public static EGLSurface h(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) throws GlException {
            EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, g(eGLDisplay, iArr), obj, iArr2, 0);
            GlUtil.a("Error creating surface");
            return eGLSurfaceEglCreateWindowSurface;
        }
    }

    public static final class GlException extends Exception {
    }

    public static void a(String str) throws GlException {
        int iEglGetError = EGL14.eglGetError();
        c(str + ", error code: " + iEglGetError, iEglGetError == 12288);
    }

    public static void b() throws GlException {
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z2) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(iGlGetError));
            z2 = true;
        }
        if (z2) {
            throw new GlException(sb.toString());
        }
    }

    public static void c(String str, boolean z2) throws GlException {
        if (!z2) {
            throw new GlException(str);
        }
    }
}
