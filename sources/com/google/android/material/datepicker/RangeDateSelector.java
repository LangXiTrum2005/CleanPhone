package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.util.Pair;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class RangeDateSelector implements DateSelector<Pair<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new AnonymousClass3();
    public String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Long f19270Y;
    public Long Z;
    public Long e0;
    public Long f0;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.RangeDateSelector$3, reason: invalid class name */
    public class AnonymousClass3 implements Parcelable.Creator<RangeDateSelector> {
        @Override // android.os.Parcelable.Creator
        public final RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f19270Y = null;
            rangeDateSelector.Z = null;
            rangeDateSelector.e0 = null;
            rangeDateSelector.f0 = null;
            rangeDateSelector.f19270Y = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.Z = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        public final RangeDateSelector[] newArray(int i2) {
            return new RangeDateSelector[i2];
        }
    }

    public static void a(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, OnSelectionChangedListener onSelectionChangedListener) {
        Long l2 = rangeDateSelector.e0;
        if (l2 == null || rangeDateSelector.f0 == null) {
            if (textInputLayout.getError() != null && rangeDateSelector.X.contentEquals(textInputLayout.getError())) {
                textInputLayout.setError(null);
            }
            if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError(null);
            }
            onSelectionChangedListener.a();
        } else if (l2.longValue() <= rangeDateSelector.f0.longValue()) {
            Long l3 = rangeDateSelector.e0;
            rangeDateSelector.f19270Y = l3;
            Long l4 = rangeDateSelector.f0;
            rangeDateSelector.Z = l4;
            onSelectionChangedListener.b(new Pair(l3, l4));
        } else {
            textInputLayout.setError(rangeDateSelector.X);
            textInputLayout2.setError(" ");
            onSelectionChangedListener.a();
        }
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            textInputLayout.getError();
        } else {
            if (TextUtils.isEmpty(textInputLayout2.getError())) {
                return;
            }
            textInputLayout2.getError();
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean C0() {
        Long l2 = this.f19270Y;
        return (l2 == null || this.Z == null || l2.longValue() > this.Z.longValue()) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList D0() {
        ArrayList arrayList = new ArrayList();
        Long l2 = this.f19270Y;
        if (l2 != null) {
            arrayList.add(l2);
        }
        Long l3 = this.Z;
        if (l3 != null) {
            arrayList.add(l3);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Object I0() {
        return new Pair(this.f19270Y, this.Z);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    @Override // com.google.android.material.datepicker.DateSelector
    public final View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, final OnSelectionChangedListener onSelectionChangedListener) {
        View viewInflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_range_start);
        final TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        String str = Build.MANUFACTURER;
        if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("lge")) {
            editText.setInputType(17);
            editText2.setInputType(17);
        } else {
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("samsung")) {
                editText.setInputType(17);
                editText2.setInputType(17);
            }
        }
        this.X = viewInflate.getResources().getString(R.string.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormatD = UtcDates.d();
        Long l2 = this.f19270Y;
        if (l2 != null) {
            editText.setText(simpleDateFormatD.format(l2));
            this.e0 = this.f19270Y;
        }
        Long l3 = this.Z;
        if (l3 != null) {
            editText2.setText(simpleDateFormatD.format(l3));
            this.f0 = this.Z;
        }
        String strE = UtcDates.e(viewInflate.getResources(), simpleDateFormatD);
        textInputLayout.setPlaceholderText(strE);
        textInputLayout2.setPlaceholderText(strE);
        editText.addTextChangedListener(new DateFormatTextWatcher(strE, simpleDateFormatD, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public final void a() {
                RangeDateSelector rangeDateSelector = RangeDateSelector.this;
                rangeDateSelector.e0 = null;
                RangeDateSelector.a(rangeDateSelector, textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public final void b(Long l4) {
                RangeDateSelector rangeDateSelector = RangeDateSelector.this;
                rangeDateSelector.e0 = l4;
                RangeDateSelector.a(rangeDateSelector, textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        editText2.addTextChangedListener(new DateFormatTextWatcher(strE, simpleDateFormatD, textInputLayout2, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.2
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public final void a() {
                RangeDateSelector rangeDateSelector = RangeDateSelector.this;
                rangeDateSelector.f0 = null;
                RangeDateSelector.a(rangeDateSelector, textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public final void b(Long l4) {
                RangeDateSelector rangeDateSelector = RangeDateSelector.this;
                rangeDateSelector.f0 = l4;
                RangeDateSelector.a(rangeDateSelector, textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        DateSelector.u0(editText, editText2);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void O0(long j) {
        Long l2 = this.f19270Y;
        if (l2 == null) {
            this.f19270Y = Long.valueOf(j);
        } else if (this.Z == null && l2.longValue() <= j) {
            this.Z = Long.valueOf(j);
        } else {
            this.Z = null;
            this.f19270Y = Long.valueOf(j);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String d(Context context) {
        Resources resources = context.getResources();
        Pair pairA = DateStrings.a(this.f19270Y, this.Z);
        Object obj = pairA.f4407a;
        String string = obj == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : (String) obj;
        Object obj2 = pairA.f4408b;
        return resources.getString(R.string.mtrl_picker_announce_current_range_selection, string, obj2 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : (String) obj2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList e0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(this.f19270Y, this.Z));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int h(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return MaterialAttributes.c(Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? R.attr.materialCalendarTheme : R.attr.materialCalendarFullscreenTheme, context, MaterialDatePicker.class.getCanonicalName()).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String o(Context context) {
        Resources resources = context.getResources();
        Long l2 = this.f19270Y;
        if (l2 == null && this.Z == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l3 = this.Z;
        if (l3 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, DateStrings.b(l2.longValue()));
        }
        if (l2 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, DateStrings.b(l3.longValue()));
        }
        Pair pairA = DateStrings.a(l2, l3);
        return resources.getString(R.string.mtrl_picker_range_header_selected, pairA.f4407a, pairA.f4408b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeValue(this.f19270Y);
        parcel.writeValue(this.Z);
    }
}
