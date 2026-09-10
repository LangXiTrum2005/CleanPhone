package com.bytedance.sdk.component.di.ri;

import android.content.Context;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class xha {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private static xha f18051co;
    private static volatile com.bytedance.sdk.component.di.ri.fi.ri jbs;
    private final AtomicBoolean aw = new AtomicBoolean(false);
    private long bgr;
    private volatile com.bytedance.sdk.component.di.ri.ka.lr.ri di;
    private volatile com.bytedance.sdk.component.di.ri.ka.lr.ri fi;
    private volatile com.bytedance.sdk.component.di.ri.ka.lr.ri ik;
    private volatile com.bytedance.sdk.component.di.ri.ka.lr.ri ka;
    private volatile com.bytedance.sdk.component.di.ri.ka.lr.ri lr;
    private volatile fi mj;
    private volatile com.bytedance.sdk.component.di.ri.lr.ik qt;
    private volatile Context ri;
    private volatile Map<Integer, com.bytedance.sdk.component.di.ri.lr.ik> sf;
    private volatile com.bytedance.sdk.component.di.ri.ri.fi xha;

    private xha() {
    }

    public static synchronized xha di() {
        try {
            if (f18051co == null) {
                f18051co = new xha();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f18051co;
    }

    public static com.bytedance.sdk.component.di.ri.fi.ri ka() {
        if (jbs == null) {
            synchronized (xha.class) {
                try {
                    if (jbs == null) {
                        jbs = new com.bytedance.sdk.component.di.ri.fi.lr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return jbs;
    }

    public com.bytedance.sdk.component.di.ri.ka.lr.ri aw() {
        return this.ka;
    }

    public com.bytedance.sdk.component.di.ri.ka.lr.ri bgr() {
        return this.fi;
    }

    public com.bytedance.sdk.component.di.ri.ka.lr.ri co() {
        return this.ik;
    }

    public Context fi() {
        return this.ri;
    }

    public com.bytedance.sdk.component.di.ri.ri.fi ik() {
        return this.xha;
    }

    public com.bytedance.sdk.component.di.ri.ka.lr.ri jbs() {
        return this.di;
    }

    public Map<Integer, com.bytedance.sdk.component.di.ri.lr.ik> lr() {
        return this.sf;
    }

    public void mj() {
        com.bytedance.sdk.component.di.ri.lr.ka.ri.lr();
    }

    public void qt() {
        com.bytedance.sdk.component.di.ri.lr.ka.ri.ik();
    }

    public boolean ri() {
        return this.aw.get();
    }

    public com.bytedance.sdk.component.di.ri.ka.lr.ri sf() {
        return this.lr;
    }

    public long slm() {
        return this.bgr * SignalManager.TWENTY_FOUR_HOURS_MILLIS;
    }

    public fi vr() {
        return this.mj;
    }

    public com.bytedance.sdk.component.di.ri.lr.ik xha() {
        return this.qt;
    }

    public void fi(com.bytedance.sdk.component.di.ri.ka.lr.ri riVar) {
        this.fi = riVar;
    }

    public void ik(com.bytedance.sdk.component.di.ri.ka.lr.ri riVar) {
        this.ik = riVar;
    }

    public void lr(com.bytedance.sdk.component.di.ri.ka.lr.ri riVar) {
        this.lr = riVar;
    }

    public void ri(boolean z) {
        this.aw.set(z);
    }

    public void ri(com.bytedance.sdk.component.di.ri.ri.fi fiVar) {
        this.xha = fiVar;
    }

    public void ri(Context context) {
        this.ri = context;
    }

    public void ri(com.bytedance.sdk.component.di.ri.lr.ik ikVar) {
        this.qt = ikVar;
    }

    public void ri(com.bytedance.sdk.component.di.ri.ka.lr.ri riVar) {
        this.di = riVar;
    }

    public void ka(com.bytedance.sdk.component.di.ri.ka.lr.ri riVar) {
        this.ka = riVar;
    }

    public void ri(com.bytedance.sdk.component.di.ri.ka.ri riVar) {
        if (riVar == null) {
            return;
        }
        riVar.ri(System.currentTimeMillis());
        com.bytedance.sdk.component.di.ri.lr.ka.ri.ri(riVar, riVar.ka());
    }

    public void ri(String str, boolean z) {
        com.bytedance.sdk.component.di.ri.di.ri.ri().ri(str, z);
    }

    public void ri(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        com.bytedance.sdk.component.di.ri.di.ri.ri().ri(str, list, z, map, i, str2);
    }

    public void ri(fi fiVar) {
        this.mj = fiVar;
    }

    public void ri(long j) {
        this.bgr = j;
    }
}
