package com.bytedance.sdk.component.wd;

import com.bytedance.sdk.component.ud.qdl.to;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ud {
    final Map<String, String> lnr;
    final String mml;
    final long mo;
    final long mzz;
    final int qdl;
    private final boolean tvp;
    final String ud;
    to wd;
    private File jpc = null;
    private byte[] to = null;

    public ud(boolean z2, int i2, String str, Map<String, String> map, String str2, long j, long j2) {
        this.tvp = z2;
        this.qdl = i2;
        this.ud = str;
        this.lnr = map;
        this.mml = str2;
        this.mzz = j;
        this.mo = j2;
    }

    public Map<String, String> lnr() {
        return this.lnr;
    }

    public String mml() {
        return this.mml;
    }

    public boolean mo() {
        return this.tvp;
    }

    public File mzz() {
        return this.jpc;
    }

    public int qdl() {
        return this.qdl;
    }

    public String ud() {
        return this.ud;
    }

    public to wd() {
        return this.wd;
    }

    public void qdl(File file) {
        this.jpc = file;
    }

    public void qdl(byte[] bArr) {
        this.to = bArr;
    }

    public void qdl(to toVar) {
        this.wd = toVar;
    }
}
