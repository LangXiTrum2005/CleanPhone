package girt;

import com.google.android.gms.ads.RequestConfiguration;
import igo.beachfront;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.claque;
import kotlinx.coroutines.stratoscope;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.rotuma;
import pigboat.restrictive;
import wretchedly.dern;

/* JADX INFO: compiled from: Undispatched.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001aS\u0010\f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0000¢\u0006\u0004\b\f\u0010\r\u001aS\u0010\u000e\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function2;", "Lwretchedly/dern;", "", "receiver", "completion", "", "attabal", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lwretchedly/dern;)V", "Lpigboat/rotuma;", "block", "saneness", "(Lpigboat/rotuma;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "dern", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class saneness {
    public static final <R, T> void attabal(Function2<? super R, ? super dern<? super T>, ? extends Object> function2, R r, dern<? super T> dernVar) {
        dern dernVarAttabal = beachfront.attabal(dernVar);
        try {
            CoroutineContext context = dernVarAttabal.getContext();
            Object objTaiyuan = restrictive.taiyuan(context, null);
            try {
                beachfront.saneness(dernVarAttabal);
                Object objWireman = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.wireman(function2, r, dernVarAttabal) : ((Function2) rotuma.beachfront(function2, 2)).invoke(r, dernVarAttabal);
                restrictive.beachfront(context, objTaiyuan);
                if (objWireman != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    dernVarAttabal.resumeWith(Result.m3351constructorimpl(objWireman));
                }
            } catch (Throwable th) {
                restrictive.beachfront(context, objTaiyuan);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            Result.Companion companion = Result.INSTANCE;
            dernVarAttabal.resumeWith(Result.m3351constructorimpl(p002kotlin.dern.attabal(th)));
        }
    }

    public static final <T, R> Object dern(pigboat.rotuma<? super T> rotumaVar, R r, Function2<? super R, ? super dern<? super T>, ? extends Object> function2) throws Throwable {
        Object stratoscopeVar;
        try {
            stratoscopeVar = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.wireman(function2, r, rotumaVar) : ((Function2) rotuma.beachfront(function2, 2)).invoke(r, rotumaVar);
        } catch (Throwable th) {
            stratoscopeVar = new stratoscope(th, false, 2, null);
        }
        if (stratoscopeVar == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            return p002kotlin.coroutines.intrinsics.attabal.beachfront();
        }
        Object objGusty = rotumaVar.gusty(stratoscopeVar);
        if (objGusty == claque.f32178saneness) {
            return p002kotlin.coroutines.intrinsics.attabal.beachfront();
        }
        rotumaVar.tectonization();
        if (objGusty instanceof stratoscope) {
            Throwable th2 = ((stratoscope) objGusty).cause;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).coroutine != rotumaVar) {
                throw th2;
            }
            if (stratoscopeVar instanceof stratoscope) {
                throw ((stratoscope) stratoscopeVar).cause;
            }
        } else {
            stratoscopeVar = claque.impromptu(objGusty);
        }
        return stratoscopeVar;
    }

    public static final <T, R> Object saneness(pigboat.rotuma<? super T> rotumaVar, R r, Function2<? super R, ? super dern<? super T>, ? extends Object> function2) {
        Object stratoscopeVar;
        try {
            stratoscopeVar = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.wireman(function2, r, rotumaVar) : ((Function2) rotuma.beachfront(function2, 2)).invoke(r, rotumaVar);
        } catch (Throwable th) {
            stratoscopeVar = new stratoscope(th, false, 2, null);
        }
        if (stratoscopeVar == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            return p002kotlin.coroutines.intrinsics.attabal.beachfront();
        }
        Object objGusty = rotumaVar.gusty(stratoscopeVar);
        if (objGusty == claque.f32178saneness) {
            return p002kotlin.coroutines.intrinsics.attabal.beachfront();
        }
        rotumaVar.tectonization();
        if (objGusty instanceof stratoscope) {
            throw ((stratoscope) objGusty).cause;
        }
        return claque.impromptu(objGusty);
    }
}
