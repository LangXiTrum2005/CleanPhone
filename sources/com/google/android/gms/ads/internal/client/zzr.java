package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.applovin.impl.ca;
import com.google.android.gms.ads.AdSize;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzr extends a {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final zzr[] zzg;
    public final boolean zzh;
    public final boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public boolean zzl;
    public boolean zzm;
    public boolean zzn;
    public boolean zzo;
    public boolean zzp;

    /* JADX WARN: Code duplicated, block: B:37:0x00f0  */
    public zzr(Context context, AdSize[] adSizeArr) {
        int height;
        int i10;
        int i11;
        String string;
        int dimensionPixelSize;
        AdSize adSize = adSizeArr[0];
        this.zzd = false;
        boolean zIsFluid = adSize.isFluid();
        this.zzi = zIsFluid;
        this.zzm = com.google.android.gms.ads.zzc.zzf(adSize);
        this.zzn = com.google.android.gms.ads.zzc.zzg(adSize);
        this.zzo = com.google.android.gms.ads.zzc.zzd(adSize);
        this.zzp = com.google.android.gms.ads.zzc.zzi(adSize);
        if (zIsFluid) {
            AdSize adSize2 = AdSize.BANNER;
            this.zze = adSize2.getWidth();
            height = adSize2.getHeight();
            this.zzb = height;
        } else if (this.zzn) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzc.zzh(adSize);
            this.zzb = height;
        } else if (this.zzo) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzc.zze(adSize);
            this.zzb = height;
        } else {
            this.zze = adSize.getWidth();
            height = adSize.getHeight();
            this.zzb = height;
        }
        boolean z10 = this.zze == -1;
        boolean z11 = height == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z10) {
            zzay.zza();
            if (context.getResources().getConfiguration().orientation != 2) {
                dimensionPixelSize = displayMetrics.widthPixels;
                this.zzf = dimensionPixelSize;
            } else {
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (((int) (displayMetrics2.heightPixels / displayMetrics2.density)) < 600) {
                    zzay.zza();
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i12 = displayMetrics3.heightPixels;
                        int i13 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i14 = displayMetrics3.heightPixels;
                        int i15 = displayMetrics3.widthPixels;
                        if (i14 == i12 && i15 == i13) {
                            int i16 = displayMetrics.widthPixels;
                            zzay.zza();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            dimensionPixelSize = i16 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.zzf = dimensionPixelSize;
                        } else {
                            dimensionPixelSize = displayMetrics.widthPixels;
                            this.zzf = dimensionPixelSize;
                        }
                    } else {
                        dimensionPixelSize = displayMetrics.widthPixels;
                        this.zzf = dimensionPixelSize;
                    }
                } else {
                    dimensionPixelSize = displayMetrics.widthPixels;
                    this.zzf = dimensionPixelSize;
                }
            }
            double d10 = dimensionPixelSize / displayMetrics.density;
            i10 = (int) d10;
            if (d10 - ((double) i10) >= 0.01d) {
                i10++;
            }
        } else {
            i10 = this.zze;
            zzay.zza();
            this.zzf = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, this.zze);
        }
        if (z11) {
            int i17 = (int) (displayMetrics.heightPixels / displayMetrics.density);
            i11 = i17 <= 400 ? 32 : i17 <= 720 ? 50 : 90;
        } else {
            i11 = this.zzb;
        }
        zzay.zza();
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, i11);
        if (z10 || z11) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + ca.e(i10, 1) + 3);
            sb2.append(i10);
            sb2.append("x");
            sb2.append(i11);
            sb2.append("_as");
            this.zza = sb2.toString();
        } else {
            if (this.zzn || this.zzo) {
                int i18 = this.zze;
                int i19 = this.zzb;
                StringBuilder sb3 = new StringBuilder(String.valueOf(i19).length() + ca.e(i18, 1) + 3);
                sb3.append(i18);
                sb3.append("x");
                sb3.append(i19);
                sb3.append("_as");
                string = sb3.toString();
            } else if (zIsFluid) {
                string = "320x50_mb";
            } else {
                this.zza = adSize.toString();
            }
            this.zza = string;
        }
        int length = adSizeArr.length;
        if (length > 1) {
            this.zzg = new zzr[length];
            for (int i20 = 0; i20 < adSizeArr.length; i20++) {
                this.zzg[i20] = new zzr(context, adSizeArr[i20]);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    public static int zza(DisplayMetrics displayMetrics) {
        int i10;
        float f10 = displayMetrics.heightPixels;
        float f11 = displayMetrics.density;
        int i11 = (int) (f10 / f11);
        if (i11 <= 400) {
            i10 = 32;
        } else {
            i10 = i11 <= 720 ? 50 : 90;
        }
        return (int) (i10 * f11);
    }

    public static zzr zzb() {
        return new zzr("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false, false);
    }

    public static zzr zzc() {
        return new zzr("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
    }

    public static zzr zzd() {
        return new zzr("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iR = b.R(parcel, 20293);
        b.J(parcel, 2, str);
        int i11 = this.zzb;
        b.Q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.zzc;
        b.Q(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z10 = this.zzd;
        b.Q(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i13 = this.zze;
        b.Q(parcel, 6, 4);
        parcel.writeInt(i13);
        int i14 = this.zzf;
        b.Q(parcel, 7, 4);
        parcel.writeInt(i14);
        b.N(parcel, 8, this.zzg, i10);
        boolean z11 = this.zzh;
        b.Q(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.zzi;
        b.Q(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        boolean z13 = this.zzj;
        b.Q(parcel, 11, 4);
        parcel.writeInt(z13 ? 1 : 0);
        boolean z14 = this.zzk;
        b.Q(parcel, 12, 4);
        parcel.writeInt(z14 ? 1 : 0);
        boolean z15 = this.zzl;
        b.Q(parcel, 13, 4);
        parcel.writeInt(z15 ? 1 : 0);
        boolean z16 = this.zzm;
        b.Q(parcel, 14, 4);
        parcel.writeInt(z16 ? 1 : 0);
        boolean z17 = this.zzn;
        b.Q(parcel, 15, 4);
        parcel.writeInt(z17 ? 1 : 0);
        boolean z18 = this.zzo;
        b.Q(parcel, 16, 4);
        parcel.writeInt(z18 ? 1 : 0);
        boolean z19 = this.zzp;
        b.Q(parcel, 17, 4);
        parcel.writeInt(z19 ? 1 : 0);
        b.S(parcel, iR);
    }

    public zzr(String str, int i10, int i11, boolean z10, int i12, int i13, zzr[] zzrVarArr, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = z10;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = zzrVarArr;
        this.zzh = z11;
        this.zzi = z12;
        this.zzj = z13;
        this.zzk = z14;
        this.zzl = z15;
        this.zzm = z16;
        this.zzn = z17;
        this.zzo = z18;
        this.zzp = z19;
    }

    public zzr() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
    }

    public zzr(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }
}
