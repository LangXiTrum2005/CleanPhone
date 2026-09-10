package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaod implements zzapt {
    private final List zza;

    public zzaod(int i2, List list) {
        this.zza = list;
    }

    private final zzapj zzc(zzaps zzapsVar) {
        return new zzapj(zze(zzapsVar), "video/mp2t");
    }

    private final zzapy zzd(zzaps zzapsVar) {
        return new zzapy(zze(zzapsVar), "video/mp2t");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zze(zzaps zzapsVar) {
        String str;
        int i2;
        List listSingletonList;
        zzer zzerVar = new zzer(zzapsVar.zze);
        ArrayList arrayList = this.zza;
        while (zzerVar.zzd() > 0) {
            int iZzs = zzerVar.zzs();
            int iZzg = zzerVar.zzg() + zzerVar.zzs();
            if (iZzs == 134) {
                arrayList = new ArrayList();
                int iZzs2 = zzerVar.zzs() & 31;
                for (int i3 = 0; i3 < iZzs2; i3++) {
                    String strZzK = zzerVar.zzK(3, StandardCharsets.UTF_8);
                    int iZzs3 = zzerVar.zzs();
                    boolean z2 = (iZzs3 & 128) != 0;
                    if (z2) {
                        i2 = iZzs3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i2 = 1;
                    }
                    byte bZzs = (byte) zzerVar.zzs();
                    zzerVar.zzk(1);
                    if (z2) {
                        int i4 = bZzs & 64;
                        int i5 = zzdo.zza;
                        listSingletonList = Collections.singletonList(i4 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    zzt zztVar = new zzt();
                    zztVar.zzm(str);
                    zztVar.zze(strZzK);
                    zztVar.zzJ(i2);
                    zztVar.zzp(listSingletonList);
                    arrayList.add(zztVar.zzM());
                }
            }
            zzerVar.zzh(iZzg);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final SparseArray zza() {
        return new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final zzapv zzb(int i2, zzaps zzapsVar) {
        if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                return new zzaoz(new zzaos(zzapsVar.zzb, zzapsVar.zza(), "video/mp2t"));
            }
            if (i2 == 21) {
                return new zzaoz(new zzaoq("video/mp2t"));
            }
            if (i2 == 27) {
                return new zzaoz(new zzaon(zzc(zzapsVar), false, false, "video/mp2t"));
            }
            if (i2 == 36) {
                return new zzaoz(new zzaop(zzc(zzapsVar), "video/mp2t"));
            }
            if (i2 == 45) {
                return new zzaoz(new zzaot("video/mp2t"));
            }
            if (i2 == 89) {
                return new zzaoz(new zzaof(zzapsVar.zzd, "video/mp2t"));
            }
            if (i2 == 172) {
                return new zzaoz(new zzanz(zzapsVar.zzb, zzapsVar.zza(), "video/mp2t"));
            }
            if (i2 == 257) {
                return new zzaph(new zzaoy("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i2 != 128) {
                if (i2 != 129) {
                    if (i2 != 138) {
                        if (i2 == 139) {
                            return new zzaoz(new zzaoe(zzapsVar.zzb, zzapsVar.zza(), 5408, "video/mp2t"));
                        }
                        switch (i2) {
                            case 15:
                                return new zzaoz(new zzaoc(false, zzapsVar.zzb, zzapsVar.zza(), "video/mp2t"));
                            case 16:
                                return new zzaoz(new zzaol(zzd(zzapsVar), "video/mp2t"));
                            case 17:
                                return new zzaoz(new zzaor(zzapsVar.zzb, zzapsVar.zza(), "video/mp2t"));
                            default:
                                switch (i2) {
                                    case 134:
                                        return new zzaph(new zzaoy("application/x-scte35", "video/mp2t"));
                                    case 135:
                                        break;
                                    case PRIVACY_URL_ERROR_VALUE:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                    }
                    return new zzaoz(new zzaoe(zzapsVar.zzb, zzapsVar.zza(), 4096, "video/mp2t"));
                }
                return new zzaoz(new zzanw(zzapsVar.zzb, zzapsVar.zza(), "video/mp2t"));
            }
        }
        return new zzaoz(new zzaoi(zzd(zzapsVar), "video/mp2t"));
    }

    public zzaod() {
        this(0);
    }

    public zzaod(int i2) {
        this.zza = zzgtd.zzi();
    }
}
