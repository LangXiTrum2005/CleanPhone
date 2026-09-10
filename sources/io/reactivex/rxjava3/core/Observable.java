package io.reactivex.rxjava3.core;

import com.mbridge.msdk.config.component.common.express.operator.s;
import com.startapp.sdk.internal.C;
import io.reactivex.rxjava3.annotations.BackpressureKind;
import io.reactivex.rxjava3.annotations.BackpressureSupport;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.functions.Function7;
import io.reactivex.rxjava3.functions.Function8;
import io.reactivex.rxjava3.functions.Function9;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.fuseable.ScalarSupplier;
import io.reactivex.rxjava3.internal.jdk8.ObservableCollectWithCollectorSingle;
import io.reactivex.rxjava3.internal.jdk8.ObservableFirstStageObserver;
import io.reactivex.rxjava3.internal.jdk8.ObservableFlatMapStream;
import io.reactivex.rxjava3.internal.jdk8.ObservableFromCompletionStage;
import io.reactivex.rxjava3.internal.jdk8.ObservableFromStream;
import io.reactivex.rxjava3.internal.jdk8.ObservableLastStageObserver;
import io.reactivex.rxjava3.internal.jdk8.ObservableMapOptional;
import io.reactivex.rxjava3.internal.jdk8.ObservableSingleStageObserver;
import io.reactivex.rxjava3.internal.observers.BlockingFirstObserver;
import io.reactivex.rxjava3.internal.observers.BlockingLastObserver;
import io.reactivex.rxjava3.internal.observers.ForEachWhileObserver;
import io.reactivex.rxjava3.internal.observers.FutureObserver;
import io.reactivex.rxjava3.internal.observers.LambdaObserver;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromObservable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToObservable;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableConcatMapCompletable;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableConcatMapMaybe;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableConcatMapSingle;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableSwitchMapCompletable;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableSwitchMapMaybe;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableSwitchMapSingle;
import io.reactivex.rxjava3.internal.operators.observable.BlockingObservableIterable;
import io.reactivex.rxjava3.internal.operators.observable.BlockingObservableLatest;
import io.reactivex.rxjava3.internal.operators.observable.BlockingObservableMostRecent;
import io.reactivex.rxjava3.internal.operators.observable.BlockingObservableNext;
import io.reactivex.rxjava3.internal.operators.observable.ObservableAllSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableAmb;
import io.reactivex.rxjava3.internal.operators.observable.ObservableAnySingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableBlockingSubscribe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableBuffer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableBufferBoundary;
import io.reactivex.rxjava3.internal.operators.observable.ObservableBufferExactBoundary;
import io.reactivex.rxjava3.internal.operators.observable.ObservableBufferTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCache;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCollectSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCombineLatest;
import io.reactivex.rxjava3.internal.operators.observable.ObservableConcatMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableConcatMapEager;
import io.reactivex.rxjava3.internal.operators.observable.ObservableConcatMapScheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableConcatWithCompletable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableConcatWithMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableConcatWithSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCountSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDebounce;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDebounceTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDefer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDelay;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDelaySubscriptionOther;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDematerialize;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDetach;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDistinct;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDoAfterNext;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDoFinally;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDoOnEach;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDoOnLifecycle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableElementAtMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableElementAtSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableEmpty;
import io.reactivex.rxjava3.internal.operators.observable.ObservableError;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFilter;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFlatMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFlatMapMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFlatMapSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFlattenIterable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromAction;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromArray;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromCallable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromCompletable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromFuture;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromIterable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromRunnable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromSupplier;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromUnsafeSource;
import io.reactivex.rxjava3.internal.operators.observable.ObservableGenerate;
import io.reactivex.rxjava3.internal.operators.observable.ObservableGroupBy;
import io.reactivex.rxjava3.internal.operators.observable.ObservableGroupJoin;
import io.reactivex.rxjava3.internal.operators.observable.ObservableHide;
import io.reactivex.rxjava3.internal.operators.observable.ObservableIgnoreElements;
import io.reactivex.rxjava3.internal.operators.observable.ObservableIgnoreElementsCompletable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableInternalHelper;
import io.reactivex.rxjava3.internal.operators.observable.ObservableInterval;
import io.reactivex.rxjava3.internal.operators.observable.ObservableIntervalRange;
import io.reactivex.rxjava3.internal.operators.observable.ObservableJoin;
import io.reactivex.rxjava3.internal.operators.observable.ObservableJust;
import io.reactivex.rxjava3.internal.operators.observable.ObservableLastMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableLastSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableLift;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMapNotification;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMaterialize;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMergeWithCompletable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMergeWithMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMergeWithSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableNever;
import io.reactivex.rxjava3.internal.operators.observable.ObservableObserveOn;
import io.reactivex.rxjava3.internal.operators.observable.ObservableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.observable.ObservableOnErrorNext;
import io.reactivex.rxjava3.internal.operators.observable.ObservableOnErrorReturn;
import io.reactivex.rxjava3.internal.operators.observable.ObservablePublish;
import io.reactivex.rxjava3.internal.operators.observable.ObservablePublishSelector;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRange;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRangeLong;
import io.reactivex.rxjava3.internal.operators.observable.ObservableReduceMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableReduceSeedSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableReduceWithSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRepeat;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRepeatUntil;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRepeatWhen;
import io.reactivex.rxjava3.internal.operators.observable.ObservableReplay;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRetryBiPredicate;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRetryPredicate;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRetryWhen;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSampleTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableScan;
import io.reactivex.rxjava3.internal.operators.observable.ObservableScanSeed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSequenceEqualSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSerialized;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSingleMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSingleSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSkip;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSkipLast;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSkipLastTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSkipUntil;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSkipWhile;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSwitchIfEmpty;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSwitchMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTake;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTakeLast;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTakeLastOne;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTakeLastTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTakeUntil;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTakeUntilPredicate;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTakeWhile;
import io.reactivex.rxjava3.internal.operators.observable.ObservableThrottleFirstTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableThrottleLatest;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTimeInterval;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTimeout;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTimer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableToListSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableUnsubscribeOn;
import io.reactivex.rxjava3.internal.operators.observable.ObservableUsing;
import io.reactivex.rxjava3.internal.operators.observable.ObservableWindow;
import io.reactivex.rxjava3.internal.operators.observable.ObservableWindowBoundary;
import io.reactivex.rxjava3.internal.operators.observable.ObservableWindowBoundarySelector;
import io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableWithLatestFrom;
import io.reactivex.rxjava3.internal.operators.observable.ObservableWithLatestFromMany;
import io.reactivex.rxjava3.internal.operators.observable.ObservableZip;
import io.reactivex.rxjava3.internal.operators.observable.ObservableZipIterable;
import io.reactivex.rxjava3.internal.operators.single.SingleToObservable;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.HashMapSupplier;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.observables.GroupedObservable;
import io.reactivex.rxjava3.observers.SafeObserver;
import io.reactivex.rxjava3.observers.TestObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.Spliterators;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Observable<T> implements ObservableSource<T> {

    /* JADX INFO: renamed from: io.reactivex.rxjava3.core.Observable$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$rxjava3$core$BackpressureStrategy;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            $SwitchMap$io$reactivex$rxjava3$core$BackpressureStrategy = iArr;
            try {
                iArr[BackpressureStrategy.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$rxjava3$core$BackpressureStrategy[BackpressureStrategy.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$reactivex$rxjava3$core$BackpressureStrategy[BackpressureStrategy.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$reactivex$rxjava3$core$BackpressureStrategy[BackpressureStrategy.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> amb(Iterable<? extends ObservableSource<? extends T>> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableAmb(null, iterable));
    }

    @CheckReturnValue
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> ambArray(ObservableSource<? extends T>... observableSourceArr) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        int length = observableSourceArr.length;
        if (length == 0) {
            return empty();
        }
        return length == 1 ? wrap(observableSourceArr[0]) : RxJavaPlugins.onAssembly(new ObservableAmb(observableSourceArr, null));
    }

    @CheckReturnValue
    public static int bufferSize() {
        return Flowable.bufferSize();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> Observable<R> combineLatest(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        return combineLatest(iterable, function, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> Observable<R> combineLatestArray(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function) {
        return combineLatestArray(observableSourceArr, function, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> Observable<R> combineLatestArrayDelayError(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function) {
        return combineLatestArrayDelayError(observableSourceArr, function, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> Observable<R> combineLatestDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        return combineLatestDelayError(iterable, function, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> concat(Iterable<? extends ObservableSource<? extends T>> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(Functions.identity(), false, bufferSize());
    }

    @CheckReturnValue
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> concatArray(ObservableSource<? extends T>... observableSourceArr) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        return observableSourceArr.length == 1 ? wrap(observableSourceArr[0]) : RxJavaPlugins.onAssembly(new ObservableConcatMap(fromArray(observableSourceArr), Functions.identity(), bufferSize(), ErrorMode.BOUNDARY));
    }

    @CheckReturnValue
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> concatArrayDelayError(ObservableSource<? extends T>... observableSourceArr) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        return observableSourceArr.length == 1 ? wrap(observableSourceArr[0]) : concatDelayError(fromArray(observableSourceArr));
    }

    @CheckReturnValue
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> concatArrayEager(ObservableSource<? extends T>... observableSourceArr) {
        return concatArrayEager(bufferSize(), bufferSize(), observableSourceArr);
    }

    @CheckReturnValue
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> concatArrayEagerDelayError(ObservableSource<? extends T>... observableSourceArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), observableSourceArr);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> concatDelayError(Iterable<? extends ObservableSource<? extends T>> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return concatDelayError(fromIterable(iterable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> concatEager(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> concatEagerDelayError(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return concatEagerDelayError(iterable, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> create(ObservableOnSubscribe<T> observableOnSubscribe) {
        Objects.requireNonNull(observableOnSubscribe, "source is null");
        return RxJavaPlugins.onAssembly(new ObservableCreate(observableOnSubscribe));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> defer(Supplier<? extends ObservableSource<? extends T>> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return RxJavaPlugins.onAssembly(new ObservableDefer(supplier));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    private Observable<T> doOnEach(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(action2, "onAfterTerminate is null");
        return RxJavaPlugins.onAssembly(new ObservableDoOnEach(this, consumer, consumer2, action, action2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> empty() {
        return RxJavaPlugins.onAssembly(ObservableEmpty.INSTANCE);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> error(Supplier<? extends Throwable> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return RxJavaPlugins.onAssembly(new ObservableError(supplier));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> fromAction(Action action) {
        Objects.requireNonNull(action, "action is null");
        return RxJavaPlugins.onAssembly(new ObservableFromAction(action));
    }

    @CheckReturnValue
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> fromArray(T... tArr) {
        Objects.requireNonNull(tArr, "items is null");
        if (tArr.length == 0) {
            return empty();
        }
        return tArr.length == 1 ? just(tArr[0]) : RxJavaPlugins.onAssembly(new ObservableFromArray(tArr));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> fromCallable(Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return RxJavaPlugins.onAssembly(new ObservableFromCallable(callable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> fromCompletable(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "completableSource is null");
        return RxJavaPlugins.onAssembly(new ObservableFromCompletable(completableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> fromCompletionStage(CompletionStage<T> completionStage) {
        Objects.requireNonNull(completionStage, "stage is null");
        return RxJavaPlugins.onAssembly(new ObservableFromCompletionStage(completionStage));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> fromFuture(Future<? extends T> future) {
        Objects.requireNonNull(future, "future is null");
        return RxJavaPlugins.onAssembly(new ObservableFromFuture(future, 0L, null));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> fromIterable(Iterable<? extends T> iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return RxJavaPlugins.onAssembly(new ObservableFromIterable(iterable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> fromMaybe(MaybeSource<T> maybeSource) {
        Objects.requireNonNull(maybeSource, "maybe is null");
        return RxJavaPlugins.onAssembly(new MaybeToObservable(maybeSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> fromOptional(Optional<T> optional) {
        Objects.requireNonNull(optional, "optional is null");
        return (Observable) optional.map(new s(4)).orElseGet(new a(2));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> fromPublisher(Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "publisher is null");
        return RxJavaPlugins.onAssembly(new ObservableFromPublisher(publisher));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> fromRunnable(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        return RxJavaPlugins.onAssembly(new ObservableFromRunnable(runnable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> fromSingle(SingleSource<T> singleSource) {
        Objects.requireNonNull(singleSource, "source is null");
        return RxJavaPlugins.onAssembly(new SingleToObservable(singleSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> fromStream(Stream<T> stream) {
        Objects.requireNonNull(stream, "stream is null");
        return RxJavaPlugins.onAssembly(new ObservableFromStream(stream));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> fromSupplier(Supplier<? extends T> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return RxJavaPlugins.onAssembly(new ObservableFromSupplier(supplier));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> generate(Consumer<Emitter<T>> consumer) {
        Objects.requireNonNull(consumer, "generator is null");
        return generate(Functions.nullSupplier(), ObservableInternalHelper.simpleGenerator(consumer), Functions.emptyConsumer());
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static Observable<Long> interval(long j, long j2, TimeUnit timeUnit) {
        return interval(j, j2, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static Observable<Long> intervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        return intervalRange(j, j2, j3, j4, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> just(T t) {
        Objects.requireNonNull(t, "item is null");
        return RxJavaPlugins.onAssembly(new ObservableJust(t));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> merge(Iterable<? extends ObservableSource<? extends T>> iterable, int i2, int i3) {
        return fromIterable(iterable).flatMap(Functions.identity(), false, i2, i3);
    }

    @CheckReturnValue
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeArray(int i2, int i3, ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(Functions.identity(), false, i2, i3);
    }

    @CheckReturnValue
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeArrayDelayError(int i2, int i3, ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(Functions.identity(), true, i2, i3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeDelayError(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Functions.identity(), true);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> never() {
        return RxJavaPlugins.onAssembly(ObservableNever.INSTANCE);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable<Integer> range(int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.h(i3, "count >= 0 required but it was "));
        }
        if (i3 == 0) {
            return empty();
        }
        if (i3 == 1) {
            return just(Integer.valueOf(i2));
        }
        if (((long) i2) + ((long) (i3 - 1)) <= 2147483647L) {
            return RxJavaPlugins.onAssembly(new ObservableRange(i2, i3));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static Observable<Long> rangeLong(long j, long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.i(j2, "count >= 0 required but it was "));
        }
        if (j2 == 0) {
            return empty();
        }
        if (j2 == 1) {
            return just(Long.valueOf(j));
        }
        long j3 = (j2 - 1) + j;
        if (j <= 0 || j3 >= 0) {
            return RxJavaPlugins.onAssembly(new ObservableRangeLong(j, j2));
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Single<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        return sequenceEqual(observableSource, observableSource2, ObjectHelper.equalsPredicate(), bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> switchOnNext(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i2) {
        Objects.requireNonNull(observableSource, "sources is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMap(observableSource, Functions.identity(), i2, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> switchOnNextDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return switchOnNextDelayError(observableSource, bufferSize());
    }

    private Observable<T> timeout0(long j, TimeUnit timeUnit, ObservableSource<? extends T> observableSource, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableTimeoutTimed(this, j, timeUnit, scheduler, observableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static Observable<Long> timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> unsafeCreate(ObservableSource<T> observableSource) {
        Objects.requireNonNull(observableSource, "onSubscribe is null");
        if (observableSource instanceof Observable) {
            throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
        }
        return RxJavaPlugins.onAssembly(new ObservableFromUnsafeSource(observableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, D> Observable<T> using(Supplier<? extends D> supplier, Function<? super D, ? extends ObservableSource<? extends T>> function, Consumer<? super D> consumer) {
        return using(supplier, function, consumer, true);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> wrap(ObservableSource<T> observableSource) {
        Objects.requireNonNull(observableSource, "source is null");
        return observableSource instanceof Observable ? RxJavaPlugins.onAssembly((Observable) observableSource) : RxJavaPlugins.onAssembly(new ObservableFromUnsafeSource(observableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> Observable<R> zip(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        Objects.requireNonNull(function, "zipper is null");
        Objects.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableZip(null, iterable, function, bufferSize(), false));
    }

    @CheckReturnValue
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T, R> Observable<R> zipArray(Function<? super Object[], ? extends R> function, boolean z2, int i2, ObservableSource<? extends T>... observableSourceArr) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        Objects.requireNonNull(function, "zipper is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableZip(observableSourceArr, null, function, i2, z2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<Boolean> all(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableAllSingle(this, predicate));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> ambWith(ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return ambArray(this, observableSource);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<Boolean> any(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableAnySingle(this, predicate));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final T blockingFirst() {
        BlockingFirstObserver blockingFirstObserver = new BlockingFirstObserver();
        subscribe(blockingFirstObserver);
        T tBlockingGet = blockingFirstObserver.blockingGet();
        if (tBlockingGet != null) {
            return tBlockingGet;
        }
        throw new NoSuchElementException();
    }

    @SchedulerSupport("none")
    public final void blockingForEach(Consumer<? super T> consumer) {
        blockingForEach(consumer, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final T blockingLast() {
        BlockingLastObserver blockingLastObserver = new BlockingLastObserver();
        subscribe(blockingLastObserver);
        T tBlockingGet = blockingLastObserver.blockingGet();
        if (tBlockingGet != null) {
            return tBlockingGet;
        }
        throw new NoSuchElementException();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable<T> blockingLatest() {
        return new BlockingObservableLatest(this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable<T> blockingMostRecent(T t) {
        Objects.requireNonNull(t, "initialItem is null");
        return new BlockingObservableMostRecent(this, t);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable<T> blockingNext() {
        return new BlockingObservableNext(this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final T blockingSingle() {
        T tBlockingGet = singleElement().blockingGet();
        if (tBlockingGet != null) {
            return tBlockingGet;
        }
        throw new NoSuchElementException();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Stream<T> blockingStream() {
        return blockingStream(bufferSize());
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe() {
        ObservableBlockingSubscribe.subscribe(this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<List<T>> buffer(int i2) {
        return buffer(i2, i2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> cache() {
        return cacheWithInitialCapacity(16);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> cacheWithInitialCapacity(int i2) {
        ObjectHelper.verifyPositive(i2, "initialCapacity");
        return RxJavaPlugins.onAssembly(new ObservableCache(this, i2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> Observable<U> cast(Class<U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return (Observable<U>) map(Functions.castFunction(cls));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> Single<U> collect(Supplier<? extends U> supplier, BiConsumer<? super U, ? super T> biConsumer) {
        Objects.requireNonNull(supplier, "initialItemSupplier is null");
        Objects.requireNonNull(biConsumer, "collector is null");
        return RxJavaPlugins.onAssembly(new ObservableCollectSingle(this, supplier, biConsumer));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> Single<U> collectInto(U u2, BiConsumer<? super U, ? super T> biConsumer) {
        Objects.requireNonNull(u2, "initialItem is null");
        return collect(Functions.justSupplier(u2), biConsumer);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> compose(ObservableTransformer<? super T, ? extends R> observableTransformer) {
        Objects.requireNonNull(observableTransformer, "composer is null");
        return wrap(observableTransformer.apply(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMap(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return concatMap(function, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable concatMapCompletable(Function<? super T, ? extends CompletableSource> function) {
        return concatMapCompletable(function, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable concatMapCompletableDelayError(Function<? super T, ? extends CompletableSource> function) {
        return concatMapCompletableDelayError(function, true, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return concatMapDelayError(function, true, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapEager(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return concatMapEager(function, Integer.MAX_VALUE, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapEagerDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z2) {
        return concatMapEagerDelayError(function, z2, Integer.MAX_VALUE, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> Observable<U> concatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlattenIterable(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return concatMapMaybe(function, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapMaybeDelayError(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return concatMapMaybeDelayError(function, true, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function) {
        return concatMapSingle(function, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapSingleDelayError(Function<? super T, ? extends SingleSource<? extends R>> function) {
        return concatMapSingleDelayError(function, true, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapStream(Function<? super T, ? extends Stream<? extends R>> function) {
        return flatMapStream(function);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> concatWith(ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return concat(this, observableSource);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<Boolean> contains(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return any(Functions.equalsWith(obj));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<Long> count() {
        return RxJavaPlugins.onAssembly(new ObservableCountSingle(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> Observable<T> debounce(Function<? super T, ? extends ObservableSource<U>> function) {
        Objects.requireNonNull(function, "debounceIndicator is null");
        return RxJavaPlugins.onAssembly(new ObservableDebounce(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> defaultIfEmpty(T t) {
        Objects.requireNonNull(t, "defaultItem is null");
        return switchIfEmpty(just(t));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> Observable<T> delay(Function<? super T, ? extends ObservableSource<U>> function) {
        Objects.requireNonNull(function, "itemDelayIndicator is null");
        return (Observable<T>) flatMap(ObservableInternalHelper.itemDelay(function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> Observable<T> delaySubscription(ObservableSource<U> observableSource) {
        Objects.requireNonNull(observableSource, "subscriptionIndicator is null");
        return RxJavaPlugins.onAssembly(new ObservableDelaySubscriptionOther(this, observableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> dematerialize(Function<? super T, Notification<R>> function) {
        Objects.requireNonNull(function, "selector is null");
        return RxJavaPlugins.onAssembly(new ObservableDematerialize(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> distinct() {
        return distinct(Functions.identity(), Functions.createHashSet());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> distinctUntilChanged() {
        return distinctUntilChanged(Functions.identity());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> doAfterNext(Consumer<? super T> consumer) {
        Objects.requireNonNull(consumer, "onAfterNext is null");
        return RxJavaPlugins.onAssembly(new ObservableDoAfterNext(this, consumer));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> doAfterTerminate(Action action) {
        Objects.requireNonNull(action, "onAfterTerminate is null");
        return doOnEach(Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, action);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> doFinally(Action action) {
        Objects.requireNonNull(action, "onFinally is null");
        return RxJavaPlugins.onAssembly(new ObservableDoFinally(this, action));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> doOnComplete(Action action) {
        return doOnEach(Functions.emptyConsumer(), Functions.emptyConsumer(), action, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> doOnDispose(Action action) {
        return doOnLifecycle(Functions.emptyConsumer(), action);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> doOnError(Consumer<? super Throwable> consumer) {
        Consumer<? super T> consumerEmptyConsumer = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return doOnEach(consumerEmptyConsumer, consumer, action, action);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> doOnLifecycle(Consumer<? super Disposable> consumer, Action action) {
        Objects.requireNonNull(consumer, "onSubscribe is null");
        Objects.requireNonNull(action, "onDispose is null");
        return RxJavaPlugins.onAssembly(new ObservableDoOnLifecycle(this, consumer, action));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> doOnNext(Consumer<? super T> consumer) {
        Consumer<? super Throwable> consumerEmptyConsumer = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return doOnEach(consumer, consumerEmptyConsumer, action, action);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> doOnSubscribe(Consumer<? super Disposable> consumer) {
        return doOnLifecycle(consumer, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> doOnTerminate(Action action) {
        Objects.requireNonNull(action, "onTerminate is null");
        return doOnEach(Functions.emptyConsumer(), Functions.actionConsumer(action), action, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe<T> elementAt(long j) {
        if (j >= 0) {
            return RxJavaPlugins.onAssembly(new ObservableElementAtMaybe(this, j));
        }
        throw new IndexOutOfBoundsException(androidx.datastore.preferences.protobuf.a.i(j, "index >= 0 required but it was "));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<T> elementAtOrError(long j) {
        if (j >= 0) {
            return RxJavaPlugins.onAssembly(new ObservableElementAtSingle(this, j, null));
        }
        throw new IndexOutOfBoundsException(androidx.datastore.preferences.protobuf.a.i(j, "index >= 0 required but it was "));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> filter(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableFilter(this, predicate));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<T> first(T t) {
        return elementAt(0L, t);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe<T> firstElement() {
        return elementAt(0L);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<T> firstOrError() {
        return elementAtOrError(0L);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final CompletionStage<T> firstOrErrorStage() {
        return (CompletionStage) subscribeWith(new ObservableFirstStageObserver(false, null));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final CompletionStage<T> firstStage(T t) {
        return (CompletionStage) subscribeWith(new ObservableFirstStageObserver(true, t));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return flatMap((Function) function, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable flatMapCompletable(Function<? super T, ? extends CompletableSource> function) {
        return flatMapCompletable(function, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> Observable<U> flatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlattenIterable(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return flatMapMaybe(function, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function) {
        return flatMapSingle(function, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMapStream(Function<? super T, ? extends Stream<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMapStream(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable forEach(Consumer<? super T> consumer) {
        return subscribe(consumer);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable forEachWhile(Predicate<? super T> predicate) {
        return forEachWhile(predicate, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K> Observable<GroupedObservable<K, T>> groupBy(Function<? super T, ? extends K> function) {
        return (Observable<GroupedObservable<K, T>>) groupBy(function, Functions.identity(), false, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <TRight, TLeftEnd, TRightEnd, R> Observable<R> groupJoin(ObservableSource<? extends TRight> observableSource, Function<? super T, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super T, ? super Observable<TRight>, ? extends R> biFunction) {
        Objects.requireNonNull(observableSource, "other is null");
        Objects.requireNonNull(function, "leftEnd is null");
        Objects.requireNonNull(function2, "rightEnd is null");
        Objects.requireNonNull(biFunction, "resultSelector is null");
        return RxJavaPlugins.onAssembly(new ObservableGroupJoin(this, observableSource, function, function2, biFunction));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> hide() {
        return RxJavaPlugins.onAssembly(new ObservableHide(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable ignoreElements() {
        return RxJavaPlugins.onAssembly(new ObservableIgnoreElementsCompletable(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<Boolean> isEmpty() {
        return all(Functions.alwaysFalse());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <TRight, TLeftEnd, TRightEnd, R> Observable<R> join(ObservableSource<? extends TRight> observableSource, Function<? super T, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super T, ? super TRight, ? extends R> biFunction) {
        Objects.requireNonNull(observableSource, "other is null");
        Objects.requireNonNull(function, "leftEnd is null");
        Objects.requireNonNull(function2, "rightEnd is null");
        Objects.requireNonNull(biFunction, "resultSelector is null");
        return RxJavaPlugins.onAssembly(new ObservableJoin(this, observableSource, function, function2, biFunction));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<T> last(T t) {
        Objects.requireNonNull(t, "defaultItem is null");
        return RxJavaPlugins.onAssembly(new ObservableLastSingle(this, t));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe<T> lastElement() {
        return RxJavaPlugins.onAssembly(new ObservableLastMaybe(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<T> lastOrError() {
        return RxJavaPlugins.onAssembly(new ObservableLastSingle(this, null));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final CompletionStage<T> lastOrErrorStage() {
        return (CompletionStage) subscribeWith(new ObservableLastStageObserver(false, null));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final CompletionStage<T> lastStage(T t) {
        return (CompletionStage) subscribeWith(new ObservableLastStageObserver(true, t));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> lift(ObservableOperator<? extends R, ? super T> observableOperator) {
        Objects.requireNonNull(observableOperator, "lifter is null");
        return RxJavaPlugins.onAssembly(new ObservableLift(this, observableOperator));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> map(Function<? super T, ? extends R> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableMap(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> mapOptional(Function<? super T, Optional<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableMapOptional(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<Notification<T>> materialize() {
        return RxJavaPlugins.onAssembly(new ObservableMaterialize(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> mergeWith(ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return merge(this, observableSource);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> observeOn(Scheduler scheduler) {
        return observeOn(scheduler, false, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> Observable<U> ofType(Class<U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return filter(Functions.isInstanceOf(cls)).cast(cls);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> onErrorComplete() {
        return onErrorComplete(Functions.alwaysTrue());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> onErrorResumeNext(Function<? super Throwable, ? extends ObservableSource<? extends T>> function) {
        Objects.requireNonNull(function, "fallbackSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableOnErrorNext(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> onErrorResumeWith(ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "fallback is null");
        return onErrorResumeNext(Functions.justFunction(observableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> onErrorReturn(Function<? super Throwable, ? extends T> function) {
        Objects.requireNonNull(function, "itemSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableOnErrorReturn(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> onErrorReturnItem(T t) {
        Objects.requireNonNull(t, "item is null");
        return onErrorReturn(Functions.justFunction(t));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> onTerminateDetach() {
        return RxJavaPlugins.onAssembly(new ObservableDetach(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final ConnectableObservable<T> publish() {
        return RxJavaPlugins.onAssembly((ConnectableObservable) new ObservablePublish(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe<T> reduce(BiFunction<T, T, T> biFunction) {
        Objects.requireNonNull(biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new ObservableReduceMaybe(this, biFunction));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Single<R> reduceWith(Supplier<R> supplier, BiFunction<R, ? super T, R> biFunction) {
        Objects.requireNonNull(supplier, "seedSupplier is null");
        Objects.requireNonNull(biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new ObservableReduceWithSingle(this, supplier, biFunction));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> repeatUntil(BooleanSupplier booleanSupplier) {
        Objects.requireNonNull(booleanSupplier, "stop is null");
        return RxJavaPlugins.onAssembly(new ObservableRepeatUntil(this, booleanSupplier));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> repeatWhen(Function<? super Observable<Object>, ? extends ObservableSource<?>> function) {
        Objects.requireNonNull(function, "handler is null");
        return RxJavaPlugins.onAssembly(new ObservableRepeatWhen(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final ConnectableObservable<T> replay() {
        return ObservableReplay.createFrom(this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> retry() {
        return retry(Long.MAX_VALUE, Functions.alwaysTrue());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> retryUntil(BooleanSupplier booleanSupplier) {
        Objects.requireNonNull(booleanSupplier, "stop is null");
        return retry(Long.MAX_VALUE, Functions.predicateReverseFor(booleanSupplier));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> retryWhen(Function<? super Observable<Throwable>, ? extends ObservableSource<?>> function) {
        Objects.requireNonNull(function, "handler is null");
        return RxJavaPlugins.onAssembly(new ObservableRetryWhen(this, function));
    }

    @SchedulerSupport("none")
    public final void safeSubscribe(Observer<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        if (observer instanceof SafeObserver) {
            subscribe(observer);
        } else {
            subscribe(new SafeObserver(observer));
        }
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> sample(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> scan(BiFunction<T, T, T> biFunction) {
        Objects.requireNonNull(biFunction, "accumulator is null");
        return RxJavaPlugins.onAssembly(new ObservableScan(this, biFunction));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> scanWith(Supplier<R> supplier, BiFunction<R, ? super T, R> biFunction) {
        Objects.requireNonNull(supplier, "seedSupplier is null");
        Objects.requireNonNull(biFunction, "accumulator is null");
        return RxJavaPlugins.onAssembly(new ObservableScanSeed(this, supplier, biFunction));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> serialize() {
        return RxJavaPlugins.onAssembly(new ObservableSerialized(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> share() {
        return publish().refCount();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<T> single(T t) {
        Objects.requireNonNull(t, "defaultItem is null");
        return RxJavaPlugins.onAssembly(new ObservableSingleSingle(this, t));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Maybe<T> singleElement() {
        return RxJavaPlugins.onAssembly(new ObservableSingleMaybe(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<T> singleOrError() {
        return RxJavaPlugins.onAssembly(new ObservableSingleSingle(this, null));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final CompletionStage<T> singleOrErrorStage() {
        return (CompletionStage) subscribeWith(new ObservableSingleStageObserver(false, null));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final CompletionStage<T> singleStage(T t) {
        return (CompletionStage) subscribeWith(new ObservableSingleStageObserver(true, t));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> skip(long j) {
        if (j >= 0) {
            return j == 0 ? RxJavaPlugins.onAssembly(this) : RxJavaPlugins.onAssembly(new ObservableSkip(this, j));
        }
        throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.i(j, "count >= 0 expected but it was "));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> skipLast(int i2) {
        if (i2 >= 0) {
            return i2 == 0 ? RxJavaPlugins.onAssembly(this) : RxJavaPlugins.onAssembly(new ObservableSkipLast(this, i2));
        }
        throw new IllegalArgumentException(android.support.v4.media.a.h(i2, "count >= 0 required but it was "));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> Observable<T> skipUntil(ObservableSource<U> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableSkipUntil(this, observableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> skipWhile(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableSkipWhile(this, predicate));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> sorted() {
        return toList().toObservable().map(Functions.listSorter(Functions.naturalComparator())).flatMapIterable(Functions.identity());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> startWith(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return concat(Completable.wrap(completableSource).toObservable(), this);
    }

    @CheckReturnValue
    @SafeVarargs
    @SchedulerSupport("none")
    public final Observable<T> startWithArray(T... tArr) {
        Observable observableFromArray = fromArray(tArr);
        return observableFromArray == empty() ? RxJavaPlugins.onAssembly(this) : concatArray(observableFromArray, this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> startWithItem(T t) {
        return concatArray(just(t), this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> startWithIterable(Iterable<? extends T> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    @SchedulerSupport("none")
    public final Disposable subscribe() {
        return subscribe(Functions.emptyConsumer(), Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    public abstract void subscribeActual(Observer<? super T> observer);

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> subscribeOn(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableSubscribeOn(this, scheduler));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <E extends Observer<? super T>> E subscribeWith(E e2) {
        subscribe(e2);
        return e2;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> switchIfEmpty(ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchIfEmpty(this, observableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> switchMap(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return switchMap(function, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable switchMapCompletable(Function<? super T, ? extends CompletableSource> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapCompletable(this, function, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable switchMapCompletableDelayError(Function<? super T, ? extends CompletableSource> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapCompletable(this, function, true));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> switchMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return switchMapDelayError(function, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> switchMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapMaybe(this, function, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> switchMapMaybeDelayError(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapMaybe(this, function, true));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> switchMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapSingle(this, function, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> switchMapSingleDelayError(Function<? super T, ? extends SingleSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapSingle(this, function, true));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> take(long j) {
        if (j >= 0) {
            return RxJavaPlugins.onAssembly(new ObservableTake(this, j));
        }
        throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.i(j, "count >= 0 required but it was "));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> takeLast(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.h(i2, "count >= 0 required but it was "));
        }
        if (i2 == 0) {
            return RxJavaPlugins.onAssembly(new ObservableIgnoreElements(this));
        }
        return i2 == 1 ? RxJavaPlugins.onAssembly(new ObservableTakeLastOne(this)) : RxJavaPlugins.onAssembly(new ObservableTakeLast(this, i2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> Observable<T> takeUntil(ObservableSource<U> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableTakeUntil(this, observableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> takeWhile(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableTakeWhile(this, predicate));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final TestObserver<T> test() {
        TestObserver<T> testObserver = new TestObserver<>();
        subscribe(testObserver);
        return testObserver;
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> throttleFirst(long j, TimeUnit timeUnit) {
        return throttleFirst(j, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> throttleLast(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> throttleLatest(long j, TimeUnit timeUnit) {
        return throttleLatest(j, timeUnit, Schedulers.computation(), false);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> throttleWithTimeout(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<Timed<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <V> Observable<T> timeout(Function<? super T, ? extends ObservableSource<V>> function) {
        return timeout0(null, function, null);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<Timed<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> R to(ObservableConverter<T, ? extends R> observableConverter) {
        Objects.requireNonNull(observableConverter, "converter is null");
        return observableConverter.apply(this);
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable<T> toFlowable(BackpressureStrategy backpressureStrategy) {
        Objects.requireNonNull(backpressureStrategy, "strategy is null");
        FlowableFromObservable flowableFromObservable = new FlowableFromObservable(this);
        int i2 = AnonymousClass1.$SwitchMap$io$reactivex$rxjava3$core$BackpressureStrategy[backpressureStrategy.ordinal()];
        if (i2 == 1) {
            return flowableFromObservable.onBackpressureDrop();
        }
        if (i2 == 2) {
            return flowableFromObservable.onBackpressureLatest();
        }
        if (i2 != 3) {
            return i2 != 4 ? flowableFromObservable.onBackpressureBuffer() : RxJavaPlugins.onAssembly(new FlowableOnBackpressureError(flowableFromObservable));
        }
        return flowableFromObservable;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Future<T> toFuture() {
        return (Future) subscribeWith(new FutureObserver());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<List<T>> toList() {
        return toList(16);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K> Single<Map<K, T>> toMap(Function<? super T, ? extends K> function) {
        Objects.requireNonNull(function, "keySelector is null");
        return (Single<Map<K, T>>) collect(HashMapSupplier.asSupplier(), Functions.toMapKeySelector(function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K> Single<Map<K, Collection<T>>> toMultimap(Function<? super T, ? extends K> function) {
        return (Single<Map<K, Collection<T>>>) toMultimap(function, Functions.identity(), HashMapSupplier.asSupplier(), ArrayListSupplier.asFunction());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<List<T>> toSortedList() {
        return toSortedList(Functions.naturalComparator());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> unsubscribeOn(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableUnsubscribeOn(this, scheduler));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<Observable<T>> window(long j) {
        return window(j, j, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> Observable<R> withLatestFrom(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        Objects.requireNonNull(observableSource, "other is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return RxJavaPlugins.onAssembly(new ObservableWithLatestFrom(this, biFunction, observableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> Observable<R> zipWith(Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        Objects.requireNonNull(iterable, "other is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        return RxJavaPlugins.onAssembly(new ObservableZipIterable(this, iterable, biFunction));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> Observable<R> combineLatest(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i2) {
        Objects.requireNonNull(iterable, "sources is null");
        Objects.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableCombineLatest(null, iterable, function, i2 << 1, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> Observable<R> combineLatestArray(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function, int i2) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        Objects.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableCombineLatest(observableSourceArr, null, function, i2 << 1, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> Observable<R> combineLatestArrayDelayError(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function, int i2) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        Objects.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return observableSourceArr.length == 0 ? empty() : RxJavaPlugins.onAssembly(new ObservableCombineLatest(observableSourceArr, null, function, i2 << 1, true));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> Observable<R> combineLatestDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i2) {
        Objects.requireNonNull(iterable, "sources is null");
        Objects.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableCombineLatest(null, iterable, function, i2 << 1, true));
    }

    @CheckReturnValue
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> concatArrayEager(int i2, int i3, ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).concatMapEagerDelayError(Functions.identity(), false, i2, i3);
    }

    @CheckReturnValue
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> concatArrayEagerDelayError(int i2, int i3, ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).concatMapEagerDelayError(Functions.identity(), true, i2, i3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> concatEager(Iterable<? extends ObservableSource<? extends T>> iterable, int i2, int i3) {
        return fromIterable(iterable).concatMapEagerDelayError(Functions.identity(), false, i2, i3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> concatEagerDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, int i2, int i3) {
        return fromIterable(iterable).concatMapEagerDelayError(Functions.identity(), true, i2, i3);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public static Observable<Long> interval(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableInterval(Math.max(0L, j), Math.max(0L, j2), timeUnit, scheduler));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public static Observable<Long> intervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit, Scheduler scheduler) {
        if (j2 < 0) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.i(j2, "count >= 0 required but it was "));
        }
        if (j2 == 0) {
            return empty().delay(j3, timeUnit, scheduler);
        }
        long j5 = (j2 - 1) + j;
        if (j > 0 && j5 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableIntervalRange(j, j5, Math.max(0L, j3), Math.max(0L, j4), timeUnit, scheduler));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> merge(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Functions.identity());
    }

    @CheckReturnValue
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeArray(ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(Functions.identity(), observableSourceArr.length);
    }

    @CheckReturnValue
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeArrayDelayError(ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(Functions.identity(), true, observableSourceArr.length);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, int i2, int i3) {
        return fromIterable(iterable).flatMap(Functions.identity(), true, i2, i3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Single<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate) {
        return sequenceEqual(observableSource, observableSource2, biPredicate, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> switchOnNextDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i2) {
        Objects.requireNonNull(observableSource, "sources is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMap(observableSource, Functions.identity(), i2, true));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public static Observable<Long> timer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableTimer(Math.max(j, 0L), timeUnit, scheduler));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, D> Observable<T> using(Supplier<? extends D> supplier, Function<? super D, ? extends ObservableSource<? extends T>> function, Consumer<? super D> consumer, boolean z2) {
        Objects.requireNonNull(supplier, "resourceSupplier is null");
        Objects.requireNonNull(function, "sourceSupplier is null");
        Objects.requireNonNull(consumer, "resourceCleanup is null");
        return RxJavaPlugins.onAssembly(new ObservableUsing(supplier, function, consumer, z2));
    }

    @SchedulerSupport("none")
    public final void blockingForEach(Consumer<? super T> consumer, int i2) {
        Objects.requireNonNull(consumer, "onNext is null");
        Iterator<T> it = blockingIterable(i2).iterator();
        while (it.hasNext()) {
            try {
                consumer.accept(it.next());
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                ((Disposable) it).dispose();
                throw ExceptionHelper.wrapOrThrow(th);
            }
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable<T> blockingIterable(int i2) {
        ObjectHelper.verifyPositive(i2, "capacityHint");
        return new BlockingObservableIterable(this, i2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Stream<T> blockingStream(int i2) {
        Iterator<T> it = blockingIterable(i2).iterator();
        Stream stream = StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, 0), false);
        Disposable disposable = (Disposable) it;
        disposable.getClass();
        return (Stream) stream.onClose(new C(disposable, 17));
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer<? super T> consumer) {
        ObservableBlockingSubscribe.subscribe(this, consumer, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<List<T>> buffer(int i2, int i3) {
        return (Observable<List<T>>) buffer(i2, i3, ArrayListSupplier.asSupplier());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return RxJavaPlugins.onAssembly(new ObservableConcatMap(this, function, i2, ErrorMode.IMMEDIATE));
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? empty() : ObservableScalarXMap.scalarXMap(obj, function);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable concatMapCompletable(Function<? super T, ? extends CompletableSource> function, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "capacityHint");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapCompletable(this, function, ErrorMode.IMMEDIATE, i2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable concatMapCompletableDelayError(Function<? super T, ? extends CompletableSource> function, boolean z2) {
        return concatMapCompletableDelayError(function, z2, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z2, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return RxJavaPlugins.onAssembly(new ObservableConcatMap(this, function, i2, z2 ? ErrorMode.END : ErrorMode.BOUNDARY));
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? empty() : ObservableScalarXMap.scalarXMap(obj, function);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapEager(Function<? super T, ? extends ObservableSource<? extends R>> function, int i2, int i3) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "maxConcurrency");
        ObjectHelper.verifyPositive(i3, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapEager(this, function, ErrorMode.IMMEDIATE, i2, i3));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapEagerDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z2, int i2, int i3) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "maxConcurrency");
        ObjectHelper.verifyPositive(i3, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapEager(this, function, z2 ? ErrorMode.END : ErrorMode.BOUNDARY, i2, i3));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapMaybe(this, function, ErrorMode.IMMEDIATE, i2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapMaybeDelayError(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z2) {
        return concatMapMaybeDelayError(function, z2, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapSingle(this, function, ErrorMode.IMMEDIATE, i2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapSingleDelayError(Function<? super T, ? extends SingleSource<? extends R>> function, boolean z2) {
        return concatMapSingleDelayError(function, z2, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K> Observable<T> distinct(Function<? super T, K> function) {
        return distinct(function, Functions.createHashSet());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K> Observable<T> distinctUntilChanged(Function<? super T, K> function) {
        Objects.requireNonNull(function, "keySelector is null");
        return RxJavaPlugins.onAssembly(new ObservableDistinctUntilChanged(this, function, ObjectHelper.equalsPredicate()));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z2) {
        return flatMap(function, z2, Integer.MAX_VALUE);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable flatMapCompletable(Function<? super T, ? extends CompletableSource> function, boolean z2) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMapCompletableCompletable(this, function, z2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z2) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMapMaybe(this, function, z2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function, boolean z2) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMapSingle(this, function, z2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable forEachWhile(Predicate<? super T> predicate, Consumer<? super Throwable> consumer) {
        return forEachWhile(predicate, consumer, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K> Observable<GroupedObservable<K, T>> groupBy(Function<? super T, ? extends K> function, boolean z2) {
        return (Observable<GroupedObservable<K, T>>) groupBy(function, Functions.identity(), z2, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> observeOn(Scheduler scheduler, boolean z2) {
        return observeOn(scheduler, z2, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> onErrorComplete(Predicate<? super Throwable> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableOnErrorComplete(this, predicate));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> publish(Function<? super Observable<T>, ? extends ObservableSource<R>> function) {
        Objects.requireNonNull(function, "selector is null");
        return RxJavaPlugins.onAssembly(new ObservablePublishSelector(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> repeat(long j) {
        if (j >= 0) {
            return j == 0 ? empty() : RxJavaPlugins.onAssembly(new ObservableRepeat(this, j));
        }
        throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.i(j, "times >= 0 required but it was "));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function) {
        Objects.requireNonNull(function, "selector is null");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replaySupplier(this), function);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> retry(BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        Objects.requireNonNull(biPredicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableRetryBiPredicate(this, biPredicate));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> sample(long j, TimeUnit timeUnit, boolean z2) {
        return sample(j, timeUnit, Schedulers.computation(), z2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> sorted(Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        return toList().toObservable().map(Functions.listSorter(comparator)).flatMapIterable(Functions.identity());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> switchMap(Function<? super T, ? extends ObservableSource<? extends R>> function, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return RxJavaPlugins.onAssembly(new ObservableSwitchMap(this, function, i2, false));
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? empty() : ObservableScalarXMap.scalarXMap(obj, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> switchMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return RxJavaPlugins.onAssembly(new ObservableSwitchMap(this, function, i2, true));
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? empty() : ObservableScalarXMap.scalarXMap(obj, function);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> throttleFirst(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableThrottleFirstTimed(this, j, timeUnit, scheduler));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> throttleLast(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return sample(j, timeUnit, scheduler);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> throttleLatest(long j, TimeUnit timeUnit, boolean z2) {
        return throttleLatest(j, timeUnit, Schedulers.computation(), z2);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> throttleWithTimeout(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return debounce(j, timeUnit, scheduler);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<Timed<T>> timeInterval(Scheduler scheduler) {
        return timeInterval(TimeUnit.MILLISECONDS, scheduler);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <V> Observable<T> timeout(Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "fallback is null");
        return timeout0(null, function, observableSource);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<Timed<T>> timestamp(Scheduler scheduler) {
        return timestamp(TimeUnit.MILLISECONDS, scheduler);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<List<T>> toList(int i2) {
        ObjectHelper.verifyPositive(i2, "capacityHint");
        return RxJavaPlugins.onAssembly(new ObservableToListSingle(this, i2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<List<T>> toSortedList(Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        return (Single<List<T>>) toList().map(Functions.listSorter(comparator));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<Observable<T>> window(long j, long j2) {
        return window(j, j2, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> concat(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return concat(observableSource, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> concatDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return concatDelayError(observableSource, bufferSize(), true);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> concatEager(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return concatEager(observableSource, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> concatEagerDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return concatEagerDelayError(observableSource, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> error(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return error((Supplier<? extends Throwable>) Functions.justSupplier(th));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(future, "future is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        return RxJavaPlugins.onAssembly(new ObservableFromFuture(future, j, timeUnit));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> just(T t, T t2) {
        Objects.requireNonNull(t, "item1 is null");
        Objects.requireNonNull(t2, "item2 is null");
        return fromArray(t, t2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> merge(Iterable<? extends ObservableSource<? extends T>> iterable, int i2) {
        return fromIterable(iterable).flatMap(Functions.identity(), i2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, int i2) {
        return fromIterable(iterable).flatMap(Functions.identity(), true, i2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Single<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate, int i2) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(biPredicate, "isEqual is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableSequenceEqualSingle(observableSource, observableSource2, biPredicate, i2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final T blockingSingle(T t) {
        return single(t).blockingGet();
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        ObservableBlockingSubscribe.subscribe(this, consumer, consumer2, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U extends Collection<? super T>> Observable<U> buffer(int i2, int i3, Supplier<U> supplier) {
        ObjectHelper.verifyPositive(i2, "count");
        ObjectHelper.verifyPositive(i3, "skip");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableBuffer(this, i2, i3, supplier));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Completable concatMapCompletableDelayError(Function<? super T, ? extends CompletableSource> function, boolean z2, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapCompletable(this, function, z2 ? ErrorMode.END : ErrorMode.BOUNDARY, i2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapMaybeDelayError(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z2, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapMaybe(this, function, z2 ? ErrorMode.END : ErrorMode.BOUNDARY, i2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapSingleDelayError(Function<? super T, ? extends SingleSource<? extends R>> function, boolean z2, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapSingle(this, function, z2 ? ErrorMode.END : ErrorMode.BOUNDARY, i2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> concatWith(SingleSource<? extends T> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatWithSingle(this, singleSource));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> debounce(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, Schedulers.computation(), false);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K> Observable<T> distinct(Function<? super T, K> function, Supplier<? extends Collection<? super K>> supplier) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(supplier, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableDistinct(this, function, supplier));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z2, int i2) {
        return flatMap(function, z2, i2, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, V> Observable<V> flatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        Objects.requireNonNull(function, "mapper is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return (Observable<V>) flatMap(ObservableInternalHelper.flatMapIntoIterable(function), biFunction, false, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable forEachWhile(Predicate<? super T> predicate, Consumer<? super Throwable> consumer, Action action) {
        Objects.requireNonNull(predicate, "onNext is null");
        Objects.requireNonNull(consumer, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        ForEachWhileObserver forEachWhileObserver = new ForEachWhileObserver(predicate, consumer, action);
        subscribe(forEachWhileObserver);
        return forEachWhileObserver;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K, V> Observable<GroupedObservable<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return groupBy(function, function2, false, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> mergeWith(SingleSource<? extends T> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableMergeWithSingle(this, singleSource));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> observeOn(Scheduler scheduler, boolean z2, int i2) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableObserveOn(this, scheduler, z2, i2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Single<R> reduce(R r, BiFunction<R, ? super T, R> biFunction) {
        Objects.requireNonNull(r, "seed is null");
        Objects.requireNonNull(biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new ObservableReduceSeedSingle(this, r, biFunction));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> sample(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableSampleTimed(this, j, timeUnit, scheduler, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> scan(R r, BiFunction<R, ? super T, R> biFunction) {
        Objects.requireNonNull(r, "initialValue is null");
        return scanWith(Functions.justSupplier(r), biFunction);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> startWith(SingleSource<T> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return concat(Single.wrap(singleSource).toObservable(), this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return subscribe(consumer, consumer2, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> takeUntil(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "stopPredicate is null");
        return RxJavaPlugins.onAssembly(new ObservableTakeUntilPredicate(this, predicate));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final TestObserver<T> test(boolean z2) {
        TestObserver<T> testObserver = new TestObserver<>();
        if (z2) {
            testObserver.dispose();
        }
        subscribe(testObserver);
        return testObserver;
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> throttleLatest(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return throttleLatest(j, timeUnit, scheduler, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<Timed<T>> timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<Timed<T>> timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K, V> Single<Map<K, V>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(function2, "valueSelector is null");
        return (Single<Map<K, V>>) collect(HashMapSupplier.asSupplier(), Functions.toMapKeyValueSelector(function, function2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<Observable<T>> window(long j, long j2, int i2) {
        ObjectHelper.verifyPositive(j, "count");
        ObjectHelper.verifyPositive(j2, "skip");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableWindow(this, j, j2, i2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> concat(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i2) {
        Objects.requireNonNull(observableSource, "sources is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableConcatMap(observableSource, Functions.identity(), i2, ErrorMode.IMMEDIATE));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> concatDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i2, boolean z2) {
        Objects.requireNonNull(observableSource, "sources is null");
        ObjectHelper.verifyPositive(i2, "bufferSize is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatMap(observableSource, Functions.identity(), i2, z2 ? ErrorMode.END : ErrorMode.BOUNDARY));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> concatEager(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i2, int i3) {
        return wrap(observableSource).concatMapEager(Functions.identity(), i2, i3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> concatEagerDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i2, int i3) {
        return wrap(observableSource).concatMapEagerDelayError(Functions.identity(), true, i2, i3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> merge(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        Objects.requireNonNull(observableSource, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(observableSource, Functions.identity(), false, Integer.MAX_VALUE, bufferSize()));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        Objects.requireNonNull(observableSource, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(observableSource, Functions.identity(), true, Integer.MAX_VALUE, bufferSize()));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> switchOnNext(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return switchOnNext(observableSource, bufferSize());
    }

    private <U, V> Observable<T> timeout0(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource2) {
        Objects.requireNonNull(function, "itemTimeoutIndicator is null");
        return RxJavaPlugins.onAssembly(new ObservableTimeout(this, observableSource, function, observableSource2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> Observable<R> zip(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, boolean z2, int i2) {
        Objects.requireNonNull(function, "zipper is null");
        Objects.requireNonNull(iterable, "sources is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableZip(null, iterable, function, i2, z2));
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        ObservableBlockingSubscribe.subscribe(this, consumer, consumer2, action);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R, A> Single<R> collect(Collector<T, A, R> collector) {
        Objects.requireNonNull(collector, "collector is null");
        return RxJavaPlugins.onAssembly(new ObservableCollectWithCollectorSingle(this, collector));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> debounce(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableDebounceTimed(this, j, timeUnit, scheduler));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> delay(long j, TimeUnit timeUnit, boolean z2) {
        return delay(j, timeUnit, Schedulers.computation(), z2);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> delaySubscription(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return delaySubscription(timer(j, timeUnit, scheduler));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> distinctUntilChanged(BiPredicate<? super T, ? super T> biPredicate) {
        Objects.requireNonNull(biPredicate, "comparer is null");
        return RxJavaPlugins.onAssembly(new ObservableDistinctUntilChanged(this, Functions.identity(), biPredicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z2, int i2, int i3) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "maxConcurrency");
        ObjectHelper.verifyPositive(i3, "bufferSize");
        if (this instanceof ScalarSupplier) {
            Object obj = ((ScalarSupplier) this).get();
            if (obj == null) {
                return empty();
            }
            return ObservableScalarXMap.scalarXMap(obj, function);
        }
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(this, function, z2, i2, i3));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K, V> Observable<GroupedObservable<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, boolean z2) {
        return groupBy(function, function2, z2, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i2) {
        Objects.requireNonNull(function, "selector is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replaySupplier(this, i2, false), function);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> retry(long j) {
        return retry(j, Functions.alwaysTrue());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        LambdaObserver lambdaObserver = new LambdaObserver(consumer, consumer2, action, Functions.emptyConsumer());
        subscribe(lambdaObserver);
        return lambdaObserver;
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> throttleLatest(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableThrottleLatest(this, j, timeUnit, scheduler, z2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<Timed<T>> timeInterval(TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableTimeInterval(this, timeUnit, scheduler));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> timeout(long j, TimeUnit timeUnit) {
        return timeout0(j, timeUnit, null, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<Timed<T>> timestamp(TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return (Observable<Timed<T>>) map(Functions.timestampWith(timeUnit, scheduler));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U extends Collection<? super T>> Single<U> toList(Supplier<U> supplier) {
        Objects.requireNonNull(supplier, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableToListSingle(this, supplier));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<List<T>> toSortedList(Comparator<? super T> comparator, int i2) {
        Objects.requireNonNull(comparator, "comparator is null");
        return (Single<List<T>>) toList(i2).map(Functions.listSorter(comparator));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <T1, T2, R> Observable<R> withLatestFrom(ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, Function3<? super T, ? super T1, ? super T2, R> function3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(function3, "combiner is null");
        return withLatestFrom((ObservableSource<?>[]) new ObservableSource[]{observableSource, observableSource2}, Functions.toFunction(function3));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> Observable<R> zipWith(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        Objects.requireNonNull(observableSource, "other is null");
        return zip(this, observableSource, biFunction);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, S> Observable<T> generate(Supplier<S> supplier, BiConsumer<S, Emitter<T>> biConsumer) {
        Objects.requireNonNull(biConsumer, "generator is null");
        return generate(supplier, ObservableInternalHelper.simpleBiGenerator(biConsumer), Functions.emptyConsumer());
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static Observable<Long> interval(long j, TimeUnit timeUnit) {
        return interval(j, j, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final T blockingFirst(T t) {
        Objects.requireNonNull(t, "defaultItem is null");
        BlockingFirstObserver blockingFirstObserver = new BlockingFirstObserver();
        subscribe(blockingFirstObserver);
        T tBlockingGet = blockingFirstObserver.blockingGet();
        return tBlockingGet != null ? tBlockingGet : t;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final T blockingLast(T t) {
        Objects.requireNonNull(t, "defaultItem is null");
        BlockingLastObserver blockingLastObserver = new BlockingLastObserver();
        subscribe(blockingLastObserver);
        T tBlockingGet = blockingLastObserver.blockingGet();
        return tBlockingGet != null ? tBlockingGet : t;
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Observer<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        ObservableBlockingSubscribe.subscribe(this, observer);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> concatWith(MaybeSource<? extends T> maybeSource) {
        Objects.requireNonNull(maybeSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatWithMaybe(this, maybeSource));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> delay(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return delay(j, timeUnit, scheduler, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K, V> Observable<GroupedObservable<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, boolean z2, int i2) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(function2, "valueSelector is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableGroupBy(this, function, function2, i2, z2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> mergeWith(MaybeSource<? extends T> maybeSource) {
        Objects.requireNonNull(maybeSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableMergeWithMaybe(this, maybeSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> retry(long j, Predicate<? super Throwable> predicate) {
        if (j >= 0) {
            Objects.requireNonNull(predicate, "predicate is null");
            return RxJavaPlugins.onAssembly(new ObservableRetryPredicate(this, j, predicate));
        }
        throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.i(j, "times >= 0 required but it was "));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> startWith(MaybeSource<T> maybeSource) {
        Objects.requireNonNull(maybeSource, "other is null");
        return concat(Maybe.wrap(maybeSource).toObservable(), this);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> timeout(long j, TimeUnit timeUnit, ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "fallback is null");
        return timeout0(j, timeUnit, observableSource, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return toMultimap(function, function2, HashMapSupplier.asSupplier(), ArrayListSupplier.asFunction());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2}, Functions.toFunction(biFunction), bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public static Observable<Long> interval(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return interval(j, j, timeUnit, scheduler);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> just(T t, T t2, T t3) {
        Objects.requireNonNull(t, "item1 is null");
        Objects.requireNonNull(t2, "item2 is null");
        Objects.requireNonNull(t3, "item3 is null");
        return fromArray(t, t2, t3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> merge(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i2) {
        Objects.requireNonNull(observableSource, "sources is null");
        ObjectHelper.verifyPositive(i2, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(observableSource, Functions.identity(), false, i2, bufferSize()));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i2) {
        Objects.requireNonNull(observableSource, "sources is null");
        ObjectHelper.verifyPositive(i2, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(observableSource, Functions.identity(), true, i2, bufferSize()));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> delay(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableDelay(this, j, timeUnit, scheduler, z2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> doOnEach(Consumer<? super Notification<T>> consumer) {
        Objects.requireNonNull(consumer, "onNotification is null");
        return doOnEach(Functions.notificationOnNext(consumer), Functions.notificationOnError(consumer), Functions.notificationOnComplete(consumer), Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> sample(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableSampleTimed(this, j, timeUnit, scheduler, z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K, V> Single<Map<K, V>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Supplier<? extends Map<K, V>> supplier) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(function2, "valueSelector is null");
        Objects.requireNonNull(supplier, "mapSupplier is null");
        return (Single<Map<K, V>>) collect(supplier, Functions.toMapKeyValueSelector(function, function2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<List<T>> toSortedList(int i2) {
        return toSortedList(Functions.naturalComparator(), i2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> Observable<R> zipWith(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z2) {
        return zip(this, observableSource, biFunction, z2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> concat(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        return concatArray(observableSource, observableSource2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, S> Observable<T> generate(Supplier<S> supplier, BiConsumer<S, Emitter<T>> biConsumer, Consumer<? super S> consumer) {
        Objects.requireNonNull(biConsumer, "generator is null");
        return generate(supplier, ObservableInternalHelper.simpleBiGenerator(biConsumer), consumer);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U extends Collection<? super T>> Observable<U> buffer(int i2, Supplier<U> supplier) {
        return buffer(i2, i2, supplier);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> concatWith(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatWithCompletable(this, completableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> mergeWith(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableMergeWithCompletable(this, completableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i2, boolean z2) {
        Objects.requireNonNull(function, "selector is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replaySupplier(this, i2, z2), function);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> startWith(ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return concatArray(observableSource, this);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> timeout(long j, TimeUnit timeUnit, Scheduler scheduler, ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "fallback is null");
        return timeout0(j, timeUnit, observableSource, scheduler);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<Observable<T>> window(long j, long j2, TimeUnit timeUnit) {
        return window(j, j2, timeUnit, Schedulers.computation(), bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> Observable<R> zipWith(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z2, int i2) {
        return zip(this, observableSource, biFunction, z2, i2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Single<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, int i2) {
        return sequenceEqual(observableSource, observableSource2, ObjectHelper.equalsPredicate(), i2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        return zipArray(Functions.toFunction(biFunction), false, bufferSize(), observableSource, observableSource2);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<List<T>> buffer(long j, long j2, TimeUnit timeUnit) {
        return (Observable<List<T>>) buffer(j, j2, timeUnit, Schedulers.computation(), ArrayListSupplier.asSupplier());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Supplier<? extends Map<K, Collection<V>>> supplier, Function<? super K, ? extends Collection<? super V>> function3) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(function2, "valueSelector is null");
        Objects.requireNonNull(supplier, "mapSupplier is null");
        Objects.requireNonNull(function3, "collectionFactory is null");
        return (Single<Map<K, Collection<V>>>) collect(supplier, Functions.toMultimapKeyValueSelector(function, function2, function3));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<Observable<T>> window(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return window(j, j2, timeUnit, scheduler, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, S> Observable<T> generate(Supplier<S> supplier, BiFunction<S, Emitter<T>, S> biFunction) {
        return generate(supplier, biFunction, Functions.emptyConsumer());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> merge(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        return fromArray(observableSource, observableSource2).flatMap(Functions.identity(), false, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        return fromArray(observableSource, observableSource2).flatMap(Functions.identity(), true, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<List<T>> buffer(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return (Observable<List<T>>) buffer(j, j2, timeUnit, scheduler, ArrayListSupplier.asSupplier());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final <R> Observable<R> concatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, int i2, Scheduler scheduler) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapScheduler(this, function, i2, ErrorMode.IMMEDIATE, scheduler));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final <R> Observable<R> concatMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z2, int i2, Scheduler scheduler) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapScheduler(this, function, i2, z2 ? ErrorMode.END : ErrorMode.BOUNDARY, scheduler));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, V> Observable<T> delay(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function) {
        return delaySubscription(observableSource).delay(function);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Single<T> elementAt(long j, T t) {
        if (j >= 0) {
            Objects.requireNonNull(t, "defaultItem is null");
            return RxJavaPlugins.onAssembly(new ObservableElementAtSingle(this, j, t));
        }
        throw new IndexOutOfBoundsException(androidx.datastore.preferences.protobuf.a.i(j, "index >= 0 required but it was "));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> Observable<T> sample(ObservableSource<U> observableSource) {
        Objects.requireNonNull(observableSource, "sampler is null");
        return RxJavaPlugins.onAssembly(new ObservableSampleWithObservable(this, observableSource, false));
    }

    @Override // io.reactivex.rxjava3.core.ObservableSource
    @SchedulerSupport("none")
    public final void subscribe(Observer<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        try {
            Observer<? super T> observerOnSubscribe = RxJavaPlugins.onSubscribe(this, observer);
            Objects.requireNonNull(observerOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(observerOnSubscribe);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            RxJavaPlugins.onError(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> take(long j, TimeUnit timeUnit) {
        return takeUntil(timer(j, timeUnit));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> timeout(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return timeout0(j, timeUnit, null, scheduler);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<Observable<T>> window(long j, long j2, TimeUnit timeUnit, Scheduler scheduler, int i2) {
        ObjectHelper.verifyPositive(j, "timespan");
        ObjectHelper.verifyPositive(j2, "timeskip");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        return RxJavaPlugins.onAssembly(new ObservableWindowTimed(this, j, j2, timeUnit, scheduler, Long.MAX_VALUE, i2, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <T1, T2, T3, R> Observable<R> withLatestFrom(ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, ObservableSource<T3> observableSource3, Function4<? super T, ? super T1, ? super T2, ? super T3, R> function4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(function4, "combiner is null");
        return withLatestFrom((ObservableSource<?>[]) new ObservableSource[]{observableSource, observableSource2, observableSource3}, Functions.toFunction(function4));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(function3, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3}, Functions.toFunction(function3), bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> concat(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        return concatArray(observableSource, observableSource2, observableSource3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, S> Observable<T> generate(Supplier<S> supplier, BiFunction<S, Emitter<T>, S> biFunction, Consumer<? super S> consumer) {
        Objects.requireNonNull(supplier, "initialState is null");
        Objects.requireNonNull(biFunction, "generator is null");
        Objects.requireNonNull(consumer, "disposeState is null");
        return RxJavaPlugins.onAssembly(new ObservableGenerate(supplier, biFunction, consumer));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> just(T t, T t2, T t3, T t4) {
        Objects.requireNonNull(t, "item1 is null");
        Objects.requireNonNull(t2, "item2 is null");
        Objects.requireNonNull(t3, "item3 is null");
        Objects.requireNonNull(t4, "item4 is null");
        return fromArray(t, t2, t3, t4);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final <U extends Collection<? super T>> Observable<U> buffer(long j, long j2, TimeUnit timeUnit, Scheduler scheduler, Supplier<U> supplier) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableBufferTimed(this, j, j2, timeUnit, scheduler, supplier, Integer.MAX_VALUE, false));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i2, long j, TimeUnit timeUnit) {
        return replay(function, i2, j, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> skip(long j, TimeUnit timeUnit) {
        return skipUntil(timer(j, timeUnit));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:trampoline")
    public final Observable<T> skipLast(long j, TimeUnit timeUnit) {
        return skipLast(j, timeUnit, Schedulers.trampoline(), false, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> take(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return takeUntil(timer(j, timeUnit, scheduler));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, V> Observable<T> timeout(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function) {
        Objects.requireNonNull(observableSource, "firstTimeoutIndicator is null");
        return timeout0(observableSource, function, null);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> doOnEach(Observer<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        return doOnEach(ObservableInternalHelper.observerOnNext(observer), ObservableInternalHelper.observerOnError(observer), ObservableInternalHelper.observerOnComplete(observer), Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i2, long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(function, "selector is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replaySupplier(this, i2, j, timeUnit, scheduler, false), function);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> Observable<T> sample(ObservableSource<U> observableSource, boolean z2) {
        Objects.requireNonNull(observableSource, "sampler is null");
        return RxJavaPlugins.onAssembly(new ObservableSampleWithObservable(this, observableSource, z2));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> skip(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return skipUntil(timer(j, timeUnit, scheduler));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:trampoline")
    public final Observable<T> skipLast(long j, TimeUnit timeUnit, boolean z2) {
        return skipLast(j, timeUnit, Schedulers.trampoline(), z2, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:trampoline")
    public final Observable<T> takeLast(long j, long j2, TimeUnit timeUnit) {
        return takeLast(j, j2, timeUnit, Schedulers.trampoline(), false, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> merge(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        return fromArray(observableSource, observableSource2, observableSource3).flatMap(Functions.identity(), false, 3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        return fromArray(observableSource, observableSource2, observableSource3).flatMap(Functions.identity(), true, 3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction, boolean z2) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        return zipArray(Functions.toFunction(biFunction), z2, bufferSize(), observableSource, observableSource2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, Function<? super Throwable, ? extends ObservableSource<? extends R>> function2, Supplier<? extends ObservableSource<? extends R>> supplier) {
        Objects.requireNonNull(function, "onNextMapper is null");
        Objects.requireNonNull(function2, "onErrorMapper is null");
        Objects.requireNonNull(supplier, "onCompleteSupplier is null");
        return merge(new ObservableMapNotification(this, function, function2, supplier));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> skipLast(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return skipLast(j, timeUnit, scheduler, false, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> takeLast(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return takeLast(j, j2, timeUnit, scheduler, false, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, V> Observable<T> timeout(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource2) {
        Objects.requireNonNull(observableSource, "firstTimeoutIndicator is null");
        Objects.requireNonNull(observableSource2, "fallback is null");
        return timeout0(observableSource, function, observableSource2);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> skipLast(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        return skipLast(j, timeUnit, scheduler, z2, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> takeLast(long j, long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z2, int i2) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        if (j >= 0) {
            return RxJavaPlugins.onAssembly(new ObservableTakeLastTimed(this, j, j2, timeUnit, scheduler, i2, z2));
        }
        throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.i(j, "count >= 0 required but it was "));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Supplier<Map<K, Collection<V>>> supplier) {
        return toMultimap(function, function2, supplier, ArrayListSupplier.asFunction());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> concat(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3, ObservableSource<? extends T> observableSource4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        return concatArray(observableSource, observableSource2, observableSource3, observableSource4);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<List<T>> buffer(long j, TimeUnit timeUnit) {
        return buffer(j, timeUnit, Schedulers.computation(), Integer.MAX_VALUE);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Observable<T> retry(Predicate<? super Throwable> predicate) {
        return retry(Long.MAX_VALUE, predicate);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> skipLast(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2, int i2) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableSkipLastTimed(this, j, timeUnit, scheduler, i2 << 1, z2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(function4, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4}, Functions.toFunction(function4), bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5) {
        Objects.requireNonNull(t, "item1 is null");
        Objects.requireNonNull(t2, "item2 is null");
        Objects.requireNonNull(t3, "item3 is null");
        Objects.requireNonNull(t4, "item4 is null");
        Objects.requireNonNull(t5, "item5 is null");
        return fromArray(t, t2, t3, t4, t5);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<List<T>> buffer(long j, TimeUnit timeUnit, int i2) {
        return buffer(j, timeUnit, Schedulers.computation(), i2);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit) {
        return window(j, timeUnit, Schedulers.computation(), Long.MAX_VALUE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, R> Observable<R> withLatestFrom(ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, ObservableSource<T3> observableSource3, ObservableSource<T4> observableSource4, Function5<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> function5) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(function5, "combiner is null");
        return withLatestFrom((ObservableSource<?>[]) new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4}, Functions.toFunction(function5));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> merge(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3, ObservableSource<? extends T> observableSource4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        return fromArray(observableSource, observableSource2, observableSource3, observableSource4).flatMap(Functions.identity(), false, 4);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3, ObservableSource<? extends T> observableSource4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        return fromArray(observableSource, observableSource2, observableSource3, observableSource4).flatMap(Functions.identity(), true, 4);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction, boolean z2, int i2) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        return zipArray(Functions.toFunction(biFunction), z2, i2, observableSource, observableSource2);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<List<T>> buffer(long j, TimeUnit timeUnit, Scheduler scheduler, int i2) {
        return (Observable<List<T>>) buffer(j, timeUnit, scheduler, i2, ArrayListSupplier.asSupplier(), false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, Function<Throwable, ? extends ObservableSource<? extends R>> function2, Supplier<? extends ObservableSource<? extends R>> supplier, int i2) {
        Objects.requireNonNull(function, "onNextMapper is null");
        Objects.requireNonNull(function2, "onErrorMapper is null");
        Objects.requireNonNull(supplier, "onCompleteSupplier is null");
        return merge(new ObservableMapNotification(this, function, function2, supplier), i2);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, long j2) {
        return window(j, timeUnit, Schedulers.computation(), j2, false);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final <U extends Collection<? super T>> Observable<U> buffer(long j, TimeUnit timeUnit, Scheduler scheduler, int i2, Supplier<U> supplier, boolean z2) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        ObjectHelper.verifyPositive(i2, "count");
        return RxJavaPlugins.onAssembly(new ObservableBufferTimed(this, j, j, timeUnit, scheduler, supplier, i2, z2));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i2, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        Objects.requireNonNull(function, "selector is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replaySupplier(this, i2, j, timeUnit, scheduler, z2), function);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, long j2, boolean z2) {
        return window(j, timeUnit, Schedulers.computation(), j2, z2);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return window(j, timeUnit, scheduler, Long.MAX_VALUE, false);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, Scheduler scheduler, long j2) {
        return window(j, timeUnit, scheduler, j2, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(function3, "zipper is null");
        return zipArray(Functions.toFunction(function3), false, bufferSize(), observableSource, observableSource2, observableSource3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, int i2) {
        return flatMap((Function) function, false, i2, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, Scheduler scheduler, long j2, boolean z2) {
        return window(j, timeUnit, scheduler, j2, z2, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(function5, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5}, Functions.toFunction(function5), bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6) {
        Objects.requireNonNull(t, "item1 is null");
        Objects.requireNonNull(t2, "item2 is null");
        Objects.requireNonNull(t3, "item3 is null");
        Objects.requireNonNull(t4, "item4 is null");
        Objects.requireNonNull(t5, "item5 is null");
        Objects.requireNonNull(t6, "item6 is null");
        return fromArray(t, t2, t3, t4, t5, t6);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return flatMap(function, biFunction, false, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, Scheduler scheduler, long j2, boolean z2, int i2) {
        ObjectHelper.verifyPositive(i2, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.verifyPositive(j2, "count");
        return RxJavaPlugins.onAssembly(new ObservableWindowTimed(this, j, j, timeUnit, scheduler, j2, i2, z2));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<List<T>> buffer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return (Observable<List<T>>) buffer(j, timeUnit, scheduler, Integer.MAX_VALUE, ArrayListSupplier.asSupplier(), false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z2) {
        return flatMap(function, biFunction, z2, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> withLatestFrom(ObservableSource<?>[] observableSourceArr, Function<? super Object[], R> function) {
        Objects.requireNonNull(observableSourceArr, "others is null");
        Objects.requireNonNull(function, "combiner is null");
        return RxJavaPlugins.onAssembly(new ObservableWithLatestFromMany(this, observableSourceArr, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <TOpening, TClosing> Observable<List<T>> buffer(ObservableSource<? extends TOpening> observableSource, Function<? super TOpening, ? extends ObservableSource<? extends TClosing>> function) {
        return (Observable<List<T>>) buffer(observableSource, function, ArrayListSupplier.asSupplier());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z2, int i2) {
        return flatMap(function, biFunction, z2, i2, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, long j, TimeUnit timeUnit) {
        return replay(function, j, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <TOpening, TClosing, U extends Collection<? super T>> Observable<U> buffer(ObservableSource<? extends TOpening> observableSource, Function<? super TOpening, ? extends ObservableSource<? extends TClosing>> function, Supplier<U> supplier) {
        Objects.requireNonNull(observableSource, "openingIndicator is null");
        Objects.requireNonNull(function, "closingIndicator is null");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableBufferBoundary(this, observableSource, function, supplier));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z2, int i2, int i3) {
        Objects.requireNonNull(function, "mapper is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return flatMap(ObservableInternalHelper.flatMapWithCombiner(function, biFunction), z2, i2, i3);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(function, "selector is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replaySupplier(this, j, timeUnit, scheduler, false), function);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:trampoline")
    public final Observable<T> takeLast(long j, TimeUnit timeUnit) {
        return takeLast(j, timeUnit, Schedulers.trampoline(), false, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(function4, "zipper is null");
        return zipArray(Functions.toFunction(function4), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:trampoline")
    public final Observable<T> takeLast(long j, TimeUnit timeUnit, boolean z2) {
        return takeLast(j, timeUnit, Schedulers.trampoline(), z2, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> Observable<R> withLatestFrom(Iterable<? extends ObservableSource<?>> iterable, Function<? super Object[], R> function) {
        Objects.requireNonNull(iterable, "others is null");
        Objects.requireNonNull(function, "combiner is null");
        return RxJavaPlugins.onAssembly(new ObservableWithLatestFromMany(this, iterable, function));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> takeLast(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return takeLast(j, timeUnit, scheduler, false, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <B> Observable<Observable<T>> window(ObservableSource<B> observableSource) {
        return window(observableSource, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, int i2) {
        return flatMap(function, biFunction, false, i2, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> takeLast(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        return takeLast(j, timeUnit, scheduler, z2, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <B> Observable<Observable<T>> window(ObservableSource<B> observableSource, int i2) {
        Objects.requireNonNull(observableSource, "boundaryIndicator is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableWindowBoundary(this, observableSource, i2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(function6, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6}, Functions.toFunction(function6), bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        Objects.requireNonNull(t, "item1 is null");
        Objects.requireNonNull(t2, "item2 is null");
        Objects.requireNonNull(t3, "item3 is null");
        Objects.requireNonNull(t4, "item4 is null");
        Objects.requireNonNull(t5, "item5 is null");
        Objects.requireNonNull(t6, "item6 is null");
        Objects.requireNonNull(t7, "item7 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <B> Observable<List<T>> buffer(ObservableSource<B> observableSource) {
        return (Observable<List<T>>) buffer(observableSource, ArrayListSupplier.asSupplier());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        Objects.requireNonNull(function, "selector is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replaySupplier(this, j, timeUnit, scheduler, z2), function);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final Observable<T> takeLast(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2, int i2) {
        return takeLast(Long.MAX_VALUE, j, timeUnit, scheduler, z2, i2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <B> Observable<List<T>> buffer(ObservableSource<B> observableSource, int i2) {
        ObjectHelper.verifyPositive(i2, "initialCapacity");
        return (Observable<List<T>>) buffer(observableSource, Functions.createArrayList(i2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, V> Observable<Observable<T>> window(ObservableSource<U> observableSource, Function<? super U, ? extends ObservableSource<V>> function) {
        return window(observableSource, function, bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(function5, "zipper is null");
        return zipArray(Functions.toFunction(function5), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <B, U extends Collection<? super T>> Observable<U> buffer(ObservableSource<B> observableSource, Supplier<U> supplier) {
        Objects.requireNonNull(observableSource, "boundaryIndicator is null");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableBufferExactBoundary(this, observableSource, supplier));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, V> Observable<Observable<T>> window(ObservableSource<U> observableSource, Function<? super U, ? extends ObservableSource<V>> function, int i2) {
        Objects.requireNonNull(observableSource, "openingIndicator is null");
        Objects.requireNonNull(function, "closingIndicator is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableWindowBoundarySelector(this, observableSource, function, i2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final ConnectableObservable<T> replay(int i2) {
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return ObservableReplay.create(this, i2, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final ConnectableObservable<T> replay(int i2, boolean z2) {
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return ObservableReplay.create(this, i2, z2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(function7, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7}, Functions.toFunction(function7), bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        Objects.requireNonNull(t, "item1 is null");
        Objects.requireNonNull(t2, "item2 is null");
        Objects.requireNonNull(t3, "item3 is null");
        Objects.requireNonNull(t4, "item4 is null");
        Objects.requireNonNull(t5, "item5 is null");
        Objects.requireNonNull(t6, "item6 is null");
        Objects.requireNonNull(t7, "item7 is null");
        Objects.requireNonNull(t8, "item8 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final ConnectableObservable<T> replay(int i2, long j, TimeUnit timeUnit) {
        return replay(i2, j, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final ConnectableObservable<T> replay(int i2, long j, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.verifyPositive(i2, "bufferSize");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.create(this, j, timeUnit, scheduler, i2, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(function6, "zipper is null");
        return zipArray(Functions.toFunction(function6), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final ConnectableObservable<T> replay(int i2, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        ObjectHelper.verifyPositive(i2, "bufferSize");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.create(this, j, timeUnit, scheduler, i2, z2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(observableSource8, "source8 is null");
        Objects.requireNonNull(function8, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8}, Functions.toFunction(function8), bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        Objects.requireNonNull(t, "item1 is null");
        Objects.requireNonNull(t2, "item2 is null");
        Objects.requireNonNull(t3, "item3 is null");
        Objects.requireNonNull(t4, "item4 is null");
        Objects.requireNonNull(t5, "item5 is null");
        Objects.requireNonNull(t6, "item6 is null");
        Objects.requireNonNull(t7, "item7 is null");
        Objects.requireNonNull(t8, "item8 is null");
        Objects.requireNonNull(t9, "item9 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final ConnectableObservable<T> replay(long j, TimeUnit timeUnit) {
        return replay(j, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(function7, "zipper is null");
        return zipArray(Functions.toFunction(function7), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final ConnectableObservable<T> replay(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.create(this, j, timeUnit, scheduler, false);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final ConnectableObservable<T> replay(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.create(this, j, timeUnit, scheduler, z2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, ObservableSource<? extends T9> observableSource9, Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(observableSource8, "source8 is null");
        Objects.requireNonNull(observableSource9, "source9 is null");
        Objects.requireNonNull(function9, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8, observableSource9}, Functions.toFunction(function9), bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        Objects.requireNonNull(t, "item1 is null");
        Objects.requireNonNull(t2, "item2 is null");
        Objects.requireNonNull(t3, "item3 is null");
        Objects.requireNonNull(t4, "item4 is null");
        Objects.requireNonNull(t5, "item5 is null");
        Objects.requireNonNull(t6, "item6 is null");
        Objects.requireNonNull(t7, "item7 is null");
        Objects.requireNonNull(t8, "item8 is null");
        Objects.requireNonNull(t9, "item9 is null");
        Objects.requireNonNull(t10, "item10 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(observableSource8, "source8 is null");
        Objects.requireNonNull(function8, "zipper is null");
        return zipArray(Functions.toFunction(function8), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, ObservableSource<? extends T9> observableSource9, Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(observableSource8, "source8 is null");
        Objects.requireNonNull(observableSource9, "source9 is null");
        Objects.requireNonNull(function9, "zipper is null");
        return zipArray(Functions.toFunction(function9), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8, observableSource9);
    }
}
