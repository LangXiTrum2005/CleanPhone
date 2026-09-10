package pigboat;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import pigboat.saneness;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\fR\u0013\u0010\u0012\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001e\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0013\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004R\u0013\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001f8\u0002X\u0082\u0004¨\u0006\""}, d2 = {"Lpigboat/saneness;", "N", "", "prev", "<init>", "(Lpigboat/saneness;)V", "value", "", "kowloon", "(Lpigboat/saneness;)Z", "", "dern", "()V", "impassible", "()Z", "triweekly", "beachfront", "()Lpigboat/saneness;", "next", "formularize", "isTail", "impromptu", "apical", "isRemoved", "competently", "()Ljava/lang/Object;", "nextOrClosed", "wireman", "aliveSegmentLeft", "marial", "aliveSegmentRight", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class saneness<N extends saneness<N>> {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f35377kowloon = AtomicReferenceFieldUpdater.newUpdater(saneness.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f35376arytenoidectomy = AtomicReferenceFieldUpdater.newUpdater(saneness.class, Object.class, "_prev$volatile");

    public saneness(N n) {
        this._prev$volatile = n;
    }

    public abstract boolean apical();

    public final N beachfront() {
        Object objCompetently = competently();
        if (objCompetently == attabal.f35328attabal) {
            return null;
        }
        return (N) objCompetently;
    }

    public final Object competently() {
        return f35377kowloon.get(this);
    }

    public final void dern() {
        f35376arytenoidectomy.set(this, null);
    }

    public final boolean formularize() {
        return beachfront() == null;
    }

    public final boolean impassible() {
        return androidx.concurrent.futures.attabal.attabal(f35377kowloon, this, null, attabal.f35328attabal);
    }

    public final N impromptu() {
        return (N) f35376arytenoidectomy.get(this);
    }

    public final boolean kowloon(N value) {
        return androidx.concurrent.futures.attabal.attabal(f35377kowloon, this, null, value);
    }

    public final N marial() {
        saneness sanenessVarBeachfront;
        N n = (N) beachfront();
        Intrinsics.beachfront(n);
        while (n.apical() && (sanenessVarBeachfront = n.beachfront()) != null) {
            n = (N) sanenessVarBeachfront;
        }
        return n;
    }

    public final void triweekly() {
        Object obj;
        if (formularize()) {
            return;
        }
        while (true) {
            saneness sanenessVarWireman = wireman();
            saneness sanenessVarMarial = marial();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35376arytenoidectomy;
            do {
                obj = atomicReferenceFieldUpdater.get(sanenessVarMarial);
            } while (!androidx.concurrent.futures.attabal.attabal(atomicReferenceFieldUpdater, sanenessVarMarial, obj, ((saneness) obj) == null ? null : sanenessVarWireman));
            if (sanenessVarWireman != null) {
                f35377kowloon.set(sanenessVarWireman, sanenessVarMarial);
            }
            if (!sanenessVarMarial.apical() || sanenessVarMarial.formularize()) {
                if (sanenessVarWireman == null || !sanenessVarWireman.apical()) {
                    return;
                }
            }
        }
    }

    public final N wireman() {
        N n = (N) impromptu();
        while (n != null && n.apical()) {
            n = (N) f35376arytenoidectomy.get(n);
        }
        return n;
    }
}
