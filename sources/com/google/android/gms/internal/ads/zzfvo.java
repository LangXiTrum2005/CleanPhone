package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import com.google.android.gms.common.util.IOUtils;
import com.smartdigimkt.o1.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfvo {
    private final zzbby zza;
    private final File zzb;
    private final File zzc;
    private final File zzd;
    private byte[] zze;

    public zzfvo(zzbby zzbbyVar, File file, File file2, File file3) {
        this.zza = zzbbyVar;
        this.zzb = file;
        this.zzc = file3;
        this.zzd = file2;
    }

    public final zzbby zza() {
        return this.zza;
    }

    public final File zzb() {
        return this.zzb;
    }

    public final File zzc() {
        return this.zzc;
    }

    public final byte[] zzd() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrZzy;
        FileInputStream fileInputStream2 = null;
        if (this.zze == null) {
            try {
                fileInputStream = new FileInputStream(this.zzd);
                try {
                    zzhzl zzhzlVar = zzhzl.zzb;
                    ArrayList arrayList = new ArrayList();
                    int iMin = 256;
                    while (true) {
                        byte[] bArr = new byte[iMin];
                        int i2 = 0;
                        while (i2 < iMin) {
                            int i3 = fileInputStream.read(bArr, i2, iMin - i2);
                            if (i3 == -1) {
                                break;
                            }
                            i2 += i3;
                        }
                        zzhzl zzhzlVarZzs = i2 == 0 ? null : zzhzl.zzs(bArr, 0, i2);
                        if (zzhzlVarZzs == null) {
                            break;
                        }
                        arrayList.add(zzhzlVarZzs);
                        iMin = Math.min(iMin + iMin, Segment.SIZE);
                    }
                    bArrZzy = zzhzl.zzw(arrayList).zzy();
                    IOUtils.closeQuietly(fileInputStream);
                } catch (IOException unused) {
                    IOUtils.closeQuietly(fileInputStream);
                    bArrZzy = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    IOUtils.closeQuietly(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.zze = bArrZzy;
        }
        byte[] bArr2 = this.zze;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }

    public final boolean zze(long j) {
        return this.zza.zzc() - (System.currentTimeMillis() / 1000) < b.f37307P;
    }
}
