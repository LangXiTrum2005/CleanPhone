package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.badlogic.gdx.graphics.GL20;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.c30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3137c30 implements InterfaceC4685th0, InterfaceC2668Pc {
    public int i;
    public SurfaceTexture j;
    public byte[] m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f4201a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final C4051mW c = new C4051mW();
    public final C3877kY d = new C3877kY();
    public final VC e = new VC(4);
    public final VC f = new VC(4);
    public final float[] g = new float[16];
    public final float[] h = new float[16];
    public volatile int k = 0;
    public int l = -1;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4685th0
    public final void a(long j, long j2, C4619sw c4619sw, MediaFormat mediaFormat) {
        int i;
        int i2;
        int i3;
        ArrayList arrayListQ;
        int i4 = 1;
        this.e.a(j2, Long.valueOf(j));
        byte[] bArr = c4619sw.v;
        int i5 = c4619sw.w;
        byte[] bArr2 = this.m;
        int i6 = this.l;
        this.m = bArr;
        if (i5 == -1) {
            i5 = this.k;
        }
        this.l = i5;
        if (i6 == i5 && Arrays.equals(bArr2, this.m)) {
            return;
        }
        byte[] bArr3 = this.m;
        C3963lW c3963lW = null;
        if (bArr3 != null) {
            int i7 = this.l;
            JT jt = new JT(bArr3);
            try {
                jt.F(4);
                int iF = jt.f();
                jt.E(0);
                if (iF == 1886547818) {
                    jt.F(8);
                    int i8 = jt.b;
                    int i9 = jt.c;
                    while (true) {
                        if (i8 < i9) {
                            int iF2 = jt.f() + i8;
                            if (iF2 > i8 && iF2 <= i9) {
                                int iF3 = jt.f();
                                if (iF3 != 2037673328 && iF3 != 1836279920) {
                                    jt.E(iF2);
                                    i8 = iF2;
                                }
                                jt.D(iF2);
                                arrayListQ = FW.Q(jt);
                            }
                        }
                        arrayListQ = null;
                    }
                } else {
                    arrayListQ = FW.Q(jt);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListQ != null) {
                int size = arrayListQ.size();
                if (size == 1) {
                    C3875kW c3875kW = (C3875kW) arrayListQ.get(0);
                    c3963lW = new C3963lW(c3875kW, c3875kW, i7);
                } else if (size == 2) {
                    c3963lW = new C3963lW((C3875kW) arrayListQ.get(0), (C3875kW) arrayListQ.get(1), i7);
                }
            }
        }
        if (c3963lW == null || !C4051mW.b(c3963lW)) {
            int i10 = this.l;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f = radians / 36;
            float f2 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 36; i11 < i14; i14 = 36) {
                float f3 = radians / 2.0f;
                float f4 = (i11 * f) - f3;
                int i15 = i11 + 1;
                float f5 = (i15 * f) - f3;
                int i16 = 0;
                while (i16 < 73) {
                    float f6 = f5;
                    float f7 = f4;
                    int i17 = i15;
                    int i18 = i12;
                    int i19 = i13;
                    int i20 = 0;
                    int i21 = 2;
                    while (i20 < i21) {
                        float f8 = i16 * f2;
                        float f9 = f2;
                        int i22 = i16;
                        float f10 = radians;
                        double d = 50.0f;
                        int i23 = i10;
                        double d2 = (3.1415927f + f8) - (radians2 / 2.0f);
                        double d3 = i20 == 0 ? f7 : f6;
                        int i24 = i20;
                        float f11 = f;
                        fArr[i18] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                        int i25 = i11;
                        float[] fArr3 = fArr2;
                        fArr[i18 + 1] = (float) (Math.sin(d3) * d);
                        int i26 = i18 + 3;
                        fArr[i18 + 2] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                        fArr3[i19] = f8 / radians2;
                        int i27 = i19 + 2;
                        fArr3[i19 + 1] = ((i25 + i24) * f11) / f10;
                        if (i22 == 0 && i24 == 0) {
                            i2 = i24;
                            i = i22;
                            i3 = 3;
                        } else {
                            i = i22;
                            i2 = i24;
                            i3 = 3;
                            if (i != 72 || i2 != 1) {
                                i19 = i27;
                                i18 = i26;
                            }
                            int i28 = i2 + 1;
                            i16 = i;
                            fArr2 = fArr3;
                            f2 = f9;
                            radians = f10;
                            i10 = i23;
                            i11 = i25;
                            f = f11;
                            i21 = 2;
                            i20 = i28;
                        }
                        System.arraycopy(fArr, i18, fArr, i26, i3);
                        i18 += 6;
                        System.arraycopy(fArr3, i19, fArr3, i27, 2);
                        i19 += 4;
                        int i29 = i2 + 1;
                        i16 = i;
                        fArr2 = fArr3;
                        f2 = f9;
                        radians = f10;
                        i10 = i23;
                        i11 = i25;
                        f = f11;
                        i21 = 2;
                        i20 = i29;
                    }
                    i16++;
                    i13 = i19;
                    i12 = i18;
                    f4 = f7;
                    i15 = i17;
                    radians = radians;
                    i10 = i10;
                    f = f;
                    f5 = f6;
                }
                i11 = i15;
                i4 = 1;
            }
            int i30 = i10;
            VC[] vcArr = new VC[i4];
            vcArr[0] = new VC(fArr, 0, fArr2, i4);
            C3875kW c3875kW2 = new C3875kW(vcArr);
            c3963lW = new C3963lW(c3875kW2, c3875kW2, i30);
        }
        this.f.a(j2, c3963lW);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2668Pc
    public final void b(long j, float[] fArr) {
        ((VC) this.d.e).a(j, fArr);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2668Pc
    public final void c() {
        this.e.b();
        C3877kY c3877kY = this.d;
        ((VC) c3877kY.e).b();
        c3877kY.b = false;
        this.b.set(true);
    }

    public final void d(float[] fArr) {
        float[] fArr2;
        Object objD;
        GLES20.glClear(16384);
        try {
            AbstractC2845Vx.N();
        } catch (C2819Ux e) {
            AbstractC4038mJ.d("Failed to draw a frame", e);
        }
        if (this.f4201a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                AbstractC2845Vx.N();
            } catch (C2819Ux e2) {
                AbstractC4038mJ.d("Failed to draw a frame", e2);
            }
            if (this.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.g, 0);
            }
            long timestamp = this.j.getTimestamp();
            VC vc = this.e;
            synchronized (vc) {
                objD = vc.d(timestamp, false);
            }
            Long l = (Long) objD;
            if (l != null) {
                C3877kY c3877kY = this.d;
                float[] fArr3 = this.g;
                float[] fArr4 = (float[]) ((VC) c3877kY.e).e(l.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) c3877kY.d;
                    float f = fArr4[0];
                    float f2 = -fArr4[1];
                    float f3 = -fArr4[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    boolean z = c3877kY.b;
                    Object obj = c3877kY.c;
                    if (!z) {
                        C3877kY.f((float[]) obj, (float[]) c3877kY.d);
                        c3877kY.b = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) obj, 0, (float[]) c3877kY.d, 0);
                }
            }
            C3963lW c3963lW = (C3963lW) this.f.e(timestamp);
            if (c3963lW != null) {
                C4051mW c4051mW = this.c;
                c4051mW.getClass();
                if (C4051mW.b(c3963lW)) {
                    c4051mW.f4697a = c3963lW.c;
                    c4051mW.b = new VC(c3963lW.f4648a.f4601a[0]);
                    if (!c3963lW.d) {
                        new VC(c3963lW.b.f4601a[0]);
                    }
                    c4051mW.getClass();
                }
            }
        }
        Matrix.multiplyMM(this.h, 0, fArr, 0, this.g, 0);
        C4051mW c4051mW2 = this.c;
        int i = this.i;
        float[] fArr6 = this.h;
        VC vc2 = c4051mW2.b;
        if (vc2 == null) {
            return;
        }
        int i2 = c4051mW2.f4697a;
        if (i2 == 1) {
            fArr2 = C4051mW.j;
        } else {
            fArr2 = i2 == 2 ? C4051mW.k : C4051mW.i;
        }
        GLES20.glUniformMatrix3fv(c4051mW2.e, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(c4051mW2.d, 1, false, fArr6, 0);
        GLES20.glActiveTexture(GL20.GL_TEXTURE0);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(c4051mW2.h, 0);
        try {
            AbstractC2845Vx.N();
        } catch (C2819Ux unused) {
        }
        GLES20.glVertexAttribPointer(c4051mW2.f, 3, GL20.GL_FLOAT, false, 12, (Buffer) vc2.c);
        try {
            AbstractC2845Vx.N();
        } catch (C2819Ux unused2) {
        }
        GLES20.glVertexAttribPointer(c4051mW2.g, 2, GL20.GL_FLOAT, false, 8, (Buffer) vc2.d);
        try {
            AbstractC2845Vx.N();
        } catch (C2819Ux unused3) {
        }
        GLES20.glDrawArrays(vc2.b, 0, vc2.f3864a);
        try {
            AbstractC2845Vx.N();
        } catch (C2819Ux unused4) {
        }
    }

    public final SurfaceTexture e() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            AbstractC2845Vx.N();
            this.c.a();
            AbstractC2845Vx.N();
            AbstractC2845Vx.O("No current context", !Ug0.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT));
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            AbstractC2845Vx.N();
            int i = iArr[0];
            AbstractC2845Vx.K(36197, i);
            this.i = i;
        } catch (C2819Ux e) {
            AbstractC4038mJ.d("Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.i);
        this.j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.b30
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f4156a.f4201a.set(true);
            }
        });
        return this.j;
    }
}
