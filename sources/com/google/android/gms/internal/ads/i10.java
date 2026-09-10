package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.HandlerThread;
import android.util.Log;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.services.UnityAdsConstants;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i10 extends Thread implements SurfaceTexture.OnFrameAvailableListener {
    public static final float[] B = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    public volatile boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h10 f15469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f15470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f15471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f15472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f15473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f15474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f15475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f15476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f15477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f15478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f15479k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SurfaceTexture f15481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SurfaceTexture f15482o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15483p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15485r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FloatBuffer f15486s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CountDownLatch f15487t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f15488u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public EGL10 f15489v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public EGLDisplay f15490w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public EGLContext f15491x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public EGLSurface f15492y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f15493z;

    public i10(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15486s = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(B).position(0);
        this.f15470b = new float[9];
        this.f15471c = new float[9];
        this.f15472d = new float[9];
        this.f15473e = new float[9];
        this.f15474f = new float[9];
        this.f15475g = new float[9];
        this.f15476h = new float[9];
        this.f15477i = Float.NaN;
        h10 h10Var = new h10(context);
        this.f15469a = h10Var;
        h10Var.f15056h = this;
        this.f15487t = new CountDownLatch(1);
        this.f15488u = new Object();
    }

    public static final void e(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sb2 = new StringBuilder(str.length() + 10 + String.valueOf(iGlGetError).length());
            sb2.append(str);
            sb2.append(": glError ");
            sb2.append(iGlGetError);
            Log.e("SphericalVideoRenderer", sb2.toString());
        }
    }

    public static final void f(float[] fArr, float[] fArr2, float[] fArr3) {
        float f10 = fArr2[0] * fArr3[0];
        float f11 = fArr2[1];
        float f12 = fArr3[3];
        float f13 = fArr2[2];
        float f14 = fArr3[6];
        fArr[0] = f10 + (f11 * f12) + (f13 * f14);
        float f15 = fArr2[0];
        float f16 = fArr3[1] * f15;
        float f17 = fArr3[4];
        float f18 = fArr3[7];
        fArr[1] = f16 + (f11 * f17) + (f13 * f18);
        float f19 = f15 * fArr3[2];
        float f20 = fArr2[1];
        float f21 = fArr3[5];
        float f22 = fArr3[8];
        fArr[2] = f19 + (f20 * f21) + (f13 * f22);
        float f23 = fArr2[3];
        float f24 = fArr3[0];
        float f25 = fArr2[4];
        float f26 = fArr2[5];
        fArr[3] = (f23 * f24) + (f12 * f25) + (f26 * f14);
        float f27 = fArr2[3];
        float f28 = fArr3[1];
        fArr[4] = (f27 * f28) + (f25 * f17) + (f26 * f18);
        float f29 = fArr3[2];
        fArr[5] = (f27 * f29) + (fArr2[4] * f21) + (f26 * f22);
        float f30 = fArr2[6] * f24;
        float f31 = fArr2[7];
        float f32 = fArr3[3] * f31;
        float f33 = fArr2[8];
        fArr[6] = f30 + f32 + (f14 * f33);
        float f34 = fArr2[6];
        float f35 = f18 * f33;
        fArr[7] = f35 + (f31 * fArr3[4]) + (f28 * f34);
        fArr[8] = (f34 * f29) + (fArr2[7] * fArr3[5]) + (f33 * f22);
    }

    public static final void g(float[] fArr, float f10) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d10 = f10;
        fArr[4] = (float) Math.cos(d10);
        fArr[5] = (float) (-Math.sin(d10));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d10);
        fArr[8] = (float) Math.cos(d10);
    }

    public static final void h(float[] fArr, float f10) {
        double d10 = f10;
        fArr[0] = (float) Math.cos(d10);
        fArr[1] = (float) (-Math.sin(d10));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d10);
        fArr[4] = (float) Math.cos(d10);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int i(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        e("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            e("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            e("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            e("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
                sb2.append("Could not compile shader ");
                sb2.append(i10);
                sb2.append(":");
                Log.e("SphericalVideoRenderer", sb2.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                e("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    public final void a(int i10, int i11) {
        Object obj = this.f15488u;
        synchronized (obj) {
            this.f15480m = i10;
            this.l = i11;
            this.f15493z = true;
            obj.notifyAll();
        }
    }

    public final void b() {
        Object obj = this.f15488u;
        synchronized (obj) {
            this.A = true;
            this.f15482o = null;
            obj.notifyAll();
        }
    }

    public final void c(float f10, float f11) {
        int i10 = this.f15480m;
        int i11 = this.l;
        if (i10 <= i11) {
            i10 = i11;
        }
        float f12 = i10;
        this.f15478j -= (f10 * 1.7453293f) / f12;
        float f13 = this.f15479k - ((f11 * 1.7453293f) / f12);
        this.f15479k = f13;
        if (f13 < -1.5707964f) {
            this.f15479k = -1.5707964f;
            f13 = -1.5707964f;
        }
        if (f13 > 1.5707964f) {
            this.f15479k = 1.5707964f;
        }
    }

    public final void d() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f15492y;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.f15489v.eglMakeCurrent(this.f15490w, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f15489v.eglDestroySurface(this.f15490w, this.f15492y);
            this.f15492y = null;
        }
        EGLContext eGLContext = this.f15491x;
        if (eGLContext != null) {
            this.f15489v.eglDestroyContext(this.f15490w, eGLContext);
            this.f15491x = null;
        }
        EGLDisplay eGLDisplay = this.f15490w;
        if (eGLDisplay != null) {
            this.f15489v.eglTerminate(eGLDisplay);
            this.f15490w = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f15485r++;
        Object obj = this.f15488u;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:6:0x0020  */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10;
        int iGlCreateProgram;
        if (this.f15482o == null) {
            int i10 = zze.zza;
            zzo.zzf("SphericalVideoProcessor started with no output texture.");
            this.f15487t.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f15489v = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f15490w = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay != EGL10.EGL_NO_DISPLAY && this.f15489v.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            EGLConfig eGLConfig = (this.f15489v.eglChooseConfig(this.f15490w, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
            if (eGLConfig == null) {
                z10 = false;
            } else {
                EGL10 egl11 = this.f15489v;
                EGLDisplay eGLDisplay = this.f15490w;
                EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                EGLContext eGLContextEglCreateContext = egl11.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                this.f15491x = eGLContextEglCreateContext;
                if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == eGLContext) {
                    z10 = false;
                } else {
                    EGLSurface eGLSurfaceEglCreateWindowSurface = this.f15489v.eglCreateWindowSurface(this.f15490w, eGLConfig, this.f15482o, null);
                    this.f15492y = eGLSurfaceEglCreateWindowSurface;
                    if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE || !this.f15489v.eglMakeCurrent(this.f15490w, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.f15491x)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
            }
        } else {
            z10 = false;
        }
        ul ulVar = am.f12061a2;
        int i11 = i(35633, !((String) zzba.zzc().a(ulVar)).equals(ulVar.c()) ? (String) zzba.zzc().a(ulVar) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (i11 == 0) {
            iGlCreateProgram = 0;
        } else {
            ul ulVar2 = am.f12078b2;
            int i12 = i(35632, !((String) zzba.zzc().a(ulVar2)).equals(ulVar2.c()) ? (String) zzba.zzc().a(ulVar2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
            if (i12 == 0) {
                iGlCreateProgram = 0;
            } else {
                iGlCreateProgram = GLES20.glCreateProgram();
                e("createProgram");
                if (iGlCreateProgram != 0) {
                    GLES20.glAttachShader(iGlCreateProgram, i11);
                    e("attachShader");
                    GLES20.glAttachShader(iGlCreateProgram, i12);
                    e("attachShader");
                    GLES20.glLinkProgram(iGlCreateProgram);
                    e("linkProgram");
                    int[] iArr2 = new int[1];
                    GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
                    e("getProgramiv");
                    if (iArr2[0] != 1) {
                        Log.e("SphericalVideoRenderer", "Could not link program: ");
                        Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        GLES20.glDeleteProgram(iGlCreateProgram);
                        e("deleteProgram");
                        iGlCreateProgram = 0;
                    } else {
                        GLES20.glValidateProgram(iGlCreateProgram);
                        e("validateProgram");
                    }
                }
            }
        }
        this.f15483p = iGlCreateProgram;
        GLES20.glUseProgram(iGlCreateProgram);
        e("useProgram");
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f15483p, "aPosition");
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 3, 5126, false, 12, (Buffer) this.f15486s);
        e("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        e("enableVertexAttribArray");
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        e("genTextures");
        int i13 = iArr3[0];
        GLES20.glBindTexture(36197, i13);
        e("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        e("texParameteri");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f15483p, "uVMat");
        this.f15484q = iGlGetUniformLocation;
        GLES20.glUniformMatrix3fv(iGlGetUniformLocation, 1, false, new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, 0);
        int i14 = this.f15483p;
        if (!z10 || i14 == 0) {
            String strValueOf = String.valueOf(GLUtils.getEGLErrorString(this.f15489v.eglGetError()));
            int i15 = zze.zza;
            String strConcat = "EGL initialization failed: ".concat(strValueOf);
            zzo.zzf(strConcat);
            zzt.zzh().d("SphericalVideoProcessor.run.1", new Throwable(strConcat));
            d();
            this.f15487t.countDown();
            return;
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(i13);
        this.f15481n = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f15487t.countDown();
        h10 h10Var = this.f15469a;
        if (h10Var.f15055g == null) {
            SensorManager sensorManager = h10Var.f15049a;
            Sensor defaultSensor = sensorManager.getDefaultSensor(11);
            if (defaultSensor == null) {
                int i16 = zze.zza;
                zzo.zzf("No Sensor of TYPE_ROTATION_VECTOR");
            } else {
                HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
                handlerThread.start();
                y01 y01Var = new y01(handlerThread.getLooper());
                h10Var.f15055g = y01Var;
                if (!sensorManager.registerListener(h10Var, defaultSensor, 0, y01Var)) {
                    int i17 = zze.zza;
                    zzo.zzf("SensorManager.registerListener failed.");
                    h10Var.b();
                }
            }
        }
        try {
            try {
                this.f15493z = true;
                while (!this.A) {
                    while (this.f15485r > 0) {
                        this.f15481n.updateTexImage();
                        this.f15485r--;
                    }
                    float[] fArr = this.f15470b;
                    if (h10Var.c(fArr)) {
                        if (Float.isNaN(this.f15477i)) {
                            float[] fArr2 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
                            float f10 = fArr[0];
                            float f11 = fArr2[0];
                            float f12 = fArr[1];
                            float f13 = fArr2[1];
                            float[] fArr3 = {(fArr[2] * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (f12 * f13) + (f10 * f11), (fArr[5] * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (fArr[4] * f13) + (fArr[3] * f11), (fArr[8] * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (fArr[7] * f13) + (fArr[6] * f11)};
                            this.f15477i = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                        }
                        h(this.f15475g, this.f15477i + this.f15478j);
                    } else {
                        g(fArr, -1.5707964f);
                        h(this.f15475g, this.f15478j);
                    }
                    float[] fArr4 = this.f15471c;
                    g(fArr4, 1.5707964f);
                    float[] fArr5 = this.f15472d;
                    f(fArr5, this.f15475g, fArr4);
                    float[] fArr6 = this.f15473e;
                    f(fArr6, fArr, fArr5);
                    float[] fArr7 = this.f15474f;
                    g(fArr7, this.f15479k);
                    float[] fArr8 = this.f15476h;
                    f(fArr8, fArr7, fArr6);
                    GLES20.glUniformMatrix3fv(this.f15484q, 1, false, fArr8, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    e("drawArrays");
                    GLES20.glFinish();
                    this.f15489v.eglSwapBuffers(this.f15490w, this.f15492y);
                    if (this.f15493z) {
                        GLES20.glViewport(0, 0, this.f15480m, this.l);
                        e("viewport");
                        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f15483p, "uFOVx");
                        int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(this.f15483p, "uFOVy");
                        int i18 = this.f15480m;
                        int i19 = this.l;
                        if (i18 > i19) {
                            GLES20.glUniform1f(iGlGetUniformLocation2, 0.87266463f);
                            GLES20.glUniform1f(iGlGetUniformLocation3, (this.l * 0.87266463f) / this.f15480m);
                        } else {
                            GLES20.glUniform1f(iGlGetUniformLocation2, (i18 * 0.87266463f) / i19);
                            GLES20.glUniform1f(iGlGetUniformLocation3, 0.87266463f);
                        }
                        this.f15493z = false;
                    }
                    try {
                        Object obj = this.f15488u;
                        synchronized (obj) {
                            try {
                                if (!this.A && !this.f15493z && this.f15485r == 0) {
                                    obj.wait();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            } catch (IllegalStateException unused2) {
                int i20 = zze.zza;
                zzo.zzi("SphericalVideoProcessor halted unexpectedly.");
            } catch (Throwable th3) {
                int i21 = zze.zza;
                zzo.zzg("SphericalVideoProcessor died.", th3);
                zzt.zzh().d("SphericalVideoProcessor.run.2", th3);
            }
            this.f15469a.b();
            this.f15481n.setOnFrameAvailableListener(null);
            this.f15481n = null;
            d();
        } catch (Throwable th4) {
            this.f15469a.b();
            this.f15481n.setOnFrameAvailableListener(null);
            this.f15481n = null;
            d();
            throw th4;
        }
    }
}
