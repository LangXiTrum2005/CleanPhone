package com.airbnb.lottie;

import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class PerformanceTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9553a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArraySet f9554b = new ArraySet(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f9555c = new HashMap();

    /* JADX INFO: renamed from: com.airbnb.lottie.PerformanceTracker$1, reason: invalid class name */
    public class AnonymousClass1 implements Comparator<Pair<String, Float>> {
        @Override // java.util.Comparator
        public final int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = ((Float) pair.f4408b).floatValue();
            float fFloatValue2 = ((Float) pair2.f4408b).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public interface FrameListener {
        void a();
    }
}
