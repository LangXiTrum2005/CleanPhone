package com.thinkup.core.basead.o;

import android.util.Log;
import com.thinkup.core.basead.adx.api.ITUAdxHandler;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.om;
import com.thinkup.core.common.on.mnn;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.on.oo0m;
import com.thinkup.core.common.ooo.nn;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class oo implements ITUAdxHandler {
    public static String o = "tpn_thinkup_adx_handler";
    private on0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o0mm f41805n;
    private n0 o0;
    private boolean om;
    private boolean oo;

    /* JADX INFO: renamed from: com.thinkup.core.basead.o.oo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] o;

        static {
            int[] iArr = new int[ITUAdxHandler.LOSS_REASON.values().length];
            o = iArr;
            try {
                iArr[ITUAdxHandler.LOSS_REASON.LOSS_TO_AUCTION_FLOOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                o[ITUAdxHandler.LOSS_REASON.LOSS_TO_HIGHER_BID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                o[ITUAdxHandler.LOSS_REASON.LOSS_TO_NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public oo(on0 on0Var, o0mm o0mmVar, n0 n0Var) {
        this.m = on0Var;
        this.f41805n = o0mmVar;
        this.o0 = n0Var;
    }

    @Override // com.thinkup.core.basead.adx.api.ITUAdxHandler
    public final synchronized void destroy() {
        if (this.om) {
            Log.e(o, "destroy: has call destroy(), do nothing");
            return;
        }
        this.om = true;
        Log.i(o, "destroy, placementId: " + this.o0.oomn() + ", adSourceId: " + this.f41805n.m0o());
        try {
            com.thinkup.core.common.o.o().o(this.o0.oomn(), this.f41805n, this.o0.oon0());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.thinkup.core.basead.adx.api.ITUAdxHandler
    public final synchronized void notifyLose(ITUAdxHandler.LOSS_REASON loss_reason, double d, Map<String, Object> map) {
        String str;
        if (this.oo) {
            Log.e(o, "notifyWin: win or loss has been sent, do anything");
            return;
        }
        this.oo = true;
        if (this.m != null && this.f41805n != null) {
            if (d <= 0.0d) {
                Log.e(o, "notifyLose, winnerPrice: " + d + " <= 0, do nothing");
                return;
            }
            Log.i(o, "notifyLose, lossCode: " + loss_reason + ", winnerPrice: " + d + ", extraMap: " + map);
            try {
                int i2 = AnonymousClass1.o[loss_reason.ordinal()];
                if (i2 != 1) {
                    str = i2 != 2 ? "103" : "102";
                } else {
                    str = "100";
                }
                on0 on0Var = this.m;
                mnn mnnVar = new mnn(2, this.f41805n, this.o0);
                String string = "";
                if (map != null) {
                    Object obj = map.get("bidding_name");
                    string = obj instanceof String ? obj.toString() : "";
                    Object obj2 = map.get("waterfall_info");
                    if (obj2 instanceof String) {
                        com.thinkup.core.common.o0.o().o(this.o0.oomn(), (String) obj2);
                    }
                }
                try {
                    if (loss_reason == ITUAdxHandler.LOSS_REASON.LOSS_TO_AUCTION_FLOOR) {
                        string = "";
                        om omVarO = om.o(o0n.m().on(), this.o0.oomn(), this.o0.oono());
                        if (omVarO != null) {
                            omVarO.o0();
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                mnnVar.o(d, string, str);
                com.thinkup.core.n.o0.n.o(on0Var, mnnVar, false, 28);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007b A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:17:0x002d, B:19:0x0036, B:27:0x0052, B:29:0x005c, B:30:0x0060, B:32:0x006a, B:24:0x004c, B:34:0x007b, B:35:0x0085, B:37:0x0089, B:38:0x008c, B:21:0x003e), top: B:48:0x002d, outer: #2, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0089 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:17:0x002d, B:19:0x0036, B:27:0x0052, B:29:0x005c, B:30:0x0060, B:32:0x006a, B:24:0x004c, B:34:0x007b, B:35:0x0085, B:37:0x0089, B:38:0x008c, B:21:0x003e), top: B:48:0x002d, outer: #2, inners: #1 }] */
    @Override // com.thinkup.core.basead.adx.api.ITUAdxHandler
    public final synchronized void notifyWin(Map<String, Object> map) {
        oo0m oo0mVar;
        if (this.oo) {
            Log.e(o, "notifyWin: win or loss has been sent, do anything");
            return;
        }
        this.oo = true;
        if (this.m != null && this.f41805n != null) {
            Log.i(o, "notifyWin, extraMap: ".concat(String.valueOf(map)));
            try {
                on0 on0Var = this.m;
                o0mm o0mmVar = this.f41805n;
                String string = "";
                Double dValueOf = null;
                if (map == null) {
                    if (dValueOf == null) {
                        dValueOf = Double.valueOf(nn.o(o0mmVar));
                        string = "TopOn";
                    }
                    oo0mVar = on0Var.oom;
                    if (oo0mVar != null) {
                        oo0mVar.o(dValueOf, string);
                    }
                    com.thinkup.core.n.o0.n.o(on0Var, o0mmVar, 4);
                    return;
                }
                Object obj = map.get("second_price");
                if (obj != null) {
                    try {
                        dValueOf = Double.valueOf(Double.parseDouble(obj.toString()));
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                Object obj2 = map.get("bidding_name");
                string = obj2 instanceof String ? obj2.toString() : "";
                Object obj3 = map.get("waterfall_info");
                if (obj3 instanceof String) {
                    com.thinkup.core.common.o0.o().o(this.o0.oomn(), (String) obj3);
                }
                if (dValueOf == null) {
                    dValueOf = Double.valueOf(nn.o(o0mmVar));
                    string = "TopOn";
                }
                oo0mVar = on0Var.oom;
                if (oo0mVar != null) {
                    oo0mVar.o(dValueOf, string);
                }
                com.thinkup.core.n.o0.n.o(on0Var, o0mmVar, 4);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                return;
            }
            throw th;
        }
    }
}
