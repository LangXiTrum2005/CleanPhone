package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.C0239a2;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class iq implements oq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ iq f15817b = new iq(20);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ iq f15818c = new iq(21);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ iq f15819d = new iq(22);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ iq f15820e = new iq(23);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ iq f15821f = new iq(24);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ iq f15822g = new iq(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15823a;

    public /* synthetic */ iq(int i10) {
        this.f15823a = i10;
    }

    private final void a(Object obj, Map map) {
        e20 e20Var;
        w10 w10Var;
        f20 f20Var;
        e20 h20Var;
        b30 b30Var = (b30) obj;
        if (zzo.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzo.zzd("Precache GMSG: ".concat(jSONObject.toString()));
        }
        y10 y10VarZzB = zzt.zzB();
        if (map.containsKey("abort")) {
            if (y10VarZzB.b(b30Var)) {
                return;
            }
            zzo.zzi("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numC = c("periodicReportIntervalMs", map);
        c("exoPlayerRenderingIntervalMs", map);
        c("exoPlayerIdleIntervalMs", map);
        j10 j10Var = new j10((String) map.get("flags"));
        w10 w10Var2 = null;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        strArr2[i10] = jSONArray.getString(i10);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    zzo.zzi("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (j10Var.f15906k) {
                Iterator it = y10VarZzB.f22072a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        w10Var = null;
                        break;
                    }
                    w10Var = (w10) it.next();
                    if (w10Var.f21361b == b30Var && str.equals(w10Var.f21363d)) {
                        break;
                    }
                }
            } else {
                Iterator it2 = y10VarZzB.f22072a.iterator();
                do {
                    if (!it2.hasNext()) {
                        w10Var = null;
                        break;
                    }
                    w10Var = (w10) it2.next();
                } while (w10Var.f21361b != b30Var);
            }
            if (w10Var != null) {
                zzo.zzi("Precache task is already running.");
                return;
            }
            if (b30Var.zzk() == null) {
                zzo.zzi("Precache requires a dependency provider.");
                return;
            }
            Integer numC2 = c("player", map);
            if (numC2 == null) {
                numC2 = 0;
            }
            if (numC != null) {
                b30Var.r0(numC.intValue());
            }
            int iIntValue = numC2.intValue();
            t10 t10Var = b30Var.zzk().zzb;
            if (iIntValue > 0) {
                int i11 = r20.f19282v.get();
                if (i11 < j10Var.f15902g) {
                    i20 i20Var = new i20(b30Var);
                    r20 r20Var = new r20(b30Var.getContext(), j10Var, (b30) i20Var.f13808c.get(), null);
                    int i12 = zze.zza;
                    zzo.zzh("ExoPlayerAdapter initialized.");
                    i20Var.f15524d = r20Var;
                    r20Var.f19292j = i20Var;
                    h20Var = i20Var;
                } else {
                    if (((Boolean) zzba.zzc().a(am.f12336s)).booleanValue()) {
                        i11 = h20.f15067o.get();
                    }
                    h20Var = i11 < j10Var.f15897b ? new h20(b30Var, j10Var) : new g20(b30Var);
                }
            } else {
                f20Var = new f20(b30Var);
                File cacheDir = f20Var.f13806a.getCacheDir();
                if (cacheDir == null) {
                    int i13 = zze.zza;
                    zzo.zzi("Context.getCacheDir() returned null");
                    h20Var = f20Var;
                } else {
                    File file = new File(new File(cacheDir, "admobVideoStreams").getPath());
                    f20Var.f14177d = file;
                    if (!file.isDirectory() && !file.mkdirs()) {
                        String strValueOf = String.valueOf(file.getAbsolutePath());
                        int i14 = zze.zza;
                        zzo.zzi("Could not create preload cache directory at ".concat(strValueOf));
                        f20Var.f14177d = null;
                        h20Var = f20Var;
                    } else if (!file.setReadable(true, false) || !file.setExecutable(true, false)) {
                        h20Var = f20Var;
                        String strValueOf2 = String.valueOf(file.getAbsolutePath());
                        int i15 = zze.zza;
                        zzo.zzi("Could not set cache file permissions at ".concat(strValueOf2));
                        f20Var.f14177d = null;
                        h20Var = f20Var;
                    }
                }
            }
            h20Var = f20Var;
            new w10(b30Var, h20Var, str, strArr).zzb();
            e20Var = h20Var;
        } else {
            for (w10 w10Var3 : y10VarZzB.f22072a) {
                if (w10Var3.f21361b == b30Var) {
                    w10Var2 = w10Var3;
                    break;
                }
            }
            if (w10Var2 == null) {
                zzo.zzi("Precache must specify a source.");
                return;
            }
            e20Var = w10Var2.f21362c;
        }
        Integer numC3 = c("minBufferMs", map);
        if (numC3 != null) {
            e20Var.m(numC3.intValue());
        }
        Integer numC4 = c("maxBufferMs", map);
        if (numC4 != null) {
            e20Var.l(numC4.intValue());
        }
        Integer numC5 = c("bufferForPlaybackMs", map);
        if (numC5 != null) {
            e20Var.n(numC5.intValue());
        }
        Integer numC6 = c("bufferForPlaybackAfterRebufferMs", map);
        if (numC6 != null) {
            e20Var.o(numC6.intValue());
        }
    }

    public static final Integer c(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            String strH = d5.u.h(new StringBuilder(str.length() + 39 + String.valueOf(str2).length()), "Precache invalid numeric parameter '", str, "': ", str2);
            int i10 = zze.zza;
            zzo.zzi(strH);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0340  */
    /* JADX WARN: Code duplicated, block: B:105:0x0343  */
    /* JADX WARN: Code duplicated, block: B:81:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0302  */
    /* JADX WARN: Code duplicated, block: B:92:0x030b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0314  */
    /* JADX WARN: Code duplicated, block: B:97:0x031d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.oq
    public final void b(Object obj, Map map) {
        JSONObject jSONObjectZzc;
        JSONObject jSONObjectMo170zzd;
        char c4;
        Intent uri;
        Intent intent;
        ResolveInfo resolveInfoResolveActivity;
        boolean z10;
        String[] strArrSplit;
        char c5 = 1;
        int i10 = 0;
        switch (this.f15823a) {
            case 0:
                b30 b30Var = (b30) obj;
                WindowManager windowManager = (WindowManager) b30Var.getContext().getSystemService("window");
                zzt.zzc();
                DisplayMetrics displayMetricsZzv = zzs.zzv(windowManager);
                int i11 = displayMetricsZzv.widthPixels;
                int i12 = displayMetricsZzv.heightPixels;
                int[] iArr = new int[2];
                HashMap map2 = new HashMap();
                ((View) b30Var).getLocationInWindow(iArr);
                map2.put("xInPixels", Integer.valueOf(iArr[0]));
                d5.u.p(iArr[1], map2, "yInPixels", i11, "windowWidthInPixels");
                map2.put("windowHeightInPixels", Integer.valueOf(i12));
                b30Var.e("locationReady", map2);
                int i13 = zze.zza;
                zzo.zzi("GET LOCATION COMPILED");
                return;
            case 1:
                b30 b30Var2 = (b30) obj;
                ao aoVarT0 = b30Var2.t0();
                if (aoVarT0 == null || (jSONObjectZzc = aoVarT0.zzc()) == null) {
                    b30Var2.f("nativeAdViewSignalsReady", new JSONObject());
                    return;
                } else {
                    b30Var2.f("nativeAdViewSignalsReady", jSONObjectZzc);
                    return;
                }
            case 2:
                b30 b30Var3 = (b30) obj;
                ao aoVarT1 = b30Var3.t0();
                if (aoVarT1 == null || (jSONObjectMo170zzd = aoVarT1.mo170zzd()) == null) {
                    b30Var3.f("nativeClickMetaReady", new JSONObject());
                    return;
                } else {
                    b30Var3.f("nativeClickMetaReady", jSONObjectMo170zzd);
                    return;
                }
            case 3:
                b30 b30Var4 = (b30) obj;
                zzt.zzt().zza(b30Var4, b30Var4.getContext());
                return;
            case 4:
                b30 b30Var5 = (b30) obj;
                if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
                    zze.zza("Missing App Id, cannot show LMD Overlay without it");
                    return;
                }
                g71 g71Var = new g71();
                g71Var.f14786c = 8388691;
                byte b10 = (byte) (g71Var.f14790g | 1);
                g71Var.f14787d = -1.0f;
                g71Var.f14790g = (byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8);
                g71Var.f14785b = (String) map.get("appId");
                g71Var.f14788e = b30Var5.getWidth();
                g71Var.f14790g = (byte) (g71Var.f14790g | 16);
                IBinder windowToken = b30Var5.zzE().getWindowToken();
                if (windowToken == null) {
                    throw new NullPointerException("Null windowToken");
                }
                g71Var.f14784a = windowToken;
                if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
                    g71Var.f14786c = Integer.parseInt((String) map.get("gravityY")) | Integer.parseInt((String) map.get("gravityX"));
                    g71Var.f14790g = (byte) (g71Var.f14790g | 1);
                } else {
                    g71Var.f14786c = 81;
                    g71Var.f14790g = (byte) (g71Var.f14790g | 1);
                }
                if (map.containsKey("verticalMargin")) {
                    g71Var.f14787d = Float.parseFloat((String) map.get("verticalMargin"));
                    g71Var.f14790g = (byte) (g71Var.f14790g | 2);
                } else {
                    g71Var.f14787d = 0.02f;
                    g71Var.f14790g = (byte) (g71Var.f14790g | 2);
                }
                if (map.containsKey("enifd")) {
                    g71Var.f14789f = (String) map.get("enifd");
                }
                try {
                    zzt.zzt().zzc(b30Var5, g71Var.a());
                    return;
                } catch (NullPointerException e10) {
                    zzt.zzh().d("DefaultGmsgHandlers.ShowLMDOverlay", e10);
                    zze.zza("Missing parameters for LMD Overlay show request");
                    return;
                }
            case 5:
                zzt.zzt().zzd();
                return;
            case 6:
                zzt.zzt().zze();
                return;
            case 7:
                zzt.zzt().zzf();
                return;
            case 8:
                b30 b30Var6 = (b30) obj;
                try {
                    z11 z11VarF = z11.f(b30Var6.getContext());
                    z11VarF.getClass();
                    synchronized (z11.class) {
                        z11VarF.c(false);
                        break;
                    }
                    a21.f(b30Var6.getContext()).g();
                    b21.b(b30Var6.getContext()).l();
                    return;
                } catch (IOException e11) {
                    zzt.zzh().d("DefaultGmsgHandlers.ResetPaid", e11);
                    return;
                }
            case 9:
                b30 b30Var7 = (b30) obj;
                try {
                    String str = (String) map.get("enabled");
                    iq iqVar = nq.f17890a;
                    if (x10.y(com.ironsource.mediationsdk.metadata.a.f29610g, str) || x10.y("false", str)) {
                        x11 x11VarV = x11.v(b30Var7.getContext());
                        boolean z11 = Boolean.parseBoolean(str);
                        x11VarV.getClass();
                        synchronized (x11.class) {
                            try {
                                ((iw0) x11VarV.f21703b).o(Boolean.valueOf(z11), "paidv2_user_option");
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return;
                    }
                    return;
                } catch (IOException e12) {
                    zzt.zzh().d("DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled", e12);
                    return;
                }
            case 10:
                b30 b30Var8 = (b30) obj;
                try {
                    JSONObject jSONObject = new JSONObject((String) map.get("args"));
                    Iterator<String> itKeys = jSONObject.keys();
                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(b30Var8.getContext()).edit();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object obj2 = jSONObject.get(next);
                        if (obj2 instanceof Integer) {
                            editorEdit.putInt(next, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Long) {
                            editorEdit.putLong(next, ((Long) obj2).longValue());
                        } else if (obj2 instanceof Double) {
                            editorEdit.putFloat(next, ((Double) obj2).floatValue());
                        } else if (obj2 instanceof Float) {
                            editorEdit.putFloat(next, ((Float) obj2).floatValue());
                        } else if (obj2 instanceof Boolean) {
                            editorEdit.putBoolean(next, ((Boolean) obj2).booleanValue());
                        } else if (obj2 instanceof String) {
                            editorEdit.putString(next, (String) obj2);
                        }
                    }
                    editorEdit.apply();
                    return;
                } catch (JSONException e13) {
                    zzt.zzh().d("GMSG write local storage KV pairs handler", e13);
                    return;
                }
            case 11:
                b30 b30Var9 = (b30) obj;
                try {
                    JSONArray jSONArray = new JSONArray((String) map.get("args"));
                    SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(b30Var9.getContext()).edit();
                    for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                        editorEdit2.remove(jSONArray.getString(i14));
                    }
                    editorEdit2.apply();
                    return;
                } catch (JSONException e14) {
                    zzt.zzh().d("GMSG clear local storage keys handler", e14);
                    return;
                }
            case 12:
                b30 b30Var10 = (b30) obj;
                if (b30Var10.j() != null) {
                    ((xs0) b30Var10.j()).x1(3);
                }
                zzm zzmVarZzL = b30Var10.zzL();
                if (zzmVarZzL != null) {
                    zzmVarZzL.zzb();
                    return;
                }
                zzm zzmVarF0 = b30Var10.f0();
                if (zzmVarF0 != null) {
                    zzmVarF0.zzb();
                    return;
                } else {
                    int i15 = zze.zza;
                    zzo.zzi("A GMSG tried to close something that wasn't an overlay.");
                    return;
                }
            case 13:
                ((b30) obj).c0("1".equals(map.get("custom_close")));
                return;
            case 14:
                String strValueOf = String.valueOf((String) map.get("string"));
                int i16 = zze.zza;
                zzo.zzh("Received log message: ".concat(strValueOf));
                return;
            case 15:
                ao aoVarT2 = ((b30) obj).t0();
                if (aoVarT2 != null) {
                    aoVarT2.mo165zza();
                    return;
                }
                return;
            case 16:
                ((b30) obj).w0(!Boolean.parseBoolean((String) map.get(C0239a2.f28155e)));
                return;
            case 17:
                b30 b30Var11 = (b30) obj;
                String str2 = (String) map.get("action");
                if (CampaignEx.JSON_NATIVE_VIDEO_PAUSE.equals(str2)) {
                    b30Var11.zzdk();
                    return;
                } else {
                    if (CampaignEx.JSON_NATIVE_VIDEO_RESUME.equals(str2)) {
                        b30Var11.zzdl();
                        return;
                    }
                    return;
                }
            case 18:
                b30 b30Var12 = (b30) obj;
                if (map.containsKey("start")) {
                    g30 g30VarZzP = b30Var12.zzP();
                    synchronized (g30VarZzP.f14697d) {
                        break;
                    }
                    g30VarZzP.D++;
                    g30VarZzP.z0();
                    return;
                }
                if (map.containsKey("stop")) {
                    g30 g30VarZzP2 = b30Var12.zzP();
                    g30VarZzP2.D--;
                    g30VarZzP2.z0();
                    return;
                } else {
                    if (map.containsKey("cancel")) {
                        g30 g30VarZzP3 = b30Var12.zzP();
                        pj pjVar = g30VarZzP3.f14695b;
                        if (pjVar != null) {
                            pjVar.b(10005);
                        }
                        g30VarZzP3.C = true;
                        g30VarZzP3.f14706n = 10004;
                        g30VarZzP3.f14707o = "Page loaded delay cancel.";
                        g30VarZzP3.z0();
                        g30VarZzP3.f14694a.destroy();
                        return;
                    }
                    return;
                }
            case 19:
                b30 b30Var13 = (b30) obj;
                if (map.containsKey("start")) {
                    b30Var13.A(true);
                }
                if (map.containsKey("stop")) {
                    b30Var13.A(false);
                    return;
                }
                return;
            case 20:
                b30 b30Var14 = (b30) obj;
                iq iqVar2 = nq.f17890a;
                if (!((Boolean) zzba.zzc().a(am.E9)).booleanValue()) {
                    int i17 = zze.zza;
                    zzo.zzi("canOpenAppGmsgHandler disabled.");
                    return;
                }
                String str3 = (String) map.get("package_name");
                if (TextUtils.isEmpty(str3)) {
                    int i18 = zze.zza;
                    zzo.zzi("Package name missing in canOpenApp GMSG.");
                    return;
                }
                HashMap map3 = new HashMap();
                Boolean boolValueOf = Boolean.valueOf(b30Var14.getContext().getPackageManager().getLaunchIntentForPackage(str3) != null);
                map3.put(str3, boolValueOf);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 13 + boolValueOf.toString().length());
                sb2.append("/canOpenApp;");
                sb2.append(str3);
                sb2.append(";");
                sb2.append(boolValueOf);
                zze.zza(sb2.toString());
                b30Var14.e("openableApp", map3);
                return;
            case 21:
                b30 b30Var15 = (b30) obj;
                iq iqVar3 = nq.f17890a;
                PackageManager packageManager = b30Var15.getContext().getPackageManager();
                try {
                    try {
                        JSONArray jSONArray2 = new JSONObject((String) map.get("data")).getJSONArray("intents");
                        JSONObject jSONObject2 = new JSONObject();
                        int i19 = 0;
                        while (i19 < jSONArray2.length()) {
                            try {
                                JSONObject jSONObject3 = jSONArray2.getJSONObject(i19);
                                String strOptString = jSONObject3.optString("id");
                                String strOptString2 = jSONObject3.optString("u");
                                String strOptString3 = jSONObject3.optString("i");
                                String strOptString4 = jSONObject3.optString("m");
                                String strOptString5 = jSONObject3.optString(TtmlNode.TAG_P);
                                c4 = c5;
                                String strOptString6 = jSONObject3.optString("c");
                                String strOptString7 = jSONObject3.optString("intent_url");
                                try {
                                    try {
                                        if (!TextUtils.isEmpty(strOptString7)) {
                                            try {
                                                uri = Intent.parseUri(strOptString7, i10);
                                                i10 = i10;
                                            } catch (URISyntaxException e15) {
                                                String strValueOf2 = String.valueOf(strOptString7);
                                                int i20 = zze.zza;
                                                zzo.zzg("Error parsing the url: ".concat(strValueOf2), e15);
                                                uri = null;
                                            }
                                            if (uri == null) {
                                                uri = new Intent();
                                                if (!TextUtils.isEmpty(strOptString2)) {
                                                    uri.setData(Uri.parse(strOptString2));
                                                }
                                                if (!TextUtils.isEmpty(strOptString3)) {
                                                    uri.setAction(strOptString3);
                                                }
                                                if (!TextUtils.isEmpty(strOptString4)) {
                                                    uri.setType(strOptString4);
                                                }
                                                if (!TextUtils.isEmpty(strOptString5)) {
                                                    uri.setPackage(strOptString5);
                                                }
                                                if (!TextUtils.isEmpty(strOptString6)) {
                                                    strArrSplit = strOptString6.split("/", 2);
                                                    if (strArrSplit.length == 2) {
                                                        uri.setComponent(new ComponentName(strArrSplit[i10], strArrSplit[c4]));
                                                    }
                                                }
                                            }
                                            intent = uri;
                                            resolveInfoResolveActivity = packageManager.resolveActivity(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
                                            if (resolveInfoResolveActivity != null) {
                                                z10 = c4;
                                            } else {
                                                z10 = i10;
                                            }
                                            jSONObject2.put(strOptString, z10);
                                            i19++;
                                            c5 = c4;
                                            i10 = i10;
                                        }
                                        resolveInfoResolveActivity = packageManager.resolveActivity(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
                                    } catch (NullPointerException e16) {
                                        zzt.zzh().d(intent.toString(), e16);
                                        resolveInfoResolveActivity = null;
                                    }
                                    jSONObject2.put(strOptString, z10);
                                } catch (JSONException e17) {
                                    int i21 = zze.zza;
                                    zzo.zzg("Error constructing openable urls response.", e17);
                                }
                                uri = null;
                                if (uri == null) {
                                    uri = new Intent();
                                    if (!TextUtils.isEmpty(strOptString2)) {
                                        uri.setData(Uri.parse(strOptString2));
                                    }
                                    if (!TextUtils.isEmpty(strOptString3)) {
                                        uri.setAction(strOptString3);
                                    }
                                    if (!TextUtils.isEmpty(strOptString4)) {
                                        uri.setType(strOptString4);
                                    }
                                    if (!TextUtils.isEmpty(strOptString5)) {
                                        uri.setPackage(strOptString5);
                                    }
                                    if (!TextUtils.isEmpty(strOptString6)) {
                                        strArrSplit = strOptString6.split("/", 2);
                                        if (strArrSplit.length == 2) {
                                            uri.setComponent(new ComponentName(strArrSplit[i10], strArrSplit[c4]));
                                        }
                                    }
                                }
                                intent = uri;
                                if (resolveInfoResolveActivity != null) {
                                    z10 = c4;
                                } else {
                                    z10 = i10;
                                }
                            } catch (JSONException e18) {
                                c4 = c5;
                                i10 = i10;
                                int i22 = zze.zza;
                                zzo.zzg("Error parsing the intent data.", e18);
                            }
                            i19++;
                            c5 = c4;
                            i10 = i10;
                            break;
                        }
                        b30Var15.f("openableIntents", jSONObject2);
                        return;
                    } catch (JSONException unused) {
                        b30Var15.f("openableIntents", new JSONObject());
                        return;
                    }
                } catch (JSONException unused2) {
                    b30Var15.f("openableIntents", new JSONObject());
                    return;
                }
            case 22:
                b30 b30Var16 = (b30) obj;
                iq iqVar4 = nq.f17890a;
                String str4 = (String) map.get("u");
                if (str4 == null) {
                    int i23 = zze.zza;
                    zzo.zzi("URL missing from httpTrack GMSG.");
                    return;
                } else if (!((Boolean) zzba.zzc().a(am.f12158g)).booleanValue() || !str4.isEmpty()) {
                    new zzbt(b30Var16.getContext(), b30Var16.zzs().afmaVersion, str4, null, b30Var16.zzC() != null ? b30Var16.zzC().f13718x0 : null).zzb();
                    return;
                } else {
                    int i24 = zze.zza;
                    zzo.zzi("URL is empty from httpTrack GMSG.");
                    return;
                }
            case 23:
                b30 b30Var17 = (b30) obj;
                iq iqVar5 = nq.f17890a;
                String str5 = (String) map.get("tx");
                String str6 = (String) map.get("ty");
                String str7 = (String) map.get("td");
                try {
                    int i25 = Integer.parseInt(str5);
                    int i26 = Integer.parseInt(str6);
                    int i27 = Integer.parseInt(str7);
                    qf qfVarM0 = b30Var17.m0();
                    if (qfVarM0 != null) {
                        qfVarM0.f19044b.zze(i25, i26, i27);
                        return;
                    }
                    return;
                } catch (NumberFormatException unused3) {
                    int i28 = zze.zza;
                    zzo.zzi("Could not parse touch parameters from gmsg.");
                    return;
                }
            case 24:
                b30 b30Var18 = (b30) obj;
                iq iqVar6 = nq.f17890a;
                String str8 = (String) map.get("urls");
                if (TextUtils.isEmpty(str8)) {
                    int i29 = zze.zza;
                    zzo.zzi("URLs missing in canOpenURLs GMSG.");
                    return;
                }
                String[] strArrSplit2 = str8.split(",");
                HashMap map4 = new HashMap();
                PackageManager packageManager2 = b30Var18.getContext().getPackageManager();
                for (String str9 : strArrSplit2) {
                    String[] strArrSplit3 = str9.split(";", 2);
                    Boolean boolValueOf2 = Boolean.valueOf(packageManager2.resolveActivity(new Intent(strArrSplit3.length > 1 ? strArrSplit3[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit3[0].trim())), C.DEFAULT_BUFFER_SEGMENT_SIZE) != null);
                    map4.put(str9, boolValueOf2);
                    StringBuilder sb3 = new StringBuilder(str9.length() + 14 + boolValueOf2.toString().length());
                    sb3.append("/canOpenURLs;");
                    sb3.append(str9);
                    sb3.append(";");
                    sb3.append(boolValueOf2);
                    zze.zza(sb3.toString());
                }
                b30Var18.e("openableURLs", map4);
                return;
            case 25:
                b30 b30Var19 = (b30) obj;
                t30 t30VarZzh = b30Var19.zzh();
                if (t30VarZzh == null) {
                    try {
                        t30 t30Var = new t30(b30Var19, Float.parseFloat((String) map.get(IronSourceConstants.EVENTS_DURATION)), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                        b30Var19.N(t30Var);
                        t30VarZzh = t30Var;
                    } catch (NullPointerException | NumberFormatException e19) {
                        int i30 = zze.zza;
                        zzo.zzg("Unable to parse videoMeta message.", e19);
                        zzt.zzh().d("VideoMetaGmsgHandler.onGmsg", e19);
                        return;
                    }
                }
                float f10 = Float.parseFloat((String) map.get(IronSourceConstants.EVENTS_DURATION));
                boolean zEquals = "1".equals(map.get("muted"));
                float f11 = Float.parseFloat((String) map.get("currentTime"));
                int i31 = Integer.parseInt((String) map.get("playbackState"));
                if (i31 >= 0 && i31 <= 3) {
                    i10 = i31;
                }
                String str10 = (String) map.get("aspectRatio");
                float f12 = TextUtils.isEmpty(str10) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : Float.parseFloat(str10);
                if (zzo.zzm(3)) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(f11).length() + 45 + String.valueOf(f10).length() + 13 + String.valueOf(zEquals).length() + 19 + String.valueOf(i10).length() + 17 + String.valueOf(str10).length());
                    sb4.append("Video Meta GMSG: currentTime : ");
                    sb4.append(f11);
                    sb4.append(" , duration : ");
                    sb4.append(f10);
                    sb4.append(" , isMuted : ");
                    sb4.append(zEquals);
                    sb4.append(" , playbackState : ");
                    sb4.append(i10);
                    sb4.append(" , aspectRatio : ");
                    sb4.append(str10);
                    zzo.zzd(sb4.toString());
                }
                t30VarZzh.y1(f11, f10, i10, zEquals, f12);
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                a(obj, map);
                return;
            default:
                int i32 = zze.zza;
                zzo.zzd("Show native ad policy validator overlay.");
                ((b30) obj).zzE().setVisibility(0);
                return;
        }
    }
}
