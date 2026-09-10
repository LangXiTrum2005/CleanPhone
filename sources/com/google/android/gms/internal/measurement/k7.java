package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k7 extends l9.a {
    public static final Parcelable.Creator<k7> CREATOR = new j7(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f23676c;

    public k7(int i10, Intent intent, String str) {
        this.f23674a = i10;
        this.f23675b = str;
        this.f23676c = intent;
    }

    public static k7 b(Activity activity) {
        return new k7(activity.hashCode(), activity.getIntent(), activity.getClass().getCanonicalName());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        return this.f23674a == k7Var.f23674a && Objects.equals(this.f23675b, k7Var.f23675b) && Objects.equals(this.f23676c, k7Var.f23676c);
    }

    public final int hashCode() {
        return this.f23674a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f23674a);
        r9.b.J(parcel, 2, this.f23675b);
        r9.b.I(parcel, 3, this.f23676c, i10);
        r9.b.S(parcel, iR);
    }
}
