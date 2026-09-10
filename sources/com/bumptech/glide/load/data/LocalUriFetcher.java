package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class LocalUriFetcher<T> implements DataFetcher<T> {
    public final Uri X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ContentResolver f12380Y;
    public Object Z;

    public LocalUriFetcher(ContentResolver contentResolver, Uri uri) {
        this.f12380Y = contentResolver;
        this.X = uri;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void b() {
        Object obj = this.Z;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final DataSource d() {
        return DataSource.X;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void e(Priority priority, DataFetcher.DataCallback dataCallback) {
        try {
            Object objF = f(this.f12380Y, this.X);
            this.Z = objF;
            dataCallback.f(objF);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e2);
            }
            dataCallback.c(e2);
        }
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri);
}
