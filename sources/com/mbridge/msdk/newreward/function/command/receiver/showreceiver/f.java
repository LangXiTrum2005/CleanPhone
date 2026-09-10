package com.mbridge.msdk.newreward.function.command.receiver.showreceiver;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class f implements com.mbridge.msdk.newreward.function.command.receiver.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.command.f f1650a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1651a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.command.f.values().length];
            f1651a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.command.f.TEMP_PLAYER_INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1651a[com.mbridge.msdk.newreward.function.command.f.TEMP_PLAY_START_COUNT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1651a[com.mbridge.msdk.newreward.function.command.f.TEMP_PLAY_PROGRESS_COUNT_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(com.mbridge.msdk.newreward.function.command.f fVar) {
        this.f1650a = fVar;
    }

    private Object b(Map map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            try {
                if (!map.isEmpty() && map.containsKey("videoCompleteTime") && (map.get("videoCompleteTime") instanceof Integer)) {
                    int iIntValue = ((Integer) map.get("videoCompleteTime")).intValue();
                    int iA = t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 25.0f);
                    int iA2 = t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 5.0f);
                    int iA3 = g0.a(com.mbridge.msdk.foundation.controller.c.n().d(), iIntValue > 0 ? "mbridge_reward_video_time_count_num_bg" : "mbridge_reward_shape_progress", "drawable");
                    map2.put("width", -2);
                    map2.put("height", Integer.valueOf(iA));
                    map2.put("padding", Integer.valueOf(iA2));
                    map2.put("background", Integer.valueOf(iA3));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return map2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0151 A[PHI: r6 r8 r9
  0x0151: PHI (r6v8 int) = (r6v7 int), (r6v16 int), (r6v16 int) binds: [B:60:0x00fb, B:80:0x0148, B:73:0x0123] A[DONT_GENERATE, DONT_INLINE]
  0x0151: PHI (r8v13 int) = (r8v12 int), (r8v17 int), (r8v17 int) binds: [B:60:0x00fb, B:80:0x0148, B:73:0x0123] A[DONT_GENERATE, DONT_INLINE]
  0x0151: PHI (r9v4 int) = (r9v3 int), (r9v7 int), (r9v7 int) binds: [B:60:0x00fb, B:80:0x0148, B:73:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    private Object c(Map map) {
        float fFloatValue;
        float fFloatValue2;
        int iIntValue;
        double dM;
        double dM2;
        boolean zIsDynamicView;
        int iA;
        int i;
        int i2;
        int i3;
        CampaignEx campaignEx = map.containsKey(MBInterstitialActivity.INTENT_CAMAPIGN) ? (CampaignEx) map.get(MBInterstitialActivity.INTENT_CAMAPIGN) : null;
        if (map.containsKey("fullScreenWidth")) {
            Object obj = map.get("fullScreenWidth");
            if (obj instanceof Float) {
                fFloatValue = ((Float) obj).floatValue();
            } else {
                fFloatValue = 0.0f;
            }
        } else {
            fFloatValue = 0.0f;
        }
        if (map.containsKey("fullScreenHeight")) {
            Object obj2 = map.get("fullScreenHeight");
            if (obj2 instanceof Float) {
                fFloatValue2 = ((Float) obj2).floatValue();
            } else {
                fFloatValue2 = 0.0f;
            }
        } else {
            fFloatValue2 = 0.0f;
        }
        if (map.containsKey(AdUnitActivity.EXTRA_ORIENTATION)) {
            Object obj3 = map.get(AdUnitActivity.EXTRA_ORIENTATION);
            if (obj3 instanceof Integer) {
                iIntValue = ((Integer) obj3).intValue();
            } else {
                iIntValue = 1;
            }
        } else {
            iIntValue = 1;
        }
        int i4 = 0;
        int iF = TypedValues.Custom.TYPE_BOOLEAN;
        if (campaignEx != null) {
            String[] strArrSplit = campaignEx.getVideoResolution().split("x");
            if (strArrSplit.length == 2) {
                dM = t0.m(strArrSplit[0]) > 0.0d ? t0.m(strArrSplit[0]) : 0.0d;
                dM2 = t0.m(strArrSplit[1]) > 0.0d ? t0.m(strArrSplit[1]) : 0.0d;
            } else {
                dM = 0.0d;
                dM2 = 0.0d;
            }
            zIsDynamicView = campaignEx.isDynamicView();
            if (campaignEx.getRewardTemplateMode() != null) {
                iF = campaignEx.getRewardTemplateMode().f();
            }
        } else {
            dM = 0.0d;
            dM2 = 0.0d;
            zIsDynamicView = true;
        }
        if (dM <= 0.0d) {
            dM = 1280.0d;
        }
        if (dM2 <= 0.0d) {
            dM2 = 720.0d;
        }
        if (fFloatValue > 0.0f && fFloatValue2 > 0.0f) {
            double d = dM / dM2;
            double dA = t0.a(Double.valueOf(d));
            double dA2 = t0.a(Double.valueOf(fFloatValue / fFloatValue2));
            if (dA > dA2) {
                i3 = (int) ((((double) fFloatValue) * dM2) / dM);
                i4 = 17;
                i2 = -1;
            } else {
                if (dA < dA2) {
                    i2 = (int) (((double) fFloatValue2) * d);
                    i4 = 17;
                } else {
                    i2 = -1;
                }
                i3 = -1;
            }
            if (zIsDynamicView) {
                if (iF == 102 || iF == 202) {
                    if (iIntValue == 1) {
                        i3 = (int) (dM2 / (dM / ((double) fFloatValue)));
                        i4 = 17;
                        i2 = -1;
                    } else {
                        i2 = (int) (((double) fFloatValue2) * d);
                        i4 = 17;
                        i3 = -1;
                    }
                }
                if (iF != 302 && iF != 802 && iF != 5002010) {
                    i = i2;
                    iA = i3;
                } else if (d > 1.0d) {
                    iA = (int) ((dM2 * ((double) fFloatValue)) / dM);
                    i = -1;
                } else {
                    try {
                        iA = t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 220.0f);
                        i = (int) ((dM * ((double) iA)) / dM2);
                    } catch (Throwable th) {
                        o0.b("RefactorShow", th.getMessage());
                        i = i2;
                        iA = i3;
                    }
                }
            } else {
                i = i2;
                iA = i3;
            }
        } else if (iIntValue == 2) {
            i = -1;
            iA = -1;
        } else {
            iA = (int) ((fFloatValue * 9.0f) / 16.0f);
            i = -1;
            i4 = 17;
        }
        HashMap map2 = new HashMap();
        AbstractC3950lJ.y(i, map2, "width", iA, "height");
        map2.put("gravity", Integer.valueOf(i4));
        return map2;
    }

    public Object a(Object obj) {
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return null;
        }
        int i = a.f1651a[this.f1650a.ordinal()];
        if (i == 1) {
            return c(map);
        }
        if (i == 2) {
            return b(map);
        }
        if (i != 3) {
            return null;
        }
        return a(map);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0166  */
    private Object a(Map map) {
        String strN;
        int i = 0;
        int iIntValue = map.containsKey("videoCompleteTime") ? ((Integer) map.get("videoCompleteTime")).intValue() : 0;
        CampaignEx campaignEx = map.containsKey(MBInterstitialActivity.INTENT_CAMAPIGN) ? (CampaignEx) map.get(MBInterstitialActivity.INTENT_CAMAPIGN) : null;
        boolean zBooleanValue = map.containsKey("isIV") ? ((Boolean) map.get("isIV")).booleanValue() : false;
        int iIntValue2 = map.containsKey("videoSkipTime") ? ((Integer) map.get("videoSkipTime")).intValue() : 0;
        int iIntValue3 = map.containsKey("allDuration") ? ((Integer) map.get("allDuration")).intValue() : 0;
        int iIntValue4 = map.containsKey("curPlayPosition") ? ((Integer) map.get("curPlayPosition")).intValue() : 0;
        if (zBooleanValue) {
            StringBuilder sb = new StringBuilder();
            sb.append(iIntValue3 - iIntValue4);
            strN = sb.toString();
        } else {
            if (iIntValue > iIntValue3) {
                iIntValue = iIntValue3;
            }
            int i2 = iIntValue <= 0 ? iIntValue3 - iIntValue4 : iIntValue - iIntValue4;
            if (i2 <= 0) {
                strN = iIntValue <= 0 ? "0" : (String) com.mbridge.msdk.foundation.controller.c.n().d().getResources().getText(g0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
            } else if (iIntValue <= 0) {
                strN = AbstractC3950lJ.n(i2, "");
            } else {
                strN = i2 + ((String) com.mbridge.msdk.foundation.controller.c.n().d().getResources().getText(g0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left", TypedValues.Custom.S_STRING)));
            }
        }
        if (campaignEx.getUseSkipTime() == 1) {
            int iMin = Math.min(iIntValue2, iIntValue3);
            if (iMin >= iIntValue || iMin < 0) {
                int i3 = iIntValue - iIntValue4;
                if (zBooleanValue) {
                    if (i3 > 0) {
                        strN = i3 + ((String) com.mbridge.msdk.foundation.controller.c.n().d().getText(g0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING)));
                    } else if (i3 == 0) {
                        i = 8;
                    }
                }
            } else {
                int i4 = iMin - iIntValue4;
                if (i4 > 0) {
                    strN = i4 + ((String) com.mbridge.msdk.foundation.controller.c.n().d().getText(g0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING)));
                } else if (zBooleanValue && i4 == 0) {
                    i = 8;
                }
            }
        }
        HashMap mapV = AbstractC3950lJ.v("countMsg", strN);
        mapV.put("valueVisible", Integer.valueOf(i));
        return mapV;
    }
}
