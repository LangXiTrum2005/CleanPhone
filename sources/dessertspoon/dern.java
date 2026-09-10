package dessertspoon;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: progressionUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0010\u0010\n\u001a'\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "marial", "(II)I", "", "beachfront", "(JJ)J", "c", "attabal", "(III)I", "saneness", "(JJJ)J", "start", TtmlNode.END, "step", "dern", "wireman", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class dern {
    public static final int attabal(int i, int i2, int i3) {
        return marial(marial(i, i3) - marial(i2, i3), i3);
    }

    public static final long beachfront(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }

    public static final int dern(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                return i2 - attabal(i2, i, i3);
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                return i2 + attabal(i, i2, -i3);
            }
        }
        return i2;
    }

    public static final int marial(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    public static final long saneness(long j, long j2, long j3) {
        return beachfront(beachfront(j, j3) - beachfront(j2, j3), j3);
    }

    public static final long wireman(long j, long j2, long j3) {
        if (j3 > 0) {
            return j >= j2 ? j2 : j2 - saneness(j2, j, j3);
        }
        if (j3 < 0) {
            return j <= j2 ? j2 : j2 + saneness(j, j2, -j3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
