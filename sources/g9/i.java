package g9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends BasePendingResult {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j9.l lVar) {
        super(lVar);
        c0.i(lVar, "GoogleApiClient must not be null");
        c0.i(e9.a.f39182a, "Api must not be null");
    }

    public abstract void M(j9.c cVar);

    public final void N(Status status) {
        c0.a("Failed result must not be success", !status.b());
        J(G(status));
    }
}
