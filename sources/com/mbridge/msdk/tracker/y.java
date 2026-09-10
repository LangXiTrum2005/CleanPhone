package com.mbridge.msdk.tracker;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class y {
    public static long a(int i10, long j10, long j11) {
        if (i10 <= 0 || j10 == 0 || i10 <= 10) {
            return j11;
        }
        if (i10 <= 20) {
            return ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
        if (i10 <= 30) {
            return UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        }
        if (i10 <= 40) {
            return 180000L;
        }
        return i10 <= 50 ? 240000L : 300000L;
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    public static boolean a(Object obj) {
        return obj != null;
    }

    public static boolean b(List<?> list) {
        return list == null || list.isEmpty();
    }

    public static boolean a(List<i> list) {
        if (b((List<?>) list)) {
            return false;
        }
        for (i iVar : list) {
            if (!b(iVar)) {
                e eVarD = iVar.d();
                if (!b(eVarD) && eVarD.h() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00fe  */
    public static List<i> b(Cursor cursor) {
        int i10;
        int i11;
        int i12;
        Cursor cursor2 = cursor;
        ArrayList arrayList = new ArrayList();
        try {
            int columnIndex = cursor2.getColumnIndex("name");
            int columnIndex2 = cursor2.getColumnIndex("type");
            int columnIndex3 = cursor2.getColumnIndex("time_stamp");
            int columnIndex4 = cursor2.getColumnIndex("properties");
            int columnIndex5 = cursor2.getColumnIndex(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            int columnIndex6 = cursor2.getColumnIndex("uuid");
            int columnIndex7 = cursor2.getColumnIndex(IronSourceConstants.EVENTS_DURATION);
            int columnIndex8 = cursor2.getColumnIndex("state");
            int columnIndex9 = cursor2.getColumnIndex("report_count");
            int columnIndex10 = cursor2.getColumnIndex("ignore_max_timeout");
            int columnIndex11 = cursor2.getColumnIndex("ignore_max_retry_times");
            int columnIndex12 = cursor2.getColumnIndex("invalid_time");
            int columnIndex13 = cursor2.getColumnIndex("report_error_message");
            while (cursor2.moveToNext()) {
                try {
                    i10 = columnIndex;
                    try {
                        e eVar = new e(cursor2.getString(columnIndex));
                        eVar.b(cursor2.getInt(columnIndex2));
                        int i13 = columnIndex12;
                        int i14 = columnIndex13;
                        try {
                            eVar.c(cursor2.getLong(columnIndex3));
                            eVar.a(new JSONObject(cursor2.getString(columnIndex4)));
                            eVar.a(cursor2.getInt(columnIndex5));
                            eVar.a(cursor2.getString(columnIndex6));
                            eVar.a(cursor2.getLong(columnIndex7));
                            i iVar = new i(eVar);
                            iVar.b(cursor2.getInt(columnIndex8));
                            iVar.a(cursor2.getInt(columnIndex9));
                            iVar.b(cursor2.getInt(columnIndex10) == 0);
                            iVar.a(cursor2.getInt(columnIndex11) == 0);
                            i11 = i13;
                            try {
                                iVar.a(cursor2.getLong(i11));
                                i12 = i14;
                                try {
                                    String string = cursor2.getString(i12);
                                    if (TextUtils.isEmpty(string)) {
                                        string = "";
                                    }
                                    iVar.a(string);
                                    arrayList.add(iVar);
                                } catch (JSONException e10) {
                                    e = e10;
                                    if (a.f36843a) {
                                        Log.e("TrackManager", "create: ", e);
                                    }
                                    cursor2 = cursor;
                                }
                            } catch (JSONException e11) {
                                e = e11;
                                i12 = i14;
                                if (a.f36843a) {
                                    Log.e("TrackManager", "create: ", e);
                                }
                                cursor2 = cursor;
                                columnIndex13 = i12;
                                columnIndex12 = i11;
                                columnIndex = i10;
                            }
                        } catch (JSONException e12) {
                            e = e12;
                            i11 = i13;
                        }
                    } catch (JSONException e13) {
                        e = e13;
                        i11 = columnIndex12;
                        i12 = columnIndex13;
                        if (a.f36843a) {
                            Log.e("TrackManager", "create: ", e);
                        }
                        cursor2 = cursor;
                        columnIndex13 = i12;
                        columnIndex12 = i11;
                        columnIndex = i10;
                    }
                } catch (JSONException e14) {
                    e = e14;
                    i10 = columnIndex;
                }
                columnIndex13 = i12;
                columnIndex12 = i11;
                columnIndex = i10;
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static boolean a(e eVar) {
        return a((Object) eVar) && eVar.h() == 1;
    }

    public static void a(Cursor cursor) {
        try {
            if (!a((Object) cursor) || cursor.isClosed()) {
                return;
            }
            cursor.close();
        } catch (Exception unused) {
        }
    }
}
