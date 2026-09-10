package com.mbridge.msdk.newreward.player.presenter;

import android.app.Activity;
import android.view.ViewGroup;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.adapter.e;
import com.mbridge.msdk.newreward.function.command.a;
import com.mbridge.msdk.newreward.function.command.c;
import com.mbridge.msdk.newreward.function.command.d;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.player.iview.IMetaData;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityPresenter {
    e adapterModel;
    c commandManager;
    d commandManagerGlobal;
    IMetaData mMetaData;

    public ActivityPresenter(IMetaData iMetaData, String str) {
        try {
            this.commandManagerGlobal = d.b();
            this.commandManager = d.b().a();
            this.adapterModel = this.commandManagerGlobal.b(str);
            IMetaData iMetaData2 = (IMetaData) Proxy.newProxyInstance(iMetaData.getClass().getClassLoader(), iMetaData.getClass().getInterfaces(), new com.mbridge.msdk.newreward.function.proxy.e(iMetaData, this.adapterModel, this.commandManager));
            this.mMetaData = iMetaData2;
            iMetaData2.setDate(this.adapterModel);
            this.mMetaData.activityReport("onCreate");
            this.commandManager.b((a) new com.mbridge.msdk.newreward.function.command.concretecommand.c());
            String strE = this.adapterModel.h0() ? this.adapterModel.E() : this.adapterModel.H() == null ? String.valueOf(this.adapterModel.g().a().d()) : this.adapterModel.Q();
            setActivityOrientation(iMetaData);
            addTemplate(strE, iMetaData.getRootViewGroup());
        } catch (Exception e) {
            IMetaData iMetaData3 = this.mMetaData;
            if (iMetaData3 != null) {
                iMetaData3.onShowFail(com.mbridge.msdk.foundation.error.a.a(890010), 890010);
            }
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void addTemplate(String str, ViewGroup viewGroup) {
        try {
            c cVar = this.commandManager;
            cVar.c(cVar.a("add_temple", str, "adapter_model", this.adapterModel, "template_type", 17, "parent_temple", viewGroup), f.SHOW_ADD_TEMPLE);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Multi-variable type inference failed */
    private void setActivityOrientation(IMetaData iMetaData) {
        byte b;
        try {
            if (iMetaData instanceof Activity) {
                Activity activity = (Activity) iMetaData;
                String strQ = this.adapterModel.Q();
                int iHashCode = strQ.hashCode();
                if (iHashCode != 50549) {
                    if (iHashCode != 55354) {
                        if (iHashCode == 1213120338 && strQ.equals("5002010")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                    } else if (strQ.equals("802")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (strQ.equals("302")) {
                    b = 0;
                } else {
                    b = -1;
                }
                if (b == 0 || b == 1 || b == 2) {
                    activity.setRequestedOrientation(1);
                } else {
                    activity.setRequestedOrientation(this.adapterModel.F());
                }
            }
        } catch (Throwable th) {
            o0.b("ActivityPresenter", th.getMessage());
        }
    }

    public void bindMethodName(String str) {
        try {
            c cVar = this.commandManager;
            Object[] objArr = new Object[6];
            boolean z = false;
            objArr[0] = "life_cycle";
            objArr[1] = str;
            objArr[2] = "parent_temple";
            objArr[3] = this.mMetaData.getRootViewGroup();
            objArr[4] = "is_dy";
            e eVar = this.adapterModel;
            if (eVar != null && eVar.c0()) {
                z = true;
            }
            objArr[5] = Boolean.valueOf(z);
            cVar.g(cVar.a(objArr), f.SHOW_LIFE_CYCLE);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        if (str.equals("onDestroy") || str.equals("onCreate")) {
            this.mMetaData.activityReport(str);
        }
        if (str.equals("onDestroy")) {
            try {
                e eVar2 = this.adapterModel;
                if (eVar2 != null) {
                    d dVar = this.commandManagerGlobal;
                    if (dVar != null) {
                        dVar.a(eVar2.A());
                    }
                    com.mbridge.msdk.newreward.function.command.receiver.d.a().a(this.adapterModel.A());
                    com.mbridge.msdk.newreward.function.command.receiver.d.a().d(f.SHOW_OR_PRELOAD_WEB_EC);
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
