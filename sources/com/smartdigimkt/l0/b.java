package com.smartdigimkt.l0;

import com.smartdigimkt.h0.j;
import com.smartdigimkt.h0.k;
import com.smartdigimkt.h0.l;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f36303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList<C0526b> f36305c = new LinkedList<>();

    /* JADX INFO: renamed from: com.smartdigimkt.l0.b$b, reason: collision with other inner class name */
    public class C0526b {
        public static final int g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f36306h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f36307i = 2;
        public static final int j = 3;
        public static final int k = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private File f36309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.smartdigimkt.h0.e<Void> f36310c;
        private com.smartdigimkt.l0.a d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f36311e;

        public int c() {
            return this.f36311e;
        }

        public boolean d() {
            return this.f36311e == 1;
        }

        public boolean e() {
            int i2 = this.f36311e;
            if (i2 == 0) {
                this.f36311e = 2;
                b.this.b();
                return true;
            }
            if (i2 != 1) {
                return false;
            }
            this.d.a();
            this.f36311e = 2;
            b.this.b();
            return true;
        }

        public boolean f() {
            if (this.f36311e != 2) {
                return false;
            }
            this.f36311e = 0;
            b.this.b();
            return true;
        }

        private C0526b(b bVar, String str, String str2, com.smartdigimkt.h0.e<Void> eVar) {
            this(new File(str), str2, eVar);
        }

        public boolean b() {
            int i2 = this.f36311e;
            if (i2 == 4 || i2 == 3) {
                return false;
            }
            if (i2 == 1) {
                this.d.a();
            }
            this.f36311e = 4;
            b.this.a(this);
            return true;
        }

        private C0526b(File file, String str, com.smartdigimkt.h0.e<Void> eVar) {
            this.f36309b = file;
            this.f36310c = eVar;
            this.f36308a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            if (this.f36311e != 0) {
                return false;
            }
            com.smartdigimkt.l0.a aVarA = b.this.a(this.f36309b, this.f36308a);
            this.d = aVarA;
            aVarA.a((com.smartdigimkt.h0.e) new a());
            this.f36311e = 1;
            b.this.f36303a.a((j) this.d);
            return true;
        }

        /* JADX INFO: renamed from: com.smartdigimkt.l0.b$b$a */
        public class a extends com.smartdigimkt.h0.f<Void> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            boolean f36312e;

            public a() {
            }

            @Override // com.smartdigimkt.h0.f, com.smartdigimkt.h0.e
            public void a() {
                if (this.f36312e) {
                    return;
                }
                C0526b.this.f36311e = 3;
                C0526b.this.f36310c.a();
                C0526b c0526b = C0526b.this;
                b.this.a(c0526b);
            }

            @Override // com.smartdigimkt.h0.f, com.smartdigimkt.h0.e
            public void b() {
                C0526b.this.f36310c.b();
            }

            @Override // com.smartdigimkt.h0.f, com.smartdigimkt.h0.e
            public void d() {
                C0526b.this.f36310c.d();
                this.f36312e = true;
            }

            @Override // com.smartdigimkt.h0.f, com.smartdigimkt.h0.e
            public void a(l lVar) {
                if (this.f36312e) {
                    return;
                }
                C0526b.this.f36310c.a(lVar);
            }

            @Override // com.smartdigimkt.h0.f, com.smartdigimkt.h0.e
            public void a(com.smartdigimkt.i0.a aVar) {
                if (this.f36312e) {
                    return;
                }
                C0526b.this.f36310c.a(aVar);
            }

            @Override // com.smartdigimkt.h0.f, com.smartdigimkt.h0.e
            public void a(long j, long j2) {
                C0526b.this.f36310c.a(j, j2);
            }
        }
    }

    public b(k kVar, int i2) {
        this.f36303a = kVar;
        this.f36304b = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        synchronized (this) {
            try {
                Iterator<C0526b> it = this.f36305c.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (it.next().d()) {
                        i2++;
                    }
                }
                if (i2 >= this.f36304b) {
                    return;
                }
                Iterator<C0526b> it2 = this.f36305c.iterator();
                while (it2.hasNext()) {
                    if (it2.next().a() && (i2 = i2 + 1) == this.f36304b) {
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C0526b a(File file, String str, com.smartdigimkt.h0.e<Void> eVar) {
        C0526b c0526b = new C0526b(file, str, eVar);
        synchronized (this) {
            this.f36305c.add(c0526b);
        }
        b();
        return c0526b;
    }

    public C0526b a(String str, String str2, com.smartdigimkt.h0.e<Void> eVar) {
        return a(new File(str), str2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C0526b c0526b) {
        synchronized (this) {
            this.f36305c.remove(c0526b);
        }
        b();
    }

    public void a() {
        synchronized (this) {
            while (!this.f36305c.isEmpty()) {
                try {
                    this.f36305c.get(0).b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public com.smartdigimkt.l0.a a(File file, String str) {
        return new com.smartdigimkt.l0.a(file, str);
    }
}
