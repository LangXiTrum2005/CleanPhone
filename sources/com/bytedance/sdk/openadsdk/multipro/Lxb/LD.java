package com.bytedance.sdk.openadsdk.multipro.Lxb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.JXs;
import com.bytedance.sdk.openadsdk.core.kqm;

/* JADX INFO: loaded from: classes2.dex */
public class LD implements com.bytedance.sdk.openadsdk.multipro.Lxb {
    private static final Object LD = new Object();
    private Context Lxb;

    private boolean LD(Uri uri) {
        return uri == null || TextUtils.isEmpty(uri.getPath());
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    @NonNull
    public String Lxb() {
        return "t_db";
    }

    private Context LD() {
        Context context = this.Lxb;
        return context == null ? kqm.Lxb() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public Cursor Lxb(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        synchronized (LD) {
            try {
                if (LD(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str3 = strArrSplit[2];
                    String str4 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str3)) {
                        return null;
                    }
                    return JXs.Lxb(LD()).Lxb().Lxb(str4, strArr, str, strArr2, null, null, str2);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public String Lxb(@NonNull Uri uri) {
        synchronized (LD) {
            try {
                if (LD(uri)) {
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
                                JXs.Lxb(LD()).Lxb().Lxb(Uri.decode(queryParameter));
                            }
                        } else if ("transactionBegin".equals(str2)) {
                            JXs.Lxb(LD()).Lxb().LD();
                        } else if ("transactionSetSuccess".equals(str2)) {
                            JXs.Lxb(LD()).Lxb().lk();
                        } else if ("transactionEnd".equals(str2)) {
                            JXs.Lxb(LD()).Lxb().ZU();
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

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public Uri Lxb(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        synchronized (LD) {
            try {
                if (LD(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str = strArrSplit[2];
                    String str2 = strArrSplit[3];
                    if ("ttopensdk.db".equals(str)) {
                        JXs.Lxb(LD()).Lxb().Lxb(str2, (String) null, contentValues);
                    }
                    return null;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public int Lxb(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        synchronized (LD) {
            try {
                if (LD(uri)) {
                    return 0;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str2 = strArrSplit[2];
                    String str3 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str2)) {
                        return 0;
                    }
                    return JXs.Lxb(LD()).Lxb().Lxb(str3, str, strArr);
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public int Lxb(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        synchronized (LD) {
            try {
                if (LD(uri)) {
                    return 0;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str2 = strArrSplit[2];
                    String str3 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str2)) {
                        return 0;
                    }
                    return JXs.Lxb(LD()).Lxb().Lxb(str3, contentValues, str, strArr);
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
