package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends b {
    public static final long d = r.f47537c.a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f47769e = r.f47536b.a(5);
    public static final long f = r.f47535a.a(30);
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f47770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f47771i;

    public c(String str) {
        super(str, "");
        this.f47771i = d;
    }

    @Override // sg.bigo.ads.controller.a.a.b, sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        super.a(parcel);
        parcel.writeLong(this.f47771i);
        parcel.writeLong(this.g);
        parcel.writeLong(this.f47770h);
    }

    @Override // sg.bigo.ads.controller.a.a.b, sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        super.b(parcel);
        this.f47771i = n.a(parcel, d);
        this.g = n.a(parcel, 0L);
        this.f47770h = n.a(parcel, 0L);
    }

    @Override // sg.bigo.ads.controller.a.a.b
    public final void a(JSONObject jSONObject, boolean z2, String str, int i2) {
        super.a(jSONObject, z2, str, i2);
        this.f47771i = Math.max(jSONObject.optLong("interval", d / 1000) * 1000, f);
    }

    public final boolean a() {
        long j = this.g;
        long j2 = this.f47770h;
        if (j == j2) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j > j2) {
            return Math.abs(jCurrentTimeMillis - this.g) > f47769e;
        }
        return Math.abs(jCurrentTimeMillis - this.f47770h) > this.f47771i;
    }
}
