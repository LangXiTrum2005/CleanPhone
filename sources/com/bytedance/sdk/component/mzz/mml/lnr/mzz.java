package com.bytedance.sdk.component.mzz.mml.lnr;

import android.content.Context;
import com.bytedance.sdk.component.mzz.aaj;
import com.bytedance.sdk.component.mzz.exu;
import com.bytedance.sdk.component.mzz.fs;
import com.bytedance.sdk.component.mzz.jl;
import com.bytedance.sdk.component.mzz.jyq;
import com.bytedance.sdk.component.mzz.yt;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class mzz implements exu {
    private aaj jpc;
    private com.bytedance.sdk.component.mzz.mml lnr;
    private yt mml;
    private com.bytedance.sdk.component.mzz.lnr mo;
    private jl mzz;
    private fs qdl;
    private boolean to;
    private jyq tvp;
    private ExecutorService ud;
    private com.bytedance.sdk.component.mzz.ud wd;

    public static class qdl {
        private aaj jpc;
        private com.bytedance.sdk.component.mzz.mml lnr;
        private yt mml;
        private com.bytedance.sdk.component.mzz.lnr mo;
        private jl mzz;
        private fs qdl;
        private boolean to;
        private jyq tvp;
        private ExecutorService ud;
        private com.bytedance.sdk.component.mzz.ud wd;

        public qdl qdl(com.bytedance.sdk.component.mzz.ud udVar) {
            this.wd = udVar;
            return this;
        }

        public qdl qdl(jyq jyqVar) {
            this.tvp = jyqVar;
            return this;
        }

        public qdl qdl(aaj aajVar) {
            this.jpc = aajVar;
            return this;
        }

        public qdl qdl(com.bytedance.sdk.component.mzz.mml mmlVar) {
            this.lnr = mmlVar;
            return this;
        }

        public qdl qdl(boolean z2) {
            this.to = z2;
            return this;
        }

        public mzz qdl() {
            return new mzz(this);
        }
    }

    @Override // com.bytedance.sdk.component.mzz.exu
    public com.bytedance.sdk.component.mzz.ud jpc() {
        return this.wd;
    }

    @Override // com.bytedance.sdk.component.mzz.exu
    public aaj lnr() {
        return this.jpc;
    }

    @Override // com.bytedance.sdk.component.mzz.exu
    public com.bytedance.sdk.component.mzz.mml mml() {
        return this.lnr;
    }

    @Override // com.bytedance.sdk.component.mzz.exu
    public jl mo() {
        return this.mzz;
    }

    @Override // com.bytedance.sdk.component.mzz.exu
    public yt mzz() {
        return this.mml;
    }

    @Override // com.bytedance.sdk.component.mzz.exu
    public fs qdl() {
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.mzz.exu
    public boolean to() {
        return this.to;
    }

    @Override // com.bytedance.sdk.component.mzz.exu
    public jyq tvp() {
        return this.tvp;
    }

    @Override // com.bytedance.sdk.component.mzz.exu
    public ExecutorService ud() {
        return this.ud;
    }

    @Override // com.bytedance.sdk.component.mzz.exu
    public com.bytedance.sdk.component.mzz.lnr wd() {
        return this.mo;
    }

    private mzz(qdl qdlVar) {
        this.qdl = qdlVar.qdl;
        this.ud = qdlVar.ud;
        this.lnr = qdlVar.lnr;
        this.mml = qdlVar.mml;
        this.mzz = qdlVar.mzz;
        this.mo = qdlVar.mo;
        this.wd = qdlVar.wd;
        this.jpc = qdlVar.jpc;
        this.tvp = qdlVar.tvp;
        this.to = qdlVar.to;
    }

    public static mzz qdl(Context context) {
        return new qdl().qdl();
    }
}
