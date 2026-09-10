package kotlinx.coroutines;

import p002kotlin.Metadata;
import p002kotlin.Unit;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/lampshade;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/merc;", "dispatcher", "Lkotlinx/coroutines/impassible;", "", "continuation", "<init>", "(Lkotlinx/coroutines/merc;Lkotlinx/coroutines/impassible;)V", "run", "()V", "kowloon", "Lkotlinx/coroutines/merc;", "arytenoidectomy", "Lkotlinx/coroutines/impassible;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lampshade implements Runnable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final impassible<Unit> continuation;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final merc dispatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public lampshade(merc mercVar, impassible<? super Unit> impassibleVar) {
        this.dispatcher = mercVar;
        this.continuation = impassibleVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.continuation.molybdenite(this.dispatcher, Unit.f29295attabal);
    }
}
