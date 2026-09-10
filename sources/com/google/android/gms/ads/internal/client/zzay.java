package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.ew;
import com.google.android.gms.internal.ads.ty;
import com.google.android.gms.internal.ads.yp;
import com.google.android.gms.internal.ads.zp;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzay {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zzay f10775g = new zzay();
    public static final /* synthetic */ int zza = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.ads.internal.util.client.zzf f10776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzaw f10777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VersionInfoParcel f10779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Random f10780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10781f;

    public zzay() {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = new com.google.android.gms.ads.internal.util.client.zzf();
        zzaw zzawVar = new zzaw(new zzk(), new zzi(), new zzfc(), new yp("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl"), new ty(), new ew("com.google.android.gms.ads.AdOverlayCreatorImpl"), new zp("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl"), new zzl());
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0, 261710000, true);
        Random random = new Random();
        String strZzj = com.google.android.gms.ads.internal.util.client.zzf.zzj();
        this.f10776a = zzfVar;
        this.f10777b = zzawVar;
        this.f10778c = false;
        this.f10779d = versionInfoParcel;
        this.f10780e = random;
        this.f10781f = strZzj;
    }

    public static com.google.android.gms.ads.internal.util.client.zzf zza() {
        return f10775g.f10776a;
    }

    public static zzaw zzb() {
        return f10775g.f10777b;
    }

    public static void zzc() {
        f10775g.f10778c = false;
    }

    public static void zzd() {
        f10775g.f10778c = true;
    }

    public static boolean zze() {
        return f10775g.f10778c;
    }

    public static String zzf() {
        return f10775g.f10781f;
    }

    public static VersionInfoParcel zzg() {
        return f10775g.f10779d;
    }

    public static Random zzh() {
        return f10775g.f10780e;
    }
}
