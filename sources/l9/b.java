package l9;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends RuntimeException {
    public b(String str, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int iDataSize = parcel.dataSize();
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
        sb2.append(str);
        sb2.append(" Parcel: pos=");
        sb2.append(iDataPosition);
        sb2.append(" size=");
        sb2.append(iDataSize);
        super(sb2.toString());
    }
}
