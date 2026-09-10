package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class AssetPathFetcher<T> implements DataFetcher<T> {
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final AssetManager f12371Y;
    public Object Z;

    public AssetPathFetcher(AssetManager assetManager, String str) {
        this.f12371Y = assetManager;
        this.X = str;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void b() {
        Object obj = this.Z;
        if (obj == null) {
            return;
        }
        try {
            c(obj);
        } catch (IOException unused) {
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
            Object objF = f(this.f12371Y, this.X);
            this.Z = objF;
            dataCallback.f(objF);
        } catch (IOException e2) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
            }
            dataCallback.c(e2);
        }
    }

    public abstract Object f(AssetManager assetManager, String str);
}
