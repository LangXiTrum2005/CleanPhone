package com.thinkup.core.common.n;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.GeolocationPermissions;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.IDlHandler;
import com.thinkup.core.api.IExHandler;
import com.thinkup.core.api.IExHandlerBaseAd;
import com.thinkup.core.api.IOdHandler;
import com.thinkup.core.api.IOsExHandler;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUEventInterface;
import com.thinkup.core.api.TUOsDmEntity;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o0m implements IDlHandler, IExHandler, IOdHandler, IOsExHandler {
    private final IDlHandler m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IOdHandler f41917n;
    private final IExHandler o;
    private final IOsExHandler o0;

    public o0m(IExHandler iExHandler, IDlHandler iDlHandler, IOdHandler iOdHandler, IOsExHandler iOsExHandler) {
        this.o = iExHandler;
        this.m = iDlHandler;
        this.f41917n = iOdHandler;
        this.o0 = iOsExHandler;
    }

    @Override // com.thinkup.core.api.IExHandler
    public final void addPlLoadStateListener(com.thinkup.core.common.mm.o0 o0Var) {
        IExHandler iExHandler = this.o;
        if (iExHandler != null) {
            iExHandler.addPlLoadStateListener(o0Var);
        }
    }

    @Override // com.thinkup.core.api.IDlHandler
    public final int checkDataFetchType(com.thinkup.core.common.on.ooo oooVar, com.thinkup.core.common.on.oom oomVar) {
        IDlHandler iDlHandler = this.m;
        if (iDlHandler == null) {
            return 0;
        }
        iDlHandler.checkDataFetchType(oooVar, oomVar);
        return 0;
    }

    @Override // com.thinkup.core.api.IOdHandler
    public final boolean checkDebuggerDevice(Context context, String str) {
        IOdHandler iOdHandler = this.f41917n;
        if (iOdHandler != null) {
            return iOdHandler.checkDebuggerDevice(context, str);
        }
        return false;
    }

    @Override // com.thinkup.core.api.IDlHandler
    public final void cleanExpiredInfo() {
        IDlHandler iDlHandler = this.m;
        if (iDlHandler != null) {
            iDlHandler.cleanExpiredInfo();
        }
    }

    @Override // com.thinkup.core.api.IExHandler
    public final TUEventInterface createDataFetchListener(TUBaseAdAdapter tUBaseAdAdapter, BaseAd baseAd, TUEventInterface tUEventInterface) {
        IExHandler iExHandler = this.o;
        if (iExHandler != null) {
            return iExHandler.createDataFetchListener(tUBaseAdAdapter, baseAd, tUEventInterface);
        }
        return null;
    }

    @Override // com.thinkup.core.api.IExHandler, com.thinkup.core.api.IOdHandler
    public final String fillCDataParam(String str) {
        IExHandler iExHandler = this.o;
        if (iExHandler != null) {
            str = iExHandler.fillCDataParam(str);
        }
        IOdHandler iOdHandler = this.f41917n;
        if (iOdHandler != null) {
            str = iOdHandler.fillCDataParam(str);
        }
        return !TextUtils.isEmpty(str) ? str.replace("at_device1", "").replace("at_device2", "").replace("at_device3", "") : str;
    }

    @Override // com.thinkup.core.api.IDlHandler
    public final void fillDataFetchStatus(Context context, com.thinkup.core.common.on.ooo oooVar, com.thinkup.core.common.on.oom oomVar) {
        IDlHandler iDlHandler = this.m;
        if (iDlHandler != null) {
            iDlHandler.fillDataFetchStatus(context, oooVar, oomVar);
        }
    }

    @Override // com.thinkup.core.api.IExHandler
    public final void fillRequestData(JSONObject jSONObject, com.thinkup.core.oo.m mVar) {
        IExHandler iExHandler = this.o;
        if (iExHandler != null) {
            iExHandler.fillRequestData(jSONObject, mVar);
        }
    }

    @Override // com.thinkup.core.api.IDlHandler
    public final void fillRequestDataForDl(JSONObject jSONObject) {
        IDlHandler iDlHandler = this.m;
        if (iDlHandler != null) {
            iDlHandler.fillRequestDataForDl(jSONObject);
        }
    }

    @Override // com.thinkup.core.api.IExHandler
    public final void fillRequestDeviceData(JSONObject jSONObject, int i2) {
        IExHandler iExHandler = this.o;
        if (iExHandler != null) {
            iExHandler.fillRequestDeviceData(jSONObject, i2);
        }
    }

    @Override // com.thinkup.core.api.IExHandler, com.thinkup.core.api.IOdHandler
    public final void fillTestDeviceData(JSONObject jSONObject, com.thinkup.core.oo.m mVar) {
        IExHandler iExHandler = this.o;
        if (iExHandler != null) {
            iExHandler.fillTestDeviceData(jSONObject, mVar);
        }
        IOdHandler iOdHandler = this.f41917n;
        if (iOdHandler != null) {
            iOdHandler.fillTestDeviceData(jSONObject, mVar);
        }
    }

    @Override // com.thinkup.core.api.IExHandler
    public final String getAid(Context context) {
        IExHandler iExHandler = this.o;
        return iExHandler != null ? iExHandler.getAid(context) : "";
    }

    @Override // com.thinkup.core.api.IDlHandler
    public final IExHandlerBaseAd getBaseAdHandler() {
        IDlHandler iDlHandler = this.m;
        if (iDlHandler != null) {
            return iDlHandler.getBaseAdHandler();
        }
        return null;
    }

    @Override // com.thinkup.core.api.IOsExHandler
    public final String getCdnUrl() {
        IOsExHandler iOsExHandler = this.o0;
        return iOsExHandler != null ? iOsExHandler.getCdnUrl() : "";
    }

    @Override // com.thinkup.core.api.IExHandler
    public final JSONObject getCnDInfo() {
        IExHandler iExHandler = this.o;
        if (iExHandler != null) {
            return iExHandler.getCnDInfo();
        }
        return null;
    }

    @Override // com.thinkup.core.api.IExHandler
    public final String getDefaultMarketSchemePackageName() {
        IExHandler iExHandler = this.o;
        return iExHandler != null ? iExHandler.getDefaultMarketSchemePackageName() : "com.android.vending";
    }

    @Override // com.thinkup.core.api.IOsExHandler
    public final String getGdprUrl() {
        IOsExHandler iOsExHandler = this.o0;
        return iOsExHandler != null ? iOsExHandler.getGdprUrl() : "";
    }

    @Override // com.thinkup.core.api.IOsExHandler
    public final TUOsDmEntity getOsDmEntity() {
        IOsExHandler iOsExHandler = this.o0;
        if (iOsExHandler != null) {
            return iOsExHandler.getOsDmEntity();
        }
        return null;
    }

    @Override // com.thinkup.core.api.IExHandler, com.thinkup.core.api.IOdHandler
    public final String getUniqueId(Context context) {
        IOdHandler iOdHandler;
        IExHandler iExHandler = this.o;
        String uniqueId = iExHandler != null ? iExHandler.getUniqueId(context) : "";
        return (!TextUtils.isEmpty(uniqueId) || (iOdHandler = this.f41917n) == null) ? uniqueId : iOdHandler.getUniqueId(context);
    }

    @Override // com.thinkup.core.api.IDlHandler
    public final void handleOfferClick(Context context, com.thinkup.core.common.on.oom oomVar, com.thinkup.core.common.on.ooo oooVar, String str, String str2, Runnable runnable, com.thinkup.core.common.mm.m mVar) {
        IDlHandler iDlHandler = this.m;
        if (iDlHandler != null) {
            iDlHandler.handleOfferClick(context, oomVar, oooVar, str, str2, runnable, mVar);
        }
    }

    @Override // com.thinkup.core.api.IExHandler, com.thinkup.core.api.IOdHandler
    public final void initDeviceInfo(Context context) {
        IOdHandler iOdHandler = this.f41917n;
        if (iOdHandler != null) {
            iOdHandler.initDeviceInfo(context);
        }
        IExHandler iExHandler = this.o;
        if (iExHandler != null) {
            iExHandler.initDeviceInfo(context);
        }
    }

    @Override // com.thinkup.core.api.IExHandler
    public final boolean isContainsPlStr(String str) {
        IExHandler iExHandler = this.o;
        if (iExHandler != null) {
            return iExHandler.isContainsPlStr(str);
        }
        return false;
    }

    public final boolean o() {
        return this.m != null;
    }

    @Override // com.thinkup.core.api.IDlHandler
    public final void onAppForegroundStatusChanged(boolean z2) {
        IDlHandler iDlHandler = this.m;
        if (iDlHandler != null) {
            iDlHandler.onAppForegroundStatusChanged(z2);
        }
    }

    @Override // com.thinkup.core.api.IDlHandler
    public final void onApplicationBoot() {
        IDlHandler iDlHandler = this.m;
        if (iDlHandler != null) {
            iDlHandler.onApplicationBoot();
        }
    }

    @Override // com.thinkup.core.api.IExHandler
    public final boolean onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        IExHandler iExHandler = this.o;
        if (iExHandler != null) {
            return iExHandler.onGeolocationPermissionsShowPrompt(str, callback);
        }
        return false;
    }

    @Override // com.thinkup.core.api.IDlHandler
    public final void openDataConfirmDialog(Context context, com.thinkup.core.common.on.ooo oooVar, com.thinkup.core.common.on.oom oomVar, com.thinkup.core.common.mm.o oVar) {
        IDlHandler iDlHandler = this.m;
        if (iDlHandler != null) {
            iDlHandler.openDataConfirmDialog(context, oooVar, oomVar, oVar);
        }
    }

    @Override // com.thinkup.core.api.IExHandler
    public final void resetSSID() {
        IExHandler iExHandler = this.o;
        if (iExHandler != null) {
            iExHandler.resetSSID();
        }
    }

    @Override // com.thinkup.core.api.IExHandler
    public final void startPlugin(Context context) {
        IExHandler iExHandler = this.o;
        if (iExHandler != null) {
            iExHandler.startPlugin(context);
        }
    }

    @Override // com.thinkup.core.api.IExHandler
    public final void startRefreshes(long j) {
        IExHandler iExHandler = this.o;
        if (iExHandler != null) {
            iExHandler.startRefreshes(j);
        }
    }

    @Override // com.thinkup.core.api.IExHandler
    public final void uploadAegisData(com.thinkup.core.oo.m mVar) {
        IExHandler iExHandler = this.o;
        if (iExHandler != null) {
            iExHandler.uploadAegisData(mVar);
        }
    }

    @Override // com.thinkup.core.api.IExHandler, com.thinkup.core.api.IOdHandler
    public final void fillRequestData(JSONObject jSONObject, com.thinkup.core.oo.m mVar, int i2) {
        IExHandler iExHandler = this.o;
        if (iExHandler != null) {
            iExHandler.fillRequestData(jSONObject, mVar, i2);
        }
        IOdHandler iOdHandler = this.f41917n;
        if (iOdHandler != null) {
            iOdHandler.fillRequestData(jSONObject, mVar, i2);
        }
    }
}
