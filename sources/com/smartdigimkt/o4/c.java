package com.smartdigimkt.o4;

import android.net.Uri;
import com.smartdigimkt.n4.r;
import com.smartdigimkt.n4.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements com.smartdigimkt.n4.h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int f37409A = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f37410B = 0;
    public static final int C = 1;
    private static final long D = 102400;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f37411w = 2097152;
    public static final int x = 1;
    public static final int y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f37412z = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.smartdigimkt.o4.a f37413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.smartdigimkt.n4.h f37414c;
    private final com.smartdigimkt.n4.h d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.smartdigimkt.n4.h f37415e;
    private final b f;
    private final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f37416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f37417i;
    private com.smartdigimkt.n4.h j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Uri f37418l;
    private Uri m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f37419n;
    private String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f37420p;
    private long q;
    private e r;
    private boolean s;
    private boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f37421u;
    private long v;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {
        void a(int i2);

        void a(long j, long j2);
    }

    /* JADX INFO: renamed from: com.smartdigimkt.o4.c$c, reason: collision with other inner class name */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0560c {
    }

    public c(com.smartdigimkt.o4.a aVar, com.smartdigimkt.n4.h hVar) {
        this(aVar, hVar, 0, 2097152L);
    }

    private static boolean b(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof com.smartdigimkt.n4.i) && ((com.smartdigimkt.n4.i) cause).f36997a == 0) {
                return true;
            }
        }
        return false;
    }

    private void d() throws IOException {
        com.smartdigimkt.n4.h hVar = this.j;
        if (hVar == null) {
            return;
        }
        try {
            hVar.close();
        } finally {
            this.j = null;
            this.k = false;
            e eVar = this.r;
            if (eVar != null) {
                this.f37413b.b(eVar);
                this.r = null;
            }
        }
    }

    private boolean e() {
        return this.j == this.f37415e;
    }

    private boolean f() {
        return this.j == this.f37414c;
    }

    private boolean g() {
        return !f();
    }

    private boolean h() {
        return this.j == this.d;
    }

    private void i() {
        b bVar = this.f;
        if (bVar == null || this.f37421u <= 0) {
            return;
        }
        bVar.a(this.f37413b.a(), this.f37421u);
        this.f37421u = 0L;
    }

    private void j() throws IOException {
        this.q = 0L;
        if (h()) {
            this.f37413b.a(this.o, this.f37420p);
        }
    }

    @Override // com.smartdigimkt.n4.h
    public long a(com.smartdigimkt.n4.k kVar) throws IOException {
        try {
            String strA = f.a(kVar);
            this.o = strA;
            Uri uri = kVar.f37004a;
            this.f37418l = uri;
            this.m = a(this.f37413b, strA, uri);
            this.f37419n = kVar.g;
            this.f37420p = kVar.d;
            int iB = b(kVar);
            boolean z2 = iB != -1;
            this.t = z2;
            if (z2) {
                a(iB);
            }
            long j = kVar.f37007e;
            if (j != -1 || this.t) {
                this.q = j;
            } else {
                long jB = this.f37413b.b(this.o);
                this.q = jB;
                if (jB != -1) {
                    long j2 = jB - kVar.d;
                    this.q = j2;
                    if (j2 <= 0) {
                        throw new com.smartdigimkt.n4.i(0);
                    }
                }
            }
            a(false);
            return this.q;
        } catch (IOException e2) {
            a(e2);
            throw e2;
        }
    }

    @Override // com.smartdigimkt.n4.h
    public Uri c() {
        return this.m;
    }

    @Override // com.smartdigimkt.n4.h
    public void close() throws IOException {
        this.f37418l = null;
        this.m = null;
        i();
        try {
            d();
        } catch (IOException e2) {
            a(e2);
            throw e2;
        }
    }

    public c(com.smartdigimkt.o4.a aVar, com.smartdigimkt.n4.h hVar, int i2) {
        this(aVar, hVar, i2, 2097152L);
    }

    public c(com.smartdigimkt.o4.a aVar, com.smartdigimkt.n4.h hVar, int i2, long j) {
        this(aVar, hVar, new r(), new com.smartdigimkt.o4.b(aVar, j), i2, null);
    }

    public c(com.smartdigimkt.o4.a aVar, com.smartdigimkt.n4.h hVar, com.smartdigimkt.n4.h hVar2, com.smartdigimkt.n4.g gVar, int i2, b bVar) {
        this.f37413b = aVar;
        this.f37414c = hVar2;
        this.g = (i2 & 1) != 0;
        this.f37416h = (i2 & 2) != 0;
        this.f37417i = (i2 & 4) != 0;
        this.f37415e = hVar;
        if (gVar != null) {
            this.d = new z(hVar, gVar);
        } else {
            this.d = null;
        }
        this.f = bVar;
    }

    private int b(com.smartdigimkt.n4.k kVar) {
        if (this.f37416h && this.s) {
            return 0;
        }
        return (this.f37417i && kVar.f37007e == -1) ? 1 : -1;
    }

    @Override // com.smartdigimkt.n4.h
    public int a(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        if (this.q == 0) {
            return -1;
        }
        try {
            if (this.f37420p >= this.v) {
                a(true);
            }
            int iA = this.j.a(bArr, i2, i3);
            if (iA != -1) {
                if (f()) {
                    this.f37421u += (long) iA;
                }
                long j = iA;
                this.f37420p += j;
                long j2 = this.q;
                if (j2 != -1) {
                    this.q = j2 - j;
                    return iA;
                }
            } else {
                if (this.k) {
                    j();
                    return iA;
                }
                long j3 = this.q;
                if (j3 <= 0) {
                    if (j3 == -1) {
                    }
                }
                d();
                a(false);
                return a(bArr, i2, i3);
            }
            return iA;
        } catch (IOException e2) {
            if (this.k && b(e2)) {
                j();
                return -1;
            }
            a(e2);
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:67:0x0112  */
    /* JADX WARN: Code duplicated, block: B:69:0x0122  */
    /* JADX WARN: Code duplicated, block: B:70:0x0128  */
    /* JADX WARN: Code duplicated, block: B:73:0x0131  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    private void a(boolean z2) throws IOException {
        e eVarB;
        long jMin;
        com.smartdigimkt.n4.k kVar;
        e eVar;
        com.smartdigimkt.n4.h hVar;
        com.smartdigimkt.n4.k kVar2;
        long j;
        boolean z3;
        long jA;
        k kVar3;
        Uri uriC;
        if (this.t) {
            eVarB = null;
        } else if (this.g) {
            try {
                eVarB = this.f37413b.b(this.o, this.f37420p);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            eVarB = this.f37413b.c(this.o, this.f37420p);
        }
        if (eVarB == null) {
            hVar = this.f37415e;
            kVar2 = new com.smartdigimkt.n4.k(this.f37418l, this.f37420p, this.q, this.o, this.f37419n);
        } else {
            if (eVarB.d) {
                Uri uriFromFile = Uri.fromFile(eVarB.f37425e);
                long j2 = this.f37420p - eVarB.f37423b;
                long jMin2 = eVarB.f37424c - j2;
                long j3 = this.q;
                if (j3 != -1) {
                    jMin2 = Math.min(jMin2, j3);
                }
                kVar2 = new com.smartdigimkt.n4.k(uriFromFile, this.f37420p, j2, jMin2, this.o, this.f37419n);
                hVar = this.f37414c;
            } else {
                if (eVarB.b()) {
                    jMin = this.q;
                } else {
                    jMin = eVarB.f37424c;
                    long j4 = this.q;
                    if (j4 != -1) {
                        jMin = Math.min(jMin, j4);
                    }
                }
                kVar = new com.smartdigimkt.n4.k(this.f37418l, this.f37420p, jMin, this.o, this.f37419n);
                com.smartdigimkt.n4.h hVar2 = this.d;
                if (hVar2 != null) {
                    hVar = hVar2;
                    eVar = eVarB;
                } else {
                    com.smartdigimkt.n4.h hVar3 = this.f37415e;
                    this.f37413b.b(eVarB);
                    eVar = null;
                    hVar = hVar3;
                }
            }
            if (this.t && hVar == this.f37415e) {
                j = this.f37420p + D;
            } else {
                j = Long.MAX_VALUE;
            }
            this.v = j;
            if (z2) {
                com.smartdigimkt.p4.a.b(e());
                if (hVar == this.f37415e) {
                    return;
                }
                try {
                    d();
                } catch (Throwable th) {
                    if (eVar.a()) {
                        this.f37413b.b(eVar);
                    }
                    throw th;
                }
            }
            if (eVar != null && eVar.a()) {
                this.r = eVar;
            }
            this.j = hVar;
            if (kVar.f37007e == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.k = z3;
            jA = hVar.a(kVar);
            kVar3 = new k();
            if (this.k && jA != -1) {
                this.q = jA;
                j.a(kVar3, this.f37420p + jA);
            }
            if (g()) {
                uriC = this.j.c();
                this.m = uriC;
                if (!this.f37418l.equals(uriC)) {
                    j.a(kVar3, this.m);
                } else {
                    j.b(kVar3);
                }
            }
            if (h()) {
                this.f37413b.a(this.o, kVar3);
            }
        }
        kVar = kVar2;
        eVar = eVarB;
        if (this.t) {
            j = Long.MAX_VALUE;
        } else {
            j = Long.MAX_VALUE;
        }
        this.v = j;
        if (z2) {
            com.smartdigimkt.p4.a.b(e());
            if (hVar == this.f37415e) {
                return;
            } else {
                d();
            }
        }
        if (eVar != null) {
            this.r = eVar;
        }
        this.j = hVar;
        if (kVar.f37007e == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.k = z3;
        jA = hVar.a(kVar);
        kVar3 = new k();
        if (this.k) {
            this.q = jA;
            j.a(kVar3, this.f37420p + jA);
        }
        if (g()) {
            uriC = this.j.c();
            this.m = uriC;
            if (!this.f37418l.equals(uriC)) {
                j.a(kVar3, this.m);
            } else {
                j.b(kVar3);
            }
        }
        if (h()) {
            this.f37413b.a(this.o, kVar3);
        }
    }

    private static Uri a(com.smartdigimkt.o4.a aVar, String str, Uri uri) {
        Uri uriB = j.b(aVar.a(str));
        return uriB == null ? uri : uriB;
    }

    private void a(IOException iOException) {
        if (f() || (iOException instanceof com.smartdigimkt.o4.a.C0559a)) {
            this.s = true;
        }
    }

    private void a(int i2) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.a(i2);
        }
    }
}
