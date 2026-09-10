package com.thinkup.core.n;

import android.os.SystemClock;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBidRequestInfo;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.n0.o0o;
import com.thinkup.core.common.on.mm0;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0om;
import com.thinkup.core.common.on.om0;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.ooo.omn;
import com.thinkup.core.common.ooo.ono;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m extends com.thinkup.core.n.o {
    public static final double oo = 10000.0d;
    List<o0mm> m0;
    String mm;
    String mn;
    List<o0mm> mo;
    String n0;
    long nm;
    long nn;
    com.thinkup.core.n.m.m no;
    protected AtomicBoolean o00;
    ConcurrentHashMap<String, o0mm> o0m;
    ConcurrentHashMap<String, o0mm> o0n;
    protected AtomicBoolean o0o;
    final String om;
    protected final List<JSONObject> on;
    ConcurrentHashMap<String, o0mm> oo0;
    com.thinkup.core.common.o0n.m oom;
    ConcurrentHashMap<String, o0mm> ooo;

    public static class o {
        long m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f42400n = 0;
        long o;

        public o(long j, long j2) {
            this.o = j;
            this.m = j2;
        }

        private long m() {
            return this.m;
        }

        private long n() {
            return this.f42400n;
        }

        private long o() {
            return this.o;
        }

        private void o(long j) {
            this.f42400n = j;
        }
    }

    public m(o0om o0omVar) {
        super(o0omVar);
        this.om = getClass().getSimpleName().concat(":");
        this.on = new ArrayList();
        this.m0 = new ArrayList();
        this.mo = new ArrayList();
        this.o00 = new AtomicBoolean(false);
        this.o0o = new AtomicBoolean(false);
        this.o0m = new ConcurrentHashMap<>();
        this.o0n = new ConcurrentHashMap<>();
        this.oo0 = new ConcurrentHashMap<>();
        this.ooo = new ConcurrentHashMap<>();
        this.oom = new com.thinkup.core.common.o0n.m() { // from class: com.thinkup.core.n.m.1
            @Override // java.lang.Runnable
            public final void run() {
                com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.n.m.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.this.on();
                    }
                });
            }
        };
        List<o0mm> list = o0omVar.mm;
        if (list != null && list.size() > 0) {
            for (o0mm o0mmVar : o0omVar.mm) {
                if (o0mmVar != null) {
                    this.o0m.put(o0mmVar.m0o(), o0mmVar);
                    this.oo0.put(o0mmVar.m0o(), o0mmVar);
                }
            }
        }
        List<o0mm> list2 = o0omVar.mn;
        if (list2 != null && list2.size() > 0) {
            for (o0mm o0mmVar2 : o0omVar.mn) {
                this.o0n.put(o0mmVar2.m0o(), o0mmVar2);
                this.ooo.put(o0mmVar2.m0o(), o0mmVar2);
            }
        }
        JSONObject jSONObject = o0omVar.o0m;
        if (jSONObject != null) {
            this.on.add(jSONObject);
        }
        this.mm = o0omVar.o0;
        this.mn = o0omVar.oo;
        this.n0 = oo();
    }

    private void m(long j) {
        com.thinkup.core.common.o0n.o0.o().o(this.oom, j, false);
    }

    private boolean m0() {
        return this.o00.get() && !this.o0o.get();
    }

    private void mm() {
        com.thinkup.core.n.m.m mVar;
        if ((this.mo.size() > 0 || this.m0.size() > 0) && (mVar = this.no) != null) {
            mVar.o(this.mo, this.m0);
        }
        this.mo.clear();
        this.m0.clear();
    }

    private synchronized void mn() {
        if (no()) {
            this.f42408n.set(true);
        }
    }

    private synchronized void mo() throws Throwable {
        try {
            try {
                if (!this.f42408n.get()) {
                    this.f42408n.set(true);
                    om();
                    this.oo0.clear();
                    o(0L, -3, TUBidRequestInfo.BIDDING_REQUEST_TIMEOUT_TYPE, this.o0m);
                    o(0L, -3, TUBidRequestInfo.BIDDING_REQUEST_TIMEOUT_TYPE, this.o0n);
                    n0();
                    mn();
                    mm();
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private void n0() {
        if (TUSDK.isNetworkLogDebug()) {
            if (this.mo.size() > 0 || this.m0.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("PlacementId", this.o.oo);
                    if (this.o.o0n.nno()) {
                        jSONObject.put("isAdxNetworkMode", true);
                    }
                    jSONObject.put("S2S HeadBidding Success List", com.thinkup.core.n.o.o(this.mo));
                    jSONObject.put("S2S HeadBidding Fail List", com.thinkup.core.n.o.o(this.m0));
                } catch (Exception unused) {
                }
                omn.o(omn.o, jSONObject.toString(), false);
            }
        }
    }

    private boolean no() {
        return this.o0m.size() == 0 && this.o0n.size() == 0 && this.oo0.size() == 0;
    }

    private void om() {
        com.thinkup.core.common.o0n.o0.o().o(this.oom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void on() {
        if (this.f42408n.get()) {
            return;
        }
        this.o00.set(true);
        if (this.on.size() > 0) {
            o(new o(SystemClock.elapsedRealtime(), System.currentTimeMillis()));
        }
    }

    public final synchronized void n() {
        if (o0()) {
            com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.n.m.4
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (m.this) {
                        try {
                            if (m.this.o0()) {
                                m.this.o(new o(SystemClock.elapsedRealtime(), System.currentTimeMillis()));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    public abstract void o(List<JSONObject> list, o0o o0oVar);

    public final boolean o0() {
        return !this.o0o.get() && this.on.size() > 0;
    }

    public abstract String oo();

    private static List<on0> m(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof JSONObject) {
            JSONArray jSONArrayOptJSONArray = ((JSONObject) obj).optJSONArray("data");
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                arrayList.add(on0.o(jSONArrayOptJSONArray.optJSONObject(i2)));
            }
        }
        return arrayList;
    }

    @Override // com.thinkup.core.n.o
    public final void o(boolean z2) {
        this.m = z2;
    }

    @Override // com.thinkup.core.n.o
    public final void o(com.thinkup.core.n.m.m mVar) {
        List<o0mm> list;
        List<o0mm> list2;
        this.nm = SystemClock.elapsedRealtime();
        this.nn = System.currentTimeMillis();
        this.no = mVar;
        if (TUSDK.isNetworkLogDebug()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("PlacementId", this.o.oo);
                if (this.o.o0n.nno()) {
                    jSONObject.put("isAdxNetworkMode", true);
                }
                jSONObject.put("S2S Start HeadBidding List", com.thinkup.core.n.o.o(this.o.mm));
                jSONObject.put("S2S Start HeadBidding List(Directly)", com.thinkup.core.n.o.m(this.on));
            } catch (Exception unused) {
            }
            omn.o(omn.o, jSONObject.toString(), false);
        }
        if (this.o.mm.isEmpty() && ((list2 = this.o.mn) == null || list2.isEmpty())) {
            o(new o(this.nm, this.nn));
            return;
        }
        if (this.o.mm.size() == 0 && (list = this.o.mn) != null && list.size() > 0) {
            o(new o(this.nm, this.nn));
            return;
        }
        long jNm = this.o.nm.nm();
        if (jNm <= 0) {
            jNm = 500;
        }
        com.thinkup.core.common.o0n.o0.o().o(this.oom, jNm, false);
        Iterator<Map.Entry<String, o0mm>> it = this.o0m.entrySet().iterator();
        while (it.hasNext()) {
            o0mm value = it.next().getValue();
            if (value.nm() == 66) {
                com.thinkup.core.common.o.mo.o(this.o.m).o(value.m0o(), System.currentTimeMillis());
            }
            new om(this.o).o(value, new om.o() { // from class: com.thinkup.core.n.m.2
                @Override // com.thinkup.core.n.om.o
                public final void onBidTokenObtainFail(String str, o0mm o0mmVar) throws Throwable {
                    if (m.this.f42408n.get()) {
                        return;
                    }
                    o0mmVar.nn(SystemClock.elapsedRealtime() - m.this.nm);
                    if (str == null) {
                        str = "";
                    }
                    m.this.oo0.remove(o0mmVar.m0o());
                    m.this.o0m.remove(o0mmVar.m0o());
                    m.o(m.this, str, o0mmVar);
                    switch (str) {
                        case "This network don't support header bidding in current TopOn's version.":
                        case "Network init error.":
                        case "The parameter is abnormal.":
                        case "There is no Network Adapter.":
                            m.this.m(o0mmVar, str, 0L, -9);
                            break;
                        case "Request Token or Custom bid info Timeout.":
                        case "Network BidToken or Custom bid info is Empty.":
                            m.this.m(o0mmVar, str, 0L, -2);
                            break;
                        default:
                            m.this.m(o0mmVar, "Unknown error: ".concat(str), 0L, -9);
                            break;
                    }
                    m.o(m.this, (JSONObject) null, (o0mm) null);
                }

                @Override // com.thinkup.core.n.om.o
                public final void onBidTokenObtainStart(o0mm o0mmVar, TUBaseAdAdapter tUBaseAdAdapter) {
                    com.thinkup.core.n.m.m mVar2 = m.this.no;
                    if (mVar2 != null) {
                        mVar2.o(o0mmVar, tUBaseAdAdapter);
                    }
                }

                @Override // com.thinkup.core.n.om.o
                public final void onBidTokenObtainSuccess(o0mm o0mmVar, JSONObject jSONObject2) throws Throwable {
                    if (m.this.f42408n.get()) {
                        return;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    o0mmVar.nn(jElapsedRealtime - m.this.nm);
                    o0mmVar.o(jElapsedRealtime);
                    o0mmVar.m(System.currentTimeMillis());
                    m.this.oo0.remove(o0mmVar.m0o());
                    m.o(m.this, o0mmVar);
                    if (!m.this.o00.get() || m.this.o00.get()) {
                        m.o(m.this, jSONObject2, o0mmVar);
                    } else {
                        onBidTokenObtainFail(TUBidRequestInfo.BIDTOKEN_OBTAIN_TIMEOUT_TYPE, o0mmVar);
                    }
                }
            });
        }
    }

    private void m(o0mm o0mmVar) {
        int iNm = o0mmVar.nm();
        com.thinkup.core.common.oo0.oo.o(o0mmVar, this.o, o0mmVar.nmo(), true, n.o().m(iNm));
        n.o().o(iNm);
    }

    @Override // com.thinkup.core.n.o
    public final void m() throws Throwable {
        mo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void m(o0mm o0mmVar, String str, long j, int i2) {
        long jNmo = 0;
        if (j > 0) {
            try {
                jNmo = o0mmVar.nmo() + j;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.thinkup.core.n.o.o(o0mmVar, str, jNmo, i2);
        this.m0.add(o0mmVar);
    }

    private static void m(o0mm o0mmVar, on0 on0Var) {
        mm0 mm0VarOmmn;
        if (o0mmVar == null || on0Var == null || (mm0VarOmmn = o0mmVar.ommn()) == null) {
            return;
        }
        mm0VarOmmn.m(on0Var.n0());
        mm0VarOmmn.o0(on0Var.no());
        mm0VarOmmn.o(on0Var.nm());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    private void o(JSONObject jSONObject, o0mm o0mmVar) throws Throwable {
        boolean z2;
        Throwable th;
        if (this.oo0.size() == 0) {
            om();
            if (this.o0o.get()) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        synchronized (this) {
            if (jSONObject != null && o0mmVar != null) {
                try {
                    this.on.add(jSONObject);
                    this.ooo.put(o0mmVar.m0o(), o0mmVar);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            try {
                if (this.on.size() > 0 && (z2 || (this.o00.get() && !this.o0o.get()))) {
                    o(new o(this.nm, this.nn));
                } else {
                    if (this.m0.size() <= 0 || !no()) {
                        return;
                    }
                    o(null, new o(0L, 0L), "", null, null);
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public synchronized void o(List<JSONObject> list, Map<String, o0mm> map, Map<String, JSONObject> map2) {
        try {
            for (JSONObject jSONObject : this.on) {
                list.add(jSONObject);
                map2.put(jSONObject.optString("ad_source_id"), jSONObject);
            }
            this.on.clear();
            ConcurrentHashMap<String, o0mm> concurrentHashMap = this.ooo;
            if (concurrentHashMap != null) {
                Iterator<Map.Entry<String, o0mm>> it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    o0mm value = it.next().getValue();
                    if (value != null) {
                        value.n(SystemClock.elapsedRealtime());
                    }
                }
            }
            map.putAll(this.ooo);
            this.ooo.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(final o oVar) {
        if (this.o0o.get()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        final ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        o(arrayList, concurrentHashMap, concurrentHashMap2);
        this.o0o.set(true);
        o(arrayList, new o0o() { // from class: com.thinkup.core.n.m.3
            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadCanceled(int i2) {
                synchronized (m.this) {
                    try {
                        if (m.this.f42408n.get()) {
                            m mVar = m.this;
                            String str = mVar.om;
                            String str2 = mVar.o.oo;
                            return;
                        }
                        m.this.o0o.set(false);
                        m.this.n();
                        if (oVar != null) {
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            o oVar2 = oVar;
                            oVar2.f42400n = jElapsedRealtime - oVar2.o;
                        }
                        m.this.o(null, oVar, "onLoadCanceled.", concurrentHashMap, concurrentHashMap2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadError(int i2, String str, AdError adError) {
                synchronized (m.this) {
                    try {
                        if (m.this.f42408n.get()) {
                            m mVar = m.this;
                            String str2 = mVar.om;
                            String str3 = mVar.o.oo;
                            return;
                        }
                        m.this.o0o.set(false);
                        m.this.n();
                        if (oVar != null) {
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            o oVar2 = oVar;
                            oVar2.f42400n = jElapsedRealtime - oVar2.o;
                        }
                        m.this.o(null, oVar, adError != null ? adError.getPlatformMSG() : "", concurrentHashMap, concurrentHashMap2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadFinish(int i2, Object obj) {
                synchronized (m.this) {
                    try {
                        if (m.this.f42408n.get()) {
                            m mVar = m.this;
                            String str = mVar.om;
                            String str2 = mVar.o.oo;
                            return;
                        }
                        m.this.o0o.set(false);
                        if (oVar != null) {
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            o oVar2 = oVar;
                            oVar2.f42400n = jElapsedRealtime - oVar2.o;
                        }
                        m.this.o(m.o(obj), oVar, null, concurrentHashMap, concurrentHashMap2);
                        m.this.n();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadStart(int i2) {
            }
        });
    }

    private void o(long j, int i2, String str, Map<String, o0mm> map) {
        for (o0mm o0mmVar : map.values()) {
            if (o(o0mmVar, str, i2)) {
                this.mo.add(o0mmVar);
            } else {
                m(o0mmVar, str, j, i2);
            }
        }
        map.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(List<on0> list, o oVar, String str, Map<String, o0mm> map, Map<String, JSONObject> map2) {
        long j;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    Collections.sort(list);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        on0 on0Var = list.get(i2);
                        this.o0m.remove(on0Var.mn);
                        o0mm o0mmVarRemove = map.remove(on0Var.mn);
                        if (this.o0n.containsKey(on0Var.mn)) {
                            o0mmVarRemove = this.o0n.remove(on0Var.mn);
                            this.o0n.clear();
                        }
                        if (o0mmVarRemove != null) {
                            if (on0Var.isSuccessWithUseType()) {
                                int i3 = i2 + 1;
                                o(o0mmVarRemove.nm(), on0Var, i3 < list.size() ? list.get(i3).getSortPrice() : 0.0d, on0Var.isSamePrice());
                                mm0 mm0VarOmmn = o0mmVarRemove.ommn();
                                if (mm0VarOmmn != null) {
                                    mm0VarOmmn.m(on0Var.n0());
                                    mm0VarOmmn.o0(on0Var.no());
                                    mm0VarOmmn.o(on0Var.nm());
                                }
                                JSONObject jSONObject = map2.get(o0mmVarRemove.m0o());
                                if (jSONObject != null) {
                                    String strOptString = jSONObject.optString("bid_token");
                                    if (TextUtils.isEmpty(strOptString)) {
                                        strOptString = jSONObject.optString("buyeruid");
                                    }
                                    o0mmVarRemove.toString();
                                    on0Var.n(strOptString);
                                }
                            }
                            if (oVar != null) {
                                j = oVar.f42400n;
                                o0mmVarRemove.ooo(oVar.m);
                            } else {
                                j = 0;
                            }
                            o(o0mmVarRemove, on0Var, j);
                            if (o0mmVarRemove.nm() == 66) {
                                com.thinkup.core.common.o.mo.o(this.o.m).o(o0mmVarRemove.m0o(), on0Var.oon);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (map != null) {
            for (String str2 : map.keySet()) {
                if (str2 != null) {
                    this.o0m.remove(str2);
                }
                if (this.o0n.containsKey(str2)) {
                    this.o0n.clear();
                }
            }
        }
        if (map != null) {
            o(oVar != null ? oVar.f42400n : 0L, -4, TextUtils.isEmpty(str) ? "No Response error." : "No Response error." + str, map);
        }
        if (this.mo.size() >= 2) {
            Collections.sort(this.mo);
        }
        n0();
        mn();
        mm();
    }

    private static void o(Map<String, JSONObject> map, o0mm o0mmVar, on0 on0Var) {
        JSONObject jSONObject = map.get(o0mmVar.m0o());
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("bid_token");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObject.optString("buyeruid");
            }
            o0mmVar.toString();
            String str = on0Var.token;
            on0Var.n(strOptString);
        }
    }

    private void o(String str, o0mm o0mmVar) {
        if (TextUtils.equals(str, TUBidRequestInfo.NO_ADAPTER_ERROR_TYPE) || TextUtils.equals(str, TUBidRequestInfo.NO_SUPPORT_BIDDING_TYPE)) {
            return;
        }
        int iNm = o0mmVar.nm();
        com.thinkup.core.common.oo0.oo.o(o0mmVar, this.o, o0mmVar.nmo(), false, n.o().m(iNm));
        n.o().o(iNm);
    }

    @Override // com.thinkup.core.n.o
    public void o(o0mm o0mmVar, om0 om0Var, long j) throws Throwable {
        String strR;
        if (om0Var instanceof on0) {
            on0 on0Var = (on0) om0Var;
            boolean zIsSuccessWithUseType = on0Var.isSuccessWithUseType();
            boolean zO = com.thinkup.core.n.o.o(zIsSuccessWithUseType, o0mmVar, om0Var);
            int i2 = 0;
            AdError adErrorO = ono.o(0, this.o.o0n, o0mmVar, om0Var);
            int i3 = 1;
            boolean z2 = adErrorO != null;
            if (zIsSuccessWithUseType && !zO && !z2) {
                o0mmVar.oo(j > 0 ? o0mmVar.nmo() + j : 0L);
                this.mo.add(o0mmVar);
                if (o0mmVar.om0() == 3 || o0mmVar.om0() == 7) {
                    on0Var.om = System.currentTimeMillis() + on0Var.oo;
                } else {
                    on0Var.om = System.currentTimeMillis() + o0mmVar.omm();
                }
                o(o0mmVar, on0Var);
                return;
            }
            if (zO) {
                m(o0mmVar, TUBidRequestInfo.LESS_THAN_BID_FLOOR_TYPE, j, -11);
                o0mmVar.m(om0Var.getPrice());
                o0mmVar.oo(om0Var.getSortPrice());
                o0mmVar.o(on0Var);
                return;
            }
            if (z2) {
                m(o0mmVar, adErrorO.getPlatformMSG(), j, -13);
                o0mmVar.m(om0Var.getPrice());
                o0mmVar.oo(om0Var.getSortPrice());
                o0mmVar.o(on0Var);
                return;
            }
            if (on0Var.useType == 2) {
                o0mmVar.non();
                strR = "filter by s2s bid max count";
            } else {
                StringBuilder sb = new StringBuilder("errorCode:[");
                sb.append(on0Var.o);
                sb.append("],errorMsg:[");
                strR = a.r(sb, on0Var.errorMsg, d9.i.f24752e);
                i3 = 0;
                i2 = -1;
            }
            if (o(o0mmVar, strR, i2, i3)) {
                this.mo.add(o0mmVar);
            } else {
                m(o0mmVar, strR, j, i2);
            }
        }
    }

    public static /* synthetic */ void o(m mVar, o0mm o0mmVar) {
        int iNm = o0mmVar.nm();
        com.thinkup.core.common.oo0.oo.o(o0mmVar, mVar.o, o0mmVar.nmo(), true, n.o().m(iNm));
        n.o().o(iNm);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static /* synthetic */ void o(m mVar, JSONObject jSONObject, o0mm o0mmVar) throws Throwable {
        boolean z2;
        Throwable th;
        String str = mVar.om;
        if (mVar.oo0.size() == 0) {
            mVar.om();
            if (mVar.o0o.get()) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        synchronized (mVar) {
            if (jSONObject != null && o0mmVar != null) {
                try {
                    mVar.on.add(jSONObject);
                    mVar.ooo.put(o0mmVar.m0o(), o0mmVar);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            try {
                if (mVar.on.size() > 0 && (z2 || (mVar.o00.get() && !mVar.o0o.get()))) {
                    mVar.o(new o(mVar.nm, mVar.nn));
                } else {
                    if (mVar.m0.size() <= 0 || !mVar.no()) {
                        return;
                    }
                    mVar.o(null, new o(0L, 0L), "", null, null);
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public static /* synthetic */ void o(m mVar, String str, o0mm o0mmVar) {
        if (TextUtils.equals(str, TUBidRequestInfo.NO_ADAPTER_ERROR_TYPE) || TextUtils.equals(str, TUBidRequestInfo.NO_SUPPORT_BIDDING_TYPE)) {
            return;
        }
        int iNm = o0mmVar.nm();
        com.thinkup.core.common.oo0.oo.o(o0mmVar, mVar.o, o0mmVar.nmo(), false, n.o().m(iNm));
        n.o().o(iNm);
    }

    public static /* synthetic */ List o(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof JSONObject) {
            JSONArray jSONArrayOptJSONArray = ((JSONObject) obj).optJSONArray("data");
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                arrayList.add(on0.o(jSONArrayOptJSONArray.optJSONObject(i2)));
            }
        }
        return arrayList;
    }
}
