package i4;

import d5.u;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f42872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f42873e;

    public b(String str, String str2, String str3, List list, List list2) {
        this.f42869a = str;
        this.f42870b = str2;
        this.f42871c = str3;
        this.f42872d = Collections.unmodifiableList(list);
        this.f42873e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f42869a.equals(bVar.f42869a) && this.f42870b.equals(bVar.f42870b) && this.f42871c.equals(bVar.f42871c) && this.f42872d.equals(bVar.f42872d)) {
            return this.f42873e.equals(bVar.f42873e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42873e.hashCode() + ((this.f42872d.hashCode() + u.e(u.e(this.f42869a.hashCode() * 31, 31, this.f42870b), 31, this.f42871c)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f42869a + "', onDelete='" + this.f42870b + "', onUpdate='" + this.f42871c + "', columnNames=" + this.f42872d + ", referenceColumnNames=" + this.f42873e + '}';
    }
}
