package retrofit2;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a+\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0003H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0007\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u001a\u0010\b\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\tH\u0086\b¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\f*\u00060\rj\u0002`\u000eH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"await", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lretrofit2/Call;", "(Lretrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitNullable", "awaitResponse", "Lretrofit2/Response;", "create", "Lretrofit2/Retrofit;", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", "suspendAndThrow", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 1, 15})
public final class KotlinExtensions {

    /* JADX INFO: renamed from: retrofit2.KotlinExtensions$suspendAndThrow$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00060\u0002j\u0002`\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080@"}, d2 = {"suspendAndThrow", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 1, 15})
    @DebugMetadata(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinExtensions.suspendAndThrow(null, this);
        }
    }

    public static final <T> Object await(final Call<T> call, Continuation<? super T> continuation) throws Throwable {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.s(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.f43263a;
            }

            public final void invoke(Throwable th) {
                call.cancel();
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t) {
                Intrinsics.g(call2, "call");
                Intrinsics.g(t, "t");
                cancellableContinuationImpl.resumeWith(ResultKt.a(t));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                Intrinsics.g(call2, "call");
                Intrinsics.g(response, "response");
                if (!response.isSuccessful()) {
                    cancellableContinuationImpl.resumeWith(ResultKt.a(new HttpException(response)));
                    return;
                }
                T tBody = response.body();
                if (tBody != null) {
                    cancellableContinuationImpl.resumeWith(tBody);
                    return;
                }
                Object objTag = call2.request().tag(Invocation.class);
                if (objTag == null) {
                    KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
                    Intrinsics.j(kotlinNullPointerException, Intrinsics.class.getName());
                    throw kotlinNullPointerException;
                }
                Method method = ((Invocation) objTag).method();
                StringBuilder sb = new StringBuilder("Response from ");
                Intrinsics.b(method, "method");
                Class<?> declaringClass = method.getDeclaringClass();
                Intrinsics.b(declaringClass, "method.declaringClass");
                sb.append(declaringClass.getName());
                sb.append('.');
                sb.append(method.getName());
                sb.append(" was null but response body type was declared as non-null");
                cancellableContinuationImpl.resumeWith(ResultKt.a(new KotlinNullPointerException(sb.toString())));
            }
        });
        Object objP = cancellableContinuationImpl.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        return objP;
    }

    public static final <T> Object awaitNullable(final Call<T> call, Continuation<? super T> continuation) throws Throwable {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.s(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.f43263a;
            }

            public final void invoke(Throwable th) {
                call.cancel();
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t) {
                Intrinsics.g(call2, "call");
                Intrinsics.g(t, "t");
                cancellableContinuationImpl.resumeWith(ResultKt.a(t));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                Intrinsics.g(call2, "call");
                Intrinsics.g(response, "response");
                if (response.isSuccessful()) {
                    cancellableContinuationImpl.resumeWith(response.body());
                } else {
                    cancellableContinuationImpl.resumeWith(ResultKt.a(new HttpException(response)));
                }
            }
        });
        Object objP = cancellableContinuationImpl.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        return objP;
    }

    public static final <T> Object awaitResponse(final Call<T> call, Continuation<? super Response<T>> continuation) throws Throwable {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.s(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.f43263a;
            }

            public final void invoke(Throwable th) {
                call.cancel();
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t) {
                Intrinsics.g(call2, "call");
                Intrinsics.g(t, "t");
                cancellableContinuationImpl.resumeWith(ResultKt.a(t));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                Intrinsics.g(call2, "call");
                Intrinsics.g(response, "response");
                cancellableContinuationImpl.resumeWith(response);
            }
        });
        Object objP = cancellableContinuationImpl.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        return objP;
    }

    public static final <T> T create(Retrofit create) {
        Intrinsics.g(create, "$this$create");
        Intrinsics.l();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object suspendAndThrow(final Exception exc, Continuation<?> continuation) {
        final AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = anonymousClass1.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return Unit.f43263a;
        }
        ResultKt.b(obj);
        anonymousClass1.L$0 = exc;
        anonymousClass1.label = 1;
        Dispatchers.f44752a.U(anonymousClass1.getF45023Y(), new Runnable() { // from class: retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
            @Override // java.lang.Runnable
            public final void run() {
                IntrinsicsKt.b(anonymousClass1).resumeWith(ResultKt.a(exc));
            }
        });
        return coroutineSingletons;
    }
}
