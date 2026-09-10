package com.google.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class t extends s {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f24949a;

    public t(byte[] bArr) {
        bArr.getClass();
        this.f24949a = bArr;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.f24949a, h(), size()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.s
    public final boolean b(s sVar, int i10, int i11) {
        if (i11 > sVar.size()) {
            throw new IllegalArgumentException("Length too large: " + i11 + size());
        }
        int i12 = i10 + i11;
        if (i12 > sVar.size()) {
            StringBuilder sbL = l1.d.l("Ran off end of other: ", i10, ", ", i11, ", ");
            sbL.append(sVar.size());
            throw new IllegalArgumentException(sbL.toString());
        }
        if (!(sVar instanceof t)) {
            return sVar.substring(i10, i12).equals(substring(0, i11));
        }
        t tVar = (t) sVar;
        byte[] bArr = tVar.f24949a;
        int iH = h() + i11;
        int iH2 = h();
        int iH3 = tVar.h() + i10;
        while (iH2 < iH) {
            if (this.f24949a[iH2] != bArr[iH3]) {
                return false;
            }
            iH2++;
            iH3++;
        }
        return true;
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i10) {
        return this.f24949a[i10];
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f24949a, h(), size());
    }

    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f24949a, i10, bArr, i11, i12);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ByteString) && size() == ((ByteString) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof t)) {
                return obj.equals(this);
            }
            t tVar = (t) obj;
            int iPeekCachedHashCode = peekCachedHashCode();
            int iPeekCachedHashCode2 = tVar.peekCachedHashCode();
            if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                return b(tVar, 0, size());
            }
        }
        return false;
    }

    public int h() {
        return 0;
    }

    @Override // com.google.protobuf.s, com.google.protobuf.ByteString
    public byte internalByteAt(int i10) {
        return this.f24949a[i10];
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        int iH = h();
        return a5.f24770a.j(this.f24949a, iH, size() + iH);
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.f24949a, h(), size(), true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new ByteArrayInputStream(this.f24949a, h(), size());
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i10, int i11, int i12) {
        return Internal.partialHash(i10, this.f24949a, h() + i11, i12);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i10, int i11, int i12) {
        int iH = h() + i11;
        return a5.f24770a.k(i10, iH, i12 + iH, this.f24949a);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.f24949a.length;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i10, int i11) {
        int iCheckRange = ByteString.checkRange(i10, i11, size());
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        return new p(this.f24949a, h() + i10, iCheckRange);
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(this.f24949a, h(), size(), charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.f24949a, h() + i10, i11);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) throws IOException {
        byteOutput.writeLazy(this.f24949a, h(), size());
    }
}
