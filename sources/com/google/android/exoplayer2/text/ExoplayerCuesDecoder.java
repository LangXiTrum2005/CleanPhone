package com.google.android.exoplayer2.text;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ExoplayerCuesDecoder implements SubtitleDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubtitleInputBuffer f18464a = new SubtitleInputBuffer(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f18465b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18466c;
    public boolean d;

    public static final class SingleEventSubtitle implements Subtitle {
        public final long X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ImmutableList f18467Y;

        public SingleEventSubtitle(long j, ImmutableList immutableList) {
            this.X = j;
            this.f18467Y = immutableList;
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public final List getCues(long j) {
            return j >= this.X ? this.f18467Y : ImmutableList.x();
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public final long getEventTime(int i2) {
            Assertions.b(i2 == 0);
            return this.X;
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public final int getEventTimeCount() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public final int getNextEventTimeIndex(long j) {
            return this.X > j ? 0 : -1;
        }
    }

    public ExoplayerCuesDecoder() {
        for (int i2 = 0; i2 < 2; i2++) {
            this.f18465b.addFirst(new SubtitleOutputBuffer() { // from class: com.google.android.exoplayer2.text.ExoplayerCuesDecoder.1
                @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
                public final void d() {
                    ArrayDeque arrayDeque = ExoplayerCuesDecoder.this.f18465b;
                    Assertions.d(arrayDeque.size() < 2);
                    Assertions.b(!arrayDeque.contains(this));
                    this.X = 0;
                    this.e0 = null;
                    arrayDeque.addFirst(this);
                }
            });
        }
        this.f18466c = 0;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final Object dequeueInputBuffer() {
        Assertions.d(!this.d);
        if (this.f18466c != 0) {
            return null;
        }
        this.f18466c = 1;
        return this.f18464a;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final Object dequeueOutputBuffer() {
        Assertions.d(!this.d);
        if (this.f18466c != 2) {
            return null;
        }
        ArrayDeque arrayDeque = this.f18465b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        SubtitleOutputBuffer subtitleOutputBuffer = (SubtitleOutputBuffer) arrayDeque.removeFirst();
        SubtitleInputBuffer subtitleInputBuffer = this.f18464a;
        if (subtitleInputBuffer.b(4)) {
            subtitleOutputBuffer.a(4);
        } else {
            long j = subtitleInputBuffer.f0;
            ByteBuffer byteBuffer = subtitleInputBuffer.Z;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
            parcelObtain.recycle();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
            parcelableArrayList.getClass();
            subtitleOutputBuffer.f(subtitleInputBuffer.f0, new SingleEventSubtitle(j, BundleableUtil.a(Cue.K0, parcelableArrayList)), 0L);
        }
        subtitleInputBuffer.d();
        this.f18466c = 0;
        return subtitleOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final void flush() {
        Assertions.d(!this.d);
        this.f18464a.d();
        this.f18466c = 0;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final String getName() {
        return "ExoplayerCuesDecoder";
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final void queueInputBuffer(Object obj) {
        SubtitleInputBuffer subtitleInputBuffer = (SubtitleInputBuffer) obj;
        Assertions.d(!this.d);
        Assertions.d(this.f18466c == 1);
        Assertions.b(this.f18464a == subtitleInputBuffer);
        this.f18466c = 2;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final void release() {
        this.d = true;
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public final void setPositionUs(long j) {
    }
}
