package b3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import d5.u;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5477c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f5476b = str2;
        this.f5477c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f5462a.equals(pVar.f5462a) && Objects.equals(this.f5476b, pVar.f5476b) && Objects.equals(this.f5477c, pVar.f5477c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = u.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f5462a);
        String str = this.f5476b;
        int iHashCode = (iE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5477c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // b3.j
    public final String toString() {
        return this.f5462a + ": url=" + this.f5477c;
    }
}
