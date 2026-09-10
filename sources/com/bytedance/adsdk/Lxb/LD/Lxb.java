package com.bytedance.adsdk.Lxb.LD;

import com.bytedance.adsdk.Lxb.LD.lk.Lxb.JXs;
import com.bytedance.adsdk.Lxb.LD.lk.Lxb.LD;
import com.bytedance.adsdk.Lxb.LD.lk.Lxb.OY;
import com.bytedance.adsdk.Lxb.LD.lk.Lxb.QAg;
import com.bytedance.adsdk.Lxb.LD.lk.Lxb.ZU;
import com.bytedance.adsdk.Lxb.LD.lk.Lxb.ebl;
import com.bytedance.adsdk.Lxb.LD.lk.Lxb.lc;
import com.bytedance.adsdk.Lxb.LD.lk.Lxb.lk;
import com.bytedance.adsdk.Lxb.LD.lk.Lxb.nBu;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Lxb {
    private static final com.bytedance.adsdk.Lxb.LD.lk.Lxb Lxb;
    private String JXs;
    private final com.bytedance.adsdk.Lxb.LD.lk.Lxb LD;
    private Deque<com.bytedance.adsdk.Lxb.LD.LD.Lxb> ZU = new LinkedList();
    private com.bytedance.adsdk.Lxb.LD.LD.Lxb lk;

    static {
        int i = 8;
        lc[] lcVarArr = {new nBu(), new ZU(), new QAg(), new LD(), new JXs(), new com.bytedance.adsdk.Lxb.LD.lk.Lxb.Lxb(), new ebl(), new lk(), new OY()};
        final com.bytedance.adsdk.Lxb.LD.lk.Lxb lxb = new com.bytedance.adsdk.Lxb.LD.lk.Lxb() { // from class: com.bytedance.adsdk.Lxb.LD.Lxb.1
            @Override // com.bytedance.adsdk.Lxb.LD.lk.Lxb
            public int Lxb(String str, int i2, Deque<com.bytedance.adsdk.Lxb.LD.LD.Lxb> deque) {
                return i2;
            }
        };
        while (i >= 0) {
            final lc lcVar = lcVarArr[i];
            i--;
            lxb = new com.bytedance.adsdk.Lxb.LD.lk.Lxb() { // from class: com.bytedance.adsdk.Lxb.LD.Lxb.2
                @Override // com.bytedance.adsdk.Lxb.LD.lk.Lxb
                public int Lxb(String str, int i2, Deque<com.bytedance.adsdk.Lxb.LD.LD.Lxb> deque) {
                    return lcVar.Lxb(str, i2, deque, lxb);
                }
            };
        }
        Lxb = lxb;
    }

    private Lxb(String str, com.bytedance.adsdk.Lxb.LD.lk.Lxb lxb) {
        this.LD = lxb;
        this.JXs = str;
        try {
            Lxb();
        } catch (Exception e) {
            throw new com.bytedance.adsdk.Lxb.Lxb.LD(str, e);
        }
    }

    public static Lxb Lxb(String str) {
        return new Lxb(str, Lxb);
    }

    private void Lxb() {
        int length = this.JXs.length();
        int i = 0;
        while (i < length) {
            int iLxb = this.LD.Lxb(this.JXs, i, this.ZU);
            if (iLxb == i) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.JXs.substring(0, i));
            }
            i = iLxb;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.Lxb.LD.LD.Lxb lxbPollFirst = this.ZU.pollFirst();
            if (lxbPollFirst == null) {
                this.lk = com.bytedance.adsdk.Lxb.LD.JXs.LD.Lxb(arrayList, this.JXs, i);
                this.ZU = null;
                return;
            }
            arrayList.add(0, lxbPollFirst);
        }
    }

    public <T> T Lxb(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("default_key", jSONObject);
        return (T) Lxb(map);
    }

    public <T> T Lxb(Map<String, JSONObject> map) {
        return (T) this.lk.Lxb(map);
    }
}
