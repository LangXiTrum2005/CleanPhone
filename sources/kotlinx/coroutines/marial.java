package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000f\u000bB\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086@¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u000b\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/marial;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "Lkotlinx/coroutines/walach;", "deferreds", "<init>", "([Lkotlinx/coroutines/walach;)V", "", "dern", "(Lwretchedly/dern;)Ljava/lang/Object;", "attabal", "[Lkotlinx/coroutines/walach;", "Lkotlinx/atomicfu/AtomicInt;", "notCompletedCount", "saneness", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class marial<T> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32353saneness = AtomicIntegerFieldUpdater.newUpdater(marial.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final walach<T>[] deferreds;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: compiled from: Await.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R<\u0010\u001d\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u0010\u0018\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001d\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00170\"8\u0002X\u0082\u0004¨\u0006$"}, d2 = {"Lkotlinx/coroutines/marial$attabal;", "Lkotlinx/coroutines/unconsolidated;", "Lkotlinx/coroutines/impassible;", "", "continuation", "<init>", "(Lkotlinx/coroutines/marial;Lkotlinx/coroutines/impassible;)V", "", "cause", "", "gintrap", "(Ljava/lang/Throwable;)V", "molybdenite", "Lkotlinx/coroutines/impassible;", "Lkotlinx/coroutines/milliradian;", "graveside", "Lkotlinx/coroutines/milliradian;", "cord", "()Lkotlinx/coroutines/milliradian;", "trm", "(Lkotlinx/coroutines/milliradian;)V", "handle", "Lkotlinx/coroutines/marial$saneness;", "Lkotlinx/coroutines/marial;", "value", "preprohormone", "()Lkotlinx/coroutines/marial$saneness;", "stratoscope", "(Lkotlinx/coroutines/marial$saneness;)V", "disposer", "", "dovishness", "()Z", "onCancelling", "Lkotlinx/atomicfu/AtomicRef;", "_disposer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class attabal extends unconsolidated {

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f32355dovishness = AtomicReferenceFieldUpdater.newUpdater(attabal.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
        public milliradian handle;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
        public final impassible<List<? extends T>> continuation;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(impassible<? super List<? extends T>> impassibleVar) {
            this.continuation = impassibleVar;
        }

        public final milliradian cord() {
            milliradian milliradianVar = this.handle;
            if (milliradianVar != null) {
                return milliradianVar;
            }
            Intrinsics.preprohormone("handle");
            return null;
        }

        @Override // kotlinx.coroutines.unconsolidated
        public boolean dovishness() {
            return false;
        }

        @Override // kotlinx.coroutines.unconsolidated
        public void gintrap(Throwable cause) {
            if (cause != null) {
                Object objCompetently = this.continuation.competently(cause);
                if (objCompetently != null) {
                    this.continuation.gintrap(objCompetently);
                    marial<T>.saneness sanenessVarPreprohormone = preprohormone();
                    if (sanenessVarPreprohormone != null) {
                        sanenessVarPreprohormone.attabal();
                        return;
                    }
                    return;
                }
                return;
            }
            if (marial.wireman().decrementAndGet(marial.this) == 0) {
                impassible<List<? extends T>> impassibleVar = this.continuation;
                walach[] walachVarArr = marial.this.deferreds;
                ArrayList arrayList = new ArrayList(walachVarArr.length);
                for (walach walachVar : walachVarArr) {
                    arrayList.add(walachVar.cutely());
                }
                impassibleVar.resumeWith(Result.m3351constructorimpl(arrayList));
            }
        }

        public final marial<T>.saneness preprohormone() {
            return (saneness) f32355dovishness.get(this);
        }

        public final void stratoscope(marial<T>.saneness sanenessVar) {
            f32355dovishness.set(this, sanenessVar);
        }

        public final void trm(milliradian milliradianVar) {
            this.handle = milliradianVar;
        }
    }

    /* JADX INFO: compiled from: Await.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/marial$saneness;", "Lkotlinx/coroutines/formularize;", "", "Lkotlinx/coroutines/marial$attabal;", "Lkotlinx/coroutines/marial;", "nodes", "<init>", "(Lkotlinx/coroutines/marial;[Lkotlinx/coroutines/marial$attabal;)V", "", "attabal", "()V", "", "cause", "saneness", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "kowloon", "[Lkotlinx/coroutines/marial$attabal;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class saneness implements formularize {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final marial<T>.attabal[] nodes;

        public saneness(marial<T>.attabal[] attabalVarArr) {
            this.nodes = attabalVarArr;
        }

        public final void attabal() {
            for (marial<T>.attabal attabalVar : this.nodes) {
                attabalVar.cord().attabal();
            }
        }

        @Override // kotlinx.coroutines.formularize
        public void saneness(Throwable cause) {
            attabal();
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.nodes + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public marial(walach<? extends T>[] walachVarArr) {
        this.deferreds = walachVarArr;
        this.notCompletedCount$volatile = walachVarArr.length;
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater wireman() {
        return f32353saneness;
    }

    public final Object dern(wretchedly.dern<? super List<? extends T>> dernVar) {
        kowloon kowloonVar = new kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(dernVar), 1);
        kowloonVar.kattegat();
        int length = this.deferreds.length;
        attabal[] attabalVarArr = new attabal[length];
        for (int i = 0; i < length; i++) {
            walach walachVar = this.deferreds[i];
            walachVar.start();
            attabal attabalVar = new attabal(kowloonVar);
            attabalVar.trm(JobKt__JobKt.formularize(walachVar, false, attabalVar, 1, null));
            Unit unit = Unit.f29295attabal;
            attabalVarArr[i] = attabalVar;
        }
        marial<T>.saneness sanenessVar = new saneness(attabalVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            attabalVarArr[i2].stratoscope(sanenessVar);
        }
        if (kowloonVar.saneness()) {
            sanenessVar.attabal();
        } else {
            monoploid.dern(kowloonVar, sanenessVar);
        }
        Object objCuirassed = kowloonVar.cuirassed();
        if (objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            igo.beachfront.dern(dernVar);
        }
        return objCuirassed;
    }
}
