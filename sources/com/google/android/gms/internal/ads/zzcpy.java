package com.google.android.gms.internal.ads;

import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzcpy implements zzgxu {
    static final /* synthetic */ zzcpy zza = new zzcpy();

    private /* synthetic */ zzcpy() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        Throwable th = (Throwable) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlN)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(th, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "GetTopicsApiWithRecordObservationActionHandler");
        }
        return zzgym.zza(new GetTopicsResponse(zzgtd.zzi()));
    }
}
