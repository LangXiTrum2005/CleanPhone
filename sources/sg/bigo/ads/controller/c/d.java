package sg.bigo.ads.controller.c;

import com.p004ironsource.d9;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends b implements sg.bigo.ads.api.core.i {
    protected sg.bigo.ads.api.core.i.b D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected final sg.bigo.ads.api.core.i.a f47967E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f47968F;
    private boolean G;

    public d(long j, sg.bigo.ads.api.core.h hVar, sg.bigo.ads.api.a.l lVar, JSONObject jSONObject) {
        super(j, hVar, lVar, jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(d9.h.d);
        if (jSONObjectOptJSONObject != null) {
            this.D = new h(jSONObjectOptJSONObject);
        }
        this.f47967E = new e(jSONObject);
    }

    @Override // sg.bigo.ads.api.core.i
    public final void aA() {
        this.G = true;
    }

    @Override // sg.bigo.ads.api.core.i
    public final boolean aB() {
        return this.G;
    }

    @Override // sg.bigo.ads.api.core.i
    public final boolean av() {
        return a(32);
    }

    @Override // sg.bigo.ads.api.core.i
    public final sg.bigo.ads.api.core.i.b aw() {
        return this.D;
    }

    @Override // sg.bigo.ads.api.core.i
    public final sg.bigo.ads.api.core.i.a ax() {
        return this.f47967E;
    }

    @Override // sg.bigo.ads.api.core.i
    public final void ay() {
        this.f47968F = true;
    }

    @Override // sg.bigo.ads.api.core.i
    public final boolean az() {
        return this.f47968F;
    }
}
