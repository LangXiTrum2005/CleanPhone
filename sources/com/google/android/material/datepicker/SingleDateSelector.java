package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new AnonymousClass2();
    public Long X;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.SingleDateSelector$2, reason: invalid class name */
    public class AnonymousClass2 implements Parcelable.Creator<SingleDateSelector> {
        @Override // android.os.Parcelable.Creator
        public final SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.X = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        public final SingleDateSelector[] newArray(int i2) {
            return new SingleDateSelector[i2];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean C0() {
        return this.X != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList D0() {
        ArrayList arrayList = new ArrayList();
        Long l2 = this.X;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Object I0() {
        return this.X;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    @Override // com.google.android.material.datepicker.DateSelector
    public final View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, final OnSelectionChangedListener onSelectionChangedListener) {
        View viewInflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        String str = Build.MANUFACTURER;
        if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("lge")) {
            editText.setInputType(17);
        } else {
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("samsung")) {
                editText.setInputType(17);
            }
        }
        SimpleDateFormat simpleDateFormatD = UtcDates.d();
        String strE = UtcDates.e(viewInflate.getResources(), simpleDateFormatD);
        textInputLayout.setPlaceholderText(strE);
        Long l2 = this.X;
        if (l2 != null) {
            editText.setText(simpleDateFormatD.format(l2));
        }
        editText.addTextChangedListener(new DateFormatTextWatcher(strE, simpleDateFormatD, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.SingleDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public final void a() {
                textInputLayout.getError();
                SingleDateSelector.this.getClass();
                onSelectionChangedListener.a();
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public final void b(Long l3) {
                SingleDateSelector singleDateSelector = SingleDateSelector.this;
                if (l3 == null) {
                    singleDateSelector.X = null;
                } else {
                    singleDateSelector.X = l3;
                }
                singleDateSelector.getClass();
                onSelectionChangedListener.b(singleDateSelector.X);
            }
        });
        DateSelector.u0(editText);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void O0(long j) {
        this.X = Long.valueOf(j);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String d(Context context) {
        Resources resources = context.getResources();
        Long l2 = this.X;
        return resources.getString(R.string.mtrl_picker_announce_current_selection, l2 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : DateStrings.d(l2.longValue(), Locale.getDefault()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList e0() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int h(Context context) {
        return MaterialAttributes.c(R.attr.materialCalendarTheme, context, MaterialDatePicker.class.getCanonicalName()).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String o(Context context) {
        Resources resources = context.getResources();
        Long l2 = this.X;
        return l2 == null ? resources.getString(R.string.mtrl_picker_date_header_unselected) : resources.getString(R.string.mtrl_picker_date_header_selected, DateStrings.d(l2.longValue(), Locale.getDefault()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeValue(this.X);
    }
}
