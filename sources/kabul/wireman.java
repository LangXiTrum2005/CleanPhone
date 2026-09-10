package kabul;

import android.content.Context;
import androidx.work.apical;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: ConstraintTracker.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class wireman<T> {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final String f29033beachfront = apical.beachfront("ConstraintTracker");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final arugula.attabal f29034attabal;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public T f29036marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Context f29037saneness;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Object f29035dern = new Object();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Set<diakinesis.attabal<T>> f29038wireman = new LinkedHashSet();

    /* JADX INFO: compiled from: ConstraintTracker.java */
    public class attabal implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ List f29040kowloon;

        public attabal(List list) {
            this.f29040kowloon = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f29040kowloon.iterator();
            while (it.hasNext()) {
                ((diakinesis.attabal) it.next()).attabal(wireman.this.f29036marial);
            }
        }
    }

    public wireman(Context context, arugula.attabal attabalVar) {
        this.f29037saneness = context.getApplicationContext();
        this.f29034attabal = attabalVar;
    }

    public void attabal(diakinesis.attabal<T> attabalVar) {
        synchronized (this.f29035dern) {
            try {
                if (this.f29038wireman.add(attabalVar)) {
                    if (this.f29038wireman.size() == 1) {
                        this.f29036marial = saneness();
                        apical.dern().attabal(f29033beachfront, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f29036marial), new Throwable[0]);
                        marial();
                    }
                    attabalVar.attabal(this.f29036marial);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void beachfront();

    public void dern(diakinesis.attabal<T> attabalVar) {
        synchronized (this.f29035dern) {
            try {
                if (this.f29038wireman.remove(attabalVar) && this.f29038wireman.isEmpty()) {
                    beachfront();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void marial();

    public abstract T saneness();

    public void wireman(T t) {
        synchronized (this.f29035dern) {
            try {
                T t2 = this.f29036marial;
                if (t2 != t && (t2 == null || !t2.equals(t))) {
                    this.f29036marial = t;
                    this.f29034attabal.attabal().execute(new attabal(new ArrayList(this.f29038wireman)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
