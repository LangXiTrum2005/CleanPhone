package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.yd1;
import com.ironsource.mediationsdk.metadata.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzab implements yd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzap f11372a;

    public zzab(zzap zzapVar) {
        this.f11372a = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.zzt.zzh().d("SignalGeneratorImpl.initializeWebViewForSignalCollection", th2);
        Pair pair = new Pair("sgf_reason", th2.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", a.f29610g);
        zzap zzapVar = this.f11372a;
        zzv.zze(zzapVar.f11406k, null, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(zzapVar.C.get())));
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to initialize webview for loading SDKCore. ", th2);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12304pb)).booleanValue() || zzapVar.B.get()) {
            return;
        }
        if (zzapVar.C.getAndIncrement() < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12319qb)).intValue()) {
            zzapVar.A1();
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public final /* synthetic */ void mo164zzb(@Nullable Object obj) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Initialized webview successfully for SDKCore.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12304pb)).booleanValue()) {
            Pair pair = new Pair("se", "query_g");
            Pair pair2 = new Pair("ad_format", AdFormat.BANNER.name());
            Pair pair3 = new Pair("rtype", Integer.toString(6));
            Pair pair4 = new Pair("scar", a.f29610g);
            zzap zzapVar = this.f11372a;
            zzv.zze(zzapVar.f11406k, null, "sgs", pair, pair2, pair3, pair4, new Pair("sgi_rn", Integer.toString(zzapVar.C.get())));
            zzapVar.B.set(true);
        }
    }
}
