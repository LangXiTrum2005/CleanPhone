package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g[] f36608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g[] f36609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f36610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f36611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f36612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j f36613j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f36614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f36615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String[] f36616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String[] f36617d;

    static {
        g gVar = g.f36219n1;
        g gVar2 = g.f36222o1;
        g gVar3 = g.f36225p1;
        g gVar4 = g.f36228q1;
        g gVar5 = g.f36230r1;
        g gVar6 = g.Z0;
        g gVar7 = g.f36192d1;
        g gVar8 = g.f36183a1;
        g gVar9 = g.f36195e1;
        g gVar10 = g.f36211k1;
        g gVar11 = g.f36208j1;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11};
        f36608e = gVarArr;
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, g.K0, g.L0, g.f36204i0, g.f36207j0, g.G, g.K, g.f36209k};
        f36609f = gVarArr2;
        a aVarA = new a(true).a(gVarArr);
        d0 d0Var = d0.TLS_1_3;
        d0 d0Var2 = d0.TLS_1_2;
        f36610g = aVarA.a(d0Var, d0Var2).a(true).a();
        a aVarA2 = new a(true).a(gVarArr2);
        d0 d0Var3 = d0.TLS_1_1;
        d0 d0Var4 = d0.TLS_1_0;
        f36611h = aVarA2.a(d0Var, d0Var2, d0Var3, d0Var4).a(true).a();
        f36612i = new a(true).a(gVarArr2).a(d0Var4).a(true).a();
        f36613j = new a(false).a();
    }

    public j(a aVar) {
        this.f36614a = aVar.f36618a;
        this.f36616c = aVar.f36619b;
        this.f36617d = aVar.f36620c;
        this.f36615b = aVar.f36621d;
    }

    public List<g> a() {
        String[] strArr = this.f36616c;
        if (strArr != null) {
            return g.a(strArr);
        }
        return null;
    }

    public boolean b() {
        return this.f36614a;
    }

    public boolean c() {
        return this.f36615b;
    }

    public List<d0> d() {
        String[] strArr = this.f36617d;
        if (strArr != null) {
            return d0.a(strArr);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z10 = this.f36614a;
        if (z10 != jVar.f36614a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f36616c, jVar.f36616c) && Arrays.equals(this.f36617d, jVar.f36617d) && this.f36615b == jVar.f36615b);
    }

    public int hashCode() {
        if (this.f36614a) {
            return ((((Arrays.hashCode(this.f36616c) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f36617d)) * 31) + (!this.f36615b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f36614a) {
            return "ConnectionSpec()";
        }
        StringBuilder sbV = defpackage.e.v("ConnectionSpec(cipherSuites=", this.f36616c != null ? a().toString() : "[all enabled]", ", tlsVersions=", this.f36617d != null ? d().toString() : "[all enabled]", ", supportsTlsExtensions=");
        sbV.append(this.f36615b);
        sbV.append(")");
        return sbV.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f36618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String[] f36619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String[] f36620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f36621d;

        public a(boolean z10) {
            this.f36618a = z10;
        }

        public a a(g... gVarArr) {
            if (!this.f36618a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[gVarArr.length];
            for (int i10 = 0; i10 < gVarArr.length; i10++) {
                strArr[i10] = gVarArr[i10].f36246a;
            }
            return a(strArr);
        }

        public a b(String... strArr) {
            if (!this.f36618a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f36620c = (String[]) strArr.clone();
            return this;
        }

        public a(j jVar) {
            this.f36618a = jVar.f36614a;
            this.f36619b = jVar.f36616c;
            this.f36620c = jVar.f36617d;
            this.f36621d = jVar.f36615b;
        }

        public a a(String... strArr) {
            if (this.f36618a) {
                if (strArr.length != 0) {
                    this.f36619b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a a(d0... d0VarArr) {
            if (this.f36618a) {
                String[] strArr = new String[d0VarArr.length];
                for (int i10 = 0; i10 < d0VarArr.length; i10++) {
                    strArr[i10] = d0VarArr[i10].f36173a;
                }
                return b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a a(boolean z10) {
            if (this.f36618a) {
                this.f36621d = z10;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public j a() {
            return new j(this);
        }
    }

    private j b(SSLSocket sSLSocket, boolean z10) {
        String[] strArrA = this.f36616c != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(g.f36184b, sSLSocket.getEnabledCipherSuites(), this.f36616c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrA2 = this.f36617d != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.f36273q, sSLSocket.getEnabledProtocols(), this.f36617d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(g.f36184b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z10 && iA != -1) {
            strArrA = com.mbridge.msdk.thrid.okhttp.internal.c.a(strArrA, supportedCipherSuites[iA]);
        }
        return new a(this).a(strArrA).b(strArrA2).a();
    }

    public void a(SSLSocket sSLSocket, boolean z10) {
        j jVarB = b(sSLSocket, z10);
        String[] strArr = jVarB.f36617d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = jVarB.f36616c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.f36614a) {
            return false;
        }
        String[] strArr = this.f36617d;
        if (strArr != null && !com.mbridge.msdk.thrid.okhttp.internal.c.b(com.mbridge.msdk.thrid.okhttp.internal.c.f36273q, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f36616c;
        return strArr2 == null || com.mbridge.msdk.thrid.okhttp.internal.c.b(g.f36184b, strArr2, sSLSocket.getEnabledCipherSuites());
    }
}
