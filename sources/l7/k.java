package l7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new h(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45181c;

    public k(String encodedHeaderString) throws JSONException {
        kotlin.jvm.internal.n.f(encodedHeaderString, "encodedHeaderString");
        q7.f.l(encodedHeaderString, "encodedHeaderString");
        byte[] decodedBytes = Base64.decode(encodedHeaderString, 0);
        kotlin.jvm.internal.n.e(decodedBytes, "decodedBytes");
        Charset charset = an.a.f3768a;
        try {
            JSONObject jSONObject = new JSONObject(new String(decodedBytes, charset));
            String alg = jSONObject.optString("alg");
            kotlin.jvm.internal.n.e(alg, "alg");
            boolean z10 = alg.length() > 0 && alg.equals("RS256");
            String strOptString = jSONObject.optString("kid");
            kotlin.jvm.internal.n.e(strOptString, "jsonObj.optString(\"kid\")");
            boolean z11 = strOptString.length() > 0;
            String strOptString2 = jSONObject.optString("typ");
            kotlin.jvm.internal.n.e(strOptString2, "jsonObj.optString(\"typ\")");
            boolean z12 = strOptString2.length() > 0;
            if (z10 && z11 && z12) {
                byte[] decodedBytes2 = Base64.decode(encodedHeaderString, 0);
                kotlin.jvm.internal.n.e(decodedBytes2, "decodedBytes");
                JSONObject jSONObject2 = new JSONObject(new String(decodedBytes2, charset));
                String string = jSONObject2.getString("alg");
                kotlin.jvm.internal.n.e(string, "jsonObj.getString(\"alg\")");
                this.f45179a = string;
                String string2 = jSONObject2.getString("typ");
                kotlin.jvm.internal.n.e(string2, "jsonObj.getString(\"typ\")");
                this.f45180b = string2;
                String string3 = jSONObject2.getString("kid");
                kotlin.jvm.internal.n.e(string3, "jsonObj.getString(\"kid\")");
                this.f45181c = string3;
                return;
            }
        } catch (JSONException unused) {
        }
        throw new IllegalArgumentException("Invalid Header");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.n.a(this.f45179a, kVar.f45179a) && kotlin.jvm.internal.n.a(this.f45180b, kVar.f45180b) && kotlin.jvm.internal.n.a(this.f45181c, kVar.f45181c);
    }

    public final int hashCode() {
        return this.f45181c.hashCode() + d5.u.e(d5.u.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f45179a), 31, this.f45180b);
    }

    public final String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f45179a);
        jSONObject.put("typ", this.f45180b);
        jSONObject.put("kid", this.f45181c);
        String string = jSONObject.toString();
        kotlin.jvm.internal.n.e(string, "headerJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.f(dest, "dest");
        dest.writeString(this.f45179a);
        dest.writeString(this.f45180b);
        dest.writeString(this.f45181c);
    }

    public k(Parcel parcel) {
        String string = parcel.readString();
        q7.f.n(string, "alg");
        this.f45179a = string;
        String string2 = parcel.readString();
        q7.f.n(string2, "typ");
        this.f45180b = string2;
        String string3 = parcel.readString();
        q7.f.n(string3, "kid");
        this.f45181c = string3;
    }
}
