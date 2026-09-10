package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import com.google.android.gms.ads.AdSize;
import dalvik.system.DexClassLoader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import saneness.coshery;
import saneness.counters;
import saneness.fatness;

/* JADX INFO: loaded from: classes.dex */
public final class mf1 implements counters {
    public final Context a;
    public final ExecutorService b;
    public final a c;
    public final et2 d;
    public final u13 e;
    public final Set f;
    public final HashMap g = new HashMap();
    public final long h;
    public final File i;
    public boolean j;
    public byte[] k;
    public ClassLoader l;

    public mf1(Context context, ExecutorService executorService, a aVar, et2 et2Var, File file, u13 u13Var, long j, Set set) {
        this.a = context;
        this.b = executorService;
        this.c = aVar;
        this.d = et2Var;
        this.e = u13Var;
        this.f = set;
        this.i = new File(file, "rbp");
        this.h = j;
    }

    public final File a(File file) throws dt2, IOException {
        File file2 = new File(file + "/1772513912183.jar");
        if (file2.exists()) {
            return file2;
        }
        et2 et2Var = this.d;
        byte[] bArr = this.k;
        et2Var.getClass();
        byte[] bArrA = et2.a("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", bArr);
        file2.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                file2.setReadOnly();
            }
            fileOutputStream.write(bArrA, 0, bArrA.length);
            fileOutputStream.close();
            return file2;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final synchronized boolean b() {
        return this.j;
    }

    public final void c() throws Throwable {
        try {
            this.i.mkdirs();
            File fileA = a(this.i);
            b(this.i);
            try {
                this.l = new DexClassLoader(fileA.getAbsolutePath(), this.i.getAbsolutePath(), null, this.a.getClassLoader());
            } finally {
                if (fileA.exists()) {
                    fileA.delete();
                }
                c(this.i);
                File file = new File(String.format("%s/%s.dex", this.i, "1772513912183"));
                if (file.exists()) {
                    file.delete();
                }
            }
        } catch (dt2 e) {
            e = e;
            throw new bt2(e);
        } catch (IOException e2) {
            e = e2;
            throw new bt2(e);
        } catch (NullPointerException e3) {
            e = e3;
            throw new bt2(e);
        }
    }

    public final void d() {
        for (final xq2 xq2Var : this.f) {
            Pair pairCreate = Pair.create(xq2Var.a, xq2Var.b);
            if (!this.g.containsKey(pairCreate)) {
                this.g.put(pairCreate, this.b.submit(new Callable() { // from class: saneness.nonpolluting
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f37228kowloon.a(xq2Var);
                    }
                }));
            }
        }
    }

    public final void b(File file) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        Throwable th;
        File file2 = new File(file + "/1772513912183.tmmp");
        if (!file2.exists()) {
            return;
        }
        File file3 = new File(file + "/1772513912183.dex");
        if (file3.exists()) {
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            long length = file2.length();
            if (length <= 0) {
                if (file2.exists()) {
                    file2.delete();
                    return;
                }
                return;
            }
            byte[] bArr = new byte[(int) length];
            fileInputStream = new FileInputStream(file2);
            try {
                try {
                    if (fileInputStream.read(bArr) <= 0) {
                        if (file2.exists()) {
                            file2.delete();
                        }
                        a(fileInputStream);
                        return;
                    }
                    xa xaVarA = xa.a(bArr, vf0.a());
                    if ("1772513912183".equals(new String(xaVarA.r().c())) && Arrays.equals(xaVarA.p().c(), this.c.a(xaVarA.o().c())) && Arrays.equals(xaVarA.q().c(), Build.VERSION.SDK.getBytes())) {
                        et2 et2Var = this.d;
                        byte[] bArr2 = this.k;
                        String str = new String(xaVarA.o().c());
                        et2Var.getClass();
                        byte[] bArrA = et2.a(str, bArr2);
                        file3.createNewFile();
                        fileOutputStream = new FileOutputStream(file3);
                        try {
                            fileOutputStream.write(bArrA, 0, bArrA.length);
                            a(fileInputStream);
                            a(fileOutputStream);
                            return;
                        } catch (dt2 | IOException | NullPointerException unused) {
                            fileOutputStream2 = fileOutputStream;
                            a(fileInputStream);
                            a(fileOutputStream2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            a(fileInputStream);
                            a(fileOutputStream);
                            throw th;
                        }
                    }
                    if (file2.exists()) {
                        file2.delete();
                    }
                    a(fileInputStream);
                } catch (dt2 | IOException | NullPointerException unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                th = th;
                a(fileInputStream);
                a(fileOutputStream);
                throw th;
            }
        } catch (dt2 | IOException | NullPointerException unused3) {
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            fileInputStream = null;
        }
    }

    public final Method a(String str, String str2) {
        Future future = (Future) this.g.get(new Pair(str, str2));
        if (future == null) {
            this.e.b(gf0.EVENT_ID_FALLBACK_METHOD_NOT_FOUND_ERROR);
            return null;
        }
        try {
            return (Method) future.get(this.h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            this.e.b(gf0.EVENT_ID_FALLBACK_METHOD_EXECUTION_ERROR);
            return null;
        } catch (TimeoutException unused2) {
            this.e.b(gf0.EVENT_ID_FALLBACK_METHOD_TIMEOUT_ERROR);
            return null;
        }
    }

    public final void a() throws bt2 {
        try {
            this.d.getClass();
            try {
                byte[] bArrSaneness = fatness.saneness("ade/BdTWBy4RpBzcVzmqSuUrvFcAZbkCgkhAXX9gvJA=", false);
                if (bArrSaneness.length == 32) {
                    byte[] bArr = new byte[16];
                    ByteBuffer.wrap(bArrSaneness, 4, 16).get(bArr);
                    for (int i = 0; i < 16; i++) {
                        bArr[i] = (byte) (bArr[i] ^ 68);
                    }
                    this.k = bArr;
                    return;
                }
                throw new dt2();
            } catch (IllegalArgumentException e) {
                throw new dt2(e);
            }
        } catch (dt2 e2) {
            throw new bt2(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c5  */
    public final void c(File file) throws Throwable {
        Throwable th;
        Throwable th2;
        if (new File(file + "/1772513912183.tmp").exists()) {
            return;
        }
        File file2 = new File(file + "/1772513912183.dex");
        if (!file2.exists()) {
            return;
        }
        long length = file2.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                try {
                    try {
                        if (fileInputStream2.read(bArr) <= 0) {
                            a(fileInputStream2);
                            if (file2.exists()) {
                                file2.delete();
                                return;
                            }
                        }
                        coshery cosheryVarS = xa.s();
                        byte[] bytes = Build.VERSION.SDK.getBytes();
                        try {
                            coshery cosheryVarAttabal = cosheryVarS.attabal(kn.a(bytes, 0, bytes.length));
                            byte[] bytes2 = "1772513912183".getBytes();
                            cosheryVarAttabal.dern(kn.a(bytes2, 0, bytes2.length));
                            this.d.getClass();
                            throw new dt2();
                        } catch (dt2 e) {
                            e = e;
                            th = e;
                            fileInputStream = fileInputStream2;
                            u13 u13Var = this.e;
                            gf0 gf0Var = gf0.EVENT_ID_UNSPECIFIED;
                            ((kc1) u13Var.a).a(AdSize.MEDIUM_RECTANGLE_WIDTH, -1L, th, null);
                            a(fileInputStream);
                            if (file2.exists()) {
                                file2.delete();
                            }
                        } catch (IOException e2) {
                            e = e2;
                            th = e;
                            fileInputStream = fileInputStream2;
                            u13 u13Var2 = this.e;
                            gf0 gf0Var2 = gf0.EVENT_ID_UNSPECIFIED;
                            ((kc1) u13Var2.a).a(AdSize.MEDIUM_RECTANGLE_WIDTH, -1L, th, null);
                            a(fileInputStream);
                            if (file2.exists()) {
                                file2.delete();
                            }
                        }
                    } catch (dt2 e3) {
                        e = e3;
                    } catch (IOException e4) {
                        e = e4;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    fileInputStream = fileInputStream2;
                    a(fileInputStream);
                    if (file2.exists()) {
                        file2.delete();
                        throw th2;
                    }
                    throw th2;
                }
            } catch (dt2 | IOException e5) {
                th = e5;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    public final Method a(xq2 xq2Var) {
        ClassLoader classLoader = this.l;
        et2 et2Var = this.d;
        byte[] bArr = this.k;
        String str = xq2Var.a;
        String str2 = xq2Var.b;
        Class<?>[] clsArr = xq2Var.c;
        try {
            et2Var.getClass();
            return classLoader.loadClass(et2.b(str, bArr)).getMethod(et2.b(str2, bArr), clsArr);
        } catch (dt2 | ClassNotFoundException | NoSuchMethodException | NullPointerException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }
}
