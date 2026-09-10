package outmarry;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: compiled from: AccessibilityRecordCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class cord {
    @Deprecated
    public static void attabal(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    @Deprecated
    public static void dern(AccessibilityRecord accessibilityRecord, View view, int i) {
        accessibilityRecord.setSource(view, i);
    }

    @Deprecated
    public static void saneness(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }
}
