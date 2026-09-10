package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.applovin.impl.Z;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzand implements zzaly {
    private final zzer zza = new zzer();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzand(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = "sans-serif";
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[27] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[29] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        this.zze = true == "Serif".equals(zzfj.zzj(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i2 = bArr[25] * 20;
        this.zzg = i2;
        boolean z2 = (bArr[0] & 32) != 0;
        this.zzb = z2;
        if (z2) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) / i2, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            int i7 = i6 | 33;
            int i8 = i2 & 1;
            int i9 = i2 & 2;
            boolean z2 = true;
            if (i8 != 0) {
                if (i9 != 0) {
                    androidx.datastore.preferences.protobuf.a.t(3, spannableStringBuilder, i4, i5, i7);
                } else {
                    androidx.datastore.preferences.protobuf.a.t(1, spannableStringBuilder, i4, i5, i7);
                    z2 = false;
                }
            } else if (i9 != 0) {
                androidx.datastore.preferences.protobuf.a.t(2, spannableStringBuilder, i4, i5, i7);
            } else {
                z2 = false;
            }
            if ((i2 & 4) != 0) {
                androidx.datastore.preferences.protobuf.a.w(spannableStringBuilder, i4, i5, i7);
            } else {
                if (i8 != 0 || z2) {
                    return;
                }
                androidx.datastore.preferences.protobuf.a.t(0, spannableStringBuilder, i4, i5, i7);
            }
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i2 >>> 8) | ((i2 & 255) << 24)), i4, i5, i6 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(byte[] bArr, int i2, int i3, zzalx zzalxVar, zzdr zzdrVar) {
        String strZzK;
        int i4;
        int i5;
        int i6;
        int i7;
        SpannableStringBuilder spannableStringBuilder;
        int i8;
        int i9;
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i2 + i3);
        zzerVar.zzh(i2);
        int i10 = 1;
        int i11 = 0;
        int i12 = 2;
        zzgqa.zza(zzerVar.zzd() >= 2);
        int iZzt = zzerVar.zzt();
        if (iZzt == 0) {
            strZzK = "";
        } else {
            int iZzg = zzerVar.zzg();
            Charset charsetZzR = zzerVar.zzR();
            int iZzg2 = zzerVar.zzg() - iZzg;
            if (charsetZzR == null) {
                charsetZzR = StandardCharsets.UTF_8;
            }
            strZzK = zzerVar.zzK(iZzt - iZzg2, charsetZzR);
        }
        if (strZzK.isEmpty()) {
            zzdrVar.zza(new zzalq(zzgtd.zzi(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strZzK);
        int i13 = this.zzc;
        zzb(spannableStringBuilder2, i13, 0, 0, spannableStringBuilder2.length(), 16711680);
        int i14 = i13;
        int i15 = this.zzd;
        zzc(spannableStringBuilder2, i15, -1, 0, spannableStringBuilder2.length(), 16711680);
        int i16 = i15;
        String str = this.zze;
        int length = spannableStringBuilder2.length();
        if (str != "sans-serif") {
            spannableStringBuilder2.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fMax = this.zzf;
        while (zzerVar.zzd() >= 8) {
            int iZzg3 = zzerVar.zzg();
            int iZzB = zzerVar.zzB();
            int iZzB2 = zzerVar.zzB();
            if (iZzB2 == 1937013100) {
                zzgqa.zza(zzerVar.zzd() >= i12 ? i10 : i11);
                int iZzt2 = zzerVar.zzt();
                int i17 = i11;
                while (i17 < iZzt2) {
                    zzgqa.zza(zzerVar.zzd() >= 12 ? i10 : i11);
                    int iZzt3 = zzerVar.zzt();
                    int iZzt4 = zzerVar.zzt();
                    zzerVar.zzk(i12);
                    int i18 = iZzt2;
                    int iZzs = zzerVar.zzs();
                    zzerVar.zzk(i10);
                    int iZzB3 = zzerVar.zzB();
                    int i19 = i10;
                    if (iZzt4 > spannableStringBuilder2.length()) {
                        int length2 = spannableStringBuilder2.length();
                        spannableStringBuilder = spannableStringBuilder2;
                        StringBuilder sb = new StringBuilder(Z.d(String.valueOf(length2), String.valueOf(iZzt4).length() + 44, 2));
                        sb.append("Truncating styl end (");
                        sb.append(iZzt4);
                        sb.append(") to cueText.length() (");
                        sb.append(length2);
                        sb.append(").");
                        zzee.zzc("Tx3gParser", sb.toString());
                        iZzt4 = spannableStringBuilder.length();
                    } else {
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                    if (iZzt3 >= iZzt4) {
                        StringBuilder sb2 = new StringBuilder(Z.d(String.valueOf(iZzt4), String.valueOf(iZzt3).length() + 36, 2));
                        sb2.append("Ignoring styl with start (");
                        sb2.append(iZzt3);
                        sb2.append(") >= end (");
                        sb2.append(iZzt4);
                        sb2.append(").");
                        zzee.zzc("Tx3gParser", sb2.toString());
                        i8 = i14;
                        spannableStringBuilder2 = spannableStringBuilder;
                        i9 = i16;
                    } else {
                        spannableStringBuilder2 = spannableStringBuilder;
                        int i20 = i14;
                        zzb(spannableStringBuilder2, iZzs, i20, iZzt3, iZzt4, 0);
                        i8 = i20;
                        i9 = i16;
                        zzc(spannableStringBuilder2, iZzB3, i9, iZzt3, iZzt4, 0);
                    }
                    iZzt2 = i18;
                    i14 = i8;
                    i16 = i9;
                    i12 = 2;
                    i10 = i19;
                    i17++;
                    i11 = 0;
                }
                i4 = i10;
                i5 = i16;
                i6 = i14;
                i7 = i12;
            } else {
                i4 = i10;
                i5 = i16;
                i6 = i14;
                if (iZzB2 == 1952608120 && this.zzb) {
                    i7 = 2;
                    zzgqa.zza(zzerVar.zzd() >= 2 ? i4 : 0);
                    float fZzt = zzerVar.zzt();
                    int i21 = this.zzg;
                    String str2 = zzfj.zza;
                    fMax = Math.max(0.0f, Math.min(fZzt / i21, 0.95f));
                } else {
                    i7 = 2;
                }
            }
            zzerVar.zzh(iZzg3 + iZzB);
            i14 = i6;
            i12 = i7;
            i16 = i5;
            i11 = 0;
            i10 = i4;
        }
        zzcw zzcwVar = new zzcw();
        zzcwVar.zza(spannableStringBuilder2);
        zzcwVar.zzf(fMax, 0);
        zzcwVar.zzg(0);
        zzdrVar.zza(new zzalq(zzgtd.zzj(zzcwVar.zzr()), -9223372036854775807L, -9223372036854775807L));
    }
}
