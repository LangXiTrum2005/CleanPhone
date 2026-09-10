package miliaria;

import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;
import miliaria.marial;

/* JADX INFO: compiled from: SimpleDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class beachfront<I extends DecoderInputBuffer, O extends marial, E extends DecoderException> implements wireman<I, O, E> {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public boolean f33421apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Thread f33422attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final O[] f33423beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f33424competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public E f33425cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public boolean f33427formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public int f33428impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f33429impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final I[] f33430marial;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public I f33432taiyuan;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Object f33431saneness = new Object();

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public long f33433triweekly = C.TIME_UNSET;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ArrayDeque<I> f33426dern = new ArrayDeque<>();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ArrayDeque<O> f33434wireman = new ArrayDeque<>();

    /* JADX INFO: compiled from: SimpleDecoder.java */
    public class attabal extends Thread {
        public attabal(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            beachfront.this.polloi();
        }
    }

    public beachfront(I[] iArr, O[] oArr) {
        this.f33430marial = iArr;
        this.f33424competently = iArr.length;
        for (int i = 0; i < this.f33424competently; i++) {
            ((I[]) this.f33430marial)[i] = marial();
        }
        this.f33423beachfront = oArr;
        this.f33429impromptu = oArr.length;
        for (int i2 = 0; i2 < this.f33429impromptu; i2++) {
            ((O[]) this.f33423beachfront)[i2] = beachfront();
        }
        attabal attabalVar = new attabal("ExoPlayer:SimpleDecoder");
        this.f33422attabal = attabalVar;
        attabalVar.start();
    }

    @Override // miliaria.wireman, ctenidium.dern
    /* JADX INFO: renamed from: apical, reason: merged with bridge method [inline-methods] */
    public final O dequeueOutputBuffer() throws DecoderException {
        synchronized (this.f33431saneness) {
            try {
                triweekly();
                if (this.f33434wireman.isEmpty()) {
                    return null;
                }
                return this.f33434wireman.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void arytenoidectomy(O o) {
        synchronized (this.f33431saneness) {
            monoploid(o);
            impassible();
        }
    }

    @Override // miliaria.wireman
    public final void attabal(long j) {
        synchronized (this.f33431saneness) {
            try {
                decarock.attabal.competently(this.f33424competently == this.f33430marial.length || this.f33421apical);
                this.f33433triweekly = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract O beachfront();

    public abstract E competently(Throwable th);

    @Override // miliaria.wireman
    /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
    public final I dequeueInputBuffer() throws DecoderException {
        I i;
        synchronized (this.f33431saneness) {
            triweekly();
            decarock.attabal.competently(this.f33432taiyuan == null);
            int i2 = this.f33424competently;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f33430marial;
                int i3 = i2 - 1;
                this.f33424competently = i3;
                i = iArr[i3];
            }
            this.f33432taiyuan = i;
        }
        return i;
    }

    @Override // miliaria.wireman
    public final void flush() {
        synchronized (this.f33431saneness) {
            try {
                this.f33421apical = true;
                this.f33428impassible = 0;
                I i = this.f33432taiyuan;
                if (i != null) {
                    kowloon(i);
                    this.f33432taiyuan = null;
                }
                while (!this.f33426dern.isEmpty()) {
                    kowloon(this.f33426dern.removeFirst());
                }
                while (!this.f33434wireman.isEmpty()) {
                    this.f33434wireman.removeFirst().triweekly();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean formularize(long j) {
        boolean z;
        synchronized (this.f33431saneness) {
            long j2 = this.f33433triweekly;
            z = j2 == C.TIME_UNSET || j >= j2;
        }
        return z;
    }

    public final void impassible() {
        if (wireman()) {
            this.f33431saneness.notify();
        }
    }

    public abstract E impromptu(I i, O o, boolean z);

    public final void kowloon(I i) {
        i.dern();
        I[] iArr = this.f33430marial;
        int i2 = this.f33424competently;
        this.f33424competently = i2 + 1;
        iArr[i2] = i;
    }

    public abstract I marial();

    public final void molybdenite(int i) {
        decarock.attabal.competently(this.f33424competently == this.f33430marial.length);
        for (I i2 : this.f33430marial) {
            i2.kowloon(i);
        }
    }

    public final void monoploid(O o) {
        o.dern();
        O[] oArr = this.f33423beachfront;
        int i = this.f33429impromptu;
        this.f33429impromptu = i + 1;
        oArr[i] = o;
    }

    public final void polloi() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (taiyuan());
    }

    @Override // miliaria.wireman
    public void release() {
        synchronized (this.f33431saneness) {
            this.f33427formularize = true;
            this.f33431saneness.notify();
        }
        try {
            this.f33422attabal.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // miliaria.wireman
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public final void queueInputBuffer(I i) throws DecoderException {
        synchronized (this.f33431saneness) {
            triweekly();
            decarock.attabal.attabal(i == this.f33432taiyuan);
            this.f33426dern.addLast(i);
            impassible();
            this.f33432taiyuan = null;
        }
    }

    public final boolean taiyuan() throws InterruptedException {
        E e;
        synchronized (this.f33431saneness) {
            while (!this.f33427formularize && !wireman()) {
                try {
                    this.f33431saneness.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f33427formularize) {
                return false;
            }
            I iRemoveFirst = this.f33426dern.removeFirst();
            O[] oArr = this.f33423beachfront;
            int i = this.f33429impromptu - 1;
            this.f33429impromptu = i;
            O o = oArr[i];
            boolean z = this.f33421apical;
            this.f33421apical = false;
            if (iRemoveFirst.taiyuan()) {
                o.attabal(4);
            } else {
                o.f33454arytenoidectomy = iRemoveFirst.f11480graveside;
                if (iRemoveFirst.cutely()) {
                    o.attabal(134217728);
                }
                if (!formularize(iRemoveFirst.f11480graveside)) {
                    o.f33456polloi = true;
                }
                try {
                    e = (E) impromptu(iRemoveFirst, o, z);
                } catch (OutOfMemoryError e2) {
                    e = (E) competently(e2);
                } catch (RuntimeException e3) {
                    e = (E) competently(e3);
                }
                if (e != null) {
                    synchronized (this.f33431saneness) {
                        this.f33425cutely = e;
                    }
                    return false;
                }
            }
            synchronized (this.f33431saneness) {
                try {
                    if (this.f33421apical) {
                        o.triweekly();
                    } else if (o.f33456polloi) {
                        this.f33428impassible++;
                        o.triweekly();
                    } else {
                        o.f33455monoploid = this.f33428impassible;
                        this.f33428impassible = 0;
                        this.f33434wireman.addLast(o);
                    }
                    kowloon(iRemoveFirst);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends androidx.media3.decoder.DecoderException */
    public final void triweekly() throws E, DecoderException {
        E e = this.f33425cutely;
        if (e != null) {
            throw e;
        }
    }

    public final boolean wireman() {
        return !this.f33426dern.isEmpty() && this.f33429impromptu > 0;
    }
}
