package go;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import cl.o0;
import cl.x0;
import cl.z;
import com.applovin.impl.da;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.internal.ads.g10;
import com.google.android.gms.internal.auth.h0;
import com.google.android.gms.internal.consent_sdk.x;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.O6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import ea.f2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l7.n;
import m0.s1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pm.c0;
import pm.n0;
import pm.q0;
import pm.r0;
import pm.w0;
import pm.y;
import pm.y0;
import q7.e0;
import qk.i0;
import qk.w;
import rl.q;
import tk.i1;
import tk.r;
import tk.v1;
import xj.b0;
import xj.o;
import xj.p;
import zk.m0;
import zk.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k {
    public static final void A(int i10, int i11) {
        if (i10 > i11) {
            throw new IndexOutOfBoundsException(l1.d.f("toIndex (", i10, ") is greater than size (", i11, ")."));
        }
    }

    public static l7.a B(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getInt("version") > 1) {
            throw new n("Unknown AccessToken serialization format.");
        }
        String token = jSONObject.getString("token");
        Date date = new Date(jSONObject.getLong("expires_at"));
        JSONArray permissionsArray = jSONObject.getJSONArray("permissions");
        JSONArray declinedPermissionsArray = jSONObject.getJSONArray("declined_permissions");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("expired_permissions");
        Date date2 = new Date(jSONObject.getLong("last_refresh"));
        String string = jSONObject.getString("source");
        kotlin.jvm.internal.n.e(string, "jsonObject.getString(SOURCE_KEY)");
        l7.g gVarValueOf = l7.g.valueOf(string);
        String applicationId = jSONObject.getString("application_id");
        String userId = jSONObject.getString("user_id");
        Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
        String strOptString = jSONObject.optString("graph_domain", null);
        kotlin.jvm.internal.n.e(token, "token");
        kotlin.jvm.internal.n.e(applicationId, "applicationId");
        kotlin.jvm.internal.n.e(userId, "userId");
        kotlin.jvm.internal.n.e(permissionsArray, "permissionsArray");
        ArrayList arrayListY = e0.y(permissionsArray);
        kotlin.jvm.internal.n.e(declinedPermissionsArray, "declinedPermissionsArray");
        return new l7.a(token, applicationId, userId, arrayListY, e0.y(declinedPermissionsArray), jSONArrayOptJSONArray == null ? new ArrayList() : e0.y(jSONArrayOptJSONArray), gVarValueOf, date, date2, date3, strOptString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean C(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length != objArr2.length) {
                return false;
            }
            pk.c cVarQ0 = xj.k.q0(objArr);
            if ((cVarQ0 instanceof Collection) && ((Collection) cVarQ0).isEmpty()) {
                return true;
            }
            pk.b bVarB = cVarQ0.iterator();
            while (bVarB.f48398c) {
                int iNextInt = bVarB.nextInt();
                if (!C(objArr[iNextInt], objArr2[iNextInt])) {
                    return false;
                }
            }
            return true;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                return false;
            }
            pk.c cVarO = o.O((Collection) obj);
            if ((cVarO instanceof Collection) && ((Collection) cVarO).isEmpty()) {
                return true;
            }
            pk.b bVarB2 = cVarO.iterator();
            while (bVarB2.f48398c) {
                int iNextInt2 = bVarB2.nextInt();
                if (!C(list.get(iNextInt2), list2.get(iNextInt2))) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return kotlin.jvm.internal.n.a(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() != map2.size()) {
            return false;
        }
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !C(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static l7.a D() {
        return l7.f.f45113f.t().f45117c;
    }

    public static String E() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException e10) {
            e0.C(TtmlNode.TAG_P, "Failed to create e2e JSON", e10);
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.n.e(string, "e2e.toString()");
        return string;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, wj.d] */
    public static final Field F(w wVar) {
        kotlin.jvm.internal.n.f(wVar, "<this>");
        i1 i1VarC = v1.c(wVar);
        if (i1VarC != null) {
            return (Field) i1VarC.f50992j.getValue();
        }
        return null;
    }

    public static final Method G(qk.g gVar) {
        uk.f fVarC;
        kotlin.jvm.internal.n.f(gVar, "<this>");
        r rVarA = v1.a(gVar);
        Member memberB = (rVarA == null || (fVarC = rVarA.c()) == null) ? null : fVarC.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }

    public static f2 H(Map map, c8.a aVar) {
        String lowerCase = aVar.name().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.n.e(lowerCase, "toLowerCase(...)");
        if (map.containsKey(lowerCase)) {
            Object obj = map.get(lowerCase);
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                f2 f2Var = new f2(13, false);
                Object obj2 = map2.get("title");
                kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                Object obj3 = map2.get("size");
                kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                Map map3 = (Map) obj3;
                f8.d dVar = new f8.d();
                Object obj4 = map3.get("minWidth");
                kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Int");
                dVar.f40694a = ((Integer) obj4).intValue();
                Object obj5 = map3.get("maxWidth");
                kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Int");
                dVar.f40695b = ((Integer) obj5).intValue();
                Object obj6 = map3.get("minHeight");
                kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Int");
                dVar.f40696c = ((Integer) obj6).intValue();
                Object obj7 = map3.get("maxHeight");
                kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Int");
                dVar.f40697d = ((Integer) obj7).intValue();
                Object obj8 = map3.get("ignoreSize");
                kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                dVar.f40698e = ((Boolean) obj8).booleanValue();
                f2Var.f39409b = dVar;
                Object obj9 = map2.get(IronSourceConstants.EVENTS_DURATION);
                kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                Map map4 = (Map) obj9;
                g10 g10Var = new g10();
                Object obj10 = map4.get("min");
                kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.Int");
                g10Var.f14653a = ((Integer) obj10).intValue();
                Object obj11 = map4.get(AppLovinMediationProvider.MAX);
                kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Int");
                g10Var.f14654b = ((Integer) obj11).intValue();
                Object obj12 = map4.get("allowNullable");
                kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                g10Var.f14655c = ((Boolean) obj12).booleanValue();
                f2Var.f39410c = g10Var;
                return f2Var;
            }
        }
        return new f2(13, false);
    }

    public static SharedPreferences I(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final int J(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                int i13 = i11 % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i10 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i11 - i15;
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                if (i17 < 0) {
                    i17 += i16;
                }
                int i18 = i11 % i16;
                if (i18 < 0) {
                    i18 += i16;
                }
                int i19 = (i17 - i18) % i16;
                if (i19 < 0) {
                    i19 += i16;
                }
                return i19 + i11;
            }
        }
        return i11;
    }

    public static int M(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 32) {
            return 5;
        }
        if (i10 == 64) {
            return 6;
        }
        if (i10 == 128) {
            return 7;
        }
        if (i10 == 256) {
            return 8;
        }
        if (i10 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(l1.d.e(i10, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static final long N(long j10) {
        if (j10 < 0) {
            int i10 = bn.a.f5743d;
            return bn.a.f5742c;
        }
        int i11 = bn.a.f5743d;
        return bn.a.f5741b;
    }

    public static final w0.d O(String name) {
        kotlin.jvm.internal.n.f(name, "name");
        return new w0.d(name);
    }

    public static boolean P() {
        l7.a aVar = l7.f.f45113f.t().f45117c;
        return (aVar == null || new Date().after(aVar.f45071a)) ? false : true;
    }

    public static final w0.d Q(String name) {
        kotlin.jvm.internal.n.f(name, "name");
        return new w0.d(name);
    }

    public static hh.d R(File file) {
        xj.w wVar = xj.w.f53867a;
        try {
            if (!file.exists()) {
                return new hh.d(wVar);
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                og.b bVar = new og.b(new lo.n(q1.B(fileInputStream)));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                bVar.n();
                while (bVar.s()) {
                    if (kotlin.jvm.internal.n.a(bVar.x(), "duplicates")) {
                        bVar.n();
                        while (bVar.s()) {
                            String strX = bVar.x();
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            bVar.k();
                            while (bVar.s()) {
                                String strB = bVar.B();
                                kotlin.jvm.internal.n.e(strB, "nextString(...)");
                                linkedHashSet.add(strB);
                            }
                            bVar.q();
                            linkedHashMap.put(strX, linkedHashSet);
                        }
                        bVar.r();
                    } else {
                        bVar.F();
                    }
                }
                bVar.r();
                hh.d dVar = new hh.d(linkedHashMap);
                fileInputStream.close();
                return dVar;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    i0.j(fileInputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception e10) {
            Log.e("ProjectLogger", "JSON Parsing: Error parsing duplicates JSON", e10);
            return new hh.d(wVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    public static final y S(y yVar, ArrayList arrayList) {
        r0 r0Var;
        yVar.t().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(p.W(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            um.d dVar = (um.d) it.next();
            dVar.getClass();
            y yVar2 = dVar.f52272c;
            y yVar3 = dVar.f52271b;
            m0 m0Var = dVar.f52270a;
            qm.d.f49173a.b(yVar3, yVar2);
            if (kotlin.jvm.internal.n.a(yVar3, yVar2)) {
                r0Var = new r0(yVar3);
            } else {
                if (m0Var.v() == 2) {
                    r0Var = new r0(yVar3);
                } else {
                    if (wk.h.E(yVar3) && m0Var.v() != 2) {
                        r0Var = new r0(3 != m0Var.v() ? 3 : 1, yVar2);
                    } else {
                        if (yVar2 == null) {
                            wk.h.a(140);
                            throw null;
                        }
                        if (wk.h.x(yVar2) && yVar2.Q()) {
                            r0Var = new r0(2 == m0Var.v() ? 1 : 2, yVar3);
                        } else {
                            r0Var = new r0(3 != m0Var.v() ? 3 : 1, yVar2);
                        }
                    }
                }
            }
            arrayList2.add(r0Var);
        }
        return pm.c.p(yVar, arrayList2, null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0135  */
    public static final long T(long j10, long j11, bn.c unit) {
        long j12;
        kotlin.jvm.internal.n.f(unit, "unit");
        long jH = bn.a.h(j11, unit);
        long jF = 0;
        if (((j10 - 1) | 1) == Long.MAX_VALUE) {
            if (!bn.a.e(j11) || (j10 ^ jH) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinities of different signs");
        }
        if (((jH - 1) | 1) != Long.MAX_VALUE) {
            long j13 = j10 + jH;
            if (((jH ^ j13) & (j10 ^ j13)) < 0) {
                return j10 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            return j13;
        }
        long jF2 = bn.a.f5742c;
        long j14 = bn.a.f5741b;
        int i10 = ((int) j11) & 1;
        if (i10 == 0) {
            jF = d0.c.g((j11 >> 1) / ((long) 2));
            j12 = Long.MAX_VALUE;
        } else {
            j12 = Long.MAX_VALUE;
            if (bn.a.e(j11)) {
                int iSignum = Integer.signum(2);
                if (bn.a.e(j11)) {
                    if (iSignum == 0) {
                        throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
                    }
                    jF = iSignum > 0 ? j11 : bn.a.i(j11);
                } else if (iSignum != 0) {
                    long j15 = j11 >> 1;
                    long j16 = iSignum;
                    long j17 = j15 * j16;
                    if (i10 == 0) {
                        if (-2147483647L > j15 || j15 >= 2147483648L) {
                            if (j17 / j16 == j15) {
                                jF2 = (-4611686018426999999L > j17 || j17 >= 4611686018427000000L) ? d0.c.f(j17 / ((long) 1000000)) : d0.c.g(j17);
                            } else {
                                long j18 = 1000000;
                                long j19 = j15 / j18;
                                long j20 = j19 * j16;
                                long j21 = (((j15 - (j19 * j18)) * j16) / j18) + j20;
                                if (j20 / j16 != j19 || (j21 ^ j20) < 0) {
                                    if (Integer.signum(iSignum) * Long.signum(j15) > 0) {
                                        jF = j14;
                                    }
                                } else {
                                    jF = d0.c.f(com.bumptech.glide.d.o(j21, new pk.e(-4611686018427387903L, 4611686018427387903L)));
                                }
                            }
                            jF = jF2;
                        } else {
                            jF = d0.c.g(j17);
                        }
                    } else if (j17 / j16 == j15) {
                        jF = d0.c.f(com.bumptech.glide.d.o(j17, new pk.e(-4611686018427387903L, 4611686018427387903L)));
                    } else {
                        if (Integer.signum(iSignum) * Long.signum(j15) > 0) {
                            jF = j14;
                        } else {
                            jF = jF2;
                        }
                    }
                }
            } else {
                long j22 = j11 >> 1;
                long j23 = 2;
                long j24 = j22 / j23;
                if (-4611686018426L > j24 || j24 >= 4611686018427L) {
                    jF = d0.c.f(j24);
                } else {
                    long j25 = 1000000;
                    jF = d0.c.g((j24 * j25) + (((j22 - (j24 * j23)) * j25) / j23));
                }
            }
        }
        long jH2 = bn.a.h(jF, unit);
        return ((jH2 - 1) | 1) == j12 ? jH2 : T(T(j10, jF, unit), bn.a.f(j11, bn.a.i(jF)), unit);
    }

    public static final long U(long j10, long j11, bn.c cVar) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            return d0.c.P(j12, cVar);
        }
        bn.c cVar2 = bn.c.MILLISECONDS;
        if (cVar.compareTo(cVar2) >= 0) {
            return bn.a.i(N(j12));
        }
        long jC = c.c(1L, cVar2, cVar);
        long j13 = (j10 / jC) - (j11 / jC);
        long j14 = (j10 % jC) - (j11 % jC);
        int i10 = bn.a.f5743d;
        return bn.a.f(d0.c.P(j13, cVar2), d0.c.P(j14, cVar));
    }

    public static void V(final Context context, x xVar, final boolean z10) {
        Task taskForException;
        int i10;
        SharedPreferences sharedPreferencesI = I(context);
        if (sharedPreferencesI.contains("proxy_retention") && sharedPreferencesI.getBoolean("proxy_retention", false) == z10) {
            return;
        }
        h9.c cVar = (h9.c) xVar.f23262c;
        if (cVar.f42260c.f() >= 241100000) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("proxy_retention", z10);
            h9.k kVarE = h9.k.e(cVar.f42259b);
            synchronized (kVarE) {
                i10 = kVarE.f42286a;
                kVarE.f42286a = i10 + 1;
            }
            taskForException = kVarE.g(new h9.j(i10, 4, bundle, 0));
        } else {
            taskForException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        taskForException.addOnSuccessListener(new da(1), new OnSuccessListener() { // from class: zc.r
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                SharedPreferences.Editor editorEdit = go.k.I(context).edit();
                editorEdit.putBoolean("proxy_retention", z10);
                editorEdit.apply();
            }
        });
    }

    public static void W(xi.f binaryMessenger, final tj.o oVar) {
        nf nfVar;
        kotlin.jvm.internal.n.f(binaryMessenger, "binaryMessenger");
        xi.l hVar = (oVar == null || (nfVar = oVar.f50873a) == null) ? new defpackage.h(10) : nfVar.e();
        Object obj = null;
        k5.g gVar = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor", hVar, obj);
        if (oVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b() { // from class: tj.e0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    int i11 = i10;
                    o oVar2 = oVar;
                    switch (i11) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), new p0(oVar2));
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var = (p0) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var.f50886c = zBooleanValue;
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var2 = (p0) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var2.f50887d = zBooleanValue2;
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var3 = (p0) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var3.f50888e = zBooleanValue3;
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var4 = (p0) obj10;
                            Object obj11 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var4.f50889f = zBooleanValue4;
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var5 = (p0) obj12;
                            Object obj13 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var5.f50890g = zBooleanValue5;
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser", hVar, obj);
        if (oVar != null) {
            final int i11 = 1;
            gVar2.C(new xi.b() { // from class: tj.e0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    int i12 = i11;
                    o oVar2 = oVar;
                    switch (i12) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), new p0(oVar2));
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var = (p0) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var.f50886c = zBooleanValue;
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var2 = (p0) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var2.f50887d = zBooleanValue2;
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var3 = (p0) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var3.f50888e = zBooleanValue3;
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var4 = (p0) obj10;
                            Object obj11 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var4.f50889f = zBooleanValue4;
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var5 = (p0) obj12;
                            Object obj13 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var5.f50890g = zBooleanValue5;
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage", hVar, obj);
        if (oVar != null) {
            final int i12 = 2;
            gVar3.C(new xi.b() { // from class: tj.e0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    int i13 = i12;
                    o oVar2 = oVar;
                    switch (i13) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), new p0(oVar2));
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var = (p0) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var.f50886c = zBooleanValue;
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var2 = (p0) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var2.f50887d = zBooleanValue2;
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var3 = (p0) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var3.f50888e = zBooleanValue3;
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var4 = (p0) obj10;
                            Object obj11 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var4.f50889f = zBooleanValue4;
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var5 = (p0) obj12;
                            Object obj13 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var5.f50890g = zBooleanValue5;
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        k5.g gVar4 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert", hVar, obj);
        if (oVar != null) {
            final int i13 = 3;
            gVar4.C(new xi.b() { // from class: tj.e0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    int i14 = i13;
                    o oVar2 = oVar;
                    switch (i14) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), new p0(oVar2));
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var = (p0) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var.f50886c = zBooleanValue;
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var2 = (p0) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var2.f50887d = zBooleanValue2;
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var3 = (p0) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var3.f50888e = zBooleanValue3;
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var4 = (p0) obj10;
                            Object obj11 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var4.f50889f = zBooleanValue4;
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var5 = (p0) obj12;
                            Object obj13 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var5.f50890g = zBooleanValue5;
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                    }
                }
            });
        } else {
            gVar4.C(null);
        }
        k5.g gVar5 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm", hVar, obj);
        if (oVar != null) {
            final int i14 = 4;
            gVar5.C(new xi.b() { // from class: tj.e0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    int i15 = i14;
                    o oVar2 = oVar;
                    switch (i15) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), new p0(oVar2));
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var = (p0) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var.f50886c = zBooleanValue;
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var2 = (p0) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var2.f50887d = zBooleanValue2;
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var3 = (p0) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var3.f50888e = zBooleanValue3;
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var4 = (p0) obj10;
                            Object obj11 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var4.f50889f = zBooleanValue4;
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var5 = (p0) obj12;
                            Object obj13 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var5.f50890g = zBooleanValue5;
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                    }
                }
            });
        } else {
            gVar5.C(null);
        }
        k5.g gVar6 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt", hVar, obj);
        if (oVar == null) {
            gVar6.C(null);
        } else {
            final int i15 = 5;
            gVar6.C(new xi.b() { // from class: tj.e0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    int i16 = i15;
                    o oVar2 = oVar;
                    switch (i16) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), new p0(oVar2));
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var = (p0) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var.f50886c = zBooleanValue;
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var2 = (p0) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var2.f50887d = zBooleanValue2;
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var3 = (p0) obj8;
                            Object obj9 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var3.f50888e = zBooleanValue3;
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var4 = (p0) obj10;
                            Object obj11 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var4.f50889f = zBooleanValue4;
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            p0 p0Var5 = (p0) obj12;
                            Object obj13 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                oVar2.getClass();
                                p0Var5.f50890g = zBooleanValue5;
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                    }
                }
            });
        }
    }

    public static final w0.d X(String name) {
        kotlin.jvm.internal.n.f(name, "name");
        return new w0.d(name);
    }

    public static final w0.d Y(String name) {
        kotlin.jvm.internal.n.f(name, "name");
        return new w0.d(name);
    }

    public static String Z(h0 h0Var) {
        StringBuilder sb2 = new StringBuilder(h0Var.m());
        for (int i10 = 0; i10 < h0Var.m(); i10++) {
            byte b10 = h0Var.b(i10);
            if (b10 == 34) {
                sb2.append("\\\"");
            } else if (b10 == 39) {
                sb2.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b10 < 32 || b10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b10 >>> 6) & 3) + 48));
                            sb2.append((char) (((b10 >>> 3) & 7) + 48));
                            sb2.append((char) ((b10 & 7) + 48));
                        } else {
                            sb2.append((char) b10);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static void a(Appendable appendable, Object obj, jk.b bVar) {
        kotlin.jvm.internal.n.f(appendable, "<this>");
        if (bVar != null) {
            appendable.append((CharSequence) bVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static final um.a b(y type) {
        um.d dVar;
        um.d dVar2;
        kotlin.jvm.internal.n.f(type, "type");
        if (pm.c.k(type)) {
            um.a aVarB = b(pm.c.l(type));
            um.a aVarB2 = b(pm.c.z(type));
            return new um.a(pm.c.h(pm.f.j(pm.c.l((y) aVarB.f52267a), pm.c.z((y) aVarB2.f52267a)), type), pm.c.h(pm.f.j(pm.c.l((y) aVarB.f52268b), pm.c.z((y) aVarB2.f52268b)), type));
        }
        n0 n0VarP = type.P();
        boolean z10 = true;
        if (type.P() instanceof cm.b) {
            kotlin.jvm.internal.n.d(n0VarP, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            q0 q0VarA = ((cm.b) n0VarP).a();
            y yVarB = q0VarA.b();
            kotlin.jvm.internal.n.e(yVarB, "typeProjection.type");
            y yVarH = y0.h(yVarB, type.Q());
            int iC = v0.i.c(q0VarA.a());
            if (iC == 1) {
                c0 c0VarO = i0.H(type).o();
                kotlin.jvm.internal.n.e(c0VarO, "type.builtIns.nullableAnyType");
                return new um.a(yVarH, c0VarO);
            }
            if (iC == 2) {
                return new um.a(y0.h(i0.H(type).n(), type.Q()), yVarH);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + q0VarA);
        }
        if (type.t().isEmpty() || type.t().size() != n0VarP.getParameters().size()) {
            return new um.a(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listT = type.t();
        List parameters = n0VarP.getParameters();
        kotlin.jvm.internal.n.e(parameters, "typeConstructor.parameters");
        Iterator it = xj.n.U0(listT, parameters).iterator();
        while (true) {
            byte b10 = 0;
            if (!it.hasNext()) {
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            z10 = false;
                            break;
                        }
                        dVar = (um.d) it2.next();
                        dVar.getClass();
                    } while (qm.d.f49173a.b(dVar.f52271b, dVar.f52272c));
                } else {
                    z10 = false;
                    break;
                }
                return new um.a(z10 ? i0.H(type).n() : S(type, arrayList), S(type, arrayList2));
            }
            wj.f fVar = (wj.f) it.next();
            q0 q0Var = (q0) fVar.f53283a;
            m0 typeParameter = (m0) fVar.f53284b;
            kotlin.jvm.internal.n.e(typeParameter, "typeParameter");
            int iV = typeParameter.v();
            if (iV == 0) {
                w0.a(35);
                throw null;
            }
            if (q0Var == null) {
                w0.a(36);
                throw null;
            }
            w0 w0Var = w0.f48482b;
            int iC2 = v0.i.c(q0Var.c() ? 3 : w0.b(iV, q0Var.a()));
            if (iC2 == 0) {
                y type2 = q0Var.b();
                kotlin.jvm.internal.n.e(type2, "type");
                y type3 = q0Var.b();
                kotlin.jvm.internal.n.e(type3, "type");
                dVar2 = new um.d(typeParameter, type2, type3);
            } else if (iC2 == 1) {
                y type4 = q0Var.b();
                kotlin.jvm.internal.n.e(type4, "type");
                c0 c0VarO2 = fm.e.e(typeParameter).o();
                kotlin.jvm.internal.n.e(c0VarO2, "typeParameter.builtIns.nullableAnyType");
                dVar2 = new um.d(typeParameter, type4, c0VarO2);
            } else {
                if (iC2 != 2) {
                    throw new aa.b(b10, 20);
                }
                c0 c0VarN = fm.e.e(typeParameter).n();
                y type5 = q0Var.b();
                kotlin.jvm.internal.n.e(type5, "type");
                dVar2 = new um.d(typeParameter, c0VarN, type5);
            }
            if (q0Var.c()) {
                arrayList.add(dVar2);
                arrayList2.add(dVar2);
            } else {
                um.a aVarB3 = b(dVar2.f52271b);
                y yVar = (y) aVarB3.f52267a;
                y yVar2 = (y) aVarB3.f52268b;
                um.a aVarB4 = b(dVar2.f52272c);
                y yVar3 = (y) aVarB4.f52267a;
                y yVar4 = (y) aVarB4.f52268b;
                m0 m0Var = dVar2.f52270a;
                um.d dVar3 = new um.d(m0Var, yVar2, yVar3);
                um.d dVar4 = new um.d(m0Var, yVar, yVar4);
                arrayList.add(dVar3);
                arrayList2.add(dVar4);
            }
        }
    }

    public static String c(int i10, int i11, String str) {
        if (i10 < 0) {
            return j1.f.B("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return j1.f.B("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(l1.d.e(i11, "negative size: "));
    }

    public static final w0.d d(String name) {
        kotlin.jvm.internal.n.f(name, "name");
        return new w0.d(name);
    }

    public static void e(int i10, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(j1.f.B(str, Integer.valueOf(i10)));
        }
    }

    public static void f(long j10, boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(j1.f.B(str, Long.valueOf(j10)));
        }
    }

    public static void g(String str, int i10, int i11, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(j1.f.B(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void h(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void i(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void j(boolean z10, String str, long j10, long j11) {
        if (!z10) {
            throw new IllegalArgumentException(j1.f.B(str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static void k(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(j1.f.B(str, obj));
        }
    }

    public static void l(boolean z10, String str, Object obj, Comparable comparable) {
        if (!z10) {
            throw new IllegalArgumentException(j1.f.B(str, obj, comparable));
        }
    }

    public static void m(int i10, int i11) {
        String strB;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strB = j1.f.B("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(l1.d.e(i11, "negative size: "));
                }
                strB = j1.f.B("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static void n(ListenableFuture listenableFuture, Object obj, String str) {
        if (listenableFuture == null) {
            throw new NullPointerException(j1.f.B(str, obj));
        }
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void p(p1.m0 m0Var) {
        m0Var.getClass();
    }

    public static void q(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(c(i10, i11, "index"));
        }
    }

    public static void r(int i10, int i11, int i12) {
        String strC;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strC = c(i10, i12, "start index");
            } else {
                strC = (i11 < 0 || i11 > i12) ? c(i11, i12, "end index") : j1.f.B("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static void s(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void t(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Multi-variable type inference failed */
    public static String u(s sVar, int i10) {
        String strB;
        boolean z10 = (i10 & 1) != 0;
        boolean z11 = (i10 & 2) != 0;
        kotlin.jvm.internal.n.f(sVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            if (sVar instanceof zk.i) {
                strB = "<init>";
            } else {
                strB = ((cl.p) sVar).getName().b();
                kotlin.jvm.internal.n.e(strB, "name.asString()");
            }
            sb2.append(strB);
        }
        sb2.append("(");
        z zVarJ = sVar.J();
        ym.c cVar = ym.c.f54544e;
        if (zVarJ != null) {
            y type = zVarJ.getType();
            kotlin.jvm.internal.n.e(type, "it.type");
            sb2.append((rl.j) com.google.android.gms.internal.auth.o.s(type, q.f49646k, cVar));
        }
        Iterator it = sVar.B().iterator();
        while (it.hasNext()) {
            y type2 = ((x0) it.next()).getType();
            kotlin.jvm.internal.n.e(type2, "parameter.type");
            sb2.append((rl.j) com.google.android.gms.internal.auth.o.s(type2, q.f49646k, cVar));
        }
        sb2.append(")");
        if (z10) {
            if (sVar instanceof zk.i) {
                sb2.append("V");
            } else {
                y returnType = sVar.getReturnType();
                kotlin.jvm.internal.n.c(returnType);
                yl.f fVar = wk.h.f53310e;
                if (wk.h.D(returnType, wk.l.f53341d)) {
                    y returnType2 = sVar.getReturnType();
                    kotlin.jvm.internal.n.c(returnType2);
                    if (!y0.e(returnType2) && !(sVar instanceof o0)) {
                        sb2.append("V");
                    }
                }
                y returnType3 = sVar.getReturnType();
                kotlin.jvm.internal.n.c(returnType3);
                sb2.append((rl.j) com.google.android.gms.internal.auth.o.s(returnType3, q.f49646k, cVar));
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String v(zk.b bVar) {
        kotlin.jvm.internal.n.f(bVar, "<this>");
        if (!bm.e.o(bVar)) {
            zk.j jVarE = bVar.e();
            zk.e eVar = jVarE instanceof zk.e ? (zk.e) jVarE : null;
            if (eVar != null && !eVar.getName().f54515b) {
                zk.b bVarA = bVar.a();
                cl.q0 q0Var = bVarA instanceof cl.q0 ? (cl.q0) bVarA : null;
                if (q0Var != null) {
                    return c.H(eVar, u(q0Var, 3));
                }
            }
        }
        return null;
    }

    public static HashMap w(e8.a entity) {
        kotlin.jvm.internal.n.f(entity, "entity");
        HashMap mapN = b0.N(new wj.f("id", String.valueOf(entity.f39151a)), new wj.f(IronSourceConstants.EVENTS_DURATION, Long.valueOf(entity.f39153c / ((long) 1000))), new wj.f("type", Integer.valueOf(entity.f39157g)), new wj.f("createDt", Long.valueOf(entity.f39154d)), new wj.f("width", Integer.valueOf(entity.f39155e)), new wj.f("height", Integer.valueOf(entity.f39156f)), new wj.f("orientation", Integer.valueOf(entity.f39160j)), new wj.f("is_favorite", Boolean.valueOf(entity.f39161k)), new wj.f("is_trashed", Boolean.valueOf(entity.l)), new wj.f("modifiedDt", Long.valueOf(entity.f39159i)), new wj.f(O6.f26746s, null), new wj.f("lng", null), new wj.f("title", entity.f39158h), new wj.f("relativePath", entity.f39164o));
        mapN.put("mimeType", entity.f39163n);
        return mapN;
    }

    public static Map x(List list) {
        kotlin.jvm.internal.n.f(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(w((e8.a) it.next()));
        }
        return b0.P(new wj.f("data", arrayList));
    }

    public static Map y(List list) {
        kotlin.jvm.internal.n.f(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e8.b bVar = (e8.b) it.next();
            int i10 = bVar.f39167c;
            if (i10 != 0) {
                LinkedHashMap linkedHashMapR = b0.R(new wj.f("id", bVar.f39165a), new wj.f("name", bVar.f39166b), new wj.f("assetCount", Integer.valueOf(i10)), new wj.f("isAll", Boolean.valueOf(bVar.f39169e)));
                Long l = bVar.f39170f;
                if (l != null) {
                    linkedHashMapR.put("modified", l);
                }
                arrayList.add(linkedHashMapR);
            }
        }
        return b0.P(new wj.f("data", arrayList));
    }

    public static f8.c z(Map map) {
        return new f8.c(Long.parseLong(String.valueOf(map.get("min"))), Long.parseLong(String.valueOf(map.get(AppLovinMediationProvider.MAX))), Boolean.parseBoolean(String.valueOf(map.get("ignore"))));
    }

    public abstract void K(Context context, String str, ph.d dVar, b2.w wVar, s1 s1Var);

    public abstract void L(Context context, ph.d dVar, b2.w wVar, s1 s1Var);
}
