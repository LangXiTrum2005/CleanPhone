package com.ironsource;

import android.os.Handler;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.e5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0314e5 implements InterfaceC0692z7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f28510e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static C0314e5 f28511f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HandlerC0296d5 f28512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f28513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Thread f28514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f28515d;

    private C0314e5(String str, R7 r10, JSONObject jSONObject) {
        this.f28515d = str;
        this.f28512a = new HandlerC0296d5(r10.a());
        this.f28513b = jSONObject;
        IronSourceStorageUtils.deleteFolder(b());
        IronSourceStorageUtils.makeDir(b());
    }

    public static synchronized C0314e5 a(String str, R7 r10, JSONObject jSONObject) {
        try {
            if (f28511f == null) {
                f28511f = new C0314e5(str, r10, jSONObject);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f28511f;
    }

    private Thread b(C0693z8 c0693z8, String str, int i10, int i11, Handler handler) {
        if (i10 <= 0) {
            i10 = this.f28513b.optInt("connectionTimeout", 5);
        }
        if (i11 <= 0) {
            i11 = this.f28513b.optInt("readTimeout", 5);
        }
        boolean zOptBoolean = this.f28513b.optBoolean(Z3.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a(new C0260b5(c0693z8, str, (int) timeUnit.toMillis(i10), (int) timeUnit.toMillis(i11), zOptBoolean, b()), handler);
    }

    public boolean c() {
        Thread thread = this.f28514c;
        return thread != null && thread.isAlive();
    }

    public synchronized void d() {
        f28511f = null;
        HandlerC0296d5 handlerC0296d5 = this.f28512a;
        if (handlerC0296d5 != null) {
            handlerC0296d5.a();
            this.f28512a = null;
        }
    }

    @Override // com.ironsource.InterfaceC0692z7
    public void a(Oc oc2) {
        this.f28512a.a(oc2);
    }

    private Thread a(C0260b5 c0260b5, Handler handler) {
        return new Thread(new RunnableC0700zf(c0260b5, handler));
    }

    @Override // com.ironsource.InterfaceC0692z7
    public void a(C0693z8 c0693z8, String str, int i10, int i11, Handler handler) {
        b(c0693z8, str, i10, i11, handler).start();
    }

    private String b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f28515d, Z3.D);
    }

    @Override // com.ironsource.InterfaceC0692z7
    public void a(C0693z8 c0693z8, String str, int i10, int i11) {
        b(c0693z8, str, i10, i11, this.f28512a).start();
    }

    @Override // com.ironsource.InterfaceC0692z7
    public void a(C0693z8 c0693z8, String str) {
        int iOptInt = this.f28513b.optInt("connectionTimeout", 5);
        int iOptInt2 = this.f28513b.optInt("readTimeout", 5);
        boolean zOptBoolean = this.f28513b.optBoolean(Z3.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread threadA = a(new C0260b5(c0693z8, str, (int) timeUnit.toMillis(iOptInt), (int) timeUnit.toMillis(iOptInt2), zOptBoolean, b()), this.f28512a);
        this.f28514c = threadA;
        threadA.start();
    }

    public String a() {
        return this.f28515d;
    }
}
