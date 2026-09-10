package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.p.g;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class AdIconView extends a<sg.bigo.ads.core.adview.a> {
    public AdIconView(Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.api.a
    public final /* synthetic */ sg.bigo.ads.core.adview.c a() {
        return new sg.bigo.ads.core.adview.a(this);
    }

    public AdIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(String str, boolean z2) {
        getViewImpl().a(null, str, z2, null);
    }

    public AdIconView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public final void a(Executor executor, String str, boolean z2, g gVar) {
        getViewImpl().a(executor, str, z2, gVar);
    }
}
