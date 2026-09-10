package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.upstream.DataReader;

/* JADX INFO: loaded from: classes3.dex */
public interface ExtractorInput extends DataReader {
    void advancePeekPosition(int i2);

    long getLength();

    long getPeekPosition();

    long getPosition();

    void peekFully(byte[] bArr, int i2, int i3);

    boolean peekFully(byte[] bArr, int i2, int i3, boolean z2);

    void readFully(byte[] bArr, int i2, int i3);

    boolean readFully(byte[] bArr, int i2, int i3, boolean z2);

    void resetPeekPosition();

    void skipFully(int i2);
}
