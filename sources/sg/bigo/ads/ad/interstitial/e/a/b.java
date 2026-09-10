package sg.bigo.ads.ad.interstitial.e.a;

import sg.bigo.ads.ad.interstitial.d;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f46174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f46175c;
    protected final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f46176e;
    protected final int f;
    protected final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final int f46177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final int f46178i;
    protected final int j;
    protected final a k = new a(this, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final int f46179l;
    protected final int m;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f46180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f46181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f46182c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f46183e;
        public final int f;
        public final int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f46184h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f46185i;
        public final int j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f46186l;

        /* JADX WARN: Code duplicated, block: B:14:0x005d  */
        /* JADX WARN: Code duplicated, block: B:17:0x006f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:18:0x0071  */
        /* JADX WARN: Code duplicated, block: B:20:0x0079  */
        /* JADX WARN: Code duplicated, block: B:22:0x0081  */
        private a(b bVar) {
            int iE;
            int iG;
            int i2 = d.f45977b;
            int iH = bVar.h();
            if (iH != 2) {
                if (iH != 3) {
                    this.f46180a = false;
                    this.f46181b = -1;
                    this.f46182c = sg.bigo.ads.common.w.b.a(i2, 0.15f);
                    this.d = i2;
                    this.f = i2;
                } else {
                    this.f46180a = true;
                    this.f46181b = sg.bigo.ads.common.w.b.a(-16777216, 0.3f);
                }
                this.f46183e = sg.bigo.ads.common.w.b.a(this.f, 128);
                iE = bVar.e();
                if (iE != 2 || iE == 4) {
                    this.g = 0;
                    this.f46184h = 0;
                } else {
                    this.g = this.f46181b;
                    this.f46184h = this.f46182c;
                }
                this.f46185i = -1;
                this.j = sg.bigo.ads.common.w.b.a(i2, 0.15f);
                iG = bVar.g();
                if (iG != 2) {
                    this.k = -14972829;
                    this.f46186l = 0;
                } else if (iG != 3) {
                    this.k = -16736769;
                    this.f46186l = 0;
                } else {
                    this.k = 872415231;
                    this.f46186l = -1;
                }
            }
            this.f46180a = false;
            this.f46181b = -16777216;
            this.f46182c = sg.bigo.ads.common.w.b.a(-1, 0.15f);
            this.d = -1;
            this.f = -1;
            this.f46183e = sg.bigo.ads.common.w.b.a(this.f, 128);
            iE = bVar.e();
            if (iE != 2) {
                this.g = 0;
                this.f46184h = 0;
            } else {
                this.g = 0;
                this.f46184h = 0;
            }
            this.f46185i = -1;
            this.j = sg.bigo.ads.common.w.b.a(i2, 0.15f);
            iG = bVar.g();
            if (iG != 2) {
                this.k = -14972829;
                this.f46186l = 0;
            } else if (iG != 3) {
                this.k = -16736769;
                this.f46186l = 0;
            } else {
                this.k = 872415231;
                this.f46186l = -1;
            }
        }

        public /* synthetic */ a(b bVar, byte b2) {
            this(bVar);
        }
    }

    public b(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f46174b = i2;
        this.f46175c = i3;
        this.d = i4;
        this.f46176e = i5;
        this.f = i6;
        this.g = i7;
        this.f46177h = i8;
        this.f46178i = i9;
        this.j = i10;
        this.f46179l = i11;
        this.m = i12;
    }

    public static int a(b bVar) {
        if (bVar == null) {
            return 0;
        }
        if (bVar.a()) {
            return 1;
        }
        int iE = bVar.e();
        int i2 = 3;
        if (iE == 3 || iE == 4) {
            return 2;
        }
        if (iE != 5) {
            i2 = 6;
            if (iE != 6) {
                return 4;
            }
        }
        return i2;
    }

    public int b() {
        return 9;
    }

    public final a c() {
        return this.k;
    }

    public final int d() {
        int i2 = this.f46174b;
        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) {
            return i2;
        }
        return 0;
    }

    public int e() {
        int i2 = this.f46175c;
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            return i2;
        }
        return 1;
    }

    public int f() {
        int i2 = this.f46175c;
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
            return i2;
        }
        return 1;
    }

    public final int g() {
        int i2 = this.d;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return i2;
        }
        return 1;
    }

    public final int h() {
        int i2 = this.f46176e;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return i2;
        }
        return 1;
    }

    public final int i() {
        return Math.max(1, this.f);
    }

    public final long j() {
        return r.f47535a.a(Math.min(99, Math.max(0, this.g)));
    }

    public final long k() {
        int i2 = this.f46177h;
        return i2 < 0 ? r.f47535a.a(0) : r.f47535a.a(i2);
    }

    public final int l() {
        int i2 = this.f46178i;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return i2;
        }
        return 3;
    }

    public final int m() {
        int i2 = this.f46179l;
        if (i2 < 0 || i2 > 4) {
            return 0;
        }
        return i2;
    }

    public final int n() {
        return Math.max(1, this.m);
    }

    public final int o() {
        int i2 = this.j;
        if (i2 < 0) {
            return -1;
        }
        return i2;
    }

    public static boolean b(b bVar) {
        return bVar == null || bVar.d() == 0;
    }

    public boolean a() {
        return false;
    }
}
