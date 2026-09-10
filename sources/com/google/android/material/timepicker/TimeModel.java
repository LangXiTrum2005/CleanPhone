package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new AnonymousClass1();
    public final MaxInputValidator X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final MaxInputValidator f19543Y;
    public final int Z;
    public int e0;
    public int f0;
    public int g0;
    public int h0;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimeModel$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<TimeModel> {
        @Override // android.os.Parcelable.Creator
        public final TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TimeModel[] newArray(int i2) {
            return new TimeModel[i2];
        }
    }

    public TimeModel(int i2, int i3, int i4, int i5) {
        this.e0 = i2;
        this.f0 = i3;
        this.g0 = i4;
        this.Z = i5;
        this.h0 = i2 >= 12 ? 1 : 0;
        this.X = new MaxInputValidator(59);
        this.f19543Y = new MaxInputValidator(i5 == 1 ? 23 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final int b() {
        if (this.Z == 1) {
            return this.e0 % 24;
        }
        int i2 = this.e0;
        if (i2 % 12 == 0) {
            return 12;
        }
        return this.h0 == 1 ? i2 - 12 : i2;
    }

    public final void c(int i2) {
        if (this.Z == 1) {
            this.e0 = i2;
        } else {
            this.e0 = (i2 % 12) + (this.h0 != 1 ? 0 : 12);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i2) {
        if (i2 != this.h0) {
            this.h0 = i2;
            int i3 = this.e0;
            if (i3 < 12 && i2 == 1) {
                this.e0 = i3 + 12;
            } else {
                if (i3 < 12 || i2 != 0) {
                    return;
                }
                this.e0 = i3 - 12;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.e0 == timeModel.e0 && this.f0 == timeModel.f0 && this.Z == timeModel.Z && this.g0 == timeModel.g0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.Z), Integer.valueOf(this.e0), Integer.valueOf(this.f0), Integer.valueOf(this.g0)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.e0);
        parcel.writeInt(this.f0);
        parcel.writeInt(this.g0);
        parcel.writeInt(this.Z);
    }
}
