package kotlinx.coroutines.flow.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlow;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChannelFlow<T> implements FusibleFlow<T> {
    public final CoroutineContext X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f44995Y;
    public final BufferOverflow Z;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlow$collect$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend")
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public /* synthetic */ Object f44996Y;
        public final /* synthetic */ FlowCollector Z;
        public final /* synthetic */ ChannelFlow e0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FlowCollector flowCollector, ChannelFlow channelFlow, Continuation continuation) {
            super(2, continuation);
            this.Z = flowCollector;
            this.e0 = channelFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.Z, this.e0, continuation);
            anonymousClass2.f44996Y = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.X;
            if (i2 == 0) {
                ResultKt.b(obj);
                ReceiveChannel receiveChannelH = this.e0.h((CoroutineScope) this.f44996Y);
                this.X = 1;
                if (FlowKt.k(this.Z, receiveChannelH, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f43263a;
        }
    }

    public ChannelFlow(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        this.X = coroutineContext;
        this.f44995Y = i2;
        this.Z = bufferOverflow;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow b(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        CoroutineContext coroutineContext2 = this.X;
        CoroutineContext coroutineContextPlus = coroutineContext.plus(coroutineContext2);
        BufferOverflow bufferOverflow2 = BufferOverflow.X;
        BufferOverflow bufferOverflow3 = this.Z;
        int i3 = this.f44995Y;
        if (bufferOverflow == bufferOverflow2) {
            if (i3 != -3) {
                if (i2 == -3) {
                    i2 = i3;
                } else if (i3 != -2) {
                    if (i2 == -2) {
                        i2 = i3;
                    } else {
                        i2 += i3;
                        if (i2 < 0) {
                            i2 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            bufferOverflow = bufferOverflow3;
        }
        return (Intrinsics.a(coroutineContextPlus, coroutineContext2) && i2 == i3 && bufferOverflow == bufferOverflow3) ? this : f(coroutineContextPlus, i2, bufferOverflow);
    }

    public String c() {
        return null;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objD = CoroutineScopeKt.d(new AnonymousClass2(flowCollector, this, null), continuation);
        return objD == CoroutineSingletons.X ? objD : Unit.f43263a;
    }

    public abstract Object e(ProducerScope producerScope, Continuation continuation);

    public abstract ChannelFlow f(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow);

    public Flow g() {
        return null;
    }

    public ReceiveChannel h(CoroutineScope coroutineScope) {
        int i2 = this.f44995Y;
        if (i2 == -3) {
            i2 = -2;
        }
        CoroutineStart coroutineStart = CoroutineStart.Z;
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        return ProduceKt.b(coroutineScope, this.X, i2, this.Z, coroutineStart, channelFlow$collectToFun$1);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.X;
        CoroutineContext coroutineContext = this.X;
        if (coroutineContext != emptyCoroutineContext) {
            arrayList.add("context=" + coroutineContext);
        }
        int i2 = this.f44995Y;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        BufferOverflow bufferOverflow = BufferOverflow.X;
        BufferOverflow bufferOverflow2 = this.Z;
        if (bufferOverflow2 != bufferOverflow) {
            arrayList.add("onBufferOverflow=" + bufferOverflow2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        return androidx.media3.extractor.text.ttml.a.p(sb, CollectionsKt.D(arrayList, ", ", null, null, null, 62), AbstractJsonLexerKt.END_LIST);
    }
}
