package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AbstractCoroutine.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0004¢\u0006\u0004\b\u001b\u0010\u0010J\u001b\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u001e\u0010\u0010J\u0019\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001f\u0010\u0010J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0011H\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0010¢\u0006\u0004\b#\u0010\u0018JG\u0010*\u001a\u00020\u000e\"\u0004\b\u0001\u0010$2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00028\u00012\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00190(¢\u0006\u0004\b*\u0010+R\u001d\u00102\u001a\u00020\u00068\u0006¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00105\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lkotlinx/coroutines/attabal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/monroe;", "Lwretchedly/dern;", "Lkotlinx/coroutines/saran;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "", "initParentJob", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Lkotlin/coroutines/CoroutineContext;ZZ)V", "value", "", "immediately", "(Ljava/lang/Object;)V", "", "cause", "handled", "sakeen", "(Ljava/lang/Throwable;Z)V", "", "privatdozent", "()Ljava/lang/String;", "", "state", "achondroplasia", "Lkotlin/Result;", "result", "resumeWith", "molet", "exception", "empress", "(Ljava/lang/Throwable;)V", "picketboat", "R", "Lkotlinx/coroutines/CoroutineStart;", "start", "receiver", "Lkotlin/Function2;", "block", "basify", "(Lkotlinx/coroutines/CoroutineStart;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "monoploid", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getContext$annotations", "()V", "context", "getCoroutineContext", "coroutineContext", "isActive", "()Z", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class attabal<T> extends JobSupport implements monroe, wretchedly.dern<T>, saran {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final CoroutineContext context;

    public attabal(CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            coi((monroe) coroutineContext.get(monroe.INSTANCE));
        }
        this.context = coroutineContext.plus(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.JobSupport
    public final void achondroplasia(Object state) {
        if (!(state instanceof stratoscope)) {
            immediately(state);
        } else {
            stratoscope stratoscopeVar = (stratoscope) state;
            sakeen(stratoscopeVar.cause, stratoscopeVar.attabal());
        }
    }

    public final <R> void basify(CoroutineStart start, R receiver, Function2<? super R, ? super wretchedly.dern<? super T>, ? extends Object> block) {
        start.invoke(block, receiver, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void empress(Throwable exception) {
        seminary.attabal(this.context, exception);
    }

    @Override // wretchedly.dern
    public final CoroutineContext getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.saran
    public CoroutineContext getCoroutineContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.monroe
    public boolean isActive() {
        return super.isActive();
    }

    public void molet(Object state) {
        trm(state);
    }

    @Override // kotlinx.coroutines.JobSupport
    public String picketboat() {
        String strCompetently = supplicat.competently(this.context);
        if (strCompetently == null) {
            return super.picketboat();
        }
        return '\"' + strCompetently + "\":" + super.picketboat();
    }

    @Override // kotlinx.coroutines.JobSupport
    public String privatdozent() {
        return creditor.attabal(this) + " was cancelled";
    }

    @Override // wretchedly.dern
    public final void resumeWith(Object result) {
        Object objGusty = gusty(trm.saneness(result));
        if (objGusty == claque.f32178saneness) {
            return;
        }
        molet(objGusty);
    }

    public void immediately(T value) {
    }

    public void sakeen(Throwable cause, boolean handled) {
    }
}
