package sg.bigo.ads.api.b;

import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.core.c;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.api.core.q;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T extends Ad, U extends sg.bigo.ads.api.core.c> implements Ad, d<T> {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    protected final sg.bigo.ads.api.b f47000R;
    protected sg.bigo.ads.common.v.a S;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    protected a f47001U;
    public int O = 0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f46998P = 0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f46999Q = 0;
    protected int T = sg.bigo.ads.common.v.a.f47550a;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    protected int f47002V = 0;
    protected final p W = new p();

    /* JADX INFO: renamed from: sg.bigo.ads.api.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0830a {
        void a(sg.bigo.ads.api.core.d dVar);

        void b();
    }

    public a(sg.bigo.ads.api.b bVar) {
        this.f47000R = bVar;
    }

    public final a I() {
        return this.f47001U;
    }

    public final q J() {
        sg.bigo.ads.api.core.c cVarF = f();
        if (cVarF != null) {
            return cVarF.Y();
        }
        return null;
    }

    public final int K() {
        return this.T;
    }

    public final sg.bigo.ads.api.b L() {
        return this.f47000R;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Ad ad) {
        if (ad == null) {
            return 1;
        }
        return g() >= (ad instanceof a ? ((a) ad).g() : 0.0d) ? 1 : -1;
    }

    public abstract void a(int i2, int i3, String str);

    public abstract void b();

    public void b(int i2) {
        this.f46999Q = i2;
    }

    public int b_() {
        int i2 = this.f47002V + 1;
        this.f47002V = i2;
        return i2;
    }

    public abstract void c();

    public void c(int i2) {
        this.T = i2;
    }

    public p c_() {
        return this.W;
    }

    public abstract String d();

    public abstract long e();

    public abstract U f();

    public double g() {
        AdBid bid = getBid();
        return bid != null ? bid.getPrice() : (sg.bigo.ads.common.j.a.a(d(), e()) * 1.0d) / 1.0E8d;
    }

    public void a(int i2) {
        this.f46998P = i2;
    }

    public void a(String str, String str2, int i2) {
    }

    public void a(boolean z2, boolean z3) {
        int i2;
        if (z3) {
            i2 = 1;
        } else {
            i2 = !z2 ? 2 : 3;
        }
        this.O = i2;
    }
}
