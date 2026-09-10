package com.bytedance.sdk.component.fi.lr.ik;

import android.content.Context;
import com.bytedance.sdk.component.fi.ac;
import com.bytedance.sdk.component.fi.aw;
import com.bytedance.sdk.component.fi.bu;
import com.bytedance.sdk.component.fi.co;
import com.bytedance.sdk.component.fi.ihz;
import com.bytedance.sdk.component.fi.nr;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class fi implements aw {
    private com.bytedance.sdk.component.fi.ik di;
    private nr fi;
    private com.bytedance.sdk.component.fi.ka ik;
    private ihz jbs;
    private bu ka;
    private ExecutorService lr;
    private ac mj;
    private boolean qt;
    private co ri;
    private com.bytedance.sdk.component.fi.lr xha;

    public static class ri {
        private com.bytedance.sdk.component.fi.ik di;
        private nr fi;
        private com.bytedance.sdk.component.fi.ka ik;
        private ihz jbs;
        private bu ka;
        private ExecutorService lr;
        private ac mj;
        private boolean qt;
        private co ri;
        private com.bytedance.sdk.component.fi.lr xha;

        public ri ri(com.bytedance.sdk.component.fi.lr lrVar) {
            this.xha = lrVar;
            return this;
        }

        public ri ri(boolean z) {
            this.qt = z;
            return this;
        }

        public ri ri(ihz ihzVar) {
            this.jbs = ihzVar;
            return this;
        }

        public ri ri(ac acVar) {
            this.mj = acVar;
            return this;
        }

        public ri ri(com.bytedance.sdk.component.fi.ka kaVar) {
            this.ik = kaVar;
            return this;
        }

        public fi ri() {
            return new fi(this);
        }
    }

    @Override // com.bytedance.sdk.component.fi.aw
    public ihz di() {
        return this.jbs;
    }

    @Override // com.bytedance.sdk.component.fi.aw
    public com.bytedance.sdk.component.fi.lr fi() {
        return this.xha;
    }

    @Override // com.bytedance.sdk.component.fi.aw
    public com.bytedance.sdk.component.fi.ka ik() {
        return this.ik;
    }

    @Override // com.bytedance.sdk.component.fi.aw
    public com.bytedance.sdk.component.fi.ik ka() {
        return this.di;
    }

    @Override // com.bytedance.sdk.component.fi.aw
    public ac lr() {
        return this.mj;
    }

    @Override // com.bytedance.sdk.component.fi.aw
    public ExecutorService ri() {
        return this.lr;
    }

    @Override // com.bytedance.sdk.component.fi.aw
    public boolean xha() {
        return this.qt;
    }

    private fi(ri riVar) {
        this.ri = riVar.ri;
        this.lr = riVar.lr;
        this.ik = riVar.ik;
        this.ka = riVar.ka;
        this.fi = riVar.fi;
        this.di = riVar.di;
        this.xha = riVar.xha;
        this.mj = riVar.mj;
        this.jbs = riVar.jbs;
        this.qt = riVar.qt;
    }

    public static fi ri(Context context) {
        return new ri().ri();
    }
}
