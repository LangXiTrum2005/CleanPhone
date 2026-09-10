package com.bykv.vk.openvk.preload.geckox.e;

import com.bykv.vk.openvk.preload.geckox.e.a.c;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f12960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile File f12962c;
    private volatile Long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile com.bykv.vk.openvk.preload.geckox.e.a.a f12963e;
    private AtomicBoolean f = new AtomicBoolean(false);

    public a(String str, String str2) {
        this.f12960a = str;
        this.f12961b = str2;
    }

    private synchronized com.bykv.vk.openvk.preload.geckox.e.a.a d(String str) throws Exception {
        if (this.f12963e != null) {
            return this.f12963e;
        }
        File fileE = e(str);
        if (fileE == null) {
            throw new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
        }
        File file = new File(fileE, "res.macv");
        File file2 = new File(fileE, "res");
        if (file2.exists() && file2.isDirectory()) {
            this.f12963e = new c(fileE);
        } else {
            if (!file.exists() || !file.isFile()) {
                throw new RuntimeException("can not find res, dir:" + fileE.getAbsolutePath());
            }
            this.f12963e = new com.bykv.vk.openvk.preload.geckox.e.a.b(fileE);
        }
        return this.f12963e;
    }

    private synchronized File e(String str) throws Exception {
        if (this.f12962c != null) {
            return this.f12962c;
        }
        if (this.d != null && this.d.longValue() == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12960a);
        String str2 = File.separator;
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        sb.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(sb.toString());
        try {
            if (this.d == null) {
                this.d = g.a(new File(this.f12960a, str));
            }
            if (this.d == null) {
                this.d = -1L;
                bVarA.a();
                return null;
            }
            File file = new File(this.f12960a, str2 + str + str2 + this.d + str2 + "using.lock");
            this.f12962c = file.getParentFile();
            com.bykv.vk.openvk.preload.geckox.f.c.a(file.getAbsolutePath());
            File file2 = this.f12962c;
            bVarA.a();
            return file2;
        } catch (Throwable th) {
            bVarA.a();
            throw th;
        }
    }

    public final InputStream a(String str) throws Exception {
        return d(this.f12961b).a(a(this.f12961b, str));
    }

    public final boolean b(String str) throws Exception {
        return d(this.f12961b).b(a(this.f12961b, str));
    }

    public final int c(String str) {
        int length;
        try {
            File file = new File(e(str), "res");
            if (file.exists() && file.isDirectory() && (length = file.listFiles().length) > 0) {
                return length - 1;
            }
            return 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    private static String a(String str, String str2) {
        return str2.substring(str.length() + 1);
    }

    public final String b() {
        return this.f12961b;
    }

    public final Long a() {
        return this.d;
    }

    public final void c() throws Exception {
        if (this.f.getAndSet(true)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12960a);
        String str = File.separator;
        sb.append(str);
        sb.append(this.f12961b);
        sb.append(str);
        sb.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(sb.toString());
        GeckoLogger.d("gecko-file-lock", "channel version loader clean");
        try {
            if (this.f12962c == null) {
                bVarA.a();
                return;
            }
            com.bykv.vk.openvk.preload.geckox.f.c.b(this.f12962c.getAbsolutePath() + str + "using.lock");
            bVarA.a();
            com.bykv.vk.openvk.preload.geckox.a.c.a(this.f12960a + str + this.f12961b);
        } catch (Throwable th) {
            bVarA.a();
            throw th;
        }
    }
}
