package com.airbnb.lottie;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.utils.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class LottieComposition {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f9516c;
    public HashMap d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f9517e;
    public ArrayList f;
    public SparseArrayCompat g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LongSparseArray f9518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f9519i;
    public Rect j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f9520l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9521n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PerformanceTracker f9514a = new PerformanceTracker();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f9515b = new HashSet();
    public int o = 0;

    @Deprecated
    public static class Factory {

        public static final class ListenerAdapter implements LottieListener<LottieComposition>, Cancellable {
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Object obj) {
                throw null;
            }
        }
    }

    public final void a(String str) {
        Logger.b(str);
        this.f9515b.add(str);
    }

    public final float b() {
        return (long) (((this.f9520l - this.k) / this.m) * 1000.0f);
    }

    public final Marker c(String str) {
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            Marker marker = (Marker) this.f.get(i2);
            String str2 = marker.f9732a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return marker;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f9519i.iterator();
        while (it.hasNext()) {
            sb.append(((Layer) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
