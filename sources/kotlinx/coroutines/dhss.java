package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: NonCancellable.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0097@¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u00132\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0011H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\b2\u000e\u0010\u001a\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b&\u0010\u0004\u001a\u0004\b%\u0010\u0007R\u001a\u0010)\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0004\u001a\u0004\b'\u0010\u0007R\u001a\u0010*\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0004\u001a\u0004\b*\u0010\u0007¨\u0006,"}, d2 = {"Lkotlinx/coroutines/dhss;", "Lkotlin/coroutines/attabal;", "Lkotlinx/coroutines/monroe;", "<init>", "()V", "", "start", "()Z", "", "starveling", "(Lwretchedly/dern;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "rotuma", "()Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/milliradian;", "restrictive", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/milliradian;", "onCancelling", "invokeImmediately", "dovishness", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/milliradian;", "cause", "attabal", "(Ljava/util/concurrent/CancellationException;)V", "Lkotlinx/coroutines/dovishness;", "child", "Lkotlinx/coroutines/graveside;", "milliradian", "(Lkotlinx/coroutines/dovishness;)Lkotlinx/coroutines/graveside;", "", "toString", "()Ljava/lang/String;", "isActive", "isActive$annotations", "saneness", "isCompleted$annotations", "isCompleted", "isCancelled", "isCancelled$annotations", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class dhss extends p002kotlin.coroutines.attabal implements monroe {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final dhss f32190kowloon = new dhss();

    public dhss() {
        super(monroe.INSTANCE);
    }

    @Override // kotlinx.coroutines.monroe
    @patroclinal.wireman
    public milliradian dovishness(boolean onCancelling, boolean invokeImmediately, Function1<? super Throwable, Unit> handler) {
        return vesuvio.f32469kowloon;
    }

    @Override // kotlinx.coroutines.monroe
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.monroe
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.monroe
    @patroclinal.wireman
    public graveside milliradian(dovishness child) {
        return vesuvio.f32469kowloon;
    }

    @Override // kotlinx.coroutines.monroe
    @patroclinal.wireman
    public milliradian restrictive(Function1<? super Throwable, Unit> handler) {
        return vesuvio.f32469kowloon;
    }

    @Override // kotlinx.coroutines.monroe
    @patroclinal.wireman
    public CancellationException rotuma() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.monroe
    public boolean saneness() {
        return false;
    }

    @Override // kotlinx.coroutines.monroe
    @patroclinal.wireman
    public boolean start() {
        return false;
    }

    @Override // kotlinx.coroutines.monroe
    @patroclinal.wireman
    public Object starveling(wretchedly.dern<? super Unit> dernVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.monroe
    @patroclinal.wireman
    public void attabal(CancellationException cause) {
    }
}
