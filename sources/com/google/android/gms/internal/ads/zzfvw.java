package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfvw {
    private static final Object zzf = new Object();
    private final Context zza;
    private final SharedPreferences zzb;
    private final String zzc;
    private final zzfvd zzd;
    private boolean zze;

    public zzfvw(Context context, zzbbq zzbbqVar, zzfvd zzfvdVar, boolean z2) {
        this.zze = false;
        this.zza = context;
        this.zzc = Integer.toString(zzbbqVar.zza());
        this.zzb = context.getSharedPreferences("pcvmspf", 0);
        this.zzd = zzfvdVar;
        this.zze = z2;
    }

    private final File zze(String str) {
        return new File(new File(this.zza.getDir("pccache", 0), this.zzc), str);
    }

    private final String zzf() {
        return "FBAMTD".concat(String.valueOf(this.zzc));
    }

    private final String zzg() {
        return "LATMTD".concat(String.valueOf(this.zzc));
    }

    private static String zzh(zzbbs zzbbsVar) {
        zzbbx zzbbxVarZzi = zzbby.zzi();
        zzbbxVarZzi.zza(zzbbsVar.zza().zza());
        zzbbxVarZzi.zzb(zzbbsVar.zza().zzb());
        zzbbxVarZzi.zzd(zzbbsVar.zza().zzd());
        zzbbxVarZzi.zze(zzbbsVar.zza().zze());
        zzbbxVarZzi.zzc(zzbbsVar.zza().zzc());
        return Hex.bytesToStringLowercase(((zzbby) zzbbxVarZzi.zzbu()).zzaN());
    }

    private final void zzi(int i2, long j) {
        this.zzd.zza(i2, j);
    }

    private final void zzj(int i2, long j, String str) {
        this.zzd.zzb(i2, j, str);
    }

    private final zzbby zzk(int i2) {
        String string = i2 == 1 ? this.zzb.getString(zzg(), null) : this.zzb.getString(zzf(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzhzl zzhzlVar = zzhzl.zzb;
            return zzbby.zzh(zzhzl.zzs(bArrStringToBytes, 0, bArrStringToBytes.length), this.zze ? zziab.zza() : zziab.zzb());
        } catch (zzibg unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzbbs zzbbsVar, zzfvv zzfvvVar) {
        boolean z2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzbby zzbbyVarZzk = zzk(1);
                String strZza = zzbbsVar.zza().zza();
                if (zzbbyVarZzk != null && zzbbyVarZzk.zza().equals(strZza)) {
                    zzi(4014, jCurrentTimeMillis);
                    return false;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File fileZze = zze(strZza);
                if (fileZze.exists()) {
                    String str = true != fileZze.isDirectory() ? "0" : "1";
                    String str2 = true != fileZze.isFile() ? "0" : "1";
                    z2 = false;
                    StringBuilder sb = new StringBuilder(7);
                    sb.append("d:");
                    sb.append(str);
                    sb.append(",f:");
                    sb.append(str2);
                    zzj(4023, jCurrentTimeMillis2, sb.toString());
                    zzi(4015, jCurrentTimeMillis2);
                } else {
                    z2 = false;
                    if (!fileZze.mkdirs()) {
                        zzj(4024, jCurrentTimeMillis2, "cw:".concat(true != fileZze.canWrite() ? "0" : "1"));
                        zzi(4015, jCurrentTimeMillis2);
                        return false;
                    }
                }
                File fileZze2 = zze(strZza);
                File file = new File(fileZze2, "pcam.jar");
                File file2 = new File(fileZze2, "pcbc");
                if (!zzfvq.zzb(file, zzbbsVar.zzb().zzy())) {
                    zzi(4016, jCurrentTimeMillis);
                    return z2;
                }
                if (!zzfvq.zzb(file2, zzbbsVar.zzc().zzy())) {
                    zzi(4017, jCurrentTimeMillis);
                    return z2;
                }
                if (zzfvvVar != null && !zzfvvVar.zza(file)) {
                    zzi(4018, jCurrentTimeMillis);
                    zzfvq.zze(fileZze2);
                    return z2;
                }
                String strZzh = zzh(zzbbsVar);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                SharedPreferences sharedPreferences = this.zzb;
                String string = sharedPreferences.getString(zzg(), null);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(zzg(), strZzh);
                if (string != null) {
                    editorEdit.putString(zzf(), string);
                }
                if (!editorEdit.commit()) {
                    zzi(4019, jCurrentTimeMillis3);
                    return z2;
                }
                HashSet hashSet = new HashSet();
                zzbby zzbbyVarZzk2 = zzk(1);
                if (zzbbyVarZzk2 != null) {
                    hashSet.add(zzbbyVarZzk2.zza());
                }
                zzbby zzbbyVarZzk3 = zzk(2);
                if (zzbbyVarZzk3 != null) {
                    hashSet.add(zzbbyVarZzk3.zza());
                }
                boolean z3 = z2;
                File[] fileArrListFiles = new File(this.zza.getDir("pccache", z3 ? 1 : 0), this.zzc).listFiles();
                int length = fileArrListFiles.length;
                for (int i2 = z3 ? 1 : 0; i2 < length; i2++) {
                    File file3 = fileArrListFiles[i2];
                    if (!hashSet.contains(file3.getName())) {
                        zzfvq.zze(file3);
                    }
                }
                zzi(5014, jCurrentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(zzbbs zzbbsVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                if (!zzfvq.zzb(new File(zze(zzbbsVar.zza().zza()), "pcbc"), zzbbsVar.zzc().zzy())) {
                    zzi(4020, jCurrentTimeMillis);
                    return false;
                }
                String strZzh = zzh(zzbbsVar);
                SharedPreferences.Editor editorEdit = this.zzb.edit();
                editorEdit.putString(zzg(), strZzh);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    zzi(5015, jCurrentTimeMillis);
                } else {
                    zzi(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzfvo zzc(int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzbby zzbbyVarZzk = zzk(1);
                if (zzbbyVarZzk == null) {
                    zzi(4022, jCurrentTimeMillis);
                    return null;
                }
                File fileZze = zze(zzbbyVarZzk.zza());
                File file = new File(fileZze, "pcam.jar");
                if (!file.exists()) {
                    file = new File(fileZze, "pcam");
                }
                File file2 = new File(fileZze, "pcbc");
                File file3 = new File(fileZze, "pcopt");
                zzi(5016, jCurrentTimeMillis);
                return new zzfvo(zzbbyVarZzk, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd(int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzbby zzbbyVarZzk = zzk(1);
                if (zzbbyVarZzk == null) {
                    zzi(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileZze = zze(zzbbyVarZzk.zza());
                if (!new File(fileZze, "pcam.jar").exists()) {
                    zzi(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileZze, "pcbc").exists()) {
                    zzi(5019, jCurrentTimeMillis);
                    return true;
                }
                zzi(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
