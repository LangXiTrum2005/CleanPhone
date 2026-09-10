package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes7.dex */
public class AutoNextLineLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f47560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f47561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f47562c;
    int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Hashtable f47563e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f47564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f47565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f47566c;
        int d;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public AutoNextLineLinearLayout(Context context) {
        super(context);
        this.f47563e = new Hashtable();
    }

    private int a(int i2, int i3) {
        if (i2 <= 0) {
            return getPaddingLeft();
        }
        int i4 = i3 - 1;
        return getChildAt(i4).getMeasuredWidth() + a(i2 - 1, i4) + 30;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            a aVar = (a) this.f47563e.get(childAt);
            if (aVar != null) {
                childAt.layout(aVar.f47564a, aVar.f47565b, aVar.f47566c, aVar.d);
            } else {
                Log.i("MyLayout", "error");
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int childCount = getChildCount();
        byte b2 = 0;
        this.f47560a = 0;
        this.f47561b = 0;
        this.f47562c = 5;
        this.d = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            childAt.measure(0, 0);
            int measuredWidth = childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight();
            i4 += measuredWidth;
            a aVar = new a(b2);
            int iA = a(i7 - i5, i7);
            this.f47560a = iA;
            this.f47561b = childAt.getMeasuredWidth() + iA;
            if (i4 >= size) {
                this.f47560a = 0;
                this.f47561b = childAt.getMeasuredWidth();
                this.f47562c = i6 + measuredHeight + layoutParams.topMargin;
                i5 = i7;
                i4 = measuredWidth;
            }
            int measuredHeight2 = childAt.getMeasuredHeight() + this.f47562c + layoutParams.bottomMargin;
            this.d = measuredHeight2;
            i6 = this.f47562c;
            aVar.f47564a = this.f47560a;
            aVar.f47565b = i6 + 3;
            aVar.f47566c = this.f47561b;
            aVar.d = measuredHeight2;
            this.f47563e.put(childAt, aVar);
        }
        setMeasuredDimension(size, this.d);
    }

    public AutoNextLineLinearLayout(Context context, int i2, int i3) {
        super(context);
        this.f47563e = new Hashtable();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LinearLayout.LayoutParams(0, 0);
    }

    public AutoNextLineLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47563e = new Hashtable();
    }
}
