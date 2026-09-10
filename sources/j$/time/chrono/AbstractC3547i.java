package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC3547i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f43037a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f43037a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f43037a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
