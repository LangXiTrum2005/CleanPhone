package androidx.media3.extractor.text.cea;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoder;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
abstract class CeaDecoder implements SubtitleDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f7276a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f7277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityQueue f7278c;
    public CeaInputBuffer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7279e;
    public long f;
    public long g;

    public static final class CeaInputBuffer extends SubtitleInputBuffer implements Comparable<CeaInputBuffer> {
        public long k0;

        @Override // java.lang.Comparable
        public final int compareTo(CeaInputBuffer ceaInputBuffer) {
            CeaInputBuffer ceaInputBuffer2 = ceaInputBuffer;
            if (b(4) != ceaInputBuffer2.b(4)) {
                return b(4) ? 1 : -1;
            }
            long j = this.g0 - ceaInputBuffer2.g0;
            if (j == 0) {
                j = this.k0 - ceaInputBuffer2.k0;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    public static final class CeaOutputBuffer extends SubtitleOutputBuffer {
        public b h0;

        @Override // androidx.media3.decoder.DecoderOutputBuffer
        public final void f() {
            b bVar = this.h0;
            bVar.getClass();
            CeaDecoder ceaDecoder = bVar.f7280a;
            ceaDecoder.getClass();
            d();
            ceaDecoder.f7277b.add(this);
        }
    }

    public CeaDecoder() {
        for (int i2 = 0; i2 < 10; i2++) {
            this.f7276a.add(new CeaInputBuffer(1));
        }
        this.f7277b = new ArrayDeque();
        for (int i3 = 0; i3 < 2; i3++) {
            ArrayDeque arrayDeque = this.f7277b;
            b bVar = new b(this);
            CeaOutputBuffer ceaOutputBuffer = new CeaOutputBuffer();
            ceaOutputBuffer.h0 = bVar;
            arrayDeque.add(ceaOutputBuffer);
        }
        this.f7278c = new PriorityQueue();
        this.g = -9223372036854775807L;
    }

    @Override // androidx.media3.decoder.Decoder
    public final void a(long j) {
        this.g = j;
    }

    public abstract Subtitle c();

    public abstract void d(SubtitleInputBuffer subtitleInputBuffer);

    @Override // androidx.media3.decoder.Decoder
    public final Object dequeueInputBuffer() {
        Assertions.e(this.d == null);
        ArrayDeque arrayDeque = this.f7276a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) arrayDeque.pollFirst();
        this.d = ceaInputBuffer;
        return ceaInputBuffer;
    }

    @Override // androidx.media3.decoder.Decoder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SubtitleOutputBuffer dequeueOutputBuffer() {
        ArrayDeque arrayDeque = this.f7277b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f7278c;
            if (priorityQueue.isEmpty()) {
                return null;
            }
            CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) priorityQueue.peek();
            int i2 = Util.f5683a;
            if (ceaInputBuffer.g0 > this.f7279e) {
                return null;
            }
            CeaInputBuffer ceaInputBuffer2 = (CeaInputBuffer) priorityQueue.poll();
            boolean zB = ceaInputBuffer2.b(4);
            ArrayDeque arrayDeque2 = this.f7276a;
            if (zB) {
                SubtitleOutputBuffer subtitleOutputBuffer = (SubtitleOutputBuffer) arrayDeque.pollFirst();
                subtitleOutputBuffer.a(4);
                ceaInputBuffer2.d();
                arrayDeque2.add(ceaInputBuffer2);
                return subtitleOutputBuffer;
            }
            d(ceaInputBuffer2);
            if (f()) {
                Subtitle subtitleC = c();
                SubtitleOutputBuffer subtitleOutputBuffer2 = (SubtitleOutputBuffer) arrayDeque.pollFirst();
                long j = ceaInputBuffer2.g0;
                subtitleOutputBuffer2.f5802Y = j;
                subtitleOutputBuffer2.f0 = subtitleC;
                subtitleOutputBuffer2.g0 = j;
                ceaInputBuffer2.d();
                arrayDeque2.add(ceaInputBuffer2);
                return subtitleOutputBuffer2;
            }
            ceaInputBuffer2.d();
            arrayDeque2.add(ceaInputBuffer2);
        }
    }

    public abstract boolean f();

    @Override // androidx.media3.decoder.Decoder
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.f7279e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f7278c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f7276a;
            if (zIsEmpty) {
                break;
            }
            CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) priorityQueue.poll();
            int i2 = Util.f5683a;
            ceaInputBuffer.d();
            arrayDeque.add(ceaInputBuffer);
        }
        CeaInputBuffer ceaInputBuffer2 = this.d;
        if (ceaInputBuffer2 != null) {
            ceaInputBuffer2.d();
            arrayDeque.add(ceaInputBuffer2);
            this.d = null;
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void queueInputBuffer(Object obj) {
        SubtitleInputBuffer subtitleInputBuffer = (SubtitleInputBuffer) obj;
        Assertions.b(subtitleInputBuffer == this.d);
        CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) subtitleInputBuffer;
        long j = this.g;
        if (j == -9223372036854775807L || ceaInputBuffer.g0 >= j) {
            long j2 = this.f;
            this.f = 1 + j2;
            ceaInputBuffer.k0 = j2;
            this.f7278c.add(ceaInputBuffer);
        } else {
            ceaInputBuffer.d();
            this.f7276a.add(ceaInputBuffer);
        }
        this.d = null;
    }

    @Override // androidx.media3.decoder.Decoder
    public void release() {
    }

    @Override // androidx.media3.extractor.text.SubtitleDecoder
    public void setPositionUs(long j) {
        this.f7279e = j;
    }
}
