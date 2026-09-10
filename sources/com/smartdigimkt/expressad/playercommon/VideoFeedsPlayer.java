package com.smartdigimkt.expressad.playercommon;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import com.smartdigimkt.i1.c;
import com.smartdigimkt.i7.d;
import com.smartdigimkt.j4.f0;
import com.smartdigimkt.j4.o;
import com.smartdigimkt.j4.s;
import com.smartdigimkt.l7.b;
import com.smartdigimkt.p6.p;
import com.smartdigimkt.w3.d0;
import com.smartdigimkt.w3.e0;
import com.smartdigimkt.w3.f;
import com.smartdigimkt.w3.g;
import com.smartdigimkt.w3.i;
import com.smartdigimkt.w3.v;
import com.smartdigimkt.w3.w;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes5.dex */
public class VideoFeedsPlayer implements w.c {
    public static final int INTERVAL_TIME_PLAY_TIME_CD_THREAD = 1000;
    public static final String TAG = "VideoFeedsPlayer";
    private d0 exoPlayer;
    private Timer mBufferTimeoutTimer;
    private Context mContext;
    private long mCurrentPosition;
    private View mFullScreenLoadingView;
    private volatile VideoPlayerStatusListener mInnerVFPLisener;
    private boolean mIsSilent;
    private WeakReference<View> mLoadingView;
    private volatile VideoPlayerStatusListener mOutterVFListener;
    String mPlayLocalVideoFileErrorStr;
    private String mPlayUrl;
    private Thread mProgressThread;
    private SurfaceHolder mSurfaceHolder;
    private int mVideoReadyRate;
    private s mediaSource;
    c tempEventListener;
    private boolean mIsComplete = false;
    private boolean mIsPlaying = false;
    private boolean mHasPrepare = false;
    private boolean mIsBuffering = false;
    private boolean mIsNeedBufferingTimeout = false;
    private boolean mIsFrontDesk = true;
    private int mBufferTime = 5;
    private Object mLock = new Object();
    private boolean isStart = false;
    private final Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: com.smartdigimkt.expressad.playercommon.VideoFeedsPlayer.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
        }
    };
    private boolean needPrepareVideoPlayAgain = false;
    private String mNetVideoUrl = "";
    private String mMediaSourceUrl = "";
    private Runnable playProgressRunnable = new Runnable() { // from class: com.smartdigimkt.expressad.playercommon.VideoFeedsPlayer.2
        @Override // java.lang.Runnable
        public void run() {
            long jX;
            try {
                if (VideoFeedsPlayer.this.exoPlayer == null || !VideoFeedsPlayer.this.exoPlayerIsPlaying()) {
                    return;
                }
                VideoFeedsPlayer videoFeedsPlayer = VideoFeedsPlayer.this;
                videoFeedsPlayer.mCurrentPosition = videoFeedsPlayer.exoPlayer.F();
                float f = VideoFeedsPlayer.this.mCurrentPosition / 1000.0f;
                float f2 = VideoFeedsPlayer.this.mCurrentPosition % 1000;
                int iRound = Math.round(f);
                long unused = VideoFeedsPlayer.this.mCurrentPosition;
                if (VideoFeedsPlayer.this.exoPlayer == null || VideoFeedsPlayer.this.exoPlayer.x() <= 0) {
                    jX = 0;
                } else {
                    jX = VideoFeedsPlayer.this.exoPlayer.x() / 1000;
                    if (f2 > 0.0f && f2 < 500.0f) {
                        iRound++;
                    }
                }
                if (iRound >= 0 && jX > 0 && iRound < 1 + jX) {
                    if (!VideoFeedsPlayer.this.isStart) {
                        VideoFeedsPlayer videoFeedsPlayer2 = VideoFeedsPlayer.this;
                        videoFeedsPlayer2.postOnPlayStartOnMainThread(videoFeedsPlayer2.exoPlayer.x() / 1000);
                        VideoFeedsPlayer.this.exoPlayer.F();
                        VideoFeedsPlayer.this.isStart = true;
                    }
                    VideoFeedsPlayer.this.postOnPlayProgressOnMainThread(iRound, (int) jX);
                }
                VideoFeedsPlayer.this.mIsComplete = false;
                if (!VideoFeedsPlayer.this.mIsBuffering) {
                    VideoFeedsPlayer.this.hideLoading();
                }
                VideoFeedsPlayer.this.mHandler.postDelayed(this, 1000L);
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    };
    private boolean mFlag = false;
    private long mCurBufferWaitingStartTime = 0;
    private final long MAX_BUFFER_WAITING_TIME = 5000;

    private void cancelBufferTimeoutTimer() {
        try {
            Timer timer = this.mBufferTimeoutTimer;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void cancelPlayProgressTimer() {
        try {
            this.mHandler.removeCallbacks(this.playProgressRunnable);
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideLoading() {
        try {
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.smartdigimkt.expressad.playercommon.VideoFeedsPlayer.5
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoFeedsPlayer.this.mLoadingView != null && VideoFeedsPlayer.this.mLoadingView.get() != null) {
                        ((View) VideoFeedsPlayer.this.mLoadingView.get()).setVisibility(8);
                    }
                    if (VideoFeedsPlayer.this.mFullScreenLoadingView != null) {
                        VideoFeedsPlayer.this.mFullScreenLoadingView.setVisibility(8);
                    }
                }
            });
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void postOnBufferinEndOnMainThread() {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.smartdigimkt.expressad.playercommon.VideoFeedsPlayer.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onBufferingEnd();
                            } catch (Exception e2) {
                                e2.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onBufferingEnd();
                            } catch (Exception e3) {
                                e3.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnBufferingStarOnMainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.smartdigimkt.expressad.playercommon.VideoFeedsPlayer.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onBufferingStart(str);
                            } catch (Exception e2) {
                                e2.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onBufferingStart(str);
                            } catch (Exception e3) {
                                e3.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void postOnPlayCompletedOnMainThread() {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.smartdigimkt.expressad.playercommon.VideoFeedsPlayer.12
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayCompleted();
                            } catch (Exception e2) {
                                e2.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayCompleted();
                            } catch (Exception e3) {
                                e3.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void postOnPlayErrorOnMainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.smartdigimkt.expressad.playercommon.VideoFeedsPlayer.10
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayError(str);
                            } catch (Exception e2) {
                                e2.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayError(str);
                            } catch (Exception e3) {
                                e3.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnPlayProgressOnMainThread(final int i2, final int i3) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.smartdigimkt.expressad.playercommon.VideoFeedsPlayer.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayProgress(i2, i3);
                            } catch (Exception e2) {
                                e2.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayProgress(i2, i3);
                            } catch (Exception e3) {
                                e3.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void postOnPlaySetDataSourceError2MainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.smartdigimkt.expressad.playercommon.VideoFeedsPlayer.11
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlaySetDataSourceError(str);
                            } catch (Exception e2) {
                                e2.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlaySetDataSourceError(str);
                            } catch (Exception e3) {
                                e3.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnPlayStartOnMainThread(final long j) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.smartdigimkt.expressad.playercommon.VideoFeedsPlayer.9
                    @Override // java.lang.Runnable
                    public void run() {
                        int i2 = (int) j;
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayStarted(i2);
                            } catch (Exception e2) {
                                e2.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayStarted(i2);
                            } catch (Exception e3) {
                                e3.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void rePrepareVideoSourceAgain() {
        if (this.mOutterVFListener != null) {
            this.mOutterVFListener.onVideoDownloadResume();
        }
        s sVar = this.mediaSource;
        if (sVar != null) {
            this.exoPlayer.a(sVar);
        }
    }

    private void startBufferIngTimer(final String str) {
        if (this.mIsNeedBufferingTimeout) {
            cancelBufferTimeoutTimer();
            Timer timer = new Timer();
            this.mBufferTimeoutTimer = timer;
            timer.schedule(new TimerTask() { // from class: com.smartdigimkt.expressad.playercommon.VideoFeedsPlayer.3
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    try {
                        if (VideoFeedsPlayer.this.mHasPrepare && !VideoFeedsPlayer.this.mIsBuffering) {
                            return;
                        }
                        VideoFeedsPlayer.this.postOnBufferingStarOnMainThread(str);
                    } catch (Exception e2) {
                        e2.getMessage();
                    }
                }
            }, this.mBufferTime * 1000);
        }
    }

    private void startPlayProgressTimer() {
        try {
            cancelPlayProgressTimer();
            this.mHandler.post(this.playProgressRunnable);
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void startProgressThread() {
        if (this.mProgressThread != null) {
            return;
        }
        this.mFlag = true;
        this.mCurBufferWaitingStartTime = 0L;
        Thread thread = new Thread(new Runnable() { // from class: com.smartdigimkt.expressad.playercommon.VideoFeedsPlayer.13
            @Override // java.lang.Runnable
            public void run() {
                while (VideoFeedsPlayer.this.mFlag) {
                    if (VideoFeedsPlayer.this.mIsComplete || !VideoFeedsPlayer.this.exoPlayerIsPlaying()) {
                        if (VideoFeedsPlayer.this.mCurBufferWaitingStartTime == 0) {
                            VideoFeedsPlayer.this.mCurBufferWaitingStartTime = SystemClock.elapsedRealtime();
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        if (SystemClock.elapsedRealtime() - VideoFeedsPlayer.this.mCurBufferWaitingStartTime > 5000 && VideoFeedsPlayer.this.mCurBufferWaitingStartTime != 0) {
                            b.a().e(new Runnable() { // from class: com.smartdigimkt.expressad.playercommon.VideoFeedsPlayer.13.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    VideoFeedsPlayer.this.onError(10, "Video player error!Buffer timeout");
                                    d.a("Video Play Fail:Express Play Buffer Timeout", "AdxPlayer videoUrl:" + VideoFeedsPlayer.this.mPlayUrl + ",readyRate:" + VideoFeedsPlayer.this.mVideoReadyRate + ",maxVideoCacheSize:" + p.c().d() + ",lastRecycleCheckDownloadedFileSize:" + p.c().b(), com.smartdigimkt.m6.b.p().q());
                                }
                            });
                            VideoFeedsPlayer.this.stopProgressThread();
                        }
                    } else {
                        VideoFeedsPlayer.this.mCurBufferWaitingStartTime = 0L;
                        try {
                            Thread.sleep(1000L);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                }
            }
        });
        this.mProgressThread = thread;
        thread.setName("sdm_type_player_progress");
        this.mProgressThread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopProgressThread() {
        this.mFlag = false;
        this.mProgressThread = null;
        this.mCurBufferWaitingStartTime = 0L;
    }

    public void closeSound() {
        try {
            d0 d0Var = this.exoPlayer;
            if (d0Var == null) {
                return;
            }
            d0Var.a(0.0f);
            this.mIsSilent = true;
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public boolean exoPlayerIsPlaying() {
        d0 d0Var = this.exoPlayer;
        return d0Var != null && d0Var.Q();
    }

    public boolean fullScreenLoadingViewisVisible() {
        try {
            View view = this.mFullScreenLoadingView;
            return view != null && view.getVisibility() == 0;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public int getCurPosition() {
        return (int) this.mCurrentPosition;
    }

    public int getDuration() {
        d0 d0Var = this.exoPlayer;
        if (d0Var == null) {
            return 0;
        }
        d0Var.x();
        return 0;
    }

    public boolean getIsFrontDesk() {
        return this.mIsFrontDesk;
    }

    public boolean halfLoadingViewisVisible() {
        try {
            WeakReference<View> weakReference = this.mLoadingView;
            return (weakReference == null || weakReference.get() == null || this.mLoadingView.get().getVisibility() != 0) ? false : true;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public boolean hasPrepare() {
        return this.mHasPrepare;
    }

    public void initBufferIngParam(int i2) {
        if (i2 > 0) {
            this.mBufferTime = i2;
        }
        this.mIsNeedBufferingTimeout = true;
    }

    public boolean initPlayer(Context context, View view, String str, String str2, int i2, VideoPlayerStatusListener videoPlayerStatusListener) {
        try {
            if (view == null) {
                postOnPlayErrorOnMainThread("MediaPlayer init error");
                return false;
            }
            this.needPrepareVideoPlayAgain = !TextUtils.equals(str, str2);
            this.mMediaSourceUrl = str;
            this.mNetVideoUrl = str2;
            this.mVideoReadyRate = i2;
            this.mContext = context;
            this.mOutterVFListener = videoPlayerStatusListener;
            this.mLoadingView = new WeakReference<>(view);
            this.exoPlayer = i.a(new f(context), new com.smartdigimkt.m4.c(), new com.smartdigimkt.w3.d());
            this.mediaSource = new o.d(new com.smartdigimkt.n4.o(context, "Smartdigimkt_ExoPlayer")).a(Uri.parse(str));
            this.exoPlayer.c(0);
            this.exoPlayer.a(this.mediaSource);
            this.exoPlayer.a(this);
            return true;
        } catch (Throwable th) {
            th.getMessage();
            postOnPlayErrorOnMainThread(th.toString());
            return false;
        }
    }

    public boolean isComplete() {
        return this.mIsComplete;
    }

    public boolean isPlayIng() {
        try {
            return this.exoPlayer != null && exoPlayerIsPlaying();
        } catch (Exception e2) {
            e2.getMessage();
            return false;
        }
    }

    public boolean isSilent() {
        return this.mIsSilent;
    }

    public void justSeekTo(int i2) {
        try {
            this.mCurrentPosition = i2;
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void onBufferingUpdate(int i2) {
    }

    public void onCompletion() {
        try {
            this.mIsComplete = true;
            this.mIsPlaying = false;
            this.mCurrentPosition = 0L;
            hideLoading();
            postOnPlayCompletedOnMainThread();
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public boolean onError(int i2, String str) {
        try {
            hideLoading();
            if (!this.mIsFrontDesk && "MIX 3".equalsIgnoreCase(com.smartdigimkt.n8.c.D()) && com.smartdigimkt.n8.c.I().equalsIgnoreCase("Xiaomi")) {
                return true;
            }
            this.mHasPrepare = false;
            postOnPlayErrorOnMainThread(str);
        } catch (Exception e2) {
            e2.getMessage();
        }
        return true;
    }

    @Override // com.smartdigimkt.w3.w.c
    public void onLoadingChanged(boolean z2) {
    }

    @Override // com.smartdigimkt.w3.w.c
    public void onPlaybackParametersChanged(v vVar) {
        float f = vVar.f39374a;
    }

    @Override // com.smartdigimkt.w3.w.c
    public void onPlayerError(g gVar) {
        boolean z2;
        long jF;
        c cVar = this.tempEventListener;
        if (cVar != null) {
            cVar.d();
        }
        String message = "Play error and ExoPlayer have not message.";
        if (gVar != null) {
            int i2 = gVar.f39281a;
            z2 = true;
            if (i2 != 0) {
                if (i2 == 1) {
                    message = "Play error, because have a RendererException.";
                } else if (i2 == 2) {
                    message = "Play error, because have a UnexpectedException.";
                }
                z2 = false;
            } else {
                message = "Play error, because have a SourceException.";
            }
            if (gVar.getCause() != null && !TextUtils.isEmpty(gVar.getCause().getMessage())) {
                message = gVar.getCause().getMessage();
            }
        } else {
            z2 = false;
        }
        if (this.needPrepareVideoPlayAgain && z2) {
            this.mPlayLocalVideoFileErrorStr = message;
            this.needPrepareVideoPlayAgain = false;
            rePrepareVideoSourceAgain();
            return;
        }
        try {
            jF = this.exoPlayer.F();
        } catch (Throwable unused) {
            jF = 0;
        }
        String str = "videoUrl" + this.mNetVideoUrl + ",readyRate:" + this.mVideoReadyRate + ",cdRate:0,play process:" + jF;
        onError(gVar.f39281a, TextUtils.isEmpty(this.mPlayLocalVideoFileErrorStr) ? a.D(str, ",localFileErrorMsg:", message) : a.s(a.x(str, ",localFileErrorMsg:"), this.mPlayLocalVideoFileErrorStr, ",errorMsg:", message));
    }

    @Override // com.smartdigimkt.w3.w.c
    public void onPlayerStateChanged(boolean z2, int i2) {
        if (i2 == 2) {
            this.mIsBuffering = true;
            showLoading();
            startBufferIngTimer("play buffering tiemout");
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    return;
                }
                cancelPlayProgressTimer();
                onCompletion();
                return;
            }
            this.mIsBuffering = false;
            hideLoading();
            postOnBufferinEndOnMainThread();
            onPrepared();
        }
    }

    @Override // com.smartdigimkt.w3.w.c
    public void onPositionDiscontinuity(int i2) {
    }

    public void onPrepared() {
        c cVar;
        try {
            if (!this.mHasPrepare && (cVar = this.tempEventListener) != null) {
                cVar.b();
            }
            this.mHasPrepare = true;
            if (!this.mIsFrontDesk && this.exoPlayer != null) {
                pause();
            }
            boolean z2 = this.mIsFrontDesk;
            if (z2 && z2) {
                hideLoading();
                this.mHasPrepare = true;
                if (this.exoPlayer != null) {
                    this.mIsPlaying = true;
                }
                postOnBufferinEndOnMainThread();
                startPlayProgressTimer();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.w3.w.c
    public void onRepeatModeChanged(int i2) {
    }

    @Override // com.smartdigimkt.w3.w.c
    public void onSeekProcessed() {
    }

    @Override // com.smartdigimkt.w3.w.c
    public void onShuffleModeEnabledChanged(boolean z2) {
    }

    @Override // com.smartdigimkt.w3.w.c
    public void onTimelineChanged(e0 e0Var, Object obj, int i2) {
    }

    @Override // com.smartdigimkt.w3.w.c
    public void onTracksChanged(f0 f0Var, com.smartdigimkt.m4.g gVar) {
    }

    public void openSound() {
        try {
            d0 d0Var = this.exoPlayer;
            if (d0Var == null) {
                return;
            }
            d0Var.a(1.0f);
            this.mIsSilent = false;
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void pause() {
        try {
            if (this.exoPlayer != null) {
                exoPlayerIsPlaying();
                hideLoading();
                this.exoPlayer.a(false);
                this.mIsPlaying = false;
            }
            stopProgressThread();
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void play(String str, int i2) {
        try {
            synchronized (this.mLock) {
                if (i2 > 0) {
                    try {
                        this.mCurrentPosition = i2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    postOnPlayErrorOnMainThread("play url is null");
                    return;
                }
                this.mPlayUrl = str;
                this.mHasPrepare = false;
                this.mIsFrontDesk = true;
                showLoading();
                setDataSource();
            }
        } catch (Exception e2) {
            e2.getMessage();
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread("mediaplayer cannot play");
        }
    }

    public void prepare() {
        d0 d0Var;
        try {
            if (this.mHasPrepare || (d0Var = this.exoPlayer) == null) {
                return;
            }
            d0Var.a(this.mediaSource);
            this.mHasPrepare = true;
            this.mIsPlaying = false;
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void releasePlayer() {
        try {
            cancelPlayProgressTimer();
            cancelBufferTimeoutTimer();
            if (this.exoPlayer != null) {
                stop();
                this.exoPlayer.b(this);
                this.exoPlayer.release();
            }
            stopProgressThread();
            this.mInnerVFPLisener = null;
            this.mOutterVFListener = null;
            hideLoading();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void seekTo(int i2) {
        d0 d0Var;
        long j = i2;
        try {
            this.mCurrentPosition = j;
            if (this.mHasPrepare && (d0Var = this.exoPlayer) != null) {
                d0Var.a(j);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void setDataSource() {
        try {
            if (this.exoPlayer != null) {
                SurfaceHolder surfaceHolder = this.mSurfaceHolder;
                if (surfaceHolder != null) {
                    setDisplay(surfaceHolder);
                }
                this.mHasPrepare = false;
                if (!TextUtils.equals(this.mMediaSourceUrl, this.mNetVideoUrl)) {
                    try {
                        if (!new File(this.mMediaSourceUrl).exists()) {
                            this.mediaSource = new o.d(new com.smartdigimkt.n4.o(this.mContext, "Smartdigimkt_ExoPlayer")).a(Uri.parse(this.mNetVideoUrl));
                            this.mMediaSourceUrl = this.mNetVideoUrl;
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (TextUtils.equals(this.mMediaSourceUrl, this.mNetVideoUrl) && this.mVideoReadyRate > 0) {
                    d.a("Video Play Fail:Play Network Url", "AdxExpress videoUrl:" + this.mPlayUrl + ",readyRate:" + this.mVideoReadyRate + ",maxVideoCacheSize:" + p.c().d() + ",lastRecycleCheckDownloadedFileSize:" + p.c().b(), com.smartdigimkt.m6.b.p().q());
                }
                this.exoPlayer.a(this.mediaSource);
                this.exoPlayer.a(true);
                startBufferIngTimer("mediaplayer prepare timeout");
                startProgressThread();
            }
        } catch (Exception e2) {
            e2.getMessage();
            hideLoading();
            postOnPlayErrorOnMainThread("illegal video address");
            postOnPlaySetDataSourceError2MainThread("illegal video address");
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        try {
            this.exoPlayer.a().a(surfaceHolder);
        } catch (Throwable th) {
            th.getMessage();
            postOnPlayErrorOnMainThread(th.toString());
        }
    }

    public void setFullScreenLoadingView(View view) {
        if (view != null) {
            try {
                this.mFullScreenLoadingView = view;
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }

    public void setIsComplete(boolean z2) {
        this.mIsComplete = z2;
    }

    public void setIsFrontDesk(boolean z2) {
        try {
            this.mIsFrontDesk = z2;
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void setPlaybackParams(float f) {
        try {
            if (exoPlayerIsPlaying()) {
                this.exoPlayer.a(new v(f));
            } else {
                this.exoPlayer.a(new v(f));
                this.exoPlayer.stop();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void setSelfVideoFeedsPlayerListener(VideoPlayerStatusListener videoPlayerStatusListener) {
        this.mInnerVFPLisener = videoPlayerStatusListener;
    }

    public void setTempEventListener(c cVar) {
        this.tempEventListener = cVar;
    }

    public void setVideoFeedsPlayerListener(VideoPlayerStatusListener videoPlayerStatusListener) {
        this.mOutterVFListener = videoPlayerStatusListener;
    }

    public void setVolume(float f, float f2) {
        try {
            d0 d0Var = this.exoPlayer;
            if (d0Var != null) {
                d0Var.a(f2);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void showLoading() {
        try {
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.smartdigimkt.expressad.playercommon.VideoFeedsPlayer.4
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoFeedsPlayer.this.mFullScreenLoadingView != null) {
                        VideoFeedsPlayer.this.mFullScreenLoadingView.setVisibility(0);
                    }
                }
            });
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void start(boolean z2) {
        try {
            if (this.exoPlayer == null || exoPlayerIsPlaying()) {
                return;
            }
            showLoading();
            play();
            this.mIsPlaying = true;
            if (z2) {
                startPlayProgressTimer();
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void stop() {
        try {
            if (this.mHasPrepare && this.exoPlayer != null) {
                hideLoading();
                this.exoPlayer.stop();
                this.mHasPrepare = false;
                this.mIsPlaying = false;
                this.mIsComplete = true;
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void play(String str, SurfaceHolder surfaceHolder) {
        try {
            synchronized (this.mLock) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        postOnPlayErrorOnMainThread("play url is null");
                        return;
                    }
                    this.mPlayUrl = str;
                    this.mHasPrepare = false;
                    this.mIsFrontDesk = true;
                    this.mSurfaceHolder = surfaceHolder;
                    showLoading();
                    setDataSource();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread("mediaplayer cannot play");
        }
    }

    public void play() {
        this.exoPlayer.a(true);
        startProgressThread();
    }
}
