package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.ul;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class CsiParamDefaults {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PackageInfo f11537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DeviceTierManager f11539f;

    public CsiParamDefaults(@NonNull Context context, @NonNull VersionInfoParcel versionInfoParcel, @Nullable PackageInfo packageInfo, @Nullable String str, @NonNull DeviceTierManager deviceTierManager) {
        this.f11534a = context;
        this.f11535b = context.getPackageName();
        this.f11536c = versionInfoParcel.afmaVersion;
        this.f11537d = packageInfo;
        this.f11538e = str;
        this.f11539f = deviceTierManager;
    }

    public void set(@NonNull Map<String, String> map) {
        PackageInfo packageInfo;
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put(O6.F, Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzc();
        map.put(X3.i.G, zzs.zzt());
        map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.f11535b);
        zzt.zzc();
        Context context = this.f11534a;
        map.put("is_lite_sdk", true != zzs.zzH(context) ? "0" : "1");
        ul ulVar = am.f12058a;
        ArrayList arrayListB = zzba.zzb().b();
        if (((Boolean) zzba.zzc().a(am.V7)).booleanValue()) {
            arrayListB.addAll(zzt.zzh().g().zzi().f12965i);
        }
        map.put("e", TextUtils.join(",", arrayListB));
        map.put("sdkVersion", this.f11536c);
        if (((Boolean) zzba.zzc().a(am.Wc)).booleanValue()) {
            zzt.zzc();
            map.put("is_bstar", true != zzs.zzE(context) ? "0" : "1");
        }
        if (((Boolean) zzba.zzc().a(am.Wa)).booleanValue()) {
            if (((Boolean) zzba.zzc().a(am.f12236l3)).booleanValue()) {
                String str = zzt.zzh().f14135g;
                if (str == null) {
                    str = "";
                }
                map.put(O6.L, str);
            }
        }
        if (((Boolean) zzba.zzc().a(am.ed)).booleanValue()) {
            String str2 = this.f11538e;
            map.put("uev", str2 != null ? str2 : "");
        }
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12129e3)).booleanValue();
        DeviceTierManager deviceTierManager = this.f11539f;
        if (zBooleanValue) {
            map.put("mem_tier", deviceTierManager.getAdvertisedMemoryTier().name());
        }
        if (((Boolean) zzba.zzc().a(am.f12145f3)).booleanValue()) {
            map.put("proc_tier", deviceTierManager.getAvailableProcessorTier().name());
        }
        if (!((Boolean) zzba.zzc().a(am.f12161g3)).booleanValue() || (packageInfo = this.f11537d) == null) {
            return;
        }
        map.put("vc", String.valueOf(packageInfo.versionCode));
        map.put("vn", String.valueOf(packageInfo.versionName));
    }
}
