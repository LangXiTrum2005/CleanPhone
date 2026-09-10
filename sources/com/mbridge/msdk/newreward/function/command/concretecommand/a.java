package com.mbridge.msdk.newreward.function.command.concretecommand;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.newreward.function.command.e;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.h;
import com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.k;
import com.mbridge.msdk.newreward.function.command.receiver.d;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class a extends com.mbridge.msdk.newreward.function.command.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Object> f1618a = new HashMap();

    /* JADX INFO: renamed from: com.mbridge.msdk.newreward.function.command.concretecommand.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0206a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1619a;

        static {
            int[] iArr = new int[f.values().length];
            f1619a = iArr;
            try {
                iArr[f.CHECK_IS_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1619a[f.CHECK_CAMPAIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1619a[f.CHECK_CAMPAIGN_EXCLUDE_INS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1619a[f.HANDLER_ALREADY_INSTALL_CAMPAIGN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1619a[f.CREATE_OFFSET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1619a[f.CREATE_DAILY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1619a[f.CREATE_BIDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1619a[f.SHOW.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1619a[f.CHECK_IS_REQUEST_CONTROL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1619a[f.UPDATE_CAM_TOKEN_RULE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1619a[f.START_LOAD_CHECK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1619a[f.CANDIDATE_LOAD_ACTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1619a[f.REQ_SETTING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f1619a[f.REQ_CAMPAIGN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f1619a[f.REQ_DOWN_CAMPAIGN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f1619a[f.RESTORE_DB.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f1619a[f.SMART_LOAD.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f1619a[f.NORMAL_LOAD.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f1619a[f.PRE_HANDLE_LOAD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f1619a[f.UNIT_INIT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.mbridge.msdk.newreward.function.command.a
    public e a(com.mbridge.msdk.newreward.function.command.b bVar) {
        e eVar = new e();
        switch (C0206a.f1619a[bVar.a().ordinal()]) {
            case 1:
                eVar.a(((com.mbridge.msdk.newreward.adapter.e) bVar.b()).g().c());
                return eVar;
            case 2:
                Map map = (Map) bVar.b();
                com.mbridge.msdk.newreward.adapter.e eVar2 = (com.mbridge.msdk.newreward.adapter.e) map.get("adapter_model");
                try {
                    eVar2.g().a((com.mbridge.msdk.newreward.function.core.campaign.b) map.get(MBInterstitialActivity.INTENT_CAMAPIGN), false);
                    eVar.a(true);
                    break;
                } catch (MBridgeError e) {
                    eVar.a(false);
                    eVar.a(e);
                }
                return eVar;
            case 3:
                Map map2 = (Map) bVar.b();
                com.mbridge.msdk.newreward.adapter.e eVar3 = (com.mbridge.msdk.newreward.adapter.e) map2.get("adapter_model");
                try {
                    eVar3.g().a((com.mbridge.msdk.newreward.function.core.campaign.b) map2.get(MBInterstitialActivity.INTENT_CAMAPIGN), true);
                    eVar.a(true);
                    break;
                } catch (MBridgeError e2) {
                    eVar.a(false);
                    eVar.a(e2);
                }
                return eVar;
            case 4:
                Map map3 = (Map) bVar.b();
                com.mbridge.msdk.newreward.adapter.e eVar4 = (com.mbridge.msdk.newreward.adapter.e) map3.get("adapter_model");
                eVar4.g().a((com.mbridge.msdk.newreward.function.core.campaign.b) map3.get(MBInterstitialActivity.INTENT_CAMAPIGN));
                return eVar;
            case 5:
                a(bVar, eVar, TypedValues.CycleType.S_WAVE_OFFSET);
                return eVar;
            case 6:
                a(bVar, eVar, "daily");
                return eVar;
            case 7:
                a(bVar, eVar, "bridge_ids");
                return eVar;
            case 8:
                new h().a(bVar);
                return eVar;
            case 9:
                com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.f fVar = (com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.f) d.a().c(f.CHECK_IS_REQUEST_CONTROL);
                if (fVar != null) {
                    try {
                        eVar.a(fVar.a(bVar.b()));
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    break;
                }
                return eVar;
            case 10:
                k kVar = (k) d.a().c(f.UPDATE_CAM_TOKEN_RULE);
                if (kVar != null) {
                    try {
                        eVar.a(kVar.a(bVar.b()));
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                    break;
                }
                return eVar;
            case 11:
                ((com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.c) d.a().c(f.START_LOAD_CHECK)).a(bVar.b());
                return eVar;
            case 12:
                eVar.a(((com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.a) d.a().c(f.CANDIDATE_LOAD_ACTION)).a(bVar.b()));
                return eVar;
            default:
                return eVar;
        }
    }

    private void a(com.mbridge.msdk.newreward.function.command.b bVar, e eVar, String str) {
        if (bVar == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.b bVar2 = new com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.b();
        Map map = (Map) bVar.b();
        if (map == null) {
            map = new HashMap();
        }
        map.put("obj_map", this.f1618a);
        map.put("result", eVar);
        map.put("type", str);
        bVar2.a(map);
    }

    @Override // com.mbridge.msdk.newreward.function.command.a
    public void a(com.mbridge.msdk.newreward.function.command.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
        com.mbridge.msdk.newreward.adapter.e eVar = bVar.b() instanceof com.mbridge.msdk.newreward.adapter.e ? (com.mbridge.msdk.newreward.adapter.e) bVar.b() : null;
        switch (C0206a.f1619a[bVar.a().ordinal()]) {
            case 13:
                if (eVar == null) {
                    new com.mbridge.msdk.newreward.function.model.f().a(com.mbridge.msdk.newreward.function.paramter.c.a().a(bVar, bVar.a()), bVar2);
                } else {
                    eVar.O().a(com.mbridge.msdk.newreward.function.paramter.c.a().a(bVar, bVar.a()), bVar2);
                }
                break;
            case 14:
                com.mbridge.msdk.newreward.adapter.e eVar2 = (com.mbridge.msdk.newreward.adapter.e) ((Map) bVar.b()).get("adapter_model");
                eVar2.g().a(eVar2, com.mbridge.msdk.newreward.function.paramter.c.a().a(bVar.b(), bVar.a()), bVar2);
                break;
            case 15:
                Map<? extends String, ? extends Object> map = (Map) bVar.b();
                com.mbridge.msdk.newreward.adapter.e eVar3 = (com.mbridge.msdk.newreward.adapter.e) map.get("adapter_model");
                com.mbridge.msdk.newreward.function.core.campaign.b bVar3 = (com.mbridge.msdk.newreward.function.core.campaign.b) map.get(MBInterstitialActivity.INTENT_CAMAPIGN);
                bVar3.l().putAll(map);
                eVar3.L().b(bVar3, bVar2);
                break;
            case 16:
                d.a().a(f.RESTORE_DB).a(bVar, bVar2);
                break;
            case 17:
                bVar.b();
                d.a().a(f.SMART_LOAD).a(bVar, bVar2);
                break;
            case 18:
                com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.d dVar = (com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.d) d.a().a(f.NORMAL_LOAD);
                dVar.a(this);
                dVar.a(bVar, bVar2);
                break;
            case 19:
                d.a().a(f.PRE_HANDLE_LOAD).a(bVar, bVar2);
                break;
            case 20:
                d.a().a(f.UNIT_INIT).a(bVar, bVar2);
                break;
        }
    }
}
