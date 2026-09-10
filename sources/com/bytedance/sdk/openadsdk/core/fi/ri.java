package com.bytedance.sdk.openadsdk.core.fi;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.fi;
import com.bytedance.sdk.component.utils.xha;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.bgr.ik.ik;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.slm.ka;
import com.bytedance.sdk.openadsdk.slm.lr;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private final List<String> ri = new CopyOnWriteArrayList();
    private final ik lr = new ik(5, 5, true);
    private final ConcurrentHashMap<String, Long> ik = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.fi.ri$ri, reason: collision with other inner class name */
    public static class C0249ri {
        private static final ri ri = new ri();
    }

    private boolean ik(String str) {
        return !this.ri.contains(str);
    }

    public File lr(String str) {
        String strRi = fi.ri(str);
        if (strRi == null) {
            return null;
        }
        File fileRi = ri(nr.ri());
        fileRi.getAbsoluteFile();
        return new File(fileRi, strRi);
    }

    public void ik() {
        ka.ri("music_preload_start", false, new lr() { // from class: com.bytedance.sdk.openadsdk.core.fi.ri.2
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                com.bytedance.sdk.openadsdk.slm.ri.ka kaVarRi = com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("music_preload_start");
                kaVarRi.ri();
                return kaVarRi;
            }
        });
    }

    public static ri ri() {
        return C0249ri.ri;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        List<wjv> listKa = riVar.ka();
        if (listKa == null || listKa.size() == 0) {
            return;
        }
        for (int i = 0; i < listKa.size(); i++) {
            wjv wjvVar = listKa.get(i);
            if (wjvVar != null) {
                ri(wjvVar);
            }
        }
    }

    public void lr() {
        File fileRi = ri(nr.ri());
        fileRi.getAbsolutePath();
        try {
            this.lr.ri(fileRi);
        } catch (IOException e) {
            ac.ri("MusicCacheManager", "trimFileCache fail", e);
        }
    }

    public InputStream ri(String str) {
        File fileLr = lr(str);
        if (fileLr == null || !ri(fileLr)) {
            return null;
        }
        try {
            return new FileInputStream(fileLr);
        } catch (Exception e) {
            ac.ik("MusicCacheManager", e.getMessage());
            return null;
        }
    }

    private void ri(wjv wjvVar) {
        wjv.ri riVarSez;
        String strJbs;
        if (wjvVar == null || (riVarSez = wjvVar.sez()) == null || (strJbs = riVarSez.jbs()) == null || !strJbs.contains("music_url")) {
            return;
        }
        ik();
        String strLr = riVarSez.lr();
        if (TextUtils.isEmpty(strLr)) {
            try {
                new JSONObject().put("result", 0);
            } catch (JSONException e) {
                ac.ik("MusicCacheManager", e.getMessage());
            }
            ri(0, -1L, 10001, "music url string is null");
            return;
        }
        File fileLr = lr(strLr);
        if (fileLr == null) {
            return;
        }
        fileLr.getPath();
        if (ri(fileLr)) {
            ri(2, -1L, -1, null);
        } else {
            ri(wjvVar, strLr, fileLr);
        }
    }

    private File ri(Context context) {
        return xha.lr(context, new File(CacheDirFactory.getRootDir()).getName() + "/music");
    }

    private boolean ri(File file) {
        return file.exists() && file.length() != 0;
    }

    private void ri(wjv wjvVar, String str, File file) {
        if (ik(str)) {
            this.ik.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            com.bytedance.sdk.component.xha.lr.ri riVarKa = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().ka();
            riVarKa.ik(str);
            riVarKa.ri(file.getParent(), file.getName());
            riVarKa.ka(str);
            this.ri.add(str);
            riVarKa.ri(new com.bytedance.sdk.component.xha.ri.ri() { // from class: com.bytedance.sdk.openadsdk.core.fi.ri.1
                @Override // com.bytedance.sdk.component.xha.ri.ri
                public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, com.bytedance.sdk.component.xha.lr lrVar) {
                    lrVar.ik();
                    lrVar.ri();
                    String strKa = ikVar.ka();
                    Long l = (Long) ri.this.ik.get(strKa);
                    if (lrVar.di() && lrVar.fi() != null && lrVar.fi().exists()) {
                        lrVar.fi();
                        if (l != null) {
                            ri.this.ik.remove(strKa);
                            ri.this.ri(1, SystemClock.elapsedRealtime() - l.longValue(), -1, null);
                        }
                        try {
                            xha.lr(lrVar.fi());
                        } catch (IOException e) {
                            ac.ik("MusicCacheManager", e.getMessage());
                        }
                    }
                    if (lrVar.di() || l == null) {
                        return;
                    }
                    ri.this.ri(0, SystemClock.elapsedRealtime() - l.longValue(), -2, "http response status code isn't 200");
                }

                @Override // com.bytedance.sdk.component.xha.ri.ri
                public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, IOException iOException) {
                    Long l = (Long) ri.this.ik.get(ikVar.ka());
                    if (l != null) {
                        ri.this.ri(0, SystemClock.elapsedRealtime() - l.longValue(), -2, "http response status code isn't 200");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(final int i, final long j, final int i2, final String str) {
        ka.ri("music_preload_finish", false, new lr() { // from class: com.bytedance.sdk.openadsdk.core.fi.ri.3
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", i);
                long j2 = j;
                if (j2 != -1) {
                    jSONObject.put("load_duration", j2);
                }
                com.bytedance.sdk.openadsdk.slm.ri.ka kaVarLr = com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("music_preload_finish").lr(jSONObject.toString());
                if (!TextUtils.isEmpty(str)) {
                    kaVarLr.lr(i2);
                    kaVarLr.di(str);
                }
                kaVarLr.ri();
                return kaVarLr;
            }
        });
    }

    public void ri(final boolean z) {
        ka.ri("music_cache", false, new lr() { // from class: com.bytedance.sdk.openadsdk.core.fi.ri.4
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", z);
                com.bytedance.sdk.openadsdk.slm.ri.ka kaVarLr = com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("music_cache").lr(jSONObject.toString());
                kaVarLr.ri();
                return kaVarLr;
            }
        });
    }
}
