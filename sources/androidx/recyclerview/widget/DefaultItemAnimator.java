package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v4.media.a;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class DefaultItemAnimator extends SimpleItemAnimator {
    public static TimeInterpolator s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f8009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f8010i;
    public ArrayList j;
    public ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f8011l;
    public ArrayList m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f8012n;
    public ArrayList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f8013p;
    public ArrayList q;
    public ArrayList r;

    public static class ChangeInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.ViewHolder f8022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.ViewHolder f8023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8024c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8025e;
        public int f;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f8022a);
            sb.append(", newHolder=");
            sb.append(this.f8023b);
            sb.append(", fromX=");
            sb.append(this.f8024c);
            sb.append(", fromY=");
            sb.append(this.d);
            sb.append(", toX=");
            sb.append(this.f8025e);
            sb.append(", toY=");
            return a.p(sb, this.f, AbstractJsonLexerKt.END_OBJ);
        }
    }

    public static class MoveInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.ViewHolder f8026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8028c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8029e;
    }

    public static void q(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.ViewHolder) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean g(RecyclerView.ViewHolder viewHolder, List list) {
        return !list.isEmpty() || f(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void i(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((MoveInfo) arrayList.get(size)).f8026a == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                h(viewHolder);
                arrayList.remove(size);
            }
        }
        s(this.k, viewHolder);
        if (this.f8009h.remove(viewHolder)) {
            view.setAlpha(1.0f);
            h(viewHolder);
        }
        if (this.f8010i.remove(viewHolder)) {
            view.setAlpha(1.0f);
            h(viewHolder);
        }
        ArrayList arrayList2 = this.f8012n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            s(arrayList3, viewHolder);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (((MoveInfo) arrayList5.get(size4)).f8026a == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    h(viewHolder);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.f8011l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(viewHolder)) {
                view.setAlpha(1.0f);
                h(viewHolder);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(viewHolder);
        this.o.remove(viewHolder);
        this.r.remove(viewHolder);
        this.f8013p.remove(viewHolder);
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void j() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            MoveInfo moveInfo = (MoveInfo) arrayList.get(size);
            View view = moveInfo.f8026a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            h(moveInfo.f8026a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f8009h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            h((RecyclerView.ViewHolder) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f8010i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) arrayList3.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            h(viewHolder);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ChangeInfo changeInfo = (ChangeInfo) arrayList4.get(size4);
            RecyclerView.ViewHolder viewHolder2 = changeInfo.f8022a;
            if (viewHolder2 != null) {
                t(changeInfo, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = changeInfo.f8023b;
            if (viewHolder3 != null) {
                t(changeInfo, viewHolder3);
            }
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    MoveInfo moveInfo2 = (MoveInfo) arrayList6.get(size6);
                    View view2 = moveInfo2.f8026a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    h(moveInfo2.f8026a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f8011l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder4 = (RecyclerView.ViewHolder) arrayList8.get(size8);
                    viewHolder4.itemView.setAlpha(1.0f);
                    h(viewHolder4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f8012n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    ChangeInfo changeInfo2 = (ChangeInfo) arrayList10.get(size10);
                    RecyclerView.ViewHolder viewHolder5 = changeInfo2.f8022a;
                    if (viewHolder5 != null) {
                        t(changeInfo2, viewHolder5);
                    }
                    RecyclerView.ViewHolder viewHolder6 = changeInfo2.f8023b;
                    if (viewHolder6 != null) {
                        t(changeInfo2, viewHolder6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            q(this.q);
            q(this.f8013p);
            q(this.o);
            q(this.r);
            ArrayList arrayList11 = this.f8095b;
            int size11 = arrayList11.size();
            for (int i2 = 0; i2 < size11; i2++) {
                ((RecyclerView.ItemAnimator.ItemAnimatorFinishedListener) arrayList11.get(i2)).a();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean k() {
        return (this.f8010i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.f8009h.isEmpty() && this.f8013p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.f8011l.isEmpty() && this.f8012n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void l() {
        long j;
        ArrayList arrayList = this.f8009h;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.j;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.k;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f8010i;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            j = this.d;
            if (!zHasNext) {
                break;
            }
            final RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) it.next();
            final View view = viewHolder.itemView;
            final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.q.add(viewHolder);
            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    viewPropertyAnimatorAnimate.setListener(null);
                    view.setAlpha(1.0f);
                    DefaultItemAnimator defaultItemAnimator = this;
                    RecyclerView.ViewHolder viewHolder2 = viewHolder;
                    defaultItemAnimator.h(viewHolder2);
                    defaultItemAnimator.q.remove(viewHolder2);
                    defaultItemAnimator.r();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    this.getClass();
                }
            }).start();
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            final ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.m.add(arrayList5);
            arrayList2.clear();
            Runnable runnable = new Runnable() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.1
                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList arrayList6 = arrayList5;
                    Iterator it2 = arrayList6.iterator();
                    while (true) {
                        boolean zHasNext2 = it2.hasNext();
                        final DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                        if (!zHasNext2) {
                            arrayList6.clear();
                            defaultItemAnimator.m.remove(arrayList6);
                            return;
                        }
                        MoveInfo moveInfo = (MoveInfo) it2.next();
                        final RecyclerView.ViewHolder viewHolder2 = moveInfo.f8026a;
                        defaultItemAnimator.getClass();
                        final View view2 = viewHolder2.itemView;
                        final int i2 = moveInfo.d - moveInfo.f8027b;
                        final int i3 = moveInfo.f8029e - moveInfo.f8028c;
                        if (i2 != 0) {
                            view2.animate().translationX(0.0f);
                        }
                        if (i3 != 0) {
                            view2.animate().translationY(0.0f);
                        }
                        final ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                        defaultItemAnimator.f8013p.add(viewHolder2);
                        viewPropertyAnimatorAnimate2.setDuration(defaultItemAnimator.f8097e).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.6
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animator) {
                                int i4 = i2;
                                View view3 = view2;
                                if (i4 != 0) {
                                    view3.setTranslationX(0.0f);
                                }
                                if (i3 != 0) {
                                    view3.setTranslationY(0.0f);
                                }
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                viewPropertyAnimatorAnimate2.setListener(null);
                                DefaultItemAnimator defaultItemAnimator2 = DefaultItemAnimator.this;
                                RecyclerView.ViewHolder viewHolder3 = viewHolder2;
                                defaultItemAnimator2.h(viewHolder3);
                                defaultItemAnimator2.f8013p.remove(viewHolder3);
                                defaultItemAnimator2.r();
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                                DefaultItemAnimator.this.getClass();
                            }
                        }).start();
                    }
                }
            };
            if (zIsEmpty) {
                runnable.run();
            } else {
                View view2 = ((MoveInfo) arrayList5.get(0)).f8026a.itemView;
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                view2.postOnAnimationDelayed(runnable, j);
            }
        }
        if (!zIsEmpty3) {
            final ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.f8012n.add(arrayList6);
            arrayList3.clear();
            Runnable runnable2 = new Runnable() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.2
                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList arrayList7 = arrayList6;
                    Iterator it2 = arrayList7.iterator();
                    while (true) {
                        boolean zHasNext2 = it2.hasNext();
                        final DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                        if (!zHasNext2) {
                            arrayList7.clear();
                            defaultItemAnimator.f8012n.remove(arrayList7);
                            return;
                        }
                        final ChangeInfo changeInfo = (ChangeInfo) it2.next();
                        defaultItemAnimator.getClass();
                        RecyclerView.ViewHolder viewHolder2 = changeInfo.f8022a;
                        final View view3 = viewHolder2 == null ? null : viewHolder2.itemView;
                        RecyclerView.ViewHolder viewHolder3 = changeInfo.f8023b;
                        final View view4 = viewHolder3 != null ? viewHolder3.itemView : null;
                        ArrayList arrayList8 = defaultItemAnimator.r;
                        long j2 = defaultItemAnimator.f;
                        if (view3 != null) {
                            final ViewPropertyAnimator duration = view3.animate().setDuration(j2);
                            arrayList8.add(changeInfo.f8022a);
                            duration.translationX(changeInfo.f8025e - changeInfo.f8024c);
                            duration.translationY(changeInfo.f - changeInfo.d);
                            duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.7
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    duration.setListener(null);
                                    View view5 = view3;
                                    view5.setAlpha(1.0f);
                                    view5.setTranslationX(0.0f);
                                    view5.setTranslationY(0.0f);
                                    ChangeInfo changeInfo2 = changeInfo;
                                    RecyclerView.ViewHolder viewHolder4 = changeInfo2.f8022a;
                                    DefaultItemAnimator defaultItemAnimator2 = DefaultItemAnimator.this;
                                    defaultItemAnimator2.h(viewHolder4);
                                    defaultItemAnimator2.r.remove(changeInfo2.f8022a);
                                    defaultItemAnimator2.r();
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                    RecyclerView.ViewHolder viewHolder4 = changeInfo.f8022a;
                                    DefaultItemAnimator.this.getClass();
                                }
                            }).start();
                        }
                        if (view4 != null) {
                            final ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view4.animate();
                            arrayList8.add(changeInfo.f8023b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.8
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    viewPropertyAnimatorAnimate2.setListener(null);
                                    View view5 = view4;
                                    view5.setAlpha(1.0f);
                                    view5.setTranslationX(0.0f);
                                    view5.setTranslationY(0.0f);
                                    ChangeInfo changeInfo2 = changeInfo;
                                    RecyclerView.ViewHolder viewHolder4 = changeInfo2.f8023b;
                                    DefaultItemAnimator defaultItemAnimator2 = DefaultItemAnimator.this;
                                    defaultItemAnimator2.h(viewHolder4);
                                    defaultItemAnimator2.r.remove(changeInfo2.f8023b);
                                    defaultItemAnimator2.r();
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                    RecyclerView.ViewHolder viewHolder4 = changeInfo.f8023b;
                                    DefaultItemAnimator.this.getClass();
                                }
                            }).start();
                        }
                    }
                }
            };
            if (zIsEmpty) {
                runnable2.run();
            } else {
                View view3 = ((ChangeInfo) arrayList6.get(0)).f8022a.itemView;
                WeakHashMap weakHashMap2 = ViewCompat.f4466a;
                view3.postOnAnimationDelayed(runnable2, j);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        final ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.f8011l.add(arrayList7);
        arrayList4.clear();
        Runnable runnable3 = new Runnable() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.3
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList8 = arrayList7;
                Iterator it2 = arrayList8.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    final DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                    if (!zHasNext2) {
                        arrayList8.clear();
                        defaultItemAnimator.f8011l.remove(arrayList8);
                        return;
                    }
                    final RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) it2.next();
                    defaultItemAnimator.getClass();
                    final View view4 = viewHolder2.itemView;
                    final ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view4.animate();
                    defaultItemAnimator.o.add(viewHolder2);
                    viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(defaultItemAnimator.f8096c).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.5
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                            view4.setAlpha(1.0f);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            viewPropertyAnimatorAnimate2.setListener(null);
                            DefaultItemAnimator defaultItemAnimator2 = defaultItemAnimator;
                            RecyclerView.ViewHolder viewHolder3 = viewHolder2;
                            defaultItemAnimator2.h(viewHolder3);
                            defaultItemAnimator2.o.remove(viewHolder3);
                            defaultItemAnimator2.r();
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            defaultItemAnimator.getClass();
                        }
                    }).start();
                }
            }
        };
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnable3.run();
            return;
        }
        if (zIsEmpty) {
            j = 0;
        }
        long jMax = Math.max(!zIsEmpty2 ? this.f8097e : 0L, zIsEmpty3 ? 0L : this.f) + j;
        View view4 = ((RecyclerView.ViewHolder) arrayList7.get(0)).itemView;
        WeakHashMap weakHashMap3 = ViewCompat.f4466a;
        view4.postOnAnimationDelayed(runnable3, jMax);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void m(RecyclerView.ViewHolder viewHolder) {
        u(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.f8010i.add(viewHolder);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean n(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4, int i5) {
        if (viewHolder == viewHolder2) {
            return o(viewHolder, i2, i3, i4, i5);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        u(viewHolder);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            u(viewHolder2);
            viewHolder2.itemView.setTranslationX(-i6);
            viewHolder2.itemView.setTranslationY(-i7);
            viewHolder2.itemView.setAlpha(0.0f);
        }
        ArrayList arrayList = this.k;
        ChangeInfo changeInfo = new ChangeInfo();
        changeInfo.f8022a = viewHolder;
        changeInfo.f8023b = viewHolder2;
        changeInfo.f8024c = i2;
        changeInfo.d = i3;
        changeInfo.f8025e = i4;
        changeInfo.f = i5;
        arrayList.add(changeInfo);
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean o(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
        View view = viewHolder.itemView;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) viewHolder.itemView.getTranslationY());
        u(viewHolder);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            h(viewHolder);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        ArrayList arrayList = this.j;
        MoveInfo moveInfo = new MoveInfo();
        moveInfo.f8026a = viewHolder;
        moveInfo.f8027b = translationX;
        moveInfo.f8028c = translationY;
        moveInfo.d = i4;
        moveInfo.f8029e = i5;
        arrayList.add(moveInfo);
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void p(RecyclerView.ViewHolder viewHolder) {
        u(viewHolder);
        this.f8009h.add(viewHolder);
    }

    public final void r() {
        if (k()) {
            return;
        }
        ArrayList arrayList = this.f8095b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((RecyclerView.ItemAnimator.ItemAnimatorFinishedListener) arrayList.get(i2)).a();
        }
        arrayList.clear();
    }

    public final void s(ArrayList arrayList, RecyclerView.ViewHolder viewHolder) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ChangeInfo changeInfo = (ChangeInfo) arrayList.get(size);
            if (t(changeInfo, viewHolder) && changeInfo.f8022a == null && changeInfo.f8023b == null) {
                arrayList.remove(changeInfo);
            }
        }
    }

    public final boolean t(ChangeInfo changeInfo, RecyclerView.ViewHolder viewHolder) {
        if (changeInfo.f8023b == viewHolder) {
            changeInfo.f8023b = null;
        } else {
            if (changeInfo.f8022a != viewHolder) {
                return false;
            }
            changeInfo.f8022a = null;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        h(viewHolder);
        return true;
    }

    public final void u(RecyclerView.ViewHolder viewHolder) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(s);
        i(viewHolder);
    }
}
