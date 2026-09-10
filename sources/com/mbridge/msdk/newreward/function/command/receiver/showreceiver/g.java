package com.mbridge.msdk.newreward.function.command.receiver.showreceiver;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.player.redirect.RedirectModel;
import com.mbridge.msdk.newreward.player.redirect.RedirectType;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class g implements com.mbridge.msdk.newreward.function.command.receiver.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1652a = "RedirectReceiver";

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1653a;

        static {
            int[] iArr = new int[RedirectType.values().length];
            f1653a = iArr;
            try {
                iArr[RedirectType.NOTICE_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1653a[RedirectType.CLICK_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1653a[RedirectType.IMPRESSION_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1653a[RedirectType.ONLY_IMPRESSION_URL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1653a[RedirectType.PV_URL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1653a[RedirectType.AD_TRACKING_CLICK_URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1653a[RedirectType.AD_TRACKING_EC_SHOW_URL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1653a[RedirectType.AD_TRACKING_CLOSE_URL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1653a[RedirectType.AD_TRACKING_MUTE_URL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1653a[RedirectType.AD_TRACKING_UN_MUTE_URL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1653a[RedirectType.AD_TRACKING_IMPRESSION_URL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1653a[RedirectType.AD_TRACKING_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1653a[RedirectType.AD_TRACKING_PLAY_PERCENTAGE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f1653a[RedirectType.AD_TRACKING_PAUSE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f1653a[RedirectType.AD_TRACKING_RESUME.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f1653a[RedirectType.AD_URL_LIST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f1653a[RedirectType.ADV_IMP_LIST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f1653a[RedirectType.ADD_REWARD.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.function.command.receiver.b
    public void a(Object obj) {
        String strReplace;
        List<String> pv_urls;
        String[] strArrD;
        String[] strArrH;
        String[] strArrE;
        String[] strArrM;
        String[] strArrS;
        String[] strArrK;
        String[] strArrI;
        String[] strArrN;
        String[] strArrP;
        Map map = (Map) obj;
        RedirectModel redirectModel = (RedirectModel) map.get("campaign_redirect");
        if (redirectModel == null) {
        }
        CampaignEx campaignEx = redirectModel.getCampaignEx();
        com.mbridge.msdk.newreward.function.model.f settingModel = redirectModel.getSettingModel();
        switch (a.f1653a[redirectModel.getRedirectType().ordinal()]) {
            case 1:
                String noticeUrl = campaignEx.getNoticeUrl();
                Object obj2 = map.get("click_scenario");
                int iIntValue = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 1;
                try {
                    if (TextUtils.isEmpty(noticeUrl)) {
                        strReplace = noticeUrl;
                    } else {
                        strReplace = noticeUrl.contains(com.mbridge.msdk.foundation.same.a.m) ? noticeUrl.replace(com.mbridge.msdk.foundation.same.a.m + "=" + Uri.parse(noticeUrl).getQueryParameter(com.mbridge.msdk.foundation.same.a.m), com.mbridge.msdk.foundation.same.a.m + "=" + iIntValue) : noticeUrl + "&" + com.mbridge.msdk.foundation.same.a.m + "=" + iIntValue;
                    }
                } catch (Throwable th) {
                    o0.b("RedirectReceiver", th.getMessage());
                }
                if (!TextUtils.isEmpty(strReplace)) {
                    com.mbridge.msdk.click.a.a(redirectModel.getContext(), campaignEx, redirectModel.getUnitId(), strReplace, true, false, 3);
                }
                break;
            case 2:
                com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(redirectModel.getContext(), redirectModel.getUnitId());
                if (campaignEx.getAdType() == 295) {
                    aVar.a(campaignEx);
                } else {
                    aVar.a(com.mbridge.msdk.newreward.function.utils.b.a(a(redirectModel).toString(), campaignEx));
                }
                break;
            case 3:
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, redirectModel.getUnitId(), a(campaignEx.getImpressionURL(), campaignEx, settingModel), false, true, com.mbridge.msdk.click.retry.a.m);
                break;
            case 4:
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, redirectModel.getUnitId(), a(campaignEx.getOnlyImpressionURL(), campaignEx, settingModel), false, true, com.mbridge.msdk.click.retry.a.n);
                break;
            case 5:
                if (campaignEx != null && campaignEx.getPv_urls() != null && (pv_urls = campaignEx.getPv_urls()) != null && !pv_urls.isEmpty()) {
                    Iterator<String> it = pv_urls.iterator();
                    while (it.hasNext()) {
                        com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, redirectModel.getUnitId(), it.next(), false, true);
                    }
                    break;
                }
                break;
            case 6:
                if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && (strArrD = campaignEx.getNativeVideoTracking().d()) != null && strArrD.length > 0) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, redirectModel.getUnitId(), strArrD, true, false);
                    break;
                }
                break;
            case 7:
                if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && (strArrH = campaignEx.getNativeVideoTracking().h()) != null && strArrH.length > 0) {
                    try {
                        String[] strArr = new String[strArrH.length];
                        for (int i = 0; i < strArrH.length; i++) {
                            String strA = a(strArrH[i], campaignEx, settingModel);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("endscreen_type", redirectModel.getEndScreenType());
                            String string = jSONObject.toString();
                            if (!TextUtils.isEmpty(string)) {
                                string = i0.b(string);
                            }
                            if (!TextUtils.isEmpty(string)) {
                                strA = strA + "&value=" + URLEncoder.encode(string);
                            }
                            strArr[i] = strA;
                        }
                        com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, redirectModel.getUnitId(), strArr, false, true);
                    } catch (Exception e) {
                        o0.b("RedirectReceiver", e.getMessage());
                        return;
                    }
                    break;
                }
                break;
            case 8:
                if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && (strArrE = campaignEx.getNativeVideoTracking().e()) != null && strArrE.length > 0) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, redirectModel.getUnitId(), strArrE, false, false);
                    break;
                }
                break;
            case 9:
                if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && (strArrM = campaignEx.getNativeVideoTracking().m()) != null && strArrM.length > 0) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, redirectModel.getUnitId(), strArrM, false, false);
                    break;
                }
                break;
            case 10:
                if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && (strArrS = campaignEx.getNativeVideoTracking().s()) != null && strArrS.length > 0) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, redirectModel.getUnitId(), strArrS, false, false);
                    break;
                }
                break;
            case 11:
                if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && (strArrK = campaignEx.getNativeVideoTracking().k()) != null && strArrK.length > 0) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, redirectModel.getUnitId(), strArrK, false, true);
                    break;
                }
                break;
            case 12:
                if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && (strArrI = campaignEx.getNativeVideoTracking().i()) != null && strArrI.length > 0) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, redirectModel.getUnitId(), strArrI, false, true);
                    break;
                }
                break;
            case 13:
                try {
                    int percentRate = redirectModel.getPercentRate();
                    if (campaignEx != null && campaignEx.getNativeVideoTracking() != null) {
                        ArrayList arrayList = new ArrayList();
                        List<Map<Integer, String>> listO = campaignEx.getNativeVideoTracking().o();
                        if (!listO.isEmpty()) {
                            Iterator<Map<Integer, String>> it2 = listO.iterator();
                            while (it2.hasNext()) {
                                for (Map.Entry<Integer, String> entry : it2.next().entrySet()) {
                                    if (entry.getKey().intValue() == percentRate) {
                                        arrayList.add(a(entry.getValue(), campaignEx, settingModel));
                                    }
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
                            if (strArr2.length > 0) {
                                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, redirectModel.getUnitId(), strArr2, false, false);
                            }
                        }
                        break;
                    }
                } catch (Exception e2) {
                    o0.b("RedirectReceiver", e2.getMessage());
                    return;
                }
                break;
            case 14:
                if (campaignEx != null) {
                    try {
                        if (campaignEx.getNativeVideoTracking() != null && (strArrN = campaignEx.getNativeVideoTracking().n()) != null && strArrN.length > 0) {
                            com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, redirectModel.getUnitId(), strArrN, false, false);
                            break;
                        }
                    } catch (Exception e3) {
                        if (MBridgeConstans.DEBUG) {
                            e3.printStackTrace();
                            return;
                        }
                        return;
                    }
                }
                break;
            case 15:
                if (campaignEx != null) {
                    try {
                        if (campaignEx.getNativeVideoTracking() != null && (strArrP = campaignEx.getNativeVideoTracking().p()) != null && strArrP.length > 0) {
                            com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, redirectModel.getUnitId(), strArrP, false, false);
                            break;
                        }
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            e4.printStackTrace();
                            return;
                        }
                        return;
                    }
                }
                break;
            case 16:
                if (campaignEx != null) {
                    try {
                        if (campaignEx.getAdUrlList() != null && !campaignEx.getAdUrlList().isEmpty()) {
                            for (String str : campaignEx.getAdUrlList()) {
                                if (!TextUtils.isEmpty(str)) {
                                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                                }
                            }
                            break;
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        return;
                    }
                }
                break;
            case 17:
                if (campaignEx != null) {
                    try {
                        if (campaignEx.getAdvImpList() != null && !campaignEx.getAdvImpList().isEmpty()) {
                            Iterator<Map.Entry<Integer, String>> it3 = campaignEx.getAdvImpList().entrySet().iterator();
                            while (it3.hasNext()) {
                                Map.Entry<Integer, String> next = it3.next();
                                Integer key = next.getKey();
                                String value = next.getValue();
                                if (redirectModel.getCurrPercentAge() == key.intValue() && !TextUtils.isEmpty(value)) {
                                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, campaignEx.getCampaignUnitId(), value, false, false);
                                    it3.remove();
                                }
                            }
                            break;
                        }
                    } catch (Exception e6) {
                        e6.printStackTrace();
                        return;
                    }
                }
                break;
            case 18:
                if (campaignEx != null) {
                    try {
                        com.mbridge.msdk.videocommon.entity.c reward = redirectModel.getReward();
                        if (reward != null) {
                            com.mbridge.msdk.video.module.request.b bVar = new com.mbridge.msdk.video.module.request.b(com.mbridge.msdk.foundation.controller.c.n().d());
                            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
                            com.mbridge.msdk.newreward.adapter.f devExtraData = redirectModel.getDevExtraData();
                            if (devExtraData == null) {
                                eVar.a("user_id", i0.b(""));
                            } else {
                                if (!TextUtils.isEmpty(devExtraData.a())) {
                                    eVar.a("extra", devExtraData.a());
                                }
                                eVar.a("user_id", i0.b(devExtraData.b()));
                            }
                            eVar.a("cb_type", "1");
                            eVar.a(CampaignEx.JSON_KEY_REWARD_NAME, reward.c());
                            eVar.a(CampaignEx.JSON_KEY_REWARD_AMOUNT, reward.a() + "");
                            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, redirectModel.getUnitId());
                            eVar.a("click_id", campaignEx.getRequestIdNotice());
                            bVar.addExtraParams("", eVar);
                            com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, campaignEx.getCampaignUnitId(), a(campaignEx.getHost() + "/addReward?", eVar), false, false);
                        }
                    } catch (Throwable th2) {
                        o0.b("RedirectReceiver", th2.getMessage());
                        return;
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    private String a(String str, CampaignEx campaignEx, com.mbridge.msdk.newreward.function.model.f fVar) {
        int iA;
        if (fVar != null) {
            try {
                if (fVar.c() != null) {
                    iA = fVar.c().A();
                } else {
                    iA = 1;
                }
            } catch (Exception e) {
                o0.b("RedirectReceiver", e.getMessage());
                return str;
            }
        } else {
            iA = 1;
        }
        if (campaignEx.getSpareOfferFlag() == 1) {
            return str + "&to=1&cbt=" + campaignEx.getCbt() + "&tmorl=" + iA;
        }
        return str + "&to=0&cbt=" + campaignEx.getCbt() + "&tmorl=" + iA;
    }

    private String a(String str, com.mbridge.msdk.foundation.same.net.wrapper.e eVar) {
        if (eVar != null) {
            String strTrim = eVar.b().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                if (!str.endsWith("?") && !str.endsWith("&")) {
                    str = str.concat(str.contains("?") ? "&" : "?");
                }
                return DM.h(str, strTrim);
            }
        }
        return "";
    }

    public JSONObject a(RedirectModel redirectModel) {
        int i;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.h, redirectModel.getxInScreen());
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.i, redirectModel.getyInScreen());
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.m, redirectModel.getClickSenario());
            try {
                i = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getConfiguration().orientation;
            } catch (Exception e) {
                e.printStackTrace();
                i = 1;
            }
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.k, i);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.l, t0.d(com.mbridge.msdk.foundation.controller.c.n().d()));
            jSONObject.put(com.mbridge.msdk.foundation.same.a.j, jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }
}
