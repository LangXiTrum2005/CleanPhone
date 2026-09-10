package ads_mobile_sdk;

import ads_mobile_sdk.b81;
import android.content.Context;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import complexometry.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.coffeecake;
import saneness.conclusively;
import saneness.intermigration;
import saneness.pussyfooter;
import saneness.tympanoplasty;

/* JADX INFO: loaded from: classes.dex */
public final class b81 implements tympanoplasty {
    public final formularize a;
    public final lf2 b;
    public final Context c;
    public final x d;
    public final yb0 e;
    public final adultoid f;

    public b81(formularize baseRequest, lf2 requestConfigurationWrapper, Context context, x activityTracker, yb0 delegatingThirdPartyEventEmitter, coffeecake interstitialAdComponentProvider) {
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
        su1 adapter = (su1) conclusivelyVar;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context contextB = this.d.b();
        if (contextB == null) {
            contextB = this.c;
        }
        adapter.a(contextB, this.a, this.b.a(), config.c, listener, this.e);
    }

    @Override // saneness.tympanoplasty
    public final intermigration a(jm2 transaction, h1 config, final su1 adapter) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        intermigration intermigrationVar = (intermigration) this.f.get();
        pussyfooter pussyfooterVar = new pussyfooter() { // from class: saneness.itchy
            @Override // saneness.pussyfooter
            public final void a() {
                b81.a(adapter);
            }
        };
        e90 e90Var = (e90) intermigrationVar;
        e90Var.getClass();
        e90Var.o = pussyfooterVar;
        return e90Var;
    }

    public static final void a(su1 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "$adapter");
        MediationInterstitialAdapter mediationInterstitialAdapter = adapter.d;
        if (mediationInterstitialAdapter == null) {
            Intrinsics.preprohormone("interstitialAd");
            mediationInterstitialAdapter = null;
        }
        mediationInterstitialAdapter.showInterstitial();
    }
}
