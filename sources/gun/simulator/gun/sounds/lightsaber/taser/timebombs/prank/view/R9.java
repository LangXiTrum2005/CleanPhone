package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class R9 implements InterfaceC4818v9, InterfaceC4914wG, InterfaceC2837Vp {
    public final C3160cK e;
    public final B9 f;
    public final float[] h;
    public final VG i;
    public final C3915kv j;
    public final AbstractC5170z9 k;
    public final ArrayList l;
    public final C3915kv m;
    public C3103bh0 n;
    public AbstractC5170z9 o;
    public float p;
    public final C3910kq q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f3648a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public R9(C3160cK c3160cK, B9 b9, Paint.Cap cap, Paint.Join join, float f, F4 f4, G4 g4, List list, G4 g5) {
        VG vg = new VG(1);
        this.i = vg;
        this.p = 0.0f;
        this.e = c3160cK;
        this.f = b9;
        vg.setStyle(Paint.Style.STROKE);
        vg.setStrokeCap(cap);
        vg.setStrokeJoin(join);
        vg.setStrokeMiter(f);
        this.k = f4.d();
        this.j = g4.d();
        if (g5 == null) {
            this.m = null;
        } else {
            this.m = g5.d();
        }
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(((G4) list.get(i)).d());
        }
        b9.e(this.k);
        b9.e(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            b9.e((AbstractC5170z9) this.l.get(i2));
        }
        C3915kv c3915kv = this.m;
        if (c3915kv != null) {
            b9.e(c3915kv);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((AbstractC5170z9) this.l.get(i3)).a(this);
        }
        C3915kv c3915kv2 = this.m;
        if (c3915kv2 != null) {
            c3915kv2.a(this);
        }
        if (b9.k() != null) {
            C3915kv c3915kvD = ((G4) b9.k().b).d();
            this.o = c3915kvD;
            c3915kvD.a(this);
            b9.e(this.o);
        }
        if (b9.l() != null) {
            this.q = new C3910kq(this, b9, b9.l());
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4818v9
    public final void a() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x0062 A[SYNTHETIC] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        Q9 q9 = null;
        C3362ee0 c3362ee0 = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            InterfaceC2546Kj interfaceC2546Kj = (InterfaceC2546Kj) arrayList2.get(size);
            if (interfaceC2546Kj instanceof C3362ee0) {
                C3362ee0 c3362ee1 = (C3362ee0) interfaceC2546Kj;
                if (c3362ee1.c == 2) {
                    c3362ee0 = c3362ee1;
                }
            }
        }
        if (c3362ee0 != null) {
            c3362ee0.c(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.g;
            if (size2 < 0) {
                break;
            }
            InterfaceC2546Kj interfaceC2546Kj2 = (InterfaceC2546Kj) list2.get(size2);
            if (interfaceC2546Kj2 instanceof C3362ee0) {
                C3362ee0 c3362ee2 = (C3362ee0) interfaceC2546Kj2;
                if (c3362ee2.c == 2) {
                    if (q9 != null) {
                        arrayList.add(q9);
                    }
                    Q9 q10 = new Q9(c3362ee2);
                    c3362ee2.c(this);
                    q9 = q10;
                } else if (!(interfaceC2546Kj2 instanceof UT)) {
                    if (q9 == null) {
                        q9 = new Q9(c3362ee0);
                    }
                    q9.f3593a.add((UT) interfaceC2546Kj2);
                }
            } else if (!(interfaceC2546Kj2 instanceof UT)) {
                if (q9 == null) {
                    q9 = new Q9(c3362ee0);
                }
                q9.f3593a.add((UT) interfaceC2546Kj2);
            }
        }
        if (q9 != null) {
            arrayList.add(q9);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void c(C4738uG c4738uG, int i, ArrayList arrayList, C4738uG c4738uG2) {
        AbstractC5187zP.f(c4738uG, i, arrayList, c4738uG2, this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2837Vp
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float fK = this.j.k() / 2.0f;
                rectF2.set(rectF2.left - fK, rectF2.top - fK, rectF2.right + fK, rectF2.bottom + fK);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            Q9 q9 = (Q9) arrayList.get(i);
            for (int i2 = 0; i2 < q9.f3593a.size(); i2++) {
                path.addPath(((UT) q9.f3593a.get(i2)).getPath(), matrix);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x020a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2837Vp
    public void f(Canvas canvas, Matrix matrix, int i) {
        float f;
        BlurMaskFilter blurMaskFilter;
        float[] fArr;
        float[] fArr2 = (float[]) AbstractC3014ah0.d.get();
        boolean z = false;
        fArr2[0] = 0.0f;
        int i2 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f2 = i / 255.0f;
        BD bd = (BD) this.k;
        float f3 = 100.0f;
        int iK = (int) (((bd.k(bd.c.f(), bd.c()) * f2) / 100.0f) * 255.0f);
        PointF pointF = AbstractC5187zP.f5324a;
        int iMax = Math.max(0, Math.min(255, iK));
        VG vg = this.i;
        vg.setAlpha(iMax);
        vg.setStrokeWidth(this.j.k());
        if (vg.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = this.l;
        float f4 = 1.0f;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = this.h;
                if (i3 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((AbstractC5170z9) arrayList.get(i3)).e()).floatValue();
                fArr[i3] = fFloatValue;
                if (i3 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i3] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i3] = 0.1f;
                }
                i3++;
            }
            C3915kv c3915kv = this.m;
            vg.setPathEffect(new DashPathEffect(fArr, c3915kv == null ? 0.0f : ((Float) c3915kv.e()).floatValue()));
        }
        C3103bh0 c3103bh0 = this.n;
        if (c3103bh0 != null) {
            vg.setColorFilter((ColorFilter) c3103bh0.e());
        }
        AbstractC5170z9 abstractC5170z9 = this.o;
        if (abstractC5170z9 != null) {
            float fFloatValue2 = ((Float) abstractC5170z9.e()).floatValue();
            if (fFloatValue2 == 0.0f) {
                vg.setMaskFilter(null);
            } else if (fFloatValue2 != this.p) {
                B9 b9 = this.f;
                if (b9.A == fFloatValue2) {
                    blurMaskFilter = b9.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    b9.B = blurMaskFilter2;
                    b9.A = fFloatValue2;
                    blurMaskFilter = blurMaskFilter2;
                }
                vg.setMaskFilter(blurMaskFilter);
            }
            this.p = fFloatValue2;
        }
        C3910kq c3910kq = this.q;
        if (c3910kq != null) {
            c3910kq.b(vg, matrix, (int) (((f2 * iK) / 255.0f) * 255.0f));
        }
        canvas.save();
        canvas.concat(matrix);
        int i4 = 0;
        while (true) {
            ArrayList arrayList2 = this.g;
            if (i4 >= arrayList2.size()) {
                canvas.restore();
                return;
            }
            Q9 q9 = (Q9) arrayList2.get(i4);
            C3362ee0 c3362ee0 = q9.b;
            Path path = this.b;
            ArrayList arrayList3 = q9.f3593a;
            if (c3362ee0 != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i2; size2 >= 0; size2--) {
                    path.addPath(((UT) arrayList3.get(size2)).getPath());
                }
                C3362ee0 c3362ee1 = q9.b;
                float fFloatValue3 = ((Float) c3362ee1.d.e()).floatValue() / f3;
                float fFloatValue4 = ((Float) c3362ee1.e.e()).floatValue() / f3;
                float fFloatValue5 = ((Float) c3362ee1.f.e()).floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = this.f3648a;
                    pathMeasure.setPath(path, z);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f5 = fFloatValue5 * length;
                    float f6 = (fFloatValue3 * length) + f5;
                    float fMin = Math.min((fFloatValue4 * length) + f5, (f6 + length) - f4);
                    int size3 = arrayList3.size() - i2;
                    float f7 = 0.0f;
                    while (size3 >= 0) {
                        Path path2 = this.c;
                        path2.set(((UT) arrayList3.get(size3)).getPath());
                        pathMeasure.setPath(path2, z);
                        float length2 = pathMeasure.getLength();
                        if (fMin > length) {
                            float f8 = fMin - length;
                            if (f8 >= f7 + length2 || f7 >= f8) {
                                f = f7 + length2;
                                if (f < f6 && f7 <= fMin) {
                                    if (f > fMin || f6 >= f7) {
                                        AbstractC3014ah0.a(path2, f6 < f7 ? 0.0f : (f6 - f7) / length2, fMin > f ? 1.0f : (fMin - f7) / length2, 0.0f);
                                        canvas.drawPath(path2, vg);
                                    } else {
                                        canvas.drawPath(path2, vg);
                                    }
                                }
                            } else {
                                AbstractC3014ah0.a(path2, f6 > length ? (f6 - length) / length2 : 0.0f, Math.min(f8 / length2, f4), 0.0f);
                                canvas.drawPath(path2, vg);
                            }
                        } else {
                            f = f7 + length2;
                            if (f < f6) {
                            }
                        }
                        f7 += length2;
                        size3--;
                        z = false;
                        f4 = 1.0f;
                    }
                } else {
                    canvas.drawPath(path, vg);
                }
            } else {
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((UT) arrayList3.get(size4)).getPath());
                }
                canvas.drawPath(path, vg);
            }
            i4++;
            z = false;
            i2 = 1;
            f3 = 100.0f;
            f4 = 1.0f;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public void g(C4215oK c4215oK, Object obj) {
        PointF pointF = InterfaceC3689iK.f4497a;
        if (obj == 4) {
            this.k.j(c4215oK);
            return;
        }
        if (obj == InterfaceC3689iK.n) {
            this.j.j(c4215oK);
            return;
        }
        ColorFilter colorFilter = InterfaceC3689iK.F;
        B9 b9 = this.f;
        if (obj == colorFilter) {
            C3103bh0 c3103bh0 = this.n;
            if (c3103bh0 != null) {
                b9.o(c3103bh0);
            }
            if (c4215oK == null) {
                this.n = null;
                return;
            }
            C3103bh0 c3103bh1 = new C3103bh0(c4215oK, null);
            this.n = c3103bh1;
            c3103bh1.a(this);
            b9.e(this.n);
            return;
        }
        if (obj == InterfaceC3689iK.e) {
            AbstractC5170z9 abstractC5170z9 = this.o;
            if (abstractC5170z9 != null) {
                abstractC5170z9.j(c4215oK);
                return;
            }
            C3103bh0 c3103bh2 = new C3103bh0(c4215oK, null);
            this.o = c3103bh2;
            c3103bh2.a(this);
            b9.e(this.o);
            return;
        }
        C3910kq c3910kq = this.q;
        if (obj == 5 && c3910kq != null) {
            c3910kq.c.j(c4215oK);
            return;
        }
        if (obj == InterfaceC3689iK.B && c3910kq != null) {
            c3910kq.c(c4215oK);
            return;
        }
        if (obj == InterfaceC3689iK.C && c3910kq != null) {
            c3910kq.e.j(c4215oK);
            return;
        }
        if (obj == InterfaceC3689iK.D && c3910kq != null) {
            c3910kq.f.j(c4215oK);
        } else {
            if (obj != InterfaceC3689iK.E || c3910kq == null) {
                return;
            }
            c3910kq.g.j(c4215oK);
        }
    }
}
