package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ja f22929a;

    public Ka(AdConfig.PingsV2Config pingsV2Config) {
        Intrinsics.f(pingsV2Config, "pingsV2Config");
        this.f22929a = pingsV2Config.getEnableOkhttp() ? new C3019fa(pingsV2Config) : new T6(pingsV2Config);
    }

    public final Da a(C3338za ping) {
        Intrinsics.f(ping, "ping");
        Ja ja = this.f22929a;
        Object objA = ja != null ? ja.a(ping) : null;
        if (objA instanceof O9) {
            O9 o9 = (O9) objA;
            o9.a();
            o9.b();
            return new Da(ping, o9.a(), o9.b());
        }
        if (!(objA instanceof P9)) {
            EnumC3141n4[] enumC3141n4Arr = EnumC3141n4.f23825a;
            return new Da(ping, -106, "Ping response is unknown");
        }
        P9 p9 = (P9) objA;
        p9.getClass();
        Integer num = p9.f23072c;
        int iIntValue = num != null ? num.intValue() : 0;
        I9 i9 = p9.d;
        return new Da(ping, iIntValue, i9 != null ? i9.f22887b : null);
    }
}
