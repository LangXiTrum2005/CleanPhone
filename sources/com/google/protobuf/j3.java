package com.google.protobuf;

import com.google.android.gms.internal.measurement.lc;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j3 extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f24876a;

    public j3(ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        this.f24876a = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.f24876a.slice());
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return this.f24876a.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        return Collections.singletonList(this.f24876a.asReadOnlyBuffer());
    }

    @Override // com.google.protobuf.s
    public final boolean b(s sVar, int i10, int i11) {
        return substring(0, i11).equals(sVar.substring(i10, i11 + i10));
    }

    @Override // com.google.protobuf.ByteString
    public final byte byteAt(int i10) {
        try {
            return this.f24876a.get(i10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f24876a.slice());
    }

    @Override // com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer byteBufferSlice = this.f24876a.slice();
        byteBufferSlice.position(i10);
        byteBufferSlice.get(bArr, i11, i12);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        ByteBuffer byteBuffer = this.f24876a;
        if (byteBuffer.remaining() != byteString.size()) {
            return false;
        }
        if (byteBuffer.remaining() == 0) {
            return true;
        }
        if (obj instanceof j3) {
            return byteBuffer.equals(((j3) obj).f24876a);
        }
        return obj instanceof w3 ? obj.equals(this) : byteBuffer.equals(byteString.asReadOnlyByteBuffer());
    }

    public final ByteBuffer h(int i10, int i11) {
        ByteBuffer byteBuffer = this.f24876a;
        if (i10 < byteBuffer.position() || i11 > byteBuffer.limit() || i10 > i11) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.position(i10 - byteBuffer.position());
        byteBufferSlice.limit(i11 - byteBuffer.position());
        return byteBufferSlice;
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        z4 z4Var = a5.f24770a;
        ByteBuffer byteBuffer = this.f24876a;
        return z4Var.l(0, byteBuffer.position(), byteBuffer, byteBuffer.remaining()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.f24876a, true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new lc(this);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f24876a.get(i13);
        }
        return i10;
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i10, int i11, int i12) {
        return a5.f24770a.l(i10, i11, this.f24876a, i12 + i11);
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.f24876a.remaining();
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i10, int i11) {
        try {
            return new j3(h(i10, i11));
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int iPosition;
        ByteBuffer byteBuffer = this.f24876a;
        if (byteBuffer.hasArray()) {
            byteArray = byteBuffer.array();
            iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            length = byteBuffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iPosition = 0;
        }
        return new String(byteArray, iPosition, length, charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0065 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:7:0x0025, B:9:0x002b, B:12:0x0044, B:14:0x004d, B:16:0x0055, B:20:0x0061, B:21:0x0065, B:26:0x0083, B:28:0x0086, B:33:0x009d, B:35:0x00a3, B:30:0x008f, B:32:0x0095, B:24:0x007a), top: B:41:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:7:0x0025, B:9:0x002b, B:12:0x0044, B:14:0x004d, B:16:0x0055, B:20:0x0061, B:21:0x0065, B:26:0x0083, B:28:0x0086, B:33:0x009d, B:35:0x00a3, B:30:0x008f, B:32:0x0095, B:24:0x007a), top: B:41:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x008f A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:7:0x0025, B:9:0x002b, B:12:0x0044, B:14:0x004d, B:16:0x0055, B:20:0x0061, B:21:0x0065, B:26:0x0083, B:28:0x0086, B:33:0x009d, B:35:0x00a3, B:30:0x008f, B:32:0x0095, B:24:0x007a), top: B:41:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:7:0x0025, B:9:0x002b, B:12:0x0044, B:14:0x004d, B:16:0x0055, B:20:0x0061, B:21:0x0065, B:26:0x0083, B:28:0x0086, B:33:0x009d, B:35:0x00a3, B:30:0x008f, B:32:0x0095, B:24:0x007a), top: B:41:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3 A[Catch: all -> 0x0041, LOOP:0: B:33:0x009d->B:35:0x00a3, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:7:0x0025, B:9:0x002b, B:12:0x0044, B:14:0x004d, B:16:0x0055, B:20:0x0061, B:21:0x0065, B:26:0x0083, B:28:0x0086, B:33:0x009d, B:35:0x00a3, B:30:0x008f, B:32:0x0095, B:24:0x007a), top: B:41:0x0025 }] */
    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
        int iMax;
        ThreadLocal threadLocal;
        SoftReference softReference;
        int length;
        WritableByteChannel writableByteChannel;
        ByteBuffer byteBuffer = this.f24876a;
        if (byteBuffer.hasArray()) {
            outputStream.write(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset() + i10, i11);
            return;
        }
        ByteBuffer byteBufferH = h(i10, i11 + i10);
        ThreadLocal threadLocal2 = k.f24882a;
        int iPosition = byteBufferH.position();
        try {
            if (byteBufferH.hasArray()) {
                outputStream.write(byteBufferH.array(), byteBufferH.arrayOffset() + byteBufferH.position(), byteBufferH.remaining());
            } else {
                long j10 = k.f24884c;
                byte[] bArr = null;
                if (j10 < 0 || !k.f24883b.isInstance(outputStream)) {
                    iMax = Math.max(byteBufferH.remaining(), 1024);
                    threadLocal = k.f24882a;
                    softReference = (SoftReference) threadLocal.get();
                    if (softReference == null) {
                        bArr = (byte[]) softReference.get();
                    }
                    if (bArr != null || ((length = bArr.length) < iMax && length < iMax * 0.5f)) {
                        bArr = new byte[iMax];
                        if (iMax <= 16384) {
                            threadLocal.set(new SoftReference(bArr));
                        }
                    }
                    while (byteBufferH.hasRemaining()) {
                        int iMin = Math.min(byteBufferH.remaining(), bArr.length);
                        byteBufferH.get(bArr, 0, iMin);
                        outputStream.write(bArr, 0, iMin);
                    }
                } else {
                    try {
                        writableByteChannel = (WritableByteChannel) x4.f25021c.m(j10, outputStream);
                    } catch (ClassCastException unused) {
                        writableByteChannel = null;
                    }
                    if (writableByteChannel != null) {
                        writableByteChannel.write(byteBufferH);
                    } else {
                        iMax = Math.max(byteBufferH.remaining(), 1024);
                        threadLocal = k.f24882a;
                        softReference = (SoftReference) threadLocal.get();
                        if (softReference == null) {
                            bArr = (byte[]) softReference.get();
                        }
                        if (bArr != null) {
                            bArr = new byte[iMax];
                            if (iMax <= 16384) {
                                threadLocal.set(new SoftReference(bArr));
                            }
                        } else {
                            bArr = new byte[iMax];
                            if (iMax <= 16384) {
                                threadLocal.set(new SoftReference(bArr));
                            }
                        }
                        while (byteBufferH.hasRemaining()) {
                            int iMin2 = Math.min(byteBufferH.remaining(), bArr.length);
                            byteBufferH.get(bArr, 0, iMin2);
                            outputStream.write(bArr, 0, iMin2);
                        }
                    }
                }
            }
        } finally {
            byteBufferH.position(iPosition);
        }
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) throws IOException {
        byteOutput.writeLazy(this.f24876a.slice());
    }
}
