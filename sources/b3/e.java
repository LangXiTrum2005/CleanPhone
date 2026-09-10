package b3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5452d;

    public e(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.f5450b = str;
        this.f5451c = str2;
        this.f5452d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f5451c, eVar.f5451c) && Objects.equals(this.f5450b, eVar.f5450b) && Objects.equals(this.f5452d, eVar.f5452d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5450b;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5451c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5452d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // b3.j
    public final String toString() {
        return this.f5462a + ": language=" + this.f5450b + ", description=" + this.f5451c + ", text=" + this.f5452d;
    }
}
