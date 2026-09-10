package oj;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f47485b;

    public g(String str, boolean z10) {
        this.f47484a = str;
        this.f47485b = z10;
    }

    public final List a() {
        return xj.o.Q(this.f47484a, Boolean.valueOf(this.f47485b));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return go.k.C(a(), ((g) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f47484a + ", useDataStore=" + this.f47485b + ")";
    }
}
