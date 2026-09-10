package com.google.ads.mediation.mintegral.waterfall;

import android.view.View;
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
import com.mbridge.msdk.out.MBNativeHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralWaterfallNativeAd extends MintegralNativeAd {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public MBNativeHandler f19025molybdenite;

    public MintegralWaterfallNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        super(mediationNativeAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralNativeAd
    public void loadAd(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        String string = mediationNativeAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationNativeAdConfiguration.getServerParameters().getString("placement_id");
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.f19004arytenoidectomy.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        Map<String, Object> nativeProperties = MBBidNativeHandler.getNativeProperties(string2, string);
        nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.TRUE);
        nativeProperties.put("ad_num", 1);
        MBNativeHandler mBNativeHandler = new MBNativeHandler(nativeProperties, mediationNativeAdConfiguration.getContext());
        this.f19025molybdenite = mBNativeHandler;
        mBNativeHandler.setAdListener(new MintegralNativeAdListener(this, mediationNativeAdConfiguration.getContext(), this.f19004arytenoidectomy));
        this.f19025molybdenite.load();
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
        MBNativeHandler mBNativeHandler = this.f19025molybdenite;
        if (mBNativeHandler != null) {
            mBNativeHandler.registerView(view, arrayList, this.f19005kowloon);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        MBNativeHandler mBNativeHandler = this.f19025molybdenite;
        if (mBNativeHandler != null) {
            mBNativeHandler.unregisterView(view, saneness(view), this.f19005kowloon);
        }
    }
}
