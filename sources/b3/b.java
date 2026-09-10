package b3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import d5.u;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f5438b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f5438b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f5462a.equals(bVar.f5462a) && Arrays.equals(this.f5438b, bVar.f5438b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5438b) + u.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f5462a);
    }
}
