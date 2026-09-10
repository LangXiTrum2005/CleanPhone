package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface ExtractorInput {
    void advancePeekPosition(int i10) throws InterruptedException, IOException;

    boolean advancePeekPosition(int i10, boolean z10) throws InterruptedException, IOException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    void peekFully(byte[] bArr, int i10, int i11) throws InterruptedException, IOException;

    boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, IOException;

    int read(byte[] bArr, int i10, int i11) throws InterruptedException, IOException;

    void readFully(byte[] bArr, int i10, int i11) throws InterruptedException, IOException;

    boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, IOException;

    void resetPeekPosition();

    <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable;

    int skip(int i10) throws InterruptedException, IOException;

    void skipFully(int i10) throws InterruptedException, IOException;

    boolean skipFully(int i10, boolean z10) throws InterruptedException, IOException;
}
