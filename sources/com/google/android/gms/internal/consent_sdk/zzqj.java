package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzqj;
import com.google.android.gms.internal.consent_sdk.zzqm;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzqj<MessageType extends zzqm<MessageType, BuilderType>, BuilderType extends zzqj<MessageType, BuilderType>> extends zzoz<MessageType, BuilderType> {
    protected zzqm zza;
    private final zzqm zzb;

    public zzqj(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzD()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzr();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzoz
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzqj clone() {
        zzqj zzqjVar = (zzqj) this.zzb.zzb(5, null, null);
        zzqjVar.zza = zzk();
        return zzqjVar;
    }

    public final MessageType zzi() {
        MessageType messagetype = (MessageType) zzk();
        if (messagetype.zzo()) {
            return messagetype;
        }
        throw new zzso(messagetype);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrp
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public MessageType zzk() {
        if (!this.zza.zzD()) {
            return (MessageType) this.zza;
        }
        this.zza.zzx();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final /* bridge */ /* synthetic */ zzrq zzl() {
        throw null;
    }

    public final void zzm() {
        if (this.zza.zzD()) {
            return;
        }
        zzn();
    }

    public void zzn() {
        zzqm zzqmVarZzr = this.zzb.zzr();
        zzrx.zza().zzb(zzqmVarZzr.getClass()).zze(zzqmVarZzr, this.zza);
        this.zza = zzqmVarZzr;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final boolean zzo() {
        return zzqm.zzc(this.zza, false);
    }
}
