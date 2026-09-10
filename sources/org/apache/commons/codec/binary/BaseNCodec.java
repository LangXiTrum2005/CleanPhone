package org.apache.commons.codec.binary;

import androidx.datastore.preferences.protobuf.a;
import com.applovin.impl.Z;
import com.applovin.shadow.okio.Segment;
import com.p004ironsource.d9;
import java.util.Arrays;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseNCodec implements BinaryEncoder, BinaryDecoder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f45191c = {13, 10};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45193b;

    public static class Context {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f45195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45196c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f45197e;
        public int f;
        public int g;

        public final String toString() {
            String simpleName = getClass().getSimpleName();
            String string = Arrays.toString(this.f45195b);
            int i2 = this.f;
            boolean z2 = this.f45197e;
            int i3 = this.f45194a;
            int i4 = this.g;
            int i5 = this.f45196c;
            int i6 = this.d;
            StringBuilder sb = new StringBuilder();
            sb.append(simpleName);
            sb.append("[buffer=");
            sb.append(string);
            sb.append(", currentLinePos=");
            sb.append(i2);
            sb.append(", eof=");
            sb.append(z2);
            sb.append(", ibitWorkArea=");
            sb.append(i3);
            a.z(sb, ", lbitWorkArea=0, modulus=", i4, ", pos=", i5);
            return Z.n(sb, ", readPos=", i6, d9.i.f24752e);
        }
    }

    public BaseNCodec(int i2, int i3) {
        this.f45192a = (i2 <= 0 || i3 <= 0) ? 0 : (i2 / 4) * 4;
        this.f45193b = i3;
    }

    public static byte[] a(int i2, Context context) {
        byte[] bArr = context.f45195b;
        if (bArr == null) {
            context.f45195b = new byte[Math.max(i2, Segment.SIZE)];
            context.f45196c = 0;
            context.d = 0;
        } else {
            int i3 = context.f45196c + i2;
            if (i3 - bArr.length > 0) {
                int length = bArr.length * 2;
                if (Integer.compare(length - Integer.MIN_VALUE, i3 - Integer.MIN_VALUE) < 0) {
                    length = i3;
                }
                if (Integer.compare(Integer.MIN_VALUE + length, -9) > 0) {
                    if (i3 < 0) {
                        throw new OutOfMemoryError("Unable to allocate array size: " + (((long) i3) & 4294967295L));
                    }
                    if (i3 <= 2147483639) {
                        i3 = 2147483639;
                    }
                    length = i3;
                }
                byte[] bArr2 = new byte[length];
                byte[] bArr3 = context.f45195b;
                System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
                context.f45195b = bArr2;
                return bArr2;
            }
        }
        return context.f45195b;
    }
}
