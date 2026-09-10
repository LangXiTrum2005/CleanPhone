package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes7.dex */
public class WrapContentViewFlow extends ViewFlow {
    public WrapContentViewFlow(Context context) {
        this(context, null);
    }

    @Override // sg.bigo.ads.common.view.ViewFlow, android.view.View
    public void onMeasure(int i2, int i3) {
        int defaultSize = View.getDefaultSize(Integer.MIN_VALUE, i2);
        int defaultSize2 = View.getDefaultSize(Integer.MIN_VALUE, i3);
        this.j = Math.min(defaultSize / 10, this.f47629i);
        ((ViewFlow) this).f47624a = Math.min(Math.max(0, ((ViewFlow) this).f47624a), ((ViewFlow) this).f47625b - 1);
        int i4 = defaultSize - (this.d * 2);
        int childCount = getChildCount();
        int iMax = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                if (childAt == this.f47627e || childAt == this.f) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 0));
                } else {
                    ViewFlow.b bVar = (ViewFlow.b) childAt.getLayoutParams();
                    if (bVar != null) {
                        int i6 = ((ViewGroup.LayoutParams) bVar).width;
                        childAt.measure(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : ViewGroup.getChildMeasureSpec(i2, this.d * 2, i6), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 0));
                        iMax = Math.max(iMax, childAt.getMeasuredHeight());
                    }
                }
            }
        }
        setMeasuredDimension(defaultSize, Math.min(iMax, defaultSize2));
    }

    public WrapContentViewFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
