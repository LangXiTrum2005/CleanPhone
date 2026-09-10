package com.bytedance.adsdk.ri.lr;

import com.bytedance.adsdk.ri.lr.ik.ri.di;
import com.bytedance.adsdk.ri.lr.ik.ri.fi;
import com.bytedance.adsdk.ri.lr.ik.ri.ik;
import com.bytedance.adsdk.ri.lr.ik.ri.jbs;
import com.bytedance.adsdk.ri.lr.ik.ri.ka;
import com.bytedance.adsdk.ri.lr.ik.ri.lr;
import com.bytedance.adsdk.ri.lr.ik.ri.mj;
import com.bytedance.adsdk.ri.lr.ik.ri.qt;
import com.bytedance.adsdk.ri.lr.ik.ri.xha;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static final com.bytedance.adsdk.ri.lr.ik.ri ri;
    private String fi;
    private com.bytedance.adsdk.ri.lr.lr.ri ik;
    private Deque<com.bytedance.adsdk.ri.lr.lr.ri> ka = new LinkedList();
    private final com.bytedance.adsdk.ri.lr.ik.ri lr;

    static {
        int i = 8;
        di[] diVarArr = {new qt(), new ka(), new jbs(), new lr(), new fi(), new com.bytedance.adsdk.ri.lr.ik.ri.ri(), new xha(), new ik(), new mj()};
        final com.bytedance.adsdk.ri.lr.ik.ri riVar = new com.bytedance.adsdk.ri.lr.ik.ri() { // from class: com.bytedance.adsdk.ri.lr.ri.1
            @Override // com.bytedance.adsdk.ri.lr.ik.ri
            public int ri(String str, int i2, Deque<com.bytedance.adsdk.ri.lr.lr.ri> deque) {
                return i2;
            }
        };
        while (i >= 0) {
            final di diVar = diVarArr[i];
            i--;
            riVar = new com.bytedance.adsdk.ri.lr.ik.ri() { // from class: com.bytedance.adsdk.ri.lr.ri.2
                @Override // com.bytedance.adsdk.ri.lr.ik.ri
                public int ri(String str, int i2, Deque<com.bytedance.adsdk.ri.lr.lr.ri> deque) {
                    return diVar.ri(str, i2, deque, riVar);
                }
            };
        }
        ri = riVar;
    }

    private ri(String str, com.bytedance.adsdk.ri.lr.ik.ri riVar) {
        this.lr = riVar;
        this.fi = str;
        try {
            ri();
        } catch (Exception e) {
            throw new com.bytedance.adsdk.ri.ri.lr(str, e);
        }
    }

    public static ri ri(String str) {
        return new ri(str, ri);
    }

    private void ri() {
        int length = this.fi.length();
        int i = 0;
        while (i < length) {
            int iRi = this.lr.ri(this.fi, i, this.ka);
            if (iRi == i) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.fi.substring(0, i));
            }
            i = iRi;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.ri.lr.lr.ri riVarPollFirst = this.ka.pollFirst();
            if (riVarPollFirst == null) {
                this.ik = com.bytedance.adsdk.ri.lr.fi.lr.ri(arrayList, this.fi, i);
                this.ka = null;
                return;
            }
            arrayList.add(0, riVarPollFirst);
        }
    }

    public <T> T ri(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("default_key", jSONObject);
        return (T) ri(map);
    }

    public <T> T ri(Map<String, JSONObject> map) {
        return (T) this.ik.ri(map);
    }
}
