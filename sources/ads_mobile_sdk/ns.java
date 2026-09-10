package ads_mobile_sdk;

import java.util.concurrent.AbstractExecutorService;
import p002kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ns {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final /* synthetic */ int f3288attabal = 0;
    public static final long i;
    public final of0 a;
    public final ms b;
    public final ms c;
    public final of0 d;
    public final ms e;
    public final of0 f;
    public final ms g;
    public final ms h;

    static {
        p002kotlin.time.saneness.Companion attabalVar = p002kotlin.time.saneness.INSTANCE;
        i = p002kotlin.time.dern.molybdenite(10, DurationUnit.SECONDS);
    }

    public ns() {
        ks ksVar = ks.a;
        int iMax = Math.max(2, Math.min(10, Runtime.getRuntime().availableProcessors()));
        long j = i;
        of0 of0VarA = ksVar.a(iMax, j, "BG");
        this.a = of0VarA;
        ms msVarA = a(of0VarA.a());
        this.b = msVarA;
        this.c = msVarA;
        of0 of0VarA2 = ksVar.a(Math.max(2, Math.min(5, Runtime.getRuntime().availableProcessors())), j, "Load");
        this.d = of0VarA2;
        this.e = a(of0VarA2.a());
        of0 of0VarA3 = ksVar.a(Math.max(2, Math.min(5, Runtime.getRuntime().availableProcessors())), j, "WebViewInit");
        this.f = of0VarA3;
        ms msVarA2 = a(of0VarA3.a());
        this.g = msVarA2;
        this.h = msVarA2;
    }

    public static ms a(AbstractExecutorService abstractExecutorService) {
        return new ms(abstractExecutorService);
    }
}
