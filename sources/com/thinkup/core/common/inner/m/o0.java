package com.thinkup.core.common.inner.m;

import com.thinkup.core.common.on.oom;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 {
    public String m;
    public int m0;
    public Map<String, Object> mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f41811n;
    public oom o;
    public String o0;
    public int om;
    public int on;
    public int oo;

    private o0(String str, String str2) {
        this.m = str;
        this.f41811n = str2;
    }

    private o0(oom oomVar, String str) {
        if (oomVar != null) {
            this.o = oomVar;
            this.m = oomVar.om;
            this.f41811n = oomVar.o;
        }
        this.o0 = str;
    }
}
