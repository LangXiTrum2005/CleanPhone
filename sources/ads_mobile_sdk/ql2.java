package ads_mobile_sdk;

import com.ironsource.X3;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.dishoard;
import saneness.supercargo;

/* JADX INFO: loaded from: classes.dex */
public final class ql2 extends ox0 {
    public final saran c;
    public final jk0 d;
    public final supercargo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql2(saran backgroundScope, jk0 flags, supercargo sdkCore) {
        super((no0) null, 1);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(sdkCore, "sdkCore");
        this.c = backgroundScope;
        this.d = flags;
        this.e = sdkCore;
    }

    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        dishoard dishoardVar = this.d.s;
        dishoardVar.getClass();
        Intrinsics.checkNotNullParameter("gads:initialize_sdk_core_as_init_task:enabled", X3.i.W);
        if (((Boolean) dishoardVar.a("gads:initialize_sdk_core_as_init_task:enabled", Boolean.TRUE, zk.b)).booleanValue()) {
            saran saranVar = this.c;
            pl2 block = new pl2(this, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return new tn0(Unit.f29295attabal);
    }
}
