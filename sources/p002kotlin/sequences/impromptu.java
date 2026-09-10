package p002kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import igo.beachfront;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import unready.attabal;
import wretchedly.dern;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0011\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00060\u001bj\u0002`\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R*\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b\u001f\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lkotlin/sequences/impromptu;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/sequences/taiyuan;", "", "Lwretchedly/dern;", "", "<init>", "()V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "value", "wireman", "(Ljava/lang/Object;Lwretchedly/dern;)Ljava/lang/Object;", "iterator", "impromptu", "(Ljava/util/Iterator;Lwretchedly/dern;)Ljava/lang/Object;", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "kowloon", "", "triweekly", "()Ljava/lang/Throwable;", "", "Lkotlin/sequences/State;", "I", "state", "arytenoidectomy", "Ljava/lang/Object;", "nextValue", "monoploid", "Ljava/util/Iterator;", "nextIterator", "polloi", "Lwretchedly/dern;", "getNextStep", "()Lwretchedly/dern;", "(Lwretchedly/dern;)V", "nextStep", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class impromptu<T> extends taiyuan<T> implements Iterator<T>, dern<Unit>, attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public T nextValue;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public int state;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public Iterator<? extends T> nextIterator;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public dern<? super Unit> nextStep;

    public final void arytenoidectomy(dern<? super Unit> dernVar) {
        this.nextStep = dernVar;
    }

    @Override // wretchedly.dern
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i = this.state;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw triweekly();
                }
                Iterator<? extends T> it = this.nextIterator;
                Intrinsics.beachfront(it);
                if (it.hasNext()) {
                    this.state = 2;
                    return true;
                }
                this.nextIterator = null;
            }
            this.state = 5;
            dern<? super Unit> dernVar = this.nextStep;
            Intrinsics.beachfront(dernVar);
            this.nextStep = null;
            dernVar.resumeWith(Result.m3351constructorimpl(Unit.f29295attabal));
        }
    }

    @Override // p002kotlin.sequences.taiyuan
    public Object impromptu(Iterator<? extends T> it, dern<? super Unit> dernVar) {
        if (!it.hasNext()) {
            return Unit.f29295attabal;
        }
        this.nextIterator = it;
        this.state = 2;
        this.nextStep = dernVar;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        if (objBeachfront == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            beachfront.dern(dernVar);
        }
        return objBeachfront == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objBeachfront : Unit.f29295attabal;
    }

    public final T kowloon() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i = this.state;
        if (i == 0 || i == 1) {
            return kowloon();
        }
        if (i == 2) {
            this.state = 1;
            Iterator<? extends T> it = this.nextIterator;
            Intrinsics.beachfront(it);
            return it.next();
        }
        if (i != 3) {
            throw triweekly();
        }
        this.state = 0;
        T t = this.nextValue;
        this.nextValue = null;
        return t;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // wretchedly.dern
    public void resumeWith(Object result) {
        p002kotlin.dern.saneness(result);
        this.state = 4;
    }

    public final Throwable triweekly() {
        int i = this.state;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.state);
    }

    @Override // p002kotlin.sequences.taiyuan
    public Object wireman(T t, dern<? super Unit> dernVar) {
        this.nextValue = t;
        this.state = 3;
        this.nextStep = dernVar;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        if (objBeachfront == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            beachfront.dern(dernVar);
        }
        return objBeachfront == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objBeachfront : Unit.f29295attabal;
    }
}
