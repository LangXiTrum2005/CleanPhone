package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/rotuma;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/gintrap;", "Lkotlinx/coroutines/monroe;", "parent", "<init>", "(Lkotlinx/coroutines/monroe;)V", "cutely", "()Ljava/lang/Object;", "dent", "(Lwretchedly/dern;)Ljava/lang/Object;", "value", "", "saran", "(Ljava/lang/Object;)Z", "", "exception", "seminary", "(Ljava/lang/Throwable;)Z", "premeiotic", "()Z", "onCancelComplete", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class rotuma<T> extends JobSupport implements gintrap<T> {
    public rotuma(monroe monroeVar) {
        super(true);
        coi(monroeVar);
    }

    @Override // kotlinx.coroutines.walach
    public T cutely() {
        return (T) overspeculate();
    }

    @Override // kotlinx.coroutines.walach
    public Object dent(wretchedly.dern<? super T> dernVar) throws Throwable {
        Object objOilcan = oilcan(dernVar);
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        return objOilcan;
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean premeiotic() {
        return true;
    }

    @Override // kotlinx.coroutines.gintrap
    public boolean saran(T value) {
        return igbo(value);
    }

    @Override // kotlinx.coroutines.gintrap
    public boolean seminary(Throwable exception) {
        return igbo(new stratoscope(exception, false, 2, null));
    }
}
