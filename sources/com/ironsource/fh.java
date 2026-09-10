package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class fh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f28714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0241a4 f28715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private U4 f28716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C0314e5 f28718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f28721i = "fh";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f28722j;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        NOT_RECOVERED,
        RECOVERED,
        IN_RECOVERING,
        NOT_ALLOWED
    }

    public fh(Context context, C0241a4 c0241a4, U4 u6, int i10, C0314e5 c0314e5, String str) {
        a aVarH = h();
        this.f28722j = aVarH;
        if (aVarH != a.NOT_ALLOWED) {
            this.f28714b = context;
            this.f28715c = c0241a4;
            this.f28716d = u6;
            this.f28717e = i10;
            this.f28718f = c0314e5;
            this.f28719g = 0;
        }
        this.f28713a = str;
    }

    private a h() {
        this.f28720h = FeaturesManager.getInstance().getInitRecoverTrials();
        Logger.i(this.f28721i, "getInitialState mMaxAllowedTrials: " + this.f28720h);
        if (this.f28720h > 0) {
            return a.NOT_RECOVERED;
        }
        Logger.i(this.f28721i, "recovery is not allowed by config");
        return a.NOT_ALLOWED;
    }

    private void j() {
        if (this.f28719g != this.f28720h) {
            this.f28722j = a.NOT_RECOVERED;
            return;
        }
        Logger.i(this.f28721i, "handleRecoveringEndedFailed | Reached max trials");
        this.f28722j = a.NOT_ALLOWED;
        a();
    }

    private void k() {
        a();
        this.f28722j = a.RECOVERED;
    }

    public boolean a(C0514p8.c cVar, C0514p8.b bVar) {
        Logger.i(this.f28721i, "shouldRecoverWebController: ");
        a aVar = this.f28722j;
        if (aVar == a.NOT_ALLOWED) {
            Logger.i(this.f28721i, "shouldRecoverWebController: false | recover is not allowed");
            return false;
        }
        if (cVar != C0514p8.c.Native) {
            Logger.i(this.f28721i, "shouldRecoverWebController: false | current controller type is: " + cVar);
            return false;
        }
        if (bVar == C0514p8.b.Loading || bVar == C0514p8.b.None) {
            Logger.i(this.f28721i, "shouldRecoverWebController: false | a Controller is currently loading");
            return false;
        }
        if (aVar == a.RECOVERED) {
            Logger.i(this.f28721i, "shouldRecoverWebController: false | already recovered");
            return false;
        }
        if (aVar == a.IN_RECOVERING) {
            Logger.i(this.f28721i, "shouldRecoverWebController: false | currently in recovering");
            return false;
        }
        if (this.f28714b == null || this.f28715c == null || this.f28716d == null) {
            Logger.i(this.f28721i, "shouldRecoverWebController: false | missing mandatory param");
            return false;
        }
        Logger.i(this.f28721i, "shouldRecoverWebController: true | allow recovering ");
        return true;
    }

    public Context b() {
        return this.f28714b;
    }

    public String c() {
        return this.f28713a;
    }

    public C0241a4 d() {
        return this.f28715c;
    }

    public int e() {
        return this.f28717e;
    }

    public U4 f() {
        return this.f28716d;
    }

    public C0314e5 g() {
        return this.f28718f;
    }

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(X3.i.A0, m());
            jSONObject.put(X3.i.B0, this.f28719g);
            jSONObject.put(X3.i.C0, this.f28720h);
            return jSONObject;
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    public boolean l() {
        return this.f28722j == a.IN_RECOVERING;
    }

    public boolean m() {
        return this.f28722j == a.RECOVERED;
    }

    public void n() {
        a aVar = this.f28722j;
        a aVar2 = a.IN_RECOVERING;
        if (aVar != aVar2) {
            this.f28719g++;
            Logger.i(this.f28721i, "recoveringStarted - trial number " + this.f28719g);
            this.f28722j = aVar2;
        }
    }

    public void a() {
        this.f28714b = null;
        this.f28715c = null;
        this.f28716d = null;
        this.f28718f = null;
    }

    public void a(boolean z10) {
        if (this.f28722j != a.IN_RECOVERING) {
            return;
        }
        if (z10) {
            k();
        } else {
            j();
        }
    }
}
