package com.inmobi.media;

import android.app.Activity;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class J7 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f22903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T7 f22904b;

    public J7(T7 t7, T7 originalContainer) {
        Intrinsics.f(originalContainer, "originalContainer");
        this.f22904b = t7;
        this.f22903a = new WeakReference(originalContainer);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String str;
        T7 t7;
        InterfaceC3333z5 interfaceC3333z5;
        String str2;
        T7 t8;
        Activity activityF = this.f22904b.f();
        if (activityF == null) {
            Intrinsics.e(this.f22904b.m, "access$getTAG$p(...)");
            return;
        }
        T7 t9 = (T7) this.f22903a.get();
        if (t9 == null || t9.t) {
            return;
        }
        try {
            C3177p8 c3177p8 = t9.f23212b;
            JSONArray jSONArray = c3177p8.f;
            try {
                if (jSONArray == null || B2.a(jSONArray)) {
                    Intrinsics.e(this.f22904b.m, "access$getTAG$p(...)");
                    return;
                }
                Intrinsics.e(this.f22904b.m, "access$getTAG$p(...)");
                JSONObject jSONObjectE = c3177p8.e();
                if (jSONObjectE == null) {
                    return;
                }
                T7 t10 = this.f22904b;
                byte b2 = t10.f23211a;
                C3177p8 c3177p9 = new C3177p8(b2, jSONObjectE, c3177p8, b2 == 0, t10.s, t10.j);
                if (!c3177p9.f()) {
                    T7 t11 = this.f22904b;
                    InterfaceC3333z5 interfaceC3333z6 = t11.j;
                    if (interfaceC3333z6 != null) {
                        String str3 = t11.m;
                        Intrinsics.e(str3, "access$getTAG$p(...)");
                        ((A5) interfaceC3333z6).b(str3, "Invalid data model for end-card container! End card will not be shown ...");
                        return;
                    }
                    return;
                }
                String adImpressionId = this.f22904b.getImpressionId();
                T7 t12 = this.f22904b;
                AdConfig adConfig = t12.s;
                long j = t12.f23214e;
                boolean z2 = t12.f;
                String creativeId = t12.getCreativeId();
                T7 t13 = this.f22904b;
                S6 s6 = t13.f23216i;
                InterfaceC3333z5 interfaceC3333z7 = t13.j;
                Intrinsics.f(adImpressionId, "adImpressionId");
                Intrinsics.f(adConfig, "adConfig");
                Intrinsics.f(creativeId, "creativeId");
                try {
                    if (c3177p9.c().contains("VIDEO")) {
                        try {
                            str2 = "access$getTAG$p(...)";
                            t8 = new C2934a9(activityF, (byte) 0, c3177p9, adImpressionId, null, adConfig, j, z2, creativeId, null, s6, interfaceC3333z7);
                        } catch (Exception e2) {
                            e = e2;
                            str2 = "access$getTAG$p(...)";
                            str = str2;
                            t7 = this.f22904b;
                            interfaceC3333z5 = t7.j;
                            if (interfaceC3333z5 != null) {
                                String str4 = t7.m;
                                Intrinsics.e(str4, str);
                                ((A5) interfaceC3333z5).a(str4, "Encountered unexpected error in EndCardBuilder: ", e);
                            }
                            S5 s5 = S5.f23167a;
                            S5.d.a(AbstractC3285w5.a(e, "event"));
                        }
                    } else {
                        str2 = "access$getTAG$p(...)";
                        t8 = new T7(activityF, (byte) 0, c3177p9, adImpressionId, null, adConfig, j, z2, creativeId, null, s6, interfaceC3333z7);
                    }
                    t8.H = t9.H;
                    t8.v = t9;
                    T7 t14 = this.f22904b;
                    InterfaceC3333z5 interfaceC3333z8 = t14.j;
                    if (interfaceC3333z8 != null) {
                        String str5 = t14.m;
                        Intrinsics.e(str5, str2);
                        ((A5) interfaceC3333z8).a(str5, "End-card container built successfully ...");
                    }
                    t9.f23206J = t8;
                    return;
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e5) {
            e = e5;
            str = "access$getTAG$p(...)";
        }
        t7 = this.f22904b;
        interfaceC3333z5 = t7.j;
        if (interfaceC3333z5 != null) {
            String str6 = t7.m;
            Intrinsics.e(str6, str);
            ((A5) interfaceC3333z5).a(str6, "Encountered unexpected error in EndCardBuilder: ", e);
        }
        S5 s7 = S5.f23167a;
        S5.d.a(AbstractC3285w5.a(e, "event"));
    }
}
