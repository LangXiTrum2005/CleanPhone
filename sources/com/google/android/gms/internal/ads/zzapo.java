package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.applovin.shadow.okio.Segment;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzapo implements zzapg {
    final /* synthetic */ zzapq zza;
    private final zzeq zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzapo(zzapq zzapqVar, int i2) {
        Objects.requireNonNull(zzapqVar);
        this.zza = zzapqVar;
        this.zzb = new zzeq(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zza(zzfg zzfgVar, zzaer zzaerVar, zzapu zzapuVar) {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:23:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:32:0x0102  */
    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zzb(zzer zzerVar) {
        int i2;
        if (zzerVar.zzs() != 2) {
            return;
        }
        zzapq zzapqVar = this.zza;
        zzfg zzfgVar = (zzfg) zzapqVar.zzh().get(0);
        if ((zzerVar.zzs() & 128) != 0) {
            zzerVar.zzk(1);
            int iZzt = zzerVar.zzt();
            int i3 = 3;
            zzerVar.zzk(3);
            zzeq zzeqVar = this.zzb;
            zzerVar.zzl(zzeqVar, 2);
            zzeqVar.zzh(3);
            int i4 = 13;
            zzapqVar.zzq(zzeqVar.zzj(13));
            zzerVar.zzl(zzeqVar, 2);
            int i5 = 4;
            zzeqVar.zzh(4);
            int i6 = 12;
            zzerVar.zzk(zzeqVar.zzj(12));
            SparseArray sparseArray = this.zzc;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.zzd;
            sparseIntArray.clear();
            int iZzd = zzerVar.zzd();
            while (iZzd > 0) {
                int i7 = 5;
                zzerVar.zzl(zzeqVar, 5);
                int iZzj = zzeqVar.zzj(8);
                zzeqVar.zzh(i3);
                int iZzj2 = zzeqVar.zzj(i4);
                zzeqVar.zzh(i5);
                int iZzj3 = zzeqVar.zzj(i6);
                int iZzg = zzerVar.zzg();
                int i8 = iZzg + iZzj3;
                String str = null;
                ArrayList arrayList = null;
                int i9 = -1;
                int iZzs = 0;
                while (zzerVar.zzg() < i8) {
                    int iZzs2 = zzerVar.zzs();
                    int iZzg2 = zzerVar.zzg() + zzerVar.zzs();
                    if (iZzg2 > i8) {
                        break;
                    }
                    if (iZzs2 == i7) {
                        long jZzz = zzerVar.zzz();
                        if (jZzz == 1094921523) {
                            zzapqVar = zzapqVar;
                            i9 = 129;
                        } else if (jZzz == 1161904947) {
                            zzapqVar = zzapqVar;
                            zzeqVar = zzeqVar;
                            iZzd = iZzd;
                            i9 = 135;
                            iZzg2 = iZzg2;
                        } else if (jZzz == 1094921524) {
                            zzapqVar = zzapqVar;
                            i9 = 172;
                        } else if (jZzz == 1212503619) {
                            i2 = 36;
                            i9 = i2;
                        }
                    } else if (iZzs2 == 106) {
                        zzapqVar = zzapqVar;
                        i9 = 129;
                    } else if (iZzs2 == 122) {
                        zzapqVar = zzapqVar;
                        zzeqVar = zzeqVar;
                        iZzd = iZzd;
                        i9 = 135;
                        iZzg2 = iZzg2;
                    } else {
                        if (iZzs2 == 127) {
                            int iZzs3 = zzerVar.zzs();
                            if (iZzs3 == 21) {
                                zzapqVar = zzapqVar;
                                i9 = 172;
                            } else if (iZzs3 == 14) {
                                i2 = Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                            } else if (iZzs3 == 33) {
                                i2 = 139;
                            }
                        } else if (iZzs2 == 123) {
                            i2 = 138;
                        } else if (iZzs2 == 10) {
                            String strTrim = zzerVar.zzK(3, StandardCharsets.UTF_8).trim();
                            iZzs = zzerVar.zzs();
                            str = strTrim;
                        } else if (iZzs2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (zzerVar.zzg() < iZzg2) {
                                int i10 = iZzg2;
                                String strTrim2 = zzerVar.zzK(3, StandardCharsets.UTF_8).trim();
                                int iZzs4 = zzerVar.zzs();
                                int i11 = iZzd;
                                byte[] bArr = new byte[4];
                                zzerVar.zzm(bArr, 0, 4);
                                arrayList2.add(new zzapr(strTrim2, iZzs4, bArr));
                                iZzd = i11;
                                iZzg2 = i10;
                                zzeqVar = zzeqVar;
                                zzapqVar = zzapqVar;
                            }
                            zzapqVar = zzapqVar;
                            iZzg2 = iZzg2;
                            zzeqVar = zzeqVar;
                            iZzd = iZzd;
                            arrayList = arrayList2;
                            i9 = 89;
                        } else {
                            zzapqVar = zzapqVar;
                            iZzg2 = iZzg2;
                            zzeqVar = zzeqVar;
                            iZzd = iZzd;
                            if (iZzs2 == 111) {
                                i9 = 257;
                            }
                        }
                        i9 = i2;
                    }
                    zzerVar.zzk(iZzg2 - zzerVar.zzg());
                    iZzd = iZzd;
                    zzeqVar = zzeqVar;
                    zzapqVar = zzapqVar;
                    i7 = 5;
                }
                zzapq zzapqVar2 = zzapqVar;
                zzeq zzeqVar2 = zzeqVar;
                int i12 = iZzd;
                zzerVar.zzh(i8);
                zzaps zzapsVar = new zzaps(i9, str, iZzs, arrayList, Arrays.copyOfRange(zzerVar.zzi(), iZzg, i8));
                if (iZzj == 6 || iZzj == 5) {
                    iZzj = zzapsVar.zza;
                }
                iZzd = i12 - (iZzj3 + 5);
                if (!zzapqVar2.zzk().get(iZzj2)) {
                    zzapv zzapvVarZzb = zzapqVar2.zzi().zzb(iZzj, zzapsVar);
                    sparseIntArray.put(iZzj2, iZzj2);
                    sparseArray.put(iZzj2, zzapvVarZzb);
                }
                i5 = 4;
                zzeqVar = zzeqVar2;
                zzapqVar = zzapqVar2;
                i3 = 3;
                i4 = 13;
                i6 = 12;
            }
            zzapq zzapqVar3 = zzapqVar;
            int size = sparseIntArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                int iKeyAt = sparseIntArray.keyAt(i13);
                int iValueAt = sparseIntArray.valueAt(i13);
                zzapqVar3.zzk().put(iKeyAt, true);
                zzapqVar3.zzl().put(iValueAt, true);
                zzapv zzapvVar = (zzapv) sparseArray.valueAt(i13);
                if (zzapvVar != null) {
                    zzapvVar.zza(zzfgVar, zzapqVar3.zzm(), new zzapu(iZzt, iKeyAt, Segment.SIZE));
                    zzapqVar3.zzj().put(iValueAt, zzapvVar);
                }
            }
            zzapqVar3.zzj().remove(this.zze);
            zzapqVar3.zzo(0);
            if (zzapqVar3.zzn() == 0) {
                zzapqVar3.zzm().zzv();
                zzapqVar3.zzp(true);
            }
        }
    }
}
