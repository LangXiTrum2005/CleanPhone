package j$.time;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f43160a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f43160a = iArr;
        try {
            iArr[j$.time.temporal.a.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f43160a[j$.time.temporal.a.MONTH_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
