package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.os.Handler;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ro0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4523ro0 implements Rn0, On0, Pn0 {
    public static C4523ro0 g;
    public static C4523ro0 h;
    public static C4523ro0 i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4947a;
    public float b = 0.0f;
    public final Object c;
    public final Object d;
    public C3470fo0 e;
    public Object f;

    public /* synthetic */ C4523ro0(int i2, C2443Gk c2443Gk, C2498In c2498In) {
        this.f4947a = i2;
        this.c = c2443Gk;
        this.d = c2498In;
    }

    public static C4523ro0 d() {
        if (g == null) {
            int i2 = 6;
            int i3 = 0;
            g = new C4523ro0(i3, new C2443Gk(i2), new C2498In(i2));
        }
        return g;
    }

    public static C4523ro0 e() {
        if (h == null) {
            int i2 = 8;
            int i3 = 1;
            h = new C4523ro0(i3, new C2443Gk(i2), new C2498In(i2));
        }
        return h;
    }

    public static C4523ro0 f() {
        if (i == null) {
            int i2 = 10;
            int i3 = 2;
            i = new C4523ro0(i3, new C2443Gk(i2), new C2498In(i2));
        }
        return i;
    }

    public final void a(float f) {
        switch (this.f4947a) {
            case 0:
                this.b = f;
                if (((Cn0) this.f) == null) {
                    this.f = Cn0.c;
                }
                Iterator it = Collections.unmodifiableCollection(((Cn0) this.f).b).iterator();
                while (it.hasNext()) {
                    W2 w2 = ((C3203cn0) it.next()).e;
                    CD.b.a(w2.f(), "setDeviceVolume", Float.valueOf(f), w2.f3906a);
                }
                break;
            case 1:
                this.b = f;
                if (((Fn0) this.f) == null) {
                    this.f = Fn0.c;
                }
                Iterator it2 = Collections.unmodifiableCollection(((Fn0) this.f).b).iterator();
                while (it2.hasNext()) {
                    ((C3026an0) it2.next()).e.a(f);
                }
                break;
            default:
                this.b = f;
                if (((Hn0) this.f) == null) {
                    this.f = Hn0.c;
                }
                Iterator it3 = Collections.unmodifiableCollection(((Hn0) this.f).b).iterator();
                while (it3.hasNext()) {
                    ((Jm0) it3.next()).e.a(f);
                }
                break;
        }
    }

    public final void b(Context context) {
        int i2 = this.f4947a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i2) {
            case 0:
                ((C2498In) obj2).getClass();
                C2443Gk c2443Gk = new C2443Gk(5);
                Handler handler = new Handler();
                ((C2443Gk) obj).getClass();
                this.e = new C3470fo0(handler, context, c2443Gk, this);
                break;
            case 1:
                ((C2498In) obj2).getClass();
                C2443Gk c2443Gk2 = new C2443Gk(7);
                Handler handler2 = new Handler();
                ((C2443Gk) obj).getClass();
                this.e = new C3470fo0(handler2, context, c2443Gk2, this, 0);
                break;
            default:
                ((C2498In) obj2).getClass();
                C2443Gk c2443Gk3 = new C2443Gk(9);
                Handler handler3 = new Handler();
                ((C2443Gk) obj).getClass();
                this.e = new C3470fo0(handler3, context, c2443Gk3, this, (Object) null);
                break;
        }
    }

    public final float c() {
        switch (this.f4947a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b;
    }

    public final void g() {
        switch (this.f4947a) {
            case 0:
                C4346pn0 c4346pn0 = C4346pn0.e;
                c4346pn0.d = this;
                c4346pn0.g();
                C3097be0.g.getClass();
                C3097be0.b();
                this.e.d();
                break;
            case 1:
                C4609sn0 c4609sn0 = C4609sn0.e;
                c4609sn0.d = this;
                c4609sn0.g();
                Zd0.g.getClass();
                Zd0.b();
                this.e.d();
                break;
            default:
                C4873vn0 c4873vn0 = C4873vn0.e;
                c4873vn0.d = this;
                c4873vn0.g();
                C3008ae0.g.getClass();
                C3008ae0.b();
                this.e.d();
                break;
        }
    }

    public final void h() {
        switch (this.f4947a) {
            case 0:
                C3097be0 c3097be0 = C3097be0.g;
                c3097be0.getClass();
                Handler handler = C3097be0.i;
                if (handler != null) {
                    handler.removeCallbacks(C3097be0.k);
                    C3097be0.i = null;
                }
                c3097be0.f4179a.clear();
                C3097be0.h.post(new TY(c3097be0, 9));
                C4346pn0.e.h();
                this.e.e();
                break;
            case 1:
                Zd0 zd0 = Zd0.g;
                zd0.getClass();
                Handler handler2 = Zd0.i;
                if (handler2 != null) {
                    handler2.removeCallbacks(Zd0.k);
                    Zd0.i = null;
                }
                zd0.f4082a.clear();
                Zd0.h.post(new TY(zd0, 10));
                C4609sn0.e.h();
                this.e.e();
                break;
            default:
                C3008ae0 c3008ae0 = C3008ae0.g;
                c3008ae0.getClass();
                Handler handler3 = C3008ae0.i;
                if (handler3 != null) {
                    handler3.removeCallbacks(C3008ae0.k);
                    C3008ae0.i = null;
                }
                c3008ae0.f4132a.clear();
                C3008ae0.h.post(new TY(c3008ae0, 11));
                C4873vn0.e.h();
                this.e.e();
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Rn0
    public final void a(boolean z) {
        switch (this.f4947a) {
            case 0:
                if (z) {
                    C3097be0.g.getClass();
                    C3097be0.b();
                } else {
                    C3097be0.g.getClass();
                    Handler handler = C3097be0.i;
                    if (handler != null) {
                        handler.removeCallbacks(C3097be0.k);
                        C3097be0.i = null;
                    }
                }
                break;
            case 1:
                if (z) {
                    Zd0.g.getClass();
                    Zd0.b();
                } else {
                    Zd0.g.getClass();
                    Handler handler2 = Zd0.i;
                    if (handler2 != null) {
                        handler2.removeCallbacks(Zd0.k);
                        Zd0.i = null;
                    }
                }
                break;
            default:
                if (z) {
                    C3008ae0.g.getClass();
                    C3008ae0.b();
                } else {
                    C3008ae0.g.getClass();
                    Handler handler3 = C3008ae0.i;
                    if (handler3 != null) {
                        handler3.removeCallbacks(C3008ae0.k);
                        C3008ae0.i = null;
                    }
                }
                break;
        }
    }
}
