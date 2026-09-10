package com.bytedance.sdk.component.ebl;

import com.bytedance.sdk.component.LD.Lxb.nBu;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    final long JXs;
    final String LD;
    final int Lxb;
    private final boolean QAg;
    final String ZU;
    nBu ebl;
    final long lc;
    final Map<String, String> lk;
    private File OY = null;
    private byte[] nBu = null;

    public LD(boolean z, int i, String str, Map<String, String> map, String str2, long j, long j2) {
        this.QAg = z;
        this.Lxb = i;
        this.LD = str;
        this.lk = map;
        this.ZU = str2;
        this.JXs = j;
        this.lc = j2;
    }

    public File JXs() {
        return this.OY;
    }

    public String LD() {
        return this.LD;
    }

    public int Lxb() {
        return this.Lxb;
    }

    public String ZU() {
        return this.ZU;
    }

    public nBu ebl() {
        return this.ebl;
    }

    public boolean lc() {
        return this.QAg;
    }

    public Map<String, String> lk() {
        return this.lk;
    }

    public void Lxb(File file) {
        this.OY = file;
    }

    public void Lxb(byte[] bArr) {
        this.nBu = bArr;
    }

    public void Lxb(nBu nbu) {
        this.ebl = nbu;
    }
}
