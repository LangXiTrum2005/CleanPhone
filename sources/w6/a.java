package w6;

import a7.p;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import e6.i;
import e6.m;
import g6.l;
import n6.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f52930a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f52937h;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Resources.Theme f52941m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f52942n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f52944p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f52931b = l.f41646d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.f f52932c = com.bumptech.glide.f.f10477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f52933d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f52934e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52935f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e6.f f52936g = z6.c.f54652b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f52938i = new i();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a7.d f52939j = new a7.d(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Class f52940k = Object.class;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f52943o = true;

    public static boolean f(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public a a(a aVar) {
        if (this.f52942n) {
            return clone().a(aVar);
        }
        int i10 = aVar.f52930a;
        if (f(aVar.f52930a, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)) {
            this.f52944p = aVar.f52944p;
        }
        if (f(aVar.f52930a, 4)) {
            this.f52931b = aVar.f52931b;
        }
        if (f(aVar.f52930a, 8)) {
            this.f52932c = aVar.f52932c;
        }
        if (f(aVar.f52930a, 16)) {
            this.f52930a &= -33;
        }
        if (f(aVar.f52930a, 32)) {
            this.f52930a &= -17;
        }
        if (f(aVar.f52930a, 64)) {
            this.f52930a &= -129;
        }
        if (f(aVar.f52930a, 128)) {
            this.f52930a &= -65;
        }
        if (f(aVar.f52930a, NotificationCompat.FLAG_LOCAL_ONLY)) {
            this.f52933d = aVar.f52933d;
        }
        if (f(aVar.f52930a, 512)) {
            this.f52935f = aVar.f52935f;
            this.f52934e = aVar.f52934e;
        }
        if (f(aVar.f52930a, 1024)) {
            this.f52936g = aVar.f52936g;
        }
        if (f(aVar.f52930a, 4096)) {
            this.f52940k = aVar.f52940k;
        }
        if (f(aVar.f52930a, Segment.SIZE)) {
            this.f52930a &= -16385;
        }
        if (f(aVar.f52930a, Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.f52930a &= -8193;
        }
        if (f(aVar.f52930a, 32768)) {
            this.f52941m = aVar.f52941m;
        }
        if (f(aVar.f52930a, 131072)) {
            this.f52937h = aVar.f52937h;
        }
        if (f(aVar.f52930a, com.ironsource.mediationsdk.metadata.a.f29616n)) {
            this.f52939j.putAll(aVar.f52939j);
            this.f52943o = aVar.f52943o;
        }
        this.f52930a |= aVar.f52930a;
        this.f52938i.f39148b.g(aVar.f52938i.f39148b);
        j();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            i iVar = new i();
            aVar.f52938i = iVar;
            iVar.f39148b.g(this.f52938i.f39148b);
            a7.d dVar = new a7.d(0);
            aVar.f52939j = dVar;
            dVar.putAll(this.f52939j);
            aVar.l = false;
            aVar.f52942n = false;
            return aVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final a c(Class cls) {
        if (this.f52942n) {
            return clone().c(cls);
        }
        this.f52940k = cls;
        this.f52930a |= 4096;
        j();
        return this;
    }

    public final a d(l lVar) {
        if (this.f52942n) {
            return clone().d(lVar);
        }
        this.f52931b = lVar;
        this.f52930a |= 4;
        j();
        return this;
    }

    public final boolean e(a aVar) {
        aVar.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = p.f3444a;
        return this.f52933d == aVar.f52933d && this.f52934e == aVar.f52934e && this.f52935f == aVar.f52935f && this.f52937h == aVar.f52937h && this.f52931b.equals(aVar.f52931b) && this.f52932c == aVar.f52932c && this.f52938i.equals(aVar.f52938i) && this.f52939j.equals(aVar.f52939j) && this.f52940k.equals(aVar.f52940k) && this.f52936g.equals(aVar.f52936g) && p.b(this.f52941m, aVar.f52941m);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return e((a) obj);
        }
        return false;
    }

    public final a g(int i10, int i11) {
        if (this.f52942n) {
            return clone().g(i10, i11);
        }
        this.f52935f = i10;
        this.f52934e = i11;
        this.f52930a |= 512;
        j();
        return this;
    }

    public final a h(com.bumptech.glide.f fVar) {
        if (this.f52942n) {
            return clone().h(fVar);
        }
        this.f52932c = fVar;
        this.f52930a |= 8;
        j();
        return this;
    }

    public int hashCode() {
        char[] cArr = p.f3444a;
        return p.h(p.h(p.h(p.h(p.h(p.h(p.h(p.g(0, p.g(0, p.g(1, p.g(this.f52937h ? 1 : 0, p.g(this.f52935f, p.g(this.f52934e, p.g(this.f52933d ? 1 : 0, p.h(p.g(0, p.h(p.g(0, p.h(p.g(0, p.g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f52931b), this.f52932c), this.f52938i), this.f52939j), this.f52940k), this.f52936g), this.f52941m);
    }

    public final a i(e6.h hVar) {
        if (this.f52942n) {
            return clone().i(hVar);
        }
        this.f52938i.f39148b.remove(hVar);
        j();
        return this;
    }

    public final void j() {
        if (this.l) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a k(e6.h hVar, Object obj) {
        if (this.f52942n) {
            return clone().k(hVar, obj);
        }
        a7.h.b(hVar);
        a7.h.b(obj);
        this.f52938i.f39148b.put(hVar, obj);
        j();
        return this;
    }

    public final a l(e6.f fVar) {
        if (this.f52942n) {
            return clone().l(fVar);
        }
        this.f52936g = fVar;
        this.f52930a |= 1024;
        j();
        return this;
    }

    public final a m() {
        if (this.f52942n) {
            return clone().m();
        }
        this.f52933d = false;
        this.f52930a |= NotificationCompat.FLAG_LOCAL_ONLY;
        j();
        return this;
    }

    public final a n(Resources.Theme theme) {
        if (this.f52942n) {
            return clone().n(theme);
        }
        this.f52941m = theme;
        if (theme != null) {
            this.f52930a |= 32768;
            return k(p6.c.f48259b, theme);
        }
        this.f52930a &= -32769;
        return i(p6.c.f48259b);
    }

    public final a o(m mVar) {
        if (this.f52942n) {
            return clone().o(mVar);
        }
        q qVar = new q(mVar);
        p(Bitmap.class, mVar);
        p(Drawable.class, qVar);
        p(BitmapDrawable.class, qVar);
        p(r6.c.class, new r6.d(mVar));
        j();
        return this;
    }

    public final a p(Class cls, m mVar) {
        if (this.f52942n) {
            return clone().p(cls, mVar);
        }
        a7.h.b(mVar);
        this.f52939j.put(cls, mVar);
        int i10 = this.f52930a;
        this.f52943o = false;
        this.f52930a = i10 | 198656;
        this.f52937h = true;
        j();
        return this;
    }

    public final a q() {
        if (this.f52942n) {
            return clone().q();
        }
        this.f52944p = true;
        this.f52930a |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        j();
        return this;
    }
}
