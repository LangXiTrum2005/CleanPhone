package com.bytedance.sdk.component.lnr.qdl;

import android.os.SystemClock;
import androidx.media3.extractor.text.ttml.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    long jpc;
    long lnr;
    long mml;
    long mo;
    long mzz;
    long qdl = SystemClock.elapsedRealtime();
    long ud;
    long wd;

    public void bjy() {
        this.ud = SystemClock.elapsedRealtime();
    }

    public void exu() {
        this.jpc = SystemClock.elapsedRealtime();
    }

    public long fs() {
        return this.jpc;
    }

    public long jpc() {
        return this.mml;
    }

    public void lnr() {
        this.mzz = SystemClock.elapsedRealtime();
    }

    public long mml() {
        return this.qdl;
    }

    public long mo() {
        return this.mo;
    }

    public void mzz() {
        this.mo = SystemClock.elapsedRealtime();
    }

    public void qdl() {
        this.lnr = SystemClock.elapsedRealtime();
    }

    public long rdp() {
        return this.ud;
    }

    public void rq() {
        this.wd = SystemClock.elapsedRealtime();
    }

    public long to() {
        return this.wd;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RequestHttpTime{requestBuildTs=");
        sb.append(this.qdl);
        sb.append(", asyncCallExecTs=");
        sb.append(this.ud);
        sb.append(", requestStartExecTs=");
        sb.append(this.lnr);
        sb.append(", requestConnectStartTs=");
        sb.append(this.mml);
        sb.append(", requestConnectFinishTs=");
        sb.append(this.mzz);
        sb.append(", reqCallServerStartTs=");
        sb.append(this.wd);
        sb.append(", reqCallServerFinishTs=");
        return a.o(sb, this.jpc, AbstractJsonLexerKt.END_OBJ);
    }

    public long tvp() {
        return this.mzz;
    }

    public void ud() {
        this.mml = SystemClock.elapsedRealtime();
    }

    public long wd() {
        return this.lnr;
    }
}
