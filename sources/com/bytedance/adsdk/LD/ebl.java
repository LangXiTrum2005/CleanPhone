package com.bytedance.adsdk.LD;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class ebl {
    private float JVA;
    private Map<String, com.bytedance.adsdk.LD.lk.lk> JXs;
    private float NXR;
    private LongSparseArray<com.bytedance.adsdk.LD.lk.lk.JXs> OY;
    private List<com.bytedance.adsdk.LD.lk.lk.JXs> QAg;
    private boolean STP;
    private lk VVE;
    private Map<String, nBu> ZU;
    private Lxb brP;
    private SparseArray<com.bytedance.adsdk.LD.lk.ZU> ebl;
    private List<com.bytedance.adsdk.LD.lk.lc> lc;
    private Map<String, List<com.bytedance.adsdk.LD.lk.lk.JXs>> lk;
    private Rect nBu;
    private float sLN;
    private LD tD;
    private final brP Lxb = new brP();
    private final HashSet<String> LD = new HashSet<>();
    private int IeN = 0;
    private String kqm = "";

    public static class LD {
        public int[][] LD;
        public String Lxb;
        public JSONArray lk;
    }

    public static class Lxb {
        public int JXs;
        public Map<String, Object> LD;
        public int Lxb;
        public int ZU;
        public JSONArray ebl;
        public String lc;
        public Map<String, Object> lk;
    }

    public static class lk {
        public int[] JXs;
        public String LD;
        public int Lxb;
        public String ZU;
        public JSONArray ebl;
        public String lc;
        public String lk;
    }

    public Map<String, com.bytedance.adsdk.LD.lk.lk> IeN() {
        return this.JXs;
    }

    public Lxb JVA() {
        return this.brP;
    }

    public float JXs() {
        return (long) ((kqm() / this.NXR) * 1000.0f);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int LD() {
        return this.IeN;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void Lxb(Rect rect, float f, float f2, float f3, List<com.bytedance.adsdk.LD.lk.lk.JXs> list, LongSparseArray<com.bytedance.adsdk.LD.lk.lk.JXs> longSparseArray, Map<String, List<com.bytedance.adsdk.LD.lk.lk.JXs>> map, Map<String, nBu> map2, SparseArray<com.bytedance.adsdk.LD.lk.ZU> sparseArray, Map<String, com.bytedance.adsdk.LD.lk.lk> map3, List<com.bytedance.adsdk.LD.lk.lc> list2, lk lkVar, String str, Lxb lxb, LD ld) {
        this.nBu = rect;
        this.JVA = f;
        this.sLN = f2;
        this.NXR = f3;
        this.QAg = list;
        this.OY = longSparseArray;
        this.lk = map;
        this.ZU = map2;
        this.ebl = sparseArray;
        this.JXs = map3;
        this.lc = list2;
        this.VVE = lkVar;
        this.kqm = str;
        this.brP = lxb;
        this.tD = ld;
    }

    public List<com.bytedance.adsdk.LD.lk.lk.JXs> NXR() {
        return this.QAg;
    }

    public lk OY() {
        return this.VVE;
    }

    public String QAg() {
        return this.kqm;
    }

    public SparseArray<com.bytedance.adsdk.LD.lk.ZU> STP() {
        return this.ebl;
    }

    public Map<String, nBu> VVE() {
        return this.ZU;
    }

    public Rect ZU() {
        return this.nBu;
    }

    public float ebl() {
        return this.sLN;
    }

    public float kqm() {
        return this.sLN - this.JVA;
    }

    public float lc() {
        return this.JVA;
    }

    public brP lk() {
        return this.Lxb;
    }

    public LD nBu() {
        return this.tD;
    }

    public float sLN() {
        return this.NXR;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.LD.lk.lk.JXs> it = this.QAg.iterator();
        while (it.hasNext()) {
            sb.append(it.next().Lxb("\t"));
        }
        return sb.toString();
    }

    public void LD(boolean z) {
        this.Lxb.Lxb(z);
    }

    public com.bytedance.adsdk.LD.lk.lc lk(String str) {
        int size = this.lc.size();
        for (int i = 0; i < size; i++) {
            com.bytedance.adsdk.LD.lk.lc lcVar = this.lc.get(i);
            if (lcVar.Lxb(str)) {
                return lcVar;
            }
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<com.bytedance.adsdk.LD.lk.lk.JXs> LD(String str) {
        return this.lk.get(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void Lxb(String str) {
        this.LD.add(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void Lxb(boolean z) {
        this.STP = z;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void Lxb(int i) {
        this.IeN += i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean Lxb() {
        return this.STP;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public com.bytedance.adsdk.LD.lk.lk.JXs Lxb(long j) {
        return this.OY.get(j);
    }

    public float Lxb(float f) {
        return com.bytedance.adsdk.LD.lc.JXs.Lxb(this.JVA, this.sLN, f);
    }
}
