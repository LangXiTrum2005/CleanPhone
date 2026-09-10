package com.thinkup.core.common.n0.o.o;

import android.os.SystemClock;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.thinkup.core.common.n0.m.on;
import com.thinkup.core.common.no.m.o0o;
import com.thinkup.core.common.no.o.m0;
import com.thinkup.core.common.no.o.no;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    private static final String o = "o";
    private final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f41960n;
    private com.thinkup.core.common.n0.m.o o0;

    public o(String str, String str2) {
        this.m = str;
        this.f41960n = str2;
    }

    public final com.thinkup.core.common.n0.m.o o() {
        return this.o0;
    }

    private static boolean m(com.thinkup.core.common.n0.m.o0 o0Var) {
        com.thinkup.core.oo.m mVarO = com.thinkup.core.oo.o0.o();
        return mVarO != null && mVarO.on(o0Var != null ? o0Var.m() : "");
    }

    public final com.thinkup.core.common.n0.o.o0 o(com.thinkup.core.common.n0.m.o0 o0Var) {
        com.thinkup.core.oo.m mVarO = com.thinkup.core.oo.o0.o();
        String strM = o0Var != null ? o0Var.m() : "";
        if (mVarO == null || !mVarO.on(strM)) {
            return null;
        }
        com.thinkup.core.common.n0.m.o oVar = new com.thinkup.core.common.n0.m.o();
        oVar.o0(this.m);
        oVar.oo(this.f41960n);
        oVar.m(on.o(o0Var.m()));
        this.o0 = oVar;
        return new C0671o(oVar, o0Var.m());
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.n0.o.o.o$o, reason: collision with other inner class name */
    public static class C0671o implements com.thinkup.core.common.n0.o.o0 {
        private final String m;
        private final com.thinkup.core.common.n0.m.o o;

        public C0671o(com.thinkup.core.common.n0.m.o oVar, String str) {
            this.o = oVar;
            this.m = str;
        }

        private static List<InetAddress> m(String str, com.thinkup.core.common.n0.m.o oVar) {
            oVar.o00();
            com.thinkup.core.common.no.o.n nVarO = com.thinkup.core.common.no.o.n.o();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (!nVarO.m()) {
                throw new IllegalArgumentException("init custom dns server failed.");
            }
            no noVarO = nVarO.o(new m0(str));
            oVar.n(SystemClock.elapsedRealtime() - jElapsedRealtime);
            com.thinkup.core.common.no.o.om omVarM = noVarO != null ? noVarO.m() : null;
            if (omVarM != null) {
                oVar.o(omVarM.o());
                oVar.o(omVarM.m());
                oVar.o(omVarM.n());
            }
            InetAddress[] inetAddressArrO = noVarO != null ? noVarO.o() : null;
            if (inetAddressArrO == null || inetAddressArrO.length <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, inetAddressArrO);
            String unused = o.o;
            arrayList.size();
            oVar.mn();
            return arrayList;
        }

        @Override // com.thinkup.core.common.n0.o.o0
        public final List<InetAddress> o(String str) throws UnknownHostException {
            Throwable th;
            ArrayList arrayList;
            String unused = o.o;
            List<InetAddress> listO = o(str, this.o);
            if (listO != null && !listO.isEmpty()) {
                return listO;
            }
            try {
                com.thinkup.core.common.n0.m.o oVar = this.o;
                oVar.o00();
                com.thinkup.core.common.no.o.n nVarO = com.thinkup.core.common.no.o.n.o();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (!nVarO.m()) {
                    throw new IllegalArgumentException("init custom dns server failed.");
                }
                no noVarO = nVarO.o(new m0(str));
                oVar.n(SystemClock.elapsedRealtime() - jElapsedRealtime);
                th = null;
                com.thinkup.core.common.no.o.om omVarM = noVarO != null ? noVarO.m() : null;
                if (omVarM != null) {
                    oVar.o(omVarM.o());
                    oVar.o(omVarM.m());
                    oVar.o(omVarM.n());
                }
                InetAddress[] inetAddressArrO = noVarO != null ? noVarO.o() : null;
                if (inetAddressArrO == null || inetAddressArrO.length <= 0) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    Collections.addAll(arrayList, inetAddressArrO);
                    String unused2 = o.o;
                    arrayList.size();
                    oVar.mn();
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    return arrayList;
                }
                if (th == null) {
                    String strN = a.n("cant not resolve \"", str, "\".");
                    if (TextUtils.isEmpty(this.o.n0())) {
                        this.o.n(strN);
                    }
                    throw new UnknownHostException(strN);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(th);
                sb.append(": ");
                throw new UnknownHostException(androidx.datastore.preferences.protobuf.a.o(th, sb));
            } catch (Throwable th2) {
                th = th2;
                String unused3 = o.o;
                this.o.n(th + ": " + th.getMessage());
            }
        }

        private static List<InetAddress> o(String str, com.thinkup.core.common.n0.m.o oVar) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                List<InetAddress> listO = o0o.o.o(str);
                oVar.m(SystemClock.elapsedRealtime() - jElapsedRealtime);
                if (listO == null || listO.isEmpty()) {
                    return null;
                }
                String unused = o.o;
                listO.size();
                return listO;
            } catch (Throwable th) {
                String unused2 = o.o;
                oVar.m0();
                oVar.m(th + ": " + th.getMessage());
                return null;
            }
        }
    }
}
