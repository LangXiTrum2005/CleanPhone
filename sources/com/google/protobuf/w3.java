package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w3 extends ByteString {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f24992f = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteString f24994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteString f24995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24997e;

    public w3(ByteString byteString, ByteString byteString2) {
        this.f24994b = byteString;
        this.f24995c = byteString2;
        int size = byteString.size();
        this.f24996d = size;
        this.f24993a = byteString2.size() + size;
        this.f24997e = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    public static int b(int i10) {
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return f24992f[i10];
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        s sVar;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f24997e);
        arrayDeque.push(this);
        ByteString byteString = this.f24994b;
        while (byteString instanceof w3) {
            w3 w3Var = (w3) byteString;
            arrayDeque.push(w3Var);
            byteString = w3Var.f24994b;
        }
        s sVar2 = (s) byteString;
        while (true) {
            if (!(sVar2 != null)) {
                return arrayList;
            }
            if (sVar2 == null) {
                throw new NoSuchElementException();
            }
            do {
                if (arrayDeque.isEmpty()) {
                    sVar = null;
                    break;
                }
                ByteString byteString2 = ((w3) arrayDeque.pop()).f24995c;
                while (byteString2 instanceof w3) {
                    w3 w3Var2 = (w3) byteString2;
                    arrayDeque.push(w3Var2);
                    byteString2 = w3Var2.f24994b;
                }
                sVar = (s) byteString2;
            } while (sVar.isEmpty());
            arrayList.add(sVar2.asReadOnlyByteBuffer());
            sVar2 = sVar;
        }
    }

    @Override // com.google.protobuf.ByteString
    public final byte byteAt(int i10) {
        ByteString.checkIndex(i10, this.f24993a);
        return internalByteAt(i10);
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        this.f24994b.copyTo(byteBuffer);
        this.f24995c.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        ByteString byteString = this.f24994b;
        int i14 = this.f24996d;
        if (i13 <= i14) {
            byteString.copyToInternal(bArr, i10, i11, i12);
            return;
        }
        ByteString byteString2 = this.f24995c;
        if (i10 >= i14) {
            byteString2.copyToInternal(bArr, i10 - i14, i11, i12);
            return;
        }
        int i15 = i14 - i10;
        byteString.copyToInternal(bArr, i10, i11, i15);
        byteString2.copyToInternal(bArr, 0, i11 + i15, i12 - i15);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            int i10 = this.f24993a;
            if (i10 == size) {
                if (i10 == 0) {
                    return true;
                }
                int iPeekCachedHashCode = peekCachedHashCode();
                int iPeekCachedHashCode2 = byteString.peekCachedHashCode();
                if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                    u3 u3Var = new u3(this);
                    s sVarA = u3Var.a();
                    u3 u3Var2 = new u3(byteString);
                    s sVarA2 = u3Var2.a();
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        int size2 = sVarA.size() - i11;
                        int size3 = sVarA2.size() - i12;
                        int iMin = Math.min(size2, size3);
                        if (!(i11 == 0 ? sVarA.b(sVarA2, i12, iMin) : sVarA2.b(sVarA, i11, iMin))) {
                            break;
                        }
                        i13 += iMin;
                        if (i13 >= i10) {
                            if (i13 == i10) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == size2) {
                            sVarA = u3Var.a();
                            i11 = 0;
                        } else {
                            i11 += iMin;
                        }
                        if (iMin == size3) {
                            sVarA2 = u3Var2.a();
                            i12 = 0;
                        } else {
                            i12 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString
    public final int getTreeDepth() {
        return this.f24997e;
    }

    @Override // com.google.protobuf.ByteString
    public final byte internalByteAt(int i10) {
        int i11 = this.f24996d;
        return i10 < i11 ? this.f24994b.internalByteAt(i10) : this.f24995c.internalByteAt(i10 - i11);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isBalanced() {
        return this.f24993a >= b(this.f24997e);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.f24994b.partialIsValidUtf8(0, 0, this.f24996d);
        ByteString byteString = this.f24995c;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public final Iterator<Byte> iterator2() {
        return new t3(this);
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new v3(this);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        ByteString byteString = this.f24994b;
        int i14 = this.f24996d;
        if (i13 <= i14) {
            return byteString.partialHash(i10, i11, i12);
        }
        ByteString byteString2 = this.f24995c;
        if (i11 >= i14) {
            return byteString2.partialHash(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return byteString2.partialHash(byteString.partialHash(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        ByteString byteString = this.f24994b;
        int i14 = this.f24996d;
        if (i13 <= i14) {
            return byteString.partialIsValidUtf8(i10, i11, i12);
        }
        ByteString byteString2 = this.f24995c;
        if (i11 >= i14) {
            return byteString2.partialIsValidUtf8(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return byteString2.partialIsValidUtf8(byteString.partialIsValidUtf8(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.f24993a;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i10, int i11) {
        int i12 = this.f24993a;
        int iCheckRange = ByteString.checkRange(i10, i11, i12);
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        if (iCheckRange == i12) {
            return this;
        }
        ByteString byteString = this.f24994b;
        int i13 = this.f24996d;
        if (i11 <= i13) {
            return byteString.substring(i10, i11);
        }
        ByteString byteString2 = this.f24995c;
        return i10 >= i13 ? byteString2.substring(i10 - i13, i11 - i13) : new w3(byteString.substring(i10), byteString2.substring(0, i11 - i13));
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) throws IOException {
        this.f24994b.writeTo(outputStream);
        this.f24995c.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        ByteString byteString = this.f24994b;
        int i13 = this.f24996d;
        if (i12 <= i13) {
            byteString.writeToInternal(outputStream, i10, i11);
            return;
        }
        ByteString byteString2 = this.f24995c;
        if (i10 >= i13) {
            byteString2.writeToInternal(outputStream, i10 - i13, i11);
            return;
        }
        int i14 = i13 - i10;
        byteString.writeToInternal(outputStream, i10, i14);
        byteString2.writeToInternal(outputStream, 0, i11 - i14);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToReverse(ByteOutput byteOutput) throws IOException {
        this.f24995c.writeToReverse(byteOutput);
        this.f24994b.writeToReverse(byteOutput);
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final Iterator<Byte> iterator2() {
        return new t3(this);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) throws IOException {
        this.f24994b.writeTo(byteOutput);
        this.f24995c.writeTo(byteOutput);
    }
}
