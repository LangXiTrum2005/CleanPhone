package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0014\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R6\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/flow/saneness;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/kowloon;", "Lwretchedly/dern;", "", "", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "taiyuan", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "scope", "competently", "(Lkotlinx/coroutines/channels/kowloon;Lwretchedly/dern;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "polloi", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class saneness<T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final Function2<kotlinx.coroutines.channels.kowloon<? super T>, wretchedly.dern<? super Unit>, Object> block;

    public /* synthetic */ saneness(Function2 function2, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    public static /* synthetic */ <T> Object triweekly(saneness<T> sanenessVar, kotlinx.coroutines.channels.kowloon<? super T> kowloonVar, wretchedly.dern<? super Unit> dernVar) {
        Object objInvoke = sanenessVar.block.invoke(kowloonVar, dernVar);
        return objInvoke == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objInvoke : Unit.f29295attabal;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object competently(kotlinx.coroutines.channels.kowloon<? super T> kowloonVar, wretchedly.dern<? super Unit> dernVar) {
        return triweekly(this, kowloonVar, dernVar);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> taiyuan(CoroutineContext context, int capacity, BufferOverflow onBufferOverflow) {
        return new saneness(this.block, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return "block[" + this.block + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public saneness(Function2<? super kotlinx.coroutines.channels.kowloon<? super T>, ? super wretchedly.dern<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.block = function2;
    }
}
