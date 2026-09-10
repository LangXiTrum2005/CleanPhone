package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.D1;
import com.ironsource.X3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'J[\u0010/\u001a\u0004\u0018\u00010\u001e\"\u0004\b\u0001\u0010(2\u0006\u0010\"\u001a\u00020)2\u0006\u0010*\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b/\u00100JK\u00102\u001a\u0004\u0018\u000101\"\u0004\b\u0001\u0010(2\u0006\u0010*\u001a\u00028\u00012\b\u0010.\u001a\u0004\u0018\u00010\u001e2 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0002¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u0002042\b\u0010*\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0016H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0016H\u0016¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\rH\u0001¢\u0006\u0004\b:\u0010\u000fJ\u0011\u0010;\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\b;\u0010<J!\u0010>\u001a\u00020\u00162\b\u0010=\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b>\u0010?J\u0019\u0010@\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b@\u0010\u0013J\u0017\u0010A\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020C2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bD\u0010EJC\u0010G\u001a\u00020\u0016\"\u0004\b\u0001\u0010(2\u001e\u0010-\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00160+2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010F\u001a\u00028\u0001¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u00102\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u0011\u0010M\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\bM\u0010<J\u000f\u0010N\u001a\u00020\u0016H\u0000¢\u0006\u0004\bN\u00108J\u001d\u0010Q\u001a\u00020\u00162\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000OH\u0016¢\u0006\u0004\bQ\u0010!J-\u0010S\u001a\u00020\u00162\u0006\u0010F\u001a\u00028\u00002\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010RH\u0016¢\u0006\u0004\bS\u0010TJC\u0010U\u001a\u00020\u0016\"\b\b\u0001\u0010(*\u00028\u00002\u0006\u0010F\u001a\u00028\u00012 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0016¢\u0006\u0004\bU\u0010VJ#\u0010X\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010W\u001a\u00020\tH\u0016¢\u0006\u0004\bX\u0010YJ)\u0010[\u001a\u00020\u00162\u0018\u0010\u001f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00160Rj\u0002`ZH\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020CH\u0000¢\u0006\u0004\b]\u0010^JI\u0010_\u001a\u00020\u0016\"\u0004\b\u0001\u0010(2\u0006\u0010*\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2\"\b\u0002\u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0000¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u0016H\u0000¢\u0006\u0004\ba\u00108JO\u0010b\u001a\u0004\u0018\u00010\u001e\"\b\b\u0001\u0010(*\u00028\u00002\u0006\u0010F\u001a\u00028\u00012\b\u0010.\u001a\u0004\u0018\u00010\u001e2 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0016¢\u0006\u0004\bb\u0010cJ\u0019\u0010e\u001a\u0004\u0018\u00010\u001e2\u0006\u0010d\u001a\u00020\u0010H\u0016¢\u0006\u0004\be\u0010fJ\u0017\u0010h\u001a\u00020\u00162\u0006\u0010g\u001a\u00020\u001eH\u0016¢\u0006\u0004\bh\u0010!J\u001b\u0010j\u001a\u00020\u0016*\u00020i2\u0006\u0010F\u001a\u00028\u0000H\u0016¢\u0006\u0004\bj\u0010kJ\u001f\u0010l\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bl\u0010mJ\u001b\u0010n\u001a\u0004\u0018\u00010\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bn\u0010oJ\u000f\u0010q\u001a\u00020pH\u0016¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020pH\u0014¢\u0006\u0004\bs\u0010rR \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010t\u001a\u0004\bu\u0010vR\u001a\u0010z\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010w\u001a\u0004\bx\u0010yR\u0016\u0010|\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b{\u0010\u001dR\u0014\u0010~\u001a\u00020p8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010rR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010<R\u0016\u0010\u0080\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\u000fR\u0016\u0010\u0082\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u000fR\u001f\u0010\u0085\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\r\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004R\u0015\u0010\u0089\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0088\u00018\u0002X\u0082\u0004R\u0015\u0010\u008a\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0088\u00018\u0002X\u0082\u0004¨\u0006\u008b\u0001"}, d2 = {"Lkotlinx/coroutines/kowloon;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/dent;", "Lkotlinx/coroutines/impassible;", "Ligo/dern;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/microchemistry;", "Lwretchedly/dern;", "delegate", "", "resumeMode", "<init>", "(Lwretchedly/dern;I)V", "", "polder", "()Z", "", "cause", "graveside", "(Ljava/lang/Throwable;)Z", "Lpigboat/preprohormone;", D1.i, "", "polloi", "(Lpigboat/preprohormone;Ljava/lang/Throwable;)V", "clubfoot", "splinterproof", "Lkotlinx/coroutines/milliradian;", "supplicat", "()Lkotlinx/coroutines/milliradian;", "", "handler", "restrictive", "(Ljava/lang/Object;)V", "state", "seminary", "(Ljava/lang/Object;Ljava/lang/Object;)V", X3.a.t, "rotuma", "(I)V", "R", "Lkotlinx/coroutines/setterwort;", "proposedUpdate", "Lkotlin/Function3;", "Lkotlin/coroutines/CoroutineContext;", "onCancellation", "idempotent", "mathsort", "(Lkotlinx/coroutines/setterwort;Ljava/lang/Object;ILtetrahedral/triweekly;Ljava/lang/Object;)Ljava/lang/Object;", "Lpigboat/stratoscope;", "overspeculate", "(Ljava/lang/Object;Ljava/lang/Object;Ltetrahedral/triweekly;)Lpigboat/stratoscope;", "", "kowloon", "(Ljava/lang/Object;)Ljava/lang/Void;", "dovishness", "()V", "kattegat", "creditor", "formularize", "()Ljava/lang/Object;", "takenState", "attabal", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "taiyuan", "saran", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/formularize;", "arytenoidectomy", "(Lkotlinx/coroutines/formularize;Ljava/lang/Throwable;)V", "value", "monoploid", "(Ltetrahedral/triweekly;Ljava/lang/Throwable;Ljava/lang/Object;)V", "Lkotlinx/coroutines/monroe;", "parent", "preprohormone", "(Lkotlinx/coroutines/monroe;)Ljava/lang/Throwable;", "cuirassed", "privatdozent", "Lkotlin/Result;", "result", "resumeWith", "Lkotlin/Function1;", "starveling", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "impassible", "(Ljava/lang/Object;Ltetrahedral/triweekly;)V", "index", "impromptu", "(Lpigboat/preprohormone;I)V", "Lkotlinx/coroutines/CompletionHandler;", "beachfront", "(Lkotlin/jvm/functions/Function1;)V", "merc", "(Lkotlinx/coroutines/formularize;)V", "walach", "(Ljava/lang/Object;ILtetrahedral/triweekly;)V", "adultoid", "marial", "(Ljava/lang/Object;Ljava/lang/Object;Ltetrahedral/triweekly;)Ljava/lang/Object;", "exception", "competently", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "gintrap", "Lkotlinx/coroutines/merc;", "molybdenite", "(Lkotlinx/coroutines/merc;Ljava/lang/Object;)V", "cutely", "(Ljava/lang/Object;)Ljava/lang/Object;", "wireman", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "grimness", "Lwretchedly/dern;", "dern", "()Lwretchedly/dern;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "cord", "parentHandle", "trm", "stateDebugRepresentation", "stratoscope", "isActive", "saneness", "isCompleted", "getCallerFrame", "()Ligo/dern;", "callerFrame", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "_state", "_parentHandle", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class kowloon<T> extends dent<T> implements impassible<T>, igo.dern, microchemistry {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final CoroutineContext context;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final wretchedly.dern<T> delegate;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32343graveside = AtomicIntegerFieldUpdater.newUpdater(kowloon.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32341adultoid = AtomicReferenceFieldUpdater.newUpdater(kowloon.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32342dovishness = AtomicReferenceFieldUpdater.newUpdater(kowloon.class, Object.class, "_parentHandle$volatile");

    /* JADX WARN: Multi-variable type inference failed */
    public kowloon(wretchedly.dern<? super T> dernVar, int i) {
        super(i);
        this.delegate = dernVar;
        this.context = dernVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = wireman.f32470kowloon;
    }

    public static final Unit hydrovane(Function1 function1, Throwable th, Object obj, CoroutineContext coroutineContext) {
        function1.invoke(th);
        return Unit.f29295attabal;
    }

    public static /* synthetic */ void peridotite(kowloon kowloonVar, Object obj, int i, tetrahedral.triweekly triweeklyVar, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            triweeklyVar = null;
        }
        kowloonVar.walach(obj, i, triweeklyVar);
    }

    public final void adultoid() {
        milliradian milliradianVarCord = cord();
        if (milliradianVarCord == null) {
            return;
        }
        milliradianVarCord.attabal();
        f32342dovishness.set(this, vesuvio.f32469kowloon);
    }

    public final void arytenoidectomy(formularize handler, Throwable cause) {
        try {
            handler.saneness(cause);
        } catch (Throwable th) {
            seminary.attabal(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    @Override // kotlinx.coroutines.dent
    public void attabal(Object takenState, Throwable cause) {
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32341adultoid;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof setterwort) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof stratoscope) {
                return;
            }
            if (obj instanceof CompletedContinuation) {
                CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                if (completedContinuation.dern()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th2 = cause;
                th = th2;
                if (androidx.concurrent.futures.attabal.attabal(f32341adultoid, this, obj, CompletedContinuation.saneness(completedContinuation, null, null, null, null, th2, 15, null))) {
                    completedContinuation.wireman(this, th);
                    return;
                }
            } else {
                th = cause;
                if (androidx.concurrent.futures.attabal.attabal(f32341adultoid, this, obj, new CompletedContinuation(obj, null, null, null, th, 14, null))) {
                    return;
                }
            }
            cause = th;
        }
    }

    @Override // kotlinx.coroutines.impassible
    public void beachfront(Function1<? super Throwable, Unit> handler) {
        monoploid.dern(this, new formularize.attabal(handler));
    }

    public final boolean clubfoot() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f32343graveside;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f32343graveside.compareAndSet(this, i, 536870912 + (536870911 & i)));
        return true;
    }

    @Override // kotlinx.coroutines.impassible
    public Object competently(Throwable exception) {
        return overspeculate(new stratoscope(exception, false, 2, null), null, null);
    }

    public final milliradian cord() {
        return (milliradian) f32342dovishness.get(this);
    }

    public final boolean creditor() {
        Object obj = f32341adultoid.get(this);
        if ((obj instanceof CompletedContinuation) && ((CompletedContinuation) obj).idempotentResume != null) {
            adultoid();
            return false;
        }
        f32343graveside.set(this, 536870911);
        f32341adultoid.set(this, wireman.f32470kowloon);
        return true;
    }

    public final Object cuirassed() {
        monroe monroeVar;
        boolean zPolder = polder();
        if (clubfoot()) {
            if (cord() == null) {
                supplicat();
            }
            if (zPolder) {
                privatdozent();
            }
            return p002kotlin.coroutines.intrinsics.attabal.beachfront();
        }
        if (zPolder) {
            privatdozent();
        }
        Object objStratoscope = stratoscope();
        if (objStratoscope instanceof stratoscope) {
            throw ((stratoscope) objStratoscope).cause;
        }
        if (!permissivist.saneness(this.resumeMode) || (monroeVar = (monroe) getContext().get(monroe.INSTANCE)) == null || monroeVar.isActive()) {
            return cutely(objStratoscope);
        }
        CancellationException cancellationExceptionRotuma = monroeVar.rotuma();
        attabal(objStratoscope, cancellationExceptionRotuma);
        throw cancellationExceptionRotuma;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.dent
    public <T> T cutely(Object state) {
        return state instanceof CompletedContinuation ? (T) ((CompletedContinuation) state).result : state;
    }

    @Override // kotlinx.coroutines.dent
    public final wretchedly.dern<T> dern() {
        return this.delegate;
    }

    public final void dovishness() {
        if (polder()) {
            return;
        }
        adultoid();
    }

    @Override // kotlinx.coroutines.dent
    public Object formularize() {
        return stratoscope();
    }

    @Override // igo.dern
    public igo.dern getCallerFrame() {
        wretchedly.dern<T> dernVar = this.delegate;
        if (dernVar instanceof igo.dern) {
            return (igo.dern) dernVar;
        }
        return null;
    }

    @Override // wretchedly.dern
    public CoroutineContext getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.impassible
    public void gintrap(Object token) {
        rotuma(this.resumeMode);
    }

    public final boolean graveside(Throwable cause) {
        if (!polder()) {
            return false;
        }
        wretchedly.dern<T> dernVar = this.delegate;
        Intrinsics.competently(dernVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((pigboat.competently) dernVar).adultoid(cause);
    }

    public String grimness() {
        return "CancellableContinuation";
    }

    @Override // kotlinx.coroutines.impassible
    public <R extends T> void impassible(R value, tetrahedral.triweekly<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        walach(value, this.resumeMode, onCancellation);
    }

    @Override // kotlinx.coroutines.microchemistry
    public void impromptu(pigboat.preprohormone<?> segment, int index) {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f32343graveside;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, ((i >> 29) << 29) + index));
        restrictive(segment);
    }

    @Override // kotlinx.coroutines.impassible
    public boolean isActive() {
        return stratoscope() instanceof setterwort;
    }

    public void kattegat() {
        milliradian milliradianVarSupplicat = supplicat();
        if (milliradianVarSupplicat != null && saneness()) {
            milliradianVarSupplicat.attabal();
            f32342dovishness.set(this, vesuvio.f32469kowloon);
        }
    }

    public final Void kowloon(Object proposedUpdate) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + proposedUpdate).toString());
    }

    @Override // kotlinx.coroutines.impassible
    public <R extends T> Object marial(R value, Object idempotent, tetrahedral.triweekly<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        return overspeculate(value, idempotent, onCancellation);
    }

    public final <R> Object mathsort(setterwort state, R proposedUpdate, int resumeMode, tetrahedral.triweekly<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation, Object idempotent) {
        if (proposedUpdate instanceof stratoscope) {
            return proposedUpdate;
        }
        if ((permissivist.saneness(resumeMode) || idempotent != null) && !(onCancellation == null && !(state instanceof formularize) && idempotent == null)) {
            return new CompletedContinuation(proposedUpdate, state instanceof formularize ? (formularize) state : null, onCancellation, idempotent, null, 16, null);
        }
        return proposedUpdate;
    }

    public final void merc(formularize handler) {
        restrictive(handler);
    }

    @Override // kotlinx.coroutines.impassible
    public void molybdenite(merc mercVar, T t) {
        wretchedly.dern<T> dernVar = this.delegate;
        pigboat.competently competentlyVar = dernVar instanceof pigboat.competently ? (pigboat.competently) dernVar : null;
        peridotite(this, t, (competentlyVar != null ? competentlyVar.dispatcher : null) == mercVar ? 4 : this.resumeMode, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void monoploid(tetrahedral.triweekly<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation, Throwable cause, R value) {
        try {
            onCancellation.invoke(cause, value, getContext());
        } catch (Throwable th) {
            seminary.attabal(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th));
        }
    }

    public final <R> pigboat.stratoscope overspeculate(R proposedUpdate, Object idempotent, tetrahedral.triweekly<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32341adultoid;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof setterwort)) {
                Object obj2 = idempotent;
                if ((obj instanceof CompletedContinuation) && obj2 != null && ((CompletedContinuation) obj).idempotentResume == obj2) {
                    return arytenoidectomy.f32109attabal;
                }
                return null;
            }
            R r = proposedUpdate;
            Object obj3 = idempotent;
            tetrahedral.triweekly<? super Throwable, ? super R, ? super CoroutineContext, Unit> triweeklyVar = onCancellation;
            if (androidx.concurrent.futures.attabal.attabal(f32341adultoid, this, obj, mathsort((setterwort) obj, r, this.resumeMode, triweeklyVar, obj3))) {
                dovishness();
                return arytenoidectomy.f32109attabal;
            }
            proposedUpdate = r;
            onCancellation = triweeklyVar;
            idempotent = obj3;
        }
    }

    public final boolean polder() {
        if (!permissivist.dern(this.resumeMode)) {
            return false;
        }
        wretchedly.dern<T> dernVar = this.delegate;
        Intrinsics.competently(dernVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((pigboat.competently) dernVar).graveside();
    }

    public final void polloi(pigboat.preprohormone<?> segment, Throwable cause) {
        int i = f32343graveside.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            segment.molybdenite(i, cause, getContext());
        } catch (Throwable th) {
            seminary.attabal(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    public Throwable preprohormone(monroe parent) {
        return parent.rotuma();
    }

    public final void privatdozent() {
        Throwable thRotuma;
        wretchedly.dern<T> dernVar = this.delegate;
        pigboat.competently competentlyVar = dernVar instanceof pigboat.competently ? (pigboat.competently) dernVar : null;
        if (competentlyVar == null || (thRotuma = competentlyVar.rotuma(this)) == null) {
            return;
        }
        adultoid();
        taiyuan(thRotuma);
    }

    public final void restrictive(Object handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32341adultoid;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof wireman) {
                if (androidx.concurrent.futures.attabal.attabal(f32341adultoid, this, obj, handler)) {
                    return;
                }
            } else if ((obj instanceof formularize) || (obj instanceof pigboat.preprohormone)) {
                seminary(handler, obj);
            } else {
                if (obj instanceof stratoscope) {
                    stratoscope stratoscopeVar = (stratoscope) obj;
                    if (!stratoscopeVar.dern()) {
                        seminary(handler, obj);
                    }
                    if (obj instanceof polloi) {
                        Throwable th = stratoscopeVar.cause;
                        if (handler instanceof formularize) {
                            arytenoidectomy((formularize) handler, th);
                            return;
                        } else {
                            Intrinsics.competently(handler, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            polloi((pigboat.preprohormone) handler, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj instanceof CompletedContinuation) {
                    CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                    if (completedContinuation.cancelHandler != null) {
                        seminary(handler, obj);
                    }
                    if (handler instanceof pigboat.preprohormone) {
                        return;
                    }
                    Intrinsics.competently(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    formularize formularizeVar = (formularize) handler;
                    if (completedContinuation.dern()) {
                        arytenoidectomy(formularizeVar, completedContinuation.cancelCause);
                        return;
                    } else {
                        if (androidx.concurrent.futures.attabal.attabal(f32341adultoid, this, obj, CompletedContinuation.saneness(completedContinuation, null, formularizeVar, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (handler instanceof pigboat.preprohormone) {
                        return;
                    }
                    Intrinsics.competently(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.attabal.attabal(f32341adultoid, this, obj, new CompletedContinuation(obj, (formularize) handler, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // wretchedly.dern
    public void resumeWith(Object result) {
        peridotite(this, trm.dern(result, this), this.resumeMode, null, 4, null);
    }

    public final void rotuma(int mode) {
        if (splinterproof()) {
            return;
        }
        permissivist.attabal(this, mode);
    }

    @Override // kotlinx.coroutines.impassible
    public boolean saneness() {
        return !(stratoscope() instanceof setterwort);
    }

    public final void saran(Throwable cause) {
        if (graveside(cause)) {
            return;
        }
        taiyuan(cause);
        dovishness();
    }

    public final void seminary(Object handler, Object state) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + handler + ", already has " + state).toString());
    }

    public final boolean splinterproof() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f32343graveside;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f32343graveside.compareAndSet(this, i, 1073741824 + (536870911 & i)));
        return true;
    }

    public void starveling(T value, final Function1<? super Throwable, Unit> onCancellation) {
        walach(value, this.resumeMode, onCancellation != null ? new tetrahedral.triweekly() { // from class: kotlinx.coroutines.triweekly
            @Override // tetrahedral.triweekly
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return kowloon.hydrovane(onCancellation, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        } : null);
    }

    public final Object stratoscope() {
        return f32341adultoid.get(this);
    }

    public final milliradian supplicat() {
        monroe monroeVar = (monroe) getContext().get(monroe.INSTANCE);
        if (monroeVar == null) {
            return null;
        }
        milliradian milliradianVarFormularize = JobKt__JobKt.formularize(monroeVar, false, new molybdenite(this), 1, null);
        androidx.concurrent.futures.attabal.attabal(f32342dovishness, this, null, milliradianVarFormularize);
        return milliradianVarFormularize;
    }

    @Override // kotlinx.coroutines.impassible
    public boolean taiyuan(Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32341adultoid;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof setterwort)) {
                return false;
            }
        } while (!androidx.concurrent.futures.attabal.attabal(f32341adultoid, this, obj, new polloi(this, cause, (obj instanceof formularize) || (obj instanceof pigboat.preprohormone))));
        setterwort setterwortVar = (setterwort) obj;
        if (setterwortVar instanceof formularize) {
            arytenoidectomy((formularize) obj, cause);
        } else if (setterwortVar instanceof pigboat.preprohormone) {
            polloi((pigboat.preprohormone) obj, cause);
        }
        dovishness();
        rotuma(this.resumeMode);
        return true;
    }

    public String toString() {
        return grimness() + '(' + creditor.dern(this.delegate) + "){" + trm() + "}@" + creditor.saneness(this);
    }

    public final String trm() {
        Object objStratoscope = stratoscope();
        if (objStratoscope instanceof setterwort) {
            return "Active";
        }
        return objStratoscope instanceof polloi ? "Cancelled" : "Completed";
    }

    public final <R> void walach(R proposedUpdate, int resumeMode, tetrahedral.triweekly<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32341adultoid;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof setterwort)) {
                R r = proposedUpdate;
                tetrahedral.triweekly<? super Throwable, ? super R, ? super CoroutineContext, Unit> triweeklyVar = onCancellation;
                if (obj instanceof polloi) {
                    polloi polloiVar = (polloi) obj;
                    if (polloiVar.marial()) {
                        if (triweeklyVar != null) {
                            monoploid(triweeklyVar, polloiVar.cause, r);
                            return;
                        }
                        return;
                    }
                }
                kowloon(r);
                throw new KotlinNothingValueException();
            }
            R r2 = proposedUpdate;
            int i = resumeMode;
            tetrahedral.triweekly<? super Throwable, ? super R, ? super CoroutineContext, Unit> triweeklyVar2 = onCancellation;
            if (androidx.concurrent.futures.attabal.attabal(f32341adultoid, this, obj, mathsort((setterwort) obj, r2, i, triweeklyVar2, null))) {
                dovishness();
                rotuma(i);
                return;
            } else {
                proposedUpdate = r2;
                resumeMode = i;
                onCancellation = triweeklyVar2;
            }
        }
    }

    @Override // kotlinx.coroutines.dent
    public Throwable wireman(Object state) {
        Throwable thWireman = super.wireman(state);
        if (thWireman != null) {
            return thWireman;
        }
        return null;
    }
}
