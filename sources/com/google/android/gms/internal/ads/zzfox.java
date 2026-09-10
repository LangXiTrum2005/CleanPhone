package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfox {

    @VisibleForTesting
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfox(@NonNull Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfoy.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfoy.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        StringBuilder sb = new StringBuilder("FBAMTD");
        sb.append(this.zzd - 1);
        return sb.toString();
    }

    private final String zzf() {
        StringBuilder sb = new StringBuilder("LATMTD");
        sb.append(this.zzd - 1);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    public final boolean zza(@NonNull zzaxw zzaxwVar, @Nullable zzfpd zzfpdVar) {
        boolean z;
        String strZzk = zzaxwVar.zzc().zzk();
        byte[] bArrZzA = zzaxwVar.zzf().zzA();
        byte[] bArrZzA2 = zzaxwVar.zzd().zzA();
        if (!TextUtils.isEmpty(strZzk) && bArrZzA2 != null && bArrZzA2.length != 0) {
            zzfoy.zzd(this.zza);
            this.zza.mkdirs();
            zzfoy.zzc(strZzk, this.zza).mkdirs();
            File fileZzb = zzfoy.zzb(strZzk, "pcam.jar", this.zza);
            if ((bArrZzA == null || bArrZzA.length <= 0 || zzfoy.zze(fileZzb, bArrZzA)) && zzfoy.zze(zzfoy.zzb(strZzk, "pcbc", this.zza), bArrZzA2)) {
                File fileZzb2 = zzfoy.zzb(zzaxwVar.zzc().zzk(), "pcam.jar", this.zza);
                if (fileZzb2.exists() && zzfpdVar != null && !zzfpdVar.zza(fileZzb2)) {
                    return false;
                }
                String strZzk2 = zzaxwVar.zzc().zzk();
                if (TextUtils.isEmpty(strZzk2)) {
                    z = false;
                } else {
                    File fileZzb3 = zzfoy.zzb(strZzk2, "pcam.jar", this.zza);
                    File fileZzb4 = zzfoy.zzb(strZzk2, "pcbc", this.zza);
                    File fileZzb5 = zzfoy.zzb(strZzk2, "pcam.jar", zzd());
                    File fileZzb6 = zzfoy.zzb(strZzk2, "pcbc", zzd());
                    if ((!fileZzb3.exists() || fileZzb3.renameTo(fileZzb5)) && fileZzb4.exists() && fileZzb4.renameTo(fileZzb6)) {
                        zzaxx zzaxxVarZzd = zzaxz.zzd();
                        zzaxxVarZzd.zze(zzaxwVar.zzc().zzk());
                        zzaxxVarZzd.zza(zzaxwVar.zzc().zzj());
                        zzaxxVarZzd.zzb(zzaxwVar.zzc().zza());
                        zzaxxVarZzd.zzd(zzaxwVar.zzc().zzc());
                        zzaxxVarZzd.zzc(zzaxwVar.zzc().zzb());
                        zzaxz zzaxzVar = (zzaxz) zzaxxVarZzd.zzbr();
                        zzaxz zzaxzVarZzb = zzb(1);
                        SharedPreferences.Editor editorEdit = this.zzc.edit();
                        if (zzaxzVarZzb != null && !zzaxzVar.zzk().equals(zzaxzVarZzb.zzk())) {
                            editorEdit.putString(zze(), Hex.bytesToStringLowercase(zzaxzVarZzb.zzaV()));
                        }
                        editorEdit.putString(zzf(), Hex.bytesToStringLowercase(zzaxzVar.zzaV()));
                        if (editorEdit.commit()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
                HashSet hashSet = new HashSet();
                zzaxz zzaxzVarZzb2 = zzb(1);
                if (zzaxzVarZzb2 != null) {
                    hashSet.add(zzaxzVarZzb2.zzk());
                }
                zzaxz zzaxzVarZzb3 = zzb(2);
                if (zzaxzVarZzb3 != null) {
                    hashSet.add(zzaxzVarZzb3.zzk());
                }
                for (File file : zzd().listFiles()) {
                    String name = file.getName();
                    if (!hashSet.contains(name)) {
                        zzfoy.zzd(zzfoy.zzc(name, zzd()));
                    }
                }
                return z;
            }
        }
        return false;
    }

    @Nullable
    @VisibleForTesting
    public final zzaxz zzb(int i) {
        String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzgwj zzgwjVar = zzgwj.zzb;
            zzaxz zzaxzVarZzh = zzaxz.zzh(zzgwj.zzv(bArrStringToBytes, 0, bArrStringToBytes.length));
            String strZzk = zzaxzVarZzh.zzk();
            File fileZzb = zzfoy.zzb(strZzk, "pcam.jar", zzd());
            if (!fileZzb.exists()) {
                fileZzb = zzfoy.zzb(strZzk, "pcam", zzd());
            }
            File fileZzb2 = zzfoy.zzb(strZzk, "pcbc", zzd());
            if (fileZzb.exists() && fileZzb2.exists()) {
                return zzaxzVarZzh;
            }
            return null;
        } catch (zzgyg unused) {
        }
    }

    @Nullable
    public final zzfow zzc(int i) {
        zzaxz zzaxzVarZzb = zzb(1);
        if (zzaxzVarZzb == null) {
            return null;
        }
        String strZzk = zzaxzVarZzb.zzk();
        File fileZzb = zzfoy.zzb(strZzk, "pcam.jar", zzd());
        if (!fileZzb.exists()) {
            fileZzb = zzfoy.zzb(strZzk, "pcam", zzd());
        }
        return new zzfow(zzaxzVarZzb, fileZzb, zzfoy.zzb(strZzk, "pcbc", zzd()), zzfoy.zzb(strZzk, "pcopt", zzd()));
    }
}
