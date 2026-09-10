package ads_mobile_sdk;

import com.ironsource.X3;
import formularization.beachfront;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.juju;
import saneness.observability;

/* JADX INFO: loaded from: classes.dex */
public final class x12 extends ox0 {
    public final saran c;
    public final jk0 d;
    public boolean e;
    public final formularization.attabal f;
    public final LinkedHashMap g;
    public final ReferenceQueue h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x12(saran backgroundScope, jk0 flags) {
        super((no0) null, 3);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.c = backgroundScope;
        this.d = flags;
        this.f = beachfront.saneness(false, 1, null);
        this.g = new LinkedHashMap();
        this.h = new ReferenceQueue();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r14.attabal(null, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
    
        if (kotlinx.coroutines.splinterproof.saneness(r6, r0) == r1) goto L36;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a0 -> B:21:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a3 -> B:22:0x0055). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d4 -> B:17:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.x12 r13, wretchedly.dern r14) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.x12.a(ads_mobile_sdk.x12, wretchedly.dern):java.lang.Object");
    }

    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        jk0 jk0Var = this.d;
        jk0Var.getClass();
        boolean z = p002kotlin.time.saneness.formularize(((p002kotlin.time.saneness) jk0Var.a("gads:phantom_reference_interval:seconds", juju.attabal(2, DurationUnit.MINUTES, "gads:phantom_reference_interval:seconds", X3.i.W), zk.l)).getRawValue(), p002kotlin.time.saneness.INSTANCE.dern()) > 0;
        this.e = z;
        if (z) {
            saran saranVar = this.c;
            w12 block = new w12(this, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return new tn0(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v21 v21Var, gk2 gk2Var, wretchedly.dern dernVar) {
        v12 v12Var;
        formularization.attabal attabalVar;
        x12 x12Var;
        observability observabilityVar;
        Object obj;
        if (dernVar instanceof v12) {
            v12Var = (v12) dernVar;
            int i = v12Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                v12Var.g = i - Integer.MIN_VALUE;
            } else {
                v12Var = new v12(this, dernVar);
            }
        } else {
            v12Var = new v12(this, dernVar);
        }
        Object obj2 = v12Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = v12Var.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj2);
            if (!this.e) {
                return Unit.f29295attabal;
            }
            attabalVar = this.f;
            v12Var.a = this;
            v12Var.b = v21Var;
            v12Var.c = gk2Var;
            v12Var.d = attabalVar;
            v12Var.g = 1;
            if (attabalVar.attabal(null, v12Var) == objBeachfront) {
                return objBeachfront;
            }
            x12Var = this;
            obj = v21Var;
            observabilityVar = gk2Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = v12Var.d;
            observability observabilityVar2 = v12Var.c;
            Object obj3 = v12Var.b;
            x12Var = v12Var.a;
            p002kotlin.dern.saneness(obj2);
            attabalVar = attabalVar2;
            obj = obj3;
            observabilityVar = observabilityVar2;
        }
        try {
            x12Var.g.put(new ln0(observabilityVar, obj, x12Var.h), igo.attabal.attabal(true));
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }
}
