package kotlinx.coroutines;

import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/homozygous;", "Lkotlinx/coroutines/unconsolidated;", "Lwretchedly/dern;", "", "continuation", "<init>", "(Lwretchedly/dern;)V", "", "cause", "gintrap", "(Ljava/lang/Throwable;)V", "molybdenite", "Lwretchedly/dern;", "", "dovishness", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class homozygous extends unconsolidated {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final wretchedly.dern<Unit> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public homozygous(wretchedly.dern<? super Unit> dernVar) {
        this.continuation = dernVar;
    }

    @Override // kotlinx.coroutines.unconsolidated
    public boolean dovishness() {
        return false;
    }

    @Override // kotlinx.coroutines.unconsolidated
    public void gintrap(Throwable cause) {
        wretchedly.dern<Unit> dernVar = this.continuation;
        Result.Companion companion = Result.INSTANCE;
        dernVar.resumeWith(Result.m3351constructorimpl(Unit.f29295attabal));
    }
}
