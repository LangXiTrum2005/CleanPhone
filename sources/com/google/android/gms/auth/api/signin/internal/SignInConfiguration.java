package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f9.d;
import k9.c0;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class SignInConfiguration extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new d(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoogleSignInOptions f11633b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        c0.e(str);
        this.f11632a = str;
        this.f11633b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        GoogleSignInOptions googleSignInOptions = signInConfiguration.f11633b;
        if (this.f11632a.equals(signInConfiguration.f11632a)) {
            GoogleSignInOptions googleSignInOptions2 = this.f11633b;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1 * 31;
        String str = this.f11632a;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.f11633b;
        return iHashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = b.R(parcel, 20293);
        b.J(parcel, 2, this.f11632a);
        b.I(parcel, 5, this.f11633b, i10);
        b.S(parcel, iR);
    }
}
