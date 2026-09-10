package com.mbridge.msdk.config.dynamic;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinMediationProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.dycreator.utils.e;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import d5.u;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile c f32713d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SoftReference<HashMap<String, com.mbridge.msdk.config.dynamic.utils.c>> f32714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f32715b = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, com.mbridge.msdk.config.dynamic.utils.c> f32716c;

    private c() {
        d();
    }

    public static c a() {
        if (f32713d == null) {
            synchronized (c.class) {
                try {
                    if (f32713d == null) {
                        f32713d = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f32713d;
    }

    public HashMap b() {
        SoftReference<HashMap<String, com.mbridge.msdk.config.dynamic.utils.c>> softReference = this.f32714a;
        if (softReference == null || softReference.get() == null) {
            HashMap map = new HashMap(45);
            map.put("layout_width", com.mbridge.msdk.config.dynamic.utils.c.layout_width);
            map.put("layout_height", com.mbridge.msdk.config.dynamic.utils.c.layout_height);
            map.put("orientation", com.mbridge.msdk.config.dynamic.utils.c.orientation);
            map.put("layout_centerHorizontal", com.mbridge.msdk.config.dynamic.utils.c.layout_centerHorizontal);
            map.put("layout_centerVertical", com.mbridge.msdk.config.dynamic.utils.c.layout_centerVertical);
            map.put("layout_marginLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_marginLeft);
            map.put("layout_marginRight", com.mbridge.msdk.config.dynamic.utils.c.layout_marginRight);
            map.put("layout_margin", com.mbridge.msdk.config.dynamic.utils.c.layout_margin);
            map.put("layout_gravity", com.mbridge.msdk.config.dynamic.utils.c.layout_gravity);
            map.put("layout_alignParentRight", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentRight);
            map.put("layout_weight", com.mbridge.msdk.config.dynamic.utils.c.layout_weight);
            map.put("contentDescription", com.mbridge.msdk.config.dynamic.utils.c.contentDescription);
            map.put("gravity", com.mbridge.msdk.config.dynamic.utils.c.gravity);
            map.put("id", com.mbridge.msdk.config.dynamic.utils.c.id);
            map.put("layout_below", com.mbridge.msdk.config.dynamic.utils.c.layout_below);
            map.put("layout_above", com.mbridge.msdk.config.dynamic.utils.c.layout_above);
            map.put("layout_toLeftOf", com.mbridge.msdk.config.dynamic.utils.c.layout_toLeftOf);
            map.put("layout_toRightOf", com.mbridge.msdk.config.dynamic.utils.c.layout_toRightOf);
            map.put("layout_toEndOf", com.mbridge.msdk.config.dynamic.utils.c.layout_toEndOf);
            map.put("background", com.mbridge.msdk.config.dynamic.utils.c.background);
            map.put("layout_marginTop", com.mbridge.msdk.config.dynamic.utils.c.layout_marginTop);
            map.put("layout_marginBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_marginBottom);
            map.put("layout_marginStart", com.mbridge.msdk.config.dynamic.utils.c.layout_marginStart);
            map.put("layout_marginEnd", com.mbridge.msdk.config.dynamic.utils.c.layout_marginEnd);
            map.put("layout_alignParentBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentBottom);
            map.put("layout_alignParentTop", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentTop);
            map.put("layout_alignParentLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentLeft);
            map.put("layout_alignWithParentIfMissing", com.mbridge.msdk.config.dynamic.utils.c.layout_alignWithParentIfMissing);
            map.put("layout_alignTop", com.mbridge.msdk.config.dynamic.utils.c.layout_alignTop);
            map.put("layout_alignBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_alignBottom);
            map.put("layout_alignLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_alignLeft);
            map.put("layout_alignRight", com.mbridge.msdk.config.dynamic.utils.c.layout_alignRight);
            map.put("layout_centerInParent", com.mbridge.msdk.config.dynamic.utils.c.layout_centerInParent);
            map.put("layout_alignParentEnd", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentEnd);
            this.f32714a = new SoftReference<>(map);
        }
        return this.f32714a.get();
    }

    public HashMap<String, com.mbridge.msdk.config.dynamic.utils.c> c() {
        return this.f32716c;
    }

    public int d(String str) {
        if (this.f32715b == null) {
            return 0;
        }
        String strI = com.mbridge.msdk.foundation.controller.c.n().i();
        if (TextUtils.isEmpty(strI)) {
            strI = this.f32715b.getPackageName();
        }
        StringBuilder sbJ = u.j(strI, ".R$");
        String[] strArrSplit = str.split("\\.");
        sbJ.append(strArrSplit[1]);
        try {
            Class<?> cls = Class.forName(sbJ.toString());
            Object objNewInstance = cls.newInstance();
            Field declaredField = cls.getDeclaredField(strArrSplit[2]);
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(objNewInstance)).intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public int e(String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.startsWith("#")) {
                return Color.parseColor(str);
            }
            return 0;
        } catch (Exception e10) {
            q0.b("ComponentResource", e10.getMessage());
            return 0;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public int c(String str) {
        int i10;
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            int i11 = 0;
            for (String str2 : str.split("\\|")) {
                String lowerCase = str2.toLowerCase();
                switch (lowerCase.hashCode()) {
                    case -1633016142:
                        if (lowerCase.equals("fill_vertical")) {
                            i10 = InterfaceC0435l1.d.b.f29113j;
                            break;
                        }
                        break;
                    case -1383228885:
                        if (lowerCase.equals("bottom")) {
                            i10 = 80;
                            break;
                        }
                        break;
                    case -1364013995:
                        if (lowerCase.equals(TtmlNode.CENTER)) {
                            i10 = 17;
                            break;
                        }
                        break;
                    case -483365792:
                        if (lowerCase.equals("fill_horizontal")) {
                            i10 = 7;
                            break;
                        }
                        break;
                    case -348726240:
                        if (lowerCase.equals("center_vertical")) {
                            i10 = 16;
                            break;
                        }
                        break;
                    case 100571:
                        if (lowerCase.equals(TtmlNode.END)) {
                            i10 = 8388613;
                            break;
                        }
                        break;
                    case 115029:
                        if (lowerCase.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                            i10 = 48;
                            break;
                        }
                        break;
                    case 3143043:
                        if (lowerCase.equals("fill")) {
                            i10 = 119;
                            break;
                        }
                        break;
                    case 3317767:
                        if (lowerCase.equals("left")) {
                            i10 = 3;
                            break;
                        }
                        break;
                    case 108511772:
                        if (lowerCase.equals(TtmlNode.RIGHT)) {
                            i10 = 5;
                            break;
                        }
                        break;
                    case 109757538:
                        if (lowerCase.equals("start")) {
                            i10 = 8388611;
                            break;
                        }
                        break;
                    case 1063616078:
                        if (lowerCase.equals("center_horizontal")) {
                            i10 = 1;
                            break;
                        }
                        break;
                    default:
                        continue;
                        break;
                }
                i11 |= i10;
            }
            return i11;
        } catch (Exception e10) {
            q0.b("ComponentResource", e10.getMessage());
            return 0;
        }
    }

    public int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            int iIndexOf = str.indexOf(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);
            int iIndexOf2 = str.indexOf("s");
            if (iIndexOf == -1) {
                iIndexOf = iIndexOf2;
            }
            int i10 = Integer.parseInt(str.substring(0, iIndexOf));
            if (str.contains(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
                return e.a(this.f32715b, i10);
            }
            str.contains("s");
            return i10;
        }
    }

    public int a(String str, String str2) {
        if (this.f32715b == null) {
            return 0;
        }
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            String strI = com.mbridge.msdk.foundation.controller.c.n().i();
            if (TextUtils.isEmpty(strI)) {
                strI = this.f32715b.getPackageName();
            }
            return contextD.getResources().getIdentifier(str2, str, strI);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private void d() {
        HashMap<String, com.mbridge.msdk.config.dynamic.utils.c> map = new HashMap<>();
        this.f32716c = map;
        map.put("id", com.mbridge.msdk.config.dynamic.utils.c.id);
        this.f32716c.put("background", com.mbridge.msdk.config.dynamic.utils.c.background);
        this.f32716c.put(ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, com.mbridge.msdk.config.dynamic.utils.c.visibility);
        this.f32716c.put("contentDescription", com.mbridge.msdk.config.dynamic.utils.c.contentDescription);
        this.f32716c.put("padding", com.mbridge.msdk.config.dynamic.utils.c.padding);
        this.f32716c.put("paddingTop", com.mbridge.msdk.config.dynamic.utils.c.paddingTop);
        this.f32716c.put("paddingBottom", com.mbridge.msdk.config.dynamic.utils.c.paddingBottom);
        this.f32716c.put("paddingLeft", com.mbridge.msdk.config.dynamic.utils.c.paddingLeft);
        this.f32716c.put("paddingRight", com.mbridge.msdk.config.dynamic.utils.c.paddingRight);
        this.f32716c.put("paddingStart", com.mbridge.msdk.config.dynamic.utils.c.paddingStart);
        this.f32716c.put("paddingEnd", com.mbridge.msdk.config.dynamic.utils.c.paddingEnd);
        this.f32716c.put("layout_margin", com.mbridge.msdk.config.dynamic.utils.c.layout_margin);
        this.f32716c.put("layout_marginTop", com.mbridge.msdk.config.dynamic.utils.c.layout_marginTop);
        this.f32716c.put("layout_marginBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_marginBottom);
        this.f32716c.put("layout_marginLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_marginLeft);
        this.f32716c.put("layout_marginRight", com.mbridge.msdk.config.dynamic.utils.c.layout_marginRight);
        this.f32716c.put("layout_marginStart", com.mbridge.msdk.config.dynamic.utils.c.layout_marginStart);
        this.f32716c.put("layout_marginEnd", com.mbridge.msdk.config.dynamic.utils.c.layout_marginEnd);
        this.f32716c.put("alpha", com.mbridge.msdk.config.dynamic.utils.c.alpha);
        this.f32716c.put("rotation", com.mbridge.msdk.config.dynamic.utils.c.rotation);
        this.f32716c.put("scaleX", com.mbridge.msdk.config.dynamic.utils.c.scaleX);
        this.f32716c.put("scaleY", com.mbridge.msdk.config.dynamic.utils.c.scaleY);
        this.f32716c.put("translationX", com.mbridge.msdk.config.dynamic.utils.c.translationX);
        this.f32716c.put("translationY", com.mbridge.msdk.config.dynamic.utils.c.translationY);
        this.f32716c.put(ViewHierarchyConstants.TAG_KEY, com.mbridge.msdk.config.dynamic.utils.c.tag);
        this.f32716c.put("text", com.mbridge.msdk.config.dynamic.utils.c.text);
        this.f32716c.put("textColor", com.mbridge.msdk.config.dynamic.utils.c.textColor);
        this.f32716c.put("textSize", com.mbridge.msdk.config.dynamic.utils.c.textSize);
        this.f32716c.put("textStyle", com.mbridge.msdk.config.dynamic.utils.c.textStyle);
        this.f32716c.put("maxLines", com.mbridge.msdk.config.dynamic.utils.c.maxLines);
        this.f32716c.put("minLines", com.mbridge.msdk.config.dynamic.utils.c.minLines);
        this.f32716c.put("lines", com.mbridge.msdk.config.dynamic.utils.c.lines);
        this.f32716c.put("ellipsize", com.mbridge.msdk.config.dynamic.utils.c.ellipsize);
        this.f32716c.put("gravity", com.mbridge.msdk.config.dynamic.utils.c.gravity);
        this.f32716c.put("drawablePadding", com.mbridge.msdk.config.dynamic.utils.c.drawablePadding);
        this.f32716c.put("drawableStart", com.mbridge.msdk.config.dynamic.utils.c.drawableStart);
        this.f32716c.put("drawableEnd", com.mbridge.msdk.config.dynamic.utils.c.drawableEnd);
        this.f32716c.put("drawableTop", com.mbridge.msdk.config.dynamic.utils.c.drawableTop);
        this.f32716c.put("drawableBottom", com.mbridge.msdk.config.dynamic.utils.c.drawableBottom);
        this.f32716c.put("singleLine", com.mbridge.msdk.config.dynamic.utils.c.singleLine);
        this.f32716c.put("marqueeRepeatLimit", com.mbridge.msdk.config.dynamic.utils.c.marqueeRepeatLimit);
        this.f32716c.put("includeFontPadding", com.mbridge.msdk.config.dynamic.utils.c.includeFontPadding);
        this.f32716c.put("lineSpacingExtra", com.mbridge.msdk.config.dynamic.utils.c.lineSpacingExtra);
        this.f32716c.put("lineSpacingMultiplier", com.mbridge.msdk.config.dynamic.utils.c.lineSpacingMultiplier);
        this.f32716c.put(ViewHierarchyConstants.HINT_KEY, com.mbridge.msdk.config.dynamic.utils.c.hint);
        this.f32716c.put("inputType", com.mbridge.msdk.config.dynamic.utils.c.inputType);
        this.f32716c.put("maxLength", com.mbridge.msdk.config.dynamic.utils.c.maxLength);
        this.f32716c.put("textIsSelectable", com.mbridge.msdk.config.dynamic.utils.c.textIsSelectable);
        this.f32716c.put("cursorVisible", com.mbridge.msdk.config.dynamic.utils.c.cursorVisible);
        this.f32716c.put("backgroundTint", com.mbridge.msdk.config.dynamic.utils.c.backgroundTint);
        this.f32716c.put("allCaps", com.mbridge.msdk.config.dynamic.utils.c.allCaps);
        this.f32716c.put("src", com.mbridge.msdk.config.dynamic.utils.c.src);
        this.f32716c.put("scaleType", com.mbridge.msdk.config.dynamic.utils.c.scaleType);
        this.f32716c.put("adjustViewBounds", com.mbridge.msdk.config.dynamic.utils.c.adjustViewBounds);
        this.f32716c.put("maxWidth", com.mbridge.msdk.config.dynamic.utils.c.maxWidth);
        this.f32716c.put("maxHeight", com.mbridge.msdk.config.dynamic.utils.c.maxHeight);
        this.f32716c.put("tint", com.mbridge.msdk.config.dynamic.utils.c.tint);
        this.f32716c.put("divider", com.mbridge.msdk.config.dynamic.utils.c.divider);
        this.f32716c.put("dividerHeight", com.mbridge.msdk.config.dynamic.utils.c.dividerHeight);
        this.f32716c.put("scrollbars", com.mbridge.msdk.config.dynamic.utils.c.scrollbars);
        this.f32716c.put("listSelector", com.mbridge.msdk.config.dynamic.utils.c.listSelector);
        this.f32716c.put("stackFromBottom", com.mbridge.msdk.config.dynamic.utils.c.stackFromBottom);
        this.f32716c.put("transcriptMode", com.mbridge.msdk.config.dynamic.utils.c.transcriptMode);
        this.f32716c.put("numColumns", com.mbridge.msdk.config.dynamic.utils.c.numColumns);
        this.f32716c.put("verticalSpacing", com.mbridge.msdk.config.dynamic.utils.c.verticalSpacing);
        this.f32716c.put("horizontalSpacing", com.mbridge.msdk.config.dynamic.utils.c.horizontalSpacing);
        this.f32716c.put("stretchMode", com.mbridge.msdk.config.dynamic.utils.c.stretchMode);
        this.f32716c.put("columnWidth", com.mbridge.msdk.config.dynamic.utils.c.columnWidth);
        this.f32716c.put("fillViewport", com.mbridge.msdk.config.dynamic.utils.c.fillViewport);
        this.f32716c.put("scrollbarStyle", com.mbridge.msdk.config.dynamic.utils.c.scrollbarStyle);
        this.f32716c.put("orientation", com.mbridge.msdk.config.dynamic.utils.c.orientation);
        this.f32716c.put("weightSum", com.mbridge.msdk.config.dynamic.utils.c.weightSum);
        this.f32716c.put("baselineAligned", com.mbridge.msdk.config.dynamic.utils.c.baselineAligned);
        this.f32716c.put("measureWithLargestChild", com.mbridge.msdk.config.dynamic.utils.c.measureWithLargestChild);
        this.f32716c.put("ignoreGravity", com.mbridge.msdk.config.dynamic.utils.c.ignoreGravity);
        this.f32716c.put(DownloadService.KEY_FOREGROUND, com.mbridge.msdk.config.dynamic.utils.c.foreground);
        this.f32716c.put("foregroundGravity", com.mbridge.msdk.config.dynamic.utils.c.foregroundGravity);
        this.f32716c.put("measureAllChildren", com.mbridge.msdk.config.dynamic.utils.c.measureAllChildren);
        this.f32716c.put(TtmlNode.TAG_STYLE, com.mbridge.msdk.config.dynamic.utils.c.style);
        this.f32716c.put(NotificationCompat.CATEGORY_PROGRESS, com.mbridge.msdk.config.dynamic.utils.c.progress);
        this.f32716c.put(AppLovinMediationProvider.MAX, com.mbridge.msdk.config.dynamic.utils.c.max);
        this.f32716c.put("progressDrawable", com.mbridge.msdk.config.dynamic.utils.c.progressDrawable);
    }

    public View a(String str, ViewGroup viewGroup, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (this.f32715b != null) {
            try {
                return new b(this.f32715b, aVar).a(str, viewGroup);
            } catch (Exception e10) {
                q0.b("ComponentResource", e10.getMessage());
            }
        }
        return null;
    }

    public int b(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("@color/")) {
            return 0;
        }
        return this.f32715b.getResources().getColor(a("color", str.substring(7)));
    }
}
