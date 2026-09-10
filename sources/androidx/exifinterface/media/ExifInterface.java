package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.datastore.preferences.protobuf.a;
import com.applovin.shadow.okio.Segment;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.n8.g;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes.dex */
public class ExifInterface {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String[] f5045E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int[] f5046F;
    public static final byte[] G;
    public static final ExifTag H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final ExifTag[][] f5047I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final ExifTag[] f5048J;
    public static final HashMap[] K;
    public static final HashMap[] L;
    public static final HashSet M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final HashMap f5049N;
    public static final Charset O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final byte[] f5050P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final byte[] f5051Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileDescriptor f5058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AssetManager.AssetInputStream f5059c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap[] f5060e;
    public final HashSet f;
    public ByteOrder g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5062i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5063l;
    public static final boolean m = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f5052n = Arrays.asList(1, 6, 3, 8);
    public static final List o = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f5053p = {8, 8, 8};
    public static final int[] q = {8};
    public static final byte[] r = {-1, -40, -1};
    public static final byte[] s = {102, 116, 121, 112};
    public static final byte[] t = {109, 105, 102, 49};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f5054u = {104, 101, 105, 99};
    public static final byte[] v = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f5055w = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] x = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] y = {101, 88, 73, 102};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f5056z = {73, 72, 68, 82};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final byte[] f5043A = {73, 69, 78, 68};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final byte[] f5044B = {82, 73, 70, 70};
    public static final byte[] C = {87, 69, 66, 80};
    public static final byte[] D = {69, 88, 73, 70};

    public static class ByteOrderedDataInputStream extends InputStream implements DataInput {
        public static final ByteOrder f0 = ByteOrder.LITTLE_ENDIAN;
        public static final ByteOrder g0 = ByteOrder.BIG_ENDIAN;
        public final DataInputStream X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public ByteOrder f5065Y;
        public int Z;
        public byte[] e0;

        public ByteOrderedDataInputStream(byte[] bArr) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            this(byteArrayInputStream, 0);
        }

        public final void a(int i2) throws IOException {
            int i3 = 0;
            while (i3 < i2) {
                DataInputStream dataInputStream = this.X;
                int i4 = i2 - i3;
                int iSkip = (int) dataInputStream.skip(i4);
                if (iSkip <= 0) {
                    if (this.e0 == null) {
                        this.e0 = new byte[Segment.SIZE];
                    }
                    iSkip = dataInputStream.read(this.e0, 0, Math.min(Segment.SIZE, i4));
                    if (iSkip == -1) {
                        throw new EOFException(a.k("Reached EOF while skipping ", i2, " bytes."));
                    }
                }
                i3 += iSkip;
            }
            this.Z += i3;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.X.available();
        }

        @Override // java.io.InputStream
        public final void mark(int i2) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() {
            this.Z++;
            return this.X.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.Z++;
            return this.X.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.Z++;
            int i2 = this.X.read();
            if (i2 >= 0) {
                return (byte) i2;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.Z += 2;
            return this.X.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i2, int i3) throws IOException {
            this.Z += i3;
            this.X.readFully(bArr, i2, i3);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.Z += 4;
            DataInputStream dataInputStream = this.X;
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            int i4 = dataInputStream.read();
            int i5 = dataInputStream.read();
            if ((i2 | i3 | i4 | i5) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f5065Y;
            if (byteOrder == f0) {
                return (i5 << 24) + (i4 << 16) + (i3 << 8) + i2;
            }
            if (byteOrder == g0) {
                return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
            }
            throw new IOException("Invalid byte order: " + this.f5065Y);
        }

        @Override // java.io.DataInput
        public final String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            long j;
            long j2;
            this.Z += 8;
            DataInputStream dataInputStream = this.X;
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            int i4 = dataInputStream.read();
            int i5 = dataInputStream.read();
            int i6 = dataInputStream.read();
            int i7 = dataInputStream.read();
            int i8 = dataInputStream.read();
            int i9 = dataInputStream.read();
            if ((i2 | i3 | i4 | i5 | i6 | i7 | i8 | i9) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f5065Y;
            if (byteOrder == f0) {
                j = (((long) i9) << 56) + (((long) i8) << 48) + (((long) i7) << 40) + (((long) i6) << 32) + (((long) i5) << 24) + (((long) i4) << 16) + (((long) i3) << 8);
                j2 = i2;
            } else {
                if (byteOrder != g0) {
                    throw new IOException("Invalid byte order: " + this.f5065Y);
                }
                j = (((long) i2) << 56) + (((long) i3) << 48) + (((long) i4) << 40) + (((long) i5) << 32) + (((long) i6) << 24) + (((long) i7) << 16) + (((long) i8) << 8);
                j2 = i9;
            }
            return j + j2;
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.Z += 2;
            DataInputStream dataInputStream = this.X;
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            if ((i2 | i3) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f5065Y;
            if (byteOrder == f0) {
                return (short) ((i3 << 8) + i2);
            }
            if (byteOrder == g0) {
                return (short) ((i2 << 8) + i3);
            }
            throw new IOException("Invalid byte order: " + this.f5065Y);
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.Z += 2;
            return this.X.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.Z++;
            return this.X.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.Z += 2;
            DataInputStream dataInputStream = this.X;
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            if ((i2 | i3) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f5065Y;
            if (byteOrder == f0) {
                return (i3 << 8) + i2;
            }
            if (byteOrder == g0) {
                return (i2 << 8) + i3;
            }
            throw new IOException("Invalid byte order: " + this.f5065Y);
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i2) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ByteOrderedDataInputStream(InputStream inputStream) {
            this(inputStream, 0);
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        }

        public ByteOrderedDataInputStream(InputStream inputStream, int i2) {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            this.f5065Y = byteOrder;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.X = dataInputStream;
            dataInputStream.mark(0);
            this.Z = 0;
            this.f5065Y = byteOrder;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i2, int i3) throws IOException {
            int i4 = this.X.read(bArr, i2, i3);
            this.Z += i4;
            return i4;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.Z += bArr.length;
            this.X.readFully(bArr);
        }
    }

    public static class ByteOrderedDataOutputStream extends FilterOutputStream {
        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i2, int i3) {
            throw null;
        }
    }

    public static class ExifAttribute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f5068c;
        public final byte[] d;

        public ExifAttribute(int i2, int i3, byte[] bArr) {
            this(-1L, bArr, i2, i3);
        }

        public static ExifAttribute a(long j, ByteOrder byteOrder) {
            long[] jArr = {j};
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.f5046F[4]]);
            byteBufferWrap.order(byteOrder);
            byteBufferWrap.putInt((int) jArr[0]);
            return new ExifAttribute(4, 1, byteBufferWrap.array());
        }

        public static ExifAttribute b(Rational rational, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.f5046F[5]]);
            byteBufferWrap.order(byteOrder);
            Rational rational2 = new Rational[]{rational}[0];
            byteBufferWrap.putInt((int) rational2.f5072a);
            byteBufferWrap.putInt((int) rational2.f5073b);
            return new ExifAttribute(5, 1, byteBufferWrap.array());
        }

        public static ExifAttribute c(int i2, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.f5046F[3]]);
            byteBufferWrap.order(byteOrder);
            byteBufferWrap.putShort((short) new int[]{i2}[0]);
            return new ExifAttribute(3, 1, byteBufferWrap.array());
        }

        public final double d(ByteOrder byteOrder) throws Throwable {
            Object objG = g(byteOrder);
            if (objG == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objG instanceof String) {
                return Double.parseDouble((String) objG);
            }
            if (objG instanceof long[]) {
                long[] jArr = (long[]) objG;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objG instanceof int[]) {
                int[] iArr = (int[]) objG;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objG instanceof double[]) {
                double[] dArr = (double[]) objG;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objG instanceof Rational[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            Rational[] rationalArr = (Rational[]) objG;
            if (rationalArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            Rational rational = rationalArr[0];
            return rational.f5072a / rational.f5073b;
        }

        public final int e(ByteOrder byteOrder) throws Throwable {
            Object objG = g(byteOrder);
            if (objG == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objG instanceof String) {
                return Integer.parseInt((String) objG);
            }
            if (objG instanceof long[]) {
                long[] jArr = (long[]) objG;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objG instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objG;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public final String f(ByteOrder byteOrder) throws Throwable {
            Object objG = g(byteOrder);
            if (objG == null) {
                return null;
            }
            if (objG instanceof String) {
                return (String) objG;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            if (objG instanceof long[]) {
                long[] jArr = (long[]) objG;
                while (i2 < jArr.length) {
                    sb.append(jArr[i2]);
                    i2++;
                    if (i2 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objG instanceof int[]) {
                int[] iArr = (int[]) objG;
                while (i2 < iArr.length) {
                    sb.append(iArr[i2]);
                    i2++;
                    if (i2 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objG instanceof double[]) {
                double[] dArr = (double[]) objG;
                while (i2 < dArr.length) {
                    sb.append(dArr[i2]);
                    i2++;
                    if (i2 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objG instanceof Rational[])) {
                return null;
            }
            Rational[] rationalArr = (Rational[]) objG;
            while (i2 < rationalArr.length) {
                sb.append(rationalArr[i2].f5072a);
                sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                sb.append(rationalArr[i2].f5073b);
                i2++;
                if (i2 != rationalArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Code duplicated, block: B:153:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0033: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:52), block:B:16:0x0033 */
        /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v23, types: [java.io.Serializable, long[]] */
        /* JADX WARN: Type inference failed for: r15v24, types: [androidx.exifinterface.media.ExifInterface$Rational[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v25, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v27, types: [androidx.exifinterface.media.ExifInterface$Rational[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v28, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
        public final Serializable g(ByteOrder byteOrder) throws Throwable {
            ByteOrderedDataInputStream byteOrderedDataInputStream;
            InputStream inputStream;
            byte b2;
            String string;
            int length = 0;
            byte[] bArr = this.d;
            InputStream inputStream2 = null;
            try {
                try {
                    try {
                        byteOrderedDataInputStream = new ByteOrderedDataInputStream(bArr);
                        try {
                            byteOrderedDataInputStream.f5065Y = byteOrder;
                            int i2 = this.f5066a;
                            int i3 = this.f5067b;
                            switch (i2) {
                                case 1:
                                case 6:
                                    if (bArr.length != 1 || (b2 = bArr[0]) < 0 || b2 > 1) {
                                        String str = new String(bArr, ExifInterface.O);
                                        try {
                                            byteOrderedDataInputStream.close();
                                            return str;
                                        } catch (IOException e2) {
                                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                            return str;
                                        }
                                    }
                                    String str2 = new String(new char[]{(char) (b2 + 48)});
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return str2;
                                    } catch (IOException e3) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                        return str2;
                                    }
                                case 2:
                                case 7:
                                    if (i3 >= ExifInterface.G.length) {
                                        int i4 = 0;
                                        while (true) {
                                            byte[] bArr2 = ExifInterface.G;
                                            if (i4 >= bArr2.length) {
                                                length = bArr2.length;
                                            } else if (bArr[i4] == bArr2[i4]) {
                                                i4++;
                                            }
                                        }
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    try {
                                        while (length < i3) {
                                            byte b3 = bArr[length];
                                            if (b3 == 0) {
                                                string = sb.toString();
                                                byteOrderedDataInputStream.close();
                                                return string;
                                            }
                                            if (b3 >= 32) {
                                                sb.append((char) b3);
                                            } else {
                                                sb.append('?');
                                            }
                                            length++;
                                        }
                                        byteOrderedDataInputStream.close();
                                        return string;
                                    } catch (IOException e4) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                        return string;
                                    }
                                    string = sb.toString();
                                case 3:
                                    ?? r15 = new int[i3];
                                    while (length < i3) {
                                        r15[length] = byteOrderedDataInputStream.readUnsignedShort();
                                        length++;
                                    }
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return r15;
                                    } catch (IOException e5) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                                        return r15;
                                    }
                                case 4:
                                    ?? r16 = new long[i3];
                                    while (length < i3) {
                                        r16[length] = ((long) byteOrderedDataInputStream.readInt()) & 4294967295L;
                                        length++;
                                    }
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return r16;
                                    } catch (IOException e6) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                                        return r16;
                                    }
                                case 5:
                                    ?? r17 = new Rational[i3];
                                    while (length < i3) {
                                        r17[length] = new Rational(((long) byteOrderedDataInputStream.readInt()) & 4294967295L, ((long) byteOrderedDataInputStream.readInt()) & 4294967295L);
                                        length++;
                                    }
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return r17;
                                    } catch (IOException e7) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                        return r17;
                                    }
                                case 8:
                                    ?? r18 = new int[i3];
                                    while (length < i3) {
                                        r18[length] = byteOrderedDataInputStream.readShort();
                                        length++;
                                    }
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return r18;
                                    } catch (IOException e8) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                                        return r18;
                                    }
                                case 9:
                                    ?? r19 = new int[i3];
                                    while (length < i3) {
                                        r19[length] = byteOrderedDataInputStream.readInt();
                                        length++;
                                    }
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return r19;
                                    } catch (IOException e9) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                        return r19;
                                    }
                                case 10:
                                    ?? r110 = new Rational[i3];
                                    while (length < i3) {
                                        r110[length] = new Rational(byteOrderedDataInputStream.readInt(), byteOrderedDataInputStream.readInt());
                                        length++;
                                    }
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return r110;
                                    } catch (IOException e10) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                        return r110;
                                    }
                                case 11:
                                    ?? r111 = new double[i3];
                                    while (length < i3) {
                                        r111[length] = byteOrderedDataInputStream.readFloat();
                                        length++;
                                    }
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return r111;
                                    } catch (IOException e11) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                        return r111;
                                    }
                                case 12:
                                    ?? r112 = new double[i3];
                                    while (length < i3) {
                                        r112[length] = byteOrderedDataInputStream.readDouble();
                                        length++;
                                    }
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return r112;
                                    } catch (IOException e12) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                        return r112;
                                    }
                                default:
                                    byteOrderedDataInputStream.close();
                                    return null;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            Log.w("ExifInterface", "IOException occurred during reading a value", e);
                            if (byteOrderedDataInputStream != null) {
                                byteOrderedDataInputStream.close();
                            }
                            return null;
                        }
                    } catch (IOException e14) {
                        e = e14;
                        byteOrderedDataInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e15) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    throw th;
                }
            } catch (IOException e16) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(ExifInterface.f5045E[this.f5066a]);
            sb.append(", data length:");
            return android.support.v4.media.a.i(this.d.length, ")", sb);
        }

        public ExifAttribute(long j, byte[] bArr, int i2, int i3) {
            this.f5066a = i2;
            this.f5067b = i3;
            this.f5068c = j;
            this.d = bArr;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ExifStreamType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface IfdType {
    }

    public static class Rational {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5073b;

        public Rational(long j, long j2) {
            if (j2 == 0) {
                this.f5072a = 0L;
                this.f5073b = 1L;
            } else {
                this.f5072a = j;
                this.f5073b = j2;
            }
        }

        public final String toString() {
            return this.f5072a + "/" + this.f5073b;
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f5045E = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f5046F = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        G = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        ExifTag[] exifTagArr = {new ExifTag("NewSubfileType", 254, 4), new ExifTag("SubfileType", 255, 4), new ExifTag("ImageWidth", 256, 3, 4), new ExifTag("ImageLength", 257, 3, 4), new ExifTag("BitsPerSample", 258, 3), new ExifTag("Compression", 259, 3), new ExifTag("PhotometricInterpretation", 262, 3), new ExifTag("ImageDescription", 270, 2), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag("StripOffsets", 273, 3, 4), new ExifTag("Orientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag("RowsPerStrip", com.smartdigimkt.b0.a.W0, 3, 4), new ExifTag("StripByteCounts", com.smartdigimkt.b0.a.X0, 3, 4), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", com.smartdigimkt.b0.a.T0, 3), new ExifTag("TransferFunction", 301, 3), new ExifTag("Software", 305, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 2), new ExifTag("WhitePoint", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 5), new ExifTag("PrimaryChromaticities", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", 514, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("SensorTopBorder", 4, 4), new ExifTag("SensorLeftBorder", 5, 4), new ExifTag("SensorBottomBorder", 6, 4), new ExifTag("SensorRightBorder", 7, 4), new ExifTag("ISO", 23, 3), new ExifTag("JpgFromRaw", 46, 7), new ExifTag("Xmp", 700, 1)};
        ExifTag[] exifTagArr2 = {new ExifTag("ExposureTime", 33434, 5), new ExifTag("FNumber", 33437, 5), new ExifTag("ExposureProgram", 34850, 3), new ExifTag("SpectralSensitivity", 34852, 2), new ExifTag("PhotographicSensitivity", 34855, 3), new ExifTag("OECF", 34856, 7), new ExifTag("SensitivityType", 34864, 3), new ExifTag("StandardOutputSensitivity", 34865, 4), new ExifTag("RecommendedExposureIndex", 34866, 4), new ExifTag("ISOSpeed", 34867, 4), new ExifTag("ISOSpeedLatitudeyyy", 34868, 4), new ExifTag("ISOSpeedLatitudezzz", 34869, 4), new ExifTag("ExifVersion", 36864, 2), new ExifTag("DateTimeOriginal", 36867, 2), new ExifTag("DateTimeDigitized", 36868, 2), new ExifTag("OffsetTime", 36880, 2), new ExifTag("OffsetTimeOriginal", 36881, 2), new ExifTag("OffsetTimeDigitized", 36882, 2), new ExifTag("ComponentsConfiguration", 37121, 7), new ExifTag("CompressedBitsPerPixel", 37122, 5), new ExifTag("ShutterSpeedValue", 37377, 10), new ExifTag("ApertureValue", 37378, 5), new ExifTag("BrightnessValue", 37379, 10), new ExifTag("ExposureBiasValue", 37380, 10), new ExifTag("MaxApertureValue", 37381, 5), new ExifTag("SubjectDistance", 37382, 5), new ExifTag("MeteringMode", 37383, 3), new ExifTag("LightSource", 37384, 3), new ExifTag("Flash", 37385, 3), new ExifTag("FocalLength", 37386, 5), new ExifTag("SubjectArea", 37396, 3), new ExifTag("MakerNote", 37500, 7), new ExifTag("UserComment", 37510, 7), new ExifTag("SubSecTime", 37520, 2), new ExifTag("SubSecTimeOriginal", 37521, 2), new ExifTag("SubSecTimeDigitized", 37522, 2), new ExifTag("FlashpixVersion", 40960, 7), new ExifTag("ColorSpace", 40961, 3), new ExifTag("PixelXDimension", 40962, 3, 4), new ExifTag("PixelYDimension", 40963, 3, 4), new ExifTag("RelatedSoundFile", 40964, 2), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("FlashEnergy", 41483, 5), new ExifTag("SpatialFrequencyResponse", 41484, 7), new ExifTag("FocalPlaneXResolution", 41486, 5), new ExifTag("FocalPlaneYResolution", 41487, 5), new ExifTag("FocalPlaneResolutionUnit", 41488, 3), new ExifTag("SubjectLocation", 41492, 3), new ExifTag("ExposureIndex", 41493, 5), new ExifTag("SensingMethod", 41495, 3), new ExifTag("FileSource", 41728, 7), new ExifTag("SceneType", 41729, 7), new ExifTag("CFAPattern", 41730, 7), new ExifTag("CustomRendered", 41985, 3), new ExifTag("ExposureMode", 41986, 3), new ExifTag("WhiteBalance", 41987, 3), new ExifTag("DigitalZoomRatio", 41988, 5), new ExifTag("FocalLengthIn35mmFilm", 41989, 3), new ExifTag("SceneCaptureType", 41990, 3), new ExifTag("GainControl", 41991, 3), new ExifTag("Contrast", 41992, 3), new ExifTag("Saturation", 41993, 3), new ExifTag("Sharpness", 41994, 3), new ExifTag("DeviceSettingDescription", 41995, 7), new ExifTag("SubjectDistanceRange", 41996, 3), new ExifTag("ImageUniqueID", 42016, 2), new ExifTag("CameraOwnerName", 42032, 2), new ExifTag("BodySerialNumber", 42033, 2), new ExifTag("LensSpecification", 42034, 5), new ExifTag("LensMake", 42035, 2), new ExifTag("LensModel", 42036, 2), new ExifTag("Gamma", 42240, 5), new ExifTag("DNGVersion", 50706, 1), new ExifTag("DefaultCropSize", 50720, 3, 4)};
        ExifTag[] exifTagArr3 = {new ExifTag("GPSVersionID", 0, 1), new ExifTag("GPSLatitudeRef", 1, 2), new ExifTag("GPSLatitude", 2, 5, 10), new ExifTag("GPSLongitudeRef", 3, 2), new ExifTag("GPSLongitude", 4, 5, 10), new ExifTag("GPSAltitudeRef", 5, 1), new ExifTag("GPSAltitude", 6, 5), new ExifTag("GPSTimeStamp", 7, 5), new ExifTag("GPSSatellites", 8, 2), new ExifTag("GPSStatus", 9, 2), new ExifTag("GPSMeasureMode", 10, 2), new ExifTag("GPSDOP", 11, 5), new ExifTag("GPSSpeedRef", 12, 2), new ExifTag("GPSSpeed", 13, 5), new ExifTag("GPSTrackRef", 14, 2), new ExifTag("GPSTrack", 15, 5), new ExifTag("GPSImgDirectionRef", 16, 2), new ExifTag("GPSImgDirection", 17, 5), new ExifTag("GPSMapDatum", 18, 2), new ExifTag("GPSDestLatitudeRef", 19, 2), new ExifTag("GPSDestLatitude", 20, 5), new ExifTag("GPSDestLongitudeRef", 21, 2), new ExifTag("GPSDestLongitude", 22, 5), new ExifTag("GPSDestBearingRef", 23, 2), new ExifTag("GPSDestBearing", 24, 5), new ExifTag("GPSDestDistanceRef", 25, 2), new ExifTag("GPSDestDistance", 26, 5), new ExifTag("GPSProcessingMethod", 27, 7), new ExifTag("GPSAreaInformation", 28, 7), new ExifTag("GPSDateStamp", 29, 2), new ExifTag("GPSDifferential", 30, 3), new ExifTag("GPSHPositioningError", 31, 5)};
        ExifTag[] exifTagArr4 = {new ExifTag("InteroperabilityIndex", 1, 2)};
        ExifTag[] exifTagArr5 = {new ExifTag("NewSubfileType", 254, 4), new ExifTag("SubfileType", 255, 4), new ExifTag("ThumbnailImageWidth", 256, 3, 4), new ExifTag("ThumbnailImageLength", 257, 3, 4), new ExifTag("BitsPerSample", 258, 3), new ExifTag("Compression", 259, 3), new ExifTag("PhotometricInterpretation", 262, 3), new ExifTag("ImageDescription", 270, 2), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag("StripOffsets", 273, 3, 4), new ExifTag("ThumbnailOrientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag("RowsPerStrip", com.smartdigimkt.b0.a.W0, 3, 4), new ExifTag("StripByteCounts", com.smartdigimkt.b0.a.X0, 3, 4), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", com.smartdigimkt.b0.a.T0, 3), new ExifTag("TransferFunction", 301, 3), new ExifTag("Software", 305, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 2), new ExifTag("WhitePoint", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 5), new ExifTag("PrimaryChromaticities", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", 514, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("DNGVersion", 50706, 1), new ExifTag("DefaultCropSize", 50720, 3, 4)};
        H = new ExifTag("StripOffsets", 273, 3);
        f5047I = new ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4, exifTagArr5, exifTagArr, new ExifTag[]{new ExifTag("ThumbnailImage", 256, 7), new ExifTag("CameraSettingsIFDPointer", 8224, 4), new ExifTag("ImageProcessingIFDPointer", 8256, 4)}, new ExifTag[]{new ExifTag("PreviewImageStart", 257, 4), new ExifTag("PreviewImageLength", 258, 4)}, new ExifTag[]{new ExifTag("AspectFrame", 4371, 3)}, new ExifTag[]{new ExifTag("ColorSpace", 55, 3)}};
        f5048J = new ExifTag[]{new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("CameraSettingsIFDPointer", 8224, 1), new ExifTag("ImageProcessingIFDPointer", 8256, 1)};
        K = new HashMap[10];
        L = new HashMap[10];
        M = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f5049N = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        O = charsetForName;
        f5050P = "Exif\u0000\u0000".getBytes(charsetForName);
        f5051Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat(g.f37185a, locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            ExifTag[][] exifTagArr6 = f5047I;
            if (i2 >= exifTagArr6.length) {
                HashMap map = f5049N;
                ExifTag[] exifTagArr7 = f5048J;
                map.put(Integer.valueOf(exifTagArr7[0].f5069a), 5);
                map.put(Integer.valueOf(exifTagArr7[1].f5069a), 1);
                map.put(Integer.valueOf(exifTagArr7[2].f5069a), 2);
                map.put(Integer.valueOf(exifTagArr7[3].f5069a), 3);
                map.put(Integer.valueOf(exifTagArr7[4].f5069a), 7);
                map.put(Integer.valueOf(exifTagArr7[5].f5069a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            K[i2] = new HashMap();
            L[i2] = new HashMap();
            for (ExifTag exifTag : exifTagArr6[i2]) {
                K[i2].put(Integer.valueOf(exifTag.f5069a), exifTag);
                L[i2].put(exifTag.f5070b, exifTag);
            }
            i2++;
        }
    }

    public ExifInterface(String str) throws Throwable {
        boolean z2;
        ExifTag[][] exifTagArr = f5047I;
        this.f5060e = new HashMap[exifTagArr.length];
        this.f = new HashSet(exifTagArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f5059c = null;
        this.f5057a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    ExifInterfaceUtils.Api21Impl.c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    z2 = true;
                } catch (Exception unused) {
                    if (m) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z2 = false;
                }
                if (z2) {
                    this.f5058b = fileInputStream2.getFD();
                } else {
                    this.f5058b = null;
                }
                p(fileInputStream2);
                try {
                    fileInputStream2.close();
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused2) {
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (RuntimeException e3) {
                        throw e3;
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static ByteOrder s(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        short s2 = byteOrderedDataInputStream.readShort();
        boolean z2 = m;
        if (s2 == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 != 19789) {
            throw new IOException(a.h(s2, new StringBuilder("Invalid byte order: ")));
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.f5060e;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(O);
            map.put("DateTime", new ExifAttribute(2, bytes.length, bytes));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", ExifAttribute.a(0L, this.g));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", ExifAttribute.a(0L, this.g));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", ExifAttribute.a(0L, this.g));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", ExifAttribute.a(0L, this.g));
        }
    }

    public final String b(String str) {
        ExifAttribute exifAttributeD = d(str);
        if (exifAttributeD != null) {
            if (!M.contains(str)) {
                return exifAttributeD.f(this.g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = exifAttributeD.f5066a;
                if (i2 != 5 && i2 != 10) {
                    a.u(i2, "GPS Timestamp format is not rational. format=", "ExifInterface");
                    return null;
                }
                Rational[] rationalArr = (Rational[]) exifAttributeD.g(this.g);
                if (rationalArr == null || rationalArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(rationalArr));
                    return null;
                }
                Rational rational = rationalArr[0];
                Integer numValueOf = Integer.valueOf((int) (rational.f5072a / rational.f5073b));
                Rational rational2 = rationalArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (rational2.f5072a / rational2.f5073b));
                Rational rational3 = rationalArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (rational3.f5072a / rational3.f5073b)));
            }
            try {
                return Double.toString(exifAttributeD.d(this.g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int c() {
        ExifAttribute exifAttributeD = d("Orientation");
        if (exifAttributeD == null) {
            return 1;
        }
        try {
            return exifAttributeD.e(this.g);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final ExifAttribute d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < f5047I.length; i2++) {
            ExifAttribute exifAttribute = (ExifAttribute) this.f5060e[i2].get(str);
            if (exifAttribute != null) {
                return exifAttribute;
            }
        }
        return null;
    }

    public final void e(final SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i2;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                ExifInterfaceUtils.Api23Impl.a(mediaMetadataRetriever, new MediaDataSource() { // from class: androidx.exifinterface.media.ExifInterface.1
                    public long X;

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                    }

                    @Override // android.media.MediaDataSource
                    public final long getSize() {
                        return -1L;
                    }

                    @Override // android.media.MediaDataSource
                    public final int readAt(long j, byte[] bArr, int i3, int i4) {
                        if (i4 == 0) {
                            return 0;
                        }
                        if (j < 0) {
                            return -1;
                        }
                        try {
                            long j2 = this.X;
                            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = seekableByteOrderedDataInputStream;
                            if (j2 != j) {
                                if (j2 >= 0 && j >= j2 + ((long) seekableByteOrderedDataInputStream2.X.available())) {
                                    return -1;
                                }
                                seekableByteOrderedDataInputStream2.h(j);
                                this.X = j;
                            }
                            if (i4 > seekableByteOrderedDataInputStream2.X.available()) {
                                i4 = seekableByteOrderedDataInputStream2.X.available();
                            }
                            int i5 = seekableByteOrderedDataInputStream2.read(bArr, i3, i4);
                            if (i5 >= 0) {
                                this.X += (long) i5;
                                return i5;
                            }
                        } catch (IOException unused) {
                        }
                        this.X = -1L;
                        return -1;
                    }
                });
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f5060e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", ExifAttribute.c(Integer.parseInt(strExtractMetadata), this.g));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", ExifAttribute.c(Integer.parseInt(strExtractMetadata2), this.g));
                }
                if (strExtractMetadata3 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata3);
                    if (i3 == 90) {
                        i2 = 6;
                    } else if (i3 != 180) {
                        i2 = i3 != 270 ? 1 : 8;
                    } else {
                        i2 = 3;
                    }
                    mapArr[0].put("Orientation", ExifAttribute.c(i2, this.g));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata4);
                    int i5 = Integer.parseInt(strExtractMetadata5);
                    if (i5 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    seekableByteOrderedDataInputStream.h(i4);
                    byte[] bArr = new byte[6];
                    if (seekableByteOrderedDataInputStream.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i6 = i4 + 6;
                    int i7 = i5 - 6;
                    if (!Arrays.equals(bArr, f5050P)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i7];
                    if (seekableByteOrderedDataInputStream.read(bArr2) != i7) {
                        throw new IOException("Can't read exif");
                    }
                    this.f5062i = i6;
                    t(0, bArr2);
                }
                if (m) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x013f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0146 A[LOOP:2: B:69:0x013c->B:74:0x0146, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0158  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void f(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.f(androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:108:0x013d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:110:0x0140  */
    /* JADX WARN: Code duplicated, block: B:113:0x0147  */
    /* JADX WARN: Code duplicated, block: B:116:0x0150 A[LOOP:2: B:111:0x0142->B:116:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x0156 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:121:0x0159  */
    /* JADX WARN: Code duplicated, block: B:124:0x0160  */
    /* JADX WARN: Code duplicated, block: B:127:0x0169 A[LOOP:3: B:122:0x015b->B:127:0x0169, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x0173  */
    /* JADX WARN: Code duplicated, block: B:134:0x017d A[LOOP:4: B:129:0x016e->B:134:0x017d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x0183 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:0x0186 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:158:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0166 A[EDGE_INSN: B:171:0x0166->B:126:0x0166 BREAK  A[LOOP:3: B:122:0x015b->B:127:0x0169], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0166 A[EDGE_INSN: B:173:0x0166->B:126:0x0166 BREAK  A[LOOP:3: B:122:0x015b->B:127:0x0169], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x0109 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x0120  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    public final int g(BufferedInputStream bufferedInputStream) throws Throwable {
        int i2;
        ByteOrderedDataInputStream byteOrderedDataInputStream;
        ByteOrderedDataInputStream byteOrderedDataInputStream2;
        int i3;
        int i4;
        int i5;
        byte[] bArr;
        int i6;
        int i7;
        byte[] bArr2;
        int i8;
        byte[] bArr3;
        int i9;
        ByteOrderedDataInputStream byteOrderedDataInputStream3;
        short s2;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr5 = r;
            if (i10 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i10] != bArr5[i10]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i11 = 0; i11 < bytes.length; i11++) {
                    if (bArr4[i11] != bytes[i11]) {
                        ByteOrderedDataInputStream byteOrderedDataInputStream4 = null;
                        try {
                            byteOrderedDataInputStream = new ByteOrderedDataInputStream(bArr4);
                            try {
                                try {
                                    try {
                                        try {
                                            long j2 = byteOrderedDataInputStream.readInt();
                                            byte[] bArr6 = new byte[4];
                                            byteOrderedDataInputStream.read(bArr6);
                                            if (Arrays.equals(bArr6, s)) {
                                                if (j2 == 1) {
                                                    j2 = byteOrderedDataInputStream.readLong();
                                                    j = 16;
                                                    if (j2 < 16) {
                                                    }
                                                    byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr4);
                                                    ByteOrder byteOrderS = s(byteOrderedDataInputStream2);
                                                    this.g = byteOrderS;
                                                    byteOrderedDataInputStream2.f5065Y = byteOrderS;
                                                    s2 = byteOrderedDataInputStream2.readShort();
                                                    if (s2 != 20306 || s2 == 21330) {
                                                        i3 = 1;
                                                    } else {
                                                        i3 = i2;
                                                    }
                                                    byteOrderedDataInputStream2.close();
                                                    if (i3 != 0) {
                                                        return 7;
                                                    }
                                                    try {
                                                        byteOrderedDataInputStream3 = new ByteOrderedDataInputStream(bArr4);
                                                        try {
                                                            ByteOrder byteOrderS2 = s(byteOrderedDataInputStream3);
                                                            this.g = byteOrderS2;
                                                            byteOrderedDataInputStream3.f5065Y = byteOrderS2;
                                                            if (byteOrderedDataInputStream3.readShort() == 85) {
                                                                i4 = 1;
                                                            } else {
                                                                i4 = i2;
                                                            }
                                                            byteOrderedDataInputStream3.close();
                                                        } catch (Exception unused) {
                                                            byteOrderedDataInputStream4 = byteOrderedDataInputStream3;
                                                            if (byteOrderedDataInputStream4 != null) {
                                                                byteOrderedDataInputStream4.close();
                                                            }
                                                            i4 = i2;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            byteOrderedDataInputStream4 = byteOrderedDataInputStream3;
                                                            if (byteOrderedDataInputStream4 != null) {
                                                                byteOrderedDataInputStream4.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception unused2) {
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                    }
                                                    if (i4 != 0) {
                                                        return 10;
                                                    }
                                                    i5 = i2;
                                                    while (true) {
                                                        bArr = x;
                                                        if (i5 < bArr.length) {
                                                            i6 = 1;
                                                            break;
                                                        }
                                                        if (bArr4[i5] != bArr[i5]) {
                                                            i6 = i2;
                                                            break;
                                                        }
                                                        i5++;
                                                    }
                                                    if (i6 != 0) {
                                                        return 13;
                                                    }
                                                    i7 = i2;
                                                    while (true) {
                                                        bArr2 = f5044B;
                                                        if (i7 < bArr2.length) {
                                                            i8 = i2;
                                                            while (true) {
                                                                bArr3 = C;
                                                                if (i8 < bArr3.length) {
                                                                    i9 = 1;
                                                                    break;
                                                                }
                                                                if (bArr4[bArr2.length + i8 + 4] != bArr3[i8]) {
                                                                    break;
                                                                }
                                                                i8++;
                                                            }
                                                            if (i9 != 0) {
                                                                return 14;
                                                            }
                                                            return i2;
                                                        }
                                                        if (bArr4[i7] != bArr2[i7]) {
                                                            break;
                                                        }
                                                        i7++;
                                                    }
                                                    i9 = i2;
                                                    if (i9 != 0) {
                                                        return 14;
                                                    }
                                                    return i2;
                                                }
                                                j = 8;
                                                i2 = 0;
                                                long j3 = 5000;
                                                if (j2 > j3) {
                                                    j2 = j3;
                                                }
                                                long j4 = j2 - j;
                                                if (j4 >= 8) {
                                                    try {
                                                        byte[] bArr7 = new byte[4];
                                                        boolean z2 = false;
                                                        boolean z3 = false;
                                                        for (long j5 = 0; j5 < j4 / 4 && byteOrderedDataInputStream.read(bArr7) == 4; j5++) {
                                                            if (j5 != 1) {
                                                                if (Arrays.equals(bArr7, t)) {
                                                                    z2 = true;
                                                                } else if (Arrays.equals(bArr7, f5054u)) {
                                                                    z3 = true;
                                                                }
                                                                if (z2 && z3) {
                                                                    byteOrderedDataInputStream.close();
                                                                    return 12;
                                                                }
                                                            }
                                                        }
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        if (m) {
                                                            Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                        }
                                                        if (byteOrderedDataInputStream != null) {
                                                        }
                                                        byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr4);
                                                        ByteOrder byteOrderS3 = s(byteOrderedDataInputStream2);
                                                        this.g = byteOrderS3;
                                                        byteOrderedDataInputStream2.f5065Y = byteOrderS3;
                                                        s2 = byteOrderedDataInputStream2.readShort();
                                                        if (s2 != 20306) {
                                                            i3 = 1;
                                                        } else {
                                                            i3 = 1;
                                                        }
                                                        byteOrderedDataInputStream2.close();
                                                        if (i3 != 0) {
                                                            return 7;
                                                        }
                                                        byteOrderedDataInputStream3 = new ByteOrderedDataInputStream(bArr4);
                                                        ByteOrder byteOrderS4 = s(byteOrderedDataInputStream3);
                                                        this.g = byteOrderS4;
                                                        byteOrderedDataInputStream3.f5065Y = byteOrderS4;
                                                        if (byteOrderedDataInputStream3.readShort() == 85) {
                                                            i4 = 1;
                                                        } else {
                                                            i4 = i2;
                                                        }
                                                        byteOrderedDataInputStream3.close();
                                                        if (i4 != 0) {
                                                            return 10;
                                                        }
                                                        i5 = i2;
                                                        while (true) {
                                                            bArr = x;
                                                            if (i5 < bArr.length) {
                                                                i6 = 1;
                                                                break;
                                                            }
                                                            if (bArr4[i5] != bArr[i5]) {
                                                                i6 = i2;
                                                                break;
                                                            }
                                                            i5++;
                                                        }
                                                        if (i6 != 0) {
                                                            return 13;
                                                        }
                                                        i7 = i2;
                                                        while (true) {
                                                            bArr2 = f5044B;
                                                            if (i7 < bArr2.length) {
                                                                i8 = i2;
                                                                while (true) {
                                                                    bArr3 = C;
                                                                    if (i8 < bArr3.length) {
                                                                        i9 = 1;
                                                                        break;
                                                                    }
                                                                    if (bArr4[bArr2.length + i8 + 4] != bArr3[i8]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i8++;
                                                                }
                                                                if (i9 != 0) {
                                                                    return 14;
                                                                }
                                                                return i2;
                                                            }
                                                            if (bArr4[i7] != bArr2[i7]) {
                                                                break;
                                                                break;
                                                            }
                                                            i7++;
                                                        }
                                                        i9 = i2;
                                                        if (i9 != 0) {
                                                            return 14;
                                                        }
                                                        return i2;
                                                    }
                                                }
                                                byteOrderedDataInputStream.close();
                                                byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr4);
                                                ByteOrder byteOrderS5 = s(byteOrderedDataInputStream2);
                                                this.g = byteOrderS5;
                                                byteOrderedDataInputStream2.f5065Y = byteOrderS5;
                                                s2 = byteOrderedDataInputStream2.readShort();
                                                if (s2 != 20306) {
                                                    i3 = 1;
                                                } else {
                                                    i3 = 1;
                                                }
                                                byteOrderedDataInputStream2.close();
                                                if (i3 != 0) {
                                                    return 7;
                                                }
                                                byteOrderedDataInputStream3 = new ByteOrderedDataInputStream(bArr4);
                                                ByteOrder byteOrderS6 = s(byteOrderedDataInputStream3);
                                                this.g = byteOrderS6;
                                                byteOrderedDataInputStream3.f5065Y = byteOrderS6;
                                                if (byteOrderedDataInputStream3.readShort() == 85) {
                                                    i4 = 1;
                                                } else {
                                                    i4 = i2;
                                                }
                                                byteOrderedDataInputStream3.close();
                                                if (i4 != 0) {
                                                    return 10;
                                                }
                                                i5 = i2;
                                                while (true) {
                                                    bArr = x;
                                                    if (i5 < bArr.length) {
                                                        i6 = 1;
                                                        break;
                                                    }
                                                    if (bArr4[i5] != bArr[i5]) {
                                                        i6 = i2;
                                                        break;
                                                    }
                                                    i5++;
                                                }
                                                if (i6 != 0) {
                                                    return 13;
                                                }
                                                i7 = i2;
                                                while (true) {
                                                    bArr2 = f5044B;
                                                    if (i7 < bArr2.length) {
                                                        i8 = i2;
                                                        while (true) {
                                                            bArr3 = C;
                                                            if (i8 < bArr3.length) {
                                                                i9 = 1;
                                                                break;
                                                            }
                                                            if (bArr4[bArr2.length + i8 + 4] != bArr3[i8]) {
                                                                break;
                                                                break;
                                                            }
                                                            i8++;
                                                        }
                                                        if (i9 != 0) {
                                                            return 14;
                                                        }
                                                        return i2;
                                                    }
                                                    if (bArr4[i7] != bArr2[i7]) {
                                                        break;
                                                        break;
                                                    }
                                                    i7++;
                                                }
                                                i9 = i2;
                                                if (i9 != 0) {
                                                    return 14;
                                                }
                                                return i2;
                                            }
                                            byteOrderedDataInputStream.close();
                                            i2 = 0;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            byteOrderedDataInputStream4 = byteOrderedDataInputStream;
                                            if (byteOrderedDataInputStream4 != null) {
                                                byteOrderedDataInputStream4.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        i2 = 0;
                                    }
                                    ByteOrder byteOrderS7 = s(byteOrderedDataInputStream2);
                                    this.g = byteOrderS7;
                                    byteOrderedDataInputStream2.f5065Y = byteOrderS7;
                                    s2 = byteOrderedDataInputStream2.readShort();
                                    if (s2 != 20306) {
                                        i3 = 1;
                                    } else {
                                        i3 = 1;
                                    }
                                    byteOrderedDataInputStream2.close();
                                } catch (Exception unused3) {
                                    if (byteOrderedDataInputStream2 != null) {
                                        byteOrderedDataInputStream2.close();
                                    }
                                    i3 = i2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    byteOrderedDataInputStream4 = byteOrderedDataInputStream2;
                                    if (byteOrderedDataInputStream4 != null) {
                                        byteOrderedDataInputStream4.close();
                                    }
                                    throw th;
                                }
                                byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr4);
                            } catch (Exception unused4) {
                                byteOrderedDataInputStream2 = null;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            i2 = 0;
                            byteOrderedDataInputStream = null;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        if (i3 != 0) {
                            return 7;
                        }
                        byteOrderedDataInputStream3 = new ByteOrderedDataInputStream(bArr4);
                        ByteOrder byteOrderS8 = s(byteOrderedDataInputStream3);
                        this.g = byteOrderS8;
                        byteOrderedDataInputStream3.f5065Y = byteOrderS8;
                        if (byteOrderedDataInputStream3.readShort() == 85) {
                            i4 = 1;
                        } else {
                            i4 = i2;
                        }
                        byteOrderedDataInputStream3.close();
                        if (i4 != 0) {
                            return 10;
                        }
                        i5 = i2;
                        while (true) {
                            bArr = x;
                            if (i5 < bArr.length) {
                                i6 = 1;
                                break;
                            }
                            if (bArr4[i5] != bArr[i5]) {
                                i6 = i2;
                                break;
                            }
                            i5++;
                        }
                        if (i6 != 0) {
                            return 13;
                        }
                        i7 = i2;
                        while (true) {
                            bArr2 = f5044B;
                            if (i7 < bArr2.length) {
                                i8 = i2;
                                while (true) {
                                    bArr3 = C;
                                    if (i8 < bArr3.length) {
                                        i9 = 1;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i8 + 4] != bArr3[i8]) {
                                        break;
                                        break;
                                    }
                                    i8++;
                                }
                                if (i9 != 0) {
                                    return 14;
                                }
                                return i2;
                            }
                            if (bArr4[i7] != bArr2[i7]) {
                                break;
                                break;
                            }
                            i7++;
                        }
                        i9 = i2;
                        if (i9 != 0) {
                            return 14;
                        }
                        return i2;
                    }
                }
                return 9;
            }
            i10++;
        }
    }

    public final void h(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws Throwable {
        int i2;
        int i3;
        k(seekableByteOrderedDataInputStream);
        HashMap[] mapArr = this.f5060e;
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[1].get("MakerNote");
        if (exifAttribute != null) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.d);
            seekableByteOrderedDataInputStream2.f5065Y = this.g;
            byte[] bArr = v;
            byte[] bArr2 = new byte[bArr.length];
            seekableByteOrderedDataInputStream2.readFully(bArr2);
            seekableByteOrderedDataInputStream2.h(0L);
            byte[] bArr3 = f5055w;
            byte[] bArr4 = new byte[bArr3.length];
            seekableByteOrderedDataInputStream2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                seekableByteOrderedDataInputStream2.h(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                seekableByteOrderedDataInputStream2.h(12L);
            }
            u(seekableByteOrderedDataInputStream2, 6);
            ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[7].get("PreviewImageStart");
            ExifAttribute exifAttribute3 = (ExifAttribute) mapArr[7].get("PreviewImageLength");
            if (exifAttribute2 != null && exifAttribute3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", exifAttribute2);
                mapArr[5].put("JPEGInterchangeFormatLength", exifAttribute3);
            }
            ExifAttribute exifAttribute4 = (ExifAttribute) mapArr[8].get("AspectFrame");
            if (exifAttribute4 != null) {
                int[] iArr = (int[]) exifAttribute4.g(this.g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i4 = iArr[2];
                int i5 = iArr[0];
                if (i4 <= i5 || (i2 = iArr[3]) <= (i3 = iArr[1])) {
                    return;
                }
                int i6 = (i4 - i5) + 1;
                int i7 = (i2 - i3) + 1;
                if (i6 < i7) {
                    int i8 = i6 + i7;
                    i7 = i8 - i7;
                    i6 = i8 - i7;
                }
                ExifAttribute exifAttributeC = ExifAttribute.c(i6, this.g);
                ExifAttribute exifAttributeC2 = ExifAttribute.c(i7, this.g);
                mapArr[0].put("ImageWidth", exifAttributeC);
                mapArr[0].put("ImageLength", exifAttributeC2);
            }
        }
    }

    public final void i(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        if (m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.f5065Y = ByteOrder.BIG_ENDIAN;
        byte[] bArr = x;
        byteOrderedDataInputStream.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i2 = byteOrderedDataInputStream.readInt();
                byte[] bArr2 = new byte[4];
                if (byteOrderedDataInputStream.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i3 = length + 8;
                if (i3 == 16 && !Arrays.equals(bArr2, f5056z)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f5043A)) {
                    return;
                }
                if (Arrays.equals(bArr2, y)) {
                    byte[] bArr3 = new byte[i2];
                    if (byteOrderedDataInputStream.read(bArr3) != i2) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + ExifInterfaceUtils.a(bArr2));
                    }
                    int i4 = byteOrderedDataInputStream.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i4) {
                        this.f5062i = i3;
                        t(0, bArr3);
                        z();
                        w(new ByteOrderedDataInputStream(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i4 + ", calculated CRC value: " + crc32.getValue());
                }
                int i5 = i2 + 4;
                byteOrderedDataInputStream.a(i5);
                length = i3 + i5;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void j(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        boolean z2 = m;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        byteOrderedDataInputStream.read(bArr);
        byteOrderedDataInputStream.read(bArr2);
        byteOrderedDataInputStream.read(bArr3);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        int i4 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i3];
        byteOrderedDataInputStream.a(i2 - byteOrderedDataInputStream.Z);
        byteOrderedDataInputStream.read(bArr4);
        f(new ByteOrderedDataInputStream(bArr4), i2, 5);
        byteOrderedDataInputStream.a(i4 - byteOrderedDataInputStream.Z);
        byteOrderedDataInputStream.f5065Y = ByteOrder.BIG_ENDIAN;
        int i5 = byteOrderedDataInputStream.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i5);
        }
        for (int i6 = 0; i6 < i5; i6++) {
            int unsignedShort = byteOrderedDataInputStream.readUnsignedShort();
            int unsignedShort2 = byteOrderedDataInputStream.readUnsignedShort();
            if (unsignedShort == H.f5069a) {
                short s2 = byteOrderedDataInputStream.readShort();
                short s3 = byteOrderedDataInputStream.readShort();
                ExifAttribute exifAttributeC = ExifAttribute.c(s2, this.g);
                ExifAttribute exifAttributeC2 = ExifAttribute.c(s3, this.g);
                HashMap[] mapArr = this.f5060e;
                mapArr[0].put("ImageLength", exifAttributeC);
                mapArr[0].put("ImageWidth", exifAttributeC2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s2) + ", width: " + ((int) s3));
                    return;
                }
                return;
            }
            byteOrderedDataInputStream.a(unsignedShort2);
        }
    }

    public final void k(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws Throwable {
        q(seekableByteOrderedDataInputStream);
        u(seekableByteOrderedDataInputStream, 0);
        y(seekableByteOrderedDataInputStream, 0);
        y(seekableByteOrderedDataInputStream, 5);
        y(seekableByteOrderedDataInputStream, 4);
        z();
        if (this.d == 8) {
            HashMap[] mapArr = this.f5060e;
            ExifAttribute exifAttribute = (ExifAttribute) mapArr[1].get("MakerNote");
            if (exifAttribute != null) {
                SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.d);
                seekableByteOrderedDataInputStream2.f5065Y = this.g;
                seekableByteOrderedDataInputStream2.a(6);
                u(seekableByteOrderedDataInputStream2, 9);
                ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[9].get("ColorSpace");
                if (exifAttribute2 != null) {
                    mapArr[1].put("ColorSpace", exifAttribute2);
                }
            }
        }
    }

    public final void l(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws Throwable {
        if (m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + seekableByteOrderedDataInputStream);
        }
        k(seekableByteOrderedDataInputStream);
        HashMap[] mapArr = this.f5060e;
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[0].get("JpgFromRaw");
        if (exifAttribute != null) {
            f(new ByteOrderedDataInputStream(exifAttribute.d), (int) exifAttribute.f5068c, 5);
        }
        ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[0].get("ISO");
        ExifAttribute exifAttribute3 = (ExifAttribute) mapArr[1].get("PhotographicSensitivity");
        if (exifAttribute2 == null || exifAttribute3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", exifAttribute2);
    }

    public final void m(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        if (m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.f5065Y = ByteOrder.LITTLE_ENDIAN;
        byteOrderedDataInputStream.a(f5044B.length);
        int i2 = byteOrderedDataInputStream.readInt() + 8;
        byte[] bArr = C;
        byteOrderedDataInputStream.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (byteOrderedDataInputStream.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i3 = byteOrderedDataInputStream.readInt();
                int i4 = length + 8;
                if (Arrays.equals(D, bArr2)) {
                    byte[] bArr3 = new byte[i3];
                    if (byteOrderedDataInputStream.read(bArr3) == i3) {
                        this.f5062i = i4;
                        t(0, bArr3);
                        w(new ByteOrderedDataInputStream(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + ExifInterfaceUtils.a(bArr2));
                    }
                }
                if (i3 % 2 == 1) {
                    i3++;
                }
                length = i4 + i3;
                if (length == i2) {
                    return;
                }
                if (length > i2) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                byteOrderedDataInputStream.a(i3);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void n(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap map) throws Throwable {
        ExifAttribute exifAttribute = (ExifAttribute) map.get("JPEGInterchangeFormat");
        ExifAttribute exifAttribute2 = (ExifAttribute) map.get("JPEGInterchangeFormatLength");
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        int iE = exifAttribute.e(this.g);
        int iE2 = exifAttribute2.e(this.g);
        if (this.d == 7) {
            iE += this.j;
        }
        if (iE > 0 && iE2 > 0 && this.f5057a == null && this.f5059c == null && this.f5058b == null) {
            byteOrderedDataInputStream.skip(iE);
            byteOrderedDataInputStream.read(new byte[iE2]);
        }
        if (m) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final boolean o(HashMap map) {
        ExifAttribute exifAttribute = (ExifAttribute) map.get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) map.get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            return false;
        }
        return exifAttribute.e(this.g) <= 512 && exifAttribute2.e(this.g) <= 512;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008f A[Catch: all -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0004, B:5:0x0009, B:12:0x001e, B:18:0x003b, B:20:0x0046, B:28:0x005c, B:23:0x004d, B:26:0x0055, B:27:0x0059, B:29:0x0066, B:31:0x006f, B:33:0x0075, B:35:0x007b, B:37:0x0081, B:43:0x008f), top: B:53:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public final void p(InputStream inputStream) {
        boolean z2 = m;
        for (int i2 = 0; i2 < f5047I.length; i2++) {
            try {
                try {
                    this.f5060e[i2] = new HashMap();
                } catch (IOException e2) {
                    e = e2;
                    if (z2) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    a();
                    if (z2) {
                        r();
                        return;
                    }
                    return;
                } catch (UnsupportedOperationException e3) {
                    e = e3;
                    if (z2) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    a();
                    if (z2) {
                        r();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                a();
                if (z2) {
                    r();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iG = g(bufferedInputStream);
        this.d = iG;
        if (iG == 4 || iG == 9 || iG == 13 || iG == 14) {
            ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(bufferedInputStream);
            int i3 = this.d;
            if (i3 == 4) {
                f(byteOrderedDataInputStream, 0, 0);
            } else if (i3 == 13) {
                i(byteOrderedDataInputStream);
            } else if (i3 == 9) {
                j(byteOrderedDataInputStream);
            } else if (i3 == 14) {
                m(byteOrderedDataInputStream);
            }
        } else {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(bufferedInputStream);
            int i4 = this.d;
            if (i4 == 12) {
                e(seekableByteOrderedDataInputStream);
            } else if (i4 == 7) {
                h(seekableByteOrderedDataInputStream);
            } else if (i4 == 10) {
                l(seekableByteOrderedDataInputStream);
            } else {
                k(seekableByteOrderedDataInputStream);
            }
            seekableByteOrderedDataInputStream.h(this.f5062i);
            w(seekableByteOrderedDataInputStream);
        }
        a();
        if (z2) {
            r();
        }
    }

    public final void q(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        ByteOrder byteOrderS = s(seekableByteOrderedDataInputStream);
        this.g = byteOrderS;
        seekableByteOrderedDataInputStream.f5065Y = byteOrderS;
        int unsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
        int i2 = this.d;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            throw new IOException(a.h(unsignedShort, new StringBuilder("Invalid start code: ")));
        }
        int i3 = seekableByteOrderedDataInputStream.readInt();
        if (i3 < 8) {
            throw new IOException(android.support.v4.media.a.h(i3, "Invalid first Ifd offset: "));
        }
        int i4 = i3 - 8;
        if (i4 > 0) {
            seekableByteOrderedDataInputStream.a(i4);
        }
    }

    public final void r() {
        int i2 = 0;
        while (true) {
            HashMap[] mapArr = this.f5060e;
            if (i2 >= mapArr.length) {
                return;
            }
            StringBuilder sbU = android.support.v4.media.a.u(i2, "The size of tag group[", "]: ");
            sbU.append(mapArr[i2].size());
            Log.d("ExifInterface", sbU.toString());
            for (Map.Entry entry : mapArr[i2].entrySet()) {
                ExifAttribute exifAttribute = (ExifAttribute) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + exifAttribute.toString() + ", tagValue: '" + exifAttribute.f(this.g) + "'");
            }
            i2++;
        }
    }

    public final void t(int i2, byte[] bArr) throws IOException {
        SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(bArr);
        q(seekableByteOrderedDataInputStream);
        u(seekableByteOrderedDataInputStream, i2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0206  */
    /* JADX WARN: Code duplicated, block: B:103:0x020a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0217  */
    /* JADX WARN: Code duplicated, block: B:109:0x021c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0228  */
    /* JADX WARN: Code duplicated, block: B:112:0x022f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0246  */
    /* JADX WARN: Code duplicated, block: B:117:0x0253  */
    /* JADX WARN: Code duplicated, block: B:118:0x025e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0260  */
    /* JADX WARN: Code duplicated, block: B:120:0x027f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0283  */
    /* JADX WARN: Code duplicated, block: B:124:0x0298  */
    /* JADX WARN: Code duplicated, block: B:126:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:129:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:140:0x0301  */
    /* JADX WARN: Code duplicated, block: B:167:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0148  */
    /* JADX WARN: Code duplicated, block: B:72:0x014d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0153  */
    /* JADX WARN: Code duplicated, block: B:76:0x0159  */
    /* JADX WARN: Code duplicated, block: B:77:0x016d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0174  */
    /* JADX WARN: Code duplicated, block: B:82:0x017e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0180  */
    /* JADX WARN: Code duplicated, block: B:84:0x0185  */
    /* JADX WARN: Code duplicated, block: B:86:0x0188  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:99:0x0202  */
    /* JADX WARN: Instruction removed from duplicated block: B:119:0x0260, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x0283, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0159, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01e1, please report this as an issue */
    public final void u(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i2) throws IOException {
        HashMap[] mapArr;
        HashSet hashSet;
        long j;
        boolean z2;
        int i3;
        Integer num;
        String str;
        int unsignedShort;
        long j2;
        int i4;
        Integer numValueOf = Integer.valueOf(seekableByteOrderedDataInputStream.Z);
        HashSet hashSet2 = this.f;
        hashSet2.add(numValueOf);
        short s2 = seekableByteOrderedDataInputStream.readShort();
        boolean z3 = m;
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s2));
        }
        if (s2 <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            mapArr = this.f5060e;
            if (s3 >= s2) {
                break;
            }
            int unsignedShort2 = seekableByteOrderedDataInputStream.readUnsignedShort();
            int unsignedShort3 = seekableByteOrderedDataInputStream.readUnsignedShort();
            int i5 = seekableByteOrderedDataInputStream.readInt();
            long j3 = ((long) seekableByteOrderedDataInputStream.Z) + 4;
            ExifTag exifTag = (ExifTag) K[i2].get(Integer.valueOf(unsignedShort2));
            if (z3) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i2), Integer.valueOf(unsignedShort2), exifTag != null ? exifTag.f5070b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i5)));
            }
            if (exifTag != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f5046F;
                    if (unsignedShort3 < iArr.length) {
                        int i6 = exifTag.f5071c;
                        if (i6 == 7 || unsignedShort3 == 7 || i6 == unsignedShort3 || (i3 = exifTag.d) == unsignedShort3 || (((i6 == 4 || i3 == 4) && unsignedShort3 == 3) || (((i6 == 9 || i3 == 9) && unsignedShort3 == 8) || ((i6 == 12 || i3 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i6;
                            }
                            hashSet = hashSet2;
                            j = ((long) i5) * ((long) iArr[unsignedShort3]);
                            if (j < 0 || j > 2147483647L) {
                                if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i5);
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f5045E[unsignedShort3] + ") is unexpected for tag: " + exifTag.f5070b);
                        }
                    }
                    if (z2) {
                        if (j > 4) {
                            i4 = seekableByteOrderedDataInputStream.readInt();
                            if (z3 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i4);
                            }
                            if (this.d == 7) {
                                if ("MakerNote".equals(exifTag.f5070b)) {
                                    this.j = i4;
                                } else if (i2 != 6 && "ThumbnailImage".equals(exifTag.f5070b)) {
                                    this.k = i4;
                                    this.f5063l = i5;
                                    ExifAttribute exifAttributeC = ExifAttribute.c(6, this.g);
                                    ExifAttribute exifAttributeA = ExifAttribute.a(this.k, this.g);
                                    ExifAttribute exifAttributeA2 = ExifAttribute.a(this.f5063l, this.g);
                                    mapArr[4].put("Compression", exifAttributeC);
                                    mapArr[4].put("JPEGInterchangeFormat", exifAttributeA);
                                    mapArr[4].put("JPEGInterchangeFormatLength", exifAttributeA2);
                                }
                            }
                            seekableByteOrderedDataInputStream.h(i4);
                        } else {
                            hashSet = hashSet;
                            unsignedShort2 = unsignedShort2;
                            i5 = i5;
                        }
                        num = (Integer) f5049N.get(Integer.valueOf(unsignedShort2));
                        if (z3 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j2 = ((long) seekableByteOrderedDataInputStream.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = seekableByteOrderedDataInputStream.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = seekableByteOrderedDataInputStream.readInt();
                                } else {
                                    j2 = -1;
                                }
                                if (z3 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j2), exifTag.f5070b));
                                }
                                if (j2 > 0) {
                                    hashSet = hashSet;
                                    if (!hashSet.contains(Integer.valueOf((int) j2))) {
                                        seekableByteOrderedDataInputStream.h(j2);
                                        u(seekableByteOrderedDataInputStream, num.intValue());
                                    } else if (z3 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j2 + ")");
                                    }
                                } else {
                                    hashSet = hashSet;
                                    if (z3 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j2);
                                    }
                                }
                                seekableByteOrderedDataInputStream.h(j3);
                            } else {
                                unsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
                            }
                            j2 = unsignedShort;
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j2), exifTag.f5070b));
                            }
                            if (j2 > 0) {
                                hashSet = hashSet;
                                if (!hashSet.contains(Integer.valueOf((int) j2))) {
                                    seekableByteOrderedDataInputStream.h(j2);
                                    u(seekableByteOrderedDataInputStream, num.intValue());
                                } else if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j2 + ")");
                                }
                            } else {
                                hashSet = hashSet;
                                if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j2);
                                }
                            }
                            seekableByteOrderedDataInputStream.h(j3);
                        } else {
                            hashSet = hashSet;
                            int i7 = seekableByteOrderedDataInputStream.Z + this.f5062i;
                            byte[] bArr = new byte[(int) j];
                            seekableByteOrderedDataInputStream.readFully(bArr);
                            ExifAttribute exifAttribute = new ExifAttribute(i7, bArr, unsignedShort3, i5);
                            mapArr[i2].put(exifTag.f5070b, exifAttribute);
                            str = exifTag.f5070b;
                            if ("DNGVersion".equals(str)) {
                                this.d = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && exifAttribute.f(this.g).contains("PENTAX")) || ("Compression".equals(str) && exifAttribute.e(this.g) == 65535)) {
                                this.d = 8;
                            }
                            if (seekableByteOrderedDataInputStream.Z != j3) {
                                seekableByteOrderedDataInputStream.h(j3);
                            }
                        }
                    } else {
                        seekableByteOrderedDataInputStream.h(j3);
                    }
                    s3 = (short) (s3 + 1);
                    hashSet2 = hashSet;
                    s2 = s2;
                    z3 = z3;
                }
                hashSet = hashSet2;
                if (z3 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j = 0;
                z2 = false;
                if (z2) {
                    seekableByteOrderedDataInputStream.h(j3);
                } else {
                    if (j > 4) {
                        i4 = seekableByteOrderedDataInputStream.readInt();
                        if (z3 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i4);
                        }
                        if (this.d == 7) {
                            if ("MakerNote".equals(exifTag.f5070b)) {
                                this.j = i4;
                            } else if (i2 != 6) {
                            }
                        }
                        seekableByteOrderedDataInputStream.h(i4);
                    } else {
                        hashSet = hashSet;
                        unsignedShort2 = unsignedShort2;
                        i5 = i5;
                    }
                    num = (Integer) f5049N.get(Integer.valueOf(unsignedShort2));
                    if (z3 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j2 = ((long) seekableByteOrderedDataInputStream.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = seekableByteOrderedDataInputStream.readInt();
                            } else {
                                unsignedShort = seekableByteOrderedDataInputStream.readShort();
                            }
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j2), exifTag.f5070b));
                            }
                            if (j2 > 0) {
                                hashSet = hashSet;
                                if (!hashSet.contains(Integer.valueOf((int) j2))) {
                                    seekableByteOrderedDataInputStream.h(j2);
                                    u(seekableByteOrderedDataInputStream, num.intValue());
                                } else if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j2 + ")");
                                }
                            } else {
                                hashSet = hashSet;
                                if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j2);
                                }
                            }
                            seekableByteOrderedDataInputStream.h(j3);
                        } else {
                            unsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
                        }
                        j2 = unsignedShort;
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j2), exifTag.f5070b));
                        }
                        if (j2 > 0) {
                            hashSet = hashSet;
                            if (!hashSet.contains(Integer.valueOf((int) j2))) {
                                seekableByteOrderedDataInputStream.h(j2);
                                u(seekableByteOrderedDataInputStream, num.intValue());
                            } else if (z3 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j2 + ")");
                            }
                        } else {
                            hashSet = hashSet;
                            if (z3 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j2);
                            }
                        }
                        seekableByteOrderedDataInputStream.h(j3);
                    } else {
                        hashSet = hashSet;
                        int i8 = seekableByteOrderedDataInputStream.Z + this.f5062i;
                        byte[] bArr2 = new byte[(int) j];
                        seekableByteOrderedDataInputStream.readFully(bArr2);
                        ExifAttribute exifAttribute2 = new ExifAttribute(i8, bArr2, unsignedShort3, i5);
                        mapArr[i2].put(exifTag.f5070b, exifAttribute2);
                        str = exifTag.f5070b;
                        if ("DNGVersion".equals(str)) {
                            this.d = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.d = 8;
                        if (seekableByteOrderedDataInputStream.Z != j3) {
                            seekableByteOrderedDataInputStream.h(j3);
                        }
                    }
                }
                s3 = (short) (s3 + 1);
                hashSet2 = hashSet;
                s2 = s2;
                z3 = z3;
            } else if (z3) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            hashSet = hashSet2;
            j = 0;
            z2 = false;
            if (z2) {
                seekableByteOrderedDataInputStream.h(j3);
            } else {
                if (j > 4) {
                    i4 = seekableByteOrderedDataInputStream.readInt();
                    if (z3 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i4);
                    }
                    if (this.d == 7) {
                        if ("MakerNote".equals(exifTag.f5070b)) {
                            this.j = i4;
                        } else if (i2 != 6) {
                        }
                    }
                    seekableByteOrderedDataInputStream.h(i4);
                } else {
                    hashSet = hashSet;
                    unsignedShort2 = unsignedShort2;
                    i5 = i5;
                }
                num = (Integer) f5049N.get(Integer.valueOf(unsignedShort2));
                if (z3 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j2 = ((long) seekableByteOrderedDataInputStream.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = seekableByteOrderedDataInputStream.readInt();
                        } else {
                            unsignedShort = seekableByteOrderedDataInputStream.readShort();
                        }
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j2), exifTag.f5070b));
                        }
                        if (j2 > 0) {
                            hashSet = hashSet;
                            if (!hashSet.contains(Integer.valueOf((int) j2))) {
                                seekableByteOrderedDataInputStream.h(j2);
                                u(seekableByteOrderedDataInputStream, num.intValue());
                            } else if (z3 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j2 + ")");
                            }
                        } else {
                            hashSet = hashSet;
                            if (z3 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j2);
                            }
                        }
                        seekableByteOrderedDataInputStream.h(j3);
                    } else {
                        unsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
                    }
                    j2 = unsignedShort;
                    if (z3 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j2), exifTag.f5070b));
                    }
                    if (j2 > 0) {
                        hashSet = hashSet;
                        if (!hashSet.contains(Integer.valueOf((int) j2))) {
                            seekableByteOrderedDataInputStream.h(j2);
                            u(seekableByteOrderedDataInputStream, num.intValue());
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j2 + ")");
                        }
                    } else {
                        hashSet = hashSet;
                        if (z3 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j2);
                        }
                    }
                    seekableByteOrderedDataInputStream.h(j3);
                } else {
                    hashSet = hashSet;
                    int i9 = seekableByteOrderedDataInputStream.Z + this.f5062i;
                    byte[] bArr3 = new byte[(int) j];
                    seekableByteOrderedDataInputStream.readFully(bArr3);
                    ExifAttribute exifAttribute3 = new ExifAttribute(i9, bArr3, unsignedShort3, i5);
                    mapArr[i2].put(exifTag.f5070b, exifAttribute3);
                    str = exifTag.f5070b;
                    if ("DNGVersion".equals(str)) {
                        this.d = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.d = 8;
                    if (seekableByteOrderedDataInputStream.Z != j3) {
                        seekableByteOrderedDataInputStream.h(j3);
                    }
                }
            }
            s3 = (short) (s3 + 1);
            hashSet2 = hashSet;
            s2 = s2;
            z3 = z3;
        }
        HashSet hashSet3 = hashSet2;
        boolean z4 = z3;
        int i10 = seekableByteOrderedDataInputStream.readInt();
        if (z4) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i10)));
        }
        long j4 = i10;
        if (j4 <= 0) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i10))) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        seekableByteOrderedDataInputStream.h(j4);
        if (mapArr[4].isEmpty()) {
            u(seekableByteOrderedDataInputStream, 4);
        } else if (mapArr[5].isEmpty()) {
            u(seekableByteOrderedDataInputStream, 5);
        }
    }

    public final void v(int i2, String str, String str2) {
        HashMap[] mapArr = this.f5060e;
        if (mapArr[i2].isEmpty() || mapArr[i2].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i2];
        map.put(str2, map.get(str));
        mapArr[i2].remove(str);
    }

    public final void w(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        ExifAttribute exifAttribute;
        int iE;
        HashMap map = this.f5060e[4];
        ExifAttribute exifAttribute2 = (ExifAttribute) map.get("Compression");
        if (exifAttribute2 == null) {
            n(byteOrderedDataInputStream, map);
            return;
        }
        int iE2 = exifAttribute2.e(this.g);
        if (iE2 != 1) {
            if (iE2 == 6) {
                n(byteOrderedDataInputStream, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        ExifAttribute exifAttribute3 = (ExifAttribute) map.get("BitsPerSample");
        if (exifAttribute3 != null) {
            int[] iArr = (int[]) exifAttribute3.g(this.g);
            int[] iArr2 = f5053p;
            if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (exifAttribute = (ExifAttribute) map.get("PhotometricInterpretation")) != null && (((iE = exifAttribute.e(this.g)) == 1 && Arrays.equals(iArr, q)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                ExifAttribute exifAttribute4 = (ExifAttribute) map.get("StripOffsets");
                ExifAttribute exifAttribute5 = (ExifAttribute) map.get("StripByteCounts");
                if (exifAttribute4 == null || exifAttribute5 == null) {
                    return;
                }
                long[] jArrB = ExifInterfaceUtils.b(exifAttribute4.g(this.g));
                long[] jArrB2 = ExifInterfaceUtils.b(exifAttribute5.g(this.g));
                if (jArrB == null || jArrB.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrB2 == null || jArrB2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrB.length != jArrB2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrB2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f5061h = true;
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < jArrB.length; i4++) {
                    int i5 = (int) jArrB[i4];
                    int i6 = (int) jArrB2[i4];
                    if (i4 < jArrB.length - 1 && i5 + i6 != jArrB[i4 + 1]) {
                        this.f5061h = false;
                    }
                    int i7 = i5 - i2;
                    if (i7 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i7;
                    if (byteOrderedDataInputStream.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i7 + " bytes.");
                        return;
                    }
                    int i8 = i2 + i7;
                    byte[] bArr2 = new byte[i6];
                    if (byteOrderedDataInputStream.read(bArr2) != i6) {
                        Log.d("ExifInterface", "Failed to read " + i6 + " bytes.");
                        return;
                    }
                    i2 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i3, i6);
                    i3 += i6;
                }
                if (this.f5061h) {
                    long j4 = jArrB[0];
                    return;
                }
                return;
            }
        }
        if (m) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void x(int i2, int i3) throws Throwable {
        HashMap[] mapArr = this.f5060e;
        boolean zIsEmpty = mapArr[i2].isEmpty();
        boolean z2 = m;
        if (zIsEmpty || mapArr[i3].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[i2].get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[i2].get("ImageWidth");
        ExifAttribute exifAttribute3 = (ExifAttribute) mapArr[i3].get("ImageLength");
        ExifAttribute exifAttribute4 = (ExifAttribute) mapArr[i3].get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (exifAttribute3 == null || exifAttribute4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = exifAttribute.e(this.g);
        int iE2 = exifAttribute2.e(this.g);
        int iE3 = exifAttribute3.e(this.g);
        int iE4 = exifAttribute4.e(this.g);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i2];
        mapArr[i2] = mapArr[i3];
        mapArr[i3] = map;
    }

    public final void y(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i2) throws Throwable {
        ExifAttribute exifAttributeC;
        ExifAttribute exifAttributeC2;
        HashMap[] mapArr = this.f5060e;
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[i2].get("DefaultCropSize");
        ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[i2].get("SensorTopBorder");
        ExifAttribute exifAttribute3 = (ExifAttribute) mapArr[i2].get("SensorLeftBorder");
        ExifAttribute exifAttribute4 = (ExifAttribute) mapArr[i2].get("SensorBottomBorder");
        ExifAttribute exifAttribute5 = (ExifAttribute) mapArr[i2].get("SensorRightBorder");
        if (exifAttribute != null) {
            if (exifAttribute.f5066a == 5) {
                Rational[] rationalArr = (Rational[]) exifAttribute.g(this.g);
                if (rationalArr == null || rationalArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(rationalArr));
                    return;
                }
                exifAttributeC = ExifAttribute.b(rationalArr[0], this.g);
                exifAttributeC2 = ExifAttribute.b(rationalArr[1], this.g);
            } else {
                int[] iArr = (int[]) exifAttribute.g(this.g);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                exifAttributeC = ExifAttribute.c(iArr[0], this.g);
                exifAttributeC2 = ExifAttribute.c(iArr[1], this.g);
            }
            mapArr[i2].put("ImageWidth", exifAttributeC);
            mapArr[i2].put("ImageLength", exifAttributeC2);
            return;
        }
        if (exifAttribute2 != null && exifAttribute3 != null && exifAttribute4 != null && exifAttribute5 != null) {
            int iE = exifAttribute2.e(this.g);
            int iE2 = exifAttribute4.e(this.g);
            int iE3 = exifAttribute5.e(this.g);
            int iE4 = exifAttribute3.e(this.g);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            ExifAttribute exifAttributeC3 = ExifAttribute.c(iE2 - iE, this.g);
            ExifAttribute exifAttributeC4 = ExifAttribute.c(iE3 - iE4, this.g);
            mapArr[i2].put("ImageLength", exifAttributeC3);
            mapArr[i2].put("ImageWidth", exifAttributeC4);
            return;
        }
        ExifAttribute exifAttribute6 = (ExifAttribute) mapArr[i2].get("ImageLength");
        ExifAttribute exifAttribute7 = (ExifAttribute) mapArr[i2].get("ImageWidth");
        if (exifAttribute6 == null || exifAttribute7 == null) {
            ExifAttribute exifAttribute8 = (ExifAttribute) mapArr[i2].get("JPEGInterchangeFormat");
            ExifAttribute exifAttribute9 = (ExifAttribute) mapArr[i2].get("JPEGInterchangeFormatLength");
            if (exifAttribute8 == null || exifAttribute9 == null) {
                return;
            }
            int iE5 = exifAttribute8.e(this.g);
            int iE6 = exifAttribute8.e(this.g);
            seekableByteOrderedDataInputStream.h(iE5);
            byte[] bArr = new byte[iE6];
            seekableByteOrderedDataInputStream.read(bArr);
            f(new ByteOrderedDataInputStream(bArr), iE5, i2);
        }
    }

    public final void z() throws Throwable {
        x(0, 5);
        x(0, 4);
        x(5, 4);
        HashMap[] mapArr = this.f5060e;
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[1].get("PixelXDimension");
        ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[1].get("PixelYDimension");
        if (exifAttribute != null && exifAttribute2 != null) {
            mapArr[0].put("ImageWidth", exifAttribute);
            mapArr[0].put("ImageLength", exifAttribute2);
        }
        if (mapArr[4].isEmpty() && o(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!o(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        v(0, "ThumbnailOrientation", "Orientation");
        v(0, "ThumbnailImageLength", "ImageLength");
        v(0, "ThumbnailImageWidth", "ImageWidth");
        v(5, "ThumbnailOrientation", "Orientation");
        v(5, "ThumbnailImageLength", "ImageLength");
        v(5, "ThumbnailImageWidth", "ImageWidth");
        v(4, "Orientation", "ThumbnailOrientation");
        v(4, "ImageLength", "ThumbnailImageLength");
        v(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public static class SeekableByteOrderedDataInputStream extends ByteOrderedDataInputStream {
        public SeekableByteOrderedDataInputStream(byte[] bArr) {
            super(bArr);
            this.X.mark(Integer.MAX_VALUE);
        }

        public final void h(long j) throws IOException {
            int i2 = this.Z;
            if (i2 > j) {
                this.Z = 0;
                this.X.reset();
            } else {
                j -= (long) i2;
            }
            a((int) j);
        }

        public SeekableByteOrderedDataInputStream(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.X.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public static class ExifTag {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f5070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5071c;
        public final int d;

        public ExifTag(String str, int i2, int i3) {
            this.f5070b = str;
            this.f5069a = i2;
            this.f5071c = i3;
            this.d = -1;
        }

        public ExifTag(String str, int i2, int i3, int i4) {
            this.f5070b = str;
            this.f5069a = i2;
            this.f5071c = i3;
            this.d = i4;
        }
    }

    public ExifInterface(InputStream inputStream) throws IOException {
        ExifTag[][] exifTagArr = f5047I;
        this.f5060e = new HashMap[exifTagArr.length];
        this.f = new HashSet(exifTagArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        this.f5057a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f5059c = (AssetManager.AssetInputStream) inputStream;
            this.f5058b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                ExifInterfaceUtils.Api21Impl.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f5059c = null;
                this.f5058b = fileInputStream.getFD();
            } catch (Exception unused) {
                if (m) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f5059c = null;
                this.f5058b = null;
            }
        } else {
            this.f5059c = null;
            this.f5058b = null;
        }
        p(inputStream);
    }
}
