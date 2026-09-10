package com.mbridge.msdk.newreward.function.command.receiver.showreceiver;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.player.view.ectemplate.WebViewEC;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class h implements com.mbridge.msdk.newreward.function.command.receiver.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WebViewEC f1654a = null;

    @Override // com.mbridge.msdk.newreward.function.command.receiver.b
    public void a(Object obj) {
        String str;
        String strA;
        int i;
        String strN;
        Map map = (Map) obj;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            Object obj2 = map.get("web_resource_action");
            int iIntValue = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 1;
            ViewGroup viewGroup = (ViewGroup) map.get("parent_temple");
            String str2 = (String) map.get("bridge_ids");
            com.mbridge.msdk.newreward.adapter.e eVar = (com.mbridge.msdk.newreward.adapter.e) map.get("adapter_model");
            com.mbridge.msdk.newreward.function.command.c cVar = (com.mbridge.msdk.newreward.function.command.c) map.get("command_manager");
            if (eVar != null && viewGroup != null) {
                String strValueOf = "404";
                Iterator<com.mbridge.msdk.newreward.function.core.campaign.a> it = eVar.g().a().g().iterator();
                while (true) {
                    str = "";
                    if (!it.hasNext()) {
                        strA = "";
                        i = 1;
                        break;
                    }
                    com.mbridge.msdk.newreward.function.core.campaign.a next = it.next();
                    if (next.i().equals(str2)) {
                        if (next.a() != null) {
                            strValueOf = String.valueOf(next.a().getEcTemplateId());
                            strN = next.a().getEndScreenUrl();
                        } else {
                            strN = "";
                        }
                        int adType = next.a().getAdType();
                        if (next.k() && next.d() != null) {
                            strN = next.d().n();
                            if (TextUtils.isEmpty(strN)) {
                                strN = "";
                            } else if (!strN.startsWith("file:")) {
                                strN = "file:////" + strN;
                            }
                            i = 2;
                        } else if (next.b() != null) {
                            Object objH = next.b().h();
                            String absolutePath = objH instanceof String ? (String) next.b().h() : "";
                            if (objH instanceof File) {
                                absolutePath = ((File) objH).getAbsolutePath();
                            }
                            if (!TextUtils.isEmpty(absolutePath)) {
                                strN = absolutePath;
                            }
                            i = !TextUtils.isEmpty(absolutePath) ? 1 : 3;
                            if (!TextUtils.isEmpty(strN)) {
                                strN = strN + "&native_adtype=" + adType;
                            }
                        } else if (TextUtils.isEmpty(strN)) {
                            strN = "";
                            i = 1;
                        } else {
                            strN = strN + "&native_adtype=" + adType;
                            i = 3;
                        }
                        strA = iIntValue == 4 ? com.mbridge.msdk.click.c.a(next.a().getClickURL(), "-999", "-999") : "";
                        str = strN;
                        break;
                    }
                }
                if (this.f1654a == null) {
                    WebViewEC webViewEC = new WebViewEC(viewGroup.getContext());
                    this.f1654a = webViewEC;
                    if (webViewEC.getParent() == null) {
                        this.f1654a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        viewGroup.addView(this.f1654a, 0);
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar2.a("type", 3);
                    eVar.B().a(eVar, eVar2.a(), "2000154");
                }
                this.f1654a.setRenderUrlType(i);
                if (iIntValue == 1) {
                    this.f1654a.preloadWebContent(str);
                }
                if (iIntValue == 2) {
                    int renderStatus = this.f1654a.getRenderStatus();
                    if (!TextUtils.isEmpty(str) && renderStatus != 1) {
                        this.f1654a.show(viewGroup);
                        return;
                    }
                    a(cVar, strValueOf, eVar, viewGroup);
                }
                if (iIntValue == 3) {
                    if (TextUtils.isEmpty(str)) {
                        a(cVar, strValueOf, eVar, viewGroup);
                    } else {
                        this.f1654a.preloadWebContent(str);
                        this.f1654a.show(viewGroup);
                    }
                }
                if (iIntValue == 4) {
                    this.f1654a.preloadWebContent(strA);
                    this.f1654a.show(viewGroup);
                }
            }
        } catch (Throwable th) {
            o0.b("WebECReceiver", th.getMessage());
        }
    }

    private void a(com.mbridge.msdk.newreward.function.command.c cVar, String str, com.mbridge.msdk.newreward.adapter.e eVar, ViewGroup viewGroup) {
        if (cVar != null) {
            cVar.c(cVar.a("add_temple", str, "template_type", 18, "adapter_model", eVar, "parent_temple", viewGroup), com.mbridge.msdk.newreward.function.command.f.SHOW_ADD_TEMPLE);
            this.f1654a.removeTempleFromSuperView(viewGroup);
            com.mbridge.msdk.newreward.function.command.receiver.d.a().d(com.mbridge.msdk.newreward.function.command.f.SHOW_OR_PRELOAD_WEB_EC);
        }
    }
}
