package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new AnonymousClass1();
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f6924Y;
    public final String Z;
    public final String e0;
    public final boolean f0;
    public final int g0;

    /* JADX INFO: renamed from: androidx.media3.extractor.metadata.icy.IcyHeaders$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<IcyHeaders> {
        @Override // android.os.Parcelable.Creator
        public final IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyHeaders[] newArray(int i2) {
            return new IcyHeaders[i2];
        }
    }

    public IcyHeaders(int i2, String str, String str2, String str3, boolean z2, int i3) {
        Assertions.b(i3 == -1 || i3 > 0);
        this.X = i2;
        this.f6924Y = str;
        this.Z = str2;
        this.e0 = str3;
        this.f0 = z2;
        this.g0 = i3;
    }

    public static IcyHeaders a(Map map) {
        boolean z2;
        int i2;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i3;
        List list = (List) map.get("icy-br");
        boolean z3 = true;
        int i4 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i3 = Integer.parseInt(str4) * 1000;
                if (i3 > 0) {
                    z2 = true;
                } else {
                    try {
                        Log.g("IcyHeaders", "Invalid bitrate: " + str4);
                        z2 = false;
                        i3 = -1;
                    } catch (NumberFormatException unused) {
                        a.D("Invalid bitrate header: ", str4, "IcyHeaders");
                        z2 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i3 = -1;
            }
            i2 = i3;
        } else {
            z2 = false;
            i2 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z2 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z2 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z2 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z2 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i5 = Integer.parseInt(str5);
                if (i5 > 0) {
                    i4 = i5;
                } else {
                    try {
                        Log.g("IcyHeaders", "Invalid metadata interval: " + str5);
                        z3 = z2;
                    } catch (NumberFormatException unused3) {
                        i4 = i5;
                        a.D("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z2 = z3;
            } catch (NumberFormatException unused4) {
            }
        }
        int i6 = i4;
        if (z2) {
            return new IcyHeaders(i2, str, str2, str3, zEquals, i6);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IcyHeaders.class == obj.getClass()) {
            IcyHeaders icyHeaders = (IcyHeaders) obj;
            if (this.X == icyHeaders.X && Util.a(this.f6924Y, icyHeaders.f6924Y) && Util.a(this.Z, icyHeaders.Z) && Util.a(this.e0, icyHeaders.e0) && this.f0 == icyHeaders.f0 && this.g0 == icyHeaders.g0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.X) * 31;
        String str = this.f6924Y;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.Z;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e0;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f0 ? 1 : 0)) * 31) + this.g0;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void n0(MediaMetadata.Builder builder) {
        String str = this.Z;
        if (str != null) {
            builder.v = str;
        }
        String str2 = this.f6924Y;
        if (str2 != null) {
            builder.f5485u = str2;
        }
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.Z + "\", genre=\"" + this.f6924Y + "\", bitrate=" + this.X + ", metadataInterval=" + this.g0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.X);
        parcel.writeString(this.f6924Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.e0);
        int i3 = Util.f5683a;
        parcel.writeInt(this.f0 ? 1 : 0);
        parcel.writeInt(this.g0);
    }

    public IcyHeaders(Parcel parcel) {
        this.X = parcel.readInt();
        this.f6924Y = parcel.readString();
        this.Z = parcel.readString();
        this.e0 = parcel.readString();
        int i2 = Util.f5683a;
        this.f0 = parcel.readInt() != 0;
        this.g0 = parcel.readInt();
    }
}
