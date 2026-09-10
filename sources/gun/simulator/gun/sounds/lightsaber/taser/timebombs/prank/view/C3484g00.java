package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.AbstractC2126l;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.g00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3484g00 extends InputStream {
    private AbstractC2126l currentPiece;
    private int currentPieceIndex;
    private int currentPieceOffsetInRope;
    private int currentPieceSize;
    private int mark;
    private C3396f00 pieceIterator;
    final /* synthetic */ com.google.protobuf.C0 this$0;

    public C3484g00(com.google.protobuf.C0 c0) {
        this.this$0 = c0;
        initialize();
    }

    private void advanceIfCurrentPieceFullyRead() {
        if (this.currentPiece != null) {
            int i = this.currentPieceIndex;
            int i2 = this.currentPieceSize;
            if (i == i2) {
                this.currentPieceOffsetInRope += i2;
                this.currentPieceIndex = 0;
                if (!this.pieceIterator.hasNext()) {
                    this.currentPiece = null;
                    this.currentPieceSize = 0;
                } else {
                    AbstractC2126l next = this.pieceIterator.next();
                    this.currentPiece = next;
                    this.currentPieceSize = next.size();
                }
            }
        }
    }

    private int availableInternal() {
        return this.this$0.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex);
    }

    private void initialize() {
        C3396f00 c3396f00 = new C3396f00(this.this$0, null);
        this.pieceIterator = c3396f00;
        AbstractC2126l next = c3396f00.next();
        this.currentPiece = next;
        this.currentPieceSize = next.size();
        this.currentPieceIndex = 0;
        this.currentPieceOffsetInRope = 0;
    }

    private int readSkipInternal(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            advanceIfCurrentPieceFullyRead();
            if (this.currentPiece == null) {
                break;
            }
            int iMin = Math.min(this.currentPieceSize - this.currentPieceIndex, i3);
            if (bArr != null) {
                this.currentPiece.copyTo(bArr, this.currentPieceIndex, i, iMin);
                i += iMin;
            }
            this.currentPieceIndex += iMin;
            i3 -= iMin;
        }
        return i2 - i3;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return availableInternal();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        int skipInternal = readSkipInternal(bArr, i, i2);
        if (skipInternal != 0) {
            return skipInternal;
        }
        if (i2 > 0 || availableInternal() == 0) {
            return -1;
        }
        return skipInternal;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        initialize();
        readSkipInternal(null, 0, this.mark);
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return readSkipInternal(null, 0, (int) j);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        advanceIfCurrentPieceFullyRead();
        AbstractC2126l abstractC2126l = this.currentPiece;
        if (abstractC2126l == null) {
            return -1;
        }
        int i = this.currentPieceIndex;
        this.currentPieceIndex = i + 1;
        return abstractC2126l.byteAt(i) & 255;
    }
}
