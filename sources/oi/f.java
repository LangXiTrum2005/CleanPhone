package oi;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements xi.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f47446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f47448c = new AtomicBoolean(false);

    public f(FlutterJNI flutterJNI, int i10) {
        this.f47446a = flutterJNI;
        this.f47447b = i10;
    }

    @Override // xi.e
    public final void a(ByteBuffer byteBuffer) throws Throwable {
        if (this.f47448c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i10 = this.f47447b;
        FlutterJNI flutterJNI = this.f47446a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i10);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i10, byteBuffer, byteBuffer.position());
        }
    }
}
