package ads_mobile_sdk;

import java.io.Closeable;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.copestone;

/* JADX INFO: loaded from: classes.dex */
public abstract class w03 implements Closeable {
    public l13 a;
    public final w03 b;
    public final long c;
    public final AtomicBoolean d;
    public final AtomicLong e;
    public final AtomicLong f;

    public w03(no0 cuiName, l13 traceMetaSet, UUID rootTraceId, w03 w03Var, long j, boolean z) {
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(rootTraceId, "rootTraceId");
        this.a = traceMetaSet;
        this.b = w03Var;
        this.c = j;
        this.d = new AtomicBoolean(false);
        this.e = new AtomicLong();
        this.f = new AtomicLong();
        copestone.attabal(cuiName, rootTraceId);
    }

    public abstract w03 a(no0 no0Var, List list, boolean z);

    public void a() {
        if (this.d.getAndSet(true)) {
            x03.a("This trace " + e().c.name() + " has already finished, can't finish again");
            return;
        }
        o12 o12VarE = e();
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        long j = this.e.get();
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        o12VarE.b(p002kotlin.time.dern.graveside(j, durationUnit));
        e().a(p002kotlin.time.dern.graveside(this.f.get(), durationUnit));
        w03 w03Var = this.b;
        if (w03Var != null) {
            w03Var.f.addAndGet(p002kotlin.time.saneness.adultoid(p002kotlin.time.saneness.polder(e().b(), e().a())));
        }
        h();
        copestone.saneness(e(), this.a);
    }

    public final AtomicBoolean b() {
        return this.d;
    }

    public final int c() {
        return e().a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j13.a(this);
    }

    public final w03 d() {
        return this.b;
    }

    public abstract o12 e();

    public final long f() {
        return this.c;
    }

    public final l13 g() {
        return this.a;
    }

    public abstract void h();

    public final void b(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (!this.d.get()) {
            e().m = false;
            e().n = e;
            return;
        }
        x03.a("This trace " + e().c.name() + " has already finished, can't set exception");
    }

    public final void a(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (this.d.get()) {
            x03.a("This trace " + e().c.name() + " has already finished, can't set causing exception");
            return;
        }
        e().m = false;
        e().o = e;
    }

    public final void a(l13 l13Var) {
        Intrinsics.checkNotNullParameter(l13Var, "<set-?>");
        this.a = l13Var;
    }
}
