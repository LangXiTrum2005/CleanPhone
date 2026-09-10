package com.mbridge.msdk.newreward.adapter;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: loaded from: classes2.dex */
public class d implements com.mbridge.msdk.newreward.adapter.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Deque<e> f1562a;
    private RewardVideoListener c;
    private com.mbridge.msdk.newreward.function.model.f d;
    private com.mbridge.msdk.newreward.function.command.c e;
    private MBridgeIds f;
    private Map g;
    private com.mbridge.msdk.newreward.controller.b h;
    private com.mbridge.msdk.newreward.function.proxy.c k;
    private final Object b = new Object();
    private int i = 1;
    private int j = 1;

    public class a implements com.mbridge.msdk.newreward.adapter.req.b {
        public a() {
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
        }
    }

    public class b implements com.mbridge.msdk.newreward.adapter.req.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f1564a;

        public b(Map map) {
            this.f1564a = map;
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            d.this.d = (com.mbridge.msdk.newreward.function.model.f) obj;
            d.this.g = this.f1564a;
            if (d.this.h != null) {
                d.this.h.a(d.this.d);
            }
            ((MBridgeDailyPlayModel) d.this.e.a(this.f1564a, com.mbridge.msdk.newreward.function.command.f.CREATE_DAILY)).setMaxPlayCount(d.this.d.c() == null ? 0 : d.this.d.c().k());
        }
    }

    public class c implements Comparator<e> {
        public c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e eVar, e eVar2) {
            long jU = eVar.g().a().u();
            if (jU == com.mbridge.msdk.newreward.function.core.campaign.b.M) {
                jU = eVar.g().a().z();
            }
            long jU2 = eVar2.g().a().u();
            if (jU2 == com.mbridge.msdk.newreward.function.core.campaign.b.M) {
                jU2 = eVar2.g().a().z();
            }
            return Long.compare(jU, jU2);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.newreward.adapter.d$d, reason: collision with other inner class name */
    public class C0200d implements com.mbridge.msdk.newreward.adapter.req.b {
        public C0200d() {
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            d.this.b(obj);
        }
    }

    public d() {
        if (this.f1562a == null) {
            this.f1562a = new ConcurrentLinkedDeque();
        }
    }

    private boolean d(e eVar) {
        e eVarPeek;
        if (eVar.d0()) {
            return false;
        }
        if (!TextUtils.isEmpty(eVar.f()) && com.mbridge.msdk.newreward.function.utils.c.d(eVar.f())) {
            com.mbridge.msdk.newreward.function.command.c cVar = this.e;
            if (((Boolean) cVar.a(cVar.a("adapter_model", eVar, "command_manager", cVar, "candidate_type", 1, "reason", new com.mbridge.msdk.foundation.error.b(880038)))).booleanValue()) {
                eVar.e(true);
                com.mbridge.msdk.newreward.function.command.c cVar2 = this.e;
                com.mbridge.msdk.newreward.function.cache.b bVar = (com.mbridge.msdk.newreward.function.cache.b) cVar2.a(cVar2.a("adapter_model", eVar, "command_manager", cVar2, "candidate_type", 2, "reason", new com.mbridge.msdk.foundation.error.b(880038)));
                if (bVar != null && bVar.h() == com.mbridge.msdk.newreward.function.cache.b.j) {
                    eVar.g().b(bVar.e());
                    return true;
                }
            }
        }
        this.i = MBridgeSharedPreferenceModel.getInstance().getInteger("vcn_" + eVar.R(), 1);
        if (this.f1562a.size() != 0 && this.f1562a.size() >= this.i) {
            if (TextUtils.isEmpty(eVar.f()) && (eVarPeek = this.f1562a.peek()) != null && eVarPeek.g() != null && eVarPeek.g().a() != null) {
                eVar.g().b(eVarPeek.g().a());
                return true;
            }
            for (e eVar2 : this.f1562a) {
                com.mbridge.msdk.newreward.function.core.campaign.b bVarA = eVar2.g().a();
                if (bVarA != null && bVarA.D() == 1) {
                    eVar2.e(eVar.A());
                    eVar.n(true);
                    return true;
                }
            }
        }
        return false;
    }

    private boolean e(e eVar) {
        if (eVar.d() != 287 || !q0.a().a("s_a_w_n_c", true) || t0.m(com.mbridge.msdk.foundation.controller.c.n().d())) {
            return false;
        }
        RewardVideoListener rewardVideoListener = this.c;
        if (rewardVideoListener != null) {
            rewardVideoListener.onShowFail(this.f, com.mbridge.msdk.foundation.error.a.a(890011));
        }
        a(eVar, com.mbridge.msdk.foundation.error.a.a(890011));
        this.f1562a.poll();
        return true;
    }

    private void f(e eVar) {
        try {
            List<String> listE = com.mbridge.msdk.newreward.function.database.c.c().a().e(eVar.d(), eVar.G(), eVar.R());
            if (listE == null || listE.size() <= 0) {
                return;
            }
            String str = "";
            if (eVar.g() != null && eVar.g().a() != null) {
                str = eVar.g().a().v() + "";
            }
            Iterator<String> it = listE.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.foundation.same.report.metrics.d.b().b(it.next(), str);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.c
    public void init(Object... objArr) {
        this.e = (com.mbridge.msdk.newreward.function.command.c) objArr[0];
        this.h = (com.mbridge.msdk.newreward.controller.b) objArr[1];
        com.mbridge.msdk.newreward.function.command.d.b().a(this.e);
        Map mapA = this.e.a("mb_ad_type", Integer.valueOf(this.h.f()), "mb_ad_is_header_bidding", Boolean.valueOf(this.h.g()), "mb_ad_pid", this.h.b(), "mb_ad_unit_id", this.h.e());
        this.g = mapA;
        this.f = (MBridgeIds) this.e.a(mapA, com.mbridge.msdk.newreward.function.command.f.CREATE_BIDS);
        com.mbridge.msdk.newreward.function.command.c cVar = this.e;
        cVar.c(cVar.a("mb_ad_unit_id", this.h.e(), "command_type", com.mbridge.msdk.newreward.function.command.f.UNIT_INIT), new a());
        com.mbridge.msdk.newreward.function.database.c.c().a().b(this.h.f(), this.h.b(), this.h.e());
        this.e.a((Object) mapA, com.mbridge.msdk.newreward.function.command.f.REQ_SETTING, (com.mbridge.msdk.newreward.adapter.req.b) new b(mapA));
        a(this.g);
        com.mbridge.msdk.newreward.function.command.c cVar2 = this.e;
        cVar2.f(cVar2.a("controller_model", this.h, "command_manager", cVar2, "adapter_manager", this));
        int iB = q0.a().b(MBridgeCommon.SharedPreference.KEY_LOADING_CAPACITY, 1);
        this.j = iB;
        if (iB <= 0) {
            this.j = 1;
        }
        c();
    }

    private void c(e eVar) {
        e next;
        if (eVar == null || TextUtils.isEmpty(eVar.r())) {
            return;
        }
        try {
            Deque<e> deque = this.f1562a;
            if (deque == null) {
                next = null;
                break;
            }
            Iterator<e> it = deque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next != null && next.j0() && (next.g() == null || !next.g().c())) {
                    if (eVar.r().equals(next.A())) {
                        break;
                    }
                }
            }
            if (next != null) {
                com.mbridge.msdk.newreward.function.command.c cVar = this.e;
                cVar.j(cVar.a("adapter_model", eVar, "queue_first_adapter_model", next), com.mbridge.msdk.newreward.function.command.f.UPDATE_CAM_TOKEN_RULE);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void b(Object obj) {
        try {
            for (com.mbridge.msdk.newreward.function.core.campaign.b bVar : (List) obj) {
                e eVar = new e(false, ((Integer) this.g.get("mb_ad_type")).intValue(), bVar.c(), bVar.E(), bVar.J());
                com.mbridge.msdk.newreward.function.model.a aVar = new com.mbridge.msdk.newreward.function.model.a();
                aVar.b(bVar);
                eVar.a(aVar);
                eVar.a(this.d);
                eVar.f(bVar.p());
                eVar.c(2);
                eVar.a(this.f);
                eVar.d = new g(this.e);
                eVar.a(this.c);
                eVar.g(bVar.s());
                this.f1562a.add(eVar);
            }
        } catch (Exception e) {
            o0.b("AdapterManagerImpl", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.c
    public void a(Object obj) {
        try {
            this.c = (RewardVideoListener) obj;
        } catch (Throwable unused) {
            this.c = null;
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.c
    public void a(e eVar, com.mbridge.msdk.newreward.adapter.b bVar) {
        if (eVar == null || bVar == null) {
            return;
        }
        eVar.a(this.d);
        eVar.a(this.c);
        eVar.a(this.f);
        com.mbridge.msdk.newreward.function.proxy.c cVar = this.k;
        if (cVar != null) {
            eVar.a(cVar);
        }
        com.mbridge.msdk.newreward.function.command.c cVar2 = this.e;
        if (cVar2 != null) {
            cVar2.d(eVar, com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_START);
        }
        int integer = MBridgeSharedPreferenceModel.getInstance().getInteger("vcn_" + this.h.e(), 1);
        this.i = integer;
        if (integer <= 0) {
            this.i = 1;
        }
        if (a(1) < this.j) {
            try {
                synchronized (this.b) {
                    try {
                        if (b(eVar)) {
                            return;
                        }
                        if (a(false) && d(eVar)) {
                            a(eVar, com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_V3_CAMPAIGN_SUCCESS);
                            this.c.onLoadSuccess(this.f);
                            eVar.d(true);
                            a(eVar, com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_VIDEO_CAMPAIGN_SUCCESS);
                            this.c.onVideoLoadSuccess(this.f);
                            eVar.k(true);
                        }
                        d();
                        f(eVar);
                        e eVarPeekFirst = a(2) == this.i ? this.f1562a.peekFirst() : null;
                        while (a(2) > this.i) {
                            eVarPeekFirst = this.f1562a.pollFirst();
                        }
                        this.f1562a.add(eVar);
                        eVar.d = bVar;
                        eVar.a(eVarPeekFirst);
                        eVar.c(SystemClock.elapsedRealtime());
                        bVar.b(eVar);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                RewardVideoListener rewardVideoListener = this.c;
                if (rewardVideoListener != null) {
                    rewardVideoListener.onVideoLoadFail(new MBridgeIds(), e.getMessage());
                }
                a(eVar, com.mbridge.msdk.foundation.error.a.a(880020, "errorCode: 3501 errorMessage: " + e.getMessage()));
                com.mbridge.msdk.newreward.function.database.c.c().a().b(eVar.d(), eVar.G(), eVar.R(), eVar.A(), 406);
                return;
            }
        }
        RewardVideoListener rewardVideoListener2 = this.c;
        if (rewardVideoListener2 != null) {
            rewardVideoListener2.onVideoLoadFail(new MBridgeIds(), "current unit is loading");
        }
        a(eVar, com.mbridge.msdk.foundation.error.a.a(880016, "errorCode: 3501 errorMessage: current unit is loading"));
    }

    private void e() {
        try {
            com.mbridge.msdk.newreward.controller.b bVar = this.h;
            if (bVar != null) {
                if (bVar.d() != null) {
                    this.e.d(this.h.d(), com.mbridge.msdk.newreward.function.command.f.REPORT_SHOW_START);
                } else {
                    this.e.d(this.h, com.mbridge.msdk.newreward.function.command.f.REPORT_SHOW_START);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void c() {
        this.k = com.mbridge.msdk.newreward.function.proxy.a.a();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    private boolean b(e eVar) {
        long jX;
        e eVarPeek;
        boolean z = false;
        z = false;
        z = false;
        try {
            Deque<e> deque = this.f1562a;
            if (deque == null || (eVarPeek = deque.peek()) == null) {
                jX = 0;
            } else {
                String strL = eVarPeek.l();
                if (TextUtils.isEmpty(strL) || !strL.equals("-1")) {
                    jX = 0;
                } else {
                    jX = eVarPeek.x();
                }
            }
            com.mbridge.msdk.newreward.function.command.c cVar = this.e;
            Map map = (Map) cVar.b(cVar.a("adapter_model", eVar, "last_response_empty_time", Long.valueOf(jX)), com.mbridge.msdk.newreward.function.command.f.CHECK_IS_REQUEST_CONTROL);
            if (map != null && map.size() > 0) {
                try {
                    RewardVideoListener rewardVideoListener = this.c;
                    if (rewardVideoListener != null) {
                        rewardVideoListener.onVideoLoadFail(new MBridgeIds(), (String) map.get(NotificationCompat.CATEGORY_MESSAGE));
                    }
                    int i = TextUtils.isEmpty((CharSequence) map.get("error_code")) ? 0 : Integer.parseInt((String) map.get("error_code"));
                    a(eVar, com.mbridge.msdk.foundation.error.a.a(i, i == -1 ? 880018 : 880002, (String) map.get(NotificationCompat.CATEGORY_MESSAGE)));
                    z = true;
                } catch (Exception e) {
                    e = e;
                    z = true;
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
            if (z) {
                String str = "";
                if (eVar.g() != null && eVar.g().a() != null) {
                    str = eVar.g().a().v() + "";
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().b(eVar.A(), str);
            }
        } catch (Exception e2) {
            e = e2;
        }
        return z;
    }

    public void d() {
        for (e eVar : this.f1562a) {
            if (!eVar.g().c() && eVar.q() == 2) {
                this.f1562a.remove(eVar);
                String str = "";
                if (eVar.g() != null && eVar.g().a() != null) {
                    str = eVar.g().a().v() + "";
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().b(eVar.A(), str);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.c
    public List<e> b() {
        ArrayList arrayList = new ArrayList();
        Deque<e> deque = this.f1562a;
        if (deque != null && deque.size() != 0) {
            Iterator<e> it = this.f1562a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    private void a(e eVar, com.mbridge.msdk.newreward.function.command.f fVar) {
        int iW;
        int iV;
        if (eVar == null) {
            return;
        }
        List<CampaignEx> listB = eVar.g() != null ? eVar.g().b() : null;
        try {
            if (eVar.g() == null || eVar.g().a() == null) {
                iW = 0;
                iV = 0;
            } else {
                com.mbridge.msdk.newreward.function.core.campaign.b bVarA = eVar.g().a();
                iV = bVarA.v();
                iW = bVarA.w();
            }
            int filterCallBackState = (listB == null || listB.isEmpty()) ? 0 : listB.get(0).getFilterCallBackState();
            com.mbridge.msdk.newreward.function.command.c cVar = this.e;
            Object[] objArr = new Object[12];
            objArr[0] = "metrics_data";
            objArr[1] = listB;
            int i = 2;
            objArr[2] = "auto_load";
            if (!eVar.X()) {
                i = 1;
            }
            objArr[3] = Integer.valueOf(i);
            objArr[4] = "cache";
            objArr[5] = 1;
            objArr[6] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX;
            objArr[7] = Integer.valueOf(iV);
            objArr[8] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX;
            objArr[9] = Integer.valueOf(iW);
            objArr[10] = CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE;
            objArr[11] = Integer.valueOf(filterCallBackState);
            cVar.a(eVar, fVar, cVar.a(objArr));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void a(e eVar, com.mbridge.msdk.foundation.error.b bVar) {
        int filterCallBackState;
        int iV;
        int iW;
        eVar.c(2);
        eVar.k(true);
        if (eVar.g() == null || eVar.g().a() == null) {
            filterCallBackState = 0;
            iV = 0;
            iW = 0;
        } else {
            com.mbridge.msdk.newreward.function.core.campaign.b bVarA = eVar.g().a();
            iV = bVarA.v();
            iW = bVarA.w();
            filterCallBackState = (bVarA.f() == null || bVarA.f().isEmpty()) ? 0 : bVarA.f().get(0).getFilterCallBackState();
        }
        com.mbridge.msdk.newreward.function.command.c cVar = this.e;
        cVar.a(eVar, com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_FAILED, cVar.a("metrics_data", bVar, com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX, Integer.valueOf(iV), com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX, Integer.valueOf(iW), CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(filterCallBackState)));
    }

    @RequiresApi(api = 21)
    public ConcurrentLinkedDeque<e> a(ConcurrentLinkedDeque<e> concurrentLinkedDeque) {
        if (concurrentLinkedDeque == null || concurrentLinkedDeque.isEmpty() || concurrentLinkedDeque.size() == 1) {
            return concurrentLinkedDeque;
        }
        ArrayList arrayList = new ArrayList(concurrentLinkedDeque);
        Collections.sort(arrayList, new c());
        return new ConcurrentLinkedDeque<>(arrayList);
    }

    @Override // com.mbridge.msdk.newreward.adapter.c
    public void a(f fVar) {
        synchronized (this.b) {
            try {
                try {
                    if (this.f1562a.isEmpty()) {
                        this.h.a(com.mbridge.msdk.newreward.function.utils.d.a(""));
                        RewardVideoListener rewardVideoListener = this.c;
                        if (rewardVideoListener != null) {
                            rewardVideoListener.onShowFail(this.f, com.mbridge.msdk.foundation.error.a.a(890005));
                        }
                        e();
                        a(com.mbridge.msdk.foundation.error.a.a(890005));
                        return;
                    }
                    this.f1562a = a((ConcurrentLinkedDeque<e>) this.f1562a);
                    this.i = MBridgeSharedPreferenceModel.getInstance().getInteger("vcn_" + this.f.getUnitId(), 1);
                    while (a(2) > this.i) {
                        this.f1562a.pollFirst();
                    }
                    ConcurrentLinkedDeque concurrentLinkedDeque = new ConcurrentLinkedDeque();
                    while (!this.f1562a.isEmpty()) {
                        try {
                            e eVarPeek = this.f1562a.peek();
                            if (eVarPeek != null && eVarPeek.g() != null && eVarPeek.g().c()) {
                                if (!e(eVarPeek)) {
                                    c(eVarPeek);
                                    com.mbridge.msdk.newreward.adapter.b bVar = eVarPeek.d;
                                    eVarPeek.a(fVar);
                                    this.h.a(eVarPeek);
                                    com.mbridge.msdk.newreward.function.command.d.b().a(eVarPeek);
                                    bVar.a(eVarPeek);
                                    this.f1562a.poll();
                                    break;
                                }
                                break;
                            }
                            if (eVarPeek != null && eVarPeek.q() == 2 && !eVarPeek.g().c()) {
                                if (this.f1562a.size() == 1) {
                                    this.h.a(eVarPeek);
                                    RewardVideoListener rewardVideoListener2 = this.c;
                                    if (rewardVideoListener2 != null) {
                                        rewardVideoListener2.onShowFail(this.f, com.mbridge.msdk.foundation.error.a.a(890006));
                                    }
                                    a(eVarPeek, com.mbridge.msdk.foundation.error.a.a(890006));
                                }
                                this.f1562a.poll();
                            } else {
                                if (this.f1562a.size() == 1) {
                                    RewardVideoListener rewardVideoListener3 = this.c;
                                    if (rewardVideoListener3 != null) {
                                        rewardVideoListener3.onShowFail(this.f, com.mbridge.msdk.foundation.error.a.a(890007));
                                    }
                                    a(eVarPeek, com.mbridge.msdk.foundation.error.a.a(890007));
                                }
                                concurrentLinkedDeque.push(this.f1562a.poll());
                            }
                        } catch (Exception e) {
                            if (this.f1562a.size() == 1) {
                                this.h.a(com.mbridge.msdk.newreward.function.utils.d.a(""));
                                RewardVideoListener rewardVideoListener4 = this.c;
                                if (rewardVideoListener4 != null) {
                                    rewardVideoListener4.onShowFail(this.f, e.getMessage());
                                }
                                a("show failed, exception is " + e.getMessage());
                                break;
                            }
                        }
                    }
                    while (!concurrentLinkedDeque.isEmpty()) {
                        this.f1562a.push((e) concurrentLinkedDeque.poll());
                    }
                    e();
                } catch (Throwable th) {
                    e();
                    a("show exception: " + th.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.c
    public boolean a(boolean z) {
        com.mbridge.msdk.newreward.function.core.campaign.b bVarA;
        Object obj = null;
        com.mbridge.msdk.newreward.function.core.campaign.b bVar = null;
        for (e eVar : this.f1562a) {
            if (eVar != null) {
                com.mbridge.msdk.newreward.function.model.a aVarG = eVar.g();
                if (aVarG == null || (bVarA = aVarG.a()) == null) {
                    obj = eVar;
                } else {
                    if (aVarG.c()) {
                        if (z) {
                            a(true, eVar, bVarA);
                        }
                        return true;
                    }
                    obj = eVar;
                    bVar = bVarA;
                }
            }
        }
        if (z) {
            if (obj == null) {
                obj = this.h;
            }
            a(false, obj, bVar);
        }
        return false;
    }

    private void a(boolean z, Object obj, com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
        if (this.e == null || obj == null) {
            return;
        }
        try {
            String strValueOf = z ? String.valueOf(1) : String.valueOf(2);
            String isReadyNotReadyReasonType = MBridgeGlobalCommon.getIsReadyNotReadyReasonType(bVar);
            if (z) {
                com.mbridge.msdk.newreward.function.command.c cVar = this.e;
                cVar.a(obj, com.mbridge.msdk.newreward.function.command.f.REPORT_IS_READY_CHECK, cVar.a("result", strValueOf));
            } else {
                com.mbridge.msdk.newreward.function.command.c cVar2 = this.e;
                cVar2.a(obj, com.mbridge.msdk.newreward.function.command.f.REPORT_IS_READY_CHECK, cVar2.a("result", strValueOf, "type", isReadyNotReadyReasonType));
            }
        } catch (Throwable th) {
            o0.a("reportReadyCheck", th.getMessage());
        }
    }

    private void a(@NonNull Map map) {
        map.put("command_type", com.mbridge.msdk.newreward.function.command.f.RESTORE_DB);
        this.e.c(map, new C0200d());
    }

    private int a(int i) {
        int i2 = 0;
        if (this.f1562a.size() == 0) {
            return 0;
        }
        for (e eVar : this.f1562a) {
            if (i != 1) {
                if (i == 2 && eVar.g().c()) {
                    i2++;
                }
            } else if (eVar.q() == 1) {
                i2++;
            }
        }
        return i2;
    }

    private void a(String str) {
        try {
            com.mbridge.msdk.newreward.controller.b bVar = this.h;
            if (bVar == null) {
                return;
            }
            com.mbridge.msdk.newreward.function.command.c cVar = this.e;
            cVar.a(bVar, com.mbridge.msdk.newreward.function.command.f.REPORT_SHOW_FAIL, cVar.a("reason", str));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void a(e eVar, String str) {
        int filterCallBackState;
        int iV;
        if (eVar == null) {
            return;
        }
        try {
            int i = 0;
            CampaignEx campaignEx = (eVar.g() == null || eVar.g().b() == null || eVar.g().b().isEmpty()) ? null : eVar.g().b().get(0);
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                if (eVar.g() == null || eVar.g().a() == null) {
                    filterCallBackState = 0;
                    iV = 0;
                } else {
                    com.mbridge.msdk.newreward.function.core.campaign.b bVarA = eVar.g().a();
                    iV = bVarA.v();
                    int iW = bVarA.w();
                    if (bVarA.f() == null || bVarA.f().isEmpty()) {
                        i = iW;
                        filterCallBackState = 0;
                    } else {
                        filterCallBackState = bVarA.f().get(0).getFilterCallBackState();
                        i = iW;
                    }
                }
                eVar2.a(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(filterCallBackState));
                eVar2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX, Integer.valueOf(iV));
                eVar2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX, Integer.valueOf(i));
                eVar2.a("reason", str);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000131", campaignEx, eVar2);
                return;
            }
            a(str);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.c
    @Nullable
    public e a() {
        e eVarPeek;
        Deque<e> deque = this.f1562a;
        if (deque == null || deque.size() == 0 || (eVarPeek = this.f1562a.peek()) == null) {
            return null;
        }
        return eVarPeek;
    }

    public void a(e eVar) {
        Deque<e> deque;
        if (eVar == null || (deque = this.f1562a) == null) {
            return;
        }
        deque.addLast(eVar);
    }
}
