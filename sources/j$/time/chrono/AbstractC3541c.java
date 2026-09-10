package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC3541c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f43029a;

    static {
        int[] iArr = new int[j$.time.temporal.b.values().length];
        f43029a = iArr;
        try {
            iArr[j$.time.temporal.b.DAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f43029a[j$.time.temporal.b.WEEKS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f43029a[j$.time.temporal.b.MONTHS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f43029a[j$.time.temporal.b.YEARS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f43029a[j$.time.temporal.b.DECADES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f43029a[j$.time.temporal.b.CENTURIES.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f43029a[j$.time.temporal.b.MILLENNIA.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f43029a[j$.time.temporal.b.ERAS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
