package sg.bigo.ads.ad.interstitial.e.a;

import sg.bigo.ads.api.a.m;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends b {
    public a(m mVar) {
        super(mVar.a("icon_ads.is_display_endpage", 0), mVar.a("icon_ads.ad_component_layout_endpage", 1), mVar.a("icon_ads.cta_color_endpage", 1), mVar.a("icon_ads.icon_color_endpage", 1), mVar.a("icon_ads.icon_num_endpage", 20), mVar.a("icon_ads.ad_component_show_time_endpage", 0), mVar.a("icon_ads.rotate_time_endpage", 2), mVar.a("icon_ads.click_type_endpage", 3), mVar.a("icon_ads.auto_click_endpage", -1), mVar.a("icon_ads.imp_tracking_type_ep", 0), mVar.a("icon_ads.early_tracker_value_ep", 0));
    }

    @Override // sg.bigo.ads.ad.interstitial.e.a.b
    public final boolean a() {
        return this.f46175c == 5;
    }

    @Override // sg.bigo.ads.ad.interstitial.e.a.b
    public final int b() {
        return 4;
    }
}
