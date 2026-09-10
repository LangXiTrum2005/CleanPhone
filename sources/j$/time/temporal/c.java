package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f43178a;

    static {
        int[] iArr = new int[i.values().length];
        f43178a = iArr;
        try {
            iArr[i.WEEK_BASED_YEARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f43178a[i.QUARTER_YEARS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
