package ads_mobile_sdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.discernable;

/* JADX INFO: loaded from: classes.dex */
public final class if0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<if0> CREATOR = new discernable();
    public final String a;
    public final int b;

    public if0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if0)) {
            return false;
        }
        if0 if0Var = (if0) obj;
        return Intrinsics.wireman(this.a, if0Var.a) && this.b == if0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ExceptionParcel(message=" + this.a + ", errorCode=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(dest);
        SafeParcelWriter.writeString(dest, 1, this.a, false);
        SafeParcelWriter.writeInt(dest, 2, this.b);
        SafeParcelWriter.finishObjectHeader(dest, iBeginObjectHeader);
    }
}
