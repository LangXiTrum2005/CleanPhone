package ads_mobile_sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.util.Base64;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p002kotlin.collections.polder;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import saneness.ammonoid;
import saneness.bally;
import saneness.deadwork;
import saneness.irredeemable;
import saneness.loun;
import saneness.stupefactive;
import saneness.uniterm;
import saneness.yaounde;

/* JADX INFO: loaded from: classes.dex */
public abstract class ik implements stupefactive {
    public final Context b;
    public final sj0 c;
    public final ll2 d;
    public final yf e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public JsonObject h;
    public final AtomicReference i;
    public final AtomicReference j;
    public final AtomicReference k;
    public final AtomicReference l;
    public final AtomicBoolean m;
    public boolean n;
    public boolean o;
    public boolean p;

    public ik(Context applicationContext, sj0 flagDataStore, ll2 sdkCoreDataStore, yf appSettingsDataStore) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(flagDataStore, "flagDataStore");
        Intrinsics.checkNotNullParameter(sdkCoreDataStore, "sdkCoreDataStore");
        Intrinsics.checkNotNullParameter(appSettingsDataStore, "appSettingsDataStore");
        this.b = applicationContext;
        this.c = flagDataStore;
        this.d = sdkCoreDataStore;
        this.e = appSettingsDataStore;
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        uniterm unitermVarV = mv.v();
        Intrinsics.checkNotNullExpressionValue(unitermVarV, "newBuilder(...)");
        this.i = new AtomicReference(bally.attabal(unitermVarV).a());
        saneness.wireman wiremanVarR = b12.r();
        Intrinsics.checkNotNullExpressionValue(wiremanVarR, "newBuilder(...)");
        this.j = new AtomicReference(deadwork.attabal(wiremanVarR).a());
        irredeemable irredeemableVarR = n32.r();
        Intrinsics.checkNotNullExpressionValue(irredeemableVarR, "newBuilder(...)");
        this.k = new AtomicReference(ammonoid.attabal(irredeemableVarR).a());
        this.l = new AtomicReference(seminary.taiyuan());
        this.m = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        if (r7 == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.ik r7, wretchedly.dern r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof ads_mobile_sdk.ak
            if (r0 == 0) goto L16
            r0 = r8
            ads_mobile_sdk.ak r0 = (ads_mobile_sdk.ak) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            ads_mobile_sdk.ak r0 = new ads_mobile_sdk.ak
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L48
            if (r2 == r6) goto L42
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            p002kotlin.dern.saneness(r8)
            goto Lb0
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            ads_mobile_sdk.ik r7 = r0.a
            p002kotlin.dern.saneness(r8)
            goto L78
        L42:
            ads_mobile_sdk.ik r7 = r0.a
            p002kotlin.dern.saneness(r8)
            goto L66
        L48:
            p002kotlin.dern.saneness(r8)
            r7.o = r6
            com.google.gson.JsonObject r8 = new com.google.gson.JsonObject
            r8.<init>()
            java.lang.String r2 = "<set-?>"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            r7.h = r8
            ads_mobile_sdk.sj0 r8 = r7.c
            r0.a = r7
            r0.d = r6
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L66
            goto Laf
        L66:
            ads_mobile_sdk.ll2 r8 = r7.d
            r0.a = r7
            r0.d = r4
            r8.getClass()
            java.lang.String r2 = ""
            java.lang.Object r8 = ads_mobile_sdk.ll2.a(r8, r2, r0)
            if (r8 != r1) goto L78
            goto Laf
        L78:
            ads_mobile_sdk.yf r7 = r7.e
            r0.a = r5
            r0.d = r3
            r7.getClass()
            ads_mobile_sdk.vf r8 = ads_mobile_sdk.vf.w()
            java.lang.String r2 = "getDefaultInstance(...)"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            saneness.delouse r7 = r7.a
            java.lang.Object r7 = r7.get()
            androidx.datastore.core.competently r7 = (androidx.datastore.core.competently) r7
            ads_mobile_sdk.xf r2 = new ads_mobile_sdk.xf
            r2.<init>(r8, r5)
            java.lang.Object r7 = r7.attabal(r2, r0)
            java.lang.Object r8 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            if (r7 != r8) goto La2
            goto La4
        La2:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
        La4:
            java.lang.Object r8 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            if (r7 != r8) goto Lab
            goto Lad
        Lab:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
        Lad:
            if (r7 != r1) goto Lb0
        Laf:
            return r1
        Lb0:
            java.lang.String r7 = "Flags were reset because too many sessions have passed without updating flags"
            r8 = 6
            ads_mobile_sdk.y13.a(r7, r5, r8)
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ik.a(ads_mobile_sdk.ik, wretchedly.dern):java.lang.Object");
    }

    public final Object b(String key, Function1 converter) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(converter, "converter");
        try {
            JsonObject jsonObject = this.h;
            if (jsonObject == null) {
                Intrinsics.preprohormone("flagJson");
                jsonObject = null;
            }
            JsonElement jsonElement = jsonObject.get(key);
            Intrinsics.checkNotNullExpressionValue(jsonElement, "get(...)");
            return converter.invoke(jsonElement);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final boolean a(ik ikVar, ActivityManager activityManager, JsonObject jsonObject) {
        double asDouble;
        ikVar.getClass();
        double dMax = Math.max(1.0d, Math.min(((Number) a(jsonObject, "gads:previous_exit_reason_reset_threshold", Double.valueOf(2.0d), bk.a)).doubleValue(), 10.0d));
        int iMax = Math.max(1, Math.min(Math.max(((int) dMax) * 2, ((Number) a(jsonObject, "gads:previous_exit_reasons_to_scan", 10, dk.a)).intValue()), 20));
        stupefactive.f37321attabal.getClass();
        JsonObject jsonObject2 = (JsonObject) a(jsonObject, "gads:previous_exit_reason_values", bk0.b, ck.a);
        double dMin = Math.min(1.0d, ((Number) a(jsonObject, "gads:unspecified_exit_reason_value", Double.valueOf(0.25d), ek.a)).doubleValue());
        List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(ikVar.b.getPackageName(), 0, iMax);
        Intrinsics.checkNotNullExpressionValue(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
        Iterator it = historicalProcessExitReasons.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoAttabal = yaounde.attabal(it.next());
            if (Intrinsics.wireman(applicationExitInfoAttabal.getProcessName(), ikVar.b.getPackageName())) {
                String key = String.valueOf(applicationExitInfoAttabal.getReason());
                Intrinsics.checkNotNullParameter(key, "key");
                if (jsonObject2 == null) {
                    asDouble = dMin;
                } else {
                    try {
                        Intrinsics.checkNotNullParameter(jsonObject2, "<this>");
                        Intrinsics.checkNotNullParameter(key, "key");
                        asDouble = jsonObject2.get(key).getAsDouble();
                    } catch (Exception unused) {
                        asDouble = dMin;
                    }
                }
                d += asDouble;
                if (asDouble < 0.0d) {
                    break;
                }
                if (d >= dMax) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Object a(String key, Function1 converter) {
        loun lounVar;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(converter, "converter");
        if (!this.f.get()) {
            Intrinsics.checkNotNullParameter("Flags have not been initialized!", PglCryptUtils.KEY_MESSAGE);
            kn0.b("Flags have not been initialized!", null);
            IllegalStateException illegalStateException = new IllegalStateException("Flags have not been initialized!");
            illegalStateException.printStackTrace();
            zm zmVar = ym.a;
            if (zmVar != zm.DEVELOPMENT && zmVar != zm.INTEGRATION_TEST) {
                if (zmVar == zm.PRODUCTION && (lounVar = x03.a) != null) {
                    ((d13) lounVar).a("Flags have not been initialized!", illegalStateException);
                }
            } else {
                throw illegalStateException;
            }
        }
        return b(key, converter);
    }

    public static Object a(JsonObject jsonObject, String str, Object obj, Function1 function1) {
        try {
            JsonElement jsonElement = jsonObject.get(str);
            Intrinsics.checkNotNullExpressionValue(jsonElement, "get(...)");
            return function1.invoke(jsonElement);
        } catch (Exception unused) {
            return obj;
        }
    }

    public final void a() {
        mv mvVar = (mv) this.i.get();
        if (mvVar.t().p() > 0 && mvVar.u().p() > 0) {
            Map mapO = mvVar.o();
            Intrinsics.checkNotNullExpressionValue(mapO, "getConcatenatedSignalsMapMap(...)");
            if (!mapO.isEmpty()) {
                this.j.set(mvVar.t());
                this.k.set(mvVar.u());
                this.l.set(mvVar.o());
                this.m.set(true);
                return;
            }
        }
        String str = (String) b("test_pattern_matching_flag", gk.a);
        if (str == null) {
            str = "";
        }
        String str2 = (String) b("test_preprocessing_flag", hk.a);
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) b("test_concatenated_signals_flag", fk.a);
        String str4 = str3 != null ? str3 : "";
        if (StringsKt.empress(str) || StringsKt.empress(str2) || StringsKt.empress(str4)) {
            return;
        }
        this.j.set(b12.a(Base64.decode(str, 0)));
        this.k.set(n32.a(Base64.decode(str2, 0)));
        AtomicReference atomicReference = this.l;
        Map<String, JsonElement> mapAsMap = ((JsonObject) new Gson().fromJson(str4, JsonObject.class)).asMap();
        Intrinsics.checkNotNullExpressionValue(mapAsMap, "asMap(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(polder.marial(mapAsMap.size()));
        Iterator<T> it = mapAsMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((JsonElement) entry.getValue()).getAsJsonPrimitive().getAsString());
        }
        atomicReference.set(linkedHashMap);
        this.m.set(true);
    }
}
