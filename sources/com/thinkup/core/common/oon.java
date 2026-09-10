package com.thinkup.core.common;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.api.TUSharedPlacementConfig;
import com.thinkup.core.basead.adx.api.TUAdxSetting;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.ono;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class oon {
    public static final String o = "oon";
    private static volatile oon om0;
    private Map<String, com.thinkup.core.common.o0o.n> n0;
    private int nm;
    private TUSharedPlacementConfig nn;
    private Map<String, o> no;
    private List<com.thinkup.core.common.o0o.m0> o00;
    private com.thinkup.core.common.o0o.on om;
    private List<com.thinkup.core.common.o0o.m0> on;
    private volatile Handler oo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f42315n = new AtomicBoolean(false);
    private final int o0o = 0;
    private final int o0m = 1;
    private final int o0n = 2;
    private final int oo0 = 3;
    private int ooo = 0;
    private long oom = -1;
    private final int oon = 30000;
    private final Context m = com.thinkup.core.common.n.o0n.m().on();
    private final Map<String, com.thinkup.core.common.o0o.m0> m0 = new ConcurrentHashMap(4);
    private final Map<String, Boolean> mo = new ConcurrentHashMap(4);
    private final Set<String> mn = Collections.synchronizedSet(new HashSet());
    private final Set<String> mm = Collections.synchronizedSet(new HashSet());
    private final com.thinkup.core.common.o0o.oo o0 = new com.thinkup.core.common.o0o.oo();

    /* JADX INFO: renamed from: com.thinkup.core.common.oon$6, reason: invalid class name */
    public class AnonymousClass6 implements Runnable {
        final /* synthetic */ int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TUAdRequest f42319n;
        final /* synthetic */ com.thinkup.core.common.o0o.m0 o;
        final /* synthetic */ com.thinkup.core.common.o0o.n o0;

        public AnonymousClass6(com.thinkup.core.common.o0o.m0 m0Var, int i2, TUAdRequest tUAdRequest, com.thinkup.core.common.o0o.n nVar) {
            this.o = m0Var;
            this.m = i2;
            this.f42319n = tUAdRequest;
            this.o0 = nVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final com.thinkup.core.common.o0o.m mVar = new com.thinkup.core.common.o0o.m(this.o, this.m, this.f42319n);
            if (this.m == 10) {
                mVar.m();
                mVar.o(oon.this.om.n());
            }
            mVar.o(new com.thinkup.core.common.o0o.o0() { // from class: com.thinkup.core.common.oon.6.1
                @Override // com.thinkup.core.common.o0o.o0
                public final void m(final String str, final com.thinkup.core.common.o0o.m0 m0Var) {
                    oon.this.mo.remove(m0Var.m);
                    synchronized (oon.this) {
                        oon.this.o(new Runnable() { // from class: com.thinkup.core.common.oon.6.1.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                oon.this.m(str, m0Var, mVar);
                            }
                        }, 0L);
                    }
                }

                @Override // com.thinkup.core.common.o0o.o0
                public final void o(final String str, final com.thinkup.core.common.o0o.m0 m0Var) {
                    oon.this.mo.remove(m0Var.m);
                    synchronized (oon.this) {
                        oon.this.o(new Runnable() { // from class: com.thinkup.core.common.oon.6.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                oon.this.o(str, m0Var, mVar);
                            }
                        }, 0L);
                    }
                }

                @Override // com.thinkup.core.common.o0o.o0
                public final void o(final String str, final com.thinkup.core.common.o0o.m0 m0Var, final AdError adError) {
                    oon.this.mo.remove(m0Var.m);
                    synchronized (oon.this) {
                        oon.this.o(new Runnable() { // from class: com.thinkup.core.common.oon.6.1.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                oon.this.o(str, m0Var, adError, mVar);
                            }
                        }, 0L);
                    }
                }
            });
            this.o0.o(mVar);
            this.o0.n();
        }
    }

    public class o implements Runnable {
        TUAdRequest m;
        String o;

        public o(String str, TUAdRequest tUAdRequest) {
            this.o = str;
            this.m = tUAdRequest;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (oon.this) {
                try {
                    if (oon.this.o(this.o)) {
                        if (this.m == null) {
                            this.m = new TUAdRequest.Builder().setChannelSource(com.thinkup.core.common.n.o0n.m().m00()).build();
                        }
                        oon.this.o((com.thinkup.core.common.o0o.m0) oon.this.m0.get(this.o), 11, this.m);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private oon() {
    }

    public static /* synthetic */ int n(oon oonVar) {
        oonVar.ooo = 3;
        return 3;
    }

    private Handler n() {
        if (this.oo == null) {
            synchronized (oon.class) {
                try {
                    if (this.oo == null) {
                        this.oo = com.thinkup.core.common.ooo.m.m.o().o(15);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.oo;
    }

    private boolean o0() {
        boolean z2 = n() == null;
        if (z2) {
            com.thinkup.core.common.oo0.oo.m("shared handler error", "thread create failed", com.thinkup.core.common.n.o0n.m().o0m());
        }
        return z2;
    }

    private static Context om() {
        return com.thinkup.core.common.n.o0n.m().on();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void oo() {
        try {
            this.ooo = 2;
            List<com.thinkup.core.common.o0o.m0> list = this.o00;
            ArrayList arrayList = new ArrayList(3);
            int iMin = Math.min(this.om.m(), list.size());
            for (int i2 = 0; i2 < iMin; i2++) {
                arrayList.add(list.get(i2));
                list.get(i2).toString();
            }
            list.removeAll(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m((com.thinkup.core.common.o0o.m0) it.next());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void m(Runnable runnable) {
        Handler handlerN = n();
        if (handlerN != null) {
            handlerN.removeCallbacks(runnable);
        }
    }

    private om o0(String str, String str2) {
        if (o(str)) {
            return o(str, str2);
        }
        return null;
    }

    private boolean m(com.thinkup.core.common.o0o.on onVar) {
        boolean z2 = false;
        if (com.thinkup.core.common.n.o0n.m().omn() || o0()) {
            this.f42315n.set(false);
            return false;
        }
        if (onVar == null) {
            this.f42315n.set(false);
            return false;
        }
        List<com.thinkup.core.common.o0o.m0> listOo = onVar.oo();
        this.on = listOo;
        AtomicBoolean atomicBoolean = this.f42315n;
        if (listOo != null && !listOo.isEmpty()) {
            z2 = true;
        }
        atomicBoolean.set(z2);
        this.om = onVar;
        this.m0.clear();
        this.m0.putAll(onVar.o0());
        return this.f42315n.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void n(com.thinkup.core.common.o0o.on onVar) {
        try {
            if (this.ooo == 0) {
                this.ooo = 1;
                this.o00 = Collections.synchronizedList(new ArrayList());
                for (com.thinkup.core.common.o0o.m0 m0Var : this.on) {
                    if (!this.mm.contains(m0Var.m)) {
                        Integer[] numArr = m0Var.mn;
                        if (numArr != null) {
                            if (Arrays.asList(numArr).contains(10)) {
                                this.o00.add(m0Var);
                                m(m0Var.m, String.valueOf(m0Var.o));
                            }
                        } else if (onVar != null && onVar.mm()) {
                            this.o00.add(m0Var);
                            m(m0Var.m, String.valueOf(m0Var.o));
                        }
                    }
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.oom;
                o(new Runnable() { // from class: com.thinkup.core.common.oon.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (com.thinkup.core.common.n.o0n.m().omn()) {
                            oon.this.f42315n.set(false);
                            oon.n(oon.this);
                        } else if (oon.this.o00 == null || oon.this.o00.isEmpty()) {
                            oon.n(oon.this);
                        } else {
                            oon.this.oo();
                        }
                    }
                }, jElapsedRealtime < j ? j - SystemClock.elapsedRealtime() : 0L);
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList<String> arrayList2 = new ArrayList();
            List<com.thinkup.core.common.o0o.m0> list = this.on;
            if (list != null) {
                for (com.thinkup.core.common.o0o.m0 m0Var2 : list) {
                    if (m0Var2 != null) {
                        Integer[] numArr2 = m0Var2.mn;
                        if (numArr2 != null) {
                            if (Arrays.asList(numArr2).contains(10)) {
                                arrayList.add(m0Var2.m);
                            }
                        } else if (onVar != null && onVar.mm()) {
                            arrayList.add(m0Var2.m);
                        }
                    }
                }
            }
            Set<String> set = this.mm;
            if (set != null) {
                arrayList2.addAll(set);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.removeAll(arrayList);
            }
            Set<String> set2 = this.mm;
            if (set2 != null) {
                arrayList.removeAll(set2);
            }
            if (!arrayList.isEmpty()) {
                this.o00 = Collections.synchronizedList(new ArrayList());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.thinkup.core.common.o0o.m0 m0Var3 = this.m0.get((String) it.next());
                    if (m0Var3 != null) {
                        m(m0Var3.m, String.valueOf(m0Var3.o));
                        if (this.ooo == 3) {
                            m(m0Var3);
                        } else {
                            m0Var3.toString();
                            this.o00.add(m0Var3);
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                for (String str : arrayList2) {
                    m(str);
                    this.mm.remove(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void o(TUSharedPlacementConfig tUSharedPlacementConfig) {
        try {
            if (tUSharedPlacementConfig == null) {
                if (TUSDK.isNetworkLogDebug()) {
                    Log.i(com.thinkup.core.common.n.mo.oo0, "setSharedPlacementConfig: null");
                }
                return;
            }
            if (TUSDK.isNetworkLogDebug()) {
                Log.i(com.thinkup.core.common.n.mo.oo0, "setSharedPlacementConfig: " + tUSharedPlacementConfig.toString());
            }
            this.nn = tUSharedPlacementConfig;
            List<com.thinkup.core.common.o0o.m0> list = this.on;
            if (list != null) {
                for (com.thinkup.core.common.o0o.m0 m0Var : list) {
                    n(m0Var.m, String.valueOf(m0Var.o));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(String str, String str2) {
        ooo.o().o(str, false);
        n(str, str2);
    }

    private void m(com.thinkup.core.common.o0o.m0 m0Var) {
        o(m0Var, 10, new TUAdRequest.Builder().setChannelSource(com.thinkup.core.common.n.o0n.m().m00()).build());
    }

    private void m(com.thinkup.core.common.o0o.m0 m0Var, TUAdRequest tUAdRequest) {
        if (tUAdRequest == null) {
            tUAdRequest = new TUAdRequest.Builder().setChannelSource(com.thinkup.core.common.n.o0n.m().m00()).build();
        }
        o(m0Var, 6, tUAdRequest);
    }

    public static oon o() {
        if (om0 == null) {
            synchronized (oon.class) {
                try {
                    if (om0 == null) {
                        om0 = new oon();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return om0;
    }

    public final synchronized void m(final String str, final TUAdRequest tUAdRequest) {
        o(new Runnable() { // from class: com.thinkup.core.common.oon.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (oon.this) {
                    try {
                        if (TextUtils.isEmpty(str)) {
                            return;
                        }
                        if (oon.this.mn.contains(str)) {
                            if (oon.this.no == null || oon.this.no.get(str) == null) {
                                oon.this.n(str, tUAdRequest);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }, 0L);
    }

    private void m(String str) {
        Map<String, o> map;
        o oVarRemove;
        if (TextUtils.isEmpty(str) || (map = this.no) == null || (oVarRemove = map.remove(str)) == null) {
            return;
        }
        m(oVarRemove);
    }

    private void o(Runnable runnable) {
        o(runnable, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(Runnable runnable, long j) {
        Handler handlerN = n();
        if (handlerN != null) {
            handlerN.postDelayed(runnable, j);
        }
    }

    public final boolean o(com.thinkup.core.oo.n0 n0Var) {
        if (n0Var == null) {
            return false;
        }
        if (TUAdxSetting.getInstance().isAdxNetworkMode(n0Var.mo())) {
            n0Var.mo();
            return false;
        }
        return o(n0Var.ooo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void m(String str, com.thinkup.core.common.o0o.m0 m0Var, com.thinkup.core.common.o0o.m mVar) {
        m0Var.toString();
        com.thinkup.core.common.o0o.n nVar = this.n0.get(str);
        if (nVar == null) {
            return;
        }
        o(nVar, mVar);
    }

    private boolean o(com.thinkup.core.common.o0o.m0 m0Var) {
        boolean z2;
        List<TUAdInfo> listO;
        m0Var.toString();
        String str = m0Var.m;
        om omVarO = o(str) ? o(str, String.valueOf(m0Var.o)) : null;
        if (omVarO == null) {
            m0Var.toString();
            return false;
        }
        int i2 = m0Var.o0;
        double d = m0Var.oo;
        if (i2 <= 0 || (listO = omVarO.o(this.m, (ono) null)) == null || listO.size() >= i2) {
            z2 = false;
        } else {
            listO.size();
            m0Var.toString();
            z2 = true;
        }
        if (z2) {
            return true;
        }
        if (d > 0.0d) {
            HashMap map = new HashMap();
            ono onoVar = new ono();
            onoVar.o(map);
            com.thinkup.core.common.on.o oVarO = omVarO.o(this.m, false, false, onoVar);
            if (oVarO != null && oVarO.nm() < d) {
                oVarO.nm();
                m0Var.toString();
                return true;
            }
        }
        return z2;
    }

    public final boolean m() {
        return this.f42315n.get();
    }

    public static /* synthetic */ void m(oon oonVar, com.thinkup.core.common.o0o.m0 m0Var, TUAdRequest tUAdRequest) {
        if (tUAdRequest == null) {
            tUAdRequest = new TUAdRequest.Builder().setChannelSource(com.thinkup.core.common.n.o0n.m().m00()).build();
        }
        oonVar.o(m0Var, 6, tUAdRequest);
    }

    public final synchronized void o(final com.thinkup.core.common.o0o.on onVar) {
        try {
            if (m(onVar)) {
                if (onVar.mo()) {
                    if (this.ooo == 0 && this.oom == -1) {
                        this.oom = SystemClock.elapsedRealtime() + onVar.o();
                        onVar.o();
                    }
                    o(new Runnable() { // from class: com.thinkup.core.common.oon.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            oon.this.n(onVar);
                        }
                    }, 0L);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void n(String str, String str2) {
        Map<String, Object> nativeLocalExtra;
        if (this.nn == null) {
            return;
        }
        str2.getClass();
        switch (str2) {
            case "0":
                nativeLocalExtra = this.nn.getNativeLocalExtra();
                break;
            case "1":
                nativeLocalExtra = this.nn.getRewardVideoLocalExtra();
                break;
            case "2":
                nativeLocalExtra = this.nn.getBannerLocalExtra();
                break;
            case "3":
                nativeLocalExtra = this.nn.getInterstitialLocalExtra();
                break;
            case "4":
                nativeLocalExtra = this.nn.getSplashLocalExtra();
                break;
            default:
                nativeLocalExtra = null;
                break;
        }
        if (nativeLocalExtra != null) {
            nativeLocalExtra.toString();
        }
        ooo.o().o(str, nativeLocalExtra);
    }

    public final void o(com.thinkup.core.common.o0o.on onVar, com.thinkup.core.oo.n0 n0Var, final mmm mmmVar) {
        String strOoo;
        final com.thinkup.core.common.o0o.m0 m0Var;
        if (n0Var != null) {
            strOoo = n0Var.ooo();
        } else {
            strOoo = "";
        }
        if (!m(onVar) || TextUtils.isEmpty(strOoo) || !onVar.o(12, strOoo) || (m0Var = this.m0.get(strOoo)) == null || this.mm.contains(strOoo)) {
            return;
        }
        this.mm.add(strOoo);
        m0Var.om = mmmVar;
        m0Var.m0 = n0Var;
        o(new Runnable() { // from class: com.thinkup.core.common.oon.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (oon.this) {
                    try {
                        oon oonVar = oon.this;
                        com.thinkup.core.common.o0o.m0 m0Var2 = m0Var;
                        oonVar.m(m0Var2.m, String.valueOf(m0Var2.o));
                        mmm mmmVar2 = mmmVar;
                        oon.o(oon.this, m0Var, mmmVar2 != null ? mmmVar2.m() : null);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str, TUAdRequest tUAdRequest) {
        com.thinkup.core.common.o0o.on onVar = this.om;
        if (onVar != null && onVar.o(11, str) && o(str)) {
            com.thinkup.core.common.o0o.m0 m0Var = this.m0.get(str);
            if (m0Var == null) {
                Log.e(o, "startScheduleLoadTask: sharedPlaceInfo = null");
                return;
            }
            if (this.no == null) {
                this.no = new ConcurrentHashMap(5);
            }
            int i2 = m0Var.f42166n;
            if (i2 < 30000) {
                i2 = 30000;
            }
            o oVar = new o(str, tUAdRequest);
            this.no.put(str, oVar);
            o(oVar, i2);
        }
    }

    private List<com.thinkup.core.common.o0o.m0> o(List<com.thinkup.core.common.o0o.m0> list) {
        ArrayList arrayList = new ArrayList(3);
        int iMin = Math.min(this.om.m(), list.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(list.get(i2));
            list.get(i2).toString();
        }
        list.removeAll(arrayList);
        return arrayList;
    }

    private void o(com.thinkup.core.common.o0o.m0 m0Var, TUAdRequest tUAdRequest) {
        if (tUAdRequest == null) {
            tUAdRequest = new TUAdRequest.Builder().setChannelSource(com.thinkup.core.common.n.o0n.m().m00()).build();
        }
        o(m0Var, 12, tUAdRequest);
    }

    public final void o(final String str, final TUAdRequest tUAdRequest) {
        com.thinkup.core.common.o0o.on onVar = this.om;
        if (onVar != null && onVar.o(6, str)) {
            o(new Runnable() { // from class: com.thinkup.core.common.oon.4
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (oon.this) {
                        try {
                            if (oon.this.o(str)) {
                                oon.m(oon.this, (com.thinkup.core.common.o0o.m0) oon.this.m0.get(str), tUAdRequest);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(com.thinkup.core.common.o0o.m0 m0Var, int i2, TUAdRequest tUAdRequest) {
        if (m0Var == null) {
            Log.e(o, "loadSharedPlacement: sharedPlaceInfo = null");
            return;
        }
        m0Var.toString();
        if (i2 != 16) {
            this.o0.o(m0Var);
        }
        m(m0Var.m);
        Boolean bool = this.mo.get(m0Var.m);
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            return;
        }
        this.mo.put(m0Var.m, bool2);
        if (i2 == 10 || i2 == 12) {
            if (i2 == 10) {
                this.nm++;
                m0Var.toString();
            }
            this.mm.add(m0Var.m);
        }
        com.thinkup.core.common.o0o.n nVar = new com.thinkup.core.common.o0o.n(m0Var.m);
        if (this.n0 == null) {
            this.n0 = new ConcurrentHashMap();
        }
        this.n0.put(nVar.o(), nVar);
        com.thinkup.core.common.ooo.m.m.o().m((Runnable) new AnonymousClass6(m0Var, i2, tUAdRequest, nVar), 2);
    }

    public final boolean o(String str) {
        try {
            if (!this.f42315n.get() || com.thinkup.core.common.n.o0n.m().omn() || TextUtils.isEmpty(str)) {
                return false;
            }
            return this.m0.containsKey(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(String str, com.thinkup.core.common.o0o.m0 m0Var, com.thinkup.core.common.o0o.m mVar) {
        boolean z2;
        List<TUAdInfo> listO;
        try {
            m0Var.toString();
            this.o0.o(m0Var);
            com.thinkup.core.common.o0o.n nVarRemove = this.n0.remove(str);
            if (nVarRemove != null && mVar != null) {
                m0Var.toString();
                String str2 = m0Var.m;
                om omVarO = o(str2) ? o(str2, String.valueOf(m0Var.o)) : null;
                boolean z3 = false;
                if (omVarO == null) {
                    m0Var.toString();
                } else {
                    int i2 = m0Var.o0;
                    double d = m0Var.oo;
                    if (i2 <= 0 || (listO = omVarO.o(this.m, (ono) null)) == null || listO.size() >= i2) {
                        z2 = false;
                    } else {
                        listO.size();
                        m0Var.toString();
                        z2 = true;
                    }
                    if (z2) {
                        z3 = true;
                    } else {
                        if (d > 0.0d) {
                            HashMap map = new HashMap();
                            ono onoVar = new ono();
                            onoVar.o(map);
                            com.thinkup.core.common.on.o oVarO = omVarO.o(this.m, false, false, onoVar);
                            if (oVarO != null && oVarO.nm() < d) {
                                oVarO.nm();
                                m0Var.toString();
                                z3 = true;
                            }
                        }
                        z3 = z2;
                    }
                }
                if (z3) {
                    n(nVarRemove.oo(), mVar.o());
                }
                o(nVarRemove, mVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(String str, com.thinkup.core.common.o0o.m0 m0Var, AdError adError, final com.thinkup.core.common.o0o.m mVar) {
        m0Var.toString();
        adError.getFullErrorInfo();
        this.o0.o(m0Var, n(), new com.thinkup.core.common.o0o.o() { // from class: com.thinkup.core.common.oon.7
            @Override // com.thinkup.core.common.o0o.o
            public final void o(int i2, com.thinkup.core.common.o0o.m0 m0Var2) {
                com.thinkup.core.common.o0o.m mVar2 = mVar;
                oon.this.o(m0Var2, i2, mVar2 != null ? mVar2.o() : null);
            }
        });
        com.thinkup.core.common.o0o.n nVarRemove = this.n0.remove(str);
        if (nVarRemove != null && mVar != null) {
            n(nVarRemove.oo(), mVar.o());
            o(nVarRemove, mVar);
        }
    }

    private void o(com.thinkup.core.common.o0o.n nVar, com.thinkup.core.common.o0o.m mVar) {
        this.mn.add(nVar.oo());
        if (nVar.o0() == 10 && nVar.m()) {
            this.nm--;
            if (this.nm >= this.om.m()) {
                return;
            }
            if (!this.o00.isEmpty()) {
                com.thinkup.core.common.o0o.m0 m0VarRemove = this.o00.remove(0);
                m0VarRemove.toString();
                TUAdRequest tUAdRequestO = mVar != null ? mVar.o() : null;
                if (tUAdRequestO == null) {
                    tUAdRequestO = new TUAdRequest.Builder().setChannelSource(com.thinkup.core.common.n.o0n.m().m00()).build();
                }
                o(m0VarRemove, 10, tUAdRequestO);
                return;
            }
            if (this.nm == 0) {
                this.ooo = 3;
            }
        }
    }

    public static om o(String str, String str2) {
        return ooo.o().o(str, str2);
    }

    public final void o(com.thinkup.core.oo.n0 n0Var, final int i2, final mmm mmmVar, com.thinkup.core.common.on.n0 n0Var2) {
        String strOoo;
        final com.thinkup.core.common.o0o.m0 m0Var;
        String strMo = "";
        if (n0Var == null) {
            strOoo = "";
        } else {
            try {
                strOoo = n0Var.ooo();
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (n0Var != null) {
            strMo = n0Var.mo();
        }
        com.thinkup.core.oo.m mVarM = com.thinkup.core.oo.o0.o(com.thinkup.core.common.n.o0n.m().on()).m(com.thinkup.core.common.n.o0n.m().o00());
        if (mVarM != null && !TextUtils.isEmpty(strOoo) && !strOoo.equals(strMo)) {
            com.thinkup.core.common.o0o.on onVarM0 = mVarM.m0();
            if (m(onVarM0) && onVarM0.o(i2, strOoo) && (m0Var = this.m0.get(strOoo)) != null) {
                if (Boolean.TRUE.equals(this.mo.get(strOoo))) {
                    return;
                }
                m0Var.m0 = n0Var;
                m0Var.on = n0Var2;
                m0Var.om = mmmVar;
                this.o0.o(m0Var);
                o(new Runnable() { // from class: com.thinkup.core.common.oon.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        mmm mmmVar2 = mmmVar;
                        oon.this.o(m0Var, i2, mmmVar2 != null ? mmmVar2.m() : null);
                    }
                }, i2 == 15 ? onVarM0.om() : 0L);
            }
        }
    }

    public static /* synthetic */ void o(oon oonVar, com.thinkup.core.common.o0o.m0 m0Var, TUAdRequest tUAdRequest) {
        if (tUAdRequest == null) {
            tUAdRequest = new TUAdRequest.Builder().setChannelSource(com.thinkup.core.common.n.o0n.m().m00()).build();
        }
        oonVar.o(m0Var, 12, tUAdRequest);
    }
}
