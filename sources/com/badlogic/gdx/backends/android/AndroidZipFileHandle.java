package com.badlogic.gdx.backends.android;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.GdxRuntimeException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class AndroidZipFileHandle extends AndroidFileHandle {
    private ZipResourceFile expansionFile;
    private long fdLength;
    private boolean hasAssetFd;
    private String path;

    public AndroidZipFileHandle(String str) {
        super((AssetManager) null, str, Files.FileType.Internal);
        initialize();
    }

    private String getPath() {
        return this.path;
    }

    private void initialize() {
        this.path = this.file.getPath().replace('\\', '/');
        ZipResourceFile expansionFile = ((AndroidFiles) Gdx.files).getExpansionFile();
        this.expansionFile = expansionFile;
        AssetFileDescriptor assetFileDescriptor = expansionFile.getAssetFileDescriptor(getPath());
        if (assetFileDescriptor != null) {
            this.hasAssetFd = true;
            this.fdLength = assetFileDescriptor.getLength();
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        } else {
            this.hasAssetFd = false;
        }
        if (isDirectory()) {
            this.path = DM.m(new StringBuilder(), this.path, "/");
        }
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public FileHandle child(String str) {
        return this.file.getPath().length() == 0 ? new AndroidZipFileHandle(new File(str), this.type) : new AndroidZipFileHandle(new File(this.file, str), this.type);
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public boolean exists() {
        return this.hasAssetFd || this.expansionFile.getEntriesAt(getPath()).length != 0;
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle
    public AssetFileDescriptor getAssetFileDescriptor() throws IOException {
        return this.expansionFile.getAssetFileDescriptor(getPath());
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public boolean isDirectory() {
        return !this.hasAssetFd;
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public long length() {
        if (this.hasAssetFd) {
            return this.fdLength;
        }
        return 0L;
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public FileHandle[] list() {
        ZipResourceFile.ZipEntryRO[] entriesAt = this.expansionFile.getEntriesAt(getPath());
        FileHandle[] fileHandleArr = new FileHandle[entriesAt.length - 1];
        int length = entriesAt.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (entriesAt[i2].mFileName.length() != getPath().length()) {
                fileHandleArr[i] = new AndroidZipFileHandle(entriesAt[i2].mFileName);
                i++;
            }
        }
        return fileHandleArr;
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public FileHandle parent() {
        File parentFile = this.file.getParentFile();
        if (parentFile == null) {
            parentFile = new File("");
        }
        return new AndroidZipFileHandle(parentFile.getPath());
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public InputStream read() {
        try {
            return this.expansionFile.getInputStream(getPath());
        } catch (IOException e) {
            throw new GdxRuntimeException("Error reading file: " + this.file + " (ZipResourceFile)", e);
        }
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public FileHandle sibling(String str) {
        if (this.file.getPath().length() != 0) {
            return Gdx.files.getFileHandle(new File(this.file.getParent(), str).getPath(), this.type);
        }
        throw new GdxRuntimeException("Cannot get the sibling of the root.");
    }

    public AndroidZipFileHandle(File file, Files.FileType fileType) {
        super((AssetManager) null, file, fileType);
        initialize();
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public FileHandle[] list(FileFilter fileFilter) {
        ZipResourceFile.ZipEntryRO[] entriesAt = this.expansionFile.getEntriesAt(getPath());
        int length = entriesAt.length - 1;
        FileHandle[] fileHandleArr = new FileHandle[length];
        int length2 = entriesAt.length;
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            if (entriesAt[i2].mFileName.length() != getPath().length()) {
                AndroidZipFileHandle androidZipFileHandle = new AndroidZipFileHandle(entriesAt[i2].mFileName);
                if (fileFilter.accept(androidZipFileHandle.file())) {
                    fileHandleArr[i] = androidZipFileHandle;
                    i++;
                }
            }
        }
        if (i >= length) {
            return fileHandleArr;
        }
        FileHandle[] fileHandleArr2 = new FileHandle[i];
        System.arraycopy(fileHandleArr, 0, fileHandleArr2, 0, i);
        return fileHandleArr2;
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public FileHandle[] list(FilenameFilter filenameFilter) {
        ZipResourceFile.ZipEntryRO[] entriesAt = this.expansionFile.getEntriesAt(getPath());
        int length = entriesAt.length - 1;
        FileHandle[] fileHandleArr = new FileHandle[length];
        int length2 = entriesAt.length;
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            if (entriesAt[i2].mFileName.length() != getPath().length()) {
                String str = entriesAt[i2].mFileName;
                if (filenameFilter.accept(this.file, str)) {
                    fileHandleArr[i] = new AndroidZipFileHandle(str);
                    i++;
                }
            }
        }
        if (i >= length) {
            return fileHandleArr;
        }
        FileHandle[] fileHandleArr2 = new FileHandle[i];
        System.arraycopy(fileHandleArr, 0, fileHandleArr2, 0, i);
        return fileHandleArr2;
    }

    @Override // com.badlogic.gdx.backends.android.AndroidFileHandle, com.badlogic.gdx.files.FileHandle
    public FileHandle[] list(String str) {
        ZipResourceFile.ZipEntryRO[] entriesAt = this.expansionFile.getEntriesAt(getPath());
        int length = entriesAt.length - 1;
        FileHandle[] fileHandleArr = new FileHandle[length];
        int length2 = entriesAt.length;
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            if (entriesAt[i2].mFileName.length() != getPath().length()) {
                String str2 = entriesAt[i2].mFileName;
                if (str2.endsWith(str)) {
                    fileHandleArr[i] = new AndroidZipFileHandle(str2);
                    i++;
                }
            }
        }
        if (i >= length) {
            return fileHandleArr;
        }
        FileHandle[] fileHandleArr2 = new FileHandle[i];
        System.arraycopy(fileHandleArr, 0, fileHandleArr2, 0, i);
        return fileHandleArr2;
    }
}
