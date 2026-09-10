package com.google.android.gms.internal.ads;

import android.text.Layout;
import com.applovin.impl.Z;

/* JADX INFO: loaded from: classes4.dex */
final class zzano {
    public CharSequence zzc;
    public long zza = 0;
    public long zzb = 0;
    public int zzd = 2;
    public float zze = -3.4028235E38f;
    public int zzf = 1;
    public int zzg = 0;
    public float zzh = -3.4028235E38f;
    public int zzi = Integer.MIN_VALUE;
    public float zzj = 1.0f;
    public int zzk = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    public final zzcw zza() {
        Layout.Alignment alignment;
        float f = this.zzh;
        float f2 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i2 = this.zzd;
            if (i2 != 4) {
                f = i2 != 5 ? 0.5f : 1.0f;
            } else {
                f = 0.0f;
            }
        }
        int i3 = this.zzi;
        if (i3 == Integer.MIN_VALUE) {
            int i4 = this.zzd;
            if (i4 == 1) {
                i3 = 0;
            } else if (i4 == 3) {
                i3 = 2;
            } else if (i4 == 4) {
                i3 = 0;
            } else if (i4 != 5) {
                i3 = 1;
            } else {
                i3 = 2;
            }
        }
        zzcw zzcwVar = new zzcw();
        int i5 = this.zzd;
        if (i5 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i5 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i5 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i5 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i5 != 5) {
            Z.w(new StringBuilder(String.valueOf(i5).length() + 23), "Unknown textAlignment: ", i5, "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        zzcwVar.zzd(alignment);
        float f3 = this.zze;
        int i6 = this.zzf;
        if (f3 != -3.4028235E38f && i6 == 0 && (f3 < 0.0f || f3 > 1.0f)) {
            f2 = 1.0f;
        } else if (f3 != -3.4028235E38f) {
            f2 = f3;
        } else if (i6 == 0) {
            f2 = 1.0f;
        }
        zzcwVar.zzf(f2, i6);
        zzcwVar.zzg(this.zzg);
        zzcwVar.zzi(f);
        zzcwVar.zzj(i3);
        float f4 = this.zzj;
        if (i3 == 0) {
            f = 1.0f - f;
        } else if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException(String.valueOf(i3));
            }
        } else if (f <= 0.5f) {
            f += f;
        } else {
            float f5 = 1.0f - f;
            f = f5 + f5;
        }
        zzcwVar.zzm(Math.min(f4, f));
        zzcwVar.zzo(this.zzk);
        CharSequence charSequence = this.zzc;
        if (charSequence != null) {
            zzcwVar.zza(charSequence);
        }
        return zzcwVar;
    }
}
