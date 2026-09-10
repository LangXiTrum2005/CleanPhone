package com.ironsource;

import android.os.Handler;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3471d5 implements InterfaceC3823x7 {
    private static final int e = 5;
    private static C3471d5 f;
    private HandlerC3453c5 a;
    private final JSONObject b;
    private Thread c;
    private final String d;

    private C3471d5(String str, P7 p7, JSONObject jSONObject) {
        this.d = str;
        this.a = new HandlerC3453c5(p7.a());
        this.b = jSONObject;
        IronSourceStorageUtils.deleteFolder(b());
        IronSourceStorageUtils.makeDir(b());
    }

    public static synchronized C3471d5 a(String str, P7 p7, JSONObject jSONObject) {
        try {
            if (f == null) {
                f = new C3471d5(str, p7, jSONObject);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    private Thread b(C3824x8 c3824x8, String str, int i, int i2, Handler handler) {
        if (i <= 0) {
            i = this.b.optInt("connectionTimeout", 5);
        }
        if (i2 <= 0) {
            i2 = this.b.optInt("readTimeout", 5);
        }
        boolean zOptBoolean = this.b.optBoolean(Z3.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a(new C3417a5(c3824x8, str, (int) timeUnit.toMillis(i), (int) timeUnit.toMillis(i2), zOptBoolean, b()), handler);
    }

    public boolean c() {
        Thread thread = this.c;
        return thread != null && thread.isAlive();
    }

    public synchronized void d() {
        f = null;
        HandlerC3453c5 handlerC3453c5 = this.a;
        if (handlerC3453c5 != null) {
            handlerC3453c5.a();
            this.a = null;
        }
    }

    @Override // com.ironsource.InterfaceC3823x7
    public void a(Jc jc) {
        this.a.a(jc);
    }

    private Thread a(C3417a5 c3417a5, Handler handler) {
        return new Thread(new RunnableC3642mf(c3417a5, handler));
    }

    @Override // com.ironsource.InterfaceC3823x7
    public void a(C3824x8 c3824x8, String str, int i, int i2, Handler handler) {
        b(c3824x8, str, i, i2, handler).start();
    }

    private String b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.d, Z3.D);
    }

    @Override // com.ironsource.InterfaceC3823x7
    public void a(C3824x8 c3824x8, String str, int i, int i2) {
        b(c3824x8, str, i, i2, this.a).start();
    }

    @Override // com.ironsource.InterfaceC3823x7
    public void a(C3824x8 c3824x8, String str) {
        int iOptInt = this.b.optInt("connectionTimeout", 5);
        int iOptInt2 = this.b.optInt("readTimeout", 5);
        boolean zOptBoolean = this.b.optBoolean(Z3.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread threadA = a(new C3417a5(c3824x8, str, (int) timeUnit.toMillis(iOptInt), (int) timeUnit.toMillis(iOptInt2), zOptBoolean, b()), this.a);
        this.c = threadA;
        threadA.start();
    }

    public String a() {
        return this.d;
    }
}
