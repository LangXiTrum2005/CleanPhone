package n0;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import m0.d0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f46328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f46329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f46330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f46331f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46333b;

    static {
        new b(null, 1, null);
        new b(null, 2, null);
        new b(null, 4, null);
        new b(null, 8, null);
        new b(null, 16, null);
        new b(null, 32, null);
        new b(null, 64, null);
        new b(null, 128, null);
        new b(null, NotificationCompat.FLAG_LOCAL_ONLY, f.class);
        new b(null, 512, f.class);
        new b(null, 1024, g.class);
        new b(null, com.ironsource.mediationsdk.metadata.a.f29616n, g.class);
        f46328c = new b(null, 4096, null);
        f46329d = new b(null, Segment.SIZE, null);
        new b(null, Http2.INITIAL_MAX_FRAME_SIZE, null);
        new b(null, 32768, null);
        new b(null, C.DEFAULT_BUFFER_SEGMENT_SIZE, null);
        new b(null, 131072, k.class);
        new b(null, 262144, null);
        new b(null, 524288, null);
        new b(null, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, null);
        new b(null, 2097152, l.class);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, i.class);
        f46330e = new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null);
        f46331f = new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null);
        int i10 = Build.VERSION.SDK_INT;
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, j.class);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, h.class);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD, R.id.accessibilityActionPressAndHold, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER, R.id.accessibilityActionImeEnter, null);
        new b(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null);
        new b(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null);
        new b(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null);
        new b(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null);
        new b(i10 >= 34 ? d0.a() : null, R.id.accessibilityActionScrollInDirection, null);
        int i11 = i0.c.f42485a;
        new b((i10 < 36 || i0.b.a() < 3600001) ? null : d.a(), R.id.ALT, null);
    }

    public b(Object obj, int i10, Class cls) {
        this.f46333b = i10;
        if (obj == null) {
            this.f46332a = new AccessibilityNodeInfo.AccessibilityAction(i10, null);
        } else {
            this.f46332a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        Object obj2 = ((b) obj).f46332a;
        Object obj3 = this.f46332a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f46332a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String strB = e.b(this.f46333b);
        if (strB.equals("ACTION_UNKNOWN")) {
            Object obj = this.f46332a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strB = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(strB);
        return sb2.toString();
    }
}
