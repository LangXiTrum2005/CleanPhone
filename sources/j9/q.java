package j9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends BasePendingResult {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Status f43753o;

    public q(Status status) {
        super(null);
        this.f43753o = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final o G(Status status) {
        return this.f43753o;
    }
}
