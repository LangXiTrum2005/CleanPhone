package l7;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new h(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f45151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f45152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45153e;

    public i(String str, String expectedNonce) {
        kotlin.jvm.internal.n.f(expectedNonce, "expectedNonce");
        q7.f.l(str, "token");
        q7.f.l(expectedNonce, "expectedNonce");
        boolean zQ = false;
        List listI0 = an.h.I0(str, new String[]{"."}, 0, 6);
        if (listI0.size() != 3) {
            throw new IllegalArgumentException("Invalid IdToken string");
        }
        String str2 = (String) listI0.get(0);
        String str3 = (String) listI0.get(1);
        String str4 = (String) listI0.get(2);
        this.f45149a = str;
        this.f45150b = expectedNonce;
        k kVar = new k(str2);
        this.f45151c = kVar;
        this.f45152d = new j(str3, expectedNonce);
        try {
            String strA = x7.a.A(kVar.f45181c);
            if (strA != null) {
                zQ = x7.a.Q(x7.a.y(strA), str2 + '.' + str3, str4);
            }
        } catch (IOException | InvalidKeySpecException unused) {
        }
        if (!zQ) {
            throw new IllegalArgumentException("Invalid Signature");
        }
        this.f45153e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.n.a(this.f45149a, iVar.f45149a) && kotlin.jvm.internal.n.a(this.f45150b, iVar.f45150b) && kotlin.jvm.internal.n.a(this.f45151c, iVar.f45151c) && kotlin.jvm.internal.n.a(this.f45152d, iVar.f45152d) && kotlin.jvm.internal.n.a(this.f45153e, iVar.f45153e);
    }

    public final int hashCode() {
        return this.f45153e.hashCode() + ((this.f45152d.hashCode() + ((this.f45151c.hashCode() + d5.u.e(d5.u.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f45149a), 31, this.f45150b)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.f(dest, "dest");
        dest.writeString(this.f45149a);
        dest.writeString(this.f45150b);
        dest.writeParcelable(this.f45151c, i10);
        dest.writeParcelable(this.f45152d, i10);
        dest.writeString(this.f45153e);
    }

    public i(Parcel parcel) {
        String string = parcel.readString();
        q7.f.n(string, "token");
        this.f45149a = string;
        String string2 = parcel.readString();
        q7.f.n(string2, "expectedNonce");
        this.f45150b = string2;
        Parcelable parcelable = parcel.readParcelable(k.class.getClassLoader());
        if (parcelable != null) {
            this.f45151c = (k) parcelable;
            Parcelable parcelable2 = parcel.readParcelable(j.class.getClassLoader());
            if (parcelable2 != null) {
                this.f45152d = (j) parcelable2;
                String string3 = parcel.readString();
                q7.f.n(string3, InAppPurchaseMetaData.KEY_SIGNATURE);
                this.f45153e = string3;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
