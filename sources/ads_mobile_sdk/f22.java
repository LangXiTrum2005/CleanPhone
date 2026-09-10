package ads_mobile_sdk;

import com.ironsource.X3;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.undertread;

/* JADX INFO: loaded from: classes.dex */
public final class f22 implements undertread {
    public final h1 a;
    public final k22 b;
    public final jk0 c;

    public f22(h1 adConfiguration, k22 playPrewarmManager, jk0 flags) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(playPrewarmManager, "playPrewarmManager");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = adConfiguration;
        this.b = playPrewarmManager;
        this.c = flags;
    }

    @Override // saneness.undertread
    public final Object i(wretchedly.dern dernVar) {
        jk0 jk0Var = this.c;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:play_prewarm:enabled", X3.i.W);
        if (!((Boolean) jk0Var.a("gads:play_prewarm:enabled", Boolean.TRUE, zk.b)).booleanValue()) {
            return Unit.f29295attabal;
        }
        m22 m22Var = this.a.s0;
        if (m22Var != null && m22Var.a && m22Var.b.length() > 0) {
            k22 k22Var = this.b;
            String str = m22Var.b;
            saran saranVar = k22Var.a;
            j22 block = new j22(k22Var, str, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
            Unit unit = Unit.f29295attabal;
            if (unit == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                return unit;
            }
        }
        return Unit.f29295attabal;
    }
}
