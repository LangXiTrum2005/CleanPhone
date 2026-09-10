package j$.time.format;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap f43068a = new ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator f43069b = new A();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C f43070c = new C();
    public static final /* synthetic */ int d = 0;

    static C d() {
        return f43070c;
    }

    public String f(j$.time.temporal.r rVar, long j, H h2, Locale locale) {
        Object objB = b(rVar, locale);
        if (objB instanceof B) {
            return ((B) objB).a(j, h2);
        }
        return null;
    }

    public String e(j$.time.chrono.m mVar, j$.time.temporal.r rVar, long j, H h2, Locale locale) {
        if (mVar == j$.time.chrono.t.d || !(rVar instanceof j$.time.temporal.a)) {
            return f(rVar, j, h2, locale);
        }
        return null;
    }

    public Iterator h(j$.time.temporal.r rVar, H h2, Locale locale) {
        Object objB = b(rVar, locale);
        if (objB instanceof B) {
            return ((B) objB).b(h2);
        }
        return null;
    }

    public Iterator g(j$.time.chrono.m mVar, j$.time.temporal.r rVar, H h2, Locale locale) {
        if (mVar == j$.time.chrono.t.d || !(rVar instanceof j$.time.temporal.a)) {
            return h(rVar, h2, locale);
        }
        return null;
    }

    private static String c(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    private static Object b(j$.time.temporal.r rVar, Locale locale) {
        Object b2;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(rVar, locale);
        ConcurrentHashMap concurrentHashMap = f43068a;
        Object obj = concurrentHashMap.get(simpleImmutableEntry);
        if (obj != null) {
            return obj;
        }
        HashMap map = new HashMap();
        int i2 = 0;
        if (rVar == j$.time.temporal.a.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            while (i2 < eras.length) {
                if (!eras[i2].isEmpty()) {
                    long j = i2;
                    map2.put(Long.valueOf(j), eras[i2]);
                    map3.put(Long.valueOf(j), c(eras[i2]));
                }
                i2++;
            }
            if (!map2.isEmpty()) {
                map.put(H.FULL, map2);
                map.put(H.SHORT, map2);
                map.put(H.NARROW, map3);
            }
            b2 = new B(map);
        } else if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            String[] months = dateFormatSymbols2.getMonths();
            for (int i3 = 0; i3 < months.length; i3++) {
                if (!months[i3].isEmpty()) {
                    long j2 = ((long) i3) + 1;
                    map4.put(Long.valueOf(j2), months[i3]);
                    map5.put(Long.valueOf(j2), c(months[i3]));
                }
            }
            if (!map4.isEmpty()) {
                map.put(H.FULL, map4);
                map.put(H.NARROW, map5);
            }
            HashMap map6 = new HashMap();
            String[] shortMonths = dateFormatSymbols2.getShortMonths();
            while (i2 < shortMonths.length) {
                if (!shortMonths[i2].isEmpty()) {
                    map6.put(Long.valueOf(((long) i2) + 1), shortMonths[i2]);
                }
                i2++;
            }
            if (!map6.isEmpty()) {
                map.put(H.SHORT, map6);
            }
            b2 = new B(map);
        } else if (rVar == j$.time.temporal.a.DAY_OF_WEEK) {
            DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
            HashMap map7 = new HashMap();
            String[] weekdays = dateFormatSymbols3.getWeekdays();
            map7.put(1L, weekdays[2]);
            map7.put(2L, weekdays[3]);
            map7.put(3L, weekdays[4]);
            map7.put(4L, weekdays[5]);
            map7.put(5L, weekdays[6]);
            map7.put(6L, weekdays[7]);
            map7.put(7L, weekdays[1]);
            map.put(H.FULL, map7);
            HashMap map8 = new HashMap();
            map8.put(1L, c(weekdays[2]));
            map8.put(2L, c(weekdays[3]));
            map8.put(3L, c(weekdays[4]));
            map8.put(4L, c(weekdays[5]));
            map8.put(5L, c(weekdays[6]));
            map8.put(6L, c(weekdays[7]));
            map8.put(7L, c(weekdays[1]));
            map.put(H.NARROW, map8);
            HashMap map9 = new HashMap();
            String[] shortWeekdays = dateFormatSymbols3.getShortWeekdays();
            map9.put(1L, shortWeekdays[2]);
            map9.put(2L, shortWeekdays[3]);
            map9.put(3L, shortWeekdays[4]);
            map9.put(4L, shortWeekdays[5]);
            map9.put(5L, shortWeekdays[6]);
            map9.put(6L, shortWeekdays[7]);
            map9.put(7L, shortWeekdays[1]);
            map.put(H.SHORT, map9);
            b2 = new B(map);
        } else if (rVar == j$.time.temporal.a.AMPM_OF_DAY) {
            DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
            HashMap map10 = new HashMap();
            HashMap map11 = new HashMap();
            String[] amPmStrings = dateFormatSymbols4.getAmPmStrings();
            while (i2 < amPmStrings.length) {
                if (!amPmStrings[i2].isEmpty()) {
                    long j3 = i2;
                    map10.put(Long.valueOf(j3), amPmStrings[i2]);
                    map11.put(Long.valueOf(j3), c(amPmStrings[i2]));
                }
                i2++;
            }
            if (!map10.isEmpty()) {
                map.put(H.FULL, map10);
                map.put(H.SHORT, map10);
                map.put(H.NARROW, map11);
            }
            b2 = new B(map);
        } else {
            b2 = "";
        }
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, b2);
        return concurrentHashMap.get(simpleImmutableEntry);
    }
}
