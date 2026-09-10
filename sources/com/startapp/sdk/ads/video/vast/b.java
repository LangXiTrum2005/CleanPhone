package com.startapp.sdk.ads.video.vast;

import com.startapp.sdk.internal.bj;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static final List f = Arrays.asList("image/jpeg", "image/png", "image/bmp", "image/gif");
    public static final List g = Collections.singletonList("application/x-javascript");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VASTResource$Type f40570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VASTResource$CreativeType f40571c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40572e;

    public b(String str, VASTResource$Type vASTResource$Type, VASTResource$CreativeType vASTResource$CreativeType, int i2, int i3) {
        this.f40569a = str;
        this.f40570b = vASTResource$Type;
        this.f40571c = vASTResource$CreativeType;
        this.d = i2;
        this.f40572e = i3;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    public static b a(bj bjVar, VASTResource$Type vASTResource$Type, int i2, int i3) {
        String strF;
        VASTResource$CreativeType vASTResource$CreativeType;
        String str;
        String strC = bjVar.c();
        VASTResource$CreativeType vASTResource$CreativeType2 = VASTResource$CreativeType.NONE;
        int iOrdinal = vASTResource$Type.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                strF = bjVar.f("HTMLResource");
            } else if (iOrdinal != 2) {
                vASTResource$CreativeType = vASTResource$CreativeType2;
                str = null;
            } else {
                strF = bjVar.f("IFrameResource");
            }
            str = strF;
            vASTResource$CreativeType = vASTResource$CreativeType2;
        } else {
            strF = bjVar.f("StaticResource");
            if (strF == null) {
                vASTResource$CreativeType = vASTResource$CreativeType2;
                str = null;
            } else {
                List list = f;
                if (!list.contains(strC) && !g.contains(strC)) {
                    strF = null;
                }
                vASTResource$CreativeType2 = list.contains(strC) ? VASTResource$CreativeType.IMAGE : VASTResource$CreativeType.JAVASCRIPT;
                str = strF;
                vASTResource$CreativeType = vASTResource$CreativeType2;
            }
        }
        if (str == null) {
            return null;
        }
        return new b(str, vASTResource$Type, vASTResource$CreativeType, i2, i3);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("<!DOCTYPE html><html><head><link rel=\"icon\" href=\"data:;base64,iVBORw0KGgo=\" /><style type=\"text/css\"> html, body { background-color: black; height: 100%; margin: 0; } #content { border: 0px; position: absolute; top: 50%; left: 50%; margin: -");
        sb.append(this.f40572e / 2);
        sb.append("px 0 0 -");
        sb.append(this.d / 2);
        sb.append("px; }</style><script>function performClick() { top.location.href = \"https://www.startapp.com\"; }</script></head><body onclick=\"performClick()\">");
        int iOrdinal = this.f40570b.ordinal();
        if (iOrdinal == 0) {
            VASTResource$CreativeType vASTResource$CreativeType = this.f40571c;
            if (vASTResource$CreativeType == VASTResource$CreativeType.IMAGE) {
                sb.append("<img id=\"content\" width=\"");
                sb.append(this.d);
                sb.append("\" height=\"");
                sb.append(this.f40572e);
                sb.append("\" src=\"");
                sb.append(this.f40569a);
                sb.append("\" />");
            } else if (vASTResource$CreativeType == VASTResource$CreativeType.JAVASCRIPT) {
                sb.append("<script src=\"");
                sb.append(this.f40569a);
                sb.append("\" />");
            }
        } else {
            if (iOrdinal == 1) {
                return this.f40569a;
            }
            if (iOrdinal == 2) {
                sb.append("<iframe id=\"content\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" width=\"");
                sb.append(this.d);
                sb.append("\" height=\"");
                sb.append(this.f40572e);
                sb.append("\" src=\"");
                sb.append(this.f40569a);
                sb.append("\" />");
            }
        }
        sb.append("</body></html>");
        return sb.toString();
    }
}
