package com.bytedance.adsdk.ugeno.qdl;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes.dex */
public enum mzz {
    TRANSLATE("translate", "translation", "point"),
    TRANSLATE_X("translateX", "translationX", "float"),
    TRANSLATE_Y("translateY", "translationY", "float"),
    ROTATE_X("rotateX", "rotationX", "float"),
    ROTATE_Y("rotateY", "rotationY", "float"),
    ROTATE_Z("rotateZ", "rotation", "float"),
    SCALE("scale", "scale", "point"),
    SCALE_X("scaleX", "scaleX", "float"),
    SCALE_Y("scaleY", "scaleY", "float"),
    ALPHA("opacity", "alpha", "float"),
    BACKGROUND_COLOR(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "int"),
    BORDER_RADIUS("borderRadius", "borderRadius", "float"),
    RIPPLE("ripple", "ripple", "float"),
    SHINE("shine", "shine", "float");

    private final String bjy;
    private final String jtx;
    private final String yt;

    mzz(String str, String str2, String str3) {
        this.bjy = str;
        this.jtx = str2;
        this.yt = str3;
    }

    public String lnr() {
        return this.yt;
    }

    public String qdl() {
        return this.bjy;
    }

    public String ud() {
        return this.jtx;
    }

    public static mzz qdl(String str) {
        str.getClass();
        switch (str) {
            case "translateX":
                return TRANSLATE_X;
            case "translateY":
                return TRANSLATE_Y;
            case "opacity":
                return ALPHA;
            case "ripple":
                return RIPPLE;
            case "scaleX":
                return SCALE_X;
            case "scaleY":
                return SCALE_Y;
            case "scale":
                return SCALE;
            case "translate":
                return TRANSLATE;
            case "backgroundColor":
                return BACKGROUND_COLOR;
            case "borderRadius":
                return BORDER_RADIUS;
            case "rotateX":
                return ROTATE_X;
            case "rotateY":
                return ROTATE_Y;
            case "rotateZ":
                return ROTATE_Z;
            default:
                return TRANSLATE_X;
        }
    }
}
