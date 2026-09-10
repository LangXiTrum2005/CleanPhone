package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes7.dex */
public class AdOptionsView extends a<sg.bigo.ads.core.adview.b> {
    public AdOptionsView(Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.api.a
    public final /* synthetic */ sg.bigo.ads.core.adview.c a() {
        return new sg.bigo.ads.core.adview.b(this);
    }

    public AdOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(sg.bigo.ads.api.core.c cVar, String str) {
        getViewImpl().a(cVar, str);
    }

    public AdOptionsView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
