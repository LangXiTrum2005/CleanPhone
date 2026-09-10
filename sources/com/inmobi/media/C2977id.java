package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2977id implements InterfaceC3105nh {
    public final /* synthetic */ C3001jd a;

    public C2977id(C3001jd c3001jd) {
        this.a = c3001jd;
    }

    @Override // com.inmobi.media.InterfaceC3105nh
    public final boolean a() {
        long userTouchResetTime = this.a.a.b.a.b.getRendering().getUserTouchResetTime();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.a.b;
        return j != 0 && jElapsedRealtime - j < userTouchResetTime;
    }

    @Override // com.inmobi.media.InterfaceC3105nh
    public final boolean c() {
        return !this.a.a.b.a.b.getRendering().getAutoRedirectionEnforcement() || a();
    }

    @Override // com.inmobi.media.InterfaceC3105nh
    public final long getViewTouchTimestamp() {
        return this.a.b;
    }

    @Override // com.inmobi.media.InterfaceC3105nh
    public final void a(String api) {
        Intrinsics.checkNotNullParameter(api, "api");
        Map mapA = AbstractC2983ik.a(this.a.a.e.a);
        Wj wj = Wj.a;
        Wj.b("BlockAutoRedirection", mapA, EnumC2779ak.SDK);
    }
}
