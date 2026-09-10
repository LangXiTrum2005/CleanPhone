package androidx.media3.decoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class DecoderOutputBuffer extends Buffer {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public long f5802Y;
    public int Z;
    public boolean e0;

    public interface Owner<S extends DecoderOutputBuffer> {
    }

    public void d() {
        this.X = 0;
        this.f5802Y = 0L;
        this.Z = 0;
        this.e0 = false;
    }

    public abstract void f();
}
