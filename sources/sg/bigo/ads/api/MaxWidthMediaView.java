package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class MaxWidthMediaView extends MediaView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46970a;

    public MaxWidthMediaView(Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int i4 = this.f46970a;
        if (i4 > 0 && size > i4) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.f46970a, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i2, i3);
    }

    public void setMaxWidth(int i2) {
        this.f46970a = i2;
    }

    public MaxWidthMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaxWidthMediaView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
