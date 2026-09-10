package com.bykv.vk.openvk.ri.ri.ri.ik;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik implements Serializable {
    private boolean ac;
    private String bgr;
    private String bu;
    private attabal di;
    private int igq;
    private int ihz;
    public int ik;
    private boolean jbs;
    public String lr;
    private String mj;
    private long nr;
    private boolean qt;
    private int slm;
    private boolean tan;
    private int uq;
    private int vr;
    private attabal xha;
    private int sf = 204800;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private int f17983co = 0;
    private int aw = 0;
    protected float ri = -1.0f;
    public final HashMap<String, Object> ka = new HashMap<>();
    private int wjv = 10000;
    private int ay = 10000;
    private int fr = 10000;
    private int su = 0;
    public int fi = 1;
    private JSONObject zf = new JSONObject();

    public ik(String str, attabal attabalVar, attabal attabalVar2, int i, int i2) {
        this.ihz = 0;
        this.uq = 0;
        this.mj = str;
        this.di = attabalVar;
        this.xha = attabalVar2;
        this.ihz = i;
        this.uq = i2;
    }

    public int ac() {
        return this.ay;
    }

    public boolean aw() {
        if (bgr()) {
            return this.xha.formularize();
        }
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            return attabalVar.formularize();
        }
        return true;
    }

    public attabal ay() {
        return this.xha;
    }

    public boolean bgr() {
        attabal attabalVar;
        if (this.uq != 1 || (attabalVar = this.xha) == null || TextUtils.isEmpty(attabalVar.supplicat())) {
            return false;
        }
        if (logician.attabal.attabal() == 2) {
            return Build.VERSION.SDK_INT >= 26;
        }
        return this.ihz == 1;
    }

    public String bu() {
        if (bgr()) {
            return this.xha.dern();
        }
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            return attabalVar.dern();
        }
        return null;
    }

    public long co() {
        if (bgr()) {
            return this.xha.taiyuan();
        }
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            return attabalVar.taiyuan();
        }
        return 0L;
    }

    public int di() {
        if (bgr()) {
            return this.xha.seminary();
        }
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            return attabalVar.seminary();
        }
        return 0;
    }

    public String fi() {
        return this.mj;
    }

    public boolean fr() {
        return this.jbs;
    }

    public int ihz() {
        return this.fr;
    }

    public JSONObject ik() {
        return this.zf;
    }

    public int jbs() {
        return this.slm;
    }

    public int ka() {
        return this.zf.optInt("pitaya_cache_size", 0);
    }

    public boolean lr() {
        return this.igq == 2;
    }

    public int mj() {
        return this.vr;
    }

    public int nr() {
        return this.ihz;
    }

    public long qt() {
        return this.nr;
    }

    public void ri(int i) {
        this.igq = i;
    }

    public boolean sf() {
        return this.tan;
    }

    public String slm() {
        if (bgr()) {
            return this.xha.supplicat();
        }
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            return attabalVar.supplicat();
        }
        return null;
    }

    public boolean su() {
        return this.qt;
    }

    public int tan() {
        return this.wjv;
    }

    public int uq() {
        return this.su;
    }

    public float vr() {
        float f = this.ri;
        if (f != -1.0f) {
            return f;
        }
        if (bgr()) {
            return this.xha.rotuma();
        }
        attabal attabalVar = this.di;
        if (attabalVar != null) {
            return attabalVar.rotuma();
        }
        return -1.0f;
    }

    public attabal wjv() {
        return this.di;
    }

    public boolean xha() {
        return this.ac;
    }

    public synchronized Object fi(String str) {
        return this.ka.get(str);
    }

    public void ik(int i) {
        this.slm = i;
    }

    public void ka(String str) {
        this.lr = str;
    }

    public void lr(String str) {
        this.bgr = str;
    }

    public void mj(int i) {
        this.su = i;
    }

    public boolean ri() {
        int i = this.igq;
        return i == 1 || i == 2;
    }

    public void xha(int i) {
        this.fr = i;
    }

    public void fi(int i) {
        this.wjv = i;
    }

    public void ik(String str) {
        this.bu = str;
    }

    public void ka(int i) {
        this.ik = i;
    }

    public void lr(int i) {
        this.vr = i;
    }

    public void ri(String str) {
        this.mj = str;
    }

    public void ik(boolean z) {
        this.qt = z;
    }

    public void lr(boolean z) {
        this.jbs = z;
    }

    public void ri(long j) {
        this.nr = j;
    }

    public void di(int i) {
        this.ay = i;
    }

    public void ri(boolean z) {
        this.tan = z;
    }

    public synchronized void ri(String str, Object obj) {
        this.ka.put(str, obj);
    }
}
