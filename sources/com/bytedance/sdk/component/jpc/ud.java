package com.bytedance.sdk.component.jpc;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.bjy;
import com.smartdigimkt.u2.m;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
class ud implements Comparable, Runnable {
    private long lnr;
    private Thread mml = null;
    private jpc qdl;
    private qdl ud;

    public ud(jpc jpcVar, qdl qdlVar) {
        this.lnr = 0L;
        this.qdl = jpcVar;
        this.ud = qdlVar;
        this.lnr = SystemClock.uptimeMillis();
    }

    private void qdl(String str, String str2, long j) {
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof ud) {
            return this.qdl.compareTo(((ud) obj).qdl());
        }
        return 0;
    }

    public boolean equals(Object obj) {
        jpc jpcVar;
        return (obj instanceof ud) && (jpcVar = this.qdl) != null && jpcVar.equals(((ud) obj).qdl());
    }

    public int hashCode() {
        return this.qdl.hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.mml = Thread.currentThread();
        jpc jpcVar = this.qdl;
        if (jpcVar != null) {
            jpcVar.run();
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        if (this.ud != null) {
            mml.qdl();
        }
        if (bjy.qdl()) {
            qdl qdlVar = this.ud;
            if (qdlVar != null) {
                qdlVar.qdl();
            }
            jpc jpcVar2 = this.qdl;
            if (jpcVar2 != null) {
                jpcVar2.getName();
            }
            String strQdl = this.ud.qdl();
            strQdl.getClass();
            String name = AbstractJsonLexerKt.NULL;
            switch (strQdl) {
                case "ad":
                case "init":
                    if (jUptimeMillis2 > 2000) {
                        qdl qdlVar2 = this.ud;
                        String strQdl2 = qdlVar2 != null ? qdlVar2.qdl() : AbstractJsonLexerKt.NULL;
                        jpc jpcVar3 = this.qdl;
                        if (jpcVar3 != null) {
                            name = jpcVar3.getName();
                        }
                        qdl(strQdl2, name, jUptimeMillis2);
                        break;
                    }
                    break;
                case "io":
                    if (jUptimeMillis2 > 5000) {
                        qdl qdlVar3 = this.ud;
                        String strQdl3 = qdlVar3 != null ? qdlVar3.qdl() : AbstractJsonLexerKt.NULL;
                        jpc jpcVar4 = this.qdl;
                        if (jpcVar4 != null) {
                            name = jpcVar4.getName();
                        }
                        qdl(strQdl3, name, jUptimeMillis2);
                        break;
                    }
                    break;
                case "log":
                    if (jUptimeMillis2 > m.D0) {
                        qdl qdlVar4 = this.ud;
                        String strQdl4 = qdlVar4 != null ? qdlVar4.qdl() : AbstractJsonLexerKt.NULL;
                        jpc jpcVar5 = this.qdl;
                        if (jpcVar5 != null) {
                            name = jpcVar5.getName();
                        }
                        qdl(strQdl4, name, jUptimeMillis2);
                        break;
                    }
                    break;
                case "computation":
                    if (jUptimeMillis2 > 1000) {
                        qdl qdlVar5 = this.ud;
                        String strQdl5 = qdlVar5 != null ? qdlVar5.qdl() : AbstractJsonLexerKt.NULL;
                        jpc jpcVar6 = this.qdl;
                        if (jpcVar6 != null) {
                            name = jpcVar6.getName();
                        }
                        qdl(strQdl5, name, jUptimeMillis2);
                        break;
                    }
                    break;
            }
        }
    }

    public jpc qdl() {
        return this.qdl;
    }
}
