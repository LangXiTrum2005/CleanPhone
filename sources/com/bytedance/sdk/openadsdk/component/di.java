package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.vk.openvk.ri.ri.ri.ik.attabal;
import com.bytedance.sdk.component.fi.mj;
import com.bytedance.sdk.component.fi.qt;
import com.bytedance.sdk.component.fi.sf;
import com.bytedance.sdk.component.fi.slm;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.hcw;
import com.bytedance.sdk.openadsdk.core.model.igq;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.uq;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.core.wjv;
import com.bytedance.sdk.openadsdk.utils.bu;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.pv;
import com.bytedance.sdk.openadsdk.utils.qd;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import laky.saneness;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di {
    private static volatile di lr = null;
    private static String ri = "openad_image_cache";
    private final Context fi;
    private final com.bytedance.sdk.openadsdk.lr.lr ik;
    private final wjv<com.bytedance.sdk.openadsdk.ka.ri> ka;
    private final Map<String, AtomicInteger> di = new ConcurrentHashMap();
    private final Map<String, String> xha = new ConcurrentHashMap();

    public interface ik {
        void ri(Object obj);
    }

    public interface lr {
        void ri();

        void ri(int i, String str);
    }

    public interface ri {
        void ri();

        void ri(com.bytedance.sdk.openadsdk.ac.ri.lr lrVar);
    }

    private di(Context context) {
        if (context != null) {
            this.fi = context.getApplicationContext();
        } else {
            this.fi = nr.ri();
        }
        this.ik = new com.bytedance.sdk.openadsdk.lr.lr(10, 8, true);
        this.ka = nr.ik();
        ri += "_p";
        com.bytedance.sdk.openadsdk.common.lr.ri("tt_openad_materialMeta_new", new com.bytedance.sdk.openadsdk.common.lr.ri("tt_openad_materialMeta_new") { // from class: com.bytedance.sdk.openadsdk.component.di.1
            @Override // com.bytedance.sdk.openadsdk.common.lr.ri
            public String lr(String str) {
                return com.bytedance.sdk.openadsdk.tan.ka.ri.lr("tt_openad_materialMeta_new", "material".concat(String.valueOf(str)), (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.common.lr.ri
            public String ri(String str) {
                return "tt_openad_materialMeta_new";
            }

            @Override // com.bytedance.sdk.openadsdk.common.lr.ri
            public void ri(AdSlot adSlot, String str, String str2) {
                com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad_materialMeta_new", "material".concat(String.valueOf(adSlot.getCodeId())), str);
            }
        });
    }

    private int ka(AdSlot adSlot) {
        StringBuilder sb = new StringBuilder("material_expiration_time");
        sb.append(adSlot.getCodeId());
        return com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad", sb.toString(), -1L) == -1 ? 0 : 1;
    }

    private void lr(final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, final AdSlot adSlot, final hcw hcwVar, final com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        if (com.bytedance.sdk.openadsdk.component.xha.ri.fi()) {
            ri(wjvVar, adSlot, hcwVar, riVar);
        }
        ri(wjvVar, adSlot, hcwVar, new lr() { // from class: com.bytedance.sdk.openadsdk.component.di.7
            @Override // com.bytedance.sdk.openadsdk.component.di.lr
            public void ri() {
                if (com.bytedance.sdk.openadsdk.component.xha.ri.fi()) {
                    return;
                }
                di.this.ri(wjvVar, adSlot, hcwVar, riVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.di.lr
            public void ri(int i, String str) {
                di.this.ik(adSlot);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik(AdSlot adSlot) {
        AtomicInteger atomicInteger = this.di.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        } else {
            atomicInteger.decrementAndGet();
        }
        this.di.put(adSlot.getCodeId(), atomicInteger);
    }

    public static di ri(Context context) {
        if (lr == null) {
            synchronized (di.class) {
                try {
                    if (lr == null) {
                        lr = new di(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lr;
    }

    public void lr(int i) {
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad", "image_has_cached".concat(String.valueOf(i)), Boolean.TRUE);
    }

    public boolean lr(AdSlot adSlot) {
        if (!com.bytedance.sdk.openadsdk.component.xha.ri.fi() && adSlot != null) {
            String codeId = adSlot.getCodeId();
            if (com.bytedance.sdk.openadsdk.component.xha.ri.ri(adSlot) && !TextUtils.isEmpty(codeId)) {
                return this.xha.containsKey(codeId);
            }
        }
        return false;
    }

    private void ik(final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, final AdSlot adSlot, final hcw hcwVar, final com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        if (com.bytedance.sdk.openadsdk.component.xha.ri.fi()) {
            ri(wjvVar, adSlot, hcwVar, riVar);
        }
        ri(wjvVar, hcwVar, new ri() { // from class: com.bytedance.sdk.openadsdk.component.di.8
            @Override // com.bytedance.sdk.openadsdk.component.di.ri
            public void ri(com.bytedance.sdk.openadsdk.ac.ri.lr lrVar) {
                if (com.bytedance.sdk.openadsdk.component.xha.ri.fi()) {
                    return;
                }
                di.this.ri(wjvVar, adSlot, hcwVar, riVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.di.ri
            public void ri() {
                di.this.ik(adSlot);
            }
        });
    }

    private void lr(String str) {
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad_materialMeta_new", "material".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad_materialMeta", "material".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad", "material_expiration_time".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad", "video_has_cached".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad", "image_has_cached".concat(String.valueOf(str)));
    }

    public static void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, ik ikVar) {
        ri(wjvVar, ikVar, 0);
    }

    public String ik(int i) {
        String strLr = com.bytedance.sdk.openadsdk.common.lr.ri("tt_openad_materialMeta_new").lr(String.valueOf(i));
        long jRi = com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad", "material_expiration_time".concat(String.valueOf(i)), -1L);
        if (System.currentTimeMillis() / 1000 < jRi) {
            return strLr;
        }
        if (jRi != -1) {
            ri(i, (String) null);
            ri(strLr);
        }
        return null;
    }

    public static void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, final ik ikVar, final int i) {
        String strCuirassed = wjvVar.eu().cuirassed();
        if (TextUtils.isEmpty(strCuirassed)) {
            return;
        }
        qt qtVarKa = com.bytedance.sdk.openadsdk.qt.ka.ri(strCuirassed).ri(wjvVar.eu().impassible()).lr(wjvVar.eu().adultoid()).fi(qd.fi(nr.ri())).ka(qd.ik(nr.ri()));
        if (i > 0 && Build.VERSION.SDK_INT >= 26) {
            qtVarKa.ik(2).ri(new mj() { // from class: com.bytedance.sdk.openadsdk.component.di.4
                @Override // com.bytedance.sdk.component.fi.mj
                public Bitmap ri(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.ka.ri.ri(nr.ri(), bitmap, i);
                }
            });
        } else {
            qtVarKa.ik(1);
        }
        qtVarKa.ri(new com.bytedance.sdk.openadsdk.qt.lr(wjvVar, strCuirassed, new slm() { // from class: com.bytedance.sdk.openadsdk.component.di.5
            @Override // com.bytedance.sdk.component.fi.slm
            public void ri(int i2, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.fi.slm
            public void ri(sf sfVar) {
                ik ikVar2;
                if (sfVar == null || sfVar.lr() == null || sfVar.ik() == null || (ikVar2 = ikVar) == null) {
                    return;
                }
                ikVar2.ri(sfVar.lr());
            }
        }));
    }

    public File lr() {
        return com.bytedance.sdk.component.utils.xha.lr(nr.ri(), new File(CacheDirFactory.getRootDir()).getName() + "/" + ri);
    }

    public void ri(final AdSlot adSlot) {
        Objects.toString(adSlot);
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        AtomicInteger atomicInteger = this.di.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        }
        if (!com.bytedance.sdk.openadsdk.common.nr.ri().ri(adSlot.getCodeId(), atomicInteger.get(), atomicInteger.get() + ka(adSlot))) {
            com.bytedance.sdk.openadsdk.component.xha.ri.mj();
            return;
        }
        atomicInteger.incrementAndGet();
        this.di.put(adSlot.getCodeId(), atomicInteger);
        final hcw hcwVar = new hcw();
        hcwVar.ri(pv.lr());
        hcwVar.lr(com.bytedance.sdk.openadsdk.component.xha.ri.lr());
        hcwVar.lr(com.bytedance.sdk.openadsdk.component.xha.ri.ik());
        igq igqVar = new igq();
        igqVar.sf = hcwVar;
        igqVar.ka = 2;
        igqVar.jbs = 2;
        this.ka.ri(adSlot, igqVar, 3, new uq() { // from class: com.bytedance.sdk.openadsdk.component.di.6
            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(int i, String str) {
                di.this.ik(adSlot);
                com.bytedance.sdk.openadsdk.component.ka.ri.ri(hcwVar, 100, 2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar) {
                di.this.ri(riVar, ikVar, adSlot, hcwVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar, AdSlot adSlot, hcw hcwVar) {
        com.bytedance.sdk.openadsdk.component.ka.ri.ri(hcwVar, 100, 1);
        if (riVar != null && riVar.ka() != null && !riVar.ka().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = riVar.ka().get(0);
            if (wjvVar == null) {
                return;
            }
            if (wjvVar.ory()) {
                ri(wjvVar, adSlot, hcwVar, riVar);
                return;
            } else if (com.bytedance.sdk.openadsdk.core.model.wjv.fi(wjvVar)) {
                lr(wjvVar, adSlot, hcwVar, riVar);
                return;
            } else {
                ik(wjvVar, adSlot, hcwVar, riVar);
                return;
            }
        }
        ikVar.ri(-3);
        ikVar.ik(2);
        com.bytedance.sdk.openadsdk.core.model.ik.ri(ikVar);
    }

    public void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, AdSlot adSlot, hcw hcwVar, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        if (hcwVar != null) {
            wjvVar.ik(hcwVar.qt());
        }
        ri(new com.bytedance.sdk.openadsdk.component.fi.ri(wjvVar.ur(), wjvVar, riVar));
        com.bytedance.sdk.openadsdk.component.ka.ri.ri(wjvVar, 1, hcwVar);
        ik(adSlot);
    }

    public void ri(final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, AdSlot adSlot, final hcw hcwVar, final lr lrVar) {
        final pv pvVarLr = pv.lr();
        final int iUr = wjvVar.ur();
        attabal attabalVarEu = wjvVar.eu();
        String strSupplicat = attabalVarEu.supplicat();
        String strDern = attabalVarEu.dern();
        if (TextUtils.isEmpty(strDern)) {
            strDern = com.bytedance.sdk.component.utils.fi.ri(strSupplicat);
        }
        final File fileRi = com.bytedance.sdk.openadsdk.component.xha.ri.ri(strDern);
        if (fileRi.exists()) {
            com.bytedance.sdk.openadsdk.component.xha.ri.ri(fileRi);
            ri(iUr);
            long jKa = pvVarLr.ka();
            if (hcwVar != null) {
                hcwVar.ri(jKa);
                hcwVar.ri(1);
            }
            lrVar.ri();
            ri(wjvVar, (ik) null);
            return;
        }
        if (nr.ka().fr(String.valueOf(iUr)) && !com.bytedance.sdk.component.utils.nr.ka(nr.ri())) {
            lrVar.ri(100, "OnlyWifi");
            return;
        }
        com.bytedance.sdk.openadsdk.core.bgr.ri.lr lrVarRi = com.bytedance.sdk.openadsdk.core.model.wjv.ri(fileRi.getParent(), wjvVar);
        lrVarRi.ri("material_meta", wjvVar);
        lrVarRi.ri("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.bgr.fi.ri.ri(lrVarRi, new saneness.attabal() { // from class: com.bytedance.sdk.openadsdk.component.di.9
            @Override // laky.saneness.attabal
            public void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar, int i) {
                di.this.ri(iUr);
                long jKa2 = pvVarLr.ka();
                com.bytedance.sdk.openadsdk.component.ka.ri.lr(wjvVar, jKa2, true);
                hcw hcwVar2 = hcwVar;
                if (hcwVar2 != null) {
                    hcwVar2.ri(jKa2);
                    hcwVar.ri(2);
                }
                lrVar.ri();
                di.ri(wjvVar, (ik) null);
            }

            @Override // laky.saneness.attabal
            public void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar, int i, String str) {
                long jKa2 = pvVarLr.ka();
                com.bytedance.sdk.openadsdk.component.ka.ri.lr(wjvVar, jKa2, false);
                hcw hcwVar2 = hcwVar;
                if (hcwVar2 != null) {
                    hcwVar2.ri(jKa2);
                }
                lrVar.ri(i, str);
                try {
                    if (fileRi.exists() && fileRi.isFile()) {
                        com.bytedance.sdk.component.utils.xha.ik(fileRi);
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // laky.saneness.attabal
            public void lr(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar, int i) {
            }
        });
    }

    public void ri(final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, final hcw hcwVar, final ri riVar) {
        final pv pvVarLr = pv.lr();
        final int iUr = wjvVar.ur();
        com.bytedance.sdk.openadsdk.core.model.nr nrVar = wjvVar.rbz().get(0);
        String strXha = nrVar.xha();
        String strRi = nrVar.ri();
        int iLr = nrVar.lr();
        int iIk = nrVar.ik();
        String strRi2 = TextUtils.isEmpty(strXha) ? com.bytedance.sdk.component.utils.fi.ri(strRi) : strXha;
        if (TextUtils.isEmpty(strRi2)) {
            if (riVar != null) {
                riVar.ri();
                return;
            }
            return;
        }
        File fileLr = com.bytedance.sdk.openadsdk.component.xha.ri.lr(strRi2);
        if (ri(strRi, strXha)) {
            lr(iUr);
            long jKa = pvVarLr.ka();
            if (hcwVar != null) {
                hcwVar.ri(jKa);
                hcwVar.ri(1);
            }
            riVar.ri(null);
            return;
        }
        bu.ri(new com.bytedance.sdk.openadsdk.ac.ri(strRi, nrVar.xha()), iLr, iIk, new bu.ri() { // from class: com.bytedance.sdk.openadsdk.component.di.10
            @Override // com.bytedance.sdk.openadsdk.utils.bu.ri
            public void ri(com.bytedance.sdk.openadsdk.ac.ri.lr lrVar) {
                if (!lrVar.fi()) {
                    com.bytedance.sdk.openadsdk.component.ka.ri.ri(wjvVar, pvVarLr.ka(), false);
                    riVar.ri();
                    return;
                }
                di.this.lr(iUr);
                long jKa2 = pvVarLr.ka();
                com.bytedance.sdk.openadsdk.component.ka.ri.ri(wjvVar, jKa2, true);
                hcw hcwVar2 = hcwVar;
                if (hcwVar2 != null) {
                    hcwVar2.ri(jKa2);
                    hcwVar.ri(2);
                }
                riVar.ri(lrVar);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.bu.ri
            public void ri() {
                com.bytedance.sdk.openadsdk.component.ka.ri.ri(wjvVar, pvVarLr.ka(), false);
                riVar.ri();
            }
        }, fileLr.getParent());
    }

    public void ri(int i) {
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad", "video_has_cached".concat(String.valueOf(i)), Boolean.TRUE);
    }

    public void ri(final com.bytedance.sdk.openadsdk.component.fi.ri riVar) {
        vr.lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.di.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.core.model.wjv wjvVarLr = riVar.lr();
                    if (wjvVarLr == null || com.bytedance.sdk.openadsdk.core.model.wjv.di(wjvVarLr) || wjvVarLr.bl()) {
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.component.xha.ri.fi()) {
                        com.bytedance.sdk.openadsdk.common.nr.ri().ri(wjvVarLr, riVar.ik());
                        return;
                    }
                    if (di.this.lr(wjvVarLr.eb())) {
                        return;
                    }
                    di.this.ri(wjvVarLr.eb(), wjvVarLr.jf());
                    com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad", "material_expiration_time" + riVar.ri(), Long.valueOf(wjvVarLr.cem()));
                    com.bytedance.sdk.openadsdk.common.lr.ri("tt_openad_materialMeta_new").ri(riVar.lr().eb(), riVar.ik());
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void ri(final String str) {
        dzy.ri(new com.bytedance.sdk.component.mj.lr.ik("opencache") { // from class: com.bytedance.sdk.openadsdk.component.di.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.model.ri riVarLr;
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("cypher")) {
                        jSONObject = nr.ik().ri(jSONObject);
                    }
                    if (jSONObject == null || !jSONObject.has("creatives") || (riVarLr = com.bytedance.sdk.openadsdk.core.model.ri.lr(jSONObject)) == null || !riVarLr.fi()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.ka.ri.ri(riVarLr.di());
                } catch (Throwable unused) {
                }
            }
        });
    }

    public String ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar != null && wjvVar.eu() != null && !TextUtils.isEmpty(wjvVar.eu().supplicat())) {
            String strSupplicat = wjvVar.eu().supplicat();
            String strDern = wjvVar.eu().dern();
            if (TextUtils.isEmpty(strDern)) {
                strDern = com.bytedance.sdk.component.utils.fi.ri(strSupplicat);
            }
            File fileRi = com.bytedance.sdk.openadsdk.component.xha.ri.ri(strDern);
            if (fileRi.exists() && fileRi.isFile()) {
                return fileRi.getAbsolutePath();
            }
        }
        return null;
    }

    public boolean ri(String str, String str2) {
        boolean z;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = com.bytedance.sdk.component.utils.fi.ri(str);
            }
            File fileLr = com.bytedance.sdk.openadsdk.component.xha.ri.lr(str2);
            InputStream inputStreamRi = com.bytedance.sdk.openadsdk.qt.ka.ri(str, str2);
            if (inputStreamRi != null) {
                try {
                    inputStreamRi.close();
                } catch (IOException e) {
                    ac.ik("TTAppOpenAdCacheManager", e.getMessage());
                }
                z = true;
            } else {
                z = false;
            }
            if (z || !(com.bytedance.sdk.openadsdk.qt.ka.ri(str, str2, fileLr.getParent()) || new File(fileLr.getPath()).exists())) {
                return z;
            }
            return true;
        } catch (Exception e2) {
            ac.ik("TTAppOpenAdCacheManager", e2.getMessage());
            return false;
        }
    }

    public void ri(AdSlot adSlot, String str) {
        if (com.bytedance.sdk.openadsdk.component.xha.ri.fi() || adSlot == null || TextUtils.isEmpty(str)) {
            return;
        }
        String codeId = adSlot.getCodeId();
        boolean z = adSlot.getCacheScene() != 0;
        if (!com.bytedance.sdk.openadsdk.component.xha.ri.ri(adSlot) || z || TextUtils.isEmpty(codeId)) {
            return;
        }
        this.xha.put(codeId, str);
    }

    public void ri(int i, String str) {
        String strValueOf = String.valueOf(i);
        if (com.bytedance.sdk.openadsdk.component.xha.ri.fi()) {
            com.bytedance.sdk.openadsdk.common.nr.ri().ri(strValueOf, str);
            return;
        }
        if (this.xha.size() != 0 && !TextUtils.isEmpty(str) && this.xha.containsKey(strValueOf)) {
            if (this.xha.containsValue(str)) {
                this.xha.remove(strValueOf);
                lr(strValueOf);
                return;
            }
            return;
        }
        lr(strValueOf);
    }

    public void ri() {
        File[] fileArrListFiles;
        try {
            com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad_materialMeta");
            com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad_materialMeta_new");
            com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_openad");
        } catch (Throwable unused) {
        }
        try {
            File file = new File(CacheDirFactory.getRootDir());
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.di.3
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 == null) {
                        return false;
                    }
                    String name = file2.getName();
                    return name.contains(di.ri) || name.contains("openad_video_cache");
                }
            })) != null) {
                for (File file2 : fileArrListFiles) {
                    try {
                        com.bytedance.sdk.component.utils.xha.ik(file2);
                    } catch (Throwable unused2) {
                    }
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
