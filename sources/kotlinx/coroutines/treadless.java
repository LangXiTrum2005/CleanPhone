package kotlinx.coroutines;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/treadless;", "Lkotlinx/coroutines/formularize;", "Lkotlinx/coroutines/milliradian;", "handle", "<init>", "(Lkotlinx/coroutines/milliradian;)V", "", "cause", "", "saneness", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "kowloon", "Lkotlinx/coroutines/milliradian;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class treadless implements formularize {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final milliradian handle;

    public treadless(milliradian milliradianVar) {
        this.handle = milliradianVar;
    }

    @Override // kotlinx.coroutines.formularize
    public void saneness(Throwable cause) {
        this.handle.attabal();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.handle + ']';
    }
}
