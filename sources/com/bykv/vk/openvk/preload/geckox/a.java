package com.bykv.vk.openvk.preload.geckox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.falconx.a.a f12886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue<String> f12887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f12888c;
    private File d;

    private a(b bVar) {
        new ArrayList();
        this.f12886a = new com.bykv.vk.openvk.preload.falconx.a.a();
        this.f12887b = new LinkedBlockingQueue();
        this.f12888c = bVar;
        File fileN = bVar.n();
        this.d = fileN;
        fileN.mkdirs();
        com.bykv.vk.openvk.preload.geckox.statistic.b.a(this, this.f12888c);
    }

    public static /* synthetic */ void d(a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aVar.f12888c.e());
        try {
            String strA = new com.bykv.vk.openvk.preload.geckox.a.a(arrayList).a();
            if (aVar.f12888c.p() != null && aVar.f12888c.p().a()) {
                aVar.f12888c.p();
            } else if (aVar.f12887b.size() < 10) {
                aVar.f12887b.add(strA);
            }
        } catch (Throwable unused) {
        }
    }

    public static a a(b bVar) {
        List<String> listE = bVar.e();
        if (listE == null || listE.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        bVar.a();
        return new a(bVar);
    }

    private boolean b(Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        if (map != null && !map.isEmpty()) {
            List<String> listE = this.f12888c.e();
            for (Map.Entry<String, List<CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
                Iterator<String> it = listE.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    if (TextUtils.equals(it.next(), entry.getKey())) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean a() {
        List<String> listD = this.f12888c.d();
        List<String> listE = this.f12888c.e();
        if (listD == null || listD.isEmpty() || listE == null || listE.isEmpty()) {
            return false;
        }
        for (String str : listE) {
            Iterator<String> it = listD.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next())) {
                    z2 = true;
                }
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    public final void a(Class<? extends d<?, ?>> cls, com.bykv.vk.openvk.preload.a.b.a aVar) {
        this.f12886a.a(cls, aVar);
    }

    public final void a(final Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        final String str = "default";
        if (!TextUtils.isEmpty("default")) {
            if (a()) {
                if (b(map)) {
                    final com.bykv.vk.openvk.preload.geckox.d.a aVar = null;
                    final Map map2 = null;
                    b.h().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.bykv.vk.openvk.preload.geckox.a.a.b bVarA;
                            GeckoLogger.d("gecko-debug-tag", "start check update...", str);
                            if (a.this.f12888c.b() != null) {
                                bVarA = a.this.f12888c.b().a();
                                bVarA.a(a.this.f12888c.b(), a.this.f12888c.n(), a.this.f12888c.e());
                            } else {
                                bVarA = null;
                            }
                            com.bykv.vk.openvk.preload.geckox.a.a.b bVar = bVarA;
                            try {
                                try {
                                    a.this.f12888c.a(new JSONObject());
                                    GeckoLogger.d("gecko-debug-tag", "update finished", com.bykv.vk.openvk.preload.geckox.g.a.a(aVar, a.this.d, a.this.f12888c, a.this.f12886a, map2, map, str).a(str));
                                    if (bVar != null) {
                                        bVar.a();
                                    }
                                    JSONObject jSONObjectF = a.this.f12888c.f();
                                    if (jSONObjectF == null) {
                                        jSONObjectF = new JSONObject();
                                    }
                                    try {
                                        jSONObjectF.put("download_duration", SystemClock.elapsedRealtime() - a.this.f12888c.s());
                                    } catch (Throwable unused) {
                                    }
                                    a.this.f12888c.q().upload("download_gecko_end", jSONObjectF);
                                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                                } catch (Throwable th) {
                                    if (bVar != null) {
                                        bVar.a();
                                    }
                                    JSONObject jSONObjectF2 = a.this.f12888c.f();
                                    if (jSONObjectF2 == null) {
                                        jSONObjectF2 = new JSONObject();
                                    }
                                    try {
                                        jSONObjectF2.put("download_duration", SystemClock.elapsedRealtime() - a.this.f12888c.s());
                                    } catch (Throwable unused2) {
                                    }
                                    a.this.f12888c.q().upload("download_gecko_end", jSONObjectF2);
                                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                                    throw th;
                                }
                            } catch (Exception e2) {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("success", false);
                                    jSONObject.put("msg", e2.toString());
                                    jSONObject.put("code", 2);
                                    a.this.f12888c.a(jSONObject);
                                } catch (Throwable unused3) {
                                }
                                GeckoLogger.w("gecko-debug-tag", "Gecko update failed:", e2);
                                if (bVar != null) {
                                    bVar.a();
                                }
                                JSONObject jSONObjectF3 = a.this.f12888c.f();
                                if (jSONObjectF3 == null) {
                                    jSONObjectF3 = new JSONObject();
                                }
                                try {
                                    jSONObjectF3.put("download_duration", SystemClock.elapsedRealtime() - a.this.f12888c.s());
                                } catch (Throwable unused4) {
                                }
                                a.this.f12888c.q().upload("download_gecko_end", jSONObjectF3);
                                GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                            }
                            a.d(a.this);
                        }
                    });
                    return;
                }
                throw new IllegalArgumentException("target keys not in deployments keys");
            }
            throw new IllegalArgumentException("deployments keys not in local keys");
        }
        throw new IllegalArgumentException("groupType == null");
    }
}
