package t1;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f50379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f50380e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f50376a = str;
        this.f50377b = str2;
        this.f50378c = str3;
        this.f50379d = str4;
        this.f50380e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Objects.equals(this.f50376a, iVar.f50376a) && Objects.equals(this.f50377b, iVar.f50377b) && Objects.equals(this.f50378c, iVar.f50378c) && Objects.equals(this.f50379d, iVar.f50379d) && Objects.equals(this.f50380e, iVar.f50380e);
    }

    public final int hashCode() {
        String str = this.f50376a;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f50377b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f50378c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f50379d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f50380e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
