package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.VertexAttributes;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.IntArray;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes.dex */
public class VertexBufferObjectWithVAO implements VertexData {
    static final IntBuffer tmpHandle = BufferUtils.newIntBuffer(1);
    final VertexAttributes attributes;
    final FloatBuffer buffer;
    int bufferHandle;
    final ByteBuffer byteBuffer;
    IntArray cachedLocations;
    boolean isBound;
    boolean isDirty;
    final boolean isStatic;
    final boolean ownsBuffer;
    final int usage;
    int vaoHandle;

    public VertexBufferObjectWithVAO(boolean z, int i, VertexAttribute... vertexAttributeArr) {
        this(z, i, new VertexAttributes(vertexAttributeArr));
    }

    private void bindAttributes(ShaderProgram shaderProgram, int[] iArr) {
        boolean z = this.cachedLocations.size != 0;
        int size = this.attributes.size();
        if (z) {
            if (iArr == null) {
                for (int i = 0; z && i < size; i++) {
                    z = shaderProgram.getAttributeLocation(this.attributes.get(i).alias) == this.cachedLocations.get(i);
                }
            } else {
                z = iArr.length == this.cachedLocations.size;
                for (int i2 = 0; z && i2 < size; i2++) {
                    z = iArr[i2] == this.cachedLocations.get(i2);
                }
            }
        }
        if (z) {
            return;
        }
        Gdx.gl.glBindBuffer(GL20.GL_ARRAY_BUFFER, this.bufferHandle);
        unbindAttributes(shaderProgram);
        this.cachedLocations.clear();
        for (int i3 = 0; i3 < size; i3++) {
            VertexAttribute vertexAttribute = this.attributes.get(i3);
            if (iArr == null) {
                this.cachedLocations.add(shaderProgram.getAttributeLocation(vertexAttribute.alias));
            } else {
                this.cachedLocations.add(iArr[i3]);
            }
            int i4 = this.cachedLocations.get(i3);
            if (i4 >= 0) {
                shaderProgram.enableVertexAttribute(i4);
                shaderProgram.setVertexAttribute(i4, vertexAttribute.numComponents, vertexAttribute.type, vertexAttribute.normalized, this.attributes.vertexSize, vertexAttribute.offset);
            }
        }
    }

    private void bindData(GL20 gl20) {
        if (this.isDirty) {
            gl20.glBindBuffer(GL20.GL_ARRAY_BUFFER, this.bufferHandle);
            this.byteBuffer.limit(this.buffer.limit() * 4);
            gl20.glBufferData(GL20.GL_ARRAY_BUFFER, this.byteBuffer.limit(), this.byteBuffer, this.usage);
            this.isDirty = false;
        }
    }

    private void bufferChanged() {
        if (this.isBound) {
            Gdx.gl20.glBindBuffer(GL20.GL_ARRAY_BUFFER, this.bufferHandle);
            Gdx.gl20.glBufferData(GL20.GL_ARRAY_BUFFER, this.byteBuffer.limit(), this.byteBuffer, this.usage);
            this.isDirty = false;
        }
    }

    private void createVAO() {
        try {
            IntBuffer intBuffer = tmpHandle;
            intBuffer.clear();
            Gdx.gl30.glGenVertexArrays(1, intBuffer);
            if (intBuffer.remaining() >= 1) {
                this.vaoHandle = intBuffer.get();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void deleteVAO() {
        if (this.vaoHandle != -1) {
            IntBuffer intBuffer = tmpHandle;
            intBuffer.clear();
            intBuffer.put(this.vaoHandle);
            intBuffer.flip();
            Gdx.gl30.glDeleteVertexArrays(1, intBuffer);
            this.vaoHandle = -1;
        }
    }

    private void unbindAttributes(ShaderProgram shaderProgram) {
        if (this.cachedLocations.size == 0) {
            return;
        }
        int size = this.attributes.size();
        for (int i = 0; i < size; i++) {
            int i2 = this.cachedLocations.get(i);
            if (i2 >= 0) {
                shaderProgram.disableVertexAttribute(i2);
            }
        }
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public void bind(ShaderProgram shaderProgram) {
        bind(shaderProgram, null);
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData, com.badlogic.gdx.utils.Disposable
    public void dispose() {
        GL30 gl30 = Gdx.gl30;
        gl30.glBindBuffer(GL20.GL_ARRAY_BUFFER, 0);
        gl30.glDeleteBuffer(this.bufferHandle);
        this.bufferHandle = 0;
        if (this.ownsBuffer) {
            BufferUtils.disposeUnsafeByteBuffer(this.byteBuffer);
        }
        deleteVAO();
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public VertexAttributes getAttributes() {
        return this.attributes;
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    @Deprecated
    public FloatBuffer getBuffer() {
        this.isDirty = true;
        return this.buffer;
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public int getNumMaxVertices() {
        return this.byteBuffer.capacity() / this.attributes.vertexSize;
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public int getNumVertices() {
        return (this.buffer.limit() * 4) / this.attributes.vertexSize;
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public void invalidate() {
        this.bufferHandle = Gdx.gl30.glGenBuffer();
        createVAO();
        this.isDirty = true;
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public void setVertices(float[] fArr, int i, int i2) {
        this.isDirty = true;
        BufferUtils.copy(fArr, this.byteBuffer, i2, i);
        this.buffer.position(0);
        this.buffer.limit(i2);
        bufferChanged();
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public void unbind(ShaderProgram shaderProgram) {
        unbind(shaderProgram, null);
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public void updateVertices(int i, float[] fArr, int i2, int i3) {
        this.isDirty = true;
        int iPosition = this.byteBuffer.position();
        this.byteBuffer.position(i * 4);
        BufferUtils.copy(fArr, i2, i3, (Buffer) this.byteBuffer);
        this.byteBuffer.position(iPosition);
        this.buffer.position(0);
        bufferChanged();
    }

    public VertexBufferObjectWithVAO(boolean z, int i, VertexAttributes vertexAttributes) {
        this.isDirty = false;
        this.isBound = false;
        this.vaoHandle = -1;
        this.cachedLocations = new IntArray();
        this.isStatic = z;
        this.attributes = vertexAttributes;
        ByteBuffer byteBufferNewUnsafeByteBuffer = BufferUtils.newUnsafeByteBuffer(vertexAttributes.vertexSize * i);
        this.byteBuffer = byteBufferNewUnsafeByteBuffer;
        FloatBuffer floatBufferAsFloatBuffer = byteBufferNewUnsafeByteBuffer.asFloatBuffer();
        this.buffer = floatBufferAsFloatBuffer;
        this.ownsBuffer = true;
        floatBufferAsFloatBuffer.flip();
        byteBufferNewUnsafeByteBuffer.flip();
        this.bufferHandle = Gdx.gl20.glGenBuffer();
        this.usage = z ? GL20.GL_STATIC_DRAW : GL20.GL_DYNAMIC_DRAW;
        createVAO();
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public void bind(ShaderProgram shaderProgram, int[] iArr) {
        GL30 gl30 = Gdx.gl30;
        gl30.glBindVertexArray(this.vaoHandle);
        bindAttributes(shaderProgram, iArr);
        bindData(gl30);
        this.isBound = true;
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public void unbind(ShaderProgram shaderProgram, int[] iArr) {
        Gdx.gl30.glBindVertexArray(0);
        this.isBound = false;
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public FloatBuffer getBuffer(boolean z) {
        this.isDirty = z | this.isDirty;
        return this.buffer;
    }

    public VertexBufferObjectWithVAO(boolean z, ByteBuffer byteBuffer, VertexAttributes vertexAttributes) {
        this.isDirty = false;
        this.isBound = false;
        this.vaoHandle = -1;
        this.cachedLocations = new IntArray();
        this.isStatic = z;
        this.attributes = vertexAttributes;
        this.byteBuffer = byteBuffer;
        this.ownsBuffer = false;
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        this.buffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.flip();
        byteBuffer.flip();
        this.bufferHandle = Gdx.gl20.glGenBuffer();
        this.usage = z ? GL20.GL_STATIC_DRAW : GL20.GL_DYNAMIC_DRAW;
        createVAO();
    }
}
