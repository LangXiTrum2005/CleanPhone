package uniterm;

import java.io.OutputStream;

/* JADX INFO: compiled from: LengthCountingOutputStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal extends OutputStream {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public long f39229kowloon = 0;

    public long attabal() {
        return this.f39229kowloon;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f39229kowloon++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f39229kowloon += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.f39229kowloon += (long) i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
