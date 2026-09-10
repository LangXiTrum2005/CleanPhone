package com.smartdigimkt.expressad.video.dynview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.smartdigimkt.q2.a;

/* JADX INFO: loaded from: classes5.dex */
public class ObservableScrollView extends HorizontalScrollView {
    private a e0;

    public ObservableScrollView(Context context) {
        super(context);
        this.e0 = null;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i2) {
        super.fling(i2 / 4);
    }

    @Override // android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        a aVar = this.e0;
        if (aVar != null) {
            aVar.a(this, i2, i3, i4, i5);
        }
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e0 = null;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = null;
    }
}
