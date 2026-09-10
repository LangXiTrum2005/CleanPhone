package com.startapp.sdk.adsbase.adinformation;

import android.widget.RelativeLayout;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class AdInformationPositions {
    protected static final String DEFAULT_POSITION = Position.BOTTOM_LEFT.name();
    public static final String OBJECT_PROPERY_GLOBAL_NAME = "Positions";

    public enum Position {
        TOP_LEFT(1, new int[]{10, 9}, -1),
        TOP_RIGHT(2, new int[]{10, 11}, 1),
        BOTTOM_LEFT(3, new int[]{12, 9}, -1),
        BOTTOM_RIGHT(4, new int[]{12, 11}, 1);

        private int animationMultiplier;
        private int index;
        private int[] rules;

        Position(int i2, int[] iArr, int i3) {
            this.rules = iArr;
            this.animationMultiplier = i3;
            this.index = i2;
        }

        public static Position getByIndex(long j) {
            Position position = BOTTOM_LEFT;
            Position[] positionArrValues = values();
            for (int i2 = 0; i2 < positionArrValues.length; i2++) {
                if (positionArrValues[i2].getIndex() == j) {
                    position = positionArrValues[i2];
                }
            }
            return position;
        }

        public static Position getByName(String str) {
            Position position = BOTTOM_LEFT;
            Position[] positionArrValues = values();
            for (int i2 = 0; i2 < positionArrValues.length; i2++) {
                String strName = positionArrValues[i2].name();
                Locale locale = Locale.ROOT;
                if (strName.toLowerCase(locale).compareTo(str.toLowerCase(locale)) == 0) {
                    position = positionArrValues[i2];
                }
            }
            return position;
        }

        public void addRules(RelativeLayout.LayoutParams layoutParams) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.rules;
                if (i2 >= iArr.length) {
                    return;
                }
                layoutParams.addRule(iArr[i2]);
                i2++;
            }
        }

        public Position flipHorizontal() {
            int i2 = b.f40613a[ordinal()];
            if (i2 == 1) {
                return TOP_RIGHT;
            }
            if (i2 == 2) {
                return TOP_LEFT;
            }
            if (i2 == 3) {
                return BOTTOM_RIGHT;
            }
            if (i2 == 4) {
                return BOTTOM_LEFT;
            }
            throw new IllegalStateException();
        }

        public int getAnimationStartMultiplier() {
            return this.animationMultiplier;
        }

        public int getIndex() {
            return this.index;
        }
    }
}
