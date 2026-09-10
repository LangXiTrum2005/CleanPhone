package sg.bigo.ads.api.core;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47062a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47063b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47064c = 0;
    private int d = 0;

    public r() {
        a();
    }

    private void a() {
        this.f47062a = false;
        this.f47063b = "";
        this.f47064c = 3;
        this.d = 20000;
    }

    public final boolean b(int i2) {
        return i2 < this.f47064c;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            a();
            return;
        }
        this.f47062a = true;
        this.f47063b = jSONObject.optString("http_succ_code");
        this.f47064c = jSONObject.optInt("retry_cnt", 3);
        int iOptInt = jSONObject.optInt("retry_interval") * 1000;
        this.d = iOptInt;
        if (iOptInt < 20000) {
            this.d = 20000;
        }
    }

    public final boolean a(int i2) {
        if (i2 >= 100) {
            return this.f47063b.contains(String.valueOf(i2));
        }
        return false;
    }

    public final boolean a(long j, long j2) {
        return j + ((long) this.d) < j2;
    }
}
