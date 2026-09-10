package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzasg implements zzaqu {
    private final zzasf zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzasg(zzasf zzasfVar, int i2) {
        this.zzc = zzasfVar;
    }

    public static byte[] zzg(zzase zzaseVar, long j) throws IOException {
        long jZza = zzaseVar.zza();
        if (j >= 0 && j <= jZza) {
            int i2 = (int) j;
            if (i2 == j) {
                byte[] bArr = new byte[i2];
                new DataInputStream(zzaseVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 33 + String.valueOf(jZza).length());
        androidx.datastore.preferences.protobuf.a.A(sb, "streamToBytes length=", j, ", maxLength=");
        sb.append(jZza);
        throw new IOException(sb.toString());
    }

    public static void zzh(OutputStream outputStream, int i2) throws IOException {
        outputStream.write(i2 & 255);
        outputStream.write((i2 >> 8) & 255);
        outputStream.write((i2 >> 16) & 255);
        outputStream.write((i2 >> 24) & 255);
    }

    public static int zzi(InputStream inputStream) throws IOException {
        return (zzp(inputStream) << 24) | zzp(inputStream) | (zzp(inputStream) << 8) | (zzp(inputStream) << 16);
    }

    public static void zzj(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    public static long zzk(InputStream inputStream) throws IOException {
        return (((long) zzp(inputStream)) & 255) | ((((long) zzp(inputStream)) & 255) << 8) | ((((long) zzp(inputStream)) & 255) << 16) | ((((long) zzp(inputStream)) & 255) << 24) | ((((long) zzp(inputStream)) & 255) << 32) | ((((long) zzp(inputStream)) & 255) << 40) | ((((long) zzp(inputStream)) & 255) << 48) | ((((long) zzp(inputStream)) & 255) << 56);
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzj(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static String zzm(zzase zzaseVar) throws IOException {
        return new String(zzg(zzaseVar, zzk(zzaseVar)), "UTF-8");
    }

    private final void zzn(String str, zzasd zzasdVar) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            this.zzb = (zzasdVar.zza - ((zzasd) map.get(str)).zza) + this.zzb;
        } else {
            this.zzb += zzasdVar.zza;
        }
        map.put(str, zzasdVar);
    }

    private final void zzo(String str) {
        zzasd zzasdVar = (zzasd) this.zza.remove(str);
        if (zzasdVar != null) {
            this.zzb -= zzasdVar.zza;
        }
    }

    private static int zzp(InputStream inputStream) throws IOException {
        int i2 = inputStream.read();
        if (i2 != -1) {
            return i2;
        }
        throw new EOFException();
    }

    private static final String zzq(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    public final synchronized zzaqt zza(String str) {
        zzasd zzasdVar = (zzasd) this.zza.get(str);
        if (zzasdVar == null) {
            return null;
        }
        File fileZzf = zzf(str);
        try {
            zzase zzaseVar = new zzase(new BufferedInputStream(new FileInputStream(fileZzf)), fileZzf.length());
            try {
                String str2 = zzasd.zza(zzaseVar).zzb;
                if (!TextUtils.equals(str, str2)) {
                    zzarw.zzb("%s: key=%s, found=%s", fileZzf.getAbsolutePath(), str, str2);
                    zzo(str);
                    zzaseVar.close();
                    return null;
                }
                byte[] bArrZzg = zzg(zzaseVar, zzaseVar.zza());
                zzaqt zzaqtVar = new zzaqt();
                zzaqtVar.zza = bArrZzg;
                zzaqtVar.zzb = zzasdVar.zzc;
                zzaqtVar.zzc = zzasdVar.zzd;
                zzaqtVar.zzd = zzasdVar.zze;
                zzaqtVar.zze = zzasdVar.zzf;
                zzaqtVar.zzf = zzasdVar.zzg;
                List<zzarc> list = zzasdVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzarc zzarcVar : list) {
                    treeMap.put(zzarcVar.zza(), zzarcVar.zzb());
                }
                zzaqtVar.zzg = treeMap;
                zzaqtVar.zzh = Collections.unmodifiableList(list);
                zzaseVar.close();
                return zzaqtVar;
            } catch (Throwable th) {
                zzaseVar.close();
                throw th;
            }
        } catch (IOException e2) {
            zzarw.zzb("%s: %s", fileZzf.getAbsolutePath(), e2.toString());
            zze(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    public final synchronized void zzb(String str, zzaqt zzaqtVar) {
        try {
            long j = this.zzb;
            int length = zzaqtVar.zza.length;
            long j2 = j + ((long) length);
            int i2 = this.zzd;
            float f = 0.9f;
            if (j2 <= i2 || length <= i2 * 0.9f) {
                File fileZzf = zzf(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzf));
                    zzasd zzasdVar = new zzasd(str, zzaqtVar);
                    try {
                        zzh(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzasdVar.zzb);
                        String str2 = zzasdVar.zzc;
                        if (str2 == null) {
                            str2 = "";
                        }
                        zzl(bufferedOutputStream, str2);
                        zzj(bufferedOutputStream, zzasdVar.zzd);
                        zzj(bufferedOutputStream, zzasdVar.zze);
                        zzj(bufferedOutputStream, zzasdVar.zzf);
                        zzj(bufferedOutputStream, zzasdVar.zzg);
                        List<zzarc> list = zzasdVar.zzh;
                        if (list != null) {
                            zzh(bufferedOutputStream, list.size());
                            for (zzarc zzarcVar : list) {
                                zzl(bufferedOutputStream, zzarcVar.zza());
                                zzl(bufferedOutputStream, zzarcVar.zzb());
                            }
                        } else {
                            zzh(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzaqtVar.zza);
                        bufferedOutputStream.close();
                        zzasdVar.zza = fileZzf.length();
                        zzn(str, zzasdVar);
                        long j3 = this.zzb;
                        int i3 = this.zzd;
                        if (j3 >= i3) {
                            boolean z2 = zzarw.zzb;
                            if (z2) {
                                zzarw.zza("Pruning old cache entries.", new Object[0]);
                            }
                            long j4 = this.zzb;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i4 = 0;
                            while (it.hasNext()) {
                                zzasd zzasdVar2 = (zzasd) ((Map.Entry) it.next()).getValue();
                                String str3 = zzasdVar2.zzb;
                                if (zzf(str3).delete()) {
                                    this.zzb -= zzasdVar2.zza;
                                } else {
                                    zzarw.zzb("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                                }
                                it.remove();
                                i4++;
                                if (this.zzb < i3 * f) {
                                    break;
                                } else {
                                    f = f;
                                }
                            }
                            if (z2) {
                                zzarw.zza("pruned %d files, %d bytes, %d ms", Integer.valueOf(i4), Long.valueOf(this.zzb - j4), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e2) {
                        zzarw.zzb("%s", e2.toString());
                        bufferedOutputStream.close();
                        zzarw.zzb("Failed to write header for %s", fileZzf.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileZzf.delete()) {
                        zzarw.zzb("Could not clean up file %s", fileZzf.getAbsolutePath());
                    }
                    if (!this.zzc.zza().exists()) {
                        zzarw.zzb("Re-initializing cache after external clearing.", new Object[0]);
                        this.zza.clear();
                        this.zzb = 0L;
                        zzc();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    public final synchronized void zzc() {
        File fileZza = this.zzc.zza();
        if (fileZza.exists()) {
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        zzase zzaseVar = new zzase(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzasd zzasdVarZza = zzasd.zza(zzaseVar);
                            zzasdVarZza.zza = length;
                            zzn(zzasdVarZza.zzb, zzasdVarZza);
                            zzaseVar.close();
                        } catch (Throwable th) {
                            zzaseVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileZza.mkdirs()) {
            zzarw.zzc("Unable to create cache dir %s", fileZza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    public final synchronized void zzd(String str, boolean z2) {
        zzaqt zzaqtVarZza = zza(str);
        if (zzaqtVarZza != null) {
            zzaqtVarZza.zzf = 0L;
            zzaqtVarZza.zze = 0L;
            zzb(str, zzaqtVarZza);
        }
    }

    public final synchronized void zze(String str) {
        boolean zDelete = zzf(str).delete();
        zzo(str);
        if (zDelete) {
            return;
        }
        zzarw.zzb("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public final File zzf(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public zzasg(File file, int i2) {
        this.zzc = new zzasc(this, file);
    }
}
