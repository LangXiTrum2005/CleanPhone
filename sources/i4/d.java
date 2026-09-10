package i4;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f42879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f42880c;

    public d(String str, List list, boolean z10) {
        this.f42878a = str;
        this.f42879b = z10;
        this.f42880c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        String str = dVar.f42878a;
        if (this.f42879b != dVar.f42879b || !this.f42880c.equals(dVar.f42880c)) {
            return false;
        }
        String str2 = this.f42878a;
        return str2.startsWith("index_") ? str.startsWith("index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f42878a;
        return this.f42880c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f42879b ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f42878a + "', unique=" + this.f42879b + ", columns=" + this.f42880c + '}';
    }
}
