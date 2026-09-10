package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
abstract class DateFormatTextWatcher extends TextWatcherAdapter {
    public final TextInputLayout X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f19244Y;
    public final SimpleDateFormat Z;
    public final CalendarConstraints e0;
    public final String f0;
    public final a g0;
    public b h0;
    public int i0 = 0;

    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.material.datepicker.a] */
    public DateFormatTextWatcher(final String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f19244Y = str;
        this.Z = simpleDateFormat;
        this.X = textInputLayout;
        this.e0 = calendarConstraints;
        this.f0 = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.g0 = new Runnable() { // from class: com.google.android.material.datepicker.a
            @Override // java.lang.Runnable
            public final void run() {
                DateFormatTextWatcher dateFormatTextWatcher = this.X;
                TextInputLayout textInputLayout2 = dateFormatTextWatcher.X;
                Context context = textInputLayout2.getContext();
                textInputLayout2.setError(context.getString(R.string.mtrl_picker_invalid_format) + IOUtils.LINE_SEPARATOR_UNIX + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), str.replace(' ', (char) 160)) + IOUtils.LINE_SEPARATOR_UNIX + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), dateFormatTextWatcher.Z.format(new Date(UtcDates.f().getTimeInMillis())).replace(' ', (char) 160)));
                dateFormatTextWatcher.a();
            }
        };
    }

    public void a() {
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.f19244Y;
        if (length >= str.length() || editable.length() < this.i0) {
            return;
        }
        char cCharAt = str.charAt(editable.length());
        if (Character.isLetterOrDigit(cCharAt)) {
            return;
        }
        editable.append(cCharAt);
    }

    public abstract void b(Long l2);

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.i0 = charSequence.length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.google.android.material.datepicker.b, java.lang.Runnable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        CalendarConstraints calendarConstraints = this.e0;
        TextInputLayout textInputLayout = this.X;
        a aVar = this.g0;
        textInputLayout.removeCallbacks(aVar);
        textInputLayout.removeCallbacks(this.h0);
        textInputLayout.setError(null);
        b(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f19244Y.length()) {
            return;
        }
        try {
            Date date = this.Z.parse(charSequence.toString());
            textInputLayout.setError(null);
            final long time = date.getTime();
            if (calendarConstraints.Z.i(time)) {
                Calendar calendarC = UtcDates.c(calendarConstraints.X.X);
                calendarC.set(5, 1);
                if (calendarC.getTimeInMillis() <= time) {
                    Month month = calendarConstraints.f19230Y;
                    int i5 = month.f0;
                    Calendar calendarC2 = UtcDates.c(month.X);
                    calendarC2.set(5, i5);
                    if (time <= calendarC2.getTimeInMillis()) {
                        b(Long.valueOf(date.getTime()));
                        return;
                    }
                }
            }
            ?? r7 = new Runnable() { // from class: com.google.android.material.datepicker.b
                @Override // java.lang.Runnable
                public final void run() {
                    DateFormatTextWatcher dateFormatTextWatcher = this.X;
                    dateFormatTextWatcher.X.setError(String.format(dateFormatTextWatcher.f0, DateStrings.b(time).replace(' ', (char) 160)));
                    dateFormatTextWatcher.a();
                }
            };
            this.h0 = r7;
            textInputLayout.post(r7);
        } catch (ParseException unused) {
            textInputLayout.post(aVar);
        }
    }
}
