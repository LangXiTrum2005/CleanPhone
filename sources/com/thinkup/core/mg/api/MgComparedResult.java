package com.thinkup.core.mg.api;

import androidx.media3.extractor.text.ttml.a;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.ooo.nn;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class MgComparedResult {
    private long cpCostTime;
    private double cpPrice;
    private boolean isCompared;
    private boolean isCpTimeout;
    private final boolean isMgWin;
    private final MgAdInfo mgAdInfo;

    private MgComparedResult(boolean z2) {
        this(z2, null);
    }

    public static MgComparedResult create() {
        return create(null, null, 0L, false);
    }

    public long getCpCostTime() {
        return this.cpCostTime;
    }

    public double getCpPrice() {
        return this.cpPrice;
    }

    public MgAdInfo getMgAdInfo() {
        return this.mgAdInfo;
    }

    public boolean isCompared() {
        return this.isCompared;
    }

    public boolean isCpTimeout() {
        return this.isCpTimeout;
    }

    public boolean isMgWin() {
        return this.isMgWin;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MgComparedResult{isMgWin=");
        sb.append(this.isMgWin);
        sb.append(", mgAdInfo=");
        sb.append(this.mgAdInfo);
        sb.append(", cpCostTime=");
        return a.o(sb, this.cpCostTime, AbstractJsonLexerKt.END_OBJ);
    }

    private MgComparedResult(boolean z2, MgAdInfo mgAdInfo) {
        this.isMgWin = z2;
        this.mgAdInfo = mgAdInfo;
    }

    public static MgComparedResult create(o0mm o0mmVar, MgAdInfo mgAdInfo, long j, boolean z2) {
        try {
            double dO = nn.o(o0mmVar);
            boolean z3 = (mgAdInfo != null ? mgAdInfo.getUSDEcpm() : 0.0d) > dO;
            if (o0mmVar != null && o0mmVar.m000()) {
                z3 = false;
            }
            if (mgAdInfo != null) {
                mgAdInfo.getCurrency();
            }
            MgComparedResult mgComparedResult = new MgComparedResult(z3, mgAdInfo);
            mgComparedResult.isCompared = MgAdInfo.isMgAdInfoValid(mgAdInfo);
            mgComparedResult.cpCostTime = j;
            mgComparedResult.isCpTimeout = z2;
            mgComparedResult.cpPrice = dO;
            return mgComparedResult;
        } catch (Throwable th) {
            th.getMessage();
            return new MgComparedResult(false);
        }
    }
}
