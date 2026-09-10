package com.applovin.applovin_max;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinSdk;
import io.flutter.plugin.platform.d;
import io.flutter.plugin.platform.e;
import java.util.Map;
import xi.f;
import xi.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinMAXNativeAdViewFactory extends e {
    private final f messenger;

    public AppLovinMAXNativeAdViewFactory(f fVar) {
        super(u.f53827a);
        this.messenger = fVar;
    }

    @Override // io.flutter.plugin.platform.e
    @NonNull
    public d create(@Nullable Context context, int i10, Object obj) {
        AppLovinSdk sdk = AppLovinMAX.getInstance().getSdk();
        Map map = (Map) obj;
        String str = (String) map.get("ad_unit_id");
        AppLovinMAX.d("Creating MaxNativeAdView widget with Ad Unit ID: " + str);
        return new AppLovinMAXNativeAdView(i10, str, map.containsKey("placement") ? (String) map.get("placement") : null, map.containsKey("custom_data") ? (String) map.get("custom_data") : null, map.containsKey("extra_parameters") ? (Map) map.get("extra_parameters") : null, map.containsKey("local_extra_parameters") ? (Map) map.get("local_extra_parameters") : null, this.messenger, sdk, context);
    }
}
