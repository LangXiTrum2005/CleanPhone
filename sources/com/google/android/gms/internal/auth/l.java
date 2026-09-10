package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x.e f22861g = new x.e(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f22862h = {X3.i.W, X3.i.X};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f22863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f22864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f22865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f22866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Map f22867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f22868f;

    public l(ContentResolver contentResolver, Uri uri) {
        k kVar = new k(this);
        this.f22865c = kVar;
        this.f22866d = new Object();
        this.f22868f = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f22863a = contentResolver;
        this.f22864b = uri;
        contentResolver.registerContentObserver(uri, false, kVar);
    }

    public static synchronized void b() {
        try {
            for (l lVar : (x.d) f22861g.values()) {
                lVar.f22863a.unregisterContentObserver(lVar.f22865c);
            }
            f22861g.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final Object a(String str) {
        Map map;
        ?? r0;
        Object objZza;
        Map map2 = this.f22867e;
        ?? r2 = map2;
        if (map2 == null) {
            synchronized (this.f22866d) {
                ?? r3 = this.f22867e;
                if (r3 != 0) {
                    r0 = r3;
                } else {
                    try {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            x0 x0Var = new x0(this, 1);
                            try {
                                objZza = x0Var.zza();
                            } catch (SecurityException unused) {
                                long jClearCallingIdentity = Binder.clearCallingIdentity();
                                try {
                                    objZza = x0Var.zza();
                                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                                } catch (Throwable th2) {
                                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                                    throw th2;
                                }
                            }
                            map = (Map) objZza;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = null;
                        }
                        this.f22867e = map;
                        r0 = map;
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(r3);
                        throw th3;
                    }
                }
            }
            r2 = r0;
        }
        if (r2 == 0) {
            r2 = Collections.EMPTY_MAP;
        }
        return (String) r2.get(str);
    }
}
