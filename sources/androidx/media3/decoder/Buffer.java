package androidx.media3.decoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class Buffer {
    public int X;

    public final void a(int i2) {
        this.X = i2 | this.X;
    }

    public final boolean b(int i2) {
        return (this.X & i2) == i2;
    }
}
