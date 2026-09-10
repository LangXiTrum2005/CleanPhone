package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class PY extends M9 {
    public final Context A;
    public final VY B;
    public final Class C;
    public final C2923Yx D;
    public C2378Dx E;
    public Object F;
    public ArrayList G;
    public PY H;
    public PY I;
    public final boolean J = true;
    public boolean K;
    public boolean L;

    static {
    }

    public PY(com.bumptech.glide.a aVar, VY vy, Class cls, Context context) {
        ZY zy;
        this.B = vy;
        this.C = cls;
        this.A = context;
        Map map = vy.f3875a.c.f;
        C2378Dx c2378Dx = (C2378Dx) map.get(cls);
        if (c2378Dx == null) {
            for (Map.Entry entry : map.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    c2378Dx = (C2378Dx) entry.getValue();
                }
            }
        }
        this.E = c2378Dx == null ? C2923Yx.k : c2378Dx;
        this.D = aVar.c;
        Iterator it = vy.i.iterator();
        while (it.hasNext()) {
            AbstractC3950lJ.z(it.next());
            s();
        }
        synchronized (vy) {
            zy = vy.j;
        }
        a(zy);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.M9
    public final boolean equals(Object obj) {
        if (!(obj instanceof PY)) {
            return false;
        }
        PY py = (PY) obj;
        if (super.equals(py)) {
            return Objects.equals(this.C, py.C) && this.E.equals(py.E) && Objects.equals(this.F, py.F) && Objects.equals(this.G, py.G) && Objects.equals(this.H, py.H) && Objects.equals(this.I, py.I) && this.J == py.J && this.K == py.K;
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.M9
    public final int hashCode() {
        return Tg0.i(Tg0.i(Tg0.h(Tg0.h(Tg0.h(Tg0.h(Tg0.h(Tg0.h(Tg0.h(super.hashCode(), this.C), this.E), this.F), this.G), this.H), this.I), null), this.J), this.K);
    }

    public final PY s() {
        if (this.v) {
            return clone().s();
        }
        k();
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.M9
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final PY a(M9 m9) {
        AbstractC2871Wx.U(m9);
        return (PY) super.a(m9);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0145  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final IY u(int i, int i2, C2378Dx c2378Dx, IV iv, M9 m9, QY qy, Wa0 wa0, Object obj) {
        QY qy2;
        QY c2605Mr;
        IY t60;
        int i3;
        IV iv2;
        int i4;
        int i5;
        if (this.I != null) {
            c2605Mr = new C2605Mr(obj, qy);
            qy2 = c2605Mr;
        } else {
            qy2 = null;
            c2605Mr = qy;
        }
        PY py = this.H;
        if (py == null) {
            Object obj2 = this.F;
            ArrayList arrayList = this.G;
            C2923Yx c2923Yx = this.D;
            t60 = new T60(this.A, c2923Yx, obj, obj2, this.C, m9, i, i2, iv, wa0, arrayList, c2605Mr, c2923Yx.g, c2378Dx.f2999a);
        } else {
            if (this.L) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            C2378Dx c2378Dx2 = py.J ? c2378Dx : py.E;
            if (M9.f(py.f3395a, 8)) {
                iv2 = this.H.d;
            } else {
                int iOrdinal = iv.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    iv2 = IV.f3219a;
                } else if (iOrdinal == 2) {
                    iv2 = IV.b;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.d);
                    }
                    iv2 = IV.c;
                }
            }
            IV iv3 = iv2;
            PY py2 = this.H;
            int i6 = py2.k;
            int i7 = py2.j;
            if (Tg0.j(i, i2)) {
                PY py3 = this.H;
                if (Tg0.j(py3.k, py3.j)) {
                    i4 = i7;
                    i5 = i6;
                } else {
                    i5 = m9.k;
                    i4 = m9.j;
                }
            } else {
                i4 = i7;
                i5 = i6;
            }
            C4236oc0 c4236oc0 = new C4236oc0(obj, c2605Mr);
            Object obj3 = this.F;
            ArrayList arrayList2 = this.G;
            C2923Yx c2923Yx2 = this.D;
            T60 t61 = new T60(this.A, c2923Yx2, obj, obj3, this.C, m9, i, i2, iv, wa0, arrayList2, c4236oc0, c2923Yx2.g, c2378Dx.f2999a);
            this.L = true;
            PY py4 = this.H;
            IY iyU = py4.u(i5, i4, c2378Dx2, iv3, py4, c4236oc0, wa0, obj);
            this.L = false;
            c4236oc0.c = t61;
            c4236oc0.d = iyU;
            t60 = c4236oc0;
        }
        C2605Mr c2605Mr2 = qy2;
        if (c2605Mr2 == 0) {
            return t60;
        }
        PY py5 = this.I;
        int i8 = py5.k;
        int i9 = py5.j;
        if (Tg0.j(i, i2)) {
            PY py6 = this.I;
            if (Tg0.j(py6.k, py6.j)) {
                i3 = i9;
            } else {
                int i10 = m9.k;
                i3 = m9.j;
                i8 = i10;
            }
        } else {
            i3 = i9;
        }
        PY py7 = this.I;
        IY iyU2 = py7.u(i8, i3, py7.E, py7.d, py7, c2605Mr2, wa0, obj);
        c2605Mr2.c = t60;
        c2605Mr2.d = iyU2;
        return c2605Mr2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.M9
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final PY clone() {
        PY py = (PY) super.clone();
        py.E = py.E.clone();
        if (py.G != null) {
            py.G = new ArrayList(py.G);
        }
        PY py2 = py.H;
        if (py2 != null) {
            py.H = py2.clone();
        }
        PY py3 = py.I;
        if (py3 != null) {
            py.I = py3.clone();
        }
        return py;
    }

    public final void w(ImageView imageView) {
        M9 m9G;
        Wa0 c2433Ga;
        Tg0.a();
        AbstractC2871Wx.U(imageView);
        if (!M9.f(this.f3395a, 2048) && this.n && imageView.getScaleType() != null) {
            switch (OY.f3507a[imageView.getScaleType().ordinal()]) {
                case 1:
                    m9G = clone().g(AbstractC2578Lp.c, new C4325pd());
                    break;
                case 2:
                    m9G = clone().g(AbstractC2578Lp.b, new C4413qd());
                    m9G.y = true;
                    break;
                case 3:
                case 4:
                case 5:
                    m9G = clone().g(AbstractC2578Lp.f3375a, new C2660Ou());
                    m9G.y = true;
                    break;
                case 6:
                    m9G = clone().g(AbstractC2578Lp.b, new C4413qd());
                    m9G.y = true;
                    break;
                default:
                    m9G = this;
                    break;
            }
        } else {
            m9G = this;
        }
        this.D.c.getClass();
        Class cls = this.C;
        if (Bitmap.class.equals(cls)) {
            c2433Ga = new C2433Ga(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            c2433Ga = new C2433Ga(imageView, 1);
        }
        x(c2433Ga, m9G);
    }

    public final void x(Wa0 wa0, M9 m9) {
        AbstractC2871Wx.U(wa0);
        if (!this.K) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Object obj = new Object();
        IY iyU = u(m9.k, m9.j, this.E, m9.d, m9, null, wa0, obj);
        IY iyE = wa0.e();
        if (iyU.d(iyE) && (m9.i || !iyE.h())) {
            AbstractC2871Wx.V(iyE, "Argument must not be null");
            if (iyE.isRunning()) {
                return;
            }
            iyE.begin();
            return;
        }
        this.B.j(wa0);
        wa0.b(iyU);
        VY vy = this.B;
        synchronized (vy) {
            vy.f.f3976a.add(wa0);
            C4288p70 c4288p70 = vy.d;
            ((Set) c4288p70.b).add(iyU);
            if (c4288p70.c) {
                iyU.clear();
                ((Set) c4288p70.d).add(iyU);
            } else {
                iyU.begin();
            }
        }
    }

    public final PY y(Integer num) {
        PackageInfo packageInfo;
        PY pyZ = z(num);
        Context context = this.A;
        PY py = (PY) pyZ.o(context.getTheme());
        ConcurrentHashMap concurrentHashMap = M5.f3392a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = M5.f3392a;
        InterfaceC4650tG interfaceC4650tG = (InterfaceC4650tG) concurrentHashMap2.get(packageName);
        if (interfaceC4650tG == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                context.getPackageName();
                packageInfo = null;
            }
            C3697iS c3697iS = new C3697iS(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            interfaceC4650tG = (InterfaceC4650tG) concurrentHashMap2.putIfAbsent(packageName, c3697iS);
            if (interfaceC4650tG == null) {
                interfaceC4650tG = c3697iS;
            }
        }
        return (PY) py.m(new A4(context.getResources().getConfiguration().uiMode & 48, interfaceC4650tG));
    }

    public final PY z(Object obj) {
        if (this.v) {
            return clone().z(obj);
        }
        this.F = obj;
        this.K = true;
        k();
        return this;
    }
}
