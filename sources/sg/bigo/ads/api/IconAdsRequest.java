package sg.bigo.ads.api;

import java.util.LinkedHashMap;
import java.util.Map;
import sg.bigo.ads.api.a.l;

/* JADX INFO: loaded from: classes7.dex */
public class IconAdsRequest extends sg.bigo.ads.api.b implements sg.bigo.ads.api.b.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l f46962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final sg.bigo.ads.api.core.c f46963i;
    private final int j;
    private final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f46964l;
    private final b m;

    public static class a extends c<a, IconAdsRequest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l f46965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public sg.bigo.ads.api.core.c f46966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f46967c;
        public int d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46968e = 20;
        public b f;

        @Override // sg.bigo.ads.api.c
        public final /* synthetic */ sg.bigo.ads.api.b createAdRequest() {
            if (this.f46965a == null) {
                return null;
            }
            return new IconAdsRequest(this, (byte) 0);
        }
    }

    public interface b {
        int a();
    }

    private IconAdsRequest(a aVar) {
        super(aVar.mSlotId, null);
        this.f46962h = aVar.f46965a;
        this.f46963i = aVar.f46966b;
        this.j = aVar.f46967c;
        this.k = aVar.d;
        this.f46964l = aVar.f46968e;
        this.m = aVar.f;
    }

    @Override // sg.bigo.ads.api.b
    public final int c() {
        return this.f46962h.b();
    }

    @Override // sg.bigo.ads.api.b
    public final Map<String, Object> d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        sg.bigo.ads.api.core.c cVar = this.f46963i;
        if (cVar != null) {
            linkedHashMap.put("host_slot", cVar.b());
            linkedHashMap.put("host_placement", this.f46963i.c());
            linkedHashMap.put("host_ad_type", Integer.valueOf(this.f46963i.x()));
            linkedHashMap.put("host_adx_type", Integer.valueOf(this.f46963i.w()));
            linkedHashMap.put("dsp_source", this.f46963i.v());
            linkedHashMap.put("main_domain", this.f46963i.i());
            linkedHashMap.put("main_bundle", this.f46963i.n());
            linkedHashMap.put("main_adx_sid", Long.valueOf(this.f46963i.y()));
            linkedHashMap.put("main_ad_id", this.f46963i.r());
            linkedHashMap.put("dsp_extra", this.f46963i.an());
        }
        linkedHashMap.put("adx_type", 5);
        linkedHashMap.put("ad_type", Integer.valueOf(c()));
        linkedHashMap.put("icon_ads_type", Integer.valueOf(this.k));
        linkedHashMap.put("scene_page", Integer.valueOf(this.j));
        linkedHashMap.put("icon_num", Integer.valueOf(this.f46964l));
        return linkedHashMap;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean e() {
        return true;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean f() {
        return true;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean g() {
        return true;
    }

    @Override // sg.bigo.ads.api.b
    public final l h() {
        return this.f46962h;
    }

    @Override // sg.bigo.ads.api.b.b
    public final sg.bigo.ads.api.core.c i() {
        return this.f46963i;
    }

    @Override // sg.bigo.ads.api.b.c
    public final int j() {
        return this.f46964l;
    }

    @Override // sg.bigo.ads.api.b.c
    public final int k() {
        return this.j;
    }

    @Override // sg.bigo.ads.api.b.c
    public final int l() {
        b bVar = this.m;
        if (bVar != null) {
            return bVar.a();
        }
        return 1;
    }

    public /* synthetic */ IconAdsRequest(a aVar, byte b2) {
        this(aVar);
    }
}
