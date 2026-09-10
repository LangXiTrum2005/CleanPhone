package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes3.dex */
public interface SequenceableLoader {

    public interface Callback<T extends SequenceableLoader> {
        void a(SequenceableLoader sequenceableLoader);
    }

    boolean continueLoading(long j);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j);
}
