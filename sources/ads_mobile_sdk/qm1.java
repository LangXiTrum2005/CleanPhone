package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration;
import com.google.gson.JsonObject;
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
public final class qm1 implements tympanoplasty {
    public final formularize a;
    public final com.google.android.libraries.ads.mobile.sdk.nativead.dern b;
    public final lf2 c;
    public final Context d;
    public final x e;
    public final yb0 f;
    public final adultoid g;

    public qm1(formularize baseRequest, com.google.android.libraries.ads.mobile.sdk.nativead.dern nativeRequest, lf2 requestConfigurationWrapper, Context context, x activityTracker, yb0 delegatingThirdPartyEventEmitter, coffeecake nativeAdComponentProvider) {
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

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // saneness.tympanoplasty
    public final void a(jm2 transaction, h1 config, conclusively conclusivelyVar, fx2 listener) {
        com.google.android.libraries.ads.mobile.sdk.nativead.dern dernVar;
        RequestConfiguration requestConfiguration;
        yb0 yb0Var;
        String str;
        fe1 adapter = (fe1) conclusivelyVar;
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
        RequestConfiguration requestConfiguration2 = this.c.a();
        JsonObject adapterData = config.c;
        yb0 delegatingThirdPartyEventEmitter = this.f;
        adapter.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration2, "requestConfiguration");
        Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        Intrinsics.checkNotNullParameter(listener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        try {
            Adapter adapter2 = adapter.a;
            try {
                Bundle bundleAttabal = yardman.attabal(adapterData);
                Bundle bundleSaneness = yardman.saneness(baseRequest, adapter.a);
                try {
                    try {
                        requestConfiguration = requestConfiguration2;
                        try {
                            dernVar = nativeRequest;
                            yb0Var = delegatingThirdPartyEventEmitter;
                            str = "delegatingThirdPartyEventEmitter";
                            try {
                                MediationNativeAdConfiguration mediationNativeAdConfiguration = new MediationNativeAdConfiguration(context, "", bundleAttabal, bundleSaneness, requestConfiguration2.competently(context), null, requestConfiguration2.getTagForChildDirectedTreatment().getValue(), requestConfiguration2.getTagForUnderAgeOfConsent().getValue(), yardman.wireman(adapterData, requestConfiguration2), "", yardman.dern(nativeRequest));
                                be1 setNativeAdMapper = new be1(adapter);
                                Intrinsics.checkNotNullParameter(listener, "listener");
                                Intrinsics.checkNotNullParameter(yb0Var, str);
                                Intrinsics.checkNotNullParameter(setNativeAdMapper, "setNativeAdMapper");
                                adapter2.loadNativeAdMapper(mediationNativeAdConfiguration, new re1(yb0Var, listener, setNativeAdMapper));
                            } catch (IllegalStateException e) {
                                e = e;
                                if (!dovishness.trm(e.getMessage(), Adapter.ERROR_MESSAGE_METHOD_NOT_FOUND, false, 2, null)) {
                                    throw e;
                                }
                                Adapter adapter3 = adapter.a;
                                RequestConfiguration requestConfiguration3 = requestConfiguration;
                                MediationNativeAdConfiguration mediationNativeAdConfiguration2 = new MediationNativeAdConfiguration(context, "", yardman.attabal(adapterData), yardman.saneness(baseRequest, adapter.a), requestConfiguration3.competently(context), null, requestConfiguration3.getTagForChildDirectedTreatment().getValue(), requestConfiguration3.getTagForUnderAgeOfConsent().getValue(), yardman.wireman(adapterData, requestConfiguration3), "", yardman.dern(dernVar));
                                ce1 setUnifiedNativeAdMapper = new ce1(adapter);
                                Intrinsics.checkNotNullParameter(listener, "listener");
                                Intrinsics.checkNotNullParameter(yb0Var, str);
                                Intrinsics.checkNotNullParameter(setUnifiedNativeAdMapper, "setUnifiedNativeAdMapper");
                                adapter3.loadNativeAd(mediationNativeAdConfiguration2, new ve1(yb0Var, listener, setUnifiedNativeAdMapper));
                            }
                        } catch (IllegalStateException e2) {
                            e = e2;
                            dernVar = nativeRequest;
                            yb0Var = delegatingThirdPartyEventEmitter;
                            str = "delegatingThirdPartyEventEmitter";
                        }
                    } catch (IllegalStateException e3) {
                        e = e3;
                        requestConfiguration = requestConfiguration2;
                        dernVar = nativeRequest;
                        str = "delegatingThirdPartyEventEmitter";
                        yb0Var = delegatingThirdPartyEventEmitter;
                    }
                } catch (IllegalStateException e4) {
                    e = e4;
                    requestConfiguration = requestConfiguration2;
                    yb0Var = delegatingThirdPartyEventEmitter;
                    dernVar = nativeRequest;
                    str = "delegatingThirdPartyEventEmitter";
                }
            } catch (IllegalStateException e5) {
                e = e5;
                requestConfiguration = requestConfiguration2;
                yb0Var = delegatingThirdPartyEventEmitter;
                str = "delegatingThirdPartyEventEmitter";
                dernVar = nativeRequest;
            }
        } catch (IllegalStateException e6) {
            e = e6;
            dernVar = nativeRequest;
            requestConfiguration = requestConfiguration2;
            yb0Var = delegatingThirdPartyEventEmitter;
            str = "delegatingThirdPartyEventEmitter";
        }
    }

    @Override // saneness.tympanoplasty
    public final permanently a(jm2 transaction, h1 config, Object obj) {
        fe1 adapter = (fe1) obj;
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
