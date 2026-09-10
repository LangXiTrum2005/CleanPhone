package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityEventCompat {

    public static class Api34Impl {
        public static boolean a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.isAccessibilityDataSensitive();
        }

        public static void b(AccessibilityEvent accessibilityEvent, boolean z2) {
            accessibilityEvent.setAccessibilityDataSensitive(z2);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ContentChangeType {
    }
}
