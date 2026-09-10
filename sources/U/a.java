package u;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET = 1;
    public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET_MAXIMIZED = 2;
    public static final int ACTIVITY_LAYOUT_STATE_FULL_SCREEN = 5;
    public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET = 3;
    public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET_MAXIMIZED = 4;
    public static final int ACTIVITY_LAYOUT_STATE_UNKNOWN = 0;
    public static final int NAVIGATION_ABORTED = 4;
    public static final int NAVIGATION_FAILED = 3;
    public static final int NAVIGATION_FINISHED = 2;
    public static final int NAVIGATION_STARTED = 1;
    public static final String ONLINE_EXTRAS_KEY = "online";
    public static final int TAB_HIDDEN = 6;
    public static final int TAB_SHOWN = 5;

    public Bundle extraCallbackWithResult(String str, Bundle bundle) {
        return null;
    }

    public abstract void onNavigationEvent(int i10, Bundle bundle);

    public void onMessageChannelReady(Bundle bundle) {
    }

    public void onMinimized(Bundle bundle) {
    }

    public void onUnminimized(Bundle bundle) {
    }

    public void onWarmupCompleted(Bundle bundle) {
    }

    public void extraCallback(String str, Bundle bundle) {
    }

    public void onPostMessage(String str, Bundle bundle) {
    }

    public void onActivityResized(int i10, int i11, Bundle bundle) {
    }

    public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
    }

    public void onActivityLayout(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
    }
}
