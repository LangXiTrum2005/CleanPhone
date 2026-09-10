package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f15904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f15905j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f15906k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f15907m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f15908n;

    public j10(String str) {
        long jLongValue;
        long jLongValue2;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f15896a = a(jSONObject, "aggressive_media_codec_release", am.B0);
        this.f15897b = b(jSONObject, "byte_buffer_precache_limit", am.f12262n);
        this.f15898c = b(jSONObject, "exo_cache_buffer_size", am.A);
        this.f15899d = b(jSONObject, "exo_connect_timeout_millis", am.f12202j);
        ul ulVar = am.f12187i;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.f15900e = b(jSONObject, "exo_read_timeout_millis", am.f12218k);
        this.f15901f = b(jSONObject, "load_check_interval_bytes", am.l);
        this.f15902g = b(jSONObject, "player_precache_limit", am.f12247m);
        this.f15903h = b(jSONObject, "socket_receive_buffer_size", am.f12277o);
        this.f15904i = a(jSONObject, "use_cache_data_source", am.f12326r5);
        b(jSONObject, "min_retry_count", am.f12292p);
        this.f15905j = a(jSONObject, "treat_load_exception_as_non_fatal", am.f12323r);
        this.f15906k = a(jSONObject, "enable_multiple_video_playback", am.H2);
        this.l = a(jSONObject, "use_range_http_data_source", am.J2);
        ul ulVar2 = am.K2;
        if (jSONObject != null) {
            try {
                jLongValue = jSONObject.getLong("range_http_data_source_high_water_mark");
            } catch (JSONException unused3) {
                jLongValue = ((Long) zzba.zzc().a(ulVar2)).longValue();
            }
        } else {
            jLongValue = ((Long) zzba.zzc().a(ulVar2)).longValue();
        }
        this.f15907m = jLongValue;
        ul ulVar3 = am.L2;
        if (jSONObject != null) {
            try {
                jLongValue2 = jSONObject.getLong("range_http_data_source_low_water_mark");
            } catch (JSONException unused4) {
                jLongValue2 = ((Long) zzba.zzc().a(ulVar3)).longValue();
            }
        } else {
            jLongValue2 = ((Long) zzba.zzc().a(ulVar3)).longValue();
        }
        this.f15908n = jLongValue2;
    }

    public static final boolean a(JSONObject jSONObject, String str, ul ulVar) {
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(ulVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, ul ulVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) zzba.zzc().a(ulVar)).intValue();
    }
}
