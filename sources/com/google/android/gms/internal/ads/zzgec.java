package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgec {
    private MessageDigest zza;
    private final zzgnc zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private SecureRandom zze;

    public zzgec(zzgnc zzgncVar) {
        this.zzb = zzgncVar;
    }

    public final void zza() {
        if (zzc()) {
            return;
        }
        zzb(new SecureRandom());
    }

    public final synchronized void zzb(SecureRandom secureRandom) {
        zzgna zzgnaVarZza = this.zzb.zza(202);
        try {
            try {
                try {
                    zzgnaVarZza.zza();
                    this.zze = secureRandom;
                    this.zza = MessageDigest.getInstance("MD5");
                    this.zzd = true;
                } catch (NoSuchAlgorithmException e2) {
                    zzgnaVarZza.zzb(e2);
                }
                zzgnaVarZza.zzc();
            } catch (Throwable th) {
                zzgnaVarZza.zzb(th);
                throw th;
            }
        } catch (Throwable th2) {
            zzgnaVarZza.zzc();
            throw th2;
        }
    }

    public final synchronized boolean zzc() {
        return this.zzd;
    }

    public final byte[] zzd(byte[] bArr, String str, boolean z2) throws UnsupportedEncodingException {
        int length = bArr.length;
        int i2 = true != z2 ? 255 : 239;
        zzgqa.zza(length <= i2);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i2 + 1).put((byte) length);
        if (length < i2) {
            int i3 = i2 - length;
            byte[] bArr2 = new byte[i3];
            this.zze.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i3);
            System.arraycopy(bArr2, 0, bArr, length, i3);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z2) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzgef[] zzgefVarArr = new zzges().zzcG;
        int length2 = zzgefVarArr.length;
        for (int i4 = 0; i4 < 12; i4++) {
            zzgefVarArr[i4].zza(bArrArray, bArr3);
        }
        if (!zzgqr.zzc(str)) {
            new zzgee(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8)).zza(bArr3);
        }
        return bArr3;
    }

    public final byte[] zze(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.zzc) {
            this.zza.reset();
            this.zza.update(bArr);
            bArrDigest = this.zza.digest();
        }
        return bArrDigest;
    }

    public final zzaxf zzf(byte[] bArr, String str) throws UnsupportedEncodingException {
        zzaxf zzaxfVarZza = zzaxg.zza();
        byte[] bArrZze = zze(bArr);
        zzhzl zzhzlVar = zzhzl.zzb;
        zzaxfVarZza.zzb(zzhzl.zzs(bArrZze, 0, bArrZze.length));
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            int length = bArr.length;
            if (i2 >= ((length - 1) / 255) + 1) {
                break;
            }
            int i3 = i2 * 255;
            int i4 = i3 + 255;
            if (length > i4) {
                length = i4;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i3, length));
            i2++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzaxfVarZza.zza(zzhzl.zzs(zzd((byte[]) it.next(), str, false), 0, 256));
        }
        return zzaxfVarZza;
    }

    public final String zzg(int i2, String str) throws UnsupportedEncodingException {
        zzavs zzavsVarZzj = zzawp.zzj();
        zzavsVarZzj.zzl(i2);
        return Base64.encodeToString(zzd(((zzawp) zzavsVarZzj.zzbu()).zzaN(), str, true), 11);
    }
}
