package paddywack;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: dates.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000#\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0006\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0007\"\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n\"\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"", "Ljava/util/Date;", "attabal", "(Ljava/lang/String;)Ljava/util/Date;", "saneness", "(Ljava/util/Date;)Ljava/lang/String;", "paddywack/dern$attabal", "Lpaddywack/dern$attabal;", "STANDARD_DATE_FORMAT", "", "[Ljava/lang/String;", "BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS", "Ljava/text/DateFormat;", "dern", "[Ljava/text/DateFormat;", "BROWSER_COMPATIBLE_DATE_FORMATS", "okhttp"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f35006attabal = new attabal();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final DateFormat[] f35007dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final String[] f35008saneness;

    /* JADX INFO: compiled from: dates.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"paddywack/dern$attabal", "Ljava/lang/ThreadLocal;", "Ljava/text/DateFormat;", "attabal", "()Ljava/text/DateFormat;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class attabal extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(hereditist.wireman.f27718beachfront);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f35008saneness = strArr;
        f35007dern = new DateFormat[strArr.length];
    }

    public static final Date attabal(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = f35006attabal.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f35008saneness;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    DateFormat[] dateFormatArr = f35007dern;
                    DateFormat simpleDateFormat = dateFormatArr[i];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f35008saneness[i], Locale.US);
                        simpleDateFormat.setTimeZone(hereditist.wireman.f27718beachfront);
                        dateFormatArr[i] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                    i = i2;
                }
                Unit unit = Unit.f29295attabal;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final String saneness(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        String str = f35006attabal.get().format(date);
        Intrinsics.checkNotNullExpressionValue(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }
}
