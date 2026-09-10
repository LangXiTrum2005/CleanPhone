package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f12933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12934c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12935e;
    public String f;
    public int g;

    public static com.bykv.vk.openvk.preload.geckox.buffer.a a(File file, long j) throws IOException {
        com.bykv.vk.openvk.preload.geckox.buffer.a aVarB = b(file, j);
        GeckoLogger.d("gecko-debug-tag", "buffer type:" + aVarB.getClass());
        return aVarB;
    }

    private static com.bykv.vk.openvk.preload.geckox.buffer.a b(File file, long j) throws IOException {
        if (j <= 0) {
            try {
                return new b(file);
            } catch (Exception e2) {
                throw new IOException("create FileBuffer failed! file:" + file.getAbsolutePath() + " caused by:" + e2.getMessage(), e2);
            }
        }
        try {
            return new c(j, file);
        } catch (Exception e3) {
            throw new RuntimeException("create random access file failed! file:" + file.getAbsolutePath() + " caused by:" + e3.getMessage(), e3);
        }
    }
}
