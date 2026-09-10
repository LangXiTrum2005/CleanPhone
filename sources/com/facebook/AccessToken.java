package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.a;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", "AccessTokenCreationCallback", "AccessTokenRefreshCallback", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AccessToken implements Parcelable {
    public final Date X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Set f15877Y;
    public final Set Z;
    public final Set e0;
    public final String f0;
    public final AccessTokenSource g0;
    public final Date h0;
    public final String i0;
    public final String j0;
    public final Date k0;
    public final String l0;
    public static final Date m0 = new Date(Long.MAX_VALUE);
    public static final Date n0 = new Date();
    public static final AccessTokenSource o0 = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    public static final Parcelable.Creator<AccessToken> CREATOR = new AccessToken$Companion$CREATOR$1();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/AccessToken$AccessTokenCreationCallback;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface AccessTokenCreationCallback {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/AccessToken$AccessTokenRefreshCallback;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface AccessTokenRefreshCallback {
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0014\u0010 \u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0004¨\u0006\""}, d2 = {"Lcom/facebook/AccessToken$Companion;", "", "", "ACCESS_TOKEN_KEY", "Ljava/lang/String;", "APPLICATION_ID_KEY", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AccessToken;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "CURRENT_JSON_FORMAT", "I", "DATA_ACCESS_EXPIRATION_TIME", "DECLINED_PERMISSIONS_KEY", "Lcom/facebook/AccessTokenSource;", "DEFAULT_ACCESS_TOKEN_SOURCE", "Lcom/facebook/AccessTokenSource;", "Ljava/util/Date;", "DEFAULT_EXPIRATION_TIME", "Ljava/util/Date;", "DEFAULT_GRAPH_DOMAIN", "DEFAULT_LAST_REFRESH_TIME", "EXPIRED_PERMISSIONS_KEY", "EXPIRES_AT_KEY", "EXPIRES_IN_KEY", "GRAPH_DOMAIN", "LAST_REFRESH_KEY", "MAX_DATE", "PERMISSIONS_KEY", "SOURCE_KEY", "TOKEN_KEY", "USER_ID_KEY", "VERSION_KEY", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static AccessToken a(JSONObject jSONObject) throws JSONException {
            if (jSONObject.getInt("version") > 1) {
                throw new FacebookException("Unknown AccessToken serialization format.");
            }
            String token = jSONObject.getString("token");
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray permissionsArray = jSONObject.getJSONArray("permissions");
            JSONArray declinedPermissionsArray = jSONObject.getJSONArray("declined_permissions");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            String string = jSONObject.getString("source");
            Intrinsics.e(string, "jsonObject.getString(SOURCE_KEY)");
            AccessTokenSource accessTokenSourceValueOf = AccessTokenSource.valueOf(string);
            String applicationId = jSONObject.getString("application_id");
            String userId = jSONObject.getString("user_id");
            Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
            String strOptString = jSONObject.optString("graph_domain", null);
            Intrinsics.e(token, "token");
            Intrinsics.e(applicationId, "applicationId");
            Intrinsics.e(userId, "userId");
            Intrinsics.e(permissionsArray, "permissionsArray");
            ArrayList arrayListG = Utility.G(permissionsArray);
            Intrinsics.e(declinedPermissionsArray, "declinedPermissionsArray");
            return new AccessToken(token, applicationId, userId, arrayListG, Utility.G(declinedPermissionsArray), jSONArrayOptJSONArray == null ? new ArrayList() : Utility.G(jSONArrayOptJSONArray), accessTokenSourceValueOf, date, date2, date3, strOptString);
        }

        public static AccessToken b() {
            return AccessTokenManager.g.a().f15879a;
        }

        public static boolean c() {
            AccessToken accessToken = AccessTokenManager.g.a().f15879a;
            return (accessToken == null || accessToken.b()) ? false : true;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1})
    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[AccessTokenSource.values().length];
            iArr[1] = 1;
            iArr[5] = 2;
            iArr[4] = 3;
        }
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, "facebook");
    }

    public static String a() {
        throw null;
    }

    public final boolean b() {
        return new Date().after(this.X);
    }

    public final JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f0);
        jSONObject.put("expires_at", this.X.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f15877Y));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.Z));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.e0));
        jSONObject.put("last_refresh", this.h0.getTime());
        jSONObject.put("source", this.g0.name());
        jSONObject.put("application_id", this.i0);
        jSONObject.put("user_id", this.j0);
        jSONObject.put("data_access_expiration_time", this.k0.getTime());
        String str = this.l0;
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
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (Intrinsics.a(this.X, accessToken.X) && Intrinsics.a(this.f15877Y, accessToken.f15877Y) && Intrinsics.a(this.Z, accessToken.Z) && Intrinsics.a(this.e0, accessToken.e0) && Intrinsics.a(this.f0, accessToken.f0) && this.g0 == accessToken.g0 && Intrinsics.a(this.h0, accessToken.h0) && Intrinsics.a(this.i0, accessToken.i0) && Intrinsics.a(this.j0, accessToken.j0) && Intrinsics.a(this.k0, accessToken.k0)) {
            String str = this.l0;
            String str2 = accessToken.l0;
            if (str == null) {
                zA = str2 == null;
            } else {
                zA = Intrinsics.a(str, str2);
            }
            if (zA) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.k0.hashCode() + a.b(this.j0, a.b(this.i0, (this.h0.hashCode() + ((this.g0.hashCode() + a.b(this.f0, (this.e0.hashCode() + ((this.Z.hashCode() + ((this.f15877Y.hashCode() + ((this.X.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31, 31), 31)) * 31;
        String str = this.l0;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        FacebookSdk.j(LoggingBehavior.f15954Y);
        sb.append(TextUtils.join(", ", this.f15877Y));
        sb.append("]}");
        String string = sb.toString();
        Intrinsics.e(string, "builder.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.f(dest, "dest");
        dest.writeLong(this.X.getTime());
        dest.writeStringList(new ArrayList(this.f15877Y));
        dest.writeStringList(new ArrayList(this.Z));
        dest.writeStringList(new ArrayList(this.e0));
        dest.writeString(this.f0);
        dest.writeString(this.g0.name());
        dest.writeLong(this.h0.getTime());
        dest.writeString(this.i0);
        dest.writeString(this.j0);
        dest.writeLong(this.k0.getTime());
        dest.writeString(this.l0);
    }

    public AccessToken(String accessToken, String applicationId, String userId, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str) {
        Intrinsics.f(accessToken, "accessToken");
        Intrinsics.f(applicationId, "applicationId");
        Intrinsics.f(userId, "userId");
        Validate.d(accessToken, "accessToken");
        Validate.d(applicationId, "applicationId");
        Validate.d(userId, "userId");
        Date date4 = m0;
        this.X = date == null ? date4 : date;
        Set setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        Intrinsics.e(setUnmodifiableSet, "Collections.unmodifiable…missions) else HashSet())");
        this.f15877Y = setUnmodifiableSet;
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        Intrinsics.e(setUnmodifiableSet2, "Collections.unmodifiable…missions) else HashSet())");
        this.Z = setUnmodifiableSet2;
        Set setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        Intrinsics.e(setUnmodifiableSet3, "Collections.unmodifiable…missions) else HashSet())");
        this.e0 = setUnmodifiableSet3;
        this.f0 = accessToken;
        accessTokenSource = accessTokenSource == null ? o0 : accessTokenSource;
        if (str != null && str.equals("instagram")) {
            int iOrdinal = accessTokenSource.ordinal();
            if (iOrdinal == 1) {
                accessTokenSource = AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
            } else if (iOrdinal == 4) {
                accessTokenSource = AccessTokenSource.INSTAGRAM_WEB_VIEW;
            } else if (iOrdinal == 5) {
                accessTokenSource = AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB;
            }
        }
        this.g0 = accessTokenSource;
        this.h0 = date2 == null ? n0 : date2;
        this.i0 = applicationId;
        this.j0 = userId;
        this.k0 = (date3 == null || date3.getTime() == 0) ? date4 : date3;
        this.l0 = str == null ? "facebook" : str;
    }

    public AccessToken(Parcel parcel) {
        AccessTokenSource accessTokenSourceValueOf;
        this.X = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.e(setUnmodifiableSet, "Collections.unmodifiable…HashSet(permissionsList))");
        this.f15877Y = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.e(setUnmodifiableSet2, "Collections.unmodifiable…HashSet(permissionsList))");
        this.Z = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.e(setUnmodifiableSet3, "Collections.unmodifiable…HashSet(permissionsList))");
        this.e0 = setUnmodifiableSet3;
        String string = parcel.readString();
        Validate.g(string, "token");
        if (string != null) {
            this.f0 = string;
            String string2 = parcel.readString();
            if (string2 != null) {
                accessTokenSourceValueOf = AccessTokenSource.valueOf(string2);
            } else {
                accessTokenSourceValueOf = o0;
            }
            this.g0 = accessTokenSourceValueOf;
            this.h0 = new Date(parcel.readLong());
            String string3 = parcel.readString();
            Validate.g(string3, "applicationId");
            if (string3 != null) {
                this.i0 = string3;
                String string4 = parcel.readString();
                Validate.g(string4, "userId");
                if (string4 != null) {
                    this.j0 = string4;
                    this.k0 = new Date(parcel.readLong());
                    this.l0 = parcel.readString();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
