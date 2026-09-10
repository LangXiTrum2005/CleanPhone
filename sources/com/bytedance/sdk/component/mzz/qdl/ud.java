package com.bytedance.sdk.component.mzz.qdl;

import com.bytedance.sdk.component.mzz.fs;
import com.bytedance.sdk.component.mzz.tvp;
import com.bytedance.sdk.component.utils.jtx;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ud {
    public static fs qdl() {
        return new fs() { // from class: com.bytedance.sdk.component.mzz.qdl.ud.1
            private WeakHashMap<String, String> qdl = new WeakHashMap<>();

            @Override // com.bytedance.sdk.component.mzz.fs
            public String qdl(tvp tvpVar) {
                return qdl(tvpVar.qdl() + "#width=" + tvpVar.ud() + "#height=" + tvpVar.lnr() + "#scaletype=" + tvpVar.mml() + "#bitmapConfig=" + tvpVar.mzz());
            }

            @Override // com.bytedance.sdk.component.mzz.fs
            public String ud(tvp tvpVar) {
                return qdl(tvpVar.qdl());
            }

            private String qdl(String str) {
                String str2 = this.qdl.get(str);
                if (str2 != null) {
                    return str2;
                }
                String strQdl = jtx.qdl(str);
                this.qdl.put(str, strQdl);
                return strQdl;
            }
        };
    }
}
