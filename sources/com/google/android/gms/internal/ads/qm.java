package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.nonagon.signalgeneration.zza;
import com.google.android.gms.ads.nonagon.signalgeneration.zzj;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f19115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzj f19116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zza f19117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ci0 f19118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f19119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public om f19120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u.l f19121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f19122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f19123i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f19124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public JSONArray f19125k;
    public Context l;

    public qm(ScheduledExecutorService scheduledExecutorService, zzj zzjVar, zza zzaVar, ci0 ci0Var) {
        this.f19115a = scheduledExecutorService;
        this.f19116b = zzjVar;
        this.f19117c = zzaVar;
        this.f19118d = ci0Var;
    }

    public final void a(String str) {
        try {
            u.l lVar = this.f19121g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f19124j).toString());
            e(jSONObject);
            if (((Boolean) ln.f17064c.o()).booleanValue()) {
                jSONObject.put("as", this.f19117c.zzb());
            }
            lVar.a(jSONObject.toString());
            uh.a aVar = new uh.a(this, str);
            if (((Boolean) ln.f17066e.o()).booleanValue()) {
                this.f19116b.zzb(this.f19121g, aVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.l, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), aVar);
        } catch (JSONException e10) {
            int i10 = zze.zza;
            zzo.zzg("Error creating JSON: ", e10);
        }
    }

    public final JSONObject b(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) ln.f17066e.o()).booleanValue() ? ((Long) ln.f17069h.o()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) ln.f17064c.o()).booleanValue()) {
            jSONObject.put("as", this.f19117c.zzb());
        }
        return jSONObject;
    }

    public final JSONObject c(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) ln.f17066e.o()).booleanValue() ? ((Long) ln.f17069h.o()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) ln.f17064c.o()).booleanValue()) {
            jSONObject.put("as", this.f19117c.zzb());
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.am.f12425xb)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.om r0 = r7.f19120f
            if (r0 != 0) goto Lc
            int r7 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r7 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            com.google.android.gms.ads.internal.util.client.zzo.zzf(r7)
            return
        Lc:
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f18299c
            boolean r0 = r0.get()
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r7.f19122h
            if (r0 == 0) goto L98
            u.l r0 = r7.f19121g
            if (r0 == 0) goto L98
            java.util.concurrent.ScheduledExecutorService r0 = r7.f19115a
            if (r0 == 0) goto L98
            long r1 = r7.f19123i
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2a
            goto L3e
        L2a:
            p9.a r1 = com.google.android.gms.ads.internal.zzt.zzk()
            p9.b r1 = (p9.b) r1
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r7.f19123i
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L3e
            goto L50
        L3e:
            com.google.android.gms.internal.ads.ul r1 = com.google.android.gms.internal.ads.am.f12425xb
            com.google.android.gms.internal.ads.yl r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L98
        L50:
            u.l r1 = r7.f19121g
            java.lang.String r2 = r7.f19122h
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.getClass()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            u.f r4 = r1.f51643c
            c.d r1 = r1.f51642b
            android.os.Bundle r5 = new android.os.Bundle     // Catch: android.os.RemoteException -> L80
            r5.<init>()     // Catch: android.os.RemoteException -> L80
            boolean r6 = r5.isEmpty()     // Catch: android.os.RemoteException -> L80
            if (r6 == 0) goto L70
            r5 = 0
        L70:
            if (r5 == 0) goto L7b
            r3.putAll(r5)     // Catch: android.os.RemoteException -> L80
            c.b r1 = (c.b) r1     // Catch: android.os.RemoteException -> L80
            r1.v1(r4, r2, r3)     // Catch: android.os.RemoteException -> L80
            goto L80
        L7b:
            c.b r1 = (c.b) r1     // Catch: android.os.RemoteException -> L80
            r1.u1(r4, r2)     // Catch: android.os.RemoteException -> L80
        L80:
            com.google.android.gms.internal.ads.d r7 = r7.f19119e
            com.google.android.gms.internal.ads.ul r1 = com.google.android.gms.internal.ads.am.f12441yb
            com.google.android.gms.internal.ads.yl r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r7, r1, r3)
            return
        L98:
            java.lang.String r7 = "PACT max retry connection duration timed out"
            com.google.android.gms.ads.internal.util.zze.zza(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qm.d():void");
    }

    public final void e(JSONObject jSONObject) {
        try {
            if (this.f19125k == null) {
                this.f19125k = new JSONArray((String) zzba.zzc().a(am.Ab));
            }
            jSONObject.put("eids", this.f19125k);
        } catch (JSONException e10) {
            int i10 = zze.zza;
            zzo.zzg("Error fetching the PACT active eids JSON: ", e10);
        }
    }
}
