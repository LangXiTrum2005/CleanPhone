package com.badlogic.gdx.graphics.g3d.loader;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial;
import com.badlogic.gdx.graphics.g3d.model.data.ModelTexture;
import com.badlogic.gdx.utils.Array;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
class MtlLoader {
    public Array<ModelMaterial> materials = new Array<>();

    public static class ObjMaterial {
        String alphaTexFilename;
        Color ambientColor;
        String ambientTexFilename;
        Color diffuseColor;
        String diffuseTexFilename;
        String materialName = MRAIDCommunicatorUtil.STATES_DEFAULT;
        float opacity;
        float shininess;
        String shininessTexFilename;
        Color specularColor;
        String specularTexFilename;

        public ObjMaterial() {
            reset();
        }

        private void addTexture(ModelMaterial modelMaterial, String str, int i) {
            if (str != null) {
                ModelTexture modelTexture = new ModelTexture();
                modelTexture.usage = i;
                modelTexture.fileName = str;
                if (modelMaterial.textures == null) {
                    modelMaterial.textures = new Array<>(1);
                }
                modelMaterial.textures.add(modelTexture);
            }
        }

        public ModelMaterial build() {
            ModelMaterial modelMaterial = new ModelMaterial();
            modelMaterial.id = this.materialName;
            modelMaterial.ambient = this.ambientColor == null ? null : new Color(this.ambientColor);
            modelMaterial.diffuse = new Color(this.diffuseColor);
            modelMaterial.specular = new Color(this.specularColor);
            modelMaterial.opacity = this.opacity;
            modelMaterial.shininess = this.shininess;
            addTexture(modelMaterial, this.alphaTexFilename, 9);
            addTexture(modelMaterial, this.ambientTexFilename, 4);
            addTexture(modelMaterial, this.diffuseTexFilename, 2);
            addTexture(modelMaterial, this.specularTexFilename, 5);
            addTexture(modelMaterial, this.shininessTexFilename, 6);
            return modelMaterial;
        }

        public void reset() {
            this.ambientColor = null;
            Color color = Color.WHITE;
            this.diffuseColor = color;
            this.specularColor = color;
            this.opacity = 1.0f;
            this.shininess = 0.0f;
            this.alphaTexFilename = null;
            this.ambientTexFilename = null;
            this.diffuseTexFilename = null;
            this.shininessTexFilename = null;
            this.specularTexFilename = null;
        }
    }

    private Color parseColor(String[] strArr) {
        return new Color(Float.parseFloat(strArr[1]), Float.parseFloat(strArr[2]), Float.parseFloat(strArr[3]), strArr.length > 4 ? Float.parseFloat(strArr[4]) : 1.0f);
    }

    public ModelMaterial getMaterial(String str) {
        Array.ArrayIterator<ModelMaterial> it = this.materials.iterator();
        while (it.hasNext()) {
            ModelMaterial next = it.next();
            if (next.id.equals(str)) {
                return next;
            }
        }
        ModelMaterial modelMaterial = new ModelMaterial();
        modelMaterial.id = str;
        modelMaterial.diffuse = new Color(Color.WHITE);
        this.materials.add(modelMaterial);
        return modelMaterial;
    }

    public void load(FileHandle fileHandle) {
        ObjMaterial objMaterial = new ObjMaterial();
        if (fileHandle == null || !fileHandle.exists()) {
            return;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileHandle.read()), 4096);
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    this.materials.add(objMaterial.build());
                    return;
                }
                if (line.length() > 0 && line.charAt(0) == '\t') {
                    line = line.substring(1).trim();
                }
                String[] strArrSplit = line.split("\\s+");
                if (strArrSplit[0].length() != 0 && strArrSplit[0].charAt(0) != '#') {
                    String lowerCase = strArrSplit[0].toLowerCase();
                    if (lowerCase.equals("newmtl")) {
                        this.materials.add(objMaterial.build());
                        if (strArrSplit.length > 1) {
                            String str = strArrSplit[1];
                            objMaterial.materialName = str;
                            objMaterial.materialName = str.replace('.', '_');
                        } else {
                            objMaterial.materialName = MRAIDCommunicatorUtil.STATES_DEFAULT;
                        }
                        objMaterial.reset();
                    } else if (lowerCase.equals("ka")) {
                        objMaterial.ambientColor = parseColor(strArrSplit);
                    } else if (lowerCase.equals("kd")) {
                        objMaterial.diffuseColor = parseColor(strArrSplit);
                    } else if (lowerCase.equals("ks")) {
                        objMaterial.specularColor = parseColor(strArrSplit);
                    } else if (lowerCase.equals("tr") || lowerCase.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
                        objMaterial.opacity = Float.parseFloat(strArrSplit[1]);
                    } else if (lowerCase.equals("ns")) {
                        objMaterial.shininess = Float.parseFloat(strArrSplit[1]);
                    } else if (lowerCase.equals("map_d")) {
                        objMaterial.alphaTexFilename = fileHandle.parent().child(strArrSplit[1]).path();
                    } else if (lowerCase.equals("map_ka")) {
                        objMaterial.ambientTexFilename = fileHandle.parent().child(strArrSplit[1]).path();
                    } else if (lowerCase.equals("map_kd")) {
                        objMaterial.diffuseTexFilename = fileHandle.parent().child(strArrSplit[1]).path();
                    } else if (lowerCase.equals("map_ks")) {
                        objMaterial.specularTexFilename = fileHandle.parent().child(strArrSplit[1]).path();
                    } else if (lowerCase.equals("map_ns")) {
                        objMaterial.shininessTexFilename = fileHandle.parent().child(strArrSplit[1]).path();
                    }
                }
            } catch (IOException unused) {
                return;
            }
        }
    }
}
