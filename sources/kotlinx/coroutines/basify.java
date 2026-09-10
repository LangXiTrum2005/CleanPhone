package kotlinx.coroutines;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/basify;", "", "<init>", "()V", "Lkotlinx/coroutines/lerp;", "attabal", "()Lkotlinx/coroutines/lerp;", "", "dern", "eventLoop", "wireman", "(Lkotlinx/coroutines/lerp;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "saneness", "Ljava/lang/ThreadLocal;", "ref", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class basify {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final basify f32112attabal = new basify();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final ThreadLocal<lerp> ref = pigboat.merc.attabal(new pigboat.stratoscope("ThreadLocalEventLoop"));

    public final lerp attabal() {
        return ref.get();
    }

    public final void dern() {
        ref.set(null);
    }

    public final lerp saneness() {
        ThreadLocal<lerp> threadLocal = ref;
        lerp lerpVar = threadLocal.get();
        if (lerpVar != null) {
            return lerpVar;
        }
        lerp lerpVarAttabal = sayid.attabal();
        threadLocal.set(lerpVarAttabal);
        return lerpVarAttabal;
    }

    public final void wireman(lerp eventLoop) {
        ref.set(eventLoop);
    }
}
