package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import glutethimide.kowloon;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: SourceGenerator.java */
/* JADX INFO: loaded from: classes2.dex */
public class apical implements dern, dern.attabal {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public volatile endosteum.attabal f17665adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final dern.attabal f17666arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public volatile kowloon.attabal<?> f17667graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final wireman<?> f17668kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public volatile Object f17669molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public volatile int f17670monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public volatile saneness f17671polloi;

    /* JADX INFO: compiled from: SourceGenerator.java */
    public class attabal implements com.bumptech.glide.load.data.wireman.attabal<Object> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ kowloon.attabal f17673kowloon;

        public attabal(kowloon.attabal attabalVar) {
            this.f17673kowloon = attabalVar;
        }

        @Override // com.bumptech.glide.load.data.wireman.attabal
        public void beachfront(Object obj) {
            if (apical.this.competently(this.f17673kowloon)) {
                apical.this.impromptu(this.f17673kowloon, obj);
            }
        }

        @Override // com.bumptech.glide.load.data.wireman.attabal
        public void dern(Exception exc) {
            if (apical.this.competently(this.f17673kowloon)) {
                apical.this.taiyuan(this.f17673kowloon, exc);
            }
        }
    }

    public apical(wireman<?> wiremanVar, dern.attabal attabalVar) {
        this.f17668kowloon = wiremanVar;
        this.f17666arytenoidectomy = attabalVar;
    }

    @Override // com.bumptech.glide.load.engine.dern.attabal
    public void attabal(maggot.saneness sanenessVar, Object obj, com.bumptech.glide.load.data.wireman<?> wiremanVar, DataSource dataSource, maggot.saneness sanenessVar2) {
        this.f17666arytenoidectomy.attabal(sanenessVar, obj, wiremanVar, this.f17667graveside.f27251dern.wireman(), sanenessVar);
    }

    public final boolean beachfront() {
        return this.f17670monoploid < this.f17668kowloon.competently().size();
    }

    @Override // com.bumptech.glide.load.engine.dern
    public void cancel() {
        kowloon.attabal<?> attabalVar = this.f17667graveside;
        if (attabalVar != null) {
            attabalVar.f27251dern.cancel();
        }
    }

    public boolean competently(kowloon.attabal<?> attabalVar) {
        kowloon.attabal<?> attabalVar2 = this.f17667graveside;
        return attabalVar2 != null && attabalVar2 == attabalVar;
    }

    public final void cutely(kowloon.attabal<?> attabalVar) {
        this.f17667graveside.f27251dern.marial(this.f17668kowloon.formularize(), new attabal(attabalVar));
    }

    @Override // com.bumptech.glide.load.engine.dern.attabal
    public void dern(maggot.saneness sanenessVar, Exception exc, com.bumptech.glide.load.data.wireman<?> wiremanVar, DataSource dataSource) {
        this.f17666arytenoidectomy.dern(sanenessVar, exc, wiremanVar, this.f17667graveside.f27251dern.wireman());
    }

    public void impromptu(kowloon.attabal<?> attabalVar, Object obj) {
        endosteum.dern dernVarMarial = this.f17668kowloon.marial();
        if (obj != null && dernVarMarial.dern(attabalVar.f27251dern.wireman())) {
            this.f17669molybdenite = obj;
            this.f17666arytenoidectomy.marial();
        } else {
            dern.attabal attabalVar2 = this.f17666arytenoidectomy;
            maggot.saneness sanenessVar = attabalVar.f27250attabal;
            com.bumptech.glide.load.data.wireman<?> wiremanVar = attabalVar.f27251dern;
            attabalVar2.attabal(sanenessVar, obj, wiremanVar, wiremanVar.wireman(), this.f17665adultoid);
        }
    }

    @Override // com.bumptech.glide.load.engine.dern.attabal
    public void marial() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.dern
    public boolean saneness() {
        if (this.f17669molybdenite != null) {
            Object obj = this.f17669molybdenite;
            this.f17669molybdenite = null;
            try {
                if (!wireman(obj)) {
                    return true;
                }
            } catch (IOException unused) {
                Log.isLoggable("SourceGenerator", 3);
            }
        }
        if (this.f17671polloi != null && this.f17671polloi.saneness()) {
            return true;
        }
        this.f17671polloi = null;
        this.f17667graveside = null;
        boolean z = false;
        while (!z && beachfront()) {
            List<kowloon.attabal<?>> listCompetently = this.f17668kowloon.competently();
            int i = this.f17670monoploid;
            this.f17670monoploid = i + 1;
            this.f17667graveside = listCompetently.get(i);
            if (this.f17667graveside != null && (this.f17668kowloon.marial().dern(this.f17667graveside.f27251dern.wireman()) || this.f17668kowloon.adultoid(this.f17667graveside.f27251dern.attabal()))) {
                cutely(this.f17667graveside);
                z = true;
            }
        }
        return z;
    }

    public void taiyuan(kowloon.attabal<?> attabalVar, Exception exc) {
        dern.attabal attabalVar2 = this.f17666arytenoidectomy;
        endosteum.attabal attabalVar3 = this.f17665adultoid;
        com.bumptech.glide.load.data.wireman<?> wiremanVar = attabalVar.f27251dern;
        attabalVar2.dern(attabalVar3, exc, wiremanVar, wiremanVar.wireman());
    }

    public final boolean wireman(Object obj) throws Throwable {
        Throwable th;
        long jSaneness = com.bumptech.glide.util.competently.saneness();
        boolean z = false;
        try {
            com.bumptech.glide.load.data.marial<T> marialVarKowloon = this.f17668kowloon.kowloon(obj);
            Object objAttabal = marialVarKowloon.attabal();
            maggot.attabal<X> attabalVarMonoploid = this.f17668kowloon.monoploid(objAttabal);
            endosteum.saneness sanenessVar = new endosteum.saneness(attabalVarMonoploid, objAttabal, this.f17668kowloon.apical());
            endosteum.attabal attabalVar = new endosteum.attabal(this.f17667graveside.f27250attabal, this.f17668kowloon.arytenoidectomy());
            hemolysin.attabal attabalVarWireman = this.f17668kowloon.wireman();
            attabalVarWireman.saneness(attabalVar, sanenessVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                attabalVar.toString();
                Objects.toString(obj);
                Objects.toString(attabalVarMonoploid);
                com.bumptech.glide.util.competently.attabal(jSaneness);
            }
            if (attabalVarWireman.attabal(attabalVar) != null) {
                this.f17665adultoid = attabalVar;
                this.f17671polloi = new saneness(Collections.singletonList(this.f17667graveside.f27250attabal), this.f17668kowloon, this);
                this.f17667graveside.f27251dern.saneness();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.f17665adultoid);
                Objects.toString(obj);
            }
            try {
                this.f17666arytenoidectomy.attabal(this.f17667graveside.f27250attabal, marialVarKowloon.attabal(), this.f17667graveside.f27251dern, this.f17667graveside.f27251dern.wireman(), this.f17667graveside.f27250attabal);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f17667graveside.f27251dern.saneness();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
