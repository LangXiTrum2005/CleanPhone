package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class m extends a<Campaign> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static m f33495a;

    private m(f fVar) {
        super(fVar);
    }

    public static synchronized m a(f fVar) {
        try {
            if (f33495a == null) {
                f33495a = new m(fVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f33495a;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a9 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #7 {all -> 0x007d, blocks: (B:10:0x001a, B:12:0x0020, B:13:0x0025, B:15:0x002b, B:39:0x00a5, B:41:0x00a9), top: B:70:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public synchronized com.mbridge.msdk.foundation.entity.m b(String str) {
        Exception e10;
        Cursor cursorRawQuery;
        Exception e11;
        com.mbridge.msdk.foundation.entity.m mVar;
        Cursor cursor = null;
        mVar = null;
        com.mbridge.msdk.foundation.entity.m mVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM video WHERE video_url = ? ", new String[]{str});
            if (cursorRawQuery != null) {
                try {
                    try {
                        if (cursorRawQuery.getCount() > 0) {
                            mVar = new com.mbridge.msdk.foundation.entity.m();
                            while (cursorRawQuery.moveToNext()) {
                                try {
                                    mVar.b(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_URL)));
                                    mVar.a(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("video_state")));
                                    mVar.b(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("pregeress_size")));
                                    mVar.b(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("total_size")));
                                    mVar.a(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("video_path")));
                                    mVar.a(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("video_download_start")) * 1000);
                                } catch (Exception e12) {
                                    e11 = e12;
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("VideoDao", e11.getLocalizedMessage());
                                    }
                                    if (cursorRawQuery != null) {
                                        try {
                                            cursorRawQuery.close();
                                        } catch (Exception e13) {
                                            if (MBridgeConstans.DEBUG) {
                                                q0.b("VideoDao", e13.getLocalizedMessage());
                                            }
                                        }
                                    }
                                    mVar2 = mVar;
                                }
                            }
                            mVar2 = mVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception e14) {
                                if (MBridgeConstans.DEBUG) {
                                    q0.b("VideoDao", e14.getLocalizedMessage());
                                }
                            }
                        }
                        throw th;
                    }
                } catch (Exception e15) {
                    e10 = e15;
                    e11 = e10;
                    mVar = null;
                    if (MBridgeConstans.DEBUG) {
                        q0.b("VideoDao", e11.getLocalizedMessage());
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    mVar2 = mVar;
                    return mVar2;
                }
            }
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e16) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("VideoDao", e16.getLocalizedMessage());
                    }
                }
            }
        } catch (Exception e17) {
            e10 = e17;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return mVar2;
    }

    public synchronized void a(String str) {
        try {
            String[] strArr = {str};
            if (getWritableDatabase() == null) {
            } else {
                getWritableDatabase().delete("video", "video_url = ? ", strArr);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("VideoDao", e10.getLocalizedMessage());
            }
        }
    }

    public synchronized void a(String str, long j10) {
        if (j10 == 0) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_download_start", Long.valueOf(j10 / 1000));
            if (a(str, "")) {
                getWritableDatabase().update("video", contentValues, "video_url = ? ", new String[]{str});
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("VideoDao", e10.getLocalizedMessage());
            }
        }
    }

    public synchronized long a(CampaignEx campaignEx, long j10, String str, int i10) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            try {
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("unitid", campaignEx.getCampaignUnitId());
                contentValues.put("id", campaignEx.getId());
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
                contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
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
                contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_URL, campaignEx.getVideoUrlEncode());
                contentValues.put("total_size", Long.valueOf(j10));
                contentValues.put("video_state", Integer.valueOf(i10));
                contentValues.put("video_download_start", Long.valueOf(System.currentTimeMillis() / 1000));
                contentValues.put("ad_bid_token", campaignEx.getBidToken());
                if (!TextUtils.isEmpty(str)) {
                    contentValues.put("video_path", str);
                }
                if (a(campaignEx.getVideoUrlEncode(), campaignEx.getId())) {
                    return 0L;
                }
                return getWritableDatabase().insert("video", null, contentValues);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("VideoDao", e10.getLocalizedMessage());
                }
                return -1L;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0093 A[EXC_TOP_SPLITTER, PHI: r0
  0x0093: PHI (r0v3 android.database.Cursor) = (r0v2 android.database.Cursor), (r0v4 android.database.Cursor) binds: [B:26:0x0091, B:21:0x0081] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public synchronized com.mbridge.msdk.foundation.entity.m b(String str, String str2) {
        Cursor cursorRawQuery = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.mbridge.msdk.foundation.entity.m mVar = new com.mbridge.msdk.foundation.entity.m();
        try {
            try {
                cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM video WHERE video_url = ? ", new String[]{str});
                if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                    while (cursorRawQuery.moveToNext()) {
                        mVar.b(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_URL)));
                        mVar.a(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("video_state")));
                        mVar.b(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("pregeress_size")));
                        mVar.b(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("total_size")));
                        mVar.a(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("video_path")));
                        mVar.a(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("video_download_start")) * 1000);
                    }
                }
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th2;
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("VideoDao", e10.getLocalizedMessage());
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
        return mVar;
    }

    public synchronized boolean a(String str, String str2) {
        String[] strArr;
        String str3;
        try {
            if (TextUtils.isEmpty(str2)) {
                str3 = "SELECT id FROM video WHERE video_url = ? ";
                strArr = new String[]{str};
            } else {
                strArr = new String[]{str, str2};
                str3 = "SELECT id FROM video WHERE video_url = ? AND id = ? ";
            }
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str3, strArr);
            if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("VideoDao", e10.getLocalizedMessage());
                    }
                }
                return true;
            }
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("VideoDao", e11.getLocalizedMessage());
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    public synchronized long a(String str, long j10, int i10, long j11) {
        int iUpdate = -1;
        try {
            if (getWritableDatabase() == null) {
                return -1;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("pregeress_size", Long.valueOf(j10));
            contentValues.put("video_state", Integer.valueOf(i10));
            contentValues.put("total_size", Long.valueOf(j11));
            if (a(str, "")) {
                String[] strArr = {str};
                synchronized (new Object()) {
                    iUpdate = getWritableDatabase().update("video", contentValues, "video_url = ? ", strArr);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("VideoDao", e10.getLocalizedMessage());
            }
        }
        return iUpdate;
    }
}
