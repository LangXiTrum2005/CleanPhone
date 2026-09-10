package b3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f5473c;

    public n(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.f5472b = str;
        this.f5473c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f5472b, nVar.f5472b) && Arrays.equals(this.f5473c, nVar.f5473c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5472b;
        return Arrays.hashCode(this.f5473c) + ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // b3.j
    public final String toString() {
        return this.f5462a + ": owner=" + this.f5472b;
    }
}
