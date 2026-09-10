package cosurveillance;

import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: DelegatingScheduledFuture.java */
/* JADX INFO: loaded from: classes3.dex */
public class arytenoidectomy<V> extends AbstractResolvableFuture<V> implements ScheduledFuture<V> {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final ScheduledFuture<?> f24054adultoid;

    /* JADX INFO: compiled from: DelegatingScheduledFuture.java */
    public class attabal implements saneness<V> {
        public attabal() {
        }

        @Override // cosurveillance.arytenoidectomy.saneness
        public void attabal(Throwable th) {
            arytenoidectomy.this.adultoid(th);
        }

        @Override // cosurveillance.arytenoidectomy.saneness
        public void set(V v) {
            arytenoidectomy.this.graveside(v);
        }
    }

    /* JADX INFO: compiled from: DelegatingScheduledFuture.java */
    public interface dern<T> {
        ScheduledFuture<?> attabal(saneness<T> sanenessVar);
    }

    /* JADX INFO: compiled from: DelegatingScheduledFuture.java */
    public interface saneness<T> {
        void attabal(Throwable th);

        void set(T t);
    }

    public arytenoidectomy(dern<V> dernVar) {
        this.f24054adultoid = dernVar.attabal(new attabal());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: cord, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f24054adultoid.compareTo(delayed);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public void dern() {
        this.f24054adultoid.cancel(gintrap());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f24054adultoid.getDelay(timeUnit);
    }
}
