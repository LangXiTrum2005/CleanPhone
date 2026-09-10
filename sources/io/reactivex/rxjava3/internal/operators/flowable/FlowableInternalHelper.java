package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableInternalHelper {

    public static final class BufferedReplaySupplier<T> implements Supplier<ConnectableFlowable<T>> {
        final int bufferSize;
        final boolean eagerTruncate;
        final Flowable<T> parent;

        public BufferedReplaySupplier(Flowable<T> flowable, int i2, boolean z2) {
            this.parent = flowable;
            this.bufferSize = i2;
            this.eagerTruncate = z2;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public ConnectableFlowable<T> get() {
            return this.parent.replay(this.bufferSize, this.eagerTruncate);
        }
    }

    public static final class BufferedTimedReplay<T> implements Supplier<ConnectableFlowable<T>> {
        final int bufferSize;
        final boolean eagerTruncate;
        final Flowable<T> parent;
        final Scheduler scheduler;
        final long time;
        final TimeUnit unit;

        public BufferedTimedReplay(Flowable<T> flowable, int i2, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
            this.parent = flowable;
            this.bufferSize = i2;
            this.time = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.eagerTruncate = z2;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public ConnectableFlowable<T> get() {
            return this.parent.replay(this.bufferSize, this.time, this.unit, this.scheduler, this.eagerTruncate);
        }
    }

    public static final class FlatMapIntoIterable<T, U> implements Function<T, Publisher<U>> {
        private final Function<? super T, ? extends Iterable<? extends U>> mapper;

        public FlatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
            this.mapper = function;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public Publisher<U> apply(T t) throws Throwable {
            Iterable<? extends U> iterableApply = this.mapper.apply(t);
            Objects.requireNonNull(iterableApply, "The mapper returned a null Iterable");
            return new FlowableFromIterable(iterableApply);
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

    public static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, Publisher<R>> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;
        private final Function<? super T, ? extends Publisher<? extends U>> mapper;

        public FlatMapWithCombinerOuter(BiFunction<? super T, ? super U, ? extends R> biFunction, Function<? super T, ? extends Publisher<? extends U>> function) {
            this.combiner = biFunction;
            this.mapper = function;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public Publisher<R> apply(T t) throws Throwable {
            Publisher<? extends U> publisherApply = this.mapper.apply(t);
            Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
            return new FlowableMapPublisher(publisherApply, new FlatMapWithCombinerInner(this.combiner, t));
        }
    }

    public static final class ItemDelayFunction<T, U> implements Function<T, Publisher<T>> {
        final Function<? super T, ? extends Publisher<U>> itemDelay;

        public ItemDelayFunction(Function<? super T, ? extends Publisher<U>> function) {
            this.itemDelay = function;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public Publisher<T> apply(T t) throws Throwable {
            Publisher<U> publisherApply = this.itemDelay.apply(t);
            Objects.requireNonNull(publisherApply, "The itemDelay returned a null Publisher");
            return new FlowableTakePublisher(publisherApply, 1L).map(Functions.justFunction(t)).defaultIfEmpty(t);
        }
    }

    public static final class ReplaySupplier<T> implements Supplier<ConnectableFlowable<T>> {
        final Flowable<T> parent;

        public ReplaySupplier(Flowable<T> flowable) {
            this.parent = flowable;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public ConnectableFlowable<T> get() {
            return this.parent.replay();
        }
    }

    public enum RequestMax implements Consumer<Subscription> {
        INSTANCE;

        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(Subscription subscription) {
            subscription.request(Long.MAX_VALUE);
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

    public static final class SubscriberOnComplete<T> implements Action {
        final Subscriber<T> subscriber;

        public SubscriberOnComplete(Subscriber<T> subscriber) {
            this.subscriber = subscriber;
        }

        @Override // io.reactivex.rxjava3.functions.Action
        public void run() {
            this.subscriber.onComplete();
        }
    }

    public static final class SubscriberOnError<T> implements Consumer<Throwable> {
        final Subscriber<T> subscriber;

        public SubscriberOnError(Subscriber<T> subscriber) {
            this.subscriber = subscriber;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(Throwable th) {
            this.subscriber.onError(th);
        }
    }

    public static final class SubscriberOnNext<T> implements Consumer<T> {
        final Subscriber<T> subscriber;

        public SubscriberOnNext(Subscriber<T> subscriber) {
            this.subscriber = subscriber;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(T t) {
            this.subscriber.onNext(t);
        }
    }

    public static final class TimedReplay<T> implements Supplier<ConnectableFlowable<T>> {
        final boolean eagerTruncate;
        private final Flowable<T> parent;
        private final Scheduler scheduler;
        private final long time;
        private final TimeUnit unit;

        public TimedReplay(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
            this.parent = flowable;
            this.time = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.eagerTruncate = z2;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public ConnectableFlowable<T> get() {
            return this.parent.replay(this.time, this.unit, this.scheduler, this.eagerTruncate);
        }
    }

    private FlowableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Function<T, Publisher<U>> flatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return new FlatMapIntoIterable(function);
    }

    public static <T, U, R> Function<T, Publisher<R>> flatMapWithCombiner(Function<? super T, ? extends Publisher<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new FlatMapWithCombinerOuter(biFunction, function);
    }

    public static <T, U> Function<T, Publisher<T>> itemDelay(Function<? super T, ? extends Publisher<U>> function) {
        return new ItemDelayFunction(function);
    }

    public static <T> Supplier<ConnectableFlowable<T>> replaySupplier(Flowable<T> flowable) {
        return new ReplaySupplier(flowable);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
        return new SimpleBiGenerator(biConsumer);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new SimpleGenerator(consumer);
    }

    public static <T> Action subscriberOnComplete(Subscriber<T> subscriber) {
        return new SubscriberOnComplete(subscriber);
    }

    public static <T> Consumer<Throwable> subscriberOnError(Subscriber<T> subscriber) {
        return new SubscriberOnError(subscriber);
    }

    public static <T> Consumer<T> subscriberOnNext(Subscriber<T> subscriber) {
        return new SubscriberOnNext(subscriber);
    }

    public static <T> Supplier<ConnectableFlowable<T>> replaySupplier(Flowable<T> flowable, int i2, boolean z2) {
        return new BufferedReplaySupplier(flowable, i2, z2);
    }

    public static <T> Supplier<ConnectableFlowable<T>> replaySupplier(Flowable<T> flowable, int i2, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        return new BufferedTimedReplay(flowable, i2, j, timeUnit, scheduler, z2);
    }

    public static <T> Supplier<ConnectableFlowable<T>> replaySupplier(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        return new TimedReplay(flowable, j, timeUnit, scheduler, z2);
    }
}
