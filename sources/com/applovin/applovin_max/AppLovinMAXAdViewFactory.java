package com.applovin.applovin_max;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxAdFormat;
import io.flutter.plugin.platform.d;
import io.flutter.plugin.platform.e;
import java.util.Map;
import xi.f;
import xi.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinMAXAdViewFactory extends e {
    private final f messenger;

    public AppLovinMAXAdViewFactory(f fVar) {
        super(u.f53827a);
        this.messenger = fVar;
    }

    @Override // io.flutter.plugin.platform.e
    @NonNull
    public d create(@Nullable Context context, int i10, Object obj) {
        Map map = (Map) obj;
        String str = (String) map.get("ad_unit_id");
        MaxAdFormat deviceSpecificBannerAdViewAdFormat = "mrec".equals((String) map.get("ad_format")) ? MaxAdFormat.MREC : AppLovinMAX.getDeviceSpecificBannerAdViewAdFormat(context);
        Integer num = map.containsKey("ad_view_id") ? (Integer) map.get("ad_view_id") : null;
        int iIntValue = num != null ? num.intValue() : 0;
        Boolean bool = Boolean.TRUE;
        return new AppLovinMAXAdView(i10, str, iIntValue, deviceSpecificBannerAdViewAdFormat, bool.equals(map.get("is_adaptive_banner_enabled")), bool.equals(map.get("is_auto_refresh_enabled")), map.containsKey("placement") ? (String) map.get("placement") : null, map.containsKey("custom_data") ? (String) map.get("custom_data") : null, map.containsKey("extra_parameters") ? (Map) map.get("extra_parameters") : null, map.containsKey("local_extra_parameters") ? (Map) map.get("local_extra_parameters") : null, this.messenger, context);
    }
}
