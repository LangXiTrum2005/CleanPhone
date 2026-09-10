package ads_mobile_sdk;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.google.common.base.triweekly;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.polder;
import p002kotlin.collections.polloi;
import p002kotlin.collections.seminary;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;
import p002kotlin.text.Regex;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;
import patroclinal.formularize;
import saneness.disrupture;
import saneness.evenfall;
import saneness.executant;
import saneness.exonumist;
import saneness.genii;
import saneness.gondola;
import saneness.hydrofracturing;
import saneness.incuse;
import saneness.kaif;
import saneness.laky;
import saneness.loun;
import saneness.methylmercury;
import saneness.physical;
import saneness.prescient;
import saneness.spartacist;
import saneness.sultanate;
import saneness.supercargo;
import saneness.vocationalize;
import saneness.walach;
import svd.AdSizeBundle;
import svd.AdapterVersionData;
import svd.AppStats;
import svd.QualitySignals;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class jf2 {
    public final jk0 a;
    public final vg b;
    public final loun c;
    public final zl d;
    public final Optional e;
    public final kaif f;
    public final supercargo g;
    public final int h;
    public final Context i;
    public String j;
    public boolean k;
    public boolean l;
    public final LinkedHashSet m;
    public final LinkedHashSet n;
    public final LinkedHashMap o;
    public Map p;
    public final LinkedHashMap q;
    public final Gson r;
    public arytenoidectomy s;
    public JsonObject t;
    public final JsonObject u;
    public final LinkedHashMap v;

    public jf2(jk0 flags, vg appState, loun traceLogger, zl blobEncrypter, Optional optionalNativeRequest, kaif randomGenerator, supercargo sdkCoreJavascriptEngine, int i, Context context) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(blobEncrypter, "blobEncrypter");
        Intrinsics.checkNotNullParameter(optionalNativeRequest, "optionalNativeRequest");
        Intrinsics.checkNotNullParameter(randomGenerator, "randomGenerator");
        Intrinsics.checkNotNullParameter(sdkCoreJavascriptEngine, "sdkCoreJavascriptEngine");
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = flags;
        this.b = appState;
        this.c = traceLogger;
        this.d = blobEncrypter;
        this.e = optionalNativeRequest;
        this.f = randomGenerator;
        this.g = sdkCoreJavascriptEngine;
        this.h = i;
        this.i = context;
        this.j = "https://googleads.g.doubleclick.net/mads/gma";
        this.m = new LinkedHashSet();
        this.n = new LinkedHashSet();
        this.o = new LinkedHashMap();
        this.q = new LinkedHashMap();
        this.r = new GsonBuilder().registerTypeAdapterFactory(new AndroidBundleTypeAdapterFactory()).create();
        this.u = new JsonObject();
        this.v = new LinkedHashMap();
    }

    public final Uri b() {
        Uri.Builder builderBuildUpon = Uri.parse(this.j).buildUpon();
        for (Map.Entry entry : this.o.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (this.n.isEmpty() || this.n.contains(str)) {
                Intrinsics.beachfront(builderBuildUpon);
                sultanate.competently(builderBuildUpon, str, str2);
            }
        }
        return builderBuildUpon.build();
    }

    public final void c() {
        this.u.addProperty("a_url", this.h + ".android." + this.i.getPackageName() + "." + this.a.o());
    }

    public final void d() {
        fo2 fo2Var = (fo2) this.v.get(dm.NON_PERSONALIZED_AD.b());
        boolean zO = fo2Var != null ? fo2Var.o() : false;
        fo2 fo2Var2 = (fo2) this.v.get(dm.TAG_FOR_UNDER_AGE_OF_CONSENT.b());
        boolean zO2 = fo2Var2 != null ? fo2Var2.o() : false;
        arytenoidectomy arytenoidectomyVar = this.s;
        if (arytenoidectomyVar == null) {
            Intrinsics.preprohormone("signals");
            arytenoidectomyVar = null;
        }
        boolean z = arytenoidectomyVar.sharedPreferenceSignals.getInt("IABTCF_CmpSdkID", 0) == 300;
        int i = zO2 ? 2 : 0;
        if (zO) {
            i |= 8;
        }
        if (z) {
            i |= 128;
        }
        this.u.addProperty(dm.GDPR_USER_CONSENT_INFO.b(), "0.0.0.0.0.0.0." + i);
    }

    public final void e() {
        int iIntValue;
        String strS;
        arytenoidectomy arytenoidectomyVar = this.s;
        arytenoidectomy arytenoidectomyVar2 = null;
        if (arytenoidectomyVar == null) {
            Intrinsics.preprohormone("signals");
            arytenoidectomyVar = null;
        }
        Integer num = arytenoidectomyVar.numberOfAdsRequested;
        if (num == null || (iIntValue = num.intValue()) <= 1) {
            return;
        }
        arytenoidectomy arytenoidectomyVar3 = this.s;
        if (arytenoidectomyVar3 == null) {
            Intrinsics.preprohormone("signals");
            arytenoidectomyVar3 = null;
        }
        Boolean bool = arytenoidectomyVar3.isIconAdRequest;
        int iMin = (bool == null || !bool.booleanValue()) ? Math.min(iIntValue, 5) : Math.min(iIntValue, 20);
        arytenoidectomy arytenoidectomyVar4 = this.s;
        if (arytenoidectomyVar4 == null) {
            Intrinsics.preprohormone("signals");
        } else {
            arytenoidectomyVar2 = arytenoidectomyVar4;
        }
        String str = arytenoidectomyVar2.adUnitId;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            return;
        }
        fo2 fo2Var = (fo2) this.v.get("sra_regex");
        if (fo2Var != null && (strS = fo2Var.s()) != null) {
            laky lakyVar = ip0.f;
            String strMarial = laky.marial(strS, str);
            if (strMarial != null) {
                str = strMarial;
            }
        }
        String[] strArr = new String[iMin];
        for (int i = 0; i < iMin; i++) {
            strArr[i] = "slotname=" + str;
        }
        this.u.addProperty(dm.SRA_URLS.b(), polloi.lerp(strArr, ",", null, null, 0, null, null, 62, null));
    }

    public final void f() {
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        try {
            arytenoidectomy arytenoidectomyVar = this.s;
            arytenoidectomy arytenoidectomyVar2 = null;
            if (arytenoidectomyVar == null) {
                Intrinsics.preprohormone("signals");
                arytenoidectomyVar = null;
            }
            Bundle bundle = arytenoidectomyVar.googleExtrasBundle;
            if (bundle == null) {
                bundle = new Bundle();
            }
            Gson gson = this.r;
            arytenoidectomy arytenoidectomyVar3 = this.s;
            if (arytenoidectomyVar3 == null) {
                Intrinsics.preprohormone("signals");
                arytenoidectomyVar3 = null;
            }
            String str = arytenoidectomyVar3.inspectorExtras;
            if (str == null) {
                str = JsonUtils.EMPTY_JSON;
            }
            JsonObject jsonObject = (JsonObject) gson.fromJson(str, JsonObject.class);
            Intrinsics.checkNotNullParameter("global_extras", X3.i.W);
            if (jsonObject == null) {
                asJsonObject = null;
            } else {
                try {
                    asJsonObject = jsonObject.getAsJsonObject("global_extras");
                } catch (Exception unused) {
                    asJsonObject = null;
                }
            }
            if (asJsonObject != null) {
                Map<String, JsonElement> mapAsMap = asJsonObject.asMap();
                Intrinsics.checkNotNullExpressionValue(mapAsMap, "asMap(...)");
                for (Map.Entry<String, JsonElement> entry : mapAsMap.entrySet()) {
                    bundle.putString(entry.getKey(), entry.getValue().toString());
                }
            }
            arytenoidectomy arytenoidectomyVar4 = this.s;
            if (arytenoidectomyVar4 == null) {
                Intrinsics.preprohormone("signals");
                arytenoidectomyVar4 = null;
            }
            String key = arytenoidectomyVar4.adUnitId;
            if (key == null) {
                key = "";
            }
            Intrinsics.checkNotNullParameter(key, "key");
            if (jsonObject == null) {
                asJsonObject2 = null;
            } else {
                try {
                    asJsonObject2 = jsonObject.getAsJsonObject(key);
                } catch (Exception unused2) {
                    asJsonObject2 = null;
                }
            }
            if (asJsonObject2 != null) {
                Map<String, JsonElement> mapAsMap2 = asJsonObject2.asMap();
                Intrinsics.checkNotNullExpressionValue(mapAsMap2, "asMap(...)");
                for (Map.Entry<String, JsonElement> entry2 : mapAsMap2.entrySet()) {
                    bundle.putString(entry2.getKey(), entry2.getValue().toString());
                }
            }
            arytenoidectomy arytenoidectomyVar5 = this.s;
            if (arytenoidectomyVar5 == null) {
                Intrinsics.preprohormone("signals");
            } else {
                arytenoidectomyVar2 = arytenoidectomyVar5;
            }
            arytenoidectomyVar2.googleExtrasBundle = bundle;
        } catch (Throwable unused3) {
        }
    }

    public final void g() {
        Integer num;
        gondola gondolaVarP = vm.p();
        Intrinsics.checkNotNullExpressionValue(gondolaVarP, "newBuilder(...)");
        bz2 bz2VarAttabal = walach.attabal(gondolaVarP);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        arytenoidectomy arytenoidectomyVar = this.s;
        arytenoidectomy arytenoidectomyVar2 = null;
        if (arytenoidectomyVar == null) {
            Intrinsics.preprohormone("signals");
            arytenoidectomyVar = null;
        }
        List<RtbAdapterData> realTimeBiddingSignalsObject = arytenoidectomyVar.getRealTimeBiddingSignalsObject();
        if (realTimeBiddingSignalsObject == null) {
            realTimeBiddingSignalsObject = adultoid.formularize();
        }
        for (RtbAdapterData rtbAdapterData : realTimeBiddingSignalsObject) {
            yd0 yd0VarB = bz2VarAttabal.b();
            methylmercury methylmercuryVarO = um.o();
            Intrinsics.checkNotNullExpressionValue(methylmercuryVarO, "newBuilder(...)");
            dz2 dz2VarAttabal = genii.attabal(methylmercuryVarO);
            String str = rtbAdapterData.adapterClassName;
            if (str == null) {
                str = "";
            }
            dz2VarAttabal.a(str);
            linkedHashSet.add(dz2VarAttabal.b());
            dz2VarAttabal.b(sultanate.attabal(rtbAdapterData.sdkVersion));
            dz2VarAttabal.a(sultanate.attabal(rtbAdapterData.adapterVersion));
            dz2VarAttabal.a(1);
            String str2 = rtbAdapterData.signals;
            if (str2 != null && !StringsKt.empress(str2)) {
                String str3 = rtbAdapterData.signals;
                dz2VarAttabal.b(str3 != null ? str3 : "");
            }
            Long l = rtbAdapterData.latency;
            dz2VarAttabal.a(l != null ? l.longValue() : 0L);
            if (rtbAdapterData.signalErrorMessage != null || ((num = rtbAdapterData.signalErrorCode) != null && num.intValue() != 0)) {
                physical physicalVarO = rm.o();
                Intrinsics.checkNotNullExpressionValue(physicalVarO, "newBuilder(...)");
                fz2 fz2VarAttabal = disrupture.attabal(physicalVarO);
                Integer num2 = rtbAdapterData.signalErrorCode;
                hm hmVar = hm.ADAPTER_CREATION_FAILURE;
                int number = hmVar.getNumber();
                if (num2 == null || num2.intValue() != number) {
                    hmVar = hm.SIGNAL_COLLECTION_FAILURE;
                    int number2 = hmVar.getNumber();
                    if (num2 == null || num2.intValue() != number2) {
                        hmVar = hm.SIGNAL_COLLECTION_TIMEOUT;
                        int number3 = hmVar.getNumber();
                        if (num2 == null || num2.intValue() != number3) {
                            hmVar = hm.UNKNOWN_ERROR;
                        }
                    }
                }
                fz2VarAttabal.a(hmVar);
                String str4 = rtbAdapterData.signalErrorMessage;
                if (str4 == null) {
                    str4 = "An undefined error occurred. Error code = " + rtbAdapterData.signalErrorCode;
                }
                fz2VarAttabal.a(str4);
                dz2VarAttabal.a(fz2VarAttabal.a());
            }
            bz2VarAttabal.a(yd0VarB, dz2VarAttabal.a());
        }
        arytenoidectomy arytenoidectomyVar3 = this.s;
        if (arytenoidectomyVar3 == null) {
            Intrinsics.preprohormone("signals");
            arytenoidectomyVar3 = null;
        }
        for (Map.Entry<String, AdapterVersionData> entry : arytenoidectomyVar3.adapterVersionData.entrySet()) {
            String key = entry.getKey();
            AdapterVersionData value = entry.getValue();
            if (!linkedHashSet.contains(key)) {
                linkedHashSet.add(key);
                yd0 yd0VarB2 = bz2VarAttabal.b();
                methylmercury methylmercuryVarO2 = um.o();
                Intrinsics.checkNotNullExpressionValue(methylmercuryVarO2, "newBuilder(...)");
                dz2 dz2VarAttabal2 = genii.attabal(methylmercuryVarO2);
                dz2VarAttabal2.a(key);
                dz2VarAttabal2.a(0);
                dz2VarAttabal2.b(sultanate.attabal(value.sdkVersion));
                dz2VarAttabal2.a(sultanate.attabal(value.adapterVersion));
                bz2VarAttabal.a(yd0VarB2, dz2VarAttabal2.a());
            }
        }
        arytenoidectomy arytenoidectomyVar4 = this.s;
        if (arytenoidectomyVar4 == null) {
            Intrinsics.preprohormone("signals");
            arytenoidectomyVar4 = null;
        }
        Bundle bundle = arytenoidectomyVar4.googleExtrasBundle;
        if (bundle == null) {
            bundle = new Bundle();
        }
        String string = bundle.getString("a3p_cs");
        arytenoidectomy arytenoidectomyVar5 = this.s;
        if (arytenoidectomyVar5 == null) {
            Intrinsics.preprohormone("signals");
            arytenoidectomyVar5 = null;
        }
        String str5 = arytenoidectomyVar5.com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME java.lang.String;
        if (string != null && string.length() != 0 && str5.length() != 0) {
            yd0 yd0VarB3 = bz2VarAttabal.b();
            methylmercury methylmercuryVarO3 = um.o();
            Intrinsics.checkNotNullExpressionValue(methylmercuryVarO3, "newBuilder(...)");
            dz2 dz2VarAttabal3 = genii.attabal(methylmercuryVarO3);
            arytenoidectomy arytenoidectomyVar6 = this.s;
            if (arytenoidectomyVar6 == null) {
                Intrinsics.preprohormone("signals");
            } else {
                arytenoidectomyVar2 = arytenoidectomyVar6;
            }
            dz2VarAttabal3.a(arytenoidectomyVar2.com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME java.lang.String);
            dz2VarAttabal3.b(string);
            dz2VarAttabal3.a(1);
            bz2VarAttabal.a(yd0VarB3, dz2VarAttabal3.a());
        }
        vm vmVarA = bz2VarAttabal.a();
        if (vmVarA.o().size() > 0) {
            byte[] bArrEncode = Base64.encode(vmVarA.a(), 10);
            Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(...)");
            a("a3p", dovishness.polder(new String(bArrEncode, Charsets.UTF_8), X3.j.b, ".", false, 4, null), "third_party_params");
        }
    }

    public final Uri a() {
        Uri.Builder builder = new Uri.Builder();
        for (String str : this.m) {
            String str2 = (String) this.o.get(str);
            if (str2 != null) {
                sultanate.competently(builder, str, str2);
            }
        }
        String query = builder.build().getQuery();
        if (query == null) {
            query = "";
        }
        spartacist spartacistVarA = this.d.a(query);
        tn0 tn0Var = spartacistVarA instanceof tn0 ? (tn0) spartacistVarA : null;
        String str3 = tn0Var != null ? (String) tn0Var.a() : null;
        Uri.Builder builderBuildUpon = Uri.parse(this.j).buildUpon();
        for (Map.Entry entry : this.o.entrySet()) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            if (this.n.isEmpty() || this.n.contains(str4)) {
                if (!this.m.contains(str4)) {
                    Intrinsics.beachfront(builderBuildUpon);
                    sultanate.competently(builderBuildUpon, str4, str5);
                } else if (this.m.contains(str4) && ym.a() == zm.INTEGRATION_TEST) {
                    Intrinsics.beachfront(builderBuildUpon);
                    sultanate.competently(builderBuildUpon, str4 + "l", String.valueOf(str5.length()));
                }
            }
        }
        if (str3 != null && str3.length() > 0) {
            Intrinsics.beachfront(builderBuildUpon);
            sultanate.competently(builderBuildUpon, this.a.m(), str3);
        }
        Uri uriBuild = builderBuildUpon.build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
        return uriBuild;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(wretchedly.dern dernVar) {
        gf2 gf2Var;
        JsonObject jsonObject;
        JsonObject jsonObject2;
        String str;
        JsonObject jsonObject3;
        if (dernVar instanceof gf2) {
            gf2Var = (gf2) dernVar;
            int i = gf2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                gf2Var.g = i - Integer.MIN_VALUE;
            } else {
                gf2Var = new gf2(this, dernVar);
            }
        } else {
            gf2Var = new gf2(this, dernVar);
        }
        Object obj = gf2Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = gf2Var.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            jsonObject = this.u;
            JsonObject jsonObject4 = new JsonObject();
            vg vgVar = this.b;
            gf2Var.a = jsonObject4;
            gf2Var.b = jsonObject4;
            gf2Var.c = jsonObject;
            gf2Var.d = "sdk_core";
            gf2Var.g = 1;
            sj0 sj0Var = vgVar.a;
            sj0Var.getClass();
            Object objB = sj0.b(sj0Var, gf2Var);
            if (objB == objBeachfront) {
                return objBeachfront;
            }
            jsonObject2 = jsonObject4;
            str = "sdk_core";
            obj = objB;
            jsonObject3 = jsonObject2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = gf2Var.d;
            jsonObject = gf2Var.c;
            jsonObject2 = gf2Var.b;
            jsonObject3 = gf2Var.a;
            p002kotlin.dern.saneness(obj);
        }
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            jsonObject2.addProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Unit unit = Unit.f29295attabal;
        jsonObject.add(str, jsonObject3);
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075 A[LOOP:1: B:20:0x005b->B:26:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[SYNTHETIC] */
    public final spartacist b(z02 z02Var) {
        spartacist spartacistVarA;
        spartacist spartacistVarB;
        if (z02Var.F()) {
            pc1 pc1VarZ = z02Var.z();
            Intrinsics.checkNotNullExpressionValue(pc1VarZ, "getPattern(...)");
            if (!a(pc1VarZ)) {
                for (z02 z02Var2 : z02Var.u()) {
                    Intrinsics.beachfront(z02Var2);
                    spartacist spartacistVarB2 = b(z02Var2);
                    if (spartacistVarB2 instanceof nn0) {
                        return (nn0) spartacistVarB2;
                    }
                    Intrinsics.competently(spartacistVarB2, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                    ((tn0) spartacistVarB2).getClass();
                }
            } else {
                spartacistVarA = a(z02Var);
                if (spartacistVarA instanceof nn0) {
                    return (nn0) spartacistVarA;
                }
                Intrinsics.competently(spartacistVarA, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                for (z02 z02Var3 : z02Var.q()) {
                    Intrinsics.beachfront(z02Var3);
                    spartacistVarB = b(z02Var3);
                    if (spartacistVarB instanceof nn0) {
                        return (nn0) spartacistVarB;
                    }
                    Intrinsics.competently(spartacistVarB, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                    ((tn0) spartacistVarB).getClass();
                }
            }
        } else {
            spartacistVarA = a(z02Var);
            if (spartacistVarA instanceof nn0) {
                return (nn0) spartacistVarA;
            }
            Intrinsics.competently(spartacistVarA, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
            while (r4.hasNext()) {
                Intrinsics.beachfront(z02Var3);
                spartacistVarB = b(z02Var3);
                if (spartacistVarB instanceof nn0) {
                    return (nn0) spartacistVarB;
                }
                Intrinsics.competently(spartacistVarB, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                ((tn0) spartacistVarB).getClass();
            }
        }
        return new tn0(Unit.f29295attabal);
    }

    public final Object a(arytenoidectomy arytenoidectomyVar, n32 n32Var, b12 b12Var, Map map, ContinuationImpl continuationImpl) {
        return a(this, arytenoidectomyVar, n32Var, b12Var, map, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0315 A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #3 {all -> 0x0049, blocks: (B:16:0x0044, B:127:0x030f, B:128:0x0311, B:130:0x0315, B:23:0x005e, B:118:0x02cb, B:26:0x006d, B:106:0x029b, B:29:0x007c, B:72:0x01ba), top: B:163:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:137:0x032a A[Catch: all -> 0x033a, TryCatch #4 {all -> 0x033a, blocks: (B:135:0x0323, B:137:0x032a, B:139:0x0331, B:141:0x0335, B:143:0x0339, B:146:0x033d, B:147:0x0342, B:148:0x0343, B:149:0x034a, B:150:0x034b, B:151:0x0352, B:152:0x0353), top: B:165:0x0323 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0331 A[Catch: all -> 0x033a, TryCatch #4 {all -> 0x033a, blocks: (B:135:0x0323, B:137:0x032a, B:139:0x0331, B:141:0x0335, B:143:0x0339, B:146:0x033d, B:147:0x0342, B:148:0x0343, B:149:0x034a, B:150:0x034b, B:151:0x0352, B:152:0x0353), top: B:165:0x0323 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0335 A[Catch: all -> 0x033a, TryCatch #4 {all -> 0x033a, blocks: (B:135:0x0323, B:137:0x032a, B:139:0x0331, B:141:0x0335, B:143:0x0339, B:146:0x033d, B:147:0x0342, B:148:0x0343, B:149:0x034a, B:150:0x034b, B:151:0x0352, B:152:0x0353), top: B:165:0x0323 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0339 A[Catch: all -> 0x033a, TryCatch #4 {all -> 0x033a, blocks: (B:135:0x0323, B:137:0x032a, B:139:0x0331, B:141:0x0335, B:143:0x0339, B:146:0x033d, B:147:0x0342, B:148:0x0343, B:149:0x034a, B:150:0x034b, B:151:0x0352, B:152:0x0353), top: B:165:0x0323 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x033d A[Catch: all -> 0x033a, TryCatch #4 {all -> 0x033a, blocks: (B:135:0x0323, B:137:0x032a, B:139:0x0331, B:141:0x0335, B:143:0x0339, B:146:0x033d, B:147:0x0342, B:148:0x0343, B:149:0x034a, B:150:0x034b, B:151:0x0352, B:152:0x0353), top: B:165:0x0323 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0343 A[Catch: all -> 0x033a, TryCatch #4 {all -> 0x033a, blocks: (B:135:0x0323, B:137:0x032a, B:139:0x0331, B:141:0x0335, B:143:0x0339, B:146:0x033d, B:147:0x0342, B:148:0x0343, B:149:0x034a, B:150:0x034b, B:151:0x0352, B:152:0x0353), top: B:165:0x0323 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x034b A[Catch: all -> 0x033a, TryCatch #4 {all -> 0x033a, blocks: (B:135:0x0323, B:137:0x032a, B:139:0x0331, B:141:0x0335, B:143:0x0339, B:146:0x033d, B:147:0x0342, B:148:0x0343, B:149:0x034a, B:150:0x034b, B:151:0x0352, B:152:0x0353), top: B:165:0x0323 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0353 A[Catch: all -> 0x033a, TRY_LEAVE, TryCatch #4 {all -> 0x033a, blocks: (B:135:0x0323, B:137:0x032a, B:139:0x0331, B:141:0x0335, B:143:0x0339, B:146:0x033d, B:147:0x0342, B:148:0x0343, B:149:0x034a, B:150:0x034b, B:151:0x0352, B:152:0x0353), top: B:165:0x0323 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:98:0x0272  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.lang.Object, svd.arytenoidectomy] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [ads_mobile_sdk.jf2] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, svd.arytenoidectomy] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r23v0, types: [ads_mobile_sdk.jf2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [ads_mobile_sdk.df2, wretchedly.dern] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.google.gson.Gson] */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.google.gson.Gson] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static Object a(jf2 jf2Var, arytenoidectomy arytenoidectomyVar, n32 n32Var, b12 b12Var, Map map, wretchedly.dern dernVar) {
        ?? df2Var;
        ?? r2;
        ?? r1;
        ?? r14;
        ?? r13;
        ?? r3;
        b12 b12Var2;
        String strValueOf;
        w03 w03Var;
        Uri uriA;
        String str;
        String string;
        w03 w03Var2;
        w03 w03Var3;
        w03 w03Var4;
        String string2;
        w03 w03Var5;
        ?? r4;
        spartacist spartacistVar;
        ?? r5;
        ?? r6;
        ?? r7;
        ?? r8 = arytenoidectomyVar;
        if (dernVar instanceof df2) {
            df2 df2Var2 = (df2) dernVar;
            int i = df2Var2.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                df2Var2.h = i - Integer.MIN_VALUE;
                df2Var = df2Var2;
            } else {
                df2Var = new df2(jf2Var, dernVar);
            }
        } else {
            df2Var = new df2(jf2Var, dernVar);
        }
        Object obj = df2Var.f;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = df2Var.h;
        try {
            try {
                if (i2 == 0) {
                    p002kotlin.dern.saneness(obj);
                    no0 no0Var = no0.CUI_NAME_ADREQUEST_BUILDURL_CLIENT;
                    WeakHashMap weakHashMap = j13.a;
                    w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                    try {
                        jf2Var.p = map;
                        jf2Var.s = r8;
                        jf2Var.f();
                        JsonObject asJsonObject = jf2Var.r.toJsonTree(r8).getAsJsonObject();
                        Intrinsics.checkNotNullExpressionValue(asJsonObject, "getAsJsonObject(...)");
                        jf2Var.t = asJsonObject;
                        jf2Var.a(n32Var);
                        Set<Map.Entry> setEntrySet = jf2Var.v.entrySet();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(p002kotlin.ranges.wireman.wireman(polder.marial(p002kotlin.collections.dovishness.gintrap(setEntrySet, 10)), 16));
                        for (Map.Entry entry : setEntrySet) {
                            Object key = entry.getKey();
                            fo2 fo2Var = (fo2) entry.getValue();
                            if (fo2Var.t()) {
                                strValueOf = fo2Var.o() ? "1" : "0";
                            } else if (fo2Var.w()) {
                                strValueOf = fo2Var.s();
                            } else if (fo2Var.u()) {
                                strValueOf = String.valueOf(fo2Var.q());
                            } else if (fo2Var.v()) {
                                strValueOf = String.valueOf(fo2Var.r());
                            } else {
                                strValueOf = "";
                            }
                            Pair pairAttabal = formularize.attabal(key, strValueOf);
                            linkedHashMap.put(pairAttabal.getFirst(), pairAttabal.getSecond());
                        }
                        r8.preProcessedSignals = linkedHashMap;
                        df2Var.a = jf2Var;
                        df2Var.b = r8;
                        df2Var.c = b12Var;
                        df2Var.d = w03VarA;
                        df2Var.e = w03VarA;
                        df2Var.h = 1;
                        if (jf2Var.a(df2Var) != objBeachfront) {
                            r14 = jf2Var;
                            r13 = r8;
                            r3 = w03VarA;
                            b12Var2 = b12Var;
                            w03Var = w03VarA;
                        }
                        return objBeachfront;
                    } catch (Throwable th) {
                        th = th;
                        r1 = w03VarA;
                        r2 = w03VarA;
                        r2.b(th);
                        if (!(th instanceof evenfall)) {
                            r2.a(th);
                            if (!(th instanceof TimeoutCancellationException)) {
                                if (!(th instanceof CancellationException)) {
                                    if (th instanceof yn0) {
                                        throw th;
                                    }
                                    throw new gn0(th);
                                }
                                throw new bn0(th);
                            }
                            throw new cp0(th);
                        }
                        throw th;
                    }
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        Closeable closeable = (Closeable) df2Var.b;
                        w03 w03Var6 = (w03) df2Var.a;
                        p002kotlin.dern.saneness(obj);
                        r4 = closeable;
                        w03Var5 = w03Var6;
                        spartacistVar = (spartacist) obj;
                        r8 = r4;
                        df2Var = w03Var5;
                        if (spartacistVar instanceof nn0) {
                            y13.a((nn0) spartacistVar, false);
                        }
                        interaction.saneness.attabal(r8, null);
                        return spartacistVar;
                    }
                    if (i2 == 3) {
                        Closeable closeable2 = (Closeable) df2Var.b;
                        w03 w03Var7 = (w03) df2Var.a;
                        p002kotlin.dern.saneness(obj);
                        r5 = closeable2;
                        w03Var4 = w03Var7;
                        spartacistVar = (spartacist) obj;
                        r8 = r5;
                        df2Var = w03Var4;
                        if (spartacistVar instanceof nn0) {
                            y13.a((nn0) spartacistVar, false);
                        }
                        interaction.saneness.attabal(r8, null);
                        return spartacistVar;
                    }
                    if (i2 == 4) {
                        Closeable closeable3 = (Closeable) df2Var.b;
                        w03 w03Var8 = (w03) df2Var.a;
                        p002kotlin.dern.saneness(obj);
                        r6 = closeable3;
                        w03Var3 = w03Var8;
                        spartacistVar = (spartacist) obj;
                        r8 = r6;
                        df2Var = w03Var3;
                        if (spartacistVar instanceof nn0) {
                            y13.a((nn0) spartacistVar, false);
                        }
                        interaction.saneness.attabal(r8, null);
                        return spartacistVar;
                    }
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Closeable closeable4 = (Closeable) df2Var.b;
                    w03 w03Var9 = (w03) df2Var.a;
                    p002kotlin.dern.saneness(obj);
                    r7 = closeable4;
                    w03Var2 = w03Var9;
                    spartacistVar = (spartacist) obj;
                    r8 = r7;
                    df2Var = w03Var2;
                    if (spartacistVar instanceof nn0) {
                        y13.a((nn0) spartacistVar, false);
                    }
                    interaction.saneness.attabal(r8, null);
                    return spartacistVar;
                }
                r8 = df2Var.e;
                w03 w03Var10 = df2Var.d;
                b12Var2 = df2Var.c;
                arytenoidectomy arytenoidectomyVar2 = (arytenoidectomy) df2Var.b;
                jf2 jf2Var2 = (jf2) df2Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    w03Var = w03Var10;
                    r3 = r8;
                    r13 = arytenoidectomyVar2;
                    r14 = jf2Var2;
                } catch (Throwable th2) {
                    th = th2;
                    df2Var = w03Var10;
                    r2 = df2Var;
                    r1 = r8;
                    try {
                        r2.b(th);
                        if (!(th instanceof evenfall)) {
                            r2.a(th);
                            if (!(th instanceof TimeoutCancellationException)) {
                                if (!(th instanceof CancellationException)) {
                                    if (th instanceof yn0) {
                                        throw th;
                                    }
                                    throw new gn0(th);
                                }
                                throw new bn0(th);
                            }
                            throw new cp0(th);
                        }
                        throw th;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            interaction.saneness.attabal(r1, th3);
                            throw th4;
                        }
                    }
                }
                r13.localSignals = r14.u;
                JsonObject asJsonObject2 = r14.r.toJsonTree(r13).getAsJsonObject();
                Intrinsics.checkNotNullExpressionValue(asJsonObject2, "getAsJsonObject(...)");
                r14.t = asJsonObject2;
                triweekly triweeklyVar = kn0.a;
                kn0.a(new ef2(r14));
                Iterator it = b12Var2.q().iterator();
                while (true) {
                    if (it.hasNext()) {
                        z02 z02Var = (z02) it.next();
                        Intrinsics.beachfront(z02Var);
                        spartacist spartacistVarB = r14.b(z02Var);
                        if (spartacistVarB instanceof nn0) {
                            df2Var.a = w03Var;
                            df2Var.b = r3;
                            df2Var.c = null;
                            df2Var.d = null;
                            df2Var.e = null;
                            df2Var.h = 2;
                            Object objA = r14.a((nn0) spartacistVarB, df2Var);
                            if (objA != objBeachfront) {
                                w03Var5 = w03Var;
                                obj = objA;
                                r4 = r3;
                                spartacistVar = (spartacist) obj;
                                r8 = r4;
                                df2Var = w03Var5;
                                if (spartacistVar instanceof nn0) {
                                    y13.a((nn0) spartacistVar, false);
                                }
                                interaction.saneness.attabal(r8, null);
                                return spartacistVar;
                            }
                        } else {
                            Intrinsics.competently(spartacistVarB, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                            ((tn0) spartacistVarB).getClass();
                        }
                    } else {
                        r14.g();
                        for (Map.Entry entry2 : r14.q.entrySet()) {
                            String str2 = (String) entry2.getKey();
                            StringBuilder sb = (StringBuilder) entry2.getValue();
                            if (r14.n.isEmpty() || r14.n.contains(str2)) {
                                LinkedHashMap linkedHashMap2 = r14.o;
                                String string3 = sb.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                linkedHashMap2.put(str2, string3);
                            }
                        }
                        Bundle bundle = r13.googleExtrasBundle;
                        if (bundle != null && (string2 = bundle.getString("_testRequestUri")) != null) {
                            r14.j = string2;
                            Unit unit = Unit.f29295attabal;
                        }
                        boolean zWireman = Intrinsics.wireman(r13.isScarRequest, igo.attabal.attabal(true));
                        if (zWireman) {
                            uriA = r14.b();
                        } else {
                            uriA = r14.a();
                        }
                        if (zWireman) {
                            str = null;
                        } else {
                            int length = uriA.toString().length();
                            jk0 jk0Var = r14.a;
                            jk0Var.getClass();
                            Intrinsics.checkNotNullParameter("gads:url_size_to_post", X3.i.W);
                            if (length >= ((Number) jk0Var.a("gads:url_size_to_post", 15000, zk.f)).intValue()) {
                                String encodedQuery = uriA.getEncodedQuery();
                                uriA = uriA.buildUpon().clearQuery().build();
                                str = encodedQuery;
                            } else {
                                str = null;
                            }
                        }
                        if (zWireman) {
                            String query = uriA.getQuery();
                            if (query == null) {
                                rn0 rn0Var = new rn0("Csrb scar query result is empty", k41.INTERNAL_ERROR);
                                df2Var.a = w03Var;
                                df2Var.b = r3;
                                df2Var.c = null;
                                df2Var.d = null;
                                df2Var.e = null;
                                df2Var.h = 3;
                                Object objA2 = r14.a(rn0Var, df2Var);
                                if (objA2 != objBeachfront) {
                                    w03Var4 = w03Var;
                                    obj = objA2;
                                    r5 = r3;
                                    spartacistVar = (spartacist) obj;
                                    r8 = r5;
                                    df2Var = w03Var4;
                                    if (spartacistVar instanceof nn0) {
                                        y13.a((nn0) spartacistVar, false);
                                    }
                                    interaction.saneness.attabal(r8, null);
                                    return spartacistVar;
                                }
                            } else {
                                spartacist spartacistVarA = r14.d.a(query);
                                if (spartacistVarA instanceof tn0) {
                                    string = (String) ((tn0) spartacistVarA).b;
                                } else {
                                    if (!(spartacistVarA instanceof nn0)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    df2Var.a = w03Var;
                                    df2Var.b = r3;
                                    df2Var.c = null;
                                    df2Var.d = null;
                                    df2Var.e = null;
                                    df2Var.h = 4;
                                    Object objA3 = r14.a(spartacistVarA, df2Var);
                                    if (objA3 != objBeachfront) {
                                        w03Var3 = w03Var;
                                        obj = objA3;
                                        r6 = r3;
                                        spartacistVar = (spartacist) obj;
                                        r8 = r6;
                                        df2Var = w03Var3;
                                        if (spartacistVar instanceof nn0) {
                                            y13.a((nn0) spartacistVar, false);
                                        }
                                        interaction.saneness.attabal(r8, null);
                                        return spartacistVar;
                                    }
                                }
                            }
                        } else {
                            string = uriA.toString();
                            Intrinsics.beachfront(string);
                        }
                        tn0 tn0Var = new tn0(new xm(adultoid.formularize(), null, str, r14.l, string, r14.b().getQuery(), null));
                        df2Var.a = w03Var;
                        df2Var.b = r3;
                        df2Var.c = null;
                        df2Var.d = null;
                        df2Var.e = null;
                        df2Var.h = 5;
                        Object objA4 = r14.a(tn0Var, df2Var);
                        if (objA4 != objBeachfront) {
                            w03Var2 = w03Var;
                            obj = objA4;
                            r7 = r3;
                            spartacistVar = (spartacist) obj;
                            r8 = r7;
                            df2Var = w03Var2;
                            if (spartacistVar instanceof nn0) {
                                y13.a((nn0) spartacistVar, false);
                            }
                            interaction.saneness.attabal(r8, null);
                            return spartacistVar;
                        }
                    }
                    return objBeachfront;
                }
            } catch (Throwable th5) {
                th = th5;
                r1 = r3;
                r2 = w03Var;
                r2.b(th);
                if (!(th instanceof evenfall)) {
                    r2.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        if (!(th instanceof CancellationException)) {
                            if (th instanceof yn0) {
                                throw th;
                            }
                            throw new gn0(th);
                        }
                        throw new bn0(th);
                    }
                    throw new cp0(th);
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(wretchedly.dern dernVar) {
        ff2 ff2Var;
        jf2 jf2Var;
        AppStats appStats;
        if (dernVar instanceof ff2) {
            ff2Var = (ff2) dernVar;
            int i = ff2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ff2Var.d = i - Integer.MIN_VALUE;
            } else {
                ff2Var = new ff2(this, dernVar);
            }
        } else {
            ff2Var = new ff2(this, dernVar);
        }
        Object obj = ff2Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ff2Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            d();
            com.google.android.libraries.ads.mobile.sdk.nativead.dern dernVar2 = (com.google.android.libraries.ads.mobile.sdk.nativead.dern) monocoque.attabal.saneness(this.e);
            if (dernVar2 != null) {
                executant builder = tm1.o();
                Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
                Intrinsics.checkNotNullParameter(builder, "builder");
                if (dernVar2.getIsImageLoadingDisabled()) {
                    builder.beachfront();
                }
                if (dernVar2.getF19448adultoid()) {
                    builder.taiyuan();
                }
                if (dernVar2.getMediaAspectRatio() != NativeAd.NativeMediaAspectRatio.UNKNOWN) {
                    String value = dernVar2.getMediaAspectRatio().name().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(value, "toLowerCase(...)");
                    Intrinsics.checkNotNullParameter(value, "value");
                    builder.marial(value);
                }
                builder.attabal(dernVar2.getAdChoicesPlacement().getValue());
                NativeAd.SwipeGestureDirection customClickGestureDirection = dernVar2.getCustomClickGestureDirection();
                if (customClickGestureDirection != null) {
                    incuse builder2 = vm1.o();
                    Intrinsics.checkNotNullExpressionValue(builder2, "newBuilder(...)");
                    Intrinsics.checkNotNullParameter(builder2, "builder");
                    builder2.attabal(customClickGestureDirection.getValue());
                    if (dernVar2.getCustomClickGestureAllowTaps()) {
                        builder2.dern();
                    }
                    xm0 xm0VarA = builder2.a();
                    Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
                    vm1 value2 = (vm1) xm0VarA;
                    Intrinsics.checkNotNullParameter(value2, "value");
                    builder.dern(value2);
                }
                if (dernVar2.getCom.ironsource.X3.i.O java.lang.String() != null) {
                    builder.impromptu();
                    builder.competently();
                }
                complexometry.dovishness videoOptions = dernVar2.getVideoOptions();
                if (videoOptions != null) {
                    exonumist builder3 = xm1.o();
                    Intrinsics.checkNotNullExpressionValue(builder3, "newBuilder(...)");
                    Intrinsics.checkNotNullParameter(builder3, "builder");
                    if (videoOptions.getStartMuted()) {
                        builder3.wireman();
                    }
                    if (videoOptions.getClickToExpandRequested()) {
                        builder3.attabal();
                    }
                    if (videoOptions.getCustomControlsRequested()) {
                        builder3.dern();
                    }
                    xm0 xm0VarA2 = builder3.a();
                    Intrinsics.checkNotNullExpressionValue(xm0VarA2, "build(...)");
                    xm1 value3 = (xm1) xm0VarA2;
                    Intrinsics.checkNotNullParameter(value3, "value");
                    builder.wireman(value3);
                }
                xm0 xm0VarA3 = builder.a();
                Intrinsics.checkNotNullExpressionValue(xm0VarA3, "build(...)");
                JsonObject jsonObject = this.u;
                String str = (String) dm.NATIVE_AD_OPTIONS.a.get(0);
                byte[] bArrEncode = Base64.encode(((tm1) xm0VarA3).a(), 10);
                Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(...)");
                jsonObject.addProperty(str, dovishness.polder(new String(bArrEncode, Charsets.UTF_8), X3.j.b, ".", false, 4, null));
            }
            arytenoidectomy arytenoidectomyVar = this.s;
            arytenoidectomy arytenoidectomyVar2 = null;
            if (arytenoidectomyVar == null) {
                Intrinsics.preprohormone("signals");
                arytenoidectomyVar = null;
            }
            Set<String> set = arytenoidectomyVar.neighboringContentUrls;
            if (set != null) {
                ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(set, 10));
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(Uri.encode((String) it.next()));
                }
                JsonArray jsonArray = new JsonArray();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    jsonArray.add((String) it2.next());
                }
                this.u.add("neighboring_content_urls", jsonArray);
            }
            jk0 jk0Var = this.a;
            jk0Var.getClass();
            Map defaultValue = seminary.impassible(formularize.attabal("IAB_AUDIENCE_1_1", "3"), formularize.attabal("IAB_CONTENT_2_1", "4"), formularize.attabal("IAB_CONTENT_2_2", CampaignEx.CLICKMODE_ON));
            Intrinsics.checkNotNullParameter("pps_tx", X3.i.W);
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Map map = (Map) jk0Var.a("pps_tx", defaultValue, zk.p);
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String strA = a((String) entry.getKey(), (String) entry.getValue());
                if (strA != null) {
                    arrayList2.add(strA);
                }
            }
            String strPreterite = CollectionsKt.preterite(arrayList2, "~", null, null, 0, null, null, 62, null);
            if (!StringsKt.empress(strPreterite)) {
                this.u.addProperty((String) dm.PUB_PROVIDED_SIGNALS.a.get(0), strPreterite);
            }
            arytenoidectomy arytenoidectomyVar3 = this.s;
            if (arytenoidectomyVar3 == null) {
                Intrinsics.preprohormone("signals");
                arytenoidectomyVar3 = null;
            }
            QualitySignals qualitySignals = arytenoidectomyVar3.qualitySignals;
            if (qualitySignals != null && (appStats = qualitySignals.appStats) != null) {
                long j = appStats.timeInSessionMilliseconds;
                this.u.addProperty((String) dm.TIME_IN_SESSION.a.get(0), String.valueOf(j));
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                long j2 = 60000;
                this.u.addProperty((String) dm.SESSION_START_TIMESTAMP.a.get(0), String.valueOf((jCurrentTimeMillis / j2) * j2));
            }
            arytenoidectomy arytenoidectomyVar4 = this.s;
            if (arytenoidectomyVar4 == null) {
                Intrinsics.preprohormone("signals");
                arytenoidectomyVar4 = null;
            }
            String str2 = arytenoidectomyVar4.multipleAdSizeString;
            if (str2 != null) {
                this.u.addProperty((String) dm.IU_SIZES.a.get(0), str2);
            }
            arytenoidectomy arytenoidectomyVar5 = this.s;
            if (arytenoidectomyVar5 == null) {
                Intrinsics.preprohormone("signals");
                arytenoidectomyVar5 = null;
            }
            String str3 = arytenoidectomyVar5.format;
            if (str3 != null) {
                fo2 fo2Var = (fo2) this.v.get("request_type");
                if (fo2Var != null && fo2Var.r() == xf2.REQUEST_TYPE_ADX.getNumber() && !Intrinsics.wireman(str3, "interstitial_mb")) {
                    this.u.addProperty((String) dm.FORMAT.a.get(0), dovishness.polder(str3, "_as", "_mb", false, 4, null));
                } else {
                    this.u.addProperty((String) dm.FORMAT.a.get(0), str3);
                }
            }
            arytenoidectomy arytenoidectomyVar6 = this.s;
            if (arytenoidectomyVar6 == null) {
                Intrinsics.preprohormone("signals");
                arytenoidectomyVar6 = null;
            }
            AdSizeBundle adSizeBundle = (AdSizeBundle) CollectionsKt.firstOrNull(arytenoidectomyVar6.adSizeArray);
            if (adSizeBundle != null) {
                JsonObject jsonObject2 = this.u;
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty("width", Integer.valueOf(adSizeBundle.width));
                jsonObject3.addProperty("height", Integer.valueOf(adSizeBundle.height));
                Unit unit = Unit.f29295attabal;
                jsonObject2.add("p_sz", jsonObject3);
            }
            JsonObject jsonObject4 = this.u;
            String str4 = (String) dm.MOBILE_SCREEN_ORIENTATION.a.get(0);
            arytenoidectomy arytenoidectomyVar7 = this.s;
            if (arytenoidectomyVar7 == null) {
                Intrinsics.preprohormone("signals");
                arytenoidectomyVar7 = null;
            }
            int i3 = arytenoidectomyVar7.screenWidth;
            arytenoidectomy arytenoidectomyVar8 = this.s;
            if (arytenoidectomyVar8 == null) {
                Intrinsics.preprohormone("signals");
                arytenoidectomyVar8 = null;
            }
            jsonObject4.addProperty(str4, i3 > arytenoidectomyVar8.screenHeight ? "l" : TtmlNode.TAG_P);
            JsonObject jsonObject5 = this.u;
            String str5 = (String) dm.SCREEN_WIDTH.a.get(0);
            arytenoidectomy arytenoidectomyVar9 = this.s;
            if (arytenoidectomyVar9 == null) {
                Intrinsics.preprohormone("signals");
                arytenoidectomyVar9 = null;
            }
            jsonObject5.addProperty(str5, String.valueOf(arytenoidectomyVar9.screenWidthDip));
            JsonObject jsonObject6 = this.u;
            String str6 = (String) dm.SCREEN_HEIGHT.a.get(0);
            arytenoidectomy arytenoidectomyVar10 = this.s;
            if (arytenoidectomyVar10 == null) {
                Intrinsics.preprohormone("signals");
            } else {
                arytenoidectomyVar2 = arytenoidectomyVar10;
            }
            jsonObject6.addProperty(str6, String.valueOf(arytenoidectomyVar2.screenHeightDip));
            ff2Var.a = this;
            ff2Var.d = 1;
            if (b(ff2Var) == objBeachfront) {
                return objBeachfront;
            }
            jf2Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jf2Var = ff2Var.a;
            p002kotlin.dern.saneness(obj);
        }
        JsonObject jsonObject7 = jf2Var.u;
        jf2Var.f.getClass();
        jsonObject7.addProperty("c", String.valueOf(new Random().nextLong()));
        jf2Var.e();
        jf2Var.c();
        return Unit.f29295attabal;
    }

    public final void a(n32 n32Var) {
        for (l32 l32Var : n32Var.q()) {
            if (l32Var.q()) {
                pc1 pc1VarP = l32Var.p();
                Intrinsics.checkNotNullExpressionValue(pc1VarP, "getPattern(...)");
                if (a(pc1VarP)) {
                }
            }
            Map mapO = l32Var.o();
            Intrinsics.checkNotNullExpressionValue(mapO, "getIncludeSignalsMap(...)");
            for (Map.Entry entry : mapO.entrySet()) {
                String str = (String) entry.getKey();
                fo2 fo2Var = (fo2) entry.getValue();
                LinkedHashMap linkedHashMap = this.v;
                Intrinsics.beachfront(str);
                Intrinsics.beachfront(fo2Var);
                linkedHashMap.put(str, fo2Var);
            }
        }
    }

    public final String a(String str, String str2) {
        Iterable iterable;
        String strPreterite;
        arytenoidectomy arytenoidectomyVar = this.s;
        if (arytenoidectomyVar == null) {
            Intrinsics.preprohormone("signals");
            arytenoidectomyVar = null;
        }
        Bundle bundle = arytenoidectomyVar.googleExtrasBundle;
        if (bundle == null || (stringArrayList = bundle.getIntegerArrayList(str)) == null) {
            arytenoidectomy arytenoidectomyVar2 = this.s;
            if (arytenoidectomyVar2 == null) {
                Intrinsics.preprohormone("signals");
                arytenoidectomyVar2 = null;
            }
            Bundle bundle2 = arytenoidectomyVar2.googleExtrasBundle;
            if (bundle2 != null) {
                Iterable stringArrayList = bundle2.getStringArrayList(str);
                iterable = stringArrayList;
            } else {
                iterable = null;
            }
        } else {
            iterable = stringArrayList;
        }
        if (iterable != null && (strPreterite = CollectionsKt.preterite(iterable, "|", null, null, 0, null, null, 62, null)) != null) {
            String str3 = str2 + X3.j.b + strPreterite;
            if (new Regex(this.a.m0()).matches(str3)) {
                return str3;
            }
        }
        return null;
    }

    public final void a(z02 z02Var, qv0 qv0Var) {
        String strTriweekly;
        JsonObject jsonObject = this.t;
        Unit unit = null;
        if (jsonObject == null) {
            Intrinsics.preprohormone("signalJson");
            jsonObject = null;
        }
        prescient prescientVarZ = qv0Var.z();
        Intrinsics.checkNotNullExpressionValue(prescientVarZ, "getPathList(...)");
        JsonElement jsonElementApical = sultanate.apical(jsonObject, prescientVarZ);
        if (jsonElementApical == null) {
            return;
        }
        int iOrdinal = qv0Var.B().ordinal();
        if (iOrdinal == 0) {
            strTriweekly = null;
        } else if (iOrdinal == 1) {
            strTriweekly = sultanate.triweekly(jsonElementApical, qv0Var);
        } else if (iOrdinal == 2) {
            strTriweekly = sultanate.marial(jsonElementApical, qv0Var);
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            strTriweekly = null;
        } else {
            strTriweekly = sultanate.formularize(jsonElementApical, qv0Var);
        }
        if (strTriweekly == null) {
            return;
        }
        if (qv0Var.E()) {
            String strQ = qv0Var.q();
            Intrinsics.checkNotNullExpressionValue(strQ, "getCaptureGroup(...)");
            if (strQ.length() > 0) {
                laky lakyVar = ip0.f;
                String strQ2 = qv0Var.q();
                Intrinsics.checkNotNullExpressionValue(strQ2, "getCaptureGroup(...)");
                String strMarial = laky.marial(strQ2, strTriweekly);
                if (strMarial != null) {
                    unit = Unit.f29295attabal;
                    strTriweekly = strMarial;
                }
                if (unit == null) {
                    return;
                }
            }
        }
        if (!qv0Var.F() || strTriweekly.length() <= qv0Var.w()) {
            String strC = qv0Var.C();
            if (strC == null || StringsKt.empress(strC)) {
                prescient prescientVarZ2 = qv0Var.z();
                Intrinsics.checkNotNullExpressionValue(prescientVarZ2, "getPathList(...)");
                strC = (String) CollectionsKt.picketboat(prescientVarZ2);
            }
            if (strC != null && !StringsKt.empress(strC)) {
                String strA = z02Var.A();
                Intrinsics.checkNotNullExpressionValue(strA, "getRuleLabel(...)");
                a(strC, strTriweekly, strA);
                return;
            }
            String str = "Rule " + z02Var.A() + " attempted to include a signal with no URL key or path.";
            ((d13) this.c).a(str, new Exception(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4 A[LOOP:0: B:43:0x00de->B:45:0x00e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0105  */
    /* JADX WARN: Code duplicated, block: B:52:0x0132  */
    /* JADX WARN: Code duplicated, block: B:55:0x0141 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0142  */
    /* JADX WARN: Code duplicated, block: B:58:0x0146  */
    /* JADX WARN: Code duplicated, block: B:60:0x0151  */
    /* JADX WARN: Code duplicated, block: B:61:0x0154  */
    /* JADX WARN: Code duplicated, block: B:63:0x0157  */
    /* JADX WARN: Code duplicated, block: B:68:0x0162  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(spartacist spartacistVar, wretchedly.dern dernVar) {
        hf2 hf2Var;
        jf2 jf2Var;
        JsonObject jsonObject;
        JsonObject jsonObject2;
        JsonObject jsonObject3;
        String str;
        vocationalize vocationalizeVar;
        spartacist spartacistVar2;
        vocationalize vocationalizeVar2;
        spartacist spartacistVarAttabal;
        tn0 tn0Var;
        xm xmVar;
        if (dernVar instanceof hf2) {
            hf2Var = (hf2) dernVar;
            int i = hf2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                hf2Var.e = i - Integer.MIN_VALUE;
            } else {
                hf2Var = new hf2(this, dernVar);
            }
        } else {
            hf2Var = new hf2(this, dernVar);
        }
        Object objC = hf2Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = hf2Var.e;
        String str2 = null;
        boolean z = true;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objC);
            int i3 = this.a.x;
            if (i3 == 2) {
                jf2Var = this;
                if (!z) {
                    return spartacistVar;
                }
                jsonObject = new JsonObject();
                jsonObject2 = jf2Var.t;
                if (jsonObject2 == null) {
                    Intrinsics.preprohormone("signalJson");
                    jsonObject2 = null;
                }
                jsonObject.add("signals", jsonObject2);
                if (spartacistVar instanceof rn0) {
                    jsonObject.addProperty("error", ((rn0) spartacistVar).c);
                } else if (spartacistVar instanceof nn0) {
                    jsonObject.addProperty("error", spartacistVar.toString());
                } else if (spartacistVar instanceof tn0) {
                    triweekly triweeklyVar = kn0.a;
                    kn0.a(new if2(spartacistVar));
                    xm xmVar2 = (xm) ((tn0) spartacistVar).b;
                    jsonObject.addProperty("cookies_include", igo.attabal.attabal(xmVar2.d));
                    jsonObject.addProperty("url", xmVar2.e);
                    jsonObject3 = new JsonObject();
                    for (Map.Entry entry : jf2Var.o.entrySet()) {
                        jsonObject3.addProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    Unit unit = Unit.f29295attabal;
                    jsonObject.add("c_params", jsonObject3);
                    str = xmVar2.c;
                    if (str != null) {
                        jsonObject.addProperty("post_body", str);
                        jsonObject.addProperty("content_type", "text/plain");
                    }
                }
                vocationalizeVar = xm.h;
                hydrofracturing hydrofracturingVar = jf2Var.g;
                hf2Var.a = spartacistVar;
                hf2Var.b = vocationalizeVar;
                hf2Var.e = 2;
                hydrofracturingVar.getClass();
                String string = jsonObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                objC = ((cf0) hydrofracturingVar).a("google.afma.request.patchCSRB", string, hf2Var);
                if (objC != objBeachfront) {
                    spartacistVar2 = spartacistVar;
                    vocationalizeVar2 = vocationalizeVar;
                    vocationalizeVar2.getClass();
                    spartacistVarAttabal = vocationalize.attabal((spartacist) objC);
                    if (spartacistVarAttabal instanceof nn0) {
                        return spartacistVarAttabal;
                    }
                    if (spartacistVarAttabal instanceof tn0) {
                        xm xmVar3 = (xm) ((tn0) spartacistVarAttabal).b;
                        if (spartacistVar2 instanceof tn0) {
                            tn0Var = (tn0) spartacistVar2;
                        } else {
                            tn0Var = null;
                        }
                        if (tn0Var != null) {
                            str2 = xmVar.f;
                        }
                        xmVar3.f = str2;
                        return spartacistVarAttabal;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            } else if (i3 == 1) {
                hydrofracturing hydrofracturingVar2 = this.g;
                hf2Var.a = this;
                hf2Var.b = spartacistVar;
                hf2Var.e = 1;
                objC = ((cf0) hydrofracturingVar2).c(hf2Var);
                if (objC != objBeachfront) {
                    jf2Var = this;
                }
            } else {
                jf2Var = this;
                z = false;
                if (!z) {
                    return spartacistVar;
                }
                jsonObject = new JsonObject();
                jsonObject2 = jf2Var.t;
                if (jsonObject2 == null) {
                    Intrinsics.preprohormone("signalJson");
                    jsonObject2 = null;
                }
                jsonObject.add("signals", jsonObject2);
                if (spartacistVar instanceof rn0) {
                    jsonObject.addProperty("error", ((rn0) spartacistVar).c);
                } else if (spartacistVar instanceof nn0) {
                    jsonObject.addProperty("error", spartacistVar.toString());
                } else if (spartacistVar instanceof tn0) {
                    triweekly triweeklyVar2 = kn0.a;
                    kn0.a(new if2(spartacistVar));
                    xm xmVar4 = (xm) ((tn0) spartacistVar).b;
                    jsonObject.addProperty("cookies_include", igo.attabal.attabal(xmVar4.d));
                    jsonObject.addProperty("url", xmVar4.e);
                    jsonObject3 = new JsonObject();
                    while (r7.hasNext()) {
                        jsonObject3.addProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    Unit unit2 = Unit.f29295attabal;
                    jsonObject.add("c_params", jsonObject3);
                    str = xmVar4.c;
                    if (str != null) {
                        jsonObject.addProperty("post_body", str);
                        jsonObject.addProperty("content_type", "text/plain");
                    }
                }
                vocationalizeVar = xm.h;
                hydrofracturing hydrofracturingVar3 = jf2Var.g;
                hf2Var.a = spartacistVar;
                hf2Var.b = vocationalizeVar;
                hf2Var.e = 2;
                hydrofracturingVar3.getClass();
                String string2 = jsonObject.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                objC = ((cf0) hydrofracturingVar3).a("google.afma.request.patchCSRB", string2, hf2Var);
                if (objC != objBeachfront) {
                    spartacistVar2 = spartacistVar;
                    vocationalizeVar2 = vocationalizeVar;
                    vocationalizeVar2.getClass();
                    spartacistVarAttabal = vocationalize.attabal((spartacist) objC);
                    if (spartacistVarAttabal instanceof nn0) {
                        return spartacistVarAttabal;
                    }
                    if (spartacistVarAttabal instanceof tn0) {
                        xm xmVar5 = (xm) ((tn0) spartacistVarAttabal).b;
                        if (spartacistVar2 instanceof tn0) {
                            tn0Var = (tn0) spartacistVar2;
                        } else {
                            tn0Var = null;
                        }
                        if (tn0Var != null) {
                            str2 = xmVar.f;
                        }
                        xmVar5.f = str2;
                        return spartacistVarAttabal;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            spartacistVar = (spartacist) hf2Var.b;
            jf2Var = (jf2) hf2Var.a;
            p002kotlin.dern.saneness(objC);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vocationalizeVar2 = (vocationalize) hf2Var.b;
            spartacistVar2 = (spartacist) hf2Var.a;
            p002kotlin.dern.saneness(objC);
        }
        vocationalizeVar2.getClass();
        spartacistVarAttabal = vocationalize.attabal((spartacist) objC);
        if (spartacistVarAttabal instanceof nn0) {
            return spartacistVarAttabal;
        }
        if (spartacistVarAttabal instanceof tn0) {
            xm xmVar6 = (xm) ((tn0) spartacistVarAttabal).b;
            if (spartacistVar2 instanceof tn0) {
                tn0Var = (tn0) spartacistVar2;
            } else {
                tn0Var = null;
            }
            if (tn0Var != null && (xmVar = (xm) tn0Var.b) != null) {
                str2 = xmVar.f;
            }
            xmVar6.f = str2;
            return spartacistVarAttabal;
        }
        throw new NoWhenBranchMatchedException();
        if (!((Boolean) objC).booleanValue()) {
            z = false;
        }
        if (!z) {
            return spartacistVar;
        }
        jsonObject = new JsonObject();
        jsonObject2 = jf2Var.t;
        if (jsonObject2 == null) {
            Intrinsics.preprohormone("signalJson");
            jsonObject2 = null;
        }
        jsonObject.add("signals", jsonObject2);
        if (spartacistVar instanceof rn0) {
            jsonObject.addProperty("error", ((rn0) spartacistVar).c);
        } else if (spartacistVar instanceof nn0) {
            jsonObject.addProperty("error", spartacistVar.toString());
        } else if (spartacistVar instanceof tn0) {
            triweekly triweeklyVar3 = kn0.a;
            kn0.a(new if2(spartacistVar));
            xm xmVar7 = (xm) ((tn0) spartacistVar).b;
            jsonObject.addProperty("cookies_include", igo.attabal.attabal(xmVar7.d));
            jsonObject.addProperty("url", xmVar7.e);
            jsonObject3 = new JsonObject();
            while (r7.hasNext()) {
                jsonObject3.addProperty((String) entry.getKey(), (String) entry.getValue());
            }
            Unit unit3 = Unit.f29295attabal;
            jsonObject.add("c_params", jsonObject3);
            str = xmVar7.c;
            if (str != null) {
                jsonObject.addProperty("post_body", str);
                jsonObject.addProperty("content_type", "text/plain");
            }
        }
        vocationalizeVar = xm.h;
        hydrofracturing hydrofracturingVar4 = jf2Var.g;
        hf2Var.a = spartacistVar;
        hf2Var.b = vocationalizeVar;
        hf2Var.e = 2;
        hydrofracturingVar4.getClass();
        String string3 = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        objC = ((cf0) hydrofracturingVar4).a("google.afma.request.patchCSRB", string3, hf2Var);
        if (objC != objBeachfront) {
            spartacistVar2 = spartacistVar;
            vocationalizeVar2 = vocationalizeVar;
            vocationalizeVar2.getClass();
            spartacistVarAttabal = vocationalize.attabal((spartacist) objC);
            if (spartacistVarAttabal instanceof nn0) {
                return spartacistVarAttabal;
            }
            if (spartacistVarAttabal instanceof tn0) {
                xm xmVar8 = (xm) ((tn0) spartacistVarAttabal).b;
                if (spartacistVar2 instanceof tn0) {
                    tn0Var = (tn0) spartacistVar2;
                } else {
                    tn0Var = null;
                }
                if (tn0Var != null) {
                    str2 = xmVar.f;
                }
                xmVar8.f = str2;
                return spartacistVarAttabal;
            }
            throw new NoWhenBranchMatchedException();
        }
        return objBeachfront;
    }

    public final boolean a(pc1 pc1Var) {
        if (pc1Var.o().size() > 0) {
            prescient<pc1> prescientVarO = pc1Var.o();
            Intrinsics.checkNotNullExpressionValue(prescientVarO, "getAndNodesList(...)");
            if ((prescientVarO instanceof Collection) && prescientVarO.isEmpty()) {
                return true;
            }
            for (pc1 pc1Var2 : prescientVarO) {
                Intrinsics.beachfront(pc1Var2);
                if (!a(pc1Var2)) {
                    return false;
                }
            }
            return true;
        }
        if (pc1Var.s().size() > 0) {
            prescient<pc1> prescientVarS = pc1Var.s();
            Intrinsics.checkNotNullExpressionValue(prescientVarS, "getOrNodesList(...)");
            if ((prescientVarS instanceof Collection) && prescientVarS.isEmpty()) {
                return false;
            }
            for (pc1 pc1Var3 : prescientVarS) {
                Intrinsics.beachfront(pc1Var3);
                if (a(pc1Var3)) {
                    return true;
                }
            }
            return false;
        }
        if (pc1Var.u()) {
            pc1 pc1VarR = pc1Var.r();
            Intrinsics.checkNotNullExpressionValue(pc1VarR, "getNotNode(...)");
            return !a(pc1VarR);
        }
        if (!pc1Var.t()) {
            return true;
        }
        JsonObject jsonObject = this.t;
        if (jsonObject == null) {
            Intrinsics.preprohormone("signalJson");
            jsonObject = null;
        }
        hd1 hd1VarQ = pc1Var.q();
        Intrinsics.checkNotNullExpressionValue(hd1VarQ, "getMatchNode(...)");
        return sultanate.cutely(jsonObject, hd1VarQ);
    }

    public final spartacist a(z02 z02Var) {
        k41 k41Var;
        Map mapX = z02Var.x();
        Intrinsics.checkNotNullExpressionValue(mapX, "getIncludeMap(...)");
        for (Map.Entry entry : mapX.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Intrinsics.beachfront(str);
            Intrinsics.beachfront(str2);
            String strA = z02Var.A();
            Intrinsics.checkNotNullExpressionValue(strA, "getRuleLabel(...)");
            a(str, str2, strA);
        }
        for (qv0 qv0Var : z02Var.y()) {
            Intrinsics.beachfront(qv0Var);
            a(z02Var, qv0Var);
        }
        for (String str3 : z02Var.s()) {
            LinkedHashSet linkedHashSet = this.m;
            Intrinsics.beachfront(str3);
            linkedHashSet.add(str3);
        }
        for (String str4 : z02Var.t()) {
            triweekly triweeklyVar = kn0.a;
            Intrinsics.beachfront(str4);
            kn0.b(str4, null);
        }
        for (String str5 : z02Var.p()) {
            LinkedHashSet linkedHashSet2 = this.n;
            Intrinsics.beachfront(str5);
            linkedHashSet2.add(str5);
        }
        if (z02Var.B()) {
            this.l = z02Var.o();
        }
        if (z02Var.E()) {
            if (z02Var.D()) {
                switch (z02Var.v()) {
                    case 0:
                        k41Var = k41.INTERNAL_ERROR;
                        break;
                    case 1:
                        k41Var = k41.INVALID_REQUEST;
                        break;
                    case 2:
                        k41Var = k41.NETWORK_ERROR;
                        break;
                    case 3:
                        k41Var = k41.NO_FILL;
                        break;
                    case 4:
                        k41Var = k41.TIMEOUT;
                        break;
                    case 5:
                        k41Var = k41.CANCELLED;
                        break;
                    case 6:
                    case 7:
                    case 9:
                    default:
                        k41Var = k41.INTERNAL_ERROR;
                        break;
                    case 8:
                        k41Var = k41.APP_ID_MISSING;
                        break;
                    case 10:
                        k41Var = k41.REQUEST_ID_MISMATCH;
                        break;
                    case 11:
                        k41Var = k41.INVALID_AD_RESPONSE;
                        break;
                    case 12:
                        k41Var = k41.AD_RESPONSE_ALREADY_USED;
                        break;
                }
            } else {
                k41Var = k41.INTERNAL_ERROR;
            }
            String strW = z02Var.w();
            Intrinsics.checkNotNullExpressionValue(strW, "getErrorString(...)");
            return new rn0(strW, k41Var);
        }
        if (z02Var.C()) {
            if (this.k) {
                String str6 = "Rule " + z02Var.A() + " attempted to modify the base URL after it has been set.";
                ((d13) this.c).a(str6, new Exception(str6));
            } else {
                String strR = z02Var.r();
                Intrinsics.checkNotNullExpressionValue(strR, "getBaseUrl(...)");
                this.j = strR;
                this.k = true;
            }
        }
        return new tn0(Unit.f29295attabal);
    }

    public final void a(String str, String str2, String str3) {
        if (StringsKt.empress(str)) {
            String str4 = "Rule " + str3 + " attempted to set a blank URL parameter.";
            ((d13) this.c).a(str4, new Exception(str4));
            return;
        }
        if (this.o.containsKey(str)) {
            String str5 = "URL parameter " + str + " was attempted to be overwritten by rule " + str3 + ".";
            ((d13) this.c).a(str5, new Exception(str5));
            return;
        }
        Map map = this.p;
        Map map2 = null;
        if (map == null) {
            Intrinsics.preprohormone("concatenatedSignalsRules");
            map = null;
        }
        if (map.containsKey(str)) {
            Map map3 = this.p;
            if (map3 == null) {
                Intrinsics.preprohormone("concatenatedSignalsRules");
            } else {
                map2 = map3;
            }
            Object obj = map2.get(str);
            Intrinsics.beachfront(obj);
            String str6 = (String) obj;
            StringBuilder sb = (StringBuilder) this.q.get(str);
            if (sb == null) {
                sb = new StringBuilder();
            }
            if (sb.length() > 0) {
                sb.append(str6);
            }
            sb.append(str2);
            this.q.put(str, sb);
            return;
        }
        this.o.put(str, str2);
    }
}
