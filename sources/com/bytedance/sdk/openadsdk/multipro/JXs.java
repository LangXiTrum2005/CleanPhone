package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class JXs implements Lxb {
    private static WeakReference<Context> LD;
    private static volatile JXs Lxb;
    private static final List<Lxb> lk;

    static {
        List<Lxb> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        lk = listSynchronizedList;
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.ZU.lk());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.Lxb.LD());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.lk.Lxb());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.ZU.Lxb.JXs(new com.bytedance.sdk.component.lc.Lxb.LD.LD.LD()));
        Iterator<Lxb> it = listSynchronizedList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private JXs() {
    }

    private Lxb LD(Uri uri) {
        if (uri == null || !lk(uri)) {
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
        for (Lxb lxb : lk) {
            if (str.equals(lxb.Lxb())) {
                return lxb;
            }
        }
        return null;
    }

    public static JXs Lxb(Context context) {
        if (context != null) {
            LD = new WeakReference<>(context.getApplicationContext());
        }
        if (Lxb == null) {
            synchronized (JXs.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new JXs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    private boolean lk(Uri uri) {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    @NonNull
    public String Lxb() {
        return "";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public Cursor Lxb(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        try {
            Lxb lxbLD = LD(uri);
            if (lxbLD != null) {
                return lxbLD.Lxb(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public String Lxb(@NonNull Uri uri) {
        try {
            Lxb lxbLD = LD(uri);
            if (lxbLD != null) {
                return lxbLD.Lxb(uri);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public Uri Lxb(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        try {
            Lxb lxbLD = LD(uri);
            if (lxbLD != null) {
                return lxbLD.Lxb(uri, contentValues);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public int Lxb(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        try {
            Lxb lxbLD = LD(uri);
            if (lxbLD != null) {
                return lxbLD.Lxb(uri, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public int Lxb(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        try {
            Lxb lxbLD = LD(uri);
            if (lxbLD != null) {
                return lxbLD.Lxb(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
