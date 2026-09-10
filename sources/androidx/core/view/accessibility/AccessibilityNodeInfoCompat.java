package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.applovin.shadow.okio.Segment;
import com.p004ironsource.d9;
import j$.time.Duration;
import j$.time.TimeConversions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AccessibilityNodeInfoCompat {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f4533c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f4534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4535b = -1;

    public static class AccessibilityActionCompat {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final AccessibilityActionCompat f4536e = new AccessibilityActionCompat(1, (String) null);
        public static final AccessibilityActionCompat f = new AccessibilityActionCompat(2, (String) null);
        public static final AccessibilityActionCompat g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final AccessibilityActionCompat f4537h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final AccessibilityActionCompat f4538i;
        public static final AccessibilityActionCompat j;
        public static final AccessibilityActionCompat k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final AccessibilityActionCompat f4539l;
        public static final AccessibilityActionCompat m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final AccessibilityActionCompat f4540n;
        public static final AccessibilityActionCompat o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f4541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class f4543c;
        public final AccessibilityViewCommand d;

        static {
            new AccessibilityActionCompat(4, (String) null);
            new AccessibilityActionCompat(8, (String) null);
            g = new AccessibilityActionCompat(16, (String) null);
            new AccessibilityActionCompat(32, (String) null);
            new AccessibilityActionCompat(64, (String) null);
            new AccessibilityActionCompat(128, (String) null);
            new AccessibilityActionCompat(256, AccessibilityViewCommand.MoveAtGranularityArguments.class);
            new AccessibilityActionCompat(512, AccessibilityViewCommand.MoveAtGranularityArguments.class);
            new AccessibilityActionCompat(1024, AccessibilityViewCommand.MoveHtmlArguments.class);
            new AccessibilityActionCompat(com.p004ironsource.mediationsdk.metadata.a.f25965n, AccessibilityViewCommand.MoveHtmlArguments.class);
            f4537h = new AccessibilityActionCompat(4096, (String) null);
            f4538i = new AccessibilityActionCompat(Segment.SIZE, (String) null);
            new AccessibilityActionCompat(16384, (String) null);
            new AccessibilityActionCompat(32768, (String) null);
            new AccessibilityActionCompat(65536, (String) null);
            new AccessibilityActionCompat(131072, AccessibilityViewCommand.SetSelectionArguments.class);
            j = new AccessibilityActionCompat(262144, (String) null);
            k = new AccessibilityActionCompat(524288, (String) null);
            f4539l = new AccessibilityActionCompat(1048576, (String) null);
            new AccessibilityActionCompat(2097152, AccessibilityViewCommand.SetTextArguments.class);
            int i2 = Build.VERSION.SDK_INT;
            new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AccessibilityViewCommand.ScrollToPositionArguments.class);
            m = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f4540n = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            new AccessibilityActionCompat(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            new AccessibilityActionCompat(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            new AccessibilityActionCompat(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            new AccessibilityActionCompat(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            o = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AccessibilityViewCommand.SetProgressArguments.class);
            new AccessibilityActionCompat(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, AccessibilityViewCommand.MoveWindowArguments.class);
            new AccessibilityActionCompat(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            new AccessibilityActionCompat(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            new AccessibilityActionCompat(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            new AccessibilityActionCompat(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            new AccessibilityActionCompat(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            new AccessibilityActionCompat(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            new AccessibilityActionCompat(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            new AccessibilityActionCompat(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            new AccessibilityActionCompat(i2 >= 34 ? Api34Impl.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public AccessibilityActionCompat(int i2, String str) {
            this(null, i2, str, null, null);
        }

        public final int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f4541a).getId();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof AccessibilityActionCompat)) {
                return false;
            }
            Object obj2 = ((AccessibilityActionCompat) obj).f4541a;
            Object obj3 = this.f4541a;
            if (obj3 == null) {
                return obj2 == null;
            }
            return obj3.equals(obj2);
        }

        public final int hashCode() {
            Object obj = this.f4541a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
            String strD = AccessibilityNodeInfoCompat.d(this.f4542b);
            if (strD.equals("ACTION_UNKNOWN")) {
                Object obj = this.f4541a;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb.append(strD);
            return sb.toString();
        }

        public AccessibilityActionCompat(int i2, Class cls) {
            this(null, i2, null, null, cls);
        }

        public AccessibilityActionCompat(Object obj, int i2, String str, AccessibilityViewCommand accessibilityViewCommand, Class cls) {
            this.f4542b = i2;
            this.d = accessibilityViewCommand;
            if (obj == null) {
                this.f4541a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
            } else {
                this.f4541a = obj;
            }
            this.f4543c = cls;
        }
    }

    public static class Api21Impl {
        public static CollectionItemInfoCompat a(int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z2, z3));
        }
    }

    public static class Api30Impl {
        public static Object a(int i2, float f, float f2, float f3) {
            return new AccessibilityNodeInfo.RangeInfo(i2, f, f2, f3);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    public static class Api33Impl {
        public static CollectionItemInfoCompat a(boolean z2, int i2, int i3, int i4, int i5, boolean z3, String str, String str2) {
            return new CollectionItemInfoCompat(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z2).setColumnIndex(i2).setRowIndex(i3).setColumnSpan(i4).setRowSpan(i5).setSelected(z3).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static AccessibilityNodeInfoCompat b(AccessibilityNodeInfo accessibilityNodeInfo, int i2, int i3) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i2, i3);
            if (child != null) {
                return new AccessibilityNodeInfoCompat(child, 0);
            }
            return null;
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static AccessibilityNodeInfoCompat f(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
            AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i2);
            if (parent != null) {
                return new AccessibilityNodeInfoCompat(parent, 0);
            }
            return null;
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
            accessibilityNodeInfo.setTextSelectable(z2);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    public static class Api34Impl {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return TimeConversions.convert(accessibilityNodeInfo.getMinDurationBetweenContentChanges()).toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z2);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(TimeConversions.convert(Duration.ofMillis(j)));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z2) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z2);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z2);
        }
    }

    public static class CollectionInfoCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccessibilityNodeInfo.CollectionInfo f4544a;

        public CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.f4544a = collectionInfo;
        }

        public static CollectionInfoCompat a(int i2, int i3, int i4, boolean z2) {
            return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z2, i4));
        }
    }

    public static class CollectionItemInfoCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccessibilityNodeInfo.CollectionItemInfo f4545a;

        public static final class Builder {
        }

        public CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f4545a = collectionItemInfo;
        }

        public static CollectionItemInfoCompat a(int i2, int i3, int i4, int i5, boolean z2) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, false, z2));
        }
    }

    public static class RangeInfoCompat {
    }

    public static final class TouchDelegateInfoCompat {
    }

    public AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
        this.f4534a = accessibilityNodeInfo;
    }

    public static String d(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case com.p004ironsource.mediationsdk.metadata.a.f25965n /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case Segment.SIZE /* 8192 */:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i2) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i2) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public final void a(int i2) {
        this.f4534a.addAction(i2);
    }

    public final void b(AccessibilityActionCompat accessibilityActionCompat) {
        this.f4534a.addAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.f4541a);
    }

    public final ArrayList c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4534a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final boolean e(int i2) {
        Bundle extras = this.f4534a.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i2) == i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f4534a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f4534a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f4535b == accessibilityNodeInfoCompat.f4535b;
    }

    public final void f(Rect rect) {
        this.f4534a.getBoundsInParent(rect);
    }

    public final CharSequence g() {
        boolean zIsEmpty = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4534a;
        if (zIsEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList arrayListC = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList arrayListC2 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList arrayListC3 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList arrayListC4 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i2 = 0; i2 < arrayListC.size(); i2++) {
            spannableString.setSpan(new AccessibilityClickableSpanCompat(((Integer) arrayListC4.get(i2)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListC.get(i2)).intValue(), ((Integer) arrayListC2.get(i2)).intValue(), ((Integer) arrayListC3.get(i2)).intValue());
        }
        return spannableString;
    }

    public final void h(AccessibilityActionCompat accessibilityActionCompat) {
        this.f4534a.removeAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.f4541a);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4534a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(int i2, boolean z2) {
        Bundle extras = this.f4534a.getExtras();
        if (extras != null) {
            int i3 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i2);
            if (!z2) {
                i2 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }

    public final void j(CharSequence charSequence) {
        this.f4534a.setClassName(charSequence);
    }

    public final void k(CollectionInfoCompat collectionInfoCompat) {
        this.f4534a.setCollectionInfo(collectionInfoCompat == null ? null : collectionInfoCompat.f4544a);
    }

    public final void l(CollectionItemInfoCompat collectionItemInfoCompat) {
        this.f4534a.setCollectionItemInfo(collectionItemInfoCompat.f4545a);
    }

    public final void m(CharSequence charSequence) {
        this.f4534a.setContentDescription(charSequence);
    }

    public final void n(String str) {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4534a;
        if (i2 >= 26) {
            accessibilityNodeInfo.setHintText(str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    public final void o(boolean z2) {
        this.f4534a.setScrollable(z2);
    }

    public final void p(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4534a;
        if (i2 >= 30) {
            Api30Impl.c(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final void q(CharSequence charSequence) {
        this.f4534a.setText(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    public final String toString() {
        ?? arrayList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        f(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4534a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            Api34Impl.b(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(g());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(i2 >= 30 ? Api30Impl.b(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; tooltipText: ");
        sb.append(i2 >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(i2 >= 33 ? Api33Impl.g(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo.isContextClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        sb.append(i2 >= 34 ? Api34Impl.c(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(e(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(i2 >= 33 ? Api33Impl.h(accessibilityNodeInfo) : e(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(i2 >= 34 ? Api34Impl.f(accessibilityNodeInfo) : e(64));
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            arrayList = new ArrayList();
            int size = actionList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(new AccessibilityActionCompat(actionList.get(i3), 0, null, null, null));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            AccessibilityActionCompat accessibilityActionCompat = (AccessibilityActionCompat) arrayList.get(i4);
            String strD = d(accessibilityActionCompat.a());
            if (strD.equals("ACTION_UNKNOWN")) {
                Object obj = accessibilityActionCompat.f4541a;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb.append(strD);
            if (i4 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(d9.i.f24752e);
        return sb.toString();
    }

    public AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f4534a = accessibilityNodeInfo;
    }
}
