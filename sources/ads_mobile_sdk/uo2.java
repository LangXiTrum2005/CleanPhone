package ads_mobile_sdk;

import java.util.concurrent.CancellationException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uo2 extends CancellationException {
    public final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo2(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.a = message;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
