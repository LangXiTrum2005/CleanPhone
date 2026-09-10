package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.premeiotic;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public class dern extends impassible {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static TimeInterpolator f13398molybdenite;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public ArrayList<RecyclerView.stratoscope> f13404impromptu = new ArrayList<>();

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public ArrayList<RecyclerView.stratoscope> f13408taiyuan = new ArrayList<>();

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public ArrayList<cutely> f13401cutely = new ArrayList<>();

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public ArrayList<taiyuan> f13399apical = new ArrayList<>();

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.stratoscope>> f13402formularize = new ArrayList<>();

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public ArrayList<ArrayList<cutely>> f13403impassible = new ArrayList<>();

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public ArrayList<ArrayList<taiyuan>> f13409triweekly = new ArrayList<>();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public ArrayList<RecyclerView.stratoscope> f13405kowloon = new ArrayList<>();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public ArrayList<RecyclerView.stratoscope> f13400arytenoidectomy = new ArrayList<>();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public ArrayList<RecyclerView.stratoscope> f13406monoploid = new ArrayList<>();

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public ArrayList<RecyclerView.stratoscope> f13407polloi = new ArrayList<>();

    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public class attabal implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ ArrayList f13411kowloon;

        public attabal(ArrayList arrayList) {
            this.f13411kowloon = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (cutely cutelyVar : this.f13411kowloon) {
                dern.this.walach(cutelyVar.f13422attabal, cutelyVar.f13425saneness, cutelyVar.f13423dern, cutelyVar.f13426wireman, cutelyVar.f13424marial);
            }
            this.f13411kowloon.clear();
            dern.this.f13403impassible.remove(this.f13411kowloon);
        }
    }

    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public class beachfront extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.stratoscope f13412attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ View f13414dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f13415marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ int f13416saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ int f13417wireman;

        public beachfront(RecyclerView.stratoscope stratoscopeVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f13412attabal = stratoscopeVar;
            this.f13416saneness = i;
            this.f13414dern = view;
            this.f13417wireman = i2;
            this.f13415marial = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f13416saneness != 0) {
                this.f13414dern.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (this.f13417wireman != 0) {
                this.f13414dern.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13415marial.setListener(null);
            dern.this.yemenite(this.f13412attabal);
            dern.this.f13400arytenoidectomy.remove(this.f13412attabal);
            dern.this.splinterproof();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            dern.this.sealless(this.f13412attabal);
        }
    }

    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public class competently extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ taiyuan f13418attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ View f13419dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f13420saneness;

        public competently(taiyuan taiyuanVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f13418attabal = taiyuanVar;
            this.f13420saneness = viewPropertyAnimator;
            this.f13419dern = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13420saneness.setListener(null);
            this.f13419dern.setAlpha(1.0f);
            this.f13419dern.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f13419dern.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            dern.this.trm(this.f13418attabal.f13439attabal, true);
            dern.this.f13407polloi.remove(this.f13418attabal.f13439attabal);
            dern.this.splinterproof();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            dern.this.oilcan(this.f13418attabal.f13439attabal, true);
        }
    }

    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public static class cutely {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public RecyclerView.stratoscope f13422attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f13423dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f13424marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f13425saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f13426wireman;

        public cutely(RecyclerView.stratoscope stratoscopeVar, int i, int i2, int i3, int i4) {
            this.f13422attabal = stratoscopeVar;
            this.f13425saneness = i;
            this.f13423dern = i2;
            this.f13426wireman = i3;
            this.f13424marial = i4;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.dern$dern, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public class RunnableC0097dern implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ ArrayList f13428kowloon;

        public RunnableC0097dern(ArrayList arrayList) {
            this.f13428kowloon = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f13428kowloon.iterator();
            while (it.hasNext()) {
                dern.this.starveling((RecyclerView.stratoscope) it.next());
            }
            this.f13428kowloon.clear();
            dern.this.f13402formularize.remove(this.f13428kowloon);
        }
    }

    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public class impromptu extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ taiyuan f13429attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ View f13430dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f13431saneness;

        public impromptu(taiyuan taiyuanVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f13429attabal = taiyuanVar;
            this.f13431saneness = viewPropertyAnimator;
            this.f13430dern = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13431saneness.setListener(null);
            this.f13430dern.setAlpha(1.0f);
            this.f13430dern.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f13430dern.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            dern.this.trm(this.f13429attabal.f13443saneness, false);
            dern.this.f13407polloi.remove(this.f13429attabal.f13443saneness);
            dern.this.splinterproof();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            dern.this.oilcan(this.f13429attabal.f13443saneness, false);
        }
    }

    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public class marial extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.stratoscope f13433attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f13434dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ View f13435saneness;

        public marial(RecyclerView.stratoscope stratoscopeVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f13433attabal = stratoscopeVar;
            this.f13435saneness = view;
            this.f13434dern = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13435saneness.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13434dern.setListener(null);
            dern.this.cuirassed(this.f13433attabal);
            dern.this.f13405kowloon.remove(this.f13433attabal);
            dern.this.splinterproof();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            dern.this.stratoscope(this.f13433attabal);
        }
    }

    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public class saneness implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ ArrayList f13438kowloon;

        public saneness(ArrayList arrayList) {
            this.f13438kowloon = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f13438kowloon.iterator();
            while (it.hasNext()) {
                dern.this.hydrovane((taiyuan) it.next());
            }
            this.f13438kowloon.clear();
            dern.this.f13409triweekly.remove(this.f13438kowloon);
        }
    }

    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public class wireman extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.stratoscope f13445attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ View f13446dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f13447saneness;

        public wireman(RecyclerView.stratoscope stratoscopeVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f13445attabal = stratoscopeVar;
            this.f13447saneness = viewPropertyAnimator;
            this.f13446dern = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13447saneness.setListener(null);
            this.f13446dern.setAlpha(1.0f);
            dern.this.kattegat(this.f13445attabal);
            dern.this.f13406monoploid.remove(this.f13445attabal);
            dern.this.splinterproof();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            dern.this.supplicat(this.f13445attabal);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.formularize
    public void adultoid() {
        boolean zIsEmpty = this.f13404impromptu.isEmpty();
        boolean zIsEmpty2 = this.f13401cutely.isEmpty();
        boolean zIsEmpty3 = this.f13399apical.isEmpty();
        boolean zIsEmpty4 = this.f13408taiyuan.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator<RecyclerView.stratoscope> it = this.f13404impromptu.iterator();
        while (it.hasNext()) {
            peridotite(it.next());
        }
        this.f13404impromptu.clear();
        if (!zIsEmpty2) {
            ArrayList<cutely> arrayList = new ArrayList<>();
            arrayList.addAll(this.f13401cutely);
            this.f13403impassible.add(arrayList);
            this.f13401cutely.clear();
            attabal attabalVar = new attabal(arrayList);
            if (zIsEmpty) {
                attabalVar.run();
            } else {
                premeiotic.milliradian(arrayList.get(0).f13422attabal.itemView, attabalVar, kowloon());
            }
        }
        if (!zIsEmpty3) {
            ArrayList<taiyuan> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f13399apical);
            this.f13409triweekly.add(arrayList2);
            this.f13399apical.clear();
            saneness sanenessVar = new saneness(arrayList2);
            if (zIsEmpty) {
                sanenessVar.run();
            } else {
                premeiotic.milliradian(arrayList2.get(0).f13439attabal.itemView, sanenessVar, kowloon());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.stratoscope> arrayList3 = new ArrayList<>();
        arrayList3.addAll(this.f13408taiyuan);
        this.f13402formularize.add(arrayList3);
        this.f13408taiyuan.clear();
        RunnableC0097dern runnableC0097dern = new RunnableC0097dern(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnableC0097dern.run();
        } else {
            premeiotic.milliradian(arrayList3.get(0).itemView, runnableC0097dern, (!zIsEmpty ? kowloon() : 0L) + Math.max(!zIsEmpty2 ? triweekly() : 0L, zIsEmpty3 ? 0L : impassible()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.formularize
    public void apical() {
        int size = this.f13401cutely.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            cutely cutelyVar = this.f13401cutely.get(size);
            View view = cutelyVar.f13422attabal.itemView;
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            yemenite(cutelyVar.f13422attabal);
            this.f13401cutely.remove(size);
        }
        for (int size2 = this.f13404impromptu.size() - 1; size2 >= 0; size2--) {
            kattegat(this.f13404impromptu.get(size2));
            this.f13404impromptu.remove(size2);
        }
        int size3 = this.f13408taiyuan.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.stratoscope stratoscopeVar = this.f13408taiyuan.get(size3);
            stratoscopeVar.itemView.setAlpha(1.0f);
            cuirassed(stratoscopeVar);
            this.f13408taiyuan.remove(size3);
        }
        for (int size4 = this.f13399apical.size() - 1; size4 >= 0; size4--) {
            clubfoot(this.f13399apical.get(size4));
        }
        this.f13399apical.clear();
        if (arytenoidectomy()) {
            for (int size5 = this.f13403impassible.size() - 1; size5 >= 0; size5--) {
                ArrayList<cutely> arrayList = this.f13403impassible.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    cutely cutelyVar2 = arrayList.get(size6);
                    View view2 = cutelyVar2.f13422attabal.itemView;
                    view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    yemenite(cutelyVar2.f13422attabal);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f13403impassible.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f13402formularize.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.stratoscope> arrayList2 = this.f13402formularize.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.stratoscope stratoscopeVar2 = arrayList2.get(size8);
                    stratoscopeVar2.itemView.setAlpha(1.0f);
                    cuirassed(stratoscopeVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f13402formularize.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f13409triweekly.size() - 1; size9 >= 0; size9--) {
                ArrayList<taiyuan> arrayList3 = this.f13409triweekly.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    clubfoot(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f13409triweekly.remove(arrayList3);
                    }
                }
            }
            mathsort(this.f13406monoploid);
            mathsort(this.f13400arytenoidectomy);
            mathsort(this.f13405kowloon);
            mathsort(this.f13407polloi);
            taiyuan();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.formularize
    public boolean arytenoidectomy() {
        return (this.f13408taiyuan.isEmpty() && this.f13399apical.isEmpty() && this.f13401cutely.isEmpty() && this.f13404impromptu.isEmpty() && this.f13400arytenoidectomy.isEmpty() && this.f13406monoploid.isEmpty() && this.f13405kowloon.isEmpty() && this.f13407polloi.isEmpty() && this.f13403impassible.isEmpty() && this.f13402formularize.isEmpty() && this.f13409triweekly.isEmpty()) ? false : true;
    }

    public final void clubfoot(taiyuan taiyuanVar) {
        RecyclerView.stratoscope stratoscopeVar = taiyuanVar.f13439attabal;
        if (stratoscopeVar != null) {
            dent(taiyuanVar, stratoscopeVar);
        }
        RecyclerView.stratoscope stratoscopeVar2 = taiyuanVar.f13443saneness;
        if (stratoscopeVar2 != null) {
            dent(taiyuanVar, stratoscopeVar2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.formularize
    public boolean competently(RecyclerView.stratoscope stratoscopeVar, List<Object> list) {
        return !list.isEmpty() || super.competently(stratoscopeVar, list);
    }

    @Override // androidx.recyclerview.widget.impassible
    public boolean cord(RecyclerView.stratoscope stratoscopeVar) {
        permissivist(stratoscopeVar);
        this.f13404impromptu.add(stratoscopeVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.formularize
    public void cutely(RecyclerView.stratoscope stratoscopeVar) {
        View view = stratoscopeVar.itemView;
        view.animate().cancel();
        int size = this.f13401cutely.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f13401cutely.get(size).f13422attabal == stratoscopeVar) {
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                yemenite(stratoscopeVar);
                this.f13401cutely.remove(size);
            }
        }
        overspeculate(this.f13399apical, stratoscopeVar);
        if (this.f13404impromptu.remove(stratoscopeVar)) {
            view.setAlpha(1.0f);
            kattegat(stratoscopeVar);
        }
        if (this.f13408taiyuan.remove(stratoscopeVar)) {
            view.setAlpha(1.0f);
            cuirassed(stratoscopeVar);
        }
        for (int size2 = this.f13409triweekly.size() - 1; size2 >= 0; size2--) {
            ArrayList<taiyuan> arrayList = this.f13409triweekly.get(size2);
            overspeculate(arrayList, stratoscopeVar);
            if (arrayList.isEmpty()) {
                this.f13409triweekly.remove(size2);
            }
        }
        for (int size3 = this.f13403impassible.size() - 1; size3 >= 0; size3--) {
            ArrayList<cutely> arrayList2 = this.f13403impassible.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f13422attabal == stratoscopeVar) {
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    yemenite(stratoscopeVar);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f13403impassible.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f13402formularize.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.stratoscope> arrayList3 = this.f13402formularize.get(size5);
            if (arrayList3.remove(stratoscopeVar)) {
                view.setAlpha(1.0f);
                cuirassed(stratoscopeVar);
                if (arrayList3.isEmpty()) {
                    this.f13402formularize.remove(size5);
                }
            }
        }
        this.f13406monoploid.remove(stratoscopeVar);
        this.f13405kowloon.remove(stratoscopeVar);
        this.f13407polloi.remove(stratoscopeVar);
        this.f13400arytenoidectomy.remove(stratoscopeVar);
        splinterproof();
    }

    public final boolean dent(taiyuan taiyuanVar, RecyclerView.stratoscope stratoscopeVar) {
        boolean z = false;
        if (taiyuanVar.f13443saneness == stratoscopeVar) {
            taiyuanVar.f13443saneness = null;
        } else {
            if (taiyuanVar.f13439attabal != stratoscopeVar) {
                return false;
            }
            taiyuanVar.f13439attabal = null;
            z = true;
        }
        stratoscopeVar.itemView.setAlpha(1.0f);
        stratoscopeVar.itemView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        stratoscopeVar.itemView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        trm(stratoscopeVar, z);
        return true;
    }

    @Override // androidx.recyclerview.widget.impassible
    public boolean gintrap(RecyclerView.stratoscope stratoscopeVar) {
        permissivist(stratoscopeVar);
        stratoscopeVar.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f13408taiyuan.add(stratoscopeVar);
        return true;
    }

    public void hydrovane(taiyuan taiyuanVar) {
        RecyclerView.stratoscope stratoscopeVar = taiyuanVar.f13439attabal;
        View view = stratoscopeVar == null ? null : stratoscopeVar.itemView;
        RecyclerView.stratoscope stratoscopeVar2 = taiyuanVar.f13443saneness;
        View view2 = stratoscopeVar2 != null ? stratoscopeVar2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(impassible());
            this.f13407polloi.add(taiyuanVar.f13439attabal);
            duration.translationX(taiyuanVar.f13442marial - taiyuanVar.f13441dern);
            duration.translationY(taiyuanVar.f13440beachfront - taiyuanVar.f13444wireman);
            duration.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new competently(taiyuanVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f13407polloi.add(taiyuanVar.f13443saneness);
            viewPropertyAnimatorAnimate.translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(impassible()).alpha(1.0f).setListener(new impromptu(taiyuanVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    public void mathsort(List<RecyclerView.stratoscope> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public final void overspeculate(List<taiyuan> list, RecyclerView.stratoscope stratoscopeVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            taiyuan taiyuanVar = list.get(size);
            if (dent(taiyuanVar, stratoscopeVar) && taiyuanVar.f13439attabal == null && taiyuanVar.f13443saneness == null) {
                list.remove(taiyuanVar);
            }
        }
    }

    public final void peridotite(RecyclerView.stratoscope stratoscopeVar) {
        View view = stratoscopeVar.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f13406monoploid.add(stratoscopeVar);
        viewPropertyAnimatorAnimate.setDuration(kowloon()).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new wireman(stratoscopeVar, viewPropertyAnimatorAnimate, view)).start();
    }

    public final void permissivist(RecyclerView.stratoscope stratoscopeVar) {
        if (f13398molybdenite == null) {
            f13398molybdenite = new ValueAnimator().getInterpolator();
        }
        stratoscopeVar.itemView.animate().setInterpolator(f13398molybdenite);
        cutely(stratoscopeVar);
    }

    @Override // androidx.recyclerview.widget.impassible
    public boolean preprohormone(RecyclerView.stratoscope stratoscopeVar, int i, int i2, int i3, int i4) {
        View view = stratoscopeVar.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) stratoscopeVar.itemView.getTranslationY());
        permissivist(stratoscopeVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            yemenite(stratoscopeVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f13401cutely.add(new cutely(stratoscopeVar, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.impassible
    public boolean rotuma(RecyclerView.stratoscope stratoscopeVar, RecyclerView.stratoscope stratoscopeVar2, int i, int i2, int i3, int i4) {
        if (stratoscopeVar == stratoscopeVar2) {
            return preprohormone(stratoscopeVar, i, i2, i3, i4);
        }
        float translationX = stratoscopeVar.itemView.getTranslationX();
        float translationY = stratoscopeVar.itemView.getTranslationY();
        float alpha = stratoscopeVar.itemView.getAlpha();
        permissivist(stratoscopeVar);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        stratoscopeVar.itemView.setTranslationX(translationX);
        stratoscopeVar.itemView.setTranslationY(translationY);
        stratoscopeVar.itemView.setAlpha(alpha);
        if (stratoscopeVar2 != null) {
            permissivist(stratoscopeVar2);
            stratoscopeVar2.itemView.setTranslationX(-i5);
            stratoscopeVar2.itemView.setTranslationY(-i6);
            stratoscopeVar2.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.f13399apical.add(new taiyuan(stratoscopeVar, stratoscopeVar2, i, i2, i3, i4));
        return true;
    }

    public void splinterproof() {
        if (arytenoidectomy()) {
            return;
        }
        taiyuan();
    }

    public void starveling(RecyclerView.stratoscope stratoscopeVar) {
        View view = stratoscopeVar.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f13405kowloon.add(stratoscopeVar);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(formularize()).setListener(new marial(stratoscopeVar, view, viewPropertyAnimatorAnimate)).start();
    }

    public void walach(RecyclerView.stratoscope stratoscopeVar, int i, int i2, int i3, int i4) {
        View view = stratoscopeVar.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (i6 != 0) {
            view.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f13400arytenoidectomy.add(stratoscopeVar);
        viewPropertyAnimatorAnimate.setDuration(triweekly()).setListener(new beachfront(stratoscopeVar, i5, view, i6, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public static class taiyuan {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public RecyclerView.stratoscope f13439attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public int f13440beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f13441dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f13442marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public RecyclerView.stratoscope f13443saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f13444wireman;

        public taiyuan(RecyclerView.stratoscope stratoscopeVar, RecyclerView.stratoscope stratoscopeVar2) {
            this.f13439attabal = stratoscopeVar;
            this.f13443saneness = stratoscopeVar2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f13439attabal + ", newHolder=" + this.f13443saneness + ", fromX=" + this.f13441dern + ", fromY=" + this.f13444wireman + ", toX=" + this.f13442marial + ", toY=" + this.f13440beachfront + '}';
        }

        public taiyuan(RecyclerView.stratoscope stratoscopeVar, RecyclerView.stratoscope stratoscopeVar2, int i, int i2, int i3, int i4) {
            this(stratoscopeVar, stratoscopeVar2);
            this.f13441dern = i;
            this.f13444wireman = i2;
            this.f13442marial = i3;
            this.f13440beachfront = i4;
        }
    }
}
