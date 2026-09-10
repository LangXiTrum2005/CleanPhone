package com.startapp.sdk.internal;

import android.os.Parcelable;
import android.telephony.TelephonyManager;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TelephonyManager f41586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f41587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yh f41588c;

    public vh(yh yhVar, TelephonyManager telephonyManager, Class cls) {
        this.f41588c = yhVar;
        this.f41586a = telephonyManager;
        this.f41587b = cls;
    }

    public abstract void a();

    public final void a(Class cls, Parcelable parcelable) {
        yh yhVar = this.f41588c;
        yhVar.getClass();
        try {
            TelephonyMetadata telephonyMetadataA = yhVar.a();
            if (telephonyMetadataA != null && parcelable != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String simpleName = cls.getSimpleName();
                if (telephonyMetadataA.a(simpleName).c()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("timestamp", jCurrentTimeMillis);
                    jSONObject.put("type", simpleName);
                    jSONObject.put("data", parcelable.toString());
                    String strB = vi.b(jSONObject.toString());
                    uf ufVarEdit = ((vf) yhVar.f41717c.a()).edit();
                    ufVarEdit.a(simpleName, strB);
                    ufVarEdit.f41545a.putString(simpleName, strB);
                    ufVarEdit.apply();
                }
            }
        } catch (Throwable th) {
            if (yhVar.a(2)) {
                g9.a(th);
            }
        }
        if (cls.equals(this.f41587b)) {
            try {
                b();
            } catch (Throwable th2) {
                if (this.f41588c.a(16)) {
                    g9.a(th2);
                }
            }
        }
    }

    public abstract void b();
}
