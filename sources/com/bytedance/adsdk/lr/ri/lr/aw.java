package com.bytedance.adsdk.lr.ri.lr;

import android.graphics.Path;
import com.bytedance.adsdk.lr.ri.ri.tan;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class aw extends ri<com.bytedance.adsdk.lr.ik.lr.bgr, Path> {
    private List<tan> di;
    private final Path fi;
    private final com.bytedance.adsdk.lr.ik.lr.bgr ka;

    public aw(List<com.bytedance.adsdk.lr.xha.ri<com.bytedance.adsdk.lr.ik.lr.bgr>> list) {
        super(list);
        this.ka = new com.bytedance.adsdk.lr.ik.lr.bgr();
        this.fi = new Path();
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public Path ri(com.bytedance.adsdk.lr.xha.ri<com.bytedance.adsdk.lr.ik.lr.bgr> riVar, float f) {
        this.ka.ri(riVar.ri, riVar.lr, f);
        com.bytedance.adsdk.lr.ik.lr.bgr bgrVarRi = this.ka;
        List<tan> list = this.di;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                bgrVarRi = this.di.get(size).ri(bgrVarRi);
            }
        }
        com.bytedance.adsdk.lr.di.fi.ri(bgrVarRi, this.fi);
        return this.fi;
    }

    public void ri(List<tan> list) {
        this.di = list;
    }
}
