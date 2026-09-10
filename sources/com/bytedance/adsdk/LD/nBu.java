package com.bytedance.adsdk.LD;

import android.graphics.Bitmap;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class nBu {
    private Bitmap JVA;
    private final String JXs;
    private final int LD;
    private final int Lxb;
    private final String OY;
    private final int[][] QAg;
    private final String ZU;
    private final List<Lxb> ebl;
    private final String lc;
    private final String lk;
    private final JSONArray nBu;

    public static class Lxb {
        public int JXs;
        public int LD;
        public int Lxb;
        public String ZU;
        public String ebl;
        public int lc;
        public String lk;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public nBu(int i, int i2, String str, String str2, String str3, String str4, List<Lxb> list, String str5, int[][] iArr, JSONArray jSONArray) {
        this.Lxb = i;
        this.LD = i2;
        this.lk = str;
        this.ZU = str2;
        this.JXs = str3;
        this.lc = str4;
        this.ebl = list;
        this.OY = str5;
        this.QAg = iArr;
        this.nBu = jSONArray;
    }

    public Bitmap JVA() {
        return this.JVA;
    }

    public String JXs() {
        return this.OY;
    }

    public int LD() {
        return this.LD;
    }

    public int Lxb() {
        return this.Lxb;
    }

    public String OY() {
        return this.lk;
    }

    public String QAg() {
        return this.ZU;
    }

    public String ZU() {
        return this.lc;
    }

    public JSONArray ebl() {
        return this.nBu;
    }

    public int[][] lc() {
        return this.QAg;
    }

    public List<Lxb> lk() {
        return this.ebl;
    }

    public String nBu() {
        return this.JXs;
    }

    public void Lxb(Bitmap bitmap) {
        this.JVA = bitmap;
    }
}
