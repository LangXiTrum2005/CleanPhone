package com.bytedance.sdk.component.mo.qdl.ud.ud;

import android.content.ContentResolver;
import android.net.Uri;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.bytedance.sdk.component.mo.qdl.jpc;
import com.bytedance.sdk.component.mo.qdl.qdl.qdl.mo;
import com.bytedance.sdk.component.mo.qdl.qdl.qdl.wd;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    private static ContentResolver lnr() {
        try {
            if (jpc.wd().mo() != null) {
                return jpc.wd().mo().getContentResolver();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String mml() {
        return a.r(new StringBuilder(), wd.ud, "/ad_log_event/");
    }

    public static void qdl() {
        if (jpc.wd().mo() == null) {
            return;
        }
        try {
            ContentResolver contentResolverLnr = lnr();
            if (contentResolverLnr != null) {
                contentResolverLnr.getType(Uri.parse(mml() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void ud() {
        if (jpc.wd().mo() == null) {
            return;
        }
        try {
            ContentResolver contentResolverLnr = lnr();
            if (contentResolverLnr != null) {
                contentResolverLnr.getType(Uri.parse(mml() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void qdl(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        if (qdlVar == null) {
            return;
        }
        try {
            ContentResolver contentResolverLnr = lnr();
            if (contentResolverLnr != null) {
                contentResolverLnr.getType(Uri.parse(mml() + "adLogDispatch?event=" + mo.qdl(qdlVar.mo())));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void qdl(String str, List<String> list, boolean z2) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(mo.qdl(it.next()));
                sb.append(",");
            }
            String str2 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(mo.qdl(sb.toString())) + "&replace=" + String.valueOf(z2);
            ContentResolver contentResolverLnr = lnr();
            if (contentResolverLnr != null) {
                contentResolverLnr.getType(Uri.parse(mml() + "trackAdUrl" + str2));
            }
        } catch (Throwable unused) {
        }
    }

    public static void qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentResolver contentResolverLnr = lnr();
            if (contentResolverLnr != null) {
                contentResolverLnr.getType(Uri.parse(mml() + "trackAdFailed?did=" + String.valueOf(str)));
            }
        } catch (Throwable unused) {
        }
    }
}
