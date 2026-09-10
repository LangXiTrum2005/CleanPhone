package com.umeng.pagesdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.Choreographer;
import androidx.work.PeriodicWorkRequest;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f2738a;
    long b;
    int c;
    int d;
    int e;
    boolean g;
    long h;
    long i;
    String j;
    private Context k;
    Map<String, Double> f = new HashMap();
    private Choreographer.FrameCallback l = new Choreographer.FrameCallback() { // from class: com.umeng.pagesdk.c.1
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            c cVar = c.this;
            if (cVar.g) {
                if (cVar.h == 0) {
                    cVar.h = System.currentTimeMillis();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                c cVar2 = c.this;
                if (jCurrentTimeMillis - cVar2.h > cVar2.i) {
                    cVar2.b();
                    return;
                }
                if (cVar2.b == 0) {
                    cVar2.b = j;
                }
                float f = (j - cVar2.b) / 1000000.0f;
                if (f > cVar2.f2738a) {
                    double d = (((long) cVar2.c) * 1000) / ((double) f);
                    cVar2.c = 0;
                    cVar2.b = 0L;
                    if (PageManger.isDebug) {
                        cVar2.f.size();
                        String str = c.this.j;
                    }
                    Map<String, Double> map = c.this.f;
                    StringBuilder sb = new StringBuilder();
                    sb.append(System.currentTimeMillis());
                    map.put(sb.toString(), Double.valueOf(d));
                    c cVar3 = c.this;
                    int i = cVar3.d + 1;
                    cVar3.d = i;
                    if (i >= cVar3.e) {
                        cVar3.c();
                        c cVar4 = c.this;
                        cVar4.d = 0;
                        Map<String, Double> map2 = cVar4.f;
                        if (map2 != null) {
                            map2.clear();
                        }
                    }
                } else {
                    cVar2.c++;
                }
                Choreographer.getInstance().postFrameCallback(this);
            }
        }
    };

    public c(Context context) {
        SharedPreferences sharedPreferences;
        this.f2738a = 1000.0f;
        this.e = 6;
        this.i = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        this.k = context;
        if (context == null || (sharedPreferences = context.getSharedPreferences("efs_page", 0)) == null) {
            return;
        }
        this.f2738a = sharedPreferences.getFloat(PageConfigManger.APM_FPSPERF_COLLECT_INTERVAL, 1000.0f);
        this.e = sharedPreferences.getInt(PageConfigManger.APM_FPSPERF_COLLECT_INTERVAL_TOGETHER, 6);
        this.i = sharedPreferences.getLong(PageConfigManger.APM_FPSPERF_COLLECT_MAX_PERIOD_SEC, PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        a aVarA;
        Iterator<Map.Entry<String, Double>> it = this.f.entrySet().iterator();
        if (it != null) {
            JSONArray jSONArray = null;
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<String, Double> next = it.next();
                if (next != null) {
                    if (jSONArray == null) {
                        jSONArray = new JSONArray();
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (PageManger.getRefreshRate() > 0.0f && next.getValue().doubleValue() < ((double) PageManger.getRefreshRate()) * 1.1d) {
                            jSONObject.put(next.getKey(), next.getValue());
                            if (next.getValue().doubleValue() < 40.0d) {
                                z = true;
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    jSONArray.put(jSONObject);
                }
            }
            if (jSONArray != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("pN", this.j);
                    jSONObject2.put("pF", jSONArray);
                    if (z && (aVarA = b.a(this.k).a()) != null) {
                        jSONObject2.put("te", aVarA.c);
                        jSONObject2.put("le", aVarA.f2734a);
                    }
                    EfsJSONLog efsJSONLog = new EfsJSONLog("fpsperf");
                    efsJSONLog.put("fps", jSONObject2);
                    EfsReporter reporter = PageManger.getReporter();
                    if (reporter != null) {
                        reporter.send(efsJSONLog);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public final void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        Choreographer.getInstance().removeFrameCallback(this.l);
        Choreographer.getInstance().postFrameCallback(this.l);
    }

    public final void b() {
        c();
        this.g = false;
        this.h = 0L;
        this.b = 0L;
        this.c = 0;
        Map<String, Double> map = this.f;
        if (map != null) {
            map.clear();
        }
        this.d = 0;
    }
}
