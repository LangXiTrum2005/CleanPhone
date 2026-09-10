package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import f9.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k9.c0;
import l9.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new d(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f11606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f11610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f11611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f11612k;
    public final HashSet l = new HashSet();

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, ArrayList arrayList, String str7, String str8) {
        this.f11602a = str;
        this.f11603b = str2;
        this.f11604c = str3;
        this.f11605d = str4;
        this.f11606e = uri;
        this.f11607f = str5;
        this.f11608g = j10;
        this.f11609h = str6;
        this.f11610i = arrayList;
        this.f11611j = str7;
        this.f11612k = str8;
    }

    public static GoogleSignInAccount b(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has(NotificationCompat.CATEGORY_EMAIL) ? jSONObject.optString(NotificationCompat.CATEGORY_EMAIL) : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        c0.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j10, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f11607f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f11609h.equals(this.f11609h)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f11610i);
        hashSet.addAll(googleSignInAccount.l);
        HashSet hashSet2 = new HashSet(this.f11610i);
        hashSet2.addAll(this.l);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f11609h.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        HashSet hashSet = new HashSet(this.f11610i);
        hashSet.addAll(this.l);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = b.R(parcel, 20293);
        b.J(parcel, 2, this.f11602a);
        b.J(parcel, 3, this.f11603b);
        b.J(parcel, 4, this.f11604c);
        b.J(parcel, 5, this.f11605d);
        b.I(parcel, 6, this.f11606e, i10);
        b.J(parcel, 7, this.f11607f);
        b.Q(parcel, 8, 8);
        parcel.writeLong(this.f11608g);
        b.J(parcel, 9, this.f11609h);
        b.O(parcel, 10, this.f11610i);
        b.J(parcel, 11, this.f11611j);
        b.J(parcel, 12, this.f11612k);
        b.S(parcel, iR);
    }
}
