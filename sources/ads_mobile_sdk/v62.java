package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.loun;
import saneness.monopodial;
import saneness.polliwog;
import saneness.retroflection;

/* JADX INFO: loaded from: classes.dex */
public final class v62 extends w03 {
    public final u62 g;
    public final amphitheatre h;
    public final loun i;
    public v62 j;
    public final o12 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v62(no0 no0Var, List list, UUID uuid, l13 l13Var, u62 u62Var, amphitheatre amphitheatreVar, loun lounVar, int i, w03 w03Var, int i2, Boolean bool, boolean z) {
        super(no0Var, l13Var, uuid, w03Var, amphitheatre.a(), z);
        amphitheatreVar.getClass();
        this.g = u62Var;
        this.h = amphitheatreVar;
        this.i = lounVar;
        int iC = w03Var != null ? w03Var.c() : -1;
        long jF = f();
        long jF2 = f() - polliwog.f37253attabal;
        long jF3 = polliwog.f37254saneness < 0 ? -1L : f() - polliwog.f37254saneness;
        monopodial monopodialVarA = vs1.a();
        Integer numValueOf = monopodialVarA != null ? Integer.valueOf(((js1) monopodialVarA).a()) : null;
        monopodial monopodialVarA2 = vs1.a();
        this.k = new o12(i2, l13Var, no0Var, list, uuid, iC, i, jF, jF2, jF3, z, bool, numValueOf, monopodialVarA2 != null ? Integer.valueOf(((js1) monopodialVarA2).b()) : null, 536868864);
    }

    public final void a(int i, v62 nextTrace) {
        Intrinsics.checkNotNullParameter(nextTrace, "nextTrace");
        if (!b().get()) {
            this.k.a = i;
            this.j = nextTrace;
            return;
        }
        x03.a("This trace " + this.k.c.name() + " has already finished");
    }

    @Override // ads_mobile_sdk.w03
    public final o12 e() {
        return this.k;
    }

    @Override // ads_mobile_sdk.w03
    public final void h() {
        o12 o12Var = this.k;
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        this.h.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        o12Var.p = p002kotlin.time.saneness.merc(p002kotlin.time.dern.graveside(jCurrentTimeMillis, durationUnit), p002kotlin.time.dern.graveside(this.c, durationUnit));
    }

    @Override // ads_mobile_sdk.w03
    public final w03 a(no0 cuiName, List tags, boolean z) {
        v62 v62Var;
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(tags, "tags");
        o12 o12Var = this.k;
        v62 trace = new v62(cuiName, tags, o12Var.e, this.a, this.g, this.h, this.i, o12Var.g + 1, this, z, 1536);
        trace.k.x = this.k.x;
        u62 u62Var = this.g;
        u62Var.getClass();
        Intrinsics.checkNotNullParameter(trace, "trace");
        do {
            Object obj = u62Var.a.get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            v62Var = (v62) obj;
            trace.a(v62Var.k.a + 1, v62Var);
        } while (!retroflection.attabal(u62Var.a, v62Var, trace));
        return trace;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ v62(no0 no0Var, List list, UUID uuid, l13 l13Var, u62 u62Var, amphitheatre amphitheatreVar, loun lounVar, int i, w03 w03Var, boolean z, int i2) {
        w03 w03Var2 = (i2 & 256) != 0 ? null : w03Var;
        int i3 = (i2 & 512) != 0 ? -1 : 0;
        monopodial monopodialVarA = vs1.a();
        this(no0Var, list, uuid, l13Var, u62Var, amphitheatreVar, lounVar, i, w03Var2, i3, monopodialVarA != null ? Boolean.valueOf(((js1) monopodialVarA).c()) : null, z);
    }

    @Override // ads_mobile_sdk.w03
    public final void a() {
        o12[] o12VarArr;
        super.a();
        o12 o12Var = this.k;
        if (o12Var.a == 0) {
            loun lounVar = this.i;
            UUID uuid = o12Var.e;
            v62 v62Var = (v62) this.g.a.get();
            if (v62Var == null) {
                o12VarArr = new o12[0];
            } else {
                o12[] o12VarArr2 = new o12[v62Var.k.a + 1];
                while (v62Var != null) {
                    o12 o12Var2 = v62Var.k;
                    o12VarArr2[o12Var2.a] = o12Var2;
                    v62Var = v62Var.j;
                }
                o12VarArr = (o12[]) polloi.saran(o12VarArr2).toArray(new o12[0]);
            }
            p13 traceSnapshot = new p13(uuid, o12VarArr);
            d13 d13Var = (d13) lounVar;
            d13Var.getClass();
            Intrinsics.checkNotNullParameter(traceSnapshot, "traceSnapshot");
            if (!d13Var.k) {
                ArrayList arrayList = new ArrayList();
                for (o12 o12Var3 : o12VarArr) {
                    Boolean bool = (Boolean) d13Var.o.get(String.valueOf(o12Var3.c.getNumber()));
                    if (bool != null && bool.booleanValue()) {
                        arrayList.add(o12Var3);
                    }
                }
                traceSnapshot = !arrayList.isEmpty() ? new p13(traceSnapshot.a, (o12[]) arrayList.toArray(new o12[0])) : null;
            }
            if (traceSnapshot != null) {
                d13Var.d.a(traceSnapshot);
                if (d13Var.n) {
                    for (o12 o12Var4 : traceSnapshot.b) {
                        Throwable th = o12Var4.o;
                        if (th == null) {
                            th = o12Var4.n;
                        }
                        Throwable th2 = th;
                        if (th2 != null) {
                            d13Var.e.a(new nf0(th2, o12Var4.c.name(), o12Var4.b, true, o12Var4.h));
                        }
                    }
                }
            }
        }
    }
}
