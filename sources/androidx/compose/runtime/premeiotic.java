package androidx.compose.runtime;

import com.ironsource.X3;
import kotlinx.coroutines.JobKt__JobKt;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R0\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0006\u0012\u0002\b\u00030!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/runtime/premeiotic;", "Landroidx/compose/runtime/basify;", "Lkotlinx/coroutines/polder;", "Lkotlin/coroutines/CoroutineContext;", "parentCoroutineContext", "Lkotlin/Function2;", "Lkotlinx/coroutines/saran;", "Lwretchedly/dern;", "", "", "task", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "wireman", "()V", "beachfront", "marial", "context", "", "exception", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kowloon", "Lkotlin/coroutines/CoroutineContext;", "arytenoidectomy", "Lkotlin/jvm/functions/Function2;", "monoploid", "Lkotlinx/coroutines/saran;", "scope", "Lkotlinx/coroutines/monroe;", "polloi", "Lkotlinx/coroutines/monroe;", "job", "Lkotlin/coroutines/CoroutineContext$saneness;", "getKey", "()Lkotlin/coroutines/CoroutineContext$saneness;", X3.i.W, "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class premeiotic implements basify, kotlinx.coroutines.polder {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final Function2<kotlinx.coroutines.saran, wretchedly.dern<? super Unit>, Object> task;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final CoroutineContext parentCoroutineContext;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final kotlinx.coroutines.saran scope;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public kotlinx.coroutines.monroe job;

    /* JADX WARN: Multi-variable type inference failed */
    public premeiotic(CoroutineContext coroutineContext, Function2<? super kotlinx.coroutines.saran, ? super wretchedly.dern<? super Unit>, ? extends Object> function2) {
        this.parentCoroutineContext = coroutineContext;
        this.task = function2;
        this.scope = kotlinx.coroutines.privatdozent.attabal(coroutineContext.plus(coroutineContext.get(oilcan.impromptu.INSTANCE) != null ? this : EmptyCoroutineContext.INSTANCE));
    }

    @Override // androidx.compose.runtime.basify
    public void beachfront() {
        kotlinx.coroutines.monroe monroeVar = this.job;
        if (monroeVar != null) {
            monroeVar.attabal(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) kotlinx.coroutines.polder.attabal.attabal(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p002kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.saneness<E> sanenessVar) {
        return (E) kotlinx.coroutines.polder.attabal.saneness(this, sanenessVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.saneness<?> getKey() {
        return kotlinx.coroutines.polder.INSTANCE;
    }

    @Override // kotlinx.coroutines.polder
    public void handleException(CoroutineContext context, Throwable exception) throws Throwable {
        oilcan.impromptu impromptuVar = (oilcan.impromptu) context.get(oilcan.impromptu.INSTANCE);
        if (impromptuVar != null) {
            impromptuVar.wireman(exception, this);
        }
        kotlinx.coroutines.polder polderVar = (kotlinx.coroutines.polder) this.parentCoroutineContext.get(kotlinx.coroutines.polder.INSTANCE);
        if (polderVar == null) {
            throw exception;
        }
        polderVar.handleException(context, exception);
    }

    @Override // androidx.compose.runtime.basify
    public void marial() {
        kotlinx.coroutines.monroe monroeVar = this.job;
        if (monroeVar != null) {
            monroeVar.attabal(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.saneness<?> sanenessVar) {
        return kotlinx.coroutines.polder.attabal.dern(this, sanenessVar);
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlinx.coroutines.polder.attabal.wireman(this, coroutineContext);
    }

    @Override // androidx.compose.runtime.basify
    public void wireman() {
        kotlinx.coroutines.monroe monroeVar = this.job;
        if (monroeVar != null) {
            JobKt__JobKt.beachfront(monroeVar, "Old job was still running!", null, 2, null);
        }
        this.job = kotlinx.coroutines.cutely.wireman(this.scope, null, null, this.task, 3, null);
    }
}
