package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class zzaxp {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static void zza() {
        synchronized (zzf) {
            try {
                if (!zza) {
                    zza = true;
                    new Thread(new zzaxo(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String zzb(byte[] bArr, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        zzaxf zzaxfVarZzc = zzc(bArr, str);
        return zzaxj.zza(zzaxfVarZzc == null ? zzh(zzg(4096).zzaN(), str, true) : ((zzaxg) zzaxfVarZzc.zzbu()).zzaN(), true);
    }

    public static zzaxf zzc(byte[] bArr, String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Vector vectorZzd = zzd(bArr, 255);
        if (vectorZzd == null || vectorZzd.isEmpty()) {
            return null;
        }
        zzaxf zzaxfVarZza = zzaxg.zza();
        int size = vectorZzd.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzaxfVarZza.zza(zzhzl.zzs(zzh((byte[]) vectorZzd.get(i2), str, false), 0, 256));
        }
        byte[] bArrZze = zze(bArr);
        zzhzl zzhzlVar = zzhzl.zzb;
        zzaxfVarZza.zzb(zzhzl.zzs(bArrZze, 0, bArrZze.length));
        return zzaxfVarZza;
    }

    public static Vector zzd(byte[] bArr, int i2) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i3 = length + 254;
        Vector vector = new Vector();
        for (int i4 = 0; i4 < i3 / 255; i4++) {
            int i5 = i4 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i5 > 255) {
                    length2 = i5 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i5, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static byte[] zze(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (zze) {
            try {
                zza();
                MessageDigest messageDigest2 = null;
                try {
                    if (zzb.await(2L, TimeUnit.SECONDS) && (messageDigest = zzd) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = zzd.digest();
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrDigest;
    }

    public static zzawp zzg(int i2) {
        zzavs zzavsVarZzj = zzawp.zzj();
        zzavsVarZzj.zzl(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        return (zzawp) zzavsVarZzj.zzbu();
    }

    private static byte[] zzh(byte[] bArr, String str, boolean z2) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArrArray;
        int length = bArr.length;
        int i2 = true != z2 ? 255 : 239;
        if (length > i2) {
            bArr = zzg(4096).zzaN();
        }
        int i3 = i2 + 1;
        int length2 = bArr.length;
        byte b2 = (byte) length2;
        if (length2 < i2) {
            byte[] bArr2 = new byte[i2 - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i3).put(b2).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i3).put(b2).put(bArr).array();
        }
        if (z2) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzaxq[] zzaxqVarArr = new zzayd().zzcG;
        int length3 = zzaxqVarArr.length;
        for (int i4 = 0; i4 < 12; i4++) {
            zzaxqVarArr[i4].zza(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzaxh(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
