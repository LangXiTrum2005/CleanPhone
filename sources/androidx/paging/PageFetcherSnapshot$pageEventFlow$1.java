package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00060\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Landroidx/paging/SimpleProducerScope;", "Landroidx/paging/PageEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", l = {646, 168, 657}, m = "invokeSuspend")
final class PageFetcherSnapshot$pageEventFlow$1 extends SuspendLambda implements Function2<SimpleProducerScope<PageEvent<Object>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", l = {91}, m = "invokeSuspend")
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "Key", "", "Value", "it", "Landroidx/paging/PageEvent;", "emit", "(Landroidx/paging/PageEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        final class AnonymousClass1<T> implements FlowCollector {
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(PageEvent pageEvent, Continuation continuation) {
                PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1;
                if (continuation instanceof PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) {
                    pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 = (PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) continuation;
                    int i2 = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.Z;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.Z = i2 - Integer.MIN_VALUE;
                    } else {
                        pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 = new PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1(this, continuation);
                    }
                } else {
                    pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 = new PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1(this, continuation);
                }
                Object obj = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.X;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                int i3 = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.Z;
                try {
                    if (i3 == 0) {
                        ResultKt.b(obj);
                        pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.Z = 1;
                        throw null;
                    }
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return Unit.f43263a;
                } catch (ClosedSendChannelException unused) {
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            ResultKt.b(obj);
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", l = {105}, m = "invokeSuspend")
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Key", "", "Value", "it", "emit", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        final class AnonymousClass1<T> implements FlowCollector {
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                throw null;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            ResultKt.b(obj);
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", l = {110}, m = "invokeSuspend")
    final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Key", "", "Value", "it", "emit", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        final class AnonymousClass1<T> implements FlowCollector {

            /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f7846a;

                static {
                    int[] iArr = new int[LoadType.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f7846a = iArr;
                }
            }

            /* JADX WARN: Code duplicated, block: B:102:0x027b  */
            /* JADX WARN: Code duplicated, block: B:108:0x028a  */
            /* JADX WARN: Code duplicated, block: B:110:0x028e  */
            /* JADX WARN: Code duplicated, block: B:112:0x0292  */
            /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
            /* JADX WARN: Code duplicated, block: B:69:0x019d  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference failed for: r2v0, types: [int, kotlinx.coroutines.sync.Mutex] */
            public final Object b(Continuation continuation) {
                PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;
                LoadType loadType;
                PageFetcherSnapshot pageFetcherSnapshot;
                LoadStates loadStates;
                LoadType loadType2;
                LoadType loadType3;
                PageFetcherSnapshot pageFetcherSnapshot2;
                if (continuation instanceof PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) {
                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 = (PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) continuation;
                    int i2 = pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.k0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.k0 = i2 - Integer.MIN_VALUE;
                    } else {
                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 = new PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1(this, continuation);
                    }
                } else {
                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 = new PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1(this, continuation);
                }
                Object obj = pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.i0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                ?? r2 = pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.k0;
                LoadType loadType4 = LoadType.X;
                try {
                    try {
                        try {
                            switch (r2) {
                                case 0:
                                    ResultKt.b(obj);
                                    throw null;
                                case 1:
                                    Mutex mutex = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0;
                                    PageFetcherSnapshotState.Holder holder = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f7847Y;
                                    ResultKt.b(obj);
                                    try {
                                        holder.getClass();
                                        throw null;
                                    } catch (Throwable th) {
                                        mutex.b(null);
                                        throw th;
                                    }
                                case 2:
                                    Mutex mutex2 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.g0;
                                    PageFetcherSnapshotState.Holder holder2 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f0;
                                    LoadType loadType5 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0;
                                    CoroutineScope coroutineScope = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Z;
                                    PageFetcherSnapshot pageFetcherSnapshot3 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f7847Y;
                                    LoadStates loadStates2 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.X;
                                    ResultKt.b(obj);
                                    holder2.getClass();
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.X = loadStates2;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f7847Y = pageFetcherSnapshot3;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Z = coroutineScope;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0 = loadType5;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f0 = mutex2;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.g0 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.k0 = 3;
                                    pageFetcherSnapshot3.getClass();
                                    throw null;
                                case 3:
                                    Mutex mutex3 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f0;
                                    LoadType loadType6 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0;
                                    CoroutineScope coroutineScope2 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Z;
                                    PageFetcherSnapshot pageFetcherSnapshot4 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f7847Y;
                                    LoadStates loadStates3 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.X;
                                    ResultKt.b(obj);
                                    mutex3.b(null);
                                    if (WhenMappings.f7846a[loadType6.ordinal()] != 1) {
                                        pageFetcherSnapshot4.getClass();
                                        throw null;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.X = loadStates3;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f7847Y = pageFetcherSnapshot4;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Z = coroutineScope2;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0 = loadType6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f0 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.g0 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.h0 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.k0 = 5;
                                    if (PageFetcherSnapshot.b(pageFetcherSnapshot4, loadType6, null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                        loadType = loadType6;
                                        pageFetcherSnapshot = pageFetcherSnapshot4;
                                        loadStates = loadStates3;
                                        if (loadType != loadType4) {
                                            pageFetcherSnapshot.getClass();
                                            throw null;
                                        }
                                        if (loadStates.f7813b instanceof LoadState.Error) {
                                            pageFetcherSnapshot.getClass();
                                            throw null;
                                        }
                                        if (loadStates.f7814c instanceof LoadState.Error) {
                                            pageFetcherSnapshot.getClass();
                                            throw null;
                                        }
                                        return Unit.f43263a;
                                    }
                                    return coroutineSingletons;
                                case 4:
                                    Mutex mutex4 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.g0;
                                    PageFetcherSnapshotState.Holder holder3 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f0;
                                    ResultKt.b(obj);
                                    try {
                                        holder3.getClass();
                                        throw null;
                                    } catch (Throwable th2) {
                                        mutex4.b(null);
                                        throw th2;
                                    }
                                case 5:
                                    loadType = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0;
                                    pageFetcherSnapshot = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f7847Y;
                                    loadStates = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.X;
                                    ResultKt.b(obj);
                                    if (loadType != loadType4) {
                                        pageFetcherSnapshot.getClass();
                                        throw null;
                                    }
                                    if (loadStates.f7813b instanceof LoadState.Error) {
                                        pageFetcherSnapshot.getClass();
                                        throw null;
                                    }
                                    if (loadStates.f7814c instanceof LoadState.Error) {
                                        pageFetcherSnapshot.getClass();
                                        throw null;
                                    }
                                    return Unit.f43263a;
                                case 6:
                                    Mutex mutex5 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f0;
                                    PageFetcherSnapshotState.Holder holder4 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0;
                                    ResultKt.b(obj);
                                    try {
                                        holder4.getClass();
                                        throw null;
                                    } catch (Throwable th3) {
                                        mutex5.b(null);
                                        throw th3;
                                    }
                                case 7:
                                    Mutex mutex6 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.g0;
                                    PageFetcherSnapshotState.Holder holder5 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f0;
                                    LoadType loadType7 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0;
                                    CoroutineScope coroutineScope3 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Z;
                                    PageFetcherSnapshot pageFetcherSnapshot5 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f7847Y;
                                    LoadStates loadStates4 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.X;
                                    ResultKt.b(obj);
                                    holder5.getClass();
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.X = loadStates4;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f7847Y = pageFetcherSnapshot5;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Z = coroutineScope3;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0 = loadType7;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f0 = mutex6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.g0 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.k0 = 8;
                                    pageFetcherSnapshot5.getClass();
                                    throw null;
                                case 8:
                                    Mutex mutex7 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f0;
                                    LoadType loadType8 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0;
                                    CoroutineScope coroutineScope4 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Z;
                                    PageFetcherSnapshot pageFetcherSnapshot6 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f7847Y;
                                    LoadStates loadStates5 = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.X;
                                    ResultKt.b(obj);
                                    mutex7.b(null);
                                    if (WhenMappings.f7846a[loadType8.ordinal()] != 1) {
                                        pageFetcherSnapshot6.getClass();
                                        throw null;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.X = loadStates5;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f7847Y = pageFetcherSnapshot6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Z = coroutineScope4;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0 = loadType8;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f0 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.g0 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.h0 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.k0 = 10;
                                    if (PageFetcherSnapshot.b(pageFetcherSnapshot6, loadType8, null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                        loadType2 = loadType8;
                                        pageFetcherSnapshot = pageFetcherSnapshot6;
                                        loadStates = loadStates5;
                                        if (loadType2 == loadType4) {
                                            pageFetcherSnapshot.getClass();
                                            throw null;
                                        }
                                        if (loadStates.f7814c instanceof LoadState.Error) {
                                            pageFetcherSnapshot.getClass();
                                            throw null;
                                        }
                                        return Unit.f43263a;
                                    }
                                    return coroutineSingletons;
                                case 9:
                                    Mutex mutex8 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.g0;
                                    PageFetcherSnapshotState.Holder holder6 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f0;
                                    ResultKt.b(obj);
                                    try {
                                        holder6.getClass();
                                        throw null;
                                    } catch (Throwable th4) {
                                        mutex8.b(null);
                                        throw th4;
                                    }
                                case 10:
                                    loadType2 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0;
                                    pageFetcherSnapshot = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f7847Y;
                                    loadStates = (LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.X;
                                    ResultKt.b(obj);
                                    if (loadType2 == loadType4) {
                                        pageFetcherSnapshot.getClass();
                                        throw null;
                                    }
                                    if (loadStates.f7814c instanceof LoadState.Error) {
                                        pageFetcherSnapshot.getClass();
                                        throw null;
                                    }
                                    return Unit.f43263a;
                                case 11:
                                    Mutex mutex9 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f0;
                                    PageFetcherSnapshotState.Holder holder7 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0;
                                    ResultKt.b(obj);
                                    try {
                                        holder7.getClass();
                                        throw null;
                                    } catch (Throwable th5) {
                                        mutex9.b(null);
                                        throw th5;
                                    }
                                case 12:
                                    Mutex mutex10 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f0;
                                    PageFetcherSnapshotState.Holder holder8 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0;
                                    LoadType loadType9 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Z;
                                    CoroutineScope coroutineScope5 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f7847Y;
                                    PageFetcherSnapshot pageFetcherSnapshot7 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.X;
                                    ResultKt.b(obj);
                                    holder8.getClass();
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.X = pageFetcherSnapshot7;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f7847Y = coroutineScope5;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Z = loadType9;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0 = mutex10;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f0 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.k0 = 13;
                                    pageFetcherSnapshot7.getClass();
                                    throw null;
                                case 13:
                                    Mutex mutex11 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0;
                                    LoadType loadType10 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Z;
                                    CoroutineScope coroutineScope6 = (CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f7847Y;
                                    PageFetcherSnapshot pageFetcherSnapshot8 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.X;
                                    ResultKt.b(obj);
                                    mutex11.b(null);
                                    if (WhenMappings.f7846a[loadType10.ordinal()] != 1) {
                                        pageFetcherSnapshot8.getClass();
                                        throw null;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.X = pageFetcherSnapshot8;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f7847Y = coroutineScope6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Z = loadType10;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f0 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.g0 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.h0 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.k0 = 15;
                                    if (PageFetcherSnapshot.b(pageFetcherSnapshot8, loadType10, null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutineSingletons) {
                                        loadType3 = loadType10;
                                        pageFetcherSnapshot2 = pageFetcherSnapshot8;
                                        if (loadType3 == loadType4) {
                                            pageFetcherSnapshot2.getClass();
                                            throw null;
                                        }
                                        return Unit.f43263a;
                                    }
                                    return coroutineSingletons;
                                case 14:
                                    Mutex mutex12 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.f0;
                                    PageFetcherSnapshotState.Holder holder9 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0;
                                    ResultKt.b(obj);
                                    try {
                                        holder9.getClass();
                                        throw null;
                                    } catch (Throwable th6) {
                                        mutex12.b(null);
                                        throw th6;
                                    }
                                case 15:
                                    loadType3 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Z;
                                    pageFetcherSnapshot2 = (PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.X;
                                    ResultKt.b(obj);
                                    if (loadType3 == loadType4) {
                                        pageFetcherSnapshot2.getClass();
                                        throw null;
                                    }
                                    return Unit.f43263a;
                                case 16:
                                    Mutex mutex13 = (Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.e0;
                                    PageFetcherSnapshotState.Holder holder10 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Z;
                                    ResultKt.b(obj);
                                    try {
                                        holder10.getClass();
                                        throw null;
                                    } catch (Throwable th7) {
                                        mutex13.b(null);
                                        throw th7;
                                    }
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } catch (Throwable th8) {
                            r2.b(null);
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        r2.b(null);
                        throw th9;
                    }
                } catch (Throwable th10) {
                    r2.b(null);
                    throw th10;
                }
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return b(continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            ResultKt.b(obj);
            FlowKt.h(null);
            throw null;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        throw null;
    }
}
