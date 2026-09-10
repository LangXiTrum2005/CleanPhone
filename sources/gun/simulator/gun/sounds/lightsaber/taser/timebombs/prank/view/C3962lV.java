package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3962lV implements UT, InterfaceC4818v9, InterfaceC4914wG {
    public final String e;
    public final C3160cK f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final C3915kv j;
    public final AbstractC5170z9 k;
    public final C3915kv l;
    public final C3915kv m;
    public final C3915kv n;
    public final C3915kv o;
    public final C3915kv p;
    public boolean r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f4647a = new Path();
    public final Path b = new Path();
    public final PathMeasure c = new PathMeasure();
    public final float[] d = new float[2];
    public final C5036xh q = new C5036xh(0);

    public C3962lV(C3160cK c3160cK, B9 b9, C4050mV c4050mV) {
        this.f = c3160cK;
        this.e = c4050mV.f4696a;
        int i = c4050mV.b;
        this.g = i;
        this.h = c4050mV.j;
        this.i = c4050mV.k;
        C3915kv c3915kvD = c4050mV.c.d();
        this.j = c3915kvD;
        AbstractC5170z9 abstractC5170z9D = c4050mV.d.d();
        this.k = abstractC5170z9D;
        C3915kv c3915kvD2 = c4050mV.e.d();
        this.l = c3915kvD2;
        C3915kv c3915kvD3 = c4050mV.g.d();
        this.n = c3915kvD3;
        C3915kv c3915kvD4 = c4050mV.i.d();
        this.p = c3915kvD4;
        if (i == 1) {
            this.m = c4050mV.f.d();
            this.o = c4050mV.h.d();
        } else {
            this.m = null;
            this.o = null;
        }
        b9.e(c3915kvD);
        b9.e(abstractC5170z9D);
        b9.e(c3915kvD2);
        b9.e(c3915kvD3);
        b9.e(c3915kvD4);
        if (i == 1) {
            b9.e(this.m);
            b9.e(this.o);
        }
        c3915kvD.a(this);
        abstractC5170z9D.a(this);
        c3915kvD2.a(this);
        c3915kvD3.a(this);
        c3915kvD4.a(this);
        if (i == 1) {
            this.m.a(this);
            this.o.a(this);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4818v9
    public final void a() {
        this.r = false;
        this.f.invalidateSelf();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            InterfaceC2546Kj interfaceC2546Kj = (InterfaceC2546Kj) arrayList.get(i);
            if (interfaceC2546Kj instanceof C3362ee0) {
                C3362ee0 c3362ee0 = (C3362ee0) interfaceC2546Kj;
                if (c3362ee0.c == 1) {
                    this.q.f5240a.add(c3362ee0);
                    c3362ee0.c(this);
                }
            }
            i++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void c(C4738uG c4738uG, int i, ArrayList arrayList, C4738uG c4738uG2) {
        AbstractC5187zP.f(c4738uG, i, arrayList, c4738uG2, this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void g(C4215oK c4215oK, Object obj) {
        C3915kv c3915kv;
        C3915kv c3915kv2;
        if (obj == InterfaceC3689iK.r) {
            this.j.j(c4215oK);
            return;
        }
        if (obj == InterfaceC3689iK.s) {
            this.l.j(c4215oK);
            return;
        }
        if (obj == InterfaceC3689iK.i) {
            this.k.j(c4215oK);
            return;
        }
        if (obj == InterfaceC3689iK.t && (c3915kv2 = this.m) != null) {
            c3915kv2.j(c4215oK);
            return;
        }
        if (obj == InterfaceC3689iK.u) {
            this.n.j(c4215oK);
            return;
        }
        if (obj == InterfaceC3689iK.v && (c3915kv = this.o) != null) {
            c3915kv.j(c4215oK);
        } else if (obj == InterfaceC3689iK.w) {
            this.p.j(c4215oK);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final String getName() {
        return this.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.UT
    public final Path getPath() {
        double d;
        float fCos;
        float fSin;
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        double d2;
        float f5;
        boolean z = this.r;
        Path path = this.f4647a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.h) {
            this.r = true;
            return path;
        }
        int iD = DM.D(this.g);
        AbstractC5170z9 abstractC5170z9 = this.k;
        C3915kv c3915kv = this.n;
        C3915kv c3915kv2 = this.p;
        C3915kv c3915kv3 = this.l;
        C3915kv c3915kv4 = this.j;
        if (iD == 0) {
            float fFloatValue = ((Float) c3915kv4.e()).floatValue();
            double radians = Math.toRadians((c3915kv3 != null ? ((Float) c3915kv3.e()).floatValue() : 0.0d) - 90.0d);
            double d3 = fFloatValue;
            float f6 = (float) (6.283185307179586d / d3);
            if (this.i) {
                f6 *= -1.0f;
            }
            float f7 = f6;
            float f8 = 2.0f;
            float f9 = f7 / 2.0f;
            float f10 = fFloatValue - ((int) fFloatValue);
            if (f10 != 0.0f) {
                radians += (double) ((1.0f - f10) * f9);
            }
            float fFloatValue2 = ((Float) c3915kv.e()).floatValue();
            float fFloatValue3 = ((Float) this.m.e()).floatValue();
            C3915kv c3915kv5 = this.o;
            float fFloatValue4 = c3915kv5 != null ? ((Float) c3915kv5.e()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = c3915kv2 != null ? ((Float) c3915kv2.e()).floatValue() / 100.0f : 0.0f;
            if (f10 != 0.0f) {
                float fW = AbstractC5044xl.w(fFloatValue2, fFloatValue3, f10, fFloatValue3);
                double d4 = fW;
                f = fW;
                fCos = (float) (Math.cos(radians) * d4);
                fSin = (float) (Math.sin(radians) * d4);
                path.moveTo(fCos, fSin);
                d = radians + ((double) ((f7 * f10) / 2.0f));
            } else {
                double d5 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d5);
                float fSin2 = (float) (d5 * Math.sin(radians));
                path.moveTo(fCos2, fSin2);
                d = radians + ((double) f9);
                fCos = fCos2;
                fSin = fSin2;
                f = 0.0f;
            }
            double dCeil = Math.ceil(d3);
            double d6 = 2.0d;
            double d7 = dCeil * 2.0d;
            double d8 = d;
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                double d9 = i2;
                if (d9 >= d7) {
                    break;
                }
                float f11 = z2 ? fFloatValue2 : fFloatValue3;
                float f12 = (f == 0.0f || d9 != d7 - d6) ? f9 : (f7 * f10) / f8;
                if (f != 0.0f && d9 == d7 - 1.0d) {
                    f11 = f;
                }
                double d10 = f11;
                float f13 = fFloatValue2;
                float f14 = f7;
                float fCos3 = (float) (Math.cos(d8) * d10);
                float fSin3 = (float) (d10 * Math.sin(d8));
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    path.lineTo(fCos3, fSin3);
                    f2 = fSin3;
                    f3 = f9;
                    f4 = f12;
                } else {
                    float f15 = f12;
                    double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    float f16 = f9;
                    f2 = fSin3;
                    double dAtan3 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan3);
                    float fSin5 = (float) Math.sin(dAtan3);
                    float f17 = z2 ? fFloatValue4 : fFloatValue5;
                    float f18 = z2 ? fFloatValue5 : fFloatValue4;
                    float f19 = (z2 ? fFloatValue3 : f13) * f17 * 0.47829f;
                    float f20 = fCos4 * f19;
                    float f21 = f19 * fSin4;
                    float f22 = (z2 ? f13 : fFloatValue3) * f18 * 0.47829f;
                    float f23 = fCos5 * f22;
                    float f24 = f22 * fSin5;
                    if (f10 != 0.0f) {
                        if (i2 == 0) {
                            f20 *= f10;
                            f21 *= f10;
                        } else if (d9 == d7 - 1.0d) {
                            f23 *= f10;
                            f24 *= f10;
                        }
                    }
                    f3 = f16;
                    path.cubicTo(fCos - f20, fSin - f21, fCos3 + f23, f2 + f24, fCos3, f2);
                    f4 = f15;
                }
                d8 += (double) f4;
                z2 = !z2;
                i2++;
                fFloatValue3 = fFloatValue3;
                fFloatValue2 = f13;
                f10 = f10;
                fCos = fCos3;
                f9 = f3;
                f7 = f14;
                fSin = f2;
                d6 = 2.0d;
                f8 = 2.0f;
            }
            PointF pointF = (PointF) abstractC5170z9.e();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (iD == 1) {
            int iFloor = (int) Math.floor(((Float) c3915kv4.e()).floatValue());
            double radians2 = Math.toRadians((c3915kv3 != null ? ((Float) c3915kv3.e()).floatValue() : 0.0d) - 90.0d);
            double d11 = iFloor;
            float fFloatValue6 = ((Float) c3915kv2.e()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) c3915kv.e()).floatValue();
            double d12 = fFloatValue7;
            float fCos6 = (float) (Math.cos(radians2) * d12);
            float fSin6 = (float) (Math.sin(radians2) * d12);
            path.moveTo(fCos6, fSin6);
            double d13 = (float) (6.283185307179586d / d11);
            double dCeil2 = Math.ceil(d11);
            double d14 = radians2 + d13;
            int i3 = 0;
            while (true) {
                double d15 = i3;
                if (d15 >= dCeil2) {
                    break;
                }
                float fCos7 = (float) (Math.cos(d14) * d12);
                double d16 = d13;
                float fSin7 = (float) (Math.sin(d14) * d12);
                if (fFloatValue6 != 0.0f) {
                    d2 = d12;
                    double dAtan4 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan4);
                    float fSin8 = (float) Math.sin(dAtan4);
                    i = i3;
                    float f25 = fCos6;
                    double dAtan5 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f26 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f27 = fCos8 * f26;
                    float f28 = fSin8 * f26;
                    float fCos9 = ((float) Math.cos(dAtan5)) * f26;
                    float fSin9 = f26 * ((float) Math.sin(dAtan5));
                    if (d15 == dCeil2 - 1.0d) {
                        Path path2 = this.b;
                        path2.reset();
                        path2.moveTo(f25, fSin6);
                        float f29 = f25 - f27;
                        float f30 = fSin6 - f28;
                        float f31 = fCos9 + fCos7;
                        float f32 = fSin7 + fSin9;
                        path2.cubicTo(f29, f30, f31, f32, fCos7, fSin7);
                        PathMeasure pathMeasure = this.c;
                        pathMeasure.setPath(path2, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        f5 = fFloatValue7;
                        float[] fArr = this.d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path.cubicTo(f29, f30, f31, f32, fArr[0], fArr[1]);
                    } else {
                        f5 = fFloatValue7;
                        path.cubicTo(f25 - f27, fSin6 - f28, fCos7 + fCos9, fSin7 + fSin9, fCos7, fSin7);
                    }
                } else {
                    i = i3;
                    d2 = d12;
                    f5 = fFloatValue7;
                    if (d15 != dCeil2 - 1.0d) {
                        path.lineTo(fCos7, fSin7);
                    }
                    i3 = i + 1;
                    fCos6 = fCos7;
                    fSin6 = fSin7;
                    fFloatValue7 = f5;
                    d12 = d2;
                    d13 = d16;
                }
                d14 += d16;
                i3 = i + 1;
                fCos6 = fCos7;
                fSin6 = fSin7;
                fFloatValue7 = f5;
                d12 = d2;
                d13 = d16;
            }
            PointF pointF2 = (PointF) abstractC5170z9.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.q.d(path);
        this.r = true;
        return path;
    }
}
