package rajahship;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import decarock.grimness;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import saneness.retroflection;

/* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman implements competently {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final ArrayDeque<saneness> f36049competently = new ArrayDeque<>();

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final Object f36050impromptu = new Object();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final MediaCodec f36051attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f36052beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Handler f36053dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final decarock.competently f36054marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final HandlerThread f36055saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final AtomicReference<RuntimeException> f36056wireman;

    /* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    public class attabal extends Handler {
        public attabal(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            wireman.this.cutely(message);
        }
    }

    /* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f36058attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public int f36059beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f36060dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public long f36061marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f36062saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f36063wireman = new MediaCodec.CryptoInfo();

        public void attabal(int i, int i2, int i3, long j, int i4) {
            this.f36058attabal = i;
            this.f36062saneness = i2;
            this.f36060dern = i3;
            this.f36061marial = j;
            this.f36059beachfront = i4;
        }
    }

    public wireman(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new decarock.competently());
    }

    public static void arytenoidectomy(saneness sanenessVar) {
        ArrayDeque<saneness> arrayDeque = f36049competently;
        synchronized (arrayDeque) {
            arrayDeque.add(sanenessVar);
        }
    }

    public static void competently(miliaria.dern dernVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = dernVar.f33443beachfront;
        cryptoInfo.numBytesOfClearData = taiyuan(dernVar.f33451wireman, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = taiyuan(dernVar.f33448marial, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) decarock.attabal.marial(impromptu(dernVar.f33449saneness, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) decarock.attabal.marial(impromptu(dernVar.f33442attabal, cryptoInfo.iv));
        cryptoInfo.mode = dernVar.f33446dern;
        if (grimness.f25080attabal >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dernVar.f33444competently, dernVar.f33447impromptu));
        }
    }

    public static byte[] impromptu(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static saneness kowloon() {
        ArrayDeque<saneness> arrayDeque = f36049competently;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new saneness();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int[] taiyuan(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public final void apical(int i, int i2, int i3, long j, int i4) {
        try {
            this.f36051attabal.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            retroflection.attabal(this.f36056wireman, null, e);
        }
    }

    @Override // rajahship.competently
    public void attabal(int i, int i2, miliaria.dern dernVar, long j, int i3) {
        wireman();
        saneness sanenessVarKowloon = kowloon();
        sanenessVarKowloon.attabal(i, i2, 0, j, i3);
        competently(dernVar, sanenessVarKowloon.f36063wireman);
        ((Handler) grimness.impromptu(this.f36053dern)).obtainMessage(2, sanenessVarKowloon).sendToTarget();
    }

    public final void beachfront() throws InterruptedException {
        this.f36054marial.dern();
        ((Handler) decarock.attabal.marial(this.f36053dern)).obtainMessage(3).sendToTarget();
        this.f36054marial.attabal();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    public final void cutely(Message message) {
        saneness sanenessVar;
        saneness sanenessVar2;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                sanenessVar2 = null;
                if (i == 3) {
                    this.f36054marial.marial();
                } else if (i != 4) {
                    retroflection.attabal(this.f36056wireman, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    impassible((Bundle) message.obj);
                }
            } else {
                sanenessVar = (saneness) message.obj;
                formularize(sanenessVar.f36058attabal, sanenessVar.f36062saneness, sanenessVar.f36063wireman, sanenessVar.f36061marial, sanenessVar.f36059beachfront);
            }
            if (sanenessVar2 != null) {
                arytenoidectomy(sanenessVar2);
            }
        }
        sanenessVar = (saneness) message.obj;
        apical(sanenessVar.f36058attabal, sanenessVar.f36062saneness, sanenessVar.f36060dern, sanenessVar.f36061marial, sanenessVar.f36059beachfront);
        sanenessVar2 = sanenessVar;
        if (sanenessVar2 != null) {
            arytenoidectomy(sanenessVar2);
        }
    }

    @Override // rajahship.competently
    public void dern(Bundle bundle) {
        wireman();
        ((Handler) grimness.impromptu(this.f36053dern)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // rajahship.competently
    public void flush() {
        if (this.f36052beachfront) {
            try {
                triweekly();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void formularize(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            synchronized (f36050impromptu) {
                this.f36051attabal.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            retroflection.attabal(this.f36056wireman, null, e);
        }
    }

    public final void impassible(Bundle bundle) {
        try {
            this.f36051attabal.setParameters(bundle);
        } catch (RuntimeException e) {
            retroflection.attabal(this.f36056wireman, null, e);
        }
    }

    @Override // rajahship.competently
    public void saneness(int i, int i2, int i3, long j, int i4) {
        wireman();
        saneness sanenessVarKowloon = kowloon();
        sanenessVarKowloon.attabal(i, i2, i3, j, i4);
        ((Handler) grimness.impromptu(this.f36053dern)).obtainMessage(1, sanenessVarKowloon).sendToTarget();
    }

    @Override // rajahship.competently
    public void shutdown() {
        if (this.f36052beachfront) {
            flush();
            this.f36055saneness.quit();
        }
        this.f36052beachfront = false;
    }

    @Override // rajahship.competently
    public void start() {
        if (this.f36052beachfront) {
            return;
        }
        this.f36055saneness.start();
        this.f36053dern = new attabal(this.f36055saneness.getLooper());
        this.f36052beachfront = true;
    }

    public final void triweekly() throws InterruptedException {
        ((Handler) decarock.attabal.marial(this.f36053dern)).removeCallbacksAndMessages(null);
        beachfront();
    }

    @Override // rajahship.competently
    public void wireman() {
        RuntimeException andSet = this.f36056wireman.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    public wireman(MediaCodec mediaCodec, HandlerThread handlerThread, decarock.competently competentlyVar) {
        this.f36051attabal = mediaCodec;
        this.f36055saneness = handlerThread;
        this.f36054marial = competentlyVar;
        this.f36056wireman = new AtomicReference<>();
    }
}
