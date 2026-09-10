package s0;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ak.k f49934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f49935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fn.d f49936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f49937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f49938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f49939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ln.c f49940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wj.j f49941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wj.j f49942i;

    public w0(ak.k context, File file) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(file, "file");
        this.f49934a = context;
        this.f49935b = file;
        Object obj = x0.f49949b;
        this.f49936c = new fn.d(new b4.b(file, (ak.f) null, 13), ak.l.f3620a, -2, en.a.f40122a);
        this.f49937d = ".lock";
        this.f49938e = ".version";
        this.f49939f = "fcntl failed: EAGAIN";
        this.f49940g = new ln.c();
        this.f49941h = r9.b.u(new t0(this, 2));
        this.f49942i = r9.b.u(new t0(this, 1));
    }

    public static final void f(w0 w0Var, File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    @Override // s0.p0
    public final Object a(ck.c cVar) {
        if (this.f49942i.f53291b == wj.o.f53296a) {
            return cn.d0.J(this.f49934a, new s0(this, null, 0), cVar);
        }
        return new Integer(b1.f49758b.nativeGetCounterValue(((b1) this.f49942i.getValue()).f49759a));
    }

    @Override // s0.p0
    public final fn.e b() {
        return this.f49936c;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:41:0x00bb, B:55:0x00db, B:56:0x00de), top: B:77:0x0022, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00db A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:41:0x00bb, B:55:0x00db, B:56:0x00de), top: B:77:0x0022, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [jk.b] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.Closeable, java.lang.Object, jk.b] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    @Override // s0.p0
    public final Object c(jk.b bVar, ck.c cVar) throws Throwable {
        u0 u0Var;
        ln.c cVar2;
        ?? r10;
        FileOutputStream fileOutputStream;
        Throwable th2;
        Object obj;
        Object obj2;
        ?? r2;
        Closeable closeable;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        Object obj3;
        Object obj4;
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i10 = u0Var.f49920k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                u0Var.f49920k = i10 - Integer.MIN_VALUE;
            } else {
                u0Var = new u0(this, cVar);
            }
        } else {
            u0Var = new u0(this, cVar);
        }
        Object obj5 = u0Var.f49918i;
        int i11 = u0Var.f49920k;
        bk.a aVar = bk.a.f5708a;
        try {
            try {
                try {
                    if (i11 == 0) {
                        t9.e.z(obj5);
                        u0Var.f49915f = this;
                        u0Var.f49916g = bVar;
                        cVar2 = this.f49940g;
                        u0Var.f49917h = cVar2;
                        u0Var.f49920k = 1;
                        if (cVar2.e(u0Var) != aVar) {
                        }
                        r10 = bVar;
                        obj5 = cVar2;
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fileLock = (FileLock) u0Var.f49917h;
                            closeable = (Closeable) u0Var.f49916g;
                            ln.a aVar2 = (ln.a) u0Var.f49915f;
                            try {
                                t9.e.z(obj5);
                                obj3 = aVar2;
                                obj4 = obj5;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    qk.i0.j(closeable, null);
                                    ((ln.c) obj3).g(null);
                                    return obj4;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj5 = obj3;
                                    ((ln.c) obj5).g(null);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th2;
                            }
                        }
                        closeable = (Closeable) u0Var.f49917h;
                        obj2 = (ln.a) u0Var.f49916g;
                        jk.b bVar2 = (jk.b) u0Var.f49915f;
                        try {
                            t9.e.z(obj5);
                            r2 = bVar2;
                            obj2 = obj2;
                            obj = obj5;
                            fileLock2 = (FileLock) obj;
                            try {
                                u0Var.f49915f = obj2;
                                u0Var.f49916g = closeable;
                                u0Var.f49917h = fileLock2;
                                u0Var.f49920k = 3;
                                objInvoke = r2.invoke(u0Var);
                                if (objInvoke != aVar) {
                                    obj3 = obj2;
                                    fileLock = fileLock2;
                                    obj4 = objInvoke;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    qk.i0.j(closeable, null);
                                    ((ln.c) obj3).g(null);
                                    return obj4;
                                }
                                r10 = bVar;
                                obj5 = cVar2;
                                return aVar;
                            } catch (Throwable th5) {
                                fileLock = fileLock2;
                                th2 = th5;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th2;
                            }
                        } catch (Throwable th6) {
                            th2 = th6;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th2;
                        }
                    }
                    ln.a aVar3 = (ln.a) u0Var.f49917h;
                    jk.b bVar3 = (jk.b) u0Var.f49916g;
                    w0 w0Var = (w0) u0Var.f49915f;
                    t9.e.z(obj5);
                    obj5 = aVar3;
                    this = w0Var;
                    r10 = bVar3;
                    u0Var.f49915f = r10;
                    u0Var.f49916g = obj5;
                    u0Var.f49917h = fileOutputStream;
                    u0Var.f49920k = 2;
                    Object objA = j.a(fileOutputStream, u0Var);
                    if (objA != aVar) {
                        Object obj6 = obj5;
                        obj = objA;
                        obj2 = obj6;
                        r2 = r10;
                        closeable = fileOutputStream;
                        fileLock2 = (FileLock) obj;
                        u0Var.f49915f = obj2;
                        u0Var.f49916g = closeable;
                        u0Var.f49917h = fileLock2;
                        u0Var.f49920k = 3;
                        objInvoke = r2.invoke(u0Var);
                        if (objInvoke != aVar) {
                            obj3 = obj2;
                            fileLock = fileLock2;
                            obj4 = objInvoke;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            qk.i0.j(closeable, null);
                            ((ln.c) obj3).g(null);
                            return obj4;
                        }
                    }
                    r10 = bVar;
                    obj5 = cVar2;
                    return aVar;
                } catch (Throwable th7) {
                    th2 = th7;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th2;
                }
                r10 = bVar;
                obj5 = cVar2;
                fileOutputStream = new FileOutputStream((File) this.f49941h.getValue());
            } catch (Throwable th8) {
                th = th8;
                ((ln.c) obj5).g(null);
                throw th;
            }
        } catch (Throwable th9) {
            obj5 = u0Var;
            try {
                throw th9;
            } catch (Throwable th10) {
                qk.i0.j(bVar, th9);
                throw th10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00de A[Catch: all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e2, blocks: (B:61:0x00de, B:75:0x00f9, B:76:0x00fc), top: B:88:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f9 A[Catch: all -> 0x00e2, TRY_ENTER, TryCatch #1 {all -> 0x00e2, blocks: (B:61:0x00de, B:75:0x00f9, B:76:0x00fc), top: B:88:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [jk.c] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v10, types: [ln.c] */
    /* JADX WARN: Type inference failed for: r2v13, types: [ln.c] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ln.c] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, s0.v0] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [ln.c] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int, java.io.Closeable] */
    @Override // s0.p0
    public final Object d(jk.c cVar, ck.c cVar2) throws Throwable {
        ?? v0Var;
        ?? r2;
        ?? r3;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        FileInputStream fileInputStream;
        ?? r10;
        ?? r11;
        if (cVar2 instanceof v0) {
            v0 v0Var2 = (v0) cVar2;
            int i10 = v0Var2.l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                v0Var2.l = i10 - Integer.MIN_VALUE;
                v0Var = v0Var2;
            } else {
                v0Var = new v0(this, cVar2);
            }
        } else {
            v0Var = new v0(this, cVar2);
        }
        Object objInvoke = v0Var.f49927j;
        ?? r12 = v0Var.l;
        try {
            if (r12 == 0) {
                t9.e.z(objInvoke);
                ln.c cVar3 = this.f49940g;
                boolean zF = cVar3.f();
                bk.a aVar = bk.a.f5708a;
                try {
                    if (zF) {
                        FileInputStream fileInputStream2 = new FileInputStream((File) this.f49941h.getValue());
                        try {
                            try {
                                fileLockTryLock = fileInputStream2.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (IOException e10) {
                                String message2 = e10.getMessage();
                                if ((message2 == null || !an.p.p0(message2, this.f49939f, false)) && ((message = e10.getMessage()) == null || !an.p.p0(message, "Resource deadlock would occur", false))) {
                                    throw e10;
                                }
                                fileLockTryLock = null;
                            }
                            try {
                                Boolean boolValueOf = Boolean.valueOf(fileLockTryLock != null);
                                v0Var.f49923f = cVar3;
                                v0Var.f49924g = fileInputStream2;
                                v0Var.f49925h = fileLockTryLock;
                                v0Var.f49926i = zF;
                                v0Var.l = 2;
                                objInvoke = cVar.invoke(boolValueOf, v0Var);
                                if (objInvoke != aVar) {
                                    fileLock = fileLockTryLock;
                                    v0Var = cVar3;
                                    r2 = zF;
                                    fileInputStream = fileInputStream2;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    qk.i0.j(fileInputStream, null);
                                    if (r2 != 0) {
                                        v0Var.g(null);
                                    }
                                    return objInvoke;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        v0Var.f49923f = cVar3;
                        v0Var.f49926i = zF;
                        v0Var.l = 1;
                        objInvoke = cVar.invoke(bool, v0Var);
                        if (objInvoke != aVar) {
                            r10 = cVar3;
                            r11 = zF;
                            if (r11 != 0) {
                                r10.g(null);
                            }
                            return objInvoke;
                        }
                    }
                    return aVar;
                } catch (Throwable th4) {
                    th = th4;
                    r3 = cVar3;
                    r2 = zF;
                }
            } else if (r12 == 1) {
                r2 = v0Var.f49926i;
                r3 = v0Var.f49923f;
                try {
                    t9.e.z(objInvoke);
                    r11 = r2;
                    r10 = r3;
                    if (r11 != 0) {
                        r10.g(null);
                    }
                    return objInvoke;
                } catch (Throwable th5) {
                    th = th5;
                }
            } else {
                if (r12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z10 = v0Var.f49926i;
                fileLock = v0Var.f49925h;
                fileInputStream = v0Var.f49924g;
                ln.c cVar4 = v0Var.f49923f;
                try {
                    t9.e.z(objInvoke);
                    r2 = z10;
                    v0Var = cVar4;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    try {
                        qk.i0.j(fileInputStream, null);
                        if (r2 != 0) {
                            v0Var.g(null);
                        }
                        return objInvoke;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
            }
        } catch (Throwable th8) {
            try {
                throw th8;
            } catch (Throwable th9) {
                try {
                    qk.i0.j(r12, th8);
                    throw th9;
                } catch (Throwable th10) {
                    th = th10;
                    r2 = this;
                }
            }
        }
        r3 = v0Var;
        if (r2 != 0) {
            r3.g(null);
        }
        throw th;
    }

    @Override // s0.p0
    public final Object e(d0 d0Var) {
        if (this.f49942i.f53291b == wj.o.f53296a) {
            return cn.d0.J(this.f49934a, new s0(this, null, 1), d0Var);
        }
        return new Integer(b1.f49758b.nativeIncrementAndGetCounterValue(((b1) this.f49942i.getValue()).f49759a));
    }
}
