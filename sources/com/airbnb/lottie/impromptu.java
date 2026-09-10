package com.airbnb.lottie;

import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: LottieComposition.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public Rect f15972apical;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public Map<String, lamplit.saneness> f15975beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public List<lamplit.competently> f15976competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public List<Layer> f15977cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Map<String, List<Layer>> f15978dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public float f15979formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public float f15980impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public androidx.collection.overspeculate<lamplit.dern> f15981impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public boolean f15982kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public float f15983marial;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f15984monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f15985polloi;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public androidx.collection.gintrap<Layer> f15987taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public float f15988triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public Map<String, seminary> f15989wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final mathsort f15974attabal = new mathsort();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final HashSet<String> f15986saneness = new HashSet<>();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f15973arytenoidectomy = 0;

    public void adultoid(boolean z) {
        this.f15982kowloon = z;
    }

    public List<Layer> apical() {
        return this.f15977cutely;
    }

    public float arytenoidectomy() {
        return this.f15979formularize;
    }

    public void attabal(String str) {
        utwa.beachfront.dern(str);
        this.f15986saneness.add(str);
    }

    public float beachfront() {
        return this.f15980impassible;
    }

    public Map<String, lamplit.saneness> competently() {
        return this.f15975beachfront;
    }

    public Map<String, seminary> cutely() {
        float fMarial = utwa.arytenoidectomy.marial();
        if (fMarial != this.f15983marial) {
            for (Map.Entry<String, seminary> entry : this.f15989wireman.entrySet()) {
                this.f15989wireman.put(entry.getKey(), entry.getValue().attabal(this.f15983marial / fMarial));
            }
        }
        this.f15983marial = fMarial;
        return this.f15989wireman;
    }

    public androidx.collection.overspeculate<lamplit.dern> dern() {
        return this.f15981impromptu;
    }

    public void dovishness(boolean z) {
        this.f15974attabal.saneness(z);
    }

    public lamplit.competently formularize(String str) {
        int size = this.f15976competently.size();
        for (int i = 0; i < size; i++) {
            lamplit.competently competentlyVar = this.f15976competently.get(i);
            if (competentlyVar.attabal(str)) {
                return competentlyVar;
            }
        }
        return null;
    }

    public Layer graveside(long j) {
        return this.f15987taiyuan.marial(j);
    }

    public int impassible() {
        return this.f15973arytenoidectomy;
    }

    public float impromptu(float f) {
        return utwa.apical.taiyuan(this.f15979formularize, this.f15980impassible, f);
    }

    public List<Layer> kowloon(String str) {
        return this.f15978dern.get(str);
    }

    public float marial() {
        return this.f15980impassible - this.f15979formularize;
    }

    public void molybdenite(Rect rect, float f, float f2, float f3, List<Layer> list, androidx.collection.gintrap<Layer> gintrapVar, Map<String, List<Layer>> map, Map<String, seminary> map2, float f4, androidx.collection.overspeculate<lamplit.dern> overspeculateVar, Map<String, lamplit.saneness> map3, List<lamplit.competently> list2, int i, int i2) {
        this.f15972apical = rect;
        this.f15979formularize = f;
        this.f15980impassible = f2;
        this.f15988triweekly = f3;
        this.f15977cutely = list;
        this.f15987taiyuan = gintrapVar;
        this.f15978dern = map;
        this.f15989wireman = map2;
        this.f15983marial = f4;
        this.f15981impromptu = overspeculateVar;
        this.f15975beachfront = map3;
        this.f15976competently = list2;
        this.f15984monoploid = i;
        this.f15985polloi = i2;
    }

    public boolean monoploid() {
        return this.f15982kowloon;
    }

    public void polloi(int i) {
        this.f15973arytenoidectomy += i;
    }

    public Rect saneness() {
        return this.f15972apical;
    }

    public float taiyuan() {
        return this.f15988triweekly;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<Layer> it = this.f15977cutely.iterator();
        while (it.hasNext()) {
            sb.append(it.next().cord("\t"));
        }
        return sb.toString();
    }

    public mathsort triweekly() {
        return this.f15974attabal;
    }

    public float wireman() {
        return (long) ((marial() / this.f15988triweekly) * 1000.0f);
    }
}
