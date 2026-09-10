package androidx.activity.contextaware;

import androidx.activity.ComponentActivity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1", "Landroidx/activity/contextaware/OnContextAvailableListener;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 176)
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void a(ComponentActivity context) {
        Intrinsics.f(context, "context");
        try {
            throw null;
        } catch (Throwable th) {
            ResultKt.a(th);
            throw null;
        }
    }
}
