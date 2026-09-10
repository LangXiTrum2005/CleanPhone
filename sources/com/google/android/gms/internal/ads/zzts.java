package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzts extends Handler {
    final /* synthetic */ zztu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzts(zztu zztuVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(zztuVar);
        this.zza = zztuVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zza.zzh(message);
    }
}
