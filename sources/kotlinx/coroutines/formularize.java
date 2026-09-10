package kotlinx.coroutines;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/formularize;", "Lkotlinx/coroutines/setterwort;", "", "cause", "", "saneness", "(Ljava/lang/Throwable;)V", "attabal", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface formularize extends setterwort {

    /* JADX INFO: compiled from: CancellableContinuationImpl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/formularize$attabal;", "Lkotlinx/coroutines/formularize;", "Lkotlin/Function1;", "", "", "handler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "cause", "saneness", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "kowloon", "Lkotlin/jvm/functions/Function1;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class attabal implements formularize {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final Function1<Throwable, Unit> handler;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(Function1<? super Throwable, Unit> function1) {
            this.handler = function1;
        }

        @Override // kotlinx.coroutines.formularize
        public void saneness(Throwable cause) {
            this.handler.invoke(cause);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + creditor.attabal(this.handler) + '@' + creditor.saneness(this) + ']';
        }
    }

    void saneness(Throwable cause);
}
