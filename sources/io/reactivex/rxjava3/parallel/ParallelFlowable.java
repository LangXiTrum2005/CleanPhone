package io.reactivex.rxjava3.parallel;

import android.support.v4.media.a;
import io.reactivex.rxjava3.annotations.BackpressureKind;
import io.reactivex.rxjava3.annotations.BackpressureSupport;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.LongConsumer;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.jdk8.ParallelCollector;
import io.reactivex.rxjava3.internal.jdk8.ParallelFlatMapStream;
import io.reactivex.rxjava3.internal.jdk8.ParallelMapOptional;
import io.reactivex.rxjava3.internal.jdk8.ParallelMapTryOptional;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelCollect;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelConcatMap;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelDoOnNextTry;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelFilter;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelFilterTry;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelFlatMap;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelFlatMapIterable;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelFromArray;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelFromPublisher;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelJoin;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelMap;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelMapTry;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelPeek;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelReduce;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelReduceFull;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelRunOn;
import io.reactivex.rxjava3.internal.operators.parallel.ParallelSortedJoin;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.internal.util.ListAddBiConsumer;
import io.reactivex.rxjava3.internal.util.MergerBiFunction;
import io.reactivex.rxjava3.internal.util.SorterFunction;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Stream;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ParallelFlowable<T> {
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> ParallelFlowable<T> from(Publisher<? extends T> publisher) {
        return from(publisher, Runtime.getRuntime().availableProcessors(), Flowable.bufferSize());
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> ParallelFlowable<T> fromArray(Publisher<T>... publisherArr) {
        Objects.requireNonNull(publisherArr, "publishers is null");
        if (publisherArr.length != 0) {
            return RxJavaPlugins.onAssembly(new ParallelFromArray(publisherArr));
        }
        throw new IllegalArgumentException("Zero publishers not supported");
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <C> ParallelFlowable<C> collect(Supplier<? extends C> supplier, BiConsumer<? super C, ? super T> biConsumer) {
        Objects.requireNonNull(supplier, "collectionSupplier is null");
        Objects.requireNonNull(biConsumer, "collector is null");
        return RxJavaPlugins.onAssembly(new ParallelCollect(this, supplier, biConsumer));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> ParallelFlowable<U> compose(ParallelTransformer<T, U> parallelTransformer) {
        Objects.requireNonNull(parallelTransformer, "composer is null");
        return RxJavaPlugins.onAssembly(parallelTransformer.apply(this));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> ParallelFlowable<R> concatMap(Function<? super T, ? extends Publisher<? extends R>> function) {
        return concatMap(function, 2);
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> ParallelFlowable<R> concatMapDelayError(Function<? super T, ? extends Publisher<? extends R>> function, boolean z2) {
        return concatMapDelayError(function, 2, z2);
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ParallelFlowable<T> doAfterNext(Consumer<? super T> consumer) {
        Objects.requireNonNull(consumer, "onAfterNext is null");
        Consumer consumerEmptyConsumer = Functions.emptyConsumer();
        Consumer consumerEmptyConsumer2 = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return RxJavaPlugins.onAssembly(new ParallelPeek(this, consumerEmptyConsumer, consumer, consumerEmptyConsumer2, action, action, Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, action));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ParallelFlowable<T> doAfterTerminated(Action action) {
        Objects.requireNonNull(action, "onAfterTerminate is null");
        Consumer consumerEmptyConsumer = Functions.emptyConsumer();
        Consumer consumerEmptyConsumer2 = Functions.emptyConsumer();
        Consumer consumerEmptyConsumer3 = Functions.emptyConsumer();
        Action action2 = Functions.EMPTY_ACTION;
        return RxJavaPlugins.onAssembly(new ParallelPeek(this, consumerEmptyConsumer, consumerEmptyConsumer2, consumerEmptyConsumer3, action2, action, Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, action2));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ParallelFlowable<T> doOnCancel(Action action) {
        Objects.requireNonNull(action, "onCancel is null");
        Consumer consumerEmptyConsumer = Functions.emptyConsumer();
        Consumer consumerEmptyConsumer2 = Functions.emptyConsumer();
        Consumer consumerEmptyConsumer3 = Functions.emptyConsumer();
        Action action2 = Functions.EMPTY_ACTION;
        return RxJavaPlugins.onAssembly(new ParallelPeek(this, consumerEmptyConsumer, consumerEmptyConsumer2, consumerEmptyConsumer3, action2, action2, Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, action));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ParallelFlowable<T> doOnComplete(Action action) {
        Objects.requireNonNull(action, "onComplete is null");
        Consumer consumerEmptyConsumer = Functions.emptyConsumer();
        Consumer consumerEmptyConsumer2 = Functions.emptyConsumer();
        Consumer consumerEmptyConsumer3 = Functions.emptyConsumer();
        Action action2 = Functions.EMPTY_ACTION;
        return RxJavaPlugins.onAssembly(new ParallelPeek(this, consumerEmptyConsumer, consumerEmptyConsumer2, consumerEmptyConsumer3, action, action2, Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, action2));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ParallelFlowable<T> doOnError(Consumer<? super Throwable> consumer) {
        Objects.requireNonNull(consumer, "onError is null");
        Consumer consumerEmptyConsumer = Functions.emptyConsumer();
        Consumer consumerEmptyConsumer2 = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return RxJavaPlugins.onAssembly(new ParallelPeek(this, consumerEmptyConsumer, consumerEmptyConsumer2, consumer, action, action, Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, action));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ParallelFlowable<T> doOnNext(Consumer<? super T> consumer) {
        Objects.requireNonNull(consumer, "onNext is null");
        Consumer consumerEmptyConsumer = Functions.emptyConsumer();
        Consumer consumerEmptyConsumer2 = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return RxJavaPlugins.onAssembly(new ParallelPeek(this, consumer, consumerEmptyConsumer, consumerEmptyConsumer2, action, action, Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, action));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ParallelFlowable<T> doOnRequest(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer, "onRequest is null");
        Consumer consumerEmptyConsumer = Functions.emptyConsumer();
        Consumer consumerEmptyConsumer2 = Functions.emptyConsumer();
        Consumer consumerEmptyConsumer3 = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return RxJavaPlugins.onAssembly(new ParallelPeek(this, consumerEmptyConsumer, consumerEmptyConsumer2, consumerEmptyConsumer3, action, action, Functions.emptyConsumer(), longConsumer, action));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ParallelFlowable<T> doOnSubscribe(Consumer<? super Subscription> consumer) {
        Objects.requireNonNull(consumer, "onSubscribe is null");
        Consumer consumerEmptyConsumer = Functions.emptyConsumer();
        Consumer consumerEmptyConsumer2 = Functions.emptyConsumer();
        Consumer consumerEmptyConsumer3 = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return RxJavaPlugins.onAssembly(new ParallelPeek(this, consumerEmptyConsumer, consumerEmptyConsumer2, consumerEmptyConsumer3, action, action, consumer, Functions.EMPTY_LONG_CONSUMER, action));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ParallelFlowable<T> filter(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ParallelFilter(this, predicate));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> ParallelFlowable<R> flatMap(Function<? super T, ? extends Publisher<? extends R>> function) {
        return flatMap(function, false, Flowable.bufferSize(), Flowable.bufferSize());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> ParallelFlowable<U> flatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return flatMapIterable(function, Flowable.bufferSize());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> ParallelFlowable<R> flatMapStream(Function<? super T, ? extends Stream<? extends R>> function) {
        return flatMapStream(function, Flowable.bufferSize());
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> ParallelFlowable<R> map(Function<? super T, ? extends R> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ParallelMap(this, function));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> ParallelFlowable<R> mapOptional(Function<? super T, Optional<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ParallelMapOptional(this, function));
    }

    @CheckReturnValue
    public abstract int parallelism();

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable<T> reduce(BiFunction<T, T, T> biFunction) {
        Objects.requireNonNull(biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new ParallelReduceFull(this, biFunction));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final ParallelFlowable<T> runOn(Scheduler scheduler) {
        return runOn(scheduler, Flowable.bufferSize());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable<T> sequential() {
        return sequential(Flowable.bufferSize());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable<T> sequentialDelayError() {
        return sequentialDelayError(Flowable.bufferSize());
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable<T> sorted(Comparator<? super T> comparator) {
        return sorted(comparator, 16);
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public abstract void subscribe(Subscriber<? super T>[] subscriberArr);

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> R to(ParallelFlowableConverter<T, R> parallelFlowableConverter) {
        Objects.requireNonNull(parallelFlowableConverter, "converter is null");
        return parallelFlowableConverter.apply(this);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable<List<T>> toSortedList(Comparator<? super T> comparator) {
        return toSortedList(comparator, 16);
    }

    public final boolean validate(Subscriber<?>[] subscriberArr) {
        Objects.requireNonNull(subscriberArr, "subscribers is null");
        int iParallelism = parallelism();
        if (subscriberArr.length == iParallelism) {
            return true;
        }
        StringBuilder sbU = a.u(iParallelism, "parallelism = ", ", subscribers = ");
        sbU.append(subscriberArr.length);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sbU.toString());
        for (Subscriber<?> subscriber : subscriberArr) {
            EmptySubscription.error(illegalArgumentException, subscriber);
        }
        return false;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> ParallelFlowable<T> from(Publisher<? extends T> publisher, int i2) {
        return from(publisher, i2, Flowable.bufferSize());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> ParallelFlowable<R> concatMap(Function<? super T, ? extends Publisher<? extends R>> function, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "prefetch");
        return RxJavaPlugins.onAssembly(new ParallelConcatMap(this, function, i2, ErrorMode.IMMEDIATE));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> ParallelFlowable<R> concatMapDelayError(Function<? super T, ? extends Publisher<? extends R>> function, int i2, boolean z2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "prefetch");
        return RxJavaPlugins.onAssembly(new ParallelConcatMap(this, function, i2, z2 ? ErrorMode.END : ErrorMode.BOUNDARY));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> ParallelFlowable<R> flatMap(Function<? super T, ? extends Publisher<? extends R>> function, boolean z2) {
        return flatMap(function, z2, Flowable.bufferSize(), Flowable.bufferSize());
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> ParallelFlowable<U> flatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        return RxJavaPlugins.onAssembly(new ParallelFlatMapIterable(this, function, i2));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> ParallelFlowable<R> flatMapStream(Function<? super T, ? extends Stream<? extends R>> function, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "prefetch");
        return RxJavaPlugins.onAssembly(new ParallelFlatMapStream(this, function, i2));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("custom")
    public final ParallelFlowable<T> runOn(Scheduler scheduler, int i2) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i2, "prefetch");
        return RxJavaPlugins.onAssembly(new ParallelRunOn(this, scheduler, i2));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable<T> sequential(int i2) {
        ObjectHelper.verifyPositive(i2, "prefetch");
        return RxJavaPlugins.onAssembly(new ParallelJoin(this, i2, false));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable<T> sequentialDelayError(int i2) {
        ObjectHelper.verifyPositive(i2, "prefetch");
        return RxJavaPlugins.onAssembly(new ParallelJoin(this, i2, true));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable<T> sorted(Comparator<? super T> comparator, int i2) {
        Objects.requireNonNull(comparator, "comparator is null");
        ObjectHelper.verifyPositive(i2, "capacityHint");
        return RxJavaPlugins.onAssembly(new ParallelSortedJoin(reduce(Functions.createArrayList((i2 / parallelism()) + 1), ListAddBiConsumer.instance()).map(new SorterFunction(comparator)), comparator));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final Flowable<List<T>> toSortedList(Comparator<? super T> comparator, int i2) {
        Objects.requireNonNull(comparator, "comparator is null");
        ObjectHelper.verifyPositive(i2, "capacityHint");
        return RxJavaPlugins.onAssembly(reduce(Functions.createArrayList((i2 / parallelism()) + 1), ListAddBiConsumer.instance()).map(new SorterFunction(comparator)).reduce(new MergerBiFunction(comparator)));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> ParallelFlowable<T> from(Publisher<? extends T> publisher, int i2, int i3) {
        Objects.requireNonNull(publisher, "source is null");
        ObjectHelper.verifyPositive(i2, "parallelism");
        ObjectHelper.verifyPositive(i3, "prefetch");
        return RxJavaPlugins.onAssembly(new ParallelFromPublisher(publisher, i2, i3));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ParallelFlowable<T> filter(Predicate<? super T> predicate, ParallelFailureHandling parallelFailureHandling) {
        Objects.requireNonNull(predicate, "predicate is null");
        Objects.requireNonNull(parallelFailureHandling, "errorHandler is null");
        return RxJavaPlugins.onAssembly(new ParallelFilterTry(this, predicate, parallelFailureHandling));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> ParallelFlowable<R> flatMap(Function<? super T, ? extends Publisher<? extends R>> function, boolean z2, int i2) {
        return flatMap(function, z2, i2, Flowable.bufferSize());
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> ParallelFlowable<R> map(Function<? super T, ? extends R> function, ParallelFailureHandling parallelFailureHandling) {
        Objects.requireNonNull(function, "mapper is null");
        Objects.requireNonNull(parallelFailureHandling, "errorHandler is null");
        return RxJavaPlugins.onAssembly(new ParallelMapTry(this, function, parallelFailureHandling));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> ParallelFlowable<R> mapOptional(Function<? super T, Optional<? extends R>> function, ParallelFailureHandling parallelFailureHandling) {
        Objects.requireNonNull(function, "mapper is null");
        Objects.requireNonNull(parallelFailureHandling, "errorHandler is null");
        return RxJavaPlugins.onAssembly(new ParallelMapTryOptional(this, function, parallelFailureHandling));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> ParallelFlowable<R> reduce(Supplier<R> supplier, BiFunction<R, ? super T, R> biFunction) {
        Objects.requireNonNull(supplier, "initialSupplier is null");
        Objects.requireNonNull(biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new ParallelReduce(this, supplier, biFunction));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <A, R> Flowable<R> collect(Collector<T, A, R> collector) {
        Objects.requireNonNull(collector, "collector is null");
        return RxJavaPlugins.onAssembly(new ParallelCollector(this, collector));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> ParallelFlowable<R> flatMap(Function<? super T, ? extends Publisher<? extends R>> function, boolean z2, int i2, int i3) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i2, "maxConcurrency");
        ObjectHelper.verifyPositive(i3, "prefetch");
        return RxJavaPlugins.onAssembly(new ParallelFlatMap(this, function, z2, i2, i3));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ParallelFlowable<T> filter(Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        Objects.requireNonNull(predicate, "predicate is null");
        Objects.requireNonNull(biFunction, "errorHandler is null");
        return RxJavaPlugins.onAssembly(new ParallelFilterTry(this, predicate, biFunction));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> ParallelFlowable<R> map(Function<? super T, ? extends R> function, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        Objects.requireNonNull(function, "mapper is null");
        Objects.requireNonNull(biFunction, "errorHandler is null");
        return RxJavaPlugins.onAssembly(new ParallelMapTry(this, function, biFunction));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> ParallelFlowable<R> mapOptional(Function<? super T, Optional<? extends R>> function, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        Objects.requireNonNull(function, "mapper is null");
        Objects.requireNonNull(biFunction, "errorHandler is null");
        return RxJavaPlugins.onAssembly(new ParallelMapTryOptional(this, function, biFunction));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ParallelFlowable<T> doOnNext(Consumer<? super T> consumer, ParallelFailureHandling parallelFailureHandling) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(parallelFailureHandling, "errorHandler is null");
        return RxJavaPlugins.onAssembly(new ParallelDoOnNextTry(this, consumer, parallelFailureHandling));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final ParallelFlowable<T> doOnNext(Consumer<? super T> consumer, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(biFunction, "errorHandler is null");
        return RxJavaPlugins.onAssembly(new ParallelDoOnNextTry(this, consumer, biFunction));
    }
}
