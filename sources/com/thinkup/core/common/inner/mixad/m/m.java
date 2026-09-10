package com.thinkup.core.common.inner.mixad.m;

import com.thinkup.core.api.ITUBaseAdAdapter;

/* JADX INFO: loaded from: classes6.dex */
public final class m {
    private static com.thinkup.core.common.mn.n.o.o m(ITUBaseAdAdapter iTUBaseAdAdapter, com.thinkup.core.common.mn.o0.o oVar) {
        oo ooVar = null;
        if (iTUBaseAdAdapter == null) {
            return null;
        }
        com.thinkup.core.common.mn.o0.m serverExtraInfo = iTUBaseAdAdapter.getServerExtraInfo();
        if (serverExtraInfo != null) {
            if (oVar != null) {
                oVar.o(serverExtraInfo);
            }
            ooVar = serverExtraInfo.mm() ? new oo() : null;
            if (ooVar != null) {
                ooVar.o(new com.thinkup.core.common.inner.mixad.n.m(oVar));
            }
        }
        return ooVar;
    }

    private static com.thinkup.core.common.mn.n.o.o o(ITUBaseAdAdapter iTUBaseAdAdapter) {
        return o(iTUBaseAdAdapter, null);
    }

    public static com.thinkup.core.common.mn.n.o.o o(ITUBaseAdAdapter iTUBaseAdAdapter, com.thinkup.core.common.mn.o0.o oVar) {
        com.thinkup.core.common.mn.n.o.o ooVar = null;
        if (iTUBaseAdAdapter == null) {
            return null;
        }
        com.thinkup.core.common.mn.o0.m serverExtraInfo = iTUBaseAdAdapter.getServerExtraInfo();
        if (serverExtraInfo != null && serverExtraInfo.mn()) {
            if (oVar != null) {
                oVar.o(serverExtraInfo);
            }
            if (serverExtraInfo.om()) {
                ooVar = new n();
            } else if (serverExtraInfo.on()) {
                ooVar = new on();
            } else if (serverExtraInfo.m0()) {
                ooVar = new o0();
            } else if (serverExtraInfo.mo()) {
                ooVar = new om();
            } else if (serverExtraInfo.mm()) {
                ooVar = new oo();
            }
            if (ooVar != null) {
                if (serverExtraInfo.n0()) {
                    ooVar.o(new com.thinkup.core.common.inner.mixad.n.m(oVar));
                    return ooVar;
                }
                if (serverExtraInfo.no()) {
                    if (ooVar instanceof com.thinkup.core.common.mn.n.o.oo) {
                        ((com.thinkup.core.common.mn.n.o.oo) ooVar).o(new com.thinkup.core.common.inner.mixad.o0.o());
                        return ooVar;
                    }
                    if (ooVar instanceof com.thinkup.core.common.mn.n.o.n) {
                        ((com.thinkup.core.common.mn.n.o.n) ooVar).o(new com.thinkup.core.common.inner.mixad.o0.o());
                        return ooVar;
                    }
                } else if (serverExtraInfo.nm() && (ooVar instanceof com.thinkup.core.common.mn.n.o.om)) {
                    ((com.thinkup.core.common.mn.n.o.om) ooVar).o(new com.thinkup.core.common.inner.mixad.o.o(oVar));
                }
            }
        }
        return ooVar;
    }
}
