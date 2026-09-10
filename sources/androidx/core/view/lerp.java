package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import java.util.Objects;

/* JADX INFO: compiled from: ViewParentCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class lerp {

    /* JADX INFO: compiled from: ViewParentCompat.java */
    public static class attabal {
        public static boolean attabal(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent.onNestedFling(view, f, f2, z);
        }

        public static boolean beachfront(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        public static void competently(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }

        public static void dern(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }

        public static void marial(ViewParent viewParent, View view, View view2, int i) {
            viewParent.onNestedScrollAccepted(view, view2, i);
        }

        public static boolean saneness(ViewParent viewParent, View view, float f, float f2) {
            return viewParent.onNestedPreFling(view, f, f2);
        }

        public static void wireman(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public static boolean attabal(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return attabal.attabal(viewParent, view, f, f2, z);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static boolean beachfront(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof yemenite) {
            return ((yemenite) viewParent).onStartNestedScroll(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return attabal.beachfront(viewParent, view, view2, i);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static void competently(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof yemenite) {
            ((yemenite) viewParent).onStopNestedScroll(view, i);
        } else if (i == 0) {
            try {
                attabal.competently(viewParent, view);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void dern(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof yemenite) {
            ((yemenite) viewParent).onNestedPreScroll(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                attabal.dern(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void marial(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof yemenite) {
            ((yemenite) viewParent).onNestedScrollAccepted(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                attabal.marial(viewParent, view, view2, i);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static boolean saneness(ViewParent viewParent, View view, float f, float f2) {
        try {
            return attabal.saneness(viewParent, view, f, f2);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static void wireman(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof sealless) {
            ((sealless) viewParent).onNestedScroll(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof yemenite) {
            ((yemenite) viewParent).onNestedScroll(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                attabal.wireman(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }
}
