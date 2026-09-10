package j$.time.zone;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f43223a;

    static {
        int[] iArr = new int[d.values().length];
        f43223a = iArr;
        try {
            iArr[d.UTC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f43223a[d.STANDARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
