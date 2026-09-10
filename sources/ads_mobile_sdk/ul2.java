package ads_mobile_sdk;

import com.ironsource.X3;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.dishoard;
import saneness.godward;
import saneness.supercargo;

/* JADX INFO: loaded from: classes.dex */
public final class ul2 extends godward {
    public final saran c;
    public final jk0 d;
    public final supercargo e;

    public ul2(saran backgroundScope, jk0 flags, supercargo sdkCore) {
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
        Intrinsics.checkNotNullParameter("gads:initialize_sdk_core_post_init:enabled", X3.i.W);
        if (((Boolean) dishoardVar.a("gads:initialize_sdk_core_post_init:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
            saran saranVar = this.c;
            tl2 block = new tl2(this, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return new tn0(Unit.f29295attabal);
    }
}
