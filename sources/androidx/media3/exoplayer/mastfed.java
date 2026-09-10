package androidx.media3.exoplayer;

import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PlayerMessage.java */
/* JADX INFO: loaded from: classes.dex */
public final class mastfed {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public boolean f11966apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saneness f11967attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public Object f11968beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public Looper f11969competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final decarock.wireman f11971dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public boolean f11972formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public boolean f11973impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f11974impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f11975marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final attabal f11976saneness;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public boolean f11978triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final androidx.media3.common.oilcan f11979wireman;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public long f11977taiyuan = C.TIME_UNSET;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public boolean f11970cutely = true;

    /* JADX INFO: compiled from: PlayerMessage.java */
    public interface attabal {
        void marial(mastfed mastfedVar);
    }

    /* JADX INFO: compiled from: PlayerMessage.java */
    public interface saneness {
        void handleMessage(int i, Object obj) throws ExoPlaybackException;
    }

    public mastfed(attabal attabalVar, saneness sanenessVar, androidx.media3.common.oilcan oilcanVar, int i, decarock.wireman wiremanVar, Looper looper) {
        this.f11976saneness = attabalVar;
        this.f11967attabal = sanenessVar;
        this.f11979wireman = oilcanVar;
        this.f11969competently = looper;
        this.f11971dern = wiremanVar;
        this.f11974impromptu = i;
    }

    public synchronized void apical(boolean z) {
        this.f11972formularize = z | this.f11972formularize;
        this.f11973impassible = true;
        notifyAll();
    }

    public synchronized boolean attabal(long j) throws InterruptedException, TimeoutException {
        boolean z;
        try {
            decarock.attabal.competently(this.f11966apical);
            decarock.attabal.competently(this.f11969competently.getThread() != Thread.currentThread());
            long jElapsedRealtime = this.f11971dern.elapsedRealtime() + j;
            while (true) {
                z = this.f11973impassible;
                if (z || j <= 0) {
                    break;
                }
                this.f11971dern.attabal();
                wait(j);
                j = jElapsedRealtime - this.f11971dern.elapsedRealtime();
            }
            if (!z) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11972formularize;
    }

    public long beachfront() {
        return this.f11977taiyuan;
    }

    public saneness competently() {
        return this.f11967attabal;
    }

    public synchronized boolean cutely() {
        return this.f11978triweekly;
    }

    public Looper dern() {
        return this.f11969competently;
    }

    public mastfed formularize() {
        decarock.attabal.competently(!this.f11966apical);
        if (this.f11977taiyuan == C.TIME_UNSET) {
            decarock.attabal.attabal(this.f11970cutely);
        }
        this.f11966apical = true;
        this.f11976saneness.marial(this);
        return this;
    }

    public mastfed impassible(Object obj) {
        decarock.attabal.competently(!this.f11966apical);
        this.f11968beachfront = obj;
        return this;
    }

    public androidx.media3.common.oilcan impromptu() {
        return this.f11979wireman;
    }

    public Object marial() {
        return this.f11968beachfront;
    }

    public boolean saneness() {
        return this.f11970cutely;
    }

    public int taiyuan() {
        return this.f11975marial;
    }

    public mastfed triweekly(int i) {
        decarock.attabal.competently(!this.f11966apical);
        this.f11975marial = i;
        return this;
    }

    public int wireman() {
        return this.f11974impromptu;
    }
}
