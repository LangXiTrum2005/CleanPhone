package com.bytedance.sdk.component.di.ri.di;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    private final String di;
    private final int fi;
    private final boolean ik;
    private final String lr;
    private String mj;
    private final String ri;
    private boolean sf;
    private String xha;
    private int ka = -1;
    private int jbs = 0;
    private String qt = null;

    public ka(String str, String str2, boolean z, int i, String str3) {
        this.ri = str;
        this.lr = str2;
        this.ik = z;
        this.fi = i;
        this.di = str3;
    }

    public String di() {
        return this.di;
    }

    public int fi() {
        return this.fi;
    }

    public boolean ik() {
        return this.ik;
    }

    public String jbs() {
        return this.mj;
    }

    public int ka() {
        return this.ka;
    }

    public String lr() {
        return this.lr;
    }

    public int mj() {
        return this.jbs;
    }

    public boolean qt() {
        return this.sf;
    }

    public String ri() {
        return this.ri;
    }

    public boolean sf() {
        return this.ka == -1;
    }

    public String xha() {
        return this.xha;
    }

    public void ik(String str) {
        this.qt = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.mj)) {
            this.mj = String.valueOf(this.qt);
            return;
        }
        this.mj += "," + this.qt;
    }

    public void lr(int i) {
        this.jbs = i;
        if (i == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.xha)) {
            this.xha = String.valueOf(this.jbs);
            return;
        }
        this.xha += "," + this.jbs;
    }

    public void ri(int i) {
        this.ka = i;
    }

    public void ri(String str) {
        this.xha = str;
    }

    public void ri(boolean z) {
        this.sf = z;
    }

    public Runnable ri(String str, Map<String, String> map) {
        return ri.ri().ri(this, str, map);
    }

    public void lr(String str) {
        this.mj = str;
    }
}
