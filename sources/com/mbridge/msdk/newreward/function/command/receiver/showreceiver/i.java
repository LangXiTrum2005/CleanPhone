package com.mbridge.msdk.newreward.function.command.receiver.showreceiver;

import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.player.model.WebTemplateModel;
import com.mbridge.msdk.newreward.player.view.WebViewTemplate;
import com.mbridge.msdk.newreward.player.view.hybrid.MBWebView;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i implements com.mbridge.msdk.newreward.function.command.receiver.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1655a = "WebTemplateReceiver";
    MBWebView b = null;
    WebTemplateModel c = null;
    Handler d = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.newreward.adapter.e f1656a;
        final /* synthetic */ String b;

        public a(com.mbridge.msdk.newreward.adapter.e eVar, String str) {
            this.f1656a = eVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(com.mbridge.msdk.foundation.controller.c.n().d());
            try {
                i.this.b = new MBWebView(mutableContextWrapper);
                i.this.c = new WebTemplateModel(null, this.f1656a);
                i.this.c.setRenderType(2);
                i iVar = i.this;
                iVar.b.setHybridCommunicator(iVar.c);
                i iVar2 = i.this;
                iVar2.b.setWebViewEventListener(iVar2.c);
                i.this.b.loadUrl(this.b);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                this.f1656a.B().a(this.f1656a, eVar.a(), "2000154");
            } catch (Throwable unused) {
                this.f1656a.g(false);
                i.this.b = null;
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1657a;
        final /* synthetic */ ViewGroup b;

        public b(String str, ViewGroup viewGroup) {
            this.f1657a = str;
            this.b = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iOptInt;
            int iOptInt2;
            try {
                JSONObject jSONObject = new JSONObject(this.f1657a);
                iOptInt = jSONObject.optInt("showTransparent");
                try {
                    iOptInt2 = jSONObject.optInt("webfront");
                } catch (Throwable th) {
                    th = th;
                    o0.b("WebTemplateReceiver", th.getMessage());
                    iOptInt2 = 0;
                }
            } catch (Throwable th2) {
                th = th2;
                iOptInt = 0;
            }
            if (iOptInt == 1) {
                i.this.b.setBackgroundColor(0);
            }
            WebViewTemplate webViewTemplate = new WebViewTemplate(this.b.getContext());
            webViewTemplate.addWebView(i.this.b, iOptInt2);
            webViewTemplate.show(this.b);
        }
    }

    @Override // com.mbridge.msdk.newreward.function.command.receiver.b
    public void a(Object obj) {
        int iF;
        WebTemplateModel webTemplateModel;
        Map map = (Map) obj;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            Object obj2 = map.get("web_resource_action");
            int iIntValue = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 1;
            ViewGroup viewGroup = (map.containsKey("parent_temple") && (map.get("parent_temple") instanceof ViewGroup)) ? (ViewGroup) map.get("parent_temple") : null;
            String str = (String) map.get("bridge_ids");
            com.mbridge.msdk.newreward.adapter.e eVar = (com.mbridge.msdk.newreward.adapter.e) map.get("adapter_model");
            com.mbridge.msdk.newreward.function.command.c cVar = (com.mbridge.msdk.newreward.function.command.c) map.get("command_manager");
            if (eVar == null) {
                return;
            }
            String absolutePath = "";
            Iterator<com.mbridge.msdk.newreward.function.core.campaign.a> it = eVar.g().a().g().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                iF = TypedValues.Custom.TYPE_BOOLEAN;
                if (!zHasNext) {
                    break;
                }
                com.mbridge.msdk.newreward.function.core.campaign.a next = it.next();
                if (next.i().equals(str)) {
                    Object objH = next.g().h();
                    absolutePath = objH instanceof String ? (String) objH : "";
                    if (objH instanceof File) {
                        File file = (File) objH;
                        if (file.exists()) {
                            absolutePath = file.getAbsolutePath();
                        }
                    }
                    if (next.a() != null && next.a().getRewardTemplateMode() != null) {
                        iF = next.a().getRewardTemplateMode().f();
                        break;
                    } else {
                        break;
                        break;
                    }
                }
            }
            if (TextUtils.isEmpty(absolutePath)) {
                if (iIntValue == 2) {
                    a(iF, cVar, eVar, viewGroup);
                    return;
                }
                return;
            }
            if (iIntValue == 1) {
                this.d.post(new a(eVar, absolutePath));
            }
            if (iIntValue == 2) {
                if (this.b != null && (webTemplateModel = this.c) != null) {
                    int renderStatus = webTemplateModel.getRenderStatus();
                    String h5InitCallbackParameter = this.c.getH5InitCallbackParameter();
                    if ((renderStatus == 2 || renderStatus == 3) && viewGroup != null) {
                        this.d.post(new b(h5InitCallbackParameter, viewGroup));
                        return;
                    } else {
                        a(iF, cVar, eVar, viewGroup);
                        return;
                    }
                }
                a(iF, cVar, eVar, viewGroup);
            }
        } catch (Throwable th) {
            o0.b("WebTemplateReceiver", th.getMessage());
        }
    }

    private void a(int i, com.mbridge.msdk.newreward.function.command.c cVar, com.mbridge.msdk.newreward.adapter.e eVar, ViewGroup viewGroup) {
        if (cVar != null) {
            try {
                cVar.c(cVar.a("add_temple", Integer.valueOf(i), "template_type", 17, "adapter_model", eVar, "parent_temple", viewGroup), com.mbridge.msdk.newreward.function.command.f.SHOW_ADD_TEMPLE);
            } catch (Throwable th) {
                o0.b("WebTemplateReceiver", th.getMessage());
            }
        }
    }
}
