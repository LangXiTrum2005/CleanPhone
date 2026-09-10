package awlwort;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.util.formularize;
import com.ironsource.X3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: RequestFutureTarget.java */
/* JADX INFO: loaded from: classes2.dex */
public class marial<R> implements dern<R>, beachfront<R> {

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public static final attabal f14789preprohormone = new attabal();

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f14790adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final int f14791arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public boolean f14792dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public boolean f14793gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public wireman f14794graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final int f14795kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public R f14796molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final boolean f14797monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final attabal f14798polloi;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public GlideException f14799rotuma;

    /* JADX INFO: compiled from: RequestFutureTarget.java */
    public static class attabal {
        public void attabal(Object obj) {
            obj.notifyAll();
        }

        public void saneness(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }
    }

    public marial(int i, int i2) {
        this(i, i2, true, f14789preprohormone);
    }

    @Override // belongingness.wireman
    public synchronized void apical(Drawable drawable) {
    }

    @Override // belongingness.wireman
    public synchronized void attabal(R r, quadrennium.saneness<? super R> sanenessVar) {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f14790adultoid = true;
                this.f14798polloi.attabal(this);
                wireman wiremanVar = null;
                if (z) {
                    wireman wiremanVar2 = this.f14794graveside;
                    this.f14794graveside = null;
                    wiremanVar = wiremanVar2;
                }
                if (wiremanVar != null) {
                    wiremanVar.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // awlwort.beachfront
    public synchronized boolean competently(GlideException glideException, Object obj, belongingness.wireman<R> wiremanVar, boolean z) {
        this.f14793gintrap = true;
        this.f14799rotuma = glideException;
        this.f14798polloi.attabal(this);
        return false;
    }

    @Override // belongingness.wireman
    public synchronized void cutely(wireman wiremanVar) {
        this.f14794graveside = wiremanVar;
    }

    @Override // awlwort.beachfront
    public synchronized boolean dern(R r, Object obj, belongingness.wireman<R> wiremanVar, DataSource dataSource, boolean z) {
        this.f14792dovishness = true;
        this.f14796molybdenite = r;
        this.f14798polloi.attabal(this);
        return false;
    }

    public final synchronized R formularize(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            if (this.f14797monoploid && !isDone()) {
                formularize.attabal();
            }
            if (this.f14790adultoid) {
                throw new CancellationException();
            }
            if (this.f14793gintrap) {
                throw new ExecutionException(this.f14799rotuma);
            }
            if (this.f14792dovishness) {
                return this.f14796molybdenite;
            }
            if (l == null) {
                this.f14798polloi.saneness(this, 0L);
            } else if (l.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    this.f14798polloi.saneness(this, jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f14793gintrap) {
                throw new ExecutionException(this.f14799rotuma);
            }
            if (this.f14790adultoid) {
                throw new CancellationException();
            }
            if (!this.f14792dovishness) {
                throw new TimeoutException();
            }
            return this.f14796molybdenite;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.concurrent.Future
    public R get() throws ExecutionException, InterruptedException {
        try {
            return formularize(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f14790adultoid;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        return this.f14790adultoid || this.f14792dovishness || this.f14793gintrap;
    }

    @Override // belongingness.wireman
    public synchronized wireman marial() {
        return this.f14794graveside;
    }

    @Override // belongingness.wireman
    public void saneness(belongingness.dern dernVar) {
        dernVar.wireman(this.f14795kowloon, this.f14791arytenoidectomy);
    }

    public String toString() {
        wireman wiremanVar;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            try {
                wiremanVar = null;
                if (this.f14790adultoid) {
                    str = "CANCELLED";
                } else if (this.f14793gintrap) {
                    str = "FAILURE";
                } else if (this.f14792dovishness) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    wiremanVar = this.f14794graveside;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (wiremanVar == null) {
            return str2 + str + X3.j.e;
        }
        return str2 + str + ", request=[" + wiremanVar + "]]";
    }

    public marial(int i, int i2, boolean z, attabal attabalVar) {
        this.f14795kowloon = i;
        this.f14791arytenoidectomy = i2;
        this.f14797monoploid = z;
        this.f14798polloi = attabalVar;
    }

    @Override // java.util.concurrent.Future
    public R get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return formularize(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // regius.formularize
    public void onDestroy() {
    }

    @Override // regius.formularize
    public void onStart() {
    }

    @Override // regius.formularize
    public void onStop() {
    }

    @Override // belongingness.wireman
    public void beachfront(Drawable drawable) {
    }

    @Override // belongingness.wireman
    public void impromptu(belongingness.dern dernVar) {
    }

    @Override // belongingness.wireman
    public void wireman(Drawable drawable) {
    }
}
