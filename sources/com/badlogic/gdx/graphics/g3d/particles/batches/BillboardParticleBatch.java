package com.badlogic.gdx.graphics.g3d.particles.batches;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.VertexAttributes;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Renderable;
import com.badlogic.gdx.graphics.g3d.Shader;
import com.badlogic.gdx.graphics.g3d.attributes.BlendingAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.DepthTestAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute;
import com.badlogic.gdx.graphics.g3d.model.MeshPart;
import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleShader;
import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.graphics.g3d.particles.renderers.BillboardControllerRenderData;
import com.badlogic.gdx.graphics.g3d.shaders.DefaultShader;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Pool;
import com.umeng.ccg.a;

/* JADX INFO: loaded from: classes.dex */
public class BillboardParticleBatch extends BufferedParticleBatch<BillboardControllerRenderData> {
    private static final VertexAttributes CPU_ATTRIBUTES;
    private static final int CPU_COLOR_OFFSET;
    private static final int CPU_POSITION_OFFSET;
    private static final int CPU_UV_OFFSET;
    private static final int CPU_VERTEX_SIZE;
    private static final VertexAttributes GPU_ATTRIBUTES;
    private static final int GPU_COLOR_OFFSET;
    private static final int GPU_POSITION_OFFSET;
    private static final int GPU_SIZE_ROTATION_OFFSET;
    private static final int GPU_UV_OFFSET;
    private static final int GPU_VERTEX_SIZE;
    private static final int MAX_PARTICLES_PER_MESH = 8191;
    private static final int MAX_VERTICES_PER_MESH = 32764;
    protected static final int directionUsage = 1024;
    protected static final int sizeAndRotationUsage = 512;
    protected BlendingAttribute blendingAttribute;
    private VertexAttributes currentAttributes;
    private int currentVertexSize;
    protected DepthTestAttribute depthTestAttribute;
    private short[] indices;
    protected ParticleShader.AlignMode mode;
    private RenderablePool renderablePool;
    private Array<Renderable> renderables;
    Shader shader;
    protected Texture texture;
    protected boolean useGPU;
    private float[] vertices;
    protected static final Vector3 TMP_V1 = new Vector3();
    protected static final Vector3 TMP_V2 = new Vector3();
    protected static final Vector3 TMP_V3 = new Vector3();
    protected static final Vector3 TMP_V4 = new Vector3();
    protected static final Vector3 TMP_V5 = new Vector3();
    protected static final Vector3 TMP_V6 = new Vector3();
    protected static final Matrix3 TMP_M3 = new Matrix3();

    public static class Config {
        ParticleShader.AlignMode mode;
        boolean useGPU;

        public Config() {
        }

        public Config(boolean z, ParticleShader.AlignMode alignMode) {
            this.useGPU = z;
            this.mode = alignMode;
        }
    }

    public class RenderablePool extends Pool<Renderable> {
        public RenderablePool() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.badlogic.gdx.utils.Pool
        public Renderable newObject() {
            return BillboardParticleBatch.this.allocRenderable();
        }
    }

    static {
        VertexAttributes vertexAttributes = new VertexAttributes(new VertexAttribute(1, 3, ShaderProgram.POSITION_ATTRIBUTE), new VertexAttribute(16, 2, "a_texCoord0"), new VertexAttribute(2, 4, ShaderProgram.COLOR_ATTRIBUTE), new VertexAttribute(512, 4, "a_sizeAndRotation"));
        GPU_ATTRIBUTES = vertexAttributes;
        VertexAttributes vertexAttributes2 = new VertexAttributes(new VertexAttribute(1, 3, ShaderProgram.POSITION_ATTRIBUTE), new VertexAttribute(16, 2, "a_texCoord0"), new VertexAttribute(2, 4, ShaderProgram.COLOR_ATTRIBUTE));
        CPU_ATTRIBUTES = vertexAttributes2;
        GPU_POSITION_OFFSET = (short) (vertexAttributes.findByUsage(1).offset / 4);
        GPU_UV_OFFSET = (short) (vertexAttributes.findByUsage(16).offset / 4);
        GPU_SIZE_ROTATION_OFFSET = (short) (vertexAttributes.findByUsage(512).offset / 4);
        GPU_COLOR_OFFSET = (short) (vertexAttributes.findByUsage(2).offset / 4);
        GPU_VERTEX_SIZE = vertexAttributes.vertexSize / 4;
        CPU_POSITION_OFFSET = (short) (vertexAttributes2.findByUsage(1).offset / 4);
        CPU_UV_OFFSET = (short) (vertexAttributes2.findByUsage(16).offset / 4);
        CPU_COLOR_OFFSET = (short) (vertexAttributes2.findByUsage(2).offset / 4);
        CPU_VERTEX_SIZE = vertexAttributes2.vertexSize / 4;
    }

    public BillboardParticleBatch(ParticleShader.AlignMode alignMode, boolean z, int i, BlendingAttribute blendingAttribute, DepthTestAttribute depthTestAttribute) {
        super(BillboardControllerRenderData.class);
        this.currentVertexSize = 0;
        this.useGPU = false;
        this.mode = ParticleShader.AlignMode.Screen;
        this.renderables = new Array<>();
        this.renderablePool = new RenderablePool();
        this.blendingAttribute = blendingAttribute;
        this.depthTestAttribute = depthTestAttribute;
        if (blendingAttribute == null) {
            this.blendingAttribute = new BlendingAttribute(1, GL20.GL_ONE_MINUS_SRC_ALPHA, 1.0f);
        }
        if (this.depthTestAttribute == null) {
            this.depthTestAttribute = new DepthTestAttribute(GL20.GL_LEQUAL, false);
        }
        allocIndices();
        initRenderData();
        ensureCapacity(i);
        setUseGpu(z);
        setAlignMode(alignMode);
    }

    private void allocIndices() {
        this.indices = new short[49146];
        int i = 0;
        int i2 = 0;
        while (i < 49146) {
            short[] sArr = this.indices;
            short s = (short) i2;
            sArr[i] = s;
            sArr[i + 1] = (short) (i2 + 1);
            short s2 = (short) (i2 + 2);
            sArr[i + 2] = s2;
            sArr[i + 3] = s2;
            sArr[i + 4] = (short) (i2 + 3);
            sArr[i + 5] = s;
            i += 6;
            i2 += 4;
        }
    }

    private void allocRenderables(int i) {
        int iCeil = MathUtils.ceil(i / MAX_PARTICLES_PER_MESH);
        int free = this.renderablePool.getFree();
        if (free < iCeil) {
            int i2 = iCeil - free;
            for (int i3 = 0; i3 < i2; i3++) {
                RenderablePool renderablePool = this.renderablePool;
                renderablePool.free(renderablePool.newObject());
            }
        }
    }

    private void allocShader() {
        Renderable renderableAllocRenderable = allocRenderable();
        Shader shader = getShader(renderableAllocRenderable);
        renderableAllocRenderable.shader = shader;
        this.shader = shader;
        this.renderablePool.free(renderableAllocRenderable);
    }

    private void clearRenderablesPool() {
        this.renderablePool.freeAll(this.renderables);
        int free = this.renderablePool.getFree();
        for (int i = 0; i < free; i++) {
            this.renderablePool.obtain().meshPart.mesh.dispose();
        }
        this.renderables.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void fillVerticesGPU(int[] iArr) {
        Array.ArrayIterator it = this.renderData.iterator();
        int i = 0;
        while (it.hasNext()) {
            BillboardControllerRenderData billboardControllerRenderData = (BillboardControllerRenderData) it.next();
            ParallelArray.FloatChannel floatChannel = billboardControllerRenderData.scaleChannel;
            ParallelArray.FloatChannel floatChannel2 = billboardControllerRenderData.regionChannel;
            ParallelArray.FloatChannel floatChannel3 = billboardControllerRenderData.positionChannel;
            ParallelArray.FloatChannel floatChannel4 = billboardControllerRenderData.colorChannel;
            ParallelArray.FloatChannel floatChannel5 = billboardControllerRenderData.rotationChannel;
            int i2 = billboardControllerRenderData.controller.particles.size;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i] * this.currentVertexSize * 4;
                float f = floatChannel.data[floatChannel.strideSize * i3];
                int i5 = floatChannel2.strideSize * i3;
                int i6 = floatChannel3.strideSize * i3;
                int i7 = floatChannel4.strideSize * i3;
                int i8 = floatChannel5.strideSize * i3;
                Array.ArrayIterator arrayIterator = it;
                float[] fArr = floatChannel3.data;
                float f2 = fArr[i6];
                float f3 = fArr[i6 + 1];
                float f4 = fArr[i6 + 2];
                float[] fArr2 = floatChannel2.data;
                float f5 = fArr2[i5];
                float f6 = fArr2[i5 + 1];
                float f7 = fArr2[i5 + 2];
                float f8 = fArr2[i5 + 3];
                int i9 = i2;
                float f9 = fArr2[i5 + 4] * f;
                float f10 = fArr2[i5 + 5] * f;
                float[] fArr3 = floatChannel4.data;
                float f11 = fArr3[i7];
                float f12 = fArr3[i7 + 1];
                float f13 = fArr3[i7 + 2];
                float f14 = fArr3[i7 + 3];
                float[] fArr4 = floatChannel5.data;
                float f15 = fArr4[i8];
                float f16 = fArr4[i8 + 1];
                float f17 = -f9;
                float f18 = -f10;
                putVertex(this.vertices, i4, f2, f3, f4, f5, f8, f17, f18, f15, f16, f11, f12, f13, f14);
                int i10 = i4 + this.currentVertexSize;
                putVertex(this.vertices, i10, f2, f3, f4, f7, f8, f9, f18, f15, f16, f11, f12, f13, f14);
                int i11 = i10 + this.currentVertexSize;
                putVertex(this.vertices, i11, f2, f3, f4, f7, f6, f9, f10, f15, f16, f11, f12, f13, f14);
                putVertex(this.vertices, i11 + this.currentVertexSize, f2, f3, f4, f5, f6, f17, f10, f15, f16, f11, f12, f13, f14);
                i3++;
                i++;
                it = arrayIterator;
                i2 = i9;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void fillVerticesToScreenCPU(int[] iArr) {
        Vector3 vector3Scl = TMP_V3.set(this.camera.direction).scl(-1.0f);
        Vector3 vector3Nor = TMP_V4.set(this.camera.up).crs(vector3Scl).nor();
        Vector3 vector3 = this.camera.up;
        Array.ArrayIterator it = this.renderData.iterator();
        int i = 0;
        while (it.hasNext()) {
            BillboardControllerRenderData billboardControllerRenderData = (BillboardControllerRenderData) it.next();
            ParallelArray.FloatChannel floatChannel = billboardControllerRenderData.scaleChannel;
            ParallelArray.FloatChannel floatChannel2 = billboardControllerRenderData.regionChannel;
            ParallelArray.FloatChannel floatChannel3 = billboardControllerRenderData.positionChannel;
            ParallelArray.FloatChannel floatChannel4 = billboardControllerRenderData.colorChannel;
            ParallelArray.FloatChannel floatChannel5 = billboardControllerRenderData.rotationChannel;
            int i2 = billboardControllerRenderData.controller.particles.size;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i] * this.currentVertexSize * 4;
                float f = floatChannel.data[floatChannel.strideSize * i3];
                int i5 = floatChannel2.strideSize * i3;
                Array.ArrayIterator arrayIterator = it;
                int i6 = floatChannel3.strideSize * i3;
                int i7 = i2;
                int i8 = floatChannel4.strideSize * i3;
                ParallelArray.FloatChannel floatChannel6 = floatChannel;
                int i9 = floatChannel5.strideSize * i3;
                int i10 = i;
                float[] fArr = floatChannel3.data;
                ParallelArray.FloatChannel floatChannel7 = floatChannel3;
                float f2 = fArr[i6];
                int i11 = i3;
                float f3 = fArr[i6 + 1];
                float f4 = fArr[i6 + 2];
                float[] fArr2 = floatChannel2.data;
                float f5 = fArr2[i5];
                float f6 = fArr2[i5 + 1];
                float f7 = fArr2[i5 + 2];
                float f8 = fArr2[i5 + 3];
                ParallelArray.FloatChannel floatChannel8 = floatChannel2;
                float f9 = fArr2[i5 + 4] * f;
                float f10 = fArr2[i5 + 5] * f;
                float[] fArr3 = floatChannel4.data;
                float f11 = fArr3[i8];
                float f12 = fArr3[i8 + 1];
                float f13 = fArr3[i8 + 2];
                float f14 = fArr3[i8 + 3];
                float[] fArr4 = floatChannel5.data;
                float f15 = fArr4[i9];
                float f16 = fArr4[i9 + 1];
                Vector3 vector4 = TMP_V1;
                ParallelArray.FloatChannel floatChannel9 = floatChannel4;
                vector4.set(vector3Nor).scl(f9);
                Vector3 vector5 = TMP_V2;
                vector5.set(vector3).scl(f10);
                if (f15 != 1.0f) {
                    Matrix3 matrix3 = TMP_M3;
                    matrix3.setToRotation(vector3Scl, f15, f16);
                    float[] fArr5 = this.vertices;
                    Vector3 vector6 = TMP_V6;
                    putVertex(fArr5, i4, vector6.set((-vector4.x) - vector5.x, (-vector4.y) - vector5.y, (-vector4.z) - vector5.z).mul(matrix3).add(f2, f3, f4), f5, f8, f11, f12, f13, f14);
                    int i12 = i4 + this.currentVertexSize;
                    putVertex(this.vertices, i12, vector6.set(vector4.x - vector5.x, vector4.y - vector5.y, vector4.z - vector5.z).mul(matrix3).add(f2, f3, f4), f7, f8, f11, f12, f13, f14);
                    int i13 = i12 + this.currentVertexSize;
                    putVertex(this.vertices, i13, vector6.set(vector4.x + vector5.x, vector4.y + vector5.y, vector4.z + vector5.z).mul(matrix3).add(f2, f3, f4), f7, f6, f11, f12, f13, f14);
                    putVertex(this.vertices, i13 + this.currentVertexSize, vector6.set((-vector4.x) + vector5.x, (-vector4.y) + vector5.y, (-vector4.z) + vector5.z).mul(matrix3).add(f2, f3, f4), f5, f6, f11, f12, f13, f14);
                } else {
                    float[] fArr6 = this.vertices;
                    Vector3 vector7 = TMP_V6;
                    putVertex(fArr6, i4, vector7.set(((-vector4.x) - vector5.x) + f2, ((-vector4.y) - vector5.y) + f3, ((-vector4.z) - vector5.z) + f4), f5, f8, f11, f12, f13, f14);
                    int i14 = i4 + this.currentVertexSize;
                    putVertex(this.vertices, i14, vector7.set((vector4.x - vector5.x) + f2, (vector4.y - vector5.y) + f3, (vector4.z - vector5.z) + f4), f7, f8, f11, f12, f13, f14);
                    int i15 = i14 + this.currentVertexSize;
                    putVertex(this.vertices, i15, vector7.set(vector4.x + vector5.x + f2, vector4.y + vector5.y + f3, vector4.z + vector5.z + f4), f7, f6, f11, f12, f13, f14);
                    putVertex(this.vertices, i15 + this.currentVertexSize, vector7.set((-vector4.x) + vector5.x + f2, (-vector4.y) + vector5.y + f3, (-vector4.z) + vector5.z + f4), f5, f6, f11, f12, f13, f14);
                }
                i3 = i11 + 1;
                i = i10 + 1;
                it = arrayIterator;
                i2 = i7;
                floatChannel = floatChannel6;
                floatChannel3 = floatChannel7;
                floatChannel2 = floatChannel8;
                floatChannel4 = floatChannel9;
                vector3Scl = vector3Scl;
                vector3Nor = vector3Nor;
                vector3 = vector3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void fillVerticesToViewPointCPU(int[] iArr) {
        Array.ArrayIterator it = this.renderData.iterator();
        int i = 0;
        while (it.hasNext()) {
            BillboardControllerRenderData billboardControllerRenderData = (BillboardControllerRenderData) it.next();
            ParallelArray.FloatChannel floatChannel = billboardControllerRenderData.scaleChannel;
            ParallelArray.FloatChannel floatChannel2 = billboardControllerRenderData.regionChannel;
            ParallelArray.FloatChannel floatChannel3 = billboardControllerRenderData.positionChannel;
            ParallelArray.FloatChannel floatChannel4 = billboardControllerRenderData.colorChannel;
            ParallelArray.FloatChannel floatChannel5 = billboardControllerRenderData.rotationChannel;
            int i2 = billboardControllerRenderData.controller.particles.size;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i] * this.currentVertexSize * 4;
                float f = floatChannel.data[floatChannel.strideSize * i3];
                int i5 = floatChannel2.strideSize * i3;
                int i6 = floatChannel3.strideSize * i3;
                int i7 = floatChannel4.strideSize * i3;
                int i8 = floatChannel5.strideSize * i3;
                Array.ArrayIterator arrayIterator = it;
                float[] fArr = floatChannel3.data;
                int i9 = i2;
                float f2 = fArr[i6];
                ParallelArray.FloatChannel floatChannel6 = floatChannel;
                float f3 = fArr[i6 + 1];
                float f4 = fArr[i6 + 2];
                float[] fArr2 = floatChannel2.data;
                float f5 = fArr2[i5];
                float f6 = fArr2[i5 + 1];
                float f7 = fArr2[i5 + 2];
                float f8 = fArr2[i5 + 3];
                ParallelArray.FloatChannel floatChannel7 = floatChannel2;
                float f9 = fArr2[i5 + 4] * f;
                float f10 = fArr2[i5 + 5] * f;
                float[] fArr3 = floatChannel4.data;
                float f11 = fArr3[i7];
                float f12 = fArr3[i7 + 1];
                float f13 = fArr3[i7 + 2];
                float f14 = fArr3[i7 + 3];
                float[] fArr4 = floatChannel5.data;
                float f15 = fArr4[i8];
                float f16 = fArr4[i8 + 1];
                Vector3 vector3Nor = TMP_V3.set(this.camera.position).sub(f2, f3, f4).nor();
                Vector3 vector3 = TMP_V1;
                ParallelArray.FloatChannel floatChannel8 = floatChannel3;
                Vector3 vector3Nor2 = vector3.set(this.camera.up).crs(vector3Nor).nor();
                ParallelArray.FloatChannel floatChannel9 = floatChannel4;
                Vector3 vector4 = TMP_V2;
                ParallelArray.FloatChannel floatChannel10 = floatChannel5;
                Vector3 vector3Crs = vector4.set(vector3Nor).crs(vector3Nor2);
                vector3Nor2.scl(f9);
                vector3Crs.scl(f10);
                if (f15 != 1.0f) {
                    Matrix3 matrix3 = TMP_M3;
                    matrix3.setToRotation(vector3Nor, f15, f16);
                    float[] fArr5 = this.vertices;
                    Vector3 vector5 = TMP_V6;
                    putVertex(fArr5, i4, vector5.set((-vector3.x) - vector4.x, (-vector3.y) - vector4.y, (-vector3.z) - vector4.z).mul(matrix3).add(f2, f3, f4), f5, f8, f11, f12, f13, f14);
                    int i10 = i4 + this.currentVertexSize;
                    putVertex(this.vertices, i10, vector5.set(vector3.x - vector4.x, vector3.y - vector4.y, vector3.z - vector4.z).mul(matrix3).add(f2, f3, f4), f7, f8, f11, f12, f13, f14);
                    int i11 = i10 + this.currentVertexSize;
                    putVertex(this.vertices, i11, vector5.set(vector3.x + vector4.x, vector3.y + vector4.y, vector3.z + vector4.z).mul(matrix3).add(f2, f3, f4), f7, f6, f11, f12, f13, f14);
                    putVertex(this.vertices, i11 + this.currentVertexSize, vector5.set((-vector3.x) + vector4.x, (-vector3.y) + vector4.y, (-vector3.z) + vector4.z).mul(matrix3).add(f2, f3, f4), f5, f6, f11, f12, f13, f14);
                } else {
                    float[] fArr6 = this.vertices;
                    Vector3 vector6 = TMP_V6;
                    putVertex(fArr6, i4, vector6.set(((-vector3.x) - vector4.x) + f2, ((-vector3.y) - vector4.y) + f3, ((-vector3.z) - vector4.z) + f4), f5, f8, f11, f12, f13, f14);
                    int i12 = i4 + this.currentVertexSize;
                    putVertex(this.vertices, i12, vector6.set((vector3.x - vector4.x) + f2, (vector3.y - vector4.y) + f3, (vector3.z - vector4.z) + f4), f7, f8, f11, f12, f13, f14);
                    int i13 = i12 + this.currentVertexSize;
                    putVertex(this.vertices, i13, vector6.set(vector3.x + vector4.x + f2, vector3.y + vector4.y + f3, vector3.z + vector4.z + f4), f7, f6, f11, f12, f13, f14);
                    putVertex(this.vertices, i13 + this.currentVertexSize, vector6.set((-vector3.x) + vector4.x + f2, (-vector3.y) + vector4.y + f3, (-vector3.z) + vector4.z + f4), f5, f6, f11, f12, f13, f14);
                }
                i3++;
                i++;
                it = arrayIterator;
                i2 = i9;
                floatChannel = floatChannel6;
                floatChannel2 = floatChannel7;
                floatChannel3 = floatChannel8;
                floatChannel4 = floatChannel9;
                floatChannel5 = floatChannel10;
            }
        }
    }

    private void initRenderData() {
        setVertexData();
        clearRenderablesPool();
        allocShader();
        resetCapacity();
    }

    private static void putVertex(float[] fArr, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        int i2 = GPU_POSITION_OFFSET;
        fArr[i + i2] = f;
        fArr[i + i2 + 1] = f2;
        fArr[i2 + i + 2] = f3;
        int i3 = GPU_UV_OFFSET;
        fArr[i + i3] = f4;
        fArr[i3 + i + 1] = f5;
        int i4 = GPU_SIZE_ROTATION_OFFSET;
        fArr[i + i4] = f6;
        fArr[i + i4 + 1] = f7;
        fArr[i + i4 + 2] = f8;
        fArr[i4 + i + 3] = f9;
        int i5 = GPU_COLOR_OFFSET;
        fArr[i + i5] = f10;
        fArr[i + i5 + 1] = f11;
        fArr[i + i5 + 2] = f12;
        fArr[i5 + i + 3] = f13;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.batches.BufferedParticleBatch
    public void allocParticlesData(int i) {
        this.vertices = new float[this.currentVertexSize * 4 * i];
        allocRenderables(i);
    }

    public Renderable allocRenderable() {
        Renderable renderable = new Renderable();
        MeshPart meshPart = renderable.meshPart;
        meshPart.primitiveType = 4;
        meshPart.offset = 0;
        renderable.material = new Material(this.blendingAttribute, this.depthTestAttribute, TextureAttribute.createDiffuse(this.texture));
        renderable.meshPart.mesh = new Mesh(false, MAX_VERTICES_PER_MESH, 49146, this.currentAttributes);
        renderable.meshPart.mesh.setIndices(this.indices);
        renderable.shader = this.shader;
        return renderable;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.batches.BufferedParticleBatch, com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch
    public void begin() {
        super.begin();
        this.renderablePool.freeAll(this.renderables);
        this.renderables.clear();
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.batches.BufferedParticleBatch
    public void flush(int[] iArr) {
        if (this.useGPU) {
            fillVerticesGPU(iArr);
        } else {
            ParticleShader.AlignMode alignMode = this.mode;
            if (alignMode == ParticleShader.AlignMode.Screen) {
                fillVerticesToScreenCPU(iArr);
            } else if (alignMode == ParticleShader.AlignMode.ViewPoint) {
                fillVerticesToViewPointCPU(iArr);
            }
        }
        int i = this.bufferedParticlesCount * 4;
        int i2 = 0;
        while (i2 < i) {
            int iMin = Math.min(i - i2, MAX_VERTICES_PER_MESH);
            Renderable renderableObtain = this.renderablePool.obtain();
            MeshPart meshPart = renderableObtain.meshPart;
            meshPart.size = (iMin / 4) * 6;
            Mesh mesh = meshPart.mesh;
            float[] fArr = this.vertices;
            int i3 = this.currentVertexSize;
            mesh.setVertices(fArr, i3 * i2, i3 * iMin);
            renderableObtain.meshPart.update();
            this.renderables.add(renderableObtain);
            i2 += iMin;
        }
    }

    public ParticleShader.AlignMode getAlignMode() {
        return this.mode;
    }

    public BlendingAttribute getBlendingAttribute() {
        return this.blendingAttribute;
    }

    @Override // com.badlogic.gdx.graphics.g3d.RenderableProvider
    public void getRenderables(Array<Renderable> array, Pool<Renderable> pool) {
        Array.ArrayIterator<Renderable> it = this.renderables.iterator();
        while (it.hasNext()) {
            array.add(pool.obtain().set(it.next()));
        }
    }

    public Shader getShader(Renderable renderable) {
        Shader particleShader = this.useGPU ? new ParticleShader(renderable, new ParticleShader.Config(this.mode)) : new DefaultShader(renderable);
        particleShader.init();
        return particleShader;
    }

    public Texture getTexture() {
        return this.texture;
    }

    public boolean isUseGPU() {
        return this.useGPU;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch, com.badlogic.gdx.graphics.g3d.particles.ResourceData.Configurable
    public void load(AssetManager assetManager, ResourceData resourceData) {
        ResourceData.SaveData saveData = resourceData.getSaveData("billboardBatch");
        if (saveData != null) {
            setTexture((Texture) assetManager.get(saveData.loadAsset()));
            Config config = (Config) saveData.load(a.l);
            setUseGpu(config.useGPU);
            setAlignMode(config.mode);
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch, com.badlogic.gdx.graphics.g3d.particles.ResourceData.Configurable
    public void save(AssetManager assetManager, ResourceData resourceData) {
        ResourceData.SaveData saveDataCreateSaveData = resourceData.createSaveData("billboardBatch");
        saveDataCreateSaveData.save(a.l, new Config(this.useGPU, this.mode));
        saveDataCreateSaveData.saveAsset(assetManager.getAssetFileName(this.texture), Texture.class);
    }

    public void setAlignMode(ParticleShader.AlignMode alignMode) {
        if (alignMode != this.mode) {
            this.mode = alignMode;
            if (this.useGPU) {
                initRenderData();
                allocRenderables(this.bufferedParticlesCount);
            }
        }
    }

    public void setTexture(Texture texture) {
        this.renderablePool.freeAll(this.renderables);
        this.renderables.clear();
        int free = this.renderablePool.getFree();
        for (int i = 0; i < free; i++) {
            ((TextureAttribute) this.renderablePool.obtain().material.get(TextureAttribute.Diffuse)).textureDescription.texture = texture;
        }
        this.texture = texture;
    }

    public void setUseGpu(boolean z) {
        if (this.useGPU != z) {
            this.useGPU = z;
            initRenderData();
            allocRenderables(this.bufferedParticlesCount);
        }
    }

    public void setVertexData() {
        if (this.useGPU) {
            this.currentAttributes = GPU_ATTRIBUTES;
            this.currentVertexSize = GPU_VERTEX_SIZE;
        } else {
            this.currentAttributes = CPU_ATTRIBUTES;
            this.currentVertexSize = CPU_VERTEX_SIZE;
        }
    }

    private static void putVertex(float[] fArr, int i, Vector3 vector3, float f, float f2, float f3, float f4, float f5, float f6) {
        int i2 = CPU_POSITION_OFFSET;
        fArr[i + i2] = vector3.x;
        fArr[i + i2 + 1] = vector3.y;
        fArr[i2 + i + 2] = vector3.z;
        int i3 = CPU_UV_OFFSET;
        fArr[i + i3] = f;
        fArr[i3 + i + 1] = f2;
        int i4 = CPU_COLOR_OFFSET;
        fArr[i + i4] = f3;
        fArr[i + i4 + 1] = f4;
        fArr[i + i4 + 2] = f5;
        fArr[i + i4 + 3] = f6;
    }

    public BillboardParticleBatch(ParticleShader.AlignMode alignMode, boolean z, int i) {
        this(alignMode, z, i, null, null);
    }

    public BillboardParticleBatch() {
        this(ParticleShader.AlignMode.Screen, false, 100);
    }

    public BillboardParticleBatch(int i) {
        this(ParticleShader.AlignMode.Screen, false, i);
    }
}
