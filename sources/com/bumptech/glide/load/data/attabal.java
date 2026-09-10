package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: AssetFileDescriptorLocalUriFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal extends formularize<AssetFileDescriptor> {
    public attabal(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.wireman
    public Class<AssetFileDescriptor> attabal() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.formularize
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public void dern(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.formularize
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor beachfront(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
