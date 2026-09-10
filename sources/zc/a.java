package zc;

import androidx.core.app.NotificationCompat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f54786a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc.c f54787b = new mc.c("projectNumber", q4.a.m(q4.a.l(pc.e.class, new pc.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.c f54788c = new mc.c("messageId", q4.a.m(q4.a.l(pc.e.class, new pc.a(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mc.c f54789d = new mc.c("instanceId", q4.a.m(q4.a.l(pc.e.class, new pc.a(3))));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mc.c f54790e = new mc.c("messageType", q4.a.m(q4.a.l(pc.e.class, new pc.a(4))));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final mc.c f54791f = new mc.c("sdkPlatform", q4.a.m(q4.a.l(pc.e.class, new pc.a(5))));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mc.c f54792g = new mc.c("packageName", q4.a.m(q4.a.l(pc.e.class, new pc.a(6))));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mc.c f54793h = new mc.c("collapseKey", q4.a.m(q4.a.l(pc.e.class, new pc.a(7))));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final mc.c f54794i = new mc.c(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, q4.a.m(q4.a.l(pc.e.class, new pc.a(8))));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final mc.c f54795j = new mc.c("ttl", q4.a.m(q4.a.l(pc.e.class, new pc.a(9))));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final mc.c f54796k = new mc.c("topic", q4.a.m(q4.a.l(pc.e.class, new pc.a(10))));
    public static final mc.c l = new mc.c("bulkId", q4.a.m(q4.a.l(pc.e.class, new pc.a(11))));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final mc.c f54797m = new mc.c(NotificationCompat.CATEGORY_EVENT, q4.a.m(q4.a.l(pc.e.class, new pc.a(12))));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final mc.c f54798n = new mc.c("analyticsLabel", q4.a.m(q4.a.l(pc.e.class, new pc.a(13))));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final mc.c f54799o = new mc.c("campaignId", q4.a.m(q4.a.l(pc.e.class, new pc.a(14))));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final mc.c f54800p = new mc.c("composerLabel", q4.a.m(q4.a.l(pc.e.class, new pc.a(15))));

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        ad.d dVar = (ad.d) obj;
        mc.e eVar = (mc.e) obj2;
        eVar.f(f54787b, dVar.f3475a);
        eVar.a(f54788c, dVar.f3476b);
        eVar.a(f54789d, dVar.f3477c);
        eVar.a(f54790e, dVar.f3478d);
        eVar.a(f54791f, ad.c.ANDROID);
        eVar.a(f54792g, dVar.f3479e);
        eVar.a(f54793h, dVar.f3480f);
        eVar.e(f54794i, dVar.f3481g);
        eVar.e(f54795j, dVar.f3482h);
        eVar.a(f54796k, dVar.f3483i);
        eVar.f(l, 0L);
        eVar.a(f54797m, ad.a.MESSAGE_DELIVERED);
        eVar.a(f54798n, dVar.f3484j);
        eVar.f(f54799o, 0L);
        eVar.a(f54800p, dVar.f3485k);
    }
}
