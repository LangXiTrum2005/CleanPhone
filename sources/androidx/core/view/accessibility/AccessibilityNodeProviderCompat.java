package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AccessibilityNodeProviderCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeProvider f4546a;

    public static class AccessibilityNodeProviderApi19 extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccessibilityNodeProviderCompat f4547a;

        public AccessibilityNodeProviderApi19(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            this.f4547a = accessibilityNodeProviderCompat;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatA = this.f4547a.a(i2);
            if (accessibilityNodeInfoCompatA == null) {
                return null;
            }
            return accessibilityNodeInfoCompatA.f4534a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List findAccessibilityNodeInfosByText(String str, int i2) {
            this.f4547a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i2) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatB = this.f4547a.b(i2);
            if (accessibilityNodeInfoCompatB == null) {
                return null;
            }
            return accessibilityNodeInfoCompatB.f4534a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i2, int i3, Bundle bundle) {
            return this.f4547a.c(i2, i3, bundle);
        }
    }

    public static class AccessibilityNodeProviderApi26 extends AccessibilityNodeProviderApi19 {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f4547a.getClass();
        }
    }

    public AccessibilityNodeProviderCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4546a = new AccessibilityNodeProviderApi26(this);
        } else {
            this.f4546a = new AccessibilityNodeProviderApi19(this);
        }
    }

    public AccessibilityNodeInfoCompat a(int i2) {
        return null;
    }

    public AccessibilityNodeInfoCompat b(int i2) {
        return null;
    }

    public boolean c(int i2, int i3, Bundle bundle) {
        return false;
    }

    public AccessibilityNodeProviderCompat(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f4546a = accessibilityNodeProvider;
    }
}
