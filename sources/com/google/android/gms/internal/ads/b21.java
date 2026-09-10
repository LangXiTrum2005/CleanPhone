package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbc;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b21 implements j, c2, xb1, p00, o00, InitializationCompleteCallback, RewardItem, yd1, qv0, zb0, z30, al0, j80, y30, nd1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static b21 f12614c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12616b;

    public /* synthetic */ b21(Object obj, int i10) {
        this.f12615a = i10;
        this.f12616b = obj;
    }

    public static final b21 b(Context context) {
        b21 b21Var;
        synchronized (b21.class) {
            try {
                if (f12614c == null) {
                    f12614c = new b21(context);
                }
                b21Var = f12614c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b21Var;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public /* synthetic */ ListenableFuture a(mx mxVar) {
        return ((hl0) ((dx1) ((vu0) this.f12616b).f21276d).zzb()).y1(mxVar, Binder.getCallingUid());
    }

    @Override // com.google.android.gms.internal.ads.c2
    public long c(long j10) {
        s2 s2Var = (s2) this.f12616b;
        s2Var.getClass();
        String str = uu0.f20901a;
        return Math.max(0L, Math.min((j10 * ((long) s2Var.f19772e)) / 1000000, s2Var.f19777j - 1));
    }

    public AtomicReference d(String str) {
        synchronized (this) {
            try {
                HashMap map = (HashMap) this.f12616b;
                if (!map.containsKey(str)) {
                    map.put(str, new AtomicReference());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (AtomicReference) ((HashMap) this.f12616b).get(str);
    }

    public void e(hb hbVar, bc.s sVar, zd1 zd1Var) {
        hbVar.zzp();
        hbVar.zzc("post-response");
        ((i0) this.f12616b).f15455b.post(new o1(hbVar, sVar, zd1Var, 1));
    }

    @Override // com.google.android.gms.internal.ads.j
    public ya1 f(int i10, ni niVar, int[] iArr) {
        aa1 aa1Var = ca1.f13122b;
        rb0.p(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < niVar.f17829a) {
            int i13 = i10;
            ni niVar2 = niVar;
            e eVar = new e(i13, niVar2, i11, (h) this.f12616b, iArr[i11]);
            int length = objArrCopyOf.length;
            int i14 = i12 + 1;
            int iD = x91.d(length, i14);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i12] = eVar;
            i11++;
            i12 = i14;
            i10 = i13;
            niVar = niVar2;
        }
        return ca1.A(i12, objArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.xb1
    public /* synthetic */ void g(long j10, np0 np0Var) {
        int i10 = this.f12615a;
        Object obj = this.f12616b;
        switch (i10) {
            case 3:
                rb0.i(j10, np0Var, ((m6) obj).I);
                break;
            default:
                rb0.i(j10, np0Var, ((da) obj).f13474c);
                break;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        fy fyVar = (fy) this.f12616b;
        if (fyVar != null) {
            try {
                return fyVar.zzf();
            } catch (RemoteException e10) {
                zzo.zzj("Could not forward getAmount to RewardItem", e10);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        fy fyVar = (fy) this.f12616b;
        if (fyVar != null) {
            try {
                return fyVar.zze();
            } catch (RemoteException e10) {
                zzo.zzj("Could not forward getType to RewardItem", e10);
            }
        }
        return null;
    }

    public ux1[] h(Handler handler, jy1 jy1Var, jy1 jy1Var2) {
        r20 r20Var = (r20) this.f12616b;
        b02 b02Var = b02.f12591h;
        Context context = r20Var.f19283a;
        p12 p12Var = new p12(context, 0);
        ps1.c0(!p12Var.f18437a);
        p12Var.f18437a = true;
        if (((ay0) p12Var.f18442f) == null) {
            p12Var.f18442f = new ay0(new x40[0]);
        }
        if (((k12) p12Var.f18441e) == null) {
            if (((n12) p12Var.f18443g) == null) {
                p12Var.f18443g = new n12(context);
            }
            if (((s6) p12Var.f18440d) == null) {
                p12Var.f18440d = s6.f19866j;
            }
            ay0 ay0Var = new ay0(context);
            l02 l02Var = context != null ? null : (l02) p12Var.f18439c;
            Context context2 = (Context) ay0Var.f12537b;
            if (context2 == null) {
                ay0Var.f12538c = l02Var;
            }
            n12 n12Var = (n12) p12Var.f18443g;
            ay0Var.f12539d = n12Var;
            if (n12Var == null) {
                ay0Var.f12539d = new n12(context2);
            }
            p12Var.f18441e = new k12(ay0Var);
        } else {
            ps1.c0(((n12) p12Var.f18443g) == null);
            ps1.c0(((s6) p12Var.f18440d) == null);
        }
        w12 w12Var = new w12(context, new zl(context, 3), handler, jy1Var2, new u12(p12Var));
        com.google.android.gms.common.api.internal.t tVar = new com.google.android.gms.common.api.internal.t(context);
        tVar.f11767c = b02Var;
        tVar.f11769e = handler;
        tVar.f11770f = jy1Var;
        ps1.c0(!tVar.f11765a);
        Handler handler2 = (Handler) tVar.f11769e;
        ps1.c0((handler2 == null && ((jy1) tVar.f11770f) == null) || !(handler2 == null || ((jy1) tVar.f11770f) == null));
        tVar.f11765a = true;
        return new ux1[]{w12Var, new u0(tVar)};
    }

    public void l() {
        synchronized (b21.class) {
            iw0 iw0Var = (iw0) this.f12616b;
            iw0Var.w("vendor_scoped_gpid_v2_id");
            iw0Var.w("vendor_scoped_gpid_v2_creation_time");
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public void onInitializationFailed(String str) {
        try {
            ((vr) this.f12616b).zzf(str);
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public void onInitializationSucceeded() {
        try {
            ((vr) this.f12616b).zze();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        int i10 = this.f12615a;
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public void mo164zzb(Object obj) {
        switch (this.f12615a) {
            case 13:
                u60 u60Var = (u60) this.f12616b;
                lx0 lx0Var = u60Var.f20654g;
                ju0 ju0Var = u60Var.f20652e;
                du0 du0Var = u60Var.f20653f;
                u60Var.f20655h.b(lx0Var.b(ju0Var, du0Var, false, "", (String) obj, du0Var.f13679c, null, null), true == zzt.zzh().i(u60Var.f20648a) ? 2 : 1);
                break;
            case 21:
                ((dj0) obj).f13567m = true;
                ((vj0) this.f12616b).f21186d.b();
                break;
            default:
                ju0 ju0Var2 = (ju0) obj;
                if (((Boolean) zzba.zzc().a(am.X2)).booleanValue()) {
                    ((nk0) this.f12616b).f17856k.z(ju0Var2);
                }
                break;
        }
    }

    public b21() {
        this.f12615a = 6;
        this.f12616b = new HashMap();
    }

    @Override // com.google.android.gms.internal.ads.j80
    public zzea zza() throws qu0 {
        try {
            return ((wu0) this.f12616b).f21609a.zzB();
        } catch (Throwable th2) {
            throw new qu0(th2);
        }
    }

    public b21(Context context) {
        this.f12615a = 0;
        if (iw0.f15862d == null) {
            iw0.f15862d = new iw0(context);
        }
        this.f12616b = iw0.f15862d;
        x11.v(context);
    }

    @Override // com.google.android.gms.internal.ads.nd1
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public ListenableFuture mo162zza() {
        String lowerCase;
        Bundle bundle;
        String str;
        HashMap map;
        Bundle bundle2;
        db1 db1VarA;
        ur0 ur0Var = (ur0) this.f12616b;
        if (((Boolean) zzba.zzc().a(am.Ac)).booleanValue()) {
            lowerCase = ur0Var.f20869e.f18366g.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = ur0Var.f20869e.f18366g;
        }
        if (((Boolean) zzba.zzc().a(am.f12355t2)).booleanValue()) {
            zi0 zi0Var = ur0Var.f20872h;
            synchronized (zi0Var) {
                bundle = new Bundle(zi0Var.f22628a);
            }
        } else {
            bundle = new Bundle();
        }
        Bundle bundle3 = bundle;
        if (((Boolean) zzba.zzc().a(am.f12238l5)).booleanValue()) {
            c00 c00VarZzi = zzt.zzh().g().zzi();
            if (!TextUtils.isEmpty(c00VarZzi.f12961e) && c00VarZzi.f12963g != null) {
                str = c00VarZzi.b() ? "VALID" : "INVALID";
            } else {
                str = "EMPTY";
            }
        } else {
            str = "";
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = ur0Var.f20869e.f18381w;
        if (jSONArray != null) {
            HashMap map2 = new HashMap();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                    String string = "";
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        string = jSONArrayOptJSONArray.getString(0);
                    }
                    String str3 = string;
                    if (!TextUtils.isEmpty(str3)) {
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                        Bundle bundle4 = new Bundle();
                        if (jSONObjectOptJSONObject != null) {
                            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                bundle4.putString(next, jSONObjectOptJSONObject.optString(next, ""));
                            }
                        }
                        map2.put(str3, new bp0(str3, true, true, false, bundle4));
                    }
                } catch (JSONException e10) {
                    zzt.zzh().d("RecursiveRtbAdapterMap.parseAdapters", new JSONException("Malformed RTB adapter config."));
                    zze.zzb("Malformed RTB adapter config.", e10);
                }
            }
            ur0Var.a(arrayList, map2);
        } else if (!((Boolean) zzba.zzc().a(am.C2)).booleanValue()) {
            yo0 yo0Var = ur0Var.f20867c;
            for (Map.Entry entry : (ab1) yo0Var.a(ur0Var.f20873i, lowerCase).entrySet()) {
                String str4 = (String) entry.getKey();
                List list = (List) entry.getValue();
                Bundle bundle5 = ur0Var.f20869e.f18363d.zzm;
                arrayList.add(ur0Var.b(str4, list, bundle5 != null ? bundle5.getBundle(str4) : null, true, true));
            }
            synchronized (yo0Var) {
                db1VarA = TextUtils.isEmpty(zzt.zzh().g().zzi().f12961e) ? db1.f13484g : db1.a(yo0Var.f22332b);
            }
            ur0Var.a(arrayList, db1VarA);
        } else {
            yo0 yo0Var2 = ur0Var.f20867c;
            String str5 = ur0Var.f20873i;
            synchronized (yo0Var2) {
                try {
                    db1 db1VarA2 = yo0Var2.a(str5, lowerCase);
                    db1 db1VarI = yo0Var2.i(lowerCase);
                    map = new HashMap();
                    for (Map.Entry entry2 : (ab1) db1VarA2.entrySet()) {
                        String str6 = (String) entry2.getKey();
                        if (db1VarI.containsKey(str6)) {
                            bp0 bp0Var = (bp0) db1VarI.get(str6);
                            List list2 = (List) entry2.getValue();
                            boolean z10 = bp0Var.f12838b;
                            boolean z11 = bp0Var.f12839c;
                            boolean z12 = bp0Var.f12840d;
                            if (list2 != null && !list2.isEmpty()) {
                                bundle2 = (Bundle) list2.get(0);
                            } else {
                                bundle2 = new Bundle();
                            }
                            map.put(str6, new bp0(str6, z10, z11, z12, bundle2));
                        }
                    }
                    mb1 mb1VarH = db1VarI.entrySet().h();
                    while (mb1VarH.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) mb1VarH.next();
                        String str7 = (String) entry3.getKey();
                        if (!map.containsKey(str7) && ((bp0) entry3.getValue()).f12840d) {
                            map.put(str7, (bp0) entry3.getValue());
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ur0Var.a(arrayList, map);
        }
        ca1 ca1VarY = ca1.y(arrayList);
        r90 r90Var = new r90(str2, arrayList, bundle3);
        fe1 fe1Var = ur0Var.f20865a;
        sd1 sd1Var = new sd1(ca1VarY, true, false);
        sd1Var.f19937p = new rd1(sd1Var, r90Var, fe1Var);
        sd1Var.v();
        return sd1Var;
    }

    public b21(Handler handler) {
        this.f12615a = 5;
        this.f12616b = new i0(this, handler);
    }

    public b21(vs vsVar, us usVar) {
        this.f12615a = 8;
        this.f12616b = usVar;
        Objects.requireNonNull(vsVar);
    }

    public b21(ju juVar, vr vrVar) {
        this.f12615a = 9;
        this.f12616b = vrVar;
    }

    private final void i(Throwable th2) {
    }

    private final void j(Throwable th2) {
    }

    private final void k(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.qv0
    public Object zza(Object obj) {
        int i10 = this.f12615a;
        Object obj2 = this.f12616b;
        switch (i10) {
            case 14:
                ju0 ju0Var = (ju0) obj;
                w50 w50Var = ((v80) obj2).f21105d;
                for (iu0 iu0Var : (ArrayList) ju0Var.f16196b.f20921e) {
                    Map map = w50Var.f21414a;
                    String str = iu0Var.f15846a;
                    JSONObject jSONObject = iu0Var.f15847b;
                    if (map.containsKey(str) && jSONObject != null) {
                        ((z50) map.get(str)).c(jSONObject);
                    } else {
                        Map map2 = w50Var.f21415b;
                        if (map2.containsKey(str) && jSONObject != null) {
                            y50 y50Var = (y50) map2.get(str);
                            HashMap map3 = new HashMap();
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                String strOptString = jSONObject.optString(next);
                                if (strOptString != null) {
                                    map3.put(next, strOptString);
                                }
                            }
                            y50Var.a(map3);
                        }
                    }
                }
                return ju0Var;
            default:
                ul0.c((SQLiteDatabase) obj, (zzu) obj2);
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.o00, com.google.android.gms.internal.ads.z30
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public void mo163zza() {
        switch (this.f12615a) {
            case 8:
                us usVar = (us) this.f12616b;
                zze.zza("Rejecting reference for JS Engine.");
                if (((Boolean) zzba.zzc().a(am.L8)).booleanValue()) {
                    usVar.s("SdkJavascriptFactory.createNewReference.FailureCallback", new IllegalStateException("Unable to create JS engine reference."));
                } else {
                    usVar.r();
                }
                break;
            case 19:
                ((kj) this.f12616b).a();
                break;
            default:
                ListenableFuture listenableFutureA = ((a8) this.f12616b).a();
                if (((Boolean) zzba.zzc().a(am.M8)).booleanValue()) {
                    sf1 sf1Var = new sf1("persistFlags", 4);
                    listenableFutureA.addListener(new zd1(0, listenableFutureA, sf1Var), l00.f16615h);
                } else {
                    v71.j(listenableFutureA, "persistFlags", l00.f16615h);
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p00, com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public void mo160zza(Object obj) {
        switch (this.f12615a) {
            case 7:
                ws wsVar = (ws) this.f12616b;
                wsVar.getClass();
                b30 b30Var = ((ms) obj).f17535a;
                if (b30Var == null || b30Var.l()) {
                    wsVar.f21595c = 1;
                }
                break;
            case 15:
                ((la0) obj).e((com.google.android.gms.ads.internal.client.zze) this.f12616b);
                break;
            case 16:
                ((db0) obj).b((com.google.android.gms.ads.internal.client.zzt) this.f12616b);
                break;
            case 17:
                ((wb0) obj).v0((tk) this.f12616b);
                break;
            default:
                ((vc0) obj).zzd((zzbc) this.f12616b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.y30
    public /* synthetic */ void zza(boolean z10, int i10, String str, String str2) {
        b30 b30Var = (b30) this.f12616b;
        b30Var.zzJ();
        b30Var.zzP().y0();
    }
}
