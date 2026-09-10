package com.chartboost.sdk.impl;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.chartboost.sdk.ChartboostDSP;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.NetworkHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b3 extends v2 {
    public static final b t = new b(null);
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gf f13477l;
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f13478n;
    public final y6 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final uf f13479p;
    public JSONObject q;
    public JSONArray r;
    public boolean s;

    public interface a {
        void a(b3 b3Var, CBError cBError);

        void a(b3 b3Var, JSONObject jSONObject);
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(v2.c method, String endpoint, String path, gf gfVar, ae priority, String str, a aVar, y6 eventTracker, uf ufVar) {
        super(method, NetworkHelper.f15777a.a(endpoint, path), priority, null);
        Intrinsics.f(method, "method");
        Intrinsics.f(endpoint, "endpoint");
        Intrinsics.f(path, "path");
        Intrinsics.f(priority, "priority");
        Intrinsics.f(eventTracker, "eventTracker");
        this.k = path;
        this.f13477l = gfVar;
        this.m = str;
        this.f13478n = aVar;
        this.o = eventTracker;
        this.f13479p = ufVar;
        this.q = new JSONObject();
    }

    public final void a(String str, Object obj) {
        s2.a(this.q, str, obj);
    }

    public final void b(String str) {
        this.o.mo189track(h5.m.a(fh.h.RESPONSE_JSON_SERIALIZATION_ERROR, str));
    }

    public void f() {
        x4 x4VarA;
        x5 x5VarB;
        x5 x5VarB2;
        x5 x5VarB3;
        x5 x5VarB4;
        x5 x5VarB5;
        oe oeVarG;
        zc zcVarD;
        x5 x5VarB6;
        x5 x5VarB7;
        oe oeVarG2;
        og ogVarJ;
        gf gfVar = this.f13477l;
        a("app", gfVar != null ? gfVar.f14024h : null);
        gf gfVar2 = this.f13477l;
        a("model", gfVar2 != null ? gfVar2.f14020a : null);
        gf gfVar3 = this.f13477l;
        a(com.p004ironsource.ne.t, gfVar3 != null ? gfVar3.k : null);
        gf gfVar4 = this.f13477l;
        a("device_type", gfVar4 != null ? gfVar4.j : null);
        gf gfVar5 = this.f13477l;
        a("actual_device_type", gfVar5 != null ? gfVar5.f14026l : null);
        gf gfVar6 = this.f13477l;
        a(com.p004ironsource.ne.f26256E, gfVar6 != null ? gfVar6.f14021b : null);
        gf gfVar7 = this.f13477l;
        a("country", gfVar7 != null ? gfVar7.f14022c : null);
        gf gfVar8 = this.f13477l;
        a("language", gfVar8 != null ? gfVar8.d : null);
        gf gfVar9 = this.f13477l;
        a("sdk", gfVar9 != null ? gfVar9.g : null);
        a("user_agent", vh.f15428b.a());
        gf gfVar10 = this.f13477l;
        a("timestamp", (gfVar10 == null || (ogVarJ = gfVar10.j()) == null) ? null : String.valueOf(TimeUnit.MILLISECONDS.toSeconds(ogVarJ.a())));
        gf gfVar11 = this.f13477l;
        a("session", gfVar11 != null ? Integer.valueOf(gfVar11.i()) : null);
        gf gfVar12 = this.f13477l;
        a("reachability", (gfVar12 == null || (oeVarG2 = gfVar12.g()) == null) ? null : oeVarG2.b());
        gf gfVar13 = this.f13477l;
        a("is_portrait", (gfVar13 == null || (x5VarB7 = gfVar13.b()) == null) ? null : Boolean.valueOf(x5VarB7.k()));
        gf gfVar14 = this.f13477l;
        a("scale", (gfVar14 == null || (x5VarB6 = gfVar14.b()) == null) ? null : Float.valueOf(x5VarB6.h()));
        gf gfVar15 = this.f13477l;
        a("bundle", gfVar15 != null ? gfVar15.f14023e : null);
        gf gfVar16 = this.f13477l;
        a("bundle_id", gfVar16 != null ? gfVar16.f : null);
        gf gfVar17 = this.f13477l;
        a(com.p004ironsource.ne.O0, gfVar17 != null ? gfVar17.m : null);
        gf gfVar18 = this.f13477l;
        mb mbVarD = gfVar18 != null ? gfVar18.d() : null;
        if (mbVarD != null) {
            a("mediation", mbVarD.c());
            a("mediation_version", mbVarD.b());
            a("adapter_version", mbVarD.a());
        }
        gf gfVar19 = this.f13477l;
        a("timezone", gfVar19 != null ? gfVar19.o : null);
        gf gfVar20 = this.f13477l;
        a(com.p004ironsource.dc.f24783e, (gfVar20 == null || (oeVarG = gfVar20.g()) == null || (zcVarD = oeVarG.d()) == null) ? null : Integer.valueOf(zcVarD.c()));
        gf gfVar21 = this.f13477l;
        a("dw", (gfVar21 == null || (x5VarB5 = gfVar21.b()) == null) ? null : Integer.valueOf(x5VarB5.c()));
        gf gfVar22 = this.f13477l;
        a("dh", (gfVar22 == null || (x5VarB4 = gfVar22.b()) == null) ? null : Integer.valueOf(x5VarB4.a()));
        gf gfVar23 = this.f13477l;
        a("dpi", (gfVar23 == null || (x5VarB3 = gfVar23.b()) == null) ? null : x5VarB3.d());
        gf gfVar24 = this.f13477l;
        a("w", (gfVar24 == null || (x5VarB2 = gfVar24.b()) == null) ? null : Integer.valueOf(x5VarB2.j()));
        gf gfVar25 = this.f13477l;
        a(com.smartdigimkt.m3.h.f36614b, (gfVar25 == null || (x5VarB = gfVar25.b()) == null) ? null : Integer.valueOf(x5VarB.e()));
        a("commit_hash", "09decf9845eb8f00ac06b030676751feddd00887");
        gf gfVar26 = this.f13477l;
        y8 y8VarC = gfVar26 != null ? gfVar26.c() : null;
        a("identity", y8VarC != null ? y8VarC.b() : null);
        a("instance_id", y8VarC != null ? y8VarC.c() : null);
        kh khVarF = y8VarC != null ? y8VarC.f() : null;
        if (khVarF != kh.TRACKING_UNKNOWN) {
            a("limit_ad_tracking", Boolean.valueOf(khVarF == kh.TRACKING_LIMITED));
        }
        a("appsetidscope", y8VarC != null ? y8VarC.e() : null);
        gf gfVar27 = this.f13477l;
        ce ceVarF = gfVar27 != null ? gfVar27.f() : null;
        Object objH = ceVarF != null ? ceVarF.h() : null;
        if (objH != null) {
            a(com.ironsource.d9.i.f24748b0, objH);
        }
        a("pidatauseconsent", ceVarF != null ? ceVarF.f() : null);
        gf gfVar28 = this.f13477l;
        String strA = (gfVar28 == null || (x4VarA = gfVar28.a()) == null) ? null : x4VarA.a();
        if (!h1.b().a(strA)) {
            a("config_variant", strA);
        }
        JSONObject jSONObjectG = ceVarF != null ? ceVarF.g() : null;
        String strB = ceVarF != null ? ceVarF.b() : null;
        String strA2 = ceVarF != null ? ceVarF.a() : null;
        if (jSONObjectG != null) {
            try {
                jSONObjectG.put("gpp", strB);
                jSONObjectG.put("gpp_sid", strA2);
            } catch (JSONException e2) {
                za.b("Failed to add GPP and/or GPP SID to request body", e2);
            }
        }
        a("privacy", jSONObjectG);
    }

    public final String g() {
        v3 v3Var = v3.f15359a;
        String strA = v3Var.a();
        int[] iArrB = v3Var.b();
        JSONObject jSONObject = new JSONObject();
        if (strA.length() > 0 && iArrB != null) {
            if (!(iArrB.length == 0)) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (int i2 : iArrB) {
                        jSONArray.put(i2);
                    }
                    jSONObject.put("exchangeMode", 2);
                    jSONObject.put("bidFloor", 0.01d);
                    jSONObject.put("code", strA);
                    jSONObject.put("forceCreativeTypes", jSONArray);
                } catch (JSONException unused) {
                    return null;
                }
            }
        }
        return jSONObject.toString();
    }

    public final JSONArray h() {
        return this.r;
    }

    public final String i() {
        return StringsKt.M(this.k, "/", false) ? this.k : android.support.v4.media.a.C("/", this.k);
    }

    public final gf j() {
        return this.f13477l;
    }

    public final String k() {
        return i();
    }

    @Override // com.chartboost.sdk.impl.v2
    public w2 a() {
        String strG;
        y8 y8VarC;
        String strD;
        String strD2;
        f();
        String string = this.q.toString();
        Intrinsics.e(string, "toString(...)");
        gf gfVar = this.f13477l;
        String str = gfVar != null ? gfVar.f14024h : null;
        if (str == null) {
            str = "";
        }
        String strA = l2.a(String.format(Locale.US, "%s %s\n%s\n%s", Arrays.copyOf(new Object[]{c(), k(), gfVar != null ? gfVar.f14025i : null, string}, 4)));
        HashMap mapS = androidx.media3.extractor.text.ttml.a.s("Accept", "application/json");
        mapS.put("X-Chartboost-Client", g3.b());
        mapS.put("X-Chartboost-API", "9.10.2");
        mapS.put("X-Chartboost-App", str);
        mapS.put("X-Chartboost-Signature", strA);
        uf ufVar = this.f13479p;
        if (ufVar != null && (strD2 = ufVar.d()) != null) {
            mapS.put("x-monetization-session-id", strD2);
        }
        gf gfVar2 = this.f13477l;
        if (gfVar2 != null && (y8VarC = gfVar2.c()) != null && (strD = y8VarC.d()) != null) {
            mapS.put("x-monetization-idfv", strD);
        }
        mapS.put("x-monetization-sdk-version", "9.10.2");
        if (nf.f14544a.d()) {
            String strB = nf.b();
            String str2 = strB.length() > 0 ? strB : null;
            if (str2 != null) {
                mapS.put("X-Chartboost-Test", str2);
            }
            String strA2 = nf.a();
            if (strA2 != null) {
                mapS.put("X-Chartboost-Test", strA2);
            }
        }
        if (ChartboostDSP.INSTANCE.isDSP() && (strG = g()) != null && strG.length() != 0) {
            mapS.put("X-Chartboost-DspDemoApp", strG);
        }
        byte[] bytes = string.getBytes(Charsets.f44691a);
        Intrinsics.e(bytes, "getBytes(...)");
        return new w2(mapS, bytes, "application/json");
    }

    public final JSONObject b(int i2, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i2);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            return jSONObject;
        } catch (JSONException e2) {
            za.b("Error creating JSON", e2);
            return jSONObject;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b3(String endpoint, String path, gf gfVar, ae priority, a aVar, y6 eventTracker, uf ufVar) {
        this(v2.c.POST, endpoint, path, gfVar, priority, (String) null, aVar, eventTracker, ufVar);
        Intrinsics.f(endpoint, "endpoint");
        Intrinsics.f(path, "path");
        Intrinsics.f(priority, "priority");
        Intrinsics.f(eventTracker, "eventTracker");
    }

    public /* synthetic */ b3(String str, String str2, gf gfVar, ae aeVar, a aVar, y6 y6Var, uf ufVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, gfVar, aeVar, aVar, y6Var, (i2 & 64) != 0 ? null : ufVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b3(String endpoint, String path, gf gfVar, ae priority, String eventType, a aVar, y6 eventTracker, uf ufVar) {
        this(v2.c.POST, endpoint, path, gfVar, priority, eventType, aVar, eventTracker, ufVar);
        Intrinsics.f(endpoint, "endpoint");
        Intrinsics.f(path, "path");
        Intrinsics.f(priority, "priority");
        Intrinsics.f(eventType, "eventType");
        Intrinsics.f(eventTracker, "eventTracker");
    }

    @Override // com.chartboost.sdk.impl.v2
    public void a(CBError cBError, y2 y2Var) {
        if (cBError == null) {
            return;
        }
        za.d("Request failure: " + e() + " status: " + cBError.getErrorDesc(), null);
        a aVar = this.f13478n;
        if (aVar != null) {
            aVar.a(this, cBError);
        }
        a(y2Var, cBError);
    }

    @Override // com.chartboost.sdk.impl.v2
    public void a(JSONObject jSONObject, y2 y2Var) {
        int iB = y2Var != null ? y2Var.b() : -1;
        za.d("Request success: " + e() + " status: " + iB, null);
        a aVar = this.f13478n;
        if (aVar != null) {
            aVar.a(this, jSONObject);
        }
        a(y2Var, (CBError) null);
    }

    public final x2 a(String str) {
        JSONObject jSONObjectB = b(404, str);
        x2.a aVar = x2.f15506c;
        CBError.Internal internal = CBError.Internal.HTTP_NOT_FOUND;
        String string = jSONObjectB.toString();
        Intrinsics.e(string, "toString(...)");
        return aVar.a(new CBError(internal, string));
    }

    public final x2 a(int i2, String str) {
        JSONObject jSONObjectB = b(i2, str);
        x2.a aVar = x2.f15506c;
        CBError.Internal internal = CBError.Internal.HTTP_NOT_OK;
        String string = jSONObjectB.toString();
        Intrinsics.e(string, "toString(...)");
        return aVar.a(new CBError(internal, string));
    }

    public final x2 a(Exception exc) {
        x2.a aVar = x2.f15506c;
        CBError.Internal internal = CBError.Internal.MISCELLANEOUS;
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        return aVar.a(new CBError(internal, localizedMessage));
    }

    @Override // com.chartboost.sdk.impl.v2
    public x2 a(y2 y2Var) {
        byte[] bArrA;
        try {
            if (y2Var == null || (bArrA = y2Var.a()) == null) {
                bArrA = new byte[0];
            }
            JSONObject jSONObject = new JSONObject(new String(bArrA, Charsets.f44691a));
            String strI = i();
            Integer numValueOf = y2Var != null ? Integer.valueOf(y2Var.b()) : null;
            za.d("Request " + strI + " succeeded. Response code: " + numValueOf + ", body: " + jSONObject.toString(4), null);
            if (this.s) {
                int iOptInt = jSONObject.optInt("status");
                String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
                if (iOptInt == 404) {
                    Intrinsics.c(strOptString);
                    return a(strOptString);
                }
                if (iOptInt < 200 || iOptInt > 299) {
                    za.b("Request failed due to status code " + iOptInt + " in message", null);
                    Intrinsics.c(strOptString);
                    return a(iOptInt, strOptString);
                }
            }
            return x2.f15506c.a(jSONObject);
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "";
            }
            b(message);
            za.b("parseServerResponse", e2);
            return a(e2);
        }
    }

    public final void a(y2 y2Var, CBError cBError) {
        String string;
        String errorDesc;
        CBError.Type type;
        s2.a aVarA = s2.a(com.p004ironsource.dc.r, i());
        String str = "None";
        s2.a aVarA2 = s2.a("statuscode", y2Var == null ? "None" : Integer.valueOf(y2Var.b()));
        if (cBError == null || (type = cBError.getType()) == null || (string = type.toString()) == null) {
            string = "None";
        }
        s2.a aVarA3 = s2.a("error", string);
        if (cBError != null && (errorDesc = cBError.getErrorDesc()) != null) {
            str = errorDesc;
        }
        JSONObject jSONObjectA = s2.a(aVarA, aVarA2, aVarA3, s2.a("errorDescription", str), s2.a("retryCount", (Object) 0));
        Intrinsics.e(jSONObjectA, "jsonObject(...)");
        za.a("sendToSessionLogs: " + jSONObjectA, null);
    }

    public final void a(JSONObject jSONObject) {
        Intrinsics.f(jSONObject, "<set-?>");
        this.q = jSONObject;
    }

    public final void a(JSONArray jSONArray) {
        this.r = jSONArray;
    }
}
