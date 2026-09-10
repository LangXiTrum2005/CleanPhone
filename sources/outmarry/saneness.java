package outmarry;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: AccessibilityEventCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {
    @Deprecated
    public static int attabal(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @Deprecated
    public static void saneness(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
