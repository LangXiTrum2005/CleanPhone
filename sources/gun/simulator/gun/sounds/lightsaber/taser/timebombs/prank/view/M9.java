package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.collection.SimpleArrayMap;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class M9 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3395a;
    public Drawable e;
    public int f;
    public Drawable g;
    public int h;
    public boolean m;
    public Drawable o;
    public int p;
    public boolean t;
    public Resources.Theme u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean z;
    public float b = 1.0f;
    public AbstractC2940Zo c = AbstractC2940Zo.d;
    public IV d = IV.c;
    public boolean i = true;
    public int j = -1;
    public int k = -1;
    public InterfaceC4650tG l = C3032ar.b;
    public boolean n = true;
    public YS q = new YS();
    public CachedHashCodeArrayMap r = new CachedHashCodeArrayMap();
    public Class s = Object.class;
    public boolean y = true;

    public static boolean f(int i, int i2) {
        return (i & i2) != 0;
    }

    public M9 a(M9 m9) {
        if (this.v) {
            return clone().a(m9);
        }
        if (f(m9.f3395a, 2)) {
            this.b = m9.b;
        }
        if (f(m9.f3395a, 262144)) {
            this.w = m9.w;
        }
        if (f(m9.f3395a, 1048576)) {
            this.z = m9.z;
        }
        if (f(m9.f3395a, 4)) {
            this.c = m9.c;
        }
        if (f(m9.f3395a, 8)) {
            this.d = m9.d;
        }
        if (f(m9.f3395a, 16)) {
            this.e = m9.e;
            this.f = 0;
            this.f3395a &= -33;
        }
        if (f(m9.f3395a, 32)) {
            this.f = m9.f;
            this.e = null;
            this.f3395a &= -17;
        }
        if (f(m9.f3395a, 64)) {
            this.g = m9.g;
            this.h = 0;
            this.f3395a &= -129;
        }
        if (f(m9.f3395a, 128)) {
            this.h = m9.h;
            this.g = null;
            this.f3395a &= -65;
        }
        if (f(m9.f3395a, 256)) {
            this.i = m9.i;
        }
        if (f(m9.f3395a, 512)) {
            this.k = m9.k;
            this.j = m9.j;
        }
        if (f(m9.f3395a, 1024)) {
            this.l = m9.l;
        }
        if (f(m9.f3395a, 4096)) {
            this.s = m9.s;
        }
        if (f(m9.f3395a, 8192)) {
            this.o = m9.o;
            this.p = 0;
            this.f3395a &= -16385;
        }
        if (f(m9.f3395a, 16384)) {
            this.p = m9.p;
            this.o = null;
            this.f3395a &= -8193;
        }
        if (f(m9.f3395a, 32768)) {
            this.u = m9.u;
        }
        if (f(m9.f3395a, 65536)) {
            this.n = m9.n;
        }
        if (f(m9.f3395a, 131072)) {
            this.m = m9.m;
        }
        if (f(m9.f3395a, 2048)) {
            this.r.putAll((Map) m9.r);
            this.y = m9.y;
        }
        if (f(m9.f3395a, 524288)) {
            this.x = m9.x;
        }
        if (!this.n) {
            this.r.clear();
            int i = this.f3395a;
            this.m = false;
            this.f3395a = i & (-133121);
            this.y = true;
        }
        this.f3395a |= m9.f3395a;
        this.q.b.putAll((SimpleArrayMap) m9.q.b);
        k();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public M9 clone() {
        try {
            M9 m9 = (M9) super.clone();
            YS ys = new YS();
            m9.q = ys;
            ys.b.putAll((SimpleArrayMap) this.q.b);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap();
            m9.r = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll((Map) this.r);
            m9.t = false;
            m9.v = false;
            return m9;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final M9 c(Class cls) {
        if (this.v) {
            return clone().c(cls);
        }
        this.s = cls;
        this.f3395a |= 4096;
        k();
        return this;
    }

    public final M9 d(C2914Yo c2914Yo) {
        if (this.v) {
            return clone().d(c2914Yo);
        }
        this.c = c2914Yo;
        this.f3395a |= 4;
        k();
        return this;
    }

    public final boolean e(M9 m9) {
        return Float.compare(m9.b, this.b) == 0 && this.f == m9.f && Tg0.b(this.e, m9.e) && this.h == m9.h && Tg0.b(this.g, m9.g) && this.p == m9.p && Tg0.b(this.o, m9.o) && this.i == m9.i && this.j == m9.j && this.k == m9.k && this.m == m9.m && this.n == m9.n && this.w == m9.w && this.x == m9.x && this.c.equals(m9.c) && this.d == m9.d && this.q.equals(m9.q) && this.r.equals(m9.r) && this.s.equals(m9.s) && Tg0.b(this.l, m9.l) && Tg0.b(this.u, m9.u);
    }

    public boolean equals(Object obj) {
        if (obj instanceof M9) {
            return e((M9) obj);
        }
        return false;
    }

    public final M9 g(C2552Kp c2552Kp, AbstractC2511Ja abstractC2511Ja) {
        if (this.v) {
            return clone().g(c2552Kp, abstractC2511Ja);
        }
        l(AbstractC2578Lp.f, c2552Kp);
        return p(abstractC2511Ja, false);
    }

    public final M9 h(int i, int i2) {
        if (this.v) {
            return clone().h(i, i2);
        }
        this.k = i;
        this.j = i2;
        this.f3395a |= 512;
        k();
        return this;
    }

    public int hashCode() {
        float f = this.b;
        char[] cArr = Tg0.f3783a;
        return Tg0.h(Tg0.h(Tg0.h(Tg0.h(Tg0.h(Tg0.h(Tg0.h(Tg0.i(Tg0.i(Tg0.i(Tg0.i(Tg0.g(this.k, Tg0.g(this.j, Tg0.i(Tg0.h(Tg0.g(this.p, Tg0.h(Tg0.g(this.h, Tg0.h(Tg0.g(this.f, Tg0.g(Float.floatToIntBits(f), 17)), this.e)), this.g)), this.o), this.i))), this.m), this.n), this.w), this.x), this.c), this.d), this.q), this.r), this.s), this.l), this.u);
    }

    public final M9 i() {
        IV iv = IV.d;
        if (this.v) {
            return clone().i();
        }
        this.d = iv;
        this.f3395a |= 8;
        k();
        return this;
    }

    public final M9 j(VS vs) {
        if (this.v) {
            return clone().j(vs);
        }
        this.q.b.remove(vs);
        k();
        return this;
    }

    public final void k() {
        if (this.t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final M9 l(VS vs, Object obj) {
        if (this.v) {
            return clone().l(vs, obj);
        }
        AbstractC2871Wx.U(vs);
        AbstractC2871Wx.U(obj);
        this.q.b.put(vs, obj);
        k();
        return this;
    }

    public final M9 m(InterfaceC4650tG interfaceC4650tG) {
        if (this.v) {
            return clone().m(interfaceC4650tG);
        }
        this.l = interfaceC4650tG;
        this.f3395a |= 1024;
        k();
        return this;
    }

    public final M9 n(boolean z) {
        if (this.v) {
            return clone().n(true);
        }
        this.i = !z;
        this.f3395a |= 256;
        k();
        return this;
    }

    public final M9 o(Resources.Theme theme) {
        if (this.v) {
            return clone().o(theme);
        }
        this.u = theme;
        if (theme != null) {
            this.f3395a |= 32768;
            return l(C4142nZ.b, theme);
        }
        this.f3395a &= -32769;
        return j(C4142nZ.b);
    }

    public final M9 p(Gd0 gd0, boolean z) {
        if (this.v) {
            return clone().p(gd0, z);
        }
        C2811Up c2811Up = new C2811Up(gd0, z);
        q(Bitmap.class, gd0, z);
        q(Drawable.class, c2811Up, z);
        q(BitmapDrawable.class, c2811Up, z);
        q(GifDrawable.class, new C2560Kx(gd0), z);
        k();
        return this;
    }

    public final M9 q(Class cls, Gd0 gd0, boolean z) {
        if (this.v) {
            return clone().q(cls, gd0, z);
        }
        AbstractC2871Wx.U(gd0);
        this.r.put(cls, gd0);
        int i = this.f3395a;
        this.n = true;
        this.f3395a = 67584 | i;
        this.y = false;
        if (z) {
            this.f3395a = i | 198656;
            this.m = true;
        }
        k();
        return this;
    }

    public final M9 r() {
        if (this.v) {
            return clone().r();
        }
        this.z = true;
        this.f3395a |= 1048576;
        k();
        return this;
    }
}
