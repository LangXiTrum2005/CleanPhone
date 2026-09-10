package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class mzz implements qdl {
    private static final List<qdl> lnr;
    private static volatile mzz qdl;
    private static WeakReference<Context> ud;

    static {
        List<qdl> listU = a.u();
        lnr = listU;
        listU.add(new com.bytedance.sdk.openadsdk.multipro.mml.lnr());
        listU.add(new com.bytedance.sdk.openadsdk.multipro.qdl.ud());
        listU.add(new com.bytedance.sdk.openadsdk.multipro.lnr.qdl());
        listU.add(new com.bytedance.sdk.openadsdk.mml.qdl.lnr(new com.bytedance.sdk.component.mo.qdl.ud.ud.ud()));
        Iterator<qdl> it = listU.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private mzz() {
    }

    private boolean lnr(Uri uri) {
        return true;
    }

    public static mzz qdl(Context context) {
        if (context != null) {
            ud = new WeakReference<>(context.getApplicationContext());
        }
        if (qdl == null) {
            synchronized (mzz.class) {
                try {
                    if (qdl == null) {
                        qdl = new mzz();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    private qdl ud(Uri uri) {
        if (uri == null || !lnr(uri)) {
            return null;
        }
        String[] strArrSplit = uri.getPath().split("/");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (qdl qdlVar : lnr) {
            if (str.equals(qdlVar.qdl())) {
                return qdlVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public String qdl() {
        return "";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public Cursor qdl(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            qdl qdlVarUd = ud(uri);
            if (qdlVarUd != null) {
                return qdlVarUd.qdl(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public String qdl(Uri uri) {
        try {
            qdl qdlVarUd = ud(uri);
            if (qdlVarUd != null) {
                return qdlVarUd.qdl(uri);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public Uri qdl(Uri uri, ContentValues contentValues) {
        try {
            qdl qdlVarUd = ud(uri);
            if (qdlVarUd != null) {
                return qdlVarUd.qdl(uri, contentValues);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public int qdl(Uri uri, String str, String[] strArr) {
        try {
            qdl qdlVarUd = ud(uri);
            if (qdlVarUd != null) {
                return qdlVarUd.qdl(uri, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public int qdl(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            qdl qdlVarUd = ud(uri);
            if (qdlVarUd != null) {
                return qdlVarUd.qdl(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
