package com.badlogic.gdx.graphics.g3d.shaders;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g3d.Attributes;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Renderable;
import com.badlogic.gdx.graphics.g3d.attributes.BlendingAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.FloatAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute;
import com.badlogic.gdx.graphics.g3d.utils.RenderContext;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.GdxRuntimeException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public class DepthShader extends DefaultShader {
    private static String defaultFragmentShader;
    private static String defaultVertexShader;
    private static final Attributes tmpAttributes = new Attributes();
    private final FloatAttribute alphaTestAttribute;
    public final int numBones;

    public DepthShader(Renderable renderable) {
        this(renderable, new Config());
    }

    private static final Attributes combineAttributes(Renderable renderable) {
        Attributes attributes = tmpAttributes;
        attributes.clear();
        Environment environment = renderable.environment;
        if (environment != null) {
            attributes.set(environment);
        }
        Material material = renderable.material;
        if (material != null) {
            attributes.set(material);
        }
        return attributes;
    }

    public static String createPrefix(Renderable renderable, Config config) {
        String strCreatePrefix = DefaultShader.createPrefix(renderable, config);
        return !config.depthBufferOnly ? DM.h(strCreatePrefix, "#define PackedDepthFlag\n") : strCreatePrefix;
    }

    public static final String getDefaultFragmentShader() {
        if (defaultFragmentShader == null) {
            defaultFragmentShader = Gdx.files.classpath("com/badlogic/gdx/graphics/g3d/shaders/depth.fragment.glsl").readString();
        }
        return defaultFragmentShader;
    }

    public static final String getDefaultVertexShader() {
        if (defaultVertexShader == null) {
            defaultVertexShader = Gdx.files.classpath("com/badlogic/gdx/graphics/g3d/shaders/depth.vertex.glsl").readString();
        }
        return defaultVertexShader;
    }

    @Override // com.badlogic.gdx.graphics.g3d.shaders.DefaultShader, com.badlogic.gdx.graphics.g3d.shaders.BaseShader, com.badlogic.gdx.graphics.g3d.Shader
    public void begin(Camera camera, RenderContext renderContext) {
        super.begin(camera, renderContext);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    @Override // com.badlogic.gdx.graphics.g3d.shaders.DefaultShader, com.badlogic.gdx.graphics.g3d.Shader
    public boolean canRender(Renderable renderable) {
        boolean z;
        Matrix4[] matrix4Arr = renderable.bones;
        if (matrix4Arr != null && (matrix4Arr.length > this.config.numBones || renderable.meshPart.mesh.getVertexAttributes().getBoneWeights() > this.config.numBoneWeights)) {
            return false;
        }
        Attributes attributesCombineAttributes = combineAttributes(renderable);
        long j = this.attributesMask;
        long j2 = BlendingAttribute.Type;
        if ((j & j2) == j2) {
            long j3 = TextureAttribute.Diffuse;
            if ((j & j3) == j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z != (attributesCombineAttributes.has(j2) && attributesCombineAttributes.has(TextureAttribute.Diffuse))) {
            return false;
        }
        return (renderable.bones != null) == (this.numBones > 0);
    }

    @Override // com.badlogic.gdx.graphics.g3d.shaders.DefaultShader, com.badlogic.gdx.graphics.g3d.shaders.BaseShader, com.badlogic.gdx.graphics.g3d.Shader
    public void end() {
        super.end();
    }

    @Override // com.badlogic.gdx.graphics.g3d.shaders.DefaultShader, com.badlogic.gdx.graphics.g3d.shaders.BaseShader
    public void render(Renderable renderable, Attributes attributes) {
        long j = BlendingAttribute.Type;
        if (!attributes.has(j)) {
            super.render(renderable, attributes);
            return;
        }
        BlendingAttribute blendingAttribute = (BlendingAttribute) attributes.get(j);
        attributes.remove(j);
        long j2 = FloatAttribute.AlphaTest;
        boolean zHas = attributes.has(j2);
        if (!zHas) {
            attributes.set(this.alphaTestAttribute);
        }
        if (blendingAttribute.opacity >= ((FloatAttribute) attributes.get(j2)).value) {
            super.render(renderable, attributes);
        }
        if (!zHas) {
            attributes.remove(j2);
        }
        attributes.set(blendingAttribute);
    }

    public DepthShader(Renderable renderable, Config config) {
        this(renderable, config, createPrefix(renderable, config));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DepthShader(Renderable renderable, Config config, String str) {
        String str2 = config.vertexShader;
        String defaultVertexShader2 = str2 == null ? getDefaultVertexShader() : str2;
        String str3 = config.fragmentShader;
        this(renderable, config, str, defaultVertexShader2, str3 == null ? getDefaultFragmentShader() : str3);
    }

    public static class Config extends DefaultShader.Config {
        public float defaultAlphaTest;
        public boolean depthBufferOnly;

        public Config() {
            this.depthBufferOnly = false;
            this.defaultAlphaTest = 0.5f;
            this.defaultCullFace = GL20.GL_FRONT;
        }

        public Config(String str, String str2) {
            super(str, str2);
            this.depthBufferOnly = false;
            this.defaultAlphaTest = 0.5f;
        }
    }

    public DepthShader(Renderable renderable, Config config, String str, String str2, String str3) {
        this(renderable, config, new ShaderProgram(DM.h(str, str2), DM.h(str, str3)));
    }

    public DepthShader(Renderable renderable, Config config, ShaderProgram shaderProgram) {
        super(renderable, config, shaderProgram);
        combineAttributes(renderable);
        Matrix4[] matrix4Arr = renderable.bones;
        if (matrix4Arr != null && matrix4Arr.length > config.numBones) {
            throw new GdxRuntimeException("too many bones: " + renderable.bones.length + ", max configured: " + config.numBones);
        }
        this.numBones = matrix4Arr == null ? 0 : config.numBones;
        int boneWeights = renderable.meshPart.mesh.getVertexAttributes().getBoneWeights();
        if (boneWeights <= config.numBoneWeights) {
            this.alphaTestAttribute = new FloatAttribute(FloatAttribute.AlphaTest, config.defaultAlphaTest);
        } else {
            StringBuilder sbQ = AbstractC5044xl.q("too many bone weights: ", boneWeights, ", max configured: ");
            sbQ.append(config.numBoneWeights);
            throw new GdxRuntimeException(sbQ.toString());
        }
    }
}
