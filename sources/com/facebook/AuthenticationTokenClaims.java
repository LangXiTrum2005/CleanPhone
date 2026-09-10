package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.datastore.preferences.protobuf.a;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
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
import kotlin.Metadata;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/AuthenticationTokenClaims;", "Landroid/os/Parcelable;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AuthenticationTokenClaims implements Parcelable {
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new AuthenticationTokenClaims$Companion$CREATOR$1();
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f15901Y;
    public final String Z;
    public final String e0;
    public final long f0;
    public final long g0;
    public final String h0;
    public final String i0;
    public final String j0;
    public final String k0;
    public final String l0;
    public final String m0;
    public final String n0;
    public final Set o0;
    public final String p0;
    public final Map q0;
    public final Map r0;
    public final Map s0;
    public final String t0;
    public final String u0;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u0014\u0010\u0017\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u0014\u0010\u0018\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\bR\u0014\u0010\u001a\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\bR\u0014\u0010\u001b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/facebook/AuthenticationTokenClaims$Companion;", "", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationTokenClaims;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "JSON_KEY_AUD", "Ljava/lang/String;", "JSON_KEY_EMAIL", "JSON_KEY_EXP", "JSON_KEY_FAMILY_NAME", "JSON_KEY_GIVEN_NAME", "JSON_KEY_IAT", "JSON_KEY_ISS", "JSON_KEY_JIT", "JSON_KEY_MIDDLE_NAME", "JSON_KEY_NAME", "JSON_KEY_NONCE", "JSON_KEY_PICTURE", "JSON_KEY_SUB", "JSON_KEY_USER_AGE_RANGE", "JSON_KEY_USER_BIRTHDAY", "JSON_KEY_USER_FRIENDS", "JSON_KEY_USER_GENDER", "JSON_KEY_USER_HOMETOWN", "JSON_KEY_USER_LINK", "JSON_KEY_USER_LOCATION", "", "MAX_TIME_SINCE_TOKEN_ISSUED", "J", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static String a(String str, JSONObject jSONObject) {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }
    }

    public AuthenticationTokenClaims(String encodedClaims, String expectedNonce) throws JSONException {
        Intrinsics.f(encodedClaims, "encodedClaims");
        Intrinsics.f(expectedNonce, "expectedNonce");
        Validate.d(encodedClaims, "encodedClaims");
        byte[] decodedBytes = Base64.decode(encodedClaims, 8);
        Intrinsics.e(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, Charsets.f44691a));
        String jti = jSONObject.optString("jti");
        Intrinsics.e(jti, "jti");
        if (jti.length() != 0) {
            try {
                String iss = jSONObject.optString("iss");
                Intrinsics.e(iss, "iss");
                if (iss.length() != 0 && (Intrinsics.a(new URL(iss).getHost(), "facebook.com") || Intrinsics.a(new URL(iss).getHost(), "www.facebook.com"))) {
                    String aud = jSONObject.optString("aud");
                    Intrinsics.e(aud, "aud");
                    if (aud.length() != 0 && aud.equals(FacebookSdk.c())) {
                        long j = 1000;
                        if (!new Date().after(new Date(jSONObject.optLong("exp") * j))) {
                            if (!new Date().after(new Date((jSONObject.optLong("iat") * j) + TTAdConstant.AD_MAX_EVENT_TIME))) {
                                String sub = jSONObject.optString("sub");
                                Intrinsics.e(sub, "sub");
                                if (sub.length() != 0) {
                                    String nonce = jSONObject.optString("nonce");
                                    Intrinsics.e(nonce, "nonce");
                                    if (nonce.length() != 0 && nonce.equals(expectedNonce)) {
                                        String string = jSONObject.getString("jti");
                                        Intrinsics.e(string, "jsonObj.getString(JSON_KEY_JIT)");
                                        this.X = string;
                                        String string2 = jSONObject.getString("iss");
                                        Intrinsics.e(string2, "jsonObj.getString(JSON_KEY_ISS)");
                                        this.f15901Y = string2;
                                        String string3 = jSONObject.getString("aud");
                                        Intrinsics.e(string3, "jsonObj.getString(JSON_KEY_AUD)");
                                        this.Z = string3;
                                        String string4 = jSONObject.getString("nonce");
                                        Intrinsics.e(string4, "jsonObj.getString(JSON_KEY_NONCE)");
                                        this.e0 = string4;
                                        this.f0 = jSONObject.getLong("exp");
                                        this.g0 = jSONObject.getLong("iat");
                                        String string5 = jSONObject.getString("sub");
                                        Intrinsics.e(string5, "jsonObj.getString(JSON_KEY_SUB)");
                                        this.h0 = string5;
                                        this.i0 = Companion.a("name", jSONObject);
                                        this.j0 = Companion.a("given_name", jSONObject);
                                        this.k0 = Companion.a("middle_name", jSONObject);
                                        this.l0 = Companion.a("family_name", jSONObject);
                                        this.m0 = Companion.a("email", jSONObject);
                                        this.n0 = Companion.a("picture", jSONObject);
                                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("user_friends");
                                        this.o0 = jSONArrayOptJSONArray == null ? null : Collections.unmodifiableSet(Utility.F(jSONArrayOptJSONArray));
                                        this.p0 = Companion.a("user_birthday", jSONObject);
                                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("user_age_range");
                                        this.q0 = jSONObjectOptJSONObject == null ? null : Collections.unmodifiableMap(Utility.h(jSONObjectOptJSONObject));
                                        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("user_hometown");
                                        this.r0 = jSONObjectOptJSONObject2 == null ? null : Collections.unmodifiableMap(Utility.i(jSONObjectOptJSONObject2));
                                        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("user_location");
                                        this.s0 = jSONObjectOptJSONObject3 != null ? Collections.unmodifiableMap(Utility.i(jSONObjectOptJSONObject3)) : null;
                                        this.t0 = Companion.a("user_gender", jSONObject);
                                        this.u0 = Companion.a("user_link", jSONObject);
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

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.X);
        jSONObject.put("iss", this.f15901Y);
        jSONObject.put("aud", this.Z);
        jSONObject.put("nonce", this.e0);
        jSONObject.put("exp", this.f0);
        jSONObject.put("iat", this.g0);
        String str = this.h0;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.i0;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.j0;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.k0;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.l0;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.m0;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.n0;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        Set set = this.o0;
        if (set != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) set));
        }
        String str8 = this.p0;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        Map map = this.q0;
        if (map != null) {
            jSONObject.put("user_age_range", new JSONObject(map));
        }
        Map map2 = this.r0;
        if (map2 != null) {
            jSONObject.put("user_hometown", new JSONObject(map2));
        }
        Map map3 = this.s0;
        if (map3 != null) {
            jSONObject.put("user_location", new JSONObject(map3));
        }
        String str9 = this.t0;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.u0;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) obj;
        return Intrinsics.a(this.X, authenticationTokenClaims.X) && Intrinsics.a(this.f15901Y, authenticationTokenClaims.f15901Y) && Intrinsics.a(this.Z, authenticationTokenClaims.Z) && Intrinsics.a(this.e0, authenticationTokenClaims.e0) && this.f0 == authenticationTokenClaims.f0 && this.g0 == authenticationTokenClaims.g0 && Intrinsics.a(this.h0, authenticationTokenClaims.h0) && Intrinsics.a(this.i0, authenticationTokenClaims.i0) && Intrinsics.a(this.j0, authenticationTokenClaims.j0) && Intrinsics.a(this.k0, authenticationTokenClaims.k0) && Intrinsics.a(this.l0, authenticationTokenClaims.l0) && Intrinsics.a(this.m0, authenticationTokenClaims.m0) && Intrinsics.a(this.n0, authenticationTokenClaims.n0) && Intrinsics.a(this.o0, authenticationTokenClaims.o0) && Intrinsics.a(this.p0, authenticationTokenClaims.p0) && Intrinsics.a(this.q0, authenticationTokenClaims.q0) && Intrinsics.a(this.r0, authenticationTokenClaims.r0) && Intrinsics.a(this.s0, authenticationTokenClaims.s0) && Intrinsics.a(this.t0, authenticationTokenClaims.t0) && Intrinsics.a(this.u0, authenticationTokenClaims.u0);
    }

    public final int hashCode() {
        int iB = a.b(this.h0, (Long.valueOf(this.g0).hashCode() + ((Long.valueOf(this.f0).hashCode() + a.b(this.e0, a.b(this.Z, a.b(this.f15901Y, a.b(this.X, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31), 31), 31), 31)) * 31)) * 31, 31);
        String str = this.i0;
        int iHashCode = (iB + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.j0;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.k0;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.l0;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.m0;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.n0;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Set set = this.o0;
        int iHashCode7 = (iHashCode6 + (set != null ? set.hashCode() : 0)) * 31;
        String str7 = this.p0;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map map = this.q0;
        int iHashCode9 = (iHashCode8 + (map != null ? map.hashCode() : 0)) * 31;
        Map map2 = this.r0;
        int iHashCode10 = (iHashCode9 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map map3 = this.s0;
        int iHashCode11 = (iHashCode10 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str8 = this.t0;
        int iHashCode12 = (iHashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.u0;
        return iHashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        String string = a().toString();
        Intrinsics.e(string, "claimsJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.f(dest, "dest");
        dest.writeString(this.X);
        dest.writeString(this.f15901Y);
        dest.writeString(this.Z);
        dest.writeString(this.e0);
        dest.writeLong(this.f0);
        dest.writeLong(this.g0);
        dest.writeString(this.h0);
        dest.writeString(this.i0);
        dest.writeString(this.j0);
        dest.writeString(this.k0);
        dest.writeString(this.l0);
        dest.writeString(this.m0);
        dest.writeString(this.n0);
        Set set = this.o0;
        if (set == null) {
            dest.writeStringList(null);
        } else {
            dest.writeStringList(new ArrayList(set));
        }
        dest.writeString(this.p0);
        dest.writeMap(this.q0);
        dest.writeMap(this.r0);
        dest.writeMap(this.s0);
        dest.writeString(this.t0);
        dest.writeString(this.u0);
    }

    public AuthenticationTokenClaims(Parcel parcel) {
        String string = parcel.readString();
        Validate.g(string, "jti");
        if (string != null) {
            this.X = string;
            String string2 = parcel.readString();
            Validate.g(string2, "iss");
            if (string2 != null) {
                this.f15901Y = string2;
                String string3 = parcel.readString();
                Validate.g(string3, "aud");
                if (string3 != null) {
                    this.Z = string3;
                    String string4 = parcel.readString();
                    Validate.g(string4, "nonce");
                    if (string4 != null) {
                        this.e0 = string4;
                        this.f0 = parcel.readLong();
                        this.g0 = parcel.readLong();
                        String string5 = parcel.readString();
                        Validate.g(string5, "sub");
                        if (string5 != null) {
                            this.h0 = string5;
                            this.i0 = parcel.readString();
                            this.j0 = parcel.readString();
                            this.k0 = parcel.readString();
                            this.l0 = parcel.readString();
                            this.m0 = parcel.readString();
                            this.n0 = parcel.readString();
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            this.o0 = arrayListCreateStringArrayList != null ? Collections.unmodifiableSet(new HashSet(arrayListCreateStringArrayList)) : null;
                            this.p0 = parcel.readString();
                            HashMap hashMap = parcel.readHashMap(IntCompanionObject.class.getClassLoader());
                            hashMap = hashMap == null ? null : hashMap;
                            this.q0 = hashMap != null ? Collections.unmodifiableMap(hashMap) : null;
                            HashMap hashMap2 = parcel.readHashMap(StringCompanionObject.class.getClassLoader());
                            hashMap2 = hashMap2 == null ? null : hashMap2;
                            this.r0 = hashMap2 != null ? Collections.unmodifiableMap(hashMap2) : null;
                            HashMap hashMap3 = parcel.readHashMap(StringCompanionObject.class.getClassLoader());
                            hashMap3 = hashMap3 == null ? null : hashMap3;
                            this.s0 = hashMap3 != null ? Collections.unmodifiableMap(hashMap3) : null;
                            this.t0 = parcel.readString();
                            this.u0 = parcel.readString();
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
