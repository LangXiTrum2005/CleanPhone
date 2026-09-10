package ads_mobile_sdk;

import ads_mobile_sdk.lh2;
import android.content.Context;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration;
import com.google.gson.JsonObject;
import complexometry.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.coffeecake;
import saneness.conclusively;
import saneness.couple;
import saneness.pussyfooter;
import saneness.tympanoplasty;
import saneness.yardman;

/* JADX INFO: loaded from: classes.dex */
public final class lh2 implements tympanoplasty {
    public final yf2 a;
    public final formularize b;
    public final lf2 c;
    public final Context d;
    public final x e;
    public final yb0 f;
    public final adultoid g;

    public lh2(yf2 requestType, formularize baseRequest, lf2 requestConfigurationWrapper, Context context, x activityTracker, yb0 delegatingThirdPartyEventEmitter, coffeecake rewardedAdComponentProvider) {
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(rewardedAdComponentProvider, "rewardedAdComponentProvider");
        this.a = requestType;
        this.b = baseRequest;
        this.c = requestConfigurationWrapper;
        this.d = context;
        this.e = activityTracker;
        this.f = delegatingThirdPartyEventEmitter;
        this.g = rewardedAdComponentProvider;
    }

    @Override // saneness.tympanoplasty
    public final void a(jm2 transaction, h1 config, conclusively conclusivelyVar, fx2 listener) {
        fe1 adapter = (fe1) conclusivelyVar;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.a == yf2.k) {
            Context context = this.d;
            formularize baseRequest = this.b;
            RequestConfiguration requestConfiguration = this.c.a();
            JsonObject serverParameterData = config.c;
            yb0 delegatingThirdPartyEventEmitter = this.f;
            adapter.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
            Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
            Intrinsics.checkNotNullParameter(serverParameterData, "serverParameterData");
            Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
            Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
            Adapter adapter2 = adapter.a;
            MediationRewardedAdConfiguration mediationRewardedAdConfiguration = new MediationRewardedAdConfiguration(context, "", yardman.attabal(serverParameterData), yardman.saneness(baseRequest, adapter.a), requestConfiguration.competently(context), null, requestConfiguration.getTagForChildDirectedTreatment().getValue(), requestConfiguration.getTagForUnderAgeOfConsent().getValue(), yardman.wireman(serverParameterData, requestConfiguration), "");
            ee1 setRewardedAd = new ee1(adapter);
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
            Intrinsics.checkNotNullParameter(setRewardedAd, "setRewardedAd");
            adapter2.loadRewardedInterstitialAd(mediationRewardedAdConfiguration, new te1(delegatingThirdPartyEventEmitter, listener, setRewardedAd));
            return;
        }
        Context contextB = this.e.b();
        if (contextB == null) {
            contextB = this.d;
        }
        Context context2 = contextB;
        formularize baseRequest2 = this.b;
        RequestConfiguration requestConfiguration2 = this.c.a();
        JsonObject serverParameterData2 = config.c;
        yb0 delegatingThirdPartyEventEmitter2 = this.f;
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(baseRequest2, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration2, "requestConfiguration");
        Intrinsics.checkNotNullParameter(serverParameterData2, "serverParameterData");
        Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter2, "delegatingThirdPartyEventEmitter");
        Adapter adapter3 = adapter.a;
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = new MediationRewardedAdConfiguration(context2, "", yardman.attabal(serverParameterData2), yardman.saneness(baseRequest2, adapter.a), requestConfiguration2.competently(context2), null, requestConfiguration2.getTagForChildDirectedTreatment().getValue(), requestConfiguration2.getTagForUnderAgeOfConsent().getValue(), yardman.wireman(serverParameterData2, requestConfiguration2), "");
        de1 setRewardedAd2 = new de1(adapter);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter2, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(setRewardedAd2, "setRewardedAd");
        adapter3.loadRewardedAd(mediationRewardedAdConfiguration2, new te1(delegatingThirdPartyEventEmitter2, listener, setRewardedAd2));
    }

    @Override // saneness.tympanoplasty
    public final couple a(jm2 transaction, h1 config, final fe1 adapter) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        couple coupleVar = (couple) this.g.get();
        pussyfooter pussyfooterVar = new pussyfooter() { // from class: saneness.dreadnaught
            @Override // saneness.pussyfooter
            public final void a() {
                lh2.a(adapter, this);
            }
        };
        i90 i90Var = (i90) coupleVar;
        i90Var.getClass();
        i90Var.o = pussyfooterVar;
        return i90Var;
    }

    public static final void a(fe1 adapter, lh2 this$0) {
        Intrinsics.checkNotNullParameter(adapter, "$adapter");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.e.b();
        if (context == null) {
            context = this$0.d;
        }
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        MediationRewardedAd mediationRewardedAd = adapter.e;
        if (mediationRewardedAd == null) {
            Intrinsics.preprohormone("rewardedAd");
            mediationRewardedAd = null;
        }
        mediationRewardedAd.showAd(context);
    }
}
