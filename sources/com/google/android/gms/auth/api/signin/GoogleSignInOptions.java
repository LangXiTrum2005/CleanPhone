package com.google.android.gms.auth.api.signin;

import ae.l;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f9.d;
import j9.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import l9.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInOptions extends a implements b, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final GoogleSignInOptions f11613k;
    public static final GoogleSignInOptions l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Scope f11614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Scope f11615n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Scope f11616o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Scope f11617p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final l f11618q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Account f11621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f11627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f11628j;

    static {
        Scope scope = new Scope(1, "profile");
        f11614m = new Scope(1, NotificationCompat.CATEGORY_EMAIL);
        Scope scope2 = new Scope(1, "openid");
        f11615n = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f11616o = scope3;
        f11617p = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f11617p)) {
            Scope scope4 = f11616o;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f11613k = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f11617p)) {
            Scope scope5 = f11616o;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        l = new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new d(1);
        f11618q = new l(8);
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, HashMap map, String str3) {
        this.f11619a = i10;
        this.f11620b = arrayList;
        this.f11621c = account;
        this.f11622d = z10;
        this.f11623e = z11;
        this.f11624f = z12;
        this.f11625g = str;
        this.f11626h = str2;
        this.f11627i = new ArrayList(map.values());
        this.f11628j = str3;
    }

    public static GoogleSignInOptions b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap h(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                g9.a aVar = (g9.a) it.next();
                map.put(Integer.valueOf(aVar.f41742b), aVar);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        String str = this.f11625g;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList = googleSignInOptions.f11620b;
            String str2 = googleSignInOptions.f11625g;
            Account account = googleSignInOptions.f11621c;
            if (this.f11627i.isEmpty() && googleSignInOptions.f11627i.isEmpty()) {
                ArrayList arrayList2 = this.f11620b;
                if (arrayList2.size() == new ArrayList(arrayList).size() && arrayList2.containsAll(new ArrayList(arrayList))) {
                    Account account2 = this.f11621c;
                    if (account2 == null) {
                        if (account != null) {
                            return false;
                        }
                    } else if (!account2.equals(account)) {
                        return false;
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                    return this.f11624f == googleSignInOptions.f11624f && this.f11622d == googleSignInOptions.f11622d && this.f11623e == googleSignInOptions.f11623e && TextUtils.equals(this.f11628j, googleSignInOptions.f11628j);
                }
                return false;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f11620b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).f11648b);
        }
        Collections.sort(arrayList);
        int iHashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.f11621c;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.f11625g;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.f11624f ? 1 : 0)) * 31) + (this.f11622d ? 1 : 0)) * 31) + (this.f11623e ? 1 : 0)) * 31;
        String str2 = this.f11628j;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f11619a);
        r9.b.O(parcel, 2, new ArrayList(this.f11620b));
        r9.b.I(parcel, 3, this.f11621c, i10);
        r9.b.Q(parcel, 4, 4);
        parcel.writeInt(this.f11622d ? 1 : 0);
        r9.b.Q(parcel, 5, 4);
        parcel.writeInt(this.f11623e ? 1 : 0);
        r9.b.Q(parcel, 6, 4);
        parcel.writeInt(this.f11624f ? 1 : 0);
        r9.b.J(parcel, 7, this.f11625g);
        r9.b.J(parcel, 8, this.f11626h);
        r9.b.O(parcel, 9, this.f11627i);
        r9.b.J(parcel, 10, this.f11628j);
        r9.b.S(parcel, iR);
    }
}
