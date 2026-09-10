package com.mbridge.msdk.tracker;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.X3;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile u f37072g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f37073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x f37074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f37075c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37076d = 30000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f37077e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Handler f37078f = new a(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            try {
                u.this.b();
                u.this.f37078f.removeMessages(1);
                u.this.d();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f37078f.sendEmptyMessageDelayed(1, this.f37076d);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059 A[Catch: Exception -> 0x00ac, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ac, blocks: (B:5:0x0009, B:7:0x000e, B:9:0x001c, B:12:0x002f, B:15:0x003b, B:18:0x0059, B:23:0x00a5, B:20:0x0071), top: B:28:0x0009, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x0059, please report this as an issue */
    public void b() {
        m[] mVarArrB = m.b();
        if (mVarArrB.length == 0) {
            return;
        }
        try {
            for (m mVar : mVarArrB) {
                String strF = mVar.f();
                if (!"monitor".equals(strF)) {
                    String strD = mVar.d();
                    long[] jArrE = mVar.e();
                    long j10 = jArrE[1];
                    if (j10 != 0) {
                        long j11 = jArrE[0];
                        if (this.f37077e.containsKey(strF)) {
                            if (!(j11 + "").equals(this.f37077e.get(strF))) {
                                this.f37077e.put(strF, j11 + "");
                                if (this.f37073a != null) {
                                    try {
                                        e eVar = new e("event_lib_monitor");
                                        eVar.a(1);
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put(X3.i.W, "m_report_rate");
                                        jSONObject.put("task_name", strF);
                                        jSONObject.put("task_count", j10);
                                        jSONObject.put("task_session_id", strD);
                                        jSONObject.put("task_ts", j11);
                                        eVar.a(jSONObject);
                                        this.f37073a.d(eVar);
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                }
                            }
                        } else {
                            this.f37077e.put(strF, j11 + "");
                            if (this.f37073a != null) {
                                e eVar2 = new e("event_lib_monitor");
                                eVar2.a(1);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put(X3.i.W, "m_report_rate");
                                jSONObject2.put("task_name", strF);
                                jSONObject2.put("task_count", j10);
                                jSONObject2.put("task_session_id", strD);
                                jSONObject2.put("task_ts", j11);
                                eVar2.a(jSONObject2);
                                this.f37073a.d(eVar2);
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public synchronized void c() {
        if (this.f37075c) {
            return;
        }
        this.f37075c = true;
        d();
    }

    public void a(Context context, x xVar, int i10, JSONObject jSONObject) {
        this.f37074b = xVar;
        this.f37076d = i10;
        m mVarA = m.a("monitor", context, xVar);
        this.f37073a = mVarA;
        if (mVarA != null) {
            mVarA.a(jSONObject);
            this.f37073a.h();
        }
        c();
    }

    public static u a() {
        if (f37072g == null) {
            synchronized (u.class) {
                try {
                    if (f37072g == null) {
                        f37072g = new u();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f37072g;
    }
}
