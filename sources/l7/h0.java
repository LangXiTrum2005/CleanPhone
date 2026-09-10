package l7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Parcelable {
    public static final Parcelable.Creator<h0> CREATOR = new h(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f45147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f45148g;

    public h0(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        q7.f.n(str, "id");
        this.f45142a = str;
        this.f45143b = str2;
        this.f45144c = str3;
        this.f45145d = str4;
        this.f45146e = str5;
        this.f45147f = uri;
        this.f45148g = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        String str5 = this.f45142a;
        return ((str5 == null && ((h0) obj).f45142a == null) || kotlin.jvm.internal.n.a(str5, ((h0) obj).f45142a)) && (((str = this.f45143b) == null && ((h0) obj).f45143b == null) || kotlin.jvm.internal.n.a(str, ((h0) obj).f45143b)) && ((((str2 = this.f45144c) == null && ((h0) obj).f45144c == null) || kotlin.jvm.internal.n.a(str2, ((h0) obj).f45144c)) && ((((str3 = this.f45145d) == null && ((h0) obj).f45145d == null) || kotlin.jvm.internal.n.a(str3, ((h0) obj).f45145d)) && ((((str4 = this.f45146e) == null && ((h0) obj).f45146e == null) || kotlin.jvm.internal.n.a(str4, ((h0) obj).f45146e)) && ((((uri = this.f45147f) == null && ((h0) obj).f45147f == null) || kotlin.jvm.internal.n.a(uri, ((h0) obj).f45147f)) && (((uri2 = this.f45148g) == null && ((h0) obj).f45148g == null) || kotlin.jvm.internal.n.a(uri2, ((h0) obj).f45148g))))));
    }

    public final int hashCode() {
        String str = this.f45142a;
        int iHashCode = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0);
        String str2 = this.f45143b;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.f45144c;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.f45145d;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.f45146e;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f45147f;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f45148g;
        if (uri2 != null) {
            return uri2.hashCode() + (iHashCode * 31);
        }
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.f(dest, "dest");
        dest.writeString(this.f45142a);
        dest.writeString(this.f45143b);
        dest.writeString(this.f45144c);
        dest.writeString(this.f45145d);
        dest.writeString(this.f45146e);
        Uri uri = this.f45147f;
        dest.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.f45148g;
        dest.writeString(uri2 != null ? uri2.toString() : null);
    }

    public h0(JSONObject jSONObject) {
        this.f45142a = jSONObject.optString("id", null);
        this.f45143b = jSONObject.optString("first_name", null);
        this.f45144c = jSONObject.optString("middle_name", null);
        this.f45145d = jSONObject.optString("last_name", null);
        this.f45146e = jSONObject.optString("name", null);
        String strOptString = jSONObject.optString("link_uri", null);
        this.f45147f = strOptString == null ? null : Uri.parse(strOptString);
        String strOptString2 = jSONObject.optString("picture_uri", null);
        this.f45148g = strOptString2 != null ? Uri.parse(strOptString2) : null;
    }

    public h0(Parcel parcel) {
        this.f45142a = parcel.readString();
        this.f45143b = parcel.readString();
        this.f45144c = parcel.readString();
        this.f45145d = parcel.readString();
        this.f45146e = parcel.readString();
        String string = parcel.readString();
        this.f45147f = string == null ? null : Uri.parse(string);
        String string2 = parcel.readString();
        this.f45148g = string2 != null ? Uri.parse(string2) : null;
    }
}
