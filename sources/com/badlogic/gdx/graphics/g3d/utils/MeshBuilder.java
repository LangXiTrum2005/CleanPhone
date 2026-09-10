package com.badlogic.gdx.graphics.g3d.utils;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.VertexAttributes;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g3d.model.MeshPart;
import com.badlogic.gdx.graphics.g3d.utils.shapebuilders.ArrowShapeBuilder;
import com.badlogic.gdx.graphics.g3d.utils.shapebuilders.BoxShapeBuilder;
import com.badlogic.gdx.graphics.g3d.utils.shapebuilders.CapsuleShapeBuilder;
import com.badlogic.gdx.graphics.g3d.utils.shapebuilders.ConeShapeBuilder;
import com.badlogic.gdx.graphics.g3d.utils.shapebuilders.CylinderShapeBuilder;
import com.badlogic.gdx.graphics.g3d.utils.shapebuilders.EllipseShapeBuilder;
import com.badlogic.gdx.graphics.g3d.utils.shapebuilders.PatchShapeBuilder;
import com.badlogic.gdx.graphics.g3d.utils.shapebuilders.SphereShapeBuilder;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.FloatArray;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.IntIntMap;
import com.badlogic.gdx.utils.ShortArray;

/* JADX INFO: loaded from: classes.dex */
public class MeshBuilder implements MeshPartBuilder {
    public static final int MAX_INDEX = 65535;
    public static final int MAX_VERTICES = 65536;
    private VertexAttributes attributes;
    private int biNorOffset;
    private int colOffset;
    private int colSize;
    private int cpOffset;
    private int istart;
    private int norOffset;
    private MeshPart part;
    private int posOffset;
    private int posSize;
    private int primitiveType;
    private int stride;
    private int tangentOffset;
    private int uvOffset;
    private float[] vertex;
    private int vindex;
    private static final ShortArray tmpIndices = new ShortArray();
    private static final FloatArray tmpVertices = new FloatArray();
    private static final Vector3 vTmp = new Vector3();
    private static IntIntMap indicesMap = null;
    private final MeshPartBuilder.VertexInfo vertTmp1 = new MeshPartBuilder.VertexInfo();
    private final MeshPartBuilder.VertexInfo vertTmp2 = new MeshPartBuilder.VertexInfo();
    private final MeshPartBuilder.VertexInfo vertTmp3 = new MeshPartBuilder.VertexInfo();
    private final MeshPartBuilder.VertexInfo vertTmp4 = new MeshPartBuilder.VertexInfo();
    private final Color tempC1 = new Color();
    private FloatArray vertices = new FloatArray();
    private ShortArray indices = new ShortArray();
    private Array<MeshPart> parts = new Array<>();
    private final Color color = new Color(Color.WHITE);
    private boolean hasColor = false;
    private float uOffset = 0.0f;
    private float uScale = 1.0f;
    private float vOffset = 0.0f;
    private float vScale = 1.0f;
    private boolean hasUVTransform = false;
    private boolean vertexTransformationEnabled = false;
    private final Matrix4 positionTransform = new Matrix4();
    private final Matrix3 normalTransform = new Matrix3();
    private final BoundingBox bounds = new BoundingBox();
    private int lastIndex = -1;
    private final Vector3 tmpNormal = new Vector3();

    private final void addVertex(float[] fArr, int i) {
        int i2;
        FloatArray floatArray = this.vertices;
        int i3 = floatArray.size;
        floatArray.addAll(fArr, i, this.stride);
        int i4 = this.vindex;
        this.vindex = i4 + 1;
        this.lastIndex = i4;
        if (this.vertexTransformationEnabled) {
            transformPosition(this.vertices.items, this.posOffset + i3, this.posSize, this.positionTransform);
            int i5 = this.norOffset;
            if (i5 >= 0) {
                transformNormal(this.vertices.items, i5 + i3, 3, this.normalTransform);
            }
            int i6 = this.biNorOffset;
            if (i6 >= 0) {
                transformNormal(this.vertices.items, i6 + i3, 3, this.normalTransform);
            }
            int i7 = this.tangentOffset;
            if (i7 >= 0) {
                transformNormal(this.vertices.items, i7 + i3, 3, this.normalTransform);
            }
        }
        float[] fArr2 = this.vertices.items;
        int i8 = this.posOffset;
        float f = fArr2[i3 + i8];
        int i9 = this.posSize;
        this.bounds.ext(f, i9 > 1 ? fArr2[i3 + i8 + 1] : 0.0f, i9 > 2 ? fArr2[i8 + i3 + 2] : 0.0f);
        if (this.hasColor) {
            int i10 = this.colOffset;
            if (i10 >= 0) {
                float[] fArr3 = this.vertices.items;
                int i11 = i3 + i10;
                float f2 = fArr3[i11];
                Color color = this.color;
                fArr3[i11] = f2 * color.r;
                int i12 = i3 + i10 + 1;
                fArr3[i12] = fArr3[i12] * color.g;
                int i13 = i3 + i10 + 2;
                fArr3[i13] = fArr3[i13] * color.b;
                if (this.colSize > 3) {
                    int i14 = i10 + i3 + 3;
                    fArr3[i14] = fArr3[i14] * color.f202a;
                }
            } else {
                int i15 = this.cpOffset;
                if (i15 >= 0) {
                    Color.abgr8888ToColor(this.tempC1, this.vertices.items[i15 + i3]);
                    this.vertices.items[this.cpOffset + i3] = this.tempC1.mul(this.color).toFloatBits();
                }
            }
        }
        if (!this.hasUVTransform || (i2 = this.uvOffset) < 0) {
            return;
        }
        float[] fArr4 = this.vertices.items;
        fArr4[i3 + i2] = (this.uScale * fArr4[i3 + i2]) + this.uOffset;
        fArr4[i3 + i2 + 1] = (this.vScale * fArr4[i3 + i2 + 1]) + this.vOffset;
    }

    public static VertexAttributes createAttributes(long j) {
        Array array = new Array();
        if ((j & 1) == 1) {
            array.add(new VertexAttribute(1, 3, ShaderProgram.POSITION_ATTRIBUTE));
        }
        if ((j & 2) == 2) {
            array.add(new VertexAttribute(2, 4, ShaderProgram.COLOR_ATTRIBUTE));
        }
        if ((j & 4) == 4) {
            array.add(new VertexAttribute(4, 4, ShaderProgram.COLOR_ATTRIBUTE));
        }
        if ((j & 8) == 8) {
            array.add(new VertexAttribute(8, 3, ShaderProgram.NORMAL_ATTRIBUTE));
        }
        if ((j & 16) == 16) {
            array.add(new VertexAttribute(16, 2, "a_texCoord0"));
        }
        int i = array.size;
        VertexAttribute[] vertexAttributeArr = new VertexAttribute[i];
        for (int i2 = 0; i2 < i; i2++) {
            vertexAttributeArr[i2] = (VertexAttribute) array.get(i2);
        }
        return new VertexAttributes(vertexAttributeArr);
    }

    private void endpart() {
        MeshPart meshPart = this.part;
        if (meshPart != null) {
            this.bounds.getCenter(meshPart.center);
            this.bounds.getDimensions(this.part.halfExtents).scl(0.5f);
            MeshPart meshPart2 = this.part;
            meshPart2.radius = meshPart2.halfExtents.len();
            this.bounds.inf();
            MeshPart meshPart3 = this.part;
            int i = this.istart;
            meshPart3.offset = i;
            int i2 = this.indices.size;
            meshPart3.size = i2 - i;
            this.istart = i2;
            this.part = null;
        }
    }

    private static final void transformNormal(float[] fArr, int i, int i2, Matrix3 matrix3) {
        if (i2 > 2) {
            Vector3 vector3 = vTmp;
            int i3 = i + 1;
            int i4 = i + 2;
            vector3.set(fArr[i], fArr[i3], fArr[i4]).mul(matrix3).nor();
            fArr[i] = vector3.x;
            fArr[i3] = vector3.y;
            fArr[i4] = vector3.z;
            return;
        }
        if (i2 <= 1) {
            fArr[i] = vTmp.set(fArr[i], 0.0f, 0.0f).mul(matrix3).nor().x;
            return;
        }
        Vector3 vector4 = vTmp;
        int i5 = i + 1;
        vector4.set(fArr[i], fArr[i5], 0.0f).mul(matrix3).nor();
        fArr[i] = vector4.x;
        fArr[i5] = vector4.y;
    }

    private static final void transformPosition(float[] fArr, int i, int i2, Matrix4 matrix4) {
        if (i2 > 2) {
            Vector3 vector3 = vTmp;
            int i3 = i + 1;
            int i4 = i + 2;
            vector3.set(fArr[i], fArr[i3], fArr[i4]).mul(matrix4);
            fArr[i] = vector3.x;
            fArr[i3] = vector3.y;
            fArr[i4] = vector3.z;
            return;
        }
        if (i2 <= 1) {
            fArr[i] = vTmp.set(fArr[i], 0.0f, 0.0f).mul(matrix4).x;
            return;
        }
        Vector3 vector4 = vTmp;
        int i5 = i + 1;
        vector4.set(fArr[i], fArr[i5], 0.0f).mul(matrix4);
        fArr[i] = vector4.x;
        fArr[i5] = vector4.y;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void addMesh(Mesh mesh) {
        addMesh(mesh, 0, mesh.getNumIndices());
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void arrow(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        ArrowShapeBuilder.build(this, f, f2, f3, f4, f5, f6, f7, f8, i);
    }

    public void begin(long j) {
        begin(createAttributes(j), -1);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void box(MeshPartBuilder.VertexInfo vertexInfo, MeshPartBuilder.VertexInfo vertexInfo2, MeshPartBuilder.VertexInfo vertexInfo3, MeshPartBuilder.VertexInfo vertexInfo4, MeshPartBuilder.VertexInfo vertexInfo5, MeshPartBuilder.VertexInfo vertexInfo6, MeshPartBuilder.VertexInfo vertexInfo7, MeshPartBuilder.VertexInfo vertexInfo8) {
        BoxShapeBuilder.build(this, vertexInfo, vertexInfo2, vertexInfo3, vertexInfo4, vertexInfo5, vertexInfo6, vertexInfo7, vertexInfo8);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void capsule(float f, float f2, int i) {
        CapsuleShapeBuilder.build(this, f, f2, i);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void circle(float f, int i, float f2, float f3, float f4, float f5, float f6, float f7) {
        EllipseShapeBuilder.build(this, f, i, f2, f3, f4, f5, f6, f7);
    }

    public void clear() {
        this.vertices.clear();
        this.indices.clear();
        this.parts.clear();
        this.vindex = 0;
        this.lastIndex = -1;
        this.istart = 0;
        this.part = null;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void cone(float f, float f2, float f3, int i) {
        cone(f, f2, f3, i, 0.0f, 360.0f);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void cylinder(float f, float f2, float f3, int i) {
        CylinderShapeBuilder.build(this, f, f2, f3, i);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void ellipse(float f, float f2, int i, float f3, float f4, float f5, float f6, float f7, float f8) {
        EllipseShapeBuilder.build(this, f, f2, i, f3, f4, f5, f6, f7, f8);
    }

    public Mesh end(Mesh mesh) {
        endpart();
        VertexAttributes vertexAttributes = this.attributes;
        if (vertexAttributes == null) {
            throw new GdxRuntimeException("Call begin() first");
        }
        if (!vertexAttributes.equals(mesh.getVertexAttributes())) {
            throw new GdxRuntimeException("Mesh attributes don't match");
        }
        if (mesh.getMaxVertices() * this.stride < this.vertices.size) {
            throw new GdxRuntimeException("Mesh can't hold enough vertices: " + mesh.getMaxVertices() + " * " + this.stride + " < " + this.vertices.size);
        }
        if (mesh.getMaxIndices() < this.indices.size) {
            throw new GdxRuntimeException("Mesh can't hold enough indices: " + mesh.getMaxIndices() + " < " + this.indices.size);
        }
        FloatArray floatArray = this.vertices;
        mesh.setVertices(floatArray.items, 0, floatArray.size);
        ShortArray shortArray = this.indices;
        mesh.setIndices(shortArray.items, 0, shortArray.size);
        Array.ArrayIterator<MeshPart> it = this.parts.iterator();
        while (it.hasNext()) {
            it.next().mesh = mesh;
        }
        this.parts.clear();
        this.attributes = null;
        this.vertices.clear();
        this.indices.clear();
        return mesh;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void ensureCapacity(int i, int i2) {
        ensureVertices(i);
        ensureIndices(i2);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void ensureIndices(int i) {
        this.indices.ensureCapacity(i);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void ensureRectangleIndices(int i) {
        int i2 = this.primitiveType;
        if (i2 == 0) {
            ensureIndices(i * 4);
        } else if (i2 == 1) {
            ensureIndices(i * 8);
        } else {
            ensureIndices(i * 6);
        }
    }

    @Deprecated
    public void ensureRectangles(int i, int i2) {
        ensureVertices(i);
        ensureRectangleIndices(i2);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void ensureTriangleIndices(int i) {
        int i2 = this.primitiveType;
        if (i2 == 1) {
            ensureIndices(i * 6);
        } else {
            if (i2 != 4 && i2 != 0) {
                throw new GdxRuntimeException("Incorrect primtive type");
            }
            ensureIndices(i * 3);
        }
    }

    @Deprecated
    public void ensureTriangles(int i, int i2) {
        ensureVertices(i);
        ensureTriangleIndices(i2);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void ensureVertices(int i) {
        this.vertices.ensureCapacity(this.stride * i);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public VertexAttributes getAttributes() {
        return this.attributes;
    }

    public int getFloatsPerVertex() {
        return this.stride;
    }

    public void getIndices(short[] sArr, int i) {
        if (this.attributes == null) {
            throw new GdxRuntimeException("Must be called in between #begin and #end");
        }
        if (i >= 0) {
            int length = sArr.length;
            ShortArray shortArray = this.indices;
            int i2 = shortArray.size;
            if (i <= length - i2) {
                System.arraycopy(shortArray.items, 0, sArr, i, i2);
                return;
            }
        }
        throw new GdxRuntimeException("Array too small or offset out of range");
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public MeshPart getMeshPart() {
        return this.part;
    }

    public int getNumIndices() {
        return this.indices.size;
    }

    public int getNumVertices() {
        return this.vertices.size / this.stride;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public int getPrimitiveType() {
        return this.primitiveType;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public Matrix4 getVertexTransform(Matrix4 matrix4) {
        return matrix4.set(this.positionTransform);
    }

    public void getVertices(float[] fArr, int i) {
        if (this.attributes == null) {
            throw new GdxRuntimeException("Must be called in between #begin and #end");
        }
        if (i >= 0) {
            int length = fArr.length;
            FloatArray floatArray = this.vertices;
            int i2 = floatArray.size;
            if (i <= length - i2) {
                System.arraycopy(floatArray.items, 0, fArr, i, i2);
                return;
            }
        }
        throw new GdxRuntimeException("Array too small or offset out of range");
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void index(short s) {
        this.indices.add(s);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public boolean isVertexTransformationEnabled() {
        return this.vertexTransformationEnabled;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public int lastIndex() {
        return this.lastIndex;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void line(short s, short s2) {
        if (this.primitiveType != 1) {
            throw new GdxRuntimeException("Incorrect primitive type");
        }
        index(s, s2);
    }

    public MeshPart part(String str, int i) {
        return part(str, i, new MeshPart());
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void patch(MeshPartBuilder.VertexInfo vertexInfo, MeshPartBuilder.VertexInfo vertexInfo2, MeshPartBuilder.VertexInfo vertexInfo3, MeshPartBuilder.VertexInfo vertexInfo4, int i, int i2) {
        PatchShapeBuilder.build(this, vertexInfo, vertexInfo2, vertexInfo3, vertexInfo4, i, i2);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void rect(short s, short s2, short s3, short s4) {
        int i = this.primitiveType;
        if (i == 4) {
            index(s, s2, s3, s3, s4, s);
        } else if (i == 1) {
            index(s, s2, s2, s3, s3, s4, s4, s);
        } else {
            if (i != 0) {
                throw new GdxRuntimeException("Incorrect primitive type");
            }
            index(s, s2, s3, s4);
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void setColor(float f, float f2, float f3, float f4) {
        this.color.set(f, f2, f3, f4);
        this.hasColor = !this.color.equals(Color.WHITE);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void setUVRange(float f, float f2, float f3, float f4) {
        this.uOffset = f;
        this.vOffset = f2;
        this.uScale = f3 - f;
        this.vScale = f4 - f2;
        this.hasUVTransform = (MathUtils.isZero(f) && MathUtils.isZero(f2) && MathUtils.isEqual(f3, 1.0f) && MathUtils.isEqual(f4, 1.0f)) ? false : true;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void setVertexTransform(Matrix4 matrix4) {
        boolean z = matrix4 != null;
        this.vertexTransformationEnabled = z;
        if (z) {
            this.positionTransform.set(matrix4);
            this.normalTransform.set(matrix4).inv().transpose();
        } else {
            this.positionTransform.idt();
            this.normalTransform.idt();
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void setVertexTransformationEnabled(boolean z) {
        this.vertexTransformationEnabled = z;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void sphere(float f, float f2, float f3, int i, int i2) {
        SphereShapeBuilder.build(this, f, f2, f3, i, i2);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void triangle(short s, short s2, short s3) {
        int i = this.primitiveType;
        if (i == 4 || i == 0) {
            index(s, s2, s3);
        } else {
            if (i != 1) {
                throw new GdxRuntimeException("Incorrect primitive type");
            }
            index(s, s2, s2, s3, s3, s);
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public short vertex(Vector3 vector3, Vector3 vector4, Color color, Vector2 vector2) {
        int i;
        if (this.vindex > 65535) {
            throw new GdxRuntimeException("Too many vertices used");
        }
        float[] fArr = this.vertex;
        int i2 = this.posOffset;
        fArr[i2] = vector3.x;
        int i3 = this.posSize;
        if (i3 > 1) {
            fArr[i2 + 1] = vector3.y;
        }
        if (i3 > 2) {
            fArr[i2 + 2] = vector3.z;
        }
        if (this.norOffset >= 0) {
            if (vector4 == null) {
                vector4 = this.tmpNormal.set(vector3).nor();
            }
            float[] fArr2 = this.vertex;
            int i4 = this.norOffset;
            fArr2[i4] = vector4.x;
            fArr2[i4 + 1] = vector4.y;
            fArr2[i4 + 2] = vector4.z;
        }
        int i5 = this.colOffset;
        if (i5 >= 0) {
            if (color == null) {
                color = Color.WHITE;
            }
            float[] fArr3 = this.vertex;
            fArr3[i5] = color.r;
            fArr3[i5 + 1] = color.g;
            fArr3[i5 + 2] = color.b;
            if (this.colSize > 3) {
                fArr3[i5 + 3] = color.f202a;
            }
        } else {
            int i6 = this.cpOffset;
            if (i6 > 0) {
                if (color == null) {
                    color = Color.WHITE;
                }
                this.vertex[i6] = color.toFloatBits();
            }
        }
        if (vector2 != null && (i = this.uvOffset) >= 0) {
            float[] fArr4 = this.vertex;
            fArr4[i] = vector2.x;
            fArr4[i + 1] = vector2.y;
        }
        addVertex(this.vertex, 0);
        return (short) this.lastIndex;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void addMesh(MeshPart meshPart) {
        if (meshPart.primitiveType != this.primitiveType) {
            throw new GdxRuntimeException("Primitive type doesn't match");
        }
        addMesh(meshPart.mesh, meshPart.offset, meshPart.size);
    }

    public void begin(VertexAttributes vertexAttributes) {
        begin(vertexAttributes, -1);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void box(Vector3 vector3, Vector3 vector4, Vector3 vector5, Vector3 vector6, Vector3 vector7, Vector3 vector8, Vector3 vector9, Vector3 vector10) {
        BoxShapeBuilder.build(this, vector3, vector4, vector5, vector6, vector7, vector8, vector9, vector10);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void circle(float f, int i, Vector3 vector3, Vector3 vector4) {
        EllipseShapeBuilder.build(this, f, i, vector3, vector4);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void cone(float f, float f2, float f3, int i, float f4, float f5) {
        ConeShapeBuilder.build(this, f, f2, f3, i, f4, f5);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void cylinder(float f, float f2, float f3, int i, float f4, float f5) {
        CylinderShapeBuilder.build(this, f, f2, f3, i, f4, f5);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void ellipse(float f, float f2, int i, Vector3 vector3, Vector3 vector4) {
        EllipseShapeBuilder.build(this, f, f2, i, vector3, vector4);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void index(short s, short s2) {
        ensureIndices(2);
        this.indices.add(s);
        this.indices.add(s2);
    }

    public MeshPart part(String str, int i, MeshPart meshPart) {
        if (this.attributes == null) {
            throw new RuntimeException("Call begin() first");
        }
        endpart();
        this.part = meshPart;
        meshPart.id = str;
        meshPart.primitiveType = i;
        this.primitiveType = i;
        this.parts.add(meshPart);
        setColor(null);
        setVertexTransform(null);
        setUVRange(null);
        return this.part;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void patch(Vector3 vector3, Vector3 vector4, Vector3 vector5, Vector3 vector6, Vector3 vector7, int i, int i2) {
        PatchShapeBuilder.build(this, vector3, vector4, vector5, vector6, vector7, i, i2);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void sphere(Matrix4 matrix4, float f, float f2, float f3, int i, int i2) {
        SphereShapeBuilder.build(this, matrix4, f, f2, f3, i, i2);
    }

    public void begin(long j, int i) {
        begin(createAttributes(j), i);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void box(Matrix4 matrix4) {
        BoxShapeBuilder.build(this, matrix4);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void circle(float f, int i, Vector3 vector3, Vector3 vector4, Vector3 vector5, Vector3 vector6) {
        EllipseShapeBuilder.build(this, f, i, vector3, vector4, vector5, vector6);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void cylinder(float f, float f2, float f3, int i, float f4, float f5, boolean z) {
        CylinderShapeBuilder.build(this, f, f2, f3, i, f4, f5, z);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void ellipse(float f, float f2, int i, Vector3 vector3, Vector3 vector4, Vector3 vector5, Vector3 vector6) {
        EllipseShapeBuilder.build(this, f, f2, i, vector3, vector4, vector5, vector6);
    }

    @Deprecated
    public void ensureRectangles(int i) {
        ensureVertices(i * 4);
        ensureRectangleIndices(i);
    }

    @Deprecated
    public void ensureTriangles(int i) {
        ensureVertices(i * 3);
        ensureTriangleIndices(i);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void patch(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, int i, int i2) {
        PatchShapeBuilder.build(this, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, i, i2);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void setColor(Color color) {
        Color color2 = this.color;
        boolean z = color != null;
        this.hasColor = z;
        if (!z) {
            color = Color.WHITE;
        }
        color2.set(color);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void sphere(float f, float f2, float f3, int i, int i2, float f4, float f5, float f6, float f7) {
        SphereShapeBuilder.build(this, f, f2, f3, i, i2, f4, f5, f6, f7);
    }

    public void begin(VertexAttributes vertexAttributes, int i) {
        if (this.attributes == null) {
            this.attributes = vertexAttributes;
            this.vertices.clear();
            this.indices.clear();
            this.parts.clear();
            this.vindex = 0;
            this.lastIndex = -1;
            this.istart = 0;
            this.part = null;
            int i2 = vertexAttributes.vertexSize / 4;
            this.stride = i2;
            float[] fArr = this.vertex;
            if (fArr == null || fArr.length < i2) {
                this.vertex = new float[i2];
            }
            VertexAttribute vertexAttributeFindByUsage = vertexAttributes.findByUsage(1);
            if (vertexAttributeFindByUsage != null) {
                this.posOffset = vertexAttributeFindByUsage.offset / 4;
                this.posSize = vertexAttributeFindByUsage.numComponents;
                VertexAttribute vertexAttributeFindByUsage2 = vertexAttributes.findByUsage(8);
                this.norOffset = vertexAttributeFindByUsage2 == null ? -1 : vertexAttributeFindByUsage2.offset / 4;
                VertexAttribute vertexAttributeFindByUsage3 = vertexAttributes.findByUsage(256);
                this.biNorOffset = vertexAttributeFindByUsage3 == null ? -1 : vertexAttributeFindByUsage3.offset / 4;
                VertexAttribute vertexAttributeFindByUsage4 = vertexAttributes.findByUsage(128);
                this.tangentOffset = vertexAttributeFindByUsage4 == null ? -1 : vertexAttributeFindByUsage4.offset / 4;
                VertexAttribute vertexAttributeFindByUsage5 = vertexAttributes.findByUsage(2);
                this.colOffset = vertexAttributeFindByUsage5 == null ? -1 : vertexAttributeFindByUsage5.offset / 4;
                this.colSize = vertexAttributeFindByUsage5 != null ? vertexAttributeFindByUsage5.numComponents : 0;
                VertexAttribute vertexAttributeFindByUsage6 = vertexAttributes.findByUsage(4);
                this.cpOffset = vertexAttributeFindByUsage6 == null ? -1 : vertexAttributeFindByUsage6.offset / 4;
                VertexAttribute vertexAttributeFindByUsage7 = vertexAttributes.findByUsage(16);
                this.uvOffset = vertexAttributeFindByUsage7 != null ? vertexAttributeFindByUsage7.offset / 4 : -1;
                setColor(null);
                setVertexTransform(null);
                setUVRange(null);
                this.primitiveType = i;
                this.bounds.inf();
                return;
            }
            throw new GdxRuntimeException("Cannot build mesh without position attribute");
        }
        throw new RuntimeException("Call end() first");
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void box(float f, float f2, float f3) {
        BoxShapeBuilder.build(this, f, f2, f3);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void circle(float f, int i, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        EllipseShapeBuilder.build(this, f, i, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void ellipse(float f, float f2, int i, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        EllipseShapeBuilder.build(this, f, f2, i, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void line(MeshPartBuilder.VertexInfo vertexInfo, MeshPartBuilder.VertexInfo vertexInfo2) {
        ensureVertices(2);
        line(vertex(vertexInfo), vertex(vertexInfo2));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void sphere(Matrix4 matrix4, float f, float f2, float f3, int i, int i2, float f4, float f5, float f6, float f7) {
        SphereShapeBuilder.build(this, matrix4, f, f2, f3, i, i2, f4, f5, f6, f7);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void addMesh(Mesh mesh, int i, int i2) {
        if (!this.attributes.equals(mesh.getVertexAttributes())) {
            throw new GdxRuntimeException("Vertex attributes do not match");
        }
        if (i2 <= 0) {
            return;
        }
        int numVertices = mesh.getNumVertices() * this.stride;
        FloatArray floatArray = tmpVertices;
        floatArray.clear();
        floatArray.ensureCapacity(numVertices);
        floatArray.size = numVertices;
        mesh.getVertices(floatArray.items);
        ShortArray shortArray = tmpIndices;
        shortArray.clear();
        shortArray.ensureCapacity(i2);
        shortArray.size = i2;
        mesh.getIndices(i, i2, shortArray.items, 0);
        addMesh(floatArray.items, shortArray.items, 0, i2);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void box(float f, float f2, float f3, float f4, float f5, float f6) {
        BoxShapeBuilder.build(this, f, f2, f3, f4, f5, f6);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void circle(float f, int i, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        EllipseShapeBuilder.build(this, f, i, f2, f3, f4, f5, f6, f7, f8, f9);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void ellipse(float f, float f2, int i, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        EllipseShapeBuilder.build(this, f, f2, i, f3, f4, f5, f6, f7, f8, f9, f10);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void index(short s, short s2, short s3) {
        ensureIndices(3);
        this.indices.add(s);
        this.indices.add(s2);
        this.indices.add(s3);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void triangle(MeshPartBuilder.VertexInfo vertexInfo, MeshPartBuilder.VertexInfo vertexInfo2, MeshPartBuilder.VertexInfo vertexInfo3) {
        ensureVertices(3);
        triangle(vertex(vertexInfo), vertex(vertexInfo2), vertex(vertexInfo3));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void circle(float f, int i, Vector3 vector3, Vector3 vector4, float f2, float f3) {
        EllipseShapeBuilder.build(this, f, i, vector3, vector4, f2, f3);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void ellipse(float f, float f2, int i, Vector3 vector3, Vector3 vector4, float f3, float f4) {
        EllipseShapeBuilder.build(this, f, f2, i, vector3, vector4, f3, f4);
    }

    public short[] getIndices() {
        return this.indices.items;
    }

    public float[] getVertices() {
        return this.vertices.items;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void line(Vector3 vector3, Vector3 vector4) {
        line(this.vertTmp1.set(vector3, null, null, null), this.vertTmp2.set(vector4, null, null, null));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void rect(MeshPartBuilder.VertexInfo vertexInfo, MeshPartBuilder.VertexInfo vertexInfo2, MeshPartBuilder.VertexInfo vertexInfo3, MeshPartBuilder.VertexInfo vertexInfo4) {
        ensureVertices(4);
        rect(vertex(vertexInfo), vertex(vertexInfo2), vertex(vertexInfo3), vertex(vertexInfo4));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void setUVRange(TextureRegion textureRegion) {
        if (textureRegion == null) {
            this.hasUVTransform = false;
            this.vOffset = 0.0f;
            this.uOffset = 0.0f;
            this.vScale = 1.0f;
            this.uScale = 1.0f;
            return;
        }
        this.hasUVTransform = true;
        setUVRange(textureRegion.getU(), textureRegion.getV(), textureRegion.getU2(), textureRegion.getV2());
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void circle(float f, int i, Vector3 vector3, Vector3 vector4, Vector3 vector5, Vector3 vector6, float f2, float f3) {
        circle(f, i, vector3.x, vector3.y, vector3.z, vector4.x, vector4.y, vector4.z, vector5.x, vector5.y, vector5.z, vector6.x, vector6.y, vector6.z, f2, f3);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void ellipse(float f, float f2, int i, Vector3 vector3, Vector3 vector4, Vector3 vector5, Vector3 vector6, float f3, float f4) {
        EllipseShapeBuilder.build(this, f, f2, i, vector3, vector4, vector5, vector6, f3, f4);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void line(float f, float f2, float f3, float f4, float f5, float f6) {
        line(this.vertTmp1.set(null, null, null, null).setPos(f, f2, f3), this.vertTmp2.set(null, null, null, null).setPos(f4, f5, f6));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void triangle(Vector3 vector3, Vector3 vector4, Vector3 vector5) {
        triangle(this.vertTmp1.set(vector3, null, null, null), this.vertTmp2.set(vector4, null, null, null), this.vertTmp3.set(vector5, null, null, null));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void circle(float f, int i, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        EllipseShapeBuilder.build(this, f, i, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void ellipse(float f, float f2, int i, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        EllipseShapeBuilder.build(this, f, f2, i, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void line(Vector3 vector3, Color color, Vector3 vector4, Color color2) {
        line(this.vertTmp1.set(vector3, null, color, null), this.vertTmp2.set(vector4, null, color2, null));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void rect(Vector3 vector3, Vector3 vector4, Vector3 vector5, Vector3 vector6, Vector3 vector7) {
        rect(this.vertTmp1.set(vector3, vector7, null, null).setUV(0.0f, 1.0f), this.vertTmp2.set(vector4, vector7, null, null).setUV(1.0f, 1.0f), this.vertTmp3.set(vector5, vector7, null, null).setUV(1.0f, 0.0f), this.vertTmp4.set(vector6, vector7, null, null).setUV(0.0f, 0.0f));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void triangle(Vector3 vector3, Color color, Vector3 vector4, Color color2, Vector3 vector5, Color color3) {
        triangle(this.vertTmp1.set(vector3, null, color, null), this.vertTmp2.set(vector4, null, color2, null), this.vertTmp3.set(vector5, null, color3, null));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void ellipse(float f, float f2, float f3, float f4, int i, Vector3 vector3, Vector3 vector4) {
        EllipseShapeBuilder.build(this, f, f2, f3, f4, i, vector3, vector4);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void index(short s, short s2, short s3, short s4) {
        ensureIndices(4);
        this.indices.add(s);
        this.indices.add(s2);
        this.indices.add(s3);
        this.indices.add(s4);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void ellipse(float f, float f2, float f3, float f4, int i, float f5, float f6, float f7, float f8, float f9, float f10) {
        EllipseShapeBuilder.build(this, f, f2, f3, f4, i, f5, f6, f7, f8, f9, f10);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void ellipse(float f, float f2, float f3, float f4, int i, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        EllipseShapeBuilder.build(this, f, f2, f3, f4, i, f5, f6, f7, f8, f9, f10, f11, f12);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void rect(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        rect(this.vertTmp1.set(null, null, null, null).setPos(f, f2, f3).setNor(f13, f14, f15).setUV(0.0f, 1.0f), this.vertTmp2.set(null, null, null, null).setPos(f4, f5, f6).setNor(f13, f14, f15).setUV(1.0f, 1.0f), this.vertTmp3.set(null, null, null, null).setPos(f7, f8, f9).setNor(f13, f14, f15).setUV(1.0f, 0.0f), this.vertTmp4.set(null, null, null, null).setPos(f10, f11, f12).setNor(f13, f14, f15).setUV(0.0f, 0.0f));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    @Deprecated
    public void ellipse(float f, float f2, float f3, float f4, int i, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        EllipseShapeBuilder.build(this, f, f2, f3, f4, i, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void index(short s, short s2, short s3, short s4, short s5, short s6) {
        ensureIndices(6);
        this.indices.add(s);
        this.indices.add(s2);
        this.indices.add(s3);
        this.indices.add(s4);
        this.indices.add(s5);
        this.indices.add(s6);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void addMesh(float[] fArr, short[] sArr, int i, int i2) {
        IntIntMap intIntMap = indicesMap;
        if (intIntMap == null) {
            indicesMap = new IntIntMap(i2);
        } else {
            intIntMap.clear();
            indicesMap.ensureCapacity(i2);
        }
        ensureIndices(i2);
        int length = fArr.length / this.stride;
        if (length >= i2) {
            length = i2;
        }
        ensureVertices(length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = sArr[i + i3] & 65535;
            int i5 = indicesMap.get(i4, -1);
            if (i5 < 0) {
                addVertex(fArr, this.stride * i4);
                IntIntMap intIntMap2 = indicesMap;
                int i6 = this.lastIndex;
                intIntMap2.put(i4, i6);
                i5 = i6;
            }
            index((short) i5);
        }
    }

    public Mesh end() {
        return end(new Mesh(true, Math.min(this.vertices.size / this.stride, 65536), this.indices.size, this.attributes));
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void index(short s, short s2, short s3, short s4, short s5, short s6, short s7, short s8) {
        ensureIndices(8);
        this.indices.add(s);
        this.indices.add(s2);
        this.indices.add(s3);
        this.indices.add(s4);
        this.indices.add(s5);
        this.indices.add(s6);
        this.indices.add(s7);
        this.indices.add(s8);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public short vertex(float... fArr) {
        int length = fArr.length - this.stride;
        int i = 0;
        while (i <= length) {
            addVertex(fArr, i);
            i += this.stride;
        }
        return (short) this.lastIndex;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public void addMesh(float[] fArr, short[] sArr) {
        int i = this.lastIndex + 1;
        ensureVertices(fArr.length / this.stride);
        int i2 = 0;
        while (i2 < fArr.length) {
            addVertex(fArr, i2);
            i2 += this.stride;
        }
        ensureIndices(sArr.length);
        for (short s : sArr) {
            index((short) ((s & 65535) + i));
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder
    public short vertex(MeshPartBuilder.VertexInfo vertexInfo) {
        return vertex(vertexInfo.hasPosition ? vertexInfo.position : null, vertexInfo.hasNormal ? vertexInfo.normal : null, vertexInfo.hasColor ? vertexInfo.color : null, vertexInfo.hasUV ? vertexInfo.uv : null);
    }
}
