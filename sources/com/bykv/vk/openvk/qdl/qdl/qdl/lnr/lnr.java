package com.bykv.vk.openvk.qdl.qdl.qdl.lnr;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class lnr implements Serializable {
    private int aaj;
    private int bjy;
    private boolean exc;
    private String exu;
    private boolean jl;
    private String jpc;
    private String jtx;
    private int jyq;
    public int lnr;
    private ud mo;
    private int rdp;
    private boolean tvp;
    public String ud;
    private ud wd;
    private int xmv;
    private long yt;
    private int to = 204800;
    private int rq = 0;
    private int fs = 0;
    protected float qdl = -1.0f;
    public final HashMap<String, Object> mml = new HashMap<>();
    private int oth = 10000;
    private int ljh = 10000;
    private int bch = 10000;
    private int uw = 0;
    public int mzz = 1;
    private JSONObject bqt = new JSONObject();

    public lnr(String str, ud udVar, ud udVar2, int i2, int i3) {
        this.aaj = 0;
        this.jyq = 0;
        this.jpc = str;
        this.mo = udVar;
        this.wd = udVar2;
        this.aaj = i2;
        this.jyq = i3;
    }

    public int aaj() {
        return this.ljh;
    }

    public ud bch() {
        return this.wd;
    }

    public float bjy() {
        float f = this.qdl;
        if (f != -1.0f) {
            return f;
        }
        if (rdp()) {
            return this.wd.jpc();
        }
        ud udVar = this.mo;
        if (udVar != null) {
            return udVar.jpc();
        }
        return -1.0f;
    }

    public int exc() {
        return this.oth;
    }

    public boolean exu() {
        if (rdp()) {
            return this.wd.jyq();
        }
        ud udVar = this.mo;
        if (udVar != null) {
            return udVar.jyq();
        }
        return true;
    }

    public long fs() {
        if (rdp()) {
            return this.wd.mzz();
        }
        ud udVar = this.mo;
        if (udVar != null) {
            return udVar.mzz();
        }
        return 0L;
    }

    public int jl() {
        return this.aaj;
    }

    public int jpc() {
        return this.rdp;
    }

    public String jtx() {
        if (rdp()) {
            return this.wd.rq();
        }
        ud udVar = this.mo;
        if (udVar != null) {
            return udVar.rq();
        }
        return null;
    }

    public int jyq() {
        return this.bch;
    }

    public ud ljh() {
        return this.mo;
    }

    public JSONObject lnr() {
        return this.bqt;
    }

    public int mml() {
        return this.bqt.optInt("pitaya_cache_size", 0);
    }

    public int mo() {
        if (rdp()) {
            return this.wd.bjy();
        }
        ud udVar = this.mo;
        if (udVar != null) {
            return udVar.bjy();
        }
        return 0;
    }

    public String mzz() {
        return this.jpc;
    }

    public int oth() {
        return this.uw;
    }

    public void qdl(int i2) {
        this.xmv = i2;
    }

    public boolean rdp() {
        ud udVar;
        if (this.jyq != 1 || (udVar = this.wd) == null || TextUtils.isEmpty(udVar.rq())) {
            return false;
        }
        if (com.bykv.vk.openvk.qdl.qdl.qdl.lnr.mo() == 2) {
            return Build.VERSION.SDK_INT >= 26;
        }
        return this.aaj == 1;
    }

    public boolean rq() {
        return this.jl;
    }

    public long to() {
        return this.yt;
    }

    public int tvp() {
        return this.bjy;
    }

    public boolean ud() {
        return this.xmv == 2;
    }

    public boolean uw() {
        return this.tvp;
    }

    public boolean wd() {
        return this.exc;
    }

    public String yt() {
        if (rdp()) {
            return this.wd.rdp();
        }
        ud udVar = this.mo;
        if (udVar != null) {
            return udVar.rdp();
        }
        return null;
    }

    public void jpc(int i2) {
        this.uw = i2;
    }

    public void lnr(int i2) {
        this.bjy = i2;
    }

    public void mml(String str) {
        this.ud = str;
    }

    public synchronized Object mzz(String str) {
        return this.mml.get(str);
    }

    public boolean qdl() {
        int i2 = this.xmv;
        return i2 == 1 || i2 == 2;
    }

    public void ud(String str) {
        this.exu = str;
    }

    public void wd(int i2) {
        this.bch = i2;
    }

    public void lnr(String str) {
        this.jtx = str;
    }

    public void mml(int i2) {
        this.lnr = i2;
    }

    public void mzz(int i2) {
        this.oth = i2;
    }

    public void qdl(String str) {
        this.jpc = str;
    }

    public void ud(int i2) {
        this.rdp = i2;
    }

    public void qdl(long j) {
        this.yt = j;
    }

    public void ud(boolean z2) {
        this.tvp = z2;
    }

    public void mo(int i2) {
        this.ljh = i2;
    }

    public void qdl(boolean z2) {
        this.jl = z2;
    }

    public synchronized void qdl(String str, Object obj) {
        this.mml.put(str, obj);
    }
}
