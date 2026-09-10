package j$.time;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f43169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f43170b;

    static {
        int[] iArr = new int[j$.time.temporal.b.values().length];
        f43170b = iArr;
        try {
            iArr[j$.time.temporal.b.YEARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f43170b[j$.time.temporal.b.DECADES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f43170b[j$.time.temporal.b.CENTURIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f43170b[j$.time.temporal.b.MILLENNIA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f43170b[j$.time.temporal.b.ERAS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[j$.time.temporal.a.values().length];
        f43169a = iArr2;
        try {
            iArr2[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f43169a[j$.time.temporal.a.YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f43169a[j$.time.temporal.a.ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
