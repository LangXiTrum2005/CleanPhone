package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c00 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public JSONObject f12963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12964h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12966j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12957a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f12958b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f12959c = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f12965i = new ArrayList();

    public c00(String str, long j10) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.f12960d = "";
        this.f12964h = false;
        this.f12966j = false;
        this.f12961e = str;
        this.f12962f = j10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f12963g = new JSONObject(str);
            if (((Boolean) zzba.zzc().a(am.f12306pd)).booleanValue() && a()) {
                return;
            }
            if (this.f12963g.optInt("status", -1) != 1) {
                this.f12964h = false;
                int i10 = zze.zza;
                zzo.zzi("App settings could not be fetched successfully.");
                return;
            }
            this.f12964h = true;
            this.f12960d = this.f12963g.optString(MBridgeConstans.APP_ID);
            JSONArray jSONArrayOptJSONArray2 = this.f12963g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i11);
                    String strOptString = jSONObject.optString("format");
                    String strOptString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f12958b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f12959c.put(strOptString2, new ot(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.f12963g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                    this.f12957a.add(jSONArrayOptJSONArray3.optString(i12));
                }
            }
            if (((Boolean) zzba.zzc().a(am.V7)).booleanValue() && (jSONObjectOptJSONObject2 = this.f12963g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i13 = 0; i13 < jSONArrayOptJSONArray.length(); i13++) {
                    this.f12965i.add(jSONArrayOptJSONArray.get(i13).toString());
                }
            }
            if (!((Boolean) zzba.zzc().a(am.f12315q7)).booleanValue() || (jSONObjectOptJSONObject = this.f12963g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f12966j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e10) {
            int i14 = zze.zza;
            zzo.zzj("Exception occurred while processing app setting json", e10);
            zzt.zzh().d("AppSettings.parseAppSettingsJson", e10);
        }
    }

    public final boolean a() {
        yh0 yh0Var;
        if (b()) {
            return false;
        }
        if (((Boolean) zzba.zzc().a(am.f12224k5)).booleanValue() && (yh0Var = zzt.zzh().f14137i) != null) {
            lj1 lj1VarA = yh0Var.a();
            lj1VarA.l("action", "cld_reset");
            lj1VarA.l("cld_lut_ms", String.valueOf(this.f12962f));
            ((p9.b) zzt.zzk()).getClass();
            lj1VarA.l("event_timestamp", String.valueOf(System.currentTimeMillis()));
            lj1VarA.l("cld_ttl_sec", String.valueOf(c()));
            lj1VarA.m();
        }
        this.f12957a.clear();
        this.f12958b.clear();
        this.f12959c.clear();
        this.f12960d = "";
        this.f12961e = "";
        this.f12963g = null;
        this.f12964h = false;
        this.f12965i.clear();
        this.f12966j = false;
        return true;
    }

    public final boolean b() {
        if (!TextUtils.isEmpty(this.f12961e) && this.f12963g != null) {
            long jC = c();
            ((p9.b) zzt.zzk()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jC >= 0) {
                long j10 = this.f12962f;
                if (j10 > jCurrentTimeMillis || TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - j10) > jC) {
                    return false;
                }
            }
        }
        return true;
    }

    public final long c() {
        ul ulVar = am.f12350sd;
        return (!((Boolean) zzba.zzc().a(am.f12334rd)).booleanValue() || TextUtils.isEmpty(this.f12961e)) ? ((Long) zzba.zzc().a(ulVar)).longValue() : this.f12963g.optLong("cache_ttl_sec", ((Long) zzba.zzc().a(ulVar)).longValue());
    }
}
