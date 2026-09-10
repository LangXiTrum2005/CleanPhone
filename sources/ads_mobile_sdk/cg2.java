package ads_mobile_sdk;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.imari;

/* JADX INFO: loaded from: classes.dex */
public final class cg2 extends FrameLayout {
    public liquory.attabal a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg2(Context context, liquory.attabal adSize) {
        super(context);
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = adSize;
        setMinimumHeight(imari.attabal(context, adSize.getHeight()));
        setMinimumWidth(imari.attabal(context, this.a.getWidth()));
    }

    public final void a(liquory.attabal newSize) {
        Intrinsics.checkNotNullParameter(newSize, "newSize");
        this.a = newSize;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iSaneness = newSize.getHeight();
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        setMinimumHeight((int) TypedValue.applyDimension(1, iSaneness, displayMetrics));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iWireman = newSize.getWidth();
        Intrinsics.checkNotNullParameter(context2, "<this>");
        Intrinsics.checkNotNullParameter(context2, "<this>");
        DisplayMetrics displayMetrics2 = context2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        setMinimumWidth((int) TypedValue.applyDimension(1, iWireman, displayMetrics2));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMarial;
        int iDern;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            Context context = getContext();
            liquory.attabal attabalVar = this.a;
            Intrinsics.beachfront(context);
            iMarial = attabalVar.marial(context);
            iDern = this.a.dern(context);
        } else {
            measureChild(childAt, i, i2);
            iMarial = childAt.getMeasuredWidth();
            iDern = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(p002kotlin.ranges.wireman.wireman(iMarial, getSuggestedMinimumWidth()), i), View.resolveSize(p002kotlin.ranges.wireman.wireman(iDern, getSuggestedMinimumHeight()), i2));
    }
}
