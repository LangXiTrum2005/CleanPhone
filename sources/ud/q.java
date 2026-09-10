package ud;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements wd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52136a;

    public /* synthetic */ q(int i10) {
        this.f52136a = i10;
    }

    public static s0.e0 b(s0.a1 a1Var, na.g gVar, hn.d dVar, jk.a aVar) {
        xj.v vVar = xj.v.f53866a;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new s0.e0(new s0.i0(a1Var, new al.f(dVar, 27), aVar), j1.f.C(new b4.c(vVar, (ak.f) null, 8)), gVar, dVar);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return s0.j.b(a1Var, gVar, vVar, dVar, aVar);
        }
    }

    public static void c(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && kotlin.jvm.internal.n.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            throw new IOException("Failed to delete conflicting file: " + parentFile);
        }
        if (parentFile.isDirectory()) {
            return;
        }
        try {
            Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
        } catch (Exception e10) {
            throw new IOException("Failed to create directory: " + parentFile, e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        if (r7 == r5) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [uc.d] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(uc.d r8, ck.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ud.v
            if (r0 == 0) goto L13
            r0 = r9
            ud.v r0 = (ud.v) r0
            int r1 = r0.f52166i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52166i = r1
            goto L18
        L13:
            ud.v r0 = new ud.v
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r7 = r0.f52164g
            int r9 = r0.f52166i
            java.lang.String r1 = "FirebaseSessions"
            r2 = 2
            r3 = 1
            java.lang.String r4 = ""
            bk.a r5 = bk.a.f5708a
            if (r9 == 0) goto L48
            if (r9 == r3) goto L3e
            if (r9 != r2) goto L36
            java.lang.Object r8 = r0.f52163f
            java.lang.String r8 = (java.lang.String) r8
            t9.e.z(r7)     // Catch: java.lang.Exception -> L33
            goto L91
        L33:
            r7 = move-exception
            goto L98
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            java.lang.Object r8 = r0.f52163f
            uc.d r8 = (uc.d) r8
            t9.e.z(r7)     // Catch: java.lang.Exception -> L46
            goto L65
        L46:
            r7 = move-exception
            goto L74
        L48:
            t9.e.z(r7)
            r7 = r8
            uc.c r7 = (uc.c) r7     // Catch: java.lang.Exception -> L46
            com.google.android.gms.tasks.Task r8 = r7.d()     // Catch: java.lang.Exception -> L46
            java.lang.String r9 = "getToken(...)"
            kotlin.jvm.internal.n.e(r8, r9)     // Catch: java.lang.Exception -> L70
            r0.f52163f = r7     // Catch: java.lang.Exception -> L70
            r0.f52166i = r3     // Catch: java.lang.Exception -> L70
            java.lang.Object r8 = cc.a2.b(r8, r0)     // Catch: java.lang.Exception -> L70
            if (r8 != r5) goto L62
            goto L90
        L62:
            r6 = r8
            r8 = r7
            r7 = r6
        L65:
            uc.a r7 = (uc.a) r7     // Catch: java.lang.Exception -> L46
            java.lang.String r7 = r7.f51979a     // Catch: java.lang.Exception -> L46
            kotlin.jvm.internal.n.c(r7)     // Catch: java.lang.Exception -> L46
            r6 = r8
            r8 = r7
            r7 = r6
            goto L7b
        L70:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L74:
            java.lang.String r9 = "Error getting authentication token."
            android.util.Log.w(r1, r9, r7)
            r7 = r8
            r8 = r4
        L7b:
            uc.c r7 = (uc.c) r7     // Catch: java.lang.Exception -> L33
            com.google.android.gms.tasks.Task r7 = r7.c()     // Catch: java.lang.Exception -> L33
            java.lang.String r9 = "getId(...)"
            kotlin.jvm.internal.n.e(r7, r9)     // Catch: java.lang.Exception -> L33
            r0.f52163f = r8     // Catch: java.lang.Exception -> L33
            r0.f52166i = r2     // Catch: java.lang.Exception -> L33
            java.lang.Object r7 = cc.a2.b(r7, r0)     // Catch: java.lang.Exception -> L33
            if (r7 != r5) goto L91
        L90:
            return r5
        L91:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L33
            if (r7 != 0) goto L96
            goto L9d
        L96:
            r4 = r7
            goto L9d
        L98:
            java.lang.String r9 = "Error getting Firebase installation id ."
            android.util.Log.w(r1, r9, r7)
        L9d:
            ud.w r7 = new ud.w
            r7.<init>(r4, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.q.a(uc.d, ck.c):java.lang.Object");
    }

    @Override // vj.a
    public Object get() {
        switch (this.f52136a) {
            case 1:
                return g1.f52080a;
            default:
                return h1.f52089a;
        }
    }
}
