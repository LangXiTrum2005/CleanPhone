package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: loaded from: classes.dex */
public abstract class DiskCacheStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DiskCacheStrategy f12431a = new AnonymousClass2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DiskCacheStrategy f12432b = new AnonymousClass3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DiskCacheStrategy f12433c = new AnonymousClass5();

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DiskCacheStrategy$1, reason: invalid class name */
    public class AnonymousClass1 extends DiskCacheStrategy {
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean c(DataSource dataSource) {
            return dataSource == DataSource.f12350Y;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean d(boolean z2, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.e0 || dataSource == DataSource.f0) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DiskCacheStrategy$2, reason: invalid class name */
    public class AnonymousClass2 extends DiskCacheStrategy {
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean c(DataSource dataSource) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean d(boolean z2, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DiskCacheStrategy$3, reason: invalid class name */
    public class AnonymousClass3 extends DiskCacheStrategy {
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean c(DataSource dataSource) {
            return (dataSource == DataSource.Z || dataSource == DataSource.f0) ? false : true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean d(boolean z2, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DiskCacheStrategy$4, reason: invalid class name */
    public class AnonymousClass4 extends DiskCacheStrategy {
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean c(DataSource dataSource) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean d(boolean z2, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.e0 || dataSource == DataSource.f0) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DiskCacheStrategy$5, reason: invalid class name */
    public class AnonymousClass5 extends DiskCacheStrategy {
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean c(DataSource dataSource) {
            return dataSource == DataSource.f12350Y;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean d(boolean z2, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z2 && dataSource == DataSource.Z) || dataSource == DataSource.X) && encodeStrategy == EncodeStrategy.f12352Y;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(DataSource dataSource);

    public abstract boolean d(boolean z2, DataSource dataSource, EncodeStrategy encodeStrategy);
}
