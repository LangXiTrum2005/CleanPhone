package b3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5466d;

    public l(String str, String str2, String str3) {
        super(InternalFrame.ID);
        this.f5464b = str;
        this.f5465c = str2;
        this.f5466d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (Objects.equals(this.f5465c, lVar.f5465c) && Objects.equals(this.f5464b, lVar.f5464b) && Objects.equals(this.f5466d, lVar.f5466d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5464b;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5465c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5466d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // b3.j
    public final String toString() {
        return this.f5462a + ": domain=" + this.f5464b + ", description=" + this.f5465c;
    }
}
