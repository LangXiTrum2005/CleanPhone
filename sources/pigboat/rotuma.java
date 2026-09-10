package pigboat;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: Scopes.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0017\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lpigboat/rotuma;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/attabal;", "Ligo/dern;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lwretchedly/dern;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lwretchedly/dern;)V", "", "state", "", "trm", "(Ljava/lang/Object;)V", "tectonization", "()V", "molet", "polloi", "Lwretchedly/dern;", "getCallerFrame", "()Ligo/dern;", "callerFrame", "", "sensatory", "()Z", "isScopedCoroutine", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class rotuma<T> extends kotlinx.coroutines.attabal<T> implements igo.dern {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final wretchedly.dern<T> uCont;

    /* JADX WARN: Multi-variable type inference failed */
    public rotuma(CoroutineContext coroutineContext, wretchedly.dern<? super T> dernVar) {
        super(coroutineContext, true, true);
        this.uCont = dernVar;
    }

    @Override // igo.dern
    public final igo.dern getCallerFrame() {
        wretchedly.dern<T> dernVar = this.uCont;
        if (dernVar instanceof igo.dern) {
            return (igo.dern) dernVar;
        }
        return null;
    }

    @Override // kotlinx.coroutines.attabal
    public void molet(Object state) {
        wretchedly.dern<T> dernVar = this.uCont;
        dernVar.resumeWith(kotlinx.coroutines.trm.attabal(state, dernVar));
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean sensatory() {
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void trm(Object state) {
        impromptu.saneness(IntrinsicsKt__IntrinsicsJvmKt.dern(this.uCont), kotlinx.coroutines.trm.attabal(state, this.uCont));
    }

    public void tectonization() {
    }
}
