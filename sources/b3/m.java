package b3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f5470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f5471f;

    public m(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        super("MLLT");
        this.f5467b = i10;
        this.f5468c = i11;
        this.f5469d = i12;
        this.f5470e = iArr;
        this.f5471f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f5467b == mVar.f5467b && this.f5468c == mVar.f5468c && this.f5469d == mVar.f5469d && Arrays.equals(this.f5470e, mVar.f5470e) && Arrays.equals(this.f5471f, mVar.f5471f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5471f) + ((Arrays.hashCode(this.f5470e) + ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f5467b) * 31) + this.f5468c) * 31) + this.f5469d) * 31)) * 31);
    }
}
