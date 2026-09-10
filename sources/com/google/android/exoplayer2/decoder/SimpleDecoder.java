package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderOutputBuffer;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends DecoderOutputBuffer, E extends DecoderException> implements Decoder<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread f17439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17440b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f17441c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DecoderInputBuffer[] f17442e;
    public final DecoderOutputBuffer[] f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DecoderInputBuffer f17444i;
    public DecoderException j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17445l;
    public int m;

    public SimpleDecoder(DecoderInputBuffer[] decoderInputBufferArr, DecoderOutputBuffer[] decoderOutputBufferArr) {
        this.f17442e = decoderInputBufferArr;
        this.g = decoderInputBufferArr.length;
        for (int i2 = 0; i2 < this.g; i2++) {
            this.f17442e[i2] = new SubtitleInputBuffer(1);
        }
        this.f = decoderOutputBufferArr;
        this.f17443h = decoderOutputBufferArr.length;
        for (int i3 = 0; i3 < this.f17443h; i3++) {
            this.f[i3] = a();
        }
        final SimpleSubtitleDecoder simpleSubtitleDecoder = (SimpleSubtitleDecoder) this;
        Thread thread = new Thread() { // from class: com.google.android.exoplayer2.decoder.SimpleDecoder.1
            {
                super("ExoPlayer:SimpleDecoder");
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                do {
                    try {
                    } catch (InterruptedException e2) {
                        throw new IllegalStateException(e2);
                    }
                } while (simpleSubtitleDecoder.d());
            }
        };
        this.f17439a = thread;
        thread.start();
    }

    public abstract DecoderOutputBuffer a();

    public abstract SubtitleDecoderException b(Throwable th);

    public abstract SubtitleDecoderException c(DecoderInputBuffer decoderInputBuffer, DecoderOutputBuffer decoderOutputBuffer, boolean z2);

    public final boolean d() {
        SubtitleDecoderException subtitleDecoderExceptionB;
        synchronized (this.f17440b) {
            while (!this.f17445l) {
                try {
                    if (!this.f17441c.isEmpty() && this.f17443h > 0) {
                        break;
                    }
                    this.f17440b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f17445l) {
                return false;
            }
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) this.f17441c.removeFirst();
            DecoderOutputBuffer[] decoderOutputBufferArr = this.f;
            int i2 = this.f17443h - 1;
            this.f17443h = i2;
            DecoderOutputBuffer decoderOutputBuffer = decoderOutputBufferArr[i2];
            boolean z2 = this.k;
            this.k = false;
            if (decoderInputBuffer.b(4)) {
                decoderOutputBuffer.a(4);
            } else {
                if (decoderInputBuffer.b(Integer.MIN_VALUE)) {
                    decoderOutputBuffer.a(Integer.MIN_VALUE);
                }
                if (decoderInputBuffer.b(134217728)) {
                    decoderOutputBuffer.a(134217728);
                }
                try {
                    subtitleDecoderExceptionB = c(decoderInputBuffer, decoderOutputBuffer, z2);
                } catch (OutOfMemoryError e2) {
                    subtitleDecoderExceptionB = b(e2);
                } catch (RuntimeException e3) {
                    subtitleDecoderExceptionB = b(e3);
                }
                if (subtitleDecoderExceptionB != null) {
                    synchronized (this.f17440b) {
                        this.j = subtitleDecoderExceptionB;
                    }
                    return false;
                }
            }
            synchronized (this.f17440b) {
                try {
                    if (this.k) {
                        decoderOutputBuffer.d();
                    } else if (decoderOutputBuffer.b(Integer.MIN_VALUE)) {
                        this.m++;
                        decoderOutputBuffer.d();
                    } else {
                        decoderOutputBuffer.Z = this.m;
                        this.m = 0;
                        this.d.addLast(decoderOutputBuffer);
                    }
                    decoderInputBuffer.d();
                    int i3 = this.g;
                    this.g = i3 + 1;
                    this.f17442e[i3] = decoderInputBuffer;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final Object dequeueInputBuffer() {
        DecoderInputBuffer decoderInputBuffer;
        synchronized (this.f17440b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                Assertions.d(this.f17444i == null);
                int i2 = this.g;
                if (i2 == 0) {
                    decoderInputBuffer = null;
                } else {
                    DecoderInputBuffer[] decoderInputBufferArr = this.f17442e;
                    int i3 = i2 - 1;
                    this.g = i3;
                    decoderInputBuffer = decoderInputBufferArr[i3];
                }
                this.f17444i = decoderInputBuffer;
            } catch (Throwable th) {
                throw th;
            }
        }
        return decoderInputBuffer;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final Object dequeueOutputBuffer() {
        synchronized (this.f17440b) {
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

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final void flush() {
        synchronized (this.f17440b) {
            try {
                this.k = true;
                this.m = 0;
                DecoderInputBuffer decoderInputBuffer = this.f17444i;
                if (decoderInputBuffer != null) {
                    decoderInputBuffer.d();
                    int i2 = this.g;
                    this.g = i2 + 1;
                    this.f17442e[i2] = decoderInputBuffer;
                    this.f17444i = null;
                }
                while (!this.f17441c.isEmpty()) {
                    DecoderInputBuffer decoderInputBuffer2 = (DecoderInputBuffer) this.f17441c.removeFirst();
                    decoderInputBuffer2.d();
                    int i3 = this.g;
                    this.g = i3 + 1;
                    this.f17442e[i3] = decoderInputBuffer2;
                }
                while (!this.d.isEmpty()) {
                    ((DecoderOutputBuffer) this.d.removeFirst()).d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final void queueInputBuffer(Object obj) {
        DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) obj;
        synchronized (this.f17440b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                Assertions.b(decoderInputBuffer == this.f17444i);
                this.f17441c.addLast(decoderInputBuffer);
                if (!this.f17441c.isEmpty() && this.f17443h > 0) {
                    this.f17440b.notify();
                }
                this.f17444i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final void release() {
        synchronized (this.f17440b) {
            this.f17445l = true;
            this.f17440b.notify();
        }
        try {
            this.f17439a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
