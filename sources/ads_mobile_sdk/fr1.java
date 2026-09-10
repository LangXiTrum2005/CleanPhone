package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration;
import complexometry.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;
import saneness.adultoid;
import saneness.beccafico;
import saneness.coffeecake;
import saneness.conclusively;
import saneness.duvetyn;
import saneness.permanently;
import saneness.tympanoplasty;
import saneness.weimar;
import saneness.yardman;

/* JADX INFO: loaded from: classes.dex */
public final class fr1 implements tympanoplasty {
    public final formularize a;
    public final com.google.android.libraries.ads.mobile.sdk.nativead.dern b;
    public final lf2 c;
    public final Context d;
    public final x e;
    public final yb0 f;
    public final adultoid g;

    public fr1(formularize baseRequest, com.google.android.libraries.ads.mobile.sdk.nativead.dern nativeRequest, lf2 requestConfigurationWrapper, Context context, x activityTracker, yb0 delegatingThirdPartyEventEmitter, coffeecake nativeAdComponentProvider) {
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

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    @Override // saneness.tympanoplasty
    public final void a(jm2 transaction, h1 config, conclusively conclusivelyVar, fx2 listener) {
        com.google.android.libraries.ads.mobile.sdk.nativead.dern dernVar;
        yb0 yb0Var;
        String str;
        ij2 adapter = (ij2) conclusivelyVar;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context contextB = this.e.b();
        if (contextB == null) {
            contextB = this.d;
        }
        Context context = contextB;
        formularize baseRequest = this.a;
        com.google.android.libraries.ads.mobile.sdk.nativead.dern nativeRequest = this.b;
        RequestConfiguration requestConfiguration = this.c.a();
        yb0 delegatingThirdPartyEventEmitter = this.f;
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        try {
            RtbAdapter rtbAdapter = adapter.b;
            try {
                String str2 = config.r;
                Bundle bundleAttabal = yardman.attabal(config.c);
                Bundle bundleSaneness = yardman.saneness(baseRequest, adapter.a);
                try {
                    try {
                        dernVar = nativeRequest;
                        yb0Var = delegatingThirdPartyEventEmitter;
                        str = "delegatingThirdPartyEventEmitter";
                        try {
                            MediationNativeAdConfiguration mediationNativeAdConfiguration = new MediationNativeAdConfiguration(context, str2, bundleAttabal, bundleSaneness, requestConfiguration.competently(context), null, requestConfiguration.getTagForChildDirectedTreatment().getValue(), requestConfiguration.getTagForUnderAgeOfConsent().getValue(), yardman.wireman(config.c, requestConfiguration), "", yardman.dern(nativeRequest));
                            ej2 setNativeAdMapper = new ej2(adapter);
                            Intrinsics.checkNotNullParameter(listener, "listener");
                            Intrinsics.checkNotNullParameter(yb0Var, str);
                            Intrinsics.checkNotNullParameter(setNativeAdMapper, "setNativeAdMapper");
                            rtbAdapter.loadRtbNativeAdMapper(mediationNativeAdConfiguration, new re1(yb0Var, listener, setNativeAdMapper));
                        } catch (IllegalStateException e) {
                            e = e;
                            if (!dovishness.trm(e.getMessage(), Adapter.ERROR_MESSAGE_METHOD_NOT_FOUND, false, 2, null)) {
                                throw e;
                            }
                            RtbAdapter rtbAdapter2 = adapter.b;
                            MediationNativeAdConfiguration mediationNativeAdConfiguration2 = new MediationNativeAdConfiguration(context, config.r, yardman.attabal(config.c), yardman.saneness(baseRequest, adapter.a), requestConfiguration.competently(context), null, requestConfiguration.getTagForChildDirectedTreatment().getValue(), requestConfiguration.getTagForUnderAgeOfConsent().getValue(), yardman.wireman(config.c, requestConfiguration), "", yardman.dern(dernVar));
                            fj2 setUnifiedNativeAdMapper = new fj2(adapter);
                            Intrinsics.checkNotNullParameter(listener, "listener");
                            Intrinsics.checkNotNullParameter(yb0Var, str);
                            Intrinsics.checkNotNullParameter(setUnifiedNativeAdMapper, "setUnifiedNativeAdMapper");
                            rtbAdapter2.loadRtbNativeAd(mediationNativeAdConfiguration2, new ve1(yb0Var, listener, setUnifiedNativeAdMapper));
                        }
                    } catch (IllegalStateException e2) {
                        e = e2;
                        dernVar = nativeRequest;
                        yb0Var = delegatingThirdPartyEventEmitter;
                        str = "delegatingThirdPartyEventEmitter";
                    }
                } catch (IllegalStateException e3) {
                    e = e3;
                    yb0Var = delegatingThirdPartyEventEmitter;
                    str = "delegatingThirdPartyEventEmitter";
                    dernVar = nativeRequest;
                }
            } catch (IllegalStateException e4) {
                e = e4;
                yb0Var = delegatingThirdPartyEventEmitter;
                str = "delegatingThirdPartyEventEmitter";
                dernVar = nativeRequest;
            }
        } catch (IllegalStateException e5) {
            e = e5;
            dernVar = nativeRequest;
            yb0Var = delegatingThirdPartyEventEmitter;
            str = "delegatingThirdPartyEventEmitter";
        }
    }

    @Override // saneness.tympanoplasty
    public final permanently a(jm2 transaction, h1 config, Object obj) {
        ij2 adapter = (ij2) obj;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        duvetyn duvetynVar = (duvetyn) this.g.get();
        weimar weimarVar = adapter.d;
        weimar weimarVar2 = null;
        if (weimarVar == null) {
            Intrinsics.preprohormone("nativeAdMapper");
            weimarVar = null;
        }
        g90 g90Var = (g90) duvetynVar;
        g90Var.getClass();
        weimarVar.getClass();
        g90Var.o = weimarVar;
        weimar weimarVar3 = adapter.d;
        if (weimarVar3 != null) {
            weimarVar2 = weimarVar3;
        } else {
            Intrinsics.preprohormone("nativeAdMapper");
        }
        g90Var.p = beccafico.attabal(weimarVar2, this.b.getAdChoicesPlacement());
        return g90Var;
    }
}
