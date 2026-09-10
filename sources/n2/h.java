package n2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1.i f46464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f46466d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f46469g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f46467e = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f46463a = new byte[4096];

    static {
        i1.z.a("media3.extractor");
    }

    public h(i1.i iVar, long j10, long j11) {
        this.f46464b = iVar;
        this.f46466d = j10;
        this.f46465c = j11;
    }

    @Override // n2.l
    public final void advancePeekPosition(int i10) {
        b(i10, false);
    }

    public final boolean b(int i10, boolean z10) {
        d(i10);
        int iE = this.f46469g - this.f46468f;
        while (iE < i10) {
            h hVar = this;
            int i11 = i10;
            boolean z11 = z10;
            iE = hVar.e(this.f46467e, this.f46468f, i11, iE, z11);
            if (iE == -1) {
                return false;
            }
            hVar.f46469g = hVar.f46468f + iE;
            this = hVar;
            i10 = i11;
            z10 = z11;
        }
        this.f46468f += i10;
        return true;
    }

    public final void d(int i10) {
        int i11 = this.f46468f + i10;
        byte[] bArr = this.f46467e;
        if (i11 > bArr.length) {
            this.f46467e = Arrays.copyOf(this.f46467e, l1.y.j(bArr.length * 2, C.DEFAULT_BUFFER_SEGMENT_SIZE + i11, i11 + 524288));
        }
    }

    public final int e(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f46464b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final void g(int i10) {
        int i11 = this.f46469g - i10;
        this.f46469g = i11;
        this.f46468f = 0;
        byte[] bArr = this.f46467e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f46467e = bArr2;
    }

    @Override // n2.l
    public final long getLength() {
        return this.f46465c;
    }

    @Override // n2.l
    public final long getPeekPosition() {
        return this.f46466d + ((long) this.f46468f);
    }

    @Override // n2.l
    public final long getPosition() {
        return this.f46466d;
    }

    @Override // n2.l
    public final boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) {
        if (!b(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f46467e, this.f46468f - i11, bArr, i10, i11);
        return true;
    }

    @Override // i1.i
    public final int read(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        h hVar;
        int i12 = this.f46469g;
        int iE = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f46467e, 0, bArr, i10, iMin);
            g(iMin);
            iE = iMin;
        }
        if (iE == 0) {
            hVar = this;
            iE = hVar.e(bArr, i10, i11, 0, true);
        } else {
            hVar = this;
        }
        if (iE != -1) {
            hVar.f46466d += (long) iE;
        }
        return iE;
    }

    @Override // n2.l
    public final void readFully(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        readFully(bArr, i10, i11, false);
    }

    @Override // n2.l
    public final void resetPeekPosition() {
        this.f46468f = 0;
    }

    @Override // n2.l
    public final int skip(int i10) throws EOFException, InterruptedIOException {
        h hVar;
        int iMin = Math.min(this.f46469g, i10);
        g(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f46463a;
            hVar = this;
            iMin = hVar.e(bArr, 0, Math.min(i10, bArr.length), 0, true);
        } else {
            hVar = this;
        }
        if (iMin != -1) {
            hVar.f46466d += (long) iMin;
        }
        return iMin;
    }

    @Override // n2.l
    public final void skipFully(int i10) throws EOFException, InterruptedIOException {
        skipFully(i10, false);
    }

    @Override // n2.l
    public final int w(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        h hVar;
        int iMin;
        d(i11);
        int i12 = this.f46469g;
        int i13 = this.f46468f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            hVar = this;
            iMin = hVar.e(this.f46467e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            hVar.f46469g += iMin;
        } else {
            hVar = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(hVar.f46467e, hVar.f46468f, bArr, i10, iMin);
        hVar.f46468f += iMin;
        return iMin;
    }

    @Override // n2.l
    public final boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iMin;
        int i12 = this.f46469g;
        if (i12 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i12, i11);
            System.arraycopy(this.f46467e, 0, bArr, i10, iMin);
            g(iMin);
        }
        int iE = iMin;
        while (iE < i11 && iE != -1) {
            iE = e(bArr, i10, i11, iE, z10);
        }
        if (iE != -1) {
            this.f46466d += (long) iE;
        }
        return iE != -1;
    }

    @Override // n2.l
    public final boolean skipFully(int i10, boolean z10) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f46469g, i10);
        g(iMin);
        int iE = iMin;
        while (iE < i10 && iE != -1) {
            byte[] bArr = this.f46463a;
            iE = e(bArr, -iE, Math.min(i10, bArr.length + iE), iE, z10);
        }
        if (iE != -1) {
            this.f46466d += (long) iE;
        }
        return iE != -1;
    }

    @Override // n2.l
    public final void peekFully(byte[] bArr, int i10, int i11) {
        peekFully(bArr, i10, i11, false);
    }
}
