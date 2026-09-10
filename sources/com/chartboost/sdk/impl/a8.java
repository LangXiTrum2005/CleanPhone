package com.chartboost.sdk.impl;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f13413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b8 f13414b;

    public a8(Context context, AtomicReference atomicReference) {
        b8 b8Var = new b8(context.getCacheDir());
        this.f13414b = b8Var;
        this.f13413a = atomicReference;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(((qf) atomicReference.get()).f14947p);
            File file = new File(b8Var.f13491a, "templates");
            if (file.exists()) {
                a(file.listFiles(), jCurrentTimeMillis);
                a(b8Var);
            }
        } catch (Exception e2) {
            za.b("Exception while cleaning up templates directory at " + this.f13414b.f.getPath(), e2);
            e2.printStackTrace();
        }
    }

    public final void a(File[] fileArr, long j) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.isDirectory()) {
                    b(file.listFiles(), j);
                    a(file.listFiles(), file);
                }
            }
        }
    }

    public final void b(File[] fileArr, long j) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.lastModified() < j && !file.delete()) {
                    za.b("Unable to delete " + file.getPath(), null);
                }
            }
        }
    }

    public File[] c() {
        File fileB = b();
        if (fileB != null) {
            return fileB.listFiles();
        }
        return null;
    }

    public File d() {
        return this.f13414b.f13496i;
    }

    public JSONObject e() {
        String[] list;
        JSONObject jSONObject = new JSONObject();
        try {
            File file = a().f13491a;
            for (String str : ((qf) this.f13413a.get()).q) {
                if (!str.equals("templates")) {
                    File file2 = new File(file, str);
                    JSONArray jSONArray = new JSONArray();
                    if (file2.exists() && (list = file2.list()) != null) {
                        for (String str2 : list) {
                            if (!str2.equals(".nomedia") && !str2.endsWith(".tmp")) {
                                jSONArray.put(str2);
                            }
                        }
                    }
                    s2.a(jSONObject, str, jSONArray);
                }
            }
        } catch (Exception e2) {
            za.b("getWebViewCacheAssets: " + e2, null);
        }
        return jSONObject;
    }

    public void d(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                int i2 = randomAccessFile.read();
                randomAccessFile.seek(0L);
                randomAccessFile.write(i2);
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e2) {
            za.b("File not found when attempting to touch", e2);
        } catch (IOException e3) {
            za.b("IOException when attempting to touch file", e3);
        }
    }

    public boolean c(File file) {
        return file != null && file.exists() && file.length() > 0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0023 A[Catch: Exception -> 0x001e, TRY_LEAVE, TryCatch #0 {Exception -> 0x001e, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x0010, B:10:0x0014, B:15:0x0023), top: B:19:0x0004 }] */
    public long b(File file) {
        long jB = 0;
        if (file != null) {
            try {
                if (file.isDirectory()) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            jB += b(file2);
                        }
                        return jB;
                    }
                } else if (file != null) {
                    return file.length();
                }
            } catch (Exception e2) {
                za.b("getFolderSize: " + e2, null);
            }
        } else if (file != null) {
            return file.length();
        }
        return 0L;
    }

    public b8 a() {
        return this.f13414b;
    }

    public boolean a(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return file.delete();
    }

    public final void a(File[] fileArr, File file) {
        if (fileArr == null || fileArr.length != 0 || file.delete()) {
            return;
        }
        za.b("Unable to delete " + file.getPath(), null);
    }

    public File b() {
        return this.f13414b.f13495h;
    }

    public File a(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        File file2 = new File(file, str);
        if (!file2.exists() || file2.length() <= 0) {
            return null;
        }
        return file2;
    }

    public Boolean a(z zVar) {
        Map mapD = zVar.d();
        b8 b8VarA = a();
        if (b8VarA == null) {
            return Boolean.FALSE;
        }
        File file = b8VarA.f13491a;
        for (p1 p1Var : mapD.values()) {
            File fileA = p1Var.a(file);
            if (fileA == null) {
                return Boolean.FALSE;
            }
            if (!fileA.exists()) {
                za.b("Asset does not exist: " + p1Var.f14798b, null);
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public final void a(b8 b8Var) {
        File file = new File(b8Var.f13491a, ".adId");
        if (!file.exists() || file.delete()) {
            return;
        }
        za.b("Unable to delete " + file.getPath(), null);
    }
}
