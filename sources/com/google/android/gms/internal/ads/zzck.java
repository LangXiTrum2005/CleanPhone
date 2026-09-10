package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzck {
    private final zzgtd zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzck(zzgtd zzgtdVar) {
        this.zza = zzgtdVar;
        zzcl zzclVar = zzcl.zza;
        this.zzd = false;
    }

    private final void zzi(ByteBuffer byteBuffer) {
        boolean z2;
        do {
            z2 = false;
            for (int i2 = 0; i2 <= zzj(); i2++) {
                if (!this.zzc[i2].hasRemaining()) {
                    List list = this.zzb;
                    zzco zzcoVar = (zzco) list.get(i2);
                    if (!zzcoVar.zzg()) {
                        ByteBuffer byteBuffer2 = i2 > 0 ? this.zzc[i2 - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzco.zza;
                        long jRemaining = byteBuffer2.remaining();
                        zzcoVar.zzd(byteBuffer2);
                        this.zzc[i2] = zzcoVar.zzf();
                        boolean z3 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.zzc[i2].hasRemaining()) {
                            z3 = false;
                        }
                        z2 |= z3;
                    } else if (!this.zzc[i2].hasRemaining() && i2 < zzj()) {
                        ((zzco) list.get(i2 + 1)).zze();
                    }
                }
            }
        } while (z2);
    }

    private final int zzj() {
        return this.zzc.length - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzgtd zzgtdVar = this.zza;
        int size = zzgtdVar.size();
        zzgtd zzgtdVar2 = ((zzck) obj).zza;
        if (size != zzgtdVar2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < zzgtdVar.size(); i2++) {
            if (zzgtdVar.get(i2) != zzgtdVar2.get(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcl zza(zzcl zzclVar) throws zzcn {
        zzcl zzclVar2 = zzcl.zza;
        if (zzclVar.equals(zzclVar2)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i2 = 0;
        while (true) {
            zzgtd zzgtdVar = this.zza;
            if (i2 >= zzgtdVar.size()) {
                return zzclVar;
            }
            zzco zzcoVar = (zzco) zzgtdVar.get(i2);
            zzcl zzclVarZzb = zzcoVar.zzb(zzclVar);
            if (zzcoVar.zzc()) {
                zzgqa.zzi(!zzclVarZzb.equals(zzclVar2));
                zzclVar = zzclVarZzb;
            }
            i2++;
        }
    }

    public final void zzb(zzcm zzcmVar) {
        List list = this.zzb;
        list.clear();
        this.zzd = false;
        long jZza = zzcmVar.zzb;
        int i2 = 0;
        while (true) {
            zzgtd zzgtdVar = this.zza;
            if (i2 >= zzgtdVar.size()) {
                break;
            }
            zzco zzcoVar = (zzco) zzgtdVar.get(i2);
            zzcoVar.zzi(new zzcm(jZza));
            if (zzcoVar.zzc()) {
                jZza = zzcoVar.zza(jZza);
                zzgqa.zzi(jZza >= 0);
                list.add(zzcoVar);
            }
            i2++;
        }
        this.zzc = new ByteBuffer[list.size()];
        for (int i3 = 0; i3 <= zzj(); i3++) {
            this.zzc[i3] = ((zzco) list.get(i3)).zzf();
        }
    }

    public final boolean zzc() {
        return !this.zzb.isEmpty();
    }

    public final void zzd(ByteBuffer byteBuffer) {
        if (!zzc() || this.zzd) {
            return;
        }
        zzi(byteBuffer);
    }

    public final ByteBuffer zze() {
        if (!zzc()) {
            return zzco.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzj()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzi(zzco.zza);
        return this.zzc[zzj()];
    }

    public final void zzf() {
        if (!zzc() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzco) this.zzb.get(0)).zze();
    }

    public final boolean zzg() {
        return this.zzd && ((zzco) this.zzb.get(zzj())).zzg() && !this.zzc[zzj()].hasRemaining();
    }

    public final void zzh() {
        int i2 = 0;
        while (true) {
            zzgtd zzgtdVar = this.zza;
            if (i2 >= zzgtdVar.size()) {
                this.zzc = new ByteBuffer[0];
                zzcl zzclVar = zzcl.zza;
                this.zzd = false;
                return;
            } else {
                zzco zzcoVar = (zzco) zzgtdVar.get(i2);
                zzcoVar.zzi(zzcm.zza);
                zzcoVar.zzj();
                i2++;
            }
        }
    }
}
