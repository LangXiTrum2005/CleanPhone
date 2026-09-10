package com.google.zxing.datamatrix.detector;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class Detector {

    public static final class ResultPointsAndTransitions {
        public final String toString() {
            return "null/null/0";
        }
    }

    public static final class ResultPointsAndTransitionsComparator implements Serializable, Comparator<ResultPointsAndTransitions> {
        @Override // java.util.Comparator
        public final int compare(ResultPointsAndTransitions resultPointsAndTransitions, ResultPointsAndTransitions resultPointsAndTransitions2) {
            resultPointsAndTransitions.getClass();
            resultPointsAndTransitions2.getClass();
            return 0;
        }
    }
}
