package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class MediaStoreFileLoader implements ModelLoader<Uri, File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12569a;

    public static final class Factory implements ModelLoaderFactory<Uri, File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f12570a;

        public Factory(Context context) {
            this.f12570a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new MediaStoreFileLoader(this.f12570a);
        }
    }

    public static class FilePathFetcher implements DataFetcher<File> {
        public static final String[] Z = {"_data"};
        public final Context X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Uri f12571Y;

        public FilePathFetcher(Context context, Uri uri) {
            this.X = context;
            this.f12571Y = uri;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final Class a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final DataSource d() {
            return DataSource.X;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void e(Priority priority, DataFetcher.DataCallback dataCallback) {
            Cursor cursorQuery = this.X.getContentResolver().query(this.f12571Y, Z, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                dataCallback.f(new File(string));
                return;
            }
            dataCallback.c(new FileNotFoundException("Failed to find file path for: " + this.f12571Y));
        }
    }

    public MediaStoreFileLoader(Context context) {
        this.f12569a = context;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean a(Object obj) {
        return MediaStoreUtil.a((Uri) obj);
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData b(Object obj, int i2, int i3, Options options) {
        Uri uri = (Uri) obj;
        return new ModelLoader.LoadData(new ObjectKey(uri), new FilePathFetcher(this.f12569a, uri));
    }
}
