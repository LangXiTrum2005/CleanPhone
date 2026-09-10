package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3287v0 implements Parcelable {
    public static final Parcelable.Creator<C3287v0> CREATOR = new C3262u0();
    public final long a;
    public final String b;
    public Map c;
    public String d;
    public final String e;
    public final String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public String k;

    public C3287v0(long j, String str, String str2, String str3) {
        this.h = "";
        this.i = "activity";
        this.a = j;
        this.e = str2;
        this.b = str;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3287v0)) {
            return false;
        }
        C3287v0 c3287v0 = (C3287v0) obj;
        return this.a == c3287v0.a && Intrinsics.wireman(this.i, c3287v0.i) && Intrinsics.wireman(this.b, c3287v0.b) && Intrinsics.wireman(this.e, c3287v0.e);
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.e;
        return this.i.hashCode() + ((i + (str != null ? str.hashCode() : 0)) * 30);
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.a);
        dest.writeString(this.i);
        dest.writeString(this.e);
    }

    public C3287v0(Parcel parcel) {
        this.h = "";
        String str = "activity";
        this.i = "activity";
        this.a = parcel.readLong();
        String string = parcel.readString();
        if (string != null && !Intrinsics.wireman(string, "activity") && Intrinsics.wireman(string, "others")) {
            str = "others";
        }
        this.i = str;
        this.e = parcel.readString();
    }
}
