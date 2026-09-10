package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j9.r;
import k9.c0;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new r(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11648b;

    public Scope(int i10, String str) {
        c0.f(str, "scopeUri must not be null or empty");
        this.f11647a = i10;
        this.f11648b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f11648b.equals(((Scope) obj).f11648b);
    }

    public final int hashCode() {
        return this.f11648b.hashCode();
    }

    public final String toString() {
        return this.f11648b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = b.R(parcel, 20293);
        b.Q(parcel, 1, 4);
        parcel.writeInt(this.f11647a);
        b.J(parcel, 2, this.f11648b);
        b.S(parcel, iR);
    }
}
