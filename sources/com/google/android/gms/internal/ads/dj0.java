package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dj0 implements ha0, mb0, va0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lj0 f13556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13558c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public aa0 f13561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zze f13562g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public JSONObject f13566k;
    public JSONObject l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13567m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13568n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13569o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f13563h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f13564i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f13565j = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13559d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public cj0 f13560e = cj0.f13191a;

    public dj0(lj0 lj0Var, ou0 ou0Var, String str) {
        this.f13556a = lj0Var;
        this.f13558c = str;
        this.f13557b = ou0Var.f18366g;
    }

    public static JSONObject c(zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : c(zzeVar2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.va0
    public final void J(m80 m80Var) {
        lj0 lj0Var = this.f13556a;
        if (lj0Var.f()) {
            this.f13561f = m80Var.f17339f;
            this.f13560e = cj0.f13192b;
            if (((Boolean) zzba.zzc().a(am.Ta)).booleanValue()) {
                lj0Var.c(this.f13557b, this);
            }
        }
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectB;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f13560e);
        jSONObject.put("format", du0.a(this.f13559d));
        if (((Boolean) zzba.zzc().a(am.Ta)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f13567m);
            if (this.f13567m) {
                jSONObject.put("shown", this.f13568n);
            }
        }
        aa0 aa0Var = this.f13561f;
        if (aa0Var != null) {
            jSONObjectB = b(aa0Var);
        } else {
            zze zzeVar = this.f13562g;
            JSONObject jSONObjectB2 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                aa0 aa0Var2 = (aa0) iBinder;
                jSONObjectB2 = b(aa0Var2);
                if (aa0Var2.f11958e.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(c(this.f13562g));
                    jSONObjectB2.put("errors", jSONArray);
                }
            }
            jSONObjectB = jSONObjectB2;
        }
        jSONObject.put("responseInfo", jSONObjectB);
        return jSONObject;
    }

    public final JSONObject b(aa0 aa0Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", aa0Var.f11954a);
        jSONObject.put("responseSecsSinceEpoch", aa0Var.f11959f);
        jSONObject.put("responseId", aa0Var.f11955b);
        if (((Boolean) zzba.zzc().a(am.Ma)).booleanValue()) {
            String str = aa0Var.f11960g;
            if (!TextUtils.isEmpty(str)) {
                String strValueOf = String.valueOf(str);
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzd("Bidding data: ".concat(strValueOf));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.f13563h)) {
            jSONObject.put("adRequestUrl", this.f13563h);
        }
        if (!TextUtils.isEmpty(this.f13564i)) {
            jSONObject.put("postBody", this.f13564i);
        }
        if (!TextUtils.isEmpty(this.f13565j)) {
            jSONObject.put("adResponseBody", this.f13565j);
        }
        Object obj = this.f13566k;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.l;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) zzba.zzc().a(am.Pa)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f13569o);
        }
        JSONArray jSONArray = new JSONArray();
        for (zzv zzvVar : aa0Var.f11958e) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzvVar.zza);
            jSONObject2.put("latencyMillis", zzvVar.zzb);
            if (((Boolean) zzba.zzc().a(am.Na)).booleanValue()) {
                jSONObject2.put("credentials", zzay.zza().zzo(zzvVar.zzd));
            }
            zze zzeVar = zzvVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : c(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.ha0
    public final void j0(zze zzeVar) {
        lj0 lj0Var = this.f13556a;
        if (lj0Var.f()) {
            this.f13560e = cj0.f13193c;
            this.f13562g = zzeVar;
            if (((Boolean) zzba.zzc().a(am.Ta)).booleanValue()) {
                lj0Var.c(this.f13557b, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void q0(mx mxVar) {
        if (((Boolean) zzba.zzc().a(am.Ta)).booleanValue()) {
            return;
        }
        lj0 lj0Var = this.f13556a;
        if (lj0Var.f()) {
            lj0Var.c(this.f13557b, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void z(ju0 ju0Var) {
        lj0 lj0Var = this.f13556a;
        if (lj0Var.f()) {
            uw uwVar = ju0Var.f16196b;
            List list = (List) uwVar.f20919c;
            if (!list.isEmpty()) {
                this.f13559d = ((du0) list.get(0)).f13677b;
            }
            fu0 fu0Var = (fu0) uwVar.f20920d;
            String str = fu0Var.l;
            if (!TextUtils.isEmpty(str)) {
                this.f13563h = str;
            }
            String str2 = fu0Var.f14556m;
            if (!TextUtils.isEmpty(str2)) {
                this.f13564i = str2;
            }
            JSONObject jSONObject = fu0Var.f14559p;
            if (jSONObject.length() > 0) {
                this.l = jSONObject;
            }
            if (((Boolean) zzba.zzc().a(am.Pa)).booleanValue()) {
                if (lj0Var.f17033w >= ((Long) zzba.zzc().a(am.Qa)).longValue()) {
                    this.f13569o = true;
                    return;
                }
                String str3 = fu0Var.f14557n;
                if (!TextUtils.isEmpty(str3)) {
                    this.f13565j = str3;
                }
                JSONObject jSONObject2 = fu0Var.f14558o;
                if (jSONObject2.length() > 0) {
                    this.f13566k = jSONObject2;
                }
                JSONObject jSONObject3 = this.f13566k;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f13565j)) {
                    length += this.f13565j.length();
                }
                long j10 = length;
                synchronized (lj0Var) {
                    lj0Var.f17033w += j10;
                }
            }
        }
    }
}
