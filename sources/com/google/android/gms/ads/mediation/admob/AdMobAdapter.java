package com.google.android.gms.ads.mediation.admob;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/google/android/gms/ads/mediation/admob/AdMobAdapter;", "Lcom/google/android/gms/ads/mediation/MediationExtrasReceiver;", "()V", "buildExtrasBundle", "Landroid/os/Bundle;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "serverParameters", "Companion", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AdMobAdapter implements MediationExtrasReceiver {
    public static final String AD_JSON_PARAMETER = "adJson";
    public static final String AD_PARAMETER = "_ad";
    public static final String EXTRA_PARAMETER_DISABLE_REFRESH = "_noRefresh";
    public static final String GWHIRL_REQUEST_PARAMETER = "gw";
    public static final int GWHIRL_REQUEST_PARAMETER_VALUE = 1;
    public static final String HOUSE_ADS_PARAMETER = "mad_hac";
    public static final String NEW_BUNDLE = "_newBundle";

    public final Bundle buildExtrasBundle(Bundle extras, Bundle serverParameters) {
        Bundle bundle;
        Intrinsics.checkNotNullParameter(serverParameters, "serverParameters");
        if (Build.VERSION.SDK_INT >= 26) {
            bundle = extras != null ? extras.deepCopy() : null;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } else {
            bundle = new Bundle(extras);
        }
        if (bundle.getBoolean(NEW_BUNDLE)) {
            bundle = new Bundle(bundle);
        }
        bundle.putInt(GWHIRL_REQUEST_PARAMETER, 1);
        bundle.putString(HOUSE_ADS_PARAMETER, serverParameters.getString(HOUSE_ADS_PARAMETER));
        if (!TextUtils.isEmpty(serverParameters.getString(AD_JSON_PARAMETER))) {
            bundle.putString(AD_PARAMETER, serverParameters.getString(AD_JSON_PARAMETER));
        }
        bundle.putBoolean(EXTRA_PARAMETER_DISABLE_REFRESH, true);
        return bundle;
    }
}
