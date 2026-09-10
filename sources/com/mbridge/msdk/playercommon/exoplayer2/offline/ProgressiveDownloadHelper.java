package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProgressiveDownloadHelper extends DownloadHelper {

    @Nullable
    private final String customCacheKey;
    private final Uri uri;

    public ProgressiveDownloadHelper(Uri uri) {
        this(uri, null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    public DownloadAction getDownloadAction(@Nullable byte[] bArr, List<TrackKey> list) {
        return new ProgressiveDownloadAction(this.uri, false, bArr, this.customCacheKey);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    public int getPeriodCount() {
        return 1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    public DownloadAction getRemoveAction(@Nullable byte[] bArr) {
        return new ProgressiveDownloadAction(this.uri, true, bArr, this.customCacheKey);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    public TrackGroupArray getTrackGroups(int i10) {
        return TrackGroupArray.EMPTY;
    }

    public ProgressiveDownloadHelper(Uri uri, @Nullable String str) {
        this.uri = uri;
        this.customCacheKey = str;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    public void prepareInternal() {
    }
}
