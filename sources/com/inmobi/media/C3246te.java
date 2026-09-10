package com.inmobi.media;

import A.RunnableC0895i;
import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: renamed from: com.inmobi.media.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3246te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3246te f24014a = new C3246te();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static V0 f24015b;

    public static void e() {
        boolean z2;
        boolean zBooleanValue;
        V0 v0;
        try {
            Context contextD = Uc.d();
            if (contextD != null) {
                V0 v1 = new V0();
                Reflection.f43333a.b(AdvertisingIdClient.class).l();
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(contextD);
                Intrinsics.e(advertisingIdInfo, "getAdvertisingIdInfo(...)");
                v1.a(advertisingIdInfo.getId());
                v1.a(advertisingIdInfo.isLimitAdTrackingEnabled());
                f24015b = v1;
                Boolean bool = AbstractC2936ab.f23444b;
                if (bool == null) {
                    Context contextD2 = Uc.d();
                    z2 = false;
                    if (contextD2 != null) {
                        ConcurrentHashMap concurrentHashMap = C6.f22734b;
                        AbstractC2936ab.f23444b = Boolean.valueOf(B6.a(contextD2, "user_info_store").f22735a.getBoolean("user_age_restricted", false));
                    }
                    Boolean bool2 = AbstractC2936ab.f23444b;
                    if (bool2 != null) {
                        zBooleanValue = bool2.booleanValue();
                    }
                    if (z2 && (v0 = f24015b) != null) {
                        v0.a((String) null);
                    }
                    return;
                }
                zBooleanValue = bool.booleanValue();
                z2 = zBooleanValue;
                if (z2) {
                    v0.a((String) null);
                }
            }
        } catch (Exception | NoClassDefFoundError unused) {
        }
    }

    public static final void f() {
        e();
    }

    public final void a() {
        try {
            e();
            d();
        } catch (Exception unused) {
        }
    }

    public final V0 b() {
        return f24015b;
    }

    public final Boolean c() {
        V0 v0 = f24015b;
        if (v0 != null) {
            return v0.c();
        }
        return null;
    }

    public final void d() {
        String strA;
        try {
            V0 v0 = f24015b;
            if (v0 == null || (strA = v0.a()) == null) {
                return;
            }
            AbstractC3048h7.a((byte) 2, "te", "Publisher device Id is ".concat(strA));
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z2) {
        V0 v0 = f24015b;
        if (v0 == null) {
            return;
        }
        if (z2) {
            v0.a((String) null);
        } else if (v0.a() == null) {
            Uc.a(new RunnableC0895i(11));
        }
    }
}
