package com.google.ads.mediation.vungle;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.VungleError;
import com.vungle.ads.VungleWrapperFramework;
import com.vungle.ads.oilcan;
import com.vungle.ads.sealless;
import com.vungle.ads.triweekly;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class VungleInitializer implements triweekly {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final VungleInitializer f19166dern = new VungleInitializer();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final AtomicBoolean f19167attabal = new AtomicBoolean(false);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ArrayList<VungleInitializationListener> f19168saneness = new ArrayList<>();

    public interface VungleInitializationListener {
        void onInitializeError(AdError adError);

        void onInitializeSuccess();
    }

    public VungleInitializer() {
        oilcan.setIntegrationName(VungleWrapperFramework.admob, "7.7.1.0".replace('.', '_'));
    }

    public static VungleInitializer getInstance() {
        return f19166dern;
    }

    public void initialize(String str, Context context, VungleInitializationListener vungleInitializationListener) {
        if (VungleSdkWrapper.delegate.isInitialized()) {
            vungleInitializationListener.onInitializeSuccess();
        } else {
            if (this.f19167attabal.getAndSet(true)) {
                this.f19168saneness.add(vungleInitializationListener);
                return;
            }
            updateCoppaAndUnderageConsentStatus(MobileAds.getRequestConfiguration());
            VungleSdkWrapper.delegate.init(context, str, this);
            this.f19168saneness.add(vungleInitializationListener);
        }
    }

    @Override // com.vungle.ads.triweekly
    public void onError(VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Iterator<VungleInitializationListener> it = this.f19168saneness.iterator();
        while (it.hasNext()) {
            it.next().onInitializeError(adError);
        }
        this.f19168saneness.clear();
        this.f19167attabal.set(false);
    }

    @Override // com.vungle.ads.triweekly
    public void onSuccess() {
        Iterator<VungleInitializationListener> it = this.f19168saneness.iterator();
        while (it.hasNext()) {
            it.next().onInitializeSuccess();
        }
        this.f19168saneness.clear();
        this.f19167attabal.set(false);
    }

    public void updateCoppaAndUnderageConsentStatus(RequestConfiguration requestConfiguration) {
        if (requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1) {
            sealless.setCOPPAStatus(true);
        } else if (requestConfiguration.getTagForChildDirectedTreatment() == 0 || requestConfiguration.getTagForUnderAgeOfConsent() == 0) {
            sealless.setCOPPAStatus(false);
        }
    }
}
