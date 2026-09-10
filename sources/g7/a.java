package g7;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f41718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f41720d;

    public a(List list, Boolean bool, String str, List list2) {
        this.f41717a = list;
        this.f41718b = bool;
        this.f41719c = str;
        this.f41720d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            List list = aVar.f41720d;
            String str = aVar.f41719c;
            Boolean bool = aVar.f41718b;
            List list2 = aVar.f41717a;
            List list3 = this.f41717a;
            if (list3 == null ? list2 != null : !list3.equals(list2)) {
                return false;
            }
            Boolean bool2 = this.f41718b;
            if (bool2 == null ? bool != null : !bool2.equals(bool)) {
                return false;
            }
            String str2 = this.f41719c;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            List list4 = this.f41720d;
            if (list4 != null) {
                return list4.equals(list);
            }
            if (list == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f41717a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        Boolean bool = this.f41718b;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.f41719c;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        List list2 = this.f41720d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }
}
