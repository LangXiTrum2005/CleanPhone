package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.PaintCompat;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class B9 implements InterfaceC2837Vp, InterfaceC4818v9, InterfaceC4826vG {
    public float A;
    public BlurMaskFilter B;
    public VG C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f2860a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final VG d = new VG(1);
    public final VG e;
    public final VG f;
    public final VG g;
    public final VG h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final C3160cK o;
    public final ZG p;
    public final C4568sM q;
    public final C3915kv r;
    public B9 s;
    public B9 t;
    public List u;
    public final ArrayList v;
    public final Fd0 w;
    public boolean x;
    public boolean y;
    public VG z;

    public B9(C3160cK c3160cK, ZG zg) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new VG(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new VG(mode2);
        VG vg = new VG(1);
        this.g = vg;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        VG vg2 = new VG();
        vg2.setXfermode(new PorterDuffXfermode(mode3));
        this.h = vg2;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = 0.0f;
        this.o = c3160cK;
        this.p = zg;
        if (zg.u == 3) {
            vg.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            vg.setXfermode(new PorterDuffXfermode(mode));
        }
        M4 m4 = zg.i;
        m4.getClass();
        Fd0 fd0 = new Fd0(m4);
        this.w = fd0;
        fd0.b(this);
        List list = zg.h;
        if (list != null && !list.isEmpty()) {
            C4568sM c4568sM = new C4568sM(list);
            this.q = c4568sM;
            Iterator it = ((List) c4568sM.b).iterator();
            while (it.hasNext()) {
                ((AbstractC5170z9) it.next()).a(this);
            }
            for (AbstractC5170z9 abstractC5170z9 : (List) this.q.c) {
                e(abstractC5170z9);
                abstractC5170z9.a(this);
            }
        }
        ZG zg2 = this.p;
        if (zg2.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        C3915kv c3915kv = new C3915kv(zg2.t);
        this.r = c3915kv;
        c3915kv.b = true;
        c3915kv.a(new InterfaceC4818v9() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A9
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4818v9
            public final void a() {
                B9 b9 = this.f2805a;
                boolean z = b9.r.k() == 1.0f;
                if (z != b9.x) {
                    b9.x = z;
                    b9.o.invalidateSelf();
                }
            }
        });
        boolean z = ((Float) this.r.e()).floatValue() == 1.0f;
        if (z != this.x) {
            this.x = z;
            this.o.invalidateSelf();
        }
        e(this.r);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4818v9
    public final void a() {
        this.o.invalidateSelf();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void c(C4738uG c4738uG, int i, ArrayList arrayList, C4738uG c4738uG2) {
        B9 b9 = this.s;
        ZG zg = this.p;
        if (b9 != null) {
            String str = b9.p.c;
            c4738uG2.getClass();
            C4738uG c4738uG3 = new C4738uG(c4738uG2);
            c4738uG3.f5071a.add(str);
            if (c4738uG.a(i, this.s.p.c)) {
                B9 b10 = this.s;
                C4738uG c4738uG4 = new C4738uG(c4738uG3);
                c4738uG4.b = b10;
                arrayList.add(c4738uG4);
            }
            if (c4738uG.d(i, zg.c)) {
                this.s.p(c4738uG, c4738uG.b(i, this.s.p.c) + i, arrayList, c4738uG3);
            }
        }
        if (c4738uG.c(i, zg.c)) {
            String str2 = zg.c;
            if (!"__container".equals(str2)) {
                c4738uG2.getClass();
                C4738uG c4738uG5 = new C4738uG(c4738uG2);
                c4738uG5.f5071a.add(str2);
                if (c4738uG.a(i, str2)) {
                    C4738uG c4738uG6 = new C4738uG(c4738uG5);
                    c4738uG6.b = this;
                    arrayList.add(c4738uG6);
                }
                c4738uG2 = c4738uG5;
            }
            if (c4738uG.d(i, str2)) {
                p(c4738uG, c4738uG.b(i, str2) + i, arrayList, c4738uG2);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2837Vp
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        h();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((B9) this.u.get(size)).w.e());
                }
            } else {
                B9 b9 = this.t;
                if (b9 != null) {
                    matrix2.preConcat(b9.w.e());
                }
            }
        }
        matrix2.preConcat(this.w.e());
    }

    public final void e(AbstractC5170z9 abstractC5170z9) {
        if (abstractC5170z9 == null) {
            return;
        }
        this.v.add(abstractC5170z9);
    }

    /* JADX WARN: Code duplicated, block: B:165:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0110  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2837Vp
    public final void f(Canvas canvas, Matrix matrix, int i) {
        float f;
        RectF rectF;
        VG vg;
        BlendModeCompat blendModeCompat;
        Integer num;
        if (this.x) {
            ZG zg = this.p;
            if (zg.v) {
                return;
            }
            h();
            Matrix matrix2 = this.b;
            matrix2.reset();
            matrix2.set(matrix);
            int i2 = 1;
            for (int size = this.u.size() - 1; size >= 0; size--) {
                matrix2.preConcat(((B9) this.u.get(size)).w.e());
            }
            Fd0 fd0 = this.w;
            AbstractC5170z9 abstractC5170z9 = fd0.j;
            int iIntValue = (int) ((((i / 255.0f) * ((abstractC5170z9 == null || (num = (Integer) abstractC5170z9.e()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            boolean z = this.s != null;
            int i3 = zg.y;
            if (!z && !m() && i3 == 1) {
                matrix2.preConcat(fd0.e());
                j(canvas, matrix2, iIntValue);
                n();
                return;
            }
            RectF rectF2 = this.i;
            d(rectF2, matrix2, false);
            if (this.s != null && zg.u != 3) {
                RectF rectF3 = this.l;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.s.d(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix2.preConcat(fd0.e());
            RectF rectF4 = this.k;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zM = m();
            Path path = this.f2860a;
            C4568sM c4568sM = this.q;
            int i4 = 2;
            if (!zM) {
                f = 0.0f;
                break;
            }
            int size2 = ((List) c4568sM.d).size();
            int i5 = 0;
            while (true) {
                if (i5 < size2) {
                    C4480rM c4480rM = (C4480rM) ((List) c4568sM.d).get(i5);
                    Path path2 = (Path) ((AbstractC5170z9) ((List) c4568sM.b).get(i5)).e();
                    if (path2 != null) {
                        path.set(path2);
                        path.transform(matrix2);
                        int iD = DM.D(c4480rM.f4927a);
                        if (iD == 0) {
                            if (c4480rM.d) {
                            }
                            rectF = this.m;
                            path.computeBounds(rectF, false);
                            if (i5 == 0) {
                                rectF4.set(rectF);
                            } else {
                                rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                            }
                        } else if (iD != i2) {
                            if (iD != i4) {
                                if (iD == 3) {
                                }
                                rectF = this.m;
                                path.computeBounds(rectF, false);
                                if (i5 == 0) {
                                    rectF4.set(rectF);
                                } else {
                                    rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                }
                            } else {
                                if (c4480rM.d) {
                                }
                                rectF = this.m;
                                path.computeBounds(rectF, false);
                                if (i5 == 0) {
                                    rectF4.set(rectF);
                                } else {
                                    rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                }
                            }
                        }
                    }
                    i5++;
                    size2 = size2;
                    i4 = 2;
                    i2 = 1;
                } else if (!rectF2.intersect(rectF4)) {
                    f = 0.0f;
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    break;
                }
                f = 0.0f;
                break;
            }
            RectF rectF5 = this.j;
            rectF5.set(f, f, canvas.getWidth(), canvas.getHeight());
            Matrix matrix3 = this.c;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF2.intersect(rectF5)) {
                rectF2.set(f, f, f, f);
            }
            if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                VG vg2 = this.d;
                vg2.setAlpha(255);
                int iD2 = DM.D(i3);
                if (iD2 == 1) {
                    blendModeCompat = BlendModeCompat.MODULATE;
                } else if (iD2 == 2) {
                    blendModeCompat = BlendModeCompat.SCREEN;
                } else if (iD2 == 3) {
                    blendModeCompat = BlendModeCompat.OVERLAY;
                } else if (iD2 == 4) {
                    blendModeCompat = BlendModeCompat.DARKEN;
                } else if (iD2 != 5) {
                    blendModeCompat = iD2 != 16 ? null : BlendModeCompat.PLUS;
                } else {
                    blendModeCompat = BlendModeCompat.LIGHTEN;
                }
                PaintCompat.setBlendMode(vg2, blendModeCompat);
                AbstractC3014ah0.f(canvas, rectF2, vg2, 31);
                if (i3 != 2) {
                    i(canvas);
                } else {
                    if (this.C == null) {
                        VG vg3 = new VG();
                        this.C = vg3;
                        vg3.setColor(-1);
                    }
                    canvas.drawRect(rectF2.left - 1.0f, rectF2.top - 1.0f, rectF2.right + 1.0f, rectF2.bottom + 1.0f, this.C);
                }
                j(canvas, matrix2, iIntValue);
                if (m()) {
                    VG vg4 = this.e;
                    AbstractC3014ah0.f(canvas, rectF2, vg4, 19);
                    if (Build.VERSION.SDK_INT < 28) {
                        i(canvas);
                    }
                    for (int i6 = 0; i6 < ((List) c4568sM.d).size(); i6++) {
                        C4480rM c4480rM2 = (C4480rM) ((List) c4568sM.d).get(i6);
                        AbstractC5170z9 abstractC5170z10 = (AbstractC5170z9) ((List) c4568sM.b).get(i6);
                        AbstractC5170z9 abstractC5170z11 = (AbstractC5170z9) ((List) c4568sM.c).get(i6);
                        int iD3 = DM.D(c4480rM2.f4927a);
                        VG vg5 = this.f;
                        boolean z2 = c4480rM2.d;
                        if (iD3 != 0) {
                            if (iD3 == 1) {
                                if (i6 == 0) {
                                    vg2.setColor(ViewCompat.MEASURED_STATE_MASK);
                                    vg2.setAlpha(255);
                                    canvas.drawRect(rectF2, vg2);
                                }
                                if (z2) {
                                    AbstractC3014ah0.f(canvas, rectF2, vg5, 31);
                                    canvas.drawRect(rectF2, vg2);
                                    vg5.setAlpha((int) (((Integer) abstractC5170z11.e()).intValue() * 2.55f));
                                    path.set((Path) abstractC5170z10.e());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, vg5);
                                    canvas.restore();
                                } else {
                                    path.set((Path) abstractC5170z10.e());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, vg5);
                                }
                            } else if (iD3 != 2) {
                                if (iD3 == 3 && !((List) c4568sM.b).isEmpty()) {
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= ((List) c4568sM.d).size()) {
                                            vg2.setAlpha(255);
                                            canvas.drawRect(rectF2, vg2);
                                            break;
                                        } else if (((C4480rM) ((List) c4568sM.d).get(i7)).f4927a != 4) {
                                            break;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                            } else if (z2) {
                                AbstractC3014ah0.f(canvas, rectF2, vg4, 31);
                                canvas.drawRect(rectF2, vg2);
                                vg5.setAlpha((int) (((Integer) abstractC5170z11.e()).intValue() * 2.55f));
                                path.set((Path) abstractC5170z10.e());
                                path.transform(matrix2);
                                canvas.drawPath(path, vg5);
                                canvas.restore();
                            } else {
                                AbstractC3014ah0.f(canvas, rectF2, vg4, 31);
                                path.set((Path) abstractC5170z10.e());
                                path.transform(matrix2);
                                vg2.setAlpha((int) (((Integer) abstractC5170z11.e()).intValue() * 2.55f));
                                canvas.drawPath(path, vg2);
                                canvas.restore();
                            }
                        } else if (z2) {
                            AbstractC3014ah0.f(canvas, rectF2, vg2, 31);
                            canvas.drawRect(rectF2, vg2);
                            path.set((Path) abstractC5170z10.e());
                            path.transform(matrix2);
                            vg2.setAlpha((int) (((Integer) abstractC5170z11.e()).intValue() * 2.55f));
                            canvas.drawPath(path, vg5);
                            canvas.restore();
                        } else {
                            path.set((Path) abstractC5170z10.e());
                            path.transform(matrix2);
                            vg2.setAlpha((int) (((Integer) abstractC5170z11.e()).intValue() * 2.55f));
                            canvas.drawPath(path, vg2);
                        }
                    }
                    canvas.restore();
                }
                if (this.s != null) {
                    AbstractC3014ah0.f(canvas, rectF2, this.g, 19);
                    i(canvas);
                    this.s.f(canvas, matrix, iIntValue);
                    canvas.restore();
                }
                canvas.restore();
            }
            if (this.y && (vg = this.z) != null) {
                vg.setStyle(Paint.Style.STROKE);
                this.z.setColor(-251901);
                this.z.setStrokeWidth(4.0f);
                canvas.drawRect(rectF2, this.z);
                this.z.setStyle(Paint.Style.FILL);
                this.z.setColor(1357638635);
                canvas.drawRect(rectF2, this.z);
            }
            n();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public void g(C4215oK c4215oK, Object obj) {
        this.w.c(c4215oK, obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final String getName() {
        return this.p.c;
    }

    public final void h() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.emptyList();
            return;
        }
        this.u = new ArrayList();
        for (B9 b9 = this.t; b9 != null; b9 = b9.t) {
            this.u.add(b9);
        }
    }

    public final void i(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
    }

    public abstract void j(Canvas canvas, Matrix matrix, int i);

    public NN k() {
        return this.p.w;
    }

    public L4 l() {
        return this.p.x;
    }

    public final boolean m() {
        C4568sM c4568sM = this.q;
        return (c4568sM == null || ((List) c4568sM.b).isEmpty()) ? false : true;
    }

    public final void n() {
        C3170cU c3170cU = this.o.f4216a.f3401a;
        String str = this.p.c;
        if (c3170cU.f4224a) {
            HashMap map = c3170cU.c;
            RM rm = (RM) map.get(str);
            if (rm == null) {
                rm = new RM();
                map.put(str, rm);
            }
            int i = rm.f3656a + 1;
            rm.f3656a = i;
            if (i == Integer.MAX_VALUE) {
                rm.f3656a = i / 2;
            }
            if (str.equals("__container")) {
                Iterator<E> it = c3170cU.b.iterator();
                if (it.hasNext()) {
                    AbstractC3950lJ.z(it.next());
                    throw null;
                }
            }
        }
    }

    public final void o(AbstractC5170z9 abstractC5170z9) {
        this.v.remove(abstractC5170z9);
    }

    public void q(boolean z) {
        if (z && this.z == null) {
            this.z = new VG();
        }
        this.y = z;
    }

    public void r(float f) {
        Fd0 fd0 = this.w;
        AbstractC5170z9 abstractC5170z9 = fd0.j;
        if (abstractC5170z9 != null) {
            abstractC5170z9.i(f);
        }
        AbstractC5170z9 abstractC5170z10 = fd0.m;
        if (abstractC5170z10 != null) {
            abstractC5170z10.i(f);
        }
        AbstractC5170z9 abstractC5170z11 = fd0.n;
        if (abstractC5170z11 != null) {
            abstractC5170z11.i(f);
        }
        AbstractC5170z9 abstractC5170z12 = fd0.f;
        if (abstractC5170z12 != null) {
            abstractC5170z12.i(f);
        }
        AbstractC5170z9 abstractC5170z13 = fd0.g;
        if (abstractC5170z13 != null) {
            abstractC5170z13.i(f);
        }
        AbstractC5170z9 abstractC5170z14 = fd0.h;
        if (abstractC5170z14 != null) {
            abstractC5170z14.i(f);
        }
        AbstractC5170z9 abstractC5170z15 = fd0.i;
        if (abstractC5170z15 != null) {
            abstractC5170z15.i(f);
        }
        C3915kv c3915kv = fd0.k;
        if (c3915kv != null) {
            c3915kv.i(f);
        }
        C3915kv c3915kv2 = fd0.l;
        if (c3915kv2 != null) {
            c3915kv2.i(f);
        }
        C4568sM c4568sM = this.q;
        int i = 0;
        if (c4568sM != null) {
            for (int i2 = 0; i2 < ((List) c4568sM.b).size(); i2++) {
                ((AbstractC5170z9) ((List) c4568sM.b).get(i2)).i(f);
            }
        }
        C3915kv c3915kv3 = this.r;
        if (c3915kv3 != null) {
            c3915kv3.i(f);
        }
        B9 b9 = this.s;
        if (b9 != null) {
            b9.r(f);
        }
        while (true) {
            ArrayList arrayList = this.v;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC5170z9) arrayList.get(i)).i(f);
            i++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final void b(List list, List list2) {
    }

    public void p(C4738uG c4738uG, int i, ArrayList arrayList, C4738uG c4738uG2) {
    }
}
