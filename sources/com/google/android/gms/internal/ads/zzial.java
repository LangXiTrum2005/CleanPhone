package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzial;
import com.google.android.gms.internal.ads.zziar;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class zzial<MessageType extends zziar<MessageType, BuilderType>, BuilderType extends zzial<MessageType, BuilderType>> extends zzhyt<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    public zzial(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbg();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzicm.zza().zzb(messagetype.getClass()).zzd(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.zzhyt
    /* JADX INFO: renamed from: zzaE */
    public /* bridge */ /* synthetic */ zzhyt zzbd(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
        zzbr(zzhzqVar, zziabVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhyt
    /* JADX INFO: renamed from: zzaI */
    public /* bridge */ /* synthetic */ zzhyt zzaZ(byte[] bArr, int i2, int i3) throws zzibg {
        zzbq(bArr, i2, i3);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhyt
    /* JADX INFO: renamed from: zzaK */
    public /* bridge */ /* synthetic */ zzhyt zzaX(byte[] bArr, int i2, int i3, zziab zziabVar) throws zzibg {
        zzbp(bArr, i2, i3, zziabVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhyt
    public /* bridge */ /* synthetic */ zzhyt zzaQ(zzhyu zzhyuVar) {
        zzbn((zziar) zzhyuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhyt
    public /* bridge */ /* synthetic */ zzicb zzaX(byte[] bArr, int i2, int i3, zziab zziabVar) throws zzibg {
        zzbp(bArr, i2, i3, zziabVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhyt
    public /* bridge */ /* synthetic */ zzicb zzaZ(byte[] bArr, int i2, int i3) throws zzibg {
        zzbq(bArr, i2, i3);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhyt
    public /* bridge */ /* synthetic */ zzicb zzbd(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
        zzbr(zzhzqVar, zziabVar);
        return this;
    }

    public final void zzbg() {
        if (this.zza.zzaX()) {
            return;
        }
        zzbh();
    }

    public void zzbh() {
        MessageType messagetype = (MessageType) zza();
        zzb(messagetype, this.zza);
        this.zza = messagetype;
    }

    @Override // com.google.android.gms.internal.ads.zzicd
    public final boolean zzbi() {
        return zziar.zzg(this.zza, false);
    }

    public final BuilderType zzbj() {
        if (this.zzb.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhyt
    /* JADX INFO: renamed from: zzbk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzbf() {
        BuilderType buildertype = (BuilderType) zzbw().zzcY();
        buildertype.zza = (MessageType) zzbt();
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzicb
    /* JADX INFO: renamed from: zzbl, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        if (!this.zza.zzaX()) {
            return this.zza;
        }
        this.zza.zzbm();
        return this.zza;
    }

    /* JADX INFO: renamed from: zzbm, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbu() {
        MessageType messagetype = (MessageType) zzbt();
        if (messagetype.zzbi()) {
            return messagetype;
        }
        throw zzhyt.zzaR(messagetype);
    }

    public BuilderType zzbn(MessageType messagetype) {
        zzbo(messagetype);
        return this;
    }

    public BuilderType zzbo(MessageType messagetype) {
        if (zzbw().equals(messagetype)) {
            return this;
        }
        zzbg();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbp(byte[] bArr, int i2, int i3, zziab zziabVar) throws zzibg {
        zzbg();
        try {
            zzicm.zza().zzb(this.zza.getClass()).zzj(this.zza, bArr, i2, i2 + i3, new zzhyz(zziabVar));
            return this;
        } catch (zzibg e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public BuilderType zzbq(byte[] bArr, int i2, int i3) throws zzibg {
        int i4 = zziab.zzb;
        int i5 = zzhyy.zza;
        zzbp(bArr, i2, i3, zziab.zza);
        return this;
    }

    public BuilderType zzbr(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
        zzbg();
        try {
            zzicm.zza().zzb(this.zza.getClass()).zzg(this.zza, zzhzr.zza(zzhzqVar), zziabVar);
            return this;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof IOException) {
                throw ((IOException) e2.getCause());
            }
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicd
    /* JADX INFO: renamed from: zzbs, reason: merged with bridge method [inline-methods] */
    public MessageType zzbw() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzicb zzbv() {
        zzbj();
        return this;
    }
}
