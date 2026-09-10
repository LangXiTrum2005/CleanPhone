package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.auth.i;
import eb.d0;
import j9.o;
import j9.r;
import java.util.Arrays;
import k9.c0;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends a implements o, ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f11656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConnectionResult f11657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Status f11649e = new Status(0, null, null, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Status f11650f = new Status(14, null, null, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Status f11651g = new Status(8, null, null, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Status f11652h = new Status(15, null, null, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Status f11653i = new Status(16, null, null, null);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new r(3);

    public Status(int i10, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f11654a = i10;
        this.f11655b = str;
        this.f11656c = pendingIntent;
        this.f11657d = connectionResult;
    }

    public final boolean b() {
        return this.f11654a <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f11654a == status.f11654a && c0.l(this.f11655b, status.f11655b) && c0.l(this.f11656c, status.f11656c) && c0.l(this.f11657d, status.f11657d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11654a), this.f11655b, this.f11656c, this.f11657d});
    }

    public final String toString() {
        d0 d0Var = new d0(this);
        String strY = this.f11655b;
        if (strY == null) {
            strY = i.y(this.f11654a);
        }
        d0Var.P0(strY, "statusCode");
        d0Var.P0(this.f11656c, "resolution");
        return d0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = b.R(parcel, 20293);
        b.Q(parcel, 1, 4);
        parcel.writeInt(this.f11654a);
        b.J(parcel, 2, this.f11655b);
        b.I(parcel, 3, this.f11656c, i10);
        b.I(parcel, 4, this.f11657d, i10);
        b.S(parcel, iR);
    }

    @Override // j9.o
    public final Status getStatus() {
        return this;
    }
}
