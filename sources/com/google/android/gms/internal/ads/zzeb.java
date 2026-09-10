package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzeb implements zzdg {

    @Nullable
    private Message zza;

    private zzeb() {
        throw null;
    }

    public /* synthetic */ zzeb(zzec zzecVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zza = null;
        zzed.zzl(this);
    }

    public final zzeb zzb(Message message, zzed zzedVar) {
        this.zza = message;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        zzed.zzl(this);
        return zSendMessageAtFrontOfQueue;
    }
}
