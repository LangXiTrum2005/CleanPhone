package com.mbridge.msdk.newreward.function.paramter;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.newreward.adapter.h;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.function.common.MBridgeOffsetManager;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f1716a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1717a;

        static {
            int[] iArr = new int[f.values().length];
            f1717a = iArr;
            try {
                iArr[f.REQ_SETTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1717a[f.REQ_CAMPAIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1717a[f.REQ_MORE_OFFER_CAMPAIGN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private c() {
    }

    public static c a() {
        if (f1716a == null) {
            synchronized (c.class) {
                try {
                    if (f1716a == null) {
                        f1716a = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1716a;
    }

    public <T extends com.mbridge.msdk.newreward.function.paramter.a> com.mbridge.msdk.newreward.function.paramter.a a(Object obj, f fVar) {
        int i = a.f1717a[fVar.ordinal()];
        if (i == 1) {
            d dVar = new d();
            com.mbridge.msdk.newreward.function.command.b bVar = (com.mbridge.msdk.newreward.function.command.b) obj;
            if (!(bVar.b() instanceof Map)) {
                return dVar;
            }
            Map map = (Map) bVar.b();
            dVar.a(((Integer) map.get("mb_ad_type")).intValue());
            dVar.a((String) map.get("mb_ad_unit_id"));
            return dVar;
        }
        if (i != 2) {
            if (i != 3) {
                return null;
            }
            b bVar2 = new b();
            if (!(obj instanceof Map)) {
                return bVar2;
            }
            bVar2.a((CampaignEx) ((Map) obj).get(MBInterstitialActivity.INTENT_CAMAPIGN));
            return bVar2;
        }
        Map map2 = (Map) obj;
        com.mbridge.msdk.newreward.adapter.e eVar = (com.mbridge.msdk.newreward.adapter.e) map2.get("adapter_model");
        MBridgeOffsetManager mBridgeOffsetManager = (MBridgeOffsetManager) ((com.mbridge.msdk.newreward.function.command.c) map2.get("command_manager")).a((Object) null, f.CREATE_OFFSET);
        if (mBridgeOffsetManager == null) {
            eVar.j(0);
        } else {
            eVar.j(mBridgeOffsetManager.getOffset());
        }
        e eVar2 = new e(eVar.d(), eVar.G(), eVar.R(), !TextUtils.isEmpty(eVar.f()), eVar.f());
        eVar2.a(eVar.m());
        eVar2.c(eVar.A());
        eVar2.c(eVar.K());
        eVar2.b(eVar.D());
        eVar2.a(eVar.l0());
        if (com.mbridge.msdk.util.b.a()) {
            String strA = h.a(eVar.R(), com.mbridge.msdk.foundation.controller.c.n().d());
            if (TextUtils.isEmpty(strA)) {
                strA = "";
            }
            eVar2.e(strA);
        }
        String strA2 = t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), eVar.R());
        eVar2.b(TextUtils.isEmpty(strA2) ? "" : strA2);
        eVar2.a(h.a());
        eVar2.d(eVar.N());
        Object obj2 = map2.get("params_ext_map_key");
        if (obj2 instanceof Map) {
            eVar2.b((Map<String, String>) obj2);
        }
        return eVar2;
    }
}
