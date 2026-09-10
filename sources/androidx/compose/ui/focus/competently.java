package androidx.compose.ui.focus;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: FocusInteropUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"", "androidDirection", "Landroidx/compose/ui/focus/saneness;", "wireman", "(I)Landroidx/compose/ui/focus/saneness;", "dern", "(I)Ljava/lang/Integer;", "androidLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "marial", "(I)Landroidx/compose/ui/unit/LayoutDirection;", "Landroid/view/View;", "Lsupplicat/taiyuan;", "attabal", "(Landroid/view/View;)Lsupplicat/taiyuan;", "direction", "Landroid/graphics/Rect;", "rect", "", "saneness", "(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class competently {
    public static final supplicat.taiyuan attabal(View view) {
        int[] iArrAttabal = beachfront.INSTANCE.attabal();
        view.getLocationInWindow(iArrAttabal);
        int i = iArrAttabal[0];
        return new supplicat.taiyuan(i, iArrAttabal[1], i + view.getWidth(), iArrAttabal[1] + view.getHeight());
    }

    public static final Integer dern(int i) {
        saneness.Companion companion = saneness.INSTANCE;
        if (saneness.formularize(i, companion.impromptu())) {
            return 33;
        }
        if (saneness.formularize(i, companion.attabal())) {
            return 130;
        }
        if (saneness.formularize(i, companion.wireman())) {
            return 17;
        }
        if (saneness.formularize(i, companion.competently())) {
            return 66;
        }
        if (saneness.formularize(i, companion.marial())) {
            return 2;
        }
        return saneness.formularize(i, companion.beachfront()) ? 1 : null;
    }

    public static final LayoutDirection marial(int i) {
        if (i == 0) {
            return LayoutDirection.Ltr;
        }
        if (i != 1) {
            return null;
        }
        return LayoutDirection.Rtl;
    }

    public static final boolean saneness(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final saneness wireman(int i) {
        if (i == 1) {
            return saneness.taiyuan(saneness.INSTANCE.beachfront());
        }
        if (i == 2) {
            return saneness.taiyuan(saneness.INSTANCE.marial());
        }
        if (i == 17) {
            return saneness.taiyuan(saneness.INSTANCE.wireman());
        }
        if (i == 33) {
            return saneness.taiyuan(saneness.INSTANCE.impromptu());
        }
        if (i == 66) {
            return saneness.taiyuan(saneness.INSTANCE.competently());
        }
        if (i != 130) {
            return null;
        }
        return saneness.taiyuan(saneness.INSTANCE.attabal());
    }
}
