package com.bytedance.adsdk.ud;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class wd {
    private ud exc;
    private float exu;
    private float fs;
    private qdl jl;
    private LongSparseArray<com.bytedance.adsdk.ud.lnr.lnr.mzz> jpc;
    private lnr jtx;
    private Map<String, List<com.bytedance.adsdk.ud.lnr.lnr.mzz>> lnr;
    private Map<String, to> mml;
    private List<com.bytedance.adsdk.ud.lnr.mo> mo;
    private Map<String, com.bytedance.adsdk.ud.lnr.lnr> mzz;
    private boolean rdp;
    private float rq;
    private Rect to;
    private List<com.bytedance.adsdk.ud.lnr.lnr.mzz> tvp;
    private SparseArray<com.bytedance.adsdk.ud.lnr.mml> wd;
    private final jl qdl = new jl();
    private final HashSet<String> ud = new HashSet<>();
    private int bjy = 0;
    private String yt = "";

    public static class lnr {
        public String lnr;
        public String mml;
        public String mo;
        public int[] mzz;
        public int qdl;
        public String ud;
        public JSONArray wd;
    }

    public static class qdl {
        public Map<String, Object> lnr;
        public int mml;
        public String mo;
        public int mzz;
        public int qdl;
        public Map<String, Object> ud;
        public JSONArray wd;
    }

    public static class ud {
        public JSONArray lnr;
        public String qdl;
        public int[][] ud;
    }

    public Map<String, com.bytedance.adsdk.ud.lnr.lnr> bjy() {
        return this.mzz;
    }

    public List<com.bytedance.adsdk.ud.lnr.lnr.mzz> exu() {
        return this.tvp;
    }

    public float fs() {
        return this.exu;
    }

    public lnr jpc() {
        return this.jtx;
    }

    public Map<String, to> jtx() {
        return this.mml;
    }

    public jl lnr() {
        return this.qdl;
    }

    public Rect mml() {
        return this.to;
    }

    public float mo() {
        return this.rq;
    }

    public float mzz() {
        return (long) ((yt() / this.exu) * 1000.0f);
    }

    public void qdl(Rect rect, float f, float f2, float f3, List<com.bytedance.adsdk.ud.lnr.lnr.mzz> list, LongSparseArray<com.bytedance.adsdk.ud.lnr.lnr.mzz> longSparseArray, Map<String, List<com.bytedance.adsdk.ud.lnr.lnr.mzz>> map, Map<String, to> map2, SparseArray<com.bytedance.adsdk.ud.lnr.mml> sparseArray, Map<String, com.bytedance.adsdk.ud.lnr.lnr> map3, List<com.bytedance.adsdk.ud.lnr.mo> list2, lnr lnrVar, String str, qdl qdlVar, ud udVar) {
        this.to = rect;
        this.rq = f;
        this.fs = f2;
        this.exu = f3;
        this.tvp = list;
        this.jpc = longSparseArray;
        this.lnr = map;
        this.mml = map2;
        this.wd = sparseArray;
        this.mzz = map3;
        this.mo = list2;
        this.jtx = lnrVar;
        this.yt = str;
        this.jl = qdlVar;
        this.exc = udVar;
    }

    public SparseArray<com.bytedance.adsdk.ud.lnr.mml> rdp() {
        return this.wd;
    }

    public qdl rq() {
        return this.jl;
    }

    public ud to() {
        return this.exc;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.ud.lnr.lnr.mzz> it = this.tvp.iterator();
        while (it.hasNext()) {
            sb.append(it.next().qdl("\t"));
        }
        return sb.toString();
    }

    public String tvp() {
        return this.yt;
    }

    public int ud() {
        return this.bjy;
    }

    public float wd() {
        return this.fs;
    }

    public float yt() {
        return this.fs - this.rq;
    }

    public com.bytedance.adsdk.ud.lnr.mo lnr(String str) {
        int size = this.mo.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.bytedance.adsdk.ud.lnr.mo moVar = this.mo.get(i2);
            if (moVar.qdl(str)) {
                return moVar;
            }
        }
        return null;
    }

    public void ud(boolean z2) {
        this.qdl.qdl(z2);
    }

    public List<com.bytedance.adsdk.ud.lnr.lnr.mzz> ud(String str) {
        return this.lnr.get(str);
    }

    public void qdl(String str) {
        this.ud.add(str);
    }

    public void qdl(boolean z2) {
        this.rdp = z2;
    }

    public void qdl(int i2) {
        this.bjy += i2;
    }

    public boolean qdl() {
        return this.rdp;
    }

    public com.bytedance.adsdk.ud.lnr.lnr.mzz qdl(long j) {
        return this.jpc.get(j);
    }

    public float qdl(float f) {
        return com.bytedance.adsdk.ud.mo.mzz.qdl(this.rq, this.fs, f);
    }
}
