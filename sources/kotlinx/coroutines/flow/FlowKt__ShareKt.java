package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a=\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u001d\u0010\u001e\u001aM\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2(\u0010$\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0012\u0006\u0012\u0004\u0018\u00010#0\u001f¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/dern;", "Lkotlinx/coroutines/saran;", "scope", "Lkotlinx/coroutines/flow/graveside;", X3.i.d0, "", "replay", "Lkotlinx/coroutines/flow/arytenoidectomy;", "beachfront", "(Lkotlinx/coroutines/flow/dern;Lkotlinx/coroutines/saran;Lkotlinx/coroutines/flow/graveside;I)Lkotlinx/coroutines/flow/arytenoidectomy;", "Lkotlinx/coroutines/flow/molybdenite;", "dern", "(Lkotlinx/coroutines/flow/dern;I)Lkotlinx/coroutines/flow/molybdenite;", "Lkotlin/coroutines/CoroutineContext;", "context", "upstream", "Lkotlinx/coroutines/flow/apical;", "shared", "initialValue", "Lkotlinx/coroutines/monroe;", "wireman", "(Lkotlinx/coroutines/saran;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/flow/dern;Lkotlinx/coroutines/flow/apical;Lkotlinx/coroutines/flow/graveside;Ljava/lang/Object;)Lkotlinx/coroutines/monroe;", "Lkotlinx/coroutines/flow/dovishness;", "impromptu", "(Lkotlinx/coroutines/flow/dern;Lkotlinx/coroutines/saran;Lkotlinx/coroutines/flow/graveside;Ljava/lang/Object;)Lkotlinx/coroutines/flow/dovishness;", "attabal", "(Lkotlinx/coroutines/flow/apical;)Lkotlinx/coroutines/flow/arytenoidectomy;", "Lkotlinx/coroutines/flow/formularize;", "saneness", "(Lkotlinx/coroutines/flow/formularize;)Lkotlinx/coroutines/flow/dovishness;", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/wireman;", "Lwretchedly/dern;", "", "", "action", "marial", "(Lkotlinx/coroutines/flow/arytenoidectomy;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/arytenoidectomy;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__ShareKt {
    public static final <T> arytenoidectomy<T> attabal(apical<T> apicalVar) {
        return new impassible(apicalVar, null);
    }

    public static final <T> arytenoidectomy<T> beachfront(dern<? extends T> dernVar, saran saranVar, graveside gravesideVar, int i) {
        molybdenite molybdeniteVarDern = dern(dernVar, i);
        apical apicalVarAttabal = monoploid.attabal(i, molybdeniteVarDern.extraBufferCapacity, molybdeniteVarDern.onBufferOverflow);
        return new impassible(apicalVarAttabal, wireman(saranVar, molybdeniteVarDern.context, molybdeniteVarDern.upstream, apicalVarAttabal, gravesideVar, monoploid.f32319attabal));
    }

    public static /* synthetic */ arytenoidectomy competently(dern dernVar, saran saranVar, graveside gravesideVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return marial.sealless(dernVar, saranVar, gravesideVar, i);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    public static final <T> molybdenite<T> dern(dern<? extends T> dernVar, int i) {
        ChannelFlow channelFlow;
        dern<T> dernVarCutely;
        int iWireman = p002kotlin.ranges.wireman.wireman(i, kotlinx.coroutines.channels.wireman.INSTANCE.attabal()) - i;
        if (!(dernVar instanceof ChannelFlow) || (dernVarCutely = (channelFlow = (ChannelFlow) dernVar).cutely()) == null) {
            return new molybdenite<>(dernVar, iWireman, BufferOverflow.SUSPEND, EmptyCoroutineContext.INSTANCE);
        }
        int i2 = channelFlow.capacity;
        if (i2 != -3 && i2 != -2 && i2 != 0) {
            iWireman = i2;
        } else if (channelFlow.onBufferOverflow == BufferOverflow.SUSPEND) {
            if (i2 == 0) {
                iWireman = 0;
            }
        } else if (i == 0) {
            iWireman = 1;
        } else {
            iWireman = 0;
        }
        return new molybdenite<>(dernVarCutely, iWireman, channelFlow.onBufferOverflow, channelFlow.context);
    }

    public static final <T> dovishness<T> impromptu(dern<? extends T> dernVar, saran saranVar, graveside gravesideVar, T t) {
        molybdenite molybdeniteVarDern = dern(dernVar, 1);
        formularize formularizeVarAttabal = gintrap.attabal(t);
        return new triweekly(formularizeVarAttabal, wireman(saranVar, molybdeniteVarDern.context, molybdeniteVarDern.upstream, formularizeVarAttabal, gravesideVar, t));
    }

    public static final <T> arytenoidectomy<T> marial(arytenoidectomy<? extends T> arytenoidectomyVar, Function2<? super wireman<? super T>, ? super wretchedly.dern<? super Unit>, ? extends Object> function2) {
        return new SubscribedSharedFlow(arytenoidectomyVar, function2);
    }

    public static final <T> dovishness<T> saneness(formularize<T> formularizeVar) {
        return new triweekly(formularizeVar, null);
    }

    public static final <T> monroe wireman(saran saranVar, CoroutineContext coroutineContext, dern<? extends T> dernVar, apical<T> apicalVar, graveside gravesideVar, T t) {
        return kotlinx.coroutines.impromptu.dern(saranVar, coroutineContext, Intrinsics.wireman(gravesideVar, graveside.INSTANCE.dern()) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(gravesideVar, dernVar, apicalVar, t, null));
    }
}
