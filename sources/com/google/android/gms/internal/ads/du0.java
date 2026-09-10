package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.util.client.zzw;
import com.google.android.gms.ads.internal.util.zzbp;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class du0 {
    public final az A;
    public final List A0;
    public final String B;
    public final boolean B0;
    public final JSONObject C;
    public final ya1 C0;
    public final JSONObject D;
    public final boolean D0;
    public final String E;
    public final int E0;
    public final String F;
    public final Bundle F0;
    public final String G;
    public final boolean G0;
    public final String H;
    public final JSONArray H0;
    public final String I;
    public final int I0;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final int Q;
    public final int R;
    public final boolean S;
    public final boolean T;
    public final String U;
    public final x11 V;
    public final boolean W;
    public final boolean X;
    public final int Y;
    public final String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13675a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f13676a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13677b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final String f13678b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13679c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final boolean f13680c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13681d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final lw f13682d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13683e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final zzt f13684e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f13685f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final String f13686f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f13687g;
    public final boolean g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f13688h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final JSONObject f13689h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f13690i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final boolean f13691i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f13692j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final JSONObject f13693j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f13694k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final boolean f13695k0;
    public final dy l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final String f13696l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f13697m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final boolean f13698m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f13699n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final String f13700n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f13701o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final String f13702o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f13703p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f13704p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f13705q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f13706q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f13707r;
    public final boolean r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hu0 f13708s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f13709s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f13710t;
    public final String t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List f13711u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final List f13712u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final JSONObject f13713v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final boolean f13714v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f13715w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Map f13716w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f13717x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final zzv f13718x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f13719y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final zzw f13720y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f13721z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final double f13722z0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:400:0x0b89 A[PHI: r7 r99 r101 r102 r103 r104
  0x0b89: PHI (r7v51 int) = 
  (r7v4 int)
  (r7v5 int)
  (r7v6 int)
  (r7v7 int)
  (r7v8 int)
  (r7v9 int)
  (r7v10 int)
  (r7v11 int)
  (r7v16 int)
  (r7v52 int)
 binds: [B:398:0x0b81, B:395:0x0b60, B:392:0x0b3f, B:386:0x0b09, B:383:0x0aea, B:380:0x0acc, B:377:0x0aac, B:371:0x0a78, B:356:0x09c3, B:12:0x0109] A[DONT_GENERATE, DONT_INLINE]
  0x0b89: PHI (r99v51 java.util.List) = 
  (r99v1 java.util.List)
  (r99v2 java.util.List)
  (r99v3 java.util.List)
  (r99v4 java.util.List)
  (r99v5 java.util.List)
  (r99v6 java.util.List)
  (r99v7 java.util.List)
  (r99v8 java.util.List)
  (r99v13 java.util.List)
  (r99v52 java.util.List)
 binds: [B:398:0x0b81, B:395:0x0b60, B:392:0x0b3f, B:386:0x0b09, B:383:0x0aea, B:380:0x0acc, B:377:0x0aac, B:371:0x0a78, B:356:0x09c3, B:12:0x0109] A[DONT_GENERATE, DONT_INLINE]
  0x0b89: PHI (r101v54 java.util.List) = 
  (r101v1 java.util.List)
  (r101v2 java.util.List)
  (r101v3 java.util.List)
  (r101v4 java.util.List)
  (r101v5 java.util.List)
  (r101v6 java.util.List)
  (r101v7 java.util.List)
  (r101v8 java.util.List)
  (r101v13 java.util.List)
  (r101v55 java.util.List)
 binds: [B:398:0x0b81, B:395:0x0b60, B:392:0x0b3f, B:386:0x0b09, B:383:0x0aea, B:380:0x0acc, B:377:0x0aac, B:371:0x0a78, B:356:0x09c3, B:12:0x0109] A[DONT_GENERATE, DONT_INLINE]
  0x0b89: PHI (r102v70 java.util.List) = 
  (r102v1 java.util.List)
  (r102v2 java.util.List)
  (r102v3 java.util.List)
  (r102v4 java.util.List)
  (r102v5 java.util.List)
  (r102v6 java.util.List)
  (r102v7 java.util.List)
  (r102v8 java.util.List)
  (r102v13 java.util.List)
  (r102v71 java.util.List)
 binds: [B:398:0x0b81, B:395:0x0b60, B:392:0x0b3f, B:386:0x0b09, B:383:0x0aea, B:380:0x0acc, B:377:0x0aac, B:371:0x0a78, B:356:0x09c3, B:12:0x0109] A[DONT_GENERATE, DONT_INLINE]
  0x0b89: PHI (r103v69 java.util.List) = 
  (r103v1 java.util.List)
  (r103v2 java.util.List)
  (r103v3 java.util.List)
  (r103v4 java.util.List)
  (r103v5 java.util.List)
  (r103v6 java.util.List)
  (r103v7 java.util.List)
  (r103v8 java.util.List)
  (r103v13 java.util.List)
  (r103v70 java.util.List)
 binds: [B:398:0x0b81, B:395:0x0b60, B:392:0x0b3f, B:386:0x0b09, B:383:0x0aea, B:380:0x0acc, B:377:0x0aac, B:371:0x0a78, B:356:0x09c3, B:12:0x0109] A[DONT_GENERATE, DONT_INLINE]
  0x0b89: PHI (r104v54 java.util.List) = 
  (r104v1 java.util.List)
  (r104v2 java.util.List)
  (r104v3 java.util.List)
  (r104v4 java.util.List)
  (r104v5 java.util.List)
  (r104v6 java.util.List)
  (r104v7 java.util.List)
  (r104v8 java.util.List)
  (r104v13 java.util.List)
  (r104v55 java.util.List)
 binds: [B:398:0x0b81, B:395:0x0b60, B:392:0x0b3f, B:386:0x0b09, B:383:0x0aea, B:380:0x0acc, B:377:0x0aac, B:371:0x0a78, B:356:0x09c3, B:12:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public du0(JsonReader jsonReader) throws JSONException, IOException {
        int i10;
        ki0 ki0Var;
        List listZzb = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        aa1 aa1Var = ca1.f13122b;
        ya1 ya1Var = ya1.f22208e;
        HashMap map = new HashMap();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        int i11 = 1;
        List listZzb2 = listZzb;
        List listA = listZzb2;
        List listZzb3 = listA;
        List listA2 = listZzb3;
        JSONObject jSONObjectZzd = jSONObject;
        JSONObject jSONObjectZzd2 = jSONObject2;
        JSONObject jSONObjectZzd3 = jSONObject3;
        JSONObject jSONObjectZzd4 = jSONObject4;
        JSONObject jSONObjectZzd5 = jSONObject5;
        JSONObject jSONObjectZzd6 = jSONObject6;
        List listZzb4 = ya1Var;
        List listZzb5 = listZzb4;
        List listA3 = listZzb5;
        Map mapZzc = map;
        Bundle bundle2 = bundle;
        boolean zNextBoolean = true;
        String strNextString = "";
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String string = strNextString5;
        String strNextString6 = string;
        String strNextString7 = strNextString6;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        String strNextString10 = strNextString9;
        String strNextString11 = strNextString10;
        String strNextString12 = strNextString11;
        String strNextString13 = strNextString12;
        String strNextString14 = strNextString13;
        String strNextString15 = strNextString14;
        String strNextString16 = strNextString15;
        String strNextString17 = strNextString16;
        String strNextString18 = strNextString17;
        String strNextString19 = strNextString18;
        double dNextDouble = 0.0d;
        int i12 = 0;
        int i13 = 0;
        dy dyVarB = null;
        int iNextInt = 0;
        hu0 hu0Var = null;
        az azVar = null;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        boolean zNextBoolean8 = false;
        int i14 = -1;
        int iNextInt2 = 0;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        boolean zNextBoolean11 = false;
        int iNextInt3 = 0;
        int iNextInt4 = -1;
        boolean zNextBoolean12 = false;
        lw lwVar = null;
        zzt zztVarZza = null;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        boolean zNextBoolean15 = false;
        String strNextString20 = null;
        boolean zNextBoolean16 = false;
        boolean zNextBoolean17 = false;
        boolean zNextBoolean18 = false;
        boolean zNextBoolean19 = false;
        int iNextInt5 = 0;
        boolean zNextBoolean20 = false;
        zzv zzvVarZzb = null;
        zzw zzwVarZzd = null;
        int i15 = 2;
        boolean zNextBoolean21 = false;
        boolean zNextBoolean22 = false;
        int iNextInt6 = -1;
        JSONArray jSONArrayZze = null;
        List listZzb6 = listA2;
        List listZzb7 = listZzb6;
        List listZzb8 = listZzb7;
        List listZzb9 = listZzb8;
        List listZzb10 = listZzb9;
        List listZzb11 = listZzb10;
        List listZzb12 = listZzb11;
        List listZzb13 = listZzb12;
        List listZzb14 = listZzb13;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextName == null ? "" : strNextName;
            String str2 = "id";
            switch (str.hashCode()) {
                case -2138196627:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    if (str.equals("ad_source_instance_name")) {
                        strNextString14 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1980587809:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    if (str.equals("debug_signals")) {
                        jSONObjectZzd2 = zzbp.zzd(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1965512151:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    if (str.equals("omid_settings")) {
                        jSONObjectZzd4 = zzbp.zzd(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1964744830:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    if (str.equals("offline_ad_config") && ((Boolean) am.X9.d()).booleanValue()) {
                        zzwVarZzd = zzw.zzd(zzbp.zzd(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1871425831:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    if (str.equals("recursive_server_response_data")) {
                        strNextString17 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1843156475:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    if (str.equals("is_consent")) {
                        zNextBoolean19 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1840512279:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    if (str.equals("presentation_urls")) {
                        listZzb5 = zzbp.zzb(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1828733410:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    if (str.equals("network_ping_config") && ((Boolean) am.V9.d()).booleanValue()) {
                        zzvVarZzb = zzv.zzb(zzbp.zzd(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1812055556:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    if (str.equals("play_prewarm_options")) {
                        JSONObject jSONObjectZzd7 = zzbp.zzd(jsonReader);
                        boolean zOptBoolean = jSONObjectZzd7.optBoolean("enable_prewarming", false);
                        String strOptString = jSONObjectZzd7.optString("prefetch_url", "");
                        boolean zOptBoolean2 = jSONObjectZzd7.optBoolean("skip_offline_notification_flow", false);
                        lw lwVar2 = new lw();
                        lwVar2.f17135a = zOptBoolean;
                        lwVar2.f17137c = strOptString;
                        lwVar2.f17136b = zOptBoolean2;
                        lwVar = lwVar2;
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1785028569:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    if (str.equals("parallel_key")) {
                        strNextString19 = jsonReader.nextString();
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1776946669:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    if (str.equals("ad_source_name")) {
                        strNextString12 = jsonReader.nextString();
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1662989631:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    if (str.equals("is_interscroller")) {
                        zNextBoolean13 = jsonReader.nextBoolean();
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1620552059:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("preload_sort_type")) {
                        int iNextInt7 = jsonReader.nextInt();
                        i10 = 1;
                        int[] iArr = {1, 2, 3};
                        int i16 = 0;
                        while (true) {
                            if (i16 < 3) {
                                int i17 = iArr[i16];
                                int i18 = i17 - 1;
                                if (i17 == 0) {
                                    throw null;
                                }
                                if (i18 == iNextInt7) {
                                    i15 = i17;
                                } else {
                                    i16++;
                                }
                            } else {
                                i15 = 2;
                            }
                        }
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    } else {
                        i10 = 1;
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    break;
                case -1620470467:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("backend_query_id")) {
                        strNextString9 = jsonReader.nextString();
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1550155393:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("nofill_urls")) {
                        listZzb13 = zzbp.zzb(jsonReader);
                        listZzb14 = listZzb14;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1440104884:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("is_custom_close_blocked")) {
                        zNextBoolean7 = jsonReader.nextBoolean();
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1439500848:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("orientation")) {
                        String strNextString21 = jsonReader.nextString();
                        i14 = X3.i.C.equalsIgnoreCase(strNextString21) ? 6 : X3.i.D.equalsIgnoreCase(strNextString21) ? 7 : -1;
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1428969291:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("enable_omid")) {
                        zNextBoolean9 = jsonReader.nextBoolean();
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1406227629:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("buffer_click_url_as_ready_to_ping")) {
                        zNextBoolean17 = jsonReader.nextBoolean();
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1403779768:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("showable_impression_type")) {
                        iNextInt3 = jsonReader.nextInt();
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1375413093:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("ad_cover")) {
                        jSONObjectZzd5 = zzbp.zzd(jsonReader);
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1360811658:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("ad_sizes")) {
                        listA2 = eu0.a(jsonReader);
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1306015996:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("adapters")) {
                        listZzb3 = zzbp.zzb(jsonReader);
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1303332046:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("test_mode_enabled")) {
                        zNextBoolean6 = jsonReader.nextBoolean();
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1289032093:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
                        jSONObjectZzd3 = zzbp.zzd(jsonReader);
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1240082064:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("ad_event_value")) {
                        zztVarZza = zzt.zza(zzbp.zzd(jsonReader));
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1234181075:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("allow_pub_rendered_attribution")) {
                        zNextBoolean2 = jsonReader.nextBoolean();
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1168140544:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("presentation_error_urls")) {
                        listZzb14 = zzbp.zzb(jsonReader);
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1152230954:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("ad_type")) {
                        String strNextString22 = jsonReader.nextString();
                        i12 = "banner".equals(strNextString22) ? 1 : "interstitial".equals(strNextString22) ? 2 : "native_express".equals(strNextString22) ? 3 : IronSourceConstants.EVENTS_NATIVE.equals(strNextString22) ? 4 : "rewarded".equals(strNextString22) ? 5 : "app_open_ad".equals(strNextString22) ? 6 : "rewarded_interstitial".equals(strNextString22) ? 7 : 0;
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1146534047:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("is_scroll_aware")) {
                        zNextBoolean11 = jsonReader.nextBoolean();
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1115838944:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("fill_urls")) {
                        listZzb12 = zzbp.zzb(jsonReader);
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1081936678:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("allocation_id")) {
                        strNextString3 = jsonReader.nextString();
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1078050970:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("video_complete_urls")) {
                        listZzb11 = zzbp.zzb(jsonReader);
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -1051269058:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("active_view")) {
                        string = zzbp.zzd(jsonReader).toString();
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -982608540:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("valid_from_timestamp")) {
                        strNextString2 = jsonReader.nextString();
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -972056451:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("ad_source_instance_id")) {
                        strNextString15 = jsonReader.nextString();
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -776859333:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    if (str.equals("click_urls")) {
                        listZzb6 = zzbp.zzb(jsonReader);
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -652881372:
                    if (str.equals("on_device_storage_configs")) {
                        if (((Boolean) am.Q8.d()).booleanValue()) {
                            aa1 aa1Var2 = ca1.f13122b;
                            String str3 = "initialCapacity";
                            rb0.p(4, "initialCapacity");
                            Object[] objArrCopyOf = new Object[4];
                            jsonReader.beginArray();
                            int i19 = 0;
                            while (jsonReader.hasNext()) {
                                ya1 ya1Var2 = ya1.f22208e;
                                jsonReader.beginObject();
                                ya1 ya1VarA = ya1Var2;
                                Long lValueOf = null;
                                while (jsonReader.hasNext()) {
                                    listZzb14 = listZzb14;
                                    String strNextName2 = jsonReader.nextName();
                                    if (Objects.equals(strNextName2, str2)) {
                                        lValueOf = Long.valueOf(jsonReader.nextLong());
                                    } else {
                                        String str4 = str2;
                                        if (Objects.equals(strNextName2, "event_types")) {
                                            rb0.p(4, str3);
                                            jsonReader.beginArray();
                                            Object[] objArrCopyOf2 = new Object[4];
                                            int i20 = 0;
                                            while (jsonReader.hasNext()) {
                                                Integer numValueOf = Integer.valueOf(jsonReader.nextInt());
                                                String str5 = str3;
                                                int length = objArrCopyOf2.length;
                                                List list = listZzb13;
                                                int i21 = i20 + 1;
                                                List list2 = listZzb12;
                                                int iD = x91.d(length, i21);
                                                if (iD > length) {
                                                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iD);
                                                }
                                                objArrCopyOf2[i20] = numValueOf;
                                                i20 = i21;
                                                str3 = str5;
                                                listZzb13 = list;
                                                listZzb12 = list2;
                                            }
                                            jsonReader.endArray();
                                            ya1VarA = ca1.A(i20, objArrCopyOf2);
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                        str2 = str4;
                                    }
                                }
                                List list3 = listZzb12;
                                List list4 = listZzb13;
                                List list5 = listZzb14;
                                String str6 = str3;
                                String str7 = str2;
                                jsonReader.endObject();
                                if (lValueOf == null || ya1VarA.isEmpty()) {
                                    ki0Var = null;
                                } else {
                                    long jLongValue = lValueOf.longValue();
                                    ya1 ya1Var3 = ya1VarA;
                                    int i22 = ya1Var3.f22210d;
                                    int[] iArr2 = new int[i22];
                                    for (int i23 = 0; i23 < i22; i23++) {
                                        iArr2[i23] = ((Integer) ya1Var3.get(i23)).intValue();
                                    }
                                    ki0Var = new ki0(jLongValue, iArr2);
                                }
                                if (ki0Var != null) {
                                    int length2 = objArrCopyOf.length;
                                    int i24 = i19 + 1;
                                    int iD2 = x91.d(length2, i24);
                                    objArrCopyOf = iD2 > length2 ? Arrays.copyOf(objArrCopyOf, iD2) : objArrCopyOf;
                                    objArrCopyOf[i19] = ki0Var;
                                    i19 = i24;
                                }
                                str3 = str6;
                                listZzb14 = list5;
                                str2 = str7;
                                listZzb13 = list4;
                                listZzb12 = list3;
                                listZzb11 = listZzb11;
                                listZzb10 = listZzb10;
                            }
                            listZzb10 = listZzb10;
                            listZzb11 = listZzb11;
                            listZzb12 = listZzb12;
                            jsonReader.endArray();
                            listA3 = ca1.A(i19, objArrCopyOf);
                            listZzb10 = listZzb10;
                            i10 = 1;
                            i11 = i10;
                            listZzb12 = listZzb12;
                            listZzb11 = listZzb11;
                        } else {
                            jsonReader.skipValue();
                            i10 = 1;
                            listZzb14 = listZzb14;
                            listZzb13 = listZzb13;
                            listZzb10 = listZzb10;
                            i11 = i10;
                            listZzb12 = listZzb12;
                            listZzb11 = listZzb11;
                        }
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -570101180:
                    if (str.equals("late_load_urls")) {
                        listZzb11 = listZzb11;
                        listZzb12 = listZzb12;
                        listZzb4 = zzbp.zzb(jsonReader);
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = 1;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -544216775:
                    if (str.equals("safe_browsing")) {
                        JSONObject jSONObjectZzd8 = zzbp.zzd(jsonReader);
                        listZzb11 = listZzb11;
                        listZzb12 = listZzb12;
                        azVar = new az(jSONObjectZzd8.optString("click_string", ""), jSONObjectZzd8.optString("report_url", ""), jSONObjectZzd8.optBoolean("rendered_ad_enabled", false), jSONObjectZzd8.optBoolean("non_malicious_reporting_enabled", false), zzbp.zza(jSONObjectZzd8.optJSONArray("allowed_headers"), null), jSONObjectZzd8.optBoolean("protection_enabled", false), jSONObjectZzd8.optBoolean("malicious_reporting_enabled", false), zzbp.zza(jSONObjectZzd8.optJSONArray("webview_permissions"), null));
                        i10 = 1;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -437057161:
                    if (str.equals("imp_urls")) {
                        listZzb7 = zzbp.zzb(jsonReader);
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -404433734:
                    if (str.equals("rtb_native_required_assets")) {
                        jSONObjectZzd6 = zzbp.zzd(jsonReader);
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -404326515:
                    if (str.equals("render_timeout_ms")) {
                        iNextInt2 = jsonReader.nextInt();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -397704715:
                    if (str.equals("ad_close_time_ms")) {
                        iNextInt4 = jsonReader.nextInt();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -388807511:
                    if (str.equals("content_url")) {
                        strNextString20 = jsonReader.nextString();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -369773488:
                    if (str.equals("is_close_button_enabled")) {
                        jsonReader.nextBoolean();
                        i10 = i11;
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -213449460:
                    if (str.equals("force_disable_hardware_acceleration")) {
                        zNextBoolean16 = jsonReader.nextBoolean();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -213424028:
                    if (str.equals(MBridgeConstans.EXTRA_KEY_WM)) {
                        strNextString8 = jsonReader.nextString();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -180214626:
                    if (str.equals("native_required_asset_viewability")) {
                        zNextBoolean15 = jsonReader.nextBoolean();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -154616268:
                    if (str.equals("is_offline_ad")) {
                        zNextBoolean14 = jsonReader.nextBoolean();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case -29338502:
                    if (str.equals("allow_custom_click_gesture")) {
                        zNextBoolean4 = jsonReader.nextBoolean();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 3107:
                    if (str.equals("ad")) {
                        hu0Var = new hu0(jsonReader);
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    } else {
                        listZzb10 = listZzb10;
                        listZzb11 = listZzb11;
                        listZzb12 = listZzb12;
                        listZzb13 = listZzb13;
                        listZzb14 = listZzb14;
                        i10 = i11;
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        strNextString4 = jsonReader.nextString();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 3076010:
                    if (str.equals("data")) {
                        jSONObjectZzd = zzbp.zzd(jsonReader);
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 37109963:
                    if (str.equals("request_id")) {
                        strNextString16 = jsonReader.nextString();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 63195984:
                    if (str.equals("render_test_label")) {
                        zNextBoolean5 = jsonReader.nextBoolean();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 107433883:
                    if (str.equals("qdata")) {
                        strNextString5 = jsonReader.nextString();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 230323073:
                    if (str.equals("ad_load_urls")) {
                        listZzb8 = zzbp.zzb(jsonReader);
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 281223176:
                    if (str.equals("is_secondary_analytics_logging_enabled")) {
                        zNextBoolean = jsonReader.nextBoolean();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 418392395:
                    if (str.equals("is_closable_area_disabled")) {
                        zNextBoolean8 = jsonReader.nextBoolean();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 542250332:
                    if (str.equals("consent_form_action_identifier")) {
                        iNextInt5 = jsonReader.nextInt();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 549176928:
                    if (str.equals("presentation_error_timeout_ms")) {
                        iNextInt = jsonReader.nextInt();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 597473788:
                    if (str.equals("debug_dialog_string")) {
                        strNextString6 = jsonReader.nextString();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 639133141:
                    if (str.equals("response_info_extras_override")) {
                        if (((Boolean) am.R7.d()).booleanValue()) {
                            try {
                                Bundle bundleZzl = zzbp.zzl(zzbp.zzd(jsonReader));
                                if (bundleZzl != null) {
                                    bundle2 = bundleZzl;
                                }
                                i10 = i11;
                            } catch (IllegalStateException unused) {
                                jsonReader.skipValue();
                                i10 = i11;
                                listZzb14 = listZzb14;
                                listZzb13 = listZzb13;
                                listZzb10 = listZzb10;
                            }
                            i11 = i10;
                            listZzb12 = listZzb12;
                            listZzb11 = listZzb11;
                        } else {
                            jsonReader.skipValue();
                        }
                        i10 = i11;
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 754887508:
                    if (str.equals("container_sizes")) {
                        listA = eu0.a(jsonReader);
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 791122864:
                    if (str.equals("impression_type")) {
                        int iNextInt8 = jsonReader.nextInt();
                        i13 = (iNextInt8 == 0 || iNextInt8 == i11 || iNextInt8 == 3 || iNextInt8 == 4) ? iNextInt8 : 0;
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 805095541:
                    if (str.equals("analytics_event_name_to_parameters_map")) {
                        if (((Boolean) am.T0.d()).booleanValue()) {
                            mapZzc = zzbp.zzc(jsonReader);
                            i10 = i11;
                            i11 = i10;
                            listZzb12 = listZzb12;
                            listZzb11 = listZzb11;
                        } else {
                            jsonReader.skipValue();
                            i10 = i11;
                            listZzb14 = listZzb14;
                            listZzb13 = listZzb13;
                            listZzb10 = listZzb10;
                            i11 = i10;
                            listZzb12 = listZzb12;
                            listZzb11 = listZzb11;
                        }
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 1010584092:
                    if (str.equals(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER)) {
                        strNextString = jsonReader.nextString();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 1100650276:
                    if (str.equals("rewards")) {
                        dyVarB = dy.b(zzbp.zze(jsonReader));
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 1141602460:
                    if (str.equals("adapter_response_info_key")) {
                        strNextString18 = jsonReader.nextString();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 1186014765:
                    if (str.equals("cache_hit_urls")) {
                        zzbp.zzb(jsonReader);
                        i10 = i11;
                        listZzb14 = listZzb14;
                        listZzb13 = listZzb13;
                        listZzb10 = listZzb10;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 1303622534:
                    if (str.equals("preload_sort_value")) {
                        listZzb11 = listZzb11;
                        listZzb12 = listZzb12;
                        i10 = i11;
                        dNextDouble = jsonReader.nextDouble();
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 1321720943:
                    if (str.equals("allow_pub_owned_ad_view")) {
                        zNextBoolean3 = jsonReader.nextBoolean();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 1422388341:
                    if (str.equals("is_collapsible")) {
                        zNextBoolean18 = jsonReader.nextBoolean();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 1437255331:
                    if (str.equals(CampaignEx.JSON_KEY_AD_SOURCE_ID)) {
                        strNextString13 = jsonReader.nextString();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 1556932485:
                    if (str.equals("post_click_lifecycle_monitoring_duration_ms")) {
                        if (((Boolean) am.Ae.d()).booleanValue()) {
                            iNextInt6 = jsonReader.nextInt();
                            i10 = i11;
                            i11 = i10;
                            listZzb12 = listZzb12;
                            listZzb11 = listZzb11;
                        } else {
                            jsonReader.skipValue();
                            i10 = i11;
                            listZzb14 = listZzb14;
                            listZzb13 = listZzb13;
                            listZzb10 = listZzb10;
                            i11 = i10;
                            listZzb12 = listZzb12;
                            listZzb11 = listZzb11;
                        }
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 1565514205:
                    if (str.equals("adapter_only_third_party_impression")) {
                        zNextBoolean22 = jsonReader.nextBoolean();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 1637553475:
                    if (str.equals("bid_response")) {
                        strNextString7 = jsonReader.nextString();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 1638957285:
                    if (str.equals("video_start_urls")) {
                        listZzb9 = zzbp.zzb(jsonReader);
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 1686319423:
                    if (str.equals("ad_network_class_name")) {
                        strNextString11 = jsonReader.nextString();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 1688341040:
                    if (str.equals("video_reward_urls")) {
                        listZzb10 = zzbp.zzb(jsonReader);
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 1799285870:
                    if (str.equals("use_third_party_container_height")) {
                        zNextBoolean12 = jsonReader.nextBoolean();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 1839650832:
                    if (str.equals("renderers")) {
                        listZzb = zzbp.zzb(jsonReader);
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 1875425491:
                    if (str.equals("is_analytics_logging_enabled")) {
                        zNextBoolean10 = jsonReader.nextBoolean();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 2004337096:
                    if (str.equals("recursive_signal_collection")) {
                        jSONArrayZze = zzbp.zze(jsonReader);
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 2068142375:
                    if (str.equals("rule_line_external_id")) {
                        strNextString10 = jsonReader.nextString();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 2072888499:
                    if (str.equals("manual_tracking_urls")) {
                        listZzb2 = zzbp.zzb(jsonReader);
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 2075506442:
                    if (str.equals("render_serially")) {
                        zNextBoolean20 = jsonReader.nextBoolean();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                case 2117205836:
                    if (str.equals("flow_control")) {
                        zNextBoolean21 = jsonReader.nextBoolean();
                        i10 = i11;
                        i11 = i10;
                        listZzb12 = listZzb12;
                        listZzb11 = listZzb11;
                    }
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
                default:
                    listZzb10 = listZzb10;
                    listZzb11 = listZzb11;
                    listZzb12 = listZzb12;
                    listZzb13 = listZzb13;
                    listZzb14 = listZzb14;
                    i10 = i11;
                    jsonReader.skipValue();
                    listZzb14 = listZzb14;
                    listZzb13 = listZzb13;
                    listZzb10 = listZzb10;
                    i11 = i10;
                    listZzb12 = listZzb12;
                    listZzb11 = listZzb11;
                    break;
            }
        }
        jsonReader.endObject();
        this.f13675a = listZzb;
        this.f13677b = i12;
        this.f13679c = listZzb6;
        this.f13681d = listZzb7;
        this.f13685f = listZzb8;
        this.f13683e = i13;
        this.f13687g = listZzb9;
        this.f13688h = listZzb10;
        this.f13690i = listZzb11;
        this.f13692j = strNextString;
        this.f13694k = strNextString2;
        this.l = dyVarB;
        this.f13697m = listZzb12;
        this.f13699n = listZzb13;
        this.f13701o = listZzb14;
        this.f13703p = listZzb2;
        this.f13705q = iNextInt;
        this.f13707r = listA;
        this.f13708s = hu0Var;
        this.f13710t = listZzb3;
        this.f13711u = listA2;
        this.f13715w = strNextString3;
        this.f13713v = jSONObjectZzd;
        this.f13717x = strNextString4;
        this.f13719y = strNextString5;
        this.f13721z = string;
        this.A = azVar;
        this.B = strNextString6;
        this.C = jSONObjectZzd2;
        this.D = jSONObjectZzd3;
        this.J = zNextBoolean2;
        this.K = zNextBoolean3;
        this.L = zNextBoolean4;
        this.M = zNextBoolean5;
        this.N = zNextBoolean6;
        this.O = zNextBoolean7;
        this.P = zNextBoolean8;
        this.Q = i14;
        this.R = iNextInt2;
        this.T = zNextBoolean9;
        this.U = strNextString7;
        this.V = new x11(jSONObjectZzd4, 25);
        this.W = zNextBoolean10;
        this.X = zNextBoolean11;
        this.Y = iNextInt3;
        this.Z = strNextString8;
        this.f13676a0 = iNextInt4;
        this.f13678b0 = strNextString9;
        this.f13680c0 = zNextBoolean12;
        this.f13682d0 = lwVar;
        this.f13684e0 = zztVarZza;
        this.f13686f0 = strNextString10;
        this.g0 = zNextBoolean13;
        this.f13689h0 = jSONObjectZzd5;
        this.E = strNextString11;
        this.F = strNextString12;
        this.G = strNextString13;
        this.H = strNextString14;
        this.I = strNextString15;
        this.f13691i0 = zNextBoolean14;
        this.f13693j0 = jSONObjectZzd6;
        this.f13695k0 = zNextBoolean15;
        this.f13696l0 = strNextString20;
        this.f13698m0 = zNextBoolean16;
        this.S = zNextBoolean17;
        this.f13700n0 = strNextString16;
        this.f13702o0 = strNextString17;
        this.f13704p0 = strNextString18;
        this.f13706q0 = zNextBoolean18;
        this.r0 = zNextBoolean19;
        this.f13709s0 = iNextInt5;
        this.f13712u0 = listZzb4;
        this.t0 = strNextString19;
        this.f13714v0 = zNextBoolean20;
        this.f13716w0 = mapZzc;
        this.f13718x0 = zzvVarZzb;
        this.f13720y0 = zzwVarZzd;
        this.f13722z0 = dNextDouble;
        this.I0 = i15;
        this.A0 = listZzb5;
        this.B0 = zNextBoolean21;
        this.C0 = listA3;
        this.D0 = zNextBoolean22;
        this.E0 = iNextInt6;
        this.F0 = bundle2;
        this.G0 = zNextBoolean;
        this.H0 = jSONArrayZze;
    }

    public static String a(int i10) {
        switch (i10) {
            case 1:
                return com.ironsource.mediationsdk.j.f29553a;
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    public final boolean b() {
        return this.f13691i0 || this.f13720y0 != null;
    }
}
