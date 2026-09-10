package com.badlogic.gdx.assets.loaders;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetLoaderParameters;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Logger;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public class ShaderProgramLoader extends AsynchronousAssetLoader<ShaderProgram, ShaderProgramParameter> {
    private String fragmentFileSuffix;
    private String vertexFileSuffix;

    public static class ShaderProgramParameter extends AssetLoaderParameters<ShaderProgram> {
        public String fragmentFile;
        public boolean logOnCompileFailure = true;
        public String prependFragmentCode;
        public String prependVertexCode;
        public String vertexFile;
    }

    public ShaderProgramLoader(FileHandleResolver fileHandleResolver) {
        super(fileHandleResolver);
        this.vertexFileSuffix = ".vert";
        this.fragmentFileSuffix = ".frag";
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public Array<AssetDescriptor> getDependencies(String str, FileHandle fileHandle, ShaderProgramParameter shaderProgramParameter) {
        return null;
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public void loadAsync(AssetManager assetManager, String str, FileHandle fileHandle, ShaderProgramParameter shaderProgramParameter) {
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public ShaderProgram loadSync(AssetManager assetManager, String str, FileHandle fileHandle, ShaderProgramParameter shaderProgramParameter) {
        String str2;
        String str3 = null;
        if (shaderProgramParameter != null) {
            String str4 = shaderProgramParameter.vertexFile;
            if (str4 == null) {
                str4 = null;
            }
            str2 = shaderProgramParameter.fragmentFile;
            if (str2 == null) {
                str2 = null;
            }
            str3 = str4;
        } else {
            str2 = null;
        }
        if (str3 == null && str.endsWith(this.fragmentFileSuffix)) {
            str3 = str.substring(0, str.length() - this.fragmentFileSuffix.length()) + this.vertexFileSuffix;
        }
        if (str2 == null && str.endsWith(this.vertexFileSuffix)) {
            str2 = str.substring(0, str.length() - this.vertexFileSuffix.length()) + this.fragmentFileSuffix;
        }
        FileHandle fileHandleResolve = str3 == null ? fileHandle : resolve(str3);
        if (str2 != null) {
            fileHandle = resolve(str2);
        }
        String string = fileHandleResolve.readString();
        String string2 = fileHandleResolve.equals(fileHandle) ? string : fileHandle.readString();
        if (shaderProgramParameter != null) {
            if (shaderProgramParameter.prependVertexCode != null) {
                string = DM.m(new StringBuilder(), shaderProgramParameter.prependVertexCode, string);
            }
            if (shaderProgramParameter.prependFragmentCode != null) {
                string2 = DM.m(new StringBuilder(), shaderProgramParameter.prependFragmentCode, string2);
            }
        }
        ShaderProgram shaderProgram = new ShaderProgram(string, string2);
        if ((shaderProgramParameter == null || shaderProgramParameter.logOnCompileFailure) && !shaderProgram.isCompiled()) {
            Logger logger = assetManager.getLogger();
            StringBuilder sbU = AbstractC3950lJ.u("ShaderProgram ", str, " failed to compile:\n");
            sbU.append(shaderProgram.getLog());
            logger.error(sbU.toString());
        }
        return shaderProgram;
    }

    public ShaderProgramLoader(FileHandleResolver fileHandleResolver, String str, String str2) {
        super(fileHandleResolver);
        this.vertexFileSuffix = str;
        this.fragmentFileSuffix = str2;
    }
}
