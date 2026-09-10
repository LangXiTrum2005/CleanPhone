package com.bytedance.sdk.openadsdk.multipro.qdl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.mzz;
import com.bytedance.sdk.openadsdk.core.yt;

/* JADX INFO: loaded from: classes3.dex */
public class ud implements com.bytedance.sdk.openadsdk.multipro.qdl {
    private static final Object ud = new Object();
    private Context qdl;

    private boolean ud(Uri uri) {
        return uri == null || TextUtils.isEmpty(uri.getPath());
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public String qdl() {
        return "t_db";
    }

    private Context ud() {
        Context context = this.qdl;
        return context == null ? yt.qdl() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public Cursor qdl(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        synchronized (ud) {
            try {
                if (ud(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str3 = strArrSplit[2];
                    String str4 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str3)) {
                        return null;
                    }
                    return mzz.qdl(ud()).qdl().qdl(str4, strArr, str, strArr2, null, null, str2);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public String qdl(Uri uri) {
        synchronized (ud) {
            try {
                if (ud(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 5) {
                    String str = strArrSplit[2];
                    String str2 = strArrSplit[4];
                    if ("ttopensdk.db".equals(str)) {
                        if ("execSQL".equals(str2)) {
                            String queryParameter = uri.getQueryParameter("sql");
                            if (!TextUtils.isEmpty(queryParameter)) {
                                mzz.qdl(ud()).qdl().qdl(Uri.decode(queryParameter));
                            }
                        } else if ("transactionBegin".equals(str2)) {
                            mzz.qdl(ud()).qdl().ud();
                        } else if ("transactionSetSuccess".equals(str2)) {
                            mzz.qdl(ud()).qdl().lnr();
                        } else if ("transactionEnd".equals(str2)) {
                            mzz.qdl(ud()).qdl().mml();
                        }
                    }
                    return null;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public Uri qdl(Uri uri, ContentValues contentValues) {
        synchronized (ud) {
            try {
                if (ud(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str = strArrSplit[2];
                    String str2 = strArrSplit[3];
                    if ("ttopensdk.db".equals(str)) {
                        mzz.qdl(ud()).qdl().qdl(str2, (String) null, contentValues);
                    }
                    return null;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public int qdl(Uri uri, String str, String[] strArr) {
        synchronized (ud) {
            try {
                if (ud(uri)) {
                    return 0;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str2 = strArrSplit[2];
                    String str3 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str2)) {
                        return 0;
                    }
                    return mzz.qdl(ud()).qdl().qdl(str3, str, strArr);
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public int qdl(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        synchronized (ud) {
            try {
                if (ud(uri)) {
                    return 0;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str2 = strArrSplit[2];
                    String str3 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str2)) {
                        return 0;
                    }
                    return mzz.qdl(ud()).qdl().qdl(str3, contentValues, str, strArr);
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
