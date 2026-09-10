package com.thinkup.core.common.res.image;

import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.ooo.nm;
import com.thinkup.core.common.res.o0;
import com.thinkup.core.common.res.oo;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends m {
    InterfaceC0691o m;
    oo o;

    /* JADX INFO: renamed from: com.thinkup.core.common.res.image.o$o, reason: collision with other inner class name */
    public interface InterfaceC0691o {
        void o(oo ooVar);

        void o(oo ooVar, String str);
    }

    public o(oo ooVar) {
        super(ooVar.m0);
        this.o = ooVar;
    }

    @Override // com.thinkup.core.common.res.image.m
    public final void m() {
    }

    @Override // com.thinkup.core.common.res.image.m
    public final void n() {
        InterfaceC0691o interfaceC0691o = this.m;
        if (interfaceC0691o != null) {
            interfaceC0691o.o(this.o);
        }
    }

    @Override // com.thinkup.core.common.res.image.m
    public final Map<String, String> o() {
        return null;
    }

    public final void o(InterfaceC0691o interfaceC0691o) {
        this.m = interfaceC0691o;
    }

    @Override // com.thinkup.core.common.res.image.m
    public final boolean o(InputStream inputStream) {
        o0 o0VarO = o0.o(o0n.m().on());
        oo ooVar = this.o;
        return o0VarO.o(ooVar.on, nm.o(ooVar.m0), inputStream);
    }

    @Override // com.thinkup.core.common.res.image.m
    public final void o(com.thinkup.core.common.ooo.m.o0 o0Var) {
        com.thinkup.core.common.ooo.m.m.o().o(o0Var, 4);
    }

    @Override // com.thinkup.core.common.res.image.m
    public final void o(String str, String str2) {
        InterfaceC0691o interfaceC0691o = this.m;
        if (interfaceC0691o != null) {
            interfaceC0691o.o(this.o, str2);
        }
    }
}
