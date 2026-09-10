package androidx.media3.exoplayer.audio;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Executor {
    public final /* synthetic */ Handler X;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.X.post(runnable);
    }
}
