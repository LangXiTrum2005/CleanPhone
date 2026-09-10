package com.vungle.ads.internal.util;

import android.content.Context;
import android.os.StatFs;
import com.ironsource.sdk.controller.f;
import java.io.File;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PathProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\f\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\bJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u000eJ\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/vungle/ads/internal/util/polloi;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ljava/io/File;", "getVungleDir", "()Ljava/io/File;", "getCleverCacheDir", "getVmDir", "", f.b.c, "getDownloadsDirForAd", "(Ljava/lang/String;)Ljava/io/File;", "getSharedPrefsDir", "name", "getUnclosedAdFile", "path", "", "getAvailableBytes", "(Ljava/lang/String;)J", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "vungleDir", "Ljava/io/File;", "vmDir", "cleverCacheDir", "Companion", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class polloi {
    private static final String CLEVER_CACHE_FOLDER = "clever_cache";
    private static final long UNKNOWN_SIZE = -1;
    private static final String VM_FOLDER = "adAssets";
    private static final String VUNGLE_FOLDER = "vungle_cache";
    private final File cleverCacheDir;
    private final Context context;
    private final File vmDir;
    private final File vungleDir;

    public polloi(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        File file = new File(context.getNoBackupFilesDir(), VUNGLE_FOLDER);
        this.vungleDir = file;
        File file2 = new File(file, VM_FOLDER);
        this.vmDir = file2;
        File file3 = new File(file, CLEVER_CACHE_FOLDER);
        this.cleverCacheDir = file3;
        for (File file4 : p002kotlin.collections.adultoid.kowloon(file, file2, file3)) {
            if (!file4.exists()) {
                file4.mkdirs();
            }
        }
    }

    public final long getAvailableBytes(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            return new StatFs(path).getAvailableBytes();
        } catch (IllegalArgumentException e) {
            arytenoidectomy.INSTANCE.w("PathProvider", "Failed to get available bytes " + e.getMessage());
            return -1L;
        }
    }

    public final File getCleverCacheDir() {
        if (!this.cleverCacheDir.exists()) {
            this.cleverCacheDir.mkdirs();
        }
        return this.cleverCacheDir;
    }

    public final Context getContext() {
        return this.context;
    }

    public final File getDownloadsDirForAd(String adId) {
        if (adId == null || adId.length() == 0) {
            return null;
        }
        File file = new File(getVmDir(), adId);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File getSharedPrefsDir() {
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }

    public final File getUnclosedAdFile(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new File(getSharedPrefsDir(), name);
    }

    public final File getVmDir() {
        if (!this.vmDir.exists()) {
            this.vmDir.mkdirs();
        }
        return this.vmDir;
    }

    public final File getVungleDir() {
        if (!this.vungleDir.exists()) {
            this.vungleDir.mkdirs();
        }
        return this.vungleDir;
    }
}
