package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeje {
    private final Context zza;

    public zzeje(Context context) {
        this.zza = context;
    }

    public final ListenableFuture zza(boolean z2) {
        try {
            GetTopicsRequest getTopicsRequest = new GetTopicsRequest(z2);
            TopicsManagerFutures topicsManagerFuturesA = TopicsManagerFutures.a(this.zza);
            return topicsManagerFuturesA != null ? topicsManagerFuturesA.b(getTopicsRequest) : zzgym.zzc(new IllegalStateException());
        } catch (Exception e2) {
            return zzgym.zzc(e2);
        }
    }
}
