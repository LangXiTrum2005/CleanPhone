package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableInternalHelper {

    public static final class BufferedReplaySupplier<T> implements Supplier<ConnectableObservable<T>> {
        final int bufferSize;
        final boolean eagerTruncate;
        final Observable<T> parent;

        public BufferedReplaySupplier(Observable<T> observable, int i2, boolean z2) {
            this.parent = observable;
            this.bufferSize = i2;
            this.eagerTruncate = z2;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public ConnectableObservable<T> get() {
            return this.parent.replay(this.bufferSize, this.eagerTruncate);
        }
    }

    public static final class BufferedTimedReplaySupplier<T> implements Supplier<ConnectableObservable<T>> {
        final int bufferSize;
        final boolean eagerTruncate;
        final Observable<T> parent;
        final Scheduler scheduler;
        final long time;
        final TimeUnit unit;

        public BufferedTimedReplaySupplier(Observable<T> observable, int i2, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
            this.parent = observable;
            this.bufferSize = i2;
            this.time = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.eagerTruncate = z2;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public ConnectableObservable<T> get() {
            return this.parent.replay(this.bufferSize, this.time, this.unit, this.scheduler, this.eagerTruncate);
        }
    }

    public static final class FlatMapIntoIterable<T, U> implements Function<T, ObservableSource<U>> {
        private final Function<? super T, ? extends Iterable<? extends U>> mapper;

        public FlatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
            this.mapper = function;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public ObservableSource<U> apply(T t) throws Throwable {
            Iterable<? extends U> iterableApply = this.mapper.apply(t);
            Objects.requireNonNull(iterableApply, "The mapper returned a null Iterable");
            return new ObservableFromIterable(iterableApply);
        }
    }

    public static final class FlatMapWithCombinerInner<U, R, T> implements Function<U, R> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;
        private final T t;

        public FlatMapWithCombinerInner(BiFunction<? super T, ? super U, ? extends R> biFunction, T t) {
            this.combiner = biFunction;
            this.t = t;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public R apply(U u2) throws Throwable {
            return this.combiner.apply(this.t, u2);
        }
    }

    public static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, ObservableSource<R>> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;
        private final Function<? super T, ? extends ObservableSource<? extends U>> mapper;

        public FlatMapWithCombinerOuter(BiFunction<? super T, ? super U, ? extends R> biFunction, Function<? super T, ? extends ObservableSource<? extends U>> function) {
            this.combiner = biFunction;
            this.mapper = function;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public ObservableSource<R> apply(T t) throws Throwable {
            ObservableSource<? extends U> observableSourceApply = this.mapper.apply(t);
            Objects.requireNonNull(observableSourceApply, "The mapper returned a null ObservableSource");
            return new ObservableMap(observableSourceApply, new FlatMapWithCombinerInner(this.combiner, t));
        }
    }

    public static final class ItemDelayFunction<T, U> implements Function<T, ObservableSource<T>> {
        final Function<? super T, ? extends ObservableSource<U>> itemDelay;

        public ItemDelayFunction(Function<? super T, ? extends ObservableSource<U>> function) {
            this.itemDelay = function;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public ObservableSource<T> apply(T t) throws Throwable {
            ObservableSource<U> observableSourceApply = this.itemDelay.apply(t);
            Objects.requireNonNull(observableSourceApply, "The itemDelay returned a null ObservableSource");
            return new ObservableTake(observableSourceApply, 1L).map(Functions.justFunction(t)).defaultIfEmpty(t);
        }
    }

    public enum MapToInt implements Function<Object, Object> {
        INSTANCE;

        @Override // io.reactivex.rxjava3.functions.Function
        public Object apply(Object obj) {
            return 0;
        }
    }

    public static final class ObserverOnComplete<T> implements Action {
        final Observer<T> observer;

        public ObserverOnComplete(Observer<T> observer) {
            this.observer = observer;
        }

        @Override // io.reactivex.rxjava3.functions.Action
        public void run() {
            this.observer.onComplete();
        }
    }

    public static final class ObserverOnError<T> implements Consumer<Throwable> {
        final Observer<T> observer;

        public ObserverOnError(Observer<T> observer) {
            this.observer = observer;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(Throwable th) {
            this.observer.onError(th);
        }
    }

    public static final class ObserverOnNext<T> implements Consumer<T> {
        final Observer<T> observer;

        public ObserverOnNext(Observer<T> observer) {
            this.observer = observer;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(T t) {
            this.observer.onNext(t);
        }
    }

    public static final class ReplaySupplier<T> implements Supplier<ConnectableObservable<T>> {
        private final Observable<T> parent;

        public ReplaySupplier(Observable<T> observable) {
            this.parent = observable;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public ConnectableObservable<T> get() {
            return this.parent.replay();
        }
    }

    public static final class SimpleBiGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        final BiConsumer<S, Emitter<T>> consumer;

        public SimpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
            this.consumer = biConsumer;
        }

        @Override // io.reactivex.rxjava3.functions.BiFunction
        public S apply(S s, Emitter<T> emitter) throws Throwable {
            this.consumer.accept(s, emitter);
            return s;
        }
    }

    public static final class SimpleGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        final Consumer<Emitter<T>> consumer;

        public SimpleGenerator(Consumer<Emitter<T>> consumer) {
            this.consumer = consumer;
        }

        @Override // io.reactivex.rxjava3.functions.BiFunction
        public S apply(S s, Emitter<T> emitter) throws Throwable {
            this.consumer.accept(emitter);
            return s;
        }
    }

    public static final class TimedReplayCallable<T> implements Supplier<ConnectableObservable<T>> {
        final boolean eagerTruncate;
        final Observable<T> parent;
        final Scheduler scheduler;
        final long time;
        final TimeUnit unit;

        public TimedReplayCallable(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
            this.parent = observable;
            this.time = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.eagerTruncate = z2;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public ConnectableObservable<T> get() {
            return this.parent.replay(this.time, this.unit, this.scheduler, this.eagerTruncate);
        }
    }

    private ObservableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Function<T, ObservableSource<U>> flatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return new FlatMapIntoIterable(function);
    }

    public static <T, U, R> Function<T, ObservableSource<R>> flatMapWithCombiner(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new FlatMapWithCombinerOuter(biFunction, function);
    }

    public static <T, U> Function<T, ObservableSource<T>> itemDelay(Function<? super T, ? extends ObservableSource<U>> function) {
        return new ItemDelayFunction(function);
    }

    public static <T> Action observerOnComplete(Observer<T> observer) {
        return new ObserverOnComplete(observer);
    }

    public static <T> Consumer<Throwable> observerOnError(Observer<T> observer) {
        return new ObserverOnError(observer);
    }

    public static <T> Consumer<T> observerOnNext(Observer<T> observer) {
        return new ObserverOnNext(observer);
    }

    public static <T> Supplier<ConnectableObservable<T>> replaySupplier(Observable<T> observable) {
        return new ReplaySupplier(observable);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
        return new SimpleBiGenerator(biConsumer);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new SimpleGenerator(consumer);
    }

    public static <T> Supplier<ConnectableObservable<T>> replaySupplier(Observable<T> observable, int i2, boolean z2) {
        return new BufferedReplaySupplier(observable, i2, z2);
    }

    public static <T> Supplier<ConnectableObservable<T>> replaySupplier(Observable<T> observable, int i2, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        return new BufferedTimedReplaySupplier(observable, i2, j, timeUnit, scheduler, z2);
    }

    public static <T> Supplier<ConnectableObservable<T>> replaySupplier(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        return new TimedReplayCallable(observable, j, timeUnit, scheduler, z2);
    }
}
