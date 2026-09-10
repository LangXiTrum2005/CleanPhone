package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fj extends l9.a {
    public static final Parcelable.Creator<fj> CREATOR = new gj(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ParcelFileDescriptor f14444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14448e;

    public fj(ParcelFileDescriptor parcelFileDescriptor, boolean z10, boolean z11, long j10, boolean z12) {
        this.f14444a = parcelFileDescriptor;
        this.f14445b = z10;
        this.f14446c = z11;
        this.f14447d = j10;
        this.f14448e = z12;
    }

    public final synchronized ParcelFileDescriptor.AutoCloseInputStream b() {
        if (this.f14444a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f14444a);
        this.f14444a = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean h() {
        return this.f14446c;
    }

    public final synchronized boolean m() {
        return this.f14448e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ParcelFileDescriptor parcelFileDescriptor;
        boolean z10;
        long j10;
        int iR = r9.b.R(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.f14444a;
        }
        r9.b.I(parcel, 2, parcelFileDescriptor, i10);
        synchronized (this) {
            z10 = this.f14445b;
        }
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean zH = h();
        r9.b.Q(parcel, 4, 4);
        parcel.writeInt(zH ? 1 : 0);
        synchronized (this) {
            j10 = this.f14447d;
        }
        r9.b.Q(parcel, 5, 8);
        parcel.writeLong(j10);
        boolean zM = m();
        r9.b.Q(parcel, 6, 4);
        parcel.writeInt(zM ? 1 : 0);
        r9.b.S(parcel, iR);
    }

    public final synchronized boolean zza() {
        return this.f14444a != null;
    }

    public fj() {
        this(null, false, false, 0L, false);
    }
}
