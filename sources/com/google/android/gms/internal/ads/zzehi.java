package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzehi {
    private final zzbfj zza;
    private final Context zzb;
    private final zzegn zzc;
    private final VersionInfoParcel zzd;

    public zzehi(Context context, VersionInfoParcel versionInfoParcel, zzbfj zzbfjVar, zzegn zzegnVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbfjVar;
        this.zzc = zzegnVar;
    }

    public final void zza(final boolean z2) {
        try {
            this.zzc.zza(new zzflu() { // from class: com.google.android.gms.internal.ads.zzehh
                @Override // com.google.android.gms.internal.ads.zzflu
                public final /* synthetic */ Object zza(Object obj) {
                    this.zza.zzb(z2, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in offline signals database startup: ".concat(strValueOf));
        }
    }

    public final /* synthetic */ Void zzb(boolean z2, SQLiteDatabase sQLiteDatabase) {
        if (z2) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(zzbfp.zzaf.zza.zzk(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzibg e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(e2.getMessage());
                }
            }
            cursorQuery.close();
            Context context = this.zzb;
            zzbfp.zzaf.zzc zzcVarZzB = zzbfp.zzaf.zzB();
            zzcVarZzB.zzB(context.getPackageName());
            zzcVarZzB.zzH(Build.MODEL);
            zzcVarZzB.zzo(zzehc.zzc(sQLiteDatabase, 0));
            zzcVarZzB.zzj(arrayList);
            zzcVarZzB.zzs(zzehc.zzc(sQLiteDatabase, 1));
            zzcVarZzB.zzQ(zzehc.zzc(sQLiteDatabase, 3));
            zzcVarZzB.zzw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
            zzcVarZzB.zzM(zzehc.zzd(sQLiteDatabase, 2));
            final zzbfp.zzaf zzafVarZzbu = zzcVarZzB.zzbu();
            int size = arrayList.size();
            long jZzb = 0;
            for (int i3 = 0; i3 < size; i3++) {
                zzbfp.zzaf.zza zzaVar = (zzbfp.zzaf.zza) arrayList.get(i3);
                if (zzaVar.zzf() == zzbfp.zzq.ENUM_TRUE && zzaVar.zzb() > jZzb) {
                    jZzb = zzaVar.zzb();
                }
            }
            if (jZzb != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(jZzb));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            zzbfj zzbfjVar = this.zza;
            zzbfjVar.zzb(new zzbfi() { // from class: com.google.android.gms.internal.ads.zzehf
                @Override // com.google.android.gms.internal.ads.zzbfi
                public final /* synthetic */ void zza(zzbfp.zzt.zza zzaVar2) {
                    zzaVar2.zzaf(zzafVarZzbu);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbfp.zzar.zza zzaVarZzs = zzbfp.zzar.zzs();
            zzaVarZzs.zzc(versionInfoParcel.buddyApkVersion);
            zzaVarZzs.zzg(versionInfoParcel.clientJarVersion);
            zzaVarZzs.zzk(true == versionInfoParcel.isClientJar ? 0 : 2);
            final zzbfp.zzar zzarVarZzbu = zzaVarZzs.zzbu();
            zzbfjVar.zzb(new zzbfi() { // from class: com.google.android.gms.internal.ads.zzehg
                @Override // com.google.android.gms.internal.ads.zzbfi
                public final /* synthetic */ void zza(zzbfp.zzt.zza zzaVar2) {
                    zzbfp.zzm.zza zzaVarZzcc = zzaVar2.zzG().zzcc();
                    zzaVarZzcc.zzs(zzarVarZzbu);
                    zzaVar2.zzI(zzaVarZzcc);
                }
            });
            zzbfjVar.zzc(10004);
            zzehc.zzb(sQLiteDatabase);
        }
        return null;
    }
}
