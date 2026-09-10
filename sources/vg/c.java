package vg;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f52585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52586b;

    public c(Integer num, String str, int i10) {
        num = (i10 & 1) != 0 ? null : num;
        str = (i10 & 2) != 0 ? null : str;
        this.f52585a = num;
        this.f52586b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return n.a(this.f52585a, cVar.f52585a) && n.a(this.f52586b, cVar.f52586b);
    }

    public final int hashCode() {
        Integer num = this.f52585a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f52586b;
        return (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "CerebroEventPropertyValue(intValue=" + this.f52585a + ", stringValue=" + this.f52586b + ", floatValue=null)";
    }
}
