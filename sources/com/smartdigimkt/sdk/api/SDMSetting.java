package com.smartdigimkt.sdk.api;

import android.content.Context;
import android.location.Location;
import android.util.Log;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.m6.c;
import com.smartdigimkt.s6.d;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class SDMSetting {
    public void deniedUploadDeviceInfo(String... strArr) {
        b.p().b(strArr);
    }

    public void setDebug(boolean z2) {
        b.p().e(z2);
    }

    public void setDelayInspectTime(long j) {
        if (j >= 0) {
            c.a(j);
            return;
        }
        Log.e("sdm", "The inspectInterval(" + j + ") is invalid.");
    }

    public void setEnableGetDeviceInfoInBg(boolean z2) {
        c.a(z2);
    }

    public void setEnableGetRunningAppProcesses(boolean z2) {
        c.b(z2);
    }

    public void setExcludePkgList(List<String> list) {
        b.p().a(list);
    }

    public void setGDPRUploadDataLevel(Context context, int i2) {
        if (context == null) {
            Log.e("sdm", "setGDPRUploadDataLevel: context should not be null");
        } else if (i2 == 0 || i2 == 1) {
            d.a(context).a(i2);
        } else {
            Log.e("sdm", "GDPR level setting error!!! Level must be PERSONALIZED or NONPERSONALIZED.");
        }
    }

    public void setInspectInterval(long j) {
        if (j >= 0) {
            c.b(j);
            return;
        }
        Log.e("sdm", "The inspectInterval(" + j + ") is invalid.");
    }

    public void setLocation(Location location) {
        c.a(location);
    }

    public void setPersonalizedAdStatus(int i2) {
        c.a(i2);
    }

    public void setTagForChildDirectedTreatment(boolean z2) {
        b.p().a(z2);
    }

    public void setUserDeviceInfo(SDMUserDeviceInfo sDMUserDeviceInfo) {
        c.a(sDMUserDeviceInfo);
    }

    public void setWxAppId(String str) {
        b.p().h(str);
    }

    public void setWxInstallStatus(boolean z2) {
        c.c(z2);
    }

    public void undeniedUploadDeviceInfo(String... strArr) {
        b.p().a(strArr);
    }
}
