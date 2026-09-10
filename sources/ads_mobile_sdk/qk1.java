package ads_mobile_sdk;

import android.os.Build;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.ironsource.Ie;
import complexometry.formularize;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.carport;
import saneness.coffeecake;
import saneness.presbytery;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class qk1 extends l1 {
    public final u20 k;
    public final adultoid l;
    public final adultoid m;
    public final co1 n;
    public final vj1 o;
    public final com.google.android.libraries.ads.mobile.sdk.nativead.dern p;
    public final presbytery q;
    public final ri2 r;
    public final saran s;
    public final int t;
    public final adultoid u;

    /* JADX WARN: Illegal instructions before constructor call */
    public qk1(u20 csiTicker, coffeecake adComponentProvider, coffeecake mediaAdComponentProvider, co1 nativeJavascriptEngineFactory, vj1 nativeAdAssetsFactory, com.google.android.libraries.ads.mobile.sdk.nativead.dern nativeRequest, presbytery preRenderNativeJavascriptEngineConfigurator, ri2 rootTraceCreator, l13 traceMetaSet, formularize baseRequest, yf2 requestType, long j, int i, h1 adConfiguration, ur commonConfiguration, jm2 serverTransaction, String renderId, saran backgroundScope, int i2, coffeecake placementIdWrapperProvider) {
        Intrinsics.checkNotNullParameter(csiTicker, "csiTicker");
        Intrinsics.checkNotNullParameter(adComponentProvider, "adComponentProvider");
        Intrinsics.checkNotNullParameter(mediaAdComponentProvider, "mediaAdComponentProvider");
        Intrinsics.checkNotNullParameter(nativeJavascriptEngineFactory, "nativeJavascriptEngineFactory");
        Intrinsics.checkNotNullParameter(nativeAdAssetsFactory, "nativeAdAssetsFactory");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(preRenderNativeJavascriptEngineConfigurator, "preRenderNativeJavascriptEngineConfigurator");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(renderId, "renderId");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(placementIdWrapperProvider, "placementIdWrapperProvider");
        Object obj = placementIdWrapperProvider.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        super(traceMetaSet, baseRequest, requestType, j, i, adConfiguration, commonConfiguration, serverTransaction, renderId, (a22) obj);
        this.k = csiTicker;
        this.l = adComponentProvider;
        this.m = mediaAdComponentProvider;
        this.n = nativeJavascriptEngineFactory;
        this.o = nativeAdAssetsFactory;
        this.p = nativeRequest;
        this.q = preRenderNativeJavascriptEngineConfigurator;
        this.r = rootTraceCreator;
        this.s = backgroundScope;
        this.t = i2;
        this.u = placementIdWrapperProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(carport carportVar, h1 h1Var, wretchedly.dern dernVar) {
        lk1 lk1Var;
        JsonArray jsonArrayD;
        if (dernVar instanceof lk1) {
            lk1Var = (lk1) dernVar;
            int i = lk1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lk1Var.c = i - Integer.MIN_VALUE;
            } else {
                lk1Var = new lk1(this, dernVar);
            }
        } else {
            lk1Var = new lk1(this, dernVar);
        }
        Object objA = lk1Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = lk1Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("isNonagon", igo.attabal.attabal(true));
            if (Build.VERSION.SDK_INT >= 30) {
                jsonObject.addProperty("skipDeepLinkValidation", igo.attabal.attabal(true));
            }
            JsonObject jsonObject2 = new JsonObject();
            wx0 wx0Var = h1Var.H;
            Intrinsics.beachfront(wx0Var);
            jsonObject2.add(Ie.n, wx0Var.c);
            jsonObject2.add("sdk_params", jsonObject);
            lk1Var.c = 1;
            carportVar.getClass();
            String string = jsonObject2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            objA = carportVar.a("google.afma.nativeAds.preProcessJson", string, lk1Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objA);
        }
        spartacist spartacistVar = (spartacist) objA;
        if (spartacistVar instanceof nn0) {
            return (nn0) spartacistVar;
        }
        Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
        JsonObject jsonObject3 = (JsonObject) ((tn0) spartacistVar).b;
        if (!cb1.a(jsonObject3, "success", false)) {
            return new rn0("Process native ad json failed", k41.INTERNAL_ERROR);
        }
        JsonObject jsonObjectA = cb1.a(jsonObject3, "json", (JsonObject) null);
        if (jsonObjectA == null || (jsonArrayD = cb1.d(jsonObjectA, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) == null) {
            return new rn0("Invalid processed native ad json", k41.INTERNAL_ERROR);
        }
        return jsonArrayD.isEmpty() ? new sn0() : new tn0(jsonArrayD);
    }

    @Override // saneness.idolatry
    public final boolean b() {
        wx0 wx0Var = this.f.H;
        return (wx0Var != null ? wx0Var.c : null) != null;
    }

    @Override // ads_mobile_sdk.l1
    public final Object a(boolean z, wretchedly.dern dernVar) {
        return a(this, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00de, code lost:
    
        if (r12 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f8, code lost:
    
        if (r12 == r1) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.qk1 r11, wretchedly.dern r12) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qk1.a(ads_mobile_sdk.qk1, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0268, code lost:
    
        if (r7.a((saneness.rotuma) r2, r3) == r4) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.google.gson.JsonObject r17, saneness.carport r18, com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext r19, wretchedly.dern r20) {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qk1.a(com.google.gson.JsonObject, saneness.carport, com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext, wretchedly.dern):java.lang.Object");
    }
}
