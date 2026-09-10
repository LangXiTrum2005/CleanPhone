package com.bytedance.sdk.openadsdk.core.co.lr.fi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.co;
import com.bytedance.adsdk.ugeno.ka;
import com.bytedance.adsdk.ugeno.lr.ik;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends com.bytedance.adsdk.ugeno.lr.ri<ri> {
    private int akr;
    private JSONArray de;
    private int zv;

    public lr(Context context) {
        super(context);
        this.akr = 0;
        this.zv = 0;
    }

    private void ik() {
        List<ik<View>> list = ((com.bytedance.adsdk.ugeno.lr.ri) this).ri;
        if (list == null || list.isEmpty()) {
            return;
        }
        ik<View> ikVar = ((com.bytedance.adsdk.ugeno.lr.ri) this).ri.get(0);
        if (this.de == null) {
            return;
        }
        for (int i = 0; i < this.de.length(); i++) {
            co coVar = new co(this.lr);
            coVar.ri(this.vt);
            try {
                JSONObject jSONObjectOptJSONObject = this.de.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    if (jSONObjectOptJSONObject.has("$chunk")) {
                        this.ka.put("$item", jSONObjectOptJSONObject.optJSONArray("$chunk"));
                    } else {
                        this.ka.put("$item", jSONObjectOptJSONObject);
                    }
                    ((ri) this.fi).ri(coVar.ri(ikVar.ory(), this.ka, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void ka() {
        for (int i = 0; i < ((com.bytedance.adsdk.ugeno.lr.ri) this).ri.size(); i++) {
            ik<View> ikVar = ((com.bytedance.adsdk.ugeno.lr.ri) this).ri.get(i);
            if (ikVar != null) {
                co coVar = new co(this.lr);
                coVar.ri(this.vt);
                ((ri) this.fi).ri(coVar.ri(ikVar.ory(), this.ka, (JSONObject) null));
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ri, com.bytedance.adsdk.ugeno.lr.ik
    public void lr() {
        super.lr();
        T t = this.fi;
        if (t instanceof ri) {
            ((ri) t).setOrientation(this.akr);
            ((ri) this.fi).ri(this);
            if (this.zv == 1) {
                ka();
            } else {
                ik();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T extends android.view.View, android.view.View] */
    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public View ri() {
        try {
            ri riVar = new ri(this.lr);
            this.fi = riVar;
            riVar.ri((ka) this);
        } catch (Throwable unused) {
            this.fi = new View(this.lr);
        }
        return this.fi;
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void ri(String str, String str2) {
        super.ri(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "driveMode":
                this.zv = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 0);
                break;
            case "direction":
                if (TextUtils.equals(str2, "vertical")) {
                    this.akr = 1;
                    break;
                } else {
                    this.akr = 0;
                    break;
                }
                break;
            case "dataList":
                this.de = com.bytedance.adsdk.ugeno.xha.lr.ri(str2, (JSONArray) null);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ri
    public void ri(ik ikVar) {
        if (ikVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.lr.ri) this).ri.add(ikVar);
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ri
    public void ri(ik ikVar, ViewGroup.LayoutParams layoutParams) {
        if (ikVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.lr.ri) this).ri.add(ikVar);
    }
}
