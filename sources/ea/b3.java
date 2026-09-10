package ea;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.l6;
import com.google.android.gms.internal.measurement.m6;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b3 extends l6 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f39262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h3 f39263b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(h3 h3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f39262a = atomicReference;
        this.f39263b = h3Var;
    }

    @Override // ea.k0
    public final void L(y3 y3Var) {
        AtomicReference atomicReference = this.f39262a;
        synchronized (atomicReference) {
            s0 s0Var = ((m1) this.f39263b.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39760n.c(Integer.valueOf(y3Var.f39930a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(y3Var);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.l6
    public final boolean q(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 2) {
            return false;
        }
        y3 y3Var = (y3) m6.a(parcel, y3.CREATOR);
        m6.d(parcel);
        L(y3Var);
        return true;
    }
}
