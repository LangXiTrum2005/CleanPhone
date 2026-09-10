package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzgyj;
import com.p004ironsource.mediationsdk.metadata.a;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzag implements zzgyj {
    final /* synthetic */ zzau zza;

    public zzag(zzau zzauVar) {
        Objects.requireNonNull(zzauVar);
        this.zza = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", a.g);
        zzau zzauVar = this.zza;
        zzaa.zze(zzauVar.zzA(), null, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(zzauVar.zzO().get())));
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to initialize webview for loading SDKCore. ", th);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlb)).booleanValue() || zzauVar.zzN().get()) {
            return;
        }
        if (zzauVar.zzO().getAndIncrement() < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlc)).intValue()) {
            zzauVar.zzx();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Initialized webview successfully for SDKCore.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlb)).booleanValue()) {
            zzau zzauVar = this.zza;
            zzaa.zze(zzauVar.zzA(), null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", a.g), new Pair("sgi_rn", Integer.toString(zzauVar.zzO().get())));
            zzauVar.zzN().set(true);
        }
    }
}
