package com.facebook;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.a;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.security.OidcSecurityUtil;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.x.g;
import com.thinkup.core.common.n.mo;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/AuthenticationToken;", "Landroid/os/Parcelable;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AuthenticationToken implements Parcelable {
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new AuthenticationToken$Companion$CREATOR$1();
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f15899Y;
    public final AuthenticationTokenHeader Z;
    public final AuthenticationTokenClaims e0;
    public final String f0;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/facebook/AuthenticationToken$Companion;", "", "", "AUTHENTICATION_TOKEN_KEY", "Ljava/lang/String;", "CLAIMS_KEY", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationToken;", "CREATOR", "Landroid/os/Parcelable$Creator;", "EXPECTED_NONCE_KEY", "HEADER_KEY", "SIGNATURE_KEY", "TOKEN_STRING_KEY", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    public AuthenticationToken(String token, String expectedNonce) {
        Intrinsics.f(token, "token");
        Intrinsics.f(expectedNonce, "expectedNonce");
        Validate.d(token, "token");
        Validate.d(expectedNonce, "expectedNonce");
        boolean zC = false;
        List listJ = StringsKt.J(token, 0, 6, new String[]{mo.ono});
        if (listJ.size() != 3) {
            throw new IllegalArgumentException("Invalid IdToken string");
        }
        String str = (String) listJ.get(0);
        String str2 = (String) listJ.get(1);
        String str3 = (String) listJ.get(2);
        this.X = token;
        this.f15899Y = expectedNonce;
        AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str);
        this.Z = authenticationTokenHeader;
        this.e0 = new AuthenticationTokenClaims(str2, expectedNonce);
        try {
            String strB = OidcSecurityUtil.b(authenticationTokenHeader.Z);
            if (strB != null) {
                zC = OidcSecurityUtil.c(OidcSecurityUtil.a(strB), str + '.' + str2, str3);
            }
        } catch (IOException | InvalidKeySpecException unused) {
        }
        if (!zC) {
            throw new IllegalArgumentException("Invalid Signature");
        }
        this.f0 = str3;
    }

    public static final void a(AuthenticationToken authenticationToken) {
        AuthenticationTokenManager.Companion companion = AuthenticationTokenManager.f15903e;
        AuthenticationTokenManager authenticationTokenManager = AuthenticationTokenManager.d;
        if (authenticationTokenManager == null) {
            synchronized (companion) {
                authenticationTokenManager = AuthenticationTokenManager.d;
                if (authenticationTokenManager == null) {
                    LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(FacebookSdk.b());
                    Intrinsics.e(localBroadcastManager, "LocalBroadcastManager.ge…tance(applicationContext)");
                    AuthenticationTokenManager authenticationTokenManager2 = new AuthenticationTokenManager(localBroadcastManager, new AuthenticationTokenCache());
                    AuthenticationTokenManager.d = authenticationTokenManager2;
                    authenticationTokenManager = authenticationTokenManager2;
                }
            }
        }
        AuthenticationToken authenticationToken2 = authenticationTokenManager.f15904a;
        authenticationTokenManager.f15904a = authenticationToken;
        AuthenticationTokenCache authenticationTokenCache = authenticationTokenManager.f15906c;
        if (authenticationToken != null) {
            try {
                authenticationTokenCache.f15900a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.b().toString()).apply();
            } catch (JSONException unused) {
            }
        } else {
            authenticationTokenCache.f15900a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
            Utility.d(FacebookSdk.b());
        }
        if (Utility.a(authenticationToken2, authenticationToken)) {
            return;
        }
        Intent intent = new Intent(FacebookSdk.b(), (Class<?>) AuthenticationTokenManager.CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", authenticationToken2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", authenticationToken);
        authenticationTokenManager.f15905b.sendBroadcast(intent);
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.X);
        jSONObject.put("expected_nonce", this.f15899Y);
        AuthenticationTokenHeader authenticationTokenHeader = this.Z;
        authenticationTokenHeader.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("alg", authenticationTokenHeader.X);
        jSONObject2.put(ClientData.KEY_TYPE, authenticationTokenHeader.f15902Y);
        jSONObject2.put("kid", authenticationTokenHeader.Z);
        jSONObject.put(g.f39716B, jSONObject2);
        jSONObject.put("claims", this.e0.a());
        jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, this.f0);
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
        if (!(obj instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) obj;
        return Intrinsics.a(this.X, authenticationToken.X) && Intrinsics.a(this.f15899Y, authenticationToken.f15899Y) && Intrinsics.a(this.Z, authenticationToken.Z) && Intrinsics.a(this.e0, authenticationToken.e0) && Intrinsics.a(this.f0, authenticationToken.f0);
    }

    public final int hashCode() {
        return this.f0.hashCode() + ((this.e0.hashCode() + ((this.Z.hashCode() + a.b(this.f15899Y, a.b(this.X, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31), 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.f(dest, "dest");
        dest.writeString(this.X);
        dest.writeString(this.f15899Y);
        dest.writeParcelable(this.Z, i2);
        dest.writeParcelable(this.e0, i2);
        dest.writeString(this.f0);
    }

    public AuthenticationToken(Parcel parcel) {
        String string = parcel.readString();
        Validate.g(string, "token");
        if (string != null) {
            this.X = string;
            String string2 = parcel.readString();
            Validate.f(string2, "expectedNonce");
            this.f15899Y = string2;
            Parcelable parcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
            if (parcelable != null) {
                this.Z = (AuthenticationTokenHeader) parcelable;
                Parcelable parcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
                if (parcelable2 != null) {
                    this.e0 = (AuthenticationTokenClaims) parcelable2;
                    String string3 = parcel.readString();
                    Validate.g(string3, InAppPurchaseMetaData.KEY_SIGNATURE);
                    if (string3 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    this.f0 = string3;
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
