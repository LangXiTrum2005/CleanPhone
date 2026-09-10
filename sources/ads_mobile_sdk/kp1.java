package ads_mobile_sdk;

import android.content.Context;
import complexometry.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.beccafico;
import saneness.coffeecake;
import saneness.conclusively;
import saneness.duvetyn;
import saneness.permanently;
import saneness.tympanoplasty;
import saneness.weimar;

/* JADX INFO: loaded from: classes.dex */
public final class kp1 implements tympanoplasty {
    public final formularize a;
    public final com.google.android.libraries.ads.mobile.sdk.nativead.dern b;
    public final lf2 c;
    public final Context d;
    public final x e;
    public final yb0 f;
    public final adultoid g;

    public kp1(formularize baseRequest, com.google.android.libraries.ads.mobile.sdk.nativead.dern nativeRequest, lf2 requestConfigurationWrapper, Context context, x activityTracker, yb0 delegatingThirdPartyEventEmitter, coffeecake nativeAdComponentProvider) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(nativeAdComponentProvider, "nativeAdComponentProvider");
        this.a = baseRequest;
        this.b = nativeRequest;
        this.c = requestConfigurationWrapper;
        this.d = context;
        this.e = activityTracker;
        this.f = delegatingThirdPartyEventEmitter;
        this.g = nativeAdComponentProvider;
    }

    @Override // saneness.tympanoplasty
    public final void a(jm2 transaction, h1 config, conclusively conclusivelyVar, fx2 listener) {
        su1 adapter = (su1) conclusivelyVar;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context contextB = this.e.b();
        if (contextB == null) {
            contextB = this.d;
        }
        adapter.a(contextB, this.a, this.b, this.c.a(), config.c, listener, this.f);
    }

    @Override // saneness.tympanoplasty
    public final permanently a(jm2 transaction, h1 config, Object obj) {
        su1 adapter = (su1) obj;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        duvetyn duvetynVar = (duvetyn) this.g.get();
        weimar weimarVar = adapter.c;
        weimar weimarVar2 = null;
        if (weimarVar == null) {
            Intrinsics.preprohormone("nativeAdMapper");
            weimarVar = null;
        }
        g90 g90Var = (g90) duvetynVar;
        g90Var.getClass();
        weimarVar.getClass();
        g90Var.o = weimarVar;
        weimar weimarVar3 = adapter.c;
        if (weimarVar3 != null) {
            weimarVar2 = weimarVar3;
        } else {
            Intrinsics.preprohormone("nativeAdMapper");
        }
        g90Var.p = beccafico.attabal(weimarVar2, this.b.getAdChoicesPlacement());
        return g90Var;
    }
}
