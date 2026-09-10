package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Result;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/attendance;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/unconsolidated;", "Lkotlinx/coroutines/kowloon;", "continuation", "<init>", "(Lkotlinx/coroutines/kowloon;)V", "", "cause", "", "gintrap", "(Ljava/lang/Throwable;)V", "molybdenite", "Lkotlinx/coroutines/kowloon;", "", "dovishness", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class attendance<T> extends unconsolidated {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final kowloon<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public attendance(kowloon<? super T> kowloonVar) {
        this.continuation = kowloonVar;
    }

    @Override // kotlinx.coroutines.unconsolidated
    public boolean dovishness() {
        return false;
    }

    @Override // kotlinx.coroutines.unconsolidated
    public void gintrap(Throwable cause) {
        Object objLerp = adultoid().lerp();
        if (objLerp instanceof stratoscope) {
            kowloon<T> kowloonVar = this.continuation;
            Result.Companion companion = Result.INSTANCE;
            kowloonVar.resumeWith(Result.m3351constructorimpl(p002kotlin.dern.attabal(((stratoscope) objLerp).cause)));
        } else {
            kowloon<T> kowloonVar2 = this.continuation;
            Result.Companion companion2 = Result.INSTANCE;
            kowloonVar2.resumeWith(Result.m3351constructorimpl(claque.impromptu(objLerp)));
        }
    }
}
