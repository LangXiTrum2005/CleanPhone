package ads_mobile_sdk;

import android.content.Context;
import com.ironsource.X3;
import java.util.concurrent.ExecutorService;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;
import saneness.blighty;
import saneness.tithonia;

/* JADX INFO: loaded from: classes.dex */
public final class lt0 extends Lambda implements Function0 {
    public final /* synthetic */ mt0 a;
    public final /* synthetic */ ExecutorService b;
    public final /* synthetic */ blighty c;
    public final /* synthetic */ Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt0(mt0 mt0Var, ms msVar, blighty blightyVar, Context context) {
        super(0);
        this.a = mt0Var;
        this.b = msVar;
        this.c = blightyVar;
        this.d = context;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        tt0 tt0Var = this.a.a;
        ExecutorService executor = this.b;
        blighty userAgentProvider = this.c;
        Context context = this.d;
        tt0Var.getClass();
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        jk0 jk0Var = tt0Var.a;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:use_cronet_for_http_client:enabled", X3.i.W);
        it0 it0Var = ((Boolean) jk0Var.a("gads:use_cronet_for_http_client:enabled", Boolean.FALSE, zk.b)).booleanValue() ? new it0(tt0Var.a, executor, userAgentProvider) : new it0(tt0Var.a, executor, userAgentProvider);
        tithonia debugModeProvider = this.a.c;
        if (debugModeProvider != null) {
            Intrinsics.checkNotNullParameter(debugModeProvider, "debugModeProvider");
            it0Var.e = debugModeProvider;
        }
        vo chromeVariationsProvider = this.a.b;
        if (chromeVariationsProvider != null) {
            Intrinsics.checkNotNullParameter(chromeVariationsProvider, "chromeVariationsProvider");
            it0Var.d = chromeVariationsProvider;
        }
        return it0Var;
    }
}
