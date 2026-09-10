package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.qrcode.detector.FinderPattern;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class MultiFinderPatternFinder extends FinderPatternFinder {

    public static final class ModuleSizeComparator implements Serializable, Comparator<FinderPattern> {
        @Override // java.util.Comparator
        public final int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            finderPattern2.getClass();
            finderPattern.getClass();
            double d = 0.0f;
            if (d < 0.0d) {
                return -1;
            }
            return d > 0.0d ? 1 : 0;
        }
    }
}
