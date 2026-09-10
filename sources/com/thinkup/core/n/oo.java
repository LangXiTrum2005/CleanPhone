package com.thinkup.core.n;

import android.os.SystemClock;
import android.util.Log;
import com.thinkup.core.api.MediationBidManager;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.on.nm;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0om;
import com.thinkup.core.common.on.om0;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.ooo.omn;
import com.thinkup.core.common.ooo.oo0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class oo extends o {
    private long om;
    private com.thinkup.core.n.m.m on;
    private String oo;

    public oo(o0om o0omVar) {
        super(o0omVar);
        this.oo = "IH Bidding";
    }

    @Override // com.thinkup.core.n.o
    public final void m() {
        o((List<o0mm>) null, -3);
    }

    @Override // com.thinkup.core.n.o
    public final void o(o0mm o0mmVar, om0 om0Var, long j) {
    }

    private static void m(o0mm o0mmVar, String str, long j, int i2) {
        o.o(o0mmVar, str, j, i2);
    }

    private void m(o0mm o0mmVar) throws Throwable {
        on0 on0Var = new on0(true, o0mmVar.moo(), o0mmVar.mom(), "", "", "", "");
        on0Var.om = System.currentTimeMillis() + o0mmVar.omm();
        on0Var.oo = o0mmVar.omm();
        o(o0mmVar, on0Var);
    }

    @Override // com.thinkup.core.n.o
    public final void o(final com.thinkup.core.n.m.m mVar) {
        this.on = mVar;
        this.om = SystemClock.elapsedRealtime();
        List<o0mm> list = this.o.mm;
        if (TUSDK.isNetworkLogDebug()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("Start IH Bidding List", o.o(list));
            } catch (Exception unused) {
            }
            omn.o(omn.o, jSONObject.toString(), false);
        }
        if (n.o().m() == null) {
            Iterator<o0mm> it = list.iterator();
            while (it.hasNext()) {
                nm nmVarO = oo0.o(it.next());
                TUBaseAdAdapter tUBaseAdAdapter = nmVarO != null ? nmVarO.o : null;
                if (tUBaseAdAdapter != null) {
                    MediationBidManager bidManager = tUBaseAdAdapter.getBidManager();
                    if (bidManager == null) {
                        break;
                    }
                    n.o().o(bidManager);
                    break;
                }
            }
        }
        MediationBidManager mediationBidManagerM = n.o().m();
        if (mediationBidManagerM == null) {
            Log.i(omn.o, "No BidManager.");
            o((List<o0mm>) null, -9);
        } else {
            mediationBidManagerM.setBidRequestUrl(this.o.nn);
            mediationBidManagerM.startBid(this.o, new MediationBidManager.BidListener() { // from class: com.thinkup.core.n.oo.1
                @Override // com.thinkup.core.api.MediationBidManager.BidListener
                public final void onBidFail(String str) {
                }

                @Override // com.thinkup.core.api.MediationBidManager.BidListener
                public final void onBidStart(o0mm o0mmVar, TUBaseAdAdapter tUBaseAdAdapter2) {
                    com.thinkup.core.n.m.m mVar2 = mVar;
                    if (mVar2 != null) {
                        mVar2.o(o0mmVar, tUBaseAdAdapter2);
                    }
                }

                @Override // com.thinkup.core.api.MediationBidManager.BidListener
                public final void onBidSuccess(List<o0mm> list2) {
                    oo.this.o(list2, -1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(List<o0mm> list, int i2) {
        try {
            if (this.f42408n.get()) {
                return;
            }
            this.f42408n.set(true);
            List<o0mm> arrayList = list == null ? new ArrayList<>() : list;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.om;
            ArrayList arrayList2 = new ArrayList();
            for (o0mm o0mmVar : this.o.mm) {
                Iterator<o0mm> it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        o0mm next = it.next();
                        if (o0mmVar.m0o().equals(next.m0o())) {
                            next.oo(jElapsedRealtime);
                            next.mn(0);
                            on0 on0Var = new on0(true, next.moo(), next.mom(), "", "", "", "");
                            on0Var.om = next.omm() + System.currentTimeMillis();
                            on0Var.oo = next.omm();
                            o(next, on0Var);
                            break;
                        }
                    } else {
                        if (MediationBidManager.NO_BID_TOKEN_ERROR.equals(o0mmVar.mon())) {
                            m(o0mmVar, "No Bid Info.", 0L, -2);
                        } else {
                            m(o0mmVar, "No Bid Info.", jElapsedRealtime, i2);
                        }
                        if (o(o0mmVar, "No Bid Info.", i2)) {
                            arrayList.add(o0mmVar);
                            break;
                        } else {
                            arrayList2.add(o0mmVar);
                            break;
                        }
                    }
                }
            }
            if (TUSDK.isNetworkLogDebug()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("IH Bidding Success List", o.o(arrayList));
                    jSONObject.put("IH Bidding Fail List", o.o(arrayList2));
                } catch (Exception unused) {
                }
                omn.o(this.oo, jSONObject.toString(), false);
            }
            this.f42408n.set(true);
            com.thinkup.core.n.m.m mVar = this.on;
            if (mVar != null) {
                mVar.o(arrayList, arrayList2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
