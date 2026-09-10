package g6;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends WeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e6.f f41567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f41568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f41569c;

    public c(e6.f fVar, u uVar, ReferenceQueue referenceQueue) {
        super(uVar, referenceQueue);
        a7.h.c(fVar, "Argument must not be null");
        this.f41567a = fVar;
        boolean z10 = uVar.f41694a;
        this.f41569c = null;
        this.f41568b = z10;
    }
}
