package cybernatic;

import java.io.IOException;

/* JADX INFO: compiled from: ForwardingExtractorInput.java */
/* JADX INFO: loaded from: classes.dex */
public class cord implements monoploid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final monoploid f24612attabal;

    public cord(monoploid monoploidVar) {
        this.f24612attabal = monoploidVar;
    }

    @Override // cybernatic.monoploid
    public boolean advancePeekPosition(int i, boolean z) throws IOException {
        return this.f24612attabal.advancePeekPosition(i, z);
    }

    @Override // cybernatic.monoploid
    public long getLength() {
        return this.f24612attabal.getLength();
    }

    @Override // cybernatic.monoploid
    public long getPeekPosition() {
        return this.f24612attabal.getPeekPosition();
    }

    @Override // cybernatic.monoploid
    public long getPosition() {
        return this.f24612attabal.getPosition();
    }

    @Override // cybernatic.monoploid
    public boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.f24612attabal.peekFully(bArr, i, i2, z);
    }

    @Override // cybernatic.monoploid, androidx.media3.common.taiyuan
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f24612attabal.read(bArr, i, i2);
    }

    @Override // cybernatic.monoploid
    public boolean readFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.f24612attabal.readFully(bArr, i, i2, z);
    }

    @Override // cybernatic.monoploid
    public void resetPeekPosition() {
        this.f24612attabal.resetPeekPosition();
    }

    @Override // cybernatic.monoploid
    public int saneness(byte[] bArr, int i, int i2) throws IOException {
        return this.f24612attabal.saneness(bArr, i, i2);
    }

    @Override // cybernatic.monoploid
    public int skip(int i) throws IOException {
        return this.f24612attabal.skip(i);
    }

    @Override // cybernatic.monoploid
    public void skipFully(int i) throws IOException {
        this.f24612attabal.skipFully(i);
    }

    @Override // cybernatic.monoploid
    public void advancePeekPosition(int i) throws IOException {
        this.f24612attabal.advancePeekPosition(i);
    }

    @Override // cybernatic.monoploid
    public void peekFully(byte[] bArr, int i, int i2) throws IOException {
        this.f24612attabal.peekFully(bArr, i, i2);
    }

    @Override // cybernatic.monoploid
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f24612attabal.readFully(bArr, i, i2);
    }
}
