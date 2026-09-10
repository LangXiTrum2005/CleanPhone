package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class K7 implements InterfaceC2995e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T7 f22924a;

    public K7(T7 t7) {
        this.f22924a = t7;
    }

    @Override // com.inmobi.media.InterfaceC2995e2
    public final void a(int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // com.inmobi.media.InterfaceC2995e2
    public final void b() {
        P0 p0 = this.f22924a.f23221w;
        if (p0 != null) {
            p0.d();
        }
    }

    @Override // com.inmobi.media.InterfaceC2995e2
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC2995e2
    public final void a(JSONObject jsonObject) {
        Intrinsics.f(jsonObject, "jsonObject");
    }

    @Override // com.inmobi.media.InterfaceC2995e2
    public final void a(String url, String api, R6 r6) {
        Intrinsics.f(url, "url");
        Intrinsics.f(api, "api");
    }

    @Override // com.inmobi.media.InterfaceC2995e2
    public final void a(F6 landingPageFunnelState, R6 r6, Integer num) {
        Intrinsics.f(landingPageFunnelState, "landingPageFunnelState");
        J6.a(landingPageFunnelState, r6, num, 8);
    }

    @Override // com.inmobi.media.InterfaceC2995e2
    public final void a() {
        P0 p0 = this.f22924a.f23221w;
        if (p0 != null) {
            p0.b();
        }
        InterfaceC3333z5 interfaceC3333z5 = this.f22924a.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a();
        }
    }
}
