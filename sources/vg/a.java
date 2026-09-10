package vg;

import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f52582b;

    public a(String str, List list) {
        this.f52581a = str;
        this.f52582b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f52581a.equals(aVar.f52581a) && n.a(this.f52582b, aVar.f52582b);
    }

    public final int hashCode() {
        int iHashCode = this.f52581a.hashCode() * 961;
        List list = this.f52582b;
        return (iHashCode + (list == null ? 0 : list.hashCode())) * 29791;
    }

    public final String toString() {
        return "CerebroEvent(eventName=" + this.f52581a + ", duration=null, properties=" + this.f52582b + ", adjustKey=null, eventGroup=null, page=null)";
    }
}
