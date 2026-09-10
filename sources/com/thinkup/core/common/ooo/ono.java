package com.thinkup.core.common.ooo;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.TUAdFilter;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.common.on.mnn;
import com.thinkup.core.common.on.o00m;
import com.thinkup.core.common.on.o00o;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0mn;
import com.thinkup.core.common.on.o0nn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class ono {
    private static final String m = "PlacementPrepareUtils";
    static Random o = new Random();

    public static void m(o00m o00mVar, List<o0mm> list) {
        List<o0mm> listO0 = o00mVar.o0();
        List<o0mm> listOo = o00mVar.oo();
        List<o0mm> listOm = o00mVar.om();
        List<o0mm> listOn = o00mVar.on();
        o(listO0, listOo, o00mVar.n(), list);
        o(listO0, listOm, o00mVar.n(), list);
        o(listO0, listOn, o00mVar.n(), list);
    }

    public static final o00m o(com.thinkup.core.oo.n0 n0Var, com.thinkup.core.common.on.n0 n0Var2) {
        List<o0mm> listO;
        List<o0mm> listO2;
        List<o0mm> listN;
        List<o0mm> listO0;
        List<o0mm> listOo;
        if (n0Var == null) {
            return null;
        }
        TUAdRequest tUAdRequestO = n0Var2.o();
        if (tUAdRequestO != null) {
            n0Var.o(tUAdRequestO);
        }
        if (n0Var2.nno()) {
            n0Var2.oomn();
            n0Var2.no0();
            listO = new ArrayList<>();
            listO2 = com.thinkup.core.oo.ooo.o(n0Var, n0Var.n0n());
            listN = new ArrayList<>();
            listO0 = new ArrayList<>();
            listOo = new ArrayList<>();
        } else {
            n0Var2.oomn();
            n0Var2.no0();
            listO = o(n0Var2, n0Var, com.thinkup.core.oo.ooo.m(n0Var));
            n0Var2.oomn();
            n0Var2.no0();
            listO2 = com.thinkup.core.oo.ooo.o(n0Var);
            listN = com.thinkup.core.oo.ooo.n(n0Var);
            com.thinkup.core.o0.o.o().o(n0Var2, listO, n0Var);
            com.thinkup.core.o0.o.o().o(n0Var2, listN, n0Var);
            listO0 = com.thinkup.core.oo.ooo.o0(n0Var);
            listOo = com.thinkup.core.oo.ooo.oo(n0Var);
        }
        o00m o00mVar = new o00m(n0Var, n0Var2, listOo.size() + listO0.size() + listN.size() + listO2.size() + listO.size());
        o00mVar.o(listO);
        o00mVar.m(listO2);
        o00mVar.oo(listN);
        o00mVar.n(listO0);
        o00mVar.o0(listOo);
        m(n0Var, o00mVar.n(), listO);
        m(n0Var, o00mVar.n(), listO2);
        m(n0Var, o00mVar.n(), listN);
        m(n0Var, o00mVar.n(), listO0);
        m(n0Var, o00mVar.n(), listOo);
        return o00mVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:102:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:104:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:112:0x0326 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:115:0x0335  */
    /* JADX WARN: Code duplicated, block: B:116:0x034f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0351  */
    /* JADX WARN: Code duplicated, block: B:119:0x0358  */
    /* JADX WARN: Code duplicated, block: B:120:0x036d  */
    /* JADX WARN: Code duplicated, block: B:123:0x037d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0393  */
    /* JADX WARN: Code duplicated, block: B:126:0x039e  */
    /* JADX WARN: Code duplicated, block: B:128:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:130:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:132:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:145:0x03f6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    /* JADX WARN: Code duplicated, block: B:48:0x0104  */
    /* JADX WARN: Code duplicated, block: B:50:0x0129  */
    /* JADX WARN: Code duplicated, block: B:52:0x0142  */
    /* JADX WARN: Code duplicated, block: B:53:0x015d  */
    /* JADX WARN: Code duplicated, block: B:58:0x018a  */
    /* JADX WARN: Code duplicated, block: B:60:0x019b  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:79:0x020b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0223  */
    /* JADX WARN: Code duplicated, block: B:82:0x022d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0255  */
    /* JADX WARN: Code duplicated, block: B:87:0x025f  */
    /* JADX WARN: Code duplicated, block: B:90:0x028c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0292  */
    /* JADX WARN: Code duplicated, block: B:94:0x0298  */
    /* JADX WARN: Code duplicated, block: B:99:0x02c7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v47 */
    private static void m(com.thinkup.core.oo.n0 n0Var, com.thinkup.core.common.on.n0 n0Var2, List<o0mm> list) {
        ?? r14;
        ?? r15;
        AdError adErrorO;
        List<String> listMoo;
        int iO;
        int iO2;
        List<String> listNo;
        List<String> listNm;
        int i2;
        int iO3;
        com.thinkup.core.common.on.mo moVarO;
        com.thinkup.core.common.oom.o.m.n nVar;
        com.thinkup.core.common.on.m0m m0mVarO;
        int i3;
        String str;
        String str2;
        AdError adErrorM;
        com.thinkup.core.common.on.on onVarN;
        Boolean boolM;
        int i4;
        int i5;
        String code;
        int i6;
        int i7;
        int i8 = 1;
        ?? r7 = 0;
        Iterator<o0mm> it = list.iterator();
        while (it.hasNext()) {
            o0mm next = it.next();
            int iMnn = n0Var2.mnn();
            com.thinkup.core.common.on.n0 n0VarNmm = n0Var2.nmm();
            String strOomn = n0Var2.oomn();
            m0m.o(n0VarNmm, next, r7, r7);
            o00o.o oVarO = com.thinkup.core.m.o.o(com.thinkup.core.common.n.o0n.m().on()).o(strOomn, next.m0o(), n0Var.o00n());
            if (oVarO != null) {
                i7 = oVarO.oo;
            } else {
                r14 = r7;
            }
            if (oVarO != null) {
                r14 = i7;
                r15 = oVarO.o0;
            } else {
                r14 = i7;
                r15 = r7;
            }
            Context contextOn = com.thinkup.core.common.n.o0n.m().on();
            Pair<Integer, List<String>> pairMo0 = com.thinkup.core.common.n.o0n.m().mo0();
            String desc = "";
            if (pairMo0 != null && ((Integer) pairMo0.first).intValue() == i8) {
                List list2 = (List) pairMo0.second;
                if (list2 != null && !list2.isEmpty()) {
                    if (list2.contains(String.valueOf(next.nm()))) {
                        next.m0("Filter ad source loading for specified channel id on risky devices.");
                        omn.o(strOomn, n0Var2, "Filter ad source loading for specified channel id on risky devices.", next, r14, r15, list2);
                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, 28, ErrorCode.getErrorCode(ErrorCode.adSourceLoadRiskError, "", "Filter ad source loading for specified channel id on risky devices."));
                    } else {
                        adErrorO = o(1, n0VarNmm, next, (com.thinkup.core.common.on.om0) null);
                        if (adErrorO != null) {
                            code = adErrorO.getCode();
                            code.getClass();
                            switch (code) {
                                case "2032":
                                    i6 = 29;
                                    break;
                                case "2033":
                                    i6 = 30;
                                    break;
                                case "2034":
                                    i6 = 31;
                                    break;
                                default:
                                    i6 = 9;
                                    break;
                            }
                            next.m0(adErrorO.getPlatformMSG());
                            n0VarNmm.nn(next.m0om());
                            n0VarNmm.onm(next.m0on());
                            omn.o(strOomn, n0Var2, adErrorO.getPlatformMSG(), next, (int) r14, (int) r15);
                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, i6, adErrorO);
                        } else {
                            listMoo = com.thinkup.core.common.n.o0n.m().moo();
                            com.thinkup.core.common.n.o0n.m();
                            if (com.thinkup.core.common.n.o0n.o(listMoo, String.valueOf(next.nm()))) {
                                next.m0("Forbid network by developer");
                                omn.o(strOomn, n0Var2, "Forbid network by developer", next, r14, r15, listMoo);
                                com.thinkup.core.common.oo0.oo.o(n0VarNmm, 14, ErrorCode.getErrorCode(ErrorCode.forbidNetworkByDeveloper, "", "Forbid network by developer"));
                            } else if (!m0n.m(next)) {
                                iO = com.thinkup.core.m.o.o(contextOn).o(strOomn, next, n0Var.o00n());
                                if (iO != -1) {
                                    next.mn(-5);
                                    next.m0("Out of Cap");
                                    omn.o(strOomn, n0Var2, "Out of Cap", next, (int) r14, (int) r15);
                                    switch (iO) {
                                        case 8:
                                            i5 = 19;
                                            break;
                                        case 9:
                                            i5 = 20;
                                            break;
                                        case 10:
                                            i5 = 21;
                                            break;
                                        case 11:
                                            i5 = 22;
                                            break;
                                        default:
                                            i5 = 2;
                                            break;
                                    }
                                    com.thinkup.core.common.oo0.oo.o(n0VarNmm, i5, ErrorCode.getErrorCode(ErrorCode.outOfCapError, "", "Out of Cap"));
                                } else {
                                    com.thinkup.core.m.o0.o();
                                    iO2 = com.thinkup.core.m.o0.o(strOomn, next);
                                    if (iO2 != -1) {
                                        next.mn(-6);
                                        next.m0("Out of Pacing");
                                        omn.o(strOomn, n0Var2, "Out of Pacing", next, (int) r14, (int) r15);
                                        if (iO2 == 12) {
                                            i4 = 23;
                                        } else if (iO2 != 13) {
                                            i4 = 3;
                                        } else {
                                            i4 = 24;
                                        }
                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, i4, ErrorCode.getErrorCode(ErrorCode.inPacingError, "", "Out of Pacing"));
                                    } else if (com.thinkup.core.common.n.o().o(next)) {
                                        next.mn(-6);
                                        next.m0("Request fail in pacing");
                                        omn.o(strOomn, n0Var2, "Request fail in pacing", next, (int) r14, (int) r15);
                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Request fail in pacing"));
                                    } else {
                                        listNo = com.thinkup.core.common.n.o0n.m().no(strOomn);
                                        if (listNo == null) {
                                            listNm = com.thinkup.core.common.n.o0n.m().nm(strOomn);
                                            if (listNm == null) {
                                                if (next.oom()) {
                                                    if (!m0n.m(next)) {
                                                        if (com.thinkup.core.common.n.o().m(next)) {
                                                            next.mn(-7);
                                                            next.m0("Bid fail in pacing");
                                                            omn.o(strOomn, n0Var2, "Bid fail in pacing", next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                                                        } else if (next.nnm() == 1) {
                                                        }
                                                    } else if (com.thinkup.core.common.n.o().m(next)) {
                                                        next.mn(-7);
                                                        next.m0("Bid fail in pacing");
                                                        omn.o(strOomn, n0Var2, "Bid fail in pacing", next, (int) r14, (int) r15);
                                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                                                    } else if (next.nnm() == 1) {
                                                    }
                                                }
                                                if (com.thinkup.core.common.n.o().o(iMnn, n0Var, next)) {
                                                    next.mn(-8);
                                                    next.m0("Error Code Request fail in pacing");
                                                    omn.o(strOomn, n0Var2, "Error Code Request fail in pacing", next, (int) r14, (int) r15);
                                                    com.thinkup.core.common.oo0.oo.o(n0VarNmm, 10, ErrorCode.getErrorCode(ErrorCode.inNetworkErrorCodeRequestFailPacing, "", "Error Code Request fail in pacing"));
                                                    i2 = 1;
                                                } else {
                                                    if (iMnn != 0) {
                                                        i2 = 1;
                                                        if (next.oonm() == 1) {
                                                            next.m0("System splash not allow preload");
                                                            omn.o(strOomn, n0Var2, "System splash not allow preload", next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 11, ErrorCode.getErrorCode(ErrorCode.filterByRefreshSystemSplash, ErrorCode.filterByRefreshSystemSplash, "System splash not allow preload"));
                                                        }
                                                    } else {
                                                        i2 = 1;
                                                    }
                                                    iO3 = com.thinkup.core.m.n.o().o(contextOn, next, strOomn, n0Var.o00n());
                                                    if (iO3 != -1) {
                                                        next.m0("The adSource load too many times within the specified time period.");
                                                        omn.o(strOomn, n0Var2, "The adSource load too many times within the specified time period.", next, (int) r14, (int) r15);
                                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, iO3, ErrorCode.getErrorCode(ErrorCode.adSourceLoadCappingError, "", "The adSource load too many times within the specified time period."));
                                                    } else {
                                                        com.thinkup.core.m.n.o();
                                                        moVarO = com.thinkup.core.m.n.o(contextOn, next);
                                                        if (moVarO != null) {
                                                            adErrorM = moVarO.m();
                                                            if (adErrorM != null) {
                                                                desc = adErrorM.getDesc();
                                                            }
                                                            String str3 = desc;
                                                            next.m0(str3);
                                                            omn.o(strOomn, n0Var2, str3, next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, moVarO.o(), adErrorM);
                                                        } else {
                                                            nVar = (com.thinkup.core.common.oom.o.m.n) com.thinkup.core.common.oom.o.o.o0.o(strOomn, com.thinkup.core.common.oom.o.m.n.class);
                                                            if (nVar == null) {
                                                            }
                                                        }
                                                    }
                                                    next.no();
                                                    it.remove();
                                                }
                                                next.no();
                                                it.remove();
                                            } else {
                                                if (next.oom()) {
                                                    if (!m0n.m(next)) {
                                                        if (com.thinkup.core.common.n.o().m(next)) {
                                                            next.mn(-7);
                                                            next.m0("Bid fail in pacing");
                                                            omn.o(strOomn, n0Var2, "Bid fail in pacing", next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                                                        } else if (next.nnm() == 1) {
                                                        }
                                                    } else if (com.thinkup.core.common.n.o().m(next)) {
                                                        next.mn(-7);
                                                        next.m0("Bid fail in pacing");
                                                        omn.o(strOomn, n0Var2, "Bid fail in pacing", next, (int) r14, (int) r15);
                                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                                                    } else if (next.nnm() == 1) {
                                                    }
                                                }
                                                if (com.thinkup.core.common.n.o().o(iMnn, n0Var, next)) {
                                                    next.mn(-8);
                                                    next.m0("Error Code Request fail in pacing");
                                                    omn.o(strOomn, n0Var2, "Error Code Request fail in pacing", next, (int) r14, (int) r15);
                                                    com.thinkup.core.common.oo0.oo.o(n0VarNmm, 10, ErrorCode.getErrorCode(ErrorCode.inNetworkErrorCodeRequestFailPacing, "", "Error Code Request fail in pacing"));
                                                    i2 = 1;
                                                } else {
                                                    if (iMnn != 0) {
                                                        i2 = 1;
                                                        if (next.oonm() == 1) {
                                                            next.m0("System splash not allow preload");
                                                            omn.o(strOomn, n0Var2, "System splash not allow preload", next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 11, ErrorCode.getErrorCode(ErrorCode.filterByRefreshSystemSplash, ErrorCode.filterByRefreshSystemSplash, "System splash not allow preload"));
                                                        }
                                                    } else {
                                                        i2 = 1;
                                                    }
                                                    iO3 = com.thinkup.core.m.n.o().o(contextOn, next, strOomn, n0Var.o00n());
                                                    if (iO3 != -1) {
                                                        next.m0("The adSource load too many times within the specified time period.");
                                                        omn.o(strOomn, n0Var2, "The adSource load too many times within the specified time period.", next, (int) r14, (int) r15);
                                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, iO3, ErrorCode.getErrorCode(ErrorCode.adSourceLoadCappingError, "", "The adSource load too many times within the specified time period."));
                                                    } else {
                                                        com.thinkup.core.m.n.o();
                                                        moVarO = com.thinkup.core.m.n.o(contextOn, next);
                                                        if (moVarO != null) {
                                                            adErrorM = moVarO.m();
                                                            if (adErrorM != null) {
                                                                desc = adErrorM.getDesc();
                                                            }
                                                            String str4 = desc;
                                                            next.m0(str4);
                                                            omn.o(strOomn, n0Var2, str4, next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, moVarO.o(), adErrorM);
                                                        } else {
                                                            nVar = (com.thinkup.core.common.oom.o.m.n) com.thinkup.core.common.oom.o.o.o0.o(strOomn, com.thinkup.core.common.oom.o.m.n.class);
                                                            if (nVar == null) {
                                                            }
                                                        }
                                                    }
                                                    next.no();
                                                    it.remove();
                                                }
                                                next.no();
                                                it.remove();
                                            }
                                        } else {
                                            listNm = com.thinkup.core.common.n.o0n.m().nm(strOomn);
                                            if (listNm == null) {
                                                if (next.oom()) {
                                                    if (!m0n.m(next)) {
                                                        if (com.thinkup.core.common.n.o().m(next)) {
                                                            next.mn(-7);
                                                            next.m0("Bid fail in pacing");
                                                            omn.o(strOomn, n0Var2, "Bid fail in pacing", next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                                                        } else if (next.nnm() == 1) {
                                                        }
                                                    } else if (com.thinkup.core.common.n.o().m(next)) {
                                                        next.mn(-7);
                                                        next.m0("Bid fail in pacing");
                                                        omn.o(strOomn, n0Var2, "Bid fail in pacing", next, (int) r14, (int) r15);
                                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                                                    } else if (next.nnm() == 1) {
                                                    }
                                                }
                                                if (com.thinkup.core.common.n.o().o(iMnn, n0Var, next)) {
                                                    next.mn(-8);
                                                    next.m0("Error Code Request fail in pacing");
                                                    omn.o(strOomn, n0Var2, "Error Code Request fail in pacing", next, (int) r14, (int) r15);
                                                    com.thinkup.core.common.oo0.oo.o(n0VarNmm, 10, ErrorCode.getErrorCode(ErrorCode.inNetworkErrorCodeRequestFailPacing, "", "Error Code Request fail in pacing"));
                                                    i2 = 1;
                                                } else {
                                                    if (iMnn != 0) {
                                                        i2 = 1;
                                                        if (next.oonm() == 1) {
                                                            next.m0("System splash not allow preload");
                                                            omn.o(strOomn, n0Var2, "System splash not allow preload", next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 11, ErrorCode.getErrorCode(ErrorCode.filterByRefreshSystemSplash, ErrorCode.filterByRefreshSystemSplash, "System splash not allow preload"));
                                                        }
                                                    } else {
                                                        i2 = 1;
                                                    }
                                                    iO3 = com.thinkup.core.m.n.o().o(contextOn, next, strOomn, n0Var.o00n());
                                                    if (iO3 != -1) {
                                                        next.m0("The adSource load too many times within the specified time period.");
                                                        omn.o(strOomn, n0Var2, "The adSource load too many times within the specified time period.", next, (int) r14, (int) r15);
                                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, iO3, ErrorCode.getErrorCode(ErrorCode.adSourceLoadCappingError, "", "The adSource load too many times within the specified time period."));
                                                    } else {
                                                        com.thinkup.core.m.n.o();
                                                        moVarO = com.thinkup.core.m.n.o(contextOn, next);
                                                        if (moVarO != null) {
                                                            adErrorM = moVarO.m();
                                                            if (adErrorM != null) {
                                                                desc = adErrorM.getDesc();
                                                            }
                                                            String str5 = desc;
                                                            next.m0(str5);
                                                            omn.o(strOomn, n0Var2, str5, next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, moVarO.o(), adErrorM);
                                                        } else {
                                                            nVar = (com.thinkup.core.common.oom.o.m.n) com.thinkup.core.common.oom.o.o.o0.o(strOomn, com.thinkup.core.common.oom.o.m.n.class);
                                                            if (nVar == null) {
                                                            }
                                                        }
                                                    }
                                                    next.no();
                                                    it.remove();
                                                }
                                                next.no();
                                                it.remove();
                                            } else {
                                                if (next.oom()) {
                                                    if (!m0n.m(next)) {
                                                        if (com.thinkup.core.common.n.o().m(next)) {
                                                            next.mn(-7);
                                                            next.m0("Bid fail in pacing");
                                                            omn.o(strOomn, n0Var2, "Bid fail in pacing", next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                                                        } else if (next.nnm() == 1) {
                                                        }
                                                    } else if (com.thinkup.core.common.n.o().m(next)) {
                                                        next.mn(-7);
                                                        next.m0("Bid fail in pacing");
                                                        omn.o(strOomn, n0Var2, "Bid fail in pacing", next, (int) r14, (int) r15);
                                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                                                    } else if (next.nnm() == 1) {
                                                    }
                                                }
                                                if (com.thinkup.core.common.n.o().o(iMnn, n0Var, next)) {
                                                    next.mn(-8);
                                                    next.m0("Error Code Request fail in pacing");
                                                    omn.o(strOomn, n0Var2, "Error Code Request fail in pacing", next, (int) r14, (int) r15);
                                                    com.thinkup.core.common.oo0.oo.o(n0VarNmm, 10, ErrorCode.getErrorCode(ErrorCode.inNetworkErrorCodeRequestFailPacing, "", "Error Code Request fail in pacing"));
                                                    i2 = 1;
                                                } else {
                                                    if (iMnn != 0) {
                                                        i2 = 1;
                                                        if (next.oonm() == 1) {
                                                            next.m0("System splash not allow preload");
                                                            omn.o(strOomn, n0Var2, "System splash not allow preload", next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 11, ErrorCode.getErrorCode(ErrorCode.filterByRefreshSystemSplash, ErrorCode.filterByRefreshSystemSplash, "System splash not allow preload"));
                                                        }
                                                    } else {
                                                        i2 = 1;
                                                    }
                                                    iO3 = com.thinkup.core.m.n.o().o(contextOn, next, strOomn, n0Var.o00n());
                                                    if (iO3 != -1) {
                                                        next.m0("The adSource load too many times within the specified time period.");
                                                        omn.o(strOomn, n0Var2, "The adSource load too many times within the specified time period.", next, (int) r14, (int) r15);
                                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, iO3, ErrorCode.getErrorCode(ErrorCode.adSourceLoadCappingError, "", "The adSource load too many times within the specified time period."));
                                                    } else {
                                                        com.thinkup.core.m.n.o();
                                                        moVarO = com.thinkup.core.m.n.o(contextOn, next);
                                                        if (moVarO != null) {
                                                            adErrorM = moVarO.m();
                                                            if (adErrorM != null) {
                                                                desc = adErrorM.getDesc();
                                                            }
                                                            String str6 = desc;
                                                            next.m0(str6);
                                                            omn.o(strOomn, n0Var2, str6, next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, moVarO.o(), adErrorM);
                                                        } else {
                                                            nVar = (com.thinkup.core.common.oom.o.m.n) com.thinkup.core.common.oom.o.o.o0.o(strOomn, com.thinkup.core.common.oom.o.m.n.class);
                                                            if (nVar == null) {
                                                            }
                                                        }
                                                    }
                                                    next.no();
                                                    it.remove();
                                                }
                                                next.no();
                                                it.remove();
                                            }
                                        }
                                    }
                                }
                            } else {
                                iO = com.thinkup.core.m.o.o(contextOn).o(strOomn, next, n0Var.o00n());
                                if (iO != -1) {
                                    next.mn(-5);
                                    next.m0("Out of Cap");
                                    omn.o(strOomn, n0Var2, "Out of Cap", next, (int) r14, (int) r15);
                                    switch (iO) {
                                        case 8:
                                            i5 = 19;
                                            break;
                                        case 9:
                                            i5 = 20;
                                            break;
                                        case 10:
                                            i5 = 21;
                                            break;
                                        case 11:
                                            i5 = 22;
                                            break;
                                        default:
                                            i5 = 2;
                                            break;
                                    }
                                    com.thinkup.core.common.oo0.oo.o(n0VarNmm, i5, ErrorCode.getErrorCode(ErrorCode.outOfCapError, "", "Out of Cap"));
                                } else {
                                    com.thinkup.core.m.o0.o();
                                    iO2 = com.thinkup.core.m.o0.o(strOomn, next);
                                    if (iO2 != -1) {
                                        next.mn(-6);
                                        next.m0("Out of Pacing");
                                        omn.o(strOomn, n0Var2, "Out of Pacing", next, (int) r14, (int) r15);
                                        if (iO2 == 12) {
                                            i4 = 23;
                                        } else if (iO2 != 13) {
                                            i4 = 3;
                                        } else {
                                            i4 = 24;
                                        }
                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, i4, ErrorCode.getErrorCode(ErrorCode.inPacingError, "", "Out of Pacing"));
                                    } else if (com.thinkup.core.common.n.o().o(next)) {
                                        next.mn(-6);
                                        next.m0("Request fail in pacing");
                                        omn.o(strOomn, n0Var2, "Request fail in pacing", next, (int) r14, (int) r15);
                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Request fail in pacing"));
                                    } else {
                                        listNo = com.thinkup.core.common.n.o0n.m().no(strOomn);
                                        if (listNo == null) {
                                            listNm = com.thinkup.core.common.n.o0n.m().nm(strOomn);
                                            if (listNm == null) {
                                                if (next.oom()) {
                                                    if (!m0n.m(next)) {
                                                        if (com.thinkup.core.common.n.o().m(next)) {
                                                            next.mn(-7);
                                                            next.m0("Bid fail in pacing");
                                                            omn.o(strOomn, n0Var2, "Bid fail in pacing", next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                                                        } else if (next.nnm() == 1) {
                                                        }
                                                    } else if (com.thinkup.core.common.n.o().m(next)) {
                                                        next.mn(-7);
                                                        next.m0("Bid fail in pacing");
                                                        omn.o(strOomn, n0Var2, "Bid fail in pacing", next, (int) r14, (int) r15);
                                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                                                    } else if (next.nnm() == 1) {
                                                    }
                                                }
                                                if (com.thinkup.core.common.n.o().o(iMnn, n0Var, next)) {
                                                    next.mn(-8);
                                                    next.m0("Error Code Request fail in pacing");
                                                    omn.o(strOomn, n0Var2, "Error Code Request fail in pacing", next, (int) r14, (int) r15);
                                                    com.thinkup.core.common.oo0.oo.o(n0VarNmm, 10, ErrorCode.getErrorCode(ErrorCode.inNetworkErrorCodeRequestFailPacing, "", "Error Code Request fail in pacing"));
                                                    i2 = 1;
                                                } else {
                                                    if (iMnn != 0) {
                                                        i2 = 1;
                                                        if (next.oonm() == 1) {
                                                            next.m0("System splash not allow preload");
                                                            omn.o(strOomn, n0Var2, "System splash not allow preload", next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 11, ErrorCode.getErrorCode(ErrorCode.filterByRefreshSystemSplash, ErrorCode.filterByRefreshSystemSplash, "System splash not allow preload"));
                                                        }
                                                    } else {
                                                        i2 = 1;
                                                    }
                                                    iO3 = com.thinkup.core.m.n.o().o(contextOn, next, strOomn, n0Var.o00n());
                                                    if (iO3 != -1) {
                                                        next.m0("The adSource load too many times within the specified time period.");
                                                        omn.o(strOomn, n0Var2, "The adSource load too many times within the specified time period.", next, (int) r14, (int) r15);
                                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, iO3, ErrorCode.getErrorCode(ErrorCode.adSourceLoadCappingError, "", "The adSource load too many times within the specified time period."));
                                                    } else {
                                                        com.thinkup.core.m.n.o();
                                                        moVarO = com.thinkup.core.m.n.o(contextOn, next);
                                                        if (moVarO != null) {
                                                            adErrorM = moVarO.m();
                                                            if (adErrorM != null) {
                                                                desc = adErrorM.getDesc();
                                                            }
                                                            String str7 = desc;
                                                            next.m0(str7);
                                                            omn.o(strOomn, n0Var2, str7, next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, moVarO.o(), adErrorM);
                                                        } else {
                                                            nVar = (com.thinkup.core.common.oom.o.m.n) com.thinkup.core.common.oom.o.o.o0.o(strOomn, com.thinkup.core.common.oom.o.m.n.class);
                                                            if (nVar == null) {
                                                            }
                                                        }
                                                    }
                                                    next.no();
                                                    it.remove();
                                                }
                                                next.no();
                                                it.remove();
                                            } else {
                                                if (next.oom()) {
                                                    if (!m0n.m(next)) {
                                                        if (com.thinkup.core.common.n.o().m(next)) {
                                                            next.mn(-7);
                                                            next.m0("Bid fail in pacing");
                                                            omn.o(strOomn, n0Var2, "Bid fail in pacing", next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                                                        } else if (next.nnm() == 1) {
                                                        }
                                                    } else if (com.thinkup.core.common.n.o().m(next)) {
                                                        next.mn(-7);
                                                        next.m0("Bid fail in pacing");
                                                        omn.o(strOomn, n0Var2, "Bid fail in pacing", next, (int) r14, (int) r15);
                                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                                                    } else if (next.nnm() == 1) {
                                                    }
                                                }
                                                if (com.thinkup.core.common.n.o().o(iMnn, n0Var, next)) {
                                                    next.mn(-8);
                                                    next.m0("Error Code Request fail in pacing");
                                                    omn.o(strOomn, n0Var2, "Error Code Request fail in pacing", next, (int) r14, (int) r15);
                                                    com.thinkup.core.common.oo0.oo.o(n0VarNmm, 10, ErrorCode.getErrorCode(ErrorCode.inNetworkErrorCodeRequestFailPacing, "", "Error Code Request fail in pacing"));
                                                    i2 = 1;
                                                } else {
                                                    if (iMnn != 0) {
                                                        i2 = 1;
                                                        if (next.oonm() == 1) {
                                                            next.m0("System splash not allow preload");
                                                            omn.o(strOomn, n0Var2, "System splash not allow preload", next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 11, ErrorCode.getErrorCode(ErrorCode.filterByRefreshSystemSplash, ErrorCode.filterByRefreshSystemSplash, "System splash not allow preload"));
                                                        }
                                                    } else {
                                                        i2 = 1;
                                                    }
                                                    iO3 = com.thinkup.core.m.n.o().o(contextOn, next, strOomn, n0Var.o00n());
                                                    if (iO3 != -1) {
                                                        next.m0("The adSource load too many times within the specified time period.");
                                                        omn.o(strOomn, n0Var2, "The adSource load too many times within the specified time period.", next, (int) r14, (int) r15);
                                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, iO3, ErrorCode.getErrorCode(ErrorCode.adSourceLoadCappingError, "", "The adSource load too many times within the specified time period."));
                                                    } else {
                                                        com.thinkup.core.m.n.o();
                                                        moVarO = com.thinkup.core.m.n.o(contextOn, next);
                                                        if (moVarO != null) {
                                                            adErrorM = moVarO.m();
                                                            if (adErrorM != null) {
                                                                desc = adErrorM.getDesc();
                                                            }
                                                            String str8 = desc;
                                                            next.m0(str8);
                                                            omn.o(strOomn, n0Var2, str8, next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, moVarO.o(), adErrorM);
                                                        } else {
                                                            nVar = (com.thinkup.core.common.oom.o.m.n) com.thinkup.core.common.oom.o.o.o0.o(strOomn, com.thinkup.core.common.oom.o.m.n.class);
                                                            if (nVar == null) {
                                                            }
                                                        }
                                                    }
                                                    next.no();
                                                    it.remove();
                                                }
                                                next.no();
                                                it.remove();
                                            }
                                        } else {
                                            listNm = com.thinkup.core.common.n.o0n.m().nm(strOomn);
                                            if (listNm == null) {
                                                if (next.oom()) {
                                                    if (!m0n.m(next)) {
                                                        if (com.thinkup.core.common.n.o().m(next)) {
                                                            next.mn(-7);
                                                            next.m0("Bid fail in pacing");
                                                            omn.o(strOomn, n0Var2, "Bid fail in pacing", next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                                                        } else if (next.nnm() == 1) {
                                                        }
                                                    } else if (com.thinkup.core.common.n.o().m(next)) {
                                                        next.mn(-7);
                                                        next.m0("Bid fail in pacing");
                                                        omn.o(strOomn, n0Var2, "Bid fail in pacing", next, (int) r14, (int) r15);
                                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                                                    } else if (next.nnm() == 1) {
                                                    }
                                                }
                                                if (com.thinkup.core.common.n.o().o(iMnn, n0Var, next)) {
                                                    next.mn(-8);
                                                    next.m0("Error Code Request fail in pacing");
                                                    omn.o(strOomn, n0Var2, "Error Code Request fail in pacing", next, (int) r14, (int) r15);
                                                    com.thinkup.core.common.oo0.oo.o(n0VarNmm, 10, ErrorCode.getErrorCode(ErrorCode.inNetworkErrorCodeRequestFailPacing, "", "Error Code Request fail in pacing"));
                                                    i2 = 1;
                                                } else {
                                                    if (iMnn != 0) {
                                                        i2 = 1;
                                                        if (next.oonm() == 1) {
                                                            next.m0("System splash not allow preload");
                                                            omn.o(strOomn, n0Var2, "System splash not allow preload", next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 11, ErrorCode.getErrorCode(ErrorCode.filterByRefreshSystemSplash, ErrorCode.filterByRefreshSystemSplash, "System splash not allow preload"));
                                                        }
                                                    } else {
                                                        i2 = 1;
                                                    }
                                                    iO3 = com.thinkup.core.m.n.o().o(contextOn, next, strOomn, n0Var.o00n());
                                                    if (iO3 != -1) {
                                                        next.m0("The adSource load too many times within the specified time period.");
                                                        omn.o(strOomn, n0Var2, "The adSource load too many times within the specified time period.", next, (int) r14, (int) r15);
                                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, iO3, ErrorCode.getErrorCode(ErrorCode.adSourceLoadCappingError, "", "The adSource load too many times within the specified time period."));
                                                    } else {
                                                        com.thinkup.core.m.n.o();
                                                        moVarO = com.thinkup.core.m.n.o(contextOn, next);
                                                        if (moVarO != null) {
                                                            adErrorM = moVarO.m();
                                                            if (adErrorM != null) {
                                                                desc = adErrorM.getDesc();
                                                            }
                                                            String str9 = desc;
                                                            next.m0(str9);
                                                            omn.o(strOomn, n0Var2, str9, next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, moVarO.o(), adErrorM);
                                                        } else {
                                                            nVar = (com.thinkup.core.common.oom.o.m.n) com.thinkup.core.common.oom.o.o.o0.o(strOomn, com.thinkup.core.common.oom.o.m.n.class);
                                                            if (nVar == null) {
                                                            }
                                                        }
                                                    }
                                                    next.no();
                                                    it.remove();
                                                }
                                                next.no();
                                                it.remove();
                                            } else {
                                                if (next.oom()) {
                                                    if (!m0n.m(next)) {
                                                        if (com.thinkup.core.common.n.o().m(next)) {
                                                            next.mn(-7);
                                                            next.m0("Bid fail in pacing");
                                                            omn.o(strOomn, n0Var2, "Bid fail in pacing", next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                                                        } else if (next.nnm() == 1) {
                                                        }
                                                    } else if (com.thinkup.core.common.n.o().m(next)) {
                                                        next.mn(-7);
                                                        next.m0("Bid fail in pacing");
                                                        omn.o(strOomn, n0Var2, "Bid fail in pacing", next, (int) r14, (int) r15);
                                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                                                    } else if (next.nnm() == 1) {
                                                    }
                                                }
                                                if (com.thinkup.core.common.n.o().o(iMnn, n0Var, next)) {
                                                    next.mn(-8);
                                                    next.m0("Error Code Request fail in pacing");
                                                    omn.o(strOomn, n0Var2, "Error Code Request fail in pacing", next, (int) r14, (int) r15);
                                                    com.thinkup.core.common.oo0.oo.o(n0VarNmm, 10, ErrorCode.getErrorCode(ErrorCode.inNetworkErrorCodeRequestFailPacing, "", "Error Code Request fail in pacing"));
                                                    i2 = 1;
                                                } else {
                                                    if (iMnn != 0) {
                                                        i2 = 1;
                                                        if (next.oonm() == 1) {
                                                            next.m0("System splash not allow preload");
                                                            omn.o(strOomn, n0Var2, "System splash not allow preload", next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 11, ErrorCode.getErrorCode(ErrorCode.filterByRefreshSystemSplash, ErrorCode.filterByRefreshSystemSplash, "System splash not allow preload"));
                                                        }
                                                    } else {
                                                        i2 = 1;
                                                    }
                                                    iO3 = com.thinkup.core.m.n.o().o(contextOn, next, strOomn, n0Var.o00n());
                                                    if (iO3 != -1) {
                                                        next.m0("The adSource load too many times within the specified time period.");
                                                        omn.o(strOomn, n0Var2, "The adSource load too many times within the specified time period.", next, (int) r14, (int) r15);
                                                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, iO3, ErrorCode.getErrorCode(ErrorCode.adSourceLoadCappingError, "", "The adSource load too many times within the specified time period."));
                                                    } else {
                                                        com.thinkup.core.m.n.o();
                                                        moVarO = com.thinkup.core.m.n.o(contextOn, next);
                                                        if (moVarO != null) {
                                                            adErrorM = moVarO.m();
                                                            if (adErrorM != null) {
                                                                desc = adErrorM.getDesc();
                                                            }
                                                            String str10 = desc;
                                                            next.m0(str10);
                                                            omn.o(strOomn, n0Var2, str10, next, (int) r14, (int) r15);
                                                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, moVarO.o(), adErrorM);
                                                        } else {
                                                            nVar = (com.thinkup.core.common.oom.o.m.n) com.thinkup.core.common.oom.o.o.o0.o(strOomn, com.thinkup.core.common.oom.o.m.n.class);
                                                            if (nVar == null) {
                                                            }
                                                        }
                                                    }
                                                    next.no();
                                                    it.remove();
                                                }
                                                next.no();
                                                it.remove();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    next.m0("Filter ad source loading across all channels on risky devices.");
                    omn.o(strOomn, n0Var2, "Filter ad source loading across all channels on risky devices.", next, (int) r14, (int) r15);
                    com.thinkup.core.common.oo0.oo.o(n0VarNmm, 27, ErrorCode.getErrorCode(ErrorCode.adSourceLoadRiskError, "", "Filter ad source loading across all channels on risky devices."));
                }
                i2 = 1;
                next.no();
                it.remove();
            } else {
                adErrorO = o(1, n0VarNmm, next, (com.thinkup.core.common.on.om0) null);
                if (adErrorO != null) {
                    code = adErrorO.getCode();
                    code.getClass();
                    switch (code) {
                        case 1537309:
                            if (code.equals(ErrorCode.adSourceLoadBidTypeFilterError)) {
                            }
                            break;
                        case 1537310:
                            if (code.equals(ErrorCode.adSourceLoadPriceFilterError)) {
                            }
                            break;
                        case 1537311:
                            if (code.equals(ErrorCode.adSourceLoadUnitFilterError)) {
                            }
                            break;
                        default:
                            break;
                    }
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Switch insn not found in header
                        	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                        	at java.base/java.util.ArrayList.forEach(Unknown Source)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
                        */
                    /*
                        Method dump skipped, instruction units count: 1052
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.thinkup.core.common.ooo.ono.m(com.thinkup.core.oo.n0, com.thinkup.core.common.on.n0, java.util.List):void");
                }

                private static List<o0mm> o(com.thinkup.core.common.on.n0 n0Var, com.thinkup.core.oo.n0 n0Var2, List<o0mm> list) {
                    if (com.thinkup.core.common.n.o0n.m().omn()) {
                        n0Var.oomn();
                        return list;
                    }
                    if (n0Var.mnn() == 9 && n0Var2.omn0() && n0Var2.omno()) {
                        n0Var.oomn();
                        return list;
                    }
                    com.thinkup.core.oo.om omVarMm = n0Var2.mm();
                    if (omVarMm == null) {
                        n0Var.oomn();
                        return list;
                    }
                    if (list.size() <= omVarMm.om()) {
                        n0Var.oomn();
                        return list;
                    }
                    com.thinkup.core.o0.o.o0 o0VarO = com.thinkup.core.o0.m.o().o(n0Var.oomn(), n0Var2, omVarMm);
                    if (o0VarO != null) {
                        double d = o0VarO.o;
                        if (d > 0.0d) {
                            n0Var.oomn();
                            o0VarO.toString();
                            double dOo = omVarMm.oo() * d;
                            if (nn.o(list.get(0)) <= dOo) {
                                n0Var.oomn();
                                return list;
                            }
                            int size = list.size() - 1;
                            int size2 = list.size() - 1;
                            HashMap map = new HashMap();
                            for (int i2 = 0; i2 < list.size(); i2++) {
                                double dO = nn.o(list.get(i2));
                                if (!map.containsKey(String.valueOf(dO))) {
                                    map.put(String.valueOf(dO), Integer.valueOf(i2));
                                }
                                if (size2 == list.size() - 1) {
                                    if (dO == d) {
                                        size2 = i2 - omVarMm.om();
                                        n0Var.oomn();
                                    } else if (dO < d) {
                                        if (i2 > 0) {
                                            size2 = ((Integer) map.get(String.valueOf(nn.o(list.get(i2 - 1))))).intValue() - omVarMm.om();
                                            n0Var.oomn();
                                        } else {
                                            size2 = i2 - omVarMm.om();
                                            n0Var.oomn();
                                        }
                                    }
                                }
                                if (size == list.size() - 1) {
                                    if (dO == dOo) {
                                        n0Var.oomn();
                                        size = i2;
                                    } else if (dO < dOo) {
                                        size = i2 - 1;
                                        n0Var.oomn();
                                    }
                                }
                                if (size > 0 && size2 > 0) {
                                    if (size < list.size() - 1 && size2 < list.size() - 1) {
                                        n0Var.oomn();
                                        break;
                                    }
                                } else {
                                    n0Var.oomn();
                                    break;
                                }
                            }
                            int iMin = Math.min(size, size2);
                            n0Var.oomn();
                            if (iMin <= 0) {
                                n0Var.oomn();
                                return list;
                            }
                            o0mm o0mmVar = list.get(iMin);
                            double dO2 = nn.o(o0mmVar);
                            String strM0o = o0mmVar.m0o();
                            Integer num = (Integer) map.get(String.valueOf(dO2));
                            if (num != null) {
                                iMin = num.intValue();
                                strM0o = list.get(iMin).m0o();
                            }
                            n0Var.oomn();
                            n0Var.oomn();
                            List<o0mm> listSubList = list.subList(iMin, list.size());
                            int[] iArrOn = omVarMm.on();
                            if (iArrOn != null && iArrOn.length > 0) {
                                ArrayList arrayList = new ArrayList();
                                List<o0mm> listSubList2 = list.subList(0, iMin);
                                for (int i3 = 0; i3 < listSubList2.size(); i3++) {
                                    o0mm o0mmVar2 = listSubList2.get(i3);
                                    if (o(iArrOn, o0mmVar2.nm())) {
                                        arrayList.add(o0mmVar2);
                                    }
                                }
                                if (arrayList.size() > 0) {
                                    listSubList.addAll(0, arrayList);
                                }
                            }
                            com.thinkup.core.common.oo0.oo.o(n0Var, omVarMm, o0VarO.m, d, strM0o, dO2, omVarMm.m0());
                            return listSubList;
                        }
                    }
                    n0Var.oomn();
                    return list;
                }

                private static boolean o(int[] iArr, int i2) {
                    for (int i3 : iArr) {
                        if (i3 == i2) {
                            return true;
                        }
                    }
                    return false;
                }

                public static List<o0mm> o(final o00m o00mVar, List<o0mm> list) {
                    return nn.o(list, new com.thinkup.core.common.mm.om() { // from class: com.thinkup.core.common.ooo.ono.1
                        @Override // com.thinkup.core.common.mm.om
                        public final void o(o0mm o0mmVar, int i2, int i3) {
                            o0mmVar.mom(i2);
                            if (i3 >= 0) {
                                o0mmVar.moo(i3);
                                o0mn o0mnVarO = com.thinkup.core.common.o.o().o(o00mVar.n().oomn(), o0mmVar);
                                if (o0mnVarO != null) {
                                    o0mnVarO.m(o0mmVar.oo0o());
                                }
                            }
                        }
                    });
                }

                private static void o(List<o0mm> list, List<o0mm> list2, com.thinkup.core.common.on.n0 n0Var, List<o0mm> list3) {
                    String strOomn = n0Var.oomn();
                    if (list == null || list2 == null) {
                        return;
                    }
                    boolean z2 = false;
                    for (int size = list2.size() - 1; size >= 0; size--) {
                        o0mm o0mmVar = list2.get(size);
                        if (o0mmVar.o0m0()) {
                            list3.add(o0mmVar);
                        }
                        if (!o(strOomn, o0mmVar)) {
                            o0mn o0mnVarO = com.thinkup.core.common.o.o().o(strOomn, o0mmVar);
                            o0mm o0mmVar2 = null;
                            com.thinkup.core.common.on.o oVarO = o0mnVarO != null ? o0mnVarO.o((com.thinkup.core.common.on.on0) null).o() : null;
                            if (oVarO != null) {
                                o0mmVar.o(oVarO.oo().getUnitGroupInfo(), 0, 3, 1);
                                nn.o(o0mmVar);
                                o0mmVar.toString();
                                o0mmVar2 = o0mmVar;
                            }
                            if (o0mmVar2 == null) {
                                try {
                                    com.thinkup.core.common.on.on0 on0VarO = com.thinkup.core.n.n.o().o(strOomn, o0mmVar);
                                    if (on0VarO != null && !on0VarO.o()) {
                                        o0mmVar.o(on0VarO, 0, 2, 1);
                                        o0mmVar2 = o0mmVar;
                                    } else if (on0VarO != null) {
                                        com.thinkup.core.n.o0.n.o(on0VarO, new mnn(1, o0mmVar, n0Var), true, 25);
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            if (o0mmVar2 != null) {
                                try {
                                    if (o0mmVar.om0() == 7) {
                                        z2 = true;
                                    }
                                    list2.remove(size);
                                    nn.o(list, o0mmVar);
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                    if (z2) {
                        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                            if (list2.get(size2).om0() == 7) {
                                list2.remove(size2);
                            }
                        }
                    }
                }

                public static void o(com.thinkup.core.oo.n0 n0Var, com.thinkup.core.common.on.n0 n0Var2, List<o0mm> list) {
                    int i2;
                    Iterator<o0mm> it = list.iterator();
                    while (it.hasNext()) {
                        o0mm next = it.next();
                        com.thinkup.core.common.on.n0 n0VarNmm = n0Var2.nmm();
                        String strOomn = n0Var2.oomn();
                        m0m.o(n0VarNmm, next, 0, false);
                        o00o.o oVarO = com.thinkup.core.m.o.o(com.thinkup.core.common.n.o0n.m().on()).o(strOomn, next.m0o(), n0Var.o00n());
                        int i3 = oVarO != null ? oVarO.oo : 0;
                        int i4 = oVarO != null ? oVarO.o0 : 0;
                        AdError adErrorO = o(0, n0VarNmm, next, (com.thinkup.core.common.on.om0) null);
                        if (adErrorO != null) {
                            String code = adErrorO.getCode();
                            code.getClass();
                            switch (code) {
                                case "2032":
                                    i2 = 29;
                                    break;
                                case "2033":
                                    i2 = 30;
                                    break;
                                case "2034":
                                    i2 = 31;
                                    break;
                                default:
                                    i2 = 9;
                                    break;
                            }
                            int i5 = i2;
                            next.m0(adErrorO.getPlatformMSG());
                            n0VarNmm.nn(next.m0om());
                            n0VarNmm.onm(next.m0on());
                            com.thinkup.core.common.on.n0 n0Var3 = n0Var2;
                            omn.o(strOomn, n0Var3, adErrorO.getPlatformMSG(), next, i3, i4);
                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, i5, adErrorO);
                            next.no();
                            it.remove();
                            n0Var2 = n0Var3;
                        }
                    }
                }

                private static boolean o(com.thinkup.core.oo.n0 n0Var, com.thinkup.core.common.on.n0 n0Var2, o0mm o0mmVar) {
                    int i2;
                    com.thinkup.core.common.on.n0 n0VarNmm = n0Var2.nmm();
                    String strOomn = n0Var2.oomn();
                    byte b2 = 0;
                    m0m.o(n0VarNmm, o0mmVar, 0, false);
                    o00o.o oVarO = com.thinkup.core.m.o.o(com.thinkup.core.common.n.o0n.m().on()).o(strOomn, o0mmVar.m0o(), n0Var.o00n());
                    int i3 = oVarO != null ? oVarO.oo : 0;
                    int i4 = oVarO != null ? oVarO.o0 : 0;
                    AdError adErrorO = o(0, n0VarNmm, o0mmVar, (com.thinkup.core.common.on.om0) null);
                    if (adErrorO == null) {
                        return false;
                    }
                    String code = adErrorO.getCode();
                    code.getClass();
                    switch (code.hashCode()) {
                        case 1537309:
                            if (!code.equals(ErrorCode.adSourceLoadBidTypeFilterError)) {
                                b2 = -1;
                            }
                            break;
                        case 1537310:
                            b2 = !code.equals(ErrorCode.adSourceLoadPriceFilterError) ? (byte) -1 : (byte) 1;
                            break;
                        case 1537311:
                            b2 = !code.equals(ErrorCode.adSourceLoadUnitFilterError) ? (byte) -1 : (byte) 2;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                            i2 = 29;
                            break;
                        case 1:
                            i2 = 30;
                            break;
                        case 2:
                            i2 = 31;
                            break;
                        default:
                            i2 = 9;
                            break;
                    }
                    int i5 = i2;
                    o0mmVar.m0(adErrorO.getPlatformMSG());
                    n0VarNmm.nn(o0mmVar.m0om());
                    n0VarNmm.onm(o0mmVar.m0on());
                    omn.o(strOomn, n0Var2, adErrorO.getPlatformMSG(), o0mmVar, i3, i4);
                    com.thinkup.core.common.oo0.oo.o(n0VarNmm, i5, adErrorO);
                    return true;
                }

                public static AdError o(int i2, com.thinkup.core.common.on.n0 n0Var, o0mm o0mmVar, com.thinkup.core.common.on.om0 om0Var) {
                    Map<String, TUAdFilter> mapNom;
                    TUAdFilter tUAdFilter;
                    if (n0Var == null || o0mmVar == null || (mapNom = com.thinkup.core.common.n.o0n.m().nom()) == null || mapNom.isEmpty() || (tUAdFilter = mapNom.get(n0Var.oomn())) == null) {
                        return null;
                    }
                    int iOo = nn.oo(o0mmVar.mn());
                    String strO = m0n.o(o0mmVar, (TUBaseAdAdapter) null);
                    double dO = nn.o(o0mmVar);
                    if (om0Var != null) {
                        dO = om0Var.getSortPrice();
                    }
                    return tUAdFilter.doFilter(new o0nn(i2, String.valueOf(o0mmVar.nm()), String.valueOf(iOo), dO, strO, o0mmVar));
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:28:0x00bb  */
                private static boolean o(int i2, com.thinkup.core.oo.n0 n0Var, com.thinkup.core.common.on.n0 n0Var2, o0mm o0mmVar) {
                    boolean z2;
                    com.thinkup.core.common.on.m0m m0mVarO;
                    int i3;
                    String str;
                    String str2;
                    com.thinkup.core.common.on.on onVarN;
                    Boolean boolM;
                    int i4;
                    int i5;
                    int i6;
                    com.thinkup.core.common.on.n0 n0VarNmm = n0Var2.nmm();
                    String strOomn = n0Var2.oomn();
                    m0m.o(n0VarNmm, o0mmVar, 0, false);
                    o00o.o oVarO = com.thinkup.core.m.o.o(com.thinkup.core.common.n.o0n.m().on()).o(strOomn, o0mmVar.m0o(), n0Var.o00n());
                    int i7 = oVarO != null ? oVarO.oo : 0;
                    int i8 = oVarO != null ? oVarO.o0 : 0;
                    Context contextOn = com.thinkup.core.common.n.o0n.m().on();
                    Pair<Integer, List<String>> pairMo0 = com.thinkup.core.common.n.o0n.m().mo0();
                    String desc = "";
                    if (pairMo0 != null && ((Integer) pairMo0.first).intValue() == 1) {
                        List list = (List) pairMo0.second;
                        if (list != null && !list.isEmpty()) {
                            if (list.contains(String.valueOf(o0mmVar.nm()))) {
                                o0mmVar.m0("Filter ad source loading for specified channel id on risky devices.");
                                omn.o(strOomn, n0Var2, "Filter ad source loading for specified channel id on risky devices.", o0mmVar, i7, i8, list);
                                com.thinkup.core.common.oo0.oo.o(n0VarNmm, 28, ErrorCode.getErrorCode(ErrorCode.adSourceLoadRiskError, "", "Filter ad source loading for specified channel id on risky devices."));
                                return true;
                            }
                        } else {
                            o0mmVar.m0("Filter ad source loading across all channels on risky devices.");
                            omn.o(strOomn, n0Var2, "Filter ad source loading across all channels on risky devices.", o0mmVar, i7, i8);
                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 27, ErrorCode.getErrorCode(ErrorCode.adSourceLoadRiskError, "", "Filter ad source loading across all channels on risky devices."));
                            return true;
                        }
                    }
                    int i9 = i7;
                    AdError adErrorO = o(1, n0VarNmm, o0mmVar, (com.thinkup.core.common.on.om0) null);
                    if (adErrorO != null) {
                        String code = adErrorO.getCode();
                        code.getClass();
                        switch (code) {
                            case "2032":
                                i6 = 29;
                                break;
                            case "2033":
                                i6 = 30;
                                break;
                            case "2034":
                                i6 = 31;
                                break;
                            default:
                                i6 = 9;
                                break;
                        }
                        o0mmVar.m0(adErrorO.getPlatformMSG());
                        n0VarNmm.nn(o0mmVar.m0om());
                        n0VarNmm.onm(o0mmVar.m0on());
                        omn.o(strOomn, n0Var2, adErrorO.getPlatformMSG(), o0mmVar, i9, i8);
                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, i6, adErrorO);
                        return true;
                    }
                    List<String> listMoo = com.thinkup.core.common.n.o0n.m().moo();
                    com.thinkup.core.common.n.o0n.m();
                    if (com.thinkup.core.common.n.o0n.o(listMoo, String.valueOf(o0mmVar.nm()))) {
                        o0mmVar.m0("Forbid network by developer");
                        omn.o(strOomn, n0Var2, "Forbid network by developer", o0mmVar, i9, i8, listMoo);
                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, 14, ErrorCode.getErrorCode(ErrorCode.forbidNetworkByDeveloper, "", "Forbid network by developer"));
                        return true;
                    }
                    if (m0n.m(o0mmVar)) {
                        z2 = true;
                        if (com.thinkup.core.common.o.mo.o(contextOn).o(o0mmVar.m0o())) {
                            o0mmVar.m0("Adx bid Pacing");
                            omn.o(strOomn, n0Var2, "Adx bid Pacing", o0mmVar, i9, i8);
                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 12, ErrorCode.getErrorCode(ErrorCode.inAdxBidInterval, "", "Adx bid Pacing"));
                            return true;
                        }
                    } else {
                        z2 = true;
                    }
                    int iO = com.thinkup.core.m.o.o(contextOn).o(strOomn, o0mmVar, n0Var.o00n());
                    if (iO != -1) {
                        o0mmVar.mn(-5);
                        o0mmVar.m0("Out of Cap");
                        omn.o(strOomn, n0Var2, "Out of Cap", o0mmVar, i9, i8);
                        switch (iO) {
                            case 8:
                                i5 = 19;
                                break;
                            case 9:
                                i5 = 20;
                                break;
                            case 10:
                                i5 = 21;
                                break;
                            case 11:
                                i5 = 22;
                                break;
                            default:
                                i5 = 2;
                                break;
                        }
                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, i5, ErrorCode.getErrorCode(ErrorCode.outOfCapError, "", "Out of Cap"));
                        return z2;
                    }
                    com.thinkup.core.m.o0.o();
                    int iO2 = com.thinkup.core.m.o0.o(strOomn, o0mmVar);
                    if (iO2 != -1) {
                        o0mmVar.mn(-6);
                        o0mmVar.m0("Out of Pacing");
                        omn.o(strOomn, n0Var2, "Out of Pacing", o0mmVar, i9, i8);
                        if (iO2 != 12) {
                            i4 = iO2 != 13 ? 3 : 24;
                        } else {
                            i4 = 23;
                        }
                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, i4, ErrorCode.getErrorCode(ErrorCode.inPacingError, "", "Out of Pacing"));
                        return z2;
                    }
                    if (com.thinkup.core.common.n.o().o(o0mmVar)) {
                        o0mmVar.mn(-6);
                        o0mmVar.m0("Request fail in pacing");
                        omn.o(strOomn, n0Var2, "Request fail in pacing", o0mmVar, i9, i8);
                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Request fail in pacing"));
                        return z2;
                    }
                    List<String> listNo = com.thinkup.core.common.n.o0n.m().no(strOomn);
                    if (listNo != null && listNo.contains(o0mmVar.m0o())) {
                        o0mmVar.mn(-8);
                        o0mmVar.m0("Request fail in filter list");
                        omn.o(strOomn, n0Var2, "Request fail in filter list", o0mmVar, i9, i8, listNo);
                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, 5, ErrorCode.getErrorCode(ErrorCode.filterSourceError, "", "Request fail in filter list"));
                        return z2;
                    }
                    List<String> listNm = com.thinkup.core.common.n.o0n.m().nm(strOomn);
                    if (listNm != null && listNm.contains(String.valueOf(o0mmVar.nm()))) {
                        o0mmVar.mn(-8);
                        o0mmVar.m0("Filter by network firm id.");
                        omn.o(strOomn, n0Var2, "Filter by network firm id.", o0mmVar, i9, i8, listNm);
                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, 9, ErrorCode.getErrorCode(ErrorCode.networkFirmIdFilterSourceError, "", "Filter by network firm id."));
                        return z2;
                    }
                    if (o0mmVar.oom()) {
                        if (m0n.m(o0mmVar) && (boolM = com.thinkup.core.common.o.mo.o(contextOn).m(o0mmVar.m0o())) != null) {
                            if (boolM.booleanValue()) {
                                o0mmVar.m0("Adx bid fail in pacing");
                                omn.o(strOomn, n0Var2, "Bid fail in pacing", o0mmVar, i9, i8);
                                com.thinkup.core.common.oo0.oo.o(n0VarNmm, 13, ErrorCode.getErrorCode(ErrorCode.inAdxBidFailedInterval, "", "Adx Bid fail in pacing"));
                                return z2;
                            }
                        } else if (com.thinkup.core.common.n.o().m(o0mmVar)) {
                            o0mmVar.mn(-7);
                            o0mmVar.m0("Bid fail in pacing");
                            omn.o(strOomn, n0Var2, "Bid fail in pacing", o0mmVar, i9, i8);
                            com.thinkup.core.common.oo0.oo.o(n0VarNmm, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                            return z2;
                        }
                        if (o0mmVar.nnm() != z2 && o0mmVar.om0() == 2 && (onVarN = com.thinkup.core.common.ooo.o().n(strOomn)) != null && onVarN.o(o0mmVar)) {
                            o0mmVar.mn(-7);
                            o0mmVar.m0("Can't Load On Showing");
                            omn.o(strOomn, n0Var2, "Can't Load On Showing", o0mmVar, i9, i8);
                            com.thinkup.core.common.oo0.oo.o(n0Var2, 7, ErrorCode.getErrorCode(ErrorCode.loadInShowingFilter, "", "Can't Load On Showing"));
                            return true;
                        }
                    }
                    if (com.thinkup.core.common.n.o().o(i2, n0Var, o0mmVar)) {
                        o0mmVar.mn(-8);
                        o0mmVar.m0("Error Code Request fail in pacing");
                        omn.o(strOomn, n0Var2, "Error Code Request fail in pacing", o0mmVar, i9, i8);
                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, 10, ErrorCode.getErrorCode(ErrorCode.inNetworkErrorCodeRequestFailPacing, "", "Error Code Request fail in pacing"));
                        return true;
                    }
                    if (i2 != 0 && o0mmVar.oonm() == 1) {
                        o0mmVar.m0("System splash not allow preload");
                        omn.o(strOomn, n0Var2, "System splash not allow preload", o0mmVar, i9, i8);
                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, 11, ErrorCode.getErrorCode(ErrorCode.filterByRefreshSystemSplash, ErrorCode.filterByRefreshSystemSplash, "System splash not allow preload"));
                        return true;
                    }
                    int iO3 = com.thinkup.core.m.n.o().o(contextOn, o0mmVar, strOomn, n0Var.o00n());
                    if (iO3 != -1) {
                        o0mmVar.m0("The adSource load too many times within the specified time period.");
                        omn.o(strOomn, n0Var2, "The adSource load too many times within the specified time period.", o0mmVar, i9, i8);
                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, iO3, ErrorCode.getErrorCode(ErrorCode.adSourceLoadCappingError, "", "The adSource load too many times within the specified time period."));
                        return true;
                    }
                    com.thinkup.core.m.n.o();
                    com.thinkup.core.common.on.mo moVarO = com.thinkup.core.m.n.o(contextOn, o0mmVar);
                    if (moVarO != null) {
                        AdError adErrorM = moVarO.m();
                        if (adErrorM != null) {
                            desc = adErrorM.getDesc();
                        }
                        String str3 = desc;
                        o0mmVar.m0(str3);
                        omn.o(strOomn, n0Var2, str3, o0mmVar, i9, i8);
                        com.thinkup.core.common.oo0.oo.o(n0VarNmm, moVarO.o(), adErrorM);
                        return true;
                    }
                    com.thinkup.core.common.oom.o.m.n nVar = (com.thinkup.core.common.oom.o.m.n) com.thinkup.core.common.oom.o.o.o0.o(strOomn, com.thinkup.core.common.oom.o.m.n.class);
                    if (nVar == null || (m0mVarO = nVar.o(o0mmVar)) == null) {
                        return false;
                    }
                    if (m0mVarO.o0() == com.thinkup.core.common.oom.o.o.C0687o.m) {
                        i3 = 16;
                        str = ErrorCode.filterByMNErrorCodeReqLimit;
                        str2 = "AD platform's error code strategy limit1";
                    } else {
                        i3 = 17;
                        str = ErrorCode.filterByMatchNetworkErrorCode;
                        str2 = "AD platform's error code strategy limit2";
                    }
                    String str4 = str;
                    String str5 = str2;
                    int i10 = i3;
                    o0mmVar.m0(str5);
                    omn.o(strOomn, n0Var2, str5, o0mmVar, i9, i8);
                    com.thinkup.core.common.oo0.oo.o(n0VarNmm, i10, ErrorCode.getErrorCode(str4, str4, str5));
                    return true;
                }

                private static boolean o(String str, o0mm o0mmVar) {
                    com.thinkup.core.common.on.o oVarO;
                    if (m0n.m(o0mmVar)) {
                        com.thinkup.core.common.on.on0 on0VarO = com.thinkup.core.n.n.o().o(str, o0mmVar);
                        if (on0VarO != null && !on0VarO.o() && on0VarO.o0m()) {
                            return false;
                        }
                        o0mn o0mnVarO = com.thinkup.core.common.o.o().o(str, o0mmVar);
                        if (o0mnVarO != null && (oVarO = o0mnVarO.o((com.thinkup.core.common.on.on0) null).o()) != null && oVarO.oo() != null && oVarO.oo().getUnitGroupInfo() != null && TextUtils.equals(oVarO.oo().getUnitGroupInfo().m0o(), o0mmVar.m0o()) && oVarO.oo().getUnitGroupInfo().m000()) {
                            return false;
                        }
                        Boolean boolO = com.thinkup.core.common.o.mo.o(com.thinkup.core.common.n.o0n.m().on()).o(o0mmVar);
                        if (boolO != null) {
                            return boolO.booleanValue();
                        }
                    }
                    return o0mmVar.omo() == 2;
                }
            }
