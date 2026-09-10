package androidx.activity;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f3246Y;

    public /* synthetic */ d(Object obj, int i2) {
        this.X = i2;
        this.f3246Y = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                ComponentActivity.ReportFullyDrawnExecutorApi16Impl reportFullyDrawnExecutorApi16Impl = (ComponentActivity.ReportFullyDrawnExecutorApi16Impl) this.f3246Y;
                Runnable runnable = reportFullyDrawnExecutorApi16Impl.f3224Y;
                if (runnable != null) {
                    runnable.run();
                    reportFullyDrawnExecutorApi16Impl.f3224Y = null;
                    return;
                }
                return;
            case 1:
                ((ComponentActivity) this.f3246Y).invalidateMenu();
                return;
            case 2:
                ComponentDialog.a((ComponentDialog) this.f3246Y);
                return;
            default:
                FullyDrawnReporter this$0 = (FullyDrawnReporter) this.f3246Y;
                Intrinsics.f(this$0, "this$0");
                synchronized (this$0.f3228c) {
                    if (!this$0.d) {
                        this$0.f3227b.invoke();
                        this$0.a();
                    }
                    break;
                }
                return;
        }
    }
}
