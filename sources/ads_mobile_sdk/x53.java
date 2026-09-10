package ads_mobile_sdk;

import ads_mobile_sdk.gg0;
import ads_mobile_sdk.i72;
import ads_mobile_sdk.t53;
import ads_mobile_sdk.w53;
import ads_mobile_sdk.x53;
import com.google.common.base.marial;
import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.arytenoidectomy;
import com.google.common.util.concurrent.cutely;
import com.google.common.util.concurrent.impromptu;
import com.google.common.util.concurrent.rotuma;
import java.util.Objects;
import saneness.demented;
import saneness.hotly;
import saneness.resalable;
import saneness.skyjacking;

/* JADX INFO: loaded from: classes.dex */
public final class x53 {
    public final resalable a;
    public final hotly b;
    public final demented c;
    public final u13 d;
    public final skyjacking e;
    public final boolean f;
    public final long g;
    public final long h;

    public x53(resalable resalableVar, hotly hotlyVar, demented dementedVar, u13 u13Var, skyjacking skyjackingVar, boolean z, long j, long j2) {
        this.a = resalableVar;
        this.b = hotlyVar;
        this.c = dementedVar;
        this.d = u13Var;
        this.e = skyjackingVar;
        this.f = z;
        this.g = j;
        this.h = j2;
    }

    public static /* synthetic */ i72 a(Throwable th) {
        return null;
    }

    public final void b(final int i) {
        if (!this.f || i >= this.g) {
            return;
        }
        this.e.a(new Runnable() { // from class: saneness.cristate
            @Override // java.lang.Runnable
            public final void run() {
                this.f37112kowloon.a(i);
            }
        }, this.h * ((long) Math.pow(2.0d, i)));
    }

    public final adultoid c(final int i) {
        return this.d.a(gf0.EVENT_ID_PRIMARY_UPDATE_PROGRAM, cutely.restrictive(this.b.a()).merc(new marial() { // from class: saneness.basipetally
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return this.f37072kowloon.a((gg0) obj);
            }
        }, rotuma.attabal()).polder(new impromptu() { // from class: saneness.replenishment
            @Override // com.google.common.util.concurrent.impromptu
            public final com.google.common.util.concurrent.adultoid apply(Object obj) {
                return this.f37288attabal.b((gg0) obj);
            }
        }, rotuma.attabal()).merc(new marial() { // from class: saneness.nephelometer
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return w53.RESULT_UPDATED;
            }
        }, rotuma.attabal()).kattegat(u53.class, new marial() { // from class: saneness.toup
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return w53.RESULT_FAILURE_INVALID_RESPONSE;
            }
        }, rotuma.attabal()).kattegat(v53.class, new marial() { // from class: saneness.superfetate
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return w53.RESULT_NOOP_NO_NEW_PROGRAM;
            }
        }, rotuma.attabal()).kattegat(t53.class, new marial() { // from class: saneness.octonal
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return this.f37234kowloon.a(i, (t53) obj);
            }
        }, rotuma.attabal()));
    }

    public final gg0 a(gg0 gg0Var) {
        switch (gg0Var.q()) {
            case STATUS_UNKNOWN:
            case STATUS_FAILURE_ARCHITECTURE_NOT_SUPPORTED:
            case STATUS_FAILURE_INVALID_RESPONSE_DECODE_FAILURE:
            case STATUS_FAILURE_INVALID_RESPONSE_HTTP_ERROR:
            case STATUS_FAILURE_INVALID_RESPONSE_EMPTY_BYTECODE:
            case STATUS_FAILURE_INVALID_RESPONSE_PROTO_ERROR:
            case STATUS_FAILURE_INVALID_RESPONSE_PROTO_ERROR_NPE:
            case STATUS_FAILURE_INVALID_RESPONSE_PROGRAM_VALIDATION_FAILED:
            case STATUS_FAILURE_INVALID_RESPONSE_SIGNATURE_VALIDATION_FAILED:
                u13 u13Var = this.d;
                gf0 gf0Var = gf0.EVENT_ID_UNSPECIFIED;
                ((kc1) u13Var.a).a(1004, -1L, null, gg0Var.q().a + "");
                throw new u53(gg0Var.q().a);
            case STATUS_UPDATE_PROGRAM_BYTECODE:
            case STATUS_UPDATE_VM_AND_PROGRAM_BYTECODE:
                return gg0Var;
            case STATUS_NO_UPDATE:
                u13 u13Var2 = this.d;
                gf0 gf0Var2 = gf0.EVENT_ID_UNSPECIFIED;
                ((kc1) u13Var2.a).a(1003, -1L, null, gg0Var.q().a + "");
                throw new v53(gg0Var.q().a);
            case STATUS_FAILURE_INVALID_RESPONSE_HTTP_RUNTIME_EXCEPTION:
                u13 u13Var3 = this.d;
                gf0 gf0Var3 = gf0.EVENT_ID_UNSPECIFIED;
                ((kc1) u13Var3.a).a(1004, -1L, null, gg0Var.q().a + "");
                throw new t53(gg0Var.q().a);
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    public final adultoid b(gg0 gg0Var) {
        if (gg0Var.q() == mv2.STATUS_UPDATE_PROGRAM_BYTECODE) {
            return this.c.a(gg0Var.p(), gg0Var.o().c());
        }
        if (gg0Var.q() == mv2.STATUS_UPDATE_VM_AND_PROGRAM_BYTECODE) {
            return this.c.a(gg0Var.p(), gg0Var.r().c(), gg0Var.o().c());
        }
        throw new AssertionError("Unreachable");
    }

    public final /* synthetic */ void a(int i) {
        c(i + 1);
    }

    public final adultoid a(Boolean bool) {
        if (!bool.booleanValue()) {
            this.d.b(gf0.EVENT_ID_PRIMARY_UPDATE_PROGRAM_NOOP_LOCAL_PROGRAM_STILL_VALID);
            return arytenoidectomy.impromptu(w53.RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID);
        }
        return c(0);
    }

    public final /* synthetic */ w53 a(int i, t53 t53Var) {
        b(i);
        return w53.RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION;
    }

    public final adultoid a() {
        cutely cutelyVarKattegat = cutely.restrictive(this.c.a()).kattegat(Throwable.class, new marial() { // from class: saneness.anxiously
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return x53.a((Throwable) obj);
            }
        }, rotuma.attabal());
        final resalable resalableVar = this.a;
        Objects.requireNonNull(resalableVar);
        return cutelyVarKattegat.merc(new marial() { // from class: saneness.mesmerise
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return Boolean.valueOf(resalableVar.a((i72) obj));
            }
        }, rotuma.attabal()).polder(new impromptu() { // from class: saneness.corn
            @Override // com.google.common.util.concurrent.impromptu
            public final com.google.common.util.concurrent.adultoid apply(Object obj) {
                return this.f37109attabal.a((Boolean) obj);
            }
        }, rotuma.attabal());
    }

    public final void a(long j) {
        if (j > 0) {
            this.e.a(new Runnable() { // from class: saneness.trottoir
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37346kowloon.a();
                }
            }, j);
        } else {
            a();
        }
    }
}
