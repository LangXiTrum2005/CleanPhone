package sg.bigo.ads.common;

import android.content.Context;
import android.text.TextUtils;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f47350a = "";

    public static String a(Context context) {
        String strR;
        if (sg.bigo.ads.common.n.d.b() && !q.a((CharSequence) f47350a)) {
            return f47350a;
        }
        if (q.a((CharSequence) f47350a)) {
            if (context == null) {
                strR = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(context.getFilesDir());
                strR = android.support.v4.media.a.r(sb, File.separator, "sg_bigo_ad");
            }
            f47350a = strR;
        }
        File file = new File(f47350a);
        if (!file.exists()) {
            file.mkdirs();
        }
        return f47350a;
    }

    public static String b(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(i(context));
        return android.support.v4.media.a.r(sb, File.separator, "files");
    }

    public static String c(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(i(context));
        return android.support.v4.media.a.r(sb, File.separator, "vpaid");
    }

    public static String d(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(i(context));
        return android.support.v4.media.a.r(sb, File.separator, "thumb");
    }

    public static String e(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(context));
        return android.support.v4.media.a.r(sb, File.separator, com.smartdigimkt.x.d.c.k);
    }

    public static String f(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(context));
        return android.support.v4.media.a.r(sb, File.separator, "icon");
    }

    public static String g(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(context));
        return android.support.v4.media.a.r(sb, File.separator, "omsdk");
    }

    public static String h(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(context));
        return android.support.v4.media.a.r(sb, File.separator, "bannerjs");
    }

    private static String i(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(context));
        return android.support.v4.media.a.r(sb, File.separator, "video");
    }

    public static String b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(AdPayload.FILE_SCHEME);
        sb.append(d(context));
        return android.support.v4.media.a.r(sb, File.separator, str);
    }

    public static boolean a(Context context, String str) {
        return str != null && str.equals(b(context));
    }
}
