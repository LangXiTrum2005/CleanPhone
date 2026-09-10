package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfvp {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzbbq zzd;

    public zzfvp(Context context, zzbbq zzbbqVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfvq.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfvq.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzbbqVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int iZza = this.zzd.zza();
        return androidx.datastore.preferences.protobuf.a.g(iZza, "FBAMTD", new StringBuilder(String.valueOf(iZza).length() + 6));
    }

    private final String zzf() {
        int iZza = this.zzd.zza();
        return androidx.datastore.preferences.protobuf.a.g(iZza, "LATMTD", new StringBuilder(String.valueOf(iZza).length() + 6));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    public final boolean zza(zzbbs zzbbsVar, zzfvv zzfvvVar) {
        boolean z2;
        String strZza = zzbbsVar.zza().zza();
        byte[] bArrZzy = zzbbsVar.zzb().zzy();
        byte[] bArrZzy2 = zzbbsVar.zzc().zzy();
        if (!TextUtils.isEmpty(strZza) && bArrZzy2 != null && bArrZzy2.length != 0) {
            File file = this.zza;
            zzfvq.zze(file);
            file.mkdirs();
            zzfvq.zzc(strZza, file).mkdirs();
            File fileZza = zzfvq.zza(strZza, "pcam.jar", file);
            if ((bArrZzy == null || bArrZzy.length <= 0 || zzfvq.zzb(fileZza, bArrZzy)) && zzfvq.zzb(zzfvq.zza(strZza, "pcbc", file), bArrZzy2)) {
                File fileZza2 = zzfvq.zza(zzbbsVar.zza().zza(), "pcam.jar", file);
                if (fileZza2.exists() && zzfvvVar != null && !zzfvvVar.zza(fileZza2)) {
                    return false;
                }
                String strZza2 = zzbbsVar.zza().zza();
                if (TextUtils.isEmpty(strZza2)) {
                    z2 = false;
                } else {
                    File fileZza3 = zzfvq.zza(strZza2, "pcam.jar", file);
                    File fileZza4 = zzfvq.zza(strZza2, "pcbc", file);
                    File fileZza5 = zzfvq.zza(strZza2, "pcam.jar", zzd());
                    File fileZza6 = zzfvq.zza(strZza2, "pcbc", zzd());
                    if ((!fileZza3.exists() || fileZza3.renameTo(fileZza5)) && fileZza4.exists() && fileZza4.renameTo(fileZza6)) {
                        zzbbx zzbbxVarZzi = zzbby.zzi();
                        zzbbxVarZzi.zza(zzbbsVar.zza().zza());
                        zzbbxVarZzi.zzb(zzbbsVar.zza().zzb());
                        zzbbxVarZzi.zzd(zzbbsVar.zza().zzd());
                        zzbbxVarZzi.zze(zzbbsVar.zza().zze());
                        zzbbxVarZzi.zzc(zzbbsVar.zza().zzc());
                        zzbby zzbbyVar = (zzbby) zzbbxVarZzi.zzbu();
                        zzbby zzbbyVarZzc = zzc(1);
                        SharedPreferences.Editor editorEdit = this.zzc.edit();
                        if (zzbbyVarZzc != null && !zzbbyVar.zza().equals(zzbbyVarZzc.zza())) {
                            editorEdit.putString(zze(), Hex.bytesToStringLowercase(zzbbyVarZzc.zzaN()));
                        }
                        editorEdit.putString(zzf(), Hex.bytesToStringLowercase(zzbbyVar.zzaN()));
                        if (editorEdit.commit()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                }
                HashSet hashSet = new HashSet();
                zzbby zzbbyVarZzc2 = zzc(1);
                if (zzbbyVarZzc2 != null) {
                    hashSet.add(zzbbyVarZzc2.zza());
                }
                zzbby zzbbyVarZzc3 = zzc(2);
                if (zzbbyVarZzc3 != null) {
                    hashSet.add(zzbbyVarZzc3.zza());
                }
                for (File file2 : zzd().listFiles()) {
                    String name = file2.getName();
                    if (!hashSet.contains(name)) {
                        zzfvq.zze(zzfvq.zzc(name, zzd()));
                    }
                }
                return z2;
            }
        }
        return false;
    }

    public final zzfvo zzb(int i2) {
        zzbby zzbbyVarZzc = zzc(1);
        if (zzbbyVarZzc == null) {
            return null;
        }
        String strZza = zzbbyVarZzc.zza();
        File fileZza = zzfvq.zza(strZza, "pcam.jar", zzd());
        if (!fileZza.exists()) {
            fileZza = zzfvq.zza(strZza, "pcam", zzd());
        }
        return new zzfvo(zzbbyVarZzc, fileZza, zzfvq.zza(strZza, "pcbc", zzd()), zzfvq.zza(strZza, "pcopt", zzd()));
    }

    public final zzbby zzc(int i2) {
        String string = i2 == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzhzl zzhzlVar = zzhzl.zzb;
            zzbby zzbbyVarZzg = zzbby.zzg(zzhzl.zzs(bArrStringToBytes, 0, bArrStringToBytes.length));
            String strZza = zzbbyVarZzg.zza();
            File fileZza = zzfvq.zza(strZza, "pcam.jar", zzd());
            if (!fileZza.exists()) {
                fileZza = zzfvq.zza(strZza, "pcam", zzd());
            }
            File fileZza2 = zzfvq.zza(strZza, "pcbc", zzd());
            if (fileZza.exists() && fileZza2.exists()) {
                return zzbbyVarZzg;
            }
            return null;
        } catch (zzibg unused) {
        }
    }
}
