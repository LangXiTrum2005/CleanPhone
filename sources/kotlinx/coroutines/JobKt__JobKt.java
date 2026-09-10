package kotlinx.coroutines;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.concurrent.CancellationException;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0014\u001a\u00020\u0013*\u00020\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\u0013*\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0018\u001a\u00020\u0013*\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001d\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001e\"\u0015\u0010!\u001a\u00020\u0001*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0015\u0010$\u001a\u00020\u0000*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lkotlinx/coroutines/monroe;", "", "invokeImmediately", "Lkotlinx/coroutines/unconsolidated;", "handler", "Lkotlinx/coroutines/milliradian;", "apical", "(Lkotlinx/coroutines/monroe;ZLkotlinx/coroutines/unconsolidated;)Lkotlinx/coroutines/milliradian;", "parent", "Lkotlinx/coroutines/cord;", "attabal", "(Lkotlinx/coroutines/monroe;)Lkotlinx/coroutines/cord;", "handle", "competently", "(Lkotlinx/coroutines/monroe;Lkotlinx/coroutines/milliradian;)Lkotlinx/coroutines/milliradian;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "dern", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;)V", "taiyuan", "(Lkotlinx/coroutines/monroe;)V", "impromptu", "(Lkotlin/coroutines/CoroutineContext;)V", "", PglCryptUtils.KEY_MESSAGE, "", "wireman", "(Lkotlinx/coroutines/monroe;Ljava/lang/String;Ljava/lang/Throwable;)V", "impassible", "(Lkotlin/coroutines/CoroutineContext;)Z", "isActive", "cutely", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/monroe;", "job", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
public final /* synthetic */ class JobKt__JobKt {
    public static final milliradian apical(monroe monroeVar, boolean z, unconsolidated unconsolidatedVar) {
        return monroeVar instanceof JobSupport ? ((JobSupport) monroeVar).czestochowa(z, unconsolidatedVar) : monroeVar.dovishness(unconsolidatedVar.dovishness(), z, new JobKt__JobKt$invokeOnCompletion$1(unconsolidatedVar));
    }

    public static final cord attabal(monroe monroeVar) {
        return new julian(monroeVar);
    }

    public static /* synthetic */ void beachfront(monroe monroeVar, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        achondroplasia.wireman(monroeVar, str, th);
    }

    public static final milliradian competently(monroe monroeVar, milliradian milliradianVar) {
        return formularize(monroeVar, false, new itchy(milliradianVar), 1, null);
    }

    public static final monroe cutely(CoroutineContext coroutineContext) {
        monroe monroeVar = (monroe) coroutineContext.get(monroe.INSTANCE);
        if (monroeVar != null) {
            return monroeVar;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static final void dern(CoroutineContext coroutineContext, CancellationException cancellationException) {
        monroe monroeVar = (monroe) coroutineContext.get(monroe.INSTANCE);
        if (monroeVar != null) {
            monroeVar.attabal(cancellationException);
        }
    }

    public static /* synthetic */ milliradian formularize(monroe monroeVar, boolean z, unconsolidated unconsolidatedVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return achondroplasia.apical(monroeVar, z, unconsolidatedVar);
    }

    public static final boolean impassible(CoroutineContext coroutineContext) {
        monroe monroeVar = (monroe) coroutineContext.get(monroe.INSTANCE);
        if (monroeVar != null) {
            return monroeVar.isActive();
        }
        return true;
    }

    public static final void impromptu(CoroutineContext coroutineContext) {
        monroe monroeVar = (monroe) coroutineContext.get(monroe.INSTANCE);
        if (monroeVar != null) {
            achondroplasia.taiyuan(monroeVar);
        }
    }

    public static /* synthetic */ void marial(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        achondroplasia.dern(coroutineContext, cancellationException);
    }

    public static /* synthetic */ cord saneness(monroe monroeVar, int i, Object obj) {
        if ((i & 1) != 0) {
            monroeVar = null;
        }
        return achondroplasia.attabal(monroeVar);
    }

    public static final void taiyuan(monroe monroeVar) {
        if (!monroeVar.isActive()) {
            throw monroeVar.rotuma();
        }
    }

    public static final void wireman(monroe monroeVar, String str, Throwable th) {
        monroeVar.attabal(coi.attabal(str, th));
    }
}
