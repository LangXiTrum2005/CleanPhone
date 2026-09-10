package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ac {
    private static int ri;
    private static final LinkedHashMap<String, SoftReference<ri>> lr = new LinkedHashMap<String, SoftReference<ri>>(ri, 0.75f, true) { // from class: com.bytedance.sdk.openadsdk.utils.ac.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, SoftReference<ri>> entry) {
            ri riVar;
            com.bytedance.sdk.component.jbs.di diVar;
            if (size() <= ac.ri) {
                return false;
            }
            SoftReference<ri> value = entry.getValue();
            if (value == null || (riVar = value.get()) == null || (diVar = riVar.ri) == null) {
                return true;
            }
            try {
                com.bytedance.sdk.component.utils.zf.ri(diVar);
                return true;
            } catch (Throwable unused) {
                entry.getKey();
                return true;
            }
        }
    };

    public static class ri {
        Bundle lr;
        com.bytedance.sdk.component.jbs.di ri;

        public ri(com.bytedance.sdk.component.jbs.di diVar, Bundle bundle) {
            this.ri = diVar;
            this.lr = bundle;
        }
    }

    private static void lr() {
        ri riVar;
        com.bytedance.sdk.component.jbs.di diVar;
        synchronized (lr) {
            while (true) {
                LinkedHashMap<String, SoftReference<ri>> linkedHashMap = lr;
                if (linkedHashMap.size() > ri) {
                    SoftReference<ri> softReferenceRemove = linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
                    if (softReferenceRemove != null && (riVar = softReferenceRemove.get()) != null && (diVar = riVar.ri) != null) {
                        com.bytedance.sdk.component.utils.zf.ri(diVar);
                    }
                }
            }
        }
    }

    public static void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar == null) {
            ri = 0;
        } else {
            ri = Math.max(0, wjvVar.xha());
        }
        lr();
    }

    public static void ri(String str, com.bytedance.sdk.component.jbs.di diVar, Bundle bundle) {
        if (ri <= 0 || TextUtils.isEmpty(str) || diVar == null) {
            return;
        }
        LinkedHashMap<String, SoftReference<ri>> linkedHashMap = lr;
        synchronized (linkedHashMap) {
            try {
                ri(diVar.getWebView());
                ri(diVar, diVar.getContext());
                synchronized (linkedHashMap) {
                    linkedHashMap.put(str, new SoftReference<>(new ri(diVar, bundle)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        linkedHashMap.size();
    }

    public static com.bytedance.sdk.component.jbs.di ri(Context context, String str) {
        com.bytedance.sdk.component.jbs.di diVar;
        if (ri <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        LinkedHashMap<String, SoftReference<ri>> linkedHashMap = lr;
        synchronized (linkedHashMap) {
            try {
                SoftReference<ri> softReferenceRemove = linkedHashMap.remove(str);
                if (softReferenceRemove == null) {
                    return null;
                }
                ri riVar = softReferenceRemove.get();
                if (riVar != null && (diVar = riVar.ri) != null) {
                    ri(diVar, context);
                    return riVar.ri;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Bundle ri(String str) {
        if (ri <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        LinkedHashMap<String, SoftReference<ri>> linkedHashMap = lr;
        synchronized (linkedHashMap) {
            try {
                SoftReference<ri> softReference = linkedHashMap.get(str);
                if (softReference == null) {
                    return null;
                }
                ri riVar = softReference.get();
                return riVar != null ? riVar.lr : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void ri(com.bytedance.sdk.component.jbs.di diVar, Context context) {
        try {
            if (diVar.getContext() instanceof MutableContextWrapper) {
                ((MutableContextWrapper) diVar.getContext()).setBaseContext(context.getApplicationContext());
            }
        } catch (ClassCastException unused) {
        }
        ViewGroup viewGroup = (ViewGroup) diVar.getParent();
        if (viewGroup != null) {
            try {
                viewGroup.removeView(diVar);
            } catch (Throwable unused2) {
            }
        }
    }

    private static void ri(WebView webView) {
        if (webView != null && ri > 0) {
            try {
                webView.evaluateJavascript("[].forEach.call(document.querySelectorAll('audio,video'), function(audio) { try { audio.pause(); } catch(e) {} })", null);
            } catch (Throwable unused) {
            }
        }
    }
}
