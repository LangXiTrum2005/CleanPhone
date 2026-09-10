package com.badlogic.gdx.graphics.g3d.shaders;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.g3d.Attribute;
import com.badlogic.gdx.graphics.g3d.Attributes;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Renderable;
import com.badlogic.gdx.graphics.g3d.Shader;
import com.badlogic.gdx.graphics.g3d.attributes.BlendingAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.CubemapAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.DepthTestAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.DirectionalLightsAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.FloatAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.IntAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.PointLightsAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.SpotLightsAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute;
import com.badlogic.gdx.graphics.g3d.environment.AmbientCubemap;
import com.badlogic.gdx.graphics.g3d.environment.DirectionalLight;
import com.badlogic.gdx.graphics.g3d.environment.PointLight;
import com.badlogic.gdx.graphics.g3d.environment.ShadowMap;
import com.badlogic.gdx.graphics.g3d.environment.SpotLight;
import com.badlogic.gdx.graphics.g3d.utils.RenderContext;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.GdxRuntimeException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public class DefaultShader extends BaseShader {
    private static String defaultFragmentShader;
    private static String defaultVertexShader;
    protected final AmbientCubemap ambientCubemap;
    protected final long attributesMask;
    private int[] boneWeightsLocations;
    protected final Config config;
    protected int dirLightsColorOffset;
    protected int dirLightsDirectionOffset;
    protected int dirLightsLoc;
    protected int dirLightsSize;
    protected final DirectionalLight[] directionalLights;
    protected final boolean environmentCubemap;
    protected final boolean lighting;
    private boolean lightsSet;
    private final Matrix3 normalMatrix;
    protected final PointLight[] pointLights;
    protected int pointLightsColorOffset;
    protected int pointLightsIntensityOffset;
    protected int pointLightsLoc;
    protected int pointLightsPositionOffset;
    protected int pointLightsSize;
    private Renderable renderable;
    protected final boolean shadowMap;
    protected final SpotLight[] spotLights;
    protected int spotLightsColorOffset;
    protected int spotLightsCutoffAngleOffset;
    protected int spotLightsDirectionOffset;
    protected int spotLightsExponentOffset;
    protected int spotLightsIntensityOffset;
    protected int spotLightsLoc;
    protected int spotLightsPositionOffset;
    protected int spotLightsSize;
    private final int textureCoordinates;
    private float time;
    private final Vector3 tmpV1;
    public final int u_alphaTest;
    protected final int u_ambientCubemap;
    public final int u_ambientTexture;
    public final int u_ambientUVTransform;
    public final int u_bones;
    public final int u_cameraDirection;
    public final int u_cameraNearFar;
    public final int u_cameraPosition;
    public final int u_cameraUp;
    public final int u_diffuseColor;
    public final int u_diffuseTexture;
    public final int u_diffuseUVTransform;
    protected final int u_dirLights0color;
    protected final int u_dirLights0direction;
    protected final int u_dirLights1color;
    public final int u_emissiveColor;
    public final int u_emissiveTexture;
    public final int u_emissiveUVTransform;
    protected final int u_environmentCubemap;
    protected final int u_fogColor;
    public final int u_normalMatrix;
    public final int u_normalTexture;
    public final int u_normalUVTransform;
    public final int u_opacity;
    protected final int u_pointLights0color;
    protected final int u_pointLights0intensity;
    protected final int u_pointLights0position;
    protected final int u_pointLights1color;
    public final int u_projTrans;
    public final int u_projViewTrans;
    public final int u_projViewWorldTrans;
    public final int u_reflectionColor;
    public final int u_reflectionTexture;
    public final int u_reflectionUVTransform;
    protected final int u_shadowMapProjViewTrans;
    protected final int u_shadowPCFOffset;
    protected final int u_shadowTexture;
    public final int u_shininess;
    public final int u_specularColor;
    public final int u_specularTexture;
    public final int u_specularUVTransform;
    protected final int u_spotLights0color;
    protected final int u_spotLights0cutoffAngle;
    protected final int u_spotLights0direction;
    protected final int u_spotLights0exponent;
    protected final int u_spotLights0intensity;
    protected final int u_spotLights0position;
    protected final int u_spotLights1color;
    public final int u_time;
    public final int u_viewTrans;
    public final int u_viewWorldTrans;
    public final int u_worldTrans;
    private final long vertexMask;
    protected static long implementedFlags = (((BlendingAttribute.Type | TextureAttribute.Diffuse) | ColorAttribute.Diffuse) | ColorAttribute.Specular) | FloatAttribute.Shininess;

    @Deprecated
    public static int defaultCullFace = GL20.GL_BACK;

    @Deprecated
    public static int defaultDepthFunc = GL20.GL_LEQUAL;
    private static final long optionalAttributes = IntAttribute.CullFace | DepthTestAttribute.Type;
    private static final Attributes tmpAttributes = new Attributes();

    public static class Inputs {
        public static final BaseShader.Uniform alphaTest;
        public static final BaseShader.Uniform ambientCube;
        public static final BaseShader.Uniform ambientTexture;
        public static final BaseShader.Uniform ambientUVTransform;
        public static final BaseShader.Uniform diffuseTexture;
        public static final BaseShader.Uniform diffuseUVTransform;
        public static final BaseShader.Uniform dirLights;
        public static final BaseShader.Uniform emissiveColor;
        public static final BaseShader.Uniform emissiveTexture;
        public static final BaseShader.Uniform emissiveUVTransform;
        public static final BaseShader.Uniform environmentCubemap;
        public static final BaseShader.Uniform normalTexture;
        public static final BaseShader.Uniform normalUVTransform;
        public static final BaseShader.Uniform pointLights;
        public static final BaseShader.Uniform reflectionColor;
        public static final BaseShader.Uniform reflectionTexture;
        public static final BaseShader.Uniform reflectionUVTransform;
        public static final BaseShader.Uniform specularColor;
        public static final BaseShader.Uniform specularTexture;
        public static final BaseShader.Uniform specularUVTransform;
        public static final BaseShader.Uniform spotLights;
        public static final BaseShader.Uniform projTrans = new BaseShader.Uniform("u_projTrans");
        public static final BaseShader.Uniform viewTrans = new BaseShader.Uniform("u_viewTrans");
        public static final BaseShader.Uniform projViewTrans = new BaseShader.Uniform("u_projViewTrans");
        public static final BaseShader.Uniform cameraPosition = new BaseShader.Uniform("u_cameraPosition");
        public static final BaseShader.Uniform cameraDirection = new BaseShader.Uniform("u_cameraDirection");
        public static final BaseShader.Uniform cameraUp = new BaseShader.Uniform("u_cameraUp");
        public static final BaseShader.Uniform cameraNearFar = new BaseShader.Uniform("u_cameraNearFar");
        public static final BaseShader.Uniform worldTrans = new BaseShader.Uniform("u_worldTrans");
        public static final BaseShader.Uniform viewWorldTrans = new BaseShader.Uniform("u_viewWorldTrans");
        public static final BaseShader.Uniform projViewWorldTrans = new BaseShader.Uniform("u_projViewWorldTrans");
        public static final BaseShader.Uniform normalMatrix = new BaseShader.Uniform("u_normalMatrix");
        public static final BaseShader.Uniform bones = new BaseShader.Uniform("u_bones");
        public static final BaseShader.Uniform shininess = new BaseShader.Uniform("u_shininess", FloatAttribute.Shininess);
        public static final BaseShader.Uniform opacity = new BaseShader.Uniform("u_opacity", BlendingAttribute.Type);
        public static final BaseShader.Uniform diffuseColor = new BaseShader.Uniform("u_diffuseColor", ColorAttribute.Diffuse);

        static {
            long j = TextureAttribute.Diffuse;
            diffuseTexture = new BaseShader.Uniform("u_diffuseTexture", j);
            diffuseUVTransform = new BaseShader.Uniform("u_diffuseUVTransform", j);
            specularColor = new BaseShader.Uniform("u_specularColor", ColorAttribute.Specular);
            long j2 = TextureAttribute.Specular;
            specularTexture = new BaseShader.Uniform("u_specularTexture", j2);
            specularUVTransform = new BaseShader.Uniform("u_specularUVTransform", j2);
            emissiveColor = new BaseShader.Uniform("u_emissiveColor", ColorAttribute.Emissive);
            long j3 = TextureAttribute.Emissive;
            emissiveTexture = new BaseShader.Uniform("u_emissiveTexture", j3);
            emissiveUVTransform = new BaseShader.Uniform("u_emissiveUVTransform", j3);
            reflectionColor = new BaseShader.Uniform("u_reflectionColor", ColorAttribute.Reflection);
            long j4 = TextureAttribute.Reflection;
            reflectionTexture = new BaseShader.Uniform("u_reflectionTexture", j4);
            reflectionUVTransform = new BaseShader.Uniform("u_reflectionUVTransform", j4);
            long j5 = TextureAttribute.Normal;
            normalTexture = new BaseShader.Uniform("u_normalTexture", j5);
            normalUVTransform = new BaseShader.Uniform("u_normalUVTransform", j5);
            long j6 = TextureAttribute.Ambient;
            ambientTexture = new BaseShader.Uniform("u_ambientTexture", j6);
            ambientUVTransform = new BaseShader.Uniform("u_ambientUVTransform", j6);
            alphaTest = new BaseShader.Uniform("u_alphaTest");
            ambientCube = new BaseShader.Uniform("u_ambientCubemap");
            dirLights = new BaseShader.Uniform("u_dirLights");
            pointLights = new BaseShader.Uniform("u_pointLights");
            spotLights = new BaseShader.Uniform("u_spotLights");
            environmentCubemap = new BaseShader.Uniform("u_environmentCubemap");
        }
    }

    public static class Setters {
        public static final BaseShader.Setter projTrans = new BaseShader.GlobalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.1
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, baseShader.camera.projection);
            }
        };
        public static final BaseShader.Setter viewTrans = new BaseShader.GlobalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.2
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, baseShader.camera.view);
            }
        };
        public static final BaseShader.Setter projViewTrans = new BaseShader.GlobalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.3
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, baseShader.camera.combined);
            }
        };
        public static final BaseShader.Setter cameraPosition = new BaseShader.GlobalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.4
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                Camera camera = baseShader.camera;
                Vector3 vector3 = camera.position;
                float f = vector3.x;
                float f2 = vector3.y;
                float f3 = vector3.z;
                float f4 = camera.far;
                baseShader.set(i, f, f2, f3, 1.1881f / (f4 * f4));
            }
        };
        public static final BaseShader.Setter cameraDirection = new BaseShader.GlobalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.5
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, baseShader.camera.direction);
            }
        };
        public static final BaseShader.Setter cameraUp = new BaseShader.GlobalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.6
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, baseShader.camera.up);
            }
        };
        public static final BaseShader.Setter cameraNearFar = new BaseShader.GlobalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.7
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                Camera camera = baseShader.camera;
                baseShader.set(i, camera.near, camera.far);
            }
        };
        public static final BaseShader.Setter worldTrans = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.8
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, renderable.worldTransform);
            }
        };
        public static final BaseShader.Setter viewWorldTrans = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.9
            final Matrix4 temp = new Matrix4();

            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, this.temp.set(baseShader.camera.view).mul(renderable.worldTransform));
            }
        };
        public static final BaseShader.Setter projViewWorldTrans = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.10
            final Matrix4 temp = new Matrix4();

            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, this.temp.set(baseShader.camera.combined).mul(renderable.worldTransform));
            }
        };
        public static final BaseShader.Setter normalMatrix = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.11
            private final Matrix3 tmpM = new Matrix3();

            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, this.tmpM.set(renderable.worldTransform).inv().transpose());
            }
        };
        public static final BaseShader.Setter shininess = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.12
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, ((FloatAttribute) attributes.get(FloatAttribute.Shininess)).value);
            }
        };
        public static final BaseShader.Setter diffuseColor = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.13
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, ((ColorAttribute) attributes.get(ColorAttribute.Diffuse)).color);
            }
        };
        public static final BaseShader.Setter diffuseTexture = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.14
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, baseShader.context.textureBinder.bind(((TextureAttribute) attributes.get(TextureAttribute.Diffuse)).textureDescription));
            }
        };
        public static final BaseShader.Setter diffuseUVTransform = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.15
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                TextureAttribute textureAttribute = (TextureAttribute) attributes.get(TextureAttribute.Diffuse);
                baseShader.set(i, textureAttribute.offsetU, textureAttribute.offsetV, textureAttribute.scaleU, textureAttribute.scaleV);
            }
        };
        public static final BaseShader.Setter specularColor = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.16
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, ((ColorAttribute) attributes.get(ColorAttribute.Specular)).color);
            }
        };
        public static final BaseShader.Setter specularTexture = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.17
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, baseShader.context.textureBinder.bind(((TextureAttribute) attributes.get(TextureAttribute.Specular)).textureDescription));
            }
        };
        public static final BaseShader.Setter specularUVTransform = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.18
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                TextureAttribute textureAttribute = (TextureAttribute) attributes.get(TextureAttribute.Specular);
                baseShader.set(i, textureAttribute.offsetU, textureAttribute.offsetV, textureAttribute.scaleU, textureAttribute.scaleV);
            }
        };
        public static final BaseShader.Setter emissiveColor = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.19
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, ((ColorAttribute) attributes.get(ColorAttribute.Emissive)).color);
            }
        };
        public static final BaseShader.Setter emissiveTexture = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.20
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, baseShader.context.textureBinder.bind(((TextureAttribute) attributes.get(TextureAttribute.Emissive)).textureDescription));
            }
        };
        public static final BaseShader.Setter emissiveUVTransform = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.21
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                TextureAttribute textureAttribute = (TextureAttribute) attributes.get(TextureAttribute.Emissive);
                baseShader.set(i, textureAttribute.offsetU, textureAttribute.offsetV, textureAttribute.scaleU, textureAttribute.scaleV);
            }
        };
        public static final BaseShader.Setter reflectionColor = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.22
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, ((ColorAttribute) attributes.get(ColorAttribute.Reflection)).color);
            }
        };
        public static final BaseShader.Setter reflectionTexture = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.23
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, baseShader.context.textureBinder.bind(((TextureAttribute) attributes.get(TextureAttribute.Reflection)).textureDescription));
            }
        };
        public static final BaseShader.Setter reflectionUVTransform = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.24
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                TextureAttribute textureAttribute = (TextureAttribute) attributes.get(TextureAttribute.Reflection);
                baseShader.set(i, textureAttribute.offsetU, textureAttribute.offsetV, textureAttribute.scaleU, textureAttribute.scaleV);
            }
        };
        public static final BaseShader.Setter normalTexture = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.25
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, baseShader.context.textureBinder.bind(((TextureAttribute) attributes.get(TextureAttribute.Normal)).textureDescription));
            }
        };
        public static final BaseShader.Setter normalUVTransform = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.26
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                TextureAttribute textureAttribute = (TextureAttribute) attributes.get(TextureAttribute.Normal);
                baseShader.set(i, textureAttribute.offsetU, textureAttribute.offsetV, textureAttribute.scaleU, textureAttribute.scaleV);
            }
        };
        public static final BaseShader.Setter ambientTexture = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.27
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                baseShader.set(i, baseShader.context.textureBinder.bind(((TextureAttribute) attributes.get(TextureAttribute.Ambient)).textureDescription));
            }
        };
        public static final BaseShader.Setter ambientUVTransform = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.28
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                TextureAttribute textureAttribute = (TextureAttribute) attributes.get(TextureAttribute.Ambient);
                baseShader.set(i, textureAttribute.offsetU, textureAttribute.offsetV, textureAttribute.scaleU, textureAttribute.scaleV);
            }
        };
        public static final BaseShader.Setter environmentCubemap = new BaseShader.LocalSetter() { // from class: com.badlogic.gdx.graphics.g3d.shaders.DefaultShader.Setters.29
            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                long j = CubemapAttribute.EnvironmentMap;
                if (attributes.has(j)) {
                    baseShader.set(i, baseShader.context.textureBinder.bind(((CubemapAttribute) attributes.get(j)).textureDescription));
                }
            }
        };

        public static class ACubemap extends BaseShader.LocalSetter {
            private static final float[] ones = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
            private static final Vector3 tmpV1 = new Vector3();
            private final AmbientCubemap cacheAmbientCubemap = new AmbientCubemap();
            public final int dirLightsOffset;
            public final int pointLightsOffset;

            public ACubemap(int i, int i2) {
                this.dirLightsOffset = i;
                this.pointLightsOffset = i2;
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                if (renderable.environment == null) {
                    ShaderProgram shaderProgram = baseShader.program;
                    int iLoc = baseShader.loc(i);
                    float[] fArr = ones;
                    shaderProgram.setUniform3fv(iLoc, fArr, 0, fArr.length);
                    return;
                }
                renderable.worldTransform.getTranslation(tmpV1);
                long j = ColorAttribute.AmbientLight;
                if (attributes.has(j)) {
                    this.cacheAmbientCubemap.set(((ColorAttribute) attributes.get(j)).color);
                }
                long j2 = DirectionalLightsAttribute.Type;
                if (attributes.has(j2)) {
                    Array<DirectionalLight> array = ((DirectionalLightsAttribute) attributes.get(j2)).lights;
                    for (int i2 = this.dirLightsOffset; i2 < array.size; i2++) {
                        this.cacheAmbientCubemap.add(array.get(i2).color, array.get(i2).direction);
                    }
                }
                long j3 = PointLightsAttribute.Type;
                if (attributes.has(j3)) {
                    Array<PointLight> array2 = ((PointLightsAttribute) attributes.get(j3)).lights;
                    for (int i3 = this.pointLightsOffset; i3 < array2.size; i3++) {
                        this.cacheAmbientCubemap.add(array2.get(i3).color, array2.get(i3).position, tmpV1, array2.get(i3).intensity);
                    }
                }
                this.cacheAmbientCubemap.clamp();
                ShaderProgram shaderProgram2 = baseShader.program;
                int iLoc2 = baseShader.loc(i);
                float[] fArr2 = this.cacheAmbientCubemap.data;
                shaderProgram2.setUniform3fv(iLoc2, fArr2, 0, fArr2.length);
            }
        }

        public static class Bones extends BaseShader.LocalSetter {
            private static final Matrix4 idtMatrix = new Matrix4();
            public final float[] bones;

            public Bones(int i) {
                this.bones = new float[i * 16];
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
            public void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes) {
                Matrix4 matrix4;
                int i2 = 0;
                while (true) {
                    float[] fArr = this.bones;
                    if (i2 >= fArr.length) {
                        ShaderProgram shaderProgram = baseShader.program;
                        int iLoc = baseShader.loc(i);
                        float[] fArr2 = this.bones;
                        shaderProgram.setUniformMatrix4fv(iLoc, fArr2, 0, fArr2.length);
                        return;
                    }
                    int i3 = i2 / 16;
                    Matrix4[] matrix4Arr = renderable.bones;
                    if (matrix4Arr == null || i3 >= matrix4Arr.length || (matrix4 = matrix4Arr[i3]) == null) {
                        System.arraycopy(idtMatrix.val, 0, fArr, i2, 16);
                    } else {
                        System.arraycopy(matrix4.val, 0, fArr, i2, 16);
                    }
                    i2 += 16;
                }
            }
        }
    }

    public DefaultShader(Renderable renderable) {
        this(renderable, new Config());
    }

    private static final boolean and(long j, long j2) {
        return (j & j2) == j2;
    }

    private static final long combineAttributeMasks(Renderable renderable) {
        Environment environment = renderable.environment;
        long mask = environment != null ? environment.getMask() : 0L;
        Material material = renderable.material;
        return material != null ? mask | material.getMask() : mask;
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
        Attributes attributesCombineAttributes = combineAttributes(renderable);
        long mask = attributesCombineAttributes.getMask();
        long mask2 = renderable.meshPart.mesh.getVertexAttributes().getMask();
        String strH = and(mask2, 1L) ? "#define positionFlag\n" : "";
        if (or(mask2, 6L)) {
            strH = DM.h(strH, "#define colorFlag\n");
        }
        if (and(mask2, 256L)) {
            strH = DM.h(strH, "#define binormalFlag\n");
        }
        if (and(mask2, 128L)) {
            strH = DM.h(strH, "#define tangentFlag\n");
        }
        if (and(mask2, 8L)) {
            strH = DM.h(strH, "#define normalFlag\n");
        }
        if ((and(mask2, 8L) || and(mask2, 384L)) && renderable.environment != null) {
            String strO = AbstractC5044xl.o(DM.q(AbstractC5044xl.o(DM.q(AbstractC5044xl.o(DM.q(DM.h(DM.h(strH, "#define lightingFlag\n"), "#define ambientCubemapFlag\n"), "#define numDirectionalLights "), config.numDirectionalLights, "\n"), "#define numPointLights "), config.numPointLights, "\n"), "#define numSpotLights "), config.numSpotLights, "\n");
            if (attributesCombineAttributes.has(ColorAttribute.Fog)) {
                strO = DM.h(strO, "#define fogFlag\n");
            }
            if (renderable.environment.shadowMap != null) {
                strO = DM.h(strO, "#define shadowMapFlag\n");
            }
            strH = strO;
            if (attributesCombineAttributes.has(CubemapAttribute.EnvironmentMap)) {
                strH = DM.h(strH, "#define environmentCubemapFlag\n");
            }
        }
        int size = renderable.meshPart.mesh.getVertexAttributes().size();
        for (int i = 0; i < size; i++) {
            VertexAttribute vertexAttribute = renderable.meshPart.mesh.getVertexAttributes().get(i);
            if (vertexAttribute.usage == 16) {
                strH = AbstractC5044xl.o(DM.q(strH, "#define texCoord"), vertexAttribute.unit, "Flag\n");
            }
        }
        if (renderable.bones != null) {
            for (int i2 = 0; i2 < config.numBoneWeights; i2++) {
                strH = strH + "#define boneWeight" + i2 + "Flag\n";
            }
        }
        long j = BlendingAttribute.Type;
        if ((mask & j) == j) {
            strH = DM.h(strH, "#define blendedFlag\n");
        }
        long j2 = TextureAttribute.Diffuse;
        if ((mask & j2) == j2) {
            strH = DM.h(DM.h(strH, "#define diffuseTextureFlag\n"), "#define diffuseTextureCoord texCoord0\n");
        }
        long j3 = TextureAttribute.Specular;
        if ((mask & j3) == j3) {
            strH = DM.h(DM.h(strH, "#define specularTextureFlag\n"), "#define specularTextureCoord texCoord0\n");
        }
        long j4 = TextureAttribute.Normal;
        if ((mask & j4) == j4) {
            strH = DM.h(DM.h(strH, "#define normalTextureFlag\n"), "#define normalTextureCoord texCoord0\n");
        }
        long j5 = TextureAttribute.Emissive;
        if ((mask & j5) == j5) {
            strH = DM.h(DM.h(strH, "#define emissiveTextureFlag\n"), "#define emissiveTextureCoord texCoord0\n");
        }
        long j6 = TextureAttribute.Reflection;
        if ((mask & j6) == j6) {
            strH = DM.h(DM.h(strH, "#define reflectionTextureFlag\n"), "#define reflectionTextureCoord texCoord0\n");
        }
        long j7 = TextureAttribute.Ambient;
        if ((mask & j7) == j7) {
            strH = DM.h(DM.h(strH, "#define ambientTextureFlag\n"), "#define ambientTextureCoord texCoord0\n");
        }
        long j8 = ColorAttribute.Diffuse;
        if ((mask & j8) == j8) {
            strH = DM.h(strH, "#define diffuseColorFlag\n");
        }
        long j9 = ColorAttribute.Specular;
        if ((mask & j9) == j9) {
            strH = DM.h(strH, "#define specularColorFlag\n");
        }
        long j10 = ColorAttribute.Emissive;
        if ((mask & j10) == j10) {
            strH = DM.h(strH, "#define emissiveColorFlag\n");
        }
        long j11 = ColorAttribute.Reflection;
        if ((mask & j11) == j11) {
            strH = DM.h(strH, "#define reflectionColorFlag\n");
        }
        long j12 = FloatAttribute.Shininess;
        if ((mask & j12) == j12) {
            strH = DM.h(strH, "#define shininessFlag\n");
        }
        long j13 = FloatAttribute.AlphaTest;
        if ((mask & j13) == j13) {
            strH = DM.h(strH, "#define alphaTestFlag\n");
        }
        return (renderable.bones == null || config.numBones <= 0) ? strH : AbstractC5044xl.o(DM.q(strH, "#define numBones "), config.numBones, "\n");
    }

    public static String getDefaultFragmentShader() {
        if (defaultFragmentShader == null) {
            defaultFragmentShader = Gdx.files.classpath("com/badlogic/gdx/graphics/g3d/shaders/default.fragment.glsl").readString();
        }
        return defaultFragmentShader;
    }

    public static String getDefaultVertexShader() {
        if (defaultVertexShader == null) {
            defaultVertexShader = Gdx.files.classpath("com/badlogic/gdx/graphics/g3d/shaders/default.vertex.glsl").readString();
        }
        return defaultVertexShader;
    }

    private static final boolean or(long j, long j2) {
        return (j & j2) != 0;
    }

    @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader, com.badlogic.gdx.graphics.g3d.Shader
    public void begin(Camera camera, RenderContext renderContext) {
        super.begin(camera, renderContext);
        for (DirectionalLight directionalLight : this.directionalLights) {
            directionalLight.set(0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        }
        for (PointLight pointLight : this.pointLights) {
            pointLight.set(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        }
        for (SpotLight spotLight : this.spotLights) {
            spotLight.set(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        }
        this.lightsSet = false;
        if (has(this.u_time)) {
            int i = this.u_time;
            float deltaTime = Gdx.graphics.getDeltaTime() + this.time;
            this.time = deltaTime;
            set(i, deltaTime);
        }
        int[] iArr = this.boneWeightsLocations;
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 >= 0) {
                    Gdx.gl.glVertexAttrib2f(i2, 0.0f, 0.0f);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00c2 A[EDGE_INSN: B:107:0x00c2->B:43:0x00c2 BREAK  A[LOOP:0: B:17:0x003b->B:42:0x00be], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0155 A[EDGE_INSN: B:112:0x0155->B:71:0x0155 BREAK  A[LOOP:1: B:46:0x00c7->B:70:0x0151], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x020c A[EDGE_INSN: B:118:0x020c->B:98:0x020c BREAK  A[LOOP:2: B:73:0x0159->B:97:0x0208], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f7  */
    public void bindLights(Renderable renderable, Attributes attributes) {
        ShadowMap shadowMap;
        int i;
        int i2;
        int i3;
        int i4;
        Environment environment = renderable.environment;
        DirectionalLightsAttribute directionalLightsAttribute = (DirectionalLightsAttribute) attributes.get(DirectionalLightsAttribute.class, DirectionalLightsAttribute.Type);
        Array<DirectionalLight> array = directionalLightsAttribute == null ? null : directionalLightsAttribute.lights;
        PointLightsAttribute pointLightsAttribute = (PointLightsAttribute) attributes.get(PointLightsAttribute.class, PointLightsAttribute.Type);
        Array<PointLight> array2 = pointLightsAttribute == null ? null : pointLightsAttribute.lights;
        SpotLightsAttribute spotLightsAttribute = (SpotLightsAttribute) attributes.get(SpotLightsAttribute.class, SpotLightsAttribute.Type);
        Array<SpotLight> array3 = spotLightsAttribute != null ? spotLightsAttribute.lights : null;
        int i5 = 0;
        if (this.dirLightsLoc >= 0) {
            int i6 = 0;
            while (true) {
                DirectionalLight[] directionalLightArr = this.directionalLights;
                if (i6 >= directionalLightArr.length) {
                    break;
                }
                if (array == null || i6 >= array.size) {
                    if (this.lightsSet) {
                        Color color = directionalLightArr[i6].color;
                        if (color.r != 0.0f || color.g != 0.0f || color.b != 0.0f) {
                        }
                    }
                    directionalLightArr[i6].color.set(0.0f, 0.0f, 0.0f, 1.0f);
                    int i7 = (this.dirLightsSize * i6) + this.dirLightsLoc;
                    ShaderProgram shaderProgram = this.program;
                    int i8 = this.dirLightsColorOffset + i7;
                    Color color2 = this.directionalLights[i6].color;
                    shaderProgram.setUniformf(i8, color2.r, color2.g, color2.b);
                    ShaderProgram shaderProgram2 = this.program;
                    int i9 = i7 + this.dirLightsDirectionOffset;
                    Vector3 vector3 = this.directionalLights[i6].direction;
                    shaderProgram2.setUniformf(i9, vector3.x, vector3.y, vector3.z);
                    if (this.dirLightsSize <= 0) {
                        break;
                    }
                } else if (!this.lightsSet || !directionalLightArr[i6].equals(array.get(i6))) {
                    this.directionalLights[i6].set(array.get(i6));
                    int i10 = (this.dirLightsSize * i6) + this.dirLightsLoc;
                    ShaderProgram shaderProgram3 = this.program;
                    int i11 = this.dirLightsColorOffset + i10;
                    Color color3 = this.directionalLights[i6].color;
                    shaderProgram3.setUniformf(i11, color3.r, color3.g, color3.b);
                    ShaderProgram shaderProgram4 = this.program;
                    int i12 = i10 + this.dirLightsDirectionOffset;
                    Vector3 vector4 = this.directionalLights[i6].direction;
                    shaderProgram4.setUniformf(i12, vector4.x, vector4.y, vector4.z);
                    if (this.dirLightsSize <= 0) {
                        break;
                        break;
                    }
                }
                i6++;
            }
        }
        if (this.pointLightsLoc >= 0) {
            int i13 = 0;
            while (true) {
                PointLight[] pointLightArr = this.pointLights;
                if (i13 >= pointLightArr.length) {
                    break;
                }
                if (array2 == null || i13 >= array2.size) {
                    if (!this.lightsSet || pointLightArr[i13].intensity != 0.0f) {
                        pointLightArr[i13].intensity = 0.0f;
                        i3 = (this.pointLightsSize * i13) + this.pointLightsLoc;
                        ShaderProgram shaderProgram5 = this.program;
                        int i14 = this.pointLightsColorOffset + i3;
                        PointLight pointLight = this.pointLights[i13];
                        Color color4 = pointLight.color;
                        float f = color4.r;
                        float f2 = pointLight.intensity;
                        shaderProgram5.setUniformf(i14, f * f2, color4.g * f2, color4.b * f2);
                        ShaderProgram shaderProgram6 = this.program;
                        int i15 = this.pointLightsPositionOffset + i3;
                        Vector3 vector5 = this.pointLights[i13].position;
                        shaderProgram6.setUniformf(i15, vector5.x, vector5.y, vector5.z);
                        i4 = this.pointLightsIntensityOffset;
                        if (i4 >= 0) {
                            this.program.setUniformf(i3 + i4, this.pointLights[i13].intensity);
                        }
                        if (this.pointLightsSize <= 0) {
                            break;
                        }
                    }
                } else if (!this.lightsSet || !pointLightArr[i13].equals(array2.get(i13))) {
                    this.pointLights[i13].set(array2.get(i13));
                    i3 = (this.pointLightsSize * i13) + this.pointLightsLoc;
                    ShaderProgram shaderProgram7 = this.program;
                    int i16 = this.pointLightsColorOffset + i3;
                    PointLight pointLight2 = this.pointLights[i13];
                    Color color5 = pointLight2.color;
                    float f3 = color5.r;
                    float f4 = pointLight2.intensity;
                    shaderProgram7.setUniformf(i16, f3 * f4, color5.g * f4, color5.b * f4);
                    ShaderProgram shaderProgram8 = this.program;
                    int i17 = this.pointLightsPositionOffset + i3;
                    Vector3 vector6 = this.pointLights[i13].position;
                    shaderProgram8.setUniformf(i17, vector6.x, vector6.y, vector6.z);
                    i4 = this.pointLightsIntensityOffset;
                    if (i4 >= 0) {
                        this.program.setUniformf(i3 + i4, this.pointLights[i13].intensity);
                    }
                    if (this.pointLightsSize <= 0) {
                        break;
                        break;
                    }
                }
                i13++;
            }
        }
        if (this.spotLightsLoc >= 0) {
            while (true) {
                SpotLight[] spotLightArr = this.spotLights;
                if (i5 >= spotLightArr.length) {
                    break;
                }
                if (array3 == null || i5 >= array3.size) {
                    if (!this.lightsSet || spotLightArr[i5].intensity != 0.0f) {
                        spotLightArr[i5].intensity = 0.0f;
                        i = (this.spotLightsSize * i5) + this.spotLightsLoc;
                        ShaderProgram shaderProgram9 = this.program;
                        int i18 = this.spotLightsColorOffset + i;
                        SpotLight spotLight = this.spotLights[i5];
                        Color color6 = spotLight.color;
                        float f5 = color6.r;
                        float f6 = spotLight.intensity;
                        shaderProgram9.setUniformf(i18, f5 * f6, color6.g * f6, color6.b * f6);
                        this.program.setUniformf(this.spotLightsPositionOffset + i, this.spotLights[i5].position);
                        this.program.setUniformf(this.spotLightsDirectionOffset + i, this.spotLights[i5].direction);
                        this.program.setUniformf(this.spotLightsCutoffAngleOffset + i, this.spotLights[i5].cutoffAngle);
                        this.program.setUniformf(this.spotLightsExponentOffset + i, this.spotLights[i5].exponent);
                        i2 = this.spotLightsIntensityOffset;
                        if (i2 >= 0) {
                            this.program.setUniformf(i + i2, this.spotLights[i5].intensity);
                        }
                        if (this.spotLightsSize <= 0) {
                            break;
                        }
                    }
                } else if (!this.lightsSet || !spotLightArr[i5].equals(array3.get(i5))) {
                    this.spotLights[i5].set(array3.get(i5));
                    i = (this.spotLightsSize * i5) + this.spotLightsLoc;
                    ShaderProgram shaderProgram10 = this.program;
                    int i19 = this.spotLightsColorOffset + i;
                    SpotLight spotLight2 = this.spotLights[i5];
                    Color color7 = spotLight2.color;
                    float f7 = color7.r;
                    float f8 = spotLight2.intensity;
                    shaderProgram10.setUniformf(i19, f7 * f8, color7.g * f8, color7.b * f8);
                    this.program.setUniformf(this.spotLightsPositionOffset + i, this.spotLights[i5].position);
                    this.program.setUniformf(this.spotLightsDirectionOffset + i, this.spotLights[i5].direction);
                    this.program.setUniformf(this.spotLightsCutoffAngleOffset + i, this.spotLights[i5].cutoffAngle);
                    this.program.setUniformf(this.spotLightsExponentOffset + i, this.spotLights[i5].exponent);
                    i2 = this.spotLightsIntensityOffset;
                    if (i2 >= 0) {
                        this.program.setUniformf(i + i2, this.spotLights[i5].intensity);
                    }
                    if (this.spotLightsSize <= 0) {
                        break;
                        break;
                    }
                }
                i5++;
            }
        }
        long j = ColorAttribute.Fog;
        if (attributes.has(j)) {
            set(this.u_fogColor, ((ColorAttribute) attributes.get(j)).color);
        }
        if (environment != null && (shadowMap = environment.shadowMap) != null) {
            set(this.u_shadowMapProjViewTrans, shadowMap.getProjViewTrans());
            set(this.u_shadowTexture, environment.shadowMap.getDepthMap());
            set(this.u_shadowPCFOffset, 1.0f / (environment.shadowMap.getDepthMap().texture.getWidth() * 2.0f));
        }
        this.lightsSet = true;
    }

    public void bindMaterial(Attributes attributes) {
        Config config = this.config;
        int i = config.defaultCullFace;
        if (i == -1) {
            i = defaultCullFace;
        }
        int i2 = config.defaultDepthFunc;
        if (i2 == -1) {
            i2 = defaultDepthFunc;
        }
        float f = 0.0f;
        float f2 = 1.0f;
        boolean z = true;
        for (Attribute attribute : attributes) {
            long j = attribute.type;
            if (BlendingAttribute.is(j)) {
                BlendingAttribute blendingAttribute = (BlendingAttribute) attribute;
                this.context.setBlending(true, blendingAttribute.sourceFunction, blendingAttribute.destFunction);
                set(this.u_opacity, blendingAttribute.opacity);
            } else {
                long j2 = IntAttribute.CullFace;
                if ((j & j2) == j2) {
                    i = ((IntAttribute) attribute).value;
                } else {
                    long j3 = FloatAttribute.AlphaTest;
                    if ((j & j3) == j3) {
                        set(this.u_alphaTest, ((FloatAttribute) attribute).value);
                    } else {
                        long j4 = DepthTestAttribute.Type;
                        if ((j & j4) == j4) {
                            DepthTestAttribute depthTestAttribute = (DepthTestAttribute) attribute;
                            i2 = depthTestAttribute.depthFunc;
                            f = depthTestAttribute.depthRangeNear;
                            f2 = depthTestAttribute.depthRangeFar;
                            z = depthTestAttribute.depthMask;
                        } else if (!this.config.ignoreUnimplemented) {
                            throw new GdxRuntimeException("Unknown material attribute: " + attribute.toString());
                        }
                    }
                }
            }
        }
        this.context.setCullFace(i);
        this.context.setDepthTest(i2, f, f2);
        this.context.setDepthMask(z);
    }

    @Override // com.badlogic.gdx.graphics.g3d.Shader
    public boolean canRender(Renderable renderable) {
        Matrix4[] matrix4Arr = renderable.bones;
        if ((matrix4Arr != null && (matrix4Arr.length > this.config.numBones || renderable.meshPart.mesh.getVertexAttributes().getBoneWeights() > this.config.numBoneWeights)) || renderable.meshPart.mesh.getVertexAttributes().getTextureCoordinates() != this.textureCoordinates) {
            return false;
        }
        if (this.attributesMask == (combineAttributeMasks(renderable) | optionalAttributes) && this.vertexMask == renderable.meshPart.mesh.getVertexAttributes().getMaskWithSizePacked()) {
            return (renderable.environment != null) == this.lighting;
        }
        return false;
    }

    @Override // com.badlogic.gdx.graphics.g3d.Shader
    public int compareTo(Shader shader) {
        return shader == null ? -1 : 0;
    }

    @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader, com.badlogic.gdx.utils.Disposable
    public void dispose() {
        this.program.dispose();
        super.dispose();
    }

    @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader, com.badlogic.gdx.graphics.g3d.Shader
    public void end() {
        super.end();
    }

    public boolean equals(DefaultShader defaultShader) {
        return defaultShader == this;
    }

    public int getDefaultCullFace() {
        int i = this.config.defaultCullFace;
        return i == -1 ? defaultCullFace : i;
    }

    public int getDefaultDepthFunc() {
        int i = this.config.defaultDepthFunc;
        return i == -1 ? defaultDepthFunc : i;
    }

    @Override // com.badlogic.gdx.graphics.g3d.Shader
    public void init() {
        ShaderProgram shaderProgram = this.program;
        this.program = null;
        init(shaderProgram, this.renderable);
        this.renderable = null;
        this.dirLightsLoc = loc(this.u_dirLights0color);
        this.dirLightsColorOffset = loc(this.u_dirLights0color) - this.dirLightsLoc;
        this.dirLightsDirectionOffset = loc(this.u_dirLights0direction) - this.dirLightsLoc;
        int iLoc = loc(this.u_dirLights1color) - this.dirLightsLoc;
        this.dirLightsSize = iLoc;
        int i = 0;
        if (iLoc < 0) {
            this.dirLightsSize = 0;
        }
        this.pointLightsLoc = loc(this.u_pointLights0color);
        this.pointLightsColorOffset = loc(this.u_pointLights0color) - this.pointLightsLoc;
        this.pointLightsPositionOffset = loc(this.u_pointLights0position) - this.pointLightsLoc;
        this.pointLightsIntensityOffset = has(this.u_pointLights0intensity) ? loc(this.u_pointLights0intensity) - this.pointLightsLoc : -1;
        int iLoc2 = loc(this.u_pointLights1color) - this.pointLightsLoc;
        this.pointLightsSize = iLoc2;
        if (iLoc2 < 0) {
            this.pointLightsSize = 0;
        }
        this.spotLightsLoc = loc(this.u_spotLights0color);
        this.spotLightsColorOffset = loc(this.u_spotLights0color) - this.spotLightsLoc;
        this.spotLightsPositionOffset = loc(this.u_spotLights0position) - this.spotLightsLoc;
        this.spotLightsDirectionOffset = loc(this.u_spotLights0direction) - this.spotLightsLoc;
        this.spotLightsIntensityOffset = has(this.u_spotLights0intensity) ? loc(this.u_spotLights0intensity) - this.spotLightsLoc : -1;
        this.spotLightsCutoffAngleOffset = loc(this.u_spotLights0cutoffAngle) - this.spotLightsLoc;
        this.spotLightsExponentOffset = loc(this.u_spotLights0exponent) - this.spotLightsLoc;
        int iLoc3 = loc(this.u_spotLights1color) - this.spotLightsLoc;
        this.spotLightsSize = iLoc3;
        if (iLoc3 < 0) {
            this.spotLightsSize = 0;
        }
        if (this.boneWeightsLocations == null) {
            return;
        }
        while (true) {
            int[] iArr = this.boneWeightsLocations;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = shaderProgram.getAttributeLocation(ShaderProgram.BONEWEIGHT_ATTRIBUTE + i);
            i++;
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader
    public void render(Renderable renderable, Attributes attributes) {
        if (!attributes.has(BlendingAttribute.Type)) {
            this.context.setBlending(false, GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        }
        bindMaterial(attributes);
        if (this.lighting) {
            bindLights(renderable, attributes);
        }
        super.render(renderable, attributes);
    }

    public void setDefaultCullFace(int i) {
        this.config.defaultCullFace = i;
    }

    public void setDefaultDepthFunc(int i) {
        this.config.defaultDepthFunc = i;
    }

    public DefaultShader(Renderable renderable, Config config) {
        this(renderable, config, createPrefix(renderable, config));
    }

    public boolean equals(Object obj) {
        return (obj instanceof DefaultShader) && equals((DefaultShader) obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DefaultShader(Renderable renderable, Config config, String str) {
        String str2 = config.vertexShader;
        String defaultVertexShader2 = str2 == null ? getDefaultVertexShader() : str2;
        String str3 = config.fragmentShader;
        this(renderable, config, str, defaultVertexShader2, str3 == null ? getDefaultFragmentShader() : str3);
    }

    public DefaultShader(Renderable renderable, Config config, String str, String str2, String str3) {
        this(renderable, config, new ShaderProgram(DM.h(str, str2), DM.h(str, str3)));
    }

    public static class Config {
        public int defaultCullFace;
        public int defaultDepthFunc;
        public String fragmentShader;
        public boolean ignoreUnimplemented;
        public int numBoneWeights;
        public int numBones;
        public int numDirectionalLights;
        public int numPointLights;
        public int numSpotLights;
        public String vertexShader;

        public Config() {
            this.vertexShader = null;
            this.fragmentShader = null;
            this.numDirectionalLights = 2;
            this.numPointLights = 5;
            this.numSpotLights = 0;
            this.numBones = 12;
            this.numBoneWeights = 4;
            this.ignoreUnimplemented = true;
            this.defaultCullFace = -1;
            this.defaultDepthFunc = -1;
        }

        public Config(String str, String str2) {
            this.numDirectionalLights = 2;
            this.numPointLights = 5;
            this.numSpotLights = 0;
            this.numBones = 12;
            this.numBoneWeights = 4;
            this.ignoreUnimplemented = true;
            this.defaultCullFace = -1;
            this.defaultDepthFunc = -1;
            this.vertexShader = str;
            this.fragmentShader = str2;
        }
    }

    public DefaultShader(Renderable renderable, Config config, ShaderProgram shaderProgram) {
        int i;
        int i2;
        int i3;
        this.u_dirLights0color = register(new BaseShader.Uniform("u_dirLights[0].color"));
        this.u_dirLights0direction = register(new BaseShader.Uniform("u_dirLights[0].direction"));
        this.u_dirLights1color = register(new BaseShader.Uniform("u_dirLights[1].color"));
        this.u_pointLights0color = register(new BaseShader.Uniform("u_pointLights[0].color"));
        this.u_pointLights0position = register(new BaseShader.Uniform("u_pointLights[0].position"));
        this.u_pointLights0intensity = register(new BaseShader.Uniform("u_pointLights[0].intensity"));
        this.u_pointLights1color = register(new BaseShader.Uniform("u_pointLights[1].color"));
        this.u_spotLights0color = register(new BaseShader.Uniform("u_spotLights[0].color"));
        this.u_spotLights0position = register(new BaseShader.Uniform("u_spotLights[0].position"));
        this.u_spotLights0intensity = register(new BaseShader.Uniform("u_spotLights[0].intensity"));
        this.u_spotLights0direction = register(new BaseShader.Uniform("u_spotLights[0].direction"));
        this.u_spotLights0cutoffAngle = register(new BaseShader.Uniform("u_spotLights[0].cutoffAngle"));
        this.u_spotLights0exponent = register(new BaseShader.Uniform("u_spotLights[0].exponent"));
        this.u_spotLights1color = register(new BaseShader.Uniform("u_spotLights[1].color"));
        this.u_fogColor = register(new BaseShader.Uniform("u_fogColor"));
        this.u_shadowMapProjViewTrans = register(new BaseShader.Uniform("u_shadowMapProjViewTrans"));
        this.u_shadowTexture = register(new BaseShader.Uniform("u_shadowTexture"));
        this.u_shadowPCFOffset = register(new BaseShader.Uniform("u_shadowPCFOffset"));
        this.ambientCubemap = new AmbientCubemap();
        this.normalMatrix = new Matrix3();
        this.tmpV1 = new Vector3();
        Attributes attributesCombineAttributes = combineAttributes(renderable);
        this.config = config;
        this.program = shaderProgram;
        int i4 = 0;
        boolean z = renderable.environment != null;
        this.lighting = z;
        long j = CubemapAttribute.EnvironmentMap;
        this.environmentCubemap = attributesCombineAttributes.has(j) || (z && attributesCombineAttributes.has(j));
        this.shadowMap = z && renderable.environment.shadowMap != null;
        this.renderable = renderable;
        this.attributesMask = attributesCombineAttributes.getMask() | optionalAttributes;
        this.vertexMask = renderable.meshPart.mesh.getVertexAttributes().getMaskWithSizePacked();
        this.textureCoordinates = renderable.meshPart.mesh.getVertexAttributes().getTextureCoordinates();
        this.directionalLights = new DirectionalLight[(!z || (i3 = config.numDirectionalLights) <= 0) ? 0 : i3];
        int i5 = 0;
        while (true) {
            DirectionalLight[] directionalLightArr = this.directionalLights;
            if (i5 >= directionalLightArr.length) {
                break;
            }
            directionalLightArr[i5] = new DirectionalLight();
            i5++;
        }
        this.pointLights = new PointLight[(!this.lighting || (i2 = config.numPointLights) <= 0) ? 0 : i2];
        int i6 = 0;
        while (true) {
            PointLight[] pointLightArr = this.pointLights;
            if (i6 >= pointLightArr.length) {
                break;
            }
            pointLightArr[i6] = new PointLight();
            i6++;
        }
        this.spotLights = new SpotLight[(!this.lighting || (i = config.numSpotLights) <= 0) ? 0 : i];
        while (true) {
            SpotLight[] spotLightArr = this.spotLights;
            if (i4 >= spotLightArr.length) {
                break;
            }
            spotLightArr[i4] = new SpotLight();
            i4++;
        }
        if (!config.ignoreUnimplemented) {
            long j2 = implementedFlags;
            long j3 = this.attributesMask;
            if ((j2 & j3) != j3) {
                throw new GdxRuntimeException(AbstractC3950lJ.s(new StringBuilder("Some attributes not implemented yet ("), this.attributesMask, ")"));
            }
        }
        Matrix4[] matrix4Arr = renderable.bones;
        if (matrix4Arr != null && matrix4Arr.length > config.numBones) {
            throw new GdxRuntimeException("too many bones: " + renderable.bones.length + ", max configured: " + config.numBones);
        }
        int boneWeights = renderable.meshPart.mesh.getVertexAttributes().getBoneWeights();
        int i7 = config.numBoneWeights;
        if (boneWeights <= i7) {
            if (renderable.bones != null) {
                this.boneWeightsLocations = new int[i7];
            }
            this.u_projTrans = register(Inputs.projTrans, Setters.projTrans);
            this.u_viewTrans = register(Inputs.viewTrans, Setters.viewTrans);
            this.u_projViewTrans = register(Inputs.projViewTrans, Setters.projViewTrans);
            this.u_cameraPosition = register(Inputs.cameraPosition, Setters.cameraPosition);
            this.u_cameraDirection = register(Inputs.cameraDirection, Setters.cameraDirection);
            this.u_cameraUp = register(Inputs.cameraUp, Setters.cameraUp);
            this.u_cameraNearFar = register(Inputs.cameraNearFar, Setters.cameraNearFar);
            this.u_time = register(new BaseShader.Uniform("u_time"));
            this.u_worldTrans = register(Inputs.worldTrans, Setters.worldTrans);
            this.u_viewWorldTrans = register(Inputs.viewWorldTrans, Setters.viewWorldTrans);
            this.u_projViewWorldTrans = register(Inputs.projViewWorldTrans, Setters.projViewWorldTrans);
            this.u_normalMatrix = register(Inputs.normalMatrix, Setters.normalMatrix);
            this.u_bones = (renderable.bones == null || config.numBones <= 0) ? -1 : register(Inputs.bones, new Setters.Bones(config.numBones));
            this.u_shininess = register(Inputs.shininess, Setters.shininess);
            this.u_opacity = register(Inputs.opacity);
            this.u_diffuseColor = register(Inputs.diffuseColor, Setters.diffuseColor);
            this.u_diffuseTexture = register(Inputs.diffuseTexture, Setters.diffuseTexture);
            this.u_diffuseUVTransform = register(Inputs.diffuseUVTransform, Setters.diffuseUVTransform);
            this.u_specularColor = register(Inputs.specularColor, Setters.specularColor);
            this.u_specularTexture = register(Inputs.specularTexture, Setters.specularTexture);
            this.u_specularUVTransform = register(Inputs.specularUVTransform, Setters.specularUVTransform);
            this.u_emissiveColor = register(Inputs.emissiveColor, Setters.emissiveColor);
            this.u_emissiveTexture = register(Inputs.emissiveTexture, Setters.emissiveTexture);
            this.u_emissiveUVTransform = register(Inputs.emissiveUVTransform, Setters.emissiveUVTransform);
            this.u_reflectionColor = register(Inputs.reflectionColor, Setters.reflectionColor);
            this.u_reflectionTexture = register(Inputs.reflectionTexture, Setters.reflectionTexture);
            this.u_reflectionUVTransform = register(Inputs.reflectionUVTransform, Setters.reflectionUVTransform);
            this.u_normalTexture = register(Inputs.normalTexture, Setters.normalTexture);
            this.u_normalUVTransform = register(Inputs.normalUVTransform, Setters.normalUVTransform);
            this.u_ambientTexture = register(Inputs.ambientTexture, Setters.ambientTexture);
            this.u_ambientUVTransform = register(Inputs.ambientUVTransform, Setters.ambientUVTransform);
            this.u_alphaTest = register(Inputs.alphaTest);
            this.u_ambientCubemap = this.lighting ? register(Inputs.ambientCube, new Setters.ACubemap(config.numDirectionalLights, config.numPointLights)) : -1;
            this.u_environmentCubemap = this.environmentCubemap ? register(Inputs.environmentCubemap, Setters.environmentCubemap) : -1;
            return;
        }
        StringBuilder sbQ = AbstractC5044xl.q("too many bone weights: ", boneWeights, ", max configured: ");
        sbQ.append(config.numBoneWeights);
        throw new GdxRuntimeException(sbQ.toString());
    }
}
