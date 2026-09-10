package c6;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.pb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5947a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5948b;

    public e(pb pbVar, int i10) {
        this.f5948b = pbVar;
        ((ByteArrayOutputStream) this).buf = pbVar.f(Math.max(i10, NotificationCompat.FLAG_LOCAL_ONLY));
    }

    public void a(int i10) {
        int i11 = ((ByteArrayOutputStream) this).count;
        if (i11 + i10 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        pb pbVar = (pb) this.f5948b;
        int i12 = i11 + i10;
        byte[] bArrF = pbVar.f(i12 + i12);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrF, 0, ((ByteArrayOutputStream) this).count);
        pbVar.l(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrF;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f5947a) {
            case 1:
                ((pb) this.f5948b).l(((ByteArrayOutputStream) this).buf);
                ((ByteArrayOutputStream) this).buf = null;
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    public void finalize() throws Throwable {
        switch (this.f5947a) {
            case 1:
                ((pb) this.f5948b).l(((ByteArrayOutputStream) this).buf);
                break;
            default:
                super.finalize();
                break;
        }
    }

    @Override // java.io.ByteArrayOutputStream
    public String toString() {
        switch (this.f5947a) {
            case 0:
                int i10 = ((ByteArrayOutputStream) this).count;
                if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                    i10--;
                }
                try {
                    return new String(((ByteArrayOutputStream) this).buf, 0, i10, ((f) this.f5948b).f5950b.name());
                } catch (UnsupportedEncodingException e10) {
                    throw new AssertionError(e10);
                }
            default:
                return super.toString();
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i10) {
        switch (this.f5947a) {
            case 1:
                synchronized (this) {
                    a(1);
                    super.write(i10);
                }
                return;
            default:
                super.write(i10);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, int i10) {
        super(i10);
        this.f5948b = fVar;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) {
        switch (this.f5947a) {
            case 1:
                synchronized (this) {
                    a(i11);
                    super.write(bArr, i10, i11);
                }
                return;
            default:
                super.write(bArr, i10, i11);
                return;
        }
    }
}
