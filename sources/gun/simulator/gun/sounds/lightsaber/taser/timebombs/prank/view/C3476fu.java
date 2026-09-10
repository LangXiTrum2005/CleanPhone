package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3476fu implements InterfaceC2837Vp, InterfaceC4818v9, InterfaceC4914wG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f4390a;
    public final VG b;
    public final B9 c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final AbstractC5170z9 g;
    public final AbstractC5170z9 h;
    public C3103bh0 i;
    public final C3160cK j;
    public AbstractC5170z9 k;
    public float l;
    public final C3910kq m;

    public C3476fu(C3160cK c3160cK, B9 b9, C3232d60 c3232d60) {
        F4 f4;
        Path path = new Path();
        this.f4390a = path;
        this.b = new VG(1);
        this.f = new ArrayList();
        this.c = b9;
        this.d = c3232d60.c;
        this.e = c3232d60.f;
        this.j = c3160cK;
        if (b9.k() != null) {
            C3915kv c3915kvD = ((G4) b9.k().b).d();
            this.k = c3915kvD;
            c3915kvD.a(this);
            b9.e(this.k);
        }
        if (b9.l() != null) {
            this.m = new C3910kq(this, b9, b9.l());
        }
        F4 f5 = c3232d60.d;
        if (f5 == null || (f4 = c3232d60.e) == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(c3232d60.b);
        AbstractC5170z9 abstractC5170z9D = f5.d();
        this.g = abstractC5170z9D;
        abstractC5170z9D.a(this);
        b9.e(abstractC5170z9D);
        AbstractC5170z9 abstractC5170z9D2 = f4.d();
        this.h = abstractC5170z9D2;
        abstractC5170z9D2.a(this);
        b9.e(abstractC5170z9D2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4818v9
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC2546Kj interfaceC2546Kj = (InterfaceC2546Kj) list2.get(i);
            if (interfaceC2546Kj instanceof UT) {
                this.f.add((UT) interfaceC2546Kj);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void c(C4738uG c4738uG, int i, ArrayList arrayList, C4738uG c4738uG2) {
        AbstractC5187zP.f(c4738uG, i, arrayList, c4738uG2, this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2837Vp
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f4390a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((UT) arrayList.get(i)).getPath(), matrix);
                i++;
            }
        }
    }

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
    public final void f(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (this.e) {
            return;
        }
        C2905Yf c2905Yf = (C2905Yf) this.g;
        int iK = c2905Yf.k(c2905Yf.c.f(), c2905Yf.c());
        float f = i / 255.0f;
        int iIntValue = (int) (((((Integer) this.h.e()).intValue() * f) / 100.0f) * 255.0f);
        PointF pointF = AbstractC5187zP.f5324a;
        int i2 = 0;
        int iMax = (iK & ViewCompat.MEASURED_SIZE_MASK) | (Math.max(0, Math.min(255, iIntValue)) << 24);
        VG vg = this.b;
        vg.setColor(iMax);
        C3103bh0 c3103bh0 = this.i;
        if (c3103bh0 != null) {
            vg.setColorFilter((ColorFilter) c3103bh0.e());
        }
        AbstractC5170z9 abstractC5170z9 = this.k;
        if (abstractC5170z9 != null) {
            float fFloatValue = ((Float) abstractC5170z9.e()).floatValue();
            if (fFloatValue == 0.0f) {
                vg.setMaskFilter(null);
            } else if (fFloatValue != this.l) {
                B9 b9 = this.c;
                if (b9.A == fFloatValue) {
                    blurMaskFilter = b9.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    b9.B = blurMaskFilter2;
                    b9.A = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                vg.setMaskFilter(blurMaskFilter);
            }
            this.l = fFloatValue;
        }
        C3910kq c3910kq = this.m;
        if (c3910kq != null) {
            Xg0 xg0 = AbstractC3014ah0.f4135a;
            c3910kq.b(vg, matrix, (int) (((f * iIntValue) / 255.0f) * 255.0f));
        }
        Path path = this.f4390a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, vg);
                return;
            } else {
                path.addPath(((UT) arrayList.get(i2)).getPath(), matrix);
                i2++;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void g(C4215oK c4215oK, Object obj) {
        PointF pointF = InterfaceC3689iK.f4497a;
        if (obj == 1) {
            this.g.j(c4215oK);
            return;
        }
        if (obj == 4) {
            this.h.j(c4215oK);
            return;
        }
        ColorFilter colorFilter = InterfaceC3689iK.F;
        B9 b9 = this.c;
        if (obj == colorFilter) {
            C3103bh0 c3103bh0 = this.i;
            if (c3103bh0 != null) {
                b9.o(c3103bh0);
            }
            if (c4215oK == null) {
                this.i = null;
                return;
            }
            C3103bh0 c3103bh1 = new C3103bh0(c4215oK, null);
            this.i = c3103bh1;
            c3103bh1.a(this);
            b9.e(this.i);
            return;
        }
        if (obj == InterfaceC3689iK.e) {
            AbstractC5170z9 abstractC5170z9 = this.k;
            if (abstractC5170z9 != null) {
                abstractC5170z9.j(c4215oK);
                return;
            }
            C3103bh0 c3103bh2 = new C3103bh0(c4215oK, null);
            this.k = c3103bh2;
            c3103bh2.a(this);
            b9.e(this.k);
            return;
        }
        C3910kq c3910kq = this.m;
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

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final String getName() {
        return this.d;
    }
}
