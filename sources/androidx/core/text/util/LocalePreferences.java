package androidx.core.text.util;

import android.icu.number.NumberFormatter;
import android.icu.number.UnlocalizedNumberFormatter;
import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.Calendar;
import android.icu.util.MeasureUnit;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class LocalePreferences {

    /* JADX INFO: renamed from: androidx.core.text.util.LocalePreferences$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4403a;

        static {
            int[] iArr = new int[DateFormat.HourCycle.values().length];
            f4403a = iArr;
            try {
                DateFormat.HourCycle unused = DateFormat.HourCycle.HOUR_CYCLE_11;
                iArr[DateFormat.HourCycle.HOUR_CYCLE_11.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr2 = f4403a;
                DateFormat.HourCycle unused3 = DateFormat.HourCycle.HOUR_CYCLE_12;
                iArr2[DateFormat.HourCycle.HOUR_CYCLE_12.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr3 = f4403a;
                DateFormat.HourCycle unused5 = DateFormat.HourCycle.HOUR_CYCLE_23;
                iArr3[DateFormat.HourCycle.HOUR_CYCLE_23.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr4 = f4403a;
                DateFormat.HourCycle unused7 = DateFormat.HourCycle.HOUR_CYCLE_24;
                iArr4[DateFormat.HourCycle.HOUR_CYCLE_24.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static class Api24Impl {
        public static String a(Locale locale) {
            return Calendar.getInstance(locale).getType();
        }

        public static Locale b() {
            return Locale.getDefault(Locale.Category.FORMAT);
        }
    }

    public static class Api33Impl {
        public static String a(Locale locale) {
            int i2 = AnonymousClass1.f4403a[DateTimePatternGenerator.getInstance(locale).getDefaultHourCycle().ordinal()];
            if (i2 == 1) {
                return "h11";
            }
            if (i2 == 2) {
                return "h12";
            }
            if (i2 != 3) {
                return i2 != 4 ? "" : "h24";
            }
            return "h23";
        }

        public static String b(Locale locale) {
            String identifier = ((UnlocalizedNumberFormatter) ((UnlocalizedNumberFormatter) NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(locale).format(1L).getOutputUnit().getIdentifier();
            return identifier.startsWith("fahrenhe") ? "fahrenhe" : identifier;
        }
    }

    public static class CalendarType {

        @Retention(RetentionPolicy.SOURCE)
        public @interface CalendarTypes {
        }
    }

    public static class FirstDayOfWeek {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Days {
        }
    }

    public static class HourCycle {

        @Retention(RetentionPolicy.SOURCE)
        public @interface HourCycleTypes {
        }
    }

    public static class TemperatureUnit {

        @Retention(RetentionPolicy.SOURCE)
        public @interface TemperatureUnits {
        }
    }
}
