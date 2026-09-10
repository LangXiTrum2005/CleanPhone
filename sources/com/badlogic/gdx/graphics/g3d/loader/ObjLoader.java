package com.badlogic.gdx.graphics.g3d.loader;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.ModelLoader;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.model.data.ModelData;
import com.badlogic.gdx.graphics.g3d.model.data.ModelMesh;
import com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart;
import com.badlogic.gdx.graphics.g3d.model.data.ModelNode;
import com.badlogic.gdx.graphics.g3d.model.data.ModelNodePart;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.FloatArray;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
public class ObjLoader extends ModelLoader<ObjLoaderParameters> {
    public static boolean logWarning = false;
    final Array<Group> groups;
    final FloatArray norms;
    final FloatArray uvs;
    final FloatArray verts;

    public static class Group {
        boolean hasNorms;
        boolean hasUVs;
        final String name;
        Array<Integer> faces = new Array<>(200);
        int numFaces = 0;
        Material mat = new Material("");
        String materialName = MRAIDCommunicatorUtil.STATES_DEFAULT;

        public Group(String str) {
            this.name = str;
        }
    }

    public static class ObjLoaderParameters extends ModelLoader.ModelParameters {
        public boolean flipV;

        public ObjLoaderParameters() {
        }

        public ObjLoaderParameters(boolean z) {
            this.flipV = z;
        }
    }

    public ObjLoader() {
        this(null);
    }

    private int getIndex(String str, int i) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int i2 = Integer.parseInt(str);
        return i2 < 0 ? i + i2 : i2 - 1;
    }

    private Group setActiveGroup(String str) {
        Array.ArrayIterator<Group> it = this.groups.iterator();
        while (it.hasNext()) {
            Group next = it.next();
            if (next.name.equals(str)) {
                return next;
            }
        }
        Group group = new Group(str);
        this.groups.add(group);
        return group;
    }

    public Model loadModel(FileHandle fileHandle, boolean z) {
        return loadModel(fileHandle, new ObjLoaderParameters(z));
    }

    public ObjLoader(FileHandleResolver fileHandleResolver) {
        super(fileHandleResolver);
        this.verts = new FloatArray(300);
        this.norms = new FloatArray(300);
        this.uvs = new FloatArray(200);
        this.groups = new Array<>(10);
    }

    @Override // com.badlogic.gdx.assets.loaders.ModelLoader
    public ModelData loadModelData(FileHandle fileHandle, ObjLoaderParameters objLoaderParameters) {
        return loadModelData(fileHandle, objLoaderParameters != null && objLoaderParameters.flipV);
    }

    public ModelData loadModelData(FileHandle fileHandle, boolean z) {
        int i;
        String strI;
        String strI2;
        String strI3;
        char cCharAt;
        char c = 3;
        if (logWarning) {
            Gdx.app.error("ObjLoader", "Wavefront (OBJ) is not fully supported, consult the documentation for more information");
        }
        MtlLoader mtlLoader = new MtlLoader();
        Group group = new Group(MRAIDCommunicatorUtil.STATES_DEFAULT);
        this.groups.add(group);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileHandle.read()), 4096);
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strArrSplit = line.split("\\s+");
                if (strArrSplit.length < 1) {
                    break;
                }
                if (strArrSplit[0].length() != 0 && (cCharAt = strArrSplit[0].toLowerCase().charAt(0)) != '#') {
                    if (cCharAt == 'v') {
                        if (strArrSplit[0].length() == 1) {
                            this.verts.add(Float.parseFloat(strArrSplit[1]));
                            this.verts.add(Float.parseFloat(strArrSplit[2]));
                            this.verts.add(Float.parseFloat(strArrSplit[c]));
                        } else if (strArrSplit[0].charAt(1) == 'n') {
                            this.norms.add(Float.parseFloat(strArrSplit[1]));
                            this.norms.add(Float.parseFloat(strArrSplit[2]));
                            this.norms.add(Float.parseFloat(strArrSplit[c]));
                        } else if (strArrSplit[0].charAt(1) == 't') {
                            this.uvs.add(Float.parseFloat(strArrSplit[1]));
                            this.uvs.add(z ? 1.0f - Float.parseFloat(strArrSplit[2]) : Float.parseFloat(strArrSplit[2]));
                        }
                    } else if (cCharAt == 'f') {
                        Array<Integer> array = group.faces;
                        for (int i2 = 1; i2 < strArrSplit.length - 2; i2++) {
                            String[] strArrSplit2 = strArrSplit[1].split("/");
                            array.add(Integer.valueOf(getIndex(strArrSplit2[0], this.verts.size)));
                            if (strArrSplit2.length > 2) {
                                if (i2 == 1) {
                                    group.hasNorms = true;
                                }
                                array.add(Integer.valueOf(getIndex(strArrSplit2[2], this.norms.size)));
                            }
                            if (strArrSplit2.length > 1 && strArrSplit2[1].length() > 0) {
                                if (i2 == 1) {
                                    group.hasUVs = true;
                                }
                                array.add(Integer.valueOf(getIndex(strArrSplit2[1], this.uvs.size)));
                            }
                            String[] strArrSplit3 = strArrSplit[i2 + 1].split("/");
                            array.add(Integer.valueOf(getIndex(strArrSplit3[0], this.verts.size)));
                            if (strArrSplit3.length > 2) {
                                array.add(Integer.valueOf(getIndex(strArrSplit3[2], this.norms.size)));
                            }
                            if (strArrSplit3.length > 1 && strArrSplit3[1].length() > 0) {
                                array.add(Integer.valueOf(getIndex(strArrSplit3[1], this.uvs.size)));
                            }
                            String[] strArrSplit4 = strArrSplit[i2 + 2].split("/");
                            array.add(Integer.valueOf(getIndex(strArrSplit4[0], this.verts.size)));
                            if (strArrSplit4.length > 2) {
                                array.add(Integer.valueOf(getIndex(strArrSplit4[2], this.norms.size)));
                            }
                            if (strArrSplit4.length > 1 && strArrSplit4[1].length() > 0) {
                                array.add(Integer.valueOf(getIndex(strArrSplit4[1], this.uvs.size)));
                            }
                            group.numFaces++;
                        }
                    } else if (cCharAt != 'o' && cCharAt != 'g') {
                        if (strArrSplit[0].equals("mtllib")) {
                            mtlLoader.load(fileHandle.parent().child(strArrSplit[1]));
                        } else if (strArrSplit[0].equals("usemtl")) {
                            if (strArrSplit.length == 1) {
                                group.materialName = MRAIDCommunicatorUtil.STATES_DEFAULT;
                            } else {
                                group.materialName = strArrSplit[1].replace('.', '_');
                            }
                        }
                    } else if (strArrSplit.length > 1) {
                        group = setActiveGroup(strArrSplit[1]);
                    } else {
                        group = setActiveGroup(MRAIDCommunicatorUtil.STATES_DEFAULT);
                    }
                }
                c = 3;
            } catch (IOException unused) {
                return null;
            }
        }
        bufferedReader.close();
        int i3 = 0;
        while (true) {
            Array<Group> array2 = this.groups;
            i = array2.size;
            if (i3 >= i) {
                break;
            }
            if (array2.get(i3).numFaces < 1) {
                this.groups.removeIndex(i3);
                i3--;
            }
            i3++;
        }
        if (i < 1) {
            return null;
        }
        ModelData modelData = new ModelData();
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            Group group2 = this.groups.get(i4);
            Array<Integer> array3 = group2.faces;
            int i6 = array3.size;
            int i7 = group2.numFaces;
            boolean z2 = group2.hasNorms;
            boolean z3 = group2.hasUVs;
            int i8 = i7 * 3;
            float[] fArr = new float[((z2 ? 3 : 0) + 3 + (z3 ? 2 : 0)) * i8];
            int i9 = 0;
            int i10 = 0;
            while (i9 < i6) {
                int i11 = i;
                int i12 = i9 + 1;
                int i13 = i6;
                int iIntValue = array3.get(i9).intValue() * 3;
                int i14 = i4;
                MtlLoader mtlLoader2 = mtlLoader;
                fArr[i10] = this.verts.get(iIntValue);
                fArr[i10 + 1] = this.verts.get(iIntValue + 1);
                int i15 = i10 + 3;
                fArr[i10 + 2] = this.verts.get(iIntValue + 2);
                if (z2) {
                    int iIntValue2 = array3.get(i12).intValue() * 3;
                    fArr[i15] = this.norms.get(iIntValue2);
                    fArr[i10 + 4] = this.norms.get(iIntValue2 + 1);
                    fArr[i10 + 5] = this.norms.get(iIntValue2 + 2);
                    i15 = i10 + 6;
                    i12 = i9 + 2;
                }
                if (z3) {
                    int i16 = i12 + 1;
                    int iIntValue3 = array3.get(i12).intValue() * 2;
                    fArr[i15] = this.uvs.get(iIntValue3);
                    fArr[i15 + 1] = this.uvs.get(iIntValue3 + 1);
                    i9 = i16;
                    i10 = i15 + 2;
                } else {
                    i10 = i15;
                    i9 = i12;
                }
                i = i11;
                i6 = i13;
                i4 = i14;
                mtlLoader = mtlLoader2;
            }
            int i17 = i4;
            int i18 = i;
            MtlLoader mtlLoader3 = mtlLoader;
            if (i8 >= 32767) {
                i8 = 0;
            }
            short[] sArr = new short[i8];
            if (i8 > 0) {
                for (int i19 = 0; i19 < i8; i19++) {
                    sArr[i19] = (short) i19;
                }
            }
            Array array4 = new Array();
            array4.add(new VertexAttribute(1, 3, ShaderProgram.POSITION_ATTRIBUTE));
            if (z2) {
                array4.add(new VertexAttribute(8, 3, ShaderProgram.NORMAL_ATTRIBUTE));
            }
            if (z3) {
                array4.add(new VertexAttribute(16, 2, "a_texCoord0"));
            }
            i5++;
            String string = Integer.toString(i5);
            if (MRAIDCommunicatorUtil.STATES_DEFAULT.equals(group2.name)) {
                strI = AbstractC3888ke0.i("node", string);
            } else {
                strI = group2.name;
            }
            if (MRAIDCommunicatorUtil.STATES_DEFAULT.equals(group2.name)) {
                strI2 = AbstractC3888ke0.i("mesh", string);
            } else {
                strI2 = group2.name;
            }
            if (MRAIDCommunicatorUtil.STATES_DEFAULT.equals(group2.name)) {
                strI3 = AbstractC3888ke0.i("part", string);
            } else {
                strI3 = group2.name;
            }
            ModelNode modelNode = new ModelNode();
            modelNode.id = strI;
            modelNode.meshId = strI2;
            modelNode.scale = new Vector3(1.0f, 1.0f, 1.0f);
            modelNode.translation = new Vector3();
            modelNode.rotation = new Quaternion();
            ModelNodePart modelNodePart = new ModelNodePart();
            modelNodePart.meshPartId = strI3;
            modelNodePart.materialId = group2.materialName;
            modelNode.parts = new ModelNodePart[]{modelNodePart};
            ModelMeshPart modelMeshPart = new ModelMeshPart();
            modelMeshPart.id = strI3;
            modelMeshPart.indices = sArr;
            modelMeshPart.primitiveType = 4;
            ModelMesh modelMesh = new ModelMesh();
            modelMesh.id = strI2;
            modelMesh.attributes = (VertexAttribute[]) array4.toArray(VertexAttribute.class);
            modelMesh.vertices = fArr;
            modelMesh.parts = new ModelMeshPart[]{modelMeshPart};
            modelData.nodes.add(modelNode);
            modelData.meshes.add(modelMesh);
            modelData.materials.add(mtlLoader3.getMaterial(group2.materialName));
            i = i18;
            i4 = i17 + 1;
            mtlLoader = mtlLoader3;
        }
        FloatArray floatArray = this.verts;
        if (floatArray.size > 0) {
            floatArray.clear();
        }
        FloatArray floatArray2 = this.norms;
        if (floatArray2.size > 0) {
            floatArray2.clear();
        }
        FloatArray floatArray3 = this.uvs;
        if (floatArray3.size > 0) {
            floatArray3.clear();
        }
        Array<Group> array5 = this.groups;
        if (array5.size > 0) {
            array5.clear();
        }
        return modelData;
    }
}
