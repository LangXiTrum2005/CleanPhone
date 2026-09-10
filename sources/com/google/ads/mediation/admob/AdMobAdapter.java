package com.google.ads.mediation.admob;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.ads.mediation.AbstractAdViewAdapter;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public final class AdMobAdapter extends AbstractAdViewAdapter {
    static final String AD_JSON_PARAMETER = "adJson";
    static final String AD_PARAMETER = "_ad";
    static final String HOUSE_ADS_PARAMETER = "mad_hac";

    @NonNull
    public static final String NEW_BUNDLE = "_newBundle";

    @Override // com.google.ads.mediation.AbstractAdViewAdapter
    @NonNull
    public Bundle buildExtrasBundle(@NonNull Bundle bundle, @NonNull Bundle bundle2) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle.getBoolean(NEW_BUNDLE)) {
            bundle = new Bundle(bundle);
        }
        bundle.putInt("gw", 1);
        bundle.putString(HOUSE_ADS_PARAMETER, bundle2.getString(HOUSE_ADS_PARAMETER));
        if (!TextUtils.isEmpty(bundle2.getString(AD_JSON_PARAMETER))) {
            bundle.putString(AD_PARAMETER, bundle2.getString(AD_JSON_PARAMETER));
        }
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }
}
