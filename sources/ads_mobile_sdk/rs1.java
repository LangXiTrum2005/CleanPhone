package ads_mobile_sdk;

import android.os.SystemClock;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.ironsource.Ie;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.Command;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.Closeable;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.blighty;
import saneness.evenfall;
import saneness.hobby;
import saneness.hydrofracturing;
import saneness.juju;
import saneness.spartacist;
import saneness.supercargo;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class rs1 {
    public final supercargo a;
    public final iv b;
    public final hobby c;
    public final blighty d;
    public final jk0 e;
    public final amphitheatre f;
    public final Gson g;

    public rs1(supercargo javascriptEngine, iv consentManager, hobby httpClient, blighty userAgentProvider, jk0 flags, amphitheatre clock, Gson gson) {
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.a = javascriptEngine;
        this.b = consentManager;
        this.c = httpClient;
        this.d = userAgentProvider;
        this.e = flags;
        this.f = clock;
        this.g = gson;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0257 A[Catch: all -> 0x0267, TryCatch #6 {all -> 0x0267, blocks: (B:101:0x0250, B:103:0x0257, B:105:0x025e, B:107:0x0262, B:109:0x0266, B:112:0x026a, B:113:0x026f, B:114:0x0270, B:115:0x0277, B:116:0x0278, B:117:0x027f, B:118:0x0280), top: B:131:0x0250 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x025e A[Catch: all -> 0x0267, TryCatch #6 {all -> 0x0267, blocks: (B:101:0x0250, B:103:0x0257, B:105:0x025e, B:107:0x0262, B:109:0x0266, B:112:0x026a, B:113:0x026f, B:114:0x0270, B:115:0x0277, B:116:0x0278, B:117:0x027f, B:118:0x0280), top: B:131:0x0250 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0262 A[Catch: all -> 0x0267, TryCatch #6 {all -> 0x0267, blocks: (B:101:0x0250, B:103:0x0257, B:105:0x025e, B:107:0x0262, B:109:0x0266, B:112:0x026a, B:113:0x026f, B:114:0x0270, B:115:0x0277, B:116:0x0278, B:117:0x027f, B:118:0x0280), top: B:131:0x0250 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0266 A[Catch: all -> 0x0267, TryCatch #6 {all -> 0x0267, blocks: (B:101:0x0250, B:103:0x0257, B:105:0x025e, B:107:0x0262, B:109:0x0266, B:112:0x026a, B:113:0x026f, B:114:0x0270, B:115:0x0277, B:116:0x0278, B:117:0x027f, B:118:0x0280), top: B:131:0x0250 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x026a A[Catch: all -> 0x0267, TryCatch #6 {all -> 0x0267, blocks: (B:101:0x0250, B:103:0x0257, B:105:0x025e, B:107:0x0262, B:109:0x0266, B:112:0x026a, B:113:0x026f, B:114:0x0270, B:115:0x0277, B:116:0x0278, B:117:0x027f, B:118:0x0280), top: B:131:0x0250 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0270 A[Catch: all -> 0x0267, TryCatch #6 {all -> 0x0267, blocks: (B:101:0x0250, B:103:0x0257, B:105:0x025e, B:107:0x0262, B:109:0x0266, B:112:0x026a, B:113:0x026f, B:114:0x0270, B:115:0x0277, B:116:0x0278, B:117:0x027f, B:118:0x0280), top: B:131:0x0250 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0278 A[Catch: all -> 0x0267, TryCatch #6 {all -> 0x0267, blocks: (B:101:0x0250, B:103:0x0257, B:105:0x025e, B:107:0x0262, B:109:0x0266, B:112:0x026a, B:113:0x026f, B:114:0x0270, B:115:0x0277, B:116:0x0278, B:117:0x027f, B:118:0x0280), top: B:131:0x0250 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0280 A[Catch: all -> 0x0267, TRY_LEAVE, TryCatch #6 {all -> 0x0267, blocks: (B:101:0x0250, B:103:0x0257, B:105:0x025e, B:107:0x0262, B:109:0x0266, B:112:0x026a, B:113:0x026f, B:114:0x0270, B:115:0x0277, B:116:0x0278, B:117:0x027f, B:118:0x0280), top: B:131:0x0250 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a3 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #1 {all -> 0x0060, blocks: (B:20:0x005c, B:29:0x009d, B:31:0x00a3, B:34:0x00ac), top: B:123:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[Catch: all -> 0x0060, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0060, blocks: (B:20:0x005c, B:29:0x009d, B:31:0x00a3, B:34:0x00ac), top: B:123:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1 A[Catch: Exception -> 0x0224, InterruptedException -> 0x0226, TRY_LEAVE, TryCatch #11 {InterruptedException -> 0x0226, Exception -> 0x0224, blocks: (B:36:0x00cd, B:38:0x00d1, B:93:0x0228), top: B:138:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:42:0x013a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0152  */
    /* JADX WARN: Code duplicated, block: B:50:0x019f  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a8 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #3 {all -> 0x0041, blocks: (B:13:0x003c, B:51:0x01a2, B:53:0x01a8), top: B:126:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:58:0x01be  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f4 A[Catch: all -> 0x0204, TryCatch #5 {all -> 0x0204, blocks: (B:67:0x01ed, B:69:0x01f4, B:71:0x01fb, B:73:0x01ff, B:75:0x0203, B:78:0x0207, B:79:0x020c, B:80:0x020d, B:81:0x0214, B:82:0x0215, B:83:0x021c, B:84:0x021d), top: B:130:0x01ed }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01fb A[Catch: all -> 0x0204, TryCatch #5 {all -> 0x0204, blocks: (B:67:0x01ed, B:69:0x01f4, B:71:0x01fb, B:73:0x01ff, B:75:0x0203, B:78:0x0207, B:79:0x020c, B:80:0x020d, B:81:0x0214, B:82:0x0215, B:83:0x021c, B:84:0x021d), top: B:130:0x01ed }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01ff A[Catch: all -> 0x0204, TryCatch #5 {all -> 0x0204, blocks: (B:67:0x01ed, B:69:0x01f4, B:71:0x01fb, B:73:0x01ff, B:75:0x0203, B:78:0x0207, B:79:0x020c, B:80:0x020d, B:81:0x0214, B:82:0x0215, B:83:0x021c, B:84:0x021d), top: B:130:0x01ed }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0203 A[Catch: all -> 0x0204, TryCatch #5 {all -> 0x0204, blocks: (B:67:0x01ed, B:69:0x01f4, B:71:0x01fb, B:73:0x01ff, B:75:0x0203, B:78:0x0207, B:79:0x020c, B:80:0x020d, B:81:0x0214, B:82:0x0215, B:83:0x021c, B:84:0x021d), top: B:130:0x01ed }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0207 A[Catch: all -> 0x0204, TryCatch #5 {all -> 0x0204, blocks: (B:67:0x01ed, B:69:0x01f4, B:71:0x01fb, B:73:0x01ff, B:75:0x0203, B:78:0x0207, B:79:0x020c, B:80:0x020d, B:81:0x0214, B:82:0x0215, B:83:0x021c, B:84:0x021d), top: B:130:0x01ed }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x020d A[Catch: all -> 0x0204, TryCatch #5 {all -> 0x0204, blocks: (B:67:0x01ed, B:69:0x01f4, B:71:0x01fb, B:73:0x01ff, B:75:0x0203, B:78:0x0207, B:79:0x020c, B:80:0x020d, B:81:0x0214, B:82:0x0215, B:83:0x021c, B:84:0x021d), top: B:130:0x01ed }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0215 A[Catch: all -> 0x0204, TryCatch #5 {all -> 0x0204, blocks: (B:67:0x01ed, B:69:0x01f4, B:71:0x01fb, B:73:0x01ff, B:75:0x0203, B:78:0x0207, B:79:0x020c, B:80:0x020d, B:81:0x0214, B:82:0x0215, B:83:0x021c, B:84:0x021d), top: B:130:0x01ed }] */
    /* JADX WARN: Code duplicated, block: B:84:0x021d A[Catch: all -> 0x0204, TRY_LEAVE, TryCatch #5 {all -> 0x0204, blocks: (B:67:0x01ed, B:69:0x01f4, B:71:0x01fb, B:73:0x01ff, B:75:0x0203, B:78:0x0207, B:79:0x020c, B:80:0x020d, B:81:0x0214, B:82:0x0215, B:83:0x021c, B:84:0x021d), top: B:130:0x01ed }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0228 A[Catch: Exception -> 0x0224, InterruptedException -> 0x0226, TRY_ENTER, TRY_LEAVE, TryCatch #11 {InterruptedException -> 0x0226, Exception -> 0x0224, blocks: (B:36:0x00cd, B:38:0x00d1, B:93:0x0228), top: B:138:0x00cd }] */
    public final Object a(arytenoidectomy arytenoidectomyVar, xm xmVar, wretchedly.dern dernVar) {
        ps1 ps1Var;
        long jGraveside;
        w03 w03VarA;
        w03 w03Var;
        rs1 rs1Var;
        arytenoidectomy arytenoidectomyVar2;
        spartacist spartacistVar;
        zt0 zt0Var;
        long jMerc;
        dg2 dg2Var;
        JsonObject jsonObject;
        w03 w03VarA2;
        Closeable closeable;
        Object objA;
        w03 w03Var2;
        JsonArray jsonArrayD;
        spartacist spartacistVar2;
        xm xmVar2 = xmVar;
        if (dernVar instanceof ps1) {
            ps1Var = (ps1) dernVar;
            int i = ps1Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ps1Var.i = i - Integer.MIN_VALUE;
            } else {
                ps1Var = new ps1(this, dernVar);
            }
        } else {
            ps1Var = new ps1(this, dernVar);
        }
        Object obj = ps1Var.g;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ps1Var.i;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            this.f.getClass();
            jGraveside = p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
            w03VarA = j13.a(no0.CUI_NAME_ADREQUEST_REQUEST, adultoid.formularize(), true);
            try {
                ps1Var.a = this;
                ps1Var.b = arytenoidectomyVar;
                ps1Var.c = xmVar2;
                ps1Var.d = w03VarA;
                ps1Var.e = w03VarA;
                ps1Var.f = jGraveside;
                ps1Var.i = 1;
                Object objA2 = a(xmVar2, ps1Var);
                if (objA2 != objBeachfront) {
                    rs1Var = this;
                    arytenoidectomyVar2 = arytenoidectomyVar;
                    obj = objA2;
                    spartacistVar = (spartacist) obj;
                    if (spartacistVar instanceof nn0) {
                        nn0 nn0Var = (nn0) spartacistVar;
                        y13.a(nn0Var, false);
                        interaction.saneness.attabal(w03VarA, null);
                        return nn0Var;
                    }
                    Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                    zt0Var = (zt0) ((tn0) spartacistVar).b;
                    interaction.saneness.attabal(w03VarA, null);
                    p002kotlin.time.saneness.Companion companion2 = p002kotlin.time.saneness.INSTANCE;
                    rs1Var.f.getClass();
                    jMerc = p002kotlin.time.saneness.merc(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), jGraveside);
                    dg2Var = zt0Var.d;
                    if (dg2Var != null) {
                        return new rn0("HTTP response body is null", k41.INTERNAL_ERROR);
                    }
                    String strA = dg2.a(dg2Var);
                    JsonObject jsonObject2 = new JsonObject();
                    JsonObject jsonObject3 = new JsonObject();
                    JsonObject jsonObject4 = new JsonObject();
                    jsonObject3.addProperty("ad_request_url", xmVar2.e);
                    jsonObject3.addProperty("ad_request_post_body", xmVar2.c);
                    jsonObject3.addProperty("base_url", xmVar2.b);
                    jsonObject3.add("signals", rs1Var.g.toJsonTree(arytenoidectomyVar2).getAsJsonObject());
                    jsonObject4.addProperty("body", strA);
                    jsonObject4.addProperty("response_code", Integer.valueOf(zt0Var.a));
                    jsonObject4.addProperty("latency", Long.valueOf(p002kotlin.time.saneness.adultoid(jMerc)));
                    jsonObject = new JsonObject();
                    for (Map.Entry entry : zt0Var.c.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        jsonArrayD = cb1.d(jsonObject, str);
                        if (jsonArrayD == null) {
                            jsonArrayD = new JsonArray();
                        }
                        jsonArrayD.add(str2);
                        jsonObject.add(str, jsonArrayD);
                    }
                    jsonObject4.add("headers", jsonObject);
                    jsonObject2.add(AdActivity.REQUEST_KEY_EXTRA, jsonObject3);
                    jsonObject2.add(Ie.n, jsonObject4);
                    w03VarA2 = j13.a(no0.CUI_NAME_ADREQUEST_NORMALIZE_RESPONSE, adultoid.formularize(), true);
                    hydrofracturing hydrofracturingVar = rs1Var.a;
                    ps1Var.a = w03VarA2;
                    ps1Var.b = w03VarA2;
                    ps1Var.c = null;
                    ps1Var.d = null;
                    ps1Var.e = null;
                    ps1Var.i = 2;
                    hydrofracturingVar.getClass();
                    String string = jsonObject2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    objA = ((cf0) hydrofracturingVar).a("google.afma.response.normalize", string, ps1Var);
                    if (objA != objBeachfront) {
                        w03Var2 = w03VarA2;
                        closeable = w03Var2;
                        obj = objA;
                        spartacistVar2 = (spartacist) obj;
                        if (spartacistVar2 instanceof nn0) {
                            y13.a((nn0) spartacistVar2, false);
                        }
                        interaction.saneness.attabal(closeable, null);
                        if (spartacistVar2 instanceof nn0) {
                            nn0 nn0Var2 = (nn0) spartacistVar2;
                            y13.a(nn0Var2, false);
                            return nn0Var2;
                        }
                        Intrinsics.competently(spartacistVar2, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                        JsonObject json = (JsonObject) ((tn0) spartacistVar2).b;
                        Intrinsics.checkNotNullParameter(json, "json");
                        em2 block = new em2(json);
                        Intrinsics.checkNotNullParameter(block, "block");
                        return new tn0(block.invoke());
                    }
                }
                return objBeachfront;
            } catch (Throwable th) {
                th = th;
                w03Var = w03VarA;
                w03Var.b(th);
                if (!(th instanceof evenfall)) {
                    throw th;
                }
                w03Var.a(th);
                if (!(th instanceof TimeoutCancellationException)) {
                    throw new cp0(th);
                }
                if (!(th instanceof CancellationException)) {
                    throw new bn0(th);
                }
                if (th instanceof yn0) {
                    throw th;
                }
                throw new gn0(th);
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = (Closeable) ps1Var.b;
            w03Var2 = (w03) ps1Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                spartacistVar2 = (spartacist) obj;
                if (spartacistVar2 instanceof nn0) {
                    y13.a((nn0) spartacistVar2, false);
                }
                interaction.saneness.attabal(closeable, null);
                if (spartacistVar2 instanceof nn0) {
                    nn0 nn0Var3 = (nn0) spartacistVar2;
                    y13.a(nn0Var3, false);
                    return nn0Var3;
                }
                Intrinsics.competently(spartacistVar2, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                JsonObject json2 = (JsonObject) ((tn0) spartacistVar2).b;
                Intrinsics.checkNotNullParameter(json2, "json");
                em2 block2 = new em2(json2);
                Intrinsics.checkNotNullParameter(block2, "block");
                try {
                    return new tn0(block2.invoke());
                } catch (Exception e) {
                    return new on0(e, null, null, 6);
                }
            } catch (Throwable th2) {
                th = th2;
                w03VarA2 = w03Var2;
                try {
                    w03VarA2.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03VarA2.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        throw new cp0(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        interaction.saneness.attabal(closeable, th3);
                        throw th4;
                    }
                }
            }
        }
        jGraveside = ps1Var.f;
        w03VarA = ps1Var.e;
        w03Var = ps1Var.d;
        xmVar2 = ps1Var.c;
        arytenoidectomyVar2 = (arytenoidectomy) ps1Var.b;
        rs1Var = (rs1) ps1Var.a;
        try {
            p002kotlin.dern.saneness(obj);
            spartacistVar = (spartacist) obj;
            if (spartacistVar instanceof nn0) {
                nn0 nn0Var4 = (nn0) spartacistVar;
                y13.a(nn0Var4, false);
                interaction.saneness.attabal(w03VarA, null);
                return nn0Var4;
            }
            Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
            zt0Var = (zt0) ((tn0) spartacistVar).b;
            interaction.saneness.attabal(w03VarA, null);
            p002kotlin.time.saneness.Companion companion3 = p002kotlin.time.saneness.INSTANCE;
            rs1Var.f.getClass();
            jMerc = p002kotlin.time.saneness.merc(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), jGraveside);
            try {
                dg2Var = zt0Var.d;
                if (dg2Var != null) {
                    return new rn0("HTTP response body is null", k41.INTERNAL_ERROR);
                }
                String strA2 = dg2.a(dg2Var);
                JsonObject jsonObject5 = new JsonObject();
                JsonObject jsonObject6 = new JsonObject();
                JsonObject jsonObject7 = new JsonObject();
                jsonObject6.addProperty("ad_request_url", xmVar2.e);
                jsonObject6.addProperty("ad_request_post_body", xmVar2.c);
                jsonObject6.addProperty("base_url", xmVar2.b);
                jsonObject6.add("signals", rs1Var.g.toJsonTree(arytenoidectomyVar2).getAsJsonObject());
                jsonObject7.addProperty("body", strA2);
                jsonObject7.addProperty("response_code", Integer.valueOf(zt0Var.a));
                jsonObject7.addProperty("latency", Long.valueOf(p002kotlin.time.saneness.adultoid(jMerc)));
                jsonObject = new JsonObject();
                while (r2.hasNext()) {
                    String str3 = (String) entry.getKey();
                    String str4 = (String) entry.getValue();
                    jsonArrayD = cb1.d(jsonObject, str3);
                    if (jsonArrayD == null) {
                        jsonArrayD = new JsonArray();
                    }
                    jsonArrayD.add(str4);
                    jsonObject.add(str3, jsonArrayD);
                }
                jsonObject7.add("headers", jsonObject);
                jsonObject5.add(AdActivity.REQUEST_KEY_EXTRA, jsonObject6);
                jsonObject5.add(Ie.n, jsonObject7);
                w03VarA2 = j13.a(no0.CUI_NAME_ADREQUEST_NORMALIZE_RESPONSE, adultoid.formularize(), true);
                try {
                    hydrofracturing hydrofracturingVar2 = rs1Var.a;
                    ps1Var.a = w03VarA2;
                    ps1Var.b = w03VarA2;
                    ps1Var.c = null;
                    ps1Var.d = null;
                    ps1Var.e = null;
                    ps1Var.i = 2;
                    hydrofracturingVar2.getClass();
                    String string2 = jsonObject5.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    objA = ((cf0) hydrofracturingVar2).a("google.afma.response.normalize", string2, ps1Var);
                    if (objA != objBeachfront) {
                        w03Var2 = w03VarA2;
                        closeable = w03Var2;
                        obj = objA;
                        spartacistVar2 = (spartacist) obj;
                        if (spartacistVar2 instanceof nn0) {
                            y13.a((nn0) spartacistVar2, false);
                        }
                        interaction.saneness.attabal(closeable, null);
                        if (spartacistVar2 instanceof nn0) {
                            nn0 nn0Var5 = (nn0) spartacistVar2;
                            y13.a(nn0Var5, false);
                            return nn0Var5;
                        }
                        Intrinsics.competently(spartacistVar2, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                        JsonObject json3 = (JsonObject) ((tn0) spartacistVar2).b;
                        Intrinsics.checkNotNullParameter(json3, "json");
                        em2 block3 = new em2(json3);
                        Intrinsics.checkNotNullParameter(block3, "block");
                        return new tn0(block3.invoke());
                    }
                    return objBeachfront;
                } catch (Throwable th5) {
                    th = th5;
                    closeable = w03VarA2;
                    w03VarA2.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03VarA2.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        throw new cp0(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                CancellationException cancellationException = new CancellationException("Thread interrupted while processing HTTP response body.");
                cancellationException.initCause(e2);
                throw cancellationException;
            } catch (Exception e3) {
                return new on0(e3, k41.NETWORK_ERROR, null, 4);
            }
        } catch (Throwable th6) {
            th = th6;
            try {
                w03Var.b(th);
                if (!(th instanceof evenfall)) {
                    throw th;
                }
                w03Var.a(th);
                if (!(th instanceof TimeoutCancellationException)) {
                    throw new cp0(th);
                }
                if (!(th instanceof CancellationException)) {
                    throw new bn0(th);
                }
                if (th instanceof yn0) {
                    throw th;
                }
                throw new gn0(th);
            } catch (Throwable th7) {
                try {
                    throw th7;
                } catch (Throwable th8) {
                    interaction.saneness.attabal(w03VarA, th7);
                    throw th8;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:52:0x012a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x012b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0161 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(xm xmVar, wretchedly.dern dernVar) {
        qs1 qs1Var;
        String str;
        rs1 rs1Var;
        rs1 rs1Var2;
        String str2;
        wt0 wt0Var;
        Object objA;
        wt0 wt0Var2;
        String str3;
        xm xmVar2;
        wt0 wt0Var3;
        String str4;
        xt0 xt0VarA;
        jk0 jk0Var;
        Object objSaneness;
        Object objA2;
        if (dernVar instanceof qs1) {
            qs1Var = (qs1) dernVar;
            int i = qs1Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                qs1Var.i = i - Integer.MIN_VALUE;
            } else {
                qs1Var = new qs1(this, dernVar);
            }
        } else {
            qs1Var = new qs1(this, dernVar);
        }
        Object objI = qs1Var.g;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = qs1Var.i;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objI);
            if (xmVar.d) {
                iv ivVar = this.b;
                qs1Var.a = this;
                qs1Var.b = xmVar;
                qs1Var.i = 1;
                ivVar.getClass();
                objI = iv.i(ivVar, qs1Var);
                if (objI != objBeachfront) {
                    rs1Var2 = this;
                }
            } else {
                str = "";
                rs1Var = this;
                str2 = str;
                wt0Var = new wt0();
                wt0Var.a(xmVar.e);
                blighty blightyVar = rs1Var.d;
                qs1Var.a = rs1Var;
                qs1Var.b = xmVar;
                qs1Var.c = str2;
                qs1Var.d = wt0Var;
                qs1Var.e = Command.HTTP_HEADER_USER_AGENT;
                qs1Var.f = wt0Var;
                qs1Var.i = 2;
                objA = blightyVar.a(qs1Var);
                if (objA != objBeachfront) {
                    wt0Var2 = wt0Var;
                    objI = objA;
                    str3 = Command.HTTP_HEADER_USER_AGENT;
                    xmVar2 = xmVar;
                    wt0Var3 = wt0Var2;
                    wt0Var3.a(str3, (String) objI);
                    if (str2 != null) {
                        wt0Var2.a("Cookie", str2);
                    }
                    str4 = xmVar2.c;
                    if (str4 != null) {
                        byte[] bytes = str4.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                        wt0Var2.b("text/plain", bytes);
                    }
                    xt0VarA = wt0Var2.a();
                    jk0Var = rs1Var.e;
                    jk0Var.getClass();
                    Intrinsics.checkNotNullParameter("gads:ad_request_http_client_enabled", X3.i.W);
                    if (((Boolean) jk0Var.a("gads:ad_request_http_client_enabled", Boolean.TRUE, zk.b)).booleanValue()) {
                        hobby hobbyVar = rs1Var.c;
                        jk0 jk0Var2 = rs1Var.e;
                        jk0Var2.getClass();
                        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                        p002kotlin.time.saneness sanenessVarCutely = p002kotlin.time.saneness.cutely(((p002kotlin.time.saneness) jk0Var2.a("gads:http_ad_request:timeout_millis", juju.attabal(60, DurationUnit.SECONDS, "gads:http_ad_request:timeout_millis", X3.i.W), zk.j)).getRawValue());
                        qs1Var.a = null;
                        qs1Var.b = null;
                        qs1Var.c = null;
                        qs1Var.d = null;
                        qs1Var.e = null;
                        qs1Var.f = null;
                        qs1Var.i = 3;
                        objA2 = hobbyVar.a(xt0VarA, sanenessVarCutely, qs1Var);
                        if (objA2 != objBeachfront) {
                            return objA2;
                        }
                    } else {
                        hobby hobbyVar2 = rs1Var.c;
                        jk0 jk0Var3 = rs1Var.e;
                        jk0Var3.getClass();
                        p002kotlin.time.saneness.Companion companion2 = p002kotlin.time.saneness.INSTANCE;
                        p002kotlin.time.saneness sanenessVarCutely2 = p002kotlin.time.saneness.cutely(((p002kotlin.time.saneness) jk0Var3.a("gads:http_ad_request:timeout_millis", juju.attabal(60, DurationUnit.SECONDS, "gads:http_ad_request:timeout_millis", X3.i.W), zk.j)).getRawValue());
                        qs1Var.a = null;
                        qs1Var.b = null;
                        qs1Var.c = null;
                        qs1Var.d = null;
                        qs1Var.e = null;
                        qs1Var.f = null;
                        qs1Var.i = 4;
                        objSaneness = hobby.saneness(hobbyVar2, xt0VarA, sanenessVarCutely2, qs1Var, 12);
                        if (objSaneness != objBeachfront) {
                            return objSaneness;
                        }
                    }
                }
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            xmVar = qs1Var.b;
            rs1Var2 = qs1Var.a;
            p002kotlin.dern.saneness(objI);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    p002kotlin.dern.saneness(objI);
                    return objI;
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(objI);
                return objI;
            }
            wt0Var3 = qs1Var.f;
            str3 = qs1Var.e;
            wt0Var2 = qs1Var.d;
            str2 = qs1Var.c;
            xmVar2 = qs1Var.b;
            rs1Var = qs1Var.a;
            p002kotlin.dern.saneness(objI);
        }
        wt0Var3.a(str3, (String) objI);
        if (str2 != null && str2.length() != 0) {
            wt0Var2.a("Cookie", str2);
        }
        str4 = xmVar2.c;
        if (str4 != null && str4.length() != 0) {
            byte[] bytes2 = str4.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            wt0Var2.b("text/plain", bytes2);
        }
        xt0VarA = wt0Var2.a();
        jk0Var = rs1Var.e;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:ad_request_http_client_enabled", X3.i.W);
        if (((Boolean) jk0Var.a("gads:ad_request_http_client_enabled", Boolean.TRUE, zk.b)).booleanValue()) {
            hobby hobbyVar3 = rs1Var.c;
            jk0 jk0Var4 = rs1Var.e;
            jk0Var4.getClass();
            p002kotlin.time.saneness.Companion companion3 = p002kotlin.time.saneness.INSTANCE;
            p002kotlin.time.saneness sanenessVarCutely3 = p002kotlin.time.saneness.cutely(((p002kotlin.time.saneness) jk0Var4.a("gads:http_ad_request:timeout_millis", juju.attabal(60, DurationUnit.SECONDS, "gads:http_ad_request:timeout_millis", X3.i.W), zk.j)).getRawValue());
            qs1Var.a = null;
            qs1Var.b = null;
            qs1Var.c = null;
            qs1Var.d = null;
            qs1Var.e = null;
            qs1Var.f = null;
            qs1Var.i = 3;
            objA2 = hobbyVar3.a(xt0VarA, sanenessVarCutely3, qs1Var);
            if (objA2 != objBeachfront) {
                return objA2;
            }
        } else {
            hobby hobbyVar4 = rs1Var.c;
            jk0 jk0Var5 = rs1Var.e;
            jk0Var5.getClass();
            p002kotlin.time.saneness.Companion companion4 = p002kotlin.time.saneness.INSTANCE;
            p002kotlin.time.saneness sanenessVarCutely4 = p002kotlin.time.saneness.cutely(((p002kotlin.time.saneness) jk0Var5.a("gads:http_ad_request:timeout_millis", juju.attabal(60, DurationUnit.SECONDS, "gads:http_ad_request:timeout_millis", X3.i.W), zk.j)).getRawValue());
            qs1Var.a = null;
            qs1Var.b = null;
            qs1Var.c = null;
            qs1Var.d = null;
            qs1Var.e = null;
            qs1Var.f = null;
            qs1Var.i = 4;
            objSaneness = hobby.saneness(hobbyVar4, xt0VarA, sanenessVarCutely4, qs1Var, 12);
            if (objSaneness != objBeachfront) {
                return objSaneness;
            }
        }
        return objBeachfront;
        str = (String) objI;
        rs1Var = rs1Var2;
        str2 = str;
        wt0Var = new wt0();
        wt0Var.a(xmVar.e);
        blighty blightyVar2 = rs1Var.d;
        qs1Var.a = rs1Var;
        qs1Var.b = xmVar;
        qs1Var.c = str2;
        qs1Var.d = wt0Var;
        qs1Var.e = Command.HTTP_HEADER_USER_AGENT;
        qs1Var.f = wt0Var;
        qs1Var.i = 2;
        objA = blightyVar2.a(qs1Var);
        if (objA != objBeachfront) {
            wt0Var2 = wt0Var;
            objI = objA;
            str3 = Command.HTTP_HEADER_USER_AGENT;
            xmVar2 = xmVar;
            wt0Var3 = wt0Var2;
            wt0Var3.a(str3, (String) objI);
            if (str2 != null) {
                wt0Var2.a("Cookie", str2);
            }
            str4 = xmVar2.c;
            if (str4 != null) {
                byte[] bytes3 = str4.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes3, "getBytes(...)");
                wt0Var2.b("text/plain", bytes3);
            }
            xt0VarA = wt0Var2.a();
            jk0Var = rs1Var.e;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:ad_request_http_client_enabled", X3.i.W);
            if (((Boolean) jk0Var.a("gads:ad_request_http_client_enabled", Boolean.TRUE, zk.b)).booleanValue()) {
                hobby hobbyVar5 = rs1Var.c;
                jk0 jk0Var6 = rs1Var.e;
                jk0Var6.getClass();
                p002kotlin.time.saneness.Companion companion5 = p002kotlin.time.saneness.INSTANCE;
                p002kotlin.time.saneness sanenessVarCutely5 = p002kotlin.time.saneness.cutely(((p002kotlin.time.saneness) jk0Var6.a("gads:http_ad_request:timeout_millis", juju.attabal(60, DurationUnit.SECONDS, "gads:http_ad_request:timeout_millis", X3.i.W), zk.j)).getRawValue());
                qs1Var.a = null;
                qs1Var.b = null;
                qs1Var.c = null;
                qs1Var.d = null;
                qs1Var.e = null;
                qs1Var.f = null;
                qs1Var.i = 3;
                objA2 = hobbyVar5.a(xt0VarA, sanenessVarCutely5, qs1Var);
                if (objA2 != objBeachfront) {
                    return objA2;
                }
            } else {
                hobby hobbyVar6 = rs1Var.c;
                jk0 jk0Var7 = rs1Var.e;
                jk0Var7.getClass();
                p002kotlin.time.saneness.Companion companion6 = p002kotlin.time.saneness.INSTANCE;
                p002kotlin.time.saneness sanenessVarCutely6 = p002kotlin.time.saneness.cutely(((p002kotlin.time.saneness) jk0Var7.a("gads:http_ad_request:timeout_millis", juju.attabal(60, DurationUnit.SECONDS, "gads:http_ad_request:timeout_millis", X3.i.W), zk.j)).getRawValue());
                qs1Var.a = null;
                qs1Var.b = null;
                qs1Var.c = null;
                qs1Var.d = null;
                qs1Var.e = null;
                qs1Var.f = null;
                qs1Var.i = 4;
                objSaneness = hobby.saneness(hobbyVar6, xt0VarA, sanenessVarCutely6, qs1Var, 12);
                if (objSaneness != objBeachfront) {
                    return objSaneness;
                }
            }
        }
        return objBeachfront;
    }
}
