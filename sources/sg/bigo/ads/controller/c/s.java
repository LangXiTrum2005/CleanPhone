package sg.bigo.ads.controller.c;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements sg.bigo.ads.api.core.o.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f48031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f48033c = false;
    private final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f48034e;
    private long f;

    public s(JSONObject jSONObject) {
        this.f48031a = jSONObject.optInt("play_ad_downloading", 0) == 1;
        this.f48032b = jSONObject.optInt("play_ad_threshold", 50);
        this.d = jSONObject.optLong("play_ad_min_second", 6L) * 1000;
        this.f48034e = jSONObject.optLong("threshold_max_second", 15L) * 1000;
    }

    @Override // sg.bigo.ads.api.core.o.d
    public final long a() {
        return this.f;
    }

    @Override // sg.bigo.ads.api.core.o.d
    public final boolean b() {
        return this.f48031a;
    }

    @Override // sg.bigo.ads.api.core.o.d
    public final int c() {
        if (!this.f48031a) {
            return 100;
        }
        long j = this.f;
        if (j <= this.d) {
            return 100;
        }
        long j2 = this.f48034e;
        if (j <= j2) {
            return this.f48032b;
        }
        return j < (3 * j2) / 2 ? (int) ((((long) this.f48032b) * j2) / j) : (this.f48032b * 2) / 3;
    }

    @Override // sg.bigo.ads.api.core.o.d
    public final boolean d() {
        return this.f48033c;
    }

    @Override // sg.bigo.ads.api.core.o.d
    public final void a(long j) {
        this.f = j;
    }

    @Override // sg.bigo.ads.api.core.o.d
    public final void a(boolean z2) {
        this.f48033c = z2;
    }
}
