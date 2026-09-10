package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.StreamUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class ETC1 {
    public static int ETC1_RGB8_OES = 36196;
    public static int PKM_HEADER_SIZE = 16;

    public static Pixmap decodeImage(ETC1Data eTC1Data, Pixmap.Format format) {
        int widthPKM;
        int heightPKM;
        int i;
        if (eTC1Data.hasPKMHeader()) {
            widthPKM = getWidthPKM(eTC1Data.compressedData, 0);
            heightPKM = getHeightPKM(eTC1Data.compressedData, 0);
            i = 16;
        } else {
            widthPKM = eTC1Data.width;
            heightPKM = eTC1Data.height;
            i = 0;
        }
        int pixelSize = getPixelSize(format);
        Pixmap pixmap = new Pixmap(widthPKM, heightPKM, format);
        decodeImage(eTC1Data.compressedData, i, pixmap.getPixels(), 0, widthPKM, heightPKM, pixelSize);
        return pixmap;
    }

    private static native void decodeImage(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4, int i5);

    public static ETC1Data encodeImage(Pixmap pixmap) {
        ByteBuffer byteBufferEncodeImage = encodeImage(pixmap.getPixels(), 0, pixmap.getWidth(), pixmap.getHeight(), getPixelSize(pixmap.getFormat()));
        BufferUtils.newUnsafeByteBuffer(byteBufferEncodeImage);
        return new ETC1Data(pixmap.getWidth(), pixmap.getHeight(), byteBufferEncodeImage, 0);
    }

    private static native ByteBuffer encodeImage(ByteBuffer byteBuffer, int i, int i2, int i3, int i4);

    public static ETC1Data encodeImagePKM(Pixmap pixmap) {
        ByteBuffer byteBufferEncodeImagePKM = encodeImagePKM(pixmap.getPixels(), 0, pixmap.getWidth(), pixmap.getHeight(), getPixelSize(pixmap.getFormat()));
        BufferUtils.newUnsafeByteBuffer(byteBufferEncodeImagePKM);
        return new ETC1Data(pixmap.getWidth(), pixmap.getHeight(), byteBufferEncodeImagePKM, 16);
    }

    private static native ByteBuffer encodeImagePKM(ByteBuffer byteBuffer, int i, int i2, int i3, int i4);

    public static native void formatHeader(ByteBuffer byteBuffer, int i, int i2, int i3);

    public static native int getCompressedDataSize(int i, int i2);

    public static native int getHeightPKM(ByteBuffer byteBuffer, int i);

    private static int getPixelSize(Pixmap.Format format) {
        if (format == Pixmap.Format.RGB565) {
            return 2;
        }
        if (format == Pixmap.Format.RGB888) {
            return 3;
        }
        throw new GdxRuntimeException("Can only handle RGB565 or RGB888 images");
    }

    public static native int getWidthPKM(ByteBuffer byteBuffer, int i);

    public static native boolean isValidPKM(ByteBuffer byteBuffer, int i);

    public static final class ETC1Data implements Disposable {
        public final ByteBuffer compressedData;
        public final int dataOffset;
        public final int height;
        public final int width;

        public ETC1Data(int i, int i2, ByteBuffer byteBuffer, int i3) {
            this.width = i;
            this.height = i2;
            this.compressedData = byteBuffer;
            this.dataOffset = i3;
            checkNPOT();
        }

        private void checkNPOT() {
            if (MathUtils.isPowerOfTwo(this.width) && MathUtils.isPowerOfTwo(this.height)) {
                return;
            }
            System.out.println("ETC1Data warning: non-power-of-two ETC1 textures may crash the driver of PowerVR GPUs");
        }

        @Override // com.badlogic.gdx.utils.Disposable
        public void dispose() {
            BufferUtils.disposeUnsafeByteBuffer(this.compressedData);
        }

        public boolean hasPKMHeader() {
            return this.dataOffset == 16;
        }

        public String toString() {
            if (!hasPKMHeader()) {
                return "raw [" + this.width + "x" + this.height + "], compressed: " + (this.compressedData.capacity() - ETC1.PKM_HEADER_SIZE);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(ETC1.isValidPKM(this.compressedData, 0) ? "valid" : "invalid");
            sb.append(" pkm [");
            sb.append(ETC1.getWidthPKM(this.compressedData, 0));
            sb.append("x");
            sb.append(ETC1.getHeightPKM(this.compressedData, 0));
            sb.append("], compressed: ");
            sb.append(this.compressedData.capacity() - ETC1.PKM_HEADER_SIZE);
            return sb.toString();
        }

        public void write(FileHandle fileHandle) throws Throwable {
            byte[] bArr = new byte[10240];
            this.compressedData.position(0);
            ByteBuffer byteBuffer = this.compressedData;
            byteBuffer.limit(byteBuffer.capacity());
            DataOutputStream dataOutputStream = null;
            try {
                try {
                    DataOutputStream dataOutputStream2 = new DataOutputStream(new GZIPOutputStream(fileHandle.write(false)));
                    try {
                        dataOutputStream2.writeInt(this.compressedData.capacity());
                        int i = 0;
                        while (i != this.compressedData.capacity()) {
                            int iMin = Math.min(this.compressedData.remaining(), 10240);
                            this.compressedData.get(bArr, 0, iMin);
                            dataOutputStream2.write(bArr, 0, iMin);
                            i += iMin;
                        }
                        StreamUtils.closeQuietly(dataOutputStream2);
                        this.compressedData.position(this.dataOffset);
                        ByteBuffer byteBuffer2 = this.compressedData;
                        byteBuffer2.limit(byteBuffer2.capacity());
                    } catch (Exception e) {
                        e = e;
                        throw new GdxRuntimeException("Couldn't write PKM file to '" + fileHandle + "'", e);
                    } catch (Throwable th) {
                        th = th;
                        dataOutputStream = dataOutputStream2;
                        StreamUtils.closeQuietly(dataOutputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public ETC1Data(FileHandle fileHandle) throws Throwable {
            byte[] bArr = new byte[10240];
            DataInputStream dataInputStream = null;
            try {
                try {
                    DataInputStream dataInputStream2 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(fileHandle.read())));
                    try {
                        this.compressedData = BufferUtils.newUnsafeByteBuffer(dataInputStream2.readInt());
                        while (true) {
                            int i = dataInputStream2.read(bArr);
                            if (i != -1) {
                                this.compressedData.put(bArr, 0, i);
                            } else {
                                this.compressedData.position(0);
                                ByteBuffer byteBuffer = this.compressedData;
                                byteBuffer.limit(byteBuffer.capacity());
                                StreamUtils.closeQuietly(dataInputStream2);
                                this.width = ETC1.getWidthPKM(this.compressedData, 0);
                                this.height = ETC1.getHeightPKM(this.compressedData, 0);
                                int i2 = ETC1.PKM_HEADER_SIZE;
                                this.dataOffset = i2;
                                this.compressedData.position(i2);
                                checkNPOT();
                                return;
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        dataInputStream = dataInputStream2;
                        throw new GdxRuntimeException("Couldn't load pkm file '" + fileHandle + "'", e);
                    } catch (Throwable th) {
                        th = th;
                        dataInputStream = dataInputStream2;
                        StreamUtils.closeQuietly(dataInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
    }
}
