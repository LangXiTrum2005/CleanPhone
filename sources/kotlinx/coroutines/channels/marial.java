package kotlinx.coroutines.channels;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ChannelCoroutine.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0012H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001f\u001a\u00020\u00032\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00030\u001dH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096A¢\u0006\u0004\b#\u0010\"J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0096\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000/8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lkotlinx/coroutines/channels/marial;", "E", "Lkotlinx/coroutines/attabal;", "", "Lkotlinx/coroutines/channels/wireman;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "_channel", "", "initParentJob", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/wireman;ZZ)V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "attabal", "(Ljava/util/concurrent/CancellationException;)V", "", "merc", "(Ljava/lang/Throwable;)V", "element", "wireman", "(Ljava/lang/Object;Lwretchedly/dern;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/impromptu;", "triweekly", "(Ljava/lang/Object;)Ljava/lang/Object;", "graveside", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "handler", "apical", "(Lkotlin/jvm/functions/Function1;)V", "kowloon", "(Lwretchedly/dern;)Ljava/lang/Object;", "impromptu", "polloi", "()Ljava/lang/Object;", "Lkotlinx/coroutines/channels/beachfront;", "iterator", "()Lkotlinx/coroutines/channels/beachfront;", "Lkotlinx/coroutines/channels/wireman;", "tectonization", "()Lkotlinx/coroutines/channels/wireman;", "adultoid", "()Z", "isClosedForSend", "Lkotlinx/coroutines/selects/beachfront;", "monoploid", "()Lkotlinx/coroutines/selects/beachfront;", "onReceive", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class marial<E> extends kotlinx.coroutines.attabal<Unit> implements wireman<E> {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final wireman<E> _channel;

    public marial(CoroutineContext coroutineContext, wireman<E> wiremanVar, boolean z, boolean z2) {
        super(coroutineContext, z, z2);
        this._channel = wiremanVar;
    }

    @Override // kotlinx.coroutines.channels.polloi
    public boolean adultoid() {
        return this._channel.adultoid();
    }

    @Override // kotlinx.coroutines.channels.polloi
    public void apical(Function1<? super Throwable, Unit> handler) {
        this._channel.apical(handler);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.monroe
    public final void attabal(CancellationException cause) {
        if (isCancelled()) {
            return;
        }
        if (cause == null) {
            cause = new JobCancellationException(privatdozent(), null, this);
        }
        merc(cause);
    }

    @Override // kotlinx.coroutines.channels.polloi
    public boolean graveside(Throwable cause) {
        return this._channel.graveside(cause);
    }

    @Override // kotlinx.coroutines.channels.monoploid
    public Object impromptu(wretchedly.dern<? super impromptu<? extends E>> dernVar) {
        Object objImpromptu = this._channel.impromptu(dernVar);
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        return objImpromptu;
    }

    @Override // kotlinx.coroutines.channels.monoploid
    public beachfront<E> iterator() {
        return this._channel.iterator();
    }

    @Override // kotlinx.coroutines.channels.monoploid
    public Object kowloon(wretchedly.dern<? super E> dernVar) {
        return this._channel.kowloon(dernVar);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void merc(Throwable cause) {
        CancellationException cancellationException = JobSupport.setterwort(this, cause, null, 1, null);
        this._channel.attabal(cancellationException);
        sealless(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.monoploid
    public kotlinx.coroutines.selects.beachfront<E> monoploid() {
        return this._channel.monoploid();
    }

    @Override // kotlinx.coroutines.channels.monoploid
    public Object polloi() {
        return this._channel.polloi();
    }

    public final wireman<E> tectonization() {
        return this._channel;
    }

    @Override // kotlinx.coroutines.channels.polloi
    public Object triweekly(E element) {
        return this._channel.triweekly(element);
    }

    @Override // kotlinx.coroutines.channels.polloi
    public Object wireman(E e, wretchedly.dern<? super Unit> dernVar) {
        return this._channel.wireman(e, dernVar);
    }
}
