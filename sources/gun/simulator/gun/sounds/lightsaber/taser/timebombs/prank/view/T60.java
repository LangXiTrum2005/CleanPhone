package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class T60 implements IY, InterfaceC4903w70, InterfaceC3878kZ {
    public static final boolean A = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4508rh f3755a;
    public final Object b;
    public final QY c;
    public final Context d;
    public final C2923Yx e;
    public final Object f;
    public final Class g;
    public final M9 h;
    public final int i;
    public final int j;
    public final IV k;
    public final Wa0 l;
    public final List m;
    public final Qm0 n;
    public final Executor o;
    public InterfaceC3616hZ p;
    public C2444Gl q;
    public volatile C4439qr r;
    public Drawable s;
    public Drawable t;
    public Drawable u;
    public int v;
    public int w;
    public boolean x;
    public final RuntimeException y;
    public int z;

    public T60(Context context, C2923Yx c2923Yx, Object obj, Object obj2, Class cls, M9 m9, int i, int i2, IV iv, Wa0 wa0, ArrayList arrayList, QY qy, C4439qr c4439qr, Qm0 qm0) {
        ExecutorC4527rs executorC4527rs = FW.c;
        if (A) {
            String.valueOf(hashCode());
        }
        this.f3755a = new C4508rh();
        this.b = obj;
        this.d = context;
        this.e = c2923Yx;
        this.f = obj2;
        this.g = cls;
        this.h = m9;
        this.i = i;
        this.j = i2;
        this.k = iv;
        this.l = wa0;
        this.m = arrayList;
        this.c = qy;
        this.r = c4439qr;
        this.n = qm0;
        this.o = executorC4527rs;
        this.z = 1;
        if (this.y == null && c2923Yx.h.f4439a.containsKey(AbstractC2871Wx.class)) {
            this.y = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            z = this.z == 4;
        }
        return z;
    }

    public final void b() {
        if (this.x) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f3755a.a();
        this.l.g(this);
        C2444Gl c2444Gl = this.q;
        if (c2444Gl != null) {
            synchronized (((C4439qr) c2444Gl.c)) {
                ((C4790ur) c2444Gl.f3136a).j((InterfaceC3878kZ) c2444Gl.b);
            }
            this.q = null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final void begin() {
        QY qy;
        int i;
        synchronized (this.b) {
            try {
                if (this.x) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f3755a.a();
                int i2 = AbstractC4653tJ.f5029a;
                SystemClock.elapsedRealtimeNanos();
                if (this.f == null) {
                    if (Tg0.j(this.i, this.j)) {
                        this.v = this.i;
                        this.w = this.j;
                    }
                    if (this.u == null) {
                        M9 m9 = this.h;
                        Drawable drawable = m9.o;
                        this.u = drawable;
                        if (drawable == null && (i = m9.p) > 0) {
                            Resources.Theme theme = m9.u;
                            Context context = this.d;
                            if (theme == null) {
                                theme = context.getTheme();
                            }
                            this.u = BF.k(context, context, i, theme);
                        }
                    }
                    e(new C3039ay("Received null model"), this.u == null ? 5 : 3);
                    return;
                }
                int i3 = this.z;
                if (i3 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i3 == 4) {
                    f(this.p, EnumC4516rl.e, false);
                    return;
                }
                List list = this.m;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AbstractC3950lJ.z(it.next());
                    }
                }
                this.z = 3;
                if (Tg0.j(this.i, this.j)) {
                    j(this.i, this.j);
                } else {
                    this.l.a(this);
                }
                int i4 = this.z;
                if ((i4 == 2 || i4 == 3) && ((qy = this.c) == null || qy.i(this))) {
                    this.l.d(c());
                }
                if (A) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Drawable c() {
        int i;
        if (this.t == null) {
            M9 m9 = this.h;
            Drawable drawable = m9.g;
            this.t = drawable;
            if (drawable == null && (i = m9.h) > 0) {
                Resources.Theme theme = m9.u;
                Context context = this.d;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.t = BF.k(context, context, i, theme);
            }
        }
        return this.t;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final void clear() {
        synchronized (this.b) {
            try {
                if (this.x) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f3755a.a();
                if (this.z == 6) {
                    return;
                }
                b();
                InterfaceC3616hZ interfaceC3616hZ = this.p;
                if (interfaceC3616hZ != null) {
                    this.p = null;
                } else {
                    interfaceC3616hZ = null;
                }
                QY qy = this.c;
                if (qy == null || qy.e(this)) {
                    this.l.f(c());
                }
                this.z = 6;
                if (interfaceC3616hZ != null) {
                    this.r.getClass();
                    C4439qr.f(interfaceC3616hZ);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final boolean d(IY iy) {
        int i;
        int i2;
        Object obj;
        Class cls;
        M9 m9;
        IV iv;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        M9 m10;
        IV iv2;
        int size2;
        if (!(iy instanceof T60)) {
            return false;
        }
        synchronized (this.b) {
            try {
                i = this.i;
                i2 = this.j;
                obj = this.f;
                cls = this.g;
                m9 = this.h;
                iv = this.k;
                List list = this.m;
                size = list != null ? list.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        T60 t60 = (T60) iy;
        synchronized (t60.b) {
            try {
                i3 = t60.i;
                i4 = t60.j;
                obj2 = t60.f;
                cls2 = t60.g;
                m10 = t60.h;
                iv2 = t60.k;
                List list2 = t60.m;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = Tg0.f3783a;
            if (obj != null ? obj.equals(obj2) : obj2 == null) {
                if (cls.equals(cls2) && (m9 != null ? m9.e(m10) : m10 == null) && iv == iv2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void e(C3039ay c3039ay, int i) {
        int i2;
        int i3;
        this.f3755a.a();
        synchronized (this.b) {
            try {
                c3039ay.getClass();
                int i4 = this.e.i;
                if (i4 <= i) {
                    Objects.toString(this.f);
                    if (i4 <= 4) {
                        ArrayList arrayList = new ArrayList();
                        C3039ay.a(c3039ay, arrayList);
                        int size = arrayList.size();
                        int i5 = 0;
                        while (i5 < size) {
                            int i6 = i5 + 1;
                            i5 = i6;
                        }
                    }
                }
                Drawable drawableC = null;
                this.q = null;
                this.z = 5;
                QY qy = this.c;
                if (qy != null) {
                    qy.b(this);
                }
                this.x = true;
                try {
                    List list = this.m;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            AbstractC3950lJ.z(it.next());
                            QY qy2 = this.c;
                            if (qy2 == null) {
                                throw null;
                            }
                            qy2.getRoot().a();
                            throw null;
                        }
                    }
                    QY qy3 = this.c;
                    if (qy3 == null || qy3.i(this)) {
                        if (this.f == null) {
                            if (this.u == null) {
                                M9 m9 = this.h;
                                Drawable drawable = m9.o;
                                this.u = drawable;
                                if (drawable == null && (i3 = m9.p) > 0) {
                                    Resources.Theme theme = m9.u;
                                    Context context = this.d;
                                    if (theme == null) {
                                        theme = context.getTheme();
                                    }
                                    this.u = BF.k(context, context, i3, theme);
                                }
                            }
                            drawableC = this.u;
                        }
                        if (drawableC == null) {
                            if (this.s == null) {
                                M9 m10 = this.h;
                                Drawable drawable2 = m10.e;
                                this.s = drawable2;
                                if (drawable2 == null && (i2 = m10.f) > 0) {
                                    Resources.Theme theme2 = m10.u;
                                    Context context2 = this.d;
                                    if (theme2 == null) {
                                        theme2 = context2.getTheme();
                                    }
                                    this.s = BF.k(context2, context2, i2, theme2);
                                }
                            }
                            drawableC = this.s;
                        }
                        if (drawableC == null) {
                            drawableC = c();
                        }
                        this.l.h(drawableC);
                    }
                    this.x = false;
                } catch (Throwable th) {
                    this.x = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(InterfaceC3616hZ interfaceC3616hZ, EnumC4516rl enumC4516rl, boolean z) {
        this.f3755a.a();
        InterfaceC3616hZ interfaceC3616hZ2 = null;
        try {
            synchronized (this.b) {
                try {
                    this.q = null;
                    if (interfaceC3616hZ == null) {
                        e(new C3039ay("Expected to receive a Resource<R> with an object of " + this.g + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = interfaceC3616hZ.get();
                    try {
                        if (obj != null && this.g.isAssignableFrom(obj.getClass())) {
                            QY qy = this.c;
                            if (qy == null || qy.c(this)) {
                                i(interfaceC3616hZ, obj, enumC4516rl);
                                return;
                            }
                            this.p = null;
                            this.z = 4;
                            this.r.getClass();
                            C4439qr.f(interfaceC3616hZ);
                            return;
                        }
                        this.p = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.g);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(interfaceC3616hZ);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        e(new C3039ay(sb.toString()), 5);
                        this.r.getClass();
                        C4439qr.f(interfaceC3616hZ);
                    } catch (Throwable th) {
                        interfaceC3616hZ2 = interfaceC3616hZ;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC3616hZ2 != null) {
                this.r.getClass();
                C4439qr.f(interfaceC3616hZ2);
            }
            throw th3;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final boolean g() {
        boolean z;
        synchronized (this.b) {
            z = this.z == 6;
        }
        return z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final boolean h() {
        boolean z;
        synchronized (this.b) {
            z = this.z == 4;
        }
        return z;
    }

    public final void i(InterfaceC3616hZ interfaceC3616hZ, Object obj, EnumC4516rl enumC4516rl) {
        QY qy = this.c;
        if (qy != null) {
            qy.getRoot().a();
        }
        this.z = 4;
        this.p = interfaceC3616hZ;
        if (this.e.i <= 3) {
            Objects.toString(enumC4516rl);
            Objects.toString(this.f);
            int i = AbstractC4653tJ.f5029a;
            SystemClock.elapsedRealtimeNanos();
        }
        if (qy != null) {
            qy.f(this);
        }
        this.x = true;
        try {
            List list = this.m;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    AbstractC3950lJ.z(it.next());
                    throw null;
                }
            }
            this.n.getClass();
            this.l.c(obj);
            this.x = false;
        } catch (Throwable th) {
            this.x = false;
            throw th;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            int i = this.z;
            z = i == 2 || i == 3;
        }
        return z;
    }

    public final void j(int i, int i2) {
        Object obj;
        int iRound = i;
        this.f3755a.a();
        Object obj2 = this.b;
        synchronized (obj2) {
            try {
                try {
                    boolean z = A;
                    if (z) {
                        int i3 = AbstractC4653tJ.f5029a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (this.z == 3) {
                        this.z = 2;
                        float f = this.h.b;
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * f);
                        }
                        this.v = iRound;
                        this.w = i2 == Integer.MIN_VALUE ? i2 : Math.round(f * i2);
                        if (z) {
                            int i4 = AbstractC4653tJ.f5029a;
                            SystemClock.elapsedRealtimeNanos();
                        }
                        C4439qr c4439qr = this.r;
                        C2923Yx c2923Yx = this.e;
                        Object obj3 = this.f;
                        M9 m9 = this.h;
                        try {
                            obj = obj2;
                            try {
                                this.q = c4439qr.a(c2923Yx, obj3, m9.l, this.v, this.w, m9.s, this.g, this.k, m9.c, m9.r, m9.m, m9.y, m9.q, m9.i, m9.w, m9.z, m9.x, this, this.o);
                                if (this.z != 2) {
                                    this.q = null;
                                }
                                if (z) {
                                    int i5 = AbstractC4653tJ.f5029a;
                                    SystemClock.elapsedRealtimeNanos();
                                }
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final void pause() {
        synchronized (this.b) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.b) {
            obj = this.f;
            cls = this.g;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
