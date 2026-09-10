package com.bumptech.glide.load.engine;

import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import glutethimide.kowloon;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import speck.triweekly;

/* JADX INFO: compiled from: DecodeHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wireman<Transcode> {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public Class<Transcode> f17780apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public endosteum.dern f17781arytenoidectomy;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f17783beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public Class<?> f17784competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public Map<Class<?>, maggot.competently<?>> f17785cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public com.bumptech.glide.wireman f17786dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public boolean f17787formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public boolean f17788impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public DecodeJob.marial f17789impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public Priority f17790kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f17791marial;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public boolean f17792monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f17793polloi;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public maggot.wireman f17795taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public maggot.saneness f17796triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public Object f17797wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<kowloon.attabal<?>> f17782attabal = new ArrayList();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<maggot.saneness> f17794saneness = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public boolean adultoid(Class<?> cls) {
        return impromptu(cls) != null;
    }

    public maggot.wireman apical() {
        return this.f17795taiyuan;
    }

    public maggot.saneness arytenoidectomy() {
        return this.f17796triweekly;
    }

    public void attabal() {
        this.f17786dern = null;
        this.f17797wireman = null;
        this.f17796triweekly = null;
        this.f17784competently = null;
        this.f17780apical = null;
        this.f17795taiyuan = null;
        this.f17790kowloon = null;
        this.f17785cutely = null;
        this.f17781arytenoidectomy = null;
        this.f17782attabal.clear();
        this.f17787formularize = false;
        this.f17794saneness.clear();
        this.f17788impassible = false;
    }

    public int beachfront() {
        return this.f17783beachfront;
    }

    public List<kowloon.attabal<?>> competently() {
        if (!this.f17787formularize) {
            this.f17787formularize = true;
            this.f17782attabal.clear();
            List listTaiyuan = this.f17786dern.impromptu().taiyuan(this.f17797wireman);
            int size = listTaiyuan.size();
            for (int i = 0; i < size; i++) {
                kowloon.attabal<?> attabalVarSaneness = ((kowloon) listTaiyuan.get(i)).saneness(this.f17797wireman, this.f17791marial, this.f17783beachfront, this.f17795taiyuan);
                if (attabalVarSaneness != null) {
                    this.f17782attabal.add(attabalVarSaneness);
                }
            }
        }
        return this.f17782attabal;
    }

    public List<kowloon<File, ?>> cutely(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f17786dern.impromptu().taiyuan(file);
    }

    public List<maggot.saneness> dern() {
        if (!this.f17788impassible) {
            this.f17788impassible = true;
            this.f17794saneness.clear();
            List<kowloon.attabal<?>> listCompetently = competently();
            int size = listCompetently.size();
            for (int i = 0; i < size; i++) {
                kowloon.attabal<?> attabalVar = listCompetently.get(i);
                if (!this.f17794saneness.contains(attabalVar.f27250attabal)) {
                    this.f17794saneness.add(attabalVar.f27250attabal);
                }
                for (int i2 = 0; i2 < attabalVar.f27252saneness.size(); i2++) {
                    if (!this.f17794saneness.contains(attabalVar.f27252saneness.get(i2))) {
                        this.f17794saneness.add(attabalVar.f27252saneness.get(i2));
                    }
                }
            }
        }
        return this.f17794saneness;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <R> void dovishness(com.bumptech.glide.wireman wiremanVar, Object obj, maggot.saneness sanenessVar, int i, int i2, endosteum.dern dernVar, Class<?> cls, Class<R> cls2, Priority priority, maggot.wireman wiremanVar2, Map<Class<?>, maggot.competently<?>> map, boolean z, boolean z2, DecodeJob.marial marialVar) {
        this.f17786dern = wiremanVar;
        this.f17797wireman = obj;
        this.f17796triweekly = sanenessVar;
        this.f17791marial = i;
        this.f17783beachfront = i2;
        this.f17781arytenoidectomy = dernVar;
        this.f17784competently = cls;
        this.f17789impromptu = marialVar;
        this.f17780apical = cls2;
        this.f17790kowloon = priority;
        this.f17795taiyuan = wiremanVar2;
        this.f17785cutely = map;
        this.f17792monoploid = z;
        this.f17793polloi = z2;
    }

    public Priority formularize() {
        return this.f17790kowloon;
    }

    public boolean gintrap(endosteum.cutely<?> cutelyVar) {
        return this.f17786dern.impromptu().triweekly(cutelyVar);
    }

    public int graveside() {
        return this.f17791marial;
    }

    public List<Class<?>> impassible() {
        return this.f17786dern.impromptu().cutely(this.f17797wireman.getClass(), this.f17784competently, this.f17780apical);
    }

    public <Data> taiyuan<Data, ?, Transcode> impromptu(Class<Data> cls) {
        return this.f17786dern.impromptu().impromptu(cls, this.f17784competently, this.f17780apical);
    }

    public <T> com.bumptech.glide.load.data.marial<T> kowloon(T t) {
        return this.f17786dern.impromptu().formularize(t);
    }

    public endosteum.dern marial() {
        return this.f17781arytenoidectomy;
    }

    public <Z> maggot.competently<Z> molybdenite(Class<Z> cls) {
        maggot.competently<Z> competentlyVar = (maggot.competently) this.f17785cutely.get(cls);
        if (competentlyVar == null) {
            for (Map.Entry<Class<?>, maggot.competently<?>> entry : this.f17785cutely.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    competentlyVar = (maggot.competently) entry.getValue();
                    break;
                }
            }
        }
        if (competentlyVar != null) {
            return competentlyVar;
        }
        if (!this.f17785cutely.isEmpty() || !this.f17792monoploid) {
            return triweekly.dern();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    public <X> maggot.attabal<X> monoploid(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.f17786dern.impromptu().impassible(x);
    }

    public Class<?> polloi() {
        return this.f17780apical;
    }

    public boolean preprohormone(maggot.saneness sanenessVar) {
        List<kowloon.attabal<?>> listCompetently = competently();
        int size = listCompetently.size();
        for (int i = 0; i < size; i++) {
            if (listCompetently.get(i).f27250attabal.equals(sanenessVar)) {
                return true;
            }
        }
        return false;
    }

    public boolean rotuma() {
        return this.f17793polloi;
    }

    public trawler.saneness saneness() {
        return this.f17786dern.attabal();
    }

    public Class<?> taiyuan() {
        return this.f17797wireman.getClass();
    }

    public <Z> maggot.beachfront<Z> triweekly(endosteum.cutely<Z> cutelyVar) {
        return this.f17786dern.impromptu().apical(cutelyVar);
    }

    public hemolysin.attabal wireman() {
        return this.f17789impromptu.attabal();
    }
}
