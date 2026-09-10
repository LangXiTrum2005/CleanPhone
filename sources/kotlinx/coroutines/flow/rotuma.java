package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReference;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.retroflection;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/flow/rotuma;", "Lkotlinx/coroutines/flow/internal/dern;", "Lkotlinx/coroutines/flow/StateFlowImpl;", "<init>", "()V", "flow", "", "wireman", "(Lkotlinx/coroutines/flow/StateFlowImpl;)Z", "", "Lwretchedly/dern;", "", "beachfront", "(Lkotlinx/coroutines/flow/StateFlowImpl;)[Lwretchedly/dern;", "competently", "impromptu", "()Z", "marial", "(Lwretchedly/dern;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", "attabal", "Ljava/util/concurrent/atomic/AtomicReference;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class rotuma extends kotlinx.coroutines.flow.internal.dern<StateFlowImpl<?>> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final AtomicReference<Object> _state = new AtomicReference<>(null);

    @Override // kotlinx.coroutines.flow.internal.dern
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public wretchedly.dern<Unit>[] saneness(StateFlowImpl<?> flow) {
        pigboat.dern.saneness(this._state, null);
        return kotlinx.coroutines.flow.internal.saneness.f32313attabal;
    }

    public final void competently() {
        AtomicReference<Object> atomicReference = this._state;
        while (true) {
            Object objAttabal = pigboat.dern.attabal(atomicReference);
            if (objAttabal == null || objAttabal == gintrap.f32275saneness) {
                return;
            }
            if (objAttabal == gintrap.f32274attabal) {
                if (retroflection.attabal(this._state, objAttabal, gintrap.f32275saneness)) {
                    return;
                }
            } else if (retroflection.attabal(this._state, objAttabal, gintrap.f32274attabal)) {
                Result.Companion companion = Result.INSTANCE;
                ((kotlinx.coroutines.kowloon) objAttabal).resumeWith(Result.m3351constructorimpl(Unit.f29295attabal));
                return;
            }
        }
    }

    public final boolean impromptu() {
        Object andSet = this._state.getAndSet(gintrap.f32274attabal);
        Intrinsics.beachfront(andSet);
        return andSet == gintrap.f32275saneness;
    }

    public final Object marial(wretchedly.dern<? super Unit> dernVar) {
        kotlinx.coroutines.kowloon kowloonVar = new kotlinx.coroutines.kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(dernVar), 1);
        kowloonVar.kattegat();
        if (!retroflection.attabal(this._state, gintrap.f32274attabal, kowloonVar)) {
            Result.Companion companion = Result.INSTANCE;
            kowloonVar.resumeWith(Result.m3351constructorimpl(Unit.f29295attabal));
        }
        Object objCuirassed = kowloonVar.cuirassed();
        if (objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            igo.beachfront.dern(dernVar);
        }
        return objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCuirassed : Unit.f29295attabal;
    }

    @Override // kotlinx.coroutines.flow.internal.dern
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean attabal(StateFlowImpl<?> flow) {
        if (pigboat.dern.attabal(this._state) != null) {
            return false;
        }
        pigboat.dern.saneness(this._state, gintrap.f32274attabal);
        return true;
    }
}
