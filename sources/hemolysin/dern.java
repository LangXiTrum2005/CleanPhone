package hemolysin;

import com.bumptech.glide.util.apical;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: DiskCacheWriteLocker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<String, attabal> f27646attabal = new HashMap();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final saneness f27647saneness = new saneness();

    /* JADX INFO: compiled from: DiskCacheWriteLocker.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Lock f27648attabal = new ReentrantLock();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f27649saneness;
    }

    /* JADX INFO: compiled from: DiskCacheWriteLocker.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Queue<attabal> f27650attabal = new ArrayDeque();

        public attabal attabal() {
            attabal attabalVarPoll;
            synchronized (this.f27650attabal) {
                attabalVarPoll = this.f27650attabal.poll();
            }
            return attabalVarPoll == null ? new attabal() : attabalVarPoll;
        }

        public void saneness(attabal attabalVar) {
            synchronized (this.f27650attabal) {
                try {
                    if (this.f27650attabal.size() < 10) {
                        this.f27650attabal.offer(attabalVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void attabal(String str) {
        attabal attabalVarAttabal;
        synchronized (this) {
            try {
                attabalVarAttabal = this.f27646attabal.get(str);
                if (attabalVarAttabal == null) {
                    attabalVarAttabal = this.f27647saneness.attabal();
                    this.f27646attabal.put(str, attabalVarAttabal);
                }
                attabalVarAttabal.f27649saneness++;
            } catch (Throwable th) {
                throw th;
            }
        }
        attabalVarAttabal.f27648attabal.lock();
    }

    public void saneness(String str) {
        attabal attabalVar;
        synchronized (this) {
            try {
                attabalVar = (attabal) apical.wireman(this.f27646attabal.get(str));
                int i = attabalVar.f27649saneness;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + attabalVar.f27649saneness);
                }
                int i2 = i - 1;
                attabalVar.f27649saneness = i2;
                if (i2 == 0) {
                    attabal attabalVarRemove = this.f27646attabal.remove(str);
                    if (!attabalVarRemove.equals(attabalVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + attabalVar + ", but actually removed: " + attabalVarRemove + ", safeKey: " + str);
                    }
                    this.f27647saneness.saneness(attabalVarRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        attabalVar.f27648attabal.unlock();
    }
}
