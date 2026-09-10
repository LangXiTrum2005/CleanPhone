package com.mbridge.msdk.config.component.load;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.config.component.load.downloader.b;
import com.mbridge.msdk.config.component.load.downloader.d;
import com.mbridge.msdk.config.component.load.downloader.e;
import com.mbridge.msdk.config.component.load.downloader.f;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class LoadCpt extends com.mbridge.msdk.config.component.base.a {
    com.mbridge.msdk.config.component.load.model.a l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f32092h = "LoadCpt";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f32093i = "1000001";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final String f32094j = "1000002";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final String f32095k = "1000003";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f32096m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final f f32097n = new a();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements f {
        public a() {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void a(b bVar) {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void b(b bVar) {
            HashMap map = new HashMap();
            map.put(c.c("file_size"), String.valueOf(bVar.c()));
            LoadCpt loadCpt = LoadCpt.this;
            loadCpt.a(loadCpt.a("912002", (Map<String, Object>) map));
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void d(b bVar) {
            HashMap map = new HashMap();
            map.put(c.c("percent"), String.valueOf(bVar.d()));
            map.put(c.c("file_size"), String.valueOf(bVar.c()));
            map.put(c.c("file_path"), bVar.h());
            map.put(c.c("md5"), bVar.j());
            map.put(c.c("hit_cache"), Integer.valueOf(bVar.k() ? 1 : 0));
            map.put(c.c("result"), 1);
            try {
                com.mbridge.msdk.config.component.common.file.b bVarF = com.mbridge.msdk.config.component.common.file.a.f(LoadCpt.this.l.f());
                if (bVarF != null && bVarF.b().contains("zip") && bVar.d() >= 100) {
                    if (TextUtils.isEmpty(bVarF.d())) {
                        map.put(c.c("file_path"), bVarF.d());
                    } else {
                        if (!com.mbridge.msdk.config.component.common.file.a.f(bVar.h(), com.mbridge.msdk.config.component.common.file.a.d(LoadCpt.this.l.f(), LoadCpt.this.l.b()))) {
                            LoadCpt.this.a("912005", "1000003", "Unzip file failed");
                            return;
                        }
                        map.put(c.c("file_path"), com.mbridge.msdk.config.component.common.file.a.e(LoadCpt.this.l.f(), LoadCpt.this.l.b()));
                    }
                }
                LoadCpt loadCpt = LoadCpt.this;
                loadCpt.a(loadCpt.a("912004", (Map<String, Object>) new HashMap(map)));
                LoadCpt loadCpt2 = LoadCpt.this;
                loadCpt2.a(loadCpt2.a("912008", (Map<String, Object>) new HashMap(map)));
                if (bVar.k()) {
                    return;
                }
                LoadCpt.this.a("912006", (HashMap<String, Object>) new HashMap(map));
            } catch (Exception e10) {
                LoadCpt.this.a("912005", "1000002", e10.getMessage());
                HashMap map2 = new HashMap(map);
                map2.put(c.c("result"), 0);
                map2.put(c.c("reason"), e10.getMessage());
                LoadCpt loadCpt3 = LoadCpt.this;
                loadCpt3.a(loadCpt3.a("912008", (Map<String, Object>) map2));
            }
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void a(b bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
            HashMap map = new HashMap();
            map.put(c.c("percent"), String.valueOf(bVar.d()));
            map.put(c.c("file_size"), String.valueOf(bVar.c()));
            map.put(c.c("code"), "1000002");
            map.put(c.c("reason"), aVar.a().getMessage());
            map.put(c.c("result"), 0);
            LoadCpt loadCpt = LoadCpt.this;
            loadCpt.a(loadCpt.a("912005", (Map<String, Object>) new HashMap(map)));
            LoadCpt loadCpt2 = LoadCpt.this;
            loadCpt2.a(loadCpt2.a("912008", (Map<String, Object>) new HashMap(map)));
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void a(b bVar, DownloadProgress downloadProgress) {
            int currentDownloadRate = downloadProgress.getCurrentDownloadRate();
            if (bVar.k()) {
                return;
            }
            LoadCpt loadCpt = LoadCpt.this;
            if (currentDownloadRate == loadCpt.f32096m) {
                return;
            }
            loadCpt.f32096m = currentDownloadRate;
            HashMap map = new HashMap();
            map.put(c.c("percent"), String.valueOf(currentDownloadRate));
            map.put(c.c("file_size"), String.valueOf(downloadProgress.getTotal()));
            LoadCpt loadCpt2 = LoadCpt.this;
            loadCpt2.a(loadCpt2.a("912003", (Map<String, Object>) map));
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void c(b bVar) {
        }
    }

    private void g() {
        try {
            com.mbridge.msdk.config.component.common.file.b bVarB = com.mbridge.msdk.config.component.common.file.a.b(this.l.f(), this.l.b());
            if (bVarB == null) {
                a("912005", "1000002", "Get local file path error");
                return;
            }
            try {
                new URL(this.l.f());
                int iD = (int) (this.l.d() * 100.0f);
                com.mbridge.msdk.config.component.load.model.a aVar = this.l;
                b bVar = new b(aVar, aVar.f(), this.l.b(), bVarB.a(), iD);
                bVar.a(this.l.a());
                e.a().a(bVar).b(this.l.h()).a(this.l.h()).c(this.l.h()).a(2).withHttpRetryCounter(this.l.g()).a(this.f32097n).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).build().m();
            } catch (Exception e10) {
                q0.b("LoadCpt", e10.getMessage());
                a("912005", "1000002", "Illegal Uri");
            }
        } catch (Throwable th2) {
            q0.b("LoadCpt", th2.getMessage());
            HashMap map = new HashMap();
            map.put(c.c("code"), "");
            map.put(c.c("reason"), th2.getMessage());
            a(a("912005", (Map<String, Object>) map));
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f31828f = "912001";
        this.l = new com.mbridge.msdk.config.component.load.model.a(map);
        h();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        if (TextUtils.isEmpty(this.l.c())) {
            a("912005", "1000001", "Input parameter error");
            return;
        }
        if (this.l.c().equals(c.c("310"))) {
            j();
        }
        if (this.l.c().equals(c.c("311"))) {
            i();
        }
        a("912007", (HashMap<String, Object>) null);
    }

    public void h() {
        try {
            if (e.a().b()) {
                return;
            }
            e.a().a(new d.b().a(this.l.e()).a());
        } catch (Throwable th2) {
            q0.b("LoadCpt", th2.getMessage());
        }
    }

    public void i() {
        if (this.l != null) {
            String strB = e.a().b(this.l.f());
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            e.a().a(strB);
        }
    }

    public void j() {
        if (this.l != null) {
            g();
        }
    }
}
