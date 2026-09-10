package sg.bigo.ads.core.b.a;

import com.smartdigimkt.x.n;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48291a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f48292b = 900000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48293c = 259200000;

    public a() {
        b();
    }

    private void b() {
        this.f48291a = 10;
        this.f48292b = 900000;
        this.f48293c = 259200000;
    }

    public final int a() {
        return Math.round(this.f48291a * 0.8f);
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            b();
            return;
        }
        this.f48291a = jSONObject.optInt(n.f39790n, 10);
        int iOptInt = jSONObject.optInt("interval") * 1000;
        this.f48292b = iOptInt;
        if (iOptInt == 0) {
            this.f48292b = 900000;
        }
        this.f48293c = jSONObject.optInt("expired") * 1000;
    }
}
