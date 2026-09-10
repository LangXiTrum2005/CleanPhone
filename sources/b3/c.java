package b3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j[] f5444g;

    public c(String str, int i10, int i11, long j10, long j11, j[] jVarArr) {
        super(ChapterFrame.ID);
        this.f5439b = str;
        this.f5440c = i10;
        this.f5441d = i11;
        this.f5442e = j10;
        this.f5443f = j11;
        this.f5444g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f5440c == cVar.f5440c && this.f5441d == cVar.f5441d && this.f5442e == cVar.f5442e && this.f5443f == cVar.f5443f && Objects.equals(this.f5439b, cVar.f5439b) && Arrays.equals(this.f5444g, cVar.f5444g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f5440c) * 31) + this.f5441d) * 31) + ((int) this.f5442e)) * 31) + ((int) this.f5443f)) * 31;
        String str = this.f5439b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
