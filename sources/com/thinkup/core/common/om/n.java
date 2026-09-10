package com.thinkup.core.common.om;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.a;
import com.applovin.impl.Z;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUOsDmEntity;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.o0m;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.oo0.oo;
import com.thinkup.core.common.ooo.mm;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ooo.onm;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    public static final long m = 3600000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f42178n = "DomainManager";
    public static final long o = 86400000;
    private static final String o0 = "thinkup_sdk";
    private static volatile n o0n = null;
    private static final String om = "api.";
    private static final String on = mm.m(mo.on.m.oo);
    private static final String oo = "ru";
    private volatile boolean mn;
    private volatile boolean n0;
    private volatile long no;
    private volatile String o00;
    private ConcurrentHashMap<Long, String> o0m;
    private ArrayDeque<o> o0o;
    private final Object m0 = new Object();
    private final Object mo = new Object();
    private final List<String> mm = a.u();
    private volatile String nm = "";
    private volatile String nn = "";

    /* JADX INFO: renamed from: com.thinkup.core.common.om.n$n, reason: collision with other inner class name */
    public interface InterfaceC0682n {
        void m(String str);

        void o(int i2, Object obj, long j);

        void o(int i2, String str, AdError adError, long j);

        void o(String str);
    }

    public static class o {
        private boolean m;
        private o0 o;

        public o(o0 o0Var, boolean z2) {
            this.o = o0Var;
            this.m = z2;
        }

        public final boolean m() {
            return this.m;
        }

        public final o0 o() {
            return this.o;
        }
    }

    private n() {
        String[] strArr;
        this.o00 = "";
        if (TUSDK.isCnSDK() || (strArr = com.thinkup.core.common.om.m.o) == null || strArr.length <= 0) {
            return;
        }
        List listAsList = Arrays.asList(strArr);
        String country = Locale.getDefault().getCountry();
        if (listAsList.contains(country)) {
            this.o00 = country;
        }
    }

    private static void m0() {
        com.thinkup.core.oo.o0.o(o0n.m().on()).n();
    }

    private o mm() {
        o oVarRemoveFirst;
        ArrayDeque<o> arrayDeque = this.o0o;
        if (arrayDeque == null || arrayDeque.isEmpty()) {
            return null;
        }
        synchronized (this.mo) {
            oVarRemoveFirst = this.o0o.removeFirst();
        }
        oo("getDomainRequest() >>> called");
        return oVarRemoveFirst;
    }

    private synchronized ConcurrentHashMap<Long, String> mn() {
        try {
            if (this.o0m == null) {
                this.o0m = new ConcurrentHashMap<>(1);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.o0m;
    }

    private static void mo() {
    }

    private static boolean n(String str, String str2) {
        com.thinkup.core.oo.m mVarH = com.google.firebase.crashlytics.internal.model.a.h(com.google.firebase.crashlytics.internal.model.a.i());
        return ((mVarH != null && !TextUtils.isEmpty(mVarH.o0no())) || TextUtils.isEmpty(str) || str.equals(str2)) ? false : true;
    }

    private static long n0() {
        if (n()) {
            return m;
        }
        return 86400000L;
    }

    private void no() {
        try {
            o oVarMm = mm();
            if (oVarMm != null) {
                o0 o0VarO = oVarMm.o();
                boolean zM = oVarMm.m();
                oo("requestDomainNext() >>> next domainRequest: " + o0VarO + " awaitResponse: " + zM);
                if (o0VarO != null) {
                    o(o0VarO, zM);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static boolean on() {
        com.thinkup.core.oo.m mVarH = com.google.firebase.crashlytics.internal.model.a.h(com.google.firebase.crashlytics.internal.model.a.i());
        return (mVarH == null || TextUtils.isEmpty(mVarH.o0no())) && o00.o(o0n.m().on());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oo(String str) {
        Thread.currentThread().getId();
    }

    public final void o(final String str, final int i2, final String str2, final o0 o0Var) {
        String host;
        com.thinkup.core.oo.m mVarH = com.google.firebase.crashlytics.internal.model.a.h(com.google.firebase.crashlytics.internal.model.a.i());
        if ((mVarH != null && !TextUtils.isEmpty(mVarH.o0no())) || !o00.o(o0n.m().on())) {
            oo("tryGetDomainFromCdn() >>> not allow switch domain.");
            return;
        }
        try {
            host = new URL(str).getHost();
        } catch (Exception e2) {
            oo(Z.m(e2, new StringBuilder("tryGetDomainFromCdn() >>> failed: ")));
            host = "";
        }
        final String str3 = host;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final List<String> list = this.mm;
        oo("tryGetDomainFromCdn() >>> start isTrying: " + this.n0 + " url: " + str + " failedDomain: " + str3);
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        o(new InterfaceC0682n() { // from class: com.thinkup.core.common.om.n.1
            @Override // com.thinkup.core.common.om.n.InterfaceC0682n
            public final void m(String str4) {
                n.oo("tryGetDomainFromCdn() >>> onCallbackCached::cacheDomain = ".concat(String.valueOf(str4)));
                n.this.o(list, str4, str3, str, i2, str2, o0Var, atomicBoolean);
            }

            @Override // com.thinkup.core.common.om.n.InterfaceC0682n
            public final void o(String str4) {
                n.oo("tryGetDomainFromCdn() >>> onCallback::domain = ".concat(String.valueOf(str4)));
                n.this.o(list, "", str3, str, i2, str2, o0Var, atomicBoolean);
            }

            @Override // com.thinkup.core.common.om.n.InterfaceC0682n
            public final void o(int i3, String str4, AdError adError, long j) {
                n.oo("tryGetDomainFromCdn() >>> onCallbackFailed::msg = ".concat(String.valueOf(str4)));
                n.this.o(list, "", str3, str, i2, str2, o0Var, atomicBoolean);
            }

            @Override // com.thinkup.core.common.om.n.InterfaceC0682n
            public final void o(int i3, Object obj, long j) {
                n.oo("tryGetDomainFromCdn() >>> onCallbackSucceed::result = ".concat(String.valueOf(obj)));
                if ((obj instanceof String) && !TextUtils.isEmpty(obj.toString())) {
                    Context contextOn = o0n.m().on();
                    String string = obj.toString();
                    n.o(n.this, list, string, contextOn);
                    n.this.o(list, string, str3, str, i2, str2, o0Var, atomicBoolean);
                    return;
                }
                n.this.o(list, "", str3, str, i2, str2, o0Var, atomicBoolean);
            }
        }, true);
    }

    private String o0(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.nm;
        }
        o0m o0mVarN = o0n.m().n();
        if (o0mVarN == null || o0mVarN.getOsDmEntity() == null) {
            return "";
        }
        TUOsDmEntity osDmEntity = o0mVarN.getOsDmEntity();
        str.getClass();
        switch (str) {
            case "smart_wf":
                return osDmEntity.getSmartWFDm();
            case "bid":
                return osDmEntity.getBidDm();
            case "agent":
                return osDmEntity.getDaDm();
            case "tracking":
                return osDmEntity.getTkDm();
            default:
                return "";
        }
    }

    private static String om() {
        o0n.m();
        return "tpn_cur_using_domain_key";
    }

    public static /* synthetic */ long oo() {
        if (n()) {
            return m;
        }
        return 86400000L;
    }

    public static class m implements InterfaceC0682n, o0 {
        private final InterfaceC0682n m;
        private boolean o;

        public m(InterfaceC0682n interfaceC0682n) {
            this.m = interfaceC0682n;
        }

        @Override // com.thinkup.core.common.om.n.InterfaceC0682n
        public final void m(String str) {
            InterfaceC0682n interfaceC0682n = this.m;
            if (interfaceC0682n != null) {
                interfaceC0682n.m(str);
            }
            o(str);
        }

        @Override // com.thinkup.core.common.om.n.InterfaceC0682n
        public final void o(String str) {
            InterfaceC0682n interfaceC0682n;
            if (this.o || (interfaceC0682n = this.m) == null) {
                return;
            }
            this.o = true;
            interfaceC0682n.o(str);
        }

        @Override // com.thinkup.core.common.om.n.InterfaceC0682n
        public final void o(int i2, String str, AdError adError, long j) {
            InterfaceC0682n interfaceC0682n = this.m;
            if (interfaceC0682n != null) {
                interfaceC0682n.o(i2, str, adError, j);
            }
            o("");
        }

        @Override // com.thinkup.core.common.om.n.InterfaceC0682n
        public final void o(int i2, Object obj, long j) {
            InterfaceC0682n interfaceC0682n = this.m;
            if (interfaceC0682n != null) {
                interfaceC0682n.o(i2, obj, j);
            }
            o(obj != null ? obj.toString() : "");
        }
    }

    public static /* synthetic */ void oo(n nVar) {
        try {
            o oVarMm = nVar.mm();
            if (oVarMm != null) {
                o0 o0VarO = oVarMm.o();
                boolean zM = oVarMm.m();
                oo("requestDomainNext() >>> next domainRequest: " + o0VarO + " awaitResponse: " + zM);
                if (o0VarO != null) {
                    nVar.o(o0VarO, zM);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final String m() {
        return this.nm;
    }

    public static String m(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        try {
            String host = new URL(str).getHost();
            if (str2.equals(host)) {
                return str;
            }
            oo("replaceUrlDomainWithTarget() >>> start replace url, targetDomain: " + str2 + " url: " + str);
            return str.replace(host, str2);
        } catch (Throwable unused) {
            return str;
        }
    }

    private static void m(List<String> list, String str) {
        if (TextUtils.isEmpty(str) || list == null) {
            return;
        }
        try {
            int iIndexOf = list.indexOf(str);
            if (iIndexOf >= 0 && iIndexOf < list.size() - 1) {
                list.remove(str);
                list.add(str);
            } else if (iIndexOf < 0) {
                list.add(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str) {
        this.nm = str;
        Context contextOn = o0n.m().on();
        o0n.m();
        onm.m(contextOn, "thinkup_sdk", "tpn_cur_using_domain_key", str);
        oo("setCurrentDomain() >>> currentDomain = ".concat(String.valueOf(str)));
    }

    public static String o0() {
        return on;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Long m(Context context) {
        long jM = this.no;
        if (jM == 0) {
            jM = onm.m(context, "thinkup_sdk", "cdn_request_time_key", 0L);
        }
        return Long.valueOf(jM);
    }

    public static boolean n() {
        String language;
        try {
            language = Locale.getDefault().getLanguage();
        } catch (Exception unused) {
            language = "";
        }
        return language.equalsIgnoreCase("ru");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(o0 o0Var, boolean z2) {
        if (o0Var == null) {
            return;
        }
        synchronized (this.mo) {
            try {
                if (this.o0o == null) {
                    this.o0o = new ArrayDeque<>();
                }
                this.o0o.addLast(new o(o0Var, z2));
            } catch (Throwable th) {
                throw th;
            }
        }
        oo("addDomainRequest() >>> called");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String n(Context context) {
        String str = this.no > 0 ? mn().get(Long.valueOf(this.no)) : "";
        return TextUtils.isEmpty(str) ? onm.n(context, "thinkup_sdk", "cdn_domain_key", "") : str;
    }

    public static n o() {
        if (o0n == null) {
            synchronized (n.class) {
                o0n = new n();
            }
        }
        return o0n;
    }

    public final void o(Context context) {
        if (TUSDK.isCnSDK()) {
            return;
        }
        if (context instanceof Activity) {
            context = context.getApplicationContext();
        }
        if (this.mn) {
            return;
        }
        this.mn = true;
        List<String> list = this.mm;
        if (!n()) {
            list.add(mo.on.o.o);
        }
        list.add(on);
        o0n.m();
        String strN = onm.n(context, "thinkup_sdk", "tpn_cur_using_domain_key", "");
        if (!TextUtils.isEmpty(strN)) {
            o(list, strN);
        }
        o0m o0mVarN = o0n.m().n();
        if (o0mVarN != null && o0mVarN.getOsDmEntity() != null) {
            TUOsDmEntity osDmEntity = o0mVarN.getOsDmEntity();
            String mainDm = osDmEntity.getMainDm();
            if (!TextUtils.isEmpty(mainDm)) {
                list.clear();
                list.add(mainDm);
                String ruBpDm = osDmEntity.getRuBpDm();
                if (!TextUtils.isEmpty(ruBpDm)) {
                    list.add(ruBpDm);
                }
            }
        }
        oo("initDomain() >>> curUseDomain = ".concat(String.valueOf(strN)));
        if (list.isEmpty()) {
            return;
        }
        this.nn = list.get(0);
        if (TextUtils.isEmpty(this.nn)) {
            return;
        }
        n(this.nn);
    }

    private static void o(List<String> list) {
        o0m o0mVarN = o0n.m().n();
        if (o0mVarN == null || o0mVarN.getOsDmEntity() == null) {
            return;
        }
        TUOsDmEntity osDmEntity = o0mVarN.getOsDmEntity();
        String mainDm = osDmEntity.getMainDm();
        if (TextUtils.isEmpty(mainDm)) {
            return;
        }
        list.clear();
        list.add(mainDm);
        String ruBpDm = osDmEntity.getRuBpDm();
        if (TextUtils.isEmpty(ruBpDm)) {
            return;
        }
        list.add(ruBpDm);
    }

    public final String o(String str) {
        return o(str, "");
    }

    public final String o(String str, String str2) {
        return TUSDK.isCnSDK() ? str : m(str, o0(str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(List<String> list, String str, String str2, String str3, int i2, String str4, o0 o0Var, AtomicBoolean atomicBoolean) {
        try {
            if (atomicBoolean.get()) {
                oo("handleSwitchDomain() >>> have switch domain.");
                return;
            }
            atomicBoolean.set(true);
            String strO = o(list, str, str2);
            oo("handleSwitchDomain() >>> targetDomain: " + strO + " currentDomain: " + this.nm);
            if (!TextUtils.isEmpty(strO) && str2.equals(this.nm)) {
                n(strO);
                com.thinkup.core.oo.o0.o(o0n.m().on()).n();
                oo.o(this.nn, strO, str3, String.valueOf(m(o0n.m().on())), String.valueOf(i2), str4, str2);
                o(o0Var, strO, str2);
                return;
            }
            o(o0Var, this.nm, str2);
        } catch (Throwable unused) {
        }
    }

    private void o(String str, String str2, String str3, int i2, String str4) {
        n(str);
        com.thinkup.core.oo.o0.o(o0n.m().on()).n();
        oo.o(this.nn, str, str3, String.valueOf(m(o0n.m().on())), String.valueOf(i2), str4, str2);
    }

    private static void o(o0 o0Var, String str, String str2) {
        if (o0Var != null && n(str, str2)) {
            o0Var.o(str);
        }
    }

    private String o(List<String> list, String str, String str2) {
        String str3 = "";
        if (list == null) {
            return "";
        }
        try {
            o(list, str);
            for (String str4 : list) {
                if (!TextUtils.isEmpty(str4) && !str4.equals(str2)) {
                    str3 = str4;
                    break;
                }
            }
            o(list, str3);
            String strN = n(o0n.m().on());
            if (n() && !TextUtils.isEmpty(strN) && !strN.equals(str2)) {
                list.remove(str2);
            } else if (!TextUtils.isEmpty(str2)) {
                try {
                    int iIndexOf = list.indexOf(str2);
                    if (iIndexOf >= 0 && iIndexOf < list.size() - 1) {
                        list.remove(str2);
                        list.add(str2);
                    } else if (iIndexOf < 0) {
                        list.add(str2);
                    }
                } catch (Throwable unused) {
                }
            }
            oo("getNextDomain() >>> nextDomain = " + str3 + " failedDomain = " + str2);
        } catch (Throwable unused2) {
        }
        return str3;
    }

    private static void o(List<String> list, String str) {
        if (TextUtils.isEmpty(str) || list == null) {
            return;
        }
        try {
            int iIndexOf = list.indexOf(str);
            if (iIndexOf > 0) {
                list.remove(str);
                list.add(0, str);
            } else if (iIndexOf < 0) {
                list.add(0, str);
            }
        } catch (Throwable unused) {
        }
    }

    private void o(String str, String str2, int i2, String str3, String str4) {
        oo.o(this.nn, str, str2, String.valueOf(m(o0n.m().on())), String.valueOf(i2), str3, str4);
    }

    private void o(List<String> list, String str, Context context) {
        if (list == null) {
            return;
        }
        try {
            list.remove(on);
            String strN = n(context);
            if (!TextUtils.isEmpty(strN) && !strN.equals(str)) {
                list.remove(strN);
            }
            o(list, str);
            oo("replaceCdnDomainInList() >>>> cdnDomain: " + str + " lastCdnDomain: " + strN);
        } catch (Throwable unused) {
        }
    }

    private void o(boolean z2, String str, long j, int i2) {
        oo.o(this.nn, this.nm, "", String.valueOf(this.no), "", "", "", "1", z2 ? "1" : "0", str, String.valueOf(j), i2);
    }

    private void o(Context context, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.no = jCurrentTimeMillis;
        onm.o(context, "thinkup_sdk", "cdn_request_time_key", jCurrentTimeMillis);
        mn().put(Long.valueOf(jCurrentTimeMillis), str);
        onm.m(context, "thinkup_sdk", "cdn_domain_key", str);
    }

    public final void o(o0 o0Var) {
        o(o0Var, true);
    }

    public final void o(final o0 o0Var, boolean z2) {
        final boolean z3 = n() && z2;
        o(new InterfaceC0682n() { // from class: com.thinkup.core.common.om.n.2
            @Override // com.thinkup.core.common.om.n.InterfaceC0682n
            public final void m(String str) {
            }

            @Override // com.thinkup.core.common.om.n.InterfaceC0682n
            public final void o(int i2, String str, AdError adError, long j) {
            }

            @Override // com.thinkup.core.common.om.n.InterfaceC0682n
            public final void o(String str) {
                o0 o0Var2 = o0Var;
                if (o0Var2 != null) {
                    o0Var2.o(str);
                }
            }

            @Override // com.thinkup.core.common.om.n.InterfaceC0682n
            public final void o(int i2, Object obj, long j) {
                if (!(obj instanceof String) || TextUtils.isEmpty(obj.toString())) {
                    return;
                }
                Context contextOn = o0n.m().on();
                String string = obj.toString();
                n nVar = n.this;
                n.o(nVar, nVar.mm, string, contextOn);
                if (z3) {
                    n.this.n(string);
                }
            }
        }, z3);
    }

    private void o(InterfaceC0682n interfaceC0682n, final boolean z2) {
        String str = this.nm;
        final Context contextOn = o0n.m().on();
        if (contextOn != null && !TUSDK.isCnSDK() && o00.o(contextOn)) {
            final m mVar = new m(interfaceC0682n);
            if (!z2) {
                mVar.o(str);
            }
            if (this.n0) {
                m(mVar, z2);
                return;
            } else {
                com.thinkup.core.common.ooo.m.m.o().n(new Runnable() { // from class: com.thinkup.core.common.om.n.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        synchronized (n.this.m0) {
                            try {
                                if (n.this.n0) {
                                    n.this.m(mVar, z2);
                                    return;
                                }
                                n.this.n0 = true;
                                n nVar = n.this;
                                nVar.no = nVar.m(contextOn).longValue();
                                final long jCurrentTimeMillis = System.currentTimeMillis();
                                long j = jCurrentTimeMillis - n.this.no;
                                long jOo = n.oo();
                                if (n.this.no > 0 && j < jOo) {
                                    String strN = n.this.n(contextOn);
                                    n.oo("requestDomain() >>> cache valid. cdnDomain: ".concat(String.valueOf(strN)));
                                    if (!TextUtils.isEmpty(strN)) {
                                        n.this.n0 = false;
                                        mVar.m(strN);
                                        n.oo(n.this);
                                        return;
                                    }
                                }
                                n.oo("requestDomain() >>> cache was expired. start request. currentDomain: " + n.this.nm);
                                com.thinkup.core.oo.o oVar = new com.thinkup.core.oo.o(com.thinkup.core.oo.o0.o());
                                final int iO = oVar.o();
                                oVar.o(new com.thinkup.core.common.n0.m() { // from class: com.thinkup.core.common.om.n.3.1
                                    @Override // com.thinkup.core.common.n0.o0o
                                    public final void onLoadError(int i2, String str2, AdError adError) {
                                        n.this.n0 = false;
                                        n.o(n.this, false, str2, System.currentTimeMillis() - jCurrentTimeMillis, iO);
                                        mVar.o(-1, str2, null, jCurrentTimeMillis);
                                        n.oo(n.this);
                                    }

                                    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
                                    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
                                    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
                                    @Override // com.thinkup.core.common.n0.o0o
                                    public final void onLoadFinish(int i2, Object obj) {
                                        String strO;
                                        String strOptString;
                                        String str2;
                                        long jCurrentTimeMillis2;
                                        n.this.n0 = false;
                                        try {
                                            if ((obj instanceof String) && !TextUtils.isEmpty(obj.toString())) {
                                                JSONObject jSONObject = new JSONObject(obj.toString());
                                                int iOptInt = jSONObject.optInt("code", 0);
                                                if (iOptInt == 0) {
                                                    str2 = "";
                                                    strOptString = jSONObject.optString("data");
                                                } else {
                                                    strO = "request failed. error code: ".concat(String.valueOf(iOptInt));
                                                }
                                                if (!TextUtils.isEmpty(strOptString)) {
                                                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                                    n.o(n.this, contextOn, strOptString);
                                                }
                                                jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                                String unused = n.this.nm;
                                                if (TextUtils.isEmpty(str2)) {
                                                    n.o(n.this, true, strOptString, jCurrentTimeMillis2, iO);
                                                    mVar.o(0, strOptString, jCurrentTimeMillis);
                                                } else {
                                                    n.o(n.this, false, str2, jCurrentTimeMillis2, iO);
                                                    mVar.o(0, str2, null, jCurrentTimeMillis);
                                                }
                                                n.oo(n.this);
                                            }
                                            strO = "";
                                        } catch (Throwable th) {
                                            strO = androidx.datastore.preferences.protobuf.a.o(th, new StringBuilder("parse cdn domain error: "));
                                        }
                                        strOptString = "";
                                        str2 = strO;
                                        if (!TextUtils.isEmpty(strOptString)) {
                                            AnonymousClass3 anonymousClass4 = AnonymousClass3.this;
                                            n.o(n.this, contextOn, strOptString);
                                        }
                                        jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                        String unused2 = n.this.nm;
                                        if (TextUtils.isEmpty(str2)) {
                                            n.o(n.this, true, strOptString, jCurrentTimeMillis2, iO);
                                            mVar.o(0, strOptString, jCurrentTimeMillis);
                                        } else {
                                            n.o(n.this, false, str2, jCurrentTimeMillis2, iO);
                                            mVar.o(0, str2, null, jCurrentTimeMillis);
                                        }
                                        n.oo(n.this);
                                    }
                                });
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, 13);
                return;
            }
        }
        interfaceC0682n.o(str);
    }

    public static /* synthetic */ void o(n nVar, List list, String str, Context context) {
        if (list != null) {
            try {
                list.remove(on);
                String strN = nVar.n(context);
                if (!TextUtils.isEmpty(strN) && !strN.equals(str)) {
                    list.remove(strN);
                }
                o((List<String>) list, str);
                oo("replaceCdnDomainInList() >>>> cdnDomain: " + str + " lastCdnDomain: " + strN);
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ void o(n nVar, Context context, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        nVar.no = jCurrentTimeMillis;
        onm.o(context, "thinkup_sdk", "cdn_request_time_key", jCurrentTimeMillis);
        nVar.mn().put(Long.valueOf(jCurrentTimeMillis), str);
        onm.m(context, "thinkup_sdk", "cdn_domain_key", str);
    }

    public static /* synthetic */ void o(n nVar, boolean z2, String str, long j, int i2) {
        oo.o(nVar.nn, nVar.nm, "", String.valueOf(nVar.no), "", "", "", "1", z2 ? "1" : "0", str, String.valueOf(j), i2);
    }
}
