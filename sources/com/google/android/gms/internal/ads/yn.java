package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yn extends qh implements mo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f22313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f22314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f22315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f22318f;

    public yn(Drawable drawable, Uri uri, double d10, int i10, int i11, HashMap map) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.f22313a = drawable;
        this.f22314b = uri;
        this.f22315c = d10;
        this.f22316d = i10;
        this.f22317e = i11;
        this.f22318f = map;
    }

    public static mo x1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof mo ? (mo) iInterfaceQueryLocalInterface : new lo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 1:
                s9.a aVarZzb = zzb();
                parcel2.writeNoException();
                rh.e(parcel2, aVarZzb);
                return true;
            case 2:
                parcel2.writeNoException();
                rh.d(parcel2, this.f22314b);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeDouble(this.f22315c);
                return true;
            case 4:
                parcel2.writeNoException();
                parcel2.writeInt(this.f22316d);
                return true;
            case 5:
                parcel2.writeNoException();
                parcel2.writeInt(this.f22317e);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeMap(this.f22318f);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.mo
    public final s9.a zzb() {
        return new s9.b(this.f22313a);
    }

    @Override // com.google.android.gms.internal.ads.mo
    public final Uri zzc() {
        return this.f22314b;
    }

    @Override // com.google.android.gms.internal.ads.mo
    public final double zzd() {
        return this.f22315c;
    }

    @Override // com.google.android.gms.internal.ads.mo
    public final int zze() {
        return this.f22316d;
    }

    @Override // com.google.android.gms.internal.ads.mo
    public final int zzf() {
        return this.f22317e;
    }

    @Override // com.google.android.gms.internal.ads.mo
    public final Map zzg() {
        return this.f22318f;
    }
}
