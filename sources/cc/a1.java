package cc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f5988c;

    public a1(int i10, String str, List list) {
        this.f5986a = str;
        this.f5987b = i10;
        this.f5988c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            a1 a1Var = (a1) ((h2) obj);
            if (this.f5986a.equals(a1Var.f5986a) && this.f5987b == a1Var.f5987b && this.f5988c.equals(a1Var.f5988c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5988c.hashCode() ^ ((((this.f5986a.hashCode() ^ 1000003) * 1000003) ^ this.f5987b) * 1000003);
    }

    public final String toString() {
        return "Thread{name=" + this.f5986a + ", importance=" + this.f5987b + ", frames=" + this.f5988c + "}";
    }
}
