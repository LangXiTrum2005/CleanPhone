package com.unity3d.services.banners.view;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum BannerPosition {
    TOP_LEFT(new int[]{10, 9}, 51),
    TOP_CENTER(new int[]{10, 14}, 49),
    TOP_RIGHT(new int[]{10, 11}, 53),
    BOTTOM_LEFT(new int[]{12, 9}, 83),
    BOTTOM_CENTER(new int[]{12, 14}, 81),
    BOTTOM_RIGHT(new int[]{12, 11}, 85),
    CENTER(new int[]{13}, 17),
    NONE(new int[0], 0);

    private int _gravity;
    private final int[] _rules;

    BannerPosition(int[] iArr, int i10) {
        this._rules = iArr;
        this._gravity = i10;
    }

    public static BannerPosition fromString(String str) {
        if (str == null || str.equals("none")) {
            return NONE;
        }
        if (str.equals("topleft")) {
            return TOP_LEFT;
        }
        if (str.equals("topright")) {
            return TOP_RIGHT;
        }
        if (str.equals("topcenter")) {
            return TOP_CENTER;
        }
        if (str.equals("bottomleft")) {
            return BOTTOM_LEFT;
        }
        if (str.equals("bottomright")) {
            return BOTTOM_RIGHT;
        }
        if (str.equals("bottomcenter")) {
            return BOTTOM_CENTER;
        }
        return str.equals(TtmlNode.CENTER) ? CENTER : NONE;
    }

    public ViewGroup.LayoutParams addLayoutRules(RelativeLayout.LayoutParams layoutParams) {
        for (int i10 : this._rules) {
            layoutParams.addRule(i10);
        }
        return layoutParams;
    }

    public int getGravity() {
        return this._gravity;
    }
}
