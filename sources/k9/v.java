package k9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends l9.a {
    public static final Parcelable.Creator<v> CREATOR = new f9.d(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Account f44518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f44520d;

    public v(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f44517a = i10;
        this.f44518b = account;
        this.f44519c = i11;
        this.f44520d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f44517a);
        r9.b.I(parcel, 2, this.f44518b, i10);
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(this.f44519c);
        r9.b.I(parcel, 4, this.f44520d, i10);
        r9.b.S(parcel, iR);
    }
}
