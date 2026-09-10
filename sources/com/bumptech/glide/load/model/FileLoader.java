package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class FileLoader<Data> implements ModelLoader<File, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOpener f12557a;

    public static class Factory<Data> implements ModelLoaderFactory<File, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FileOpener f12558a;

        public Factory(FileOpener fileOpener) {
            this.f12558a = fileOpener;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new FileLoader(this.f12558a);
        }
    }

    public static class FileDescriptorFactory extends Factory<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: com.bumptech.glide.load.model.FileLoader$FileDescriptorFactory$1, reason: invalid class name */
        class AnonymousClass1 implements FileOpener<ParcelFileDescriptor> {
            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public final Class a() {
                return ParcelFileDescriptor.class;
            }

            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public final void b(Object obj) throws IOException {
                ((ParcelFileDescriptor) obj).close();
            }

            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public final Object c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public FileDescriptorFactory() {
            super(new AnonymousClass1());
        }
    }

    public static final class FileFetcher<Data> implements DataFetcher<Data> {
        public final File X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final FileOpener f12559Y;
        public Object Z;

        public FileFetcher(File file, FileOpener fileOpener) {
            this.X = file;
            this.f12559Y = fileOpener;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final Class a() {
            return this.f12559Y.a();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void b() {
            Object obj = this.Z;
            if (obj != null) {
                try {
                    this.f12559Y.b(obj);
                } catch (IOException unused) {
                }
            }
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
            try {
                Object objC = this.f12559Y.c(this.X);
                this.Z = objC;
                dataCallback.f(objC);
            } catch (FileNotFoundException e2) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e2);
                }
                dataCallback.c(e2);
            }
        }
    }

    public interface FileOpener<Data> {
        Class a();

        void b(Object obj);

        Object c(File file);
    }

    public static class StreamFactory extends Factory<InputStream> {

        /* JADX INFO: renamed from: com.bumptech.glide.load.model.FileLoader$StreamFactory$1, reason: invalid class name */
        class AnonymousClass1 implements FileOpener<InputStream> {
            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public final Class a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public final void b(Object obj) throws IOException {
                ((InputStream) obj).close();
            }

            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public final Object c(File file) {
                return new FileInputStream(file);
            }
        }

        public StreamFactory() {
            super(new AnonymousClass1());
        }
    }

    public FileLoader(FileOpener fileOpener) {
        this.f12557a = fileOpener;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData b(Object obj, int i2, int i3, Options options) {
        File file = (File) obj;
        return new ModelLoader.LoadData(new ObjectKey(file), new FileFetcher(file, this.f12557a));
    }
}
