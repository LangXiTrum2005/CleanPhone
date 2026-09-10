package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3985lj {
    public static final C3985lj e;
    public static final C3985lj f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4659a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        C2800Ue c2800Ue = C2800Ue.r;
        C2800Ue c2800Ue2 = C2800Ue.s;
        C2800Ue c2800Ue3 = C2800Ue.t;
        C2800Ue c2800Ue4 = C2800Ue.l;
        C2800Ue c2800Ue5 = C2800Ue.n;
        C2800Ue c2800Ue6 = C2800Ue.m;
        C2800Ue c2800Ue7 = C2800Ue.o;
        C2800Ue c2800Ue8 = C2800Ue.q;
        C2800Ue c2800Ue9 = C2800Ue.p;
        C2800Ue[] c2800UeArr = {c2800Ue, c2800Ue2, c2800Ue3, c2800Ue4, c2800Ue5, c2800Ue6, c2800Ue7, c2800Ue8, c2800Ue9};
        C2800Ue[] c2800UeArr2 = {c2800Ue, c2800Ue2, c2800Ue3, c2800Ue4, c2800Ue5, c2800Ue6, c2800Ue7, c2800Ue8, c2800Ue9, C2800Ue.j, C2800Ue.k, C2800Ue.h, C2800Ue.i, C2800Ue.f, C2800Ue.g, C2800Ue.e};
        C3897kj c3897kj = new C3897kj();
        c3897kj.b((C2800Ue[]) Arrays.copyOf(c2800UeArr, 9));
        Oc0 oc0 = Oc0.TLS_1_3;
        Oc0 oc1 = Oc0.TLS_1_2;
        c3897kj.e(oc0, oc1);
        c3897kj.d();
        c3897kj.a();
        C3897kj c3897kj2 = new C3897kj();
        c3897kj2.b((C2800Ue[]) Arrays.copyOf(c2800UeArr2, 16));
        c3897kj2.e(oc0, oc1);
        c3897kj2.d();
        e = c3897kj2.a();
        C3897kj c3897kj3 = new C3897kj();
        c3897kj3.b((C2800Ue[]) Arrays.copyOf(c2800UeArr2, 16));
        c3897kj3.e(oc0, oc1, Oc0.TLS_1_1, Oc0.TLS_1_0);
        c3897kj3.d();
        c3897kj3.a();
        f = new C3985lj(false, false, null, null);
    }

    public C3985lj(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f4659a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C2800Ue.b.i(str));
        }
        return AbstractC2853Wf.u0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f4659a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null) {
            if (!Vg0.i(C4134nR.f4743a, strArr, sSLSocket.getEnabledProtocols())) {
                return false;
            }
        }
        String[] strArr2 = this.c;
        if (strArr2 != null) {
            return Vg0.i(C2800Ue.c, strArr2, sSLSocket.getEnabledCipherSuites());
        }
        return true;
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C3336eJ.j(str));
        }
        return AbstractC2853Wf.u0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3985lj)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C3985lj c3985lj = (C3985lj) obj;
        boolean z = c3985lj.f4659a;
        boolean z2 = this.f4659a;
        if (z2 != z) {
            return false;
        }
        return !z2 || (Arrays.equals(this.c, c3985lj.c) && Arrays.equals(this.d, c3985lj.d) && this.b == c3985lj.b);
    }

    public final int hashCode() {
        if (!this.f4659a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f4659a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(a(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(c(), "[all enabled]")) + ", supportsTlsExtensions=" + this.b + ')';
    }
}
