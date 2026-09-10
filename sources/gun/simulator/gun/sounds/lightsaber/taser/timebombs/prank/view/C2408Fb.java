package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2408Fb extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f3072a;
    public byte[] b;
    public final C4391qK c;
    public int d;

    public C2408Fb(FileOutputStream fileOutputStream, C4391qK c4391qK) {
        this.f3072a = fileOutputStream;
        this.c = c4391qK;
        this.b = (byte[]) c4391qK.d(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OutputStream outputStream = this.f3072a;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.b;
            if (bArr != null) {
                this.c.h(bArr);
                this.b = null;
            }
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.d;
        OutputStream outputStream = this.f3072a;
        if (i > 0) {
            outputStream.write(this.b, 0, i);
            this.d = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.d;
            OutputStream outputStream = this.f3072a;
            if (i6 == 0 && i4 >= this.b.length) {
                outputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.b.length - i6);
            System.arraycopy(bArr, i5, this.b, this.d, iMin);
            int i7 = this.d + iMin;
            this.d = i7;
            i3 += iMin;
            byte[] bArr2 = this.b;
            if (i7 == bArr2.length && i7 > 0) {
                outputStream.write(bArr2, 0, i7);
                this.d = 0;
            }
        } while (i3 < i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.b;
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f3072a.write(bArr, 0, i3);
        this.d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
