package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3910kq implements InterfaceC4818v9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B9 f4620a;
    public final InterfaceC4818v9 b;
    public final AbstractC5170z9 c;
    public final C3915kv d;
    public final C3915kv e;
    public final C3915kv f;
    public final C3915kv g;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public int k = 0;
    public final float[] l = new float[9];

    public C3910kq(InterfaceC4818v9 interfaceC4818v9, B9 b9, L4 l4) {
        this.b = interfaceC4818v9;
        this.f4620a = b9;
        AbstractC5170z9 abstractC5170z9D = ((F4) l4.f3336a).d();
        this.c = abstractC5170z9D;
        abstractC5170z9D.a(this);
        b9.e(abstractC5170z9D);
        C3915kv c3915kvD = ((G4) l4.b).d();
        this.d = c3915kvD;
        c3915kvD.a(this);
        b9.e(c3915kvD);
        C3915kv c3915kvD2 = ((G4) l4.c).d();
        this.e = c3915kvD2;
        c3915kvD2.a(this);
        b9.e(c3915kvD2);
        C3915kv c3915kvD3 = ((G4) l4.d).d();
        this.f = c3915kvD3;
        c3915kvD3.a(this);
        b9.e(c3915kvD3);
        C3915kv c3915kvD4 = ((G4) l4.e).d();
        this.g = c3915kvD4;
        c3915kvD4.a(this);
        b9.e(c3915kvD4);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4818v9
    public final void a() {
        this.b.a();
    }

    public final void b(VG vg, Matrix matrix, int i) {
        float fK = this.e.k() * 0.017453292f;
        float fFloatValue = ((Float) this.f.e()).floatValue();
        double d = fK;
        float fSin = ((float) Math.sin(d)) * fFloatValue;
        float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
        Matrix matrixE = this.f4620a.w.e();
        float[] fArr = this.l;
        matrixE.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[4];
        matrix.getValues(fArr);
        float f3 = fArr[0] / f;
        float f4 = fSin * f3;
        float f5 = fCos * (fArr[4] / f2);
        int iIntValue = ((Integer) this.c.e()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.d.e()).floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        float fMax = Math.max(((Float) this.g.e()).floatValue() * f3 * 0.33f, Float.MIN_VALUE);
        if (this.h == fMax && this.i == f4 && this.j == f5 && this.k == iArgb) {
            return;
        }
        this.h = fMax;
        this.i = f4;
        this.j = f5;
        this.k = iArgb;
        vg.setShadowLayer(fMax, f4, f5, iArgb);
    }

    public final void c(C4215oK c4215oK) {
        C3915kv c3915kv = this.d;
        if (c4215oK == null) {
            c3915kv.j(null);
        } else {
            c3915kv.j(new C3822jq(c4215oK));
        }
    }
}
