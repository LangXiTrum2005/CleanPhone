package hyalinization;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class grimness implements Executor {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final /* synthetic */ Handler f28060kowloon;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f28060kowloon.post(runnable);
    }
}
