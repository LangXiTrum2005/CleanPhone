package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.subscribers.DefaultSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class BlockingFlowableMostRecent<T> implements Iterable<T> {
    final T initialValue;
    final Flowable<T> source;

    public static final class MostRecentSubscriber<T> extends DefaultSubscriber<T> {
        volatile Object value;

        public final class Iterator implements java.util.Iterator<T> {
            private Object buf;

            public Iterator() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Object obj = MostRecentSubscriber.this.value;
                this.buf = obj;
                return !NotificationLite.isComplete(obj);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.buf == null) {
                        this.buf = MostRecentSubscriber.this.value;
                    }
                    if (NotificationLite.isComplete(this.buf)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.isError(this.buf)) {
                        throw ExceptionHelper.wrapOrThrow(NotificationLite.getError(this.buf));
                    }
                    T t = (T) NotificationLite.getValue(this.buf);
                    this.buf = null;
                    return t;
                } catch (Throwable th) {
                    this.buf = null;
                    throw th;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public MostRecentSubscriber(T t) {
            this.value = NotificationLite.next(t);
        }

        public MostRecentSubscriber<T>.Iterator getIterable() {
            return new Iterator();
        }

        @Override // io.reactivex.rxjava3.subscribers.DefaultSubscriber, io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            this.value = NotificationLite.complete();
        }

        @Override // io.reactivex.rxjava3.subscribers.DefaultSubscriber, io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.value = NotificationLite.error(th);
        }

        @Override // io.reactivex.rxjava3.subscribers.DefaultSubscriber, io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.value = NotificationLite.next(t);
        }
    }

    public BlockingFlowableMostRecent(Flowable<T> flowable, T t) {
        this.source = flowable;
        this.initialValue = t;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        MostRecentSubscriber mostRecentSubscriber = new MostRecentSubscriber(this.initialValue);
        this.source.subscribe((FlowableSubscriber) mostRecentSubscriber);
        return mostRecentSubscriber.getIterable();
    }
}
