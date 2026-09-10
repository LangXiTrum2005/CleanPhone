package com.badlogic.gdx.graphics;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.IndexArray;
import com.badlogic.gdx.graphics.glutils.IndexBufferObject;
import com.badlogic.gdx.graphics.glutils.IndexBufferObjectSubData;
import com.badlogic.gdx.graphics.glutils.IndexData;
import com.badlogic.gdx.graphics.glutils.InstanceBufferObject;
import com.badlogic.gdx.graphics.glutils.InstanceData;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.graphics.glutils.VertexArray;
import com.badlogic.gdx.graphics.glutils.VertexBufferObject;
import com.badlogic.gdx.graphics.glutils.VertexBufferObjectSubData;
import com.badlogic.gdx.graphics.glutils.VertexBufferObjectWithVAO;
import com.badlogic.gdx.graphics.glutils.VertexData;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Mesh implements Disposable {
    static final Map<Application, Array<Mesh>> meshes = new HashMap();
    boolean autoBind;
    final IndexData indices;
    InstanceData instances;
    boolean isInstanced;
    final boolean isVertexArray;
    private final Vector3 tmpV;
    final VertexData vertices;

    /* JADX INFO: renamed from: com.badlogic.gdx.graphics.Mesh$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$graphics$Mesh$VertexDataType;

        static {
            int[] iArr = new int[VertexDataType.values().length];
            $SwitchMap$com$badlogic$gdx$graphics$Mesh$VertexDataType = iArr;
            try {
                iArr[VertexDataType.VertexBufferObject.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$Mesh$VertexDataType[VertexDataType.VertexBufferObjectSubData.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$Mesh$VertexDataType[VertexDataType.VertexBufferObjectWithVAO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$Mesh$VertexDataType[VertexDataType.VertexArray.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum VertexDataType {
        VertexArray,
        VertexBufferObject,
        VertexBufferObjectSubData,
        VertexBufferObjectWithVAO
    }

    public Mesh(VertexData vertexData, IndexData indexData, boolean z) {
        this.autoBind = true;
        this.isInstanced = false;
        this.tmpV = new Vector3();
        this.vertices = vertexData;
        this.indices = indexData;
        this.isVertexArray = z;
        addManagedMesh(Gdx.app, this);
    }

    private static void addManagedMesh(Application application, Mesh mesh) {
        Map<Application, Array<Mesh>> map = meshes;
        Array<Mesh> array = map.get(application);
        if (array == null) {
            array = new Array<>();
        }
        array.add(mesh);
        map.put(application, array);
    }

    public static void clearAllMeshes(Application application) {
        meshes.remove(application);
    }

    public static String getManagedStatus() {
        StringBuilder sb = new StringBuilder("Managed meshes/app: { ");
        Iterator<Application> it = meshes.keySet().iterator();
        while (it.hasNext()) {
            sb.append(meshes.get(it.next()).size);
            sb.append(" ");
        }
        sb.append("}");
        return sb.toString();
    }

    public static void invalidateAllMeshes(Application application) {
        Array<Mesh> array = meshes.get(application);
        if (array == null) {
            return;
        }
        for (int i = 0; i < array.size; i++) {
            array.get(i).vertices.invalidate();
            array.get(i).indices.invalidate();
        }
    }

    private VertexData makeVertexBuffer(boolean z, int i, VertexAttributes vertexAttributes) {
        return Gdx.gl30 != null ? new VertexBufferObjectWithVAO(z, i, vertexAttributes) : new VertexBufferObject(z, i, vertexAttributes);
    }

    public void bind(ShaderProgram shaderProgram) {
        bind(shaderProgram, null, null);
    }

    public BoundingBox calculateBoundingBox() {
        BoundingBox boundingBox = new BoundingBox();
        calculateBoundingBox(boundingBox);
        return boundingBox;
    }

    public float calculateRadius(float f, float f2, float f3, int i, int i2, Matrix4 matrix4) {
        return (float) Math.sqrt(calculateRadiusSquared(f, f2, f3, i, i2, matrix4));
    }

    public float calculateRadiusSquared(float f, float f2, float f3, int i, int i2, Matrix4 matrix4) {
        int i3;
        int numIndices = getNumIndices();
        if (i < 0 || i2 < 1 || (i3 = i + i2) > numIndices) {
            throw new GdxRuntimeException("Not enough indices");
        }
        FloatBuffer buffer = this.vertices.getBuffer(false);
        ShortBuffer buffer2 = this.indices.getBuffer(false);
        VertexAttribute vertexAttribute = getVertexAttribute(1);
        int i4 = vertexAttribute.offset / 4;
        int i5 = this.vertices.getAttributes().vertexSize / 4;
        int i6 = vertexAttribute.numComponents;
        short s = 65535;
        float f4 = 0.0f;
        if (i6 == 1) {
            float f5 = 0.0f;
            for (int i7 = i; i7 < i3; i7++) {
                this.tmpV.set(buffer.get(((buffer2.get(i7) & 65535) * i5) + i4), 0.0f, 0.0f);
                if (matrix4 != null) {
                    this.tmpV.mul(matrix4);
                }
                float fLen2 = this.tmpV.sub(f, f2, f3).len2();
                if (fLen2 > f5) {
                    f5 = fLen2;
                }
            }
            return f5;
        }
        if (i6 == 2) {
            float f6 = 0.0f;
            for (int i8 = i; i8 < i3; i8++) {
                int i9 = ((buffer2.get(i8) & 65535) * i5) + i4;
                this.tmpV.set(buffer.get(i9), buffer.get(i9 + 1), 0.0f);
                if (matrix4 != null) {
                    this.tmpV.mul(matrix4);
                }
                float fLen3 = this.tmpV.sub(f, f2, f3).len2();
                if (fLen3 > f6) {
                    f6 = fLen3;
                }
            }
            return f6;
        }
        if (i6 != 3) {
            return 0.0f;
        }
        int i10 = i;
        while (i10 < i3) {
            int i11 = ((buffer2.get(i10) & s) * i5) + i4;
            int i12 = i4;
            this.tmpV.set(buffer.get(i11), buffer.get(i11 + 1), buffer.get(i11 + 2));
            if (matrix4 != null) {
                this.tmpV.mul(matrix4);
            }
            float fLen4 = this.tmpV.sub(f, f2, f3).len2();
            if (fLen4 > f4) {
                f4 = fLen4;
            }
            i10++;
            i4 = i12;
            s = 65535;
        }
        return f4;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    public Mesh copy(boolean z, boolean z2, int[] iArr) {
        VertexAttribute[] vertexAttributeArr;
        short[] sArr;
        int i;
        short[] sArr2;
        int i2;
        short s;
        int vertexSize = getVertexSize() / 4;
        int numVertices = getNumVertices();
        int i3 = numVertices * vertexSize;
        float[] fArr = new float[i3];
        getVertices(0, i3, fArr);
        if (iArr != null) {
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < iArr.length; i6++) {
                if (getVertexAttribute(iArr[i6]) != null) {
                    i4 += getVertexAttribute(iArr[i6]).numComponents;
                    i5++;
                }
            }
            if (i4 > 0) {
                vertexAttributeArr = new VertexAttribute[i5];
                sArr = new short[i4];
                i = 0;
                int i7 = -1;
                int i8 = -1;
                for (int i9 : iArr) {
                    VertexAttribute vertexAttribute = getVertexAttribute(i9);
                    if (vertexAttribute != null) {
                        for (int i10 = 0; i10 < vertexAttribute.numComponents; i10++) {
                            i7++;
                            sArr[i7] = (short) (vertexAttribute.offset + i10);
                        }
                        i8++;
                        vertexAttributeArr[i8] = vertexAttribute.copy();
                        i += vertexAttribute.numComponents;
                    }
                }
            } else {
                vertexAttributeArr = null;
                sArr = null;
                i = 0;
            }
        } else {
            vertexAttributeArr = null;
            sArr = null;
            i = 0;
        }
        if (sArr == null) {
            sArr = new short[vertexSize];
            for (short s2 = 0; s2 < vertexSize; s2 = (short) (s2 + 1)) {
                sArr[s2] = s2;
            }
            i = vertexSize;
        }
        int numIndices = getNumIndices();
        if (numIndices > 0) {
            sArr2 = new short[numIndices];
            getIndices(sArr2);
            if (z2 || i != vertexSize) {
                float[] fArr2 = new float[i3];
                int i11 = 0;
                int i12 = 0;
                while (i12 < numIndices) {
                    int i13 = sArr2[i12] * vertexSize;
                    if (z2) {
                        short s3 = 0;
                        s = -1;
                        while (s3 < i11 && s < 0) {
                            int i14 = s3 * i;
                            boolean z3 = true;
                            int i15 = numIndices;
                            for (int i16 = 0; i16 < sArr.length && z3; i16++) {
                                if (fArr2[i14 + i16] != fArr[i13 + sArr[i16]]) {
                                    z3 = false;
                                }
                            }
                            if (z3) {
                                s = s3;
                            }
                            s3 = (short) (s3 + 1);
                            numIndices = i15;
                        }
                        i2 = numIndices;
                    } else {
                        i2 = numIndices;
                        s = -1;
                    }
                    if (s > 0) {
                        sArr2[i12] = s;
                    } else {
                        int i17 = i11 * i;
                        for (int i18 = 0; i18 < sArr.length; i18++) {
                            fArr2[i17 + i18] = fArr[sArr[i18] + i13];
                        }
                        sArr2[i12] = (short) i11;
                        i11++;
                    }
                    i12++;
                    numIndices = i2;
                }
                fArr = fArr2;
                numVertices = i11;
            }
        } else {
            sArr2 = null;
        }
        Mesh mesh = vertexAttributeArr == null ? new Mesh(z, numVertices, sArr2 == null ? 0 : sArr2.length, getVertexAttributes()) : new Mesh(z, numVertices, sArr2 == null ? 0 : sArr2.length, vertexAttributeArr);
        mesh.setVertices(fArr, 0, numVertices * i);
        if (sArr2 != null) {
            mesh.setIndices(sArr2);
        }
        return mesh;
    }

    public Mesh disableInstancedRendering() {
        if (this.isInstanced) {
            this.isInstanced = false;
            this.instances.dispose();
            this.instances = null;
        }
        return this;
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        Map<Application, Array<Mesh>> map = meshes;
        if (map.get(Gdx.app) != null) {
            map.get(Gdx.app).removeValue(this, true);
        }
        this.vertices.dispose();
        InstanceData instanceData = this.instances;
        if (instanceData != null) {
            instanceData.dispose();
        }
        this.indices.dispose();
    }

    public Mesh enableInstancedRendering(boolean z, int i, VertexAttribute... vertexAttributeArr) {
        if (this.isInstanced) {
            throw new GdxRuntimeException("Trying to enable InstancedRendering on same Mesh instance twice. Use disableInstancedRendering to clean up old InstanceData first");
        }
        this.isInstanced = true;
        this.instances = new InstanceBufferObject(z, i, vertexAttributeArr);
        return this;
    }

    public BoundingBox extendBoundingBox(BoundingBox boundingBox, int i, int i2) {
        return extendBoundingBox(boundingBox, i, i2, null);
    }

    public IndexData getIndexData() {
        return this.indices;
    }

    public void getIndices(short[] sArr) {
        getIndices(sArr, 0);
    }

    @Deprecated
    public ShortBuffer getIndicesBuffer() {
        return this.indices.getBuffer(true);
    }

    public VertexAttributes getInstancedAttributes() {
        InstanceData instanceData = this.instances;
        if (instanceData != null) {
            return instanceData.getAttributes();
        }
        return null;
    }

    public int getMaxIndices() {
        return this.indices.getNumMaxIndices();
    }

    public int getMaxVertices() {
        return this.vertices.getNumMaxVertices();
    }

    public int getNumIndices() {
        return this.indices.getNumIndices();
    }

    public int getNumVertices() {
        return this.vertices.getNumVertices();
    }

    public VertexAttribute getVertexAttribute(int i) {
        VertexAttributes attributes = this.vertices.getAttributes();
        int size = attributes.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (attributes.get(i2).usage == i) {
                return attributes.get(i2);
            }
        }
        return null;
    }

    public VertexAttributes getVertexAttributes() {
        return this.vertices.getAttributes();
    }

    public int getVertexSize() {
        return this.vertices.getAttributes().vertexSize;
    }

    public float[] getVertices(float[] fArr) {
        return getVertices(0, -1, fArr);
    }

    @Deprecated
    public FloatBuffer getVerticesBuffer() {
        return this.vertices.getBuffer(true);
    }

    public boolean isInstanced() {
        return this.isInstanced;
    }

    public void render(ShaderProgram shaderProgram, int i) {
        render(shaderProgram, i, 0, this.indices.getNumMaxIndices() > 0 ? getNumIndices() : getNumVertices(), this.autoBind);
    }

    public void scale(float f, float f2, float f3) {
        VertexAttribute vertexAttribute = getVertexAttribute(1);
        int i = vertexAttribute.offset / 4;
        int i2 = vertexAttribute.numComponents;
        int numVertices = getNumVertices();
        int vertexSize = getVertexSize() / 4;
        float[] fArr = new float[numVertices * vertexSize];
        getVertices(fArr);
        int i3 = 0;
        if (i2 == 1) {
            while (i3 < numVertices) {
                fArr[i] = fArr[i] * f;
                i += vertexSize;
                i3++;
            }
        } else if (i2 == 2) {
            while (i3 < numVertices) {
                fArr[i] = fArr[i] * f;
                int i4 = i + 1;
                fArr[i4] = fArr[i4] * f2;
                i += vertexSize;
                i3++;
            }
        } else if (i2 == 3) {
            while (i3 < numVertices) {
                fArr[i] = fArr[i] * f;
                int i5 = i + 1;
                fArr[i5] = fArr[i5] * f2;
                int i6 = i + 2;
                fArr[i6] = fArr[i6] * f3;
                i += vertexSize;
                i3++;
            }
        }
        setVertices(fArr);
    }

    public void setAutoBind(boolean z) {
        this.autoBind = z;
    }

    public Mesh setIndices(short[] sArr) {
        this.indices.setIndices(sArr, 0, sArr.length);
        return this;
    }

    public Mesh setInstanceData(float[] fArr, int i, int i2) {
        InstanceData instanceData = this.instances;
        if (instanceData == null) {
            throw new GdxRuntimeException("An InstanceBufferObject must be set before setting instance data!");
        }
        instanceData.setInstanceData(fArr, i, i2);
        return this;
    }

    public Mesh setVertices(float[] fArr) {
        this.vertices.setVertices(fArr, 0, fArr.length);
        return this;
    }

    public void transform(Matrix4 matrix4) {
        transform(matrix4, 0, getNumVertices());
    }

    public void transformUV(Matrix3 matrix3) {
        transformUV(matrix3, 0, getNumVertices());
    }

    public void unbind(ShaderProgram shaderProgram) {
        unbind(shaderProgram, null, null);
    }

    public Mesh updateInstanceData(int i, float[] fArr) {
        return updateInstanceData(i, fArr, 0, fArr.length);
    }

    public Mesh updateVertices(int i, float[] fArr) {
        return updateVertices(i, fArr, 0, fArr.length);
    }

    public void bind(ShaderProgram shaderProgram, int[] iArr, int[] iArr2) {
        this.vertices.bind(shaderProgram, iArr);
        InstanceData instanceData = this.instances;
        if (instanceData != null && instanceData.getNumInstances() > 0) {
            this.instances.bind(shaderProgram, iArr2);
        }
        if (this.indices.getNumIndices() > 0) {
            this.indices.bind();
        }
    }

    public float calculateRadius(Vector3 vector3, int i, int i2, Matrix4 matrix4) {
        return calculateRadius(vector3.x, vector3.y, vector3.z, i, i2, matrix4);
    }

    public BoundingBox extendBoundingBox(BoundingBox boundingBox, int i, int i2, Matrix4 matrix4) {
        int i3;
        int numIndices = getNumIndices();
        int numVertices = getNumVertices();
        if (numIndices != 0) {
            numVertices = numIndices;
        }
        if (i < 0 || i2 < 1 || (i3 = i + i2) > numVertices) {
            throw new GdxRuntimeException(AbstractC5044xl.o(AbstractC3950lJ.t("Invalid part specified ( offset=", i, ", count=", i2, ", max="), numVertices, " )"));
        }
        FloatBuffer buffer = this.vertices.getBuffer(false);
        ShortBuffer buffer2 = this.indices.getBuffer(false);
        VertexAttribute vertexAttribute = getVertexAttribute(1);
        int i4 = vertexAttribute.offset / 4;
        int i5 = this.vertices.getAttributes().vertexSize / 4;
        int i6 = vertexAttribute.numComponents;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    if (numIndices > 0) {
                        while (i < i3) {
                            int i7 = ((buffer2.get(i) & 65535) * i5) + i4;
                            this.tmpV.set(buffer.get(i7), buffer.get(i7 + 1), buffer.get(i7 + 2));
                            if (matrix4 != null) {
                                this.tmpV.mul(matrix4);
                            }
                            boundingBox.ext(this.tmpV);
                            i++;
                        }
                    } else {
                        while (i < i3) {
                            int i8 = (i * i5) + i4;
                            this.tmpV.set(buffer.get(i8), buffer.get(i8 + 1), buffer.get(i8 + 2));
                            if (matrix4 != null) {
                                this.tmpV.mul(matrix4);
                            }
                            boundingBox.ext(this.tmpV);
                            i++;
                        }
                    }
                }
            } else if (numIndices > 0) {
                while (i < i3) {
                    int i9 = ((buffer2.get(i) & 65535) * i5) + i4;
                    this.tmpV.set(buffer.get(i9), buffer.get(i9 + 1), 0.0f);
                    if (matrix4 != null) {
                        this.tmpV.mul(matrix4);
                    }
                    boundingBox.ext(this.tmpV);
                    i++;
                }
            } else {
                while (i < i3) {
                    int i10 = (i * i5) + i4;
                    this.tmpV.set(buffer.get(i10), buffer.get(i10 + 1), 0.0f);
                    if (matrix4 != null) {
                        this.tmpV.mul(matrix4);
                    }
                    boundingBox.ext(this.tmpV);
                    i++;
                }
            }
        } else if (numIndices > 0) {
            while (i < i3) {
                this.tmpV.set(buffer.get(((buffer2.get(i) & 65535) * i5) + i4), 0.0f, 0.0f);
                if (matrix4 != null) {
                    this.tmpV.mul(matrix4);
                }
                boundingBox.ext(this.tmpV);
                i++;
            }
        } else {
            while (i < i3) {
                this.tmpV.set(buffer.get((i * i5) + i4), 0.0f, 0.0f);
                if (matrix4 != null) {
                    this.tmpV.mul(matrix4);
                }
                boundingBox.ext(this.tmpV);
                i++;
            }
        }
        return boundingBox;
    }

    public void getIndices(short[] sArr, int i) {
        getIndices(0, sArr, i);
    }

    public ShortBuffer getIndicesBuffer(boolean z) {
        return this.indices.getBuffer(z);
    }

    public float[] getVertices(int i, float[] fArr) {
        return getVertices(i, -1, fArr);
    }

    public FloatBuffer getVerticesBuffer(boolean z) {
        return this.vertices.getBuffer(z);
    }

    public void render(ShaderProgram shaderProgram, int i, int i2, int i3) {
        render(shaderProgram, i, i2, i3, this.autoBind);
    }

    public Mesh setIndices(short[] sArr, int i, int i2) {
        this.indices.setIndices(sArr, i, i2);
        return this;
    }

    public Mesh setVertices(float[] fArr, int i, int i2) {
        this.vertices.setVertices(fArr, i, i2);
        return this;
    }

    public void transform(Matrix4 matrix4, int i, int i2) {
        VertexAttribute vertexAttribute = getVertexAttribute(1);
        int i3 = vertexAttribute.offset / 4;
        int vertexSize = getVertexSize() / 4;
        int i4 = vertexAttribute.numComponents;
        getNumVertices();
        int i5 = i2 * vertexSize;
        float[] fArr = new float[i5];
        int i6 = i * vertexSize;
        getVertices(i6, i5, fArr);
        transform(matrix4, fArr, vertexSize, i3, i4, 0, i2);
        updateVertices(i6, fArr);
    }

    public void transformUV(Matrix3 matrix3, int i, int i2) {
        int i3 = getVertexAttribute(16).offset / 4;
        int vertexSize = getVertexSize() / 4;
        int numVertices = getNumVertices() * vertexSize;
        float[] fArr = new float[numVertices];
        getVertices(0, numVertices, fArr);
        transformUV(matrix3, fArr, vertexSize, i3, i, i2);
        setVertices(fArr, 0, numVertices);
    }

    public void unbind(ShaderProgram shaderProgram, int[] iArr, int[] iArr2) {
        this.vertices.unbind(shaderProgram, iArr);
        InstanceData instanceData = this.instances;
        if (instanceData != null && instanceData.getNumInstances() > 0) {
            this.instances.unbind(shaderProgram, iArr2);
        }
        if (this.indices.getNumIndices() > 0) {
            this.indices.unbind();
        }
    }

    public Mesh updateInstanceData(int i, float[] fArr, int i2, int i3) {
        this.instances.updateInstanceData(i, fArr, i2, i3);
        return this;
    }

    public Mesh updateVertices(int i, float[] fArr, int i2, int i3) {
        this.vertices.updateVertices(i, fArr, i2, i3);
        return this;
    }

    public void calculateBoundingBox(BoundingBox boundingBox) {
        int numVertices = getNumVertices();
        if (numVertices != 0) {
            int i = 0;
            FloatBuffer buffer = this.vertices.getBuffer(false);
            boundingBox.inf();
            VertexAttribute vertexAttribute = getVertexAttribute(1);
            int i2 = vertexAttribute.offset / 4;
            int i3 = this.vertices.getAttributes().vertexSize / 4;
            int i4 = vertexAttribute.numComponents;
            if (i4 == 1) {
                while (i < numVertices) {
                    boundingBox.ext(buffer.get(i2), 0.0f, 0.0f);
                    i2 += i3;
                    i++;
                }
                return;
            }
            if (i4 == 2) {
                while (i < numVertices) {
                    boundingBox.ext(buffer.get(i2), buffer.get(i2 + 1), 0.0f);
                    i2 += i3;
                    i++;
                }
                return;
            }
            if (i4 != 3) {
                return;
            }
            while (i < numVertices) {
                boundingBox.ext(buffer.get(i2), buffer.get(i2 + 1), buffer.get(i2 + 2));
                i2 += i3;
                i++;
            }
            return;
        }
        throw new GdxRuntimeException("No vertices defined");
    }

    public float calculateRadius(float f, float f2, float f3, int i, int i2) {
        return calculateRadius(f, f2, f3, i, i2, null);
    }

    public void getIndices(int i, short[] sArr, int i2) {
        getIndices(i, -1, sArr, i2);
    }

    public float[] getVertices(int i, int i2, float[] fArr) {
        return getVertices(i, i2, fArr, 0);
    }

    public void render(ShaderProgram shaderProgram, int i, int i2, int i3, boolean z) {
        if (i3 == 0) {
            return;
        }
        if (z) {
            bind(shaderProgram);
        }
        if (this.isVertexArray) {
            if (this.indices.getNumIndices() > 0) {
                ShortBuffer buffer = this.indices.getBuffer(false);
                int iPosition = buffer.position();
                buffer.limit();
                buffer.position(i2);
                Gdx.gl20.glDrawElements(i, i3, GL20.GL_UNSIGNED_SHORT, buffer);
                buffer.position(iPosition);
            } else {
                Gdx.gl20.glDrawArrays(i, i2, i3);
            }
        } else {
            int numInstances = this.isInstanced ? this.instances.getNumInstances() : 0;
            if (this.indices.getNumIndices() > 0) {
                if (i3 + i2 <= this.indices.getNumMaxIndices()) {
                    if (this.isInstanced && numInstances > 0) {
                        Gdx.gl30.glDrawElementsInstanced(i, i3, GL20.GL_UNSIGNED_SHORT, i2 * 2, numInstances);
                    } else {
                        Gdx.gl20.glDrawElements(i, i3, GL20.GL_UNSIGNED_SHORT, i2 * 2);
                    }
                } else {
                    StringBuilder sbT = AbstractC3950lJ.t("Mesh attempting to access memory outside of the index buffer (count: ", i3, ", offset: ", i2, ", max: ");
                    sbT.append(this.indices.getNumMaxIndices());
                    sbT.append(")");
                    throw new GdxRuntimeException(sbT.toString());
                }
            } else if (this.isInstanced && numInstances > 0) {
                Gdx.gl30.glDrawArraysInstanced(i, i2, i3, numInstances);
            } else {
                Gdx.gl20.glDrawArrays(i, i2, i3);
            }
        }
        if (z) {
            unbind(shaderProgram);
        }
    }

    public Mesh updateInstanceData(int i, FloatBuffer floatBuffer) {
        return updateInstanceData(i, floatBuffer, 0, floatBuffer.limit());
    }

    public float calculateRadius(Vector3 vector3, int i, int i2) {
        return calculateRadius(vector3.x, vector3.y, vector3.z, i, i2, null);
    }

    public void getIndices(int i, int i2, short[] sArr, int i3) {
        int numIndices = getNumIndices();
        if (i2 < 0) {
            i2 = numIndices - i;
        }
        if (i >= 0 && i < numIndices && i + i2 <= numIndices) {
            if (sArr.length - i3 >= i2) {
                ShortBuffer indicesBuffer = getIndicesBuffer(false);
                int iPosition = indicesBuffer.position();
                indicesBuffer.position(i);
                indicesBuffer.get(sArr, i3, i2);
                indicesBuffer.position(iPosition);
                return;
            }
            throw new IllegalArgumentException("not enough room in indices array, has " + sArr.length + " shorts, needs " + i2);
        }
        StringBuilder sbT = AbstractC3950lJ.t("Invalid range specified, offset: ", i, ", count: ", i2, ", max: ");
        sbT.append(numIndices);
        throw new IllegalArgumentException(sbT.toString());
    }

    public float[] getVertices(int i, int i2, float[] fArr, int i3) {
        int vertexSize = (getVertexSize() * getNumVertices()) / 4;
        if (i2 == -1 && (i2 = vertexSize - i) > fArr.length - i3) {
            i2 = fArr.length - i3;
        }
        if (i >= 0 && i2 > 0 && i + i2 <= vertexSize && i3 >= 0 && i3 < fArr.length) {
            if (fArr.length - i3 >= i2) {
                FloatBuffer verticesBuffer = getVerticesBuffer(false);
                int iPosition = verticesBuffer.position();
                verticesBuffer.position(i);
                verticesBuffer.get(fArr, i3, i2);
                verticesBuffer.position(iPosition);
                return fArr;
            }
            throw new IllegalArgumentException("not enough room in vertices array, has " + fArr.length + " floats, needs " + i2);
        }
        throw new IndexOutOfBoundsException();
    }

    public Mesh setInstanceData(float[] fArr) {
        InstanceData instanceData = this.instances;
        if (instanceData != null) {
            instanceData.setInstanceData(fArr, 0, fArr.length);
            return this;
        }
        throw new GdxRuntimeException("An InstanceBufferObject must be set before setting instance data!");
    }

    public Mesh updateInstanceData(int i, FloatBuffer floatBuffer, int i2, int i3) {
        this.instances.updateInstanceData(i, floatBuffer, i2, i3);
        return this;
    }

    public float calculateRadius(float f, float f2, float f3) {
        return calculateRadius(f, f2, f3, 0, getNumIndices(), null);
    }

    public float calculateRadius(Vector3 vector3) {
        return calculateRadius(vector3.x, vector3.y, vector3.z, 0, getNumIndices(), null);
    }

    public Mesh setInstanceData(FloatBuffer floatBuffer, int i) {
        InstanceData instanceData = this.instances;
        if (instanceData != null) {
            instanceData.setInstanceData(floatBuffer, i);
            return this;
        }
        throw new GdxRuntimeException("An InstanceBufferObject must be set before setting instance data!");
    }

    public Mesh(boolean z, int i, int i2, VertexAttribute... vertexAttributeArr) {
        this.autoBind = true;
        this.isInstanced = false;
        this.tmpV = new Vector3();
        this.vertices = makeVertexBuffer(z, i, new VertexAttributes(vertexAttributeArr));
        this.indices = new IndexBufferObject(z, i2);
        this.isVertexArray = false;
        addManagedMesh(Gdx.app, this);
    }

    public static void transformUV(Matrix3 matrix3, float[] fArr, int i, int i2, int i3, int i4) {
        if (i3 >= 0 && i4 >= 1 && (i3 + i4) * i <= fArr.length) {
            Vector2 vector2 = new Vector2();
            int i5 = (i3 * i) + i2;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = i5 + 1;
                vector2.set(fArr[i5], fArr[i7]).mul(matrix3);
                fArr[i5] = vector2.x;
                fArr[i7] = vector2.y;
                i5 += i;
            }
            return;
        }
        StringBuilder sbT = AbstractC3950lJ.t("start = ", i3, ", count = ", i4, ", vertexSize = ");
        sbT.append(i);
        sbT.append(", length = ");
        sbT.append(fArr.length);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public Mesh setInstanceData(FloatBuffer floatBuffer) {
        InstanceData instanceData = this.instances;
        if (instanceData != null) {
            instanceData.setInstanceData(floatBuffer, floatBuffer.limit());
            return this;
        }
        throw new GdxRuntimeException("An InstanceBufferObject must be set before setting instance data!");
    }

    public static void transform(Matrix4 matrix4, float[] fArr, int i, int i2, int i3, int i4, int i5) {
        if (i2 >= 0 && i3 >= 1 && i2 + i3 <= i) {
            if (i4 >= 0 && i5 >= 1 && (i4 + i5) * i <= fArr.length) {
                Vector3 vector3 = new Vector3();
                int i6 = (i4 * i) + i2;
                int i7 = 0;
                if (i3 == 1) {
                    while (i7 < i5) {
                        vector3.set(fArr[i6], 0.0f, 0.0f).mul(matrix4);
                        fArr[i6] = vector3.x;
                        i6 += i;
                        i7++;
                    }
                    return;
                }
                if (i3 == 2) {
                    while (i7 < i5) {
                        int i8 = i6 + 1;
                        vector3.set(fArr[i6], fArr[i8], 0.0f).mul(matrix4);
                        fArr[i6] = vector3.x;
                        fArr[i8] = vector3.y;
                        i6 += i;
                        i7++;
                    }
                    return;
                }
                if (i3 != 3) {
                    return;
                }
                while (i7 < i5) {
                    int i9 = i6 + 1;
                    int i10 = i6 + 2;
                    vector3.set(fArr[i6], fArr[i9], fArr[i10]).mul(matrix4);
                    fArr[i6] = vector3.x;
                    fArr[i9] = vector3.y;
                    fArr[i10] = vector3.z;
                    i6 += i;
                    i7++;
                }
                return;
            }
            StringBuilder sbT = AbstractC3950lJ.t("start = ", i4, ", count = ", i5, ", vertexSize = ");
            sbT.append(i);
            sbT.append(", length = ");
            sbT.append(fArr.length);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        throw new IndexOutOfBoundsException();
    }

    public BoundingBox calculateBoundingBox(BoundingBox boundingBox, int i, int i2) {
        return extendBoundingBox(boundingBox.inf(), i, i2);
    }

    public BoundingBox calculateBoundingBox(BoundingBox boundingBox, int i, int i2, Matrix4 matrix4) {
        return extendBoundingBox(boundingBox.inf(), i, i2, matrix4);
    }

    public Mesh(boolean z, int i, int i2, VertexAttributes vertexAttributes) {
        this.autoBind = true;
        this.isInstanced = false;
        this.tmpV = new Vector3();
        this.vertices = makeVertexBuffer(z, i, vertexAttributes);
        this.indices = new IndexBufferObject(z, i2);
        this.isVertexArray = false;
        addManagedMesh(Gdx.app, this);
    }

    public Mesh(boolean z, boolean z2, int i, int i2, VertexAttributes vertexAttributes) {
        this.autoBind = true;
        this.isInstanced = false;
        this.tmpV = new Vector3();
        this.vertices = makeVertexBuffer(z, i, vertexAttributes);
        this.indices = new IndexBufferObject(z2, i2);
        this.isVertexArray = false;
        addManagedMesh(Gdx.app, this);
    }

    public Mesh(VertexDataType vertexDataType, boolean z, int i, int i2, VertexAttribute... vertexAttributeArr) {
        this(vertexDataType, z, i, i2, new VertexAttributes(vertexAttributeArr));
    }

    public Mesh copy(boolean z) {
        return copy(z, false, null);
    }

    public Mesh(VertexDataType vertexDataType, boolean z, int i, int i2, VertexAttributes vertexAttributes) {
        this.autoBind = true;
        this.isInstanced = false;
        this.tmpV = new Vector3();
        int i3 = AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Mesh$VertexDataType[vertexDataType.ordinal()];
        if (i3 == 1) {
            this.vertices = new VertexBufferObject(z, i, vertexAttributes);
            this.indices = new IndexBufferObject(z, i2);
            this.isVertexArray = false;
        } else if (i3 == 2) {
            this.vertices = new VertexBufferObjectSubData(z, i, vertexAttributes);
            this.indices = new IndexBufferObjectSubData(z, i2);
            this.isVertexArray = false;
        } else if (i3 != 3) {
            this.vertices = new VertexArray(i, vertexAttributes);
            this.indices = new IndexArray(i2);
            this.isVertexArray = true;
        } else {
            this.vertices = new VertexBufferObjectWithVAO(z, i, vertexAttributes);
            this.indices = new IndexBufferObjectSubData(z, i2);
            this.isVertexArray = false;
        }
        addManagedMesh(Gdx.app, this);
    }
}
