package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbhp {
    private final ScheduledExecutorService zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzo zzb;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzf zzc;
    private final zzdxj zzd;
    private Runnable zze;
    private zzbhm zzf;
    private CustomTabsSession zzg;
    private String zzh;
    private long zzi = 0;
    private long zzj;
    private JSONArray zzk;
    private Context zzl;

    public zzbhp(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zzo zzoVar, com.google.android.gms.ads.nonagon.signalgeneration.zzf zzfVar, zzdxj zzdxjVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzoVar;
        this.zzc = zzfVar;
        this.zzd = zzdxjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbgk.zzlj)).booleanValue() != false) goto L23;
     */
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbhm r0 = r6.zzf
            if (r0 != 0) goto Lc
            int r0 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            com.google.android.gms.ads.internal.util.client.zzo.zzf(r0)
            return
        Lc:
            java.lang.Boolean r0 = r0.zza()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
            return
        L17:
            java.lang.String r0 = r6.zzh
            if (r0 == 0) goto L91
            androidx.browser.customtabs.CustomTabsSession r0 = r6.zzg
            if (r0 == 0) goto L91
            java.util.concurrent.ScheduledExecutorService r0 = r6.zza
            if (r0 == 0) goto L91
            long r1 = r6.zzi
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2c
            goto L3b
        L2c:
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzt.zzk()
            long r1 = r1.elapsedRealtime()
            long r3 = r6.zzi
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L3b
            goto L4d
        L3b:
            com.google.android.gms.internal.ads.zzbgb r1 = com.google.android.gms.internal.ads.zzbgk.zzlj
            com.google.android.gms.internal.ads.zzbgi r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L91
        L4d:
            androidx.browser.customtabs.CustomTabsSession r1 = r6.zzg
            java.lang.String r2 = r6.zzh
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.getClass()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.os.Bundle r4 = new android.os.Bundle     // Catch: android.os.RemoteException -> L79
            r4.<init>()     // Catch: android.os.RemoteException -> L79
            boolean r5 = r4.isEmpty()     // Catch: android.os.RemoteException -> L79
            if (r5 == 0) goto L69
            r4 = 0
        L69:
            android.support.customtabs.ICustomTabsCallback r5 = r1.f3715c
            android.support.customtabs.ICustomTabsService r1 = r1.f3714b
            if (r4 == 0) goto L76
            r3.putAll(r4)     // Catch: android.os.RemoteException -> L79
            r1.o(r5, r2, r3)     // Catch: android.os.RemoteException -> L79
            goto L79
        L76:
            r1.U(r5, r2)     // Catch: android.os.RemoteException -> L79
        L79:
            java.lang.Runnable r1 = r6.zze
            com.google.android.gms.internal.ads.zzbgb r2 = com.google.android.gms.internal.ads.zzbgk.zzlk
            com.google.android.gms.internal.ads.zzbgi r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzd(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L91:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhp.zzh():void");
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzk == null) {
                this.zzk = new JSONArray((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlm));
            }
            jSONObject.put("eids", this.zzk);
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error fetching the PACT active eids JSON: ", e2);
        }
    }

    public final void zza(@Nonnull Context context, @Nonnull CustomTabsClient customTabsClient, @Nonnull String str, @Nullable CustomTabsCallback customTabsCallback) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (customTabsClient == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzl = context;
        this.zzh = str;
        zzdxj zzdxjVar = this.zzd;
        zzbhm zzbhmVar = new zzbhm(this, customTabsCallback, zzdxjVar);
        this.zzf = zzbhmVar;
        CustomTabsSession customTabsSessionD = customTabsClient.d(zzbhmVar);
        this.zzg = customTabsSessionD;
        if (customTabsSessionD == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("CustomTabsClient failed to create new session.");
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zze(zzdxjVar, null, "pact_action", new Pair("pe", "pact_init"));
    }

    @Nullable
    public final CustomTabsSession zzb() {
        return this.zzg;
    }

    public final void zzc() {
        this.zzi = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzli)).intValue());
        if (this.zze == null) {
            this.zze = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbho
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            };
        }
        zzh();
    }

    public final void zzd(String str) {
        try {
            CustomTabsSession customTabsSession = this.zzg;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzj).toString());
            zzk(jSONObject);
            if (((Boolean) zzbip.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.zzc.zzb());
            }
            customTabsSession.d(jSONObject.toString());
            zzbhn zzbhnVar = new zzbhn(this, str);
            if (((Boolean) zzbip.zze.zze()).booleanValue()) {
                this.zzb.zzb(this.zzg, zzbhnVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.zzl, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbhnVar);
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating JSON: ", e2);
        }
    }

    public final JSONObject zze(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzbip.zze.zze()).booleanValue() ? ((Long) zzbip.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzbip.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zzb());
        }
        return jSONObject;
    }

    public final JSONObject zzf(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzbip.zze.zze()).booleanValue() ? ((Long) zzbip.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzbip.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zzb());
        }
        return jSONObject;
    }

    public final void zzg(long j) {
        this.zzj = j;
    }

    public final /* synthetic */ CustomTabsSession zzi() {
        return this.zzg;
    }
}
