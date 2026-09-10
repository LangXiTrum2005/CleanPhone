package com.bytedance.sdk.component.adexpress.ka;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class jbs {

    public enum ri {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");

        private String fi;

        ri(String str) {
            this.fi = str;
        }

        public String ri() {
            return this.fi;
        }
    }

    public static ri ri(String str) {
        ri riVar = ri.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        return ri.CSS;
                    }
                    if (path.endsWith(".js")) {
                        return ri.JS;
                    }
                    if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico") && path.endsWith(".html")) {
                        return ri.HTML;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return riVar;
    }
}
