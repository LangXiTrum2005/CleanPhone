package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfw extends a {
    public static final Parcelable.Creator<zzfw> CREATOR = new zzfx();
    public final boolean zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzfw(boolean z10, boolean z11, boolean z12) {
        this.zza = z10;
        this.zzb = z11;
        this.zzc = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.zza;
        int iR = b.R(parcel, 20293);
        b.Q(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.zzb;
        b.Q(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.zzc;
        b.Q(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        b.S(parcel, iR);
    }

    public zzfw(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }
}
