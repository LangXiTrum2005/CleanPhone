package com.badlogic.gdx.graphics.g3d.particles.batches;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.VertexAttributes;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Renderable;
import com.badlogic.gdx.graphics.g3d.attributes.BlendingAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.DepthTestAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute;
import com.badlogic.gdx.graphics.g3d.model.MeshPart;
import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleShader;
import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.graphics.g3d.particles.renderers.PointSpriteControllerRenderData;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Pool;

/* JADX INFO: loaded from: classes.dex */
public class PointSpriteParticleBatch extends BufferedParticleBatch<PointSpriteControllerRenderData> {
    protected static final VertexAttributes CPU_ATTRIBUTES;
    protected static final int CPU_COLOR_OFFSET;
    protected static final int CPU_POSITION_OFFSET;
    protected static final int CPU_REGION_OFFSET;
    protected static final int CPU_SIZE_AND_ROTATION_OFFSET;
    protected static final int CPU_VERTEX_SIZE;
    protected static final Vector3 TMP_V1 = new Vector3();
    private static boolean pointSpritesEnabled = false;
    protected static final int sizeAndRotationUsage = 512;
    protected BlendingAttribute blendingAttribute;
    protected DepthTestAttribute depthTestAttribute;
    Renderable renderable;
    private float[] vertices;

    static {
        VertexAttributes vertexAttributes = new VertexAttributes(new VertexAttribute(1, 3, ShaderProgram.POSITION_ATTRIBUTE), new VertexAttribute(2, 4, ShaderProgram.COLOR_ATTRIBUTE), new VertexAttribute(16, 4, "a_region"), new VertexAttribute(512, 3, "a_sizeAndRotation"));
        CPU_ATTRIBUTES = vertexAttributes;
        CPU_VERTEX_SIZE = (short) (vertexAttributes.vertexSize / 4);
        CPU_POSITION_OFFSET = (short) (vertexAttributes.findByUsage(1).offset / 4);
        CPU_COLOR_OFFSET = (short) (vertexAttributes.findByUsage(2).offset / 4);
        CPU_REGION_OFFSET = (short) (vertexAttributes.findByUsage(16).offset / 4);
        CPU_SIZE_AND_ROTATION_OFFSET = (short) (vertexAttributes.findByUsage(512).offset / 4);
    }

    public PointSpriteParticleBatch() {
        this(1000);
    }

    private static void enablePointSprites() {
        Gdx.gl.glEnable(GL20.GL_VERTEX_PROGRAM_POINT_SIZE);
        if (Gdx.app.getType() == Application.ApplicationType.Desktop) {
            Gdx.gl.glEnable(34913);
        }
        pointSpritesEnabled = true;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.batches.BufferedParticleBatch
    public void allocParticlesData(int i) {
        this.vertices = new float[CPU_VERTEX_SIZE * i];
        Mesh mesh = this.renderable.meshPart.mesh;
        if (mesh != null) {
            mesh.dispose();
        }
        this.renderable.meshPart.mesh = new Mesh(false, i, 0, CPU_ATTRIBUTES);
    }

    public void allocRenderable() {
        Renderable renderable = new Renderable();
        this.renderable = renderable;
        MeshPart meshPart = renderable.meshPart;
        meshPart.primitiveType = 0;
        meshPart.offset = 0;
        renderable.material = new Material(this.blendingAttribute, this.depthTestAttribute, TextureAttribute.createDiffuse((Texture) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.graphics.g3d.particles.batches.BufferedParticleBatch
    public void flush(int[] iArr) {
        Array.ArrayIterator it = this.renderData.iterator();
        int i = 0;
        while (it.hasNext()) {
            PointSpriteControllerRenderData pointSpriteControllerRenderData = (PointSpriteControllerRenderData) it.next();
            ParallelArray.FloatChannel floatChannel = pointSpriteControllerRenderData.scaleChannel;
            ParallelArray.FloatChannel floatChannel2 = pointSpriteControllerRenderData.regionChannel;
            ParallelArray.FloatChannel floatChannel3 = pointSpriteControllerRenderData.positionChannel;
            ParallelArray.FloatChannel floatChannel4 = pointSpriteControllerRenderData.colorChannel;
            ParallelArray.FloatChannel floatChannel5 = pointSpriteControllerRenderData.rotationChannel;
            int i2 = 0;
            while (i2 < pointSpriteControllerRenderData.controller.particles.size) {
                int i3 = iArr[i] * CPU_VERTEX_SIZE;
                int i4 = floatChannel2.strideSize * i2;
                int i5 = floatChannel3.strideSize * i2;
                int i6 = floatChannel4.strideSize * i2;
                int i7 = floatChannel5.strideSize * i2;
                float[] fArr = this.vertices;
                int i8 = CPU_POSITION_OFFSET;
                Array.ArrayIterator arrayIterator = it;
                float[] fArr2 = floatChannel3.data;
                fArr[i3 + i8] = fArr2[i5];
                fArr[i3 + i8 + 1] = fArr2[i5 + 1];
                fArr[i3 + i8 + 2] = fArr2[i5 + 2];
                int i9 = CPU_COLOR_OFFSET;
                PointSpriteControllerRenderData pointSpriteControllerRenderData2 = pointSpriteControllerRenderData;
                float[] fArr3 = floatChannel4.data;
                fArr[i3 + i9] = fArr3[i6];
                fArr[i3 + i9 + 1] = fArr3[i6 + 1];
                fArr[i3 + i9 + 2] = fArr3[i6 + 2];
                fArr[i9 + i3 + 3] = fArr3[i6 + 3];
                int i10 = CPU_SIZE_AND_ROTATION_OFFSET;
                fArr[i3 + i10] = floatChannel.data[floatChannel.strideSize * i2];
                float[] fArr4 = floatChannel5.data;
                fArr[i3 + i10 + 1] = fArr4[i7];
                fArr[i10 + i3 + 2] = fArr4[i7 + 1];
                int i11 = CPU_REGION_OFFSET;
                float[] fArr5 = floatChannel2.data;
                fArr[i3 + i11] = fArr5[i4];
                fArr[i3 + i11 + 1] = fArr5[i4 + 1];
                fArr[i3 + i11 + 2] = fArr5[i4 + 2];
                fArr[i3 + i11 + 3] = fArr5[i4 + 3];
                i2++;
                i++;
                pointSpriteControllerRenderData = pointSpriteControllerRenderData2;
                it = arrayIterator;
            }
        }
        MeshPart meshPart = this.renderable.meshPart;
        int i12 = this.bufferedParticlesCount;
        meshPart.size = i12;
        meshPart.mesh.setVertices(this.vertices, 0, i12 * CPU_VERTEX_SIZE);
        this.renderable.meshPart.update();
    }

    public BlendingAttribute getBlendingAttribute() {
        return this.blendingAttribute;
    }

    @Override // com.badlogic.gdx.graphics.g3d.RenderableProvider
    public void getRenderables(Array<Renderable> array, Pool<Renderable> pool) {
        if (this.bufferedParticlesCount > 0) {
            array.add(pool.obtain().set(this.renderable));
        }
    }

    public Texture getTexture() {
        return (Texture) ((TextureAttribute) this.renderable.material.get(TextureAttribute.Diffuse)).textureDescription.texture;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch, com.badlogic.gdx.graphics.g3d.particles.ResourceData.Configurable
    public void load(AssetManager assetManager, ResourceData resourceData) {
        ResourceData.SaveData saveData = resourceData.getSaveData("pointSpriteBatch");
        if (saveData != null) {
            setTexture((Texture) assetManager.get(saveData.loadAsset()));
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch, com.badlogic.gdx.graphics.g3d.particles.ResourceData.Configurable
    public void save(AssetManager assetManager, ResourceData resourceData) {
        resourceData.createSaveData("pointSpriteBatch").saveAsset(assetManager.getAssetFileName(getTexture()), Texture.class);
    }

    public void setTexture(Texture texture) {
        ((TextureAttribute) this.renderable.material.get(TextureAttribute.Diffuse)).textureDescription.texture = texture;
    }

    public PointSpriteParticleBatch(int i) {
        this(i, new ParticleShader.Config(ParticleShader.ParticleType.Point));
    }

    public PointSpriteParticleBatch(int i, ParticleShader.Config config) {
        this(i, config, null, null);
    }

    public PointSpriteParticleBatch(int i, ParticleShader.Config config, BlendingAttribute blendingAttribute, DepthTestAttribute depthTestAttribute) {
        super(PointSpriteControllerRenderData.class);
        if (!pointSpritesEnabled) {
            enablePointSprites();
        }
        this.blendingAttribute = blendingAttribute;
        this.depthTestAttribute = depthTestAttribute;
        if (blendingAttribute == null) {
            this.blendingAttribute = new BlendingAttribute(1, GL20.GL_ONE_MINUS_SRC_ALPHA, 1.0f);
        }
        if (this.depthTestAttribute == null) {
            this.depthTestAttribute = new DepthTestAttribute(GL20.GL_LEQUAL, false);
        }
        allocRenderable();
        ensureCapacity(i);
        this.renderable.shader = new ParticleShader(this.renderable, config);
        this.renderable.shader.init();
    }
}
