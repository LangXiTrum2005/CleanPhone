package com.bytedance.sdk.component.lc.Lxb.LD.LD;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.ebl;
import com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lc;
import com.bytedance.sdk.component.lc.Lxb.OY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    public static void LD() {
        if (OY.ebl().lc() == null) {
            return;
        }
        try {
            ContentResolver contentResolverLk = lk();
            if (contentResolverLk != null) {
                contentResolverLk.getType(Uri.parse(ZU() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void Lxb() {
        if (OY.ebl().lc() == null) {
            return;
        }
        try {
            ContentResolver contentResolverLk = lk();
            if (contentResolverLk != null) {
                contentResolverLk.getType(Uri.parse(ZU() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    private static String ZU() {
        return DM.m(new StringBuilder(), ebl.LD, "/ad_log_event/");
    }

    private static ContentResolver lk() {
        try {
            if (OY.ebl().lc() != null) {
                return OY.ebl().lc().getContentResolver();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        if (lxb == null) {
            return;
        }
        try {
            ContentResolver contentResolverLk = lk();
            if (contentResolverLk != null) {
                contentResolverLk.getType(Uri.parse(ZU() + "adLogDispatch?event=" + lc.Lxb(lxb.lc())));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void Lxb(String str, List<String> list, boolean z) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(lc.Lxb(it.next()));
                sb.append(",");
            }
            String str2 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(lc.Lxb(sb.toString())) + "&replace=" + String.valueOf(z);
            ContentResolver contentResolverLk = lk();
            if (contentResolverLk != null) {
                contentResolverLk.getType(Uri.parse(ZU() + "trackAdUrl" + str2));
            }
        } catch (Throwable unused) {
        }
    }

    public static void Lxb(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentResolver contentResolverLk = lk();
            if (contentResolverLk != null) {
                contentResolverLk.getType(Uri.parse(ZU() + "trackAdFailed?did=" + String.valueOf(str)));
            }
        } catch (Throwable unused) {
        }
    }
}
