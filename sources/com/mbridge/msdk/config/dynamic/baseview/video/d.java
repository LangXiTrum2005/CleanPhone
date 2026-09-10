package com.mbridge.msdk.config.dynamic.baseview.video;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f32682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SimpleExoPlayer f32683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f32684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.a f32685e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32681a = 5000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f32686f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f32687g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f32688h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f32689i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Handler f32690j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f32691k = new a();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.b();
        }
    }

    public d(Context context, SimpleExoPlayer simpleExoPlayer) {
        this.f32682b = context;
        this.f32683c = simpleExoPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        q0.b("LocalVideoFileMonitor", " 触发 一次检查");
        try {
            File file = new File(this.f32684d);
            if (file.exists()) {
                a(file);
                return;
            }
            q0.b("LocalVideoFileMonitor", " 资源异常 原因 地址文件不存在");
            if (System.currentTimeMillis() - this.f32686f < this.f32681a) {
                this.f32690j.postDelayed(this.f32691k, 1000L);
            } else {
                a("resource buffer exception file is not found");
            }
        } catch (Exception e10) {
            a("resource buffer exception" + e10.getMessage());
        }
    }

    private void d() {
        this.f32686f = 0L;
        this.f32687g = 0L;
        this.f32688h = 0L;
        this.f32689i = 0L;
    }

    private void e() {
        if (this.f32683c != null) {
            com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f32685e;
            if (aVar != null) {
                aVar.onBufferingEnd();
            }
            ExtractorMediaSource extractorMediaSourceCreateMediaSource = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(this.f32682b, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(this.f32684d));
            this.f32683c.setRepeatMode(0);
            this.f32683c.prepare(extractorMediaSourceCreateMediaSource);
            this.f32683c.seekTo(this.f32687g);
            this.f32683c.setPlayWhenReady(true);
        }
        a();
    }

    public void c() {
        a();
        this.f32687g = 0L;
        this.f32688h = 0L;
        this.f32689i = 0L;
        this.f32682b = null;
        this.f32683c = null;
        this.f32685e = null;
    }

    public void a(String str, com.mbridge.msdk.config.dynamic.baseview.video.a aVar, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f32685e = aVar;
        if (i10 > 0) {
            this.f32681a = i10 * 1000;
        }
        this.f32684d = str;
    }

    public boolean a(ExoPlaybackException exoPlaybackException) {
        if (exoPlaybackException == null || exoPlaybackException.type != 0) {
            return false;
        }
        q0.b("LocalVideoFileMonitor", " 触发 资源异常 监控");
        d();
        com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f32685e;
        if (aVar != null) {
            aVar.onBufferingStart();
        }
        this.f32686f = System.currentTimeMillis();
        SimpleExoPlayer simpleExoPlayer = this.f32683c;
        if (simpleExoPlayer != null) {
            this.f32687g = simpleExoPlayer.getCurrentPosition();
        }
        this.f32690j.post(this.f32691k);
        return true;
    }

    private void a(File file) {
        q0.b("LocalVideoFileMonitor", " 资源异常 原因 地址文件存在 但是不完整");
        long length = file.length();
        long jLastModified = file.lastModified();
        long j10 = this.f32688h;
        boolean z10 = false;
        boolean z11 = (j10 == 0 || length == j10) ? false : true;
        long j11 = this.f32689i;
        if (j11 != 0 && jLastModified != j11) {
            z10 = true;
        }
        this.f32688h = length;
        this.f32689i = jLastModified;
        if (z11 || z10) {
            q0.b("LocalVideoFileMonitor", " 资源状态发生过变化 触发播放");
            e();
        } else if (System.currentTimeMillis() - this.f32686f < this.f32681a) {
            this.f32690j.postDelayed(this.f32691k, 1000L);
        } else {
            a("resource buffer time out");
        }
    }

    private void a() {
        this.f32690j.removeCallbacks(this.f32691k);
    }

    private void a(String str) {
        q0.b("LocalVideoFileMonitor", "通知外部 规定时间内 缓冲未成功");
        com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f32685e;
        if (aVar != null) {
            aVar.onBufferingTimeOut(str);
            this.f32685e.onPlayError(str);
        }
    }
}
