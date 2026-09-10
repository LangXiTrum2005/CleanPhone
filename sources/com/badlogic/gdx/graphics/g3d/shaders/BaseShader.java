package com.badlogic.gdx.graphics.g3d.shaders;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GLTexture;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.VertexAttributes;
import com.badlogic.gdx.graphics.g3d.Attributes;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Renderable;
import com.badlogic.gdx.graphics.g3d.Shader;
import com.badlogic.gdx.graphics.g3d.utils.RenderContext;
import com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.IntArray;
import com.badlogic.gdx.utils.IntIntMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseShader implements Shader {
    public Camera camera;
    public RenderContext context;
    private Mesh currentMesh;
    private int[] locations;
    public ShaderProgram program;
    private final Array<String> uniforms = new Array<>();
    private final Array<Validator> validators = new Array<>();
    private final Array<Setter> setters = new Array<>();
    private final IntArray globalUniforms = new IntArray();
    private final IntArray localUniforms = new IntArray();
    private final IntIntMap attributes = new IntIntMap();
    private final IntIntMap instancedAttributes = new IntIntMap();
    private final IntArray tempArray = new IntArray();
    private final IntArray tempArray2 = new IntArray();
    private Attributes combinedAttributes = new Attributes();

    public static abstract class GlobalSetter implements Setter {
        @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
        public boolean isGlobal(BaseShader baseShader, int i) {
            return true;
        }
    }

    public static abstract class LocalSetter implements Setter {
        @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Setter
        public boolean isGlobal(BaseShader baseShader, int i) {
            return false;
        }
    }

    public interface Setter {
        boolean isGlobal(BaseShader baseShader, int i);

        void set(BaseShader baseShader, int i, Renderable renderable, Attributes attributes);
    }

    public interface Validator {
        boolean validate(BaseShader baseShader, int i, Renderable renderable);
    }

    private final int[] getAttributeLocations(VertexAttributes vertexAttributes) {
        this.tempArray.clear();
        int size = vertexAttributes.size();
        for (int i = 0; i < size; i++) {
            this.tempArray.add(this.attributes.get(vertexAttributes.get(i).getKey(), -1));
        }
        this.tempArray.shrink();
        return this.tempArray.items;
    }

    private final int[] getInstancedAttributeLocations(VertexAttributes vertexAttributes) {
        if (vertexAttributes == null) {
            return null;
        }
        this.tempArray2.clear();
        int size = vertexAttributes.size();
        for (int i = 0; i < size; i++) {
            this.tempArray2.add(this.instancedAttributes.get(vertexAttributes.get(i).getKey(), -1));
        }
        this.tempArray2.shrink();
        return this.tempArray2.items;
    }

    @Override // com.badlogic.gdx.graphics.g3d.Shader
    public void begin(Camera camera, RenderContext renderContext) {
        this.camera = camera;
        this.context = renderContext;
        this.program.bind();
        this.currentMesh = null;
        int i = 0;
        while (true) {
            IntArray intArray = this.globalUniforms;
            if (i >= intArray.size) {
                return;
            }
            Array<Setter> array = this.setters;
            int i2 = intArray.get(i);
            if (array.get(i2) != null) {
                this.setters.get(i2).set(this, i2, null, null);
            }
            i++;
        }
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        this.program = null;
        this.uniforms.clear();
        this.validators.clear();
        this.setters.clear();
        this.localUniforms.clear();
        this.globalUniforms.clear();
        this.locations = null;
    }

    @Override // com.badlogic.gdx.graphics.g3d.Shader
    public void end() {
        Mesh mesh = this.currentMesh;
        if (mesh != null) {
            mesh.unbind(this.program, this.tempArray.items, this.tempArray2.items);
            this.currentMesh = null;
        }
    }

    public String getUniformAlias(int i) {
        return this.uniforms.get(i);
    }

    public int getUniformID(String str) {
        int i = this.uniforms.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.uniforms.get(i2).equals(str)) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean has(int i) {
        if (i >= 0) {
            int[] iArr = this.locations;
            if (i < iArr.length && iArr[i] >= 0) {
                return true;
            }
        }
        return false;
    }

    public void init(ShaderProgram shaderProgram, Renderable renderable) {
        if (this.locations != null) {
            throw new GdxRuntimeException("Already initialized");
        }
        if (!shaderProgram.isCompiled()) {
            throw new GdxRuntimeException(shaderProgram.getLog());
        }
        this.program = shaderProgram;
        int i = this.uniforms.size;
        this.locations = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.uniforms.get(i2);
            Validator validator = this.validators.get(i2);
            Setter setter = this.setters.get(i2);
            if (validator == null || validator.validate(this, i2, renderable)) {
                this.locations[i2] = shaderProgram.fetchUniformLocation(str, false);
                if (this.locations[i2] >= 0 && setter != null) {
                    if (setter.isGlobal(this, i2)) {
                        this.globalUniforms.add(i2);
                    } else {
                        this.localUniforms.add(i2);
                    }
                }
            } else {
                this.locations[i2] = -1;
            }
            if (this.locations[i2] < 0) {
                this.validators.set(i2, null);
                this.setters.set(i2, null);
            }
        }
        if (renderable != null) {
            VertexAttributes vertexAttributes = renderable.meshPart.mesh.getVertexAttributes();
            int size = vertexAttributes.size();
            for (int i3 = 0; i3 < size; i3++) {
                VertexAttribute vertexAttribute = vertexAttributes.get(i3);
                int attributeLocation = shaderProgram.getAttributeLocation(vertexAttribute.alias);
                if (attributeLocation >= 0) {
                    this.attributes.put(vertexAttribute.getKey(), attributeLocation);
                }
            }
            VertexAttributes instancedAttributes = renderable.meshPart.mesh.getInstancedAttributes();
            if (instancedAttributes != null) {
                int size2 = instancedAttributes.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    VertexAttribute vertexAttribute2 = instancedAttributes.get(i4);
                    int attributeLocation2 = shaderProgram.getAttributeLocation(vertexAttribute2.alias);
                    if (attributeLocation2 >= 0) {
                        this.instancedAttributes.put(vertexAttribute2.getKey(), attributeLocation2);
                    }
                }
            }
        }
    }

    public final int loc(int i) {
        if (i >= 0) {
            int[] iArr = this.locations;
            if (i < iArr.length) {
                return iArr[i];
            }
        }
        return -1;
    }

    public int register(String str, Validator validator, Setter setter) {
        if (this.locations != null) {
            throw new GdxRuntimeException("Cannot register an uniform after initialization");
        }
        int uniformID = getUniformID(str);
        if (uniformID >= 0) {
            this.validators.set(uniformID, validator);
            this.setters.set(uniformID, setter);
            return uniformID;
        }
        this.uniforms.add(str);
        this.validators.add(validator);
        this.setters.add(setter);
        return this.uniforms.size - 1;
    }

    @Override // com.badlogic.gdx.graphics.g3d.Shader
    public void render(Renderable renderable) {
        if (renderable.worldTransform.det3x3() == 0.0f) {
            return;
        }
        this.combinedAttributes.clear();
        Environment environment = renderable.environment;
        if (environment != null) {
            this.combinedAttributes.set(environment);
        }
        Material material = renderable.material;
        if (material != null) {
            this.combinedAttributes.set(material);
        }
        render(renderable, this.combinedAttributes);
    }

    public final boolean set(int i, Matrix4 matrix4) {
        int i2 = this.locations[i];
        if (i2 < 0) {
            return false;
        }
        this.program.setUniformMatrix(i2, matrix4);
        return true;
    }

    public final boolean set(int i, Matrix3 matrix3) {
        int i2 = this.locations[i];
        if (i2 < 0) {
            return false;
        }
        this.program.setUniformMatrix(i2, matrix3);
        return true;
    }

    public static class Uniform implements Validator {
        public final String alias;
        public final long environmentMask;
        public final long materialMask;
        public final long overallMask;

        public Uniform(String str, long j, long j2, long j3) {
            this.alias = str;
            this.materialMask = j;
            this.environmentMask = j2;
            this.overallMask = j3;
        }

        @Override // com.badlogic.gdx.graphics.g3d.shaders.BaseShader.Validator
        public boolean validate(BaseShader baseShader, int i, Renderable renderable) {
            Environment environment;
            Material material;
            long mask = 0;
            long mask2 = (renderable == null || (material = renderable.material) == null) ? 0L : material.getMask();
            if (renderable != null && (environment = renderable.environment) != null) {
                mask = environment.getMask();
            }
            long j = this.materialMask;
            if ((mask2 & j) == j) {
                long j2 = this.environmentMask;
                if ((mask & j2) == j2) {
                    long j3 = mask | mask2;
                    long j4 = this.overallMask;
                    if ((j3 & j4) == j4) {
                        return true;
                    }
                }
            }
            return false;
        }

        public Uniform(String str, long j, long j2) {
            this(str, j, j2, 0L);
        }

        public Uniform(String str, long j) {
            this(str, 0L, 0L, j);
        }

        public Uniform(String str) {
            this(str, 0L, 0L);
        }
    }

    public final boolean set(int i, Vector3 vector3) {
        int i2 = this.locations[i];
        if (i2 < 0) {
            return false;
        }
        this.program.setUniformf(i2, vector3);
        return true;
    }

    public void render(Renderable renderable, Attributes attributes) {
        int i = 0;
        while (true) {
            IntArray intArray = this.localUniforms;
            if (i >= intArray.size) {
                break;
            }
            Array<Setter> array = this.setters;
            int i2 = intArray.get(i);
            if (array.get(i2) != null) {
                this.setters.get(i2).set(this, i2, renderable, attributes);
            }
            i++;
        }
        Mesh mesh = this.currentMesh;
        if (mesh != renderable.meshPart.mesh) {
            if (mesh != null) {
                mesh.unbind(this.program, this.tempArray.items, this.tempArray2.items);
            }
            Mesh mesh2 = renderable.meshPart.mesh;
            this.currentMesh = mesh2;
            mesh2.bind(this.program, getAttributeLocations(mesh2.getVertexAttributes()), getInstancedAttributeLocations(renderable.meshPart.mesh.getInstancedAttributes()));
        }
        renderable.meshPart.render(this.program, false);
    }

    public final boolean set(int i, Vector2 vector2) {
        int i2 = this.locations[i];
        if (i2 < 0) {
            return false;
        }
        this.program.setUniformf(i2, vector2);
        return true;
    }

    public final boolean set(int i, Color color) {
        int i2 = this.locations[i];
        if (i2 < 0) {
            return false;
        }
        this.program.setUniformf(i2, color);
        return true;
    }

    public int register(String str, Validator validator) {
        return register(str, validator, null);
    }

    public int register(String str, Setter setter) {
        return register(str, null, setter);
    }

    public final boolean set(int i, float f) {
        int i2 = this.locations[i];
        if (i2 < 0) {
            return false;
        }
        this.program.setUniformf(i2, f);
        return true;
    }

    public int register(String str) {
        return register(str, null, null);
    }

    public int register(Uniform uniform, Setter setter) {
        return register(uniform.alias, uniform, setter);
    }

    public final boolean set(int i, float f, float f2) {
        int i2 = this.locations[i];
        if (i2 < 0) {
            return false;
        }
        this.program.setUniformf(i2, f, f2);
        return true;
    }

    public int register(Uniform uniform) {
        return register(uniform, (Setter) null);
    }

    public final boolean set(int i, float f, float f2, float f3) {
        int i2 = this.locations[i];
        if (i2 < 0) {
            return false;
        }
        this.program.setUniformf(i2, f, f2, f3);
        return true;
    }

    public final boolean set(int i, float f, float f2, float f3, float f4) {
        int i2 = this.locations[i];
        if (i2 < 0) {
            return false;
        }
        this.program.setUniformf(i2, f, f2, f3, f4);
        return true;
    }

    public final boolean set(int i, int i2) {
        int i3 = this.locations[i];
        if (i3 < 0) {
            return false;
        }
        this.program.setUniformi(i3, i2);
        return true;
    }

    public final boolean set(int i, int i2, int i3) {
        int i4 = this.locations[i];
        if (i4 < 0) {
            return false;
        }
        this.program.setUniformi(i4, i2, i3);
        return true;
    }

    public final boolean set(int i, int i2, int i3, int i4) {
        int i5 = this.locations[i];
        if (i5 < 0) {
            return false;
        }
        this.program.setUniformi(i5, i2, i3, i4);
        return true;
    }

    public final boolean set(int i, int i2, int i3, int i4, int i5) {
        int i6 = this.locations[i];
        if (i6 < 0) {
            return false;
        }
        this.program.setUniformi(i6, i2, i3, i4, i5);
        return true;
    }

    public final boolean set(int i, TextureDescriptor textureDescriptor) {
        int i2 = this.locations[i];
        if (i2 < 0) {
            return false;
        }
        this.program.setUniformi(i2, this.context.textureBinder.bind(textureDescriptor));
        return true;
    }

    public final boolean set(int i, GLTexture gLTexture) {
        int i2 = this.locations[i];
        if (i2 < 0) {
            return false;
        }
        this.program.setUniformi(i2, this.context.textureBinder.bind(gLTexture));
        return true;
    }
}
