package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.TelephonyManager;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.startapp.sdk.adsbase.remoteconfig.LocationMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ph extends ce {
    public final lb j;
    public final b6 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h3 f41374l;

    public ph(Context context, lb lbVar, lb lbVar2, lb lbVar3, b6 b6Var, h3 h3Var) {
        super(context, lbVar, lbVar2, "c9c194d3e01bcf14", "086ea3852ae4e475");
        this.j = lbVar3;
        this.k = b6Var;
        this.f41374l = h3Var;
    }

    @Override // com.startapp.sdk.internal.ce
    public final Object a(String str) {
        if (str != null) {
            try {
                return new mh(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ce A[Catch: all -> 0x00c9, TRY_LEAVE, TryCatch #0 {all -> 0x00c9, blocks: (B:33:0x00ce, B:26:0x00bf, B:28:0x00c5, B:22:0x00b6), top: B:48:0x00b4, outer: #2, inners: #1 }] */
    public final void b(boolean z2) {
        nh nhVar;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f41177a.getSystemService("phone");
            mh mhVar = new mh();
            mhVar.a(7, Integer.valueOf(telephonyManager.getSimState()));
            mhVar.a(8, telephonyManager.getSimOperator());
            mhVar.a(9, telephonyManager.getSimOperatorName());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                mhVar.a(15, String.valueOf(telephonyManager.getSimCarrierId()));
                mhVar.a(16, String.valueOf(telephonyManager.getSimCarrierIdName()));
            }
            mhVar.a(10, Integer.valueOf(telephonyManager.getPhoneType()));
            mhVar.a(11, AbstractC3396g.b(telephonyManager.getNetworkOperator()));
            mhVar.a(12, AbstractC3396g.b(telephonyManager.getNetworkOperatorName()));
            this.f41374l.getClass();
            LocationMetadata locationMetadataG = MetaData.E().G();
            if ((locationMetadataG == null || !locationMetadataG.a()) ? false : q0.a(this.f41177a, "android.permission.ACCESS_FINE_LOCATION")) {
                if (i2 >= 29 && z2) {
                    this.k.getClass();
                    TelephonyMetadata telephonyMetadataA0 = MetaData.E().a0();
                    if (telephonyMetadataA0 != null && telephonyMetadataA0.d()) {
                        try {
                            if (i2 >= 29) {
                                try {
                                    nhVar = new nh(this);
                                } catch (Throwable th) {
                                    if (a(32)) {
                                        g9.a(th);
                                    }
                                    nhVar = null;
                                }
                                if (nhVar != null) {
                                    telephonyManager.requestCellInfoUpdate((Executor) this.f.a(), nhVar);
                                }
                            } else {
                                nhVar = null;
                                if (nhVar != null) {
                                    telephonyManager.requestCellInfoUpdate((Executor) this.f.a(), nhVar);
                                }
                            }
                        } catch (Throwable th2) {
                            if (a(64)) {
                                g9.a(th2);
                            }
                        }
                    }
                }
                List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                if (allCellInfo != null) {
                    a(mhVar, allCellInfo);
                }
            }
            b(mhVar);
        } catch (Throwable th3) {
            if (a(128)) {
                g9.a(th3);
            }
        }
    }

    @Override // com.startapp.sdk.internal.ce
    public final String c(Object obj) {
        mh mhVar = (mh) obj;
        if (mhVar != null) {
            return mhVar.f41256a.toString();
        }
        return null;
    }

    @Override // com.startapp.sdk.internal.ce
    public final long d() {
        return ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
    }

    @Override // com.startapp.sdk.internal.ce
    public final boolean f() {
        Boolean boolB = ((h6) this.j.a()).b();
        if (boolB != null && boolB.booleanValue()) {
            this.k.getClass();
            TelephonyMetadata telephonyMetadataA0 = MetaData.E().a0();
            if (telephonyMetadataA0 != null && telephonyMetadataA0.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.startapp.sdk.internal.ce
    public final void g() {
        b(true);
    }

    public final boolean a(int i2) {
        this.k.getClass();
        TelephonyMetadata telephonyMetadataA0 = MetaData.E().a0();
        if (telephonyMetadataA0 == null || !telephonyMetadataA0.c()) {
            telephonyMetadataA0 = null;
        }
        return telephonyMetadataA0 != null && (telephonyMetadataA0.a() & i2) == i2 && Math.random() < telephonyMetadataA0.b();
    }

    @Override // com.startapp.sdk.internal.k6
    public final Object c() {
        return mh.f41255b;
    }

    public static int a(CellInfo cellInfo) {
        CellSignalStrength cellSignalStrength;
        if (cellInfo instanceof CellInfoCdma) {
            cellSignalStrength = ((CellInfoCdma) cellInfo).getCellSignalStrength();
        } else if (cellInfo instanceof CellInfoGsm) {
            cellSignalStrength = ((CellInfoGsm) cellInfo).getCellSignalStrength();
        } else if (cellInfo instanceof CellInfoLte) {
            cellSignalStrength = ((CellInfoLte) cellInfo).getCellSignalStrength();
        } else {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29 && com.bytedance.adsdk.ugeno.ud.a.z(cellInfo)) {
                cellSignalStrength = com.bytedance.adsdk.ugeno.ud.a.l(cellInfo).getCellSignalStrength();
            } else if (i2 >= 29 && com.bytedance.adsdk.ugeno.ud.a.C(cellInfo)) {
                cellSignalStrength = com.bytedance.adsdk.ugeno.ud.a.m(cellInfo).getCellSignalStrength();
            } else {
                cellSignalStrength = cellInfo instanceof CellInfoWcdma ? ((CellInfoWcdma) cellInfo).getCellSignalStrength() : null;
            }
        }
        if (cellSignalStrength != null) {
            return cellSignalStrength.getLevel();
        }
        return 0;
    }

    public static void a(mh mhVar, List list) {
        int timingAdvance;
        ArrayList<CellInfo> arrayList = new ArrayList(list);
        Collections.sort(arrayList, new oh());
        mhVar.a(6, AbstractC3396g.b(arrayList.toString()));
        boolean z2 = true;
        for (CellInfo cellInfo : arrayList) {
            if (z2) {
                if (cellInfo instanceof CellInfoCdma) {
                    CellIdentityCdma cellIdentity = ((CellInfoCdma) cellInfo).getCellIdentity();
                    int latitude = cellIdentity.getLatitude();
                    int longitude = cellIdentity.getLongitude();
                    if (latitude != Integer.MAX_VALUE && longitude != Integer.MAX_VALUE) {
                        mhVar.a(1, AbstractC3396g.b(String.valueOf(latitude)));
                        mhVar.a(2, AbstractC3396g.b(String.valueOf(longitude)));
                    }
                } else if (cellInfo instanceof CellInfoGsm) {
                    CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                    CellIdentityGsm cellIdentity2 = cellInfoGsm.getCellIdentity();
                    int lac = cellIdentity2.getLac();
                    if (lac != Integer.MAX_VALUE) {
                        mhVar.a(3, AbstractC3396g.b(String.valueOf(lac)));
                    }
                    int cid = cellIdentity2.getCid();
                    if (cid != Integer.MAX_VALUE) {
                        mhVar.a(4, AbstractC3396g.b(String.valueOf(cid)));
                    }
                    if (Build.VERSION.SDK_INT >= 26 && (timingAdvance = cellInfoGsm.getCellSignalStrength().getTimingAdvance()) != Integer.MAX_VALUE) {
                        mhVar.a(13, String.valueOf(timingAdvance));
                    }
                } else if (cellInfo instanceof CellInfoLte) {
                    CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                    int tac = cellInfoLte.getCellIdentity().getTac();
                    if (tac != Integer.MAX_VALUE) {
                        mhVar.a(5, AbstractC3396g.b(String.valueOf(tac)));
                    }
                    int timingAdvance2 = cellInfoLte.getCellSignalStrength().getTimingAdvance();
                    if (timingAdvance2 != Integer.MAX_VALUE) {
                        mhVar.a(13, String.valueOf(timingAdvance2));
                    }
                } else {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 29 && com.bytedance.adsdk.ugeno.ud.a.z(cellInfo)) {
                        int tac2 = com.bytedance.adsdk.ugeno.ud.a.j(com.bytedance.adsdk.ugeno.ud.a.l(cellInfo).getCellIdentity()).getTac();
                        if (tac2 != Integer.MAX_VALUE) {
                            mhVar.a(5, AbstractC3396g.b(String.valueOf(tac2)));
                        }
                    } else if (i2 >= 29 && com.bytedance.adsdk.ugeno.ud.a.C(cellInfo)) {
                        CellIdentityTdscdma cellIdentity3 = com.bytedance.adsdk.ugeno.ud.a.m(cellInfo).getCellIdentity();
                        int lac2 = cellIdentity3.getLac();
                        if (lac2 != Integer.MAX_VALUE) {
                            mhVar.a(3, AbstractC3396g.b(String.valueOf(lac2)));
                        }
                        int cid2 = cellIdentity3.getCid();
                        if (cid2 != Integer.MAX_VALUE) {
                            mhVar.a(4, AbstractC3396g.b(String.valueOf(cid2)));
                        }
                    } else if (cellInfo instanceof CellInfoWcdma) {
                        CellIdentityWcdma cellIdentity4 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                        int lac3 = cellIdentity4.getLac();
                        if (lac3 != Integer.MAX_VALUE) {
                            mhVar.a(3, AbstractC3396g.b(String.valueOf(lac3)));
                        }
                        int cid3 = cellIdentity4.getCid();
                        if (cid3 != Integer.MAX_VALUE) {
                            mhVar.a(4, AbstractC3396g.b(String.valueOf(cid3)));
                        }
                    }
                }
                z2 = false;
            }
            if (!cellInfo.isRegistered()) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 29 && com.bytedance.adsdk.ugeno.ud.a.z(cellInfo)) {
                mhVar.a(14, 1);
            }
        }
    }
}
