package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.CubemapData;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.StreamUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public class KTXTextureData implements TextureData, CubemapData {
    private static final int GL_TEXTURE_1D = 4660;
    private static final int GL_TEXTURE_1D_ARRAY_EXT = 4660;
    private static final int GL_TEXTURE_2D_ARRAY_EXT = 4660;
    private static final int GL_TEXTURE_3D = 4660;
    private ByteBuffer compressedData;
    private FileHandle file;
    private int glBaseInternalFormat;
    private int glFormat;
    private int glInternalFormat;
    private int glType;
    private int glTypeSize;
    private int imagePos;
    private int numberOfArrayElements;
    private int numberOfFaces;
    private int numberOfMipmapLevels;
    private boolean useMipMaps;
    private int pixelWidth = -1;
    private int pixelHeight = -1;
    private int pixelDepth = -1;

    public KTXTextureData(FileHandle fileHandle, boolean z) {
        this.file = fileHandle;
        this.useMipMaps = z;
    }

    @Override // com.badlogic.gdx.graphics.CubemapData
    public void consumeCubemapData() {
        consumeCustomData(GL20.GL_TEXTURE_CUBE_MAP);
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void consumeCustomData(int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        if (this.compressedData == null) {
            throw new GdxRuntimeException("Call prepare() before calling consumeCompressedData()");
        }
        IntBuffer intBufferNewIntBuffer = BufferUtils.newIntBuffer(16);
        int i6 = this.glType;
        int i7 = 1;
        if (i6 != 0 && this.glFormat != 0) {
            z = false;
        } else {
            if (i6 + this.glFormat != 0) {
                throw new GdxRuntimeException("either both or none of glType, glFormat must be zero");
            }
            z = true;
        }
        if (this.pixelHeight > 0) {
            i2 = 2;
            i3 = GL20.GL_TEXTURE_2D;
        } else {
            i2 = 1;
            i3 = 4660;
        }
        if (this.pixelDepth > 0) {
            i2 = 3;
            i3 = 4660;
        }
        int i8 = this.numberOfFaces;
        if (i8 == 6) {
            if (i2 != 2) {
                throw new GdxRuntimeException("cube map needs 2D faces");
            }
            i3 = GL20.GL_TEXTURE_CUBE_MAP;
        } else if (i8 != 1) {
            throw new GdxRuntimeException("numberOfFaces must be either 1 or 6");
        }
        if (this.numberOfArrayElements > 0) {
            if (i3 != 4660 && i3 != 3553) {
                throw new GdxRuntimeException("No API for 3D and cube arrays yet");
            }
            i2++;
            i3 = 4660;
        }
        if (i3 == 4660) {
            throw new GdxRuntimeException("Unsupported texture format (only 2D texture are supported in LibGdx for the time being)");
        }
        int i9 = GL20.GL_TEXTURE_CUBE_MAP_POSITIVE_X;
        if (i8 != 6 || i == 34067) {
            if (i8 != 6 || i != 34067) {
                if (i != i3 && (34069 > i || i > 34074 || i != 3553)) {
                    throw new GdxRuntimeException("Invalid target requested : 0x" + Integer.toHexString(i) + ", expecting : 0x" + Integer.toHexString(i3));
                }
                i9 = i;
            }
            i4 = -1;
        } else {
            if (34069 > i || i > 34074) {
                throw new GdxRuntimeException("You must specify either GL_TEXTURE_CUBE_MAP to bind all 6 faces of the cube or the requested face GL_TEXTURE_CUBE_MAP_POSITIVE_X and followings.");
            }
            i4 = i - GL20.GL_TEXTURE_CUBE_MAP_POSITIVE_X;
        }
        Gdx.gl.glGetIntegerv(GL20.GL_UNPACK_ALIGNMENT, intBufferNewIntBuffer);
        int i10 = intBufferNewIntBuffer.get(0);
        int i11 = 4;
        if (i10 != 4) {
            Gdx.gl.glPixelStorei(GL20.GL_UNPACK_ALIGNMENT, 4);
        }
        int i12 = this.glInternalFormat;
        int i13 = this.glFormat;
        int i14 = this.imagePos;
        int i15 = 0;
        while (i15 < this.numberOfMipmapLevels) {
            int iMax = Math.max(i7, this.pixelWidth >> i15);
            int iMax2 = Math.max(i7, this.pixelHeight >> i15);
            Math.max(i7, this.pixelDepth >> i15);
            this.compressedData.position(i14);
            int i16 = this.compressedData.getInt();
            int i17 = (i16 + 3) & (-4);
            i14 += i11;
            int i18 = 0;
            while (i18 < this.numberOfFaces) {
                this.compressedData.position(i14);
                i14 += i17;
                if (i4 == -1 || i4 == i18) {
                    ByteBuffer byteBufferSlice = this.compressedData.slice();
                    byteBufferSlice.limit(i17);
                    i5 = i4;
                    if (i2 != 1 && i2 == 2) {
                        int i19 = this.numberOfArrayElements;
                        if (i19 > 0) {
                            iMax2 = i19;
                        }
                        if (!z) {
                            z2 = z;
                            Gdx.gl.glTexImage2D(i9 + i18, i15, i12, iMax, iMax2, 0, i13, this.glType, byteBufferSlice);
                        } else if (i12 == ETC1.ETC1_RGB8_OES) {
                            z2 = z;
                            if (Gdx.graphics.supportsExtension("GL_OES_compressed_ETC1_RGB8_texture")) {
                                Gdx.gl.glCompressedTexImage2D(i9 + i18, i15, i12, iMax, iMax2, 0, i16, byteBufferSlice);
                            } else {
                                Pixmap pixmapDecodeImage = ETC1.decodeImage(new ETC1.ETC1Data(iMax, iMax2, byteBufferSlice, 0), Pixmap.Format.RGB888);
                                Gdx.gl.glTexImage2D(i9 + i18, i15, pixmapDecodeImage.getGLInternalFormat(), pixmapDecodeImage.getWidth(), pixmapDecodeImage.getHeight(), 0, pixmapDecodeImage.getGLFormat(), pixmapDecodeImage.getGLType(), pixmapDecodeImage.getPixels());
                                pixmapDecodeImage.dispose();
                            }
                        } else {
                            z2 = z;
                            Gdx.gl.glCompressedTexImage2D(i9 + i18, i15, i12, iMax, iMax2, 0, i16, byteBufferSlice);
                        }
                    }
                    i18++;
                    i4 = i5;
                    z = z2;
                } else {
                    i5 = i4;
                }
                z2 = z;
                i18++;
                i4 = i5;
                z = z2;
            }
            i15++;
            z = z;
            i7 = 1;
            i11 = 4;
        }
        if (i10 != 4) {
            Gdx.gl.glPixelStorei(GL20.GL_UNPACK_ALIGNMENT, i10);
        }
        if (useMipMaps()) {
            Gdx.gl.glGenerateMipmap(i9);
        }
        disposePreparedData();
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap consumePixmap() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean disposePixmap() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    public void disposePreparedData() {
        ByteBuffer byteBuffer = this.compressedData;
        if (byteBuffer != null) {
            BufferUtils.disposeUnsafeByteBuffer(byteBuffer);
        }
        this.compressedData = null;
    }

    public ByteBuffer getData(int i, int i2) {
        int i3 = this.imagePos;
        for (int i4 = 0; i4 < this.numberOfMipmapLevels; i4++) {
            int i5 = (this.compressedData.getInt(i3) + 3) & (-4);
            i3 += 4;
            if (i4 == i) {
                for (int i6 = 0; i6 < this.numberOfFaces; i6++) {
                    if (i6 == i2) {
                        this.compressedData.position(i3);
                        ByteBuffer byteBufferSlice = this.compressedData.slice();
                        byteBufferSlice.limit(i5);
                        return byteBufferSlice;
                    }
                    i3 += i5;
                }
            } else {
                i3 = (i5 * this.numberOfFaces) + i3;
            }
        }
        return null;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap.Format getFormat() {
        throw new GdxRuntimeException("This TextureData implementation directly handles texture formats.");
    }

    public int getGlInternalFormat() {
        return this.glInternalFormat;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getHeight() {
        return this.pixelHeight;
    }

    public int getNumberOfFaces() {
        return this.numberOfFaces;
    }

    public int getNumberOfMipMapLevels() {
        return this.numberOfMipmapLevels;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public TextureData.TextureDataType getType() {
        return TextureData.TextureDataType.Custom;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getWidth() {
        return this.pixelWidth;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean isManaged() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean isPrepared() {
        return this.compressedData != null;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void prepare() throws Throwable {
        if (this.compressedData != null) {
            throw new GdxRuntimeException("Already prepared");
        }
        FileHandle fileHandle = this.file;
        if (fileHandle == null) {
            throw new GdxRuntimeException("Need a file to load from");
        }
        if (fileHandle.name().endsWith(".zktx")) {
            byte[] bArr = new byte[10240];
            DataInputStream dataInputStream = null;
            try {
                try {
                    DataInputStream dataInputStream2 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(this.file.read())));
                    try {
                        this.compressedData = BufferUtils.newUnsafeByteBuffer(dataInputStream2.readInt());
                        while (true) {
                            int i = dataInputStream2.read(bArr);
                            if (i == -1) {
                                break;
                            } else {
                                this.compressedData.put(bArr, 0, i);
                            }
                        }
                        this.compressedData.position(0);
                        ByteBuffer byteBuffer = this.compressedData;
                        byteBuffer.limit(byteBuffer.capacity());
                        StreamUtils.closeQuietly(dataInputStream2);
                    } catch (Exception e) {
                        e = e;
                        dataInputStream = dataInputStream2;
                        throw new GdxRuntimeException("Couldn't load zktx file '" + this.file + "'", e);
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
        } else {
            this.compressedData = ByteBuffer.wrap(this.file.readBytes());
        }
        if (this.compressedData.get() != -85) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.compressedData.get() != 75) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.compressedData.get() != 84) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.compressedData.get() != 88) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.compressedData.get() != 32) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.compressedData.get() != 49) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.compressedData.get() != 49) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.compressedData.get() != -69) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.compressedData.get() != 13) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.compressedData.get() != 10) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.compressedData.get() != 26) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.compressedData.get() != 10) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        int i2 = this.compressedData.getInt();
        if (i2 != 67305985 && i2 != 16909060) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (i2 != 67305985) {
            ByteBuffer byteBuffer2 = this.compressedData;
            ByteOrder byteOrderOrder = byteBuffer2.order();
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            if (byteOrderOrder == byteOrder) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer2.order(byteOrder);
        }
        this.glType = this.compressedData.getInt();
        this.glTypeSize = this.compressedData.getInt();
        this.glFormat = this.compressedData.getInt();
        this.glInternalFormat = this.compressedData.getInt();
        this.glBaseInternalFormat = this.compressedData.getInt();
        this.pixelWidth = this.compressedData.getInt();
        this.pixelHeight = this.compressedData.getInt();
        this.pixelDepth = this.compressedData.getInt();
        this.numberOfArrayElements = this.compressedData.getInt();
        this.numberOfFaces = this.compressedData.getInt();
        int i3 = this.compressedData.getInt();
        this.numberOfMipmapLevels = i3;
        if (i3 == 0) {
            this.numberOfMipmapLevels = 1;
            this.useMipMaps = true;
        }
        this.imagePos = this.compressedData.position() + this.compressedData.getInt();
        if (this.compressedData.isDirect()) {
            return;
        }
        int i4 = this.imagePos;
        for (int i5 = 0; i5 < this.numberOfMipmapLevels; i5++) {
            i4 += (((this.compressedData.getInt(i4) + 3) & (-4)) * this.numberOfFaces) + 4;
        }
        this.compressedData.limit(i4);
        this.compressedData.position(0);
        ByteBuffer byteBufferNewUnsafeByteBuffer = BufferUtils.newUnsafeByteBuffer(i4);
        byteBufferNewUnsafeByteBuffer.order(this.compressedData.order());
        byteBufferNewUnsafeByteBuffer.put(this.compressedData);
        this.compressedData = byteBufferNewUnsafeByteBuffer;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean useMipMaps() {
        return this.useMipMaps;
    }
}
