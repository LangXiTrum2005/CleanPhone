package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Vector4;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.ObjectIntMap;
import com.badlogic.gdx.utils.ObjectMap;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ShaderProgram implements Disposable {
    public static final String BINORMAL_ATTRIBUTE = "a_binormal";
    public static final String BONEWEIGHT_ATTRIBUTE = "a_boneWeight";
    public static final String COLOR_ATTRIBUTE = "a_color";
    public static final String NORMAL_ATTRIBUTE = "a_normal";
    public static final String POSITION_ATTRIBUTE = "a_position";
    public static final String TANGENT_ATTRIBUTE = "a_tangent";
    public static final String TEXCOORD_ATTRIBUTE = "a_texCoord";
    public static boolean pedantic = true;
    public static String prependFragmentCode = "";
    public static String prependVertexCode = "";
    private String[] attributeNames;
    private final ObjectIntMap<String> attributeSizes;
    private final ObjectIntMap<String> attributeTypes;
    private final ObjectIntMap<String> attributes;
    private int fragmentShaderHandle;
    private final String fragmentShaderSource;
    private boolean invalidated;
    private boolean isCompiled;
    private String log;
    private final FloatBuffer matrix;
    IntBuffer params;
    private int program;
    private int refCount;
    IntBuffer type;
    private String[] uniformNames;
    private final ObjectIntMap<String> uniformSizes;
    private final ObjectIntMap<String> uniformTypes;
    private final ObjectIntMap<String> uniforms;
    private int vertexShaderHandle;
    private final String vertexShaderSource;
    private static final ObjectMap<Application, Array<ShaderProgram>> shaders = new ObjectMap<>();
    static final IntBuffer intbuf = BufferUtils.newIntBuffer(1);

    public ShaderProgram(String str, String str2) {
        this.log = "";
        this.uniforms = new ObjectIntMap<>();
        this.uniformTypes = new ObjectIntMap<>();
        this.uniformSizes = new ObjectIntMap<>();
        this.attributes = new ObjectIntMap<>();
        this.attributeTypes = new ObjectIntMap<>();
        this.attributeSizes = new ObjectIntMap<>();
        this.refCount = 0;
        this.params = BufferUtils.newIntBuffer(1);
        this.type = BufferUtils.newIntBuffer(1);
        if (str == null) {
            throw new IllegalArgumentException("vertex shader must not be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("fragment shader must not be null");
        }
        String str3 = prependVertexCode;
        if (str3 != null && str3.length() > 0) {
            str = DM.m(new StringBuilder(), prependVertexCode, str);
        }
        String str4 = prependFragmentCode;
        if (str4 != null && str4.length() > 0) {
            str2 = DM.m(new StringBuilder(), prependFragmentCode, str2);
        }
        this.vertexShaderSource = str;
        this.fragmentShaderSource = str2;
        this.matrix = BufferUtils.newFloatBuffer(16);
        compileShaders(str, str2);
        if (isCompiled()) {
            fetchAttributes();
            fetchUniforms();
            addManagedShader(Gdx.app, this);
        }
    }

    private void addManagedShader(Application application, ShaderProgram shaderProgram) {
        ObjectMap<Application, Array<ShaderProgram>> objectMap = shaders;
        Array<ShaderProgram> array = objectMap.get(application);
        if (array == null) {
            array = new Array<>();
        }
        array.add(shaderProgram);
        objectMap.put(application, array);
    }

    private void checkManaged() {
        if (this.invalidated) {
            compileShaders(this.vertexShaderSource, this.fragmentShaderSource);
            this.invalidated = false;
        }
    }

    public static void clearAllShaderPrograms(Application application) {
        shaders.remove(application);
    }

    private void compileShaders(String str, String str2) {
        this.vertexShaderHandle = loadShader(GL20.GL_VERTEX_SHADER, str);
        int iLoadShader = loadShader(GL20.GL_FRAGMENT_SHADER, str2);
        this.fragmentShaderHandle = iLoadShader;
        if (this.vertexShaderHandle == -1 || iLoadShader == -1) {
            this.isCompiled = false;
            return;
        }
        int iLinkProgram = linkProgram(createProgram());
        this.program = iLinkProgram;
        if (iLinkProgram == -1) {
            this.isCompiled = false;
        } else {
            this.isCompiled = true;
        }
    }

    private int fetchAttributeLocation(String str) {
        GL20 gl20 = Gdx.gl20;
        int i = this.attributes.get(str, -2);
        if (i != -2) {
            return i;
        }
        int iGlGetAttribLocation = gl20.glGetAttribLocation(this.program, str);
        this.attributes.put(str, iGlGetAttribLocation);
        return iGlGetAttribLocation;
    }

    private void fetchAttributes() {
        this.params.clear();
        Gdx.gl20.glGetProgramiv(this.program, GL20.GL_ACTIVE_ATTRIBUTES, this.params);
        int i = this.params.get(0);
        this.attributeNames = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.params.clear();
            this.params.put(0, 1);
            this.type.clear();
            String strGlGetActiveAttrib = Gdx.gl20.glGetActiveAttrib(this.program, i2, this.params, this.type);
            this.attributes.put(strGlGetActiveAttrib, Gdx.gl20.glGetAttribLocation(this.program, strGlGetActiveAttrib));
            this.attributeTypes.put(strGlGetActiveAttrib, this.type.get(0));
            this.attributeSizes.put(strGlGetActiveAttrib, this.params.get(0));
            this.attributeNames[i2] = strGlGetActiveAttrib;
        }
    }

    private int fetchUniformLocation(String str) {
        return fetchUniformLocation(str, pedantic);
    }

    private void fetchUniforms() {
        this.params.clear();
        Gdx.gl20.glGetProgramiv(this.program, GL20.GL_ACTIVE_UNIFORMS, this.params);
        int i = this.params.get(0);
        this.uniformNames = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.params.clear();
            this.params.put(0, 1);
            this.type.clear();
            String strGlGetActiveUniform = Gdx.gl20.glGetActiveUniform(this.program, i2, this.params, this.type);
            this.uniforms.put(strGlGetActiveUniform, Gdx.gl20.glGetUniformLocation(this.program, strGlGetActiveUniform));
            this.uniformTypes.put(strGlGetActiveUniform, this.type.get(0));
            this.uniformSizes.put(strGlGetActiveUniform, this.params.get(0));
            this.uniformNames[i2] = strGlGetActiveUniform;
        }
    }

    public static String getManagedStatus() {
        StringBuilder sb = new StringBuilder("Managed shaders/app: { ");
        ObjectMap.Keys<Application> it = shaders.keys().iterator();
        while (it.hasNext()) {
            sb.append(shaders.get(it.next()).size);
            sb.append(" ");
        }
        sb.append("}");
        return sb.toString();
    }

    public static int getNumManagedShaderPrograms() {
        return shaders.get(Gdx.app).size;
    }

    public static void invalidateAllShaderPrograms(Application application) {
        Array<ShaderProgram> array;
        if (Gdx.gl20 == null || (array = shaders.get(application)) == null) {
            return;
        }
        for (int i = 0; i < array.size; i++) {
            array.get(i).invalidated = true;
            array.get(i).checkManaged();
        }
    }

    private int linkProgram(int i) {
        GL20 gl20 = Gdx.gl20;
        if (i == -1) {
            return -1;
        }
        gl20.glAttachShader(i, this.vertexShaderHandle);
        gl20.glAttachShader(i, this.fragmentShaderHandle);
        gl20.glLinkProgram(i);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        IntBuffer intBufferAsIntBuffer = byteBufferAllocateDirect.asIntBuffer();
        gl20.glGetProgramiv(i, GL20.GL_LINK_STATUS, intBufferAsIntBuffer);
        if (intBufferAsIntBuffer.get(0) != 0) {
            return i;
        }
        this.log = Gdx.gl20.glGetProgramInfoLog(i);
        return -1;
    }

    private int loadShader(int i, String str) {
        GL20 gl20 = Gdx.gl20;
        IntBuffer intBufferNewIntBuffer = BufferUtils.newIntBuffer(1);
        int iGlCreateShader = gl20.glCreateShader(i);
        if (iGlCreateShader == 0) {
            return -1;
        }
        gl20.glShaderSource(iGlCreateShader, str);
        gl20.glCompileShader(iGlCreateShader);
        gl20.glGetShaderiv(iGlCreateShader, GL20.GL_COMPILE_STATUS, intBufferNewIntBuffer);
        if (intBufferNewIntBuffer.get(0) != 0) {
            return iGlCreateShader;
        }
        String strGlGetShaderInfoLog = gl20.glGetShaderInfoLog(iGlCreateShader);
        StringBuilder sb = new StringBuilder();
        sb.append(this.log);
        sb.append(i == 35633 ? "Vertex shader\n" : "Fragment shader:\n");
        this.log = sb.toString();
        this.log = DM.m(new StringBuilder(), this.log, strGlGetShaderInfoLog);
        return -1;
    }

    @Deprecated
    public void begin() {
        bind();
    }

    public void bind() {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUseProgram(this.program);
    }

    public int createProgram() {
        int iGlCreateProgram = Gdx.gl20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            return iGlCreateProgram;
        }
        return -1;
    }

    public void disableVertexAttribute(String str) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        int iFetchAttributeLocation = fetchAttributeLocation(str);
        if (iFetchAttributeLocation == -1) {
            return;
        }
        gl20.glDisableVertexAttribArray(iFetchAttributeLocation);
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        GL20 gl20 = Gdx.gl20;
        gl20.glUseProgram(0);
        gl20.glDeleteShader(this.vertexShaderHandle);
        gl20.glDeleteShader(this.fragmentShaderHandle);
        gl20.glDeleteProgram(this.program);
        ObjectMap<Application, Array<ShaderProgram>> objectMap = shaders;
        if (objectMap.get(Gdx.app) != null) {
            objectMap.get(Gdx.app).removeValue(this, true);
        }
    }

    public void enableVertexAttribute(String str) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        int iFetchAttributeLocation = fetchAttributeLocation(str);
        if (iFetchAttributeLocation == -1) {
            return;
        }
        gl20.glEnableVertexAttribArray(iFetchAttributeLocation);
    }

    @Deprecated
    public void end() {
    }

    public int getAttributeLocation(String str) {
        return this.attributes.get(str, -1);
    }

    public int getAttributeSize(String str) {
        return this.attributeSizes.get(str, 0);
    }

    public int getAttributeType(String str) {
        return this.attributeTypes.get(str, 0);
    }

    public String[] getAttributes() {
        return this.attributeNames;
    }

    public String getFragmentShaderSource() {
        return this.fragmentShaderSource;
    }

    public int getHandle() {
        return this.program;
    }

    public String getLog() {
        if (!this.isCompiled) {
            return this.log;
        }
        String strGlGetProgramInfoLog = Gdx.gl20.glGetProgramInfoLog(this.program);
        this.log = strGlGetProgramInfoLog;
        return strGlGetProgramInfoLog;
    }

    public int getUniformLocation(String str) {
        return this.uniforms.get(str, -1);
    }

    public int getUniformSize(String str) {
        return this.uniformSizes.get(str, 0);
    }

    public int getUniformType(String str) {
        return this.uniformTypes.get(str, 0);
    }

    public String[] getUniforms() {
        return this.uniformNames;
    }

    public String getVertexShaderSource() {
        return this.vertexShaderSource;
    }

    public boolean hasAttribute(String str) {
        return this.attributes.containsKey(str);
    }

    public boolean hasUniform(String str) {
        return this.uniforms.containsKey(str);
    }

    public boolean isCompiled() {
        return this.isCompiled;
    }

    public void setAttributef(String str, float f, float f2, float f3, float f4) {
        Gdx.gl20.glVertexAttrib4f(fetchAttributeLocation(str), f, f2, f3, f4);
    }

    public void setUniform1fv(String str, float[] fArr, int i, int i2) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform1fv(fetchUniformLocation(str), i2, fArr, i);
    }

    public void setUniform2fv(String str, float[] fArr, int i, int i2) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform2fv(fetchUniformLocation(str), i2 / 2, fArr, i);
    }

    public void setUniform3fv(String str, float[] fArr, int i, int i2) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform3fv(fetchUniformLocation(str), i2 / 3, fArr, i);
    }

    public void setUniform4fv(String str, float[] fArr, int i, int i2) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform4fv(fetchUniformLocation(str), i2 / 4, fArr, i);
    }

    public void setUniformMatrix(String str, Matrix4 matrix4) {
        setUniformMatrix(str, matrix4, false);
    }

    public void setUniformMatrix3fv(String str, FloatBuffer floatBuffer, int i, boolean z) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        floatBuffer.position(0);
        gl20.glUniformMatrix3fv(fetchUniformLocation(str), i, z, floatBuffer);
    }

    public void setUniformMatrix4fv(String str, FloatBuffer floatBuffer, int i, boolean z) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        floatBuffer.position(0);
        gl20.glUniformMatrix4fv(fetchUniformLocation(str), i, z, floatBuffer);
    }

    public void setUniformf(String str, float f) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform1f(fetchUniformLocation(str), f);
    }

    public void setUniformi(String str, int i) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform1i(fetchUniformLocation(str), i);
    }

    public void setVertexAttribute(String str, int i, int i2, boolean z, int i3, Buffer buffer) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        int iFetchAttributeLocation = fetchAttributeLocation(str);
        if (iFetchAttributeLocation == -1) {
            return;
        }
        gl20.glVertexAttribPointer(iFetchAttributeLocation, i, i2, z, i3, buffer);
    }

    public int fetchUniformLocation(String str, boolean z) {
        int iGlGetUniformLocation = this.uniforms.get(str, -2);
        if (iGlGetUniformLocation == -2) {
            iGlGetUniformLocation = Gdx.gl20.glGetUniformLocation(this.program, str);
            if (iGlGetUniformLocation == -1 && z) {
                if (this.isCompiled) {
                    throw new IllegalArgumentException(DM.B("No uniform with name '", str, "' in shader"));
                }
                throw new IllegalStateException("An attempted fetch uniform from uncompiled shader \n" + getLog());
            }
            this.uniforms.put(str, iGlGetUniformLocation);
        }
        return iGlGetUniformLocation;
    }

    public void setUniformMatrix(String str, Matrix4 matrix4, boolean z) {
        setUniformMatrix(fetchUniformLocation(str), matrix4, z);
    }

    public void setUniformMatrix(int i, Matrix4 matrix4) {
        setUniformMatrix(i, matrix4, false);
    }

    public void setUniformMatrix(int i, Matrix4 matrix4, boolean z) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniformMatrix4fv(i, 1, z, matrix4.val, 0);
    }

    public void disableVertexAttribute(int i) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glDisableVertexAttribArray(i);
    }

    public void enableVertexAttribute(int i) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glEnableVertexAttribArray(i);
    }

    public void setUniform1fv(int i, float[] fArr, int i2, int i3) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform1fv(i, i3, fArr, i2);
    }

    public void setUniform2fv(int i, float[] fArr, int i2, int i3) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform2fv(i, i3 / 2, fArr, i2);
    }

    public void setUniform3fv(int i, float[] fArr, int i2, int i3) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform3fv(i, i3 / 3, fArr, i2);
    }

    public void setUniform4fv(int i, float[] fArr, int i2, int i3) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform4fv(i, i3 / 4, fArr, i2);
    }

    public void setUniformf(int i, float f) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform1f(i, f);
    }

    public void setUniformi(int i, int i2) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform1i(i, i2);
    }

    public void setVertexAttribute(int i, int i2, int i3, boolean z, int i4, Buffer buffer) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glVertexAttribPointer(i, i2, i3, z, i4, buffer);
    }

    public void setUniformMatrix4fv(int i, float[] fArr, int i2, int i3) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniformMatrix4fv(i, i3 / 16, false, fArr, i2);
    }

    public void setUniformMatrix(String str, Matrix3 matrix3) {
        setUniformMatrix(str, matrix3, false);
    }

    public void setUniformMatrix(String str, Matrix3 matrix3, boolean z) {
        setUniformMatrix(fetchUniformLocation(str), matrix3, z);
    }

    public void setUniformf(String str, float f, float f2) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform2f(fetchUniformLocation(str), f, f2);
    }

    public void setUniformi(String str, int i, int i2) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform2i(fetchUniformLocation(str), i, i2);
    }

    public void setVertexAttribute(String str, int i, int i2, boolean z, int i3, int i4) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        int iFetchAttributeLocation = fetchAttributeLocation(str);
        if (iFetchAttributeLocation == -1) {
            return;
        }
        gl20.glVertexAttribPointer(iFetchAttributeLocation, i, i2, z, i3, i4);
    }

    public void setUniformMatrix(int i, Matrix3 matrix3) {
        setUniformMatrix(i, matrix3, false);
    }

    public void setUniformMatrix4fv(String str, float[] fArr, int i, int i2) {
        setUniformMatrix4fv(fetchUniformLocation(str), fArr, i, i2);
    }

    public void setUniformMatrix(int i, Matrix3 matrix3, boolean z) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniformMatrix3fv(i, 1, z, matrix3.val, 0);
    }

    public void setUniformf(int i, float f, float f2) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform2f(i, f, f2);
    }

    public void setUniformi(int i, int i2, int i3) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform2i(i, i2, i3);
    }

    public void setVertexAttribute(int i, int i2, int i3, boolean z, int i4, int i5) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glVertexAttribPointer(i, i2, i3, z, i4, i5);
    }

    public void setUniformf(String str, float f, float f2, float f3) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform3f(fetchUniformLocation(str), f, f2, f3);
    }

    public void setUniformi(String str, int i, int i2, int i3) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform3i(fetchUniformLocation(str), i, i2, i3);
    }

    public void setUniformf(int i, float f, float f2, float f3) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform3f(i, f, f2, f3);
    }

    public void setUniformi(int i, int i2, int i3, int i4) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform3i(i, i2, i3, i4);
    }

    public void setUniformf(String str, float f, float f2, float f3, float f4) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform4f(fetchUniformLocation(str), f, f2, f3, f4);
    }

    public void setUniformi(String str, int i, int i2, int i3, int i4) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform4i(fetchUniformLocation(str), i, i2, i3, i4);
    }

    public void setUniformf(int i, float f, float f2, float f3, float f4) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform4f(i, f, f2, f3, f4);
    }

    public void setUniformi(int i, int i2, int i3, int i4, int i5) {
        GL20 gl20 = Gdx.gl20;
        checkManaged();
        gl20.glUniform4i(i, i2, i3, i4, i5);
    }

    public void setUniformf(String str, Vector2 vector2) {
        setUniformf(str, vector2.x, vector2.y);
    }

    public void setUniformf(int i, Vector2 vector2) {
        setUniformf(i, vector2.x, vector2.y);
    }

    public void setUniformf(String str, Vector3 vector3) {
        setUniformf(str, vector3.x, vector3.y, vector3.z);
    }

    public ShaderProgram(FileHandle fileHandle, FileHandle fileHandle2) {
        this(fileHandle.readString(), fileHandle2.readString());
    }

    public void setUniformf(int i, Vector3 vector3) {
        setUniformf(i, vector3.x, vector3.y, vector3.z);
    }

    public void setUniformf(String str, Vector4 vector4) {
        setUniformf(str, vector4.x, vector4.y, vector4.z, vector4.w);
    }

    public void setUniformf(int i, Vector4 vector4) {
        setUniformf(i, vector4.x, vector4.y, vector4.z, vector4.w);
    }

    public void setUniformf(String str, Color color) {
        setUniformf(str, color.r, color.g, color.b, color.f202a);
    }

    public void setUniformf(int i, Color color) {
        setUniformf(i, color.r, color.g, color.b, color.f202a);
    }
}
