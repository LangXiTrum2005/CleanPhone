package xn;

import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f53965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f53966f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f53967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f53968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f53969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f53970d;

    static {
        h hVar = h.f53961r;
        h hVar2 = h.f53962s;
        h hVar3 = h.f53963t;
        h hVar4 = h.l;
        h hVar5 = h.f53957n;
        h hVar6 = h.f53956m;
        h hVar7 = h.f53958o;
        h hVar8 = h.f53960q;
        h hVar9 = h.f53959p;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9};
        h[] hVarArr2 = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, h.f53954j, h.f53955k, h.f53952h, h.f53953i, h.f53950f, h.f53951g, h.f53949e};
        l7.z zVar = new l7.z();
        zVar.d((h[]) Arrays.copyOf(hVarArr, 9));
        a0 a0Var = a0.TLS_1_3;
        a0 a0Var2 = a0.TLS_1_2;
        zVar.f(a0Var, a0Var2);
        zVar.f45237b = true;
        zVar.b();
        l7.z zVar2 = new l7.z();
        zVar2.d((h[]) Arrays.copyOf(hVarArr2, 16));
        zVar2.f(a0Var, a0Var2);
        zVar2.f45237b = true;
        f53965e = zVar2.b();
        l7.z zVar3 = new l7.z();
        zVar3.d((h[]) Arrays.copyOf(hVarArr2, 16));
        zVar3.f(a0Var, a0Var2, a0.TLS_1_1, a0.TLS_1_0);
        zVar3.f45237b = true;
        zVar3.b();
        f53966f = new i(false, false, null, null);
    }

    public i(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f53967a = z10;
        this.f53968b = z11;
        this.f53969c = strArr;
        this.f53970d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f53969c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(h.f53946b.c(str));
        }
        return xj.n.N0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f53967a) {
            return false;
        }
        String[] strArr = this.f53970d;
        if (strArr != null && !yn.a.i(strArr, sSLSocket.getEnabledProtocols(), zj.a.f54957b)) {
            return false;
        }
        String[] strArr2 = this.f53969c;
        return strArr2 == null || yn.a.i(strArr2, sSLSocket.getEnabledCipherSuites(), h.f53947c);
    }

    public final List c() {
        String[] strArr = this.f53970d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(q1.o(str));
        }
        return xj.n.N0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z10 = iVar.f53967a;
        boolean z11 = this.f53967a;
        if (z11 != z10) {
            return false;
        }
        if (z11) {
            return Arrays.equals(this.f53969c, iVar.f53969c) && Arrays.equals(this.f53970d, iVar.f53970d) && this.f53968b == iVar.f53968b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f53967a) {
            return 17;
        }
        String[] strArr = this.f53969c;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f53970d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f53968b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f53967a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb2.append(Objects.toString(a(), "[all enabled]"));
        sb2.append(", tlsVersions=");
        sb2.append(Objects.toString(c(), "[all enabled]"));
        sb2.append(", supportsTlsExtensions=");
        return defpackage.e.t(sb2, this.f53968b, ')');
    }
}
