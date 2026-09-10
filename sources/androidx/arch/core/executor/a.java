package androidx.arch.core.executor;

import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {
    public final /* synthetic */ int X;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.X) {
            case 0:
                ArchTaskExecutor.a().f3676a.f3678b.execute(runnable);
                break;
            case 1:
                runnable.run();
                break;
            default:
                AppLovinSdkUtils.runOnUiThread(runnable);
                break;
        }
    }
}
