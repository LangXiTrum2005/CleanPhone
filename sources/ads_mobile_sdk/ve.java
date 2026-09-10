package ads_mobile_sdk;

import ads_mobile_sdk.ve;
import android.content.Context;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration;
import complexometry.formularize;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.coffeecake;
import saneness.conclusively;
import saneness.efficacy;
import saneness.pussyfooter;
import saneness.tympanoplasty;
import saneness.yardman;

/* JADX INFO: loaded from: classes.dex */
public final class ve implements tympanoplasty {
    public final formularize a;
    public final lf2 b;
    public final Context c;
    public final x d;
    public final yb0 e;
    public final adultoid f;

    public ve(formularize adRequest, lf2 requestConfigurationWrapper, Context context, x activityTracker, yb0 delegatingThirdPartyEventEmitter, coffeecake appOpenAdComponentProvider) {
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
        ij2 adapter = (ij2) conclusivelyVar;
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
        yb0 delegatingThirdPartyEventEmitter = this.e;
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        RtbAdapter rtbAdapter = adapter.b;
        MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration = new MediationAppOpenAdConfiguration(context, config.r, yardman.attabal(config.c), yardman.saneness(adRequest, adapter.a), requestConfiguration.competently(context), null, requestConfiguration.getTagForChildDirectedTreatment().getValue(), requestConfiguration.getTagForUnderAgeOfConsent().getValue(), yardman.wireman(config.c, requestConfiguration), "");
        bj2 setAppOpenAd = new bj2(adapter);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(setAppOpenAd, "setAppOpenAd");
        rtbAdapter.loadRtbAppOpenAd(mediationAppOpenAdConfiguration, new le1(delegatingThirdPartyEventEmitter, listener, setAppOpenAd));
    }

    @Override // saneness.tympanoplasty
    public final efficacy a(jm2 transaction, h1 config, final ij2 adapter) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        efficacy efficacyVar = (efficacy) this.f.get();
        pussyfooter pussyfooterVar = new pussyfooter() { // from class: saneness.puzzlehead
            @Override // saneness.pussyfooter
            public final void a() {
                ve.a(adapter, this);
            }
        };
        a90 a90Var = (a90) efficacyVar;
        a90Var.getClass();
        a90Var.o = pussyfooterVar;
        return a90Var;
    }

    public static final void a(ij2 adapter, ve this$0) {
        Intrinsics.checkNotNullParameter(adapter, "$adapter");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.d.b();
        if (context == null) {
            context = this$0.c;
        }
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (adapter) {
            MediationAppOpenAd mediationAppOpenAd = adapter.g;
            if (mediationAppOpenAd == null) {
                Intrinsics.preprohormone("appOpenAd");
                mediationAppOpenAd = null;
            }
            mediationAppOpenAd.showAd(context);
            Unit unit = Unit.f29295attabal;
        }
    }
}
