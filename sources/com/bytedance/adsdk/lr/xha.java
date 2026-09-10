package com.bytedance.adsdk.lr;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class xha {
    private float aw;
    private boolean bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private float f18005co;
    private List<com.bytedance.adsdk.lr.ik.di> di;
    private Map<String, com.bytedance.adsdk.lr.ik.ik> fi;
    private Map<String, List<com.bytedance.adsdk.lr.ik.ik.fi>> ik;
    private List<com.bytedance.adsdk.lr.ik.ik.fi> jbs;
    private Map<String, qt> ka;
    private LongSparseArray<com.bytedance.adsdk.lr.ik.ik.fi> mj;
    private ri nr;
    private Rect qt;
    private float sf;
    private ik slm;
    private lr tan;
    private SparseArray<com.bytedance.adsdk.lr.ik.ka> xha;
    private final nr ri = new nr();
    private final HashSet<String> lr = new HashSet<>();
    private int vr = 0;
    private String bu = "";

    public static class ik {
        public String di;
        public int[] fi;
        public String ik;
        public String ka;
        public String lr;
        public int ri;
        public JSONArray xha;
    }

    public static class lr {
        public JSONArray ik;
        public int[][] lr;
        public String ri;
    }

    public static class ri {
        public String di;
        public int fi;
        public Map<String, Object> ik;
        public int ka;
        public Map<String, Object> lr;
        public int ri;
        public JSONArray xha;
    }

    public List<com.bytedance.adsdk.lr.ik.ik.fi> aw() {
        return this.jbs;
    }

    public SparseArray<com.bytedance.adsdk.lr.ik.ka> bgr() {
        return this.xha;
    }

    public float bu() {
        return this.f18005co - this.sf;
    }

    public float co() {
        return this.aw;
    }

    public float di() {
        return this.sf;
    }

    public float fi() {
        return (long) ((bu() / this.aw) * 1000.0f);
    }

    public nr ik() {
        return this.ri;
    }

    public String jbs() {
        return this.bu;
    }

    public Rect ka() {
        return this.qt;
    }

    public int lr() {
        return this.vr;
    }

    public ik mj() {
        return this.slm;
    }

    public lr qt() {
        return this.tan;
    }

    public void ri(Rect rect, float f, float f2, float f3, List<com.bytedance.adsdk.lr.ik.ik.fi> list, LongSparseArray<com.bytedance.adsdk.lr.ik.ik.fi> longSparseArray, Map<String, List<com.bytedance.adsdk.lr.ik.ik.fi>> map, Map<String, qt> map2, SparseArray<com.bytedance.adsdk.lr.ik.ka> sparseArray, Map<String, com.bytedance.adsdk.lr.ik.ik> map3, List<com.bytedance.adsdk.lr.ik.di> list2, ik ikVar, String str, ri riVar, lr lrVar) {
        this.qt = rect;
        this.sf = f;
        this.f18005co = f2;
        this.aw = f3;
        this.jbs = list;
        this.mj = longSparseArray;
        this.ik = map;
        this.ka = map2;
        this.xha = sparseArray;
        this.fi = map3;
        this.di = list2;
        this.slm = ikVar;
        this.bu = str;
        this.nr = riVar;
        this.tan = lrVar;
    }

    public ri sf() {
        return this.nr;
    }

    public Map<String, qt> slm() {
        return this.ka;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.lr.ik.ik.fi> it = this.jbs.iterator();
        while (it.hasNext()) {
            sb.append(it.next().ri("\t"));
        }
        return sb.toString();
    }

    public Map<String, com.bytedance.adsdk.lr.ik.ik> vr() {
        return this.fi;
    }

    public float xha() {
        return this.f18005co;
    }

    public com.bytedance.adsdk.lr.ik.di ik(String str) {
        int size = this.di.size();
        for (int i = 0; i < size; i++) {
            com.bytedance.adsdk.lr.ik.di diVar = this.di.get(i);
            if (diVar.ri(str)) {
                return diVar;
            }
        }
        return null;
    }

    public void lr(boolean z) {
        this.ri.ri(z);
    }

    public List<com.bytedance.adsdk.lr.ik.ik.fi> lr(String str) {
        return this.ik.get(str);
    }

    public void ri(String str) {
        this.lr.add(str);
    }

    public void ri(boolean z) {
        this.bgr = z;
    }

    public void ri(int i) {
        this.vr += i;
    }

    public boolean ri() {
        return this.bgr;
    }

    public com.bytedance.adsdk.lr.ik.ik.fi ri(long j) {
        return this.mj.get(j);
    }

    public float ri(float f) {
        return com.bytedance.adsdk.lr.di.fi.ri(this.sf, this.f18005co, f);
    }
}
