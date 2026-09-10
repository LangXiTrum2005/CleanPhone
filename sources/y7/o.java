package y7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import q7.e0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new l7.h(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l7.a f54287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l7.i f54288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f54289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f54290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f54291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f54292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap f54293h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(n nVar, int i10, l7.a aVar, String str, String str2) {
        this(nVar, i10, aVar, null, str, str2);
        d5.u.n(i10, "code");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        String str;
        kotlin.jvm.internal.n.f(dest, "dest");
        int i11 = this.f54286a;
        if (i11 == 1) {
            str = "SUCCESS";
        } else if (i11 == 2) {
            str = "CANCEL";
        } else {
            if (i11 != 3) {
                throw null;
            }
            str = "ERROR";
        }
        dest.writeString(str);
        dest.writeParcelable(this.f54287b, i10);
        dest.writeParcelable(this.f54288c, i10);
        dest.writeString(this.f54289d);
        dest.writeString(this.f54290e);
        dest.writeParcelable(this.f54291f, i10);
        e0.K(dest, this.f54292g);
        e0.K(dest, this.f54293h);
    }

    public o(n nVar, int i10, l7.a aVar, l7.i iVar, String str, String str2) {
        d5.u.n(i10, "code");
        this.f54291f = nVar;
        this.f54287b = aVar;
        this.f54288c = iVar;
        this.f54289d = str;
        this.f54286a = i10;
        this.f54290e = str2;
    }

    public o(Parcel parcel) {
        int i10;
        String string = parcel.readString();
        string = string == null ? "error" : string;
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("SUCCESS")) {
            i10 = 1;
        } else if (string.equals("CANCEL")) {
            i10 = 2;
        } else {
            if (!string.equals("ERROR")) {
                throw new IllegalArgumentException("No enum constant com.facebook.login.LoginClient.Result.Code.".concat(string));
            }
            i10 = 3;
        }
        this.f54286a = i10;
        this.f54287b = (l7.a) parcel.readParcelable(l7.a.class.getClassLoader());
        this.f54288c = (l7.i) parcel.readParcelable(l7.i.class.getClassLoader());
        this.f54289d = parcel.readString();
        this.f54290e = parcel.readString();
        this.f54291f = (n) parcel.readParcelable(n.class.getClassLoader());
        this.f54292g = e0.G(parcel);
        this.f54293h = e0.G(parcel);
    }
}
