package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.AabEntity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.DomainCampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.out.Campaign;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e extends com.mbridge.msdk.foundation.db.a<Campaign> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static e f33465r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f33469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f33470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f33471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f33472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f33473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f33474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f33475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f33476k;
    private final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f33477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f33478n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f33479o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f33480p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f33481q;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f33482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f33483b;

        public a(List list, String str) {
            this.f33482a = list;
            this.f33483b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Iterator it = this.f33482a.iterator();
            while (it.hasNext()) {
                e.this.a((CampaignEx) it.next(), this.f33483b, 0);
            }
        }
    }

    public e(f fVar) {
        super(fVar);
        this.f33466a = "rid";
        this.f33467b = "lrid";
        this.f33468c = BidResponsedEx.KEY_CID;
        this.f33469d = CampaignEx.JSON_KEY_PLCT;
        this.f33470e = CampaignEx.JSON_KEY_PLCTB;
        this.f33471f = "timestamp";
        this.f33472g = "ridCount";
        this.f33473h = " WHERE ";
        this.f33474i = " AND ";
        this.f33475j = "SELECT ";
        this.f33476k = "*";
        this.l = " FROM ";
        this.f33477m = " AND readyState = '0'";
        this.f33478n = " AND is_bid_campaign = 1";
        this.f33479o = " order by ts ASC";
        this.f33480p = " group by request_id";
        this.f33481q = " group by bid_token";
    }

    public static synchronized e a(f fVar) {
        try {
            if (f33465r == null) {
                f33465r = new e(fVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f33465r;
    }

    public synchronized void b(String str, List<CampaignEx> list) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("readyState", (Integer) 0);
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, "unitid = ? AND id = ? AND request_id = ? ", new String[]{str, campaignEx.getId(), campaignEx.getRequestId()});
                        }
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("CampaignDao", e10.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    public synchronized List<CampaignEx> c(String str) {
        try {
            try {
                Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM campaign WHERE unitid = ? AND readyState = 2", new String[]{str});
                if (cursorRawQuery == null || cursorRawQuery.getCount() <= 0) {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (cursorRawQuery.moveToNext()) {
                    arrayList.add(a(cursorRawQuery));
                }
                cursorRawQuery.close();
                return arrayList;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", e10.getLocalizedMessage());
                }
                return null;
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", th2.getLocalizedMessage());
                }
                return null;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized void d(String str, String str2) {
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            String[] strArr = {str, str2};
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            getWritableDatabase().update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, "id = ? AND request_id = ? ", strArr);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e10.getLocalizedMessage());
            }
        }
    }

    public synchronized void e(String str, String str2) {
        try {
            String[] strArr = {str, str2};
            if (getWritableDatabase() == null) {
            } else {
                getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, "id = ? AND unitid = ? ", strArr);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e10.getLocalizedMessage());
            }
        }
    }

    public int f(String str, String str2) {
        String[] strArr;
        String str3;
        if (TextUtils.isEmpty(str)) {
            strArr = new String[]{str2};
            str3 = "unitid = ?  AND is_bid_campaign = 1";
        } else {
            strArr = new String[]{str2, str};
            str3 = "unitid = ?  AND request_id = ?  AND is_bid_campaign = 1";
        }
        String strConcat = str3.concat(" AND readyState = '0'");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            return getWritableDatabase().update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, strConcat, strArr);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e10.getLocalizedMessage());
            }
            return 0;
        }
    }

    public synchronized void a(String str, int i10, int i11) {
        try {
            String[] strArr = {str, String.valueOf(i10), String.valueOf(i11)};
            if (getWritableDatabase() == null) {
                return;
            }
            getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, "unitid = ? AND level = ? AND adSource = ? ", strArr);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e10.getLocalizedMessage());
            }
        }
    }

    public List<String> e(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            Cursor cursorRawQuery = null;
            try {
                try {
                    synchronized (new Object()) {
                        cursorRawQuery = getReadableDatabase().rawQuery("SELECT local_request_id as lrid FROM campaign WHERE unitid = ? AND readyState = ?", new String[]{str, String.valueOf(2)});
                    }
                    if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                        while (cursorRawQuery.moveToNext()) {
                            String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("lrid"));
                            if (!TextUtils.isEmpty(string)) {
                                arrayList.add(string);
                            }
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Exception e10) {
                    q0.b("CampaignDao", e10.getLocalizedMessage());
                    if (0 != 0) {
                    }
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursorRawQuery.close();
                }
                throw th2;
            }
        }
        return arrayList;
    }

    public synchronized void d() {
        try {
            String[] strArr = {String.valueOf(System.currentTimeMillis() - 3600000)};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, "ts< ? AND ts>0", strArr);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e10.getLocalizedMessage());
            }
        }
    }

    public synchronized void a(String str, int i10, int i11, boolean z10) {
        try {
            String[] strArr = {str, String.valueOf(i10), String.valueOf(i11), String.valueOf(z10 ? 1 : 0)};
            if (getWritableDatabase() == null) {
                return;
            }
            getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, "unitid = ? AND level = ? AND adSource = ?  AND is_bid_campaign = ? ", strArr);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e10.getLocalizedMessage());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bd A[PHI: r2
  0x00bd: PHI (r2v1 android.database.Cursor) = (r2v0 android.database.Cursor), (r2v2 android.database.Cursor) binds: [B:33:0x00bb, B:25:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    public ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> f(String str) {
        String[] strArr = {str};
        ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> concurrentHashMap = new ConcurrentHashMap<>();
        Cursor cursorRawQuery = null;
        try {
            try {
                synchronized (new Object()) {
                    cursorRawQuery = getReadableDatabase().rawQuery("SELECT request_id as rid, id as cid, plct as plct, plctb as plctb, ts as timestamp FROM campaign WHERE unitid = ? AND level = 0 AND adSource = 1 AND is_bid_campaign = 1 AND readyState = '0'", strArr);
                }
                if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                    while (cursorRawQuery.moveToNext()) {
                        String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("rid"));
                        String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex(BidResponsedEx.KEY_CID));
                        long j10 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_PLCT));
                        long j11 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_PLCTB));
                        long j12 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("timestamp"));
                        if (concurrentHashMap.containsKey(string)) {
                            com.mbridge.msdk.foundation.entity.c cVar = concurrentHashMap.get(string);
                            if (cVar != null) {
                                cVar.a(string);
                                cVar.a(j10);
                                cVar.b(j11);
                                cVar.c(j12);
                                if (cVar.c() != null) {
                                    cVar.c().add(string2);
                                }
                            }
                        } else {
                            com.mbridge.msdk.foundation.entity.c cVar2 = new com.mbridge.msdk.foundation.entity.c();
                            cVar2.a(string);
                            cVar2.a(j10);
                            cVar2.b(j11);
                            cVar2.c(j12);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(string2);
                            cVar2.a(arrayList);
                            concurrentHashMap.put(string, cVar2);
                        }
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", e10.getLocalizedMessage());
                }
                if (0 != 0) {
                    cursorRawQuery.close();
                }
            }
            return concurrentHashMap;
        } catch (Throwable th2) {
            if (0 != 0) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    public synchronized void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] strArr = {str};
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete(MBInterstitialActivity.INTENT_CAMAPIGN, "unitid = ? AND readyState = 2", strArr);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e10.getLocalizedMessage());
            }
        }
    }

    public synchronized void c(String str, String str2) {
        try {
            try {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                String str3 = "";
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(str)) {
                    str3 = "unitid = ? AND ";
                    arrayList.add(str);
                }
                String strConcat = str3.concat("n_local_request_id = ? AND bid_token IS NOT NULL AND n_local_request_id IS NOT NULL");
                arrayList.add(str2);
                ContentValues contentValues = new ContentValues();
                contentValues.put("readyState", (Integer) 2);
                getWritableDatabase().update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, strConcat, (String[]) arrayList.toArray(new String[0]));
            } catch (Exception e10) {
                q0.b("CampaignDao", e10.getLocalizedMessage());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(String str, List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (CampaignEx campaignEx : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("readyState", (Integer) 2);
                        String str2 = "id = ? AND unitid = ? AND request_id = ?  AND is_bid_campaign = ? ";
                        String[] strArr = {campaignEx.getId(), str, campaignEx.getRequestId(), campaignEx.isBidCampaign() ? "1" : "0"};
                        try {
                            SQLiteDatabase writableDatabase = getWritableDatabase();
                            if (writableDatabase != null) {
                                writableDatabase.update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, str2, strArr);
                            }
                        } catch (SQLException e10) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("CampaignDao", e10.getLocalizedMessage());
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public List<com.mbridge.msdk.foundation.entity.c> d(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            String strN = defpackage.e.n("SELECT request_id as rid ,count(*) as ridCount ,vcn,token_r,bid_token,local_request_id,ts as timestamp FROM campaign", wi.d.h(" WHERE unitid = ? AND level = 0 AND adSource = 1 AND is_bid_campaign = 1 AND readyState = '0' group by request_id", " order by ts ASC"));
            String[] strArr = {str};
            Cursor cursorRawQuery = null;
            try {
                try {
                    synchronized (new Object()) {
                        cursorRawQuery = getReadableDatabase().rawQuery(strN, strArr);
                    }
                    if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                        while (cursorRawQuery.moveToNext()) {
                            com.mbridge.msdk.foundation.entity.c cVar = new com.mbridge.msdk.foundation.entity.c();
                            String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("rid"));
                            if (!TextUtils.isEmpty(string)) {
                                String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("local_request_id"));
                                String string3 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("bid_token"));
                                int i10 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("ridCount"));
                                int i11 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("token_r"));
                                long j10 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("timestamp"));
                                int i12 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("vcn"));
                                cVar.a(string);
                                cVar.a(i10);
                                cVar.c(j10);
                                cVar.b(i11);
                                cVar.c(i12);
                                cVar.c(string2);
                                if (!TextUtils.isEmpty(string3)) {
                                    cVar.b(string3);
                                }
                                arrayList.add(cVar);
                            }
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CampaignDao", e10.getLocalizedMessage());
                    }
                    if (0 != 0) {
                    }
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursorRawQuery.close();
                }
                throw th2;
            }
        }
        return arrayList;
    }

    public synchronized void b(List<CampaignEx> list, String str) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    try {
                        String[] strArr = {str, campaignEx.getId(), campaignEx.getRequestId()};
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("readyState", (Integer) 2);
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, "unitid = ? AND id = ? AND request_id = ? ", strArr);
                        }
                    } catch (SQLException e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("CampaignDao", e10.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    public synchronized void a(String str, CampaignEx campaignEx, boolean z10, String str2) {
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                if (campaignEx == null && !TextUtils.isEmpty(str2)) {
                    sb2.append("unitid");
                    sb2.append(" = ? AND ");
                    sb2.append("request_id");
                    sb2.append(" = ?");
                } else if (campaignEx != null && campaignEx.getLoadTimeoutState() == 0) {
                    sb2.append("unitid");
                    sb2.append(" = ? AND ");
                    sb2.append("id");
                    sb2.append(" = ? AND ");
                    sb2.append("request_id");
                    sb2.append(" = ?");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                if (campaignEx != null && campaignEx.getLoadTimeoutState() == 0) {
                    arrayList.add(String.valueOf(campaignEx.getId()));
                    arrayList.add(campaignEx.getRequestId());
                } else {
                    arrayList.add(str2);
                }
                if (!TextUtils.isEmpty(sb2)) {
                    if (s0.a().a("c_n_c_s", true)) {
                        sb2.append(" AND readyState");
                        sb2.append(" != 0");
                    }
                    if (z10) {
                        sb2.append(" AND is_bid_campaign = 1");
                    } else {
                        sb2.append(" AND is_bid_campaign = 0");
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("readyState", (Integer) 2);
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                    if (writableDatabase != null) {
                        writableDatabase.update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, sb2.toString(), strArr);
                    }
                }
            } catch (SQLException e10) {
                q0.b("CampaignDao", e10.getLocalizedMessage());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b(long j10, String str) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str2 = "(plctb>0 and (plctb* 1000+ts)< " + jCurrentTimeMillis + " ) or (plctb<=0 and ts< " + (jCurrentTimeMillis - j10) + " ) and unitid=?";
            String[] strArr = {str};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, str2, strArr);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e10.getLocalizedMessage());
            }
        }
    }

    public synchronized List<CampaignEx> b(String str, int i10, int i11, int i12) {
        ArrayList arrayList;
        String str2;
        try {
            arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add(String.valueOf(i11));
            arrayList.add(String.valueOf(i12));
            str2 = "";
            if (i10 > 0) {
                str2 = " LIMIT ?";
                arrayList.add(String.valueOf(i10));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a("SELECT * FROM campaign WHERE unitid = ? AND level = ? AND adSource = ?".concat(str2), (String[]) arrayList.toArray(new String[0]));
    }

    public synchronized void b(String str, String str2) {
        try {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                String str3 = "unitid = ?";
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                if (!TextUtils.isEmpty(str2)) {
                    str3 = "unitid = ? AND bid_token != ?";
                    arrayList.add(str2);
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("readyState", (Integer) 2);
                getWritableDatabase().update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, (str3 + " AND is_bid_campaign = 1") + " AND bid_token IS NOT NULL", (String[]) arrayList.toArray(new String[0]));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", e10.getLocalizedMessage());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(String str, List<CampaignEx> list, boolean z10) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    a(str, campaignEx, z10, campaignEx.getRequestId());
                }
            }
        }
    }

    public synchronized void a(String str, List<CampaignEx> list, String str2, int i10) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0 && !TextUtils.isEmpty(str2)) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            try {
                for (CampaignEx campaignEx : list) {
                    if (campaignEx != null) {
                        String[] strArr = {str, campaignEx.getId(), campaignEx.getRequestId()};
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(str2, Integer.valueOf(i10));
                        writableDatabase.update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, "unitid = ? AND id = ? AND request_id = ? ", strArr);
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", e10.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    public List<CampaignEx> b(String str, int i10, boolean z10) throws Throwable {
        Cursor cursorRawQuery;
        ArrayList arrayList;
        String str2;
        String[] strArr;
        Cursor cursor = null;
        arrayList = null;
        ArrayList arrayList2 = null;
        try {
            try {
                if (z10) {
                    str2 = "placement_id = ? AND ad_type = ? ";
                    strArr = new String[]{str, String.valueOf(i10)};
                } else {
                    str2 = "ad_type = ? ";
                    strArr = new String[]{String.valueOf(i10)};
                }
                cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM campaign WHERE ".concat(str2), strArr);
                if (cursorRawQuery != null) {
                    try {
                        try {
                            if (cursorRawQuery.getCount() > 0) {
                                arrayList = new ArrayList();
                                while (cursorRawQuery.moveToNext()) {
                                    try {
                                        arrayList.add(a(cursorRawQuery));
                                    } catch (Exception e10) {
                                        e = e10;
                                        cursor = cursorRawQuery;
                                        q0.b("CampaignDao", e.getLocalizedMessage());
                                        if (cursor != null) {
                                            return arrayList;
                                        }
                                        cursorRawQuery = cursor;
                                        arrayList2 = arrayList;
                                    }
                                }
                                arrayList2 = arrayList;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorRawQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        arrayList = null;
                        cursor = cursorRawQuery;
                        q0.b("CampaignDao", e.getLocalizedMessage());
                        if (cursor != null) {
                            return arrayList;
                        }
                        cursorRawQuery = cursor;
                        arrayList2 = arrayList;
                        cursorRawQuery.close();
                        return arrayList2;
                    }
                }
                if (cursorRawQuery == null) {
                    return arrayList2;
                }
            } catch (Exception e12) {
                e = e12;
                cursorRawQuery = null;
            }
            cursorRawQuery.close();
            return arrayList2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public synchronized void a(String str, List<CampaignEx> list, List<CampaignEx> list2, boolean z10) {
        if (getWritableDatabase() == null) {
            return;
        }
        if (list != null) {
            try {
                try {
                    if (list.size() > 0) {
                        for (CampaignEx campaignEx : list) {
                            try {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("readyState", (Integer) 0);
                                String[] strArr = {str, campaignEx.getId(), campaignEx.getRequestId()};
                                getWritableDatabase().update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, z10 ? "unitid = ? AND id = ? AND request_id = ?  AND is_bid_campaign = 1" : "unitid = ? AND id = ? AND request_id = ?  AND is_bid_campaign = 0", strArr);
                            } catch (Exception e10) {
                                if (MBridgeConstans.DEBUG) {
                                    q0.b("CampaignDao", e10.getLocalizedMessage());
                                }
                            }
                        }
                    }
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CampaignDao", e11.getLocalizedMessage());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx campaignEx2 : list2) {
                try {
                    if (campaignEx2.getLoadTimeoutState() == 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("unitid");
                        sb2.append(" = ? AND ");
                        sb2.append("id");
                        sb2.append(" = ? AND ");
                        sb2.append("request_id");
                        sb2.append(" = ? ");
                        String[] strArr2 = {str, campaignEx2.getId(), campaignEx2.getRequestId()};
                        if (z10) {
                            sb2.append(" AND is_bid_campaign = 1");
                        } else {
                            sb2.append(" AND is_bid_campaign = 0");
                        }
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("readyState", (Integer) 2);
                        getWritableDatabase().update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues2, sb2.toString(), strArr2);
                    }
                } catch (SQLException e12) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CampaignDao", e12.getLocalizedMessage());
                    }
                }
            }
        }
    }

    public synchronized void a(String str, List<CampaignEx> list, String str2) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("local_request_id", str2);
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, "unitid = ? AND id = ? AND request_id = ? ", new String[]{str, campaignEx.getId(), campaignEx.getRequestId()});
                        }
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("CampaignDao", e10.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    public synchronized void a(String str, String str2, boolean z10, String str3) {
        try {
            try {
                String[] strArr = {str, str2, z10 ? "1" : "0", str3};
                if (getWritableDatabase() == null) {
                    return;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("readyState", (Integer) 2);
                getWritableDatabase().update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, "id = ? AND unitid = ? AND is_bid_campaign = ? AND request_id = ? ", strArr);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", e10.getLocalizedMessage());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(String str, String str2, String str3) {
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, "unitid = ? AND (local_request_id = ?  OR local_request_id = ? )", new String[]{str, str2, str3});
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e10.getLocalizedMessage());
            }
        }
    }

    public synchronized void a(String str, String str2, int i10, int i11, boolean z10) {
        String str3;
        try {
            try {
                String[] strArr = {str, str2, String.valueOf(i10), String.valueOf(i11)};
                if (z10) {
                    str3 = "id = ? AND unitid = ? AND level = ? AND adSource = ?  AND is_bid_campaign = 1";
                } else {
                    str3 = "id = ? AND unitid = ? AND level = ? AND adSource = ?  AND is_bid_campaign = 0";
                }
                if (getWritableDatabase() == null) {
                    return;
                }
                getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, str3, strArr);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", e10.getLocalizedMessage());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(String str) {
        try {
            String[] strArr = {str};
            if (getWritableDatabase() == null) {
            } else {
                getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, "unitid = ? ", strArr);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e10.getLocalizedMessage());
            }
        }
    }

    public synchronized void a(String str, int i10, boolean z10) {
        String str2;
        String[] strArr;
        try {
            try {
                if (z10) {
                    str2 = "placement_id = ? AND ad_type = ? ";
                    strArr = new String[]{str, String.valueOf(i10)};
                } else {
                    str2 = "ad_type = " + i10;
                    strArr = new String[]{String.valueOf(i10)};
                }
                if (getWritableDatabase() == null) {
                    return;
                }
                getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, str2, strArr);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", e10.getLocalizedMessage());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(long j10, String str) {
        try {
            String[] strArr = {String.valueOf(System.currentTimeMillis() - j10), str};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, "ts< ? and unitid= ? ", strArr);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e10.getLocalizedMessage());
            }
        }
    }

    public synchronized void a(List<CampaignEx> list, String str, String str2, int i10) {
        if (list != null) {
            if (list.size() != 0) {
                if (getWritableDatabase() == null) {
                    return;
                }
                Iterator<CampaignEx> it = list.iterator();
                while (it.hasNext()) {
                    a(it.next(), str, str2, i10);
                }
            }
        }
    }

    public synchronized long a(CampaignEx campaignEx, String str, String str2, int i10) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            try {
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                if (campaignEx.getPv_urls() != null && campaignEx.getPv_urls().size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<String> it = campaignEx.getPv_urls().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next());
                    }
                    contentValues.put("pv_urls", jSONArray.toString());
                }
                contentValues.put("id", campaignEx.getId());
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                contentValues.put("placement_id", str);
                contentValues.put("unitid", str2);
                contentValues.put("tab", Integer.valueOf(campaignEx.getTab()));
                contentValues.put("package_name", campaignEx.getPackageName());
                contentValues.put("app_name", campaignEx.getAppName());
                contentValues.put("app_desc", campaignEx.getAppDesc());
                contentValues.put(CampaignEx.JSON_KEY_APP_SIZE, campaignEx.getSize());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
                contentValues.put(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, campaignEx.getImageUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
                contentValues.put(CampaignEx.JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
                contentValues.put(DownloadModel.DOWNLOAD_URL, campaignEx.getClickURL());
                contentValues.put(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK, Integer.valueOf(campaignEx.getWtick()));
                contentValues.put("deeplink_url", campaignEx.getDeepLinkURL());
                contentValues.put(CampaignEx.JSON_KEY_USER_ACTIVATION, Boolean.toString(campaignEx.getUserActivation()));
                contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I, campaignEx.getNetAddress());
                contentValues.put(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH, Integer.valueOf(campaignEx.getAc_s()));
                contentValues.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, campaignEx.getAc());
                contentValues.put("ts", Long.valueOf(campaignEx.getTimestamp()));
                contentValues.put("template", Integer.valueOf(campaignEx.getTemplate()));
                contentValues.put(CampaignEx.JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
                contentValues.put(CampaignEx.JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
                contentValues.put(CampaignEx.JSON_KEY_LINK_TYPE, Integer.valueOf(campaignEx.getLinkType()));
                contentValues.put("star", Double.valueOf(campaignEx.getRating()));
                contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval()));
                contentValues.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(campaignEx.getCacheLevel()));
                contentValues.put("adSource", Integer.valueOf(campaignEx.getType()));
                contentValues.put("ad_call", campaignEx.getAdCall());
                contentValues.put("fc_a", Integer.valueOf(campaignEx.getFca()));
                contentValues.put("fc_b", Integer.valueOf(campaignEx.getFcb()));
                contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_URL, campaignEx.getVideoUrlEncode());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Integer.valueOf(campaignEx.getVideoSize()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_LENGTHL, Integer.valueOf(campaignEx.getVideoLength()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, campaignEx.getVideoResolution());
                contentValues.put(CampaignEx.JSON_KEY_ENDCARD_CLICK, Integer.valueOf(campaignEx.getEndcard_click_result()));
                contentValues.put(CampaignEx.JSON_KEY_WATCH_MILE, Integer.valueOf(campaignEx.getWatchMile()));
                contentValues.put("advImp", campaignEx.getAdvImp());
                contentValues.put("bty", Integer.valueOf(campaignEx.getBty()));
                contentValues.put(CampaignEx.JSON_KEY_T_IMP, Integer.valueOf(campaignEx.getTImp()));
                contentValues.put(CampaignEx.JSON_KEY_GUIDELINES, campaignEx.getGuidelines());
                contentValues.put(CampaignEx.JSON_KEY_OFFER_TYPE, Integer.valueOf(campaignEx.getOfferType()));
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL, campaignEx.getHtmlUrl());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_END_SCREEN_URL, campaignEx.getEndScreenUrl());
                contentValues.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, Integer.valueOf(campaignEx.getRewardAmount()));
                contentValues.put(CampaignEx.JSON_KEY_REWARD_NAME, campaignEx.getRewardName());
                contentValues.put("reward_play_status", Integer.valueOf(campaignEx.getRewardPlayStatus()));
                contentValues.put("retarget", Integer.valueOf(campaignEx.getRetarget_offer()));
                contentValues.put("native_ad_tracking", campaignEx.getNativeVideoTrackingString());
                contentValues.put(CampaignEx.PLAYABLE_ADS_WITHOUT_VIDEO, Integer.valueOf(campaignEx.getPlayable_ads_without_video()));
                contentValues.put(CampaignEx.ENDCARD_URL, campaignEx.getendcard_url());
                contentValues.put(CampaignEx.VIDEO_END_TYPE, Integer.valueOf(campaignEx.getVideo_end_type()));
                contentValues.put(CampaignEx.JSON_KEY_REWARD_VIDEO_MD5, campaignEx.getVideoMD5Value());
                contentValues.put(CampaignEx.JSON_KEY_NV_T2, Integer.valueOf(campaignEx.getNvT2()));
                contentValues.put(CampaignEx.JSON_KEY_GIF_URL, campaignEx.getGifUrl());
                if (campaignEx.getRewardTemplateMode() != null) {
                    contentValues.put("reward_teamplate", campaignEx.getRewardTemplateMode().i());
                }
                contentValues.put("c_coi", Integer.valueOf(campaignEx.getClickTimeOutInterval()));
                contentValues.put(CampaignEx.JSON_KEY_C_UA, Integer.valueOf(campaignEx.getcUA()));
                contentValues.put(CampaignEx.JSON_KEY_IMP_UA, Integer.valueOf(campaignEx.getImpUA()));
                contentValues.put(CampaignEx.JSON_KEY_JM_PD, Integer.valueOf(campaignEx.getJmPd()));
                contentValues.put("is_deleted", Integer.valueOf(campaignEx.getIsDeleted()));
                contentValues.put("is_click", Integer.valueOf(campaignEx.getIsClick()));
                contentValues.put("is_add_sucesful", Integer.valueOf(campaignEx.getIsAddSuccesful()));
                contentValues.put("short_ctime", String.valueOf(System.currentTimeMillis()));
                contentValues.put("ia_icon", campaignEx.getKeyIaIcon());
                contentValues.put("ia_url", campaignEx.getKeyIaUrl());
                contentValues.put("ia_rst", Integer.valueOf(campaignEx.getKeyIaRst()));
                contentValues.put("ia_ori", Integer.valueOf(campaignEx.getKeyIaOri()));
                contentValues.put("ad_type", Integer.valueOf(campaignEx.getAdType()));
                contentValues.put(CampaignEx.KEY_IA_EXT1, campaignEx.getIa_ext1());
                contentValues.put(CampaignEx.KEY_IA_EXT2, campaignEx.getIa_ext2());
                contentValues.put(CampaignEx.KEY_IS_DOWNLOAD, Integer.valueOf(campaignEx.getIsDownLoadZip()));
                contentValues.put(CampaignEx.KEY_IA_CACHE, campaignEx.getInteractiveCache());
                contentValues.put(CampaignEx.KEY_OC_TIME, Integer.valueOf(campaignEx.getOc_time()));
                contentValues.put(CampaignEx.KEY_OC_TYPE, Integer.valueOf(campaignEx.getOc_type()));
                contentValues.put(CampaignEx.KEY_T_LIST, campaignEx.getT_list());
                CampaignEx.a adchoice = campaignEx.getAdchoice();
                if (adchoice != null) {
                    contentValues.put(CampaignEx.KEY_ADCHOICE, adchoice.d());
                    contentValues.put("adchoice_size_height", Integer.valueOf(adchoice.j()));
                    contentValues.put("adchoice_size_width", Integer.valueOf(adchoice.k()));
                }
                contentValues.put(CampaignEx.JSON_KEY_PLCT, Long.valueOf(campaignEx.getPlct()));
                contentValues.put(CampaignEx.JSON_KEY_PLCTB, Long.valueOf(campaignEx.getPlctb()));
                contentValues.put(CampaignEx.JSON_KEY_C_C_TIME, Long.valueOf(campaignEx.getCandidateCacheTime()));
                contentValues.put(CampaignEx.JSON_KEY_AD_HTML, campaignEx.getAdHtml());
                contentValues.put("ad_zip", campaignEx.getAdZip());
                contentValues.put(CampaignEx.JSON_KEY_BANNER_URL, campaignEx.getBannerUrl());
                contentValues.put(CampaignEx.JSON_KEY_BANNER_HTML, campaignEx.getBannerHtml());
                contentValues.put(CampaignEx.JSON_KEY_CREATIVE_ID, Long.valueOf(campaignEx.getCreativeId()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CREATIVE_ID, Long.valueOf(campaignEx.getVidCrtvId()));
                contentValues.put(CampaignEx.JSON_KEY_EC_CREATIVE_ID, Long.valueOf(campaignEx.getEcCrtvId()));
                contentValues.put(CampaignEx.JSON_KEY_EC_TEMP_ID, Long.valueOf(campaignEx.getEcTemplateId()));
                contentValues.put("is_bid_campaign", Boolean.valueOf(campaignEx.isBidCampaign()));
                contentValues.put("bid_token", campaignEx.getBidToken());
                contentValues.put(CampaignEx.JSON_KEY_MRAID, campaignEx.getMraid());
                contentValues.put("is_mraid_campaign", Boolean.valueOf(campaignEx.isMraid()));
                contentValues.put(CampaignEx.KEY_OMID, campaignEx.getOmid());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TPLID, Integer.valueOf(campaignEx.getMof_tplid()));
                contentValues.put(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(campaignEx.getReady_rate()));
                contentValues.put(CampaignEx.JSON_KEY_EXT_DATA, campaignEx.getExt_data());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_NSCPT, Integer.valueOf(campaignEx.getNscpt()));
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TEMPLATE_URL, campaignEx.getMof_template_url());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_REQ_EXT_DATA, campaignEx.getReq_ext_data());
                contentValues.put("readyState", Integer.valueOf(campaignEx.getReadyState()));
                contentValues.put("request_id", campaignEx.getRequestId());
                contentValues.put("n_request_id", campaignEx.getNRid());
                contentValues.put("local_request_id", campaignEx.getLocalRequestId());
                contentValues.put("n_local_request_id", campaignEx.getNLRid());
                contentValues.put("err_type_default_ad", Integer.valueOf(campaignEx.getTyped()));
                contentValues.put("err_reason_default_ad", campaignEx.getReasond());
                contentValues.put("load_timeout", Integer.valueOf(campaignEx.getLoadTimeoutState()));
                contentValues.put(CampaignEx.JSON_KEY_MAITVE, Integer.valueOf(campaignEx.getMaitve()));
                contentValues.put(CampaignEx.JSON_KEY_MAITVESRC, campaignEx.getMaitve_src());
                contentValues.put(CampaignEx.JSON_KEY_FLB, Integer.valueOf(campaignEx.getFlb()));
                contentValues.put(CampaignEx.JSON_KEY_FLB_SKIP_TIME, Integer.valueOf(campaignEx.getFlbSkipTime()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(campaignEx.getAdSpaceT()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_CBD, Integer.valueOf(campaignEx.getCbd()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, Integer.valueOf(campaignEx.getVst()));
                contentValues.put(CampaignEx.JSON_KEY_USE_SKIP_TIME, Integer.valueOf(campaignEx.getUseSkipTime()));
                contentValues.put(CampaignEx.JSON_KEY_PROG_BAR, Integer.valueOf(campaignEx.getProgressBarShow()));
                contentValues.put("vcn", Integer.valueOf(campaignEx.getVcn()));
                contentValues.put("token_r", Integer.valueOf(campaignEx.getTokenRule()));
                contentValues.put("encrypt_p", campaignEx.getEncryptPrice());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CHECK_TYPE, Integer.valueOf(campaignEx.getVideoCheckType()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CTN_TYPE, Integer.valueOf(campaignEx.getVideoCtnType()));
                contentValues.put(CampaignEx.JSON_KEY_RS_IGNORE_CHECK_RULE, campaignEx.getRsIgnoreCheckRuleString());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_COMPLETE_TIME, Integer.valueOf(campaignEx.getVideoCompleteTime()));
                contentValues.put(CampaignEx.JSON_KEY_TP_OFFER, Integer.valueOf(campaignEx.getTpOffer()));
                contentValues.put(CampaignEx.JSON_KEY_FAC, Integer.valueOf(campaignEx.getFac()));
                if (campaignEx.getAabEntity() != null) {
                    contentValues.put(CampaignEx.JSON_KEY_AAB, campaignEx.getAabEntity().toJson().toString());
                }
                contentValues.put(CampaignEx.JSON_KEY_PRIVACY_URL, campaignEx.getPrivacyUrl());
                contentValues.put("privacy_button_video", Integer.valueOf(campaignEx.getPrivacyButtonTemplateVisibility()));
                contentValues.put(CampaignEx.JSON_KEY_IMP_REPORT_TYPE, Integer.valueOf(campaignEx.getImpReportType()));
                contentValues.put("auto_minicard", Integer.valueOf(campaignEx.getAutoShowStoreMiniCard()));
                contentValues.put("mincard_trigger_time", Integer.valueOf(campaignEx.getShowStoreMiniCardDelayTime()));
                contentValues.put(CampaignEx.KEY_SECOND_FILTER_AD_SHOW_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsShowCallState()));
                contentValues.put(CampaignEx.KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsVideoCallState()));
                contentValues.put(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(campaignEx.getFilterCallBackState()));
                contentValues.put("r_index", Integer.valueOf(campaignEx.getSecondRequestIndex()));
                contentValues.put("s_show_index", Integer.valueOf(campaignEx.getSecondShowIndex()));
                contentValues.put(CampaignEx.KEY_LOCAL_CHECK_STATE, Integer.valueOf(campaignEx.getLocalCheckShow()));
                contentValues.put(CampaignEx.KEY_LOCAL_ALLOW_TRACK_CLICK, Integer.valueOf(campaignEx.getLocalAllowTrackClick()));
                return getWritableDatabase().insert(MBInterstitialActivity.INTENT_CAMAPIGN, null, contentValues);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", e10.getLocalizedMessage());
                }
                return -1L;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long a(CampaignEx campaignEx, String str, int i10) throws Throwable {
        e eVar;
        Throwable th2;
        Exception exc;
        String str2;
        String[] strArr;
        if (campaignEx == null) {
            return 0L;
        }
        try {
            try {
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", campaignEx.getId());
                if (campaignEx.getPv_urls() != null) {
                    try {
                        if (campaignEx.getPv_urls().size() > 0) {
                            JSONArray jSONArray = new JSONArray();
                            Iterator<String> it = campaignEx.getPv_urls().iterator();
                            while (it.hasNext()) {
                                jSONArray.put(it.next());
                            }
                            contentValues.put("pv_urls", jSONArray.toString());
                        }
                    } catch (Exception e10) {
                        exc = e10;
                        eVar = this;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                contentValues.put("unitid", str);
                contentValues.put("request_id", campaignEx.getRequestId());
                contentValues.put("n_request_id", campaignEx.getNRid());
                contentValues.put("local_request_id", campaignEx.getLocalRequestId());
                contentValues.put("n_local_request_id", campaignEx.getNLRid());
                contentValues.put("err_type_default_ad", Integer.valueOf(campaignEx.getTyped()));
                contentValues.put("err_reason_default_ad", campaignEx.getReasond());
                contentValues.put("tab", Integer.valueOf(campaignEx.getTab()));
                contentValues.put("package_name", campaignEx.getPackageName());
                contentValues.put("app_name", campaignEx.getAppName());
                contentValues.put("app_desc", campaignEx.getAppDesc());
                contentValues.put(CampaignEx.JSON_KEY_APP_SIZE, campaignEx.getSize());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
                contentValues.put(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, campaignEx.getImageUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
                contentValues.put(CampaignEx.JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
                contentValues.put(DownloadModel.DOWNLOAD_URL, campaignEx.getClickURL());
                contentValues.put(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK, Integer.valueOf(campaignEx.getWtick()));
                contentValues.put("deeplink_url", campaignEx.getDeepLinkURL());
                contentValues.put(CampaignEx.JSON_KEY_USER_ACTIVATION, Boolean.toString(campaignEx.getUserActivation()));
                contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I, campaignEx.getNetAddress());
                contentValues.put(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH, Integer.valueOf(campaignEx.getAc_s()));
                contentValues.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, campaignEx.getAc());
                contentValues.put("ts", Long.valueOf(campaignEx.getTimestamp()));
                contentValues.put("template", Integer.valueOf(campaignEx.getTemplate()));
                contentValues.put(CampaignEx.JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
                contentValues.put(CampaignEx.JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
                contentValues.put(CampaignEx.JSON_KEY_LINK_TYPE, Integer.valueOf(campaignEx.getLinkType()));
                contentValues.put("star", Double.valueOf(campaignEx.getRating()));
                contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval()));
                contentValues.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(campaignEx.getCacheLevel()));
                contentValues.put("adSource", Integer.valueOf(campaignEx.getType()));
                contentValues.put("ad_call", campaignEx.getAdCall());
                contentValues.put("fc_a", Integer.valueOf(campaignEx.getFca()));
                contentValues.put("fc_b", Integer.valueOf(campaignEx.getFcb()));
                contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_URL, campaignEx.getVideoUrlEncode());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Integer.valueOf(campaignEx.getVideoSize()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_LENGTHL, Integer.valueOf(campaignEx.getVideoLength()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, campaignEx.getVideoResolution());
                contentValues.put(CampaignEx.JSON_KEY_ENDCARD_CLICK, Integer.valueOf(campaignEx.getEndcard_click_result()));
                contentValues.put(CampaignEx.JSON_KEY_WATCH_MILE, Integer.valueOf(campaignEx.getWatchMile()));
                contentValues.put("advImp", campaignEx.getAdvImp());
                contentValues.put("bty", Integer.valueOf(campaignEx.getBty()));
                contentValues.put(CampaignEx.JSON_KEY_T_IMP, Integer.valueOf(campaignEx.getTImp()));
                contentValues.put(CampaignEx.JSON_KEY_GUIDELINES, campaignEx.getGuidelines());
                contentValues.put(CampaignEx.JSON_KEY_OFFER_TYPE, Integer.valueOf(campaignEx.getOfferType()));
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL, campaignEx.getHtmlUrl());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_END_SCREEN_URL, campaignEx.getEndScreenUrl());
                contentValues.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, Integer.valueOf(campaignEx.getRewardAmount()));
                contentValues.put(CampaignEx.JSON_KEY_REWARD_NAME, campaignEx.getRewardName());
                contentValues.put("reward_play_status", Integer.valueOf(campaignEx.getRewardPlayStatus()));
                contentValues.put("retarget", Integer.valueOf(campaignEx.getRetarget_offer()));
                contentValues.put("native_ad_tracking", campaignEx.getNativeVideoTrackingString());
                contentValues.put(CampaignEx.PLAYABLE_ADS_WITHOUT_VIDEO, Integer.valueOf(campaignEx.getPlayable_ads_without_video()));
                contentValues.put(CampaignEx.ENDCARD_URL, campaignEx.getendcard_url());
                contentValues.put(CampaignEx.VIDEO_END_TYPE, Integer.valueOf(campaignEx.getVideo_end_type()));
                contentValues.put(CampaignEx.JSON_KEY_REWARD_VIDEO_MD5, campaignEx.getVideoMD5Value());
                contentValues.put(CampaignEx.JSON_KEY_NV_T2, Integer.valueOf(campaignEx.getNvT2()));
                contentValues.put(CampaignEx.JSON_KEY_GIF_URL, campaignEx.getGifUrl());
                if (campaignEx.getRewardTemplateMode() != null) {
                    contentValues.put("reward_teamplate", campaignEx.getRewardTemplateMode().i());
                }
                contentValues.put("c_coi", Integer.valueOf(campaignEx.getClickTimeOutInterval()));
                contentValues.put(CampaignEx.JSON_KEY_C_UA, Integer.valueOf(campaignEx.getcUA()));
                contentValues.put(CampaignEx.JSON_KEY_IMP_UA, Integer.valueOf(campaignEx.getImpUA()));
                contentValues.put(CampaignEx.JSON_KEY_JM_PD, Integer.valueOf(campaignEx.getJmPd()));
                contentValues.put("is_deleted", Integer.valueOf(campaignEx.getIsDeleted()));
                contentValues.put("is_click", Integer.valueOf(campaignEx.getIsClick()));
                contentValues.put("is_add_sucesful", Integer.valueOf(campaignEx.getIsAddSuccesful()));
                contentValues.put("short_ctime", String.valueOf(System.currentTimeMillis()));
                contentValues.put("ia_icon", campaignEx.getKeyIaIcon());
                contentValues.put("ia_url", campaignEx.getKeyIaUrl());
                contentValues.put("ia_rst", Integer.valueOf(campaignEx.getKeyIaRst()));
                contentValues.put("ia_ori", Integer.valueOf(campaignEx.getKeyIaOri()));
                contentValues.put("ad_type", Integer.valueOf(campaignEx.getAdType()));
                contentValues.put(CampaignEx.KEY_IA_EXT1, campaignEx.getIa_ext1());
                contentValues.put(CampaignEx.KEY_IA_EXT2, campaignEx.getIa_ext2());
                contentValues.put(CampaignEx.KEY_IS_DOWNLOAD, Integer.valueOf(campaignEx.getIsDownLoadZip()));
                contentValues.put(CampaignEx.KEY_IA_CACHE, campaignEx.getInteractiveCache());
                contentValues.put(CampaignEx.KEY_OC_TIME, Integer.valueOf(campaignEx.getOc_time()));
                contentValues.put(CampaignEx.KEY_OC_TYPE, Integer.valueOf(campaignEx.getOc_type()));
                contentValues.put(CampaignEx.KEY_T_LIST, campaignEx.getT_list());
                CampaignEx.a adchoice = campaignEx.getAdchoice();
                if (adchoice != null) {
                    contentValues.put(CampaignEx.KEY_ADCHOICE, adchoice.d());
                    contentValues.put("adchoice_size_height", Integer.valueOf(adchoice.j()));
                    contentValues.put("adchoice_size_width", Integer.valueOf(adchoice.k()));
                }
                contentValues.put(CampaignEx.JSON_KEY_PLCT, Long.valueOf(campaignEx.getPlct()));
                contentValues.put(CampaignEx.JSON_KEY_PLCTB, Long.valueOf(campaignEx.getPlctb()));
                contentValues.put(CampaignEx.JSON_KEY_C_C_TIME, Long.valueOf(campaignEx.getCandidateCacheTime()));
                contentValues.put(CampaignEx.JSON_KEY_AD_HTML, campaignEx.getAdHtml());
                contentValues.put("ad_zip", campaignEx.getAdZip());
                contentValues.put(CampaignEx.JSON_KEY_BANNER_URL, campaignEx.getBannerUrl());
                contentValues.put(CampaignEx.JSON_KEY_BANNER_HTML, campaignEx.getBannerHtml());
                contentValues.put(CampaignEx.JSON_KEY_CREATIVE_ID, Long.valueOf(campaignEx.getCreativeId()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CREATIVE_ID, Long.valueOf(campaignEx.getVidCrtvId()));
                contentValues.put(CampaignEx.JSON_KEY_EC_CREATIVE_ID, Long.valueOf(campaignEx.getEcCrtvId()));
                contentValues.put(CampaignEx.JSON_KEY_EC_TEMP_ID, Long.valueOf(campaignEx.getEcTemplateId()));
                contentValues.put("is_bid_campaign", Boolean.valueOf(campaignEx.isBidCampaign()));
                contentValues.put("bid_token", campaignEx.getBidToken());
                contentValues.put(CampaignEx.JSON_KEY_MRAID, campaignEx.getMraid());
                contentValues.put("is_mraid_campaign", Boolean.valueOf(campaignEx.isMraid()));
                contentValues.put(CampaignEx.KEY_OMID, campaignEx.getOmid());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TPLID, Integer.valueOf(campaignEx.getMof_tplid()));
                contentValues.put(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(campaignEx.getReady_rate()));
                contentValues.put(CampaignEx.JSON_KEY_EXT_DATA, campaignEx.getExt_data());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_NSCPT, Integer.valueOf(campaignEx.getNscpt()));
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TEMPLATE_URL, campaignEx.getMof_template_url());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_REQ_EXT_DATA, campaignEx.getReq_ext_data());
                contentValues.put("readyState", Integer.valueOf(campaignEx.getReadyState()));
                contentValues.put("load_timeout", Integer.valueOf(campaignEx.getLoadTimeoutState()));
                contentValues.put("placement_id", campaignEx.getPlacementId());
                contentValues.put(CampaignEx.JSON_KEY_MAITVE, Integer.valueOf(campaignEx.getMaitve()));
                contentValues.put(CampaignEx.JSON_KEY_MAITVESRC, campaignEx.getMaitve_src());
                contentValues.put(CampaignEx.JSON_KEY_FLB, Integer.valueOf(campaignEx.getFlb()));
                contentValues.put(CampaignEx.JSON_KEY_FLB_SKIP_TIME, Integer.valueOf(campaignEx.getFlbSkipTime()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(campaignEx.getAdSpaceT()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_CBD, Integer.valueOf(campaignEx.getCbd()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, Integer.valueOf(campaignEx.getVst()));
                contentValues.put(CampaignEx.JSON_KEY_USE_SKIP_TIME, Integer.valueOf(campaignEx.getUseSkipTime()));
                contentValues.put(CampaignEx.JSON_KEY_PROG_BAR, Integer.valueOf(campaignEx.getProgressBarShow()));
                contentValues.put("vcn", Integer.valueOf(campaignEx.getVcn()));
                contentValues.put("token_r", Integer.valueOf(campaignEx.getTokenRule()));
                contentValues.put("encrypt_p", campaignEx.getEncryptPrice());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CHECK_TYPE, Integer.valueOf(campaignEx.getVideoCheckType()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CTN_TYPE, Integer.valueOf(campaignEx.getVideoCtnType()));
                contentValues.put(CampaignEx.JSON_KEY_RS_IGNORE_CHECK_RULE, campaignEx.getRsIgnoreCheckRuleString());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_COMPLETE_TIME, Integer.valueOf(campaignEx.getVideoCompleteTime()));
                contentValues.put(CampaignEx.JSON_KEY_TP_OFFER, Integer.valueOf(campaignEx.getTpOffer()));
                contentValues.put(CampaignEx.JSON_KEY_FAC, Integer.valueOf(campaignEx.getFac()));
                contentValues.put(CampaignEx.JSON_KEY_PRIVACY_URL, campaignEx.getPrivacyUrl());
                contentValues.put("privacy_button_video", Integer.valueOf(campaignEx.getPrivacyButtonTemplateVisibility()));
                contentValues.put(CampaignEx.JSON_KEY_IMP_REPORT_TYPE, Integer.valueOf(campaignEx.getImpReportType()));
                if (campaignEx.getAabEntity() != null) {
                    contentValues.put(CampaignEx.JSON_KEY_AAB, campaignEx.getAabEntity().toJson().toString());
                }
                contentValues.put("auto_minicard", Integer.valueOf(campaignEx.getAutoShowStoreMiniCard()));
                contentValues.put("mincard_trigger_time", Integer.valueOf(campaignEx.getShowStoreMiniCardDelayTime()));
                contentValues.put(CampaignEx.KEY_SECOND_FILTER_AD_SHOW_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsShowCallState()));
                contentValues.put(CampaignEx.KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsVideoCallState()));
                contentValues.put(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(campaignEx.getFilterCallBackState()));
                contentValues.put("r_index", Integer.valueOf(campaignEx.getSecondRequestIndex()));
                contentValues.put("s_show_index", Integer.valueOf(campaignEx.getSecondShowIndex()));
                contentValues.put(CampaignEx.KEY_LOCAL_CHECK_STATE, Integer.valueOf(campaignEx.getLocalCheckShow()));
                contentValues.put(CampaignEx.KEY_LOCAL_ALLOW_TRACK_CLICK, Integer.valueOf(campaignEx.getLocalAllowTrackClick()));
                eVar = this;
                try {
                    if (eVar.a(campaignEx.getId(), campaignEx.getTab(), str, i10, campaignEx.getType(), campaignEx.isBidCampaign())) {
                        if (campaignEx.isBidCampaign()) {
                            str2 = "unitid = ? AND is_bid_campaign = 1";
                            strArr = new String[]{str};
                        } else {
                            str2 = "id = ? AND unitid = ? AND is_bid_campaign = 0";
                            strArr = new String[]{campaignEx.getId(), str};
                        }
                        long jUpdate = eVar.getWritableDatabase().update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, str2, strArr);
                        return jUpdate;
                    }
                    long jInsert = eVar.getWritableDatabase().insert(MBInterstitialActivity.INTENT_CAMAPIGN, null, contentValues);
                    return jInsert;
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                eVar = this;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
        exc = e;
        if (MBridgeConstans.DEBUG) {
            q0.b("CampaignDao", exc.getLocalizedMessage());
        }
        return -1L;
    }

    public synchronized void a(List<CampaignEx> list, String str) {
        if (list != null) {
            if (list.size() != 0) {
                new Thread(new a(list, str)).start();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0070 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #3 {all -> 0x005a, blocks: (B:14:0x0035, B:16:0x003b, B:19:0x0042, B:20:0x0046, B:22:0x004c, B:45:0x007b, B:40:0x006c, B:42:0x0070), top: B:49:0x0002 }] */
    public synchronized int a(String str, long j10) throws Throwable {
        e eVar;
        Throwable th2;
        Exception exc;
        try {
            try {
                com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarF == null) {
                    try {
                        gVarF = com.mbridge.msdk.setting.i.b().a();
                    } catch (Exception e10) {
                        exc = e10;
                        eVar = this;
                        if (MBridgeConstans.DEBUG) {
                            q0.b("CampaignDao", exc.getLocalizedMessage());
                        }
                        return 0;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                long jD0 = gVarF.d0() * 1000;
                b(jD0, str);
                eVar = this;
                try {
                    List<CampaignEx> listA = eVar.a(str, 0, 0, 1, false);
                    if (listA != null && !listA.isEmpty()) {
                        Iterator<CampaignEx> it = listA.iterator();
                        while (it.hasNext()) {
                            if (!it.next().isSpareOffer(j10, jD0)) {
                                return 0;
                            }
                        }
                        return 1;
                    }
                    return -1;
                } catch (Exception e11) {
                    e = e11;
                    exc = e;
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CampaignDao", exc.getLocalizedMessage());
                    }
                    return 0;
                }
            } catch (Exception e12) {
                e = e12;
                eVar = this;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
        throw th2;
    }

    public synchronized boolean a(String str, int i10, String str2, int i11, int i12, boolean z10) {
        String[] strArr;
        String str3;
        try {
            if (z10) {
                str3 = "SELECT id FROM campaign WHERE unitid = ? AND is_bid_campaign = 1";
                strArr = new String[]{str2};
            } else {
                strArr = new String[]{str, String.valueOf(i10), str2, String.valueOf(i11), String.valueOf(i12)};
                str3 = "SELECT id FROM campaign WHERE id= ? AND tab= ? AND unitid = ? AND level = ? AND adSource = ? AND is_bid_campaign = 0";
            }
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str3, strArr);
            if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                cursorRawQuery.close();
                return true;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public List<CampaignEx> a(String str, int i10, int i11, int i12) {
        String str2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(String.valueOf(i11));
        arrayList.add(String.valueOf(i12));
        if (i10 > 0) {
            arrayList.add(String.valueOf(i10));
            str2 = " LIMIT ?";
        } else {
            str2 = "";
        }
        return a("SELECT * FROM campaign WHERE unitid = ? AND level = ? AND adSource = ?".concat(str2), (String[]) arrayList.toArray(new String[0]));
    }

    public synchronized List<CampaignEx> a(String str, int i10, int i11, int i12, boolean z10) {
        ArrayList arrayList;
        String str2;
        String str3;
        try {
            arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add(String.valueOf(i11));
            arrayList.add(String.valueOf(i12));
            if (z10) {
                str2 = " WHERE unitid = ? AND level = ? AND adSource = ? AND is_bid_campaign = 1";
            } else {
                str2 = " WHERE unitid = ? AND level = ? AND adSource = ? AND is_bid_campaign = 0";
            }
            str3 = "";
            if (i10 > 0) {
                str3 = " LIMIT ?";
                arrayList.add(String.valueOf(i10));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a("SELECT * FROM campaign" + str2 + str3, (String[]) arrayList.toArray(new String[0]));
    }

    public synchronized List<CampaignEx> a(String str, int i10, int i11, int i12, String str2) {
        String str3;
        ArrayList arrayList;
        String str4;
        try {
            str3 = " WHERE unitid = ?  AND level = ?  AND adSource = ?  AND is_bid_campaign = 1 AND readyState = '0'";
            arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add(String.valueOf(i11));
            arrayList.add(String.valueOf(i12));
            if (!TextUtils.isEmpty(str2)) {
                str3 = " WHERE unitid = ?  AND level = ?  AND adSource = ?  AND is_bid_campaign = 1 AND readyState = '0' AND request_id = ? ";
                arrayList.add(str2);
            }
            str4 = "";
            if (i10 > 0) {
                str4 = " LIMIT ?";
                arrayList.add(String.valueOf(i10));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a("SELECT * FROM campaign" + (str3 + " order by ts ASC") + str4, (String[]) arrayList.toArray(new String[0]));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x076b A[Catch: all -> 0x0753, PHI: r8
  0x076b: PHI (r8v5 android.database.Cursor) = (r8v4 android.database.Cursor), (r8v6 android.database.Cursor) binds: [B:48:0x0769, B:39:0x0755] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0753, blocks: (B:34:0x074e, B:49:0x076b, B:53:0x0772, B:54:0x0775), top: B:57:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0772 A[Catch: all -> 0x0753, TRY_ENTER, TryCatch #0 {all -> 0x0753, blocks: (B:34:0x074e, B:49:0x076b, B:53:0x0772, B:54:0x0775), top: B:57:0x0002 }] */
    private synchronized List<CampaignEx> a(String str, String[] strArr) {
        Cursor cursorRawQuery;
        Cursor cursor = null;
        try {
            try {
                cursorRawQuery = getReadableDatabase().rawQuery(str, strArr);
                if (cursorRawQuery != null) {
                    try {
                        try {
                            if (cursorRawQuery.getCount() > 0) {
                                ArrayList arrayList = new ArrayList();
                                while (cursorRawQuery.moveToNext()) {
                                    CampaignEx campaignEx = new CampaignEx();
                                    String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("pv_urls"));
                                    boolean z10 = false;
                                    if (!TextUtils.isEmpty(string)) {
                                        JSONArray jSONArray = new JSONArray(string);
                                        ArrayList arrayList2 = new ArrayList();
                                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                            arrayList2.add(jSONArray.getString(i10));
                                        }
                                        campaignEx.setPv_urls(arrayList2);
                                    }
                                    campaignEx.setId(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("id")));
                                    campaignEx.setTab(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("tab")));
                                    campaignEx.setPackageName(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("package_name")));
                                    campaignEx.setAppName(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("app_name")));
                                    campaignEx.setAppDesc(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("app_desc")));
                                    campaignEx.setSize(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_APP_SIZE)));
                                    campaignEx.setImageSize(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_IMAGE_SIZE)));
                                    campaignEx.setIconUrl(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_ICON_URL)));
                                    campaignEx.setImageUrl(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_IMAGE_URL)));
                                    campaignEx.setImpressionURL(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_IMPRESSION_URL)));
                                    campaignEx.setNoticeUrl(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_NOTICE_URL)));
                                    campaignEx.setClickURL(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(DownloadModel.DOWNLOAD_URL)));
                                    campaignEx.setWtick(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK)));
                                    campaignEx.setDeepLinkUrl(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("deeplink_url")));
                                    campaignEx.setUserActivation(Boolean.parseBoolean(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_USER_ACTIVATION))));
                                    campaignEx.setOnlyImpressionURL(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("only_impression")));
                                    campaignEx.setNetAddress(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I)));
                                    campaignEx.setAc(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)));
                                    campaignEx.setAc_s(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH)));
                                    campaignEx.setTemplate(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("template")));
                                    campaignEx.setLandingType(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_LANDING_TYPE)));
                                    campaignEx.setLinkType(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_LINK_TYPE)));
                                    campaignEx.setClick_mode(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_CLICK_MODE)));
                                    campaignEx.setRating(Double.parseDouble(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("star"))));
                                    campaignEx.setNumberRating(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_NUMBER_RATING)));
                                    campaignEx.setClickInterval(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("cti")));
                                    campaignEx.setTimestamp(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("ts")));
                                    campaignEx.setCacheLevel(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(AppLovinEventTypes.USER_COMPLETED_LEVEL)));
                                    campaignEx.setType(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("adSource")));
                                    campaignEx.setAdCall(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("ad_call")));
                                    campaignEx.setFca(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("fc_a")));
                                    campaignEx.setFcb(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("fc_b")));
                                    campaignEx.setAd_url_list(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_AD_URL_LIST)));
                                    campaignEx.setVideoLength(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_LENGTHL)));
                                    campaignEx.setVideoSize(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_SIZE)));
                                    campaignEx.setVideoResolution(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_RESOLUTION)));
                                    campaignEx.setEndcard_click_result(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_ENDCARD_CLICK)));
                                    campaignEx.setVideoUrlEncode(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_URL)));
                                    campaignEx.setWatchMile(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_WATCH_MILE)));
                                    campaignEx.setTImp(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_T_IMP)));
                                    campaignEx.setBty(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("bty")));
                                    campaignEx.setAdvImp(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("advImp")));
                                    campaignEx.setLocalRequestId(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("local_request_id")));
                                    campaignEx.setNRid(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("n_request_id")));
                                    campaignEx.setNLRid(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("n_local_request_id")));
                                    campaignEx.setTyped(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("err_type_default_ad")));
                                    campaignEx.setReasond(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("err_reason_default_ad")));
                                    campaignEx.setOfferType(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_OFFER_TYPE)));
                                    campaignEx.setGuidelines(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_GUIDELINES)));
                                    campaignEx.setHtmlUrl(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL)));
                                    campaignEx.setEndScreenUrl(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_END_SCREEN_URL)));
                                    campaignEx.setRewardName(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_REWARD_NAME)));
                                    campaignEx.setRewardAmount(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_REWARD_AMOUNT)));
                                    campaignEx.setRewardPlayStatus(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("reward_play_status")));
                                    campaignEx.setRetarget_offer(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("retarget")));
                                    campaignEx.setCampaignUnitId(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("unitid")));
                                    campaignEx.setNativeVideoTracking(CampaignEx.TrackingStr2Object(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("native_ad_tracking"))));
                                    campaignEx.setNativeVideoTrackingString(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("native_ad_tracking")));
                                    campaignEx.setVideo_end_type(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.VIDEO_END_TYPE)));
                                    campaignEx.setendcard_url(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.ENDCARD_URL)));
                                    campaignEx.setPlayable_ads_without_video(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.PLAYABLE_ADS_WITHOUT_VIDEO)));
                                    campaignEx.setMof_template_url(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TEMPLATE_URL)));
                                    campaignEx.setMof_tplid(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TPLID)));
                                    campaignEx.setRewardTemplateMode(CampaignEx.c.a(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("reward_teamplate"))));
                                    campaignEx.setVideoMD5Value(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_REWARD_VIDEO_MD5)));
                                    campaignEx.setGifUrl(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_GIF_URL)));
                                    campaignEx.setNvT2(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_NV_T2)));
                                    campaignEx.setClickTimeOutInterval(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("c_coi")));
                                    campaignEx.setcUA(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_C_UA)));
                                    campaignEx.setImpUA(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_IMP_UA)));
                                    campaignEx.setOc_time(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.KEY_OC_TIME)));
                                    campaignEx.setOc_type(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.KEY_OC_TYPE)));
                                    campaignEx.setT_list(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.KEY_T_LIST)));
                                    campaignEx.setGhId(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(DomainCampaignEx.KEY_GH_ID)));
                                    campaignEx.setGhPath(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(DomainCampaignEx.KEY_GH_PATH)));
                                    campaignEx.setBindId(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(DomainCampaignEx.KEY_BIND_ID)));
                                    String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.KEY_ADCHOICE));
                                    if (!TextUtils.isEmpty(string2)) {
                                        campaignEx.setAdchoice(CampaignEx.a.c(string2));
                                    }
                                    campaignEx.setAdchoiceSizeHeight(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("adchoice_size_height")));
                                    campaignEx.setAdchoiceSizeWidth(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("adchoice_size_width")));
                                    campaignEx.setPlct(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_PLCT)));
                                    campaignEx.setPlctb(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_PLCTB)));
                                    campaignEx.setCandidateCacheTime(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_C_C_TIME)));
                                    campaignEx.setAdZip(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("ad_zip")));
                                    campaignEx.setAdHtml(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_AD_HTML)));
                                    campaignEx.setBannerUrl(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_BANNER_URL)));
                                    campaignEx.setBannerHtml(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_BANNER_HTML)));
                                    campaignEx.setCreativeId(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_CREATIVE_ID)));
                                    campaignEx.setVidCrtvId(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CREATIVE_ID)));
                                    campaignEx.setEcCrtvId(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_EC_CREATIVE_ID)));
                                    campaignEx.setEcTemplateId(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_EC_TEMP_ID)));
                                    campaignEx.setIsBidCampaign(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("is_bid_campaign")) == 1);
                                    campaignEx.setBidToken(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("bid_token")));
                                    campaignEx.setAdType(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("ad_type")));
                                    campaignEx.setFac(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_FAC)));
                                    campaignEx.setTpOffer(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_TP_OFFER)));
                                    campaignEx.setMraid(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_MRAID)));
                                    if (cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("is_mraid_campaign")) == 1) {
                                        z10 = true;
                                    }
                                    campaignEx.setIsMraid(z10);
                                    campaignEx.setOmid(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.KEY_OMID)));
                                    campaignEx.setReady_rate(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_READY_RATE)));
                                    campaignEx.setExt_data(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_EXT_DATA)));
                                    campaignEx.setNscpt(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_NSCPT)));
                                    campaignEx.setReq_ext_data(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_REQ_EXT_DATA)));
                                    campaignEx.setReadyState(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("readyState")));
                                    campaignEx.setLoadTimeoutState(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("load_timeout")));
                                    campaignEx.setPlacementId(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("placement_id")));
                                    campaignEx.setMaitve(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_MAITVE)));
                                    campaignEx.setMaitve_src(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_MAITVESRC)));
                                    campaignEx.setFlb(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_FLB)));
                                    campaignEx.setFlbSkipTime(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_FLB_SKIP_TIME)));
                                    campaignEx.setCbd(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_CBD)));
                                    campaignEx.setVst(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST)));
                                    campaignEx.setUseSkipTime(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_USE_SKIP_TIME)));
                                    campaignEx.setProgressBarShow(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_PROG_BAR));
                                    campaignEx.setAdSpaceT(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T)));
                                    campaignEx.setVcn(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("vcn")));
                                    campaignEx.setTokenRule(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("token_r")));
                                    campaignEx.setEncryptPrice(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("encrypt_p")));
                                    campaignEx.setVideoCheckType(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CHECK_TYPE)));
                                    campaignEx.setVideoCtnType(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CTN_TYPE)));
                                    campaignEx.setRsIgnoreCheckRuleByString(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_RS_IGNORE_CHECK_RULE)));
                                    campaignEx.setVideoCompleteTime(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_COMPLETE_TIME)));
                                    campaignEx.setAabEntity(AabEntity.parser(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_AAB))));
                                    campaignEx.setPrivacyUrl(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_PRIVACY_URL)));
                                    campaignEx.setPrivacyButtonTemplateVisibility(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("privacy_button_video")));
                                    campaignEx.setImpReportType(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_IMP_REPORT_TYPE)));
                                    campaignEx.setAutoShowStoreMiniCard(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("auto_minicard")));
                                    campaignEx.setShowStoreMiniCardDelayTime(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("mincard_trigger_time")));
                                    campaignEx.setFilterAdsVideoCallState(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE)));
                                    campaignEx.setSecondRequestIndex(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("r_index")));
                                    campaignEx.setSecondShowIndex(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("s_show_index")));
                                    campaignEx.setFilterCallBackState(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE)));
                                    campaignEx.setFilterAdsShowCallState(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.KEY_SECOND_FILTER_AD_SHOW_CALL_STATE)));
                                    campaignEx.setLocalCheckShow(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.KEY_LOCAL_CHECK_STATE)));
                                    campaignEx.setLocalAllowTrackClick(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.KEY_LOCAL_ALLOW_TRACK_CLICK)));
                                    arrayList.add(campaignEx);
                                }
                                cursorRawQuery.close();
                                return arrayList;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorRawQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        if (MBridgeConstans.DEBUG) {
                            q0.b("CampaignDao", e.getLocalizedMessage());
                        }
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Exception e11) {
                e = e11;
                cursorRawQuery = null;
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            return null;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    private CampaignEx a(Cursor cursor) {
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        CampaignEx campaignEx = new CampaignEx();
        try {
            String string = cursor.getString(cursor.getColumnIndex("pv_urls"));
            if (!TextUtils.isEmpty(string)) {
                JSONArray jSONArray = new JSONArray(string);
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(jSONArray.getString(i10));
                }
                campaignEx.setPv_urls(arrayList);
            }
        } catch (JSONException e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e10.getLocalizedMessage());
            }
        }
        campaignEx.setId(cursor.getString(cursor.getColumnIndex("id")));
        campaignEx.setTab(cursor.getInt(cursor.getColumnIndex("tab")));
        campaignEx.setPackageName(cursor.getString(cursor.getColumnIndex("package_name")));
        campaignEx.setAppName(cursor.getString(cursor.getColumnIndex("app_name")));
        campaignEx.setAppDesc(cursor.getString(cursor.getColumnIndex("app_desc")));
        campaignEx.setSize(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_APP_SIZE)));
        campaignEx.setImageSize(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMAGE_SIZE)));
        campaignEx.setIconUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_ICON_URL)));
        campaignEx.setImageUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMAGE_URL)));
        campaignEx.setImpressionURL(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMPRESSION_URL)));
        campaignEx.setNoticeUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_NOTICE_URL)));
        campaignEx.setClickURL(cursor.getString(cursor.getColumnIndex(DownloadModel.DOWNLOAD_URL)));
        campaignEx.setWtick(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK)));
        campaignEx.setDeepLinkUrl(cursor.getString(cursor.getColumnIndex("deeplink_url")));
        campaignEx.setUserActivation(Boolean.parseBoolean(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_USER_ACTIVATION))));
        campaignEx.setOnlyImpressionURL(cursor.getString(cursor.getColumnIndex("only_impression")));
        campaignEx.setNetAddress(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I)));
        campaignEx.setAc(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)));
        campaignEx.setAc_s(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH)));
        campaignEx.setTemplate(cursor.getInt(cursor.getColumnIndex("template")));
        campaignEx.setLandingType(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_LANDING_TYPE)));
        campaignEx.setLinkType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_LINK_TYPE)));
        campaignEx.setClick_mode(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_CLICK_MODE)));
        campaignEx.setRating(Double.parseDouble(cursor.getString(cursor.getColumnIndex("star"))));
        campaignEx.setNumberRating(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NUMBER_RATING)));
        campaignEx.setClickInterval(cursor.getInt(cursor.getColumnIndex("cti")));
        campaignEx.setTimestamp(cursor.getLong(cursor.getColumnIndex("ts")));
        campaignEx.setCacheLevel(cursor.getInt(cursor.getColumnIndex(AppLovinEventTypes.USER_COMPLETED_LEVEL)));
        campaignEx.setAdCall(cursor.getString(cursor.getColumnIndex("ad_call")));
        campaignEx.setFcb(cursor.getInt(cursor.getColumnIndex("fc_b")));
        campaignEx.setAd_url_list(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_AD_URL_LIST)));
        campaignEx.setVideoLength(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_LENGTHL)));
        campaignEx.setVideoSize(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_SIZE)));
        campaignEx.setVideoResolution(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_RESOLUTION)));
        campaignEx.setEndcard_click_result(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_ENDCARD_CLICK)));
        campaignEx.setVideoUrlEncode(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_URL)));
        campaignEx.setWatchMile(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_WATCH_MILE)));
        campaignEx.setTImp(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_T_IMP)));
        campaignEx.setBty(cursor.getInt(cursor.getColumnIndex("bty")));
        campaignEx.setAdvImp(cursor.getString(cursor.getColumnIndex("advImp")));
        campaignEx.setLocalRequestId(cursor.getString(cursor.getColumnIndex("local_request_id")));
        campaignEx.setNRid(cursor.getString(cursor.getColumnIndex("n_request_id")));
        campaignEx.setNLRid(cursor.getString(cursor.getColumnIndex("n_local_request_id")));
        campaignEx.setTyped(cursor.getInt(cursor.getColumnIndex("err_type_default_ad")));
        campaignEx.setReasond(cursor.getString(cursor.getColumnIndex("err_reason_default_ad")));
        campaignEx.setGuidelines(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_GUIDELINES)));
        campaignEx.setOfferType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_OFFER_TYPE)));
        campaignEx.setHtmlUrl(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL)));
        campaignEx.setGuidelines(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_GUIDELINES)));
        campaignEx.setHtmlUrl(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL)));
        campaignEx.setEndScreenUrl(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_END_SCREEN_URL)));
        campaignEx.setRewardName(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_REWARD_NAME)));
        campaignEx.setRewardAmount(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_REWARD_AMOUNT)));
        campaignEx.setRewardPlayStatus(cursor.getInt(cursor.getColumnIndex("reward_play_status")));
        campaignEx.setRetarget_offer(cursor.getInt(cursor.getColumnIndex("retarget")));
        campaignEx.setCampaignUnitId(cursor.getString(cursor.getColumnIndex("unitid")));
        campaignEx.setNativeVideoTracking(CampaignEx.TrackingStr2Object(cursor.getString(cursor.getColumnIndex("native_ad_tracking"))));
        campaignEx.setNativeVideoTrackingString(cursor.getString(cursor.getColumnIndex("native_ad_tracking")));
        campaignEx.setVideo_end_type(cursor.getInt(cursor.getColumnIndex(CampaignEx.VIDEO_END_TYPE)));
        campaignEx.setendcard_url(cursor.getString(cursor.getColumnIndex(CampaignEx.ENDCARD_URL)));
        campaignEx.setPlayable_ads_without_video(cursor.getInt(cursor.getColumnIndex(CampaignEx.PLAYABLE_ADS_WITHOUT_VIDEO)));
        campaignEx.setMof_template_url(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TEMPLATE_URL)));
        campaignEx.setMof_tplid(cursor.getInt(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TPLID)));
        campaignEx.setRewardTemplateMode(CampaignEx.c.a(cursor.getString(cursor.getColumnIndex("reward_teamplate"))));
        campaignEx.setVideoMD5Value(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_REWARD_VIDEO_MD5)));
        campaignEx.setGifUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_GIF_URL)));
        campaignEx.setNvT2(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NV_T2)));
        campaignEx.setClickTimeOutInterval(cursor.getInt(cursor.getColumnIndex("c_coi")));
        campaignEx.setcUA(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_C_UA)));
        campaignEx.setImpUA(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMP_UA)));
        campaignEx.setJmPd(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_JM_PD)));
        campaignEx.setIsDeleted(cursor.getInt(cursor.getColumnIndex("is_deleted")));
        campaignEx.setIsClick(cursor.getInt(cursor.getColumnIndex("is_click")));
        campaignEx.setIsAddSuccesful(cursor.getInt(cursor.getColumnIndex("is_add_sucesful")));
        campaignEx.setIsDownLoadZip(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_IS_DOWNLOAD)));
        campaignEx.setInteractiveCache(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_IA_CACHE)));
        campaignEx.setKeyIaOri(cursor.getInt(cursor.getColumnIndex("ia_ori")));
        campaignEx.setAdType(cursor.getInt(cursor.getColumnIndex("ad_type")));
        campaignEx.setFac(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_FAC)));
        campaignEx.setTpOffer(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_TP_OFFER)));
        campaignEx.setIa_ext1(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_IA_EXT1)));
        campaignEx.setIa_ext2(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_IA_EXT2)));
        campaignEx.setKeyIaRst(cursor.getInt(cursor.getColumnIndex("ia_rst")));
        campaignEx.setKeyIaUrl(cursor.getString(cursor.getColumnIndex("ia_url")));
        campaignEx.setKeyIaIcon(cursor.getString(cursor.getColumnIndex("ia_icon")));
        campaignEx.setOc_time(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_OC_TIME)));
        campaignEx.setOc_type(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_OC_TYPE)));
        campaignEx.setT_list(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_T_LIST)));
        campaignEx.setGhId(cursor.getString(cursor.getColumnIndex(DomainCampaignEx.KEY_GH_ID)));
        campaignEx.setGhPath(cursor.getString(cursor.getColumnIndex(DomainCampaignEx.KEY_GH_PATH)));
        campaignEx.setBindId(cursor.getString(cursor.getColumnIndex(DomainCampaignEx.KEY_BIND_ID)));
        String string2 = cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_ADCHOICE));
        if (!TextUtils.isEmpty(string2)) {
            campaignEx.setAdchoice(CampaignEx.a.c(string2));
        }
        campaignEx.setAdchoiceSizeHeight(cursor.getInt(cursor.getColumnIndex("adchoice_size_height")));
        campaignEx.setAdchoiceSizeWidth(cursor.getInt(cursor.getColumnIndex("adchoice_size_width")));
        campaignEx.setPlct(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_PLCT)));
        campaignEx.setPlctb(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_PLCTB)));
        campaignEx.setCandidateCacheTime(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_C_C_TIME)));
        campaignEx.setAdZip(cursor.getString(cursor.getColumnIndex("ad_zip")));
        campaignEx.setAdHtml(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_AD_HTML)));
        campaignEx.setBannerUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_BANNER_URL)));
        campaignEx.setBannerHtml(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_BANNER_HTML)));
        campaignEx.setCreativeId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_CREATIVE_ID)));
        campaignEx.setVidCrtvId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CREATIVE_ID)));
        campaignEx.setEcCrtvId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_EC_CREATIVE_ID)));
        campaignEx.setEcTemplateId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_EC_TEMP_ID)));
        campaignEx.setIsBidCampaign(cursor.getInt(cursor.getColumnIndex("is_bid_campaign")) == 1);
        campaignEx.setBidToken(cursor.getString(cursor.getColumnIndex("bid_token")));
        campaignEx.setMraid(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_MRAID)));
        campaignEx.setIsMraid(cursor.getInt(cursor.getColumnIndex("is_mraid_campaign")) == 1);
        campaignEx.setOmid(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_OMID)));
        campaignEx.setReady_rate(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_READY_RATE)));
        campaignEx.setExt_data(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_EXT_DATA)));
        campaignEx.setNscpt(cursor.getInt(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_NSCPT)));
        campaignEx.setReq_ext_data(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_REQ_EXT_DATA)));
        campaignEx.setReadyState(cursor.getInt(cursor.getColumnIndex("readyState")));
        campaignEx.setLoadTimeoutState(cursor.getInt(cursor.getColumnIndex("load_timeout")));
        campaignEx.setPlacementId(cursor.getString(cursor.getColumnIndex("placement_id")));
        campaignEx.setMaitve(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_MAITVE)));
        campaignEx.setMaitve_src(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_MAITVESRC)));
        campaignEx.setFlb(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_FLB)));
        campaignEx.setFlbSkipTime(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_FLB_SKIP_TIME)));
        campaignEx.setCbd(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_CBD)));
        campaignEx.setVst(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST)));
        campaignEx.setUseSkipTime(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_USE_SKIP_TIME)));
        campaignEx.setProgressBarShow(cursor.getColumnIndex(CampaignEx.JSON_KEY_PROG_BAR));
        campaignEx.setAdSpaceT(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T)));
        campaignEx.setVcn(cursor.getInt(cursor.getColumnIndex("vcn")));
        campaignEx.setTokenRule(cursor.getInt(cursor.getColumnIndex("token_r")));
        campaignEx.setEncryptPrice(cursor.getString(cursor.getColumnIndex("encrypt_p")));
        campaignEx.setVideoCheckType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CHECK_TYPE)));
        campaignEx.setVideoCtnType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CTN_TYPE)));
        campaignEx.setRsIgnoreCheckRuleByString(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_RS_IGNORE_CHECK_RULE)));
        campaignEx.setVideoCompleteTime(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_COMPLETE_TIME)));
        campaignEx.setAabEntity(AabEntity.parser(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_AAB))));
        campaignEx.setPrivacyUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_PRIVACY_URL)));
        campaignEx.setPrivacyButtonTemplateVisibility(cursor.getInt(cursor.getColumnIndex("privacy_button_video")));
        campaignEx.setImpReportType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMP_REPORT_TYPE)));
        campaignEx.setAutoShowStoreMiniCard(cursor.getInt(cursor.getColumnIndex("auto_minicard")));
        campaignEx.setShowStoreMiniCardDelayTime(cursor.getInt(cursor.getColumnIndex("mincard_trigger_time")));
        campaignEx.setFilterAdsVideoCallState(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE)));
        campaignEx.setSecondRequestIndex(cursor.getInt(cursor.getColumnIndex("r_index")));
        campaignEx.setSecondShowIndex(cursor.getInt(cursor.getColumnIndex("s_show_index")));
        campaignEx.setFilterCallBackState(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE)));
        campaignEx.setFilterAdsShowCallState(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_SECOND_FILTER_AD_SHOW_CALL_STATE)));
        campaignEx.setLocalCheckShow(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_LOCAL_CHECK_STATE)));
        campaignEx.setLocalAllowTrackClick(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_LOCAL_ALLOW_TRACK_CLICK)));
        return campaignEx;
    }

    public synchronized void a(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                String[] strArr = {str, str2};
                ContentValues contentValues = new ContentValues();
                contentValues.put("readyState", (Integer) 2);
                getWritableDatabase().update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, "unitid = ? AND bid_token = ? AND bid_token IS NOT NULL", strArr);
            }
        } catch (Exception e10) {
            q0.b("CampaignDao", e10.getLocalizedMessage());
        }
    }
}
