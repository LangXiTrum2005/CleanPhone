package com.airbnb.lottie;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PerformanceTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class mathsort {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public boolean f15995attabal = false;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Set<saneness> f15997saneness = new androidx.collection.saneness();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map<String, utwa.cutely> f15996dern = new HashMap();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Comparator<technofreak.beachfront<String, Float>> f15998wireman = new attabal();

    /* JADX INFO: compiled from: PerformanceTracker.java */
    public class attabal implements Comparator<technofreak.beachfront<String, Float>> {
        public attabal() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compare(technofreak.beachfront<String, Float> beachfrontVar, technofreak.beachfront<String, Float> beachfrontVar2) {
            float fFloatValue = beachfrontVar.f38672saneness.floatValue();
            float fFloatValue2 = beachfrontVar2.f38672saneness.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    /* JADX INFO: compiled from: PerformanceTracker.java */
    public interface saneness {
        void attabal(float f);
    }

    public void attabal(String str, float f) {
        if (this.f15995attabal) {
            utwa.cutely cutelyVar = this.f15996dern.get(str);
            if (cutelyVar == null) {
                cutelyVar = new utwa.cutely();
                this.f15996dern.put(str, cutelyVar);
            }
            cutelyVar.attabal(f);
            if (str.equals("__container")) {
                Iterator<saneness> it = this.f15997saneness.iterator();
                while (it.hasNext()) {
                    it.next().attabal(f);
                }
            }
        }
    }

    public void saneness(boolean z) {
        this.f15995attabal = z;
    }
}
