package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import sg.bigo.ads.core.adview.g;

/* JADX INFO: loaded from: classes7.dex */
public class NativeAdView extends a<g> {
    public NativeAdView(Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.api.a
    public final /* synthetic */ sg.bigo.ads.core.adview.c a() {
        return new g(this);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
