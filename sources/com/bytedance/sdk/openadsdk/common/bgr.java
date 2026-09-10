package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes2.dex */
public class bgr {
    private slm di;
    private boolean fi;
    private final Runnable ik;
    private final com.bytedance.sdk.openadsdk.common.ri.lr ka;
    private final String lr;
    private final com.bytedance.sdk.openadsdk.component.reward.ri.ri ri;
    private com.bytedance.sdk.openadsdk.common.ri.InterfaceC0226ri xha;

    public static class ri {
        private final Runnable ik;
        private final com.bytedance.sdk.openadsdk.common.ri.lr ka;
        private final String lr;
        private final com.bytedance.sdk.openadsdk.component.reward.ri.ri ri;
        private boolean fi = false;
        private slm di = null;
        private com.bytedance.sdk.openadsdk.common.ri.InterfaceC0226ri xha = null;

        public ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar, String str, Runnable runnable, com.bytedance.sdk.openadsdk.common.ri.lr lrVar) {
            this.ri = riVar;
            this.lr = str;
            this.ik = runnable;
            this.ka = lrVar;
        }

        public ri ri(boolean z) {
            this.fi = z;
            return this;
        }

        public ri ri(slm slmVar) {
            this.di = slmVar;
            return this;
        }

        public ri ri(com.bytedance.sdk.openadsdk.common.ri.InterfaceC0226ri interfaceC0226ri) {
            this.xha = interfaceC0226ri;
            return this;
        }

        public bgr ri() {
            if (this.ri != null) {
                if (this.ik != null) {
                    if (this.ka != null) {
                        return new bgr(this);
                    }
                    throw new IllegalArgumentException("SkipResultHandler cannot be null");
                }
                throw new IllegalArgumentException("Runnable finishAction cannot be null");
            }
            throw new IllegalArgumentException("RewardFullContext cannot be null");
        }
    }

    public slm di() {
        return this.di;
    }

    public boolean fi() {
        return this.fi;
    }

    public Runnable ik() {
        return this.ik;
    }

    public com.bytedance.sdk.openadsdk.common.ri.lr ka() {
        return this.ka;
    }

    public String lr() {
        return this.lr;
    }

    public com.bytedance.sdk.openadsdk.component.reward.ri.ri ri() {
        return this.ri;
    }

    public com.bytedance.sdk.openadsdk.common.ri.InterfaceC0226ri xha() {
        return this.xha;
    }

    private bgr(ri riVar) {
        this.ri = riVar.ri;
        this.lr = riVar.lr;
        this.ik = riVar.ik;
        this.ka = riVar.ka;
        this.fi = riVar.fi;
        this.di = riVar.di;
        this.xha = riVar.xha;
    }
}
