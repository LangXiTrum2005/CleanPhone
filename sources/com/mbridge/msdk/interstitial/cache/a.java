package com.mbridge.msdk.interstitial.cache;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f34298b = "com.mbridge.msdk.interstitial.cache.a";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f34299c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f34300a;

    private a() {
        try {
            Context contextD = c.n().d();
            if (contextD != null) {
                this.f34300a = e.a(g.a(contextD));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static synchronized a a() {
        try {
            if (f34299c == null) {
                f34299c = new a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f34299c;
    }

    public void b(CampaignEx campaignEx, String str) throws Throwable {
        try {
            if (this.f34300a == null || campaignEx == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f34300a.a(campaignEx, str, 0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public List<CampaignEx> a(String str, int i10) {
        List<CampaignEx> listA;
        ArrayList arrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (listA = this.f34300a.a(str, i10, 0, 1)) == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                Iterator<CampaignEx> it = listA.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                return arrayList2;
            } catch (Exception e10) {
                e = e10;
                arrayList = arrayList2;
            }
        } catch (Exception e11) {
            e = e11;
        }
        e.printStackTrace();
        return arrayList;
    }

    public void a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                this.f34300a.e(campaignEx.getId(), str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void a(List<CampaignEx> list, String str) {
        if (list == null || list.size() <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        Iterator<CampaignEx> it = list.iterator();
        while (it.hasNext()) {
            a(it.next(), str);
        }
    }

    public void a(String str, List<CampaignEx> list) {
        try {
            if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
                return;
            }
            Iterator<CampaignEx> it = list.iterator();
            while (it.hasNext()) {
                b(it.next(), str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public synchronized void a(long j10, String str) {
        try {
            if (this.f34300a != null && j10 != 0 && !TextUtils.isEmpty(str)) {
                this.f34300a.a(j10, str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            q0.b(f34298b, e10.getMessage());
        }
    }
}
