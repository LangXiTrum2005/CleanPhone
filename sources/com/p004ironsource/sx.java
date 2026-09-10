package com.p004ironsource;

import android.content.Context;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.sdk.controller.FeaturesManager;
import com.p004ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class sx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f27222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g9 f27223c;
    private wa d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27224e;
    private gb f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f27225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f27226i = "sx";
    private a j;

    public enum a {
        NOT_RECOVERED,
        RECOVERED,
        IN_RECOVERING,
        NOT_ALLOWED
    }

    public sx(Context context, g9 g9Var, wa waVar, int i2, gb gbVar, String str) {
        a aVarH = h();
        this.j = aVarH;
        if (aVarH != a.NOT_ALLOWED) {
            this.f27222b = context;
            this.f27223c = g9Var;
            this.d = waVar;
            this.f27224e = i2;
            this.f = gbVar;
            this.g = 0;
        }
        this.f27221a = str;
    }

    private a h() {
        this.f27225h = FeaturesManager.getInstance().getInitRecoverTrials();
        Logger.i(this.f27226i, "getInitialState mMaxAllowedTrials: " + this.f27225h);
        if (this.f27225h > 0) {
            return a.NOT_RECOVERED;
        }
        Logger.i(this.f27226i, "recovery is not allowed by config");
        return a.NOT_ALLOWED;
    }

    private void j() {
        if (this.g != this.f27225h) {
            this.j = a.NOT_RECOVERED;
            return;
        }
        Logger.i(this.f27226i, "handleRecoveringEndedFailed | Reached max trials");
        this.j = a.NOT_ALLOWED;
        a();
    }

    private void k() {
        a();
        this.j = a.RECOVERED;
    }

    public void a() {
        this.f27222b = null;
        this.f27223c = null;
        this.d = null;
        this.f = null;
    }

    public Context b() {
        return this.f27222b;
    }

    public String c() {
        return this.f27221a;
    }

    public g9 d() {
        return this.f27223c;
    }

    public int e() {
        return this.f27224e;
    }

    public wa f() {
        return this.d;
    }

    public gb g() {
        return this.f;
    }

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(d9.h.A0, m());
            jSONObject.put(d9.h.B0, this.g);
            jSONObject.put(d9.h.C0, this.f27225h);
            return jSONObject;
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return jSONObject;
        }
    }

    public boolean l() {
        return this.j == a.IN_RECOVERING;
    }

    public boolean m() {
        return this.j == a.RECOVERED;
    }

    public void n() {
        a aVar = this.j;
        a aVar2 = a.IN_RECOVERING;
        if (aVar != aVar2) {
            this.g++;
            Logger.i(this.f27226i, "recoveringStarted - trial number " + this.g);
            this.j = aVar2;
        }
    }

    public void a(boolean z2) {
        if (this.j != a.IN_RECOVERING) {
            return;
        }
        if (z2) {
            k();
        } else {
            j();
        }
    }

    public boolean a(mh.c cVar, mh.b bVar) {
        Logger.i(this.f27226i, "shouldRecoverWebController: ");
        a aVar = this.j;
        if (aVar == a.NOT_ALLOWED) {
            Logger.i(this.f27226i, "shouldRecoverWebController: false | recover is not allowed");
            return false;
        }
        if (cVar != mh.c.Native) {
            Logger.i(this.f27226i, "shouldRecoverWebController: false | current controller type is: " + cVar);
            return false;
        }
        if (bVar == mh.b.Loading || bVar == mh.b.None) {
            Logger.i(this.f27226i, "shouldRecoverWebController: false | a Controller is currently loading");
            return false;
        }
        if (aVar == a.RECOVERED) {
            Logger.i(this.f27226i, "shouldRecoverWebController: false | already recovered");
            return false;
        }
        if (aVar == a.IN_RECOVERING) {
            Logger.i(this.f27226i, "shouldRecoverWebController: false | currently in recovering");
            return false;
        }
        if (this.f27222b == null || this.f27223c == null || this.d == null) {
            Logger.i(this.f27226i, "shouldRecoverWebController: false | missing mandatory param");
            return false;
        }
        Logger.i(this.f27226i, "shouldRecoverWebController: true | allow recovering ");
        return true;
    }
}
