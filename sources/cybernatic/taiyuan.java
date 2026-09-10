package cybernatic;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: DefaultExtractorInput.java */
/* JADX INFO: loaded from: classes.dex */
public final class taiyuan implements monoploid {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f24788beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f24789competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f24790dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final androidx.media3.common.taiyuan f24792saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public long f24793wireman;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public byte[] f24791marial = new byte[65536];

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f24787attabal = new byte[4096];

    static {
        androidx.media3.common.dovishness.attabal("media3.extractor");
    }

    public taiyuan(androidx.media3.common.taiyuan taiyuanVar, long j, long j2) {
        this.f24792saneness = taiyuanVar;
        this.f24793wireman = j;
        this.f24790dern = j2;
    }

    @Override // cybernatic.monoploid
    public boolean advancePeekPosition(int i, boolean z) throws IOException {
        marial(i);
        int iCompetently = this.f24789competently - this.f24788beachfront;
        while (iCompetently < i) {
            int i2 = i;
            boolean z2 = z;
            iCompetently = competently(this.f24791marial, this.f24788beachfront, i2, iCompetently, z2);
            if (iCompetently == -1) {
                return false;
            }
            this.f24789competently = this.f24788beachfront + iCompetently;
            i = i2;
            z = z2;
        }
        this.f24788beachfront += i;
        return true;
    }

    public final int beachfront(byte[] bArr, int i, int i2) {
        int i3 = this.f24789competently;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f24791marial, 0, bArr, i, iMin);
        cutely(iMin);
        return iMin;
    }

    public final int competently(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f24792saneness.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void cutely(int i) {
        int i2 = this.f24789competently - i;
        this.f24789competently = i2;
        this.f24788beachfront = 0;
        byte[] bArr = this.f24791marial;
        byte[] bArr2 = i2 < bArr.length - Opcodes.ASM8 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f24791marial = bArr2;
    }

    @Override // cybernatic.monoploid
    public long getLength() {
        return this.f24790dern;
    }

    @Override // cybernatic.monoploid
    public long getPeekPosition() {
        return this.f24793wireman + ((long) this.f24788beachfront);
    }

    @Override // cybernatic.monoploid
    public long getPosition() {
        return this.f24793wireman;
    }

    public final int impromptu(int i) {
        int iMin = Math.min(this.f24789competently, i);
        cutely(iMin);
        return iMin;
    }

    public final void marial(int i) {
        int i2 = this.f24788beachfront + i;
        byte[] bArr = this.f24791marial;
        if (i2 > bArr.length) {
            this.f24791marial = Arrays.copyOf(this.f24791marial, decarock.grimness.kowloon(bArr.length * 2, 65536 + i2, i2 + Opcodes.ASM8));
        }
    }

    @Override // cybernatic.monoploid
    public boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!advancePeekPosition(i2, z)) {
            return false;
        }
        System.arraycopy(this.f24791marial, this.f24788beachfront - i2, bArr, i, i2);
        return true;
    }

    @Override // cybernatic.monoploid, androidx.media3.common.taiyuan
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int iBeachfront = beachfront(bArr, i, i2);
        if (iBeachfront == 0) {
            iBeachfront = competently(bArr, i, i2, 0, true);
        }
        wireman(iBeachfront);
        return iBeachfront;
    }

    @Override // cybernatic.monoploid
    public boolean readFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int iBeachfront = beachfront(bArr, i, i2);
        while (iBeachfront < i2 && iBeachfront != -1) {
            iBeachfront = competently(bArr, i, i2, iBeachfront, z);
        }
        wireman(iBeachfront);
        return iBeachfront != -1;
    }

    @Override // cybernatic.monoploid
    public void resetPeekPosition() {
        this.f24788beachfront = 0;
    }

    @Override // cybernatic.monoploid
    public int saneness(byte[] bArr, int i, int i2) throws IOException {
        taiyuan taiyuanVar;
        int iMin;
        marial(i2);
        int i3 = this.f24789competently;
        int i4 = this.f24788beachfront;
        int i5 = i3 - i4;
        if (i5 == 0) {
            taiyuanVar = this;
            iMin = taiyuanVar.competently(this.f24791marial, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            taiyuanVar.f24789competently += iMin;
        } else {
            taiyuanVar = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(taiyuanVar.f24791marial, taiyuanVar.f24788beachfront, bArr, i, iMin);
        taiyuanVar.f24788beachfront += iMin;
        return iMin;
    }

    @Override // cybernatic.monoploid
    public int skip(int i) throws IOException {
        int iImpromptu = impromptu(i);
        if (iImpromptu == 0) {
            byte[] bArr = this.f24787attabal;
            iImpromptu = competently(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        wireman(iImpromptu);
        return iImpromptu;
    }

    @Override // cybernatic.monoploid
    public void skipFully(int i) throws IOException {
        taiyuan(i, false);
    }

    public boolean taiyuan(int i, boolean z) throws IOException {
        int iImpromptu = impromptu(i);
        while (iImpromptu < i && iImpromptu != -1) {
            iImpromptu = competently(this.f24787attabal, -iImpromptu, Math.min(i, this.f24787attabal.length + iImpromptu), iImpromptu, z);
        }
        wireman(iImpromptu);
        return iImpromptu != -1;
    }

    public final void wireman(int i) {
        if (i != -1) {
            this.f24793wireman += (long) i;
        }
    }

    @Override // cybernatic.monoploid
    public void peekFully(byte[] bArr, int i, int i2) throws IOException {
        peekFully(bArr, i, i2, false);
    }

    @Override // cybernatic.monoploid
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        readFully(bArr, i, i2, false);
    }

    @Override // cybernatic.monoploid
    public void advancePeekPosition(int i) throws IOException {
        advancePeekPosition(i, false);
    }
}
