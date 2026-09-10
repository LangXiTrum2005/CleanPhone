package com.mbridge.msdk.newreward.function.command.receiver.showreceiver;

import android.view.ViewGroup;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.player.view.Template102;
import com.mbridge.msdk.newreward.player.view.Template202;
import com.mbridge.msdk.newreward.player.view.Template302;
import com.mbridge.msdk.newreward.player.view.Template5002010;
import com.mbridge.msdk.newreward.player.view.Template802;
import com.mbridge.msdk.newreward.player.view.Template902;
import com.mbridge.msdk.newreward.player.view.Template904;
import com.mbridge.msdk.newreward.player.view.bigtemplate.Template201;
import com.mbridge.msdk.newreward.player.view.ectemplate.TemplateEC1302;
import com.mbridge.msdk.newreward.player.view.ectemplate.TemplateEC404;
import com.mbridge.msdk.newreward.player.view.ectemplate.TemplateEC704;
import com.mbridge.msdk.newreward.player.view.ectemplate.TemplateHalfEC;
import com.mbridge.msdk.newreward.player.view.ectemplate.TemplateVastEC;
import com.mbridge.msdk.newreward.player.view.halfoffer.TemplateEndCover;
import com.mbridge.msdk.newreward.player.view.halfoffer.TemplateHalf;
import com.umeng.analytics.pro.cw;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class b implements com.mbridge.msdk.newreward.function.command.receiver.b {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.mbridge.msdk.newreward.function.command.receiver.b
    public void a(Object obj) {
        Map map = (Map) obj;
        String strValueOf = String.valueOf(map.get("add_temple"));
        ViewGroup viewGroup = (ViewGroup) map.get("parent_temple");
        com.mbridge.msdk.newreward.adapter.e eVar = (com.mbridge.msdk.newreward.adapter.e) map.get("adapter_model");
        com.mbridge.msdk.newreward.function.command.c cVarA = com.mbridge.msdk.newreward.function.command.d.b().a();
        byte b = -1;
        switch (strValueOf.hashCode()) {
            case -1738448503:
                if (strValueOf.equals("WEB_EC")) {
                    b = 0;
                }
                break;
            case -1623688923:
                if (strValueOf.equals("WEB_TEMPLATE")) {
                    b = 1;
                }
                break;
            case -1517363552:
                if (strValueOf.equals("HALF_END_CARD")) {
                    b = 2;
                }
                break;
            case -1207348799:
                if (strValueOf.equals("ONLY_PLAYABLE")) {
                    b = 3;
                }
                break;
            case -298533114:
                if (strValueOf.equals("HALF_TEMPLATE")) {
                    b = 4;
                }
                break;
            case 48627:
                if (strValueOf.equals(MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE)) {
                    b = 5;
                }
                break;
            case 49587:
                if (strValueOf.equals("201")) {
                    b = 6;
                }
                break;
            case 49588:
                if (strValueOf.equals("202")) {
                    b = 7;
                }
                break;
            case 50549:
                if (strValueOf.equals("302")) {
                    b = 8;
                }
                break;
            case 51512:
                if (strValueOf.equals("404")) {
                    b = 9;
                }
                break;
            case 54395:
                if (strValueOf.equals("704")) {
                    b = 10;
                }
                break;
            case 55354:
                if (strValueOf.equals("802")) {
                    b = 11;
                }
                break;
            case 56315:
                if (strValueOf.equals("902")) {
                    b = 12;
                }
                break;
            case 56317:
                if (strValueOf.equals("904")) {
                    b = cw.k;
                }
                break;
            case 1510308:
                if (strValueOf.equals("1302")) {
                    b = cw.l;
                }
                break;
            case 2627148:
                if (strValueOf.equals("VAST")) {
                    b = cw.m;
                }
                break;
            case 563693366:
                if (strValueOf.equals("SHOW_CLICK_URL")) {
                    b = cw.n;
                }
                break;
            case 1213120338:
                if (strValueOf.equals("5002010")) {
                    b = 17;
                }
                break;
            case 1277364343:
                if (strValueOf.equals("HALF_TEMPLATE_EC")) {
                    b = 18;
                }
                break;
        }
        switch (b) {
            case 0:
                Object[] objArr = new Object[10];
                objArr[0] = "web_resource_action";
                objArr[1] = 2;
                objArr[2] = "parent_temple";
                objArr[3] = viewGroup;
                objArr[4] = "adapter_model";
                objArr[5] = eVar;
                objArr[6] = "command_manager";
                objArr[7] = cVarA;
                objArr[8] = "bridge_ids";
                objArr[9] = eVar != null ? eVar.I() : "";
                cVarA.i(cVarA.a(objArr), com.mbridge.msdk.newreward.function.command.f.SHOW_OR_PRELOAD_WEB_EC);
                break;
            case 1:
                Object[] objArr2 = new Object[12];
                objArr2[0] = "web_resource_action";
                objArr2[1] = 2;
                objArr2[2] = "parent_temple";
                objArr2[3] = viewGroup;
                objArr2[4] = "adapter_model";
                objArr2[5] = eVar;
                objArr2[6] = "command_manager";
                objArr2[7] = cVarA;
                objArr2[8] = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
                objArr2[9] = eVar != null ? eVar.A() : "";
                objArr2[10] = "bridge_ids";
                objArr2[11] = eVar != null ? eVar.I() : "";
                cVarA.i(cVarA.a(objArr2), com.mbridge.msdk.newreward.function.command.f.SHOW_OR_PRELOAD_WEB_TEMPLATE);
                break;
            case 2:
                new TemplateHalfEC(viewGroup.getContext()).show(viewGroup);
                break;
            case 3:
                Object[] objArr3 = new Object[10];
                objArr3[0] = "web_resource_action";
                objArr3[1] = 3;
                objArr3[2] = "parent_temple";
                objArr3[3] = viewGroup;
                objArr3[4] = "adapter_model";
                objArr3[5] = eVar;
                objArr3[6] = "command_manager";
                objArr3[7] = cVarA;
                objArr3[8] = "bridge_ids";
                objArr3[9] = eVar != null ? eVar.I() : "";
                cVarA.i(cVarA.a(objArr3), com.mbridge.msdk.newreward.function.command.f.SHOW_OR_PRELOAD_WEB_EC);
                break;
            case 4:
                new TemplateHalf(viewGroup.getContext()).show(viewGroup);
                break;
            case 5:
                new Template102(viewGroup.getContext()).show(viewGroup);
                break;
            case 6:
                new Template201(viewGroup.getContext()).show(viewGroup);
                break;
            case 7:
                new Template202(viewGroup.getContext()).show(viewGroup);
                break;
            case 8:
                new Template302(viewGroup.getContext()).show(viewGroup);
                break;
            case 9:
                new TemplateEC404(viewGroup.getContext()).show(viewGroup);
                break;
            case 10:
                new TemplateEC704(viewGroup.getContext()).show(viewGroup);
                break;
            case 11:
                new Template802(viewGroup.getContext()).show(viewGroup);
                break;
            case 12:
                new Template902(viewGroup.getContext()).show(viewGroup);
                break;
            case 13:
                new Template904(viewGroup.getContext()).show(viewGroup);
                break;
            case 14:
                new TemplateEC1302(viewGroup.getContext()).show(viewGroup);
                break;
            case 15:
                new TemplateVastEC(viewGroup.getContext()).show(viewGroup);
                break;
            case 16:
                Object[] objArr4 = new Object[10];
                objArr4[0] = "web_resource_action";
                objArr4[1] = 4;
                objArr4[2] = "parent_temple";
                objArr4[3] = viewGroup;
                objArr4[4] = "adapter_model";
                objArr4[5] = eVar;
                objArr4[6] = "command_manager";
                objArr4[7] = cVarA;
                objArr4[8] = "bridge_ids";
                objArr4[9] = eVar != null ? eVar.I() : "";
                cVarA.i(cVarA.a(objArr4), com.mbridge.msdk.newreward.function.command.f.SHOW_OR_PRELOAD_WEB_EC);
                break;
            case 17:
                new Template5002010(viewGroup.getContext()).show(viewGroup);
                break;
            case 18:
                new TemplateEndCover(viewGroup.getContext()).show(viewGroup);
                break;
            default:
                Object obj2 = map.get("template_type");
                if (obj2 instanceof Integer) {
                    int iIntValue = ((Integer) obj2).intValue();
                    if (iIntValue == 17) {
                        new Template904(viewGroup.getContext()).show(viewGroup);
                    } else if (iIntValue == 18) {
                        new TemplateEC404(viewGroup.getContext()).show(viewGroup);
                    }
                }
                break;
        }
    }
}
