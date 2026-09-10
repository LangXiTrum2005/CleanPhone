package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class ThumbnailStreamOpener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FileService f12388e = new FileService();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThumbnailQuery f12389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LruArrayPool f12390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentResolver f12391c;
    public final ArrayList d;

    public ThumbnailStreamOpener(ArrayList arrayList, ThumbnailQuery thumbnailQuery, LruArrayPool lruArrayPool, ContentResolver contentResolver) {
        this.f12389a = thumbnailQuery;
        this.f12390b = lruArrayPool;
        this.f12391c = contentResolver;
        this.d = arrayList;
    }
}
