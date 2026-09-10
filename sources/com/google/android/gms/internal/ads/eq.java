package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class eq implements oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14047b;

    public /* synthetic */ eq(Object obj, int i10) {
        this.f14046a = i10;
        this.f14047b = obj;
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final void b(Object obj, Map map) {
        Bundle bundleZzl = null;
        bundleZzl = null;
        dyVar = null;
        dy dyVar = null;
        switch (this.f14046a) {
            case 0:
                fq fqVar = (fq) this.f14047b;
                if (fqVar == null) {
                    return;
                }
                String str = (String) map.get("name");
                if (str == null) {
                    int i10 = zze.zza;
                    zzo.zzh("Ad metadata with no name parameter.");
                    str = "";
                }
                String str2 = str;
                if (map.containsKey(Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH)) {
                    try {
                        bundleZzl = zzbp.zzl(new JSONObject((String) map.get(Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH)));
                    } catch (JSONException e10) {
                        int i11 = zze.zza;
                        zzo.zzg("Failed to convert ad metadata to JSON.", e10);
                    }
                }
                if (bundleZzl != null) {
                    fqVar.Q(bundleZzl, str2);
                    return;
                } else {
                    int i12 = zze.zza;
                    zzo.zzf("Failed to convert ad metadata to Bundle.");
                    return;
                }
            case 1:
                String str3 = (String) map.get("name");
                if (str3 != null) {
                    ((gq) this.f14047b).zzb(str3, (String) map.get(Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH));
                    return;
                } else {
                    int i13 = zze.zza;
                    zzo.zzi("App event with no name parameter.");
                    return;
                }
            case 2:
                b30 b30Var = (b30) obj;
                boolean zEquals = "1".equals(map.get("transparentBackground"));
                boolean zEquals2 = "1".equals(map.get("blur"));
                float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                try {
                    if (map.get("blurRadius") != null) {
                        f10 = Float.parseFloat((String) map.get("blurRadius"));
                    }
                    break;
                } catch (NumberFormatException e11) {
                    int i14 = zze.zza;
                    zzo.zzg("Fail to parse float", e11);
                }
                rq rqVar = (rq) this.f14047b;
                synchronized (rqVar) {
                    rqVar.f19636a = zEquals;
                    rqVar.f19639d.set(true);
                }
                synchronized (rqVar) {
                    rqVar.f19637b = zEquals2;
                    rqVar.f19638c = f10;
                }
                b30Var.d0((int) f10, zEquals);
                return;
            case 3:
                if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey("event_type") || TextUtils.isEmpty((CharSequence) map.get("event_type"))) {
                    zze.zza("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
                    return;
                }
                try {
                    long j10 = Long.parseLong((String) map.get("id"));
                    int i15 = Integer.parseInt((String) map.get("event_type"));
                    ((p9.b) zzt.zzk()).getClass();
                    ((ji0) this.f14047b).a(i15, j10, System.currentTimeMillis());
                    return;
                } catch (NumberFormatException e12) {
                    zze.zzb("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e12);
                    return;
                }
            case 4:
                zq zqVar = (zq) this.f14047b;
                String str4 = (String) map.get("action");
                if (!"grant".equals(str4)) {
                    if ("video_start".equals(str4)) {
                        zqVar.zza();
                        return;
                    } else {
                        if ("video_complete".equals(str4)) {
                            zqVar.zzc();
                            return;
                        }
                        return;
                    }
                }
                try {
                    int i16 = Integer.parseInt((String) map.get("amount"));
                    String str5 = (String) map.get("type");
                    if (!TextUtils.isEmpty(str5)) {
                        dyVar = new dy(str5, i16);
                    }
                } catch (NumberFormatException e13) {
                    int i17 = zze.zza;
                    zzo.zzj("Unable to parse reward amount.", e13);
                }
                zqVar.n0(dyVar);
                return;
            case 5:
                if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
                    return;
                }
                zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
                if (map.containsKey("title")) {
                    intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
                }
                try {
                    zzt.zzc();
                    zzs.zzY((Context) this.f14047b, intent);
                    return;
                } catch (RuntimeException e14) {
                    zzo.zzj("Failed to open Share Sheet", e14);
                    zzt.zzh().d("ShareSheetGmsgHandler.onGmsg", e14);
                    return;
                }
            case 6:
                String str6 = (String) map.get("action");
                if (str6 == null) {
                    int i18 = zze.zza;
                    zzo.zzi("Action missing from video GMSG.");
                    return;
                }
                if (str6.equals("src")) {
                    String str7 = (String) map.get("src");
                    if (str7 == null) {
                        int i19 = zze.zza;
                        zzo.zzi("src missing from video GMSG.");
                        return;
                    }
                    sr srVar = (sr) this.f14047b;
                    srVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("mediaUrl", str7);
                    srVar.f20036a.zzc(bundle);
                    return;
                }
                return;
            case 7:
                if (map != null) {
                    String str8 = (String) map.get("height");
                    if (TextUtils.isEmpty(str8)) {
                        return;
                    }
                    try {
                        int i20 = Integer.parseInt(str8);
                        r30 r30Var = (r30) this.f14047b;
                        synchronized (r30Var) {
                            try {
                                if (r30Var.H != i20) {
                                    r30Var.H = i20;
                                    r30Var.requestLayout();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return;
                    } catch (Exception e15) {
                        int i21 = zze.zza;
                        zzo.zzj("Exception occurred while getting webview content height", e15);
                        return;
                    }
                }
                return;
            default:
                ((cf0) this.f14047b).f13151b.d(map);
                return;
        }
    }
}
