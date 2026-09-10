package w1;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f52772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f52773d;

    public e(String str, double d10) {
        this.f52770a = str;
        this.f52771b = 2;
        this.f52772c = d10;
        this.f52773d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f52771b == eVar.f52771b && Double.compare(this.f52772c, eVar.f52772c) == 0 && Objects.equals(this.f52770a, eVar.f52770a) && Objects.equals(this.f52773d, eVar.f52773d);
    }

    public final int hashCode() {
        return Objects.hash(this.f52770a, Integer.valueOf(this.f52771b), Double.valueOf(this.f52772c), this.f52773d);
    }

    public e(String str, String str2, int i10) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        go.k.t(z10);
        this.f52770a = str;
        this.f52771b = i10;
        this.f52773d = str2;
        this.f52772c = 0.0d;
    }
}
