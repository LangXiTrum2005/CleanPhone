package i0;

import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ int a() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 < 36 ? i10 * DefaultOggSeeker.MATCH_BYTE_RANGE : Build.VERSION.SDK_INT_FULL;
    }
}
