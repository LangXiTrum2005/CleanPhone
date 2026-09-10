package com.p004ironsource;

import android.os.Handler;
import com.p004ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class gb implements wf {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f25137e = 5;
    private static gb f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private fb f25138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f25139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Thread f25140c;
    private final String d;

    private gb(String str, pg pgVar, JSONObject jSONObject) {
        this.d = str;
        this.f25138a = new fb(pgVar.a());
        this.f25139b = jSONObject;
        IronSourceStorageUtils.deleteFolder(b());
        IronSourceStorageUtils.makeDir(b());
    }

    public static synchronized gb a(String str, pg pgVar, JSONObject jSONObject) {
        try {
            if (f == null) {
                f = new gb(str, pgVar, jSONObject);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    private String b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.d, f9.D);
    }

    public boolean c() {
        Thread thread = this.f25140c;
        return thread != null && thread.isAlive();
    }

    public synchronized void d() {
        f = null;
        fb fbVar = this.f25138a;
        if (fbVar != null) {
            fbVar.a();
            this.f25138a = null;
        }
    }

    private Thread b(vh vhVar, String str, int i2, int i3, Handler handler) {
        if (i2 <= 0) {
            i2 = this.f25139b.optInt("connectionTimeout", 5);
        }
        if (i3 <= 0) {
            i3 = this.f25139b.optInt("readTimeout", 5);
        }
        boolean zOptBoolean = this.f25139b.optBoolean(f9.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a(new db(vhVar, str, (int) timeUnit.toMillis(i2), (int) timeUnit.toMillis(i3), zOptBoolean, b()), handler);
    }

    public String a() {
        return this.d;
    }

    private Thread a(db dbVar, Handler handler) {
        return new Thread(new tu(dbVar, handler));
    }

    @Override // com.p004ironsource.wf
    public void a(rp rpVar) {
        this.f25138a.a(rpVar);
    }

    @Override // com.p004ironsource.wf
    public void a(vh vhVar, String str) {
        int iOptInt = this.f25139b.optInt("connectionTimeout", 5);
        int iOptInt2 = this.f25139b.optInt("readTimeout", 5);
        boolean zOptBoolean = this.f25139b.optBoolean(f9.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread threadA = a(new db(vhVar, str, (int) timeUnit.toMillis(iOptInt), (int) timeUnit.toMillis(iOptInt2), zOptBoolean, b()), this.f25138a);
        this.f25140c = threadA;
        threadA.start();
    }

    @Override // com.p004ironsource.wf
    public void a(vh vhVar, String str, int i2, int i3) {
        b(vhVar, str, i2, i3, this.f25138a).start();
    }

    @Override // com.p004ironsource.wf
    public void a(vh vhVar, String str, int i2, int i3, Handler handler) {
        b(vhVar, str, i2, i3, handler).start();
    }
}
