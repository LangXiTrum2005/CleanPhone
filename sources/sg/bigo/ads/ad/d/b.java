package sg.bigo.ads.ad.d;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.m;
import sg.bigo.ads.ad.interstitial.o;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes7.dex */
public class b extends m implements sg.bigo.ads.ad.banner.c.a {
    public b(Activity activity) {
        super(activity);
        activity.overridePendingTransition(0, 0);
    }

    @Override // sg.bigo.ads.ad.interstitial.m, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void D() {
        super.D();
        ((o) this.y).f46452z.o = null;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean O() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.m, sg.bigo.ads.ad.interstitial.i
    public final int R() {
        return R.layout.bigo_ad_activity_popup_banner;
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void X() {
        super.X();
        this.f47011I.overridePendingTransition(0, 0);
    }

    @Override // sg.bigo.ads.ad.banner.c.a
    public final void a(int i2, int i3) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.f47011I, 10) + i2;
        layoutParams.leftMargin = Math.max((i3 - this.f46325A.getMeasuredWidth()) - sg.bigo.ads.common.utils.e.a(this.f47011I, 10), 0);
        layoutParams.setMarginStart(Math.max((i3 - this.f46325A.getMeasuredWidth()) - sg.bigo.ads.common.utils.e.a(this.f47011I, 10), 0));
        this.f46325A.setLayoutParams(layoutParams);
    }

    @Override // sg.bigo.ads.ad.interstitial.m, sg.bigo.ads.ad.interstitial.i
    public final void g(int i2) {
        super.g(i2);
        T t = this.y;
        if (t != 0) {
            ((o) t).f46452z.o = this;
            AdCountDownButton adCountDownButton = this.f46325A;
            if (adCountDownButton != null) {
                adCountDownButton.setShowCloseButtonInCountdown(false);
                this.f46325A.setTakeoverTickEvent(false);
                this.f46325A.a(((o) this.y).x(), (AdCountDownButton.b) null);
            }
        }
        final View viewO = o(R.id.inter_container);
        final View viewO2 = o(R.id.inter_banner_container);
        u.a(viewO, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.d.b.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                sg.bigo.ads.common.w.b.a(sg.bigo.ads.common.utils.b.a(2), viewO);
                sg.bigo.ads.common.utils.b.a(viewO2);
            }
        });
    }
}
