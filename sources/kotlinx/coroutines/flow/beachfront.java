package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aE\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0004\b\u000e\u0010\t\u001aE\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/wireman;", "Lwretchedly/dern;", "", "", "block", "Lkotlinx/coroutines/flow/dern;", "dern", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/dern;", "value", "wireman", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/dern;", "Lkotlinx/coroutines/channels/kowloon;", "saneness", "attabal", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class beachfront {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/beachfront$attabal", "Lkotlinx/coroutines/flow/dern;", "Lkotlinx/coroutines/flow/wireman;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/wireman;Lwretchedly/dern;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class attabal<T> implements dern<T> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Object f32271kowloon;

        public attabal(Object obj) {
            this.f32271kowloon = obj;
        }

        @Override // kotlinx.coroutines.flow.dern
        public Object collect(wireman<? super T> wiremanVar, wretchedly.dern<? super Unit> dernVar) {
            Object objEmit = wiremanVar.emit((Object) this.f32271kowloon, dernVar);
            return objEmit == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objEmit : Unit.f29295attabal;
        }
    }

    public static final <T> dern<T> attabal(Function2<? super kotlinx.coroutines.channels.kowloon<? super T>, ? super wretchedly.dern<? super Unit>, ? extends Object> function2) {
        return new CallbackFlowBuilder(function2, null, 0, null, 14, null);
    }

    public static final <T> dern<T> dern(Function2<? super wireman<? super T>, ? super wretchedly.dern<? super Unit>, ? extends Object> function2) {
        return new kowloon(function2);
    }

    public static final <T> dern<T> saneness(Function2<? super kotlinx.coroutines.channels.kowloon<? super T>, ? super wretchedly.dern<? super Unit>, ? extends Object> function2) {
        return new saneness(function2, null, 0, null, 14, null);
    }

    public static final <T> dern<T> wireman(T t) {
        return new attabal(t);
    }
}
