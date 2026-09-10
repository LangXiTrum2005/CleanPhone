package io.reactivex.rxjava3.observers;

import android.support.v4.media.a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.VolatileSizeArrayList;
import io.reactivex.rxjava3.observers.BaseTestConsumer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseTestConsumer<T, U extends BaseTestConsumer<T, U>> {
    protected boolean checkSubscriptionOnce;
    protected long completions;
    protected Thread lastThread;
    protected CharSequence tag;
    protected boolean timeout;
    protected final List<T> values = new VolatileSizeArrayList();
    protected final List<Throwable> errors = new VolatileSizeArrayList();
    protected final CountDownLatch done = new CountDownLatch(1);

    public static String valueAndClass(Object obj) {
        if (obj == null) {
            return AbstractJsonLexerKt.NULL;
        }
        return obj + " (class: " + obj.getClass().getSimpleName() + ")";
    }

    public final U assertComplete() {
        long j = this.completions;
        if (j == 0) {
            throw fail("Not completed");
        }
        if (j <= 1) {
            return this;
        }
        throw fail("Multiple completions: " + j);
    }

    public final U assertEmpty() {
        return (U) assertSubscribed().assertNoValues().assertNoErrors().assertNotComplete();
    }

    public final U assertError(Throwable th) {
        return (U) assertError(Functions.equalsWith(th));
    }

    @SafeVarargs
    public final U assertFailure(Class<? extends Throwable> cls, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(cls).assertNotComplete();
    }

    public final U assertNoErrors() {
        if (this.errors.size() == 0) {
            return this;
        }
        throw fail("Error(s) present: " + this.errors);
    }

    public final U assertNoValues() {
        return (U) assertValueCount(0);
    }

    public final U assertNotComplete() {
        long j = this.completions;
        if (j == 1) {
            throw fail("Completed!");
        }
        if (j <= 1) {
            return this;
        }
        throw fail("Multiple completions: " + j);
    }

    @SafeVarargs
    public final U assertResult(T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertNoErrors().assertComplete();
    }

    public abstract U assertSubscribed();

    public final U assertValue(T t) {
        if (this.values.size() != 1) {
            throw fail("expected: " + valueAndClass(t) + " but was: " + this.values);
        }
        T t2 = this.values.get(0);
        if (Objects.equals(t, t2)) {
            return this;
        }
        throw fail("expected: " + valueAndClass(t) + " but was: " + valueAndClass(t2));
    }

    public final U assertValueAt(int i2, T t) {
        int size = this.values.size();
        if (size == 0) {
            throw fail("No values");
        }
        if (i2 >= size) {
            throw fail("Invalid index: " + i2);
        }
        T t2 = this.values.get(i2);
        if (Objects.equals(t, t2)) {
            return this;
        }
        throw fail("expected: " + valueAndClass(t) + " but was: " + valueAndClass(t2));
    }

    public final U assertValueCount(int i2) {
        int size = this.values.size();
        if (size == i2) {
            return this;
        }
        throw fail("Value counts differ; expected: " + i2 + " but was: " + size);
    }

    public final U assertValueSequence(Iterable<? extends T> iterable) {
        boolean zHasNext;
        boolean zHasNext2;
        Iterator<T> it = this.values.iterator();
        Iterator<? extends T> it2 = iterable.iterator();
        int i2 = 0;
        while (true) {
            zHasNext = it2.hasNext();
            zHasNext2 = it.hasNext();
            if (!zHasNext2 || !zHasNext) {
                break;
            }
            T next = it2.next();
            T next2 = it.next();
            if (!Objects.equals(next, next2)) {
                StringBuilder sbU = a.u(i2, "Values at position ", " differ; expected: ");
                sbU.append(valueAndClass(next));
                sbU.append(" but was: ");
                sbU.append(valueAndClass(next2));
                throw fail(sbU.toString());
            }
            i2++;
        }
        if (zHasNext2) {
            throw fail("More values received than expected (" + i2 + ")");
        }
        if (!zHasNext) {
            return this;
        }
        throw fail("Fewer values received than expected (" + i2 + ")");
    }

    @SafeVarargs
    public final U assertValues(T... tArr) {
        int size = this.values.size();
        if (size != tArr.length) {
            throw fail("Value count differs; expected: " + tArr.length + " " + Arrays.toString(tArr) + " but was: " + size + " " + this.values);
        }
        for (int i2 = 0; i2 < size; i2++) {
            T t = this.values.get(i2);
            T t2 = tArr[i2];
            if (!Objects.equals(t2, t)) {
                StringBuilder sbU = a.u(i2, "Values at position ", " differ; expected: ");
                sbU.append(valueAndClass(t2));
                sbU.append(" but was: ");
                sbU.append(valueAndClass(t));
                throw fail(sbU.toString());
            }
        }
        return this;
    }

    @SafeVarargs
    public final U assertValuesOnly(T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertNoErrors().assertNotComplete();
    }

    public final U await() throws InterruptedException {
        if (this.done.getCount() == 0) {
            return this;
        }
        this.done.await();
        return this;
    }

    public final U awaitCount(int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (System.currentTimeMillis() - jCurrentTimeMillis < 5000) {
            if (this.done.getCount() == 0 || this.values.size() >= i2) {
                return this;
            }
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e2) {
                throw new RuntimeException(e2);
            }
        }
        this.timeout = true;
        return this;
    }

    public final U awaitDone(long j, TimeUnit timeUnit) {
        try {
            if (this.done.await(j, timeUnit)) {
                return this;
            }
            this.timeout = true;
            dispose();
            return this;
        } catch (InterruptedException e2) {
            dispose();
            throw ExceptionHelper.wrapOrThrow(e2);
        }
    }

    public abstract void dispose();

    public final AssertionError fail(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 64);
        sb.append(str);
        sb.append(" (latch = ");
        sb.append(this.done.getCount());
        sb.append(", values = ");
        sb.append(this.values.size());
        sb.append(", errors = ");
        sb.append(this.errors.size());
        sb.append(", completions = ");
        sb.append(this.completions);
        if (this.timeout) {
            sb.append(", timeout!");
        }
        if (isDisposed()) {
            sb.append(", disposed!");
        }
        CharSequence charSequence = this.tag;
        if (charSequence != null) {
            sb.append(", tag = ");
            sb.append(charSequence);
        }
        sb.append(')');
        AssertionError assertionError = new AssertionError(sb.toString());
        if (!this.errors.isEmpty()) {
            if (this.errors.size() == 1) {
                assertionError.initCause(this.errors.get(0));
                return assertionError;
            }
            assertionError.initCause(new CompositeException(this.errors));
        }
        return assertionError;
    }

    public abstract boolean isDisposed();

    public final List<T> values() {
        return this.values;
    }

    public final U withTag(CharSequence charSequence) {
        this.tag = charSequence;
        return this;
    }

    public final U assertError(Class<? extends Throwable> cls) {
        return (U) assertError(Functions.isInstanceOf(cls));
    }

    public final U assertError(Predicate<Throwable> predicate) {
        int size = this.errors.size();
        if (size != 0) {
            Iterator<Throwable> it = this.errors.iterator();
            while (it.hasNext()) {
                try {
                    if (predicate.test(it.next())) {
                        if (size == 1) {
                            return this;
                        }
                        throw fail("Error present but other errors as well");
                    }
                } catch (Throwable th) {
                    throw ExceptionHelper.wrapOrThrow(th);
                }
            }
            throw fail("Error not present");
        }
        throw fail("No errors");
    }

    public final boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean z2 = this.done.getCount() == 0 || this.done.await(j, timeUnit);
        this.timeout = !z2;
        return z2;
    }

    public final U assertValue(Predicate<T> predicate) {
        assertValueAt(0, (Predicate) predicate);
        if (this.values.size() <= 1) {
            return this;
        }
        throw fail("Value present but other values as well");
    }

    public final U assertValueAt(int i2, Predicate<T> predicate) {
        if (this.values.size() != 0) {
            if (i2 < this.values.size()) {
                try {
                    if (predicate.test(this.values.get(i2))) {
                        return this;
                    }
                    throw fail("Value not present");
                } catch (Throwable th) {
                    throw ExceptionHelper.wrapOrThrow(th);
                }
            }
            throw fail("Invalid index: " + i2);
        }
        throw fail("No values");
    }
}
