package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.Validate;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/Profile;", "Landroid/os/Parcelable;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class Profile implements Parcelable {
    public static final Parcelable.Creator<Profile> CREATOR = new Profile$Companion$CREATOR$1();
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f15955Y;
    public final String Z;
    public final String e0;
    public final String f0;
    public final Uri g0;
    public final Uri h0;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/facebook/Profile$Companion;", "", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/Profile;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "FIRST_NAME_KEY", "Ljava/lang/String;", "ID_KEY", "LAST_NAME_KEY", "LINK_URI_KEY", "MIDDLE_NAME_KEY", "NAME_KEY", "PICTURE_URI_KEY", "TAG", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        Validate.g(str, "id");
        this.X = str;
        this.f15955Y = str2;
        this.Z = str3;
        this.e0 = str4;
        this.f0 = str5;
        this.g0 = uri;
        this.h0 = uri2;
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
        if (!(obj instanceof Profile)) {
            return false;
        }
        String str5 = this.X;
        return ((str5 == null && ((Profile) obj).X == null) || Intrinsics.a(str5, ((Profile) obj).X)) && (((str = this.f15955Y) == null && ((Profile) obj).f15955Y == null) || Intrinsics.a(str, ((Profile) obj).f15955Y)) && ((((str2 = this.Z) == null && ((Profile) obj).Z == null) || Intrinsics.a(str2, ((Profile) obj).Z)) && ((((str3 = this.e0) == null && ((Profile) obj).e0 == null) || Intrinsics.a(str3, ((Profile) obj).e0)) && ((((str4 = this.f0) == null && ((Profile) obj).f0 == null) || Intrinsics.a(str4, ((Profile) obj).f0)) && ((((uri = this.g0) == null && ((Profile) obj).g0 == null) || Intrinsics.a(uri, ((Profile) obj).g0)) && (((uri2 = this.h0) == null && ((Profile) obj).h0 == null) || Intrinsics.a(uri2, ((Profile) obj).h0))))));
    }

    public final int hashCode() {
        String str = this.X;
        int iHashCode = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0);
        String str2 = this.f15955Y;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.Z;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.e0;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.f0;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.g0;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.h0;
        if (uri2 != null) {
            return uri2.hashCode() + (iHashCode * 31);
        }
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.f(dest, "dest");
        dest.writeString(this.X);
        dest.writeString(this.f15955Y);
        dest.writeString(this.Z);
        dest.writeString(this.e0);
        dest.writeString(this.f0);
        Uri uri = this.g0;
        dest.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.h0;
        dest.writeString(uri2 != null ? uri2.toString() : null);
    }

    public Profile(JSONObject jSONObject) {
        this.X = jSONObject.optString("id", null);
        this.f15955Y = jSONObject.optString("first_name", null);
        this.Z = jSONObject.optString("middle_name", null);
        this.e0 = jSONObject.optString("last_name", null);
        this.f0 = jSONObject.optString("name", null);
        String strOptString = jSONObject.optString("link_uri", null);
        this.g0 = strOptString == null ? null : Uri.parse(strOptString);
        String strOptString2 = jSONObject.optString("picture_uri", null);
        this.h0 = strOptString2 != null ? Uri.parse(strOptString2) : null;
    }

    public Profile(Parcel parcel) {
        this.X = parcel.readString();
        this.f15955Y = parcel.readString();
        this.Z = parcel.readString();
        this.e0 = parcel.readString();
        this.f0 = parcel.readString();
        String string = parcel.readString();
        this.g0 = string == null ? null : Uri.parse(string);
        String string2 = parcel.readString();
        this.h0 = string2 != null ? Uri.parse(string2) : null;
    }
}
