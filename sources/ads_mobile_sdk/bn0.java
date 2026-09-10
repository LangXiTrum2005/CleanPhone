package ads_mobile_sdk;

import java.util.concurrent.CancellationException;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;

/* JADX INFO: loaded from: classes.dex */
public final class bn0 extends CancellationException implements evenfall {
    public final CancellationException a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn0(CancellationException cancellationException) {
        super(cancellationException.getMessage());
        Intrinsics.checkNotNullParameter(cancellationException, "cancellationException");
        this.a = cancellationException;
    }

    @Override // saneness.evenfall
    public final Throwable a() {
        return this.a;
    }
}
