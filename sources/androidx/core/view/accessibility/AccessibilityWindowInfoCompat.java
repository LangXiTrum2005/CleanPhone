package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.core.os.LocaleListCompat;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class AccessibilityWindowInfoCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityWindowInfo f4548a;

    public static class Api21Impl {
        public static void a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        public static AccessibilityWindowInfo b(AccessibilityWindowInfo accessibilityWindowInfo, int i2) {
            return accessibilityWindowInfo.getChild(i2);
        }

        public static int c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        public static int d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        public static int e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        public static AccessibilityWindowInfo f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        public static AccessibilityNodeInfo g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        public static int h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        public static boolean i(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        public static boolean j(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        public static boolean k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        public static AccessibilityWindowInfo l() {
            return AccessibilityWindowInfo.obtain();
        }

        public static AccessibilityWindowInfo m(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }
    }

    public static class Api24Impl {
        public static AccessibilityNodeInfo a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        public static CharSequence b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    public static class Api26Impl {
        public static boolean a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    public static class Api30Impl {
        public static AccessibilityWindowInfo a() {
            return new AccessibilityWindowInfo();
        }
    }

    public static class Api33Impl {
        public static int a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getDisplayId();
        }

        public static void b(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        public static AccessibilityNodeInfoCompat c(Object obj, int i2) {
            AccessibilityNodeInfo root = ((AccessibilityWindowInfo) obj).getRoot(i2);
            if (root != null) {
                return new AccessibilityNodeInfoCompat(root, 0);
            }
            return null;
        }
    }

    public static class Api34Impl {
        public static LocaleList a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLocales();
        }

        public static long b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTransitionTimeMillis();
        }
    }

    public AccessibilityWindowInfoCompat(AccessibilityWindowInfo accessibilityWindowInfo) {
        this.f4548a = accessibilityWindowInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityWindowInfoCompat)) {
            return false;
        }
        return this.f4548a.equals(((AccessibilityWindowInfoCompat) obj).f4548a);
    }

    public final int hashCode() {
        return this.f4548a.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AccessibilityWindowInfo[id=");
        Rect rect = new Rect();
        AccessibilityWindowInfo accessibilityWindowInfo = this.f4548a;
        Api21Impl.a(accessibilityWindowInfo, rect);
        sb.append(Api21Impl.d(accessibilityWindowInfo));
        sb.append(", type=");
        int iH = Api21Impl.h(accessibilityWindowInfo);
        if (iH == 1) {
            str = "TYPE_APPLICATION";
        } else if (iH == 2) {
            str = "TYPE_INPUT_METHOD";
        } else if (iH != 3) {
            str = iH != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY";
        } else {
            str = "TYPE_SYSTEM";
        }
        sb.append(str);
        sb.append(", layer=");
        sb.append(Api21Impl.e(accessibilityWindowInfo));
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(Api21Impl.k(accessibilityWindowInfo));
        sb.append(", active=");
        sb.append(Api21Impl.j(accessibilityWindowInfo));
        sb.append(", hasParent=");
        AccessibilityWindowInfo accessibilityWindowInfoF = Api21Impl.f(accessibilityWindowInfo);
        sb.append((accessibilityWindowInfoF != null ? new AccessibilityWindowInfoCompat(accessibilityWindowInfoF) : null) != null);
        sb.append(", hasChildren=");
        sb.append(Api21Impl.c(accessibilityWindowInfo) > 0);
        sb.append(", transitionTime=");
        int i2 = Build.VERSION.SDK_INT;
        sb.append(i2 >= 34 ? Api34Impl.b(accessibilityWindowInfo) : 0L);
        sb.append(", locales=");
        sb.append(i2 >= 34 ? LocaleListCompat.g(Api34Impl.a(accessibilityWindowInfo)) : LocaleListCompat.f4353b);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
