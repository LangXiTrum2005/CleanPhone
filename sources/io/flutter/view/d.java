package io.flutter.view;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum d {
    TAP(1),
    LONG_PRESS(2),
    SCROLL_LEFT(4),
    SCROLL_RIGHT(8),
    SCROLL_UP(16),
    SCROLL_DOWN(32),
    INCREASE(64),
    DECREASE(128),
    SHOW_ON_SCREEN(NotificationCompat.FLAG_LOCAL_ONLY),
    MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
    MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
    SET_SELECTION(com.ironsource.mediationsdk.metadata.a.f29616n),
    COPY(4096),
    CUT(Segment.SIZE),
    PASTE(Http2.INITIAL_MAX_FRAME_SIZE),
    DID_GAIN_ACCESSIBILITY_FOCUS(32768),
    DID_LOSE_ACCESSIBILITY_FOCUS(C.DEFAULT_BUFFER_SEGMENT_SIZE),
    CUSTOM_ACTION(131072),
    DISMISS(262144),
    MOVE_CURSOR_FORWARD_BY_WORD(524288),
    MOVE_CURSOR_BACKWARD_BY_WORD(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES),
    SET_TEXT(2097152),
    /* JADX INFO: Fake field, exist only in values array */
    FOCUS(4194304),
    /* JADX INFO: Fake field, exist only in values array */
    SCROLL_TO_OFFSET(8388608),
    EXPAND(16777216),
    COLLAPSE(33554432);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43444a;

    d(int i10) {
        this.f43444a = i10;
    }
}
