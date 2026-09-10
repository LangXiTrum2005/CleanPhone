package u4;

import al.l;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.math.BigInteger;
import kotlin.jvm.internal.n;
import wj.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f51895f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f51899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f51900e = r9.b.u(new l(this, 29));

    static {
        new h("", 0, 0, 0);
        f51895f = new h("", 0, 1, 0);
        new h("", 1, 0, 0);
    }

    public h(String str, int i10, int i11, int i12) {
        this.f51896a = i10;
        this.f51897b = i11;
        this.f51898c = i12;
        this.f51899d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h other = (h) obj;
        n.f(other, "other");
        Object value = this.f51900e.getValue();
        n.e(value, "<get-bigInteger>(...)");
        Object value2 = other.f51900e.getValue();
        n.e(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f51896a == hVar.f51896a && this.f51897b == hVar.f51897b && this.f51898c == hVar.f51898c;
    }

    public final int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f51896a) * 31) + this.f51897b) * 31) + this.f51898c;
    }

    public final String toString() {
        String str = this.f51899d;
        String strN = !an.h.y0(str) ? defpackage.e.n("-", str) : "";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f51896a);
        sb2.append('.');
        sb2.append(this.f51897b);
        sb2.append('.');
        return l1.d.i(sb2, this.f51898c, strN);
    }
}
