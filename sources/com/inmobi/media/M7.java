package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class M7 extends G1 {
    public final /* synthetic */ T7 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T7 f22977e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M7(T7 t7, T7 t8) {
        super(t7);
        this.d = t7;
        this.f22977e = t8;
    }

    @Override // com.inmobi.media.G1
    public final void a() {
        JSONObject jSONObjectE;
        T7 t7 = this.d;
        if (t7.C == null) {
            InterfaceC3333z5 interfaceC3333z5 = t7.j;
            if (interfaceC3333z5 != null) {
                String TAG = t7.m;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).c(TAG, "prepareFullscreenContainer");
            }
            C3177p8 c3177p8 = t7.f23212b;
            JSONArray jSONArray = c3177p8.f;
            if (jSONArray != null && !B2.a(jSONArray) && (jSONObjectE = c3177p8.e()) != null) {
                byte b2 = t7.f23211a;
                C3177p8 c3177p9 = new C3177p8(b2, jSONObjectE, c3177p8, b2 == 0, t7.s, t7.j);
                c3177p9.q = c3177p8.q;
                Context context = (Context) t7.x.get();
                if (c3177p9.f() && context != null) {
                    String adImpressionId = t7.getImpressionId();
                    Set set = t7.d;
                    AdConfig adConfig = t7.s;
                    long j = t7.f23214e;
                    boolean z2 = t7.f;
                    String creativeId = t7.getCreativeId();
                    S6 s6 = t7.f23216i;
                    InterfaceC3333z5 interfaceC3333z6 = t7.j;
                    Intrinsics.f(adImpressionId, "adImpressionId");
                    Intrinsics.f(adConfig, "adConfig");
                    Intrinsics.f(creativeId, "creativeId");
                    T7 c2934a9 = c3177p9.c().contains("VIDEO") ? new C2934a9(context, (byte) 0, c3177p9, adImpressionId, set, adConfig, j, z2, creativeId, null, s6, interfaceC3333z6) : new T7(context, (byte) 0, c3177p9, adImpressionId, set, adConfig, j, z2, creativeId, null, s6, interfaceC3333z6);
                    t7.C = c2934a9;
                    c2934a9.v = t7;
                    P0 p0 = t7.f23221w;
                    if (p0 != null) {
                        c2934a9.f23221w = p0;
                    }
                }
            }
        }
        T7 t8 = this.d.C;
        if (t8 != null) {
            SparseArray sparseArray = InMobiAdActivity.k;
            int iHashCode = t8.hashCode();
            InMobiAdActivity.k.put(iHashCode, t8);
            Intent intent = new Intent((Context) this.d.x.get(), (Class<?>) InMobiAdActivity.class);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", iHashCode);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 201);
            Context context2 = (Context) this.d.x.get();
            T7 t9 = this.d;
            if (t9.D) {
                t9.G = intent;
            } else if (context2 != null) {
                Uc.f23270a.a(context2, intent);
            }
        }
    }

    @Override // com.inmobi.media.G1
    public final void c() {
        super.c();
        P0 p0 = this.f22977e.f23221w;
        if (p0 != null) {
            p0.c();
        }
    }
}
