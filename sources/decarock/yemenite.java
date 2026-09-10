package decarock;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SystemHandlerWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class yemenite implements cutely {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final List<saneness> f25153saneness = new ArrayList(50);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Handler f25154attabal;

    /* JADX INFO: compiled from: SystemHandlerWrapper.java */
    public static final class saneness implements cutely.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Message f25155attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public yemenite f25156saneness;

        public saneness() {
        }

        @Override // decarock.cutely.attabal
        public void attabal() {
            ((Message) decarock.attabal.marial(this.f25155attabal)).sendToTarget();
            saneness();
        }

        public boolean dern(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) decarock.attabal.marial(this.f25155attabal));
            saneness();
            return zSendMessageAtFrontOfQueue;
        }

        public final void saneness() {
            this.f25155attabal = null;
            this.f25156saneness = null;
            yemenite.marial(this);
        }

        public saneness wireman(Message message, yemenite yemeniteVar) {
            this.f25155attabal = message;
            this.f25156saneness = yemeniteVar;
            return this;
        }
    }

    public yemenite(Handler handler) {
        this.f25154attabal = handler;
    }

    public static void marial(saneness sanenessVar) {
        List<saneness> list = f25153saneness;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(sanenessVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static saneness wireman() {
        saneness sanenessVar;
        List<saneness> list = f25153saneness;
        synchronized (list) {
            try {
                sanenessVar = list.isEmpty() ? new saneness() : list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return sanenessVar;
    }

    @Override // decarock.cutely
    public boolean attabal(int i) {
        decarock.attabal.attabal(i != 0);
        return this.f25154attabal.hasMessages(i);
    }

    @Override // decarock.cutely
    public Looper getLooper() {
        return this.f25154attabal.getLooper();
    }

    @Override // decarock.cutely
    public cutely.attabal obtainMessage(int i) {
        return wireman().wireman(this.f25154attabal.obtainMessage(i), this);
    }

    @Override // decarock.cutely
    public boolean post(Runnable runnable) {
        return this.f25154attabal.post(runnable);
    }

    @Override // decarock.cutely
    public void removeCallbacksAndMessages(Object obj) {
        this.f25154attabal.removeCallbacksAndMessages(obj);
    }

    @Override // decarock.cutely
    public void removeMessages(int i) {
        decarock.attabal.attabal(i != 0);
        this.f25154attabal.removeMessages(i);
    }

    @Override // decarock.cutely
    public boolean saneness(cutely.attabal attabalVar) {
        return ((saneness) attabalVar).dern(this.f25154attabal);
    }

    @Override // decarock.cutely
    public boolean sendEmptyMessage(int i) {
        return this.f25154attabal.sendEmptyMessage(i);
    }

    @Override // decarock.cutely
    public boolean sendEmptyMessageAtTime(int i, long j) {
        return this.f25154attabal.sendEmptyMessageAtTime(i, j);
    }

    @Override // decarock.cutely
    public cutely.attabal obtainMessage(int i, Object obj) {
        return wireman().wireman(this.f25154attabal.obtainMessage(i, obj), this);
    }

    @Override // decarock.cutely
    public cutely.attabal obtainMessage(int i, int i2, int i3) {
        return wireman().wireman(this.f25154attabal.obtainMessage(i, i2, i3), this);
    }

    @Override // decarock.cutely
    public cutely.attabal obtainMessage(int i, int i2, int i3, Object obj) {
        return wireman().wireman(this.f25154attabal.obtainMessage(i, i2, i3, obj), this);
    }
}
