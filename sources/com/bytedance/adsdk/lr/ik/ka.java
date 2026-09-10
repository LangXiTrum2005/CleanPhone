package com.bytedance.adsdk.lr.ik;

import com.bytedance.adsdk.lr.ik.lr.slm;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    private final String di;
    private final String fi;
    private final double ik;
    private final double ka;
    private final char lr;
    private final List<slm> ri;

    public ka(List<slm> list, char c, double d, double d2, String str, String str2) {
        this.ri = list;
        this.lr = c;
        this.ik = d;
        this.ka = d2;
        this.fi = str;
        this.di = str2;
    }

    public static int ri(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public int hashCode() {
        return ri(this.lr, this.di, this.fi);
    }

    public double lr() {
        return this.ka;
    }

    public List<slm> ri() {
        return this.ri;
    }
}
