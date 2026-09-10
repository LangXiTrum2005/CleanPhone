package com.smartdigimkt.s6;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.GeolocationPermissions;
import com.smartdigimkt.sdk.api.IDlHandler;
import com.smartdigimkt.sdk.api.IExHandler;
import com.smartdigimkt.sdk.api.IExHandlerBaseAd;
import com.smartdigimkt.sdk.api.IOdHandler;
import com.smartdigimkt.sdk.api.IOsExHandler;
import com.smartdigimkt.sdk.api.SDMEventInterface;
import com.smartdigimkt.sdk.api.SDMOsDmEntity;
import com.smartdigimkt.w6.f;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class c implements IExHandler, IDlHandler, IOdHandler, IOsExHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IExHandler f38207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IDlHandler f38208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IOdHandler f38209c;
    private final IOsExHandler d;

    public c(IExHandler iExHandler, IDlHandler iDlHandler, IOdHandler iOdHandler, IOsExHandler iOsExHandler) {
        this.f38207a = iExHandler;
        this.f38208b = iDlHandler;
        this.f38209c = iOdHandler;
        this.d = iOsExHandler;
    }

    public boolean a() {
        return this.f38208b != null;
    }

    @Override // com.smartdigimkt.sdk.api.IDlHandler
    public int checkDataFetchType(f fVar, com.smartdigimkt.v6.a aVar) {
        IDlHandler iDlHandler = this.f38208b;
        if (iDlHandler == null) {
            return 0;
        }
        iDlHandler.checkDataFetchType(fVar, aVar);
        return 0;
    }

    @Override // com.smartdigimkt.sdk.api.IOdHandler
    public boolean checkDebuggerDevice(Context context, String str) {
        IOdHandler iOdHandler = this.f38209c;
        if (iOdHandler != null) {
            return iOdHandler.checkDebuggerDevice(context, str);
        }
        return false;
    }

    @Override // com.smartdigimkt.sdk.api.IDlHandler
    public void cleanExpiredInfo() {
        IDlHandler iDlHandler = this.f38208b;
        if (iDlHandler != null) {
            iDlHandler.cleanExpiredInfo();
        }
    }

    @Override // com.smartdigimkt.sdk.api.IDlHandler
    public SDMEventInterface createDataFetchListener(SDMEventInterface sDMEventInterface) {
        IDlHandler iDlHandler = this.f38208b;
        if (iDlHandler != null) {
            return iDlHandler.createDataFetchListener(sDMEventInterface);
        }
        return null;
    }

    @Override // com.smartdigimkt.sdk.api.IExHandler, com.smartdigimkt.sdk.api.IOdHandler
    public String fillCDataParam(String str) {
        IExHandler iExHandler = this.f38207a;
        if (iExHandler != null) {
            str = iExHandler.fillCDataParam(str);
        }
        IOdHandler iOdHandler = this.f38209c;
        if (iOdHandler != null) {
            str = iOdHandler.fillCDataParam(str);
        }
        return !TextUtils.isEmpty(str) ? str.replace("at_device1", "").replace("at_device2", "").replace("at_device3", "") : str;
    }

    @Override // com.smartdigimkt.sdk.api.IDlHandler
    public void fillDataFetchStatus(Context context, f fVar, com.smartdigimkt.v6.a aVar) {
        IDlHandler iDlHandler = this.f38208b;
        if (iDlHandler != null) {
            iDlHandler.fillDataFetchStatus(context, fVar, aVar);
        }
    }

    @Override // com.smartdigimkt.sdk.api.IExHandler
    public void fillRequestData(JSONObject jSONObject, com.smartdigimkt.l8.a aVar) {
        IExHandler iExHandler = this.f38207a;
        if (iExHandler != null) {
            iExHandler.fillRequestData(jSONObject, aVar);
        }
    }

    @Override // com.smartdigimkt.sdk.api.IDlHandler
    public void fillRequestDataForDl(JSONObject jSONObject) {
        IDlHandler iDlHandler = this.f38208b;
        if (iDlHandler != null) {
            iDlHandler.fillRequestDataForDl(jSONObject);
        }
    }

    @Override // com.smartdigimkt.sdk.api.IExHandler
    public void fillRequestDeviceData(JSONObject jSONObject, int i2) {
        IExHandler iExHandler = this.f38207a;
        if (iExHandler != null) {
            iExHandler.fillRequestDeviceData(jSONObject, i2);
        }
    }

    @Override // com.smartdigimkt.sdk.api.IExHandler, com.smartdigimkt.sdk.api.IOdHandler
    public void fillTestDeviceData(JSONObject jSONObject, com.smartdigimkt.l8.a aVar) {
        IExHandler iExHandler = this.f38207a;
        if (iExHandler != null) {
            iExHandler.fillTestDeviceData(jSONObject, aVar);
        }
        IOdHandler iOdHandler = this.f38209c;
        if (iOdHandler != null) {
            iOdHandler.fillTestDeviceData(jSONObject, aVar);
        }
    }

    @Override // com.smartdigimkt.sdk.api.IExHandler
    public String getAid(Context context) {
        IExHandler iExHandler = this.f38207a;
        return iExHandler != null ? iExHandler.getAid(context) : "";
    }

    @Override // com.smartdigimkt.sdk.api.IDlHandler
    public IExHandlerBaseAd getBaseAdHandler() {
        IDlHandler iDlHandler = this.f38208b;
        if (iDlHandler != null) {
            return iDlHandler.getBaseAdHandler();
        }
        return null;
    }

    @Override // com.smartdigimkt.sdk.api.IOsExHandler
    public String getCdnUrl() {
        IOsExHandler iOsExHandler = this.d;
        return iOsExHandler != null ? iOsExHandler.getCdnUrl() : "";
    }

    @Override // com.smartdigimkt.sdk.api.IExHandler
    public String getDefaultMarketSchemePackageName() {
        IExHandler iExHandler = this.f38207a;
        return iExHandler != null ? iExHandler.getDefaultMarketSchemePackageName() : "com.android.vending";
    }

    @Override // com.smartdigimkt.sdk.api.IOsExHandler
    public String getGdprUrl() {
        IOsExHandler iOsExHandler = this.d;
        return iOsExHandler != null ? iOsExHandler.getGdprUrl() : "";
    }

    @Override // com.smartdigimkt.sdk.api.IOsExHandler
    public SDMOsDmEntity getOsDmEntity() {
        IOsExHandler iOsExHandler = this.d;
        if (iOsExHandler != null) {
            return iOsExHandler.getOsDmEntity();
        }
        return null;
    }

    @Override // com.smartdigimkt.sdk.api.IExHandler, com.smartdigimkt.sdk.api.IOdHandler
    public String getUniqueId(Context context) {
        IOdHandler iOdHandler;
        IExHandler iExHandler = this.f38207a;
        String uniqueId = iExHandler != null ? iExHandler.getUniqueId(context) : "";
        return (!TextUtils.isEmpty(uniqueId) || (iOdHandler = this.f38209c) == null) ? uniqueId : iOdHandler.getUniqueId(context);
    }

    @Override // com.smartdigimkt.sdk.api.IDlHandler
    public void handleOfferClick(Context context, com.smartdigimkt.v6.a aVar, f fVar, String str, String str2, Runnable runnable, com.smartdigimkt.c7.b bVar) {
        IDlHandler iDlHandler = this.f38208b;
        if (iDlHandler != null) {
            iDlHandler.handleOfferClick(context, aVar, fVar, str, str2, runnable, bVar);
        }
    }

    @Override // com.smartdigimkt.sdk.api.IExHandler, com.smartdigimkt.sdk.api.IOdHandler
    public void initDeviceInfo(Context context) {
        IOdHandler iOdHandler = this.f38209c;
        if (iOdHandler != null) {
            iOdHandler.initDeviceInfo(context);
        }
        IExHandler iExHandler = this.f38207a;
        if (iExHandler != null) {
            iExHandler.initDeviceInfo(context);
        }
    }

    @Override // com.smartdigimkt.sdk.api.IExHandler
    public boolean initPlugin(Context context) {
        IExHandler iExHandler = this.f38207a;
        if (iExHandler != null) {
            return iExHandler.initPlugin(context);
        }
        return false;
    }

    @Override // com.smartdigimkt.sdk.api.IExHandler
    public boolean isContainsPlStr(String str) {
        IExHandler iExHandler = this.f38207a;
        if (iExHandler != null) {
            return iExHandler.isContainsPlStr(str);
        }
        return false;
    }

    @Override // com.smartdigimkt.sdk.api.IDlHandler
    public void onAppForegroundStatusChanged(boolean z2) {
        IDlHandler iDlHandler = this.f38208b;
        if (iDlHandler != null) {
            iDlHandler.onAppForegroundStatusChanged(z2);
        }
    }

    @Override // com.smartdigimkt.sdk.api.IDlHandler
    public void onApplicationBoot() {
        IDlHandler iDlHandler = this.f38208b;
        if (iDlHandler != null) {
            iDlHandler.onApplicationBoot();
        }
    }

    @Override // com.smartdigimkt.sdk.api.IExHandler
    public boolean onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        IExHandler iExHandler = this.f38207a;
        if (iExHandler != null) {
            return iExHandler.onGeolocationPermissionsShowPrompt(str, callback);
        }
        return false;
    }

    @Override // com.smartdigimkt.sdk.api.IDlHandler
    public void openDataConfirmDialog(Context context, f fVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.c7.a aVar2) {
        IDlHandler iDlHandler = this.f38208b;
        if (iDlHandler != null) {
            iDlHandler.openDataConfirmDialog(context, fVar, aVar, aVar2);
        }
    }

    @Override // com.smartdigimkt.sdk.api.IDlHandler
    public void registerMarketReceiver(f fVar) {
        IDlHandler iDlHandler = this.f38208b;
        if (iDlHandler != null) {
            iDlHandler.registerMarketReceiver(fVar);
        }
    }

    @Override // com.smartdigimkt.sdk.api.IExHandler
    public void resetSSID() {
        IExHandler iExHandler = this.f38207a;
        if (iExHandler != null) {
            iExHandler.resetSSID();
        }
    }

    @Override // com.smartdigimkt.sdk.api.IExHandler
    public void startRefreshes(long j) {
        IExHandler iExHandler = this.f38207a;
        if (iExHandler != null) {
            iExHandler.startRefreshes(j);
        }
    }

    @Override // com.smartdigimkt.sdk.api.IExHandler, com.smartdigimkt.sdk.api.IOdHandler
    public void fillRequestData(JSONObject jSONObject, com.smartdigimkt.l8.a aVar, int i2) {
        IExHandler iExHandler = this.f38207a;
        if (iExHandler != null) {
            iExHandler.fillRequestData(jSONObject, aVar, i2);
        }
        IOdHandler iOdHandler = this.f38209c;
        if (iOdHandler != null) {
            iOdHandler.fillRequestData(jSONObject, aVar, i2);
        }
    }
}
