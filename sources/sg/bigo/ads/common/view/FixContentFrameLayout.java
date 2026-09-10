package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import sg.bigo.ads.common.p;

/* JADX INFO: loaded from: classes7.dex */
public class FixContentFrameLayout extends RoundedFrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f47567a;

    public static class a extends FrameLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f47569b;

        public a() {
            super(-1, -1);
        }
    }

    public FixContentFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof a) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        p pVar;
        if (!this.f47567a) {
            super.onMeasure(i2, i3);
            return;
        }
        int defaultSize = View.getDefaultSize(Integer.MIN_VALUE, i2);
        int defaultSize2 = View.getDefaultSize(Integer.MIN_VALUE, i3);
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                if (aVar.f47568a <= 0 || aVar.f47569b <= 0) {
                    pVar = new p(defaultSize, defaultSize2);
                } else {
                    aVar.setMargins(0, 0, 0, 0);
                    pVar = p.a(aVar.f47568a, aVar.f47569b, defaultSize, defaultSize2);
                }
                iMax = Math.max(iMax, pVar.f47362b);
                iMax2 = Math.max(iMax2, pVar.f47363c);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, pVar.f47362b), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, pVar.f47363c), 1073741824));
            }
        }
        setMeasuredDimension(iMax, iMax2);
    }

    public void setFixContent(boolean z2) {
        if (z2) {
            setPadding(0, 0, 0, 0);
        }
        if (z2 != this.f47567a) {
            this.f47567a = z2;
            requestLayout();
        }
    }

    public FixContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a();
    }

    public FixContentFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setFixContent(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* synthetic */ FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a();
    }
}
