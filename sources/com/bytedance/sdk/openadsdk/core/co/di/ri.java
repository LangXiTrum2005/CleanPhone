package com.bytedance.sdk.openadsdk.core.co.di;

import com.bytedance.adsdk.ugeno.core.nr;
import com.bytedance.sdk.component.adexpress.lr.aw;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends aw {
    private boolean fi;
    private float ik;
    private float ka;
    private nr lr;
    private JSONObject ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.di.ri$ri, reason: collision with other inner class name */
    public static class C0239ri extends aw.ri {
        private boolean fi;
        private float ik;
        private float ka;
        private nr lr;
        private JSONObject ri;

        public C0239ri di(boolean z) {
            this.fi = z;
            return this;
        }

        public C0239ri lr(float f) {
            this.ka = f;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.lr.aw.ri
        /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
        public ri ri() {
            return new ri(this);
        }

        public C0239ri ri(JSONObject jSONObject) {
            this.ri = jSONObject;
            return this;
        }

        public C0239ri ri(nr nrVar) {
            this.lr = nrVar;
            return this;
        }

        public C0239ri ri(float f) {
            this.ik = f;
            return this;
        }
    }

    public ri(C0239ri c0239ri) {
        super(c0239ri);
        this.ri = c0239ri.ri;
        this.lr = c0239ri.lr;
        this.ik = c0239ri.ik;
        this.ka = c0239ri.ka;
        this.fi = c0239ri.fi;
    }

    public float dw() {
        return this.ik;
    }

    public JSONObject hcw() {
        return this.ri;
    }

    public nr oh() {
        return this.lr;
    }

    public float ory() {
        return this.ka;
    }

    public boolean xd() {
        return this.fi;
    }
}
