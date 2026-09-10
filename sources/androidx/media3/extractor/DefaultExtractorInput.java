package androidx.media3.extractor;

import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultExtractorInput implements ExtractorInput {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataSource f6740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6741c;
    public long d;
    public int f;
    public int g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f6742e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f6739a = new byte[4096];

    static {
        MediaLibraryInfo.a("media3.extractor");
    }

    public DefaultExtractorInput(DataSource dataSource, long j, long j2) {
        this.f6740b = dataSource;
        this.d = j;
        this.f6741c = j2;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void advancePeekPosition(int i2) throws EOFException, InterruptedIOException {
        c(i2, false);
    }

    public final boolean c(int i2, boolean z2) throws EOFException, InterruptedIOException {
        d(i2);
        int iF = this.g - this.f;
        while (iF < i2) {
            int i3 = i2;
            boolean z3 = z2;
            iF = f(this.f6742e, this.f, i3, iF, z3);
            if (iF == -1) {
                return false;
            }
            this.g = this.f + iF;
            i2 = i3;
            z2 = z3;
        }
        this.f += i2;
        return true;
    }

    public final void d(int i2) {
        int i3 = this.f + i2;
        byte[] bArr = this.f6742e;
        if (i3 > bArr.length) {
            this.f6742e = Arrays.copyOf(this.f6742e, Util.j(bArr.length * 2, 65536 + i3, i3 + 524288));
        }
    }

    public final int e(int i2, int i3, byte[] bArr) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int iMin;
        d(i3);
        int i4 = this.g;
        int i5 = this.f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            defaultExtractorInput = this;
            iMin = defaultExtractorInput.f(this.f6742e, i5, i3, 0, true);
            if (iMin == -1) {
                return -1;
            }
            defaultExtractorInput.g += iMin;
        } else {
            defaultExtractorInput = this;
            iMin = Math.min(i3, i6);
        }
        System.arraycopy(defaultExtractorInput.f6742e, defaultExtractorInput.f, bArr, i2, iMin);
        defaultExtractorInput.f += iMin;
        return iMin;
    }

    public final int f(byte[] bArr, int i2, int i3, int i4, boolean z2) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i5 = this.f6740b.read(bArr, i2 + i4, i3 - i4);
        if (i5 != -1) {
            return i4 + i5;
        }
        if (i4 == 0 && z2) {
            return -1;
        }
        throw new EOFException();
    }

    public final int g(int i2) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int iMin = Math.min(this.g, i2);
        h(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f6739a;
            defaultExtractorInput = this;
            iMin = defaultExtractorInput.f(bArr, 0, Math.min(i2, bArr.length), 0, true);
        } else {
            defaultExtractorInput = this;
        }
        if (iMin != -1) {
            defaultExtractorInput.d += (long) iMin;
        }
        return iMin;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final long getLength() {
        return this.f6741c;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final long getPeekPosition() {
        return this.d + ((long) this.f);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final long getPosition() {
        return this.d;
    }

    public final void h(int i2) {
        int i3 = this.g - i2;
        this.g = i3;
        this.f = 0;
        byte[] bArr = this.f6742e;
        byte[] bArr2 = i3 < bArr.length - 524288 ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.f6742e = bArr2;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final boolean peekFully(byte[] bArr, int i2, int i3, boolean z2) {
        if (!c(i3, z2)) {
            return false;
        }
        System.arraycopy(this.f6742e, this.f - i3, bArr, i2, i3);
        return true;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int i4 = this.g;
        int iF = 0;
        if (i4 != 0) {
            int iMin = Math.min(i4, i3);
            System.arraycopy(this.f6742e, 0, bArr, i2, iMin);
            h(iMin);
            iF = iMin;
        }
        if (iF == 0) {
            defaultExtractorInput = this;
            iF = defaultExtractorInput.f(bArr, i2, i3, 0, true);
        } else {
            defaultExtractorInput = this;
        }
        if (iF != -1) {
            defaultExtractorInput.d += (long) iF;
        }
        return iF;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void readFully(byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        readFully(bArr, i2, i3, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void resetPeekPosition() {
        this.f = 0;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void skipFully(int i2) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.g, i2);
        h(iMin);
        int iF = iMin;
        while (iF < i2 && iF != -1) {
            byte[] bArr = this.f6739a;
            iF = f(bArr, -iF, Math.min(i2, bArr.length + iF), iF, false);
        }
        if (iF != -1) {
            this.d += (long) iF;
        }
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final boolean readFully(byte[] bArr, int i2, int i3, boolean z2) throws EOFException, InterruptedIOException {
        int iMin;
        int i4 = this.g;
        if (i4 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i4, i3);
            System.arraycopy(this.f6742e, 0, bArr, i2, iMin);
            h(iMin);
        }
        int iF = iMin;
        while (iF < i3 && iF != -1) {
            iF = f(bArr, i2, i3, iF, z2);
        }
        if (iF != -1) {
            this.d += (long) iF;
        }
        return iF != -1;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void peekFully(byte[] bArr, int i2, int i3) {
        peekFully(bArr, i2, i3, false);
    }
}
