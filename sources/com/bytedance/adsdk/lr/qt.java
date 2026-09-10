package com.bytedance.adsdk.lr;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class qt {
    private final String di;
    private final String fi;
    private final String ik;
    private final int[][] jbs;
    private final String ka;
    private final int lr;
    private final String mj;
    private final JSONArray qt;
    private final int ri;
    private Bitmap sf;
    private final List<ri> xha;

    public static class ri {
        public int di;
        public int fi;
        public String ik;
        public String ka;
        public int lr;
        public int ri;
        public String xha;
    }

    public qt(int i, int i2, String str, String str2, String str3, String str4, List<ri> list, String str5, int[][] iArr, JSONArray jSONArray) {
        this.ri = i;
        this.lr = i2;
        this.ik = str;
        this.ka = str2;
        this.fi = str3;
        this.di = str4;
        this.xha = list;
        this.mj = str5;
        this.jbs = iArr;
        this.qt = jSONArray;
    }

    public int[][] di() {
        return this.jbs;
    }

    public String fi() {
        return this.mj;
    }

    public List<ri> ik() {
        return this.xha;
    }

    public String jbs() {
        return this.ka;
    }

    public String ka() {
        return this.di;
    }

    public int lr() {
        return this.lr;
    }

    public String mj() {
        return this.ik;
    }

    public String qt() {
        return this.fi;
    }

    public int ri() {
        return this.ri;
    }

    public Bitmap sf() {
        return this.sf;
    }

    public JSONArray xha() {
        return this.qt;
    }

    public void ri(Bitmap bitmap) {
        this.sf = bitmap;
    }
}
