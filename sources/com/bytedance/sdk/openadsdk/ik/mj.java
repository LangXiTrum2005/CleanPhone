package com.bytedance.sdk.openadsdk.ik;

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
import com.bytedance.sdk.openadsdk.utils.qd;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mj extends ViewGroup implements qt.ik {
    private final qt ri;

    public mj(Context context, qt qtVar) {
        super(context);
        this.ri = qtVar;
        qtVar.ri(this);
    }

    private View lr(FilterWord filterWord) {
        TextView textView = new TextView(getContext());
        textView.setTag(filterWord);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int iLr = qd.lr(getContext(), 8.0f);
        marginLayoutParams.leftMargin = iLr;
        marginLayoutParams.bottomMargin = iLr;
        textView.setTextColor(ri());
        textView.setText(filterWord.getName());
        textView.setPadding(iLr, iLr, iLr, iLr);
        textView.setBackground(lr());
        textView.setSelected(false);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ik.mj.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (mj.this.ri != null) {
                    if (view.isSelected()) {
                        mj.this.ri.ri(qt.ri);
                        return;
                    }
                    Object tag = view.getTag();
                    if (tag instanceof FilterWord) {
                        mj.this.ri.ri((FilterWord) tag);
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
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int childCount = getChildCount();
        int i6 = i3 - i;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i10 = i7 != 0 ? marginLayoutParams.leftMargin : 0;
            if (measuredWidth + i10 + i8 < i6) {
                i5 = i8 + i10;
            } else {
                i9 += marginLayoutParams.bottomMargin + measuredHeight;
                i5 = 0;
            }
            childAt.layout(i5, marginLayoutParams.topMargin + i9, i5 + measuredWidth, measuredHeight + i9);
            i8 = i5 + measuredWidth + marginLayoutParams.rightMargin;
            i7++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        View.MeasureSpec.getMode(i);
        View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i2);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < getChildCount()) {
            View childAt = getChildAt(i3);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            measureChild(childAt, i, i2);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i6 = i3 != 0 ? marginLayoutParams.leftMargin : 0;
            int i7 = (measuredWidth + i6) + i5 < size ? i5 + i6 : 0;
            if (i7 == 0) {
                i4 += measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            i5 = i7 + measuredWidth + marginLayoutParams.rightMargin;
            i3++;
        }
        setMeasuredDimension(size, i4);
    }

    public void ri(List<FilterWord> list) {
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            FilterWord filterWord = list.get(i);
            if (filterWord != null) {
                addView(lr(filterWord));
            }
        }
    }

    private ColorStateList ri() {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{Color.rgb(255, 44, 85), -16777216});
    }

    @Override // com.bytedance.sdk.openadsdk.ik.qt.ik
    public void ri(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                if (qt.ri.equals(filterWord)) {
                    childAt.setSelected(false);
                } else {
                    childAt.setSelected(filterWord.equals(childAt.getTag()));
                }
            }
        }
    }

    private Drawable lr() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        float fLr = qd.lr(getContext(), 5.0f);
        gradientDrawable.setCornerRadius(fLr);
        gradientDrawable.setColor(Color.parseColor("#0D000000"));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(qd.lr(getContext(), 1.0f), Color.parseColor("#FE2C55"));
        gradientDrawable2.setCornerRadius(fLr);
        gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }
}
