package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzegy implements zzgyj {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzegz zzb;

    public zzegy(zzegz zzegzVar, boolean z2) {
        this.zza = z2;
        Objects.requireNonNull(zzegzVar);
        this.zzb = zzegzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a9  */
    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List listUnmodifiableList;
        List listAsList;
        final ArrayList arrayList;
        Iterator it;
        byte b2;
        zzbfp.zzd.zza zzaVar;
        zzegz zzegzVar = this.zzb;
        zzczm zzczmVar = (zzczm) obj;
        if (zzegzVar.zzf()) {
            return;
        }
        Bundle bundle = zzczmVar.zza;
        Object obj2 = bundle.get("ad_types");
        if (!(obj2 instanceof List)) {
            if (obj2 instanceof String[]) {
                listAsList = Arrays.asList((String[]) obj2);
            } else {
                listUnmodifiableList = Collections.EMPTY_LIST;
            }
            arrayList = new ArrayList();
            it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                switch ((String) it.next()) {
                    case "banner":
                        b2 = 0;
                        break;
                    case "native":
                        b2 = 2;
                        break;
                    case "rewarded":
                        b2 = 3;
                        break;
                    case "interstitial":
                        b2 = 1;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 != 0) {
                    zzaVar = zzbfp.zzd.zza.BANNER;
                } else if (b2 != 1) {
                    zzaVar = zzbfp.zzd.zza.INTERSTITIAL;
                } else if (b2 != 2) {
                    zzaVar = zzbfp.zzd.zza.NATIVE_APP_INSTALL;
                } else if (b2 != 3) {
                    zzaVar = zzbfp.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                } else {
                    zzaVar = zzbfp.zzd.zza.REWARD_BASED_VIDEO_AD;
                }
                arrayList.add(zzaVar);
            }
            final zzbfp.zzaf.zzd zzdVarZze = zzegz.zze(bundle);
            final zzbfp.zzab zzabVarZzb = zzegzVar.zzb(bundle);
            final boolean z2 = this.zza;
            zzegzVar.zza.zza(new zzflu() { // from class: com.google.android.gms.internal.ads.zzegx
                @Override // com.google.android.gms.internal.ads.zzflu
                public final /* synthetic */ Object zza(Object obj3) {
                    zzegz zzegzVar2 = this.zza.zzb;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    if (zzegzVar2.zzf()) {
                        return null;
                    }
                    zzbfp.zzaf.zzd zzdVar = zzdVarZze;
                    zzbfp.zzab zzabVar = zzabVarZzb;
                    ArrayList arrayList2 = arrayList;
                    boolean z3 = z2;
                    byte[] bArrZzc = zzegzVar2.zzc(z3, arrayList2, zzabVar, zzdVar);
                    zzehc.zzf(sQLiteDatabase, z3, true);
                    zzehc.zze(sQLiteDatabase, zzegzVar2.zzd().zzb(), bArrZzc);
                    return null;
                }
            });
        }
        listAsList = (List) obj2;
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            switch ((String) it.next()) {
                case -1396342996:
                    if (!r2.equals("banner")) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -1052618729:
                    if (!r2.equals("native")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -239580146:
                    if (!r2.equals("rewarded")) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 604727084:
                    if (!r2.equals("interstitial")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 != 0) {
                zzaVar = zzbfp.zzd.zza.BANNER;
            } else if (b2 != 1) {
                zzaVar = zzbfp.zzd.zza.INTERSTITIAL;
            } else if (b2 != 2) {
                zzaVar = zzbfp.zzd.zza.NATIVE_APP_INSTALL;
            } else if (b2 != 3) {
                zzaVar = zzbfp.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
            } else {
                zzaVar = zzbfp.zzd.zza.REWARD_BASED_VIDEO_AD;
            }
            arrayList.add(zzaVar);
        }
        final zzbfp.zzaf.zzd zzdVarZze2 = zzegz.zze(bundle);
        final zzbfp.zzab zzabVarZzb2 = zzegzVar.zzb(bundle);
        final boolean z3 = this.zza;
        zzegzVar.zza.zza(new zzflu() { // from class: com.google.android.gms.internal.ads.zzegx
            @Override // com.google.android.gms.internal.ads.zzflu
            public final /* synthetic */ Object zza(Object obj4) {
                zzegz zzegzVar2 = this.zza.zzb;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj4;
                if (zzegzVar2.zzf()) {
                    return null;
                }
                zzbfp.zzaf.zzd zzdVar = zzdVarZze2;
                zzbfp.zzab zzabVar = zzabVarZzb2;
                ArrayList arrayList3 = arrayList;
                boolean z4 = z3;
                byte[] bArrZzc = zzegzVar2.zzc(z4, arrayList3, zzabVar, zzdVar);
                zzehc.zzf(sQLiteDatabase, z4, true);
                zzehc.zze(sQLiteDatabase, zzegzVar2.zzd().zzb(), bArrZzc);
                return null;
            }
        });
    }
}
