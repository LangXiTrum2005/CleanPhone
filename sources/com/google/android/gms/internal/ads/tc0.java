package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.ironsource.Ve;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tc0 implements zb0, yd1, OnUserEarnedRewardListener, qv0, bt, ct, im0, j80, et0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20284b = new tc0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20285c = new tc0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20286d = new tc0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20287e = new tc0(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20288f = new tc0(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20289g = new tc0(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20290h = new tc0(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20291i = new tc0(10);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20292j = new tc0(11);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20293k = new tc0(12);
    public static final /* synthetic */ tc0 l = new tc0(13);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20294m = new tc0(16);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20295n = new tc0(17);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20296o = new tc0(18);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20297p = new tc0(19);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20298q = new tc0(20);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20299r = new tc0(21);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20300s = new tc0(22);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20301t = new tc0(23);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20302u = new tc0(24);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20303v = new tc0(26);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20304w = new tc0(27);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20305x = new tc0(28);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ tc0 f20306y = new tc0(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20307a;

    public /* synthetic */ tc0(int i10) {
        this.f20307a = i10;
    }

    public static final Set j(hi0 hi0Var, Executor executor) {
        return ((Boolean) hn.f15331a.o()).booleanValue() ? Collections.singleton(new nc0(hi0Var, executor)) : Collections.EMPTY_SET;
    }

    public static py0 k(String str) {
        if (IronSourceConstants.EVENTS_NATIVE.equals(str)) {
            return py0.NATIVE;
        }
        return "javascript".equals(str) ? py0.JAVASCRIPT : py0.NONE;
    }

    public static ny0 l(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    return ny0.ONE_PIXEL;
                }
            } else if (str.equals("definedByJavascript")) {
                return ny0.DEFINED_BY_JAVASCRIPT;
            }
        } else if (str.equals("beginToRender")) {
            return ny0.BEGIN_TO_RENDER;
        }
        return ny0.UNSPECIFIED;
    }

    public static ly0 m(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                return ly0.HTML_DISPLAY;
            }
            return null;
        }
        if (iHashCode == 112202875) {
            if (str.equals("video")) {
                return ly0.VIDEO;
            }
            return null;
        }
        if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
            return ly0.NATIVE_DISPLAY;
        }
        return null;
    }

    public static final Object n(hm0 hm0Var) {
        try {
            return hm0Var.mo166zza();
        } catch (RuntimeException e10) {
            zzt.zzh().e("omid exception", e10);
            return null;
        }
    }

    public static final void o(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e10) {
            zzt.zzh().e("omid exception", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.bt
    public /* synthetic */ Object c(JSONObject jSONObject) {
        return new nx(jSONObject);
    }

    public boolean d(Context context) {
        if (((Boolean) zzba.zzc().a(am.q6)).booleanValue()) {
            Boolean bool = (Boolean) n(new az0(context));
            return bool != null && bool.booleanValue();
        }
        int i10 = zze.zza;
        zzo.zzi("Omid flag is disabled");
        return false;
    }

    public String f() {
        if (((Boolean) zzba.zzc().a(am.q6)).booleanValue()) {
            return "a.1.5.2-google_20241009";
        }
        return null;
    }

    public km0 g(int i10, int i11, WebView webView, String str, String str2, String str3) {
        if (((Boolean) zzba.zzc().a(am.q6)).booleanValue() && pi1.L.f17679b) {
            return (km0) n(new dm0(i11, i10, webView, str, str2, str3));
        }
        return null;
    }

    public void h(ky0 ky0Var) {
        if (((Boolean) zzba.zzc().a(am.q6)).booleanValue() && pi1.L.f17679b) {
            o(new cm0(ky0Var, 0));
        }
    }

    public void i(ky0 ky0Var, View view) {
        o(new fm0(ky0Var, view, 1));
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public /* synthetic */ void onUserEarnedReward(RewardItem rewardItem) {
        int i10 = this.f20307a;
    }

    @Override // com.google.android.gms.internal.ads.j80
    public /* synthetic */ zzea zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ct
    public JSONObject zzb(Object obj) throws JSONException {
        fl0 fl0Var = (fl0) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) zzba.zzc().a(am.Oa)).booleanValue()) {
            nx nxVar = fl0Var.f14457c;
            jSONObject2.put("ad_request_url", nxVar.f18010f);
            jSONObject2.put("ad_request_post_body", nxVar.f18007c);
        }
        nx nxVar2 = fl0Var.f14457c;
        jSONObject2.put("base_url", nxVar2.f18006b);
        jSONObject2.put("signals", fl0Var.f14456b);
        jl0 jl0Var = fl0Var.f14455a;
        jSONObject3.put("body", jl0Var.f16112c);
        jSONObject3.put("headers", zzay.zza().zzm(jl0Var.f16111b));
        jSONObject3.put("response_code", jl0Var.f16110a);
        jSONObject3.put("latency", jl0Var.f16113d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put(Ve.f27442n, jSONObject3);
        jSONObject.put("flags", nxVar2.f18012h);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo160zza(Object obj) throws RemoteException {
        switch (this.f20307a) {
            case 0:
                ((zq) obj).zzc();
                break;
            case 1:
                ((zq) obj).zza();
                break;
            case 2:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
                break;
            case 3:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoStart();
                break;
            case 4:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
                break;
            case 5:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoStart();
                break;
            case 6:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 25:
            default:
                ((py) obj).zze();
                break;
            case 17:
                ((zzbh) obj).zzg();
                break;
            case 18:
                ((zzbh) obj).zzb();
                break;
            case 19:
                ((wx0) obj).a();
                break;
            case 20:
                ((za0) obj).zzl();
                break;
            case 21:
                ((zzr) obj).zzdT();
                break;
            case 22:
                ((zzr) obj).zzdv();
                break;
            case 23:
                ((zzr) obj).zzh();
                break;
            case 24:
                ((bj) obj).zzc();
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                ((ly) obj).zzj();
                break;
            case 27:
                ((ly) obj).zzk();
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                ((ly) obj).zze();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.qv0
    public /* synthetic */ Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        zze.zza("Ad request signals:");
        zze.zza(jSONObject.toString(2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        switch (this.f20307a) {
            case 7:
                break;
            default:
                zze.zza("Notification of cache hit failed.");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public /* synthetic */ void mo164zzb(Object obj) {
        switch (this.f20307a) {
            case 7:
                ((b30) obj).destroy();
                break;
            default:
                zze.zza("Notification of cache hit successful.");
                break;
        }
    }

    private final /* synthetic */ void a(RewardItem rewardItem) {
    }

    private final /* synthetic */ void b(RewardItem rewardItem) {
    }

    private final void e(Throwable th2) {
    }
}
