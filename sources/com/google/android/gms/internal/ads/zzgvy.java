package com.google.android.gms.internal.ads;

import com.p004ironsource.dc;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgvy {
    private static final zzgvy zza;
    private static final zzgvy zzb;
    private static final zzgvy zzc;

    static {
        Character chValueOf = Character.valueOf(dc.T);
        zza = new zzgvv("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", chValueOf);
        zzb = new zzgvv("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", chValueOf);
        new zzgvx("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", chValueOf);
        new zzgvx("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", chValueOf);
        zzc = new zzgvu("base16()", "0123456789ABCDEF");
    }

    public static zzgvy zzl() {
        return zza;
    }

    public static zzgvy zzm() {
        return zzb;
    }

    public static zzgvy zzn() {
        return zzc;
    }

    public abstract void zza(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException;

    public abstract int zzb(byte[] bArr, CharSequence charSequence) throws zzgvw;

    public abstract int zzd(int i2);

    public abstract int zzf(int i2);

    public CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public abstract zzgvy zzh();

    public abstract zzgvy zzi();

    public final String zzj(byte[] bArr, int i2, int i3) {
        zzgqa.zzo(0, i3, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i3));
        try {
            zza(sb, bArr, 0, i3);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence charSequenceZzg = zzg(charSequence);
            int iZzf = zzf(charSequenceZzg.length());
            byte[] bArr = new byte[iZzf];
            int iZzb = zzb(bArr, charSequenceZzg);
            if (iZzb == iZzf) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZzb];
            System.arraycopy(bArr, 0, bArr2, 0, iZzb);
            return bArr2;
        } catch (zzgvw e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
