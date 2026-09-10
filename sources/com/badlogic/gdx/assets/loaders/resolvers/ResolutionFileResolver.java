package com.badlogic.gdx.assets.loaders.resolvers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.files.FileHandle;

/* JADX INFO: loaded from: classes.dex */
public class ResolutionFileResolver implements FileHandleResolver {
    protected final FileHandleResolver baseResolver;
    protected final Resolution[] descriptors;

    public static class Resolution {
        public final String folder;
        public final int portraitHeight;
        public final int portraitWidth;

        public Resolution(int i, int i2, String str) {
            this.portraitWidth = i;
            this.portraitHeight = i2;
            this.folder = str;
        }
    }

    public ResolutionFileResolver(FileHandleResolver fileHandleResolver, Resolution... resolutionArr) {
        if (resolutionArr.length == 0) {
            throw new IllegalArgumentException("At least one Resolution needs to be supplied.");
        }
        this.baseResolver = fileHandleResolver;
        this.descriptors = resolutionArr;
    }

    public static Resolution choose(Resolution... resolutionArr) {
        int i;
        int i2;
        int backBufferWidth = Gdx.graphics.getBackBufferWidth();
        int backBufferHeight = Gdx.graphics.getBackBufferHeight();
        int i3 = 0;
        Resolution resolution = resolutionArr[0];
        if (backBufferWidth < backBufferHeight) {
            int length = resolutionArr.length;
            while (i3 < length) {
                Resolution resolution2 = resolutionArr[i3];
                int i4 = resolution2.portraitWidth;
                if (backBufferWidth >= i4 && i4 >= resolution.portraitWidth && backBufferHeight >= (i2 = resolution2.portraitHeight) && i2 >= resolution.portraitHeight) {
                    resolution = resolution2;
                }
                i3++;
            }
        } else {
            int length2 = resolutionArr.length;
            while (i3 < length2) {
                Resolution resolution3 = resolutionArr[i3];
                int i5 = resolution3.portraitHeight;
                if (backBufferWidth >= i5 && i5 >= resolution.portraitHeight && backBufferHeight >= (i = resolution3.portraitWidth) && i >= resolution.portraitWidth) {
                    resolution = resolution3;
                }
                i3++;
            }
        }
        return resolution;
    }

    @Override // com.badlogic.gdx.assets.loaders.FileHandleResolver
    public FileHandle resolve(String str) {
        FileHandle fileHandleResolve = this.baseResolver.resolve(resolve(new FileHandle(str), choose(this.descriptors).folder));
        return !fileHandleResolve.exists() ? this.baseResolver.resolve(str) : fileHandleResolve;
    }

    public String resolve(FileHandle fileHandle, String str) {
        FileHandle fileHandleParent = fileHandle.parent();
        String str2 = "";
        if (fileHandleParent != null && !fileHandleParent.name().equals("")) {
            str2 = fileHandleParent + "/";
        }
        return str2 + str + "/" + fileHandle.name();
    }
}
