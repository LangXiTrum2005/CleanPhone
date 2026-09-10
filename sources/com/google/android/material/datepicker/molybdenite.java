package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: compiled from: TimeSource.java */
/* JADX INFO: loaded from: classes3.dex */
public class molybdenite {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final molybdenite f20177dern = new molybdenite(null, null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Long f20178attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final TimeZone f20179saneness;

    public molybdenite(Long l, TimeZone timeZone) {
        this.f20178attabal = l;
        this.f20179saneness = timeZone;
    }

    public static molybdenite dern() {
        return f20177dern;
    }

    public Calendar attabal() {
        return saneness(this.f20179saneness);
    }

    public Calendar saneness(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f20178attabal;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
