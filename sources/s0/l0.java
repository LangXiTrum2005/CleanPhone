package s0;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f49852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f49853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f49854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final al.l f49855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f49856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ln.c f49857f;

    public l0(File file, a1 serializer, p0 coordinator, al.l lVar) {
        kotlin.jvm.internal.n.f(serializer, "serializer");
        kotlin.jvm.internal.n.f(coordinator, "coordinator");
        this.f49852a = file;
        this.f49853b = serializer;
        this.f49854c = coordinator;
        this.f49855d = lVar;
        this.f49856e = new AtomicBoolean(false);
        this.f49857f = new ln.c();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x008e */
    /* JADX WARN: Code duplicated, block: B:31:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:60:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(s0.q r8, ck.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof s0.j0
            if (r0 == 0) goto L13
            r0 = r9
            s0.j0 r0 = (s0.j0) r0
            int r1 = r0.f49834k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49834k = r1
            goto L18
        L13:
            s0.j0 r0 = new s0.j0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f49832i
            int r1 = r0.f49834k
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            boolean r7 = r0.f49831h
            s0.g0 r8 = r0.f49830g
            s0.l0 r0 = r0.f49829f
            t9.e.z(r9)     // Catch: java.lang.Throwable -> L2c
            goto L6d
        L2c:
            r9 = move-exception
            r6 = r9
            r9 = r7
            r7 = r0
            r0 = r6
            goto L85
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            t9.e.z(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.f49856e
            boolean r9 = r9.get()
            if (r9 != 0) goto L97
            ln.c r9 = r7.f49857f
            boolean r9 = r9.f()
            s0.g0 r1 = new s0.g0     // Catch: java.lang.Throwable -> L8e
            java.io.File r4 = r7.f49852a     // Catch: java.lang.Throwable -> L8e
            s0.a1 r5 = r7.f49853b     // Catch: java.lang.Throwable -> L8e
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L82
            r0.f49829f = r7     // Catch: java.lang.Throwable -> L82
            r0.f49830g = r1     // Catch: java.lang.Throwable -> L82
            r0.f49831h = r9     // Catch: java.lang.Throwable -> L82
            r0.f49834k = r2     // Catch: java.lang.Throwable -> L82
            java.lang.Object r8 = r8.invoke(r1, r4, r0)     // Catch: java.lang.Throwable -> L82
            bk.a r0 = bk.a.f5708a
            if (r8 != r0) goto L69
            return r0
        L69:
            r0 = r7
            r7 = r9
            r9 = r8
            r8 = r1
        L6d:
            r8.close()     // Catch: java.lang.Throwable -> L72
            r8 = r3
            goto L73
        L72:
            r8 = move-exception
        L73:
            if (r8 != 0) goto L7d
            if (r7 == 0) goto L7c
            ln.c r7 = r0.f49857f
            r7.g(r3)
        L7c:
            return r9
        L7d:
            throw r8     // Catch: java.lang.Throwable -> L7e
        L7e:
            r8 = move-exception
            r9 = r7
            r7 = r0
            goto L8f
        L82:
            r8 = move-exception
            r0 = r8
            r8 = r1
        L85:
            r8.close()     // Catch: java.lang.Throwable -> L89
            goto L8d
        L89:
            r8 = move-exception
            qk.i0.c(r0, r8)     // Catch: java.lang.Throwable -> L8e
        L8d:
            throw r0     // Catch: java.lang.Throwable -> L8e
        L8e:
            r8 = move-exception
        L8f:
            if (r9 == 0) goto L96
            ln.c r7 = r7.f49857f
            r7.g(r3)
        L96:
            throw r8
        L97:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "StorageConnection has already been disposed."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.l0.a(s0.q, ck.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e1 A[Catch: all -> 0x0121, IOException -> 0x0123, TRY_ENTER, TryCatch #0 {all -> 0x0121, blocks: (B:43:0x00e1, B:45:0x00e7, B:47:0x00ea, B:52:0x0100, B:53:0x0120, B:60:0x012e, B:69:0x013d, B:71:0x0143, B:72:0x0146, B:67:0x013b, B:66:0x0138, B:33:0x009d, B:34:0x00b9), top: B:77:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e7 A[Catch: all -> 0x0121, IOException -> 0x0123, TRY_LEAVE, TryCatch #0 {all -> 0x0121, blocks: (B:43:0x00e1, B:45:0x00e7, B:47:0x00ea, B:52:0x0100, B:53:0x0120, B:60:0x012e, B:69:0x013d, B:71:0x0143, B:72:0x0146, B:67:0x013b, B:66:0x0138, B:33:0x009d, B:34:0x00b9), top: B:77:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0100 A[Catch: all -> 0x0121, IOException -> 0x0123, TRY_ENTER, TryCatch #0 {all -> 0x0121, blocks: (B:43:0x00e1, B:45:0x00e7, B:47:0x00ea, B:52:0x0100, B:53:0x0120, B:60:0x012e, B:69:0x013d, B:71:0x0143, B:72:0x0146, B:67:0x013b, B:66:0x0138, B:33:0x009d, B:34:0x00b9), top: B:77:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x012e A[Catch: all -> 0x0121, IOException -> 0x0123, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0121, blocks: (B:43:0x00e1, B:45:0x00e7, B:47:0x00ea, B:52:0x0100, B:53:0x0120, B:60:0x012e, B:69:0x013d, B:71:0x0143, B:72:0x0146, B:67:0x013b, B:66:0x0138, B:33:0x009d, B:34:0x00b9), top: B:77:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x0100, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    public final Object b(d0 d0Var, ck.c cVar) {
        k0 k0Var;
        File file;
        ln.a aVar;
        jk.c cVar2;
        n0 n0Var;
        Throwable th2;
        n0 n0Var2;
        l0 l0Var;
        File file2;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i10 = k0Var.l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                k0Var.l = i10 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(this, cVar);
            }
        } else {
            k0Var = new k0(this, cVar);
        }
        Object obj = k0Var.f49843j;
        ?? r2 = k0Var.l;
        boolean z10 = true;
        bk.a aVar2 = bk.a.f5708a;
        try {
            try {
                try {
                    try {
                        if (r2 == 0) {
                            t9.e.z(obj);
                            if (this.f49856e.get()) {
                                throw new IllegalStateException("StorageConnection has already been disposed.");
                            }
                            File file3 = this.f49852a;
                            File parentFile = file3.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    throw new IOException("Unable to create parent directories of " + file3);
                                }
                            }
                            k0Var.f49839f = this;
                            k0Var.f49840g = d0Var;
                            ln.c cVar3 = this.f49857f;
                            k0Var.f49841h = cVar3;
                            k0Var.l = 1;
                            if (cVar3.e(k0Var) != aVar2) {
                                aVar = cVar3;
                                cVar2 = d0Var;
                            }
                            return aVar2;
                        }
                        if (r2 != 1) {
                            if (r2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            n0Var2 = k0Var.f49842i;
                            File file4 = (File) k0Var.f49841h;
                            aVar = (ln.a) k0Var.f49840g;
                            l0Var = k0Var.f49839f;
                            try {
                                t9.e.z(obj);
                                file2 = file4;
                                try {
                                    n0Var2.close();
                                    th = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists()) {
                                    try {
                                        Files.move(file2.toPath(), l0Var.f49852a.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                    } catch (IOException unused) {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        throw new IOException("Unable to rename " + file2 + " to " + l0Var.f49852a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                ((ln.c) aVar).g(null);
                                return wj.r.f53297a;
                            } catch (Throwable th4) {
                                th2 = th4;
                                try {
                                    n0Var2.close();
                                } catch (Throwable th5) {
                                    qk.i0.c(th2, th5);
                                }
                                throw th2;
                            }
                        }
                        ln.a aVar3 = (ln.a) k0Var.f49841h;
                        jk.c cVar4 = (jk.c) k0Var.f49840g;
                        l0 l0Var2 = k0Var.f49839f;
                        t9.e.z(obj);
                        aVar = aVar3;
                        this = l0Var2;
                        cVar2 = cVar4;
                        k0Var.f49839f = this;
                        k0Var.f49840g = aVar;
                        k0Var.f49841h = file;
                        k0Var.f49842i = n0Var;
                        k0Var.l = 2;
                        if (cVar2.invoke(n0Var, k0Var) != aVar2) {
                            l0Var = this;
                            file2 = file;
                            n0Var2 = n0Var;
                            n0Var2.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                Files.move(file2.toPath(), l0Var.f49852a.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                if (!z10) {
                                    throw new IOException("Unable to rename " + file2 + " to " + l0Var.f49852a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                            }
                            ((ln.c) aVar).g(null);
                            return wj.r.f53297a;
                        }
                        return aVar2;
                    } catch (Throwable th6) {
                        th2 = th6;
                        n0Var2 = n0Var;
                        n0Var2.close();
                        throw th2;
                    }
                    a1 serializer = this.f49853b;
                    kotlin.jvm.internal.n.f(serializer, "serializer");
                    n0Var = new n0(file, serializer);
                } catch (IOException e10) {
                    e = e10;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(this.f49852a.getAbsolutePath() + ".tmp");
            } catch (IOException e11) {
                e = e11;
                file = d0Var;
            }
        } catch (Throwable th7) {
            ((ln.c) r2).g(null);
            throw th7;
        }
    }

    @Override // s0.a
    public final void close() {
        this.f49856e.set(true);
        this.f49855d.invoke();
    }
}
