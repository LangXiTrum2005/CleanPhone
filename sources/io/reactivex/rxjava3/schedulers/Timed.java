package io.reactivex.rxjava3.schedulers;

import android.support.v4.media.a;
import com.p004ironsource.d9;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class Timed<T> {
    final long time;
    final TimeUnit unit;
    final T value;

    public Timed(T t, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(t, "value is null");
        this.value = t;
        this.time = j;
        Objects.requireNonNull(timeUnit, "unit is null");
        this.unit = timeUnit;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Timed) {
            Timed timed = (Timed) obj;
            if (Objects.equals(this.value, timed.value) && this.time == timed.time && Objects.equals(this.unit, timed.unit)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        long j = this.time;
        return this.unit.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 31)))) * 31);
    }

    public long time() {
        return this.time;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Timed[time=");
        sb.append(this.time);
        sb.append(", unit=");
        sb.append(this.unit);
        sb.append(", value=");
        return a.q(sb, this.value, d9.i.f24752e);
    }

    public TimeUnit unit() {
        return this.unit;
    }

    public T value() {
        return this.value;
    }

    public long time(TimeUnit timeUnit) {
        return timeUnit.convert(this.time, this.unit);
    }
}
