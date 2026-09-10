package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import sg.bigo.ads.api.MediaView;

/* JADX INFO: loaded from: classes7.dex */
public class MaximumHeightMediaView extends MediaView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45734a;

    public MaximumHeightMediaView(Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i3);
        int i4 = this.f45734a;
        if (i4 > 0 && size > i4) {
            i3 = View.MeasureSpec.makeMeasureSpec(this.f45734a, View.MeasureSpec.getMode(i3));
        }
        super.onMeasure(i2, i3);
    }

    public void setMaxHeight(int i2) {
        this.f45734a = i2;
    }

    public MaximumHeightMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaximumHeightMediaView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
