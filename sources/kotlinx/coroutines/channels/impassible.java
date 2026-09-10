package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.UndeliveredElementException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import pigboat.adultoid;

/* JADX INFO: compiled from: ConflatedBufferedChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/channels/impassible;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "element", "wireman", "(Ljava/lang/Object;Lwretchedly/dern;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/impromptu;", "triweekly", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "isSendOp", "ethene", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "undecorated", "cuirassed", "I", "stratoscope", "Lkotlinx/coroutines/channels/BufferOverflow;", "achondroplasia", "()Z", "isConflatedDropOldest", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class impassible<E> extends BufferedChannel<E> {

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public final BufferOverflow onBufferOverflow;

    public impassible(int i, BufferOverflow bufferOverflow, Function1<? super E, Unit> function1) {
        super(i, function1);
        this.capacity = i;
        this.onBufferOverflow = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + p002kotlin.jvm.internal.polloi.saneness(BufferedChannel.class).taiyuan() + " instead").toString());
        }
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
    }

    public static /* synthetic */ <E> Object tout(impassible<E> impassibleVar, E e, wretchedly.dern<? super Unit> dernVar) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionDern;
        Object objEthene = impassibleVar.ethene(e, true);
        if (!(objEthene instanceof impromptu.Closed)) {
            return Unit.f29295attabal;
        }
        impromptu.marial(objEthene);
        Function1<E, Unit> function1 = impassibleVar.onUndeliveredElement;
        if (function1 == null || (undeliveredElementExceptionDern = adultoid.dern(function1, e, null, 2, null)) == null) {
            throw impassibleVar.empress();
        }
        patroclinal.marial.attabal(undeliveredElementExceptionDern, impassibleVar.empress());
        throw undeliveredElementExceptionDern;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean achondroplasia() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    public final Object ethene(E element, boolean isSendOp) {
        return this.onBufferOverflow == BufferOverflow.DROP_LATEST ? undecorated(element, isSendOp) : tailoring(element);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.polloi
    public Object triweekly(E element) {
        return ethene(element, false);
    }

    public final Object undecorated(E element, boolean isSendOp) {
        Function1<E, Unit> function1;
        UndeliveredElementException undeliveredElementExceptionDern;
        Object objTriweekly = super.triweekly(element);
        if (impromptu.taiyuan(objTriweekly) || impromptu.impromptu(objTriweekly)) {
            return objTriweekly;
        }
        if (!isSendOp || (function1 = this.onUndeliveredElement) == null || (undeliveredElementExceptionDern = adultoid.dern(function1, element, null, 2, null)) == null) {
            return impromptu.INSTANCE.dern(Unit.f29295attabal);
        }
        throw undeliveredElementExceptionDern;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.polloi
    public Object wireman(E e, wretchedly.dern<? super Unit> dernVar) {
        return tout(this, e, dernVar);
    }
}
