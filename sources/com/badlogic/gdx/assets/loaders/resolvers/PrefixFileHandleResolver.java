package com.badlogic.gdx.assets.loaders.resolvers;

import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.files.FileHandle;

/* JADX INFO: loaded from: classes.dex */
public class PrefixFileHandleResolver implements FileHandleResolver {
    private FileHandleResolver baseResolver;
    private String prefix;

    public PrefixFileHandleResolver(FileHandleResolver fileHandleResolver, String str) {
        this.baseResolver = fileHandleResolver;
        this.prefix = str;
    }

    public FileHandleResolver getBaseResolver() {
        return this.baseResolver;
    }

    public String getPrefix() {
        return this.prefix;
    }

    @Override // com.badlogic.gdx.assets.loaders.FileHandleResolver
    public FileHandle resolve(String str) {
        return this.baseResolver.resolve(this.prefix + str);
    }

    public void setBaseResolver(FileHandleResolver fileHandleResolver) {
        this.baseResolver = fileHandleResolver;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }
}
