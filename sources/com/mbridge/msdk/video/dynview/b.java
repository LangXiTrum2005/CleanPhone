package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.dynview.listener.h;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f37307b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, SoftReference<View>> f37308a = new HashMap();

    private b() {
    }

    public static b a() {
        b bVar;
        if (f37307b != null) {
            return f37307b;
        }
        synchronized (b.class) {
            try {
                if (f37307b == null) {
                    f37307b = new b();
                }
                bVar = f37307b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public void a(Context context, List<CampaignEx> list, h hVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.ui.a(context, list, hVar, map);
    }

    public void a(c cVar, h hVar) {
        new com.mbridge.msdk.video.dynview.ui.a(cVar, hVar, new HashMap());
    }

    public void a(c cVar, h hVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.ui.a(cVar, hVar, map);
    }
}
