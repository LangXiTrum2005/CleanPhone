package com.inmobi.media;

import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoWcdma;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3027g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23623c;

    public C3027g2() {
    }

    public static String a(String mcc, String mnc, int i2, int i3, int i4, int i5) {
        Intrinsics.f(mcc, "mcc");
        Intrinsics.f(mnc, "mnc");
        StringBuilder sb = new StringBuilder();
        sb.append(mcc);
        sb.append('#');
        sb.append(mnc);
        sb.append('#');
        sb.append(i2);
        sb.append('#');
        sb.append(i3);
        sb.append('#');
        sb.append(i4 == -1 ? "" : Integer.valueOf(i4));
        sb.append('#');
        sb.append(i5 != Integer.MAX_VALUE ? Integer.valueOf(i5) : "");
        return sb.toString();
    }

    public C3027g2(CellInfo cellInfo, String mcc, String mnc, int i2) {
        Intrinsics.f(mcc, "mcc");
        Intrinsics.f(mnc, "mnc");
        if (cellInfo instanceof CellInfoGsm) {
            this.f23623c = i2;
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            this.f23622b = cellInfoGsm.getCellSignalStrength().getDbm();
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            Intrinsics.e(cellIdentity, "getCellIdentity(...)");
            this.f23621a = a(mcc, mnc, cellIdentity.getLac(), cellIdentity.getCid(), -1, Integer.MAX_VALUE);
            return;
        }
        if (!(cellInfo instanceof CellInfoCdma)) {
            if (cellInfo instanceof CellInfoWcdma) {
                this.f23623c = i2;
                CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                this.f23622b = cellInfoWcdma.getCellSignalStrength().getDbm();
                CellIdentityWcdma cellIdentity2 = cellInfoWcdma.getCellIdentity();
                Intrinsics.e(cellIdentity2, "getCellIdentity(...)");
                this.f23621a = a(mcc, mnc, cellIdentity2.getLac(), cellIdentity2.getCid(), cellIdentity2.getPsc(), Integer.MAX_VALUE);
                return;
            }
            return;
        }
        this.f23623c = i2;
        CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
        this.f23622b = cellInfoCdma.getCellSignalStrength().getDbm();
        CellIdentityCdma cellIdentity3 = cellInfoCdma.getCellIdentity();
        Intrinsics.e(cellIdentity3, "getCellIdentity(...)");
        this.f23621a = mcc + '#' + cellIdentity3.getSystemId() + '#' + cellIdentity3.getNetworkId() + '#' + cellIdentity3.getBasestationId();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f23621a);
            int i2 = this.f23622b;
            if (i2 != Integer.MAX_VALUE) {
                jSONObject.put(com.smartdigimkt.b0.a.g0, i2);
            }
            jSONObject.put(com.smartdigimkt.b0.a.W, this.f23623c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
