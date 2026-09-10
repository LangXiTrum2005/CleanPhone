package kotlinx.coroutines.flow;

import p002kotlin.Metadata;
import p002kotlin.Unit;

/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/preprohormone;", "Lkotlinx/coroutines/flow/wireman;", "", "", "e", "<init>", "(Ljava/lang/Throwable;)V", "value", "", "emit", "(Ljava/lang/Object;Lwretchedly/dern;)Ljava/lang/Object;", "kowloon", "Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class preprohormone implements wireman<Object> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Throwable e;

    public preprohormone(Throwable th) {
        this.e = th;
    }

    @Override // kotlinx.coroutines.flow.wireman
    public Object emit(Object obj, wretchedly.dern<? super Unit> dernVar) throws Throwable {
        throw this.e;
    }
}
