package com.google.common.util.concurrent;

import com.google.common.primitives.ImmutableLongArray;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class AtomicDoubleArray implements Serializable {
    private static final long serialVersionUID = 0;
    public transient AtomicLongArray X;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i2 = objectInputStream.readInt();
        ImmutableLongArray.Builder builder = new ImmutableLongArray.Builder();
        builder.f20058b = 0;
        builder.f20057a = new long[10];
        for (int i3 = 0; i3 < i2; i3++) {
            long jDoubleToRawLongBits = Double.doubleToRawLongBits(objectInputStream.readDouble());
            int i4 = builder.f20058b;
            int i5 = i4 + 1;
            long[] jArr = builder.f20057a;
            if (i5 > jArr.length) {
                int length = jArr.length;
                if (i5 < 0) {
                    throw new AssertionError("cannot store more than MAX_VALUE elements");
                }
                int iHighestOneBit = length + (length >> 1) + 1;
                if (iHighestOneBit < i5) {
                    iHighestOneBit = Integer.highestOneBit(i4) << 1;
                }
                if (iHighestOneBit < 0) {
                    iHighestOneBit = Integer.MAX_VALUE;
                }
                builder.f20057a = Arrays.copyOf(jArr, iHighestOneBit);
            }
            long[] jArr2 = builder.f20057a;
            int i6 = builder.f20058b;
            jArr2[i6] = jDoubleToRawLongBits;
            builder.f20058b = i6 + 1;
        }
        int i7 = builder.f20058b;
        ImmutableLongArray immutableLongArray = i7 == 0 ? ImmutableLongArray.e0 : new ImmutableLongArray(builder.f20057a, 0, i7);
        this.X = new AtomicLongArray(Arrays.copyOfRange(immutableLongArray.X, immutableLongArray.f20056Y, immutableLongArray.Z));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int length = this.X.length();
        objectOutputStream.writeInt(length);
        for (int i2 = 0; i2 < length; i2++) {
            objectOutputStream.writeDouble(Double.longBitsToDouble(this.X.get(i2)));
        }
    }

    public final String toString() {
        int length = this.X.length();
        int i2 = length - 1;
        if (i2 == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(length * 19);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        int i3 = 0;
        while (true) {
            sb.append(Double.longBitsToDouble(this.X.get(i3)));
            if (i3 == i2) {
                sb.append(AbstractJsonLexerKt.END_LIST);
                return sb.toString();
            }
            sb.append(", ");
            i3++;
        }
    }
}
