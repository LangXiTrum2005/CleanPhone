package com.bytedance.sdk.component.lr.ri;

import com.ironsource.Ua;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sf implements Cloneable {
    public long di;
    public TimeUnit fi;
    public TimeUnit ik;
    public long ka;
    public long lr;
    public List<mj> ri;
    public TimeUnit xha;

    public sf(ri riVar) {
        this.lr = riVar.lr;
        this.ka = riVar.ka;
        this.di = riVar.di;
        List<mj> list = riVar.ri;
        this.ik = riVar.ik;
        this.fi = riVar.fi;
        this.xha = riVar.xha;
        this.ri = list;
    }

    public ri lr() {
        return new ri(this);
    }

    public abstract ka ri();

    public abstract lr ri(co coVar);

    public static final class ri {
        public long di;
        public TimeUnit fi;
        public TimeUnit ik;
        public long ka;
        public long lr;
        public final List<mj> ri;
        public TimeUnit xha;

        public ri() {
            this.ri = new ArrayList();
            this.lr = Ua.s;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.ik = timeUnit;
            this.ka = Ua.s;
            this.fi = timeUnit;
            this.di = Ua.s;
            this.xha = timeUnit;
        }

        public ri ik(long j, TimeUnit timeUnit) {
            this.di = j;
            this.xha = timeUnit;
            return this;
        }

        public ri lr(long j, TimeUnit timeUnit) {
            this.ka = j;
            this.fi = timeUnit;
            return this;
        }

        public ri ri(long j, TimeUnit timeUnit) {
            this.lr = j;
            this.ik = timeUnit;
            return this;
        }

        public ri ri(mj mjVar) {
            this.ri.add(mjVar);
            return this;
        }

        public sf ri() {
            return com.bytedance.sdk.component.lr.ri.ri.ri.ri(this);
        }

        public ri(String str) {
            this.ri = new ArrayList();
            this.lr = Ua.s;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.ik = timeUnit;
            this.ka = Ua.s;
            this.fi = timeUnit;
            this.di = Ua.s;
            this.xha = timeUnit;
        }

        public ri(sf sfVar) {
            this.ri = new ArrayList();
            this.lr = Ua.s;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.ik = timeUnit;
            this.ka = Ua.s;
            this.fi = timeUnit;
            this.di = Ua.s;
            this.xha = timeUnit;
            this.lr = sfVar.lr;
            this.ik = sfVar.ik;
            this.ka = sfVar.ka;
            this.fi = sfVar.fi;
            this.di = sfVar.di;
            this.xha = sfVar.xha;
        }
    }
}
