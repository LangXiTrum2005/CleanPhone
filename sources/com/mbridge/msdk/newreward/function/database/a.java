package com.mbridge.msdk.newreward.function.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.newreward.function.common.DatabaseUtils;
import com.mbridge.msdk.newreward.function.common.JSONUtils;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SQLiteDatabase f1688a;
    private final Object b = new Object();

    /* JADX INFO: renamed from: com.mbridge.msdk.newreward.function.database.a$a, reason: collision with other inner class name */
    public class RunnableC0213a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1689a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ boolean e;
        final /* synthetic */ String f;
        final /* synthetic */ long g;

        public RunnableC0213a(int i, String str, String str2, String str3, boolean z, String str4, long j) {
            this.f1689a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = z;
            this.f = str4;
            this.g = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b(this.f1689a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.newreward.function.core.campaign.b f1690a;

        public b(com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
            this.f1690a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.f1690a);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1691a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ boolean d;
        final /* synthetic */ com.mbridge.msdk.newreward.function.database.b e;

        public c(int i, String str, String str2, boolean z, com.mbridge.msdk.newreward.function.database.b bVar) {
            this.f1691a = i;
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<com.mbridge.msdk.newreward.function.core.campaign.b> listA = a.this.a(this.f1691a, this.b, this.c, this.d);
            if (listA == null || listA.isEmpty()) {
                com.mbridge.msdk.newreward.function.database.b bVar = this.e;
                if (bVar != null) {
                    bVar.a();
                    return;
                }
                return;
            }
            com.mbridge.msdk.newreward.function.database.b bVar2 = this.e;
            if (bVar2 != null) {
                bVar2.a(listA);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1692a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ boolean d;
        final /* synthetic */ int e;
        final /* synthetic */ com.mbridge.msdk.newreward.function.database.b f;

        public d(int i, String str, String str2, boolean z, int i2, com.mbridge.msdk.newreward.function.database.b bVar) {
            this.f1692a = i;
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = i2;
            this.f = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<com.mbridge.msdk.newreward.function.core.campaign.b> listA = a.this.a(this.f1692a, this.b, this.c, this.d, this.e, "");
            if (listA == null || listA.size() == 0) {
                com.mbridge.msdk.newreward.function.database.b bVar = this.f;
                if (bVar != null) {
                    bVar.a();
                    return;
                }
                return;
            }
            com.mbridge.msdk.newreward.function.database.b bVar2 = this.f;
            if (bVar2 != null) {
                bVar2.a(listA);
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.newreward.function.core.campaign.b f1693a;
        final /* synthetic */ int b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;
        final /* synthetic */ int f;

        public e(com.mbridge.msdk.newreward.function.core.campaign.b bVar, int i, String str, String str2, String str3, int i2) {
            this.f1693a = bVar;
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.newreward.function.core.campaign.b bVar = this.f1693a;
            if (bVar == null) {
                a.this.a(this.b, this.c, this.d, this.e, this.f);
                return;
            }
            List<com.mbridge.msdk.newreward.function.core.campaign.b> listA = a.this.a(bVar.a(), this.f1693a.s(), this.f1693a.E(), this.f1693a.J(), 0, this.f1693a.p());
            if (this.f1693a.v() <= 0 || listA == null || listA.isEmpty()) {
                if (this.f1693a.v() != 0 || listA == null || listA.isEmpty() || listA.get(0).y() <= 0) {
                    a.this.a(this.b, this.c, this.d, this.e, this.f);
                }
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1694a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        public f(int i, String str, String str2) {
            this.f1694a = i;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.f1694a, this.b, this.c);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1695a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        public g(int i, String str, String str2) {
            this.f1695a = i;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.c(this.f1695a, this.b, this.c);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f1688a = sQLiteDatabase;
    }

    private Runnable a(int i, String str, String str2, String str3, boolean z, String str4, long j) {
        return new RunnableC0213a(i, str, str2, str3, z, str4, j);
    }

    private Runnable f(int i, String str, String str2) {
        return new f(i, str, str2);
    }

    public void b(int i, String str, String str2, String str3, boolean z, String str4, long j) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.f1688a)) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignTable", "insert: database is not available");
                return;
            }
            return;
        }
        double dB = com.mbridge.msdk.newreward.function.utils.c.b(str4);
        synchronized (this.b) {
            try {
                try {
                    Cursor cursorQuery = this.f1688a.query(MBInterstitialActivity.INTENT_CAMAPIGN, null, "ad_type=? and app_id=? and placement_id=? and unit_id=? and local_id=?", new String[]{String.valueOf(i), com.mbridge.msdk.foundation.controller.c.n().b(), str, str2, str3}, null, null, null);
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        if (MBridgeConstans.DEBUG) {
                            o0.a("CampaignTable", "insert:  already exist");
                        }
                        DatabaseUtils.closeCursor(cursorQuery);
                        DatabaseUtils.endTransaction(this.f1688a);
                        return;
                    }
                    DatabaseUtils.beginTransaction(this.f1688a);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ad_type", Integer.valueOf(i));
                    contentValues.put("app_id", com.mbridge.msdk.foundation.controller.c.n().b());
                    contentValues.put("placement_id", str);
                    contentValues.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                    contentValues.put("local_id", str3);
                    contentValues.put("state", (Integer) 0);
                    contentValues.put("bid_token", str4);
                    contentValues.put("invalid_time", Long.valueOf(j));
                    contentValues.put("header_bidding", Integer.valueOf(z ? 1 : 0));
                    contentValues.put("load_start_time", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("ecppv", Double.valueOf(dB));
                    contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX, (Integer) 0);
                    contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX, (Integer) 0);
                    long jInsert = this.f1688a.insert(MBInterstitialActivity.INTENT_CAMAPIGN, null, contentValues);
                    if (MBridgeConstans.DEBUG) {
                        o0.a("CampaignTable", "insert result:  " + jInsert);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.f1688a);
                    sQLiteDatabase = this.f1688a;
                    DatabaseUtils.endTransaction(sQLiteDatabase);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("CampaignTable", "insert: ", e2);
                    }
                    sQLiteDatabase = this.f1688a;
                }
            } catch (Throwable th) {
                DatabaseUtils.endTransaction(this.f1688a);
                throw th;
            }
        }
    }

    public void c(int i, String str, String str2, String str3, boolean z, String str4, long j) {
        MBridgeTaskManager.campaignTableExecute(a(i, str, str2, str3, z, str4, j));
    }

    public void d(int i, String str, String str2) {
        MBridgeTaskManager.campaignTableExecute(new g(i, str, str2));
    }

    public List<String> e(int i, String str, String str2) {
        Cursor cursor = null;
        if (!DatabaseUtils.isDatabaseAvailable(this.f1688a)) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignTable", "database is not available");
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.b) {
            try {
                try {
                    try {
                        Cursor cursorQuery = this.f1688a.query(MBInterstitialActivity.INTENT_CAMAPIGN, null, b(), new String[]{String.valueOf(i), com.mbridge.msdk.foundation.controller.c.n().b(), str, str2, String.valueOf(System.currentTimeMillis())}, null, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.getCount() > 0) {
                                    int columnIndex = cursorQuery.getColumnIndex("local_id");
                                    while (cursorQuery.moveToNext()) {
                                        String string = cursorQuery.getString(columnIndex);
                                        if (!TextUtils.isEmpty(string)) {
                                            arrayList.add(string);
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                cursor = cursorQuery;
                                if (MBridgeConstans.DEBUG) {
                                    o0.b("CampaignTable", "find: ", e);
                                }
                                cursorQuery = cursor;
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursorQuery;
                                DatabaseUtils.closeCursor(cursor);
                                throw th;
                            }
                            DatabaseUtils.closeCursor(cursorQuery);
                            return arrayList;
                        }
                        DatabaseUtils.closeCursor(cursorQuery);
                        return null;
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
        SQLiteDatabase sQLiteDatabase;
        if (bVar == null) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignTable", "insert: mBridgeCampaigns is null");
                return;
            }
            return;
        }
        List<com.mbridge.msdk.newreward.function.core.campaign.a> listG = bVar.g();
        if (listG == null || listG.isEmpty()) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignTable", "insert: campaignList is null or empty");
                return;
            }
            return;
        }
        if (!DatabaseUtils.isDatabaseAvailable(this.f1688a)) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignTable", "insert: database is not available");
                return;
            }
            return;
        }
        synchronized (this.b) {
            try {
                try {
                    DatabaseUtils.beginTransaction(this.f1688a);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("request_id", bVar.t());
                    contentValues.put("session_id", bVar.x());
                    contentValues.put("system_id", bVar.B());
                    contentValues.put("backup_id", bVar.b());
                    contentValues.put("state", Integer.valueOf(bVar.A()));
                    contentValues.put("template", Integer.valueOf(bVar.C()));
                    contentValues.put("invalid_time", Long.valueOf(bVar.m()));
                    contentValues.put("invalid_time_2", Long.valueOf(bVar.n()));
                    contentValues.put("invalid_time_backup", Long.valueOf(bVar.o()));
                    contentValues.put("show_count", Integer.valueOf(bVar.y()));
                    contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_PARENT_SESSION_ID, bVar.r());
                    contentValues.put("token_rule", Integer.valueOf(bVar.D()));
                    contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX, Integer.valueOf(bVar.w()));
                    contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX, Integer.valueOf(bVar.v()));
                    contentValues.put("data", bVar.j().toString());
                    long jUpdate = this.f1688a.update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, "ad_type=? and app_id=? and placement_id=? and unit_id=? and local_id=?", new String[]{String.valueOf(bVar.a()), com.mbridge.msdk.foundation.controller.c.n().b(), bVar.s(), bVar.E(), bVar.p()});
                    if (MBridgeConstans.DEBUG) {
                        o0.a("CampaignTable", "updateCampaign result:  " + jUpdate);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.f1688a);
                    sQLiteDatabase = this.f1688a;
                } catch (Throwable th) {
                    DatabaseUtils.endTransaction(this.f1688a);
                    throw th;
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("CampaignTable", "updateCampaign: ", e2);
                }
                sQLiteDatabase = this.f1688a;
            }
            DatabaseUtils.endTransaction(sQLiteDatabase);
        }
    }

    public void c(int i, String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.f1688a)) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignTable", "clearLoadCheckCampaigns: database is not available");
                return;
            }
            return;
        }
        synchronized (this.b) {
            try {
                try {
                    DatabaseUtils.beginTransaction(this.f1688a);
                    int iDelete = this.f1688a.delete(MBInterstitialActivity.INTENT_CAMAPIGN, a(), new String[]{String.valueOf(i), com.mbridge.msdk.foundation.controller.c.n().b(), str, str2});
                    if (MBridgeConstans.DEBUG) {
                        o0.a("CampaignTable", "clearLoadCheckCampaigns result:  " + iDelete);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.f1688a);
                    sQLiteDatabase = this.f1688a;
                } catch (Throwable th) {
                    DatabaseUtils.endTransaction(this.f1688a);
                    throw th;
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("CampaignTable", "clearLoadCheckCampaigns: ", e2);
                }
                sQLiteDatabase = this.f1688a;
            }
            DatabaseUtils.endTransaction(sQLiteDatabase);
        }
    }

    public void b(com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
        MBridgeTaskManager.campaignTableExecute(new b(bVar));
    }

    private Runnable b(int i, String str, String str2, boolean z, int i2, com.mbridge.msdk.newreward.function.database.b bVar) {
        return new d(i, str, str2, z, i2, bVar);
    }

    public void a(int i, String str, String str2, boolean z, com.mbridge.msdk.newreward.function.database.b bVar) {
        MBridgeTaskManager.campaignTableExecute(new c(i, str, str2, z, bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public List<com.mbridge.msdk.newreward.function.core.campaign.b> a(int i, String str, String str2, boolean z) {
        Cursor cursorQuery;
        ?? r1 = 0;
        if (!DatabaseUtils.isDatabaseAvailable(this.f1688a)) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignTable", "find: database is not available");
            }
            return null;
        }
        synchronized (this.b) {
            try {
                try {
                    try {
                        cursorQuery = this.f1688a.query(MBInterstitialActivity.INTENT_CAMAPIGN, null, "ad_type=? and app_id=? and placement_id=? and unit_id=? and header_bidding=? and state in (401,404,405)", new String[]{String.valueOf((int) i), com.mbridge.msdk.foundation.controller.c.n().b(), str, str2, String.valueOf(z ? 1 : 0)}, null, null, "load_start_time desc");
                        try {
                            List<com.mbridge.msdk.newreward.function.core.campaign.b> listA = a(cursorQuery);
                            if (listA == null || listA.size() == 0) {
                                if (MBridgeConstans.DEBUG) {
                                    o0.b("CampaignTable", "find: mBridgeCampaigns is null or empty");
                                }
                            }
                            DatabaseUtils.closeCursor(cursorQuery);
                            return listA;
                        } catch (Exception e2) {
                            e = e2;
                            if (MBridgeConstans.DEBUG) {
                                o0.b("CampaignTable", "find: ", e);
                            }
                            DatabaseUtils.closeCursor(cursorQuery);
                            return null;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        cursorQuery = null;
                    } catch (Throwable th) {
                        th = th;
                        DatabaseUtils.closeCursor(r1);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r1 = i;
                    DatabaseUtils.closeCursor(r1);
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void b(int i, String str, String str2, String str3, int i2) {
        MBridgeTaskManager.campaignTableExecute(a(i, str, str2, str3, i2, (com.mbridge.msdk.newreward.function.core.campaign.b) null));
    }

    public void b(int i, String str, String str2, String str3, int i2, com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
        MBridgeTaskManager.campaignTableExecute(a(i, str, str2, str3, i2, bVar));
    }

    public void b(int i, String str, String str2) {
        MBridgeTaskManager.campaignTableExecute(f(i, str, str2));
    }

    private static String b() {
        return "ad_type=? and app_id=? and placement_id=? and unit_id=? and (state in (6,402,406,403,8,7) or invalid_time<? )";
    }

    public void a(int i, String str, String str2, boolean z, int i2, com.mbridge.msdk.newreward.function.database.b bVar) {
        MBridgeTaskManager.campaignTableExecute(b(i, str, str2, z, i2, bVar));
    }

    public List<com.mbridge.msdk.newreward.function.core.campaign.b> a(int i, String str, String str2, boolean z, int i2, String str3) {
        String str4;
        String[] strArr;
        Cursor cursorQuery = null;
        if (!DatabaseUtils.isDatabaseAvailable(this.f1688a)) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignTable", "find: database is not available");
            }
            return null;
        }
        synchronized (this.b) {
            try {
                try {
                    String strValueOf = String.valueOf(z ? 1 : 0);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                    if (TextUtils.isEmpty(str3)) {
                        try {
                            try {
                                str4 = "ad_type=? and app_id=? and placement_id=? and unit_id=? and header_bidding=? and state=? and invalid_time>?";
                                strArr = new String[]{String.valueOf(i), strB, str, str2, strValueOf, String.valueOf(3), String.valueOf(jCurrentTimeMillis)};
                            } catch (Throwable th) {
                                th = th;
                                DatabaseUtils.closeCursor(cursorQuery);
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            if (MBridgeConstans.DEBUG) {
                                o0.b("CampaignTable", "find: ", e);
                            }
                            DatabaseUtils.closeCursor(cursorQuery);
                            return null;
                        }
                    } else {
                        strArr = new String[]{str3, String.valueOf(i), strB, str, str2, strValueOf, String.valueOf(3), String.valueOf(jCurrentTimeMillis)};
                        str4 = "local_id=? and ad_type=? and app_id=? and placement_id=? and unit_id=? and header_bidding=? and state=? and invalid_time>?";
                    }
                    cursorQuery = this.f1688a.query(MBInterstitialActivity.INTENT_CAMAPIGN, null, str4, strArr, null, null, "load_start_time desc", String.valueOf(i2 <= 0 ? Integer.MAX_VALUE : i2));
                    List<com.mbridge.msdk.newreward.function.core.campaign.b> listA = a(cursorQuery);
                    if ((listA == null || listA.size() == 0) && MBridgeConstans.DEBUG) {
                        o0.b("CampaignTable", "find: mBridgeCampaigns is null or empty");
                    }
                    DatabaseUtils.closeCursor(cursorQuery);
                    return listA;
                } catch (Exception e3) {
                    e = e3;
                    cursorQuery = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursorQuery = null;
                    DatabaseUtils.closeCursor(cursorQuery);
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private Runnable a(int i, String str, String str2, String str3, int i2, com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
        return new e(bVar, i, str, str2, str3, i2);
    }

    public void a(int i, String str, String str2, String str3, int i2) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.f1688a)) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignTable", "updateState: database is not available");
                return;
            }
            return;
        }
        synchronized (this.b) {
            try {
                try {
                    DatabaseUtils.beginTransaction(this.f1688a);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", Integer.valueOf(i2));
                    int iUpdate = this.f1688a.update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, "ad_type=? and app_id=? and placement_id=? and unit_id=? and local_id=?", new String[]{String.valueOf(i), com.mbridge.msdk.foundation.controller.c.n().b(), str, str2, str3});
                    if (MBridgeConstans.DEBUG) {
                        o0.a("CampaignTable", "updateState result:  " + iUpdate);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.f1688a);
                    sQLiteDatabase = this.f1688a;
                } catch (Throwable th) {
                    DatabaseUtils.endTransaction(this.f1688a);
                    throw th;
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("CampaignTable", "updateState: ", e2);
                }
                sQLiteDatabase = this.f1688a;
            }
            DatabaseUtils.endTransaction(sQLiteDatabase);
        }
    }

    public void a(int i, String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.f1688a)) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignTable", "clearUnInvalidCampaign: database is not available");
                return;
            }
            return;
        }
        synchronized (this.b) {
            try {
                try {
                    DatabaseUtils.beginTransaction(this.f1688a);
                    int iDelete = this.f1688a.delete(MBInterstitialActivity.INTENT_CAMAPIGN, b(), new String[]{String.valueOf(i), com.mbridge.msdk.foundation.controller.c.n().b(), str, str2, String.valueOf(System.currentTimeMillis())});
                    if (MBridgeConstans.DEBUG) {
                        o0.a("CampaignTable", "clearUnInvalidCampaign result:  " + iDelete);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.f1688a);
                    sQLiteDatabase = this.f1688a;
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("CampaignTable", "clearUnInvalidCampaign: ", e2);
                    }
                    sQLiteDatabase = this.f1688a;
                }
                DatabaseUtils.endTransaction(sQLiteDatabase);
            } catch (Throwable th) {
                DatabaseUtils.endTransaction(this.f1688a);
                throw th;
            }
        }
    }

    private static String a() {
        return "ad_type=? and app_id=? and placement_id=? and unit_id=? and state in (0,405,401,404);";
    }

    private static List<com.mbridge.msdk.newreward.function.core.campaign.b> a(Cursor cursor) {
        cursor = cursor;
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int columnIndex = cursor.getColumnIndex("ad_type");
            int columnIndex2 = cursor.getColumnIndex("app_id");
            int columnIndex3 = cursor.getColumnIndex("placement_id");
            int columnIndex4 = cursor.getColumnIndex(MBridgeConstans.PROPERTIES_UNIT_ID);
            int columnIndex5 = cursor.getColumnIndex("request_id");
            int columnIndex6 = cursor.getColumnIndex("local_id");
            int columnIndex7 = cursor.getColumnIndex("bid_token");
            int columnIndex8 = cursor.getColumnIndex("header_bidding");
            int columnIndex9 = cursor.getColumnIndex("load_start_time");
            int columnIndex10 = cursor.getColumnIndex("backup_id");
            int columnIndex11 = cursor.getColumnIndex("state");
            int columnIndex12 = cursor.getColumnIndex("template");
            int columnIndex13 = cursor.getColumnIndex("invalid_time");
            int columnIndex14 = cursor.getColumnIndex("invalid_time_2");
            ArrayList arrayList2 = arrayList;
            int columnIndex15 = cursor.getColumnIndex("invalid_time_backup");
            int columnIndex16 = cursor.getColumnIndex("ecppv");
            int columnIndex17 = cursor.getColumnIndex("session_id");
            int i = columnIndex14;
            int columnIndex18 = cursor.getColumnIndex("system_id");
            int i2 = columnIndex13;
            int columnIndex19 = cursor.getColumnIndex("show_count");
            int columnIndex20 = cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_PARENT_SESSION_ID);
            int columnIndex21 = cursor.getColumnIndex("data");
            int columnIndex22 = cursor.getColumnIndex("token_rule");
            int columnIndex23 = cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX);
            int columnIndex24 = cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX);
            while (cursor.moveToNext()) {
                int i3 = columnIndex24;
                int i4 = columnIndex;
                int i5 = columnIndex2;
                int i6 = columnIndex3;
                int i7 = columnIndex4;
                com.mbridge.msdk.newreward.function.core.campaign.b bVar = new com.mbridge.msdk.newreward.function.core.campaign.b(cursor.getInt(columnIndex), cursor.getString(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4));
                bVar.f(cursor.getString(columnIndex5));
                bVar.d(cursor.getString(columnIndex6));
                String string = cursor.getString(columnIndex7);
                bVar.b(string);
                boolean z = true;
                if (cursor.getInt(columnIndex8) != 1) {
                    z = false;
                }
                bVar.a(z);
                bVar.e(cursor.getLong(columnIndex9));
                bVar.g(cursor.getString(columnIndex17));
                bVar.h(cursor.getString(columnIndex18));
                bVar.a(cursor.getString(columnIndex10));
                bVar.h(cursor.getInt(columnIndex11));
                bVar.i(cursor.getInt(columnIndex12));
                int i8 = columnIndex18;
                int i9 = columnIndex17;
                int i10 = i2;
                bVar.a(cursor.getLong(i10));
                i2 = i10;
                int i11 = i;
                bVar.b(cursor.getLong(i11));
                i = i11;
                int i12 = columnIndex15;
                bVar.c(cursor.getLong(i12));
                columnIndex15 = i12;
                int i13 = columnIndex16;
                bVar.a(cursor.getDouble(i13));
                int i14 = columnIndex19;
                bVar.g(cursor.getInt(i14));
                columnIndex16 = i13;
                int i15 = columnIndex20;
                bVar.e(cursor.getString(i15));
                int i16 = columnIndex22;
                bVar.j(cursor.getInt(i16));
                columnIndex22 = i16;
                int i17 = columnIndex23;
                bVar.f(cursor.getInt(i17));
                columnIndex23 = i17;
                bVar.e(cursor.getInt(i3));
                columnIndex21 = columnIndex21;
                JSONObject jSONObject = JSONUtils.parse(cursor.getString(columnIndex21));
                bVar.a(jSONObject);
                arrayList2 = arrayList2;
                arrayList2.add(bVar);
                CampaignUnit campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject, string);
                if (campaignUnit != null) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    if (ads != null) {
                        MBridgeGlobalCommon.handlerCampaigns(bVar.p(), bVar, ads, arrayList3);
                        bVar.a(ads);
                        bVar.b(arrayList3);
                    }
                }
                columnIndex20 = i15;
                columnIndex18 = i8;
                columnIndex17 = i9;
                columnIndex24 = i3;
                columnIndex = i4;
                columnIndex3 = i6;
                columnIndex4 = i7;
                columnIndex19 = i14;
                columnIndex2 = i5;
            }
            return arrayList2;
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CampaignTable", "parseCampaignTable: ", e2);
            }
            return null;
        }
    }
}
