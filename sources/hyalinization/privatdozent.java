package hyalinization;

import androidx.media3.common.audio.AudioProcessor;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SilenceSkippingAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public final class privatdozent extends androidx.media3.common.audio.saneness {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f28083adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final int f28084apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f28085arytenoidectomy;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final short f28086cutely;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public byte[] f28087dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final long f28088formularize;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public int f28089graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final long f28090impassible;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public boolean f28091kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public byte[] f28092molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public long f28093monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f28094polloi;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final float f28095taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public int f28096triweekly;

    public privatdozent() {
        this(100000L, 0.2f, 2000000L, 10, (short) 1024);
    }

    public static int cuirassed(byte b, byte b2) {
        return (b << 8) | (b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public static void rotuma(byte[] bArr, int i, int i2) {
        if (i2 >= 32767) {
            bArr[i] = -1;
            bArr[i + 1] = 127;
        } else if (i2 <= -32768) {
            bArr[i] = 0;
            bArr[i + 1] = -128;
        } else {
            bArr[i] = (byte) (i2 & 255);
            bArr[i + 1] = (byte) (i2 >> 8);
        }
    }

    public final void adultoid(boolean z) {
        int length;
        int iFormularize;
        int i = this.f28083adultoid;
        byte[] bArr = this.f28092molybdenite;
        if (i == bArr.length || z) {
            if (this.f28094polloi == 0) {
                if (z) {
                    dovishness(i, 3);
                    length = i;
                } else {
                    decarock.attabal.competently(i >= bArr.length / 2);
                    length = this.f28092molybdenite.length / 2;
                    dovishness(length, 0);
                }
                iFormularize = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iFormularize2 = formularize(length2) + (this.f28092molybdenite.length / 2);
                dovishness(iFormularize2, 2);
                iFormularize = iFormularize2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iFormularize = formularize(length);
                dovishness(iFormularize, 1);
            }
            decarock.attabal.impromptu(length % this.f28096triweekly == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            decarock.attabal.competently(i >= iFormularize);
            this.f28083adultoid -= length;
            int i2 = this.f28089graveside + length;
            this.f28089graveside = i2;
            this.f28089graveside = i2 % this.f28092molybdenite.length;
            int i3 = this.f28094polloi;
            int i4 = this.f28096triweekly;
            this.f28094polloi = i3 + (iFormularize / i4);
            this.f28093monoploid += (long) ((length - iFormularize) / i4);
        }
    }

    public final int apical(int i, int i2) {
        return (((this.f28084apical - 100) * ((i * 1000) / i2)) / 1000) + 100;
    }

    public long arytenoidectomy() {
        return this.f28093monoploid;
    }

    @Override // androidx.media3.common.audio.saneness
    public void beachfront() {
        this.f28091kowloon = false;
        byte[] bArr = decarock.grimness.f25081beachfront;
        this.f28092molybdenite = bArr;
        this.f28087dovishness = bArr;
    }

    public final void cord(ByteBuffer byteBuffer) {
        int length;
        int i;
        decarock.attabal.competently(this.f28089graveside < this.f28092molybdenite.length);
        int iLimit = byteBuffer.limit();
        int iKowloon = kowloon(byteBuffer);
        int iPosition = iKowloon - byteBuffer.position();
        int i2 = this.f28089graveside;
        int i3 = this.f28083adultoid;
        int i4 = i2 + i3;
        byte[] bArr = this.f28092molybdenite;
        if (i4 < bArr.length) {
            length = bArr.length - (i3 + i2);
            i = i2 + i3;
        } else {
            int length2 = i3 - (bArr.length - i2);
            length = i2 - length2;
            i = length2;
        }
        boolean z = iKowloon < iLimit;
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f28092molybdenite, i, iMin);
        int i5 = this.f28083adultoid + iMin;
        this.f28083adultoid = i5;
        decarock.attabal.competently(i5 <= this.f28092molybdenite.length);
        boolean z2 = z && iPosition < length;
        adultoid(z2);
        if (z2) {
            this.f28085arytenoidectomy = 0;
            this.f28094polloi = 0;
        }
        byteBuffer.limit(iLimit);
    }

    public final int cutely(int i, int i2) {
        int i3 = this.f28084apical;
        return i3 + ((((100 - i3) * (i * 1000)) / i2) / 1000);
    }

    @Override // androidx.media3.common.audio.saneness
    public AudioProcessor.attabal dern(AudioProcessor.attabal attabalVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (attabalVar.f10780dern == 2) {
            return attabalVar.f10779attabal == -1 ? AudioProcessor.attabal.f10778marial : attabalVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(attabalVar);
    }

    public final void dovishness(int i, int i2) {
        if (i == 0) {
            return;
        }
        decarock.attabal.attabal(this.f28083adultoid >= i);
        if (i2 == 2) {
            int i3 = this.f28089graveside;
            int i4 = this.f28083adultoid;
            int i5 = i3 + i4;
            byte[] bArr = this.f28092molybdenite;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, (i3 + i4) - i, this.f28087dovishness, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.f28087dovishness, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, this.f28087dovishness, 0, i6);
                    System.arraycopy(this.f28092molybdenite, 0, this.f28087dovishness, i6, length);
                }
            }
        } else {
            int i7 = this.f28089graveside;
            int i8 = i7 + i;
            byte[] bArr2 = this.f28092molybdenite;
            if (i8 <= bArr2.length) {
                System.arraycopy(bArr2, i7, this.f28087dovishness, 0, i);
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr2, i7, this.f28087dovishness, 0, length2);
                System.arraycopy(this.f28092molybdenite, 0, this.f28087dovishness, length2, i - length2);
            }
        }
        decarock.attabal.saneness(i % this.f28096triweekly == 0, "sizeToOutput is not aligned to frame size: " + i);
        decarock.attabal.competently(this.f28089graveside < this.f28092molybdenite.length);
        graveside(this.f28087dovishness, i, i2);
    }

    public final int formularize(int i) {
        int iImpassible = ((impassible(this.f28090impassible) - this.f28094polloi) * this.f28096triweekly) - (this.f28092molybdenite.length / 2);
        decarock.attabal.competently(iImpassible >= 0);
        return impromptu(Math.min((i * this.f28095taiyuan) + 0.5f, iImpassible));
    }

    public final void gintrap(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f28092molybdenite.length));
        int iTriweekly = triweekly(byteBuffer);
        if (iTriweekly == byteBuffer.position()) {
            this.f28085arytenoidectomy = 1;
        } else {
            byteBuffer.limit(Math.min(iTriweekly, byteBuffer.capacity()));
            molybdenite(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    public final void graveside(byte[] bArr, int i, int i2) {
        decarock.attabal.saneness(i % this.f28096triweekly == 0, "byteOutput size is not aligned to frame size " + i);
        polloi(bArr, i, i2);
        competently(i).put(bArr, 0, i).flip();
    }

    public final int impassible(long j) {
        return (int) ((j * ((long) this.f10809saneness.f10779attabal)) / 1000000);
    }

    public final int impromptu(float f) {
        return taiyuan((int) f);
    }

    @Override // androidx.media3.common.audio.saneness, androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return super.isActive() && this.f28091kowloon;
    }

    public final int kowloon(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (monoploid(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i = this.f28096triweekly;
                return i * (iPosition / i);
            }
        }
        return byteBuffer.limit();
    }

    @Override // androidx.media3.common.audio.saneness
    public void marial() {
        if (this.f28083adultoid > 0) {
            adultoid(true);
            this.f28094polloi = 0;
        }
    }

    public final void molybdenite(ByteBuffer byteBuffer) {
        competently(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    public final boolean monoploid(byte b, byte b2) {
        return Math.abs(cuirassed(b, b2)) > this.f28086cutely;
    }

    public final void polloi(byte[] bArr, int i, int i2) {
        if (i2 == 3) {
            return;
        }
        for (int i3 = 0; i3 < i; i3 += 2) {
            rotuma(bArr, i3, (cuirassed(bArr[i3 + 1], bArr[i3]) * (i2 == 0 ? apical(i3, i - 1) : i2 == 2 ? cutely(i3, i - 1) : this.f28084apical)) / 100);
        }
    }

    public void preprohormone(boolean z) {
        this.f28091kowloon = z;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !saneness()) {
            int i = this.f28085arytenoidectomy;
            if (i == 0) {
                gintrap(byteBuffer);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                cord(byteBuffer);
            }
        }
    }

    public final int taiyuan(int i) {
        int i2 = this.f28096triweekly;
        return (i / i2) * i2;
    }

    public final int triweekly(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (monoploid(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i = this.f28096triweekly;
                return ((iLimit / i) * i) + i;
            }
        }
        return byteBuffer.position();
    }

    @Override // androidx.media3.common.audio.saneness
    public void wireman() {
        if (isActive()) {
            this.f28096triweekly = this.f10809saneness.f10781saneness * 2;
            int iTaiyuan = taiyuan(impassible(this.f28088formularize) / 2) * 2;
            if (this.f28092molybdenite.length != iTaiyuan) {
                this.f28092molybdenite = new byte[iTaiyuan];
                this.f28087dovishness = new byte[iTaiyuan];
            }
        }
        this.f28085arytenoidectomy = 0;
        this.f28093monoploid = 0L;
        this.f28094polloi = 0;
        this.f28089graveside = 0;
        this.f28083adultoid = 0;
    }

    public privatdozent(long j, float f, long j2, int i, short s) {
        boolean z = false;
        this.f28094polloi = 0;
        this.f28089graveside = 0;
        this.f28083adultoid = 0;
        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f <= 1.0f) {
            z = true;
        }
        decarock.attabal.attabal(z);
        this.f28088formularize = j;
        this.f28095taiyuan = f;
        this.f28090impassible = j2;
        this.f28084apical = i;
        this.f28086cutely = s;
        byte[] bArr = decarock.grimness.f25081beachfront;
        this.f28092molybdenite = bArr;
        this.f28087dovishness = bArr;
    }
}
