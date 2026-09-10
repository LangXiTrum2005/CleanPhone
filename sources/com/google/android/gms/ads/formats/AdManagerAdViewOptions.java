package com.google.android.gms.ads.formats;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class AdManagerAdViewOptions extends a {

    @NonNull
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10688a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10689a = false;

        @NonNull
        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this);
        }

        @NonNull
        public Builder setManualImpressionsEnabled(boolean z10) {
            this.f10689a = z10;
            return this;
        }
    }

    public AdManagerAdViewOptions(Builder builder) {
        this.f10688a = builder.f10689a;
    }

    public boolean getManualImpressionsEnabled() {
        return this.f10688a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iR = b.R(parcel, 20293);
        boolean manualImpressionsEnabled = getManualImpressionsEnabled();
        b.Q(parcel, 1, 4);
        parcel.writeInt(manualImpressionsEnabled ? 1 : 0);
        b.S(parcel, iR);
    }

    public AdManagerAdViewOptions(boolean z10) {
        this.f10688a = z10;
    }
}
