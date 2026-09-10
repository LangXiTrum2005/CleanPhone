package com.badlogic.gdx.backends.android;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.GdxRuntimeException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class DefaultAndroidFiles implements AndroidFiles {
    protected final AssetManager assets;
    private ZipResourceFile expansionFile = null;
    protected final String externalFilesPath;
    protected final String localpath;

    public DefaultAndroidFiles(AssetManager assetManager, ContextWrapper contextWrapper, boolean z) {
        this.assets = assetManager;
        String absolutePath = contextWrapper.getFilesDir().getAbsolutePath();
        this.localpath = absolutePath.endsWith("/") ? absolutePath : absolutePath.concat("/");
        if (z) {
            this.externalFilesPath = initExternalFilesPath(contextWrapper);
        } else {
            this.externalFilesPath = null;
        }
    }

    private FileHandle getZipFileHandleIfExists(FileHandle fileHandle, String str) {
        try {
            this.assets.open(str).close();
            return fileHandle;
        } catch (Exception unused) {
            AndroidZipFileHandle androidZipFileHandle = new AndroidZipFileHandle(str);
            return (androidZipFileHandle.isDirectory() && !androidZipFileHandle.exists()) ? fileHandle : androidZipFileHandle;
        }
    }

    @Override // com.badlogic.gdx.Files
    public FileHandle absolute(String str) {
        return new AndroidFileHandle((AssetManager) null, str, Files.FileType.Absolute);
    }

    @Override // com.badlogic.gdx.Files
    public FileHandle classpath(String str) {
        return new AndroidFileHandle((AssetManager) null, str, Files.FileType.Classpath);
    }

    @Override // com.badlogic.gdx.Files
    public FileHandle external(String str) {
        return new AndroidFileHandle((AssetManager) null, str, Files.FileType.External);
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFiles
    public ZipResourceFile getExpansionFile() {
        return this.expansionFile;
    }

    @Override // com.badlogic.gdx.Files
    public String getExternalStoragePath() {
        return this.externalFilesPath;
    }

    @Override // com.badlogic.gdx.Files
    public FileHandle getFileHandle(String str, Files.FileType fileType) {
        Files.FileType fileType2 = Files.FileType.Internal;
        AndroidFileHandle androidFileHandle = new AndroidFileHandle(fileType == fileType2 ? this.assets : null, str, fileType);
        return (this.expansionFile == null || fileType != fileType2) ? androidFileHandle : getZipFileHandleIfExists(androidFileHandle, str);
    }

    @Override // com.badlogic.gdx.Files
    public String getLocalStoragePath() {
        return this.localpath;
    }

    public String initExternalFilesPath(ContextWrapper contextWrapper) {
        File externalFilesDir = contextWrapper.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        String absolutePath = externalFilesDir.getAbsolutePath();
        return absolutePath.endsWith("/") ? absolutePath : absolutePath.concat("/");
    }

    @Override // com.badlogic.gdx.Files
    public FileHandle internal(String str) {
        AndroidFileHandle androidFileHandle = new AndroidFileHandle(this.assets, str, Files.FileType.Internal);
        return this.expansionFile != null ? getZipFileHandleIfExists(androidFileHandle, str) : androidFileHandle;
    }

    @Override // com.badlogic.gdx.Files
    public boolean isExternalStorageAvailable() {
        return this.externalFilesPath != null;
    }

    @Override // com.badlogic.gdx.Files
    public boolean isLocalStorageAvailable() {
        return true;
    }

    @Override // com.badlogic.gdx.Files
    public FileHandle local(String str) {
        return new AndroidFileHandle((AssetManager) null, str, Files.FileType.Local);
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFiles
    public boolean setAPKExpansion(int i, int i2) {
        Context baseContext;
        try {
            Object obj = Gdx.app;
            if (obj instanceof Activity) {
                baseContext = ((Activity) obj).getBaseContext();
            } else {
                if (!(obj instanceof Fragment)) {
                    throw new GdxRuntimeException("APK expansion not supported for application type");
                }
                baseContext = ((Fragment) obj).getActivity().getBaseContext();
            }
            ZipResourceFile aPKExpansionZipFile = APKExpansionSupport.getAPKExpansionZipFile(baseContext, i, i2);
            this.expansionFile = aPKExpansionZipFile;
            return aPKExpansionZipFile != null;
        } catch (IOException unused) {
            throw new GdxRuntimeException(AbstractC3950lJ.q("APK expansion main version ", i, " or patch version ", i2, " couldn't be opened!"));
        }
    }
}
