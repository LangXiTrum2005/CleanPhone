package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbp;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f14552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f14553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tf1 f14554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f14555k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f14556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f14557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final JSONObject f14558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final JSONObject f14559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f14560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f14561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f14562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f14563t;

    /* JADX WARN: Code duplicated, block: B:51:0x0118  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public fu0(JsonReader jsonReader) throws JSONException, IOException {
        String str;
        List listZzb = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str2 = "";
        int iNextInt = 0;
        String strNextString = "";
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        boolean zNextBoolean = false;
        tf1 tf1Var = null;
        long j10 = -1;
        long j11 = -1;
        long jNextLong = 0;
        int iNextInt2 = -1;
        int iMax = 1;
        int iNextInt3 = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Objects.equals(strNextName, "nofill_urls")) {
                listZzb = zzbp.zzb(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if (Objects.equals(strNextName, "refresh_load_delay_time_interval")) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString2 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt3 = jsonReader.nextInt();
            } else {
                if ("latency".equals(strNextName)) {
                    jNextLong = jsonReader.nextLong();
                } else {
                    str = str2;
                    if (((Boolean) zzba.zzc().a(am.H9)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        tf1 tf1Var2 = new tf1();
                        jsonReader.beginObject();
                        String strNextString8 = str;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            int iHashCode = strNextName2.hashCode();
                            long j12 = j10;
                            if (iHashCode != -1724546052) {
                                if (iHashCode == 3059181 && strNextName2.equals("code")) {
                                    jsonReader.nextInt();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName2.equals("description")) {
                                strNextString8 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                            j10 = j12;
                        }
                        jsonReader.endObject();
                        tf1Var2.f20372b = strNextString8;
                        tf1Var = tf1Var2;
                    } else {
                        long j13 = j10;
                        if ("bidding_data".equals(strNextName)) {
                            strNextString3 = jsonReader.nextString();
                        } else {
                            if (((Boolean) zzba.zzc().a(am.f12070ac)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                                jsonReader.nextBoolean();
                            } else if ("adapter_response_replacement_key".equals(strNextName)) {
                                strNextString7 = jsonReader.nextString();
                            } else if ("response_info_extras".equals(strNextName)) {
                                if (((Boolean) zzba.zzc().a(am.Q7)).booleanValue()) {
                                    try {
                                        try {
                                            Bundle bundleZzl = zzbp.zzl(zzbp.zzd(jsonReader));
                                            if (bundleZzl != null) {
                                                bundle = bundleZzl;
                                            }
                                        } catch (IllegalStateException unused) {
                                            jsonReader.skipValue();
                                        }
                                    } catch (IOException | JSONException unused2) {
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if ("adRequestPostBody".equals(strNextName)) {
                                if (((Boolean) zzba.zzc().a(am.Oa)).booleanValue()) {
                                    strNextString5 = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if ("adRequestUrl".equals(strNextName)) {
                                if (((Boolean) zzba.zzc().a(am.Oa)).booleanValue()) {
                                    strNextString4 = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else {
                                ul ulVar = am.Pa;
                                if (((Boolean) zzba.zzc().a(ulVar)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                                    strNextString6 = jsonReader.nextString();
                                } else if (((Boolean) zzba.zzc().a(ulVar)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                                    jSONObject = zzbp.zzd(jsonReader);
                                } else if (Objects.equals(strNextName, "max_parallel_renderers")) {
                                    iMax = Math.max(1, jsonReader.nextInt());
                                } else {
                                    if (((Boolean) zzba.zzc().a(am.Xa)).booleanValue() && Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                        jSONObject2 = zzbp.zzd(jsonReader);
                                    } else {
                                        if (((Boolean) zzba.zzc().a(am.T2)).booleanValue() && Objects.equals(strNextName, "latency_extras")) {
                                            try {
                                                Bundle bundleZzl2 = zzbp.zzl(zzbp.zzd(jsonReader));
                                                if (bundleZzl2 != null) {
                                                    double d10 = bundleZzl2.getDouble("start_time");
                                                    long j14 = (d10 > 9.223372036854776E18d || d10 < -9.223372036854776E18d) ? -1L : (long) d10;
                                                    try {
                                                        double d11 = bundleZzl2.getDouble("end_time");
                                                        j10 = (d11 > 9.223372036854776E18d || d11 < -9.223372036854776E18d) ? -1L : (long) d11;
                                                        j11 = j14;
                                                    } catch (IOException | JSONException unused3) {
                                                        j11 = j14;
                                                        j10 = j13;
                                                    } catch (IllegalStateException unused4) {
                                                        j11 = j14;
                                                        jsonReader.skipValue();
                                                        j10 = j13;
                                                    }
                                                }
                                            } catch (IllegalStateException unused5) {
                                            }
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    }
                                }
                            }
                        }
                        j10 = j13;
                    }
                }
                str2 = str;
            }
            str = str2;
            str2 = str;
        }
        long j15 = j10;
        jsonReader.endObject();
        this.f14545a = listZzb;
        this.f14547c = iNextInt;
        if (((Boolean) mn.f17489e.o()).booleanValue()) {
            this.f14548d = -1;
        } else {
            pb pbVar = wm.f21534a;
            if (((Long) pbVar.o()).longValue() > -1) {
                this.f14548d = ((Long) pbVar.o()).intValue();
            } else {
                this.f14548d = iNextInt2;
            }
        }
        this.f14546b = strNextString;
        this.f14549e = strNextString2;
        this.f14550f = iNextInt3;
        this.f14551g = jNextLong;
        this.f14554j = tf1Var;
        this.f14552h = zNextBoolean;
        this.f14553i = strNextString3;
        this.f14555k = bundle;
        this.l = strNextString4;
        this.f14556m = strNextString5;
        this.f14557n = strNextString6;
        this.f14558o = jSONObject;
        this.f14559p = jSONObject2;
        this.f14560q = strNextString7;
        pb pbVar2 = kn.f16482a;
        this.f14561r = ((Long) pbVar2.o()).longValue() > 0 ? ((Long) pbVar2.o()).intValue() : iMax;
        this.f14562s = j11;
        this.f14563t = j15;
    }
}
