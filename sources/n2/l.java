package n2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface l extends i1.i {
    void advancePeekPosition(int i10);

    long getLength();

    long getPeekPosition();

    long getPosition();

    void peekFully(byte[] bArr, int i10, int i11);

    boolean peekFully(byte[] bArr, int i10, int i11, boolean z10);

    void readFully(byte[] bArr, int i10, int i11);

    boolean readFully(byte[] bArr, int i10, int i11, boolean z10);

    void resetPeekPosition();

    int skip(int i10);

    void skipFully(int i10);

    boolean skipFully(int i10, boolean z10);

    int w(byte[] bArr, int i10, int i11);
}
