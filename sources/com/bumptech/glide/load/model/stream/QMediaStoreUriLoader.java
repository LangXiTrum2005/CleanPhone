package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class QMediaStoreUriLoader<DataT> implements ModelLoader<Uri, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModelLoader f12620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModelLoader f12621c;
    public final Class d;

    public static abstract class Factory<DataT> implements ModelLoaderFactory<Uri, DataT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f12622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class f12623b;

        public Factory(Context context, Class cls) {
            this.f12622a = context;
            this.f12623b = cls;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            Class cls = this.f12623b;
            return new QMediaStoreUriLoader(this.f12622a, multiModelLoaderFactory.a(File.class, cls), multiModelLoaderFactory.a(Uri.class, cls), cls);
        }
    }

    public static final class FileDescriptorFactory extends Factory<ParcelFileDescriptor> {
        public FileDescriptorFactory(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class InputStreamFactory extends Factory<InputStream> {
        public InputStreamFactory(Context context) {
            super(context, InputStream.class);
        }
    }

    public static final class QMediaStoreUriFetcher<DataT> implements DataFetcher<DataT> {
        public static final String[] l0 = {"_data"};
        public final Context X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ModelLoader f12624Y;
        public final ModelLoader Z;
        public final Uri e0;
        public final int f0;
        public final int g0;
        public final Options h0;
        public final Class i0;
        public volatile boolean j0;
        public volatile DataFetcher k0;

        public QMediaStoreUriFetcher(Context context, ModelLoader modelLoader, ModelLoader modelLoader2, Uri uri, int i2, int i3, Options options, Class cls) {
            this.X = context.getApplicationContext();
            this.f12624Y = modelLoader;
            this.Z = modelLoader2;
            this.e0 = uri;
            this.f0 = i2;
            this.g0 = i3;
            this.h0 = options;
            this.i0 = cls;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final Class a() {
            return this.i0;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void b() {
            DataFetcher dataFetcher = this.k0;
            if (dataFetcher != null) {
                dataFetcher.b();
            }
        }

        public final DataFetcher c() throws Throwable {
            ModelLoader.LoadData loadDataB;
            boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            Options options = this.h0;
            int i2 = this.g0;
            int i3 = this.f0;
            Context context = this.X;
            if (zIsExternalStorageLegacy) {
                Uri uri = this.e0;
                try {
                    Cursor cursorQuery = context.getContentResolver().query(uri, l0, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                loadDataB = this.f12624Y.b(file, i3, i2, options);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                int iCheckSelfPermission = context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
                Uri requireOriginal = this.e0;
                if (iCheckSelfPermission == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                loadDataB = this.Z.b(requireOriginal, i3, i2, options);
            }
            if (loadDataB != null) {
                return loadDataB.f12577c;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
            this.j0 = true;
            DataFetcher dataFetcher = this.k0;
            if (dataFetcher != null) {
                dataFetcher.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final DataSource d() {
            return DataSource.X;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void e(Priority priority, DataFetcher.DataCallback dataCallback) throws Throwable {
            try {
                DataFetcher dataFetcherC = c();
                if (dataFetcherC == null) {
                    dataCallback.c(new IllegalArgumentException("Failed to build fetcher for: " + this.e0));
                } else {
                    this.k0 = dataFetcherC;
                    if (this.j0) {
                        cancel();
                    } else {
                        dataFetcherC.e(priority, dataCallback);
                    }
                }
            } catch (FileNotFoundException e2) {
                dataCallback.c(e2);
            }
        }
    }

    public QMediaStoreUriLoader(Context context, ModelLoader modelLoader, ModelLoader modelLoader2, Class cls) {
        this.f12619a = context.getApplicationContext();
        this.f12620b = modelLoader;
        this.f12621c = modelLoader2;
        this.d = cls;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && MediaStoreUtil.a((Uri) obj);
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData b(Object obj, int i2, int i3, Options options) {
        Uri uri = (Uri) obj;
        return new ModelLoader.LoadData(new ObjectKey(uri), new QMediaStoreUriFetcher(this.f12619a, this.f12620b, this.f12621c, uri, i2, i3, options, this.d));
    }
}
