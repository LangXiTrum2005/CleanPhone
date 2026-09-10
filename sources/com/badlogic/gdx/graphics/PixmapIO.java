package com.badlogic.gdx.graphics;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.ByteArray;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.StreamUtils;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/* JADX INFO: loaded from: classes.dex */
public class PixmapIO {

    public static class CIM {
        private static final int BUFFER_SIZE = 32000;
        private static final byte[] writeBuffer = new byte[BUFFER_SIZE];
        private static final byte[] readBuffer = new byte[BUFFER_SIZE];

        private CIM() {
        }

        /* JADX WARN: Not initialized variable reg: 1, insn: 0x0059: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:90), block:B:16:0x0059 */
        public static Pixmap read(FileHandle fileHandle) throws Throwable {
            Exception e;
            Closeable closeable;
            Closeable closeable2 = null;
            try {
                try {
                    DataInputStream dataInputStream = new DataInputStream(new InflaterInputStream(new BufferedInputStream(fileHandle.read())));
                    try {
                        Pixmap pixmap = new Pixmap(dataInputStream.readInt(), dataInputStream.readInt(), Pixmap.Format.fromGdx2DPixmapFormat(dataInputStream.readInt()));
                        ByteBuffer pixels = pixmap.getPixels();
                        pixels.position(0);
                        pixels.limit(pixels.capacity());
                        synchronized (readBuffer) {
                            while (true) {
                                try {
                                    byte[] bArr = readBuffer;
                                    int i = dataInputStream.read(bArr);
                                    if (i > 0) {
                                        pixels.put(bArr, 0, i);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        pixels.position(0);
                        pixels.limit(pixels.capacity());
                        StreamUtils.closeQuietly(dataInputStream);
                        return pixmap;
                    } catch (Exception e2) {
                        e = e2;
                        throw new GdxRuntimeException("Couldn't read Pixmap from file '" + fileHandle + "'", e);
                    }
                } catch (Exception e3) {
                    e = e3;
                } catch (Throwable th2) {
                    th = th2;
                    StreamUtils.closeQuietly(closeable2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                closeable2 = closeable;
                StreamUtils.closeQuietly(closeable2);
                throw th;
            }
        }

        public static void write(FileHandle fileHandle, Pixmap pixmap) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                try {
                    DataOutputStream dataOutputStream2 = new DataOutputStream(new DeflaterOutputStream(fileHandle.write(false)));
                    try {
                        dataOutputStream2.writeInt(pixmap.getWidth());
                        dataOutputStream2.writeInt(pixmap.getHeight());
                        dataOutputStream2.writeInt(Pixmap.Format.toGdx2DPixmapFormat(pixmap.getFormat()));
                        ByteBuffer pixels = pixmap.getPixels();
                        pixels.position(0);
                        pixels.limit(pixels.capacity());
                        int iCapacity = pixels.capacity() % BUFFER_SIZE;
                        int iCapacity2 = pixels.capacity() / BUFFER_SIZE;
                        synchronized (writeBuffer) {
                            for (int i = 0; i < iCapacity2; i++) {
                                try {
                                    byte[] bArr = writeBuffer;
                                    pixels.get(bArr);
                                    dataOutputStream2.write(bArr);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            byte[] bArr2 = writeBuffer;
                            pixels.get(bArr2, 0, iCapacity);
                            dataOutputStream2.write(bArr2, 0, iCapacity);
                        }
                        pixels.position(0);
                        pixels.limit(pixels.capacity());
                        StreamUtils.closeQuietly(dataOutputStream2);
                    } catch (Exception e) {
                        e = e;
                        throw new GdxRuntimeException("Couldn't write Pixmap to file '" + fileHandle + "'", e);
                    } catch (Throwable th2) {
                        th = th2;
                        dataOutputStream = dataOutputStream2;
                        StreamUtils.closeQuietly(dataOutputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public static class PNG implements Disposable {
        private static final byte COLOR_ARGB = 6;
        private static final byte COMPRESSION_DEFLATE = 0;
        private static final byte FILTER_NONE = 0;
        private static final int IDAT = 1229209940;
        private static final int IEND = 1229278788;
        private static final int IHDR = 1229472850;
        private static final byte INTERLACE_NONE = 0;
        private static final byte PAETH = 4;
        private static final byte[] SIGNATURE = {-119, 80, 78, 71, cw.k, 10, 26, 10};
        private final ChunkBuffer buffer;
        private ByteArray curLineBytes;
        private final Deflater deflater;
        private boolean flipY;
        private int lastLineLen;
        private ByteArray lineOutBytes;
        private ByteArray prevLineBytes;

        public static class ChunkBuffer extends DataOutputStream {
            final ByteArrayOutputStream buffer;
            final CRC32 crc;

            public ChunkBuffer(int i) {
                this(new ByteArrayOutputStream(i), new CRC32());
            }

            public void endChunk(DataOutputStream dataOutputStream) throws IOException {
                flush();
                dataOutputStream.writeInt(this.buffer.size() - 4);
                this.buffer.writeTo(dataOutputStream);
                dataOutputStream.writeInt((int) this.crc.getValue());
                this.buffer.reset();
                this.crc.reset();
            }

            private ChunkBuffer(ByteArrayOutputStream byteArrayOutputStream, CRC32 crc32) {
                super(new CheckedOutputStream(byteArrayOutputStream, crc32));
                this.buffer = byteArrayOutputStream;
                this.crc = crc32;
            }
        }

        public PNG() {
            this(16384);
        }

        @Override // com.badlogic.gdx.utils.Disposable
        public void dispose() {
            this.deflater.end();
        }

        public void setCompression(int i) {
            this.deflater.setLevel(i);
        }

        public void setFlipY(boolean z) {
            this.flipY = z;
        }

        public void write(FileHandle fileHandle, Pixmap pixmap) throws IOException {
            OutputStream outputStreamWrite = fileHandle.write(false);
            try {
                write(outputStreamWrite, pixmap);
            } finally {
                StreamUtils.closeQuietly(outputStreamWrite);
            }
        }

        public PNG(int i) {
            this.flipY = true;
            this.buffer = new ChunkBuffer(i);
            this.deflater = new Deflater();
        }

        public void write(OutputStream outputStream, Pixmap pixmap) throws IOException {
            byte[] bArrEnsureCapacity;
            byte[] bArrEnsureCapacity2;
            byte[] bArrEnsureCapacity3;
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(this.buffer, this.deflater);
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.write(SIGNATURE);
            this.buffer.writeInt(IHDR);
            this.buffer.writeInt(pixmap.getWidth());
            this.buffer.writeInt(pixmap.getHeight());
            this.buffer.writeByte(8);
            this.buffer.writeByte(6);
            int i = 0;
            this.buffer.writeByte(0);
            this.buffer.writeByte(0);
            this.buffer.writeByte(0);
            this.buffer.endChunk(dataOutputStream);
            this.buffer.writeInt(IDAT);
            this.deflater.reset();
            int width = pixmap.getWidth() * 4;
            ByteArray byteArray = this.lineOutBytes;
            if (byteArray == null) {
                ByteArray byteArray2 = new ByteArray(width);
                this.lineOutBytes = byteArray2;
                bArrEnsureCapacity = byteArray2.items;
                ByteArray byteArray3 = new ByteArray(width);
                this.curLineBytes = byteArray3;
                bArrEnsureCapacity2 = byteArray3.items;
                ByteArray byteArray4 = new ByteArray(width);
                this.prevLineBytes = byteArray4;
                bArrEnsureCapacity3 = byteArray4.items;
            } else {
                bArrEnsureCapacity = byteArray.ensureCapacity(width);
                bArrEnsureCapacity2 = this.curLineBytes.ensureCapacity(width);
                bArrEnsureCapacity3 = this.prevLineBytes.ensureCapacity(width);
                int i2 = this.lastLineLen;
                for (int i3 = 0; i3 < i2; i3++) {
                    bArrEnsureCapacity3[i3] = 0;
                }
            }
            this.lastLineLen = width;
            ByteBuffer pixels = pixmap.getPixels();
            int iPosition = pixels.position();
            int i4 = 1;
            boolean z = pixmap.getFormat() == Pixmap.Format.RGBA8888;
            int height = pixmap.getHeight();
            int i5 = 0;
            while (i5 < height) {
                int i6 = this.flipY ? (height - i5) - i4 : i5;
                if (z) {
                    pixels.position(i6 * width);
                    pixels.get(bArrEnsureCapacity2, i, width);
                } else {
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < pixmap.getWidth()) {
                        int pixel = pixmap.getPixel(i7, i6);
                        bArrEnsureCapacity2[i8] = (byte) ((pixel >> 24) & 255);
                        int i9 = i6;
                        bArrEnsureCapacity2[i8 + 1] = (byte) ((pixel >> 16) & 255);
                        int i10 = i8 + 3;
                        bArrEnsureCapacity2[i8 + 2] = (byte) ((pixel >> 8) & 255);
                        i8 += 4;
                        bArrEnsureCapacity2[i10] = (byte) (pixel & 255);
                        i7++;
                        z = z;
                        i6 = i9;
                    }
                }
                boolean z2 = z;
                bArrEnsureCapacity[0] = (byte) (bArrEnsureCapacity2[0] - bArrEnsureCapacity3[0]);
                bArrEnsureCapacity[1] = (byte) (bArrEnsureCapacity2[1] - bArrEnsureCapacity3[1]);
                bArrEnsureCapacity[2] = (byte) (bArrEnsureCapacity2[2] - bArrEnsureCapacity3[2]);
                bArrEnsureCapacity[3] = (byte) (bArrEnsureCapacity2[3] - bArrEnsureCapacity3[3]);
                int i11 = 4;
                while (i11 < width) {
                    int i12 = i11 - 4;
                    int i13 = bArrEnsureCapacity2[i12] & 255;
                    int i14 = bArrEnsureCapacity3[i11] & 255;
                    int i15 = bArrEnsureCapacity3[i12] & 255;
                    int i16 = (i13 + i14) - i15;
                    int i17 = i16 - i13;
                    if (i17 < 0) {
                        i17 = -i17;
                    }
                    byte[] bArr = bArrEnsureCapacity3;
                    int i18 = i16 - i14;
                    if (i18 < 0) {
                        i18 = -i18;
                    }
                    int i19 = i16 - i15;
                    if (i19 < 0) {
                        i19 = -i19;
                    }
                    bArrEnsureCapacity[i11] = (byte) (bArrEnsureCapacity2[i11] - ((i17 > i18 || i17 > i19) ? i18 <= i19 ? i14 : i15 : i13));
                    i11++;
                    bArrEnsureCapacity3 = bArr;
                }
                byte[] bArr2 = bArrEnsureCapacity3;
                deflaterOutputStream.write(4);
                i = 0;
                deflaterOutputStream.write(bArrEnsureCapacity, 0, width);
                i5++;
                bArrEnsureCapacity3 = bArrEnsureCapacity2;
                z = z2;
                bArrEnsureCapacity2 = bArr2;
                i4 = 1;
            }
            pixels.position(iPosition);
            deflaterOutputStream.finish();
            this.buffer.endChunk(dataOutputStream);
            this.buffer.writeInt(IEND);
            this.buffer.endChunk(dataOutputStream);
            outputStream.flush();
        }
    }

    public static Pixmap readCIM(FileHandle fileHandle) {
        return CIM.read(fileHandle);
    }

    public static void writeCIM(FileHandle fileHandle, Pixmap pixmap) throws Throwable {
        CIM.write(fileHandle, pixmap);
    }

    public static void writePNG(FileHandle fileHandle, Pixmap pixmap, int i, boolean z) {
        try {
            PNG png = new PNG((int) (pixmap.getWidth() * pixmap.getHeight() * 1.5f));
            try {
                png.setFlipY(z);
                png.setCompression(i);
                png.write(fileHandle, pixmap);
            } finally {
                png.dispose();
            }
        } catch (IOException e) {
            throw new GdxRuntimeException(AbstractC5044xl.k("Error writing PNG: ", fileHandle), e);
        }
    }

    public static void writePNG(FileHandle fileHandle, Pixmap pixmap) {
        writePNG(fileHandle, pixmap, -1, false);
    }
}
