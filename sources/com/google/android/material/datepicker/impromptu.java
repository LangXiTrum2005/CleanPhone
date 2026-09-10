package com.google.android.material.datepicker;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: DateStrings.java */
/* JADX INFO: loaded from: classes3.dex */
public class impromptu {
    public static String apical(Context context, int i) {
        return graveside.apical().get(1) == i ? String.format(context.getString(bubbles.apical.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i)) : String.format(context.getString(bubbles.apical.mtrl_picker_navigate_to_year_description), Integer.valueOf(i));
    }

    public static String arytenoidectomy(long j, Locale locale) {
        return graveside.monoploid(locale).format(new Date(j));
    }

    public static technofreak.beachfront<String, String> attabal(Long l, Long l2) {
        return saneness(l, l2, null);
    }

    public static String beachfront(long j) {
        return competently(j, Locale.getDefault());
    }

    public static String competently(long j, Locale locale) {
        return graveside.saneness(locale).format(new Date(j));
    }

    public static String cutely(long j) {
        return monoploid(j) ? impromptu(j) : kowloon(j);
    }

    public static String dern(long j) {
        return wireman(j, null);
    }

    public static String formularize(long j) {
        return graveside.arytenoidectomy(Locale.getDefault()).format(new Date(j));
    }

    public static String impassible(long j) {
        return triweekly(j, Locale.getDefault());
    }

    public static String impromptu(long j) {
        return taiyuan(j, Locale.getDefault());
    }

    public static String kowloon(long j) {
        return arytenoidectomy(j, Locale.getDefault());
    }

    public static String marial(Context context, long j, boolean z, boolean z2, boolean z3) {
        String strCutely = cutely(j);
        if (z) {
            strCutely = String.format(context.getString(bubbles.apical.mtrl_picker_today_description), strCutely);
        }
        if (z2) {
            return String.format(context.getString(bubbles.apical.mtrl_picker_start_date_description), strCutely);
        }
        return z3 ? String.format(context.getString(bubbles.apical.mtrl_picker_end_date_description), strCutely) : strCutely;
    }

    public static boolean monoploid(long j) {
        Calendar calendarApical = graveside.apical();
        Calendar calendarImpassible = graveside.impassible();
        calendarImpassible.setTimeInMillis(j);
        return calendarApical.get(1) == calendarImpassible.get(1);
    }

    public static technofreak.beachfront<String, String> saneness(Long l, Long l2, SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return technofreak.beachfront.attabal(null, null);
        }
        if (l == null) {
            return technofreak.beachfront.attabal(null, wireman(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return technofreak.beachfront.attabal(wireman(l.longValue(), simpleDateFormat), null);
        }
        Calendar calendarApical = graveside.apical();
        Calendar calendarImpassible = graveside.impassible();
        calendarImpassible.setTimeInMillis(l.longValue());
        Calendar calendarImpassible2 = graveside.impassible();
        calendarImpassible2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return technofreak.beachfront.attabal(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        }
        if (calendarImpassible.get(1) == calendarImpassible2.get(1)) {
            return calendarImpassible.get(1) == calendarApical.get(1) ? technofreak.beachfront.attabal(competently(l.longValue(), Locale.getDefault()), competently(l2.longValue(), Locale.getDefault())) : technofreak.beachfront.attabal(competently(l.longValue(), Locale.getDefault()), triweekly(l2.longValue(), Locale.getDefault()));
        }
        return technofreak.beachfront.attabal(triweekly(l.longValue(), Locale.getDefault()), triweekly(l2.longValue(), Locale.getDefault()));
    }

    public static String taiyuan(long j, Locale locale) {
        return graveside.impromptu(locale).format(new Date(j));
    }

    public static String triweekly(long j, Locale locale) {
        return graveside.kowloon(locale).format(new Date(j));
    }

    public static String wireman(long j, SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        return monoploid(j) ? beachfront(j) : impassible(j);
    }
}
