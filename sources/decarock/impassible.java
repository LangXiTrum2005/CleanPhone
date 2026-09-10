package decarock;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: ListenerSet.java */
/* JADX INFO: loaded from: classes.dex */
public final class impassible<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final wireman f25095attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final ArrayDeque<Runnable> f25096beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Object f25097competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final saneness<T> f25098dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f25099impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final ArrayDeque<Runnable> f25100marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final cutely f25101saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f25102taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final CopyOnWriteArraySet<dern<T>> f25103wireman;

    /* JADX INFO: compiled from: ListenerSet.java */
    public interface attabal<T> {
        void invoke(T t);
    }

    /* JADX INFO: compiled from: ListenerSet.java */
    public static final class dern<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final T f25104attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public boolean f25105dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public androidx.media3.common.kowloon.saneness f25106saneness = new androidx.media3.common.kowloon.saneness();

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public boolean f25107wireman;

        public dern(T t) {
            this.f25104attabal = t;
        }

        public void attabal(int i, attabal<T> attabalVar) {
            if (this.f25107wireman) {
                return;
            }
            if (i != -1) {
                this.f25106saneness.attabal(i);
            }
            this.f25105dern = true;
            attabalVar.invoke(this.f25104attabal);
        }

        public void dern(saneness<T> sanenessVar) {
            this.f25107wireman = true;
            if (this.f25105dern) {
                this.f25105dern = false;
                sanenessVar.attabal(this.f25104attabal, this.f25106saneness.marial());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || dern.class != obj.getClass()) {
                return false;
            }
            return this.f25104attabal.equals(((dern) obj).f25104attabal);
        }

        public int hashCode() {
            return this.f25104attabal.hashCode();
        }

        public void saneness(saneness<T> sanenessVar) {
            if (this.f25107wireman || !this.f25105dern) {
                return;
            }
            androidx.media3.common.kowloon kowloonVarMarial = this.f25106saneness.marial();
            this.f25106saneness = new androidx.media3.common.kowloon.saneness();
            this.f25105dern = false;
            sanenessVar.attabal(this.f25104attabal, kowloonVarMarial);
        }
    }

    /* JADX INFO: compiled from: ListenerSet.java */
    public interface saneness<T> {
        void attabal(T t, androidx.media3.common.kowloon kowloonVar);
    }

    public impassible(Looper looper, wireman wiremanVar, saneness<T> sanenessVar) {
        this(new CopyOnWriteArraySet(), looper, wiremanVar, sanenessVar, true);
    }

    public static /* synthetic */ void attabal(CopyOnWriteArraySet copyOnWriteArraySet, int i, attabal attabalVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((dern) it.next()).attabal(i, attabalVar);
        }
    }

    public void apical(int i, attabal<T> attabalVar) {
        impromptu(i, attabalVar);
        beachfront();
    }

    public void beachfront() {
        formularize();
        if (this.f25096beachfront.isEmpty()) {
            return;
        }
        if (!this.f25101saneness.attabal(1)) {
            cutely cutelyVar = this.f25101saneness;
            cutelyVar.saneness(cutelyVar.obtainMessage(1));
        }
        boolean zIsEmpty = this.f25100marial.isEmpty();
        this.f25100marial.addAll(this.f25096beachfront);
        this.f25096beachfront.clear();
        if (zIsEmpty) {
            while (!this.f25100marial.isEmpty()) {
                this.f25100marial.peekFirst().run();
                this.f25100marial.removeFirst();
            }
        }
    }

    public final boolean competently(Message message) {
        Iterator<dern<T>> it = this.f25103wireman.iterator();
        while (it.hasNext()) {
            it.next().saneness(this.f25098dern);
            if (this.f25101saneness.attabal(1)) {
                break;
            }
        }
        return true;
    }

    public void cutely(T t) {
        formularize();
        for (dern<T> dernVar : this.f25103wireman) {
            if (dernVar.f25104attabal.equals(t)) {
                dernVar.dern(this.f25098dern);
                this.f25103wireman.remove(dernVar);
            }
        }
    }

    public void dern(T t) {
        decarock.attabal.marial(t);
        synchronized (this.f25097competently) {
            try {
                if (this.f25099impromptu) {
                    return;
                }
                this.f25103wireman.add(new dern<>(t));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void formularize() {
        if (this.f25102taiyuan) {
            decarock.attabal.competently(Thread.currentThread() == this.f25101saneness.getLooper().getThread());
        }
    }

    public void impromptu(final int i, final attabal<T> attabalVar) {
        formularize();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f25103wireman);
        this.f25096beachfront.add(new Runnable() { // from class: decarock.formularize
            @Override // java.lang.Runnable
            public final void run() {
                impassible.attabal(copyOnWriteArraySet, i, attabalVar);
            }
        });
    }

    public impassible<T> marial(Looper looper, saneness<T> sanenessVar) {
        return wireman(looper, this.f25095attabal, sanenessVar);
    }

    public void taiyuan() {
        formularize();
        synchronized (this.f25097competently) {
            this.f25099impromptu = true;
        }
        Iterator<dern<T>> it = this.f25103wireman.iterator();
        while (it.hasNext()) {
            it.next().dern(this.f25098dern);
        }
        this.f25103wireman.clear();
    }

    public impassible<T> wireman(Looper looper, wireman wiremanVar, saneness<T> sanenessVar) {
        return new impassible<>(this.f25103wireman, looper, wiremanVar, sanenessVar, this.f25102taiyuan);
    }

    public impassible(CopyOnWriteArraySet<dern<T>> copyOnWriteArraySet, Looper looper, wireman wiremanVar, saneness<T> sanenessVar, boolean z) {
        this.f25095attabal = wiremanVar;
        this.f25103wireman = copyOnWriteArraySet;
        this.f25098dern = sanenessVar;
        this.f25097competently = new Object();
        this.f25100marial = new ArrayDeque<>();
        this.f25096beachfront = new ArrayDeque<>();
        this.f25101saneness = wiremanVar.createHandler(looper, new Handler.Callback() { // from class: decarock.apical
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f25059kowloon.competently(message);
            }
        });
        this.f25102taiyuan = z;
    }
}
