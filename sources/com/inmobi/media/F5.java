package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class F5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3326ye f22809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Be f22810b;

    public F5(C3326ye c3326ye, Be request) {
        Intrinsics.f(request, "request");
        this.f22809a = c3326ye;
        this.f22810b = request;
    }

    /* JADX INFO: Removed unreachable split cross block B:35:0x0087 */
    @Override // java.lang.Runnable
    public final void run() {
        int i2 = 0;
        while (true) {
            Be be = this.f22810b;
            if (i2 > be.y) {
                return;
            }
            P9 p9B = be.b();
            if (this.f22810b.f22700A.get()) {
                return;
            }
            if (p9B.b()) {
                I9 i9 = p9B.d;
                if (i2 == this.f22810b.y) {
                    this.f22809a.a(i9);
                    return;
                }
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(p9B.a());
                    if (JSONObject.class.equals(JSONObject.class)) {
                        this.f22809a.a(jSONObject);
                        return;
                    } else {
                        this.f22809a.a(new C3191q6().a(jSONObject, JSONObject.class));
                        return;
                    }
                } catch (Exception e2) {
                    if (i2 == this.f22810b.y) {
                        C3326ye c3326ye = this.f22809a;
                        EnumC3157o4 enumC3157o4 = EnumC3157o4.f23858l;
                        String message = e2.getMessage();
                        if (message == null) {
                            message = "Exception while parsing the response";
                        }
                        c3326ye.a(new I9(enumC3157o4, message));
                        return;
                    }
                }
            }
            try {
                Thread.sleep(this.f22810b.f22701z * 1000);
            } catch (InterruptedException unused) {
            }
            if (this.f22810b.f22700A.get()) {
                return;
            } else {
                i2++;
            }
        }
    }
}
