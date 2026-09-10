package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: FileDescriptorLocalUriFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public class taiyuan extends formularize<ParcelFileDescriptor> {
    public taiyuan(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.wireman
    public Class<ParcelFileDescriptor> attabal() {
        return ParcelFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.formularize
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public void dern(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.formularize
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor beachfront(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
