package cybernatic;

import java.io.IOException;

/* JADX INFO: compiled from: ExtractorInput.java */
/* JADX INFO: loaded from: classes.dex */
public interface monoploid extends androidx.media3.common.taiyuan {
    void advancePeekPosition(int i) throws IOException;

    boolean advancePeekPosition(int i, boolean z) throws IOException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    void peekFully(byte[] bArr, int i, int i2) throws IOException;

    boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws IOException;

    @Override // androidx.media3.common.taiyuan
    int read(byte[] bArr, int i, int i2) throws IOException;

    void readFully(byte[] bArr, int i, int i2) throws IOException;

    boolean readFully(byte[] bArr, int i, int i2, boolean z) throws IOException;

    void resetPeekPosition();

    int saneness(byte[] bArr, int i, int i2) throws IOException;

    int skip(int i) throws IOException;

    void skipFully(int i) throws IOException;
}
