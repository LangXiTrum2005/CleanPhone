package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH ¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lkotlinx/coroutines/dent;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lhydrosulfurous/competently;", "Lkotlinx/coroutines/SchedulerTask;", "", "resumeMode", "<init>", "(I)V", "", "formularize", "()Ljava/lang/Object;", "takenState", "", "cause", "", "attabal", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "cutely", "(Ljava/lang/Object;)Ljava/lang/Object;", "wireman", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "()V", "exception", "apical", "(Ljava/lang/Throwable;)V", "monoploid", "I", "Lwretchedly/dern;", "dern", "()Lwretchedly/dern;", "delegate", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class dent<T> extends hydrosulfurous.competently {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public int resumeMode;

    public dent(int i) {
        this.resumeMode = i;
    }

    public final void apical(Throwable exception) {
        seminary.attabal(dern().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", exception));
    }

    public abstract wretchedly.dern<T> dern();

    public abstract Object formularize();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            wretchedly.dern<T> dernVarDern = dern();
            Intrinsics.competently(dernVarDern, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            pigboat.competently competentlyVar = (pigboat.competently) dernVarDern;
            wretchedly.dern<T> dernVar = competentlyVar.continuation;
            Object obj = competentlyVar.countOrElement;
            CoroutineContext context = dernVar.getContext();
            Object objTaiyuan = pigboat.restrictive.taiyuan(context, obj);
            monroe monroeVar = null;
            osteal<?> ostealVarImpassible = objTaiyuan != pigboat.restrictive.f35371attabal ? supplicat.impassible(dernVar, context, objTaiyuan) : null;
            try {
                CoroutineContext context2 = dernVar.getContext();
                Object objFormularize = formularize();
                Throwable thWireman = wireman(objFormularize);
                if (thWireman == null && permissivist.saneness(this.resumeMode)) {
                    monroeVar = (monroe) context2.get(monroe.INSTANCE);
                }
                if (monroeVar != null && !monroeVar.isActive()) {
                    CancellationException cancellationExceptionRotuma = monroeVar.rotuma();
                    attabal(objFormularize, cancellationExceptionRotuma);
                    Result.Companion companion = Result.INSTANCE;
                    dernVar.resumeWith(Result.m3351constructorimpl(p002kotlin.dern.attabal(cancellationExceptionRotuma)));
                } else if (thWireman != null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    dernVar.resumeWith(Result.m3351constructorimpl(p002kotlin.dern.attabal(thWireman)));
                } else {
                    Result.Companion companion3 = Result.INSTANCE;
                    dernVar.resumeWith(Result.m3351constructorimpl(cutely(objFormularize)));
                }
                Unit unit = Unit.f29295attabal;
            } finally {
                if (ostealVarImpassible == null || ostealVarImpassible.prefect()) {
                    pigboat.restrictive.beachfront(context, objTaiyuan);
                }
            }
        } catch (DispatchException e) {
            seminary.attabal(dern().getContext(), e.getCause());
        } catch (Throwable th) {
            apical(th);
        }
    }

    public Throwable wireman(Object state) {
        stratoscope stratoscopeVar = state instanceof stratoscope ? (stratoscope) state : null;
        if (stratoscopeVar != null) {
            return stratoscopeVar.cause;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T cutely(Object state) {
        return state;
    }

    public void attabal(Object takenState, Throwable cause) {
    }
}
