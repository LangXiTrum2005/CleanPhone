package y7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new l7.h(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashSet f54266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f54268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f54269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f54270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f54271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f54272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f54273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f54274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f54275k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f54276m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f54277n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f54278o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f54279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f54280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f54281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f54282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f54283t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f54284u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f54285v;

    public n(Parcel parcel) {
        int i10;
        int i11;
        int i12;
        int i13;
        String string = parcel.readString();
        q7.f.n(string, "loginBehavior");
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("NATIVE_WITH_FALLBACK")) {
            i10 = 1;
        } else if (string.equals("NATIVE_ONLY")) {
            i10 = 2;
        } else if (string.equals("KATANA_ONLY")) {
            i10 = 3;
        } else if (string.equals("WEB_ONLY")) {
            i10 = 4;
        } else if (string.equals("DIALOG_ONLY")) {
            i10 = 5;
        } else {
            if (!string.equals("DEVICE_AUTH")) {
                throw new IllegalArgumentException("No enum constant com.facebook.login.LoginBehavior.".concat(string));
            }
            i10 = 6;
        }
        this.f54265a = i10;
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f54266b = new HashSet(arrayList);
        String string2 = parcel.readString();
        if (string2 == null) {
            i11 = 1;
        } else {
            if (string2 == null) {
                throw new NullPointerException("Name is null");
            }
            if (string2.equals("NONE")) {
                i11 = 1;
            } else if (string2.equals("ONLY_ME")) {
                i11 = 2;
            } else if (string2.equals("FRIENDS")) {
                i11 = 3;
            } else {
                if (!string2.equals("EVERYONE")) {
                    throw new IllegalArgumentException("No enum constant com.facebook.login.DefaultAudience.".concat(string2));
                }
                i11 = 4;
            }
        }
        this.f54267c = i11;
        String string3 = parcel.readString();
        q7.f.n(string3, "applicationId");
        this.f54268d = string3;
        this.f54269e = parcel.readString();
        this.f54270f = parcel.readString();
        String string4 = parcel.readString();
        q7.f.n(string4, "authId");
        this.f54271g = string4;
        int i14 = 0;
        this.f54272h = parcel.readByte() != 0;
        this.f54273i = parcel.readString();
        String string5 = parcel.readString();
        q7.f.n(string5, "authType");
        this.f54274j = string5;
        this.f54275k = parcel.readString();
        this.l = parcel.readString();
        this.f54276m = parcel.readByte() != 0;
        String string6 = parcel.readString();
        if (string6 == null) {
            i12 = 1;
        } else {
            if (string6 == null) {
                throw new NullPointerException("Name is null");
            }
            if (string6.equals("FACEBOOK")) {
                i12 = 1;
            } else {
                if (!string6.equals("INSTAGRAM")) {
                    throw new IllegalArgumentException("No enum constant com.facebook.login.LoginTargetApp.".concat(string6));
                }
                i12 = 2;
            }
        }
        this.f54277n = i12;
        this.f54278o = parcel.readByte() != 0;
        this.f54279p = parcel.readByte() != 0;
        this.f54280q = parcel.readByte() != 0;
        this.f54281r = parcel.readString();
        String string7 = parcel.readString();
        q7.f.n(string7, "nonce");
        this.f54282s = string7;
        this.f54283t = parcel.readString();
        this.f54284u = parcel.readString();
        String string8 = parcel.readString();
        if (string8 != null) {
            if (string8 == null) {
                throw new NullPointerException("Name is null");
            }
            if (string8.equals("S256")) {
                i13 = 1;
            } else {
                if (!string8.equals("PLAIN")) {
                    throw new IllegalArgumentException("No enum constant com.facebook.login.CodeChallengeMethod.".concat(string8));
                }
                i13 = 2;
            }
            i14 = i13;
        }
        this.f54285v = i14;
    }

    public final boolean a() {
        for (String str : this.f54266b) {
            Set set = s.f54313a;
            if (str != null && (an.p.p0(str, "publish", false) || an.p.p0(str, "manage", false) || s.f54313a.contains(str))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        String str;
        String str2;
        kotlin.jvm.internal.n.f(dest, "dest");
        dest.writeString(wi.d.o(this.f54265a));
        dest.writeStringList(new ArrayList(this.f54266b));
        int i11 = this.f54267c;
        if (i11 == 1) {
            str = "NONE";
        } else if (i11 == 2) {
            str = "ONLY_ME";
        } else if (i11 == 3) {
            str = "FRIENDS";
        } else {
            if (i11 != 4) {
                throw null;
            }
            str = "EVERYONE";
        }
        dest.writeString(str);
        dest.writeString(this.f54268d);
        dest.writeString(this.f54269e);
        dest.writeString(this.f54270f);
        dest.writeString(this.f54271g);
        dest.writeByte(this.f54272h ? (byte) 1 : (byte) 0);
        dest.writeString(this.f54273i);
        dest.writeString(this.f54274j);
        dest.writeString(this.f54275k);
        dest.writeString(this.l);
        dest.writeByte(this.f54276m ? (byte) 1 : (byte) 0);
        int i12 = this.f54277n;
        if (i12 == 1) {
            str2 = "FACEBOOK";
        } else {
            if (i12 != 2) {
                throw null;
            }
            str2 = "INSTAGRAM";
        }
        dest.writeString(str2);
        dest.writeByte(this.f54278o ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f54279p ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f54280q ? (byte) 1 : (byte) 0);
        dest.writeString(this.f54281r);
        dest.writeString(this.f54282s);
        dest.writeString(this.f54283t);
        dest.writeString(this.f54284u);
        int i13 = this.f54285v;
        dest.writeString(i13 != 0 ? wi.d.n(i13) : null);
    }
}
