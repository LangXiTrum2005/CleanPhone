package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfs implements zzao {
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    public zzfs(String str, byte[] bArr, int i2, int i3) {
        byte b2;
        byte b3;
        boolean z2 = true;
        switch (str) {
            case "com.android.capture.fps":
                b2 = 0;
                break;
            case "auxiliary.tracks.interleaved":
                b2 = 4;
                break;
            case "auxiliary.tracks.length":
                b2 = 2;
                break;
            case "auxiliary.tracks.offset":
                b2 = 1;
                break;
            case "auxiliary.tracks.map":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            if (i3 != 23) {
                z2 = false;
            } else if (bArr.length == 4) {
                i3 = 23;
            } else {
                i3 = 23;
                z2 = false;
            }
            zzgqa.zza(z2);
        } else if (b2 == 1 || b2 == 2) {
            if (i3 != 78) {
                z2 = false;
            } else if (bArr.length == 8) {
                i3 = 78;
            } else {
                i3 = 78;
                z2 = false;
            }
            zzgqa.zza(z2);
        } else if (b2 == 3) {
            zzgqa.zza(i3 == 0);
        } else if (b2 == 4) {
            if (i3 != 75) {
                z2 = false;
            } else if (bArr.length == 1 && ((b3 = bArr[0]) == 0 || b3 == 1)) {
                i3 = 75;
            } else {
                i3 = 75;
                z2 = false;
            }
            zzgqa.zza(z2);
        }
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfs.class == obj.getClass()) {
            zzfs zzfsVar = (zzfs) obj;
            if (this.zza.equals(zzfsVar.zza) && Arrays.equals(this.zzb, zzfsVar.zzb) && this.zzc == zzfsVar.zzc && this.zzd == zzfsVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        return ((((Arrays.hashCode(this.zzb) + (iHashCode * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code duplicated, block: B:25:0x0087 A[LOOP:0: B:23:0x0084->B:25:0x0087, LOOP_END] */
    public final String toString() {
        String string;
        byte[] bArr;
        StringBuilder sb;
        int i2 = this.zzd;
        if (i2 != 0) {
            if (i2 == 1) {
                string = zzfj.zzi(this.zzb);
            } else if (i2 == 23) {
                string = String.valueOf(Float.intBitsToFloat(zzgwx.zzd(this.zzb)));
            } else if (i2 == 67) {
                string = String.valueOf(zzgwx.zzd(this.zzb));
            } else if (i2 == 75) {
                string = String.valueOf(this.zzb[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            } else if (i2 != 78) {
                bArr = this.zzb;
                String str = zzfj.zza;
                int length = bArr.length;
                sb = new StringBuilder(length + length);
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    sb.append(Character.forDigit((bArr[i3] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i3] & 15, 16));
                }
                string = sb.toString();
            } else {
                string = String.valueOf(new zzer(this.zzb).zzJ());
            }
        } else if (this.zza.equals("auxiliary.tracks.map")) {
            List listZzb = zzb();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("track types = ");
            zzgpu.zzb(sb2, listZzb, ",");
            string = sb2.toString();
        } else {
            bArr = this.zzb;
            String str2 = zzfj.zza;
            int length2 = bArr.length;
            sb = new StringBuilder(length2 + length2);
            while (i3 < bArr.length) {
                sb.append(Character.forDigit((bArr[i3] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i3] & 15, 16));
            }
            string = sb.toString();
        }
        String str3 = this.zza;
        return androidx.media3.extractor.text.ttml.a.q(new StringBuilder(String.valueOf(str3).length() + 18 + String.valueOf(string).length()), "mdta: key=", str3, ", value=", string);
    }

    public final List zzb() {
        zzgqa.zzj(this.zza.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.zzb;
        byte b2 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < b2; i2++) {
            arrayList.add(Integer.valueOf(bArr[i2 + 2]));
        }
        return arrayList;
    }
}
