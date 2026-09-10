package androidx.room;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", f = "MultiInstanceInvalidationClient.android.kt", l = {87}, m = "invokeSuspend")
final class MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Set X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f8198Y;
    public final /* synthetic */ String[] Z;
    public final /* synthetic */ MultiInstanceInvalidationClient e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(String[] strArr, MultiInstanceInvalidationClient multiInstanceInvalidationClient, Continuation continuation) {
        super(2, continuation);
        this.Z = strArr;
        this.e0 = multiInstanceInvalidationClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(this.Z, this.e0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set<String> tables;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.f8198Y;
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.e0;
        if (i2 == 0) {
            ResultKt.b(obj);
            String[] strArr = this.Z;
            Object[] elements = Arrays.copyOf(strArr, strArr.length);
            Intrinsics.f(elements, "elements");
            Set setO = ArraysKt.O(elements);
            SharedFlowImpl sharedFlowImpl = multiInstanceInvalidationClient.f8194h;
            this.X = setO;
            this.f8198Y = 1;
            if (sharedFlowImpl.emit(setO, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            tables = setO;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tables = this.X;
            ResultKt.b(obj);
        }
        InvalidationTracker invalidationTracker = multiInstanceInvalidationClient.f8191b;
        Intrinsics.f(tables, "tables");
        ReentrantLock reentrantLock = invalidationTracker.f8184e;
        reentrantLock.lock();
        try {
            List<ObserverWrapper> listI0 = CollectionsKt.i0(invalidationTracker.d.values());
            reentrantLock.unlock();
            for (ObserverWrapper observerWrapper : listI0) {
                InvalidationTracker.Observer observer = observerWrapper.f8210a;
                observer.getClass();
                if (!(observer instanceof MultiInstanceInvalidationClient$observer$1)) {
                    String[] strArr2 = observerWrapper.f8212c;
                    int length = strArr2.length;
                    Set setA = EmptySet.X;
                    if (length != 0) {
                        if (length == 1) {
                            if (!tables.isEmpty()) {
                                Iterator it = tables.iterator();
                                while (it.hasNext()) {
                                    if (StringsKt.r((String) it.next(), strArr2[0], true)) {
                                        setA = observerWrapper.d;
                                        break;
                                    }
                                }
                            }
                        } else {
                            SetBuilder setBuilder = new SetBuilder();
                            for (String str : tables) {
                                for (String str2 : strArr2) {
                                    if (StringsKt.r(str2, str, true)) {
                                        setBuilder.add(str2);
                                        break;
                                    }
                                }
                            }
                            setA = SetsKt.a(setBuilder);
                        }
                    }
                    if (!setA.isEmpty()) {
                        observerWrapper.f8210a.a(setA);
                    }
                }
            }
            return Unit.f43263a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
