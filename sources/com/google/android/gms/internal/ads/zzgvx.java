package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.dc;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
class zzgvx extends zzgvy {
    private volatile zzgvy zza;
    final zzgvt zzb;
    final Character zzc;

    public zzgvx(zzgvt zzgvtVar, Character ch) {
        this.zzb = zzgvtVar;
        boolean z2 = true;
        if (ch != null && zzgvtVar.zze(dc.T)) {
            z2 = false;
        }
        zzgqa.zzf(z2, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgvx) {
            zzgvx zzgvxVar = (zzgvx) obj;
            if (this.zzb.equals(zzgvxVar.zzb) && Objects.equals(this.zzc, zzgvxVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        zzgvt zzgvtVar = this.zzb;
        sb.append(zzgvtVar);
        if (8 % zzgvtVar.zzb != 0) {
            Character ch = this.zzc;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public void zza(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        zzgqa.zzo(0, i3, bArr.length);
        while (i4 < i3) {
            int i5 = this.zzb.zzd;
            zze(appendable, bArr, i4, Math.min(i5, i3 - i4));
            i4 += i5;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public int zzb(byte[] bArr, CharSequence charSequence) throws zzgvw {
        int i2;
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgvt zzgvtVar = this.zzb;
        if (!zzgvtVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            throw new zzgvw(androidx.datastore.preferences.protobuf.a.g(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < charSequenceZzg.length()) {
            long jZzc = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i2 = zzgvtVar.zzc;
                if (i5 >= i2) {
                    break;
                }
                jZzc <<= zzgvtVar.zzb;
                if (i3 + i5 < charSequenceZzg.length()) {
                    jZzc |= (long) zzgvtVar.zzc(charSequenceZzg.charAt(i6 + i3));
                    i6++;
                }
                i5++;
            }
            int i7 = zzgvtVar.zzd;
            int i8 = i6 * zzgvtVar.zzb;
            int i9 = (i7 - 1) * 8;
            while (i9 >= (i7 * 8) - i8) {
                bArr[i4] = (byte) ((jZzc >>> i9) & 255);
                i9 -= 8;
                i4++;
            }
            i3 += i2;
        }
        return i4;
    }

    public zzgvy zzc(zzgvt zzgvtVar, Character ch) {
        return new zzgvx(zzgvtVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final int zzd(int i2) {
        zzgvt zzgvtVar = this.zzb;
        return zzgvtVar.zzc * zzgwq.zzb(i2, zzgvtVar.zzd, RoundingMode.CEILING);
    }

    public final void zze(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        zzgqa.zzo(i2, i2 + i3, bArr.length);
        zzgvt zzgvtVar = this.zzb;
        int i4 = zzgvtVar.zzd;
        int i5 = 0;
        zzgqa.zza(i3 <= i4);
        long j = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            j = (j | ((long) (bArr[i2 + i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) << 8;
        }
        int i7 = (i3 + 1) * 8;
        int i8 = zzgvtVar.zzb;
        while (i5 < i3 * 8) {
            appendable.append(zzgvtVar.zza(zzgvtVar.zza & ((int) (j >>> ((i7 - i8) - i5)))));
            i5 += i8;
        }
        if (this.zzc != null) {
            while (i5 < i4 * 8) {
                appendable.append(dc.T);
                i5 += i8;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final int zzf(int i2) {
        return (int) (((((long) this.zzb.zzb) * ((long) i2)) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final zzgvy zzh() {
        return this.zzc == null ? this : zzc(this.zzb, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final zzgvy zzi() {
        zzgvy zzgvyVarZzc = this.zza;
        if (zzgvyVarZzc == null) {
            zzgvt zzgvtVar = this.zzb;
            zzgvt zzgvtVarZzd = zzgvtVar.zzd();
            zzgvyVarZzc = zzgvtVarZzd == zzgvtVar ? this : zzc(zzgvtVarZzd, this.zzc);
            this.zza = zzgvyVarZzc;
        }
        return zzgvyVarZzc;
    }

    public zzgvx(String str, String str2, Character ch) {
        this(new zzgvt(str, str2.toCharArray()), ch);
    }
}
