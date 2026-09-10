package com.mbridge.msdk.config.component.load.downloader;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f32203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f32204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f32206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32209g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f32210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f32211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f32212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f32213d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f32214e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f32215f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f32216g;

        public b() {
            this(null);
        }

        public b(d dVar) {
            this.f32210a = 20000L;
            this.f32211b = 10L;
            this.f32212c = 20000L;
            this.f32213d = 20000L;
            this.f32214e = 64;
            this.f32215f = 20;
            this.f32216g = 10;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(dVar)) {
                this.f32212c = dVar.c();
                this.f32210a = dVar.a();
                this.f32214e = dVar.f();
                this.f32213d = dVar.d();
                this.f32215f = dVar.g();
                this.f32211b = dVar.b();
                this.f32216g = dVar.e();
            }
        }

        public d a() {
            return new d(this);
        }

        public b a(int i10) {
            this.f32216g = i10;
            return this;
        }
    }

    public long a() {
        return this.f32203a;
    }

    public long b() {
        return this.f32204b;
    }

    public long c() {
        return this.f32205c;
    }

    public long d() {
        return this.f32206d;
    }

    public int e() {
        return this.f32209g;
    }

    public int f() {
        return this.f32207e;
    }

    public int g() {
        return this.f32208f;
    }

    private d(b bVar) {
        this.f32203a = bVar.f32210a;
        this.f32205c = bVar.f32212c;
        this.f32206d = bVar.f32213d;
        this.f32207e = bVar.f32214e;
        this.f32208f = bVar.f32215f;
        this.f32204b = bVar.f32211b;
        this.f32209g = bVar.f32216g;
    }
}
