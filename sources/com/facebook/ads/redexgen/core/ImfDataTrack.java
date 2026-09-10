package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j8, reason: from Kotlin metadata */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\r\u000eB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack;", "", "mTrackName", "", "mStartTime", "", "mEndTime", "mStickerTrackType", "Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack$StickerTrackType;", "mSegmentMetadata", "Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack$SegmentMetadata;", "<init>", "(Ljava/lang/String;JJLcom/facebook/video/heroplayer/exocustom/ImfDataTrack$StickerTrackType;Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack$SegmentMetadata;)V", "StickerTrackType", "SegmentMetadata", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImfDataTrack {
    public static byte[] A05;
    public final long A00;
    public final long A01;
    public final C2441j6 A02;
    public final C2442j7 A03;
    public final String A04;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{72, 118, 64, 66, 72, 64, 75, 81, 104, 64, 81, 68, 65, 68, 81, 68, 92, 98, 69, 88, 82, 90, 84, 67, 101, 67, 80, 82, 90, 101, 72, 65, 84, 29, 36, 2, 17, 19, 27, 62, 17, 29, 21};
    }

    public ImfDataTrack(String str, long j, long j2, C2442j7 c2442j7, C2441j6 c2441j6) {
        C2874qY.A09(str, A00(33, 10, 89));
        C2874qY.A09(c2442j7, A00(16, 17, 24));
        C2874qY.A09(c2441j6, A00(0, 16, 12));
        this.A04 = str;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = c2442j7;
        this.A02 = c2441j6;
    }
}
