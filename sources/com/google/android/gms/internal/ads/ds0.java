package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.ads.internal.client.zzba;
import com.ironsource.X3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ds0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f13654i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f13655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f13656k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f13657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f13658n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f13659o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f13660p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f13661q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f13662r;

    public ds0(boolean z10, boolean z11, String str, boolean z12, boolean z13, boolean z14, String str2, ArrayList arrayList, String str3, String str4, boolean z15, long j10, boolean z16, String str5, int i10, String str6, String str7, String str8) {
        String str9 = Build.FINGERPRINT;
        String str10 = Build.MODEL;
        this.f13646a = z10;
        this.f13647b = z11;
        this.f13648c = str;
        this.f13649d = z12;
        this.f13650e = z13;
        this.f13651f = z14;
        this.f13652g = str2;
        this.f13653h = str6;
        this.f13655j = arrayList;
        this.f13656k = str3;
        this.l = str4;
        this.f13657m = z15;
        this.f13658n = j10;
        this.f13659o = z16;
        this.f13660p = str5;
        this.f13661q = i10;
        this.f13662r = str8;
        this.f13654i = str7;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0070  */
    @Override // com.google.android.gms.internal.ads.as0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f13646a);
        bundle.putBoolean("coh", this.f13647b);
        bundle.putString("gl", this.f13648c);
        bundle.putBoolean("simulator", this.f13649d);
        bundle.putBoolean("is_latchsky", this.f13650e);
        bundle.putInt("build_api_level", this.f13661q);
        if (!((Boolean) zzba.zzc().a(am.Hc)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f13651f);
        }
        bundle.putString("hl", this.f13652g);
        if (((Boolean) zzba.zzc().a(am.ff)).booleanValue()) {
            bundle.putString("dlc", this.f13653h);
        } else if (((Boolean) zzba.zzc().a(am.gf)).booleanValue()) {
            bundle.putString("dlc", this.f13653h);
        }
        ArrayList<String> arrayList = this.f13655j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        String str2 = this.f13654i;
        if (str2 != null) {
            bundle.putString("dgl", str2);
        }
        bundle.putString("mv", this.f13656k);
        bundle.putString("submodel", Build.MODEL);
        Bundle bundleB = rb0.b(bundle, X3.i.G);
        bundle.putBundle(X3.i.G, bundleB);
        bundleB.putString(InAppPurchaseConstants.METHOD_BUILD, Build.FINGERPRINT);
        bundleB.putLong("remaining_data_partition_space", this.f13658n);
        Bundle bundleB2 = rb0.b(bundleB, "browser");
        bundleB.putBundle("browser", bundleB2);
        bundleB2.putBoolean("is_browser_custom_tabs_capable", this.f13657m);
        String str3 = this.l;
        if (!TextUtils.isEmpty(str3)) {
            Bundle bundleB3 = rb0.b(bundleB, "play_store");
            bundleB.putBundle("play_store", bundleB3);
            bundleB3.putString("package_version", str3);
        }
        if (((Boolean) zzba.zzc().a(am.Xc)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f13659o);
        }
        String str4 = this.f13660p;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("v_unity", str4);
        }
        if (((Boolean) zzba.zzc().a(am.Rc)).booleanValue()) {
            rb0.A(bundle, "gotmt_l", true, ((Boolean) zzba.zzc().a(am.Oc)).booleanValue());
            rb0.A(bundle, "gotmt_i", true, ((Boolean) zzba.zzc().a(am.Nc)).booleanValue());
        }
        if (!((Boolean) zzba.zzc().a(am.Wf)).booleanValue() || (str = this.f13662r) == null) {
            return;
        }
        bundle.putString("sdk_i_s", str);
    }
}
