package ads_mobile_sdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import saneness.snarler;

/* JADX INFO: loaded from: classes.dex */
public final class k72 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<k72> CREATOR = new snarler();
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;

    public k72(int i, int i2, int i3, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
