package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xw extends l9.a {
    public static final Parcelable.Creator<xw> CREATOR = new gj(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f22009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f22010b;

    public xw(IBinder iBinder, IBinder iBinder2) {
        this.f22009a = (View) s9.b.y1(s9.b.x1(iBinder));
        this.f22010b = (Map) s9.b.y1(s9.b.x1(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.F(parcel, 1, new s9.b(this.f22009a));
        r9.b.F(parcel, 2, new s9.b(this.f22010b));
        r9.b.S(parcel, iR);
    }
}
