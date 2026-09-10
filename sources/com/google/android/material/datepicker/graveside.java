package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: UtcDates.java */
/* JADX INFO: loaded from: classes3.dex */
public class graveside {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static AtomicReference<molybdenite> f20159attabal = new AtomicReference<>();

    public static Calendar apical() {
        Calendar calendarAttabal = taiyuan().attabal();
        calendarAttabal.set(11, 0);
        calendarAttabal.set(12, 0);
        calendarAttabal.set(13, 0);
        calendarAttabal.set(14, 0);
        calendarAttabal.setTimeZone(cutely());
        return calendarAttabal;
    }

    public static DateFormat arytenoidectomy(Locale locale) {
        return dern("yMMMM", locale);
    }

    public static long attabal(long j) {
        Calendar calendarImpassible = impassible();
        calendarImpassible.setTimeInMillis(j);
        return marial(calendarImpassible).getTimeInMillis();
    }

    public static SimpleDateFormat beachfront() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(wireman(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern()), Locale.getDefault());
        simpleDateFormat.setTimeZone(cutely());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static String competently(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(bubbles.apical.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(bubbles.apical.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(bubbles.apical.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D).replaceAll("M+", "M").replaceAll("y+", "y");
        }
        return pattern.replace(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, string3).replace("M", string2).replace("y", string);
    }

    public static TimeZone cutely() {
        return TimeZone.getTimeZone("UTC");
    }

    public static DateFormat dern(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(formularize());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    public static android.icu.util.TimeZone formularize() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar impassible() {
        return triweekly(null);
    }

    public static DateFormat impromptu(Locale locale) {
        return dern("MMMMEEEEd", locale);
    }

    public static DateFormat kowloon(Locale locale) {
        return dern("yMMMd", locale);
    }

    public static Calendar marial(Calendar calendar) {
        Calendar calendarTriweekly = triweekly(calendar);
        Calendar calendarImpassible = impassible();
        calendarImpassible.set(calendarTriweekly.get(1), calendarTriweekly.get(2), calendarTriweekly.get(5));
        return calendarImpassible;
    }

    public static DateFormat monoploid(Locale locale) {
        return dern("yMMMMEEEEd", locale);
    }

    public static DateFormat saneness(Locale locale) {
        return dern("MMMd", locale);
    }

    public static molybdenite taiyuan() {
        molybdenite molybdeniteVar = f20159attabal.get();
        return molybdeniteVar == null ? molybdenite.dern() : molybdeniteVar;
    }

    public static Calendar triweekly(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(cutely());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    public static String wireman(String str) {
        return str.replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y");
    }
}
