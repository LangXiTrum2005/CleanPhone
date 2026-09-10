package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerCompat {

    @Deprecated
    public interface AccessibilityStateChangeListener {
    }

    @Deprecated
    public static abstract class AccessibilityStateChangeListenerCompat implements AccessibilityStateChangeListener {
    }

    public static class AccessibilityStateChangeListenerWrapper implements AccessibilityManager.AccessibilityStateChangeListener {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccessibilityStateChangeListenerWrapper)) {
                return false;
            }
            ((AccessibilityStateChangeListenerWrapper) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public final void onAccessibilityStateChanged(boolean z2) {
            throw null;
        }
    }

    public static class Api34Impl {
        public static boolean a(AccessibilityManager accessibilityManager) {
            return accessibilityManager.isRequestFromAccessibilityTool();
        }
    }

    public interface TouchExplorationStateChangeListener {
        void onTouchExplorationStateChanged(boolean z2);
    }

    public static final class TouchExplorationStateChangeListenerWrapper implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TouchExplorationStateChangeListener f4532a;

        public TouchExplorationStateChangeListenerWrapper(TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            this.f4532a = touchExplorationStateChangeListener;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TouchExplorationStateChangeListenerWrapper) {
                return this.f4532a.equals(((TouchExplorationStateChangeListenerWrapper) obj).f4532a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f4532a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public final void onTouchExplorationStateChanged(boolean z2) {
            this.f4532a.onTouchExplorationStateChanged(z2);
        }
    }

    public static void a(AccessibilityManager accessibilityManager, TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        accessibilityManager.addTouchExplorationStateChangeListener(new TouchExplorationStateChangeListenerWrapper(touchExplorationStateChangeListener));
    }

    public static void b(AccessibilityManager accessibilityManager, TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        accessibilityManager.removeTouchExplorationStateChangeListener(new TouchExplorationStateChangeListenerWrapper(touchExplorationStateChangeListener));
    }
}
