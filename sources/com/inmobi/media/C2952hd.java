package com.inmobi.media;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2952hd implements Ma {
    public final /* synthetic */ C3001jd a;

    public C2952hd(C3001jd c3001jd) {
        this.a = c3001jd;
    }

    @Override // com.inmobi.media.Ma
    public final void a(String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
    }

    @Override // com.inmobi.media.Ma
    public final void a() {
        InterfaceC3072m9 interfaceC3072m9 = this.a.a.g;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("PublisherViewClickHandler", "User left application");
        }
        AbstractC2938h abstractC2938h = (AbstractC2938h) this.a.a.f;
        abstractC2938h.getClass();
        InterfaceC2830cj interfaceC2830cj = ((Ac) abstractC2938h).c;
        AbstractC3205ri abstractC3205ri = interfaceC2830cj instanceof AbstractC3205ri ? (AbstractC3205ri) interfaceC2830cj : null;
        if (abstractC3205ri != null) {
            InterfaceC3072m9 interfaceC3072m9L = abstractC3205ri.l();
            if (interfaceC3072m9L != null) {
                ((C3097n9) interfaceC3072m9L).a("AUM-RenderedState", "onUserLeftApplication");
            }
            P4.a(abstractC3205ri.k(), new C3181qi(abstractC3205ri, null));
        }
    }

    @Override // com.inmobi.media.Ma
    public final void a(String str, String message, String str2) {
        Intrinsics.checkNotNullParameter(message, "message");
        InterfaceC3072m9 interfaceC3072m9 = this.a.a.g;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).b("PublisherViewClickHandler", "Landing page error: " + message + " " + str2);
        }
    }

    @Override // com.inmobi.media.Ma
    public final void a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        InterfaceC3072m9 interfaceC3072m9 = this.a.a.g;
        if (interfaceC3072m9 != null) {
            ComponentName component = intent.getComponent();
            ((C3097n9) interfaceC3072m9).a("PublisherViewClickHandler", "Starting activity: " + (component != null ? component.getClassName() : null));
        }
        this.a.a(intent);
    }

    @Override // com.inmobi.media.Ma
    public final void b(String str, String str2, String str3) {
    }
}
