package sg.bigo.ads.ad.interstitial.d;

import android.view.ViewGroup;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;

/* JADX INFO: loaded from: classes7.dex */
public class c extends b {
    public c(sg.bigo.ads.ad.b.c cVar) {
        super(cVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.b
    public final void E() {
        super.E();
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = ((b) this).y;
        if (realtimeBlurLinearLayout != null) {
            ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += -sg.bigo.ads.common.utils.e.a(((b) this).y.getContext(), 60);
                ((b) this).y.requestLayout();
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.b
    public int z() {
        return R.id.inter_component_20;
    }
}
