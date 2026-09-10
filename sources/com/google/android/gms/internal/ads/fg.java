package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.zzba;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExecutorService f14388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DexClassLoader f14389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s6 f14390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f14391e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14393g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public so0 f14396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public nf f14397k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f14398m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ag f14400o;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile AdvertisingIdClient f14392f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile je f14394h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Future f14395i = null;
    public boolean l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14399n = false;

    public fg(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f14393g = applicationContext != null;
        context = applicationContext != null ? applicationContext : context;
        this.f14387a = context;
        this.f14398m = new HashMap();
        if (this.f14400o != null) {
            return;
        }
        this.f14400o = new ag(context);
    }

    public static fg a(Context context, boolean z10, so0 so0Var) throws Throwable {
        fg fgVar = new fg(context);
        Context context2 = fgVar.f14387a;
        try {
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(new dg());
            fgVar.f14388b = executorServiceNewCachedThreadPool;
            int i10 = 0;
            if (z10) {
                executorServiceNewCachedThreadPool.submit(new eg(fgVar, 0));
            }
            int i11 = 1;
            fgVar.f14388b.execute(new eg(fgVar, 1));
            try {
                i9.e eVar = i9.e.f42929b;
                eVar.getClass();
                i9.e.a(context2);
                fgVar.l = eVar.c(context2, i9.e.f42928a) == 0;
            } catch (Throwable unused) {
            }
            if (so0Var != null) {
                fgVar.f14396j = so0Var;
            } else if (fgVar.l) {
                fgVar.f14395i = fgVar.f14388b.submit(new com.google.android.gms.common.api.internal.q(i10, i11, fgVar));
            }
            char[] cArr = ig.f15734a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (((Boolean) zzba.zzc().a(am.f12341s4)).booleanValue()) {
                    throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
                }
            }
            fgVar.f14390d = new s6(i11);
            try {
                try {
                    byte[] bArrDecode = Base64.decode("GpeoZNfYB0xbX4XrY9tptE+P6lGr6tGbtd6Fg+9sjdQ=", 2);
                    if (bArrDecode.length == 0) {
                        throw new IllegalArgumentException("Unable to decode ".concat("GpeoZNfYB0xbX4XrY9tptE+P6lGr6tGbtd6Fg+9sjdQ="));
                    }
                    if (bArrDecode.length != 32) {
                        throw new wf();
                    }
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrDecode, 4, 16);
                    byte[] bArr = new byte[16];
                    byteBufferWrap.get(bArr);
                    for (int i12 = 0; i12 < 16; i12++) {
                        bArr[i12] = (byte) (bArr[i12] ^ 68);
                    }
                    fgVar.f14391e = bArr;
                    try {
                        try {
                            File cacheDir = context2.getCacheDir();
                            if (cacheDir == null && (cacheDir = context2.getDir("dex", 0)) == null) {
                                throw new zf();
                            }
                            File file = new File(String.format("%s/%s.jar", cacheDir, "1762298034389"));
                            if (!file.exists()) {
                                s6 s6Var = fgVar.f14390d;
                                byte[] bArr2 = fgVar.f14391e;
                                s6Var.getClass();
                                byte[] bArrS = s6.s("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", bArr2);
                                file.createNewFile();
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                if (Build.VERSION.SDK_INT >= 33) {
                                    file.setReadOnly();
                                }
                                fileOutputStream.write(bArrS, 0, bArrS.length);
                                fileOutputStream.close();
                            }
                            fgVar.g(cacheDir);
                            try {
                                try {
                                    fgVar.f14389c = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, context2.getClassLoader());
                                    h(file);
                                    fgVar.f(cacheDir);
                                    h(new File(String.format("%s/%s.dex", cacheDir, "1762298034389")));
                                    fgVar.f14397k = new nf(fgVar);
                                    fgVar.f14399n = true;
                                } catch (SecurityException e10) {
                                    throw new zf(e10);
                                }
                            } catch (Throwable th2) {
                                h(file);
                                fgVar.f(cacheDir);
                                h(new File(String.format("%s/%s.dex", cacheDir, "1762298034389")));
                                throw th2;
                            }
                        } catch (wf e11) {
                            throw new zf(e11);
                        } catch (FileNotFoundException e12) {
                            throw new zf(e12);
                        }
                    } catch (IOException e13) {
                        throw new zf(e13);
                    } catch (NullPointerException e14) {
                        throw new zf(e14);
                    }
                } catch (IllegalArgumentException e15) {
                    throw new wf(e15);
                }
            } catch (wf e16) {
                throw new zf(e16);
            }
        } catch (zf unused2) {
        }
        return fgVar;
    }

    public static final void h(File file) {
        if (file.exists()) {
            file.delete();
            return;
        }
        Log.d("fg", "File " + file.getAbsolutePath() + " not found. No need for deletion");
    }

    public final je b() {
        so0 so0Var = this.f14396j;
        if (so0Var == null) {
            return this.f14394h;
        }
        pe1 pe1Var = (pe1) so0Var.f20013b;
        if (pe1Var == null || !pe1Var.isDone()) {
            return je.B0();
        }
        try {
            return (je) ((pe1) this.f14396j.f20013b).get();
        } catch (InterruptedException | ExecutionException unused) {
            return je.B0();
        }
    }

    public final void c(String str, String str2, Class... clsArr) {
        Pair pair = new Pair(str, str2);
        HashMap map = this.f14398m;
        if (map.containsKey(pair)) {
            return;
        }
        map.put(pair, new xg(this, str, str2, clsArr));
    }

    public final Method d(String str, String str2) {
        xg xgVar = (xg) this.f14398m.get(new Pair(str, str2));
        if (xgVar == null) {
            return null;
        }
        if (xgVar.f21868d != null) {
            return xgVar.f21868d;
        }
        try {
            if (xgVar.f21870f.await(2L, TimeUnit.SECONDS)) {
                return xgVar.f21868d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final int e() {
        if (this.f14397k == null) {
            return Integer.MIN_VALUE;
        }
        ConditionVariable conditionVariable = nf.f17790c;
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (nf.f17792e == null) {
                synchronized (nf.class) {
                    try {
                        if (nf.f17792e == null) {
                            nf.f17792e = new Random();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return nf.f17792e.nextInt();
        }
    }

    public final void f(File file) throws Throwable {
        Throwable th2;
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1762298034389"));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1762298034389"));
        if (file3.exists()) {
            long length = file3.length();
            if (length > 0) {
                byte[] bArr = new byte[(int) length];
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file3);
                    try {
                        try {
                            if (fileInputStream2.read(bArr) <= 0) {
                                try {
                                    fileInputStream2.close();
                                } catch (IOException unused) {
                                }
                                h(file3);
                                return;
                            }
                            System.out.print("test");
                            System.out.print("test");
                            System.out.print("test");
                            me meVarE = ne.E();
                            byte[] bytes = Build.VERSION.SDK.getBytes();
                            as1 as1Var = cs1.f13248b;
                            as1 as1VarD = cs1.D(bytes, 0, bytes.length);
                            meVarE.b();
                            ((ne) meVarE.f19193b).I(as1VarD);
                            byte[] bytes2 = "1762298034389".getBytes();
                            as1 as1VarD2 = cs1.D(bytes2, 0, bytes2.length);
                            meVarE.b();
                            ((ne) meVarE.f19193b).H(as1VarD2);
                            s6 s6Var = this.f14390d;
                            byte[] bArr2 = this.f14391e;
                            s6Var.getClass();
                            byte[] bytes3 = s6.n(bArr2, bArr).getBytes();
                            meVarE.h(cs1.D(bytes3, 0, bytes3.length));
                            byte[] bArrC = cf.c(bytes3);
                            meVarE.i(cs1.D(bArrC, 0, bArrC.length));
                            file2.createNewFile();
                            fileOutputStream = new FileOutputStream(file2);
                            try {
                                byte[] bArrB = ((ne) meVarE.e()).b();
                                fileOutputStream.write(bArrB, 0, bArrB.length);
                                fileOutputStream.close();
                                try {
                                    fileInputStream2.close();
                                } catch (IOException unused2) {
                                }
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused3) {
                                }
                                h(file3);
                                return;
                            } catch (wf | IOException | NoSuchAlgorithmException unused4) {
                            } catch (Throwable th3) {
                                th2 = th3;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException unused6) {
                                    }
                                }
                                h(file3);
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            fileOutputStream = null;
                        }
                    } catch (wf | IOException | NoSuchAlgorithmException unused7) {
                        fileOutputStream = null;
                    }
                    fileInputStream = fileInputStream2;
                } catch (wf | IOException | NoSuchAlgorithmException unused8) {
                    fileOutputStream = null;
                } catch (Throwable th5) {
                    th2 = th5;
                    fileOutputStream = null;
                }
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused9) {
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused10) {
                    }
                }
                h(file3);
            }
        }
    }

    public final void g(File file) throws Throwable {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1762298034389"));
        if (!file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1762298034389"));
        if (file3.exists()) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                long length = file2.length();
                if (length <= 0) {
                    h(file2);
                    return;
                }
                byte[] bArr = new byte[(int) length];
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                try {
                    try {
                        if (fileInputStream2.read(bArr) <= 0) {
                            Log.d("fg", "Cannot read the cache data.");
                            h(file2);
                        } else {
                            try {
                                ks1 ks1Var = ks1.f16518a;
                                int i10 = tr1.f20473a;
                                ne neVarD = ne.D(bArr, ks1.f16519b);
                                if ("1762298034389".equals(new String(neVarD.B().h())) && Arrays.equals(neVarD.A().h(), cf.c(neVarD.z().h())) && Arrays.equals(neVarD.C().h(), Build.VERSION.SDK.getBytes())) {
                                    s6 s6Var = this.f14390d;
                                    byte[] bArr2 = this.f14391e;
                                    String str = new String(neVarD.z().h());
                                    s6Var.getClass();
                                    byte[] bArrS = s6.s(str, bArr2);
                                    file3.createNewFile();
                                    fileOutputStream = new FileOutputStream(file3);
                                    try {
                                        fileOutputStream.write(bArrS, 0, bArrS.length);
                                        try {
                                            fileInputStream2.close();
                                        } catch (IOException unused) {
                                        }
                                        try {
                                            fileOutputStream.close();
                                            return;
                                        } catch (IOException unused2) {
                                            return;
                                        }
                                    } catch (wf | IOException | NoSuchAlgorithmException unused3) {
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException unused4) {
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException unused5) {
                                            }
                                        }
                                        if (fileOutputStream == null) {
                                            throw th;
                                        }
                                        try {
                                            fileOutputStream.close();
                                            throw th;
                                        } catch (IOException unused6) {
                                            throw th;
                                        }
                                    }
                                }
                                h(file2);
                            } catch (NullPointerException unused7) {
                                fileInputStream2.close();
                                return;
                            }
                        }
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused8) {
                        }
                    } catch (wf | IOException | NoSuchAlgorithmException unused9) {
                        fileOutputStream = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (wf | IOException | NoSuchAlgorithmException unused10) {
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        } catch (IOException unused11) {
        }
    }
}
