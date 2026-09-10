package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: StreamAssetPathFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public class impassible extends saneness<InputStream> {
    public impassible(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.wireman
    public Class<InputStream> attabal() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.saneness
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public void dern(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.saneness
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public InputStream beachfront(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
