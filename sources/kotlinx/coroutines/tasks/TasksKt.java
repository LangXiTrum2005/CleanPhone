package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-play-services"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TasksKt {
    public static final Object a(Task task, Continuation continuation) throws Exception {
        if (!task.isComplete()) {
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
            cancellableContinuationImpl.q();
            task.addOnCompleteListener(DirectExecutor.X, new OnCompleteListener() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    Exception exception = task2.getException();
                    CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                    if (exception != null) {
                        cancellableContinuationImpl2.resumeWith(ResultKt.a(exception));
                    } else if (task2.isCanceled()) {
                        cancellableContinuationImpl2.f(null);
                    } else {
                        cancellableContinuationImpl2.resumeWith(task2.getResult());
                    }
                }
            });
            Object objP = cancellableContinuationImpl.p();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            return objP;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
