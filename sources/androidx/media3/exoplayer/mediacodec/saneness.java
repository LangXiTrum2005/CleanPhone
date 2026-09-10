package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import decarock.grimness;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: AsynchronousMediaCodecCallback.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness extends MediaCodec.Callback {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public MediaCodec.CryptoException f12089apical;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public MediaCodec.CodecException f12093cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Handler f12094dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public long f12095formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public boolean f12096impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public MediaFormat f12097impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public wireman.dern f12098kowloon;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final HandlerThread f12100saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public MediaFormat f12101taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public IllegalStateException f12102triweekly;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Object f12090attabal = new Object();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final androidx.collection.marial f12103wireman = new androidx.collection.marial();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final androidx.collection.marial f12099marial = new androidx.collection.marial();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final ArrayDeque<MediaCodec.BufferInfo> f12091beachfront = new ArrayDeque<>();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final ArrayDeque<MediaFormat> f12092competently = new ArrayDeque<>();

    public saneness(HandlerThread handlerThread) {
        this.f12100saneness = handlerThread;
    }

    public final void apical() {
        IllegalStateException illegalStateException = this.f12102triweekly;
        if (illegalStateException == null) {
            return;
        }
        this.f12102triweekly = null;
        throw illegalStateException;
    }

    public void arytenoidectomy(wireman.dern dernVar) {
        synchronized (this.f12090attabal) {
            this.f12098kowloon = dernVar;
        }
    }

    public final void beachfront() {
        if (!this.f12092competently.isEmpty()) {
            this.f12101taiyuan = this.f12092competently.getLast();
        }
        this.f12103wireman.saneness();
        this.f12099marial.saneness();
        this.f12091beachfront.clear();
        this.f12092competently.clear();
    }

    public MediaFormat competently() {
        MediaFormat mediaFormat;
        synchronized (this.f12090attabal) {
            try {
                mediaFormat = this.f12097impromptu;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void cutely() {
        apical();
        impassible();
        formularize();
    }

    public int dern() {
        synchronized (this.f12090attabal) {
            try {
                cutely();
                int iMarial = -1;
                if (taiyuan()) {
                    return -1;
                }
                if (!this.f12103wireman.wireman()) {
                    iMarial = this.f12103wireman.marial();
                }
                return iMarial;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void formularize() {
        MediaCodec.CryptoException cryptoException = this.f12089apical;
        if (cryptoException == null) {
            return;
        }
        this.f12089apical = null;
        throw cryptoException;
    }

    public final void impassible() {
        MediaCodec.CodecException codecException = this.f12093cutely;
        if (codecException == null) {
            return;
        }
        this.f12093cutely = null;
        throw codecException;
    }

    public void impromptu(MediaCodec mediaCodec) {
        decarock.attabal.competently(this.f12094dern == null);
        this.f12100saneness.start();
        Handler handler = new Handler(this.f12100saneness.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f12094dern = handler;
    }

    public final void kowloon(IllegalStateException illegalStateException) {
        synchronized (this.f12090attabal) {
            this.f12102triweekly = illegalStateException;
        }
    }

    public void marial() {
        synchronized (this.f12090attabal) {
            this.f12095formularize++;
            ((Handler) grimness.impromptu(this.f12094dern)).post(new Runnable() { // from class: rajahship.marial
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36046kowloon.triweekly();
                }
            });
        }
    }

    public void monoploid() {
        synchronized (this.f12090attabal) {
            this.f12096impassible = true;
            this.f12100saneness.quit();
            beachfront();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f12090attabal) {
            this.f12089apical = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f12090attabal) {
            this.f12093cutely = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f12090attabal) {
            try {
                this.f12103wireman.attabal(i);
                wireman.dern dernVar = this.f12098kowloon;
                if (dernVar != null) {
                    dernVar.attabal();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f12090attabal) {
            try {
                MediaFormat mediaFormat = this.f12101taiyuan;
                if (mediaFormat != null) {
                    saneness(mediaFormat);
                    this.f12101taiyuan = null;
                }
                this.f12099marial.attabal(i);
                this.f12091beachfront.add(bufferInfo);
                wireman.dern dernVar = this.f12098kowloon;
                if (dernVar != null) {
                    dernVar.saneness();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f12090attabal) {
            saneness(mediaFormat);
            this.f12101taiyuan = null;
        }
    }

    public final void saneness(MediaFormat mediaFormat) {
        this.f12099marial.attabal(-2);
        this.f12092competently.add(mediaFormat);
    }

    public final boolean taiyuan() {
        return this.f12095formularize > 0 || this.f12096impassible;
    }

    public final void triweekly() {
        synchronized (this.f12090attabal) {
            try {
                if (this.f12096impassible) {
                    return;
                }
                long j = this.f12095formularize - 1;
                this.f12095formularize = j;
                if (j > 0) {
                    return;
                }
                if (j < 0) {
                    kowloon(new IllegalStateException());
                } else {
                    beachfront();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int wireman(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f12090attabal) {
            try {
                cutely();
                if (taiyuan()) {
                    return -1;
                }
                if (this.f12099marial.wireman()) {
                    return -1;
                }
                int iMarial = this.f12099marial.marial();
                if (iMarial >= 0) {
                    decarock.attabal.taiyuan(this.f12097impromptu);
                    MediaCodec.BufferInfo bufferInfoRemove = this.f12091beachfront.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (iMarial == -2) {
                    this.f12097impromptu = this.f12092competently.remove();
                }
                return iMarial;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
