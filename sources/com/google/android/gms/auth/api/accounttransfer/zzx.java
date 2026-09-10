package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class zzx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int i3 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    int i4 = SafeParcelReader.readInt(parcel, header);
                    hashSet.add(1);
                    i3 = i4;
                    break;
                case 2:
                    String strCreateString = SafeParcelReader.createString(parcel, header);
                    hashSet.add(2);
                    str = strCreateString;
                    break;
                case 3:
                    int i5 = SafeParcelReader.readInt(parcel, header);
                    hashSet.add(3);
                    i2 = i5;
                    break;
                case 4:
                    byte[] bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    hashSet.add(4);
                    bArr = bArrCreateByteArray;
                    break;
                case 5:
                    PendingIntent pendingIntent2 = (PendingIntent) SafeParcelReader.createParcelable(parcel, header, PendingIntent.CREATOR);
                    hashSet.add(5);
                    pendingIntent = pendingIntent2;
                    break;
                case 6:
                    DeviceMetaData deviceMetaData2 = (DeviceMetaData) SafeParcelReader.createParcelable(parcel, header, DeviceMetaData.CREATOR);
                    hashSet.add(6);
                    deviceMetaData = deviceMetaData2;
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        if (parcel.dataPosition() == iValidateObjectHeader) {
            return new zzw(hashSet, i3, str, i2, bArr, pendingIntent, deviceMetaData);
        }
        throw new SafeParcelReader.ParseException(a.h(iValidateObjectHeader, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzw[i2];
    }
}
