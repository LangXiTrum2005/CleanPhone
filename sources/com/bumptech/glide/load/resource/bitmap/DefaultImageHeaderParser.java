package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.util.Preconditions;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f12645a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f12646b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static final class ByteBufferReader implements Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f12647a;

        public ByteBufferReader(ByteBuffer byteBuffer) {
            this.f12647a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a() {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int b(int i2, byte[] bArr) {
            ByteBuffer byteBuffer = this.f12647a;
            int iMin = Math.min(i2, byteBuffer.remaining());
            if (iMin == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short c() throws Reader.EndOfFileException {
            ByteBuffer byteBuffer = this.f12647a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j) {
            ByteBuffer byteBuffer = this.f12647a;
            int iMin = (int) Math.min(byteBuffer.remaining(), j);
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    public static final class RandomAccessReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f12648a;

        public RandomAccessReader(byte[] bArr, int i2) {
            this.f12648a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i2);
        }

        public final short a(int i2) {
            ByteBuffer byteBuffer = this.f12648a;
            if (byteBuffer.remaining() - i2 >= 2) {
                return byteBuffer.getShort(i2);
            }
            return (short) -1;
        }
    }

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        int b(int i2, byte[] bArr);

        short c();

        long skip(long j);
    }

    public static final class StreamReader implements Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f12649a;

        public StreamReader(InputStream inputStream) {
            this.f12649a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a() {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int b(int i2, byte[] bArr) throws Reader.EndOfFileException {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2 && (i4 = this.f12649a.read(bArr, i3, i2 - i3)) != -1) {
                i3 += i4;
            }
            if (i3 == 0 && i4 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i3;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short c() throws IOException {
            int i2 = this.f12649a.read();
            if (i2 != -1) {
                return (short) i2;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                InputStream inputStream = this.f12649a;
                long jSkip = inputStream.skip(j2);
                if (jSkip > 0) {
                    j2 -= jSkip;
                } else {
                    if (inputStream.read() == -1) {
                        break;
                    }
                    j2--;
                }
            }
            return j - j2;
        }
    }

    public static int e(Reader reader, LruArrayPool lruArrayPool) {
        try {
            int iA = reader.a();
            if ((iA & 65496) == 65496 || iA == 19789 || iA == 18761) {
                int iG = g(reader);
                if (iG != -1) {
                    byte[] bArr = (byte[]) lruArrayPool.d(iG, byte[].class);
                    try {
                        return h(reader, bArr, iG);
                    } finally {
                        lruArrayPool.i(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iA);
                return -1;
            }
        } catch (Reader.EndOfFileException unused) {
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType f(Reader reader) {
        try {
            int iA = reader.a();
            if (iA == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iC = (iA << 8) | reader.c();
            if (iC == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iC2 = (iC << 8) | reader.c();
            if (iC2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iC2 == 1380533830) {
                reader.skip(4L);
                if (((reader.a() << 16) | reader.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int iA2 = (reader.a() << 16) | reader.a();
                if ((iA2 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i2 = iA2 & 255;
                if (i2 != 88) {
                    if (i2 != 76) {
                        return ImageHeaderParser.ImageType.WEBP;
                    }
                    reader.skip(4L);
                    return (reader.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                reader.skip(4L);
                short sC = reader.c();
                if ((sC & 2) != 0) {
                    return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                }
                return (sC & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((reader.a() << 16) | reader.a()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iA3 = (reader.a() << 16) | reader.a();
            if (iA3 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            int i3 = 0;
            boolean z2 = iA3 == 1635150182;
            reader.skip(4L);
            int i4 = iC2 - 16;
            if (i4 % 4 == 0) {
                while (i3 < 5 && i4 > 0) {
                    int iA4 = (reader.a() << 16) | reader.a();
                    if (iA4 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (iA4 == 1635150182) {
                        z2 = true;
                    }
                    i3++;
                    i4 -= 4;
                }
            }
            return z2 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static int g(Reader reader) {
        short sC;
        int iA;
        long j;
        long jSkip;
        do {
            short sC2 = reader.c();
            if (sC2 == 255) {
                sC = reader.c();
                if (sC != 218) {
                    if (sC != 217) {
                        iA = reader.a() - 2;
                        if (sC == 225) {
                            return iA;
                        }
                        j = iA;
                        jSkip = reader.skip(j);
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                        return -1;
                    }
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sC2));
                return -1;
            }
            return -1;
        } while (jSkip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(sC, iA, "Unable to skip enough data, type: ", ", wanted to skip: ", ", but actually skipped: ");
            sbP.append(jSkip);
            Log.d("DfltImageHeaderParser", sbP.toString());
        }
        return -1;
    }

    public static int h(Reader reader, byte[] bArr, int i2) {
        ByteOrder byteOrder;
        int iB = reader.b(i2, bArr);
        if (iB == i2) {
            short s = 1;
            int i3 = 0;
            byte[] bArr2 = f12645a;
            boolean z2 = bArr != null && i2 > bArr2.length;
            if (z2) {
                for (int i4 = 0; i4 < bArr2.length; i4++) {
                    if (bArr[i4] != bArr2[i4]) {
                        z2 = false;
                        break;
                    }
                }
            }
            if (z2) {
                RandomAccessReader randomAccessReader = new RandomAccessReader(bArr, i2);
                short sA = randomAccessReader.a(6);
                if (sA != 18761) {
                    if (sA != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sA));
                    }
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                }
                ByteBuffer byteBuffer = randomAccessReader.f12648a;
                byteBuffer.order(byteOrder);
                int i5 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
                short sA2 = randomAccessReader.a(i5 + 6);
                while (i3 < sA2) {
                    int i6 = (i3 * 12) + i5 + 8;
                    short sA3 = randomAccessReader.a(i6);
                    if (sA3 == 274) {
                        short sA4 = randomAccessReader.a(i6 + 2);
                        if (sA4 >= s && sA4 <= 12) {
                            int i7 = i6 + 4;
                            int i8 = byteBuffer.remaining() - i7 >= 4 ? byteBuffer.getInt(i7) : -1;
                            if (i8 >= 0) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i3, sA3, "Got tagIndex=", " tagType=", " formatCode=");
                                    sbP.append((int) sA4);
                                    sbP.append(" componentCount=");
                                    sbP.append(i8);
                                    Log.d("DfltImageHeaderParser", sbP.toString());
                                }
                                int i9 = i8 + f12646b[sA4];
                                if (i9 <= 4) {
                                    int i10 = i6 + 8;
                                    if (i10 >= 0 && i10 <= byteBuffer.remaining()) {
                                        if (i9 >= 0 && i9 + i10 <= byteBuffer.remaining()) {
                                            return randomAccessReader.a(i10);
                                        }
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) sA3));
                                        }
                                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i10 + " tagType=" + ((int) sA3));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sA4));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) sA4));
                        }
                    }
                    i3++;
                    s = 1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i2 + ", actually read: " + iB);
            return -1;
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(InputStream inputStream, LruArrayPool lruArrayPool) {
        StreamReader streamReader = new StreamReader(inputStream);
        Preconditions.c(lruArrayPool, "Argument must not be null");
        return e(streamReader, lruArrayPool);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType b(ByteBuffer byteBuffer) {
        Preconditions.c(byteBuffer, "Argument must not be null");
        return f(new ByteBufferReader(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int c(ByteBuffer byteBuffer, LruArrayPool lruArrayPool) {
        Preconditions.c(byteBuffer, "Argument must not be null");
        ByteBufferReader byteBufferReader = new ByteBufferReader(byteBuffer);
        Preconditions.c(lruArrayPool, "Argument must not be null");
        return e(byteBufferReader, lruArrayPool);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType d(InputStream inputStream) {
        return f(new StreamReader(inputStream));
    }
}
