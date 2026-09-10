package b3;

import com.google.android.gms.internal.ads.o6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f5437e;

    public a(String str, String str2, int i10, byte[] bArr) {
        super(ApicFrame.ID);
        this.f5434b = str;
        this.f5435c = str2;
        this.f5436d = i10;
        this.f5437e = bArr;
    }

    @Override // i1.b0
    public final void b(o6 o6Var) {
        o6Var.a(this.f5436d, this.f5437e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f5436d == aVar.f5436d && Objects.equals(this.f5434b, aVar.f5434b) && Objects.equals(this.f5435c, aVar.f5435c) && Arrays.equals(this.f5437e, aVar.f5437e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f5436d) * 31;
        String str = this.f5434b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5435c;
        return Arrays.hashCode(this.f5437e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // b3.j
    public final String toString() {
        return this.f5462a + ": mimeType=" + this.f5434b + ", description=" + this.f5435c;
    }
}
