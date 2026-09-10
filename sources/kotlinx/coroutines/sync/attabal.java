package kotlinx.coroutines.sync;

import com.ironsource.D1;
import formularization.beachfront;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.creditor;
import kotlinx.coroutines.impassible;
import kotlinx.coroutines.kowloon;
import kotlinx.coroutines.merc;
import kotlinx.coroutines.microchemistry;
import kotlinx.coroutines.monoploid;
import kotlinx.coroutines.selects.taiyuan;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.jvm.functions.Function1;
import pigboat.preprohormone;
import tetrahedral.triweekly;
import wretchedly.dern;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0004\b\u0016\u0010\u000bJ\u0019\u0010\u0017\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0015RR\u0010\u001f\u001a@\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u00180\u0018j\u0002`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070#8\u0002X\u0082\u0004¨\u0006$"}, d2 = {"Lkotlinx/coroutines/sync/attabal;", "Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "Lformularization/attabal;", "", "locked", "<init>", "(Z)V", "", "owner", "", "attabal", "(Ljava/lang/Object;Lwretchedly/dern;)Ljava/lang/Object;", "saneness", "(Ljava/lang/Object;)Z", "wireman", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "preprohormone", "(Ljava/lang/Object;)I", "cuirassed", "oilcan", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/taiyuan;", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "impromptu", "Ltetrahedral/triweekly;", "onSelectCancellationUnlockConstructor", "dern", "()Z", "isLocked", "Lkotlinx/atomicfu/AtomicRef;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class attabal extends SemaphoreAndMutexImpl implements formularization.attabal {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32458taiyuan = AtomicReferenceFieldUpdater.newUpdater(attabal.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final triweekly<taiyuan<?>, Object, Object, triweekly<Throwable, Object, CoroutineContext, Unit>> onSelectCancellationUnlockConstructor;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJO\u0010\u0011\u001a\u0004\u0018\u00010\u0006\"\b\b\u0000\u0010\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00062 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0013\u001a\u00020\u0002\"\b\b\u0000\u0010\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u00002 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\"\u001a\u00020\u00022\u0018\u0010!\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00020\u001fj\u0002` H\u0096\u0001¢\u0006\u0004\b\"\u0010#J$\u0010(\u001a\u00020\u00022\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$2\u0006\u0010'\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b(\u0010)J\u001c\u0010+\u001a\u00020\u0002*\u00020*2\u0006\u0010\u000b\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b+\u0010,J\u001e\u0010/\u001a\u00020\u00022\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020-H\u0096\u0001¢\u0006\u0004\b/\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00107\u001a\u00020\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00105R\u0014\u0010:\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lkotlinx/coroutines/sync/attabal$attabal;", "Lkotlinx/coroutines/impassible;", "", "Lkotlinx/coroutines/microchemistry;", "Lkotlinx/coroutines/kowloon;", "cont", "", "owner", "<init>", "(Lkotlinx/coroutines/sync/attabal;Lkotlinx/coroutines/kowloon;Ljava/lang/Object;)V", "R", "value", "idempotent", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", "onCancellation", "formularize", "(Lkotlin/Unit;Ljava/lang/Object;Ltetrahedral/triweekly;)Ljava/lang/Object;", "wireman", "(Lkotlin/Unit;Ltetrahedral/triweekly;)V", "exception", "competently", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "gintrap", "(Ljava/lang/Object;)V", "cause", "", "taiyuan", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "beachfront", "(Lkotlin/jvm/functions/Function1;)V", "Lpigboat/preprohormone;", D1.i, "", "index", "impromptu", "(Lpigboat/preprohormone;I)V", "Lkotlinx/coroutines/merc;", "apical", "(Lkotlinx/coroutines/merc;Lkotlin/Unit;)V", "Lkotlin/Result;", "result", "resumeWith", "kowloon", "Lkotlinx/coroutines/kowloon;", "arytenoidectomy", "Ljava/lang/Object;", "isActive", "()Z", "saneness", "isCompleted", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class C0713attabal implements impassible<Unit>, microchemistry {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public final Object owner;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final kowloon<Unit> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public C0713attabal(kowloon<? super Unit> kowloonVar, Object obj) {
            this.cont = kowloonVar;
            this.owner = obj;
        }

        public static final Unit cutely(attabal attabalVar, C0713attabal c0713attabal, Throwable th) {
            attabalVar.wireman(c0713attabal.owner);
            return Unit.f29295attabal;
        }

        public static final Unit triweekly(attabal attabalVar, C0713attabal c0713attabal, Throwable th, Unit unit, CoroutineContext coroutineContext) {
            attabal.rotuma().set(attabalVar, c0713attabal.owner);
            attabalVar.wireman(c0713attabal.owner);
            return Unit.f29295attabal;
        }

        @Override // kotlinx.coroutines.impassible
        /* JADX INFO: renamed from: apical, reason: merged with bridge method [inline-methods] */
        public void molybdenite(merc mercVar, Unit unit) {
            this.cont.molybdenite(mercVar, unit);
        }

        @Override // kotlinx.coroutines.impassible
        public void beachfront(Function1<? super Throwable, Unit> handler) {
            this.cont.beachfront(handler);
        }

        @Override // kotlinx.coroutines.impassible
        public Object competently(Throwable exception) {
            return this.cont.competently(exception);
        }

        @Override // kotlinx.coroutines.impassible
        /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
        public <R extends Unit> Object marial(R value, Object idempotent, triweekly<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
            final attabal attabalVar = attabal.this;
            Object objMarial = this.cont.marial(value, idempotent, new triweekly() { // from class: formularization.wireman
                @Override // tetrahedral.triweekly
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return kotlinx.coroutines.sync.attabal.C0713attabal.triweekly(attabalVar, this, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
                }
            });
            if (objMarial != null) {
                attabal.rotuma().set(attabal.this, this.owner);
            }
            return objMarial;
        }

        @Override // wretchedly.dern
        public CoroutineContext getContext() {
            return this.cont.getContext();
        }

        @Override // kotlinx.coroutines.impassible
        public void gintrap(Object token) {
            this.cont.gintrap(token);
        }

        @Override // kotlinx.coroutines.microchemistry
        public void impromptu(preprohormone<?> segment, int index) {
            this.cont.impromptu(segment, index);
        }

        @Override // kotlinx.coroutines.impassible
        public boolean isActive() {
            return this.cont.isActive();
        }

        @Override // wretchedly.dern
        public void resumeWith(Object result) {
            this.cont.resumeWith(result);
        }

        @Override // kotlinx.coroutines.impassible
        public boolean saneness() {
            return this.cont.saneness();
        }

        @Override // kotlinx.coroutines.impassible
        public boolean taiyuan(Throwable cause) {
            return this.cont.taiyuan(cause);
        }

        @Override // kotlinx.coroutines.impassible
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public <R extends Unit> void impassible(R value, triweekly<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
            attabal.rotuma().set(attabal.this, this.owner);
            kowloon<Unit> kowloonVar = this.cont;
            final attabal attabalVar = attabal.this;
            kowloonVar.starveling(value, new Function1() { // from class: formularization.marial
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return kotlinx.coroutines.sync.attabal.C0713attabal.cutely(attabalVar, this, (Throwable) obj);
                }
            });
        }
    }

    public attabal(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : beachfront.f26506attabal;
        this.onSelectCancellationUnlockConstructor = new triweekly() { // from class: formularization.saneness
            @Override // tetrahedral.triweekly
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return kotlinx.coroutines.sync.attabal.stratoscope(this.f26519kowloon, (kotlinx.coroutines.selects.taiyuan) obj, obj2, obj3);
            }
        };
    }

    public static /* synthetic */ Object cord(attabal attabalVar, Object obj, dern<? super Unit> dernVar) {
        if (attabalVar.saneness(obj)) {
            return Unit.f29295attabal;
        }
        Object objCuirassed = attabalVar.cuirassed(obj, dernVar);
        return objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCuirassed : Unit.f29295attabal;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater rotuma() {
        return f32458taiyuan;
    }

    public static final triweekly stratoscope(final attabal attabalVar, taiyuan taiyuanVar, final Object obj, Object obj2) {
        return new triweekly() { // from class: formularization.dern
            @Override // tetrahedral.triweekly
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return kotlinx.coroutines.sync.attabal.trm(this.f26510kowloon, obj, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    public static final Unit trm(attabal attabalVar, Object obj, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        attabalVar.wireman(obj);
        return Unit.f29295attabal;
    }

    @Override // formularization.attabal
    public Object attabal(Object obj, dern<? super Unit> dernVar) {
        return cord(this, obj, dernVar);
    }

    public final Object cuirassed(Object obj, dern<? super Unit> dernVar) {
        kowloon kowloonVarSaneness = monoploid.saneness(IntrinsicsKt__IntrinsicsJvmKt.dern(dernVar));
        try {
            beachfront(new C0713attabal(kowloonVarSaneness, obj));
            Object objCuirassed = kowloonVarSaneness.cuirassed();
            if (objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                igo.beachfront.dern(dernVar);
            }
            return objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCuirassed : Unit.f29295attabal;
        } catch (Throwable th) {
            kowloonVarSaneness.privatdozent();
            throw th;
        }
    }

    @Override // formularization.attabal
    public boolean dern() {
        return cutely() == 0;
    }

    public final int oilcan(Object owner) {
        while (!polloi()) {
            if (owner == null) {
                return 1;
            }
            int iPreprohormone = preprohormone(owner);
            if (iPreprohormone == 1) {
                return 2;
            }
            if (iPreprohormone == 2) {
                return 1;
            }
        }
        f32458taiyuan.set(this, owner);
        return 0;
    }

    public final int preprohormone(Object owner) {
        while (dern()) {
            Object obj = f32458taiyuan.get(this);
            if (obj != beachfront.f26506attabal) {
                return obj == owner ? 1 : 2;
            }
        }
        return 0;
    }

    @Override // formularization.attabal
    public boolean saneness(Object owner) {
        int iOilcan = oilcan(owner);
        if (iOilcan == 0) {
            return true;
        }
        if (iOilcan == 1) {
            return false;
        }
        if (iOilcan != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + owner).toString());
    }

    public String toString() {
        return "Mutex@" + creditor.saneness(this) + "[isLocked=" + dern() + ",owner=" + f32458taiyuan.get(this) + ']';
    }

    @Override // formularization.attabal
    public void wireman(Object owner) {
        while (dern()) {
            Object obj = f32458taiyuan.get(this);
            if (obj != beachfront.f26506attabal) {
                if (obj != owner && owner != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj + ", but " + owner + " is expected").toString());
                }
                if (androidx.concurrent.futures.attabal.attabal(f32458taiyuan, this, obj, beachfront.f26506attabal)) {
                    monoploid();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }
}
