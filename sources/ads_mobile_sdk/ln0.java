package ads_mobile_sdk;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.observability;

/* JADX INFO: loaded from: classes.dex */
public final class ln0 extends PhantomReference {
    public final observability a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln0(observability task, Object a, ReferenceQueue queue) {
        super(a, queue);
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(queue, "queue");
        this.a = task;
    }
}
