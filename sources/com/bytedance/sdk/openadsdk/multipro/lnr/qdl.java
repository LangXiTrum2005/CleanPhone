package com.bytedance.sdk.openadsdk.multipro.lnr;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.media.a;
import com.bytedance.sdk.component.mo.qdl.mo;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.multipro.mml;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class qdl implements com.bytedance.sdk.openadsdk.multipro.qdl {
    public static String lnr() {
        if (yt.qdl() == null) {
            return null;
        }
        try {
            mo moVarMml = mml();
            if (moVarMml != null) {
                return moVarMml.qdl(Uri.parse(mzz() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static mo mml() {
        try {
            if (yt.qdl() != null) {
                return com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl(yt.qdl());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String mzz() {
        return a.r(new StringBuilder(), mml.ud, "/t_frequent/");
    }

    public static boolean ud() {
        if (yt.qdl() == null) {
            return false;
        }
        try {
            mo moVarMml = mml();
            if (moVarMml != null) {
                return com.p004ironsource.mediationsdk.metadata.a.g.equals(moVarMml.qdl(Uri.parse(mzz() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public int qdl(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public int qdl(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public Cursor qdl(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public Uri qdl(Uri uri, ContentValues contentValues) {
        return null;
    }

    public static boolean qdl(String str) {
        if (yt.qdl() == null) {
            return false;
        }
        try {
            mo moVarMml = mml();
            if (moVarMml != null) {
                return com.p004ironsource.mediationsdk.metadata.a.g.equals(moVarMml.qdl(Uri.parse(mzz() + "checkFrequency?rit=" + str)));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public String qdl() {
        return "t_frequent";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public String qdl(Uri uri) {
        Objects.toString(uri);
        String str = uri.getPath().split("/")[2];
        if ("checkFrequency".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.jpc.qdl.qdl().qdl(uri.getQueryParameter("rit")) ? com.p004ironsource.mediationsdk.metadata.a.g : "false";
        }
        if ("isSilent".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.jpc.qdl.qdl().ud() ? com.p004ironsource.mediationsdk.metadata.a.g : "false";
        }
        if ("maxRit".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.jpc.qdl.qdl().lnr();
        }
        return null;
    }
}
