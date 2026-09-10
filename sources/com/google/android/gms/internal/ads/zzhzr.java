package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzhzr implements zzicp {
    private final zzhzq zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzhzr(zzhzq zzhzqVar) {
        zzibe.zza(zzhzqVar, "input");
        this.zza = zzhzqVar;
        zzhzqVar.zze = this;
    }

    private final void zzQ(int i2) throws IOException {
        if ((this.zzb & 7) != i2) {
            throw new zzibf("Protocol message tag had invalid wire type.");
        }
    }

    private final void zzR(Object obj, zzicu zzicuVar, zziab zziabVar) throws IOException {
        zzhzq zzhzqVar = this.zza;
        int iZzo = zzhzqVar.zzo();
        zzhzqVar.zzH();
        int iZzz = zzhzqVar.zzz(iZzo);
        zzhzqVar.zzb++;
        zzicuVar.zzg(obj, this, zziabVar);
        zzhzqVar.zzb(0);
        zzhzqVar.zzb--;
        zzhzqVar.zzA(iZzz);
    }

    private final Object zzS(zzicu zzicuVar, zziab zziabVar) throws IOException {
        Object objZza = zzicuVar.zza();
        zzR(objZza, zzicuVar, zziabVar);
        zzicuVar.zzk(objZza);
        return objZza;
    }

    private final void zzT(Object obj, zzicu zzicuVar, zziab zziabVar) throws IOException {
        int i2 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzicuVar.zzg(obj, this, zziabVar);
            if (this.zzb != this.zzc) {
                throw new zzibg("Failed to parse the message.");
            }
            this.zzc = i2;
        } catch (Throwable th) {
            this.zzc = i2;
            throw th;
        }
    }

    private final Object zzU(zzids zzidsVar, Class cls, zziab zziabVar) throws IOException {
        zzids zzidsVar2 = zzids.zza;
        switch (zzidsVar.ordinal()) {
            case 0:
                return Double.valueOf(zze());
            case 1:
                return Float.valueOf(zzf());
            case 2:
                return Long.valueOf(zzh());
            case 3:
                return Long.valueOf(zzg());
            case 4:
                return Integer.valueOf(zzi());
            case 5:
                return Long.valueOf(zzj());
            case 6:
                return Integer.valueOf(zzk());
            case 7:
                return Boolean.valueOf(zzl());
            case 8:
                return zzn();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                zzQ(2);
                return zzS(zzicm.zza().zzb(cls), zziabVar);
            case 11:
                return zzq();
            case 12:
                return Integer.valueOf(zzr());
            case 13:
                return Integer.valueOf(zzs());
            case 14:
                return Integer.valueOf(zzt());
            case 15:
                return Long.valueOf(zzu());
            case 16:
                return Integer.valueOf(zzv());
            case 17:
                return Long.valueOf(zzw());
        }
    }

    private final void zzV(int i2) throws IOException {
        if (this.zza.zzC() != i2) {
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void zzW(int i2) throws IOException {
        if ((i2 & 3) != 0) {
            throw new zzibg("Failed to parse the message.");
        }
    }

    private static final void zzX(int i2) throws IOException {
        if ((i2 & 7) != 0) {
            throw new zzibg("Failed to parse the message.");
        }
    }

    public static zzhzr zza(zzhzq zzhzqVar) {
        Object obj = zzhzqVar.zze;
        return obj != null ? (zzhzr) obj : new zzhzr(zzhzqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzA(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzibq) {
            zzibq zzibqVar = (zzibq) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar = this.zza;
                int iZzC = zzhzqVar.zzC() + zzhzqVar.zzo();
                do {
                    zzibqVar.zzd(zzhzqVar.zzg());
                } while (zzhzqVar.zzC() < iZzC);
                zzV(iZzC);
                return;
            }
            do {
                zzhzq zzhzqVar2 = this.zza;
                zzibqVar.zzd(zzhzqVar2.zzg());
                if (zzhzqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzhzqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar3 = this.zza;
                int iZzC2 = zzhzqVar3.zzC() + zzhzqVar3.zzo();
                do {
                    list.add(Long.valueOf(zzhzqVar3.zzg()));
                } while (zzhzqVar3.zzC() < iZzC2);
                zzV(iZzC2);
                return;
            }
            do {
                zzhzq zzhzqVar4 = this.zza;
                list.add(Long.valueOf(zzhzqVar4.zzg()));
                if (zzhzqVar4.zzB()) {
                    return;
                } else {
                    iZza = zzhzqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzB(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzias) {
            zzias zziasVar = (zzias) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar = this.zza;
                int iZzC = zzhzqVar.zzC() + zzhzqVar.zzo();
                do {
                    zziasVar.zzi(zzhzqVar.zzh());
                } while (zzhzqVar.zzC() < iZzC);
                zzV(iZzC);
                return;
            }
            do {
                zzhzq zzhzqVar2 = this.zza;
                zziasVar.zzi(zzhzqVar2.zzh());
                if (zzhzqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzhzqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar3 = this.zza;
                int iZzC2 = zzhzqVar3.zzC() + zzhzqVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzhzqVar3.zzh()));
                } while (zzhzqVar3.zzC() < iZzC2);
                zzV(iZzC2);
                return;
            }
            do {
                zzhzq zzhzqVar4 = this.zza;
                list.add(Integer.valueOf(zzhzqVar4.zzh()));
                if (zzhzqVar4.zzB()) {
                    return;
                } else {
                    iZza = zzhzqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzC(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzibq) {
            zzibq zzibqVar = (zzibq) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar = this.zza;
                int iZzo = zzhzqVar.zzo();
                zzX(iZzo);
                int iZzC = zzhzqVar.zzC() + iZzo;
                do {
                    zzibqVar.zzd(zzhzqVar.zzi());
                } while (zzhzqVar.zzC() < iZzC);
                return;
            }
            do {
                zzhzq zzhzqVar2 = this.zza;
                zzibqVar.zzd(zzhzqVar2.zzi());
                if (zzhzqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzhzqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar3 = this.zza;
                int iZzo2 = zzhzqVar3.zzo();
                zzX(iZzo2);
                int iZzC2 = zzhzqVar3.zzC() + iZzo2;
                do {
                    list.add(Long.valueOf(zzhzqVar3.zzi()));
                } while (zzhzqVar3.zzC() < iZzC2);
                return;
            }
            do {
                zzhzq zzhzqVar4 = this.zza;
                list.add(Long.valueOf(zzhzqVar4.zzi()));
                if (zzhzqVar4.zzB()) {
                    return;
                } else {
                    iZza = zzhzqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzD(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzias) {
            zzias zziasVar = (zzias) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                zzhzq zzhzqVar = this.zza;
                int iZzo = zzhzqVar.zzo();
                zzW(iZzo);
                int iZzC = zzhzqVar.zzC() + iZzo;
                do {
                    zziasVar.zzi(zzhzqVar.zzj());
                } while (zzhzqVar.zzC() < iZzC);
                return;
            }
            if (i2 != 5) {
                throw new zzibf("Protocol message tag had invalid wire type.");
            }
            do {
                zzhzq zzhzqVar2 = this.zza;
                zziasVar.zzi(zzhzqVar2.zzj());
                if (zzhzqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzhzqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                zzhzq zzhzqVar3 = this.zza;
                int iZzo2 = zzhzqVar3.zzo();
                zzW(iZzo2);
                int iZzC2 = zzhzqVar3.zzC() + iZzo2;
                do {
                    list.add(Integer.valueOf(zzhzqVar3.zzj()));
                } while (zzhzqVar3.zzC() < iZzC2);
                return;
            }
            if (i3 != 5) {
                throw new zzibf("Protocol message tag had invalid wire type.");
            }
            do {
                zzhzq zzhzqVar4 = this.zza;
                list.add(Integer.valueOf(zzhzqVar4.zzj()));
                if (zzhzqVar4.zzB()) {
                    return;
                } else {
                    iZza = zzhzqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzE(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzhzb) {
            zzhzb zzhzbVar = (zzhzb) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar = this.zza;
                int iZzC = zzhzqVar.zzC() + zzhzqVar.zzo();
                do {
                    zzhzbVar.zzg(zzhzqVar.zzk());
                } while (zzhzqVar.zzC() < iZzC);
                zzV(iZzC);
                return;
            }
            do {
                zzhzq zzhzqVar2 = this.zza;
                zzhzbVar.zzg(zzhzqVar2.zzk());
                if (zzhzqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzhzqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar3 = this.zza;
                int iZzC2 = zzhzqVar3.zzC() + zzhzqVar3.zzo();
                do {
                    list.add(Boolean.valueOf(zzhzqVar3.zzk()));
                } while (zzhzqVar3.zzC() < iZzC2);
                zzV(iZzC2);
                return;
            }
            do {
                zzhzq zzhzqVar4 = this.zza;
                list.add(Boolean.valueOf(zzhzqVar4.zzk()));
                if (zzhzqVar4.zzB()) {
                    return;
                } else {
                    iZza = zzhzqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    public final void zzF(List list, boolean z2) throws IOException {
        int iZza;
        int iZza2;
        if ((this.zzb & 7) != 2) {
            throw new zzibf("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzibn) && !z2) {
            zzibn zzibnVar = (zzibn) list;
            do {
                zzq();
                zzibnVar.zzb();
                zzhzq zzhzqVar = this.zza;
                if (zzhzqVar.zzB()) {
                    return;
                } else {
                    iZza2 = zzhzqVar.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            do {
                list.add(z2 ? zzn() : zzm());
                zzhzq zzhzqVar2 = this.zza;
                if (zzhzqVar2.zzB()) {
                    return;
                } else {
                    iZza = zzhzqVar2.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzG(List list, zzicu zzicuVar, zziab zziabVar) throws IOException {
        int iZza;
        int i2 = this.zzb;
        if ((i2 & 7) != 2) {
            throw new zzibf("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzS(zzicuVar, zziabVar));
            zzhzq zzhzqVar = this.zza;
            if (zzhzqVar.zzB() || this.zzd != 0) {
                return;
            } else {
                iZza = zzhzqVar.zza();
            }
        } while (iZza == i2);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    @Deprecated
    public final void zzH(List list, zzicu zzicuVar, zziab zziabVar) throws IOException {
        int iZza;
        int i2 = this.zzb;
        if ((i2 & 7) != 3) {
            throw new zzibf("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZza = zzicuVar.zza();
            zzT(objZza, zzicuVar, zziabVar);
            zzicuVar.zzk(objZza);
            list.add(objZza);
            zzhzq zzhzqVar = this.zza;
            if (zzhzqVar.zzB() || this.zzd != 0) {
                return;
            } else {
                iZza = zzhzqVar.zza();
            }
        } while (iZza == i2);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzI(List list) throws IOException {
        int iZza;
        if ((this.zzb & 7) != 2) {
            throw new zzibf("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzq());
            zzhzq zzhzqVar = this.zza;
            if (zzhzqVar.zzB()) {
                return;
            } else {
                iZza = zzhzqVar.zza();
            }
        } while (iZza == this.zzb);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzJ(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzias) {
            zzias zziasVar = (zzias) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar = this.zza;
                int iZzC = zzhzqVar.zzC() + zzhzqVar.zzo();
                do {
                    zziasVar.zzi(zzhzqVar.zzo());
                } while (zzhzqVar.zzC() < iZzC);
                zzV(iZzC);
                return;
            }
            do {
                zzhzq zzhzqVar2 = this.zza;
                zziasVar.zzi(zzhzqVar2.zzo());
                if (zzhzqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzhzqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar3 = this.zza;
                int iZzC2 = zzhzqVar3.zzC() + zzhzqVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzhzqVar3.zzo()));
                } while (zzhzqVar3.zzC() < iZzC2);
                zzV(iZzC2);
                return;
            }
            do {
                zzhzq zzhzqVar4 = this.zza;
                list.add(Integer.valueOf(zzhzqVar4.zzo()));
                if (zzhzqVar4.zzB()) {
                    return;
                } else {
                    iZza = zzhzqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzK(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzias) {
            zzias zziasVar = (zzias) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar = this.zza;
                int iZzC = zzhzqVar.zzC() + zzhzqVar.zzo();
                do {
                    zziasVar.zzi(zzhzqVar.zzp());
                } while (zzhzqVar.zzC() < iZzC);
                zzV(iZzC);
                return;
            }
            do {
                zzhzq zzhzqVar2 = this.zza;
                zziasVar.zzi(zzhzqVar2.zzp());
                if (zzhzqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzhzqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar3 = this.zza;
                int iZzC2 = zzhzqVar3.zzC() + zzhzqVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzhzqVar3.zzp()));
                } while (zzhzqVar3.zzC() < iZzC2);
                zzV(iZzC2);
                return;
            }
            do {
                zzhzq zzhzqVar4 = this.zza;
                list.add(Integer.valueOf(zzhzqVar4.zzp()));
                if (zzhzqVar4.zzB()) {
                    return;
                } else {
                    iZza = zzhzqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzL(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzias) {
            zzias zziasVar = (zzias) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                zzhzq zzhzqVar = this.zza;
                int iZzo = zzhzqVar.zzo();
                zzW(iZzo);
                int iZzC = zzhzqVar.zzC() + iZzo;
                do {
                    zziasVar.zzi(zzhzqVar.zzq());
                } while (zzhzqVar.zzC() < iZzC);
                return;
            }
            if (i2 != 5) {
                throw new zzibf("Protocol message tag had invalid wire type.");
            }
            do {
                zzhzq zzhzqVar2 = this.zza;
                zziasVar.zzi(zzhzqVar2.zzq());
                if (zzhzqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzhzqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                zzhzq zzhzqVar3 = this.zza;
                int iZzo2 = zzhzqVar3.zzo();
                zzW(iZzo2);
                int iZzC2 = zzhzqVar3.zzC() + iZzo2;
                do {
                    list.add(Integer.valueOf(zzhzqVar3.zzq()));
                } while (zzhzqVar3.zzC() < iZzC2);
                return;
            }
            if (i3 != 5) {
                throw new zzibf("Protocol message tag had invalid wire type.");
            }
            do {
                zzhzq zzhzqVar4 = this.zza;
                list.add(Integer.valueOf(zzhzqVar4.zzq()));
                if (zzhzqVar4.zzB()) {
                    return;
                } else {
                    iZza = zzhzqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzM(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzibq) {
            zzibq zzibqVar = (zzibq) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar = this.zza;
                int iZzo = zzhzqVar.zzo();
                zzX(iZzo);
                int iZzC = zzhzqVar.zzC() + iZzo;
                do {
                    zzibqVar.zzd(zzhzqVar.zzr());
                } while (zzhzqVar.zzC() < iZzC);
                return;
            }
            do {
                zzhzq zzhzqVar2 = this.zza;
                zzibqVar.zzd(zzhzqVar2.zzr());
                if (zzhzqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzhzqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar3 = this.zza;
                int iZzo2 = zzhzqVar3.zzo();
                zzX(iZzo2);
                int iZzC2 = zzhzqVar3.zzC() + iZzo2;
                do {
                    list.add(Long.valueOf(zzhzqVar3.zzr()));
                } while (zzhzqVar3.zzC() < iZzC2);
                return;
            }
            do {
                zzhzq zzhzqVar4 = this.zza;
                list.add(Long.valueOf(zzhzqVar4.zzr()));
                if (zzhzqVar4.zzB()) {
                    return;
                } else {
                    iZza = zzhzqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzN(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzias) {
            zzias zziasVar = (zzias) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar = this.zza;
                int iZzC = zzhzqVar.zzC() + zzhzqVar.zzo();
                do {
                    zziasVar.zzi(zzhzqVar.zzs());
                } while (zzhzqVar.zzC() < iZzC);
                zzV(iZzC);
                return;
            }
            do {
                zzhzq zzhzqVar2 = this.zza;
                zziasVar.zzi(zzhzqVar2.zzs());
                if (zzhzqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzhzqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar3 = this.zza;
                int iZzC2 = zzhzqVar3.zzC() + zzhzqVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzhzqVar3.zzs()));
                } while (zzhzqVar3.zzC() < iZzC2);
                zzV(iZzC2);
                return;
            }
            do {
                zzhzq zzhzqVar4 = this.zza;
                list.add(Integer.valueOf(zzhzqVar4.zzs()));
                if (zzhzqVar4.zzB()) {
                    return;
                } else {
                    iZza = zzhzqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzO(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzibq) {
            zzibq zzibqVar = (zzibq) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar = this.zza;
                int iZzC = zzhzqVar.zzC() + zzhzqVar.zzo();
                do {
                    zzibqVar.zzd(zzhzqVar.zzt());
                } while (zzhzqVar.zzC() < iZzC);
                zzV(iZzC);
                return;
            }
            do {
                zzhzq zzhzqVar2 = this.zza;
                zzibqVar.zzd(zzhzqVar2.zzt());
                if (zzhzqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzhzqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar3 = this.zza;
                int iZzC2 = zzhzqVar3.zzC() + zzhzqVar3.zzo();
                do {
                    list.add(Long.valueOf(zzhzqVar3.zzt()));
                } while (zzhzqVar3.zzC() < iZzC2);
                zzV(iZzC2);
                return;
            }
            do {
                zzhzq zzhzqVar4 = this.zza;
                list.add(Long.valueOf(zzhzqVar4.zzt()));
                if (zzhzqVar4.zzB()) {
                    return;
                } else {
                    iZza = zzhzqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzP(Map map, zzibu zzibuVar, zziab zziabVar) throws IOException {
        zzQ(2);
        zzhzq zzhzqVar = this.zza;
        int iZzz = zzhzqVar.zzz(zzhzqVar.zzo());
        Object obj = zzibuVar.zzd;
        Object objZzU = zzibuVar.zzb;
        Object objZzU2 = obj;
        while (true) {
            try {
                int iZzb = zzb();
                if (iZzb == Integer.MAX_VALUE || zzhzqVar.zzB()) {
                    break;
                }
                if (iZzb == 1) {
                    objZzU = zzU(zzibuVar.zza, null, null);
                } else if (iZzb != 2) {
                    try {
                        if (!zzd()) {
                            throw new zzibg("Unable to parse map entry.");
                        }
                    } catch (zzibf e2) {
                        if (!zzd()) {
                            throw new zzibg("Unable to parse map entry.", e2);
                        }
                    }
                } else {
                    objZzU2 = zzU(zzibuVar.zzc, obj.getClass(), zziabVar);
                }
            } catch (Throwable th) {
                this.zza.zzA(iZzz);
                throw th;
            }
        }
        map.put(objZzU, objZzU2);
        this.zza.zzA(iZzz);
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final int zzb() throws IOException {
        int iZza = this.zzd;
        if (iZza != 0) {
            this.zzb = iZza;
            this.zzd = 0;
        } else {
            iZza = this.zza.zza();
            this.zzb = iZza;
        }
        if (iZza == 0 || iZza == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return iZza >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final int zzc() {
        return this.zzb;
    }

    public final boolean zzd() throws IOException {
        int i2;
        zzhzq zzhzqVar = this.zza;
        if (zzhzqVar.zzB() || (i2 = this.zzb) == this.zzc) {
            return false;
        }
        return zzhzqVar.zzc(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final double zze() throws IOException {
        zzQ(1);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final float zzf() throws IOException {
        zzQ(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final long zzg() throws IOException {
        zzQ(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final long zzh() throws IOException {
        zzQ(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final int zzi() throws IOException {
        zzQ(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final long zzj() throws IOException {
        zzQ(1);
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final int zzk() throws IOException {
        zzQ(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final boolean zzl() throws IOException {
        zzQ(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final String zzm() throws IOException {
        zzQ(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final String zzn() throws IOException {
        zzQ(2);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzo(Object obj, zzicu zzicuVar, zziab zziabVar) throws IOException {
        zzQ(2);
        zzR(obj, zzicuVar, zziabVar);
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzp(Object obj, zzicu zzicuVar, zziab zziabVar) throws IOException {
        zzQ(3);
        zzT(obj, zzicuVar, zziabVar);
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final zzhzl zzq() throws IOException {
        zzQ(2);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final int zzr() throws IOException {
        zzQ(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final int zzs() throws IOException {
        zzQ(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final int zzt() throws IOException {
        zzQ(5);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final long zzu() throws IOException {
        zzQ(1);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final int zzv() throws IOException {
        zzQ(0);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final long zzw() throws IOException {
        zzQ(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzx(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzhzy) {
            zzhzy zzhzyVar = (zzhzy) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar = this.zza;
                int iZzo = zzhzqVar.zzo();
                zzX(iZzo);
                int iZzC = zzhzqVar.zzC() + iZzo;
                do {
                    zzhzyVar.zzg(zzhzqVar.zzd());
                } while (zzhzqVar.zzC() < iZzC);
                return;
            }
            do {
                zzhzq zzhzqVar2 = this.zza;
                zzhzyVar.zzg(zzhzqVar2.zzd());
                if (zzhzqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzhzqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar3 = this.zza;
                int iZzo2 = zzhzqVar3.zzo();
                zzX(iZzo2);
                int iZzC2 = zzhzqVar3.zzC() + iZzo2;
                do {
                    list.add(Double.valueOf(zzhzqVar3.zzd()));
                } while (zzhzqVar3.zzC() < iZzC2);
                return;
            }
            do {
                zzhzq zzhzqVar4 = this.zza;
                list.add(Double.valueOf(zzhzqVar4.zzd()));
                if (zzhzqVar4.zzB()) {
                    return;
                } else {
                    iZza = zzhzqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzy(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zziai) {
            zziai zziaiVar = (zziai) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                zzhzq zzhzqVar = this.zza;
                int iZzo = zzhzqVar.zzo();
                zzW(iZzo);
                int iZzC = zzhzqVar.zzC() + iZzo;
                do {
                    zziaiVar.zzg(zzhzqVar.zze());
                } while (zzhzqVar.zzC() < iZzC);
                return;
            }
            if (i2 != 5) {
                throw new zzibf("Protocol message tag had invalid wire type.");
            }
            do {
                zzhzq zzhzqVar2 = this.zza;
                zziaiVar.zzg(zzhzqVar2.zze());
                if (zzhzqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzhzqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                zzhzq zzhzqVar3 = this.zza;
                int iZzo2 = zzhzqVar3.zzo();
                zzW(iZzo2);
                int iZzC2 = zzhzqVar3.zzC() + iZzo2;
                do {
                    list.add(Float.valueOf(zzhzqVar3.zze()));
                } while (zzhzqVar3.zzC() < iZzC2);
                return;
            }
            if (i3 != 5) {
                throw new zzibf("Protocol message tag had invalid wire type.");
            }
            do {
                zzhzq zzhzqVar4 = this.zza;
                list.add(Float.valueOf(zzhzqVar4.zze()));
                if (zzhzqVar4.zzB()) {
                    return;
                } else {
                    iZza = zzhzqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzicp
    public final void zzz(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzibq) {
            zzibq zzibqVar = (zzibq) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar = this.zza;
                int iZzC = zzhzqVar.zzC() + zzhzqVar.zzo();
                do {
                    zzibqVar.zzd(zzhzqVar.zzf());
                } while (zzhzqVar.zzC() < iZzC);
                zzV(iZzC);
                return;
            }
            do {
                zzhzq zzhzqVar2 = this.zza;
                zzibqVar.zzd(zzhzqVar2.zzf());
                if (zzhzqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzhzqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzibf("Protocol message tag had invalid wire type.");
                }
                zzhzq zzhzqVar3 = this.zza;
                int iZzC2 = zzhzqVar3.zzC() + zzhzqVar3.zzo();
                do {
                    list.add(Long.valueOf(zzhzqVar3.zzf()));
                } while (zzhzqVar3.zzC() < iZzC2);
                zzV(iZzC2);
                return;
            }
            do {
                zzhzq zzhzqVar4 = this.zza;
                list.add(Long.valueOf(zzhzqVar4.zzf()));
                if (zzhzqVar4.zzB()) {
                    return;
                } else {
                    iZza = zzhzqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }
}
