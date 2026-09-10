package pigboat;

import kotlinx.coroutines.hydrovane;
import kotlinx.coroutines.mathsort;
import kotlinx.coroutines.milliradian;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: NamedDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0017¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 ¨\u0006!"}, d2 = {"Lpigboat/graveside;", "Lkotlinx/coroutines/merc;", "Lkotlinx/coroutines/mathsort;", "dispatcher", "", "name", "<init>", "(Lkotlinx/coroutines/merc;Ljava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "nosophobia", "(Lkotlin/coroutines/CoroutineContext;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "itchy", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "lerp", "toString", "()Ljava/lang/String;", "", "timeMillis", "Lkotlinx/coroutines/impassible;", "continuation", "monoploid", "(JLkotlinx/coroutines/impassible;)V", "Lkotlinx/coroutines/milliradian;", "merc", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/milliradian;", "Lkotlinx/coroutines/merc;", "Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class graveside extends kotlinx.coroutines.merc implements mathsort {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final /* synthetic */ mathsort f35347arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final kotlinx.coroutines.merc dispatcher;
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public graveside(kotlinx.coroutines.merc mercVar, String str) {
        mathsort mathsortVar = mercVar instanceof mathsort ? (mathsort) mercVar : null;
        this.f35347arytenoidectomy = mathsortVar == null ? hydrovane.attabal() : mathsortVar;
        this.dispatcher = mercVar;
        this.name = str;
    }

    @Override // kotlinx.coroutines.merc
    public void itchy(CoroutineContext context, Runnable block) {
        this.dispatcher.itchy(context, block);
    }

    @Override // kotlinx.coroutines.merc
    public void lerp(CoroutineContext context, Runnable block) {
        this.dispatcher.lerp(context, block);
    }

    @Override // kotlinx.coroutines.mathsort
    public milliradian merc(long timeMillis, Runnable block, CoroutineContext context) {
        return this.f35347arytenoidectomy.merc(timeMillis, block, context);
    }

    @Override // kotlinx.coroutines.mathsort
    public void monoploid(long timeMillis, kotlinx.coroutines.impassible<? super Unit> continuation) {
        this.f35347arytenoidectomy.monoploid(timeMillis, continuation);
    }

    @Override // kotlinx.coroutines.merc
    public boolean nosophobia(CoroutineContext context) {
        return this.dispatcher.nosophobia(context);
    }

    @Override // kotlinx.coroutines.merc
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getName() {
        return this.name;
    }
}
