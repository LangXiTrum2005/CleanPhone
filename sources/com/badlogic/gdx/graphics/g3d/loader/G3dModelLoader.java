package com.badlogic.gdx.graphics.g3d.loader;

import androidx.constraintlayout.motion.widget.Key;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.ModelLoader;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.FloatAttribute;
import com.badlogic.gdx.graphics.g3d.model.data.ModelAnimation;
import com.badlogic.gdx.graphics.g3d.model.data.ModelData;
import com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial;
import com.badlogic.gdx.graphics.g3d.model.data.ModelMesh;
import com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart;
import com.badlogic.gdx.graphics.g3d.model.data.ModelNode;
import com.badlogic.gdx.graphics.g3d.model.data.ModelNodeAnimation;
import com.badlogic.gdx.graphics.g3d.model.data.ModelNodeKeyframe;
import com.badlogic.gdx.graphics.g3d.model.data.ModelNodePart;
import com.badlogic.gdx.graphics.g3d.model.data.ModelTexture;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ArrayMap;
import com.badlogic.gdx.utils.BaseJsonReader;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.JsonValue;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public class G3dModelLoader extends ModelLoader<ModelLoader.ModelParameters> {
    public static final short VERSION_HI = 0;
    public static final short VERSION_LO = 1;
    protected final BaseJsonReader reader;
    protected final Quaternion tempQ;

    public G3dModelLoader(BaseJsonReader baseJsonReader) {
        this(baseJsonReader, null);
    }

    @Override // com.badlogic.gdx.assets.loaders.ModelLoader
    public ModelData loadModelData(FileHandle fileHandle, ModelLoader.ModelParameters modelParameters) {
        return parseModel(fileHandle);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [T, com.badlogic.gdx.math.Vector3] */
    /* JADX WARN: Type inference failed for: r15v6, types: [T, com.badlogic.gdx.math.Vector3] */
    /* JADX WARN: Type inference failed for: r8v8, types: [T, com.badlogic.gdx.math.Quaternion] */
    /* JADX WARN: Type inference failed for: r9v10, types: [T, com.badlogic.gdx.math.Vector3] */
    /* JADX WARN: Type inference failed for: r9v15, types: [T, com.badlogic.gdx.math.Vector3] */
    /* JADX WARN: Type inference failed for: r9v17, types: [T, com.badlogic.gdx.math.Quaternion] */
    public void parseAnimations(ModelData modelData, JsonValue jsonValue) {
        ModelData modelData2 = modelData;
        JsonValue jsonValue2 = jsonValue.get("animations");
        if (jsonValue2 == null) {
            return;
        }
        modelData2.animations.ensureCapacity(jsonValue2.size);
        JsonValue jsonValue3 = jsonValue2.child;
        while (jsonValue3 != null) {
            JsonValue jsonValue4 = jsonValue3.get("bones");
            if (jsonValue4 != null) {
                ModelAnimation modelAnimation = new ModelAnimation();
                modelData2.animations.add(modelAnimation);
                modelAnimation.nodeAnimations.ensureCapacity(jsonValue4.size);
                modelAnimation.id = jsonValue3.getString("id");
                for (JsonValue jsonValue5 = jsonValue4.child; jsonValue5 != null; jsonValue5 = jsonValue5.next) {
                    ModelNodeAnimation modelNodeAnimation = new ModelNodeAnimation();
                    modelAnimation.nodeAnimations.add(modelNodeAnimation);
                    modelNodeAnimation.nodeId = jsonValue5.getString("boneId");
                    JsonValue jsonValue6 = jsonValue5.get("keyframes");
                    float f = 1000.0f;
                    float f2 = 0.0f;
                    int i = 2;
                    int i2 = 1;
                    int i3 = 0;
                    int i4 = 3;
                    if (jsonValue6 == null || !jsonValue6.isArray()) {
                        JsonValue jsonValue7 = jsonValue5.get("translation");
                        if (jsonValue7 != null && jsonValue7.isArray()) {
                            Array<ModelNodeKeyframe<Vector3>> array = new Array<>();
                            modelNodeAnimation.translation = array;
                            array.ensureCapacity(jsonValue7.size);
                            for (JsonValue jsonValue8 = jsonValue7.child; jsonValue8 != null; jsonValue8 = jsonValue8.next) {
                                ModelNodeKeyframe<Vector3> modelNodeKeyframe = new ModelNodeKeyframe<>();
                                modelNodeAnimation.translation.add(modelNodeKeyframe);
                                modelNodeKeyframe.keytime = jsonValue8.getFloat("keytime", 0.0f) / 1000.0f;
                                JsonValue jsonValue9 = jsonValue8.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                if (jsonValue9 != null && jsonValue9.size >= 3) {
                                    modelNodeKeyframe.value = new Vector3(jsonValue9.getFloat(0), jsonValue9.getFloat(1), jsonValue9.getFloat(2));
                                }
                            }
                        }
                        JsonValue jsonValue10 = jsonValue5.get(Key.ROTATION);
                        if (jsonValue10 != null && jsonValue10.isArray()) {
                            Array<ModelNodeKeyframe<Quaternion>> array2 = new Array<>();
                            modelNodeAnimation.rotation = array2;
                            array2.ensureCapacity(jsonValue10.size);
                            for (JsonValue jsonValue11 = jsonValue10.child; jsonValue11 != null; jsonValue11 = jsonValue11.next) {
                                ModelNodeKeyframe<Quaternion> modelNodeKeyframe2 = new ModelNodeKeyframe<>();
                                modelNodeAnimation.rotation.add(modelNodeKeyframe2);
                                modelNodeKeyframe2.keytime = jsonValue11.getFloat("keytime", 0.0f) / 1000.0f;
                                JsonValue jsonValue12 = jsonValue11.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                if (jsonValue12 != null && jsonValue12.size >= 4) {
                                    modelNodeKeyframe2.value = new Quaternion(jsonValue12.getFloat(0), jsonValue12.getFloat(1), jsonValue12.getFloat(2), jsonValue12.getFloat(3));
                                }
                            }
                        }
                        JsonValue jsonValue13 = jsonValue5.get("scaling");
                        if (jsonValue13 != null && jsonValue13.isArray()) {
                            Array<ModelNodeKeyframe<Vector3>> array3 = new Array<>();
                            modelNodeAnimation.scaling = array3;
                            array3.ensureCapacity(jsonValue13.size);
                            for (JsonValue jsonValue14 = jsonValue13.child; jsonValue14 != null; jsonValue14 = jsonValue14.next) {
                                ModelNodeKeyframe<Vector3> modelNodeKeyframe3 = new ModelNodeKeyframe<>();
                                modelNodeAnimation.scaling.add(modelNodeKeyframe3);
                                modelNodeKeyframe3.keytime = jsonValue14.getFloat("keytime", 0.0f) / 1000.0f;
                                JsonValue jsonValue15 = jsonValue14.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                if (jsonValue15 != null && jsonValue15.size >= 3) {
                                    modelNodeKeyframe3.value = new Vector3(jsonValue15.getFloat(0), jsonValue15.getFloat(1), jsonValue15.getFloat(2));
                                }
                            }
                        }
                    } else {
                        JsonValue jsonValue16 = jsonValue6.child;
                        while (jsonValue16 != null) {
                            float f3 = jsonValue16.getFloat("keytime", f2) / f;
                            JsonValue jsonValue17 = jsonValue16.get("translation");
                            if (jsonValue17 != null && jsonValue17.size == i4) {
                                if (modelNodeAnimation.translation == null) {
                                    modelNodeAnimation.translation = new Array<>();
                                }
                                ModelNodeKeyframe<Vector3> modelNodeKeyframe4 = new ModelNodeKeyframe<>();
                                modelNodeKeyframe4.keytime = f3;
                                modelNodeKeyframe4.value = new Vector3(jsonValue17.getFloat(i3), jsonValue17.getFloat(i2), jsonValue17.getFloat(i));
                                modelNodeAnimation.translation.add(modelNodeKeyframe4);
                            }
                            JsonValue jsonValue18 = jsonValue16.get(Key.ROTATION);
                            if (jsonValue18 != null && jsonValue18.size == 4) {
                                if (modelNodeAnimation.rotation == null) {
                                    modelNodeAnimation.rotation = new Array<>();
                                }
                                ModelNodeKeyframe<Quaternion> modelNodeKeyframe5 = new ModelNodeKeyframe<>();
                                modelNodeKeyframe5.keytime = f3;
                                modelNodeKeyframe5.value = new Quaternion(jsonValue18.getFloat(0), jsonValue18.getFloat(i2), jsonValue18.getFloat(i), jsonValue18.getFloat(3));
                                modelNodeAnimation.rotation.add(modelNodeKeyframe5);
                            }
                            JsonValue jsonValue19 = jsonValue16.get("scale");
                            if (jsonValue19 != null && jsonValue19.size == 3) {
                                if (modelNodeAnimation.scaling == null) {
                                    modelNodeAnimation.scaling = new Array<>();
                                }
                                ModelNodeKeyframe<Vector3> modelNodeKeyframe6 = new ModelNodeKeyframe<>();
                                modelNodeKeyframe6.keytime = f3;
                                modelNodeKeyframe6.value = new Vector3(jsonValue19.getFloat(0), jsonValue19.getFloat(1), jsonValue19.getFloat(2));
                                modelNodeAnimation.scaling.add(modelNodeKeyframe6);
                            }
                            jsonValue16 = jsonValue16.next;
                            f = 1000.0f;
                            f2 = 0.0f;
                            i = 2;
                            i2 = 1;
                            i3 = 0;
                            i4 = 3;
                        }
                    }
                }
            }
            jsonValue3 = jsonValue3.next;
            modelData2 = modelData;
        }
    }

    public VertexAttribute[] parseAttributes(JsonValue jsonValue) {
        Array array = new Array();
        int i = 0;
        int i2 = 0;
        for (JsonValue jsonValue2 = jsonValue.child; jsonValue2 != null; jsonValue2 = jsonValue2.next) {
            String strAsString = jsonValue2.asString();
            if (strAsString.equals("POSITION")) {
                array.add(VertexAttribute.Position());
            } else if (strAsString.equals("NORMAL")) {
                array.add(VertexAttribute.Normal());
            } else if (strAsString.equals("COLOR")) {
                array.add(VertexAttribute.ColorUnpacked());
            } else if (strAsString.equals("COLORPACKED")) {
                array.add(VertexAttribute.ColorPacked());
            } else if (strAsString.equals("TANGENT")) {
                array.add(VertexAttribute.Tangent());
            } else if (strAsString.equals("BINORMAL")) {
                array.add(VertexAttribute.Binormal());
            } else if (strAsString.startsWith("TEXCOORD")) {
                array.add(VertexAttribute.TexCoords(i));
                i++;
            } else {
                if (!strAsString.startsWith("BLENDWEIGHT")) {
                    throw new GdxRuntimeException(DM.B("Unknown vertex attribute '", strAsString, "', should be one of position, normal, uv, tangent or binormal"));
                }
                array.add(VertexAttribute.BoneWeight(i2));
                i2++;
            }
        }
        return (VertexAttribute[]) array.toArray(VertexAttribute.class);
    }

    public Color parseColor(JsonValue jsonValue) {
        if (jsonValue.size >= 3) {
            return new Color(jsonValue.getFloat(0), jsonValue.getFloat(1), jsonValue.getFloat(2), 1.0f);
        }
        throw new GdxRuntimeException("Expected Color values <> than three.");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    public void parseMaterials(ModelData modelData, JsonValue jsonValue, String str) {
        String str2;
        JsonValue jsonValue2 = jsonValue.get("materials");
        if (jsonValue2 == null) {
            return;
        }
        modelData.materials.ensureCapacity(jsonValue2.size);
        for (JsonValue jsonValue3 = jsonValue2.child; jsonValue3 != null; jsonValue3 = jsonValue3.next) {
            ModelMaterial modelMaterial = new ModelMaterial();
            String string = jsonValue3.getString("id", null);
            if (string == null) {
                throw new GdxRuntimeException("Material needs an id.");
            }
            modelMaterial.id = string;
            JsonValue jsonValue4 = jsonValue3.get("diffuse");
            if (jsonValue4 != null) {
                modelMaterial.diffuse = parseColor(jsonValue4);
            }
            JsonValue jsonValue5 = jsonValue3.get("ambient");
            if (jsonValue5 != null) {
                modelMaterial.ambient = parseColor(jsonValue5);
            }
            JsonValue jsonValue6 = jsonValue3.get("emissive");
            if (jsonValue6 != null) {
                modelMaterial.emissive = parseColor(jsonValue6);
            }
            JsonValue jsonValue7 = jsonValue3.get("specular");
            if (jsonValue7 != null) {
                modelMaterial.specular = parseColor(jsonValue7);
            }
            JsonValue jsonValue8 = jsonValue3.get("reflection");
            if (jsonValue8 != null) {
                modelMaterial.reflection = parseColor(jsonValue8);
            }
            modelMaterial.shininess = jsonValue3.getFloat(FloatAttribute.ShininessAlias, 0.0f);
            modelMaterial.opacity = jsonValue3.getFloat("opacity", 1.0f);
            JsonValue jsonValue9 = jsonValue3.get("textures");
            if (jsonValue9 != null) {
                for (JsonValue jsonValue10 = jsonValue9.child; jsonValue10 != null; jsonValue10 = jsonValue10.next) {
                    ModelTexture modelTexture = new ModelTexture();
                    String string2 = jsonValue10.getString("id", null);
                    if (string2 == null) {
                        throw new GdxRuntimeException("Texture has no id.");
                    }
                    modelTexture.id = string2;
                    String string3 = jsonValue10.getString("filename", null);
                    if (string3 == null) {
                        throw new GdxRuntimeException("Texture needs filename.");
                    }
                    StringBuilder sbO = DM.o(str);
                    if (str.length() != 0) {
                        str2 = str.endsWith("/") ? "" : "/";
                    }
                    modelTexture.fileName = DM.m(sbO, str2, string3);
                    modelTexture.uvTranslation = readVector2(jsonValue10.get("uvTranslation"), 0.0f, 0.0f);
                    modelTexture.uvScaling = readVector2(jsonValue10.get("uvScaling"), 1.0f, 1.0f);
                    String string4 = jsonValue10.getString("type", null);
                    if (string4 == null) {
                        throw new GdxRuntimeException("Texture needs type.");
                    }
                    modelTexture.usage = parseTextureUsage(string4);
                    if (modelMaterial.textures == null) {
                        modelMaterial.textures = new Array<>();
                    }
                    modelMaterial.textures.add(modelTexture);
                }
            }
            modelData.materials.add(modelMaterial);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseMeshes(ModelData modelData, JsonValue jsonValue) {
        JsonValue jsonValue2 = jsonValue.get("meshes");
        if (jsonValue2 != null) {
            modelData.meshes.ensureCapacity(jsonValue2.size);
            for (JsonValue jsonValue3 = jsonValue2.child; jsonValue3 != null; jsonValue3 = jsonValue3.next) {
                ModelMesh modelMesh = new ModelMesh();
                modelMesh.id = jsonValue3.getString("id", "");
                modelMesh.attributes = parseAttributes(jsonValue3.require("attributes"));
                modelMesh.vertices = jsonValue3.require("vertices").asFloatArray();
                JsonValue jsonValueRequire = jsonValue3.require("parts");
                Array array = new Array();
                for (JsonValue jsonValue4 = jsonValueRequire.child; jsonValue4 != null; jsonValue4 = jsonValue4.next) {
                    ModelMeshPart modelMeshPart = new ModelMeshPart();
                    String string = jsonValue4.getString("id", null);
                    if (string == null) {
                        throw new GdxRuntimeException("Not id given for mesh part");
                    }
                    Array.ArrayIterator it = array.iterator();
                    while (it.hasNext()) {
                        if (((ModelMeshPart) it.next()).id.equals(string)) {
                            throw new GdxRuntimeException(DM.B("Mesh part with id '", string, "' already in defined"));
                        }
                    }
                    modelMeshPart.id = string;
                    String string2 = jsonValue4.getString("type", null);
                    if (string2 == null) {
                        throw new GdxRuntimeException(DM.B("No primitive type given for mesh part '", string, "'"));
                    }
                    modelMeshPart.primitiveType = parseType(string2);
                    modelMeshPart.indices = jsonValue4.require("indices").asShortArray();
                    array.add(modelMeshPart);
                }
                modelMesh.parts = (ModelMeshPart[]) array.toArray(ModelMeshPart.class);
                modelData.meshes.add(modelMesh);
            }
        }
    }

    public ModelData parseModel(FileHandle fileHandle) {
        JsonValue jsonValue = this.reader.parse(fileHandle);
        ModelData modelData = new ModelData();
        JsonValue jsonValueRequire = jsonValue.require("version");
        modelData.version[0] = jsonValueRequire.getShort(0);
        modelData.version[1] = jsonValueRequire.getShort(1);
        short[] sArr = modelData.version;
        if (sArr[0] != 0 || sArr[1] != 1) {
            throw new GdxRuntimeException("Model version not supported");
        }
        modelData.id = jsonValue.getString("id", "");
        parseMeshes(modelData, jsonValue);
        parseMaterials(modelData, jsonValue, fileHandle.parent().path());
        parseNodes(modelData, jsonValue);
        parseAnimations(modelData, jsonValue);
        return modelData;
    }

    public Array<ModelNode> parseNodes(ModelData modelData, JsonValue jsonValue) {
        JsonValue jsonValue2 = jsonValue.get("nodes");
        if (jsonValue2 != null) {
            modelData.nodes.ensureCapacity(jsonValue2.size);
            for (JsonValue jsonValue3 = jsonValue2.child; jsonValue3 != null; jsonValue3 = jsonValue3.next) {
                modelData.nodes.add(parseNodesRecursively(jsonValue3));
            }
        }
        return modelData.nodes;
    }

    public ModelNode parseNodesRecursively(JsonValue jsonValue) {
        int i;
        G3dModelLoader g3dModelLoader = this;
        ModelNode modelNode = new ModelNode();
        String str = null;
        String string = jsonValue.getString("id", null);
        if (string == null) {
            throw new GdxRuntimeException("Node id missing.");
        }
        modelNode.id = string;
        String str2 = "translation";
        JsonValue jsonValue2 = jsonValue.get("translation");
        if (jsonValue2 != null && jsonValue2.size != 3) {
            throw new GdxRuntimeException("Node translation incomplete");
        }
        boolean z = true;
        modelNode.translation = jsonValue2 == null ? null : new Vector3(jsonValue2.getFloat(0), jsonValue2.getFloat(1), jsonValue2.getFloat(2));
        String str3 = Key.ROTATION;
        JsonValue jsonValue3 = jsonValue.get(Key.ROTATION);
        if (jsonValue3 != null && jsonValue3.size != 4) {
            throw new GdxRuntimeException("Node rotation incomplete");
        }
        modelNode.rotation = jsonValue3 == null ? null : new Quaternion(jsonValue3.getFloat(0), jsonValue3.getFloat(1), jsonValue3.getFloat(2), jsonValue3.getFloat(3));
        JsonValue jsonValue4 = jsonValue.get("scale");
        if (jsonValue4 != null && jsonValue4.size != 3) {
            throw new GdxRuntimeException("Node scale incomplete");
        }
        modelNode.scale = jsonValue4 == null ? null : new Vector3(jsonValue4.getFloat(0), jsonValue4.getFloat(1), jsonValue4.getFloat(2));
        String string2 = jsonValue.getString("mesh", null);
        if (string2 != null) {
            modelNode.meshId = string2;
        }
        JsonValue jsonValue5 = jsonValue.get("parts");
        if (jsonValue5 != null) {
            modelNode.parts = new ModelNodePart[jsonValue5.size];
            JsonValue jsonValue6 = jsonValue5.child;
            int i2 = 0;
            while (jsonValue6 != null) {
                ModelNodePart modelNodePart = new ModelNodePart();
                String string3 = jsonValue6.getString("meshpartid", str);
                String string4 = jsonValue6.getString("materialid", str);
                if (string3 == null || string4 == null) {
                    throw new GdxRuntimeException(DM.B("Node ", string, " part is missing meshPartId or materialId"));
                }
                modelNodePart.materialId = string4;
                modelNodePart.meshPartId = string3;
                JsonValue jsonValue7 = jsonValue6.get("bones");
                if (jsonValue7 != null) {
                    modelNodePart.bones = new ArrayMap<>(z, jsonValue7.size, String.class, Matrix4.class);
                    JsonValue jsonValue8 = jsonValue7.child;
                    while (jsonValue8 != null) {
                        String string5 = jsonValue8.getString("node", null);
                        if (string5 == null) {
                            throw new GdxRuntimeException("Bone node ID missing");
                        }
                        Matrix4 matrix4 = new Matrix4();
                        JsonValue jsonValue9 = jsonValue8.get(str2);
                        if (jsonValue9 != null && jsonValue9.size >= 3) {
                            matrix4.translate(jsonValue9.getFloat(0), jsonValue9.getFloat(1), jsonValue9.getFloat(2));
                        }
                        JsonValue jsonValue10 = jsonValue8.get(str3);
                        if (jsonValue10 == null || jsonValue10.size < 4) {
                            i = 3;
                        } else {
                            i = 3;
                            matrix4.rotate(g3dModelLoader.tempQ.set(jsonValue10.getFloat(0), jsonValue10.getFloat(1), jsonValue10.getFloat(2), jsonValue10.getFloat(3)));
                        }
                        JsonValue jsonValue11 = jsonValue8.get("scale");
                        if (jsonValue11 != null && jsonValue11.size >= i) {
                            matrix4.scale(jsonValue11.getFloat(0), jsonValue11.getFloat(1), jsonValue11.getFloat(2));
                        }
                        modelNodePart.bones.put(string5, matrix4);
                        jsonValue8 = jsonValue8.next;
                        g3dModelLoader = this;
                        str2 = str2;
                        str3 = str3;
                    }
                }
                modelNode.parts[i2] = modelNodePart;
                jsonValue6 = jsonValue6.next;
                i2++;
                str = null;
                g3dModelLoader = this;
                str2 = str2;
                str3 = str3;
                z = true;
            }
        }
        JsonValue jsonValue12 = jsonValue.get("children");
        if (jsonValue12 != null) {
            modelNode.children = new ModelNode[jsonValue12.size];
            JsonValue jsonValue13 = jsonValue12.child;
            int i3 = 0;
            while (jsonValue13 != null) {
                modelNode.children[i3] = parseNodesRecursively(jsonValue13);
                jsonValue13 = jsonValue13.next;
                i3++;
            }
        }
        return modelNode;
    }

    public int parseTextureUsage(String str) {
        if (str.equalsIgnoreCase("AMBIENT")) {
            return 4;
        }
        if (str.equalsIgnoreCase("BUMP")) {
            return 8;
        }
        if (str.equalsIgnoreCase("DIFFUSE")) {
            return 2;
        }
        if (str.equalsIgnoreCase("EMISSIVE")) {
            return 3;
        }
        if (str.equalsIgnoreCase("NONE")) {
            return 1;
        }
        if (str.equalsIgnoreCase("NORMAL")) {
            return 7;
        }
        if (str.equalsIgnoreCase("REFLECTION")) {
            return 10;
        }
        if (str.equalsIgnoreCase("SHININESS")) {
            return 6;
        }
        if (str.equalsIgnoreCase("SPECULAR")) {
            return 5;
        }
        return str.equalsIgnoreCase("TRANSPARENCY") ? 9 : 0;
    }

    public int parseType(String str) {
        if (str.equals("TRIANGLES")) {
            return 4;
        }
        if (str.equals("LINES")) {
            return 1;
        }
        if (str.equals("POINTS")) {
            return 0;
        }
        if (str.equals("TRIANGLE_STRIP")) {
            return 5;
        }
        if (str.equals("LINE_STRIP")) {
            return 3;
        }
        throw new GdxRuntimeException(DM.B("Unknown primitive type '", str, "', should be one of triangle, trianglestrip, line, linestrip or point"));
    }

    public Vector2 readVector2(JsonValue jsonValue, float f, float f2) {
        if (jsonValue == null) {
            return new Vector2(f, f2);
        }
        if (jsonValue.size == 2) {
            return new Vector2(jsonValue.getFloat(0), jsonValue.getFloat(1));
        }
        throw new GdxRuntimeException("Expected Vector2 values <> than two.");
    }

    public G3dModelLoader(BaseJsonReader baseJsonReader, FileHandleResolver fileHandleResolver) {
        super(fileHandleResolver);
        this.tempQ = new Quaternion();
        this.reader = baseJsonReader;
    }
}
