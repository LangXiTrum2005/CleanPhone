package com.bytedance.sdk.component.fi.lr.ik;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.fi.ac;
import com.bytedance.sdk.component.fi.aw;
import com.bytedance.sdk.component.fi.bu;
import com.bytedance.sdk.component.fi.ihz;
import com.bytedance.sdk.component.fi.nr;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class di {
    private com.bytedance.sdk.component.fi.ka di;
    private volatile bu ik;
    private Context jbs;
    private volatile nr ka;
    private final aw lr;
    private ExecutorService mj;
    private ExecutorService xha;
    private Map<String, List<ik>> ri = new ConcurrentHashMap();
    private Map<String, com.bytedance.sdk.component.fi.ik> fi = new ConcurrentHashMap();

    public di(Context context, aw awVar) {
        this.lr = (aw) xha.ri(awVar);
        this.jbs = context;
        com.bytedance.sdk.component.fi.lr.ik.ri.lr.ri(context, awVar.fi());
    }

    private com.bytedance.sdk.component.fi.ka qt() {
        com.bytedance.sdk.component.fi.ka kaVarIk = this.lr.ik();
        return kaVarIk == null ? new com.bytedance.sdk.component.fi.ri.ri() : kaVarIk;
    }

    private ExecutorService sf() {
        ExecutorService executorServiceRi = this.lr.ri();
        return executorServiceRi != null ? executorServiceRi : com.bytedance.sdk.component.fi.lr.ri.lr.ri();
    }

    public ExecutorService di() {
        ExecutorService executorServiceRi;
        ac acVarLr = this.lr.lr();
        if (acVarLr != null && (executorServiceRi = acVarLr.ri()) != null) {
            return executorServiceRi;
        }
        if (this.xha == null) {
            this.xha = sf();
        }
        return this.xha;
    }

    public com.bytedance.sdk.component.fi.ka fi() {
        if (this.di == null) {
            this.di = qt();
        }
        return this.di;
    }

    public nr ik() {
        return this.ka;
    }

    public Map<String, List<ik>> jbs() {
        return this.ri;
    }

    public Collection<com.bytedance.sdk.component.fi.ik> ka() {
        return this.fi.values();
    }

    public boolean lr() {
        return this.lr.xha();
    }

    public ExecutorService mj() {
        ExecutorService executorServiceLr;
        ac acVarLr = this.lr.lr();
        if (acVarLr != null && (executorServiceLr = acVarLr.lr()) != null) {
            return executorServiceLr;
        }
        if (this.mj == null) {
            this.mj = com.bytedance.sdk.component.fi.lr.ri.lr.ri();
        }
        return this.mj;
    }

    public Context ri() {
        return this.jbs;
    }

    public ihz xha() {
        aw awVar = this.lr;
        if (awVar != null) {
            return awVar.di();
        }
        return null;
    }

    private com.bytedance.sdk.component.fi.ik ka(com.bytedance.sdk.component.fi.lr lrVar) {
        com.bytedance.sdk.component.fi.ik ikVarKa = this.lr.ka();
        return ikVarKa != null ? ikVarKa : new com.bytedance.sdk.component.fi.lr.ik.ri.ri.lr(lrVar.mj(), lrVar.ri());
    }

    public com.bytedance.sdk.component.fi.ik ik(com.bytedance.sdk.component.fi.lr lrVar) {
        if (lrVar == null) {
            lrVar = com.bytedance.sdk.component.fi.lr.ik.ri.lr.jbs();
        }
        String string = lrVar.mj().toString();
        com.bytedance.sdk.component.fi.ik ikVar = this.fi.get(string);
        if (ikVar != null) {
            return ikVar;
        }
        com.bytedance.sdk.component.fi.ik ikVarKa = ka(lrVar);
        this.fi.put(string, ikVarKa);
        return ikVarKa;
    }

    public nr lr(com.bytedance.sdk.component.fi.lr lrVar) {
        if (lrVar == null) {
            lrVar = com.bytedance.sdk.component.fi.lr.ik.ri.lr.jbs();
        }
        if (this.ka == null) {
            synchronized (com.bytedance.sdk.component.fi.lr.ik.ri.lr.lr.class) {
                try {
                    if (this.ka == null) {
                        this.ka = new com.bytedance.sdk.component.fi.lr.ik.ri.lr.lr(lrVar.lr(), lrVar.ka());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.ka;
    }

    public bu ri(com.bytedance.sdk.component.fi.lr lrVar) {
        if (lrVar == null) {
            lrVar = com.bytedance.sdk.component.fi.lr.ik.ri.lr.jbs();
        }
        if (this.ik == null) {
            synchronized (com.bytedance.sdk.component.fi.lr.ik.ri.lr.ik.class) {
                try {
                    if (this.ik == null) {
                        this.ik = new com.bytedance.sdk.component.fi.lr.ik.ri.lr.ik(new com.bytedance.sdk.component.fi.lr.ik.ri.lr.ri(lrVar.lr(), lrVar.ik()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.ik;
    }

    public com.bytedance.sdk.component.fi.ik ri(String str) {
        return ik(com.bytedance.sdk.component.fi.lr.ik.ri.lr.ri(new File(str)));
    }

    public com.bytedance.sdk.component.fi.lr.ik.lr.lr ri(ik ikVar) {
        ImageView.ScaleType scaleTypeJbs = ikVar.jbs();
        if (scaleTypeJbs == null) {
            scaleTypeJbs = com.bytedance.sdk.component.fi.lr.ik.lr.lr.ri;
        }
        ImageView.ScaleType scaleType = scaleTypeJbs;
        Bitmap.Config configQt = ikVar.qt();
        if (configQt == null) {
            configQt = com.bytedance.sdk.component.fi.lr.ik.lr.lr.lr;
        }
        return new com.bytedance.sdk.component.fi.lr.ik.lr.lr(ikVar.lr(), ikVar.ik(), scaleType, configQt, ikVar.ka(), ikVar.fi());
    }
}
