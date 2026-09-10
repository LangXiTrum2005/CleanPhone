package ads_mobile_sdk;

import ads_mobile_sdk.z71;
import android.content.Context;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration;
import com.google.gson.JsonObject;
import complexometry.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.coffeecake;
import saneness.conclusively;
import saneness.intermigration;
import saneness.pussyfooter;
import saneness.tympanoplasty;
import saneness.yardman;

/* JADX INFO: loaded from: classes.dex */
public final class z71 implements tympanoplasty {
    public final formularize a;
    public final lf2 b;
    public final Context c;
    public final x d;
    public final yb0 e;
    public final adultoid f;

    public z71(formularize baseRequest, lf2 requestConfigurationWrapper, Context context, x activityTracker, yb0 delegatingThirdPartyEventEmitter, coffeecake interstitialAdComponentProvider) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(interstitialAdComponentProvider, "interstitialAdComponentProvider");
        this.a = baseRequest;
        this.b = requestConfigurationWrapper;
        this.c = context;
        this.d = activityTracker;
        this.e = delegatingThirdPartyEventEmitter;
        this.f = interstitialAdComponentProvider;
    }

    @Override // saneness.tympanoplasty
    public final void a(jm2 transaction, h1 config, conclusively conclusivelyVar, fx2 listener) {
        fe1 adapter = (fe1) conclusivelyVar;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context contextB = this.d.b();
        if (contextB == null) {
            contextB = this.c;
        }
        Context context = contextB;
        formularize baseRequest = this.a;
        RequestConfiguration requestConfiguration = this.b.a();
        JsonObject serverParameterData = config.c;
        yb0 delegatingThirdPartyEventEmitter = this.e;
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(serverParameterData, "serverParameterData");
        Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Adapter adapter2 = adapter.a;
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration = new MediationInterstitialAdConfiguration(context, "", yardman.attabal(serverParameterData), yardman.saneness(baseRequest, adapter.a), requestConfiguration.competently(context), null, requestConfiguration.getTagForChildDirectedTreatment().getValue(), requestConfiguration.getTagForUnderAgeOfConsent().getValue(), yardman.wireman(serverParameterData, requestConfiguration), "");
        ae1 setInterstitialAd = new ae1(adapter);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(setInterstitialAd, "setInterstitialAd");
        adapter2.loadInterstitialAd(mediationInterstitialAdConfiguration, new pe1(delegatingThirdPartyEventEmitter, listener, setInterstitialAd));
    }

    @Override // saneness.tympanoplasty
    public final intermigration a(jm2 transaction, h1 config, final fe1 adapter) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        intermigration intermigrationVar = (intermigration) this.f.get();
        pussyfooter pussyfooterVar = new pussyfooter() { // from class: saneness.unsc
            @Override // saneness.pussyfooter
            public final void a() {
                z71.a(adapter, this);
            }
        };
        e90 e90Var = (e90) intermigrationVar;
        e90Var.getClass();
        e90Var.o = pussyfooterVar;
        return e90Var;
    }

    public static final void a(fe1 adapter, z71 this$0) {
        Intrinsics.checkNotNullParameter(adapter, "$adapter");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.d.b();
        if (context == null) {
            context = this$0.c;
        }
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        MediationInterstitialAd mediationInterstitialAd = adapter.d;
        if (mediationInterstitialAd == null) {
            Intrinsics.preprohormone("interstitialAd");
            mediationInterstitialAd = null;
        }
        mediationInterstitialAd.showAd(context);
    }
}
