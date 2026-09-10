package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public final Operator X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ArrayList f19243Y;
    public static final AnonymousClass1 Z = new AnonymousClass1();
    public static final AnonymousClass2 e0 = new AnonymousClass2();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new AnonymousClass3();

    /* JADX INFO: renamed from: com.google.android.material.datepicker.CompositeDateValidator$1, reason: invalid class name */
    public class AnonymousClass1 implements Operator {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public final boolean a(ArrayList arrayList, long j) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && dateValidator.i(j)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public final int getId() {
            return 1;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.CompositeDateValidator$2, reason: invalid class name */
    public class AnonymousClass2 implements Operator {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public final boolean a(ArrayList arrayList, long j) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && !dateValidator.i(j)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public final int getId() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.CompositeDateValidator$3, reason: invalid class name */
    public class AnonymousClass3 implements Parcelable.Creator<CompositeDateValidator> {
        @Override // android.os.Parcelable.Creator
        public final CompositeDateValidator createFromParcel(Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int i2 = parcel.readInt();
            Operator operator = CompositeDateValidator.e0;
            if (i2 != 2 && i2 == 1) {
                operator = CompositeDateValidator.Z;
            }
            arrayList.getClass();
            return new CompositeDateValidator(arrayList, operator);
        }

        @Override // android.os.Parcelable.Creator
        public final CompositeDateValidator[] newArray(int i2) {
            return new CompositeDateValidator[i2];
        }
    }

    public interface Operator {
        boolean a(ArrayList arrayList, long j);

        int getId();
    }

    public CompositeDateValidator(ArrayList arrayList, Operator operator) {
        this.f19243Y = arrayList;
        this.X = operator;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.f19243Y.equals(compositeDateValidator.f19243Y) && this.X.getId() == compositeDateValidator.X.getId();
    }

    public final int hashCode() {
        return this.f19243Y.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean i(long j) {
        return this.X.a(this.f19243Y, j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.f19243Y);
        parcel.writeInt(this.X.getId());
    }
}
