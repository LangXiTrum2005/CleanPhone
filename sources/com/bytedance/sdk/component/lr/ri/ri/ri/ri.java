package com.bytedance.sdk.component.lr.ri.ri.ri;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends com.bytedance.sdk.component.lr.ri.ka {
    public static volatile qt ri;
    private ExecutorService ka;
    private List<com.bytedance.sdk.component.lr.ri.lr> lr = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.lr.ri.lr> ik = new CopyOnWriteArrayList();

    public ri(ExecutorService executorService) {
        this.ka = executorService;
    }

    public boolean fi() {
        return (ri == null || ri.ri() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.component.lr.ri.ka
    public List<com.bytedance.sdk.component.lr.ri.lr> ik() {
        return this.lr;
    }

    @Override // com.bytedance.sdk.component.lr.ri.ka
    public List<com.bytedance.sdk.component.lr.ri.lr> ka() {
        return this.ik;
    }

    @Override // com.bytedance.sdk.component.lr.ri.ka
    public ExecutorService lr() {
        ExecutorService executorServiceRi = ri != null ? ri.ri() : null;
        return executorServiceRi != null ? executorServiceRi : this.ka;
    }

    @Override // com.bytedance.sdk.component.lr.ri.ka
    public int ri() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.lr.ri.ka
    public void ri(int i) {
    }

    public static void ri(qt qtVar) {
        ri = qtVar;
    }
}
