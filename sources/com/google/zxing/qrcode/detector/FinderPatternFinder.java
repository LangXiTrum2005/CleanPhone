package com.google.zxing.qrcode.detector;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class FinderPatternFinder {

    public static final class CenterComparator implements Serializable, Comparator<FinderPattern> {
        @Override // java.util.Comparator
        public final int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            finderPattern2.getClass();
            finderPattern.getClass();
            int iCompare = Integer.compare(0, 0);
            return iCompare == 0 ? Float.compare(Math.abs(0.0f), Math.abs(0.0f)) : iCompare;
        }
    }

    public static final class FurthestFromAverageComparator implements Serializable, Comparator<FinderPattern> {
        @Override // java.util.Comparator
        public final int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            finderPattern2.getClass();
            float fAbs = Math.abs(0.0f);
            finderPattern.getClass();
            return Float.compare(fAbs, Math.abs(0.0f));
        }
    }
}
