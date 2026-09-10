package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096@¢\u0006\u0004\b\f\u0010\rR6\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/flow/kowloon;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/AbstractFlow;", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/wireman;", "Lwretchedly/dern;", "", "", "block", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "collector", "marial", "(Lkotlinx/coroutines/flow/wireman;Lwretchedly/dern;)Ljava/lang/Object;", "kowloon", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class kowloon<T> extends AbstractFlow<T> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Function2<wireman<? super T>, wretchedly.dern<? super Unit>, Object> block;

    /* JADX WARN: Multi-variable type inference failed */
    public kowloon(Function2<? super wireman<? super T>, ? super wretchedly.dern<? super Unit>, ? extends Object> function2) {
        this.block = function2;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    public Object marial(wireman<? super T> wiremanVar, wretchedly.dern<? super Unit> dernVar) {
        Object objInvoke = this.block.invoke(wiremanVar, dernVar);
        return objInvoke == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objInvoke : Unit.f29295attabal;
    }
}
