package com.inmobi.media;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.inmobi.media.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3043h2 {
    public static HashMap a() {
        String strP;
        int i2;
        int i3;
        int i4;
        int i5;
        String string;
        HashMap map = new HashMap();
        Context contextD = Uc.d();
        if (contextD == null) {
            return map;
        }
        String strB = Uc.b();
        LinkedHashMap linkedHashMap = O2.f23027a;
        String string2 = null;
        Config configA = M2.a("signals", strB, null);
        Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
        int cellOperatorFlag = ((SignalsConfig) configA).getIce().getCellOperatorFlag();
        boolean z2 = (cellOperatorFlag & 2) == 2;
        boolean z3 = (cellOperatorFlag & 1) == 1;
        Object systemService = contextD.getSystemService("phone");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        if (z2) {
            strP = null;
            i2 = -1;
            i3 = -1;
        } else {
            int[] iArrA = a(telephonyManager.getNetworkOperator());
            i3 = iArrA[0];
            i2 = iArrA[1];
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (networkCountryIso != null) {
                Locale locale = Locale.ENGLISH;
                strP = com.applovin.impl.Z.p(locale, "ENGLISH", networkCountryIso, locale, "this as java.lang.String).toLowerCase(locale)");
            } else {
                strP = null;
            }
        }
        if (z3) {
            i4 = -1;
            i5 = -1;
        } else {
            int[] iArrA2 = a(telephonyManager.getSimOperator());
            i5 = iArrA2[0];
            i4 = iArrA2[1];
        }
        if (i5 == -1 && i4 == -1) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(i5);
            sb.append('_');
            sb.append(i4);
            string = sb.toString();
        }
        if (string != null) {
            map.put("s-ho", string);
        }
        if (i3 != -1 || i2 != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i3);
            sb2.append('_');
            sb2.append(i2);
            string2 = sb2.toString();
        }
        if (string2 != null) {
            map.put("s-co", string2);
        }
        if (strP != null) {
            map.put("s-iso", strP);
        }
        map.put("s-cn", L3.f22938a.a(contextD));
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0063  */
    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[LOOP:0: B:17:0x0069->B:21:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:50:0x007a A[EDGE_INSN: B:50:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:17:0x0069->B:21:0x0078], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x0023  */
    public static HashMap b() {
        Context contextD;
        TelephonyManager telephonyManager;
        String mcc;
        String strValueOf;
        List<CellInfo> allCellInfo;
        CellLocation cellLocation;
        int networkType;
        int networkType2;
        int size;
        CellInfo cellInfo;
        int i2;
        int networkType3;
        String strH = Uc.f23270a.h();
        C3027g2 c3027g2 = null;
        if (strH != null) {
            LinkedHashMap linkedHashMap = O2.f23027a;
            Config configA = M2.a("signals", strH, null);
            Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
            if (((SignalsConfig) configA).getIce().isConnectedCellTowerEnabled()) {
                if (d() && e() && (contextD = Uc.d()) != null) {
                    Object systemService = contextD.getSystemService("phone");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                    telephonyManager = (TelephonyManager) systemService;
                    int[] iArrA = a(telephonyManager.getNetworkOperator());
                    mcc = String.valueOf(iArrA[0]);
                    strValueOf = String.valueOf(iArrA[1]);
                    allCellInfo = telephonyManager.getAllCellInfo();
                    if (allCellInfo != null) {
                        size = allCellInfo.size();
                        cellInfo = null;
                        for (i2 = 0; i2 < size; i2++) {
                            cellInfo = allCellInfo.get(i2);
                            if (cellInfo.isRegistered()) {
                                break;
                            }
                        }
                        if (cellInfo != null) {
                            if (Build.VERSION.SDK_INT >= 30) {
                                networkType3 = telephonyManager.getDataNetworkType();
                            } else {
                                networkType3 = telephonyManager.getNetworkType();
                            }
                            c3027g2 = new C3027g2(cellInfo, mcc, strValueOf, networkType3);
                        } else {
                            cellLocation = telephonyManager.getCellLocation();
                            if (cellLocation != null && iArrA[0] != -1) {
                                c3027g2 = new C3027g2();
                                if (cellLocation instanceof CdmaCellLocation) {
                                    c3027g2.f23622b = Integer.MAX_VALUE;
                                    if (Build.VERSION.SDK_INT >= 30) {
                                        networkType2 = telephonyManager.getDataNetworkType();
                                    } else {
                                        networkType2 = telephonyManager.getNetworkType();
                                    }
                                    c3027g2.f23623c = networkType2;
                                    CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                                    int systemId = cdmaCellLocation.getSystemId();
                                    int networkId = cdmaCellLocation.getNetworkId();
                                    int baseStationId = cdmaCellLocation.getBaseStationId();
                                    Intrinsics.f(mcc, "mcc");
                                    c3027g2.f23621a = mcc + '#' + systemId + '#' + networkId + '#' + baseStationId;
                                } else {
                                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                                    c3027g2.f23622b = Integer.MAX_VALUE;
                                    if (Build.VERSION.SDK_INT >= 30) {
                                        networkType = telephonyManager.getDataNetworkType();
                                    } else {
                                        networkType = telephonyManager.getNetworkType();
                                    }
                                    c3027g2.f23623c = networkType;
                                    c3027g2.f23621a = C3027g2.a(mcc, strValueOf, gsmCellLocation.getLac(), gsmCellLocation.getCid(), gsmCellLocation.getPsc(), Integer.MAX_VALUE);
                                }
                            }
                        }
                    } else {
                        cellLocation = telephonyManager.getCellLocation();
                        if (cellLocation != null) {
                            c3027g2 = new C3027g2();
                            if (cellLocation instanceof CdmaCellLocation) {
                                c3027g2.f23622b = Integer.MAX_VALUE;
                                if (Build.VERSION.SDK_INT >= 30) {
                                    networkType2 = telephonyManager.getDataNetworkType();
                                } else {
                                    networkType2 = telephonyManager.getNetworkType();
                                }
                                c3027g2.f23623c = networkType2;
                                CdmaCellLocation cdmaCellLocation2 = (CdmaCellLocation) cellLocation;
                                int systemId2 = cdmaCellLocation2.getSystemId();
                                int networkId2 = cdmaCellLocation2.getNetworkId();
                                int baseStationId2 = cdmaCellLocation2.getBaseStationId();
                                Intrinsics.f(mcc, "mcc");
                                c3027g2.f23621a = mcc + '#' + systemId2 + '#' + networkId2 + '#' + baseStationId2;
                            } else {
                                GsmCellLocation gsmCellLocation2 = (GsmCellLocation) cellLocation;
                                c3027g2.f23622b = Integer.MAX_VALUE;
                                if (Build.VERSION.SDK_INT >= 30) {
                                    networkType = telephonyManager.getDataNetworkType();
                                } else {
                                    networkType = telephonyManager.getNetworkType();
                                }
                                c3027g2.f23623c = networkType;
                                c3027g2.f23621a = C3027g2.a(mcc, strValueOf, gsmCellLocation2.getLac(), gsmCellLocation2.getCid(), gsmCellLocation2.getPsc(), Integer.MAX_VALUE);
                            }
                        }
                    }
                }
            }
        } else if (d()) {
            Object systemService2 = contextD.getSystemService("phone");
            Intrinsics.d(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            telephonyManager = (TelephonyManager) systemService2;
            int[] iArrA2 = a(telephonyManager.getNetworkOperator());
            mcc = String.valueOf(iArrA2[0]);
            strValueOf = String.valueOf(iArrA2[1]);
            allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo != null) {
                size = allCellInfo.size();
                cellInfo = null;
                while (i2 < size) {
                    cellInfo = allCellInfo.get(i2);
                    if (cellInfo.isRegistered()) {
                        break;
                        break;
                    }
                }
                if (cellInfo != null) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        networkType3 = telephonyManager.getDataNetworkType();
                    } else {
                        networkType3 = telephonyManager.getNetworkType();
                    }
                    c3027g2 = new C3027g2(cellInfo, mcc, strValueOf, networkType3);
                } else {
                    cellLocation = telephonyManager.getCellLocation();
                    if (cellLocation != null) {
                        c3027g2 = new C3027g2();
                        if (cellLocation instanceof CdmaCellLocation) {
                            c3027g2.f23622b = Integer.MAX_VALUE;
                            if (Build.VERSION.SDK_INT >= 30) {
                                networkType2 = telephonyManager.getDataNetworkType();
                            } else {
                                networkType2 = telephonyManager.getNetworkType();
                            }
                            c3027g2.f23623c = networkType2;
                            CdmaCellLocation cdmaCellLocation3 = (CdmaCellLocation) cellLocation;
                            int systemId3 = cdmaCellLocation3.getSystemId();
                            int networkId3 = cdmaCellLocation3.getNetworkId();
                            int baseStationId3 = cdmaCellLocation3.getBaseStationId();
                            Intrinsics.f(mcc, "mcc");
                            c3027g2.f23621a = mcc + '#' + systemId3 + '#' + networkId3 + '#' + baseStationId3;
                        } else {
                            GsmCellLocation gsmCellLocation3 = (GsmCellLocation) cellLocation;
                            c3027g2.f23622b = Integer.MAX_VALUE;
                            if (Build.VERSION.SDK_INT >= 30) {
                                networkType = telephonyManager.getDataNetworkType();
                            } else {
                                networkType = telephonyManager.getNetworkType();
                            }
                            c3027g2.f23623c = networkType;
                            c3027g2.f23621a = C3027g2.a(mcc, strValueOf, gsmCellLocation3.getLac(), gsmCellLocation3.getCid(), gsmCellLocation3.getPsc(), Integer.MAX_VALUE);
                        }
                    }
                }
            } else {
                cellLocation = telephonyManager.getCellLocation();
                if (cellLocation != null) {
                    c3027g2 = new C3027g2();
                    if (cellLocation instanceof CdmaCellLocation) {
                        c3027g2.f23622b = Integer.MAX_VALUE;
                        if (Build.VERSION.SDK_INT >= 30) {
                            networkType2 = telephonyManager.getDataNetworkType();
                        } else {
                            networkType2 = telephonyManager.getNetworkType();
                        }
                        c3027g2.f23623c = networkType2;
                        CdmaCellLocation cdmaCellLocation4 = (CdmaCellLocation) cellLocation;
                        int systemId4 = cdmaCellLocation4.getSystemId();
                        int networkId4 = cdmaCellLocation4.getNetworkId();
                        int baseStationId4 = cdmaCellLocation4.getBaseStationId();
                        Intrinsics.f(mcc, "mcc");
                        c3027g2.f23621a = mcc + '#' + systemId4 + '#' + networkId4 + '#' + baseStationId4;
                    } else {
                        GsmCellLocation gsmCellLocation4 = (GsmCellLocation) cellLocation;
                        c3027g2.f23622b = Integer.MAX_VALUE;
                        if (Build.VERSION.SDK_INT >= 30) {
                            networkType = telephonyManager.getDataNetworkType();
                        } else {
                            networkType = telephonyManager.getNetworkType();
                        }
                        c3027g2.f23623c = networkType;
                        c3027g2.f23621a = C3027g2.a(mcc, strValueOf, gsmCellLocation4.getLac(), gsmCellLocation4.getCid(), gsmCellLocation4.getPsc(), Integer.MAX_VALUE);
                    }
                }
            }
        }
        HashMap map = new HashMap();
        if (c3027g2 != null) {
            String string = c3027g2.a().toString();
            Intrinsics.e(string, "toString(...)");
            map.put("c-sc", string);
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    public static HashMap c() {
        ArrayList arrayList;
        if (Uc.q() && d() && e()) {
            String strH = Uc.f23270a.h();
            if (strH != null) {
                LinkedHashMap linkedHashMap = O2.f23027a;
                Config configA = M2.a("signals", strH, null);
                Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
                if (!((SignalsConfig) configA).getIce().isVisibleCellTowerEnabled()) {
                    arrayList = new ArrayList();
                }
            }
            Context contextD = Uc.d();
            if (contextD == null) {
                arrayList = new ArrayList();
            } else {
                Object systemService = contextD.getSystemService("phone");
                Intrinsics.d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                ArrayList arrayList2 = new ArrayList();
                int[] iArrA = a(telephonyManager.getNetworkOperator());
                String strValueOf = String.valueOf(iArrA[0]);
                String strValueOf2 = String.valueOf(iArrA[1]);
                List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                if (allCellInfo != null) {
                    for (CellInfo cellInfo : allCellInfo) {
                        if (!cellInfo.isRegistered()) {
                            arrayList2.add(new C3027g2(cellInfo, strValueOf, strValueOf2, Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType()));
                        }
                    }
                }
                arrayList = arrayList2;
            }
        } else {
            arrayList = new ArrayList();
        }
        HashMap map = new HashMap();
        if (!arrayList.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(((C3027g2) arrayList.get(arrayList.size() - 1)).a());
            String string = jSONArray.toString();
            Intrinsics.e(string, "toString(...)");
            map.put("v-sc", string);
        }
        return map;
    }

    public static boolean d() {
        if (!Uc.q()) {
            return false;
        }
        boolean zA = AbstractC3290wa.a(Uc.d(), "android.permission.READ_PHONE_STATE");
        boolean zA2 = AbstractC3290wa.a(Uc.d(), "android.permission.ACCESS_FINE_LOCATION");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 29) {
            return zA2;
        }
        if (i2 >= 30) {
            return zA2 && zA;
        }
        return AbstractC3290wa.a(Uc.d(), "android.permission.ACCESS_COARSE_LOCATION") || zA2;
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        Context contextD = Uc.d();
        Object systemService = contextD != null ? contextD.getSystemService("location") : null;
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        return locationManager != null && locationManager.isLocationEnabled();
    }

    public static int[] a(String str) {
        int[] iArr = {-1, -1};
        if (str != null && !"".equals(str)) {
            try {
                String strSubstring = str.substring(0, 3);
                Intrinsics.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                int i2 = Integer.parseInt(strSubstring);
                String strSubstring2 = str.substring(3);
                Intrinsics.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                int i3 = Integer.parseInt(strSubstring2);
                iArr[0] = i2;
                iArr[1] = i3;
            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            }
        }
        return iArr;
    }
}
