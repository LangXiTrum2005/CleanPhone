package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.ironsource.InterfaceC0435l1;
import com.storage.androidcleaner.R;
import java.util.WeakHashMap;
import m0.s0;
import p.r1;
import p.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends s1 {
    public AlertDialogLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int i(View view) {
        WeakHashMap weakHashMap = s0.f45746a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return i(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    @Override // p.s1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int paddingLeft = getPaddingLeft();
        int i17 = i12 - i10;
        int paddingRight = i17 - getPaddingRight();
        int paddingRight2 = (i17 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i18 = gravity & InterfaceC0435l1.d.b.f29113j;
        int i19 = gravity & 8388615;
        int paddingTop = i18 != 16 ? i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - measuredHeight : (((i13 - i11) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                r1 r1Var = (r1) childAt.getLayoutParams();
                int i21 = ((LinearLayout.LayoutParams) r1Var).gravity;
                if (i21 < 0) {
                    i21 = i19;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i16 = ((LinearLayout.LayoutParams) r1Var).leftMargin + paddingLeft;
                    } else {
                        i14 = paddingRight - measuredWidth;
                        i15 = ((LinearLayout.LayoutParams) r1Var).rightMargin;
                    }
                    if (h(i20)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i22 = paddingTop + ((LinearLayout.LayoutParams) r1Var).topMargin;
                    childAt.layout(i16, i22, measuredWidth + i16, i22 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) r1Var).bottomMargin + i22;
                } else {
                    i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) r1Var).leftMargin;
                    i15 = ((LinearLayout.LayoutParams) r1Var).rightMargin;
                }
                i16 = i14 - i15;
                if (h(i20)) {
                    paddingTop += intrinsicHeight;
                }
                int i23 = paddingTop + ((LinearLayout.LayoutParams) r1Var).topMargin;
                childAt.layout(i16, i23, measuredWidth + i16, i23 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) r1Var).bottomMargin + i23;
            }
        }
    }

    @Override // p.s1, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iCombineMeasuredStates;
        int i12;
        int measuredHeight;
        int measuredHeight2;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = alertDialogLayout.getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == R.id.topPanel) {
                    view = childAt;
                } else if (id2 == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id2 != R.id.contentPanel && id2 != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i10, i11);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i10);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i10, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i10, 0);
            i12 = i(view2);
            measuredHeight = view2.getMeasuredHeight() - i12;
            paddingBottom += i12;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            i12 = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i10, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i14 = size - paddingBottom;
        if (view2 != null) {
            int i15 = paddingBottom - i12;
            int iMin = Math.min(i14, measuredHeight);
            if (iMin > 0) {
                i14 -= iMin;
                i12 += iMin;
            }
            view2.measure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
            paddingBottom = i15 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i14 > 0) {
            view3.measure(i10, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i14, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = alertDialogLayout.getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        int i17 = i11;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + iMax, i10, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i17, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i18 = 0;
            while (i18 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i18);
                if (childAt3.getVisibility() != 8) {
                    r1 r1Var = (r1) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) r1Var).width == -1) {
                        int i19 = ((LinearLayout.LayoutParams) r1Var).height;
                        ((LinearLayout.LayoutParams) r1Var).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i17, 0);
                        ((LinearLayout.LayoutParams) r1Var).height = i19;
                    }
                }
                i18++;
                alertDialogLayout = this;
                i17 = i11;
            }
        }
    }
}
