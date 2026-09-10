package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import regius.arytenoidectomy;
import regius.cutely;
import regius.formularize;
import regius.molybdenite;
import regius.monoploid;

/* JADX INFO: compiled from: RequestManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class impromptu implements ComponentCallbacks2, formularize {

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public static final awlwort.competently f17554cuirassed = awlwort.competently.permissivist(Bitmap.class).seminary();

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public static final awlwort.competently f17555stratoscope = awlwort.competently.permissivist(sevenfold.dern.class).seminary();

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public static final awlwort.competently f17556trm = awlwort.competently.cultivated(endosteum.dern.f25715dern).saran(Priority.LOW).mathsort(true);

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final Runnable f17557adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Context f17558arytenoidectomy;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public boolean f17559cord;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final regius.saneness f17560dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final CopyOnWriteArrayList<awlwort.beachfront<Object>> f17561gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final molybdenite f17562graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final com.bumptech.glide.saneness f17563kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final arytenoidectomy f17564molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final cutely f17565monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final monoploid f17566polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public boolean f17567preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public awlwort.competently f17568rotuma;

    /* JADX INFO: compiled from: RequestManager.java */
    public class attabal implements Runnable {
        public attabal() {
        }

        @Override // java.lang.Runnable
        public void run() {
            impromptu impromptuVar = impromptu.this;
            impromptuVar.f17565monoploid.saneness(impromptuVar);
        }
    }

    /* JADX INFO: compiled from: RequestManager.java */
    public class saneness implements regius.saneness.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final monoploid f17570attabal;

        public saneness(monoploid monoploidVar) {
            this.f17570attabal = monoploidVar;
        }

        @Override // regius.saneness.attabal
        public void attabal(boolean z) {
            if (z) {
                synchronized (impromptu.this) {
                    this.f17570attabal.marial();
                }
            }
        }
    }

    public impromptu(com.bumptech.glide.saneness sanenessVar, cutely cutelyVar, arytenoidectomy arytenoidectomyVar, Context context) {
        this(sanenessVar, cutelyVar, arytenoidectomyVar, new monoploid(), sanenessVar.competently(), context);
    }

    public synchronized void adultoid(belongingness.wireman<?> wiremanVar, awlwort.wireman wiremanVar2) {
        this.f17562graveside.taiyuan(wiremanVar);
        this.f17566polloi.competently(wiremanVar2);
    }

    public synchronized void arytenoidectomy() {
        this.f17566polloi.dern();
    }

    public competently<Bitmap> competently() {
        return dern(Bitmap.class).attabal(f17554cuirassed);
    }

    public <ResourceType> competently<ResourceType> dern(Class<ResourceType> cls) {
        return new competently<>(this.f17563kowloon, this, cls, this.f17558arytenoidectomy);
    }

    public synchronized boolean dovishness(belongingness.wireman<?> wiremanVar) {
        awlwort.wireman wiremanVarMarial = wiremanVar.marial();
        if (wiremanVarMarial == null) {
            return true;
        }
        if (!this.f17566polloi.attabal(wiremanVarMarial)) {
            return false;
        }
        this.f17562graveside.formularize(wiremanVar);
        wiremanVar.cutely(null);
        return true;
    }

    public final synchronized void formularize() {
        try {
            Iterator<belongingness.wireman<?>> it = this.f17562graveside.competently().iterator();
            while (it.hasNext()) {
                taiyuan(it.next());
            }
            this.f17562graveside.dern();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void gintrap(belongingness.wireman<?> wiremanVar) {
        boolean zDovishness = dovishness(wiremanVar);
        awlwort.wireman wiremanVarMarial = wiremanVar.marial();
        if (zDovishness || this.f17563kowloon.arytenoidectomy(wiremanVar) || wiremanVarMarial == null) {
            return;
        }
        wiremanVar.cutely(null);
        wiremanVarMarial.clear();
    }

    public synchronized void graveside(awlwort.competently competentlyVar) {
        this.f17568rotuma = competentlyVar.clone().dern();
    }

    public List<awlwort.beachfront<Object>> impassible() {
        return this.f17561gintrap;
    }

    public <T> taiyuan<?, T> kowloon(Class<T> cls) {
        return this.f17563kowloon.taiyuan().wireman(cls);
    }

    public synchronized void molybdenite() {
        this.f17566polloi.beachfront();
    }

    public synchronized void monoploid() {
        arytenoidectomy();
        Iterator<impromptu> it = this.f17564molybdenite.attabal().iterator();
        while (it.hasNext()) {
            it.next().arytenoidectomy();
        }
    }

    @Override // regius.formularize
    public synchronized void onDestroy() {
        this.f17562graveside.onDestroy();
        formularize();
        this.f17566polloi.saneness();
        this.f17565monoploid.attabal(this);
        this.f17565monoploid.attabal(this.f17560dovishness);
        com.bumptech.glide.util.formularize.rotuma(this.f17557adultoid);
        this.f17563kowloon.molybdenite(this);
    }

    @Override // regius.formularize
    public synchronized void onStart() {
        molybdenite();
        this.f17562graveside.onStart();
    }

    @Override // regius.formularize
    public synchronized void onStop() {
        try {
            this.f17562graveside.onStop();
            if (this.f17559cord) {
                formularize();
            } else {
                polloi();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.f17567preprohormone) {
            monoploid();
        }
    }

    public synchronized void polloi() {
        this.f17566polloi.wireman();
    }

    public void taiyuan(belongingness.wireman<?> wiremanVar) {
        if (wiremanVar == null) {
            return;
        }
        gintrap(wiremanVar);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f17566polloi + ", treeNode=" + this.f17564molybdenite + "}";
    }

    public synchronized awlwort.competently triweekly() {
        return this.f17568rotuma;
    }

    public impromptu(com.bumptech.glide.saneness sanenessVar, cutely cutelyVar, arytenoidectomy arytenoidectomyVar, monoploid monoploidVar, regius.dern dernVar, Context context) {
        this.f17562graveside = new molybdenite();
        attabal attabalVar = new attabal();
        this.f17557adultoid = attabalVar;
        this.f17563kowloon = sanenessVar;
        this.f17565monoploid = cutelyVar;
        this.f17564molybdenite = arytenoidectomyVar;
        this.f17566polloi = monoploidVar;
        this.f17558arytenoidectomy = context;
        regius.saneness sanenessVarAttabal = dernVar.attabal(context.getApplicationContext(), new saneness(monoploidVar));
        this.f17560dovishness = sanenessVarAttabal;
        sanenessVar.kowloon(this);
        if (com.bumptech.glide.util.formularize.molybdenite()) {
            com.bumptech.glide.util.formularize.gintrap(attabalVar);
        } else {
            cutelyVar.saneness(this);
        }
        cutelyVar.saneness(sanenessVarAttabal);
        this.f17561gintrap = new CopyOnWriteArrayList<>(sanenessVar.taiyuan().saneness());
        graveside(sanenessVar.taiyuan().dern());
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
