package b3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.GeobFrame;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f5456e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.f5453b = str;
        this.f5454c = str2;
        this.f5455d = str3;
        this.f5456e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f5453b, fVar.f5453b) && Objects.equals(this.f5454c, fVar.f5454c) && Objects.equals(this.f5455d, fVar.f5455d) && Arrays.equals(this.f5456e, fVar.f5456e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5453b;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5454c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5455d;
        return Arrays.hashCode(this.f5456e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // b3.j
    public final String toString() {
        return this.f5462a + ": mimeType=" + this.f5453b + ", filename=" + this.f5454c + ", description=" + this.f5455d;
    }
}
