package kotlinx.coroutines.channels;

import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.microchemistry;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import pigboat.adultoid;
import pigboat.preprohormone;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0012J!\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u0010J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u0004\u0018\u00010\u00162\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b \u0010!J)\u0010&\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u001c¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b+\u0010\u0010R\u001c\u0010-\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010,R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0016038\u0002X\u0082\u0004¨\u00065"}, d2 = {"Lkotlinx/coroutines/channels/cutely;", "E", "Lpigboat/preprohormone;", "", "id", "prev", "Lkotlinx/coroutines/channels/BufferedChannel;", AppsFlyerProperties.CHANNEL, "", "pointers", "<init>", "(JLkotlinx/coroutines/channels/cutely;Lkotlinx/coroutines/channels/BufferedChannel;I)V", "index", "element", "", "kattegat", "(ILjava/lang/Object;)V", "cuirassed", "(I)Ljava/lang/Object;", "oilcan", "gintrap", "(I)V", "", "stratoscope", "value", "sealless", "from", "to", "", "dovishness", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "update", "rotuma", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "molybdenite", "(ILjava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "receiver", "trm", "(IZ)V", "yemenite", "Lkotlinx/coroutines/channels/BufferedChannel;", "_channel", "preprohormone", "()Lkotlinx/coroutines/channels/BufferedChannel;", "polloi", "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "data", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class cutely<E> extends preprohormone<cutely<E>> {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f32155graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final BufferedChannel<E> _channel;

    public cutely(long j, cutely<E> cutelyVar, BufferedChannel<E> bufferedChannel, int i) {
        super(j, cutelyVar, i);
        this._channel = bufferedChannel;
        this.f32155graveside = new AtomicReferenceArray(BufferedChannelKt.f32148saneness * 2);
    }

    /* JADX INFO: renamed from: cord, reason: from getter */
    public final /* synthetic */ AtomicReferenceArray getF32155graveside() {
        return this.f32155graveside;
    }

    public final E cuirassed(int index) {
        return (E) getF32155graveside().get(index * 2);
    }

    public final boolean dovishness(int index, Object from, Object to) {
        return taiyuan.attabal(getF32155graveside(), (index * 2) + 1, from, to);
    }

    public final void gintrap(int index) {
        yemenite(index, null);
    }

    public final void kattegat(int index, E element) {
        yemenite(index, element);
    }

    @Override // pigboat.preprohormone
    public void molybdenite(int index, Throwable cause, CoroutineContext context) throws IllegalAccessException, InvocationTargetException {
        Function1<E, Unit> function1;
        Function1<E, Unit> function2;
        int i = BufferedChannelKt.f32148saneness;
        boolean z = index >= i;
        if (z) {
            index -= i;
        }
        E eCuirassed = cuirassed(index);
        while (true) {
            Object objStratoscope = stratoscope(index);
            if ((objStratoscope instanceof microchemistry) || (objStratoscope instanceof WaiterEB)) {
                if (dovishness(index, objStratoscope, z ? BufferedChannelKt.f32138cutely : BufferedChannelKt.f32133apical)) {
                    gintrap(index);
                    trm(index, !z);
                    if (!z || (function1 = preprohormone().onUndeliveredElement) == null) {
                        return;
                    }
                    adultoid.attabal(function1, eCuirassed, context);
                    return;
                }
            } else {
                if (objStratoscope == BufferedChannelKt.f32138cutely || objStratoscope == BufferedChannelKt.f32133apical) {
                    break;
                }
                if (objStratoscope != BufferedChannelKt.f32137competently && objStratoscope != BufferedChannelKt.f32136beachfront) {
                    if (objStratoscope == BufferedChannelKt.f32149taiyuan || objStratoscope == BufferedChannelKt.f32151wireman || objStratoscope == BufferedChannelKt.cord()) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objStratoscope).toString());
                }
            }
        }
        gintrap(index);
        if (!z || (function2 = preprohormone().onUndeliveredElement) == null) {
            return;
        }
        adultoid.attabal(function2, eCuirassed, context);
    }

    public final E oilcan(int index) {
        E eCuirassed = cuirassed(index);
        gintrap(index);
        return eCuirassed;
    }

    @Override // pigboat.preprohormone
    public int polloi() {
        return BufferedChannelKt.f32148saneness;
    }

    public final BufferedChannel<E> preprohormone() {
        BufferedChannel<E> bufferedChannel = this._channel;
        Intrinsics.beachfront(bufferedChannel);
        return bufferedChannel;
    }

    public final Object rotuma(int index, Object update) {
        return getF32155graveside().getAndSet((index * 2) + 1, update);
    }

    public final void sealless(int index, Object value) {
        getF32155graveside().set((index * 2) + 1, value);
    }

    public final Object stratoscope(int index) {
        return getF32155graveside().get((index * 2) + 1);
    }

    public final void trm(int index, boolean receiver) {
        if (receiver) {
            preprohormone().rajahship((this.id * ((long) BufferedChannelKt.f32148saneness)) + ((long) index));
        }
        graveside();
    }

    public final void yemenite(int index, Object value) {
        getF32155graveside().set(index * 2, value);
    }
}
