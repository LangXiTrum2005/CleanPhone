package com.google.ads.mediation.mintegral.rtb;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.ads.mediation.mintegral.FlagValueGetter;
import com.google.ads.mediation.mintegral.MintegralFactory;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralSlotIdentifier;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralAppOpenAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralRtbAppOpenAd extends MintegralAppOpenAd {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public String f19020graveside;

    public MintegralRtbAppOpenAd(MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, FlagValueGetter flagValueGetter) {
        super(mediationAdLoadCallback, flagValueGetter);
    }

    public final void attabal(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, str);
            this.f18995polloi.setExtraInfo(jSONObject);
        } catch (JSONException unused) {
            String str2 = MintegralMediationAdapter.TAG;
        }
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralAppOpenAd
    public void loadAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString("ad_unit_id");
        String string2 = serverParameters.getString("placement_id");
        String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
        this.f19020graveside = bidResponse;
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2, bidResponse);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.f18992kowloon.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        if (this.f18993molybdenite.shouldRestrictMultipleAdLoads()) {
            MintegralSlotIdentifier mintegralSlotIdentifier = new MintegralSlotIdentifier(string, string2);
            this.f18991arytenoidectomy = mintegralSlotIdentifier;
            MintegralMediationAdapter.loadedSlotIdentifiers.put(mintegralSlotIdentifier, new WeakReference<>(this));
        }
        this.f18995polloi = MintegralFactory.createSplashAdWrapper();
        String str = mediationAppOpenAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String();
        if (!TextUtils.isEmpty(str)) {
            attabal(str);
        }
        this.f18995polloi.createAd(string2, string);
        this.f18995polloi.setSplashLoadListener(this);
        this.f18995polloi.setSplashShowListener(this);
        this.f18995polloi.preLoadByToken(this.f19020graveside);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        Activity activity = (Activity) context;
        if (this.f18995polloi != null) {
            RelativeLayout relativeLayout = new RelativeLayout(activity);
            ((ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content)).addView(relativeLayout);
            this.f18995polloi.show(relativeLayout, this.f19020graveside);
        }
    }
}
