package pigboat;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.basify;
import kotlinx.coroutines.lerp;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.osteal;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/merc;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "runnable", "", "dern", "(Lkotlinx/coroutines/merc;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "wireman", "(Lkotlinx/coroutines/merc;Lkotlin/coroutines/CoroutineContext;)Z", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lwretchedly/dern;", "Lkotlin/Result;", "result", "saneness", "(Lwretchedly/dern;Ljava/lang/Object;)V", "Lpigboat/competently;", "marial", "(Lpigboat/competently;)Z", "Lpigboat/stratoscope;", "attabal", "Lpigboat/stratoscope;", "UNDEFINED", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final stratoscope f35352attabal = new stratoscope("UNDEFINED");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final stratoscope f35353saneness = new stratoscope("REUSABLE_CLAIMED");

    public static final void dern(kotlinx.coroutines.merc mercVar, CoroutineContext coroutineContext, Runnable runnable) {
        try {
            mercVar.itchy(coroutineContext, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, mercVar, coroutineContext);
        }
    }

    public static final boolean marial(competently<? super Unit> competentlyVar) {
        Unit unit = Unit.f29295attabal;
        lerp lerpVarSaneness = basify.f32112attabal.saneness();
        if (lerpVarSaneness.lightstruck()) {
            return false;
        }
        if (lerpVarSaneness.palmyra()) {
            competentlyVar._state = unit;
            competentlyVar.resumeMode = 1;
            lerpVarSaneness.wostteth(competentlyVar);
            return true;
        }
        lerpVarSaneness.gusty(true);
        try {
            competentlyVar.run();
            do {
            } while (lerpVarSaneness.julian());
        } catch (Throwable th) {
            try {
                competentlyVar.apical(th);
            } finally {
                lerpVarSaneness.czestochowa(true);
            }
        }
        return false;
    }

    public static final <T> void saneness(wretchedly.dern<? super T> dernVar, Object obj) {
        if (!(dernVar instanceof competently)) {
            dernVar.resumeWith(obj);
            return;
        }
        competently competentlyVar = (competently) dernVar;
        Object objSaneness = kotlinx.coroutines.trm.saneness(obj);
        if (wireman(competentlyVar.dispatcher, competentlyVar.getContext())) {
            competentlyVar._state = objSaneness;
            competentlyVar.resumeMode = 1;
            dern(competentlyVar.dispatcher, competentlyVar.getContext(), competentlyVar);
            return;
        }
        lerp lerpVarSaneness = basify.f32112attabal.saneness();
        if (lerpVarSaneness.palmyra()) {
            competentlyVar._state = objSaneness;
            competentlyVar.resumeMode = 1;
            lerpVarSaneness.wostteth(competentlyVar);
            return;
        }
        lerpVarSaneness.gusty(true);
        try {
            monroe monroeVar = (monroe) competentlyVar.getContext().get(monroe.INSTANCE);
            if (monroeVar == null || monroeVar.isActive()) {
                wretchedly.dern<T> dernVar2 = competentlyVar.continuation;
                Object obj2 = competentlyVar.countOrElement;
                CoroutineContext context = dernVar2.getContext();
                Object objTaiyuan = restrictive.taiyuan(context, obj2);
                osteal<?> ostealVarImpassible = objTaiyuan != restrictive.f35371attabal ? kotlinx.coroutines.supplicat.impassible(dernVar2, context, objTaiyuan) : null;
                try {
                    competentlyVar.continuation.resumeWith(obj);
                    Unit unit = Unit.f29295attabal;
                    if (ostealVarImpassible == null || ostealVarImpassible.prefect()) {
                        restrictive.beachfront(context, objTaiyuan);
                    }
                } catch (Throwable th) {
                    if (ostealVarImpassible == null || ostealVarImpassible.prefect()) {
                        restrictive.beachfront(context, objTaiyuan);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionRotuma = monroeVar.rotuma();
                competentlyVar.attabal(objSaneness, cancellationExceptionRotuma);
                Result.Companion companion = Result.INSTANCE;
                competentlyVar.resumeWith(Result.m3351constructorimpl(p002kotlin.dern.attabal(cancellationExceptionRotuma)));
            }
            while (lerpVarSaneness.julian()) {
            }
        } catch (Throwable th2) {
            try {
                competentlyVar.apical(th2);
            } finally {
                lerpVarSaneness.czestochowa(true);
            }
        }
    }

    public static final boolean wireman(kotlinx.coroutines.merc mercVar, CoroutineContext coroutineContext) throws DispatchException {
        try {
            return mercVar.nosophobia(coroutineContext);
        } catch (Throwable th) {
            throw new DispatchException(th, mercVar, coroutineContext);
        }
    }
}
