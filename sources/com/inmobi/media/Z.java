package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Z implements Parcelable {
    public static final Parcelable.Creator<Z> CREATOR = new Y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f23386c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23387e;
    public final String f;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f23388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f23389i;
    public boolean j;
    public String k;

    public Z(long j, String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this.f23388h = "";
        this.f23389i = "activity";
        this.f23384a = j;
        this.f23385b = str;
        this.f23387e = str2;
        this.f23385b = str == null ? "" : str;
        this.f = str3;
    }

    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void n() {
    }

    public final String d() {
        String str = this.g;
        Intrinsics.c(str);
        return str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z2 = (Z) obj;
        return this.f23384a == z2.f23384a && Intrinsics.a(this.f23389i, z2.f23389i) && Intrinsics.a(this.f23385b, z2.f23385b) && Intrinsics.a(this.f23387e, z2.f23387e);
    }

    public final Map<String, String> f() {
        return this.f23386c;
    }

    public final long g() {
        return this.f23384a;
    }

    public final String h() {
        return "im";
    }

    public int hashCode() {
        long j = this.f23384a;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f23387e;
        return this.f23389i.hashCode() + ((i2 + (str != null ? str.hashCode() : 0)) * 30);
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        return this.f23389i;
    }

    public final long l() {
        return this.f23384a;
    }

    public final String m() {
        return this.f;
    }

    public final String o() {
        return this.f23385b;
    }

    public final boolean p() {
        return this.j;
    }

    public String toString() {
        return String.valueOf(this.f23384a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i2) {
        Intrinsics.f(dest, "dest");
        dest.writeLong(this.f23384a);
        dest.writeString(this.f23389i);
        dest.writeString(this.f23387e);
    }

    public final String b() {
        return this.f23387e;
    }

    public final void a(Map<String, String> map) {
        this.f23386c = map;
    }

    public final void b(String str) {
        Intrinsics.f(str, "<set-?>");
        this.f23389i = str;
    }

    public final String a() {
        return this.f23388h;
    }

    public final void a(String str) {
        Intrinsics.f(str, "<set-?>");
        this.f23388h = str;
    }

    public Z(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this.f23388h = "";
        String str = "activity";
        this.f23389i = "activity";
        this.f23384a = parcel.readLong();
        String string = parcel.readString();
        if (string != null && !string.equals("activity") && string.equals("others")) {
            str = "others";
        }
        this.f23389i = str;
        this.f23387e = parcel.readString();
    }
}
