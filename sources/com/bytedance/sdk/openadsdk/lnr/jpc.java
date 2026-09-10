package com.bytedance.sdk.openadsdk.lnr;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class jpc extends ViewGroup implements to.lnr {
    private final to qdl;

    public jpc(Context context, to toVar) {
        super(context);
        this.qdl = toVar;
        toVar.qdl(this);
    }

    private View ud(FilterWord filterWord) {
        TextView textView = new TextView(getContext());
        textView.setTag(filterWord);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int iUd = ax.ud(getContext(), 8.0f);
        marginLayoutParams.leftMargin = iUd;
        marginLayoutParams.bottomMargin = iUd;
        textView.setTextColor(qdl());
        textView.setText(filterWord.getName());
        textView.setPadding(iUd, iUd, iUd, iUd);
        textView.setBackground(ud());
        textView.setSelected(false);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lnr.jpc.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (jpc.this.qdl != null) {
                    if (view.isSelected()) {
                        jpc.this.qdl.qdl(to.qdl);
                        return;
                    }
                    Object tag = view.getTag();
                    if (tag instanceof FilterWord) {
                        jpc.this.qdl.qdl((FilterWord) tag);
                    }
                }
            }
        });
        textView.setSelected(false);
        textView.setLayoutParams(marginLayoutParams);
        return textView;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int childCount = getChildCount();
        int i7 = i4 - i2;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i11 = i8 != 0 ? marginLayoutParams.leftMargin : 0;
            if (measuredWidth + i11 + i9 < i7) {
                i6 = i9 + i11;
            } else {
                i10 += marginLayoutParams.bottomMargin + measuredHeight;
                i6 = 0;
            }
            childAt.layout(i6, marginLayoutParams.topMargin + i10, i6 + measuredWidth, measuredHeight + i10);
            i9 = i6 + measuredWidth + marginLayoutParams.rightMargin;
            i8++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        View.MeasureSpec.getMode(i2);
        View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        View.MeasureSpec.getSize(i3);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < getChildCount()) {
            View childAt = getChildAt(i4);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            measureChild(childAt, i2, i3);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i7 = i4 != 0 ? marginLayoutParams.leftMargin : 0;
            int i8 = (measuredWidth + i7) + i6 < size ? i6 + i7 : 0;
            if (i8 == 0) {
                i5 += measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            i6 = i8 + measuredWidth + marginLayoutParams.rightMargin;
            i4++;
        }
        setMeasuredDimension(size, i5);
    }

    public void qdl(List<FilterWord> list) {
        if (list == null) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            FilterWord filterWord = list.get(i2);
            if (filterWord != null) {
                addView(ud(filterWord));
            }
        }
    }

    private ColorStateList qdl() {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{Color.rgb(255, 44, 85), -16777216});
    }

    @Override // com.bytedance.sdk.openadsdk.lnr.to.lnr
    public void qdl(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                if (to.qdl.equals(filterWord)) {
                    childAt.setSelected(false);
                } else {
                    childAt.setSelected(filterWord.equals(childAt.getTag()));
                }
            }
        }
    }

    private Drawable ud() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        float fUd = ax.ud(getContext(), 5.0f);
        gradientDrawable.setCornerRadius(fUd);
        gradientDrawable.setColor(Color.parseColor("#0D000000"));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(ax.ud(getContext(), 1.0f), Color.parseColor("#FE2C55"));
        gradientDrawable2.setCornerRadius(fUd);
        gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }
}
