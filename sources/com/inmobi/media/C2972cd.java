package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2972cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2972cd f23496a = new C2972cd();

    /* JADX WARN: Code duplicated, block: B:12:0x004f A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #0 {all -> 0x002b, blocks: (B:3:0x0001, B:5:0x0028, B:8:0x002d, B:10:0x0038, B:12:0x004f), top: B:17:0x0001 }] */
    public final synchronized void a() {
        try {
            LinkedHashMap linkedHashMap = O2.f23027a;
            M2.a("signals", Uc.b(), null);
            Zc zc = Zc.f23411a;
            boolean sessionEnabled = ((SignalsConfig) AbstractC3174p5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getIce().getSessionEnabled();
            zc.getClass();
            Zc.f23414e = sessionEnabled;
            if (!sessionEnabled) {
                Zc.d = null;
            }
            Zc.c();
            String strH = Uc.f23270a.h();
            if (strH != null) {
                Config configA = M2.a("signals", strH, null);
                Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
                if (((SignalsConfig) configA).getIce().getLocationEnabled()) {
                    X6.f23341a.d();
                }
            } else {
                X6.f23341a.d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
