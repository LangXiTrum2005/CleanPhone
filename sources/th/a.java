package th;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import hn.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f50757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f50758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ph.c f50759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.unity3d.scar.adapter.common.c f50760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f50761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f50762g;

    public /* synthetic */ a(Context context, ph.c cVar, Object obj, com.unity3d.scar.adapter.common.c cVar2, int i10) {
        this.f50756a = i10;
        this.f50758c = context;
        this.f50759d = cVar;
        this.f50761f = obj;
        this.f50760e = cVar2;
    }

    public final void a(ph.b bVar) {
        AdRequest adRequestBuild;
        switch (this.f50756a) {
            case 0:
                AdRequest adRequestA = ((sh.a) this.f50761f).a(this.f50759d.f48374d);
                if (bVar != null) {
                    ((b) this.f50762g).f50763a = bVar;
                }
                b(adRequestA);
                break;
            default:
                wh.a aVar = (wh.a) this.f50761f;
                String str = this.f50759d.f48374d;
                aVar.getClass();
                u uVar = aVar.f53208a;
                if (str.isEmpty()) {
                    AdRequest.Builder requestAgent = new AdRequest.Builder().setRequestAgent(uVar.f42458b);
                    Bundle bundle = new Bundle();
                    bundle.putString("query_info_type", "requester_type_5");
                    adRequestBuild = requestAgent.addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
                } else {
                    AdRequest.Builder requestAgent2 = new AdRequest.Builder().setRequestAgent(uVar.f42458b);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("query_info_type", "requester_type_5");
                    adRequestBuild = requestAgent2.addNetworkExtrasBundle(AdMobAdapter.class, bundle2).setAdString(str).build();
                }
                if (bVar != null) {
                    ((b) this.f50762g).f50763a = bVar;
                }
                b(adRequestBuild);
                break;
        }
    }

    public abstract void b(AdRequest adRequest);
}
