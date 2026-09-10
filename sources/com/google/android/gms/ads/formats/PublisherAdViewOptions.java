package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcl;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class PublisherAdViewOptions extends a {

    @NonNull
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzcl f10705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f10706c;

    public PublisherAdViewOptions(boolean z10, IBinder iBinder, IBinder iBinder2) {
        this.f10704a = z10;
        this.f10705b = iBinder != null ? zzck.zzd(iBinder) : null;
        this.f10706c = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iR = b.R(parcel, 20293);
        b.Q(parcel, 1, 4);
        parcel.writeInt(this.f10704a ? 1 : 0);
        zzcl zzclVar = this.f10705b;
        b.F(parcel, 2, zzclVar == null ? null : zzclVar.asBinder());
        b.F(parcel, 3, this.f10706c);
        b.S(parcel, iR);
    }

    public final boolean zza() {
        return this.f10704a;
    }

    @Nullable
    public final zzcl zzb() {
        return this.f10705b;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Deprecated
    public static final class Builder {
        @NonNull
        public Builder setShouldDelayBannerRenderingListener(@NonNull ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            return this;
        }
    }
}
