package frenchy;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3414a2;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: _ComparisonsJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0004\u001a/\u0010\u0004\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\b\u001a\u00020\u0007\"\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "taiyuan", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", C3414a2.d, "impromptu", "(I[I)I", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
public class dern extends saneness {
    public static int impromptu(int i, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i2 : other) {
            i = Math.max(i, i2);
        }
        return i;
    }

    public static <T extends Comparable<? super T>> T taiyuan(T a, T b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return a.compareTo(b) >= 0 ? a : b;
    }
}
