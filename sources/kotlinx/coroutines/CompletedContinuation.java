package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/CompletedContinuation;", "R", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class CompletedContinuation<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancelHandler f44743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function3 f44744c;
    public final Object d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f44745e;

    public CompletedContinuation(Object obj, CancelHandler cancelHandler, Function3 function3, Object obj2, Throwable th) {
        this.f44742a = obj;
        this.f44743b = cancelHandler;
        this.f44744c = function3;
        this.d = obj2;
        this.f44745e = th;
    }

    public static CompletedContinuation a(CompletedContinuation completedContinuation, CancelHandler cancelHandler, CancellationException cancellationException, int i2) {
        Object obj = completedContinuation.f44742a;
        if ((i2 & 2) != 0) {
            cancelHandler = completedContinuation.f44743b;
        }
        CancelHandler cancelHandler2 = cancelHandler;
        Function3 function3 = completedContinuation.f44744c;
        Object obj2 = completedContinuation.d;
        Throwable th = cancellationException;
        if ((i2 & 16) != 0) {
            th = completedContinuation.f44745e;
        }
        completedContinuation.getClass();
        return new CompletedContinuation(obj, cancelHandler2, function3, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompletedContinuation)) {
            return false;
        }
        CompletedContinuation completedContinuation = (CompletedContinuation) obj;
        return Intrinsics.a(this.f44742a, completedContinuation.f44742a) && Intrinsics.a(this.f44743b, completedContinuation.f44743b) && Intrinsics.a(this.f44744c, completedContinuation.f44744c) && Intrinsics.a(this.d, completedContinuation.d) && Intrinsics.a(this.f44745e, completedContinuation.f44745e);
    }

    public final int hashCode() {
        Object obj = this.f44742a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        CancelHandler cancelHandler = this.f44743b;
        int iHashCode2 = (iHashCode + (cancelHandler == null ? 0 : cancelHandler.hashCode())) * 31;
        Function3 function3 = this.f44744c;
        int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f44745e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f44742a + ", cancelHandler=" + this.f44743b + ", onCancellation=" + this.f44744c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f44745e + ')';
    }

    public /* synthetic */ CompletedContinuation(Object obj, CancelHandler cancelHandler, Function3 function3, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 2) != 0 ? null : cancelHandler, (i2 & 4) != 0 ? null : function3, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
