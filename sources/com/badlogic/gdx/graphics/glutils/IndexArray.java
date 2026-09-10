package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.utils.BufferUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public class IndexArray implements IndexData {
    final ShortBuffer buffer;
    final ByteBuffer byteBuffer;
    private final boolean empty;

    public IndexArray(int i) {
        boolean z = i == 0;
        this.empty = z;
        ByteBuffer byteBufferNewUnsafeByteBuffer = BufferUtils.newUnsafeByteBuffer((z ? 1 : i) * 2);
        this.byteBuffer = byteBufferNewUnsafeByteBuffer;
        ShortBuffer shortBufferAsShortBuffer = byteBufferNewUnsafeByteBuffer.asShortBuffer();
        this.buffer = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.flip();
        byteBufferNewUnsafeByteBuffer.flip();
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public void bind() {
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData, com.badlogic.gdx.utils.Disposable
    public void dispose() {
        BufferUtils.disposeUnsafeByteBuffer(this.byteBuffer);
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    @Deprecated
    public ShortBuffer getBuffer() {
        return this.buffer;
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public int getNumIndices() {
        if (this.empty) {
            return 0;
        }
        return this.buffer.limit();
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public int getNumMaxIndices() {
        if (this.empty) {
            return 0;
        }
        return this.buffer.capacity();
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public void invalidate() {
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public void setIndices(short[] sArr, int i, int i2) {
        this.buffer.clear();
        this.buffer.put(sArr, i, i2);
        this.buffer.flip();
        this.byteBuffer.position(0);
        this.byteBuffer.limit(i2 << 1);
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public void unbind() {
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public void updateIndices(int i, short[] sArr, int i2, int i3) {
        int iPosition = this.byteBuffer.position();
        this.byteBuffer.position(i * 2);
        BufferUtils.copy(sArr, i2, (Buffer) this.byteBuffer, i3);
        this.byteBuffer.position(iPosition);
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public ShortBuffer getBuffer(boolean z) {
        return this.buffer;
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public void setIndices(ShortBuffer shortBuffer) {
        int iPosition = shortBuffer.position();
        this.buffer.clear();
        this.buffer.limit(shortBuffer.remaining());
        this.buffer.put(shortBuffer);
        this.buffer.flip();
        shortBuffer.position(iPosition);
        this.byteBuffer.position(0);
        this.byteBuffer.limit(this.buffer.limit() << 1);
    }
}
