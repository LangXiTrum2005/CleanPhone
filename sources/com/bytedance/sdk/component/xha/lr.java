package com.bytedance.sdk.component.xha;

import com.bytedance.sdk.component.lr.ri.qt;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    final long di;
    final long fi;
    final Map<String, String> ik;
    private final boolean jbs;
    final String ka;
    final String lr;
    private File mj = null;
    private byte[] qt = null;
    final int ri;
    qt xha;

    public lr(boolean z, int i, String str, Map<String, String> map, String str2, long j, long j2) {
        this.jbs = z;
        this.ri = i;
        this.lr = str;
        this.ik = map;
        this.ka = str2;
        this.fi = j;
        this.di = j2;
    }

    public boolean di() {
        return this.jbs;
    }

    public File fi() {
        return this.mj;
    }

    public Map<String, String> ik() {
        return this.ik;
    }

    public String ka() {
        return this.ka;
    }

    public String lr() {
        return this.lr;
    }

    public int ri() {
        return this.ri;
    }

    public qt xha() {
        return this.xha;
    }

    public void ri(File file) {
        this.mj = file;
    }

    public void ri(byte[] bArr) {
        this.qt = bArr;
    }

    public void ri(qt qtVar) {
        this.xha = qtVar;
    }
}
