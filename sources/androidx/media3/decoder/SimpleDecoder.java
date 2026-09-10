package androidx.media3.decoder;

import androidx.media3.common.util.Assertions;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.DecoderOutputBuffer;
import androidx.media3.exoplayer.image.ImageOutputBuffer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends DecoderOutputBuffer, E extends DecoderException> implements Decoder<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread f5803a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DecoderInputBuffer[] f5806e;
    public final DecoderOutputBuffer[] f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DecoderInputBuffer f5808i;
    public DecoderException j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5809l;
    public int m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5804b = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f5810n = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f5805c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public SimpleDecoder(DecoderInputBuffer[] decoderInputBufferArr, DecoderOutputBuffer[] decoderOutputBufferArr) {
        this.f5806e = decoderInputBufferArr;
        this.g = decoderInputBufferArr.length;
        for (int i2 = 0; i2 < this.g; i2++) {
            this.f5806e[i2] = c();
        }
        this.f = decoderOutputBufferArr;
        this.f5807h = decoderOutputBufferArr.length;
        for (int i3 = 0; i3 < this.f5807h; i3++) {
            this.f[i3] = d();
        }
        Thread thread = new Thread() { // from class: androidx.media3.decoder.SimpleDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                do {
                    try {
                    } catch (InterruptedException e2) {
                        throw new IllegalStateException(e2);
                    }
                } while (SimpleDecoder.this.g());
            }
        };
        this.f5803a = thread;
        thread.start();
    }

    @Override // androidx.media3.decoder.Decoder
    public final void a(long j) {
        synchronized (this.f5804b) {
            try {
                Assertions.e(this.g == this.f5806e.length || this.k);
                this.f5810n = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.decoder.Decoder
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void queueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        synchronized (this.f5804b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                Assertions.b(decoderInputBuffer == this.f5808i);
                this.f5805c.addLast(decoderInputBuffer);
                if (!this.f5805c.isEmpty() && this.f5807h > 0) {
                    this.f5804b.notify();
                }
                this.f5808i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract DecoderInputBuffer c();

    public abstract DecoderOutputBuffer d();

    @Override // androidx.media3.decoder.Decoder
    public final Object dequeueInputBuffer() {
        DecoderInputBuffer decoderInputBuffer;
        synchronized (this.f5804b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                Assertions.e(this.f5808i == null);
                int i2 = this.g;
                if (i2 == 0) {
                    decoderInputBuffer = null;
                } else {
                    DecoderInputBuffer[] decoderInputBufferArr = this.f5806e;
                    int i3 = i2 - 1;
                    this.g = i3;
                    decoderInputBuffer = decoderInputBufferArr[i3];
                }
                this.f5808i = decoderInputBuffer;
            } catch (Throwable th) {
                throw th;
            }
        }
        return decoderInputBuffer;
    }

    public abstract DecoderException e(Throwable th);

    public abstract DecoderException f(DecoderInputBuffer decoderInputBuffer, DecoderOutputBuffer decoderOutputBuffer, boolean z2);

    @Override // androidx.media3.decoder.Decoder
    public final void flush() {
        synchronized (this.f5804b) {
            try {
                this.k = true;
                this.m = 0;
                DecoderInputBuffer decoderInputBuffer = this.f5808i;
                if (decoderInputBuffer != null) {
                    decoderInputBuffer.d();
                    int i2 = this.g;
                    this.g = i2 + 1;
                    this.f5806e[i2] = decoderInputBuffer;
                    this.f5808i = null;
                }
                while (!this.f5805c.isEmpty()) {
                    DecoderInputBuffer decoderInputBuffer2 = (DecoderInputBuffer) this.f5805c.removeFirst();
                    decoderInputBuffer2.d();
                    int i3 = this.g;
                    this.g = i3 + 1;
                    this.f5806e[i3] = decoderInputBuffer2;
                }
                while (!this.d.isEmpty()) {
                    ((DecoderOutputBuffer) this.d.removeFirst()).f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g() {
        boolean z2;
        DecoderException decoderExceptionE;
        synchronized (this.f5804b) {
            while (!this.f5809l) {
                try {
                    if (!this.f5805c.isEmpty() && this.f5807h > 0) {
                        break;
                    }
                    this.f5804b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f5809l) {
                return false;
            }
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) this.f5805c.removeFirst();
            DecoderOutputBuffer[] decoderOutputBufferArr = this.f;
            int i2 = this.f5807h - 1;
            this.f5807h = i2;
            DecoderOutputBuffer decoderOutputBuffer = decoderOutputBufferArr[i2];
            boolean z3 = this.k;
            this.k = false;
            if (decoderInputBuffer.b(4)) {
                decoderOutputBuffer.a(4);
            } else {
                decoderOutputBuffer.f5802Y = decoderInputBuffer.g0;
                if (decoderInputBuffer.b(134217728)) {
                    decoderOutputBuffer.a(134217728);
                }
                long j = decoderInputBuffer.g0;
                synchronized (this.f5804b) {
                    long j2 = this.f5810n;
                    z2 = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z2) {
                    decoderOutputBuffer.e0 = true;
                }
                try {
                    decoderExceptionE = f(decoderInputBuffer, decoderOutputBuffer, z3);
                } catch (OutOfMemoryError e2) {
                    decoderExceptionE = e(e2);
                } catch (RuntimeException e3) {
                    decoderExceptionE = e(e3);
                }
                if (decoderExceptionE != null) {
                    synchronized (this.f5804b) {
                        this.j = decoderExceptionE;
                    }
                    return false;
                }
            }
            synchronized (this.f5804b) {
                try {
                    if (this.k) {
                        decoderOutputBuffer.f();
                    } else if (decoderOutputBuffer.e0) {
                        this.m++;
                        decoderOutputBuffer.f();
                    } else {
                        decoderOutputBuffer.Z = this.m;
                        this.m = 0;
                        this.d.addLast(decoderOutputBuffer);
                    }
                    decoderInputBuffer.d();
                    int i3 = this.g;
                    this.g = i3 + 1;
                    this.f5806e[i3] = decoderInputBuffer;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // androidx.media3.decoder.Decoder
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final DecoderOutputBuffer dequeueOutputBuffer() {
        synchronized (this.f5804b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (DecoderOutputBuffer) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(DecoderOutputBuffer decoderOutputBuffer) {
        synchronized (this.f5804b) {
            decoderOutputBuffer.d();
            int i2 = this.f5807h;
            this.f5807h = i2 + 1;
            this.f[i2] = decoderOutputBuffer;
            if (!this.f5805c.isEmpty() && this.f5807h > 0) {
                this.f5804b.notify();
            }
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void release() {
        synchronized (this.f5804b) {
            this.f5809l = true;
            this.f5804b.notify();
        }
        try {
            this.f5803a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public /* bridge */ /* synthetic */ ImageOutputBuffer dequeueOutputBuffer() {
        return (ImageOutputBuffer) dequeueOutputBuffer();
    }
}
