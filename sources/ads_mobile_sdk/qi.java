package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.MBridgeConstans;
import complexometry.formularize;
import liquory.beachfront;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.aftermost;
import saneness.coffeecake;
import saneness.conclusively;
import saneness.gintrap;
import saneness.kaolinize;
import saneness.permanently;
import saneness.phytopathogen;
import saneness.scannable;
import saneness.tympanoplasty;

/* JADX INFO: loaded from: classes.dex */
public final class qi implements tympanoplasty {
    public final formularize a;
    public final beachfront b;
    public final lf2 c;
    public final Context d;
    public final x e;
    public final yb0 f;
    public final adultoid g;
    public final phytopathogen h;

    public qi(formularize baseRequest, beachfront bannerRequest, lf2 requestConfigurationWrapper, Context context, x activityTracker, yb0 delegatingThirdPartyEventEmitter, coffeecake bannerAdComponentProvider, phytopathogen refreshListener) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(bannerRequest, "bannerRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(bannerAdComponentProvider, "bannerAdComponentProvider");
        Intrinsics.checkNotNullParameter(refreshListener, "refreshListener");
        this.a = baseRequest;
        this.b = bannerRequest;
        this.c = requestConfigurationWrapper;
        this.d = context;
        this.e = activityTracker;
        this.f = delegatingThirdPartyEventEmitter;
        this.g = bannerAdComponentProvider;
        this.h = refreshListener;
    }

    @Override // saneness.tympanoplasty
    public final void a(jm2 transaction, h1 config, conclusively conclusivelyVar, fx2 listener) {
        su1 adapter = (su1) conclusivelyVar;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        liquory.attabal adSize = this.b.getAdSize();
        if (adSize == null) {
            listener.a(new AdError(0, "No AdSize available for banner mediation. This may happen when a server-to-server ad response triggers mediation but no AdSize was provided in the signal request.", AdError.GOOGLE_MOBILE_ADS_DOMAIN));
            return;
        }
        Context contextB = this.e.b();
        if (contextB == null) {
            contextB = this.d;
        }
        adapter.a(contextB, adSize, this.a, this.c.a(), config.c, listener, this.f);
    }

    @Override // saneness.tympanoplasty
    public final void a(kaolinize kaolinizeVar) {
        scannable adComponent = (scannable) kaolinizeVar;
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        ((gintrap) ((d90) adComponent).G.get()).getClass();
    }

    @Override // saneness.tympanoplasty
    public final permanently a(jm2 transaction, h1 config, Object obj) {
        su1 adapter = (su1) obj;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        aftermost aftermostVar = (aftermost) this.g.get();
        View view = adapter.b;
        if (view == null) {
            Intrinsics.preprohormone(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            view = null;
        }
        c90 c90Var = (c90) aftermostVar;
        c90Var.getClass();
        view.getClass();
        c90Var.p = view;
        phytopathogen phytopathogenVar = this.h;
        phytopathogenVar.getClass();
        c90Var.o = phytopathogenVar;
        return c90Var;
    }
}
