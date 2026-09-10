package pigboat;

import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* JADX INFO: compiled from: StackTraceRecovery.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\"\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001c\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b*\f\b\u0000\u0010\u0010\"\u00020\u000f2\u00020\u000f*\f\b\u0000\u0010\u0011\"\u00020\u00052\u00020\u0005¨\u0006\u0012"}, d2 = {"", "E", "exception", "attabal", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/StackTraceElement;", "Ljava/lang/StackTraceElement;", "ARTIFICIAL_FRAME", "", "kotlin.jvm.PlatformType", "saneness", "Ljava/lang/String;", "baseContinuationImplClassName", "dern", "stackTraceRecoveryClassName", "Ligo/dern;", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class cuirassed {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final StackTraceElement f35334attabal = new attabal.attabal().attabal();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final String f35335dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final String f35336saneness;

    static {
        Object objM3351constructorimpl;
        Object objM3351constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        if (Result.m3354exceptionOrNullimpl(objM3351constructorimpl) != null) {
            objM3351constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f35336saneness = (String) objM3351constructorimpl;
        try {
            objM3351constructorimpl2 = Result.m3351constructorimpl(cuirassed.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM3351constructorimpl2 = Result.m3351constructorimpl(p002kotlin.dern.attabal(th2));
        }
        if (Result.m3354exceptionOrNullimpl(objM3351constructorimpl2) != null) {
            objM3351constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f35335dern = (String) objM3351constructorimpl2;
    }

    public static final <E extends Throwable> E attabal(E e) {
        return e;
    }
}
