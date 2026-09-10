package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new AnonymousClass1();
    public final long X;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.DateValidatorPointForward$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<DateValidatorPointForward> {
        @Override // android.os.Parcelable.Creator
        public final DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final DateValidatorPointForward[] newArray(int i2) {
            return new DateValidatorPointForward[i2];
        }
    }

    public DateValidatorPointForward(long j) {
        this.X = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.X == ((DateValidatorPointForward) obj).X;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.X)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean i(long j) {
        return j >= this.X;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.X);
    }
}
