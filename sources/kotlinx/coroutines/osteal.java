package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0012R(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/osteal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lpigboat/rotuma;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lwretchedly/dern;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lwretchedly/dern;)V", "", "oldValue", "", "licking", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "prefect", "()Z", "tectonization", "()V", "state", "molet", "(Ljava/lang/Object;)V", "osteal", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "molybdenite", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "threadLocalIsSet", "Z", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class osteal<T> extends pigboat.rotuma<T> {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final ThreadLocal<Pair<CoroutineContext, Object>> threadStateToRecover;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public osteal(CoroutineContext coroutineContext, wretchedly.dern<? super T> dernVar) {
        licking lickingVar = licking.f32351kowloon;
        super(coroutineContext.get(lickingVar) == null ? coroutineContext.plus(lickingVar) : coroutineContext, dernVar);
        this.threadStateToRecover = new ThreadLocal<>();
        if (dernVar.getContext().get(p002kotlin.coroutines.dern.INSTANCE) instanceof merc) {
            return;
        }
        Object objTaiyuan = pigboat.restrictive.taiyuan(coroutineContext, null);
        pigboat.restrictive.beachfront(coroutineContext, objTaiyuan);
        licking(coroutineContext, objTaiyuan);
    }

    public final void licking(CoroutineContext context, Object oldValue) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(patroclinal.formularize.attabal(context, oldValue));
    }

    @Override // pigboat.rotuma, kotlinx.coroutines.attabal
    public void molet(Object state) {
        osteal();
        Object objAttabal = trm.attabal(state, this.uCont);
        wretchedly.dern<T> dernVar = this.uCont;
        CoroutineContext context = dernVar.getContext();
        Object objTaiyuan = pigboat.restrictive.taiyuan(context, null);
        osteal<?> ostealVarImpassible = objTaiyuan != pigboat.restrictive.f35371attabal ? supplicat.impassible(dernVar, context, objTaiyuan) : null;
        try {
            this.uCont.resumeWith(objAttabal);
            Unit unit = Unit.f29295attabal;
        } finally {
            if (ostealVarImpassible == null || ostealVarImpassible.prefect()) {
                pigboat.restrictive.beachfront(context, objTaiyuan);
            }
        }
    }

    public final void osteal() {
        if (this.threadLocalIsSet) {
            Pair<CoroutineContext, Object> pair = this.threadStateToRecover.get();
            if (pair != null) {
                pigboat.restrictive.beachfront(pair.component1(), pair.component2());
            }
            this.threadStateToRecover.remove();
        }
    }

    public final boolean prefect() {
        boolean z = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z;
    }

    @Override // pigboat.rotuma
    public void tectonization() {
        osteal();
    }
}
