package androidx.work.impl.utils.taskexecutor;

import androidx.work.impl.utils.SerialExecutor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface TaskExecutor {
    Executor a();

    SerialExecutor getBackgroundExecutor();
}
