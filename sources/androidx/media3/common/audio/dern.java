package androidx.media3.common.audio;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import decarock.grimness;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: SonicAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public class dern implements AudioProcessor {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public ByteBuffer f10789apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public boolean f10790arytenoidectomy;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public AudioProcessor.attabal f10791beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public AudioProcessor.attabal f10792competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public stupefactive.saneness f10793cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public ShortBuffer f10795formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public ByteBuffer f10796impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public AudioProcessor.attabal f10797impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public long f10798kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public AudioProcessor.attabal f10799marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f10800saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f10801taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public long f10802triweekly;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public float f10794dern = 1.0f;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public float f10803wireman = 1.0f;

    public dern() {
        AudioProcessor.attabal attabalVar = AudioProcessor.attabal.f10778marial;
        this.f10799marial = attabalVar;
        this.f10791beachfront = attabalVar;
        this.f10792competently = attabalVar;
        this.f10797impromptu = attabalVar;
        ByteBuffer byteBuffer = AudioProcessor.f10777attabal;
        this.f10789apical = byteBuffer;
        this.f10795formularize = byteBuffer.asShortBuffer();
        this.f10796impassible = byteBuffer;
        this.f10800saneness = -1;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.attabal attabal(AudioProcessor.attabal attabalVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (attabalVar.f10780dern != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(attabalVar);
        }
        int i = this.f10800saneness;
        if (i == -1) {
            i = attabalVar.f10779attabal;
        }
        this.f10799marial = attabalVar;
        AudioProcessor.attabal attabalVar2 = new AudioProcessor.attabal(i, attabalVar.f10781saneness, 2);
        this.f10791beachfront = attabalVar2;
        this.f10801taiyuan = true;
        return attabalVar2;
    }

    public final void dern(float f) {
        if (this.f10803wireman != f) {
            this.f10803wireman = f;
            this.f10801taiyuan = true;
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            AudioProcessor.attabal attabalVar = this.f10799marial;
            this.f10792competently = attabalVar;
            AudioProcessor.attabal attabalVar2 = this.f10791beachfront;
            this.f10797impromptu = attabalVar2;
            if (this.f10801taiyuan) {
                this.f10793cutely = new stupefactive.saneness(attabalVar.f10779attabal, attabalVar.f10781saneness, this.f10794dern, this.f10803wireman, attabalVar2.f10779attabal);
            } else {
                stupefactive.saneness sanenessVar = this.f10793cutely;
                if (sanenessVar != null) {
                    sanenessVar.taiyuan();
                }
            }
        }
        this.f10796impassible = AudioProcessor.f10777attabal;
        this.f10802triweekly = 0L;
        this.f10798kowloon = 0L;
        this.f10790arytenoidectomy = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        int iApical;
        stupefactive.saneness sanenessVar = this.f10793cutely;
        if (sanenessVar != null && (iApical = sanenessVar.apical()) > 0) {
            if (this.f10789apical.capacity() < iApical) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iApical).order(ByteOrder.nativeOrder());
                this.f10789apical = byteBufferOrder;
                this.f10795formularize = byteBufferOrder.asShortBuffer();
            } else {
                this.f10789apical.clear();
                this.f10795formularize.clear();
            }
            sanenessVar.cutely(this.f10795formularize);
            this.f10798kowloon += (long) iApical;
            this.f10789apical.limit(iApical);
            this.f10796impassible = this.f10789apical;
        }
        ByteBuffer byteBuffer = this.f10796impassible;
        this.f10796impassible = AudioProcessor.f10777attabal;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        if (this.f10791beachfront.f10779attabal != -1) {
            return Math.abs(this.f10794dern - 1.0f) >= 1.0E-4f || Math.abs(this.f10803wireman - 1.0f) >= 1.0E-4f || this.f10791beachfront.f10779attabal != this.f10799marial.f10779attabal;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        if (!this.f10790arytenoidectomy) {
            return false;
        }
        stupefactive.saneness sanenessVar = this.f10793cutely;
        return sanenessVar == null || sanenessVar.apical() == 0;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        stupefactive.saneness sanenessVar = this.f10793cutely;
        if (sanenessVar != null) {
            sanenessVar.molybdenite();
        }
        this.f10790arytenoidectomy = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            stupefactive.saneness sanenessVar = (stupefactive.saneness) decarock.attabal.marial(this.f10793cutely);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f10802triweekly += (long) iRemaining;
            sanenessVar.graveside(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.f10794dern = 1.0f;
        this.f10803wireman = 1.0f;
        AudioProcessor.attabal attabalVar = AudioProcessor.attabal.f10778marial;
        this.f10799marial = attabalVar;
        this.f10791beachfront = attabalVar;
        this.f10792competently = attabalVar;
        this.f10797impromptu = attabalVar;
        ByteBuffer byteBuffer = AudioProcessor.f10777attabal;
        this.f10789apical = byteBuffer;
        this.f10795formularize = byteBuffer.asShortBuffer();
        this.f10796impassible = byteBuffer;
        this.f10800saneness = -1;
        this.f10801taiyuan = false;
        this.f10793cutely = null;
        this.f10802triweekly = 0L;
        this.f10798kowloon = 0L;
        this.f10790arytenoidectomy = false;
    }

    public final long saneness(long j) {
        if (this.f10798kowloon < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (((double) this.f10794dern) * j);
        }
        long jFormularize = this.f10802triweekly - ((long) ((stupefactive.saneness) decarock.attabal.marial(this.f10793cutely)).formularize());
        int i = this.f10797impromptu.f10779attabal;
        int i2 = this.f10792competently.f10779attabal;
        return i == i2 ? grimness.deadwork(j, jFormularize, this.f10798kowloon) : grimness.deadwork(j, jFormularize * ((long) i), this.f10798kowloon * ((long) i2));
    }

    public final void wireman(float f) {
        if (this.f10794dern != f) {
            this.f10794dern = f;
            this.f10801taiyuan = true;
        }
    }
}
