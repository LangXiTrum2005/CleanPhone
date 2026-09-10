package com.thinkup.core.common.no.m.o.n;

import com.thinkup.core.common.no.m.m0o;
import com.thinkup.core.common.no.m.om0;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 extends m0o {
    private final long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.thinkup.core.common.no.n.oo f42027n;
    private final String o;

    public m0(String str, long j, com.thinkup.core.common.no.n.oo ooVar) {
        this.o = str;
        this.m = j;
        this.f42027n = ooVar;
    }

    @Override // com.thinkup.core.common.no.m.m0o
    public final long m() {
        return this.m;
    }

    @Override // com.thinkup.core.common.no.m.m0o
    public final com.thinkup.core.common.no.n.oo n() {
        return this.f42027n;
    }

    @Override // com.thinkup.core.common.no.m.m0o
    public final om0 o() {
        String str = this.o;
        if (str != null) {
            return om0.m(str);
        }
        return null;
    }
}
