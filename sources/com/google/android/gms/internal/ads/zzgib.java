package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgib {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzija zzd;
    private final zzgnc zze;

    public zzgib(Context context, SharedPreferences sharedPreferences, zzija zzijaVar, zzgnc zzgncVar) {
        this.zzc = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        zzfvq.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        zzfvq.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzijaVar;
        this.zze = zzgncVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(((zzbbq) this.zzd.zzb()).zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int iZza = ((zzbbq) this.zzd.zzb()).zza();
        return androidx.datastore.preferences.protobuf.a.g(iZza, "FBAMTD", new StringBuilder(String.valueOf(iZza).length() + 6));
    }

    private final String zzf() {
        int iZza = ((zzbbq) this.zzd.zzb()).zza();
        return androidx.datastore.preferences.protobuf.a.g(iZza, "LATMTD", new StringBuilder(String.valueOf(iZza).length() + 6));
    }

    public final boolean zza(zzgcs zzgcsVar, byte[] bArr, byte[] bArr2) {
        boolean z2;
        String strZza = zzgcsVar.zza().zza();
        if (!TextUtils.isEmpty(strZza) && bArr2.length != 0) {
            File file = this.zza;
            zzfvq.zze(file);
            file.mkdirs();
            File fileZzc = zzfvq.zzc(strZza, file);
            fileZzc.getClass();
            fileZzc.mkdirs();
            File fileZza = zzfvq.zza(strZza, "pcam.jar", file);
            fileZza.getClass();
            if (bArr == null || bArr.length <= 0 || zzfvq.zzb(fileZza, bArr)) {
                File fileZza2 = zzfvq.zza(strZza, "pcbc", file);
                fileZza2.getClass();
                if (zzfvq.zzb(fileZza2, bArr2)) {
                    String strZza2 = zzgcsVar.zza().zza();
                    if (TextUtils.isEmpty(strZza2)) {
                        z2 = false;
                    } else {
                        File fileZza3 = zzfvq.zza(strZza2, "pcam.jar", file);
                        fileZza3.getClass();
                        File fileZza4 = zzfvq.zza(strZza2, "pcbc", file);
                        fileZza4.getClass();
                        File fileZza5 = zzfvq.zza(strZza2, "pcam.jar", zzd());
                        fileZza5.getClass();
                        File fileZza6 = zzfvq.zza(strZza2, "pcbc", zzd());
                        fileZza6.getClass();
                        if (fileZza3.exists() && !fileZza3.renameTo(fileZza5)) {
                            this.zze.zzb(15318);
                        } else if (fileZza4.exists() && fileZza4.renameTo(fileZza6)) {
                            zzgcs zzgcsVarZzc = zzc(1);
                            SharedPreferences.Editor editorEdit = this.zzc.edit();
                            if (zzgcsVarZzc != null && !zzgcsVar.zza().zza().equals(zzgcsVarZzc.zza().zza())) {
                                editorEdit.putString(zze(), Hex.bytesToStringLowercase(zzgcsVarZzc.zzaN()));
                            }
                            editorEdit.putString(zzf(), Hex.bytesToStringLowercase(zzgcsVar.zzaN()));
                            if (editorEdit.commit()) {
                                z2 = true;
                            } else {
                                this.zze.zzb(15320);
                            }
                        } else {
                            this.zze.zzb(15319);
                        }
                        z2 = false;
                    }
                    HashSet hashSet = new HashSet();
                    zzgcs zzgcsVarZzc2 = zzc(1);
                    if (zzgcsVarZzc2 != null) {
                        hashSet.add(zzgcsVarZzc2.zza().zza());
                    }
                    zzgcs zzgcsVarZzc3 = zzc(2);
                    if (zzgcsVarZzc3 != null) {
                        hashSet.add(zzgcsVarZzc3.zza().zza());
                    }
                    File[] fileArrListFiles = zzd().listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File fileZzc2 = zzfvq.zzc(name, zzd());
                                fileZzc2.getClass();
                                zzfvq.zze(fileZzc2);
                            }
                        }
                    }
                    return z2;
                }
            }
        }
        this.zze.zzb(15316);
        return false;
    }

    public final zzfvo zzb(int i2) {
        zzgcs zzgcsVarZzc = zzc(1);
        if (zzgcsVarZzc == null) {
            this.zze.zzb(15315);
            return null;
        }
        String strZza = zzgcsVarZzc.zza().zza();
        File fileZza = zzfvq.zza(strZza, "pcam.jar", zzd());
        fileZza.getClass();
        if (!fileZza.exists()) {
            fileZza = zzfvq.zza(strZza, "pcam", zzd());
            fileZza.getClass();
        }
        File fileZza2 = zzfvq.zza(strZza, "pcopt", zzd());
        fileZza2.getClass();
        File fileZza3 = zzfvq.zza(strZza, "pcbc", zzd());
        fileZza3.getClass();
        return new zzfvo(zzgcsVarZzc.zza(), fileZza, fileZza3, fileZza2);
    }

    public final zzgcs zzc(int i2) {
        String string = i2 == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzhzl zzhzlVar = zzhzl.zzb;
            zzgcs zzgcsVarZzd = zzgcs.zzd(zzhzl.zzs(bArrStringToBytes, 0, bArrStringToBytes.length));
            String strZza = zzgcsVarZzd.zza().zza();
            File fileZza = zzfvq.zza(strZza, "pcam.jar", zzd());
            if (fileZza == null) {
                throw null;
            }
            if (!fileZza.exists() && (fileZza = zzfvq.zza(strZza, "pcam", zzd())) == null) {
                throw null;
            }
            File fileZza2 = zzfvq.zza(strZza, "pcbc", zzd());
            if (fileZza2 == null) {
                throw null;
            }
            if (fileZza.exists() && fileZza2.exists()) {
                return zzgcsVarZzd;
            }
            return null;
        } catch (zzibg unused) {
            this.zze.zzb(15317);
        }
    }
}
