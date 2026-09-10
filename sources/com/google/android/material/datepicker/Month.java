package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new AnonymousClass1();
    public final Calendar X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f19264Y;
    public final int Z;
    public final int e0;
    public final int f0;
    public final long g0;
    public String h0;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.Month$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        public final Month createFromParcel(Parcel parcel) {
            return Month.a(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Month[] newArray(int i2) {
            return new Month[i2];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = UtcDates.c(calendar);
        this.X = calendarC;
        this.f19264Y = calendarC.get(2);
        this.Z = calendarC.get(1);
        this.e0 = calendarC.getMaximum(7);
        this.f0 = calendarC.getActualMaximum(5);
        this.g0 = calendarC.getTimeInMillis();
    }

    public static Month a(int i2, int i3) {
        Calendar calendarG = UtcDates.g(null);
        calendarG.set(1, i2);
        calendarG.set(2, i3);
        return new Month(calendarG);
    }

    public static Month b(long j) {
        Calendar calendarG = UtcDates.g(null);
        calendarG.setTimeInMillis(j);
        return new Month(calendarG);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Month month) {
        return this.X.compareTo(month.X);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f19264Y == month.f19264Y && this.Z == month.Z;
    }

    public final String f() {
        if (this.h0 == null) {
            this.h0 = UtcDates.b("yMMMM", Locale.getDefault()).format(new Date(this.X.getTimeInMillis()));
        }
        return this.h0;
    }

    public final int g(Month month) {
        if (!(this.X instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month.f19264Y - this.f19264Y) + ((month.Z - this.Z) * 12);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f19264Y), Integer.valueOf(this.Z)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.Z);
        parcel.writeInt(this.f19264Y);
    }
}
