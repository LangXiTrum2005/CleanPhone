package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bc.q f13933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final so0 f13934b = new so0(6);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vc f13935c;

    public ed(bc.q qVar, vc vcVar) {
        this.f13933a = qVar;
        this.f13935c = vcVar;
    }

    public final Optional a() {
        gc gcVar;
        try {
            try {
                ArrayDeque arrayDeque = (ArrayDeque) this.f13934b.f20013b;
                if (arrayDeque.isEmpty()) {
                    throw new zc();
                }
                xc xcVar = (xc) arrayDeque.pop();
                long j10 = xcVar.f21833a;
                long j11 = xcVar.f21834b;
                long j12 = xcVar.f21835c;
                bc.q qVar = this.f13933a;
                if (qVar.f5574b < j11) {
                    return Optional.of(gc.H);
                }
                this.f13935c.b(j10);
                if (j12 == 0) {
                    while (qVar.f5574b > j11) {
                        qVar.f();
                    }
                }
                return Optional.empty();
            } catch (ad unused) {
                gcVar = gc.H;
                return Optional.of(gcVar);
            } catch (zc unused2) {
                gcVar = gc.f14831x;
                return Optional.of(gcVar);
            }
        } catch (tc | uc e10) {
            throw new AssertionError(pc.a("CEiv6BFfPnitUE+D"), e10);
        }
    }
}
