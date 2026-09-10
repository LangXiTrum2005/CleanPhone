package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f9.d;
import k9.c0;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new d(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f11630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11631c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f11630b = googleSignInAccount;
        c0.f(str, "8.3 and 8.4 SDKs require non-null email");
        this.f11629a = str;
        c0.f(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f11631c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = b.R(parcel, 20293);
        b.J(parcel, 4, this.f11629a);
        b.I(parcel, 7, this.f11630b, i10);
        b.J(parcel, 8, this.f11631c);
        b.S(parcel, iR);
    }
}
