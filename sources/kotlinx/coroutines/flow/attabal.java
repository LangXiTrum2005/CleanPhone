package kotlinx.coroutines.flow;

import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0094@¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001e\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u000b\u0010*\u001a\u00020)8\u0002X\u0082\u0004¨\u0006+"}, d2 = {"Lkotlinx/coroutines/flow/attabal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/channels/monoploid;", AppsFlyerProperties.CHANNEL, "", "consume", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/channels/monoploid;ZLkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "taiyuan", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/flow/dern;", "cutely", "()Lkotlinx/coroutines/flow/dern;", "Lkotlinx/coroutines/channels/kowloon;", "scope", "", "competently", "(Lkotlinx/coroutines/channels/kowloon;Lwretchedly/dern;)Ljava/lang/Object;", "Lkotlinx/coroutines/saran;", "impassible", "(Lkotlinx/coroutines/saran;)Lkotlinx/coroutines/channels/monoploid;", "Lkotlinx/coroutines/flow/wireman;", "collector", "collect", "(Lkotlinx/coroutines/flow/wireman;Lwretchedly/dern;)Ljava/lang/Object;", "", "marial", "()Ljava/lang/String;", "kowloon", "()V", "polloi", "Lkotlinx/coroutines/channels/monoploid;", "molybdenite", "Z", "Lkotlinx/atomicfu/AtomicBoolean;", "consumed", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class attabal<T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32268graveside = AtomicIntegerFieldUpdater.newUpdater(attabal.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final boolean consume;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final kotlinx.coroutines.channels.monoploid<T> channel;

    public /* synthetic */ attabal(kotlinx.coroutines.channels.monoploid monoploidVar, boolean z, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(monoploidVar, z, (i2 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.dern
    public Object collect(wireman<? super T> wiremanVar, wretchedly.dern<? super Unit> dernVar) {
        if (this.capacity != -3) {
            Object objCollect = super.collect(wiremanVar, dernVar);
            return objCollect == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCollect : Unit.f29295attabal;
        }
        kowloon();
        Object objDern = FlowKt__ChannelsKt.dern(wiremanVar, this.channel, this.consume, dernVar);
        return objDern == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objDern : Unit.f29295attabal;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object competently(kotlinx.coroutines.channels.kowloon<? super T> kowloonVar, wretchedly.dern<? super Unit> dernVar) {
        Object objDern = FlowKt__ChannelsKt.dern(new kotlinx.coroutines.flow.internal.monoploid(kowloonVar), this.channel, this.consume, dernVar);
        return objDern == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objDern : Unit.f29295attabal;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public dern<T> cutely() {
        return new attabal(this.channel, this.consume, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public kotlinx.coroutines.channels.monoploid<T> impassible(saran scope) {
        kowloon();
        return this.capacity == -3 ? this.channel : super.impassible(scope);
    }

    public final void kowloon() {
        if (this.consume && f32268graveside.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String marial() {
        return "channel=" + this.channel;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> taiyuan(CoroutineContext context, int capacity, BufferOverflow onBufferOverflow) {
        return new attabal(this.channel, this.consume, context, capacity, onBufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public attabal(kotlinx.coroutines.channels.monoploid<? extends T> monoploidVar, boolean z, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.channel = monoploidVar;
        this.consume = z;
    }
}
