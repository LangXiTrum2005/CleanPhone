package h9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends l9.a {

    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new f9.d(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f42252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f42254g;

    public b(String str, String str2, String str3, String str4, String str5) {
        this.f42248a = str;
        this.f42249b = str2;
        this.f42250c = str3;
        this.f42251d = str4;
        this.f42252e = str5;
        this.f42254g = "fcm-25.1.2";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.J(parcel, 1, this.f42248a);
        r9.b.J(parcel, 2, this.f42249b);
        r9.b.J(parcel, 3, this.f42250c);
        r9.b.J(parcel, 4, this.f42251d);
        r9.b.J(parcel, 5, this.f42252e);
        int i11 = this.f42253f;
        r9.b.Q(parcel, 6, 4);
        parcel.writeInt(i11);
        r9.b.J(parcel, 7, this.f42254g);
        r9.b.S(parcel, iR);
    }

    public b(String str, String str2, String str3, String str4, String str5, int i10, String str6) {
        this.f42248a = str;
        this.f42249b = str2;
        this.f42250c = str3;
        this.f42251d = str4;
        this.f42252e = str5;
        this.f42253f = i10;
        this.f42254g = str6;
    }
}
