package com.google.ads.mediation.facebook;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;

/* JADX INFO: compiled from: FacebookInitializer.java */
/* JADX INFO: loaded from: classes2.dex */
public class attabal implements AudienceNetworkAds.InitListener {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static attabal f18842wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public boolean f18843attabal = false;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f18845saneness = false;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ArrayList<InterfaceC0284attabal> f18844dern = new ArrayList<>();

    /* JADX INFO: renamed from: com.google.ads.mediation.facebook.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FacebookInitializer.java */
    public interface InterfaceC0284attabal {
        void onInitializeError(AdError adError);

        void onInitializeSuccess();
    }

    public static attabal attabal() {
        if (f18842wireman == null) {
            f18842wireman = new attabal();
        }
        return f18842wireman;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.f18843attabal = false;
        this.f18845saneness = initResult.isSuccess();
        for (InterfaceC0284attabal interfaceC0284attabal : this.f18844dern) {
            if (initResult.isSuccess()) {
                interfaceC0284attabal.onInitializeSuccess();
            } else {
                interfaceC0284attabal.onInitializeError(new AdError(104, initResult.getMessage(), "com.google.ads.mediation.facebook"));
            }
        }
        this.f18844dern.clear();
    }

    public void saneness(Context context, ArrayList<String> arrayList, InterfaceC0284attabal interfaceC0284attabal) {
        if (this.f18843attabal) {
            this.f18844dern.add(interfaceC0284attabal);
        } else {
            if (this.f18845saneness) {
                interfaceC0284attabal.onInitializeSuccess();
                return;
            }
            this.f18843attabal = true;
            attabal().f18844dern.add(interfaceC0284attabal);
            AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.21.0.0").withPlacementIds(arrayList).withInitListener(this).initialize();
        }
    }
}
