package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoder;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes3.dex */
abstract class CeaDecoder implements SubtitleDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f18520a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f18521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityQueue f18522c;
    public CeaInputBuffer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18523e;
    public long f;

    public static final class CeaInputBuffer extends SubtitleInputBuffer implements Comparable<CeaInputBuffer> {
        public long j0;

        @Override // java.lang.Comparable
        public final int compareTo(CeaInputBuffer ceaInputBuffer) {
            CeaInputBuffer ceaInputBuffer2 = ceaInputBuffer;
            if (b(4) != ceaInputBuffer2.b(4)) {
                return b(4) ? 1 : -1;
            }
            long j = this.f0 - ceaInputBuffer2.f0;
            if (j == 0) {
                j = this.j0 - ceaInputBuffer2.j0;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    public static final class CeaOutputBuffer extends SubtitleOutputBuffer {
        public b g0;

        @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
        public final void d() {
            b bVar = this.g0;
            bVar.getClass();
            CeaDecoder ceaDecoder = bVar.f18524a;
            ceaDecoder.getClass();
            this.X = 0;
            this.e0 = null;
            ceaDecoder.f18521b.add(this);
        }
    }

    public CeaDecoder() {
        for (int i2 = 0; i2 < 10; i2++) {
            this.f18520a.add(new CeaInputBuffer(1));
        }
        this.f18521b = new ArrayDeque();
        for (int i3 = 0; i3 < 2; i3++) {
            ArrayDeque arrayDeque = this.f18521b;
            b bVar = new b(this);
            CeaOutputBuffer ceaOutputBuffer = new CeaOutputBuffer();
            ceaOutputBuffer.g0 = bVar;
            arrayDeque.add(ceaOutputBuffer);
        }
        this.f18522c = new PriorityQueue();
    }

    public abstract Subtitle a();

    public abstract void b(SubtitleInputBuffer subtitleInputBuffer);

    @Override // com.google.android.exoplayer2.decoder.Decoder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SubtitleOutputBuffer dequeueOutputBuffer() {
        ArrayDeque arrayDeque = this.f18521b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f18522c;
            if (priorityQueue.isEmpty()) {
                return null;
            }
            CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) priorityQueue.peek();
            int i2 = Util.f18979a;
            if (ceaInputBuffer.f0 > this.f18523e) {
                return null;
            }
            CeaInputBuffer ceaInputBuffer2 = (CeaInputBuffer) priorityQueue.poll();
            boolean zB = ceaInputBuffer2.b(4);
            ArrayDeque arrayDeque2 = this.f18520a;
            if (zB) {
                SubtitleOutputBuffer subtitleOutputBuffer = (SubtitleOutputBuffer) arrayDeque.pollFirst();
                subtitleOutputBuffer.a(4);
                ceaInputBuffer2.d();
                arrayDeque2.add(ceaInputBuffer2);
                return subtitleOutputBuffer;
            }
            b(ceaInputBuffer2);
            if (d()) {
                Subtitle subtitleA = a();
                SubtitleOutputBuffer subtitleOutputBuffer2 = (SubtitleOutputBuffer) arrayDeque.pollFirst();
                subtitleOutputBuffer2.f(ceaInputBuffer2.f0, subtitleA, Long.MAX_VALUE);
                ceaInputBuffer2.d();
                arrayDeque2.add(ceaInputBuffer2);
                return subtitleOutputBuffer2;
            }
            ceaInputBuffer2.d();
            arrayDeque2.add(ceaInputBuffer2);
        }
    }

    public abstract boolean d();

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final Object dequeueInputBuffer() {
        Assertions.d(this.d == null);
        ArrayDeque arrayDeque = this.f18520a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) arrayDeque.pollFirst();
        this.d = ceaInputBuffer;
        return ceaInputBuffer;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.f18523e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f18522c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f18520a;
            if (zIsEmpty) {
                break;
            }
            CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) priorityQueue.poll();
            int i2 = Util.f18979a;
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

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final void queueInputBuffer(Object obj) {
        SubtitleInputBuffer subtitleInputBuffer = (SubtitleInputBuffer) obj;
        Assertions.b(subtitleInputBuffer == this.d);
        CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) subtitleInputBuffer;
        if (ceaInputBuffer.b(Integer.MIN_VALUE)) {
            ceaInputBuffer.d();
            this.f18520a.add(ceaInputBuffer);
        } else {
            long j = this.f;
            this.f = 1 + j;
            ceaInputBuffer.j0 = j;
            this.f18522c.add(ceaInputBuffer);
        }
        this.d = null;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void release() {
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long j) {
        this.f18523e = j;
    }
}
