package com.mbridge.msdk.newreward.function.command.concretecommand;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.newreward.function.command.e;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.function.command.receiver.d;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class c extends com.mbridge.msdk.newreward.function.command.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1621a = "ShowCommand";
    private com.mbridge.msdk.newreward.function.command.receiver.c b = new com.mbridge.msdk.newreward.function.command.receiver.c();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1622a;

        static {
            int[] iArr = new int[f.values().length];
            f1622a = iArr;
            try {
                iArr[f.TEMP_PLAYER_INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1622a[f.TEMP_PLAY_START_COUNT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1622a[f.TEMP_PLAY_PROGRESS_COUNT_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1622a[f.CAMPAIGN_REDIRECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1622a[f.SHOW_ADD_TEMPLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1622a[f.SHOW_LIFE_CYCLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1622a[f.SHOW_OR_PRELOAD_WEB_EC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1622a[f.SHOW_OR_PRELOAD_WEB_TEMPLATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1622a[f.ADD_SHAKE_VIEW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1622a[f.ADD_BAIT_CLICK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1622a[f.REQ_MORE_OFFER_CAMPAIGN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1622a[f.BUILD_MORE_OFFER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.mbridge.msdk.newreward.function.command.a
    public <T extends e> T a(com.mbridge.msdk.newreward.function.command.b bVar) {
        Map map;
        T t = (T) new e();
        switch (a.f1622a[bVar.a().ordinal()]) {
            case 1:
            case 2:
            case 3:
                com.mbridge.msdk.newreward.function.command.receiver.showreceiver.f fVar = (com.mbridge.msdk.newreward.function.command.receiver.showreceiver.f) d.a().c(bVar.a());
                if (fVar != null) {
                    try {
                        t.a(fVar.a(bVar.b()));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
                return t;
            case 4:
                d.a().b(f.CAMPAIGN_REDIRECT).a(bVar.b());
                return t;
            case 5:
                d.a().b(f.SHOW_ADD_TEMPLE).a(bVar.b());
                return t;
            case 6:
                d.a().b(f.SHOW_LIFE_CYCLE).a(bVar.b());
                return t;
            case 7:
                d.a().b(f.SHOW_OR_PRELOAD_WEB_EC).a(bVar.b());
                return t;
            case 8:
                try {
                    if ((bVar.b() instanceof Map) && (map = (Map) bVar.b()) != null && !map.isEmpty()) {
                        Object obj = map.get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                        if (obj instanceof String) {
                            d.a().a(f.SHOW_OR_PRELOAD_WEB_TEMPLATE, (String) obj).a(bVar.b());
                        }
                    }
                    break;
                } catch (Throwable th) {
                    o0.b("ShowCommand", th.getMessage());
                }
                return t;
            case 9:
            case 10:
                com.mbridge.msdk.newreward.function.command.receiver.showreceiver.c cVar = (com.mbridge.msdk.newreward.function.command.receiver.showreceiver.c) d.a().c(bVar.a());
                if (cVar != null) {
                    try {
                        t.a(cVar.a(bVar.b()));
                    } catch (Exception e2) {
                        o0.b("ShowCommand", e2.getMessage());
                    }
                    break;
                }
                return t;
            default:
                return t;
        }
    }

    @Override // com.mbridge.msdk.newreward.function.command.a
    public void a(com.mbridge.msdk.newreward.function.command.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
        com.mbridge.msdk.newreward.function.command.receiver.showreceiver.e eVar;
        int i = a.f1622a[bVar.a().ordinal()];
        if (i == 5) {
            com.mbridge.msdk.newreward.function.command.receiver.showreceiver.d dVar = (com.mbridge.msdk.newreward.function.command.receiver.showreceiver.d) d.a().a(bVar.a());
            if (dVar != null) {
                dVar.a(bVar, bVar2);
                return;
            }
            return;
        }
        if (i != 11) {
            if (i == 12 && (eVar = (com.mbridge.msdk.newreward.function.command.receiver.showreceiver.e) d.a().a(bVar.a())) != null) {
                eVar.a(bVar, bVar2);
                return;
            }
            return;
        }
        Object objB = bVar.b();
        if (!(objB instanceof Map)) {
            if (bVar2 != null) {
                bVar2.reqFailed(com.mbridge.msdk.foundation.error.a.a(990001, com.mbridge.msdk.foundation.error.a.a(990001)));
            }
        } else {
            Map map = (Map) objB;
            com.mbridge.msdk.newreward.adapter.e eVar2 = (com.mbridge.msdk.newreward.adapter.e) map.get("adapter_model");
            eVar2.C().a(((Integer) map.get("more_offer_type")).intValue(), eVar2, (CampaignEx) map.get(MBInterstitialActivity.INTENT_CAMAPIGN), com.mbridge.msdk.newreward.function.paramter.c.a().a(bVar.b(), bVar.a()), bVar2);
        }
    }

    @Override // com.mbridge.msdk.newreward.function.command.a
    public void a(com.mbridge.msdk.newreward.function.command.b bVar, String str) {
        super.a(bVar, str);
        this.b.a(str).a(bVar.b());
    }
}
