package androidx.core.os;

import A.AbstractC0912t;
import android.os.OutcomeReceiver;
import kotlin.Metadata;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OutcomeReceiverKt {
    public static final OutcomeReceiver a(CancellableContinuationImpl cancellableContinuationImpl) {
        return AbstractC0912t.i(new ContinuationOutcomeReceiver(cancellableContinuationImpl));
    }
}
