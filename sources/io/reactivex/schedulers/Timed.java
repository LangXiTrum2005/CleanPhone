package io.reactivex.schedulers;

import android.support.v4.media.a;
import com.p004ironsource.d9;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class Timed<T> {
    final long time;
    final TimeUnit unit;
    final T value;

    public Timed(T t, long j, TimeUnit timeUnit) {
        this.value = t;
        this.time = j;
        this.unit = (TimeUnit) ObjectHelper.requireNonNull(timeUnit, "unit is null");
    }

    public boolean equals(Object obj) {
        if (obj instanceof Timed) {
            Timed timed = (Timed) obj;
            if (ObjectHelper.equals(this.value, timed.value) && this.time == timed.time && ObjectHelper.equals(this.unit, timed.unit)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t = this.value;
        int iHashCode = t != null ? t.hashCode() : 0;
        long j = this.time;
        return this.unit.hashCode() + (((iHashCode * 31) + ((int) (j ^ (j >>> 31)))) * 31);
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
