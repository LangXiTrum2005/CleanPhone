package sg.bigo.ads.ad.interstitial.e.a;

import sg.bigo.ads.api.a.m;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final boolean f46187a;

    public c(m mVar, boolean z2) {
        super(mVar.a("icon_ads.is_display_layer", 0), mVar.a("icon_ads.ad_component_layout_layer", 1), mVar.a("icon_ads.cta_color_layer", 1), mVar.a("icon_ads.icon_color_layer", 1), mVar.a("icon_ads.icon_num_layer", 20), mVar.a("icon_ads.ad_component_show_time_layer", 0), mVar.a("icon_ads.rotate_time_layer", 2), mVar.a("icon_ads.click_type_layer", 3), mVar.a("icon_ads.auto_click_layer", -1), mVar.a("icon_ads.imp_tracking_type_lyr", 0), mVar.a("icon_ads.early_tracker_value_lyr", 0));
        this.f46187a = z2;
    }

    @Override // sg.bigo.ads.ad.interstitial.e.a.b
    public final boolean a() {
        return this.f46175c == 7;
    }

    @Override // sg.bigo.ads.ad.interstitial.e.a.b
    public final int b() {
        return 10;
    }

    @Override // sg.bigo.ads.ad.interstitial.e.a.b
    public final int e() {
        if (!this.f46187a) {
            return super.e();
        }
        int i2 = this.f46175c;
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return i2;
            default:
                return 1;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.e.a.b
    public final int f() {
        int i2 = this.f46175c;
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return i2;
            default:
                return 1;
        }
    }
}
