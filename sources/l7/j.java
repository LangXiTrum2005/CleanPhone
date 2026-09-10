package l7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.ca;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new h(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f45160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f45161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f45162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f45163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f45164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f45165k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f45166m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f45167n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f45168o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Map f45169p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map f45170q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Map f45171r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f45172s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f45173t;

    public j(String encodedClaims, String expectedNonce) throws JSONException {
        Set setUnmodifiableSet;
        kotlin.jvm.internal.n.f(encodedClaims, "encodedClaims");
        kotlin.jvm.internal.n.f(expectedNonce, "expectedNonce");
        q7.f.l(encodedClaims, "encodedClaims");
        byte[] decodedBytes = Base64.decode(encodedClaims, 8);
        kotlin.jvm.internal.n.e(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, an.a.f3768a));
        String jti = jSONObject.optString("jti");
        kotlin.jvm.internal.n.e(jti, "jti");
        if (jti.length() != 0) {
            try {
                String iss = jSONObject.optString("iss");
                kotlin.jvm.internal.n.e(iss, "iss");
                if (iss.length() != 0 && (kotlin.jvm.internal.n.a(new URL(iss).getHost(), "facebook.com") || kotlin.jvm.internal.n.a(new URL(iss).getHost(), "www.facebook.com"))) {
                    String aud = jSONObject.optString("aud");
                    kotlin.jvm.internal.n.e(aud, "aud");
                    if (aud.length() != 0 && aud.equals(s.c())) {
                        long j10 = 1000;
                        if (!new Date().after(new Date(jSONObject.optLong("exp") * j10))) {
                            if (!new Date().after(new Date((jSONObject.optLong("iat") * j10) + 600000))) {
                                String sub = jSONObject.optString("sub");
                                kotlin.jvm.internal.n.e(sub, "sub");
                                if (sub.length() != 0) {
                                    String nonce = jSONObject.optString("nonce");
                                    kotlin.jvm.internal.n.e(nonce, "nonce");
                                    if (nonce.length() != 0 && nonce.equals(expectedNonce)) {
                                        String string = jSONObject.getString("jti");
                                        kotlin.jvm.internal.n.e(string, "jsonObj.getString(JSON_KEY_JIT)");
                                        this.f45155a = string;
                                        String string2 = jSONObject.getString("iss");
                                        kotlin.jvm.internal.n.e(string2, "jsonObj.getString(JSON_KEY_ISS)");
                                        this.f45156b = string2;
                                        String string3 = jSONObject.getString("aud");
                                        kotlin.jvm.internal.n.e(string3, "jsonObj.getString(JSON_KEY_AUD)");
                                        this.f45157c = string3;
                                        String string4 = jSONObject.getString("nonce");
                                        kotlin.jvm.internal.n.e(string4, "jsonObj.getString(JSON_KEY_NONCE)");
                                        this.f45158d = string4;
                                        this.f45159e = jSONObject.getLong("exp");
                                        this.f45160f = jSONObject.getLong("iat");
                                        String string5 = jSONObject.getString("sub");
                                        kotlin.jvm.internal.n.e(string5, "jsonObj.getString(JSON_KEY_SUB)");
                                        this.f45161g = string5;
                                        this.f45162h = j1.f.v("name", jSONObject);
                                        this.f45163i = j1.f.v("given_name", jSONObject);
                                        this.f45164j = j1.f.v("middle_name", jSONObject);
                                        this.f45165k = j1.f.v("family_name", jSONObject);
                                        this.l = j1.f.v(NotificationCompat.CATEGORY_EMAIL, jSONObject);
                                        this.f45166m = j1.f.v("picture", jSONObject);
                                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("user_friends");
                                        if (jSONArrayOptJSONArray == null) {
                                            setUnmodifiableSet = null;
                                        } else {
                                            HashSet hashSet = new HashSet();
                                            int length = jSONArrayOptJSONArray.length();
                                            for (int i10 = 0; i10 < length; i10++) {
                                                String string6 = jSONArrayOptJSONArray.getString(i10);
                                                kotlin.jvm.internal.n.e(string6, "jsonArray.getString(i)");
                                                hashSet.add(string6);
                                            }
                                            setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                                        }
                                        this.f45167n = setUnmodifiableSet;
                                        this.f45168o = j1.f.v("user_birthday", jSONObject);
                                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("user_age_range");
                                        this.f45169p = jSONObjectOptJSONObject == null ? null : Collections.unmodifiableMap(q7.e0.g(jSONObjectOptJSONObject));
                                        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("user_hometown");
                                        this.f45170q = jSONObjectOptJSONObject2 == null ? null : Collections.unmodifiableMap(q7.e0.h(jSONObjectOptJSONObject2));
                                        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("user_location");
                                        this.f45171r = jSONObjectOptJSONObject3 != null ? Collections.unmodifiableMap(q7.e0.h(jSONObjectOptJSONObject3)) : null;
                                        this.f45172s = j1.f.v("user_gender", jSONObject);
                                        this.f45173t = j1.f.v("user_link", jSONObject);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (MalformedURLException unused) {
            }
        }
        throw new IllegalArgumentException("Invalid claims");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.n.a(this.f45155a, jVar.f45155a) && kotlin.jvm.internal.n.a(this.f45156b, jVar.f45156b) && kotlin.jvm.internal.n.a(this.f45157c, jVar.f45157c) && kotlin.jvm.internal.n.a(this.f45158d, jVar.f45158d) && this.f45159e == jVar.f45159e && this.f45160f == jVar.f45160f && kotlin.jvm.internal.n.a(this.f45161g, jVar.f45161g) && kotlin.jvm.internal.n.a(this.f45162h, jVar.f45162h) && kotlin.jvm.internal.n.a(this.f45163i, jVar.f45163i) && kotlin.jvm.internal.n.a(this.f45164j, jVar.f45164j) && kotlin.jvm.internal.n.a(this.f45165k, jVar.f45165k) && kotlin.jvm.internal.n.a(this.l, jVar.l) && kotlin.jvm.internal.n.a(this.f45166m, jVar.f45166m) && kotlin.jvm.internal.n.a(this.f45167n, jVar.f45167n) && kotlin.jvm.internal.n.a(this.f45168o, jVar.f45168o) && kotlin.jvm.internal.n.a(this.f45169p, jVar.f45169p) && kotlin.jvm.internal.n.a(this.f45170q, jVar.f45170q) && kotlin.jvm.internal.n.a(this.f45171r, jVar.f45171r) && kotlin.jvm.internal.n.a(this.f45172s, jVar.f45172s) && kotlin.jvm.internal.n.a(this.f45173t, jVar.f45173t);
    }

    public final int hashCode() {
        int iE = d5.u.e(ca.j(this.f45160f, ca.j(this.f45159e, d5.u.e(d5.u.e(d5.u.e(d5.u.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f45155a), 31, this.f45156b), 31, this.f45157c), 31, this.f45158d), 31), 31), 31, this.f45161g);
        String str = this.f45162h;
        int iHashCode = (iE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f45163i;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f45164j;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f45165k;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.l;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f45166m;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Set set = this.f45167n;
        int iHashCode7 = (iHashCode6 + (set != null ? set.hashCode() : 0)) * 31;
        String str7 = this.f45168o;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map map = this.f45169p;
        int iHashCode9 = (iHashCode8 + (map != null ? map.hashCode() : 0)) * 31;
        Map map2 = this.f45170q;
        int iHashCode10 = (iHashCode9 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map map3 = this.f45171r;
        int iHashCode11 = (iHashCode10 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str8 = this.f45172s;
        int iHashCode12 = (iHashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f45173t;
        return iHashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f45155a);
        jSONObject.put("iss", this.f45156b);
        jSONObject.put("aud", this.f45157c);
        jSONObject.put("nonce", this.f45158d);
        jSONObject.put("exp", this.f45159e);
        jSONObject.put("iat", this.f45160f);
        String str = this.f45161g;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f45162h;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f45163i;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f45164j;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f45165k;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.l;
        if (str6 != null) {
            jSONObject.put(NotificationCompat.CATEGORY_EMAIL, str6);
        }
        String str7 = this.f45166m;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        Set set = this.f45167n;
        if (set != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) set));
        }
        String str8 = this.f45168o;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        Map map = this.f45169p;
        if (map != null) {
            jSONObject.put("user_age_range", new JSONObject(map));
        }
        Map map2 = this.f45170q;
        if (map2 != null) {
            jSONObject.put("user_hometown", new JSONObject(map2));
        }
        Map map3 = this.f45171r;
        if (map3 != null) {
            jSONObject.put("user_location", new JSONObject(map3));
        }
        String str9 = this.f45172s;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.f45173t;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.n.e(string, "claimsJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.f(dest, "dest");
        dest.writeString(this.f45155a);
        dest.writeString(this.f45156b);
        dest.writeString(this.f45157c);
        dest.writeString(this.f45158d);
        dest.writeLong(this.f45159e);
        dest.writeLong(this.f45160f);
        dest.writeString(this.f45161g);
        dest.writeString(this.f45162h);
        dest.writeString(this.f45163i);
        dest.writeString(this.f45164j);
        dest.writeString(this.f45165k);
        dest.writeString(this.l);
        dest.writeString(this.f45166m);
        Set set = this.f45167n;
        if (set == null) {
            dest.writeStringList(null);
        } else {
            dest.writeStringList(new ArrayList(set));
        }
        dest.writeString(this.f45168o);
        dest.writeMap(this.f45169p);
        dest.writeMap(this.f45170q);
        dest.writeMap(this.f45171r);
        dest.writeString(this.f45172s);
        dest.writeString(this.f45173t);
    }

    public j(Parcel parcel) {
        String string = parcel.readString();
        q7.f.n(string, "jti");
        this.f45155a = string;
        String string2 = parcel.readString();
        q7.f.n(string2, "iss");
        this.f45156b = string2;
        String string3 = parcel.readString();
        q7.f.n(string3, "aud");
        this.f45157c = string3;
        String string4 = parcel.readString();
        q7.f.n(string4, "nonce");
        this.f45158d = string4;
        this.f45159e = parcel.readLong();
        this.f45160f = parcel.readLong();
        String string5 = parcel.readString();
        q7.f.n(string5, "sub");
        this.f45161g = string5;
        this.f45162h = parcel.readString();
        this.f45163i = parcel.readString();
        this.f45164j = parcel.readString();
        this.f45165k = parcel.readString();
        this.l = parcel.readString();
        this.f45166m = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.f45167n = arrayListCreateStringArrayList != null ? Collections.unmodifiableSet(new HashSet(arrayListCreateStringArrayList)) : null;
        this.f45168o = parcel.readString();
        HashMap hashMap = parcel.readHashMap(kotlin.jvm.internal.l.class.getClassLoader());
        hashMap = hashMap == null ? null : hashMap;
        this.f45169p = hashMap != null ? Collections.unmodifiableMap(hashMap) : null;
        HashMap hashMap2 = parcel.readHashMap(kotlin.jvm.internal.g0.class.getClassLoader());
        hashMap2 = hashMap2 == null ? null : hashMap2;
        this.f45170q = hashMap2 != null ? Collections.unmodifiableMap(hashMap2) : null;
        HashMap hashMap3 = parcel.readHashMap(kotlin.jvm.internal.g0.class.getClassLoader());
        hashMap3 = hashMap3 == null ? null : hashMap3;
        this.f45171r = hashMap3 != null ? Collections.unmodifiableMap(hashMap3) : null;
        this.f45172s = parcel.readString();
        this.f45173t = parcel.readString();
    }
}
