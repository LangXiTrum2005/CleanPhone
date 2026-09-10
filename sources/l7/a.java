package l7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f45071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f45072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f45073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f45074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f45076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Date f45077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f45078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f45079i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Date f45080j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f45081k;
    public static final Date l = new Date(Long.MAX_VALUE);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Date f45069m = new Date();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f45070n = g.f45123b;
    public static final Parcelable.Creator<a> CREATOR = new f9.d(29);

    public a(String accessToken, String applicationId, String userId, Collection collection, Collection collection2, Collection collection3, g gVar, Date date, Date date2, Date date3, String str) {
        kotlin.jvm.internal.n.f(accessToken, "accessToken");
        kotlin.jvm.internal.n.f(applicationId, "applicationId");
        kotlin.jvm.internal.n.f(userId, "userId");
        q7.f.l(accessToken, "accessToken");
        q7.f.l(applicationId, "applicationId");
        q7.f.l(userId, "userId");
        Date date4 = l;
        this.f45071a = date == null ? date4 : date;
        Set setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        kotlin.jvm.internal.n.e(setUnmodifiableSet, "unmodifiableSet(if (perm…missions) else HashSet())");
        this.f45072b = setUnmodifiableSet;
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        kotlin.jvm.internal.n.e(setUnmodifiableSet2, "unmodifiableSet(\n       …missions) else HashSet())");
        this.f45073c = setUnmodifiableSet2;
        Set setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        kotlin.jvm.internal.n.e(setUnmodifiableSet3, "unmodifiableSet(\n       …missions) else HashSet())");
        this.f45074d = setUnmodifiableSet3;
        this.f45075e = accessToken;
        gVar = gVar == null ? f45070n : gVar;
        if (str != null && str.equals("instagram")) {
            int iOrdinal = gVar.ordinal();
            if (iOrdinal == 1) {
                gVar = g.f45128g;
            } else if (iOrdinal == 4) {
                gVar = g.f45130i;
            } else if (iOrdinal == 5) {
                gVar = g.f45129h;
            }
        }
        this.f45076f = gVar;
        this.f45077g = date2 == null ? f45069m : date2;
        this.f45078h = applicationId;
        this.f45079i = userId;
        this.f45080j = (date3 == null || date3.getTime() == 0) ? date4 : date3;
        this.f45081k = str == null ? "facebook" : str;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f45075e);
        jSONObject.put("expires_at", this.f45071a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f45072b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f45073c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f45074d));
        jSONObject.put("last_refresh", this.f45077g.getTime());
        jSONObject.put("source", this.f45076f.name());
        jSONObject.put("application_id", this.f45078h);
        jSONObject.put("user_id", this.f45079i);
        jSONObject.put("data_access_expiration_time", this.f45080j.getTime());
        String str = this.f45081k;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = aVar.f45081k;
        if (kotlin.jvm.internal.n.a(this.f45071a, aVar.f45071a) && kotlin.jvm.internal.n.a(this.f45072b, aVar.f45072b) && kotlin.jvm.internal.n.a(this.f45073c, aVar.f45073c) && kotlin.jvm.internal.n.a(this.f45074d, aVar.f45074d) && kotlin.jvm.internal.n.a(this.f45075e, aVar.f45075e) && this.f45076f == aVar.f45076f && kotlin.jvm.internal.n.a(this.f45077g, aVar.f45077g) && kotlin.jvm.internal.n.a(this.f45078h, aVar.f45078h) && kotlin.jvm.internal.n.a(this.f45079i, aVar.f45079i) && kotlin.jvm.internal.n.a(this.f45080j, aVar.f45080j)) {
            String str2 = this.f45081k;
            if (str2 == null) {
                zA = str == null;
            } else {
                zA = kotlin.jvm.internal.n.a(str2, str);
            }
            if (zA) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f45080j.hashCode() + d5.u.e(d5.u.e((this.f45077g.hashCode() + ((this.f45076f.hashCode() + d5.u.e((this.f45074d.hashCode() + ((this.f45073c.hashCode() + ((this.f45072b.hashCode() + ((this.f45071a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31, 31, this.f45075e)) * 31)) * 31, 31, this.f45078h), 31, this.f45079i)) * 31;
        String str = this.f45081k;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{AccessToken token:");
        sb2.append(s.i(g0.f45134b) ? this.f45075e : "ACCESS_TOKEN_REMOVED");
        sb2.append(" permissions:[");
        sb2.append(TextUtils.join(", ", this.f45072b));
        sb2.append("]}");
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "builder.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.f(dest, "dest");
        dest.writeLong(this.f45071a.getTime());
        dest.writeStringList(new ArrayList(this.f45072b));
        dest.writeStringList(new ArrayList(this.f45073c));
        dest.writeStringList(new ArrayList(this.f45074d));
        dest.writeString(this.f45075e);
        dest.writeString(this.f45076f.name());
        dest.writeLong(this.f45077g.getTime());
        dest.writeString(this.f45078h);
        dest.writeString(this.f45079i);
        dest.writeLong(this.f45080j.getTime());
        dest.writeString(this.f45081k);
    }

    public a(Parcel parcel) {
        g gVarValueOf;
        this.f45071a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.n.e(setUnmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f45072b = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.n.e(setUnmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f45073c = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.n.e(setUnmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f45074d = setUnmodifiableSet3;
        String string = parcel.readString();
        q7.f.n(string, "token");
        this.f45075e = string;
        String string2 = parcel.readString();
        if (string2 != null) {
            gVarValueOf = g.valueOf(string2);
        } else {
            gVarValueOf = f45070n;
        }
        this.f45076f = gVarValueOf;
        this.f45077g = new Date(parcel.readLong());
        String string3 = parcel.readString();
        q7.f.n(string3, "applicationId");
        this.f45078h = string3;
        String string4 = parcel.readString();
        q7.f.n(string4, "userId");
        this.f45079i = string4;
        this.f45080j = new Date(parcel.readLong());
        this.f45081k = parcel.readString();
    }
}
