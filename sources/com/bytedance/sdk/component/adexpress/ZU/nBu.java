package com.bytedance.sdk.component.adexpress.ZU;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class nBu {

    public enum Lxb {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");

        private String JXs;

        Lxb(String str) {
            this.JXs = str;
        }

        public String Lxb() {
            return this.JXs;
        }
    }

    public static boolean LD(String str) {
        Uri uri;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null) {
            return false;
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        return path.endsWith(".gif");
    }

    public static Lxb Lxb(String str) {
        Lxb lxb = Lxb.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        lxb = Lxb.CSS;
                    } else if (path.endsWith(".js")) {
                        lxb = Lxb.JS;
                    } else if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico") && path.endsWith(".html")) {
                        lxb = Lxb.HTML;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return lxb;
    }
}
