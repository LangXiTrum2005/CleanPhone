package com.thinkup.core.common.inner.n;

import androidx.media3.extractor.text.ttml.a;
import com.thinkup.core.common.on.oon;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 {
    long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f41826n;
    List<Double> o;
    private int o0;
    private long oo;

    public o0(oon oonVar) {
        this.o0 = 0;
        this.oo = 0L;
        this.f41826n = oonVar.m00();
        this.o0 = oonVar.m0n();
        this.o = oonVar.m0m();
        this.m = oonVar.m0o();
        this.oo = oonVar.om0();
    }

    private long oo() {
        return this.m;
    }

    public final int m() {
        return this.o0;
    }

    public final List<Double> n() {
        return this.o;
    }

    public final int o() {
        return this.f41826n;
    }

    public final long o0() {
        return this.oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShakeSensorSetting{shakeWay=");
        sb.append(this.f41826n);
        sb.append(", shakeStrength=");
        sb.append(this.o0);
        sb.append(", shakeStrengthList=");
        sb.append(this.o);
        sb.append(", shakeDetectDurationTime=");
        sb.append(this.m);
        sb.append(", shakeTimeMs=");
        return a.o(sb, this.oo, AbstractJsonLexerKt.END_OBJ);
    }
}
