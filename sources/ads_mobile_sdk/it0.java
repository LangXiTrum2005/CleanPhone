package ads_mobile_sdk;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.google.common.base.triweekly;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.ironsource.C3460cc;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.Command;
import formularization.beachfront;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.cutely;
import okhttp3.kowloon;
import okhttp3.preprohormone;
import okhttp3.rotuma;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.blighty;
import saneness.hobby;
import saneness.juju;
import saneness.spartacist;
import saneness.tithonia;

/* JADX INFO: loaded from: classes.dex */
public final class it0 implements hobby {
    public final jk0 a;
    public final ExecutorService b;
    public final blighty c;
    public vo d;
    public tithonia e;
    public final formularization.attabal f;
    public volatile rotuma g;
    public rotuma h;

    public it0(jk0 jk0Var, ExecutorService executor, blighty userAgentProvider) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        this.a = jk0Var;
        this.b = executor;
        this.c = userAgentProvider;
        this.f = beachfront.saneness(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(xt0 xt0Var, Map map, wretchedly.dern dernVar) {
        vs0 vs0Var;
        Map mapA;
        wt0 wt0Var;
        Map map2;
        String str;
        if (dernVar instanceof vs0) {
            vs0Var = (vs0) dernVar;
            int i = vs0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                vs0Var.g = i - Integer.MIN_VALUE;
            } else {
                vs0Var = new vs0(this, dernVar);
            }
        } else {
            vs0Var = new vs0(this, dernVar);
        }
        Object obj = vs0Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = vs0Var.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            vo voVar = this.d;
            if (voVar != null) {
                String string = xt0Var.a.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                mapA = voVar.a(Uri.parse(string));
            } else {
                mapA = null;
            }
            xt0Var.getClass();
            wt0Var = new wt0(xt0Var);
            blighty blightyVar = this.c;
            vs0Var.a = map;
            vs0Var.b = mapA;
            vs0Var.c = wt0Var;
            vs0Var.d = Command.HTTP_HEADER_USER_AGENT;
            vs0Var.g = 1;
            Object objA = blightyVar.a(vs0Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            map2 = mapA;
            obj = objA;
            str = Command.HTTP_HEADER_USER_AGENT;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = vs0Var.d;
            wt0 wt0Var2 = vs0Var.c;
            map2 = vs0Var.b;
            Map map3 = vs0Var.a;
            p002kotlin.dern.saneness(obj);
            wt0Var = wt0Var2;
            map = map3;
        }
        wt0 wt0VarA = wt0Var.a(str, (String) obj);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                wt0VarA.a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                wt0VarA.a((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        return wt0VarA.a();
    }

    public final rotuma a() {
        rotuma rotumaVar = this.g;
        if (rotumaVar != null) {
            return rotumaVar;
        }
        Intrinsics.preprohormone("okHttpClient");
        return null;
    }

    @Override // saneness.hobby
    public final Object a(n51 n51Var) {
        long jMolybdenite;
        rotuma.attabal attabalVarImpromptu = new rotuma.attabal().impromptu(new kowloon(this.b));
        jk0 jk0Var = this.a;
        if (jk0Var != null) {
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            jMolybdenite = ((p002kotlin.time.saneness) jk0Var.a("gads:http_url_connection_factory:timeout_millis", juju.attabal(20, DurationUnit.SECONDS, "gads:http_url_connection_factory:timeout_millis", X3.i.W), zk.j)).getRawValue();
        } else {
            p002kotlin.time.saneness.Companion companion2 = p002kotlin.time.saneness.INSTANCE;
            jMolybdenite = p002kotlin.time.dern.molybdenite(20, DurationUnit.SECONDS);
        }
        this.g = attabalVarImpromptu.marial(p002kotlin.time.saneness.adultoid(jMolybdenite), TimeUnit.MILLISECONDS).dern();
        return Unit.f29295attabal;
    }

    @Override // saneness.hobby
    public final Object a(int i, long j, d4 d4Var) {
        long jMolybdenite;
        rotuma.attabal attabalVarImpromptu = new rotuma.attabal().impromptu(new kowloon(this.b));
        jk0 jk0Var = this.a;
        if (jk0Var != null) {
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            jMolybdenite = ((p002kotlin.time.saneness) jk0Var.a("gads:http_url_connection_factory:timeout_millis", juju.attabal(20, DurationUnit.SECONDS, "gads:http_url_connection_factory:timeout_millis", X3.i.W), zk.j)).getRawValue();
        } else {
            p002kotlin.time.saneness.Companion companion2 = p002kotlin.time.saneness.INSTANCE;
            jMolybdenite = p002kotlin.time.dern.molybdenite(20, DurationUnit.SECONDS);
        }
        this.h = attabalVarImpromptu.marial(p002kotlin.time.saneness.adultoid(jMolybdenite), TimeUnit.MILLISECONDS).competently(new cutely(i, j, TimeUnit.MINUTES)).dern();
        return Unit.f29295attabal;
    }

    @Override // saneness.hobby
    public final void a(imposure.saneness interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.g = a().cuirassed().attabal(interceptor).dern();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(String str, UUID uuid, JsonObject jsonObject, wretchedly.dern dernVar) {
        ws0 ws0Var;
        formularization.attabal attabalVar;
        JsonObject jsonObject2;
        if (dernVar instanceof ws0) {
            ws0Var = (ws0) dernVar;
            int i = ws0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ws0Var.e = i - Integer.MIN_VALUE;
            } else {
                ws0Var = new ws0(this, dernVar);
            }
        } else {
            ws0Var = new ws0(this, dernVar);
        }
        Object obj = ws0Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ws0Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("timestamp", igo.attabal.marial(System.currentTimeMillis()));
            jsonObject3.addProperty(NotificationCompat.CATEGORY_EVENT, str);
            JsonArray jsonArray = new JsonArray();
            jsonArray.add("network_request_" + uuid);
            Unit unit = Unit.f29295attabal;
            jsonObject3.add("components", jsonArray);
            jsonObject3.add("params", jsonObject);
            attabalVar = this.f;
            ws0Var.a = jsonObject3;
            ws0Var.b = attabalVar;
            ws0Var.e = 1;
            if (attabalVar.attabal(null, ws0Var) == objBeachfront) {
                return objBeachfront;
            }
            jsonObject2 = jsonObject3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = ws0Var.b;
            jsonObject2 = ws0Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            kn0.a("GMA Debug BEGIN", null, "GoogleMobileAdsNetwork", 2);
            kn0.a("GMA Debug CONTENT " + jsonObject2, null, "GoogleMobileAdsNetwork", 2);
            kn0.a("GMA Debug FINISH", null, "GoogleMobileAdsNetwork", 2);
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f2, code lost:
    
        if (r2.a("onNetworkRequestError", r14, r15, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0157, code lost:
    
        if (r2.a("onNetworkResponseBody", r13, r15, r0) == r1) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(okhttp3.cuirassed r13, java.util.UUID r14, wretchedly.dern r15) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.it0.a(okhttp3.cuirassed, java.util.UUID, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
    
        if (r6 == r1) goto L31;
     */
    @Override // saneness.hobby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, java.util.Map r7, wretchedly.dern r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.it0.a(java.lang.String, java.util.Map, wretchedly.dern):java.lang.Object");
    }

    @Override // saneness.hobby
    public final Object a(xt0 xt0Var, p002kotlin.time.saneness sanenessVar, qs1 qs1Var) {
        return a(xt0Var, sanenessVar, (Map) null, true, (wretchedly.dern) qs1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.hobby
    public final Object a(URL url, eh0 eh0Var, wretchedly.dern dernVar) {
        zs0 zs0Var;
        rotuma rotumaVarA;
        rotuma rotumaVar;
        it0 it0Var;
        rotuma rotumaVar2;
        preprohormone preprohormoneVar;
        if (dernVar instanceof zs0) {
            zs0Var = (zs0) dernVar;
            int i = zs0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                zs0Var.e = i - Integer.MIN_VALUE;
            } else {
                zs0Var = new zs0(this, dernVar);
            }
        } else {
            zs0Var = new zs0(this, dernVar);
        }
        Object objA = zs0Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = zs0Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            jk0 jk0Var = this.a;
            fh0 fh0Var = jk0Var != null ? new fh0(eh0Var, jk0Var) : null;
            if (fh0Var != null) {
                rotumaVarA = a().cuirassed().saneness(fh0Var).dern();
            } else {
                rotumaVarA = a();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Intrinsics.checkNotNullParameter(url, "url");
            if (url != null) {
                xt0 xt0Var = new xt0(url, C3460cc.a, seminary.rotuma(linkedHashMap), null);
                zs0Var.a = this;
                zs0Var.b = rotumaVarA;
                zs0Var.e = 1;
                objA = a(xt0Var, (Map) null, zs0Var);
                if (objA != objBeachfront) {
                    rotumaVar = rotumaVarA;
                    it0Var = this;
                }
                return objBeachfront;
            }
            throw new IllegalStateException("HttpRequest.Builder: URL must be set before calling build()");
        }
        if (i2 == 1) {
            rotumaVar = (rotuma) zs0Var.b;
            it0Var = (it0) zs0Var.a;
            p002kotlin.dern.saneness(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            preprohormoneVar = (preprohormone) zs0Var.b;
            rotumaVar2 = (rotuma) zs0Var.a;
            p002kotlin.dern.saneness(objA);
        }
        spartacist spartacistVar = (spartacist) objA;
        triweekly triweeklyVar = kn0.a;
        kn0.a(new bt0(rotumaVar2, preprohormoneVar));
        return spartacistVar;
        preprohormone preprohormoneVarE = ((xt0) objA).e();
        triweekly triweeklyVar2 = kn0.a;
        kn0.a(new at0(rotumaVar, preprohormoneVarE));
        zs0Var.a = rotumaVar;
        zs0Var.b = preprohormoneVarE;
        zs0Var.e = 2;
        Object objA2 = it0Var.a(preprohormoneVarE, rotumaVar, zs0Var);
        if (objA2 != objBeachfront) {
            rotumaVar2 = rotumaVar;
            preprohormoneVar = preprohormoneVarE;
            objA = objA2;
            spartacist spartacistVar2 = (spartacist) objA;
            triweekly triweeklyVar3 = kn0.a;
            kn0.a(new bt0(rotumaVar2, preprohormoneVar));
            return spartacistVar2;
        }
        return objBeachfront;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.hobby
    public final Object a(URL url, wretchedly.dern dernVar) {
        ct0 ct0Var;
        preprohormone.attabal attabalVarAdultoid;
        String str;
        it0 it0Var;
        if (dernVar instanceof ct0) {
            ct0Var = (ct0) dernVar;
            int i = ct0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ct0Var.f = i - Integer.MIN_VALUE;
            } else {
                ct0Var = new ct0(this, dernVar);
            }
        } else {
            ct0Var = new ct0(this, dernVar);
        }
        Object obj = ct0Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ct0Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVarAdultoid = new preprohormone.attabal().adultoid(url);
            blighty blightyVar = this.c;
            ct0Var.a = this;
            ct0Var.b = attabalVarAdultoid;
            ct0Var.c = Command.HTTP_HEADER_USER_AGENT;
            ct0Var.f = 1;
            Object objA = blightyVar.a(ct0Var);
            if (objA != objBeachfront) {
                obj = objA;
                str = Command.HTTP_HEADER_USER_AGENT;
                it0Var = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            return obj;
        }
        str = ct0Var.c;
        attabalVarAdultoid = ct0Var.b;
        it0Var = ct0Var.a;
        p002kotlin.dern.saneness(obj);
        preprohormone preprohormoneVarSaneness = attabalVarAdultoid.attabal(str, (String) obj).competently().saneness();
        rotuma rotumaVarA = it0Var.h;
        if (rotumaVarA == null) {
            rotumaVarA = it0Var.a();
        }
        ct0Var.a = null;
        ct0Var.b = null;
        ct0Var.c = null;
        ct0Var.f = 2;
        Object objA2 = it0Var.a(preprohormoneVarSaneness, rotumaVarA, ct0Var);
        return objA2 == objBeachfront ? objBeachfront : objA2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.hobby
    public final Object a(xt0 xt0Var, p002kotlin.time.saneness sanenessVar, Map map, boolean z, wretchedly.dern dernVar) {
        dt0 dt0Var;
        rotuma rotumaVarA;
        it0 it0Var;
        rotuma rotumaVar;
        rotuma rotumaVar2;
        preprohormone preprohormoneVar;
        if (dernVar instanceof dt0) {
            dt0Var = (dt0) dernVar;
            int i = dt0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                dt0Var.e = i - Integer.MIN_VALUE;
            } else {
                dt0Var = new dt0(this, dernVar);
            }
        } else {
            dt0Var = new dt0(this, dernVar);
        }
        Object objA = dt0Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = dt0Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            if (!z || (rotumaVarA = this.h) == null) {
                rotumaVarA = a();
            }
            if (sanenessVar != null) {
                rotumaVarA = rotumaVarA.cuirassed().marial(p002kotlin.time.saneness.adultoid(sanenessVar.getRawValue()), TimeUnit.MILLISECONDS).dern();
            }
            dt0Var.a = this;
            dt0Var.b = rotumaVarA;
            dt0Var.e = 1;
            objA = a(xt0Var, map, dt0Var);
            if (objA != objBeachfront) {
                it0Var = this;
                rotumaVar = rotumaVarA;
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            rotumaVar = (rotuma) dt0Var.b;
            it0Var = (it0) dt0Var.a;
            p002kotlin.dern.saneness(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            preprohormoneVar = (preprohormone) dt0Var.b;
            rotumaVar2 = (rotuma) dt0Var.a;
            p002kotlin.dern.saneness(objA);
        }
        spartacist spartacistVar = (spartacist) objA;
        triweekly triweeklyVar = kn0.a;
        kn0.a(new ft0(rotumaVar2, preprohormoneVar));
        return spartacistVar;
        preprohormone preprohormoneVarE = ((xt0) objA).e();
        triweekly triweeklyVar2 = kn0.a;
        kn0.a(new et0(rotumaVar, preprohormoneVarE));
        dt0Var.a = rotumaVar;
        dt0Var.b = preprohormoneVarE;
        dt0Var.e = 2;
        objA = it0Var.a(preprohormoneVarE, rotumaVar, dt0Var);
        if (objA != objBeachfront) {
            rotumaVar2 = rotumaVar;
            preprohormoneVar = preprohormoneVarE;
            spartacist spartacistVar2 = (spartacist) objA;
            triweekly triweeklyVar3 = kn0.a;
            kn0.a(new ft0(rotumaVar2, preprohormoneVar));
            return spartacistVar2;
        }
        return objBeachfront;
    }

    @Override // saneness.hobby
    public final Object a(URL url, p002kotlin.time.saneness sanenessVar, Map map, boolean z, wretchedly.dern dernVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(url, "url");
        return a(new xt0(url, C3460cc.a, seminary.rotuma(linkedHashMap), null), sanenessVar, map, z, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:50:0x012d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Code duplicated, block: B:55:0x0138  */
    /* JADX WARN: Code duplicated, block: B:57:0x0145  */
    /* JADX WARN: Code duplicated, block: B:64:0x0183  */
    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
    /* JADX WARN: Code duplicated, block: B:69:0x0196  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a2 A[Catch: Exception -> 0x01a7, TRY_LEAVE, TryCatch #1 {Exception -> 0x01a7, blocks: (B:71:0x019c, B:73:0x01a2), top: B:90:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
    
        if (r8 == r3) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(okhttp3.preprohormone r18, okhttp3.rotuma r19, wretchedly.dern r20) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.it0.a(okhttp3.preprohormone, okhttp3.rotuma, wretchedly.dern):java.lang.Object");
    }

    @Override // saneness.hobby
    public final void a(vo chromeVariationsProvider) {
        Intrinsics.checkNotNullParameter(chromeVariationsProvider, "chromeVariationsProvider");
        this.d = chromeVariationsProvider;
    }

    @Override // saneness.hobby
    public final void a(tithonia debugModeProvider) {
        Intrinsics.checkNotNullParameter(debugModeProvider, "debugModeProvider");
        this.e = debugModeProvider;
    }
}
