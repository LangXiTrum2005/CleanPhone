package sg.bigo.ads.api;

import java.util.Map;
import java.util.UUID;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.b;
import sg.bigo.ads.api.core.h;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b<T extends b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46989c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46990e;
    public long f;
    public final a g = new a(0);

    public static class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f46991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f46992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f46993c;
        String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f46994e;
        public long f;
        int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f46995h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f46996i;
        long j;
        public long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f46997l;
        private long m;

        private a() {
            this.f46992b = UUID.randomUUID().toString();
            this.f46991a = "";
            this.f46993c = "";
            this.d = "";
            this.f46994e = "";
            this.g = 0;
            this.f46996i = 0;
            this.f46995h = "";
            this.j = 0L;
            this.k = 0L;
            this.f46997l = 0L;
            this.m = 0L;
        }

        public final void a() {
            if (this.f46997l == 0) {
                this.f46997l = System.currentTimeMillis();
            }
        }

        public final void b() {
            if (this.m == 0) {
                this.m = System.currentTimeMillis();
            }
        }

        @Override // sg.bigo.ads.api.core.h
        public final String c() {
            return this.f46992b;
        }

        @Override // sg.bigo.ads.api.core.h
        public final String d() {
            return this.f46993c;
        }

        @Override // sg.bigo.ads.api.core.h
        public final String e() {
            return this.d;
        }

        @Override // sg.bigo.ads.api.core.h
        public final String f() {
            return this.f46994e;
        }

        @Override // sg.bigo.ads.api.core.h
        public final String g() {
            return this.f46991a;
        }

        @Override // sg.bigo.ads.api.core.h
        public final int h() {
            return this.g;
        }

        @Override // sg.bigo.ads.api.core.h
        public final String i() {
            return this.f46995h;
        }

        @Override // sg.bigo.ads.api.core.h
        public final int j() {
            return this.f46996i;
        }

        @Override // sg.bigo.ads.api.core.h
        public final long k() {
            return this.f;
        }

        @Override // sg.bigo.ads.api.core.h
        public final long l() {
            return this.j;
        }

        @Override // sg.bigo.ads.api.core.h
        public final long m() {
            return this.k;
        }

        @Override // sg.bigo.ads.api.core.h
        public final long n() {
            return this.f46997l;
        }

        @Override // sg.bigo.ads.api.core.h
        public final long o() {
            return this.m;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public b(String str, String str2) {
        this.f46987a = str;
        this.f46988b = str2;
    }

    public T a() {
        return null;
    }

    public sg.bigo.ads.api.core.d b() {
        if (q.a((CharSequence) this.f46987a)) {
            return new sg.bigo.ads.api.core.d(1019, 10001, "Please pass slot id when constructing an ad request");
        }
        return null;
    }

    public abstract int c();

    public final void c(int i2) {
        this.g.g = i2;
    }

    public Map<String, Object> d() {
        return null;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public l h() {
        return null;
    }

    public final void a(String str) {
        this.g.f46991a = str;
    }

    public final void b(int i2) {
        a aVar = this.g;
        if (aVar.j == 0) {
            aVar.f46996i = i2;
            aVar.j = System.currentTimeMillis();
        }
    }

    public final void a(String str, String str2, String str3) {
        a aVar = this.g;
        aVar.f46993c = str;
        aVar.d = str2;
        aVar.f46994e = str3;
    }

    public final void b(String str) {
        a aVar = this.g;
        if (aVar != null) {
            aVar.f46995h = str;
        }
    }

    public boolean a(int i2) {
        return i2 != c();
    }
}
