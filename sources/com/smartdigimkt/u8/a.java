package com.smartdigimkt.u8;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.smartdigimkt.n8.n;
import com.smartdigimkt.n8.s;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class a extends com.smartdigimkt.s8.c {
    private String f(com.smartdigimkt.s8.b bVar) {
        if (bVar == null) {
            return "load context is null";
        }
        if (bVar.f() == null) {
            return "bidding result is null";
        }
        if (bVar.m() == null) {
            return "place strategy is null";
        }
        if (bVar.q() == null) {
            return "unit group info is null";
        }
        return bVar.e() == null ? "ad request info is null" : "";
    }

    private com.smartdigimkt.y4.d a(Context context, int i2, Map<String, Object> map, SDMAdRequest sDMAdRequest, com.smartdigimkt.v6.a aVar) {
        int i3;
        int iJ;
        Object obj;
        int iC;
        if (map == null || map.isEmpty()) {
            return null;
        }
        int adWidth = -1;
        int i4 = 0;
        i4 = 0;
        i4 = 0;
        if (i2 == 0) {
            int iA = com.smartdigimkt.n8.h.a(map, "close_button", 0);
            int iA2 = com.smartdigimkt.n8.h.a(map, "v_m", 0);
            String strA = com.smartdigimkt.n8.h.a(map, "video_autoplay", "1");
            boolean zEquals = TextUtils.equals("1", com.smartdigimkt.n8.h.e(map, MBridgeConstans.PROPERTIES_LAYOUT_TYPE));
            JSONArray jSONArrayA = zEquals ? com.smartdigimkt.k3.c.d().a(map) : null;
            if (zEquals) {
                i4 = iA2;
            } else if (sDMAdRequest != null && !TextUtils.isEmpty(sDMAdRequest.getNativeVideoAutoPlay())) {
                strA = sDMAdRequest.getNativeVideoAutoPlay();
            }
            int adHeight = -2;
            if (sDMAdRequest != null) {
                adWidth = sDMAdRequest.getAdWidth() != 0 ? sDMAdRequest.getAdWidth() : -1;
                if (sDMAdRequest.getAdHeight() != 0) {
                    adHeight = sDMAdRequest.getAdHeight();
                }
            }
            if (adWidth > 0 && adWidth > (iJ = com.smartdigimkt.n8.c.j(context))) {
                adWidth = iJ;
            }
            if (adHeight > 0 && adHeight > (i3 = com.smartdigimkt.n8.c.i(context))) {
                adHeight = i3;
            }
            return new com.smartdigimkt.y4.d.a().g(iA).d(adWidth).c(adHeight).c(strA).a(jSONArrayA).e(i4).a();
        }
        if (i2 == 1) {
            return new com.smartdigimkt.y4.d.a().e(com.smartdigimkt.n8.h.a(map, "v_m", 0)).h(com.smartdigimkt.n8.h.a(map, "s_c_t", -1)).a();
        }
        char c2 = 2;
        if (i2 == 2) {
            com.smartdigimkt.y4.d.a aVarA = new com.smartdigimkt.y4.d.a().g(com.smartdigimkt.n8.h.a(map, "close_button", 0)).a(com.smartdigimkt.n8.h.a(map, "size", "320x50"));
            if (sDMAdRequest != null) {
                aVarA.d(sDMAdRequest.getAdWidth()).c(sDMAdRequest.getAdHeight());
            }
            return aVarA.a();
        }
        if (i2 != 3) {
            if (i2 != 4) {
                return null;
            }
            return new com.smartdigimkt.y4.d.a().f(com.smartdigimkt.n8.h.a(map, "orientation", 1)).b(com.smartdigimkt.n8.h.a(map, com.smartdigimkt.o1.b.l3, 5) * 1000).a((map.containsKey("allows_skip") && (iC = com.smartdigimkt.n8.h.c(map, "allows_skip")) != 0 && iC == 1) ? 0 : 1).i(com.smartdigimkt.n8.h.a(map, "end_cls", 1)).a();
        }
        com.smartdigimkt.y4.d.a aVarH = new com.smartdigimkt.y4.d.a().b(com.smartdigimkt.n8.h.a(map, "inter_type", "1")).e(com.smartdigimkt.n8.h.a(map, "v_m", 0)).h(com.smartdigimkt.n8.h.a(map, "s_c_t", -1));
        if (aVar == null || aVar.j != 67) {
            c2 = 0;
        } else if (map.containsKey("unit_type") && (obj = map.get("unit_type")) != null && Integer.parseInt(obj.toString()) != 0) {
            c2 = 1;
        }
        if (c2 > 0) {
            aVarH.a(c2 == 1);
        }
        return aVarH.a();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:36:0x0104  */
    /* JADX WARN: Code duplicated, block: B:37:0x0110  */
    /* JADX WARN: Code duplicated, block: B:38:0x011c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x012b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0131  */
    /* JADX WARN: Code duplicated, block: B:46:0x0150  */
    /* JADX WARN: Code duplicated, block: B:48:0x0168  */
    /* JADX WARN: Code duplicated, block: B:51:0x0172  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x0150, please report this as an issue */
    @Override // com.smartdigimkt.s8.c
    public boolean b(com.smartdigimkt.s8.b bVar) {
        Map<String, Object> mapM;
        Map<String, Object> map;
        com.smartdigimkt.y4.c fVar;
        Map<String, Object> customEventMap;
        n.a(bVar.d(), "request", "start", "");
        SDMAdRequest sDMAdRequestC = bVar.c();
        int i2 = bVar.i();
        com.smartdigimkt.v6.a aVarE = bVar.e();
        com.smartdigimkt.y6.b bVarF = bVar.f();
        String strF = f(bVar);
        if (!TextUtils.isEmpty(strF)) {
            bVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.j, "load fail:" + strF));
            return false;
        }
        if (bVarF != null && !bVarF.i()) {
            bVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39189h, "bidding fail:" + bVarF.b()));
            return false;
        }
        com.smartdigimkt.p6.b.b().a(bVar.n(), bVarF);
        s.a(bVar.d(), bVar);
        com.smartdigimkt.i7.c.a(com.smartdigimkt.m6.b.p().k()).a(1, bVar.d());
        com.smartdigimkt.l8.f fVarQ = bVar.q();
        if (!TextUtils.equals(bVarF.D, fVarQ.h())) {
            bVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39189h, androidx.datastore.preferences.protobuf.a.n("bidding fail:bid result adsource(", bVarF.D, ") id not match unitgroup adsource(", fVarQ.h(), ")")));
            return false;
        }
        if (bVar.t()) {
            if (sDMAdRequestC != null) {
                mapM = sDMAdRequestC.getExtraMap();
            } else {
                map = null;
            }
            bVar.a(a(bVar.g(), bVar.i(), map, sDMAdRequestC, aVarE));
            a(aVarE, i2, map, sDMAdRequestC);
            if (aVarE != null) {
                StringBuilder sb = new StringBuilder("loadContext is not valid param1:true,param2:");
                sb.append(aVarE != null);
                bVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.j, sb.toString()));
                return false;
            }
            if (i2 != 0) {
                fVar = new com.smartdigimkt.y4.f(bVar.g(), com.smartdigimkt.y4.c.g.ADX_OFFER_REQUEST_TYPE, aVarE, fVarQ);
            } else if (i2 != 1) {
                fVar = new com.smartdigimkt.y4.g(bVar.g(), com.smartdigimkt.y4.c.g.ADX_OFFER_REQUEST_TYPE, aVarE, fVarQ);
            } else if (i2 != 2) {
                fVar = new com.smartdigimkt.y4.b(bVar.g(), com.smartdigimkt.y4.c.g.ADX_OFFER_REQUEST_TYPE, aVarE, fVarQ);
            } else if (i2 != 3) {
                fVar = new com.smartdigimkt.y4.e(bVar.g(), com.smartdigimkt.y4.c.g.ADX_OFFER_REQUEST_TYPE, aVarE, fVarQ);
            } else if (i2 != 4) {
                fVar = null;
            } else {
                fVar = new com.smartdigimkt.y4.h(bVar.g(), com.smartdigimkt.y4.c.g.ADX_OFFER_REQUEST_TYPE, aVarE, fVarQ);
            }
            if (fVar != null) {
                bVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.j, "not support format:" + aVarE.f39164b));
                return false;
            }
            customEventMap = sDMAdRequestC != null ? sDMAdRequestC.getCustomEventMap() : null;
            if (customEventMap == null) {
                customEventMap = new HashMap<>();
            }
            fVar.a(customEventMap);
            fVar.a(bVar.l());
            fVar.a(bVar.d());
            fVar.a(new C0628a(fVar, bVar));
            return false;
        }
        mapM = fVarQ.M();
        map = mapM;
        bVar.a(a(bVar.g(), bVar.i(), map, sDMAdRequestC, aVarE));
        a(aVarE, i2, map, sDMAdRequestC);
        if (aVarE != null) {
            StringBuilder sb2 = new StringBuilder("loadContext is not valid param1:true,param2:");
            sb2.append(aVarE != null);
            bVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.j, sb2.toString()));
            return false;
        }
        if (i2 != 0) {
            fVar = new com.smartdigimkt.y4.f(bVar.g(), com.smartdigimkt.y4.c.g.ADX_OFFER_REQUEST_TYPE, aVarE, fVarQ);
        } else if (i2 != 1) {
            fVar = new com.smartdigimkt.y4.g(bVar.g(), com.smartdigimkt.y4.c.g.ADX_OFFER_REQUEST_TYPE, aVarE, fVarQ);
        } else if (i2 != 2) {
            fVar = new com.smartdigimkt.y4.b(bVar.g(), com.smartdigimkt.y4.c.g.ADX_OFFER_REQUEST_TYPE, aVarE, fVarQ);
        } else if (i2 != 3) {
            fVar = new com.smartdigimkt.y4.e(bVar.g(), com.smartdigimkt.y4.c.g.ADX_OFFER_REQUEST_TYPE, aVarE, fVarQ);
        } else if (i2 != 4) {
            fVar = null;
        } else {
            fVar = new com.smartdigimkt.y4.h(bVar.g(), com.smartdigimkt.y4.c.g.ADX_OFFER_REQUEST_TYPE, aVarE, fVarQ);
        }
        if (fVar != null) {
            bVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.j, "not support format:" + aVarE.f39164b));
            return false;
        }
        if (sDMAdRequestC != null) {
        }
        if (customEventMap == null) {
            customEventMap = new HashMap<>();
        }
        fVar.a(customEventMap);
        fVar.a(bVar.l());
        fVar.a(bVar.d());
        fVar.a(new C0628a(fVar, bVar));
        return false;
    }

    /* JADX INFO: renamed from: com.smartdigimkt.u8.a$a, reason: collision with other inner class name */
    public class C0628a implements com.smartdigimkt.f5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.y4.c f38936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.s8.b f38937b;

        public C0628a(com.smartdigimkt.y4.c cVar, com.smartdigimkt.s8.b bVar) {
            this.f38936a = cVar;
            this.f38937b = bVar;
        }

        @Override // com.smartdigimkt.f5.c
        public void a() {
            if (!this.f38936a.m()) {
                this.f38937b.a(com.smartdigimkt.v7.b.a("20001", "load fill but ad not ready."));
                a.this.d(this.f38937b);
                return;
            }
            com.smartdigimkt.s8.d dVar = new com.smartdigimkt.s8.d();
            dVar.a(this.f38936a);
            this.f38937b.a(dVar);
            s.a(this.f38937b.d(), this.f38937b, this.f38936a);
            com.smartdigimkt.i7.c.a(com.smartdigimkt.m6.b.p().k()).a(2, this.f38937b.d());
            if (!this.f38937b.t()) {
                com.smartdigimkt.i7.c.a(com.smartdigimkt.m6.b.p().k()).a(12, this.f38937b.d());
            }
            a.this.e(this.f38937b);
        }

        @Override // com.smartdigimkt.f5.c
        public void b() {
        }

        @Override // com.smartdigimkt.f5.c
        public void a(com.smartdigimkt.v3.h hVar) {
            if (hVar != null) {
                this.f38937b.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.j, hVar.c()));
            } else {
                this.f38937b.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.j, "The ad load failed."));
            }
            a.this.d(this.f38937b);
        }
    }

    private void a(com.smartdigimkt.v6.a aVar, int i2, Map<String, Object> map, SDMAdRequest sDMAdRequest) {
        if (aVar != null) {
            if (i2 == 0) {
                aVar.f39173w = TextUtils.equals("1", com.smartdigimkt.n8.h.e(map, MBridgeConstans.PROPERTIES_LAYOUT_TYPE));
                com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
                if (aVarB != null) {
                    aVar.v = aVarB.L0();
                    return;
                }
                return;
            }
            if (i2 != 4) {
                return;
            }
            int iA = com.smartdigimkt.n8.h.a(map, "orientation", 1);
            HashMap<String, Object> map2 = new HashMap<>();
            map2.put("orientation", Integer.valueOf(iA));
            if (sDMAdRequest != null) {
                map2.put("key_width", Integer.valueOf(sDMAdRequest.getAdWidth()));
                map2.put("key_height", Integer.valueOf(sDMAdRequest.getAdHeight()));
            }
            aVar.f39172u = map2;
        }
    }
}
