package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.datastore.preferences.protobuf.a;
import com.facebook.internal.Validate;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/AuthenticationTokenHeader;", "Landroid/os/Parcelable;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AuthenticationTokenHeader implements Parcelable {
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new AuthenticationTokenHeader$Companion$CREATOR$1();
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f15902Y;
    public final String Z;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/AuthenticationTokenHeader$Companion;", "", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationTokenHeader;", "CREATOR", "Landroid/os/Parcelable$Creator;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    public AuthenticationTokenHeader(String encodedHeaderString) throws JSONException {
        boolean z2;
        Intrinsics.f(encodedHeaderString, "encodedHeaderString");
        Validate.d(encodedHeaderString, "encodedHeaderString");
        byte[] decodedBytes = Base64.decode(encodedHeaderString, 0);
        Intrinsics.e(decodedBytes, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decodedBytes, Charsets.f44691a));
            String alg = jSONObject.optString("alg");
            Intrinsics.e(alg, "alg");
            boolean z3 = alg.length() > 0 && alg.equals("RS256");
            String strOptString = jSONObject.optString("kid");
            Intrinsics.e(strOptString, "jsonObj.optString(\"kid\")");
            boolean z4 = strOptString.length() > 0;
            String strOptString2 = jSONObject.optString(ClientData.KEY_TYPE);
            Intrinsics.e(strOptString2, "jsonObj.optString(\"typ\")");
            z2 = z3 && z4 && (strOptString2.length() > 0);
        } catch (JSONException unused) {
        }
        if (!z2) {
            throw new IllegalArgumentException("Invalid Header");
        }
        byte[] decodedBytes2 = Base64.decode(encodedHeaderString, 0);
        Intrinsics.e(decodedBytes2, "decodedBytes");
        JSONObject jSONObject2 = new JSONObject(new String(decodedBytes2, Charsets.f44691a));
        String string = jSONObject2.getString("alg");
        Intrinsics.e(string, "jsonObj.getString(\"alg\")");
        this.X = string;
        String string2 = jSONObject2.getString(ClientData.KEY_TYPE);
        Intrinsics.e(string2, "jsonObj.getString(\"typ\")");
        this.f15902Y = string2;
        String string3 = jSONObject2.getString("kid");
        Intrinsics.e(string3, "jsonObj.getString(\"kid\")");
        this.Z = string3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
        return Intrinsics.a(this.X, authenticationTokenHeader.X) && Intrinsics.a(this.f15902Y, authenticationTokenHeader.f15902Y) && Intrinsics.a(this.Z, authenticationTokenHeader.Z);
    }

    public final int hashCode() {
        return this.Z.hashCode() + a.b(this.f15902Y, a.b(this.X, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31), 31);
    }

    public final String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.X);
        jSONObject.put(ClientData.KEY_TYPE, this.f15902Y);
        jSONObject.put("kid", this.Z);
        String string = jSONObject.toString();
        Intrinsics.e(string, "headerJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.f(dest, "dest");
        dest.writeString(this.X);
        dest.writeString(this.f15902Y);
        dest.writeString(this.Z);
    }

    public AuthenticationTokenHeader(Parcel parcel) {
        String string = parcel.readString();
        Validate.g(string, "alg");
        if (string != null) {
            this.X = string;
            String string2 = parcel.readString();
            Validate.g(string2, ClientData.KEY_TYPE);
            if (string2 != null) {
                this.f15902Y = string2;
                String string3 = parcel.readString();
                Validate.g(string3, "kid");
                if (string3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                this.Z = string3;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
