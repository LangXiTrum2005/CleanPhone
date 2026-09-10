package com.thinkup.core.common.n0;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.d9;
import com.p004ironsource.ko;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.TUSDK;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o {
    public static final String m0 = "application/json";
    private static final String o = "http.loader";
    public static final int o0 = 699;
    public static final int om = 200;
    public static final String on = "Content-Type";
    public static final int oo = 700;
    private final com.thinkup.core.common.n0.n.mo m = com.thinkup.core.common.n.o0n.m().n0n();
    protected boolean mm;
    protected String mn;
    protected o0o mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.thinkup.core.common.n0.m.o0 f41954n;
    private com.thinkup.core.common.n0.o.m n0;
    private boolean nm;
    private com.thinkup.core.common.n0.o.o.o nn;
    private long no;

    /* JADX INFO: renamed from: com.thinkup.core.common.n0.o$1, reason: invalid class name */
    public class AnonymousClass1 extends com.thinkup.core.common.ooo.m.o0 {
        final /* synthetic */ int o;

        public AnonymousClass1(int i2) {
            this.o = i2;
        }

        @Override // com.thinkup.core.common.ooo.m.o0
        public final void o() {
            com.thinkup.core.common.n0.m.om omVarO;
            try {
                o oVar = o.this;
                if (oVar.mm) {
                    oVar.n(this.o);
                    return;
                }
                o.o(oVar);
                com.thinkup.core.common.n.o0n.m().mnn();
                o oVar2 = o.this;
                oVar2.mn = oVar2.m();
                int iOooo = com.thinkup.core.oo.o0.o().oooo();
                String strM = o.m(o.this);
                o.this.getClass();
                String str = o.this.mn;
                o0o o0oVar = o.this.mo;
                if (o0oVar != null) {
                    o0oVar.onLoadStart(this.o);
                }
                if (o.this.f41954n == null) {
                    o oVar3 = o.this;
                    oVar3.f41954n = oVar3.nn();
                }
                if (o.this.f41954n != null && o.this.m != null && (omVarO = o.this.m.o(o.this.f41954n)) != null && omVarO.oo()) {
                    int iOm = omVarO.om();
                    String strValueOf = String.valueOf(iOm);
                    if (iOm != 200) {
                        o.this.o(this.o, iOm, "", ErrorCode.getErrorCode(ErrorCode.statuError, strValueOf, ""), false);
                        return;
                    } else {
                        o.this.o(this.o, omVarO.on(), false);
                        return;
                    }
                }
                com.thinkup.core.common.n0.o.m ooVar = o.this.n0;
                if (ooVar == null) {
                    if (o.this.nn == null) {
                        o oVar4 = o.this;
                        oVar4.nn = new com.thinkup.core.common.n0.o.o.o(oVar4.getClass().getName(), o.this.mn);
                    }
                    com.thinkup.core.common.n0.o.om.o oVarO = new com.thinkup.core.common.n0.o.om.o().o(com.thinkup.core.common.ooo.m.m.o().n());
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    com.thinkup.core.common.n0.o.om omVarO2 = oVarO.o(timeUnit).n(timeUnit).m(timeUnit).o(o.this.nn.o(o.this.f41954n)).o(iOooo).o();
                    ooVar = com.thinkup.core.oo.m.m(omVarO2.mm) ? new com.thinkup.core.common.n0.o.o.oo(omVarO2) : new com.thinkup.core.common.n0.o.o.m(omVarO2);
                    o.this.n0 = ooVar;
                }
                com.thinkup.core.common.n0.o.mm mmVarO = ooVar.o(new com.thinkup.core.common.n0.o.mo.o().o(o.this.mn).m(strM).n(o.m0(o.this)).o(o.this.o0()).o(o.on(o.this)).o());
                int i2 = mmVarO.m;
                if (i2 != 200 && i2 != 201 && i2 != 204 && !o.this.o(i2)) {
                    o.m(o.this, mmVarO, this.o);
                    return;
                }
                o.o(o.this, mmVarO, this.o);
            } catch (Throwable th) {
                o.this.o(0, 0, th.getMessage(), ErrorCode.getErrorCode(ErrorCode.httpStatuException, "0", th.getMessage()));
            }
        }
    }

    public static /* synthetic */ String m0(o oVar) {
        Map<String, String> mapN = oVar.n();
        return (mapN == null || !mapN.containsKey("Content-Type")) ? "application/json" : mapN.get("Content-Type");
    }

    private void om0() {
        com.thinkup.core.common.n0.o.o.o oVar;
        if (!omo() || (oVar = this.nn) == null) {
            return;
        }
        com.thinkup.core.common.oo0.oo.o(oVar.o());
    }

    private boolean omo() {
        com.thinkup.core.common.n0.o.o.o oVar = this.nn;
        com.thinkup.core.common.n0.m.o oVarO = oVar != null ? oVar.o() : null;
        return oVarO != null && oVarO.nn();
    }

    public static /* synthetic */ Map on(o oVar) {
        Map<String, String> mapN = oVar.n();
        if (mapN == null) {
            mapN = new HashMap<>();
        }
        if (com.thinkup.core.common.n.o0n.m().n("ua")) {
            mapN.put(Command.HTTP_HEADER_USER_AGENT, com.thinkup.core.common.ooo.nn.o());
        }
        return mapN;
    }

    private void oo0() {
        this.mm = true;
        com.thinkup.core.common.n0.o.m mVar = this.n0;
        if (mVar != null) {
            mVar.o();
        }
    }

    private Map<String, String> oom() {
        Map<String, String> mapN = n();
        if (mapN == null) {
            mapN = new HashMap<>();
        }
        if (com.thinkup.core.common.n.o0n.m().n("ua")) {
            mapN.put(Command.HTTP_HEADER_USER_AGENT, com.thinkup.core.common.ooo.nn.o());
        }
        return mapN;
    }

    private String oon() {
        Map<String, String> mapN = n();
        return (mapN == null || !mapN.containsKey("Content-Type")) ? "application/json" : mapN.get("Content-Type");
    }

    private String ooo() {
        int iO = o();
        if (iO != 1 && iO != 2) {
            iO = 2;
        }
        return iO == 2 ? ko.f25534a : ko.f25535b;
    }

    public abstract String m();

    public void m(int i2) {
    }

    public abstract Map<String, Object> m0();

    public JSONObject mm() {
        return oo.m(nm(), o0m());
    }

    public String mn() {
        HashMap map = new HashMap();
        String strO = com.thinkup.core.common.ooo.mm.o(mo().toString());
        String strO2 = com.thinkup.core.common.ooo.mm.o(mm().toString());
        map.put("api_ver", o00());
        map.put("p", strO);
        map.put("p2", strO2);
        ArrayList<String> arrayList = new ArrayList(map.size());
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (sb.length() > 0) {
                sb.append(d9.i.f24749c);
            }
            sb.append(str);
            sb.append(d9.i.f24747b);
            sb.append(map.get(str));
        }
        map.put("sign", com.thinkup.core.common.ooo.nm.n(on() + sb.toString()));
        if (m0() != null) {
            map.putAll(m0());
        }
        Set<String> setKeySet = map.keySet();
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str2 : setKeySet) {
                jSONObject.put(str2, String.valueOf(map.get(str2)));
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            return null;
        }
    }

    public JSONObject mo() {
        return oo.o(nm(), o0m());
    }

    public abstract Map<String, String> n();

    public abstract void n0();

    @Deprecated
    public int nm() {
        return 0;
    }

    public com.thinkup.core.common.n0.m.o0 nn() {
        return null;
    }

    public boolean no() {
        return false;
    }

    public abstract int o();

    public abstract Object o(Object obj);

    public abstract void o(AdError adError);

    public boolean o(int i2) {
        return false;
    }

    public abstract byte[] o0();

    public String o00() {
        return "1.0";
    }

    public List<String> o0m() {
        return null;
    }

    public boolean o0n() {
        return false;
    }

    public boolean o0o() {
        return false;
    }

    public abstract Context om();

    public abstract String on();

    public abstract String oo();

    private void m(int i2, Object obj) {
        com.thinkup.core.common.n0.m.o0 o0Var;
        if (this.m == null || (o0Var = this.f41954n) == null) {
            return;
        }
        String strO = o0Var.o();
        String strM = this.f41954n.m();
        com.thinkup.core.common.n0.m.om omVarO = com.thinkup.core.common.n0.m.om.o();
        if (obj != null && ("eu_traffic".equals(strM) || "get_area".equals(strM))) {
            omVarO.o(obj);
        }
        long j = this.no;
        if (j > 0) {
            omVarO.o(j);
        }
        omVarO.o(i2);
        omVarO.o(strO);
        this.m.o(omVarO, this.f41954n);
    }

    private void o0(int i2) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i2);
        if (o0o()) {
            com.thinkup.core.common.ooo.m.m.o().o((com.thinkup.core.common.ooo.m.o0) anonymousClass1, 1);
        } else {
            com.thinkup.core.common.ooo.m.m.o().o((com.thinkup.core.common.ooo.m.o0) anonymousClass1, 10);
        }
    }

    public final void n(int i2) {
        o0o o0oVar = this.mo;
        if (o0oVar != null) {
            o0oVar.onLoadCanceled(i2);
        }
    }

    public static /* synthetic */ boolean o(o oVar) {
        oVar.nm = false;
        return false;
    }

    public void o(int i2, o0o o0oVar) {
        this.mm = false;
        this.mo = o0oVar;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i2);
        if (o0o()) {
            com.thinkup.core.common.ooo.m.m.o().o((com.thinkup.core.common.ooo.m.o0) anonymousClass1, 1);
        } else {
            com.thinkup.core.common.ooo.m.m.o().o((com.thinkup.core.common.ooo.m.o0) anonymousClass1, 10);
        }
    }

    private void m(com.thinkup.core.common.n0.o.mm mmVar, int i2) {
        String strM;
        JSONObject jSONObject;
        int i3 = mmVar.m;
        try {
            com.thinkup.core.common.n0.o.mn mnVar = mmVar.oo;
            String strTrim = "";
            if (mnVar == null) {
                strM = "";
            } else if (o0n()) {
                strM = mnVar.n();
            } else {
                strM = mnVar.m();
            }
            if (!o(i3) && (i3 == 201 || i3 == 204)) {
                o(i2, o((Object) null));
                return;
            }
            if (no()) {
                if (!TextUtils.isEmpty(strM)) {
                    strTrim = strM.trim();
                    try {
                        jSONObject = new JSONObject(strTrim);
                    } catch (Throwable unused) {
                        jSONObject = new JSONObject();
                    }
                } else {
                    jSONObject = new JSONObject();
                }
                int iOptInt = jSONObject.optInt("code", 0);
                if (iOptInt == 0) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.thinkup.core.common.n.mo.oo.oo);
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = new JSONObject();
                    }
                    o(i2, o(jSONObjectOptJSONObject));
                    return;
                }
                o(i2, -10000, strTrim, ErrorCode.getErrorCode(ErrorCode.statuError, String.valueOf(iOptInt), strTrim));
                return;
            }
            o(i2, o((Object) (strM != null ? strM.trim() : null)));
        } catch (Throwable th) {
            o(i2, i3, th.getMessage(), ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i3), th.getMessage()));
        }
    }

    public void o(int i2, int i3, String str, AdError adError) {
        o(i2, i3, str, adError, true);
    }

    public final void o(int i2, int i3, String str, AdError adError, boolean z2) {
        o(i2, i3, str, adError, z2, false, false);
    }

    private void o(int i2, int i3, String str, AdError adError, boolean z2, boolean z3, boolean z4) {
        if (this.nm) {
            return;
        }
        this.nm = true;
        o0o o0oVar = this.mo;
        if (o0oVar != null) {
            o0oVar.onLoadError(i2, str, adError);
        }
        if (z4) {
            o(i3, str);
        }
        m(i3);
        if (z2) {
            m(i3, (Object) null);
        }
        if (z3) {
            n0();
        }
        o(adError);
        om0();
    }

    public void o(int i2, Object obj) {
        o(i2, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(int i2, Object obj, boolean z2) {
        if (this.nm) {
            return;
        }
        this.nm = true;
        o0o o0oVar = this.mo;
        if (o0oVar != null) {
            o0oVar.onLoadFinish(i2, obj);
        }
        if (z2) {
            m(200, obj);
            om0();
        }
    }

    public static byte[] o(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes("utf-8"));
            gZIPOutputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static /* synthetic */ String m(o oVar) {
        int iO = oVar.o();
        if (iO != 1 && iO != 2) {
            iO = 2;
        }
        if (iO == 2) {
            return ko.f25534a;
        }
        return ko.f25535b;
    }

    private void o(int i2, String str) {
        int iNm = nm();
        if (TUSDK.isCnSDK() || (iNm & 8) != 8) {
            return;
        }
        com.thinkup.core.common.om.n.o().o(this.mn, i2, str, new com.thinkup.core.common.om.o0() { // from class: com.thinkup.core.common.n0.o.2
            @Override // com.thinkup.core.common.om.o0
            public final void o(String str2) {
            }
        });
    }

    public static /* synthetic */ void m(o oVar, com.thinkup.core.common.n0.o.mm mmVar, int i2) {
        String strConcat;
        int i3;
        boolean z2;
        boolean z3;
        Throwable th = mmVar.o0;
        int i4 = mmVar.m;
        String str = "";
        String message = th != null ? th.getMessage() : "";
        if (th instanceof UnknownHostException) {
            strConcat = "UnknownHostException: ".concat(String.valueOf(message));
            i3 = -1000;
            z2 = true;
            z3 = false;
        } else {
            if (th instanceof ConnectException) {
                strConcat = "ConnectException: ".concat(String.valueOf(message));
                i3 = -1001;
                z2 = true;
            } else {
                if (th instanceof SSLException) {
                    strConcat = "SSLException: ".concat(String.valueOf(message));
                    i3 = -1006;
                } else if (th instanceof SocketException) {
                    strConcat = "SocketException: ".concat(String.valueOf(message));
                    i3 = -1007;
                } else if (th instanceof SocketTimeoutException) {
                    strConcat = "SocketTimeoutException: ".concat(String.valueOf(message));
                    i3 = -1002;
                } else if (th instanceof ConnectTimeoutException) {
                    strConcat = "ConnectTimeoutException: ".concat(String.valueOf(message));
                    i3 = -1003;
                } else {
                    if (th instanceof IOException) {
                        strConcat = "IOException: ".concat(String.valueOf(message));
                        i3 = -1008;
                    } else {
                        if (th == null) {
                            strConcat = mmVar.f41955n;
                        } else if (!TextUtils.isEmpty(mmVar.f41955n)) {
                            strConcat = "Msg: " + mmVar.f41955n + "Exception: " + th + ", Message: " + message;
                        } else {
                            strConcat = "Exception: " + th + ", Message: " + message;
                        }
                        i3 = -9998;
                    }
                    z2 = false;
                }
                z3 = true;
                z2 = false;
            }
            z3 = z2;
        }
        if (oVar.omo()) {
            strConcat = "cus-dns,".concat(String.valueOf(strConcat));
        }
        String str2 = strConcat;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i3), str2);
        Map<String, List<String>> map = mmVar.om;
        if (map != null && !map.isEmpty() && mmVar.m == 699) {
            try {
                List<String> list = map.get("Req-Next-Time");
                if (list != null && !list.isEmpty()) {
                    str = list.get(0);
                }
                if (!TextUtils.isEmpty(str)) {
                    oVar.no = Long.parseLong(str) * 1000;
                }
            } catch (Throwable unused) {
            }
        }
        oVar.o(i2, i4, str2, errorCode, true, z2, z3);
    }

    private void o(com.thinkup.core.common.n0.o.mm mmVar) {
        Map<String, List<String>> map = mmVar.om;
        if (map == null || map.isEmpty() || mmVar.m != 699) {
            return;
        }
        try {
            List<String> list = map.get("Req-Next-Time");
            String str = (list == null || list.isEmpty()) ? "" : list.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.no = Long.parseLong(str) * 1000;
        } catch (Throwable unused) {
        }
    }

    private void o(com.thinkup.core.common.n0.o.mm mmVar, int i2) {
        String strConcat;
        int i3;
        boolean z2;
        boolean z3;
        Throwable th = mmVar.o0;
        int i4 = mmVar.m;
        String str = "";
        String message = th != null ? th.getMessage() : "";
        if (th instanceof UnknownHostException) {
            strConcat = "UnknownHostException: ".concat(String.valueOf(message));
            i3 = -1000;
            z2 = true;
            z3 = false;
        } else {
            if (th instanceof ConnectException) {
                strConcat = "ConnectException: ".concat(String.valueOf(message));
                i3 = -1001;
                z2 = true;
            } else {
                if (th instanceof SSLException) {
                    strConcat = "SSLException: ".concat(String.valueOf(message));
                    i3 = -1006;
                } else if (th instanceof SocketException) {
                    strConcat = "SocketException: ".concat(String.valueOf(message));
                    i3 = -1007;
                } else if (th instanceof SocketTimeoutException) {
                    strConcat = "SocketTimeoutException: ".concat(String.valueOf(message));
                    i3 = -1002;
                } else if (th instanceof ConnectTimeoutException) {
                    strConcat = "ConnectTimeoutException: ".concat(String.valueOf(message));
                    i3 = -1003;
                } else {
                    if (th instanceof IOException) {
                        strConcat = "IOException: ".concat(String.valueOf(message));
                        i3 = -1008;
                    } else {
                        if (th == null) {
                            strConcat = mmVar.f41955n;
                        } else if (!TextUtils.isEmpty(mmVar.f41955n)) {
                            strConcat = "Msg: " + mmVar.f41955n + "Exception: " + th + ", Message: " + message;
                        } else {
                            strConcat = "Exception: " + th + ", Message: " + message;
                        }
                        i3 = -9998;
                    }
                    z2 = false;
                }
                z3 = true;
                z2 = false;
            }
            z3 = z2;
        }
        if (omo()) {
            strConcat = "cus-dns,".concat(String.valueOf(strConcat));
        }
        String str2 = strConcat;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i3), str2);
        Map<String, List<String>> map = mmVar.om;
        if (map != null && !map.isEmpty() && mmVar.m == 699) {
            try {
                List<String> list = map.get("Req-Next-Time");
                if (list != null && !list.isEmpty()) {
                    str = list.get(0);
                }
                if (!TextUtils.isEmpty(str)) {
                    this.no = Long.parseLong(str) * 1000;
                }
            } catch (Throwable unused) {
            }
        }
        o(i2, i4, str2, errorCode, true, z2, z3);
    }

    public static /* synthetic */ void o(o oVar, com.thinkup.core.common.n0.o.mm mmVar, int i2) {
        String strM;
        JSONObject jSONObject;
        int i3 = mmVar.m;
        try {
            com.thinkup.core.common.n0.o.mn mnVar = mmVar.oo;
            String strTrim = "";
            if (mnVar == null) {
                strM = "";
            } else if (oVar.o0n()) {
                strM = mnVar.n();
            } else {
                strM = mnVar.m();
            }
            if (!oVar.o(i3) && (i3 == 201 || i3 == 204)) {
                oVar.o(i2, oVar.o((Object) null));
                return;
            }
            if (oVar.no()) {
                if (!TextUtils.isEmpty(strM)) {
                    strTrim = strM.trim();
                    try {
                        jSONObject = new JSONObject(strTrim);
                    } catch (Throwable unused) {
                        jSONObject = new JSONObject();
                    }
                } else {
                    jSONObject = new JSONObject();
                }
                int iOptInt = jSONObject.optInt("code", 0);
                if (iOptInt == 0) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.thinkup.core.common.n.mo.oo.oo);
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = new JSONObject();
                    }
                    oVar.o(i2, oVar.o(jSONObjectOptJSONObject));
                    return;
                }
                oVar.o(i2, -10000, strTrim, ErrorCode.getErrorCode(ErrorCode.statuError, String.valueOf(iOptInt), strTrim));
                return;
            }
            oVar.o(i2, oVar.o((Object) (strM != null ? strM.trim() : null)));
        } catch (Throwable th) {
            oVar.o(i2, i3, th.getMessage(), ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i3), th.getMessage()));
        }
    }
}
