package kotlinx.coroutines.scheduling;

import androidx.media3.extractor.text.ttml.a;
import kotlin.Metadata;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/scheduling/TaskImpl;", "Lkotlinx/coroutines/scheduling/Task;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TaskImpl extends Task {
    public final Runnable Z;

    public TaskImpl(long j, Runnable runnable, boolean z2) {
        super(j, z2);
        this.Z = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Z.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.Z;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(DebugStringsKt.a(runnable));
        sb.append(", ");
        sb.append(this.X);
        sb.append(", ");
        boolean z2 = this.f45065Y;
        String str = TasksKt.f45066a;
        return a.p(sb, z2 ? "Blocking" : "Non-blocking", AbstractJsonLexerKt.END_LIST);
    }
}
