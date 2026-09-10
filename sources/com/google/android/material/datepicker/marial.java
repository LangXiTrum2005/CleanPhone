package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.internal.gintrap;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: DateFormatTextWatcher.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class marial extends gintrap {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public Runnable f20169adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final String f20170arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public int f20171dovishness = 0;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final Runnable f20172graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final TextInputLayout f20173kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final String f20174molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final DateFormat f20175monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final CalendarConstraints f20176polloi;

    public marial(final String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f20170arytenoidectomy = str;
        this.f20175monoploid = dateFormat;
        this.f20173kowloon = textInputLayout;
        this.f20176polloi = calendarConstraints;
        this.f20174molybdenite = textInputLayout.getContext().getString(bubbles.apical.mtrl_picker_out_of_range);
        this.f20172graveside = new Runnable() { // from class: com.google.android.material.datepicker.dern
            @Override // java.lang.Runnable
            public final void run() {
                marial.saneness(this.f20157kowloon, str);
            }
        };
    }

    public static /* synthetic */ void attabal(marial marialVar, long j) {
        marialVar.getClass();
        marialVar.f20173kowloon.setError(String.format(marialVar.f20174molybdenite, marialVar.competently(impromptu.dern(j))));
        marialVar.wireman();
    }

    public static /* synthetic */ void saneness(marial marialVar, String str) {
        TextInputLayout textInputLayout = marialVar.f20173kowloon;
        DateFormat dateFormat = marialVar.f20175monoploid;
        Context context = textInputLayout.getContext();
        textInputLayout.setError(context.getString(bubbles.apical.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(bubbles.apical.mtrl_picker_invalid_format_use), marialVar.competently(str)) + "\n" + String.format(context.getString(bubbles.apical.mtrl_picker_invalid_format_example), marialVar.competently(dateFormat.format(new Date(graveside.apical().getTimeInMillis())))));
        marialVar.wireman();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.f20170arytenoidectomy.length() && editable.length() >= this.f20171dovishness) {
            char cCharAt = this.f20170arytenoidectomy.charAt(editable.length());
            if (Character.isLetterOrDigit(cCharAt)) {
                return;
            }
            editable.append(cCharAt);
        }
    }

    public void beachfront(View view, Runnable runnable) {
        view.post(runnable);
    }

    @Override // com.google.android.material.internal.gintrap, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f20171dovishness = charSequence.length();
    }

    public final String competently(String str) {
        return str.replace(' ', (char) 160);
    }

    public final Runnable dern(final long j) {
        return new Runnable() { // from class: com.google.android.material.datepicker.wireman
            @Override // java.lang.Runnable
            public final void run() {
                marial.attabal(this.f20203kowloon, j);
            }
        };
    }

    public abstract void marial(Long l);

    @Override // com.google.android.material.internal.gintrap, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f20173kowloon.removeCallbacks(this.f20172graveside);
        this.f20173kowloon.removeCallbacks(this.f20169adultoid);
        this.f20173kowloon.setError(null);
        marial(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f20170arytenoidectomy.length()) {
            return;
        }
        try {
            Date date = this.f20175monoploid.parse(charSequence.toString());
            this.f20173kowloon.setError(null);
            long time = date.getTime();
            if (this.f20176polloi.impromptu().cuirassed(time) && this.f20176polloi.kowloon(time)) {
                marial(Long.valueOf(date.getTime()));
                return;
            }
            Runnable runnableDern = dern(time);
            this.f20169adultoid = runnableDern;
            beachfront(this.f20173kowloon, runnableDern);
        } catch (ParseException unused) {
            beachfront(this.f20173kowloon, this.f20172graveside);
        }
    }

    public abstract void wireman();
}
