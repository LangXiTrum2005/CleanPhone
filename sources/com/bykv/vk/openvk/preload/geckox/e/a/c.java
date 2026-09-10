package com.bykv.vk.openvk.preload.geckox.e.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    public c(File file) {
        super(file);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.e.a.a
    public final InputStream a(File file, String str) throws IOException {
        File file2 = new File(file, android.support.v4.media.a.r(new StringBuilder("res"), File.separator, str));
        if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            throw new IOException("file not found");
        }
        GeckoLogger.d("gecko-debug-tag", "NormalFileLoader, file:", file2.getAbsolutePath());
        return new FileInputStream(file2.getCanonicalFile());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.e.a.a
    public final boolean b(File file, String str) throws IOException {
        return new File(file, android.support.v4.media.a.r(new StringBuilder("res"), File.separator, str)).exists();
    }
}
