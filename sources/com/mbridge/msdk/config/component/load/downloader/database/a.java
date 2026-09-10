package com.mbridge.msdk.config.component.load.downloader.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements com.mbridge.msdk.config.component.load.downloader.database.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f32217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f32218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32219c = com.mbridge.msdk.config.component.database.c.TABLE_FILE_DB;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile SQLiteDatabase f32220d;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.database.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class RunnableC0106a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.c.a f32221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f32222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f32223c;

        public RunnableC0106a(com.mbridge.msdk.config.component.load.downloader.database.c.a aVar, String str, String str2) {
            this.f32221a = aVar;
            this.f32222b = str;
            this.f32223c = str2;
        }

        /* JADX WARN: Code duplicated, block: B:47:0x00da  */
        /* JADX WARN: Code duplicated, block: B:50:0x00e1  */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Cursor cursor;
            com.mbridge.msdk.config.component.load.downloader.database.c.a aVar;
            com.mbridge.msdk.config.component.load.downloader.database.c.a aVar2;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f32220d)) {
                a aVar3 = a.this;
                aVar3.f32220d = aVar3.f32217a.getWritableDatabase();
            }
            com.mbridge.msdk.config.component.load.downloader.database.b bVarA = null;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f32220d) || !a.this.f32220d.isOpen()) {
                if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f32221a)) {
                    this.f32221a.a(null);
                    return;
                }
                return;
            }
            try {
                String str = this.f32222b;
                if (TextUtils.isEmpty(str)) {
                    try {
                        URL url = new URL(this.f32223c);
                        str = url.getProtocol() + "://" + url.getHost() + url.getPath();
                    } catch (Throwable th2) {
                        q0.b(IDatabaseHelper.TAG, th2.getMessage());
                    }
                }
                Cursor cursorRawQuery = a.this.f32220d.rawQuery("SELECT * FROM " + a.this.f32219c + " WHERE cacheKey = ? AND status = 1 LIMIT 1", new String[]{str});
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            bVarA = com.mbridge.msdk.config.component.load.downloader.database.b.a(cursorRawQuery);
                        }
                    } catch (Exception e10) {
                        cursor = cursorRawQuery;
                        e = e10;
                        try {
                            if (MBridgeConstans.DEBUG) {
                                e.printStackTrace();
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            aVar2 = this.f32221a;
                            if (aVar2 == null) {
                                return;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (cursor != null) {
                                cursor.close();
                            }
                            aVar = this.f32221a;
                            if (aVar != null) {
                                aVar.a(null);
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        cursor = cursorRawQuery;
                        th = th4;
                        if (cursor != null) {
                            cursor.close();
                        }
                        aVar = this.f32221a;
                        if (aVar != null) {
                            aVar.a(null);
                        }
                        throw th;
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                aVar2 = this.f32221a;
                if (aVar2 == null) {
                    return;
                }
            } catch (Exception e11) {
                e = e11;
                cursor = null;
            } catch (Throwable th5) {
                th = th5;
                cursor = null;
            }
            aVar2.a(bVarA);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f32225a;

        public b(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            this.f32225a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f32220d)) {
                a aVar = a.this;
                aVar.f32220d = aVar.f32217a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f32220d) || !a.this.f32220d.isOpen()) {
                return;
            }
            try {
                a.this.f32220d.beginTransaction();
                a.this.f32220d.insertWithOnConflict(a.this.f32219c, null, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f32225a), 4);
                a.this.f32220d.setTransactionSuccessful();
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            } finally {
                try {
                    if (a.this.f32220d.inTransaction()) {
                        a.this.f32220d.endTransaction();
                    }
                } catch (Throwable th2) {
                    q0.b(IDatabaseHelper.TAG, th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f32227a;

        public c(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            this.f32227a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f32220d)) {
                a aVar = a.this;
                aVar.f32220d = aVar.f32217a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f32220d) || !a.this.f32220d.isOpen()) {
                return;
            }
            try {
                if (!TextUtils.isEmpty(this.f32227a.b())) {
                    a.this.f32220d.update(a.this.f32219c, com.mbridge.msdk.config.component.load.downloader.database.b.b(this.f32227a), "cacheKey = ? ", new String[]{this.f32227a.b()});
                } else {
                    if (TextUtils.isEmpty(this.f32227a.f())) {
                        return;
                    }
                    a.this.f32220d.update(a.this.f32219c, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f32227a), "originalURL = ? ", new String[]{this.f32227a.f()});
                }
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    public a(Handler handler, d dVar) {
        this.f32218b = handler;
        this.f32217a = dVar;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(String str, String str2, com.mbridge.msdk.config.component.load.downloader.database.c.a aVar) {
        this.f32218b.post(new RunnableC0106a(aVar, str2, str));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        this.f32218b.postAtFrontOfQueue(new b(bVar));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str) {
        this.f32218b.post(new c(bVar));
    }
}
