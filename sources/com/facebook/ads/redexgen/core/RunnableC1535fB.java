package com.facebook.ads.redexgen.core;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RunnableC1535fB implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static byte[] A06;
    public static String[] A07 = {"OOkF5lrJxu4fGf4pO2ckLcRS", "gGP9t9qTHKK5Ek", "H2vzHQKcgoIL0", "kouxdYjPK9yps", "bi5XcbCzjjUGbI", "eIl9aB60tz", "hT3tC22T3FKADLV7sZKCXkx0ExVsMRj3", "bNYqGt7KpNFeD8qUdTsTy5B0LUudUTE5"};
    public static final int[] A08;
    public SurfaceTexture A00;
    public EGLContext A01;
    public EGLDisplay A02;
    public EGLSurface A03;
    public final Handler A04;
    public final int[] A05 = new int[1];

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{cw.k, cw.m, 4, 43, 0, 7, 7, 27, cw.k, 43, 7, 6, cw.l, 1, cw.m, 72, cw.l, 9, 1, 4, cw.k, 12, 82, 72, 27, 29, 11, 11, cw.k, 27, 27, 85, 77, 10, 68, 72, 6, 29, 5, 43, 7, 6, cw.l, 1, cw.m, 27, 51, 88, 53, 85, 77, 12, 68, 72, 11, 7, 6, cw.l, 1, cw.m, 27, 51, 88, 53, 85, 77, 27, 36, 38, 45, 2, 51, 36, 32, 53, 36, 2, 46, 47, 53, 36, 57, 53, 97, 39, 32, 40, 45, 36, 37, 1, 3, 8, 39, 22, 1, 5, cw.n, 1, 52, 6, 17, 2, 2, 1, 22, 55, 17, 22, 2, 5, 7, 1, 68, 2, 5, cw.k, 8, 1, 0, 121, 123, 112, 91, 121, 104, 88, 117, 111, 108, 112, 125, 101, 60, 122, 125, 117, 112, 121, 120, 19, 17, 26, 63, 24, 31, 2, 31, 23, 26, 31, 12, 19, 86, cw.n, 23, 31, 26, 19, 18, 49, 51, 56, 25, 53, 63, 49, 23, 33, 38, 38, 49, 58, 32, 116, 50, 53, 61, 56, 49, 48, 95, 84, 127, 93, 86, 108, 93, 64, 76, 77, 74, 93, 75, 24, 94, 89, 81, 84, 93, 92, 22, 24, 125, 74, 74, 87, 74, 2, 24};
    }

    static {
        A05();
        A08 = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    }

    public RunnableC1535fB(Handler handler) {
        this.A04 = handler;
    }

    public static EGLConfig A00(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, A08, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (zEglChooseConfig && iArr[0] > 0) {
            EGLConfig eGLConfig = eGLConfigArr[0];
            String[] strArr = A07;
            if (strArr[7].charAt(23) != strArr[6].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "EvaYGKbxZOmdKUuvzcvpYVR0ZZE9pCrs";
            strArr2[6] = "47AlO93TnTpzWz23PhEbFYn0tcgbwnhr";
            if (eGLConfig != null) {
                EGLConfig eGLConfig2 = eGLConfigArr[0];
                String[] strArr3 = A07;
                if (strArr3[3].length() != strArr3[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A07;
                strArr4[3] = "dqYEHzaD8ADmY";
                strArr4[2] = "75YC50x9EmXWR";
                return eGLConfig2;
            }
        }
        throw new C1533f9(AbstractC1600gE.A0n(A04(0, 67, 103), Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    public static EGLContext A01(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr;
        if (i != 0) {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        } else {
            iArr = new int[]{12440, 2, 12344};
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eGLContextEglCreateContext != null) {
            return eGLContextEglCreateContext;
        }
        throw new C1533f9(A04(67, 23, 78));
    }

    public static EGLDisplay A02() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new C1533f9(A04(120, 20, 19));
        }
        int[] iArr = new int[2];
        boolean eglInitialized = EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
        if (!eglInitialized) {
            throw new C1533f9(A04(Input.Keys.F10, 20, 121));
        }
        return eGLDisplayEglGetDisplay;
    }

    public static EGLSurface A03(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        int[] pbufferAttributes;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                pbufferAttributes = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                pbufferAttributes = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, pbufferAttributes, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new C1533f9(A04(90, 30, 107));
            }
        }
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext)) {
            throw new C1533f9(A04(Input.Keys.NUMPAD_ENTER, 21, 91));
        }
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static void A06(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
        } else {
            throw new C1533f9(A04(181, 29, 55) + Integer.toHexString(iGlGetError));
        }
    }

    public final SurfaceTexture A07() {
        return (SurfaceTexture) AbstractC1517es.A01(this.A00);
    }

    public final void A08() {
        this.A04.removeCallbacks(this);
        try {
            if (this.A00 != null) {
                this.A00.release();
                GLES20.glDeleteTextures(1, this.A05, 0);
            }
        } finally {
            if (this.A03 != null && !this.A03.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.A02, this.A03);
            }
            if (this.A01 != null) {
                EGL14.eglDestroyContext(this.A02, this.A01);
            }
            this.A02 = null;
            this.A01 = null;
            this.A03 = null;
            this.A00 = null;
        }
    }

    public final void A09(int i) {
        this.A02 = A02();
        EGLConfig eGLConfigA00 = A00(this.A02);
        this.A01 = A01(this.A02, eGLConfigA00, i);
        this.A03 = A03(this.A02, eGLConfigA00, this.A01, i);
        A06(this.A05);
        this.A00 = new SurfaceTexture(this.A05[0]);
        this.A00.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A04.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (this.A00 != null) {
                this.A00.updateTexImage();
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
