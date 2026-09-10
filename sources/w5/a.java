package w5;

import com.adjust.sdk.AdjustFactory;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements RejectedExecutionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f52929b;

    public /* synthetic */ a(String str, int i10) {
        this.f52928a = i10;
        this.f52929b = str;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        switch (this.f52928a) {
            case 0:
                AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), this.f52929b);
                break;
            default:
                AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), this.f52929b);
                break;
        }
    }
}
