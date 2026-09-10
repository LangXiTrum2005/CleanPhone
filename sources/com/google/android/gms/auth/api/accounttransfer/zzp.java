package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        ArrayList arrayList = null;
        zzs zzsVar = null;
        int i3 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                int i4 = SafeParcelReader.readInt(parcel, header);
                hashSet.add(1);
                i3 = i4;
            } else if (fieldId == 2) {
                ArrayList arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, zzu.CREATOR);
                hashSet.add(2);
                arrayList = arrayListCreateTypedList;
            } else if (fieldId == 3) {
                int i5 = SafeParcelReader.readInt(parcel, header);
                hashSet.add(3);
                i2 = i5;
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                zzs zzsVar2 = (zzs) SafeParcelReader.createParcelable(parcel, header, zzs.CREATOR);
                hashSet.add(4);
                zzsVar = zzsVar2;
            }
        }
        if (parcel.dataPosition() == iValidateObjectHeader) {
            return new zzo(hashSet, i3, arrayList, i2, zzsVar);
        }
        throw new SafeParcelReader.ParseException(a.h(iValidateObjectHeader, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzo[i2];
    }
}
