package ea;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.l6;
import com.google.android.gms.internal.measurement.m6;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a3 extends l6 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f39226a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(h3 h3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f39226a = atomicReference;
    }

    @Override // ea.i0
    public final void l0(List list) {
        AtomicReference atomicReference = this.f39226a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.l6
    public final boolean q(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(t3.CREATOR);
        m6.d(parcel);
        l0(arrayListCreateTypedArrayList);
        return true;
    }
}
