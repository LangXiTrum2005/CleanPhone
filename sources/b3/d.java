package b3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f5448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j[] f5449f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super(ChapterTocFrame.ID);
        this.f5445b = str;
        this.f5446c = z10;
        this.f5447d = z11;
        this.f5448e = strArr;
        this.f5449f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f5446c == dVar.f5446c && this.f5447d == dVar.f5447d && Objects.equals(this.f5445b, dVar.f5445b) && Arrays.equals(this.f5448e, dVar.f5448e) && Arrays.equals(this.f5449f, dVar.f5449f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.f5446c ? 1 : 0)) * 31) + (this.f5447d ? 1 : 0)) * 31;
        String str = this.f5445b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
