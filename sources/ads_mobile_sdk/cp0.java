package ads_mobile_sdk;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;

/* JADX INFO: loaded from: classes.dex */
public final class cp0 extends CancellationException implements evenfall {
    public final TimeoutCancellationException a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp0(TimeoutCancellationException timeoutException) {
        super(timeoutException.getMessage());
        Intrinsics.checkNotNullParameter(timeoutException, "timeoutException");
        this.a = timeoutException;
    }

    @Override // saneness.evenfall
    public final Throwable a() {
        return this.a;
    }
}
