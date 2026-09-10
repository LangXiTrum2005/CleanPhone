package ads_mobile_sdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import saneness.multilead;

/* JADX INFO: loaded from: classes.dex */
public final class rm0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<rm0> CREATOR = new multilead();
    public final int a;
    public ra b = null;
    public byte[] c;

    public rm0(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        a();
    }

    public final void a() {
        ra raVar = this.b;
        if (raVar != null || this.c == null) {
            if (raVar == null || this.c != null) {
                if (raVar != null && this.c != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (raVar != null || this.c != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        byte[] bArrA = this.c;
        if (bArrA == null) {
            bArrA = this.b.a();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArrA, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
