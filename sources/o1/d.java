package o1;

import com.google.android.gms.internal.ads.qx1;
import com.google.android.gms.internal.ads.z01;
import i1.p;
import i1.z;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class d extends z01 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f47033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qx1 f47034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f47035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f47037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteBuffer f47038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f47039i;

    static {
        z.a("media3.decoder");
    }

    public d(int i10) {
        super(3);
        this.f47034d = new qx1(1);
        this.f47039i = i10;
    }

    public void g() {
        this.f22444b = 0;
        ByteBuffer byteBuffer = this.f47035e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f47038h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f47036f = false;
    }

    public final ByteBuffer h(int i10) {
        int i11 = this.f47039i;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f47035e;
        throw new c(l1.d.f("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i10, ")"));
    }

    public final void i(int i10) {
        ByteBuffer byteBuffer = this.f47035e;
        if (byteBuffer == null) {
            this.f47035e = h(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            this.f47035e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferH = h(i11);
        byteBufferH.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferH.put(byteBuffer);
        }
        this.f47035e = byteBufferH;
    }

    public final void j() {
        ByteBuffer byteBuffer = this.f47035e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f47038h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
