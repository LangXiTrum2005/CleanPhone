package com.startapp.sdk.ads.video;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.iab.omid.library.startio.adsession.AdSession;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.startio.adsession.media.InteractionType;
import com.iab.omid.library.startio.adsession.media.MediaEvents;
import com.iab.omid.library.startio.adsession.media.Position;
import com.iab.omid.library.startio.adsession.media.VastProperties;
import com.p004ironsource.d9;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface$VideoPlayerErrorType;
import com.startapp.sdk.ads.video.tracking.AbsoluteTrackingLink;
import com.startapp.sdk.ads.video.tracking.ActionTrackingLink;
import com.startapp.sdk.ads.video.tracking.FractionTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoClickedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoProgressTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.ag;
import com.startapp.sdk.internal.bk;
import com.startapp.sdk.internal.ck;
import com.startapp.sdk.internal.fb;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.gk;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.i0;
import com.startapp.sdk.internal.jj;
import com.startapp.sdk.internal.li;
import com.startapp.sdk.internal.lj;
import com.startapp.sdk.internal.mj;
import com.startapp.sdk.internal.oa;
import com.startapp.sdk.internal.oj;
import com.startapp.sdk.internal.qe;
import com.startapp.sdk.internal.qj;
import com.startapp.sdk.internal.re;
import com.startapp.sdk.internal.rj;
import com.startapp.sdk.internal.sd;
import com.startapp.sdk.internal.sj;
import com.startapp.sdk.internal.tj;
import com.startapp.sdk.internal.uf;
import com.startapp.sdk.internal.uj;
import com.startapp.sdk.internal.vd;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.vj;
import com.startapp.sdk.internal.wj;
import com.startapp.sdk.internal.x0;
import com.startapp.sdk.internal.xj;
import com.startapp.sdk.internal.yj;
import com.startapp.sdk.internal.za;
import com.startapp.sdk.internal.zb;
import com.startapp.sdk.internal.zj;
import com.startapp.sdk.omsdk.VerificationDetails;
import com.startapp.startappsdk.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends za {
    public static final int t0 = R.id.io_start_video_view;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public sd f40531N;
    public VideoView O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public RelativeLayout f40532P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public RelativeLayout f40533Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ProgressBar f40534R;
    public boolean S;
    public boolean T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f40535U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f40536V;
    public boolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f40537Y;
    public boolean a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f40538b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f40539c0;
    public int e0;
    public boolean f0;
    public boolean g0;
    public int h0;
    public long i0;
    public boolean r0;
    public int W = 1;
    public int Z = 0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f40540d0 = 0;
    public String j0 = null;
    public final Handler k0 = new Handler();
    public final HashMap l0 = new HashMap();
    public final HashMap m0 = new HashMap();
    public final HashMap n0 = new HashMap();
    public final HashMap o0 = new HashMap();
    public final Handler p0 = new Handler();
    public final uj q0 = new uj(this);
    public final vj s0 = new vj(this);

    public final void A() {
        FractionTrackingLink[] fractionTrackingLinkArrC = x().getVideoTrackingDetails().c();
        if (fractionTrackingLinkArrC != null) {
            for (FractionTrackingLink fractionTrackingLink : fractionTrackingLinkArrC) {
                List arrayList = (List) this.n0.get(Integer.valueOf(fractionTrackingLink.g()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.n0.put(Integer.valueOf(fractionTrackingLink.g()), arrayList);
                }
                arrayList.add(fractionTrackingLink);
            }
        }
        AbsoluteTrackingLink[] absoluteTrackingLinkArrA = x().getVideoTrackingDetails().a();
        if (absoluteTrackingLinkArrA != null) {
            for (AbsoluteTrackingLink absoluteTrackingLink : absoluteTrackingLinkArrA) {
                List arrayList2 = (List) this.o0.get(Integer.valueOf(absoluteTrackingLink.g()));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.o0.put(Integer.valueOf(absoluteTrackingLink.g()), arrayList2);
                }
                arrayList2.add(absoluteTrackingLink);
            }
        }
    }

    public final boolean B() {
        if (this.a0) {
            return this.Z >= AdsCommonMetaData.k().F().j() && C() && this.T;
        }
        return C() && this.T;
    }

    public final boolean C() {
        sd sdVar = this.f40531N;
        return (sdVar == null || sdVar.g == null) ? false : true;
    }

    public final boolean D() {
        sd sdVar;
        boolean zIsSkippable = x().isSkippable();
        Long unskipLess = x().getUnskipLess();
        if (unskipLess == null || (sdVar = this.f40531N) == null || sdVar.g == null) {
            return zIsSkippable;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return zIsSkippable && timeUnit.toSeconds((long) sdVar.f41480h.getDuration()) > timeUnit.toSeconds(unskipLess.longValue());
    }

    public final boolean E() {
        return this.C > 0 || D() || this.X;
    }

    public final void F() {
        sd sdVar = this.f40531N;
        if (sdVar != null) {
            try {
                boolean z2 = this.S;
                MediaPlayer mediaPlayer = sdVar.g;
                if (mediaPlayer != null) {
                    if (z2) {
                        mediaPlayer.setVolume(0.0f, 0.0f);
                    } else {
                        mediaPlayer.setVolume(1.0f, 1.0f);
                    }
                }
            } catch (Throwable th) {
                g9.a(th);
            }
        }
        vi.a(this.v, true, "videoApi.setSound", this.S ? "OFF" : "ON");
    }

    public final void G() {
        if (this.f40531N == null) {
            return;
        }
        boolean zQ = AdsCommonMetaData.k().F().q();
        String localVideoPath = x().getLocalVideoPath();
        if (localVideoPath != null) {
            sd sdVar = this.f40531N;
            if (sdVar != null) {
                sdVar.a(localVideoPath);
            }
            if (zQ && localVideoPath.endsWith(".temp")) {
                this.a0 = true;
                this.f40539c0 = true;
                this.Z = AdsCommonMetaData.k().F().j();
            }
        } else if (zQ) {
            String videoUrl = x().getVideoUrl();
            re reVar = qe.f41406a;
            if (videoUrl != null && videoUrl.equals(reVar.f41447c)) {
                reVar.f41445a = false;
            }
            sd sdVar2 = this.f40531N;
            if (sdVar2 != null) {
                sdVar2.a(videoUrl);
            }
            this.a0 = true;
            ProgressBar progressBar = this.f40534R;
            if (progressBar == null || !progressBar.isShown()) {
                this.k0.postDelayed(new qj(this), AdsCommonMetaData.k().F().h());
            }
        } else {
            a(VideoMode$VideoFinishedReason.SKIPPED);
        }
        if (this.j0 == null) {
            this.j0 = this.a0 ? "2" : "1";
        }
    }

    public final void H() {
        VideoView videoView;
        vd vdVar;
        this.f40538b0 = true;
        if (this.g0) {
            sd sdVar = this.f40531N;
            if (sdVar != null) {
                sdVar.f41480h.pause();
                return;
            }
            return;
        }
        boolean z2 = u() == 0;
        if (z2) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            vi.a(this.v, true, "videoApi.setVideoDuration", Long.valueOf(timeUnit.toSeconds(v())));
            vi.a(this.v, true, "videoApi.setVideoRemainingTimer", 0);
            vi.a(this.v, true, "videoApi.setSkipTimer", Long.valueOf(timeUnit.toSeconds(w())));
            vi.a(this.v, true, "videoApi.setVideoCurrentPosition", Long.valueOf(timeUnit.toSeconds(u())));
        }
        if (this.f40531N != null) {
            if (z2) {
                a((ImageButton) null);
            }
            sd sdVar2 = this.f40531N;
            if (sdVar2 != null) {
                sdVar2.f41480h.start();
                this.v.setBackgroundColor(33554431);
            }
            int iV = v();
            if (z2 && iV > 0 && (vdVar = this.f41770F) != null) {
                float f = iV;
                float f2 = this.S ? 0.0f : 1.0f;
                MediaEvents mediaEvents = vdVar.f41581c;
                if (mediaEvents != null) {
                    mediaEvents.start(f, f2);
                }
            }
            I();
            if (this.f40538b0 && (videoView = this.O) != null) {
                a(videoView);
            }
        }
        this.f41607b.f40608b.setVisibility(0);
        F();
    }

    public final void I() {
        ProgressBar progressBar;
        this.k0.removeCallbacksAndMessages(null);
        ProgressBar progressBar2 = this.f40534R;
        if (progressBar2 == null || !progressBar2.isShown() || (progressBar = this.f40534R) == null) {
            return;
        }
        progressBar.setVisibility(8);
    }

    @Override // com.startapp.sdk.internal.za, com.startapp.sdk.internal.w7
    public final void a(Bundle bundle) {
        super.a(bundle);
        try {
            int i2 = AdsCommonMetaData.k().F().i();
            if (i2 > 0) {
                this.e0 = 100 / i2;
            } else {
                this.e0 = 0;
            }
            y();
            A();
            this.S = x().isVideoMuted() || AdsCommonMetaData.k().F().m().equals("muted");
        } catch (Throwable th) {
            g9.a(th);
            Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
            intent.putExtra("showFailedReason", NotDisplayedReason.VIDEO_ERROR);
            zb.a(this.f41606a).a(intent);
            this.f40536V = true;
            b();
        }
    }

    @Override // com.startapp.sdk.internal.za, com.startapp.sdk.internal.w7
    public final void b() {
        String localVideoPath;
        super.b();
        if (this.f40539c0 && (localVideoPath = x().getLocalVideoPath()) != null && localVideoPath.endsWith(".temp")) {
            new File(localVideoPath).delete();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    @Override // com.startapp.sdk.internal.za, com.startapp.sdk.internal.w7
    public final boolean c() {
        long seconds;
        if (this.g0) {
            i();
            return false;
        }
        if (this.f40531N == null) {
            return false;
        }
        int iU = u();
        if (!this.X && this.C <= 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            seconds = timeUnit.toSeconds(w()) - timeUnit.toSeconds(iU);
            if (seconds <= 0) {
                seconds = 0;
            }
        } else {
            seconds = 0;
        }
        if (!E() || seconds != 0) {
            if (!x().isCloseable() && !this.f40537Y) {
                return true;
            }
            i();
            return false;
        }
        ProgressBar progressBar = this.f40534R;
        if (progressBar != null && progressBar.isShown()) {
            I();
        }
        a(VideoMode$VideoFinishedReason.SKIPPED);
        a(this.h0, new VideoTrackingParams(a(this.h0), this.C, this.o, this.j0), "skipped", x().getVideoTrackingDetails().p());
        return true;
    }

    @Override // com.startapp.sdk.internal.za, com.startapp.sdk.internal.w7
    public final void f() {
        MediaEvents mediaEvents;
        if (!this.g0 && !this.f41606a.isFinishing() && !this.f40537Y && !this.X) {
            VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
            sd sdVar = this.f40531N;
            if (sdVar != null) {
                sdVar.f41480h.pause();
                vd vdVar = this.f41770F;
                if (vdVar != null && (mediaEvents = vdVar.f41581c) != null) {
                    mediaEvents.pause();
                }
            }
            a(this.h0, new VideoPausedTrackingParams(this.o, a(this.h0), this.C, this.W, pauseOrigin, this.j0), d9.h.e0, x().getVideoTrackingDetails().j());
        }
        sd sdVar2 = this.f40531N;
        if (sdVar2 != null) {
            MediaPlayer mediaPlayer = sdVar2.g;
            if (mediaPlayer != null) {
                mediaPlayer.setOnSeekCompleteListener(null);
                sdVar2.g = null;
            }
            qe.f41406a.f41446b = null;
            this.f40531N = null;
        }
        I();
        if (this.r0) {
            this.f41606a.unregisterReceiver(this.s0);
            this.r0 = false;
        }
        this.p0.removeCallbacksAndMessages(null);
        super.f();
    }

    @Override // com.startapp.sdk.internal.za, com.startapp.sdk.internal.w7
    public final void g() {
        super.g();
        if (this.f41606a.isFinishing()) {
            return;
        }
        this.f41606a.registerReceiver(this.s0, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.r0 = true;
        if (this.O == null) {
            Context contextA = x0.a(this.f41606a);
            if (contextA == null) {
                contextA = this.f41606a;
            }
            this.f40533Q = (RelativeLayout) this.f41606a.findViewById(i0.f41076h);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            VideoView videoView = new VideoView(contextA);
            this.O = videoView;
            videoView.setId(t0);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(13);
            ProgressBar progressBar = new ProgressBar(contextA, null, android.R.attr.progressBarStyleInverse);
            this.f40534R = progressBar;
            progressBar.setVisibility(4);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(14);
            layoutParams3.addRule(15);
            RelativeLayout relativeLayout = new RelativeLayout(contextA);
            this.f40532P = relativeLayout;
            relativeLayout.setId(i0.k);
            this.f41606a.setContentView(this.f40532P);
            this.f40532P.addView(this.O, layoutParams2);
            this.f40532P.addView(this.f40533Q, layoutParams);
            this.f40532P.addView(this.f40534R, layoutParams3);
            if (i0.g.booleanValue()) {
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams4.addRule(12);
                layoutParams4.addRule(14);
                RelativeLayout relativeLayout2 = this.f40532P;
                TextView textView = new TextView(contextA);
                textView.setBackgroundColor(-16777216);
                textView.setAlpha(0.5f);
                textView.setTextColor(-7829368);
                textView.setSingleLine(false);
                textView.setText("url=" + x().getVideoUrl());
                relativeLayout2.addView(textView, layoutParams4);
            }
            this.f41607b.f40608b.setVisibility(4);
        }
        if (this.f40531N == null) {
            this.f40531N = new sd(this.O);
        }
        this.f40535U = false;
        RelativeLayout relativeLayout3 = this.f40532P;
        if (relativeLayout3 != null) {
            relativeLayout3.setBackgroundColor(-16777216);
        }
        G();
        if (this.g0) {
            this.f41607b.f40608b.setVisibility(0);
            this.O.setVisibility(4);
        }
        sd sdVar = this.f40531N;
        sdVar.f40849e = new wj(this);
        sdVar.f40847b = new xj(this);
        sdVar.d = new b(this);
        yj yjVar = new yj(this);
        sdVar.f40848c = new zj(this);
        sdVar.f = yjVar;
        this.O.addOnLayoutChangeListener(new oj(this));
        this.p0.post(this.q0);
    }

    @Override // com.startapp.sdk.internal.w7
    public final void h() {
        if (this.f40536V) {
            return;
        }
        super.h();
    }

    @Override // com.startapp.sdk.internal.za
    public final void i() {
        if (this.f40536V) {
            return;
        }
        if (this.g0 || this.O == null) {
            a(this.h0, new VideoTrackingParams(a(this.h0), this.C, this.o, this.j0), "postrollClosed", x().getVideoTrackingDetails().l());
            super.i();
        } else {
            sd sdVar = this.f40531N;
            int currentPosition = sdVar != null ? sdVar.f41480h.getCurrentPosition() : 0;
            a(currentPosition, new VideoTrackingParams(a(currentPosition), this.C, this.o, this.j0), "closed", x().getVideoTrackingDetails().i());
        }
    }

    @Override // com.startapp.sdk.internal.za
    public final long k() {
        return TimeUnit.MILLISECONDS.toSeconds(u());
    }

    @Override // com.startapp.sdk.internal.za
    public final fb l() {
        OverlayActivity overlayActivity = this.f41606a;
        oa oaVar = this.K;
        tj tjVar = new tj(this);
        a aVar = new a(this);
        sj sjVar = new sj(this);
        TrackingParams trackingParams = new TrackingParams(this.o);
        boolean[] zArr = this.f;
        return new mj(overlayActivity, oaVar, oaVar, tjVar, aVar, sjVar, trackingParams, (zArr == null || zArr.length <= 0) ? true : zArr[0]);
    }

    @Override // com.startapp.sdk.internal.za
    public final long m() {
        Long l2 = this.f41614p;
        return l2 != null ? TimeUnit.SECONDS.toMillis(l2.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().A());
    }

    @Override // com.startapp.sdk.internal.za
    public final TrackingParams n() {
        return new VideoTrackingParams(0, this.C, this.o, this.j0);
    }

    @Override // com.startapp.sdk.internal.za
    public final boolean o() {
        return this.k.getType() == Ad.AdType.REWARDED_VIDEO;
    }

    @Override // com.startapp.sdk.internal.za, android.view.View.OnClickListener
    public final void onClick(View view) {
        oa oaVar = this.K;
        oaVar.f41307a.i();
        oaVar.f41307a.b();
    }

    @Override // com.startapp.sdk.internal.za
    public final void p() {
    }

    @Override // com.startapp.sdk.internal.za
    public final void q() {
        this.T = true;
        if (this.g0) {
            a((View) this.v);
            z();
            return;
        }
        vi.a(this.v, true, "videoApi.setClickableVideo", Boolean.valueOf(x().isClickable()));
        vi.a(this.v, true, "videoApi.setMode", "PLAYER");
        vi.a(this.v, true, "videoApi.setCloseable", Boolean.valueOf(x().isCloseable() || this.f40537Y));
        vi.a(this.v, true, "videoApi.setSkippable", Boolean.valueOf(E()));
        if (B()) {
            H();
        }
    }

    @Override // com.startapp.sdk.internal.za
    public final void r() {
        int iL = AdsCommonMetaData.k().F().l();
        ActionTrackingLink[] actionTrackingLinkArrO = x().getVideoTrackingDetails().o();
        a((v() * iL) / 100, new VideoTrackingParams(iL, this.C, this.o, this.j0), "rewarded", actionTrackingLinkArrO);
    }

    public final int u() {
        sd sdVar = this.f40531N;
        if (sdVar == null) {
            return this.h0;
        }
        int currentPosition = sdVar.f41480h.getCurrentPosition();
        if (currentPosition > this.h0) {
            this.h0 = currentPosition;
        }
        return this.h0;
    }

    public final int v() {
        sd sdVar = this.f40531N;
        if (sdVar != null) {
            return sdVar.f41480h.getDuration();
        }
        return -1;
    }

    public final long w() {
        long skippableAfter = x().getSkippableAfter();
        sd sdVar = this.f40531N;
        return (sdVar == null || sdVar.g == null) ? skippableAfter : Math.min(skippableAfter, sdVar.f41480h.getDuration());
    }

    public final VideoAdDetails x() {
        return ((jj) this.k).r;
    }

    public final void y() {
        if (this.g.equals("back")) {
            if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.BOTH)) {
                this.X = true;
                this.f40537Y = true;
                return;
            }
            if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.SKIP)) {
                this.X = true;
                this.f40537Y = false;
            } else if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.CLOSE)) {
                this.X = false;
                this.f40537Y = true;
            } else if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.DISABLED)) {
                this.X = false;
                this.f40537Y = false;
            } else {
                this.X = false;
                this.f40537Y = false;
            }
        }
    }

    public final void z() {
        String postRollHtml = x().getPostRollHtml();
        if (postRollHtml != null) {
            this.v.setWebViewClient(new bk(this));
            vi.a(this.v, postRollHtml);
            Log.println(2, "StartAppSDK", "Post-roll start rendering the ad content");
            return;
        }
        vi.a(this.v, true, "videoApi.setReplayEnabled", Boolean.valueOf(this.f40531N != null));
        vi.a(this.v, true, "videoApi.setMode", VideoMode$HtmlMode.POST_ROLL + "_" + x().getPostRollType());
        this.p0.postDelayed(new rj(this), AdsCommonMetaData.k().F().b() * 1000);
    }

    public final void b(int i2) {
        List list;
        MediaEvents mediaEvents;
        if (!this.f0 && this.C <= 0 && i2 != 0) {
            this.f0 = true;
            ag agVar = this.f41774z;
            if (agVar != null) {
                agVar.c();
            }
            a(0, new VideoTrackingParams(0, this.C, this.o, this.j0), "impression", x().getVideoTrackingDetails().d());
            a(0, new VideoTrackingParams(0, this.C, this.o, this.j0), "creativeView", x().getVideoTrackingDetails().b());
            vd vdVar = this.f41770F;
            if (vdVar != null) {
                vdVar.a();
            }
        }
        for (Integer num : this.n0.keySet()) {
            int iIntValue = num.intValue();
            if (i2 > 0 && i2 >= (v() * iIntValue) / 100 && this.l0.get(num) == null) {
                if (this.n0.containsKey(num)) {
                    List list2 = (List) this.n0.get(num);
                    if (list2 != null) {
                        a((v() * iIntValue) / 100, new VideoProgressTrackingParams(iIntValue, this.C, this.o, this.j0), "fraction", (VideoTrackingLink[]) list2.toArray(new FractionTrackingLink[0]));
                    }
                    vd vdVar2 = this.f41770F;
                    if (vdVar2 != null) {
                        if (iIntValue == 25) {
                            MediaEvents mediaEvents2 = vdVar2.f41581c;
                            if (mediaEvents2 != null) {
                                mediaEvents2.firstQuartile();
                            }
                        } else if (iIntValue == 50) {
                            MediaEvents mediaEvents3 = vdVar2.f41581c;
                            if (mediaEvents3 != null) {
                                mediaEvents3.midpoint();
                            }
                        } else if (iIntValue == 75 && (mediaEvents = vdVar2.f41581c) != null) {
                            mediaEvents.thirdQuartile();
                        }
                    }
                }
                this.l0.put(num, Boolean.TRUE);
            }
        }
        for (Integer num2 : this.o0.keySet()) {
            int iIntValue2 = num2.intValue();
            if (i2 > 0 && i2 >= iIntValue2 && this.m0.get(num2) == null) {
                if (this.o0.containsKey(num2) && (list = (List) this.o0.get(num2)) != null) {
                    a(iIntValue2, new VideoProgressTrackingParams(iIntValue2, this.C, this.o, this.j0), "absolute", (VideoTrackingLink[]) list.toArray(new AbsoluteTrackingLink[0]));
                }
                this.m0.put(num2, Boolean.TRUE);
            }
        }
        if (i2 >= (v() * AdsCommonMetaData.k().F().l()) / 100) {
            s();
        }
        if (this.a0) {
            if (i2 >= (v() * AdsCommonMetaData.k().F().l()) / 100) {
                s();
            }
        }
    }

    @Override // com.startapp.sdk.internal.za
    public final void a(WebView webView) {
        super.a(webView);
        webView.setLayerType(1, null);
    }

    @Override // com.startapp.sdk.internal.za
    public final void a(ImageButton imageButton) {
        VideoAdDetails videoAdDetailsX;
        List<VerificationDetails> adVerifications;
        VastProperties vastPropertiesCreateVastPropertiesForNonSkippableMedia;
        if (!MetaData.E().j0() || (videoAdDetailsX = x()) == null || (adVerifications = videoAdDetailsX.getAdVerifications()) == null) {
            return;
        }
        vd vdVar = new vd(this.v.getContext(), adVerifications, true);
        this.f41770F = vdVar;
        AdSession adSession = vdVar.f41579a;
        if (adSession != null) {
            try {
                AdInformationView adInformationView = this.f41607b.f40608b;
                if (adInformationView != null) {
                    adSession.addFriendlyObstruction(adInformationView, FriendlyObstructionPurpose.OTHER, null);
                }
                if (imageButton != null) {
                    vd vdVar2 = this.f41770F;
                    FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.CLOSE_AD;
                    AdSession adSession2 = vdVar2.f41579a;
                    if (adSession2 != null) {
                        adSession2.addFriendlyObstruction(imageButton, friendlyObstructionPurpose, null);
                    }
                }
                vd vdVar3 = this.f41770F;
                WebView webView = this.v;
                FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.VIDEO_CONTROLS;
                AdSession adSession3 = vdVar3.f41579a;
                if (adSession3 != null) {
                    adSession3.addFriendlyObstruction(webView, friendlyObstructionPurpose2, null);
                }
                vd vdVar4 = this.f41770F;
                RelativeLayout relativeLayout = this.f40533Q;
                FriendlyObstructionPurpose friendlyObstructionPurpose3 = FriendlyObstructionPurpose.OTHER;
                AdSession adSession4 = vdVar4.f41579a;
                if (adSession4 != null) {
                    adSession4.addFriendlyObstruction(relativeLayout, friendlyObstructionPurpose3, null);
                }
            } catch (RuntimeException unused) {
            }
            vd vdVar5 = this.f41770F;
            VideoView videoView = this.O;
            AdSession adSession5 = vdVar5.f41579a;
            if (adSession5 != null) {
                adSession5.registerAdView(videoView);
            }
            AdSession adSession6 = this.f41770F.f41579a;
            if (adSession6 != null) {
                adSession6.start();
            }
            vd vdVar6 = this.f41770F;
            boolean zE = E();
            long jW = D() ? w() : 0L;
            if (vdVar6.f41580b == null || !vdVar6.f41582e.compareAndSet(false, true)) {
                return;
            }
            if (zE) {
                vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForSkippableMedia(jW, true, Position.STANDALONE);
            } else {
                vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
            }
            vdVar6.f41580b.loaded(vastPropertiesCreateVastPropertiesForNonSkippableMedia);
        }
    }

    public final void a(View view) {
        vi.a(this.v, true, "videoApi.setVideoFrame", Integer.valueOf(li.b(this.f41606a, view.getLeft())), Integer.valueOf(li.b(this.f41606a, view.getTop())), Integer.valueOf(li.b(this.f41606a, view.getWidth())), Integer.valueOf(li.b(this.f41606a, view.getHeight())));
    }

    public final void a(VideoMode$VideoFinishedReason videoMode$VideoFinishedReason) {
        MediaEvents mediaEvents;
        vd vdVar;
        MediaEvents mediaEvents2;
        VideoMode$VideoFinishedReason videoMode$VideoFinishedReason2 = VideoMode$VideoFinishedReason.SKIPPED;
        if (videoMode$VideoFinishedReason == videoMode$VideoFinishedReason2 && (vdVar = this.f41770F) != null && (mediaEvents2 = vdVar.f41581c) != null) {
            mediaEvents2.skipped();
        }
        VideoMode$VideoFinishedReason videoMode$VideoFinishedReason3 = VideoMode$VideoFinishedReason.COMPLETE;
        if (videoMode$VideoFinishedReason == videoMode$VideoFinishedReason3) {
            int iV = v();
            this.h0 = iV;
            b(iV);
            s();
            vd vdVar2 = this.f41770F;
            if (vdVar2 != null && (mediaEvents = vdVar2.f41581c) != null) {
                mediaEvents.complete();
            }
        } else {
            sd sdVar = this.f40531N;
            if (sdVar != null) {
                sdVar.f41480h.pause();
            }
        }
        if (videoMode$VideoFinishedReason == videoMode$VideoFinishedReason3 || videoMode$VideoFinishedReason == videoMode$VideoFinishedReason2) {
            if (x().hasPostRoll()) {
                z();
                this.f41607b.f40608b.setVisibility(0);
            } else {
                b();
            }
            this.g0 = true;
            if (x().hasPostRoll()) {
                a(this.h0, new VideoTrackingParams(a(this.h0), this.C, this.o, this.j0), "postrollImression", x().getVideoTrackingDetails().m());
            }
        }
    }

    public final void a(ck ckVar) {
        VASTErrorCodes vASTErrorCodes;
        g9 g9Var = new g9(h9.f41040e);
        g9Var.d = "Video player error: " + ckVar.f40886a;
        g9Var.f41002e = ckVar.f40887b;
        g9Var.g = a();
        g9Var.a();
        int iOrdinal = ckVar.f40886a.ordinal();
        if (iOrdinal == 1) {
            vASTErrorCodes = VASTErrorCodes.GeneralLinearError;
        } else if (iOrdinal == 2) {
            vASTErrorCodes = VASTErrorCodes.TimeoutMediaFileURI;
        } else if (iOrdinal != 3) {
            vASTErrorCodes = VASTErrorCodes.UndefinedError;
        } else {
            vASTErrorCodes = VASTErrorCodes.MediaFileDisplayError;
        }
        lj ljVar = new lj(this.h0, new VideoTrackingParams(a(this.h0), this.C, this.o, this.j0), x().getVideoUrl(), x().getVideoTrackingDetails().e());
        ljVar.f41229e = vASTErrorCodes;
        gk.a(this.f41606a, ljVar.a());
        if (u() == 0) {
            h0.a(this.f41610h, this.o, this.C, "VIDEO_ERROR", (JSONObject) null);
            if (!this.a0) {
                vf vfVar = (vf) com.startapp.sdk.components.a.a(this.f41606a).G.a();
                int i2 = vfVar.getInt("videoErrorsCount", 0);
                uf ufVarEdit = vfVar.edit();
                int i3 = i2 + 1;
                ufVarEdit.a("videoErrorsCount", Integer.valueOf(i3));
                ufVarEdit.f41545a.putInt("videoErrorsCount", i3);
                ufVarEdit.apply();
            } else if (!ckVar.f40886a.equals(VideoPlayerInterface$VideoPlayerErrorType.BUFFERING_TIMEOUT)) {
                vf vfVar2 = (vf) com.startapp.sdk.components.a.a(this.f41606a).G.a();
                int i4 = vfVar2.getInt("videoErrorsCount", 0);
                uf ufVarEdit2 = vfVar2.edit();
                int i5 = i4 + 1;
                ufVarEdit2.a("videoErrorsCount", Integer.valueOf(i5));
                ufVarEdit2.f41545a.putInt("videoErrorsCount", i5);
                ufVarEdit2.apply();
            }
        }
        if ((o() && !this.f41768B) || !x().hasPostRoll()) {
            Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
            intent.putExtra("showFailedReason", NotDisplayedReason.VIDEO_ERROR);
            zb.a(this.f41606a).a(intent);
            this.f40536V = true;
            b();
            return;
        }
        a(VideoMode$VideoFinishedReason.SKIPPED);
    }

    public final int a(int i2) {
        int iV = v();
        if (iV > 0) {
            return (i2 * 100) / iV;
        }
        return 0;
    }

    @Override // com.startapp.sdk.internal.za
    public final boolean a(String str, boolean z2) {
        String clickUrl;
        ActionTrackingLink[] actionTrackingLinkArrH;
        if (this.g0) {
            clickUrl = x().getPostRollClickThroughUrl();
        } else {
            clickUrl = x().getClickUrl();
        }
        if (!TextUtils.isEmpty(clickUrl)) {
            z2 = true;
            str = clickUrl;
        }
        if (!this.g0) {
            a(VideoMode$VideoFinishedReason.CLICKED);
        }
        boolean z3 = this.g0;
        if (z3) {
            actionTrackingLinkArrH = x().getVideoTrackingDetails().k();
        } else {
            actionTrackingLinkArrH = x().getVideoTrackingDetails().h();
        }
        a(this.h0, new VideoClickedTrackingParams(this.o, a(this.h0), this.C, z3, this.j0), "clicked", actionTrackingLinkArrH);
        vd vdVar = this.f41770F;
        if (vdVar != null) {
            InteractionType interactionType = InteractionType.CLICK;
            MediaEvents mediaEvents = vdVar.f41581c;
            if (mediaEvents != null) {
                mediaEvents.adUserInteraction(interactionType);
            }
        }
        return super.a(str, z2);
    }

    public final void a(boolean z2) {
        ActionTrackingLink[] actionTrackingLinkArrG;
        if (this.f40531N == null) {
            return;
        }
        if (z2) {
            actionTrackingLinkArrG = x().getVideoTrackingDetails().f();
        } else {
            actionTrackingLinkArrG = x().getVideoTrackingDetails().g();
        }
        a(this.f40531N.f41480h.getCurrentPosition(), new VideoTrackingParams(a(this.f40531N.f41480h.getCurrentPosition()), this.C, this.o, this.j0), "sound", actionTrackingLinkArrG);
        vd vdVar = this.f41770F;
        if (vdVar != null) {
            float f = z2 ? 0.0f : 1.0f;
            MediaEvents mediaEvents = vdVar.f41581c;
            if (mediaEvents != null) {
                mediaEvents.volumeChange(f);
            }
        }
    }

    public final void a(int i2, VideoTrackingParams videoTrackingParams, String str, VideoTrackingLink[] videoTrackingLinkArr) {
        gk.a(this.f41606a, new lj(i2, videoTrackingParams, x().getVideoUrl(), videoTrackingLinkArr).a());
    }
}
