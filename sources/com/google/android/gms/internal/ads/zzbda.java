package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbda {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzbdp zze;
    private final zzbdw zzf;
    private int zzn;
    private final Object zzg = new Object();
    private final ArrayList zzh = new ArrayList();
    private final ArrayList zzi = new ArrayList();
    private final ArrayList zzj = new ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    public zzbda(int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z2) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = z2;
        this.zze = new zzbdp(i5);
        this.zzf = new zzbdw(i6, i7, i8);
    }

    private final void zzm(String str, boolean z2, float f, float f2, float f3, float f4) {
        if (str != null) {
            if (str.length() < this.zzc) {
                return;
            }
            synchronized (this.zzg) {
                try {
                    this.zzh.add(str);
                    this.zzk += str.length();
                    if (z2) {
                        ArrayList arrayList = this.zzi;
                        arrayList.add(str);
                        this.zzj.add(new zzbdl(f, f2, f3, f4, arrayList.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final String zzn(ArrayList arrayList, int i2) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            sb.append((String) arrayList.get(i3));
            sb.append(' ');
            i3++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbda)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzbda) obj).zzo;
        return str != null && str.equals(this.zzo);
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.zzh;
        int i2 = this.zzl;
        int i3 = this.zzn;
        int i4 = this.zzk;
        String strZzn = zzn(arrayList, 100);
        String strZzn2 = zzn(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        int length = String.valueOf(i2).length();
        int length2 = String.valueOf(i3).length();
        int length3 = String.valueOf(i4).length();
        int length4 = String.valueOf(strZzn).length();
        int length5 = String.valueOf(strZzn2).length();
        int length6 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + length6 + 20 + String.valueOf(str2).length() + 32 + String.valueOf(str3).length());
        androidx.datastore.preferences.protobuf.a.z(sb, "ActivityContent fetchId: ", i2, " score:", i3);
        sb.append(" total_length:");
        sb.append(i4);
        sb.append("\n text: ");
        sb.append(strZzn);
        androidx.media3.extractor.text.ttml.a.C(sb, "\n viewableText", strZzn2, "\n signture: ", str);
        return androidx.media3.extractor.text.ttml.a.q(sb, "\n viewableSignture: ", str2, "\n viewableSignatureForVertical: ", str3);
    }

    public final boolean zza() {
        boolean z2;
        synchronized (this.zzg) {
            z2 = this.zzm == 0;
        }
        return z2;
    }

    public final String zzb() {
        return this.zzo;
    }

    public final String zzc() {
        return this.zzq;
    }

    public final void zzd() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zze() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzf(String str, boolean z2, float f, float f2, float f3, float f4) {
        zzm(str, z2, f, f2, f3, f4);
        synchronized (this.zzg) {
            try {
                if (this.zzm < 0) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("ActivityContent: negative number of WebViews.");
                }
                zzi();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg(String str, boolean z2, float f, float f2, float f3, float f4) {
        zzm(str, z2, f, f2, f3, f4);
    }

    public final void zzh() {
        synchronized (this.zzg) {
            try {
                int iZzj = zzj(this.zzk, this.zzl);
                if (iZzj > this.zzn) {
                    this.zzn = iZzj;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzi() {
        synchronized (this.zzg) {
            try {
                int iZzj = zzj(this.zzk, this.zzl);
                if (iZzj > this.zzn) {
                    this.zzn = iZzj;
                    if (!com.google.android.gms.ads.internal.zzt.zzh().zzo().zzc()) {
                        zzbdp zzbdpVar = this.zze;
                        this.zzo = zzbdpVar.zza(this.zzh);
                        this.zzp = zzbdpVar.zza(this.zzi);
                    }
                    if (!com.google.android.gms.ads.internal.zzt.zzh().zzo().zze()) {
                        this.zzq = this.zzf.zza(this.zzi, this.zzj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zzj(int i2, int i3) {
        if (this.zzd) {
            return this.zzb;
        }
        return (i3 * this.zzb) + (i2 * this.zza);
    }

    public final void zzk(int i2) {
        this.zzl = i2;
    }

    public final int zzl() {
        return this.zzk;
    }
}
