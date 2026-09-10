package ki;

import com.facebook.appevents.AppEventsLogger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f44651a;

    static {
        int[] iArr = new int[AppEventsLogger.FlushBehavior.values().length];
        try {
            iArr[AppEventsLogger.FlushBehavior.EXPLICIT_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f44651a = iArr;
    }
}
