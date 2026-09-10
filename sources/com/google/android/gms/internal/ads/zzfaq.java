package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzfaq implements zzgxu {
    static final /* synthetic */ zzfaq zza = new zzfaq();

    private /* synthetic */ zzfaq() {
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.zzgxu
    public final ListenableFuture zza(Object obj) {
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        if (getTopicsResponse == null) {
            return zzgym.zza(new zzfas("", 1, null));
        }
        zziek zziekVarZzc = zziel.zzc();
        for (Topic topic : getTopicsResponse.f7959a) {
            zziei zzieiVarZzc = zziej.zzc();
            zzieiVarZzc.zza(topic.f7963c);
            zzieiVarZzc.zzb(topic.f7962b);
            zzieiVarZzc.zzc(topic.f7961a);
            zziekVarZzc.zza((zziej) zzieiVarZzc.zzbu());
        }
        return zzgym.zza(new zzfas(Base64.encodeToString(((zziel) zziekVarZzc.zzbu()).zzaN(), 1), 1, null));
    }
}
