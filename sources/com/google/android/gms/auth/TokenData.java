package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k9.c0;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class TokenData extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenData> CREATOR = new android.support.v4.media.a(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f11595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f11598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11599g;

    public TokenData(int i10, String str, Long l, boolean z10, boolean z11, ArrayList arrayList, String str2) {
        this.f11593a = i10;
        c0.e(str);
        this.f11594b = str;
        this.f11595c = l;
        this.f11596d = z10;
        this.f11597e = z11;
        this.f11598f = arrayList;
        this.f11599g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f11594b, tokenData.f11594b) && c0.l(this.f11595c, tokenData.f11595c) && this.f11596d == tokenData.f11596d && this.f11597e == tokenData.f11597e && c0.l(this.f11598f, tokenData.f11598f) && c0.l(this.f11599g, tokenData.f11599g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11594b, this.f11595c, Boolean.valueOf(this.f11596d), Boolean.valueOf(this.f11597e), this.f11598f, this.f11599g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = b.R(parcel, 20293);
        b.Q(parcel, 1, 4);
        parcel.writeInt(this.f11593a);
        b.J(parcel, 2, this.f11594b);
        Long l = this.f11595c;
        if (l != null) {
            b.Q(parcel, 3, 8);
            parcel.writeLong(l.longValue());
        }
        b.Q(parcel, 4, 4);
        parcel.writeInt(this.f11596d ? 1 : 0);
        b.Q(parcel, 5, 4);
        parcel.writeInt(this.f11597e ? 1 : 0);
        b.L(parcel, 6, this.f11598f);
        b.J(parcel, 7, this.f11599g);
        b.S(parcel, iR);
    }
}
