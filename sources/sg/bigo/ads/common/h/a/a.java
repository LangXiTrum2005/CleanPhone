package sg.bigo.ads.common.h.a;

import com.smartdigimkt.x.n;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47262a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47263b = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47264c = 40;
    public long d = 432000000;

    public a() {
        c();
    }

    private void c() {
        this.f47262a = 3;
        this.f47263b = 20;
        this.f47264c = 40;
        this.d = 432000000L;
    }

    public final int a() {
        int i2 = this.f47263b;
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public final boolean b() {
        return this.f47262a <= 0;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            c();
            return;
        }
        this.f47262a = jSONObject.optInt("download_parallel_num", 3);
        int iOptInt = jSONObject.optInt(n.f39790n, 20);
        this.f47263b = iOptInt;
        this.f47264c = iOptInt * 2;
        long jOptInt = ((long) jSONObject.optInt("valid_period")) * 1000;
        if (jOptInt == 0) {
            jOptInt = 432000000;
        }
        this.d = jOptInt;
    }
}
