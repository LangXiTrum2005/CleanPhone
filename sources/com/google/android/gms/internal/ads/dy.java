package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dy extends l9.a {
    public static final Parcelable.Creator<dy> CREATOR = new gj(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13755b;

    public dy(String str, int i10) {
        this.f13754a = str;
        this.f13755b = i10;
    }

    public static dy b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new dy(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dy)) {
            return false;
        }
        dy dyVar = (dy) obj;
        return k9.c0.l(this.f13754a, dyVar.f13754a) && k9.c0.l(Integer.valueOf(this.f13755b), Integer.valueOf(dyVar.f13755b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13754a, Integer.valueOf(this.f13755b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.J(parcel, 2, this.f13754a);
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(this.f13755b);
        r9.b.S(parcel, iR);
    }
}
