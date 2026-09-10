package com.smartdigimkt.expressad.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

/* JADX INFO: loaded from: classes5.dex */
public class FeedbackRadioGroup extends RadioGroup {
    private static final String e0 = "FeedbackRadioGroup";

    public FeedbackRadioGroup(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (getPaddingRight() + childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + paddingLeft + marginLayoutParams.rightMargin > i4 - i2) {
                paddingLeft = getPaddingLeft();
                paddingTop += iMax;
                iMax = getChildAt(i6).getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            } else {
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            }
            int i7 = marginLayoutParams.leftMargin + paddingLeft;
            int i8 = marginLayoutParams.topMargin + paddingTop;
            childAt.layout(i7, i8, childAt.getMeasuredWidth() + i7, childAt.getMeasuredHeight() + i8);
            paddingLeft += childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int iMax;
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        measureChildren(i2, i3);
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        int iMax2 = 0;
        int i6 = 0;
        int iMax3 = 0;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i7 = i6 + measuredWidth;
            if (getPaddingRight() + getPaddingLeft() + i7 > size) {
                iMax = Math.max(i6, iMax2);
                i5 += iMax3;
                iMax3 = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                Log.v(e0, "maxHeight:" + i5 + "---maxWidth:" + iMax);
            } else {
                iMax3 = Math.max(iMax3, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                measuredWidth = i7;
                iMax = iMax2;
            }
            if (i4 == childCount - 1) {
                i5 += iMax3;
                iMax2 = Math.max(measuredWidth, iMax2);
            } else {
                iMax2 = iMax;
            }
            i4++;
            i6 = measuredWidth;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + i5;
        if (mode != 1073741824) {
            size = paddingRight;
        }
        if (mode2 != 1073741824) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public FeedbackRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
