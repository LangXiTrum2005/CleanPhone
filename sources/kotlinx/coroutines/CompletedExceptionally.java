package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001R\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CompletedExceptionally;", "", "Lkotlinx/atomicfu/AtomicBoolean;", "_handled", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class CompletedExceptionally {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f44746b = AtomicIntegerFieldUpdater.newUpdater(CompletedExceptionally.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f44747a;

    public CompletedExceptionally(boolean z2, Throwable th) {
        this.f44747a = th;
        this._handled$volatile = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + AbstractJsonLexerKt.BEGIN_LIST + this.f44747a + AbstractJsonLexerKt.END_LIST;
    }
}
