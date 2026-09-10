package com.google.ads.mediation.mintegral.rtb;

import android.view.View;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralNativeAd;
import com.google.ads.mediation.mintegral.mediation.MintegralNativeAdListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.MBBidNativeHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralRtbNativeAd extends MintegralNativeAd {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public MBBidNativeHandler f19022molybdenite;

    public MintegralRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        super(mediationNativeAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralNativeAd
    public void loadAd(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        String string = mediationNativeAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationNativeAdConfiguration.getServerParameters().getString("placement_id");
        String bidResponse = mediationNativeAdConfiguration.getBidResponse();
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2, bidResponse);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.f19004arytenoidectomy.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        Map<String, Object> nativeProperties = MBBidNativeHandler.getNativeProperties(string2, string);
        nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.TRUE);
        nativeProperties.put("ad_num", 1);
        this.f19022molybdenite = new MBBidNativeHandler(nativeProperties, mediationNativeAdConfiguration.getContext());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationNativeAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String());
            this.f19022molybdenite.setExtraInfo(jSONObject);
        } catch (JSONException unused) {
            String str = MintegralMediationAdapter.TAG;
        }
        this.f19022molybdenite.setAdListener(new MintegralNativeAdListener(this, mediationNativeAdConfiguration.getContext(), this.f19004arytenoidectomy));
        this.f19022molybdenite.bidLoad(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        HashMap map3 = new HashMap(map);
        map3.remove("3011");
        map3.remove("3012");
        ArrayList arrayList = new ArrayList(map3.values());
        for (int i = 0; i < arrayList.size(); i++) {
            View view2 = (View) arrayList.get(i);
            if (view2 instanceof MediaView) {
                MediaView mediaView = (MediaView) view2;
                for (int i2 = 0; i2 < mediaView.getChildCount(); i2++) {
                    View childAt = mediaView.getChildAt(i2);
                    if (childAt instanceof MBMediaView) {
                        ((MBMediaView) childAt).setOnMediaViewListener(this);
                        break;
                    }
                }
                break;
            }
        }
        MBBidNativeHandler mBBidNativeHandler = this.f19022molybdenite;
        if (mBBidNativeHandler != null) {
            mBBidNativeHandler.registerView(view, arrayList, this.f19005kowloon);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        MBBidNativeHandler mBBidNativeHandler = this.f19022molybdenite;
        if (mBBidNativeHandler != null) {
            mBBidNativeHandler.unregisterView(view, saneness(view), this.f19005kowloon);
        }
    }
}
