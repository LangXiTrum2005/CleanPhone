package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new AnonymousClass1();
    public final Month X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Month f19230Y;
    public final DateValidator Z;
    public final Month e0;
    public final int f0;
    public final int g0;
    public final int h0;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.CalendarConstraints$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        public final CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CalendarConstraints[] newArray(int i2) {
            return new CalendarConstraints[i2];
        }
    }

    public static final class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f19231c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f19232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DateValidator f19233b;

        static {
            UtcDates.a(Month.a(1900, 0).g0);
            UtcDates.a(Month.a(2100, 11).g0);
        }
    }

    public interface DateValidator extends Parcelable {
        boolean i(long j);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i2) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.X = month;
        this.f19230Y = month2;
        this.e0 = month3;
        this.f0 = i2;
        this.Z = dateValidator;
        if (month3 != null && month.X.compareTo(month3.X) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.X.compareTo(month2.X) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i2 < 0 || i2 > UtcDates.g(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.h0 = month.g(month2) + 1;
        this.g0 = (month2.Z - month.Z) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.X.equals(calendarConstraints.X) && this.f19230Y.equals(calendarConstraints.f19230Y) && Objects.equals(this.e0, calendarConstraints.e0) && this.f0 == calendarConstraints.f0 && this.Z.equals(calendarConstraints.Z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.f19230Y, this.e0, Integer.valueOf(this.f0), this.Z});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.X, 0);
        parcel.writeParcelable(this.f19230Y, 0);
        parcel.writeParcelable(this.e0, 0);
        parcel.writeParcelable(this.Z, 0);
        parcel.writeInt(this.f0);
    }
}
