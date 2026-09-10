package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static n f22876c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22878b;

    public n() {
        this.f22877a = null;
        this.f22878b = null;
    }

    public Object a() {
        n nVar = (n) this.f22877a;
        String str = (String) this.f22878b;
        ContentResolver contentResolver = ((Context) nVar.f22877a).getContentResolver();
        Uri uri = h.f22827a;
        synchronized (h.class) {
            try {
                int i10 = 0;
                String str2 = null;
                byte b10 = 0;
                if (h.f22831e == null) {
                    h.f22830d.set(false);
                    h.f22831e = new HashMap(16, 1.0f);
                    h.f22836j = new Object();
                    contentResolver.registerContentObserver(h.f22827a, true, new g(b10 == true ? 1 : 0, i10));
                } else if (h.f22830d.getAndSet(false)) {
                    h.f22831e.clear();
                    h.f22832f.clear();
                    h.f22833g.clear();
                    h.f22834h.clear();
                    h.f22835i.clear();
                    h.f22836j = new Object();
                }
                Object obj = h.f22836j;
                if (h.f22831e.containsKey(str)) {
                    String str3 = (String) h.f22831e.get(str);
                    if (str3 != null) {
                        str2 = str3;
                    }
                    return str2;
                }
                int length = h.f22837k.length;
                Cursor cursorQuery = contentResolver.query(h.f22827a, null, null, new String[]{str}, null);
                if (cursorQuery != null) {
                    try {
                        if (!cursorQuery.moveToFirst()) {
                            synchronized (h.class) {
                                try {
                                    if (obj == h.f22836j) {
                                        h.f22831e.put(str, null);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            cursorQuery.close();
                            return null;
                        }
                        String string = cursorQuery.getString(1);
                        cursorQuery.close();
                        if (string != null && string.equals(null)) {
                            string = null;
                        }
                        synchronized (h.class) {
                            try {
                                if (obj == h.f22836j) {
                                    h.f22831e.put(str, string);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        if (string != null) {
                            return string;
                        }
                    } catch (Throwable th4) {
                        cursorQuery.close();
                        throw th4;
                    }
                }
                return null;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0057 A[Catch: all -> 0x0015, TryCatch #1 {all -> 0x0015, blocks: (B:9:0x000f, B:11:0x0013, B:18:0x001e, B:20:0x0022, B:21:0x002c, B:34:0x0057, B:35:0x0059, B:24:0x0032, B:26:0x0038, B:30:0x0045, B:32:0x0053), top: B:57:0x000f, inners: #4 }] */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005a, code lost:
    
        if (r6 == false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f22877a
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            if (r0 == 0) goto L8e
            boolean r2 = com.google.android.gms.internal.auth.i.f22842b
            if (r2 == 0) goto Lc
            goto L5d
        Lc:
            java.lang.Class<com.google.android.gms.internal.auth.i> r2 = com.google.android.gms.internal.auth.i.class
            monitor-enter(r2)
            boolean r3 = com.google.android.gms.internal.auth.i.f22842b     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L18
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            goto L5d
        L15:
            r8 = move-exception
            goto L8c
        L18:
            r3 = 1
            r4 = r3
        L1a:
            r5 = 2
            r6 = 0
            if (r4 > r5) goto L51
            android.os.UserManager r5 = com.google.android.gms.internal.auth.i.f22841a     // Catch: java.lang.Throwable -> L15
            if (r5 != 0) goto L2c
            java.lang.Class<android.os.UserManager> r5 = android.os.UserManager.class
            java.lang.Object r5 = r0.getSystemService(r5)     // Catch: java.lang.Throwable -> L15
            android.os.UserManager r5 = (android.os.UserManager) r5     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.auth.i.f22841a = r5     // Catch: java.lang.Throwable -> L15
        L2c:
            android.os.UserManager r5 = com.google.android.gms.internal.auth.i.f22841a     // Catch: java.lang.Throwable -> L15
            if (r5 != 0) goto L32
            r6 = r3
            goto L55
        L32:
            boolean r7 = r5.isUserUnlocked()     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L44
            if (r7 != 0) goto L42
            android.os.UserHandle r7 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L44
            boolean r0 = r5.isUserRunning(r7)     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L44
            if (r0 != 0) goto L51
        L42:
            r6 = r3
            goto L51
        L44:
            r5 = move-exception
            java.lang.String r6 = "DirectBootUtils"
            java.lang.String r7 = "Failed to check if user is unlocked."
            android.util.Log.w(r6, r7, r5)     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.auth.i.f22841a = r1     // Catch: java.lang.Throwable -> L15
            int r4 = r4 + 1
            goto L1a
        L51:
            if (r6 == 0) goto L55
            com.google.android.gms.internal.auth.i.f22841a = r1     // Catch: java.lang.Throwable -> L15
        L55:
            if (r6 == 0) goto L59
            com.google.android.gms.internal.auth.i.f22842b = r3     // Catch: java.lang.Throwable -> L15
        L59:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            if (r6 != 0) goto L5d
            goto L8e
        L5d:
            com.google.android.gms.internal.auth.n r0 = new com.google.android.gms.internal.auth.n     // Catch: java.lang.Throwable -> L75
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L75
            java.lang.Object r8 = r0.a()     // Catch: java.lang.SecurityException -> L67 java.lang.Throwable -> L75 java.lang.Throwable -> L75
            goto L72
        L67:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.Throwable -> L75 java.lang.Throwable -> L75 java.lang.Throwable -> L75
            java.lang.Object r8 = r0.a()     // Catch: java.lang.Throwable -> L77
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.Throwable -> L75 java.lang.Throwable -> L75 java.lang.Throwable -> L75
        L72:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L75 java.lang.Throwable -> L75 java.lang.Throwable -> L75
            return r8
        L75:
            r8 = move-exception
            goto L7c
        L77:
            r8 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.Throwable -> L75 java.lang.Throwable -> L75 java.lang.Throwable -> L75
            throw r8     // Catch: java.lang.Throwable -> L75 java.lang.Throwable -> L75 java.lang.Throwable -> L75
        L7c:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "Unable to read GServices for: "
            java.lang.String r2 = "GservicesLoader"
            java.lang.String r9 = r0.concat(r9)
            android.util.Log.e(r2, r9, r8)
            return r1
        L8c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r8
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.n.b(java.lang.String):java.lang.String");
    }

    public /* synthetic */ n(n nVar, String str) {
        this.f22877a = nVar;
        this.f22878b = str;
    }

    public n(Context context) {
        this.f22877a = context;
        g gVar = new g(null, 1);
        this.f22878b = gVar;
        context.getContentResolver().registerContentObserver(h.f22827a, true, gVar);
    }
}
