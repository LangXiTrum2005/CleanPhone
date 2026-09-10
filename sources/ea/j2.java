package ea;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f39508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p2 f39509c;

    public /* synthetic */ j2(p2 p2Var, AtomicReference atomicReference, int i10, boolean z10) {
        this.f39507a = i10;
        this.f39509c = p2Var;
        this.f39508b = atomicReference;
    }

    private final void a() {
        AtomicReference atomicReference = this.f39508b;
        synchronized (atomicReference) {
            try {
                try {
                    m1 m1Var = (m1) this.f39509c.f3623a;
                    atomicReference.set(Double.valueOf(m1Var.f39585d.Q0(m1Var.m().M0(), d0.f39300e0)));
                    this.f39508b.notify();
                } catch (Throwable th2) {
                    this.f39508b.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39507a) {
            case 0:
                AtomicReference atomicReference = this.f39508b;
                synchronized (atomicReference) {
                    try {
                        try {
                            m1 m1Var = (m1) this.f39509c.f3623a;
                            atomicReference.set(Boolean.valueOf(m1Var.f39585d.R0(m1Var.m().M0(), d0.f39288a0)));
                            this.f39508b.notify();
                        } catch (Throwable th2) {
                            this.f39508b.notify();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f39508b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            m1 m1Var2 = (m1) this.f39509c.f3623a;
                            atomicReference2.set(m1Var2.f39585d.N0(m1Var2.m().M0(), d0.f39291b0));
                            this.f39508b.notify();
                        } catch (Throwable th4) {
                            this.f39508b.notify();
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.f39508b;
                synchronized (atomicReference3) {
                    try {
                        try {
                            m1 m1Var3 = (m1) this.f39509c.f3623a;
                            atomicReference3.set(Long.valueOf(m1Var3.f39585d.O0(m1Var3.m().M0(), d0.f39294c0)));
                            this.f39508b.notify();
                        } catch (Throwable th6) {
                            this.f39508b.notify();
                            throw th6;
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
                return;
            case 3:
                AtomicReference atomicReference4 = this.f39508b;
                synchronized (atomicReference4) {
                    try {
                        try {
                            m1 m1Var4 = (m1) this.f39509c.f3623a;
                            atomicReference4.set(Integer.valueOf(m1Var4.f39585d.P0(m1Var4.m().M0(), d0.f39297d0)));
                            this.f39508b.notify();
                        } catch (Throwable th8) {
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        this.f39508b.notify();
                        throw th9;
                    }
                }
                return;
            case 4:
                a();
                return;
            case 5:
                p2 p2Var = this.f39509c;
                a1 a1Var = ((m1) p2Var.f3623a).f39586e;
                m1.f(a1Var);
                Bundle bundleE = a1Var.f39214n.E();
                h3 h3VarK = ((m1) p2Var.f3623a).k();
                AtomicReference atomicReference5 = this.f39508b;
                h3VarK.G0();
                h3VarK.H0();
                h3VarK.U0(new com.adjust.sdk.t0(h3VarK, atomicReference5, h3VarK.W0(false), bundleE, 7, false));
                return;
            default:
                h3 h3VarK2 = ((m1) this.f39509c.f3623a).k();
                x3 x3VarB = x3.b(v2.SGTM_CLIENT);
                AtomicReference atomicReference6 = this.f39508b;
                h3VarK2.G0();
                h3VarK2.H0();
                h3VarK2.U0(new com.adjust.sdk.t0(h3VarK2, atomicReference6, h3VarK2.W0(false), x3VarB, 8, false));
                return;
        }
    }

    public j2(p2 p2Var, AtomicReference atomicReference, int i10) {
        this.f39507a = i10;
        switch (i10) {
            case 1:
                this.f39508b = atomicReference;
                Objects.requireNonNull(p2Var);
                this.f39509c = p2Var;
                break;
            case 2:
                this.f39508b = atomicReference;
                Objects.requireNonNull(p2Var);
                this.f39509c = p2Var;
                break;
            case 3:
                this.f39508b = atomicReference;
                Objects.requireNonNull(p2Var);
                this.f39509c = p2Var;
                break;
            case 4:
                this.f39508b = atomicReference;
                Objects.requireNonNull(p2Var);
                this.f39509c = p2Var;
                break;
            default:
                this.f39508b = atomicReference;
                Objects.requireNonNull(p2Var);
                this.f39509c = p2Var;
                break;
        }
    }
}
