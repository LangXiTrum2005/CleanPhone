package com.thinkup.core.common.n0;

import android.content.Context;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.oo0m;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class mo extends o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f41945n = 1;
    int m;
    boolean n0;
    private oo0m no;
    String o;

    private mo(String str) {
        this.m = 0;
        this.n0 = false;
        this.o = str;
    }

    public static mo m(String str) {
        return new mo(str);
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, Object> m0() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String mn() {
        return "";
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, String> n() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final void n0() {
    }

    @Override // com.thinkup.core.common.n0.o
    public final int o() {
        return 2;
    }

    @Override // com.thinkup.core.common.n0.o
    public final byte[] o0() {
        return new byte[0];
    }

    @Override // com.thinkup.core.common.n0.o
    public final Context om() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String on() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String oo() {
        return null;
    }

    public static mo o(String str, oo0m oo0mVar) {
        return new mo(str, oo0mVar);
    }

    @Override // com.thinkup.core.common.n0.o
    public final String m() {
        return this.o;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Object o(Object obj) {
        oo0m oo0mVar;
        if (1 != this.m || (oo0mVar = this.no) == null) {
            return null;
        }
        oo0mVar.o("200");
        com.thinkup.core.common.ooo.o0.o().o(this.no.omo(), this.no.omm(), com.thinkup.core.common.ooo.o0.f42341n, "0");
        com.thinkup.core.n.o0.n.o(this.no);
        return null;
    }

    private mo(String str, oo0m oo0mVar) {
        this(str);
        this.m = 1;
        this.no = oo0mVar;
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(AdError adError) {
        oo0m oo0mVar;
        if (1 != this.m || (oo0mVar = this.no) == null) {
            return;
        }
        int iMn = oo0mVar.mn();
        com.thinkup.core.common.on.n0 n0VarOmo = this.no.omo();
        o0mm o0mmVarOmm = this.no.omm();
        if (iMn == 50 && com.thinkup.core.common.ooo.o0.o().o(n0VarOmo, o0mmVarOmm) && !this.n0) {
            this.n0 = true;
            com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.common.n0.mo.1
                @Override // java.lang.Runnable
                public final void run() {
                    mo moVar = mo.this;
                    moVar.o(0, moVar.mo);
                }
            }, com.smartdigimkt.u2.m.D0);
        } else {
            this.no.o(adError.getPlatformCode());
            this.no.m(adError.getPlatformMSG());
            com.thinkup.core.common.ooo.o0.o().o(n0VarOmo, o0mmVarOmm, com.thinkup.core.common.ooo.o0.f42341n, "1");
            com.thinkup.core.n.o0.n.o(this.no);
        }
    }
}
