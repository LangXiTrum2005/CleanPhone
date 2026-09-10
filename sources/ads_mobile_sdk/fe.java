package ads_mobile_sdk;

import ads_mobile_sdk.fe;
import android.content.Context;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration;
import com.google.gson.JsonObject;
import complexometry.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.coffeecake;
import saneness.conclusively;
import saneness.efficacy;
import saneness.pussyfooter;
import saneness.tympanoplasty;
import saneness.yardman;

/* JADX INFO: loaded from: classes.dex */
public final class fe implements tympanoplasty {
    public final formularize a;
    public final lf2 b;
    public final Context c;
    public final x d;
    public final yb0 e;
    public final adultoid f;

    public fe(formularize adRequest, lf2 requestConfigurationWrapper, Context context, x activityTracker, yb0 delegatingThirdPartyEventEmitter, coffeecake appOpenAdComponentProvider) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(appOpenAdComponentProvider, "appOpenAdComponentProvider");
        this.a = adRequest;
        this.b = requestConfigurationWrapper;
        this.c = context;
        this.d = activityTracker;
        this.e = delegatingThirdPartyEventEmitter;
        this.f = appOpenAdComponentProvider;
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
        formularize adRequest = this.a;
        RequestConfiguration requestConfiguration = this.b.a();
        JsonObject serverParameterData = config.c;
        yb0 delegatingThirdPartyEventEmitter = this.e;
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(serverParameterData, "serverParameterData");
        Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Adapter adapter2 = adapter.a;
        MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration = new MediationAppOpenAdConfiguration(context, "", yardman.attabal(serverParameterData), yardman.saneness(adRequest, adapter.a), requestConfiguration.competently(context), null, requestConfiguration.getTagForChildDirectedTreatment().getValue(), requestConfiguration.getTagForUnderAgeOfConsent().getValue(), yardman.wireman(serverParameterData, requestConfiguration), "");
        yd1 setAppOpenAd = new yd1(adapter);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(setAppOpenAd, "setAppOpenAd");
        adapter2.loadAppOpenAd(mediationAppOpenAdConfiguration, new le1(delegatingThirdPartyEventEmitter, listener, setAppOpenAd));
    }

    @Override // saneness.tympanoplasty
    public final efficacy a(jm2 transaction, h1 config, final fe1 adapter) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        efficacy efficacyVar = (efficacy) this.f.get();
        pussyfooter pussyfooterVar = new pussyfooter() { // from class: saneness.hydrated
            @Override // saneness.pussyfooter
            public final void a() {
                fe.a(adapter, this);
            }
        };
        a90 a90Var = (a90) efficacyVar;
        a90Var.getClass();
        a90Var.o = pussyfooterVar;
        return a90Var;
    }

    public static final void a(fe1 adapter, fe this$0) {
        Intrinsics.checkNotNullParameter(adapter, "$adapter");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.d.b();
        if (context == null) {
            context = this$0.c;
        }
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        MediationAppOpenAd mediationAppOpenAd = adapter.f;
        if (mediationAppOpenAd == null) {
            Intrinsics.preprohormone("appOpenAd");
            mediationAppOpenAd = null;
        }
        mediationAppOpenAd.showAd(context);
    }
}
