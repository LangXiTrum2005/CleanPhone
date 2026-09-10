package com.bytedance.sdk.openadsdk;

import android.support.v4.media.a;
import android.text.TextUtils;
import com.bykv.vk.openvk.qdl.qdl.qdl.qdl.ud;
import com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl.qdl;
import com.bytedance.sdk.component.utils.wd;
import com.bytedance.sdk.openadsdk.core.yt;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class CacheDirFactory {
    public static volatile ud MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static String qdl;

    public static int getCacheType() {
        return 1;
    }

    public static String getDiskCacheDirPath(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getRootDir());
        return a.r(sb, File.separator, str);
    }

    public static ud getICacheDir(int i2) {
        return qdl();
    }

    public static String getImageCacheDir(String str) {
        if (qdl == null) {
            qdl = getDiskCacheDirPath(str);
        }
        return qdl;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File fileQdl = wd.qdl(yt.qdl(), com.bytedance.sdk.openadsdk.multipro.ud.lnr(), "tt_ad");
        if (fileQdl.isFile()) {
            fileQdl.delete();
        }
        if (!fileQdl.exists()) {
            fileQdl.mkdirs();
        }
        String absolutePath = fileQdl.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    private static ud qdl() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                try {
                    if (MEDIA_CACHE_DIR == null) {
                        qdl qdlVar = new qdl();
                        MEDIA_CACHE_DIR = qdlVar;
                        qdlVar.qdl(getRootDir());
                        MEDIA_CACHE_DIR.mml();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }
}
