package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: compiled from: FileDescriptorAssetPathFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public class impromptu extends saneness<AssetFileDescriptor> {
    public impromptu(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.wireman
    public Class<AssetFileDescriptor> attabal() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.saneness
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public void dern(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.saneness
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor beachfront(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
