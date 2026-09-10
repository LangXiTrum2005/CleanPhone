package com.smartdigimkt.expressad.playercommon;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.applovin.sdk.AppLovinErrorCodes;
import com.smartdigimkt.b0.a;
import com.smartdigimkt.i1.c;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.z.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class PlayerView extends LinearLayout {
    public static final String TAG = "PlayerView";
    private boolean isBTVideo;
    private boolean isBTVideoPlaying;
    private boolean mInitState;
    private boolean mIsCovered;
    private boolean mIsFirstCreateHolder;
    private boolean mIsNeedToRepeatPrepare;
    private boolean mIsSurfaceHolderDestoryed;
    private LinearLayout mLlSurContainer;
    private LinearLayout mLoadingView;
    private String mPlayUrl;
    private SurfaceHolder mSurfaceHolder;
    private VideoFeedsPlayer mVideoFeedsPlayer;
    protected int orientation;
    c tempEventListener;
    protected float xInScreen;
    protected float yInScreen;

    public class MySurfaceHoldeCallback implements SurfaceHolder.Callback {
        private MySurfaceHoldeCallback() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            try {
                if (PlayerView.this.mIsSurfaceHolderDestoryed && !PlayerView.this.mIsCovered && !PlayerView.this.isComplete() && !b.f) {
                    if (PlayerView.this.isBTVideo) {
                        if (PlayerView.this.mVideoFeedsPlayer.getIsFrontDesk()) {
                            if (!PlayerView.this.mVideoFeedsPlayer.hasPrepare()) {
                                PlayerView.this.mVideoFeedsPlayer.prepare();
                            }
                            PlayerView.this.mVideoFeedsPlayer.start(false);
                        } else {
                            PlayerView.this.pause();
                        }
                    } else if (PlayerView.this.mVideoFeedsPlayer.hasPrepare()) {
                        PlayerView.this.resumeStart();
                    } else {
                        PlayerView.this.playVideo(0);
                    }
                }
                PlayerView.this.mIsSurfaceHolderDestoryed = false;
            } catch (Exception e2) {
                e2.getMessage();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                if (PlayerView.this.mVideoFeedsPlayer != null && surfaceHolder != null) {
                    PlayerView.this.mSurfaceHolder = surfaceHolder;
                    PlayerView.this.mVideoFeedsPlayer.setDisplay(surfaceHolder);
                }
                PlayerView.this.mIsFirstCreateHolder = false;
            } catch (Exception e2) {
                e2.getMessage();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            try {
                PlayerView.this.mIsSurfaceHolderDestoryed = true;
                PlayerView.this.mIsNeedToRepeatPrepare = true;
                PlayerView.this.mVideoFeedsPlayer.pause();
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }

    public PlayerView(Context context) {
        super(context);
        this.mInitState = false;
        this.mIsFirstCreateHolder = true;
        this.mIsSurfaceHolderDestoryed = false;
        this.mIsCovered = false;
        this.mIsNeedToRepeatPrepare = false;
        this.isBTVideo = false;
        this.isBTVideoPlaying = false;
        this.orientation = 1;
        init();
    }

    private void init() {
        try {
            initView();
            initPlayer();
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void initPlayer() {
        this.mVideoFeedsPlayer = new VideoFeedsPlayer();
    }

    private void initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(k.a(getContext(), "sdm_playercommon_player_view", "layout"), (ViewGroup) null);
        if (viewInflate != null) {
            this.mLlSurContainer = (LinearLayout) viewInflate.findViewById(k.a(getContext(), "sdm_playercommon_ll_sur_container", "id"));
            this.mLoadingView = (LinearLayout) viewInflate.findViewById(k.a(getContext(), "sdm_playercommon_ll_loading", "id"));
            addSurfaceView();
            addView(viewInflate, -1, -1);
        }
    }

    public void addSurfaceView() {
        try {
            SurfaceView surfaceView = new SurfaceView(getContext().getApplicationContext());
            SurfaceHolder holder = surfaceView.getHolder();
            this.mSurfaceHolder = holder;
            holder.setType(3);
            this.mSurfaceHolder.setKeepScreenOn(true);
            this.mSurfaceHolder.addCallback(new MySurfaceHoldeCallback());
            this.mLlSurContainer.addView(surfaceView, -1, -1);
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public JSONObject buildH5JsonObject(int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(a.g2, v.b(com.smartdigimkt.m6.b.p().k(), this.xInScreen));
                jSONObject2.put(a.h2, v.b(com.smartdigimkt.m6.b.p().k(), this.yInScreen));
                jSONObject2.put(a.j2, i2);
                try {
                    this.orientation = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                jSONObject2.put(a.k2, this.orientation);
                jSONObject2.put(a.l2, v.d(getContext()));
                return jSONObject2;
            } catch (JSONException e3) {
                e = e3;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e4) {
            e = e4;
        }
    }

    public void closeSound() {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.closeSound();
        }
    }

    public void coverUnlockResume() {
        try {
            this.mVideoFeedsPlayer.setIsFrontDesk(true);
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                if (videoFeedsPlayer.hasPrepare() && !this.mIsNeedToRepeatPrepare) {
                    start(true);
                    return;
                }
                playVideo(0);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public int getCurPosition() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                return videoFeedsPlayer.getCurPosition();
            }
            return 0;
        } catch (Exception e2) {
            e2.getMessage();
            return 0;
        }
    }

    public int getDuration() {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            return videoFeedsPlayer.getDuration();
        }
        return 0;
    }

    public void initBufferIngParam(int i2) {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.initBufferIngParam(i2);
        }
    }

    public boolean initVFPData(String str, String str2, int i2, VideoPlayerStatusListener videoPlayerStatusListener) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.mPlayUrl = str;
        this.mVideoFeedsPlayer.setTempEventListener(this.tempEventListener);
        this.mVideoFeedsPlayer.initPlayer(getContext(), this.mLoadingView, str, str2, i2, videoPlayerStatusListener);
        this.mInitState = true;
        return true;
    }

    public boolean isComplete() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            return videoFeedsPlayer != null && videoFeedsPlayer.isComplete();
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public boolean isPlayIng() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                return videoFeedsPlayer.isPlayIng();
            }
            return false;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public boolean isSilent() {
        return this.mVideoFeedsPlayer.isSilent();
    }

    public void justSeekTo(int i2) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.justSeekTo(i2);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.xInScreen = motionEvent.getRawX();
        this.yInScreen = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onPause() {
        try {
            pause();
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.setIsFrontDesk(false);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void onResume() {
        try {
            this.mVideoFeedsPlayer.setIsFrontDesk(true);
            if (this.mVideoFeedsPlayer == null || this.mIsSurfaceHolderDestoryed || isComplete() || this.mIsCovered) {
                return;
            }
            if (this.mVideoFeedsPlayer.hasPrepare()) {
                resumeStart();
            } else {
                playVideo(0);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void openSound() {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.openSound();
        }
    }

    public void pause() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.pause();
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public boolean playVideo(int i2) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer == null || !this.mInitState) {
                return false;
            }
            videoFeedsPlayer.play(this.mPlayUrl, i2);
            this.mIsNeedToRepeatPrepare = false;
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public void prepare() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.prepare();
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void release() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.releasePlayer();
            }
            SurfaceHolder surfaceHolder = this.mSurfaceHolder;
            if (surfaceHolder != null) {
                surfaceHolder.getSurface().release();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void removeSurface() {
        try {
            this.mLlSurContainer.removeAllViews();
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void resumeStart() {
        try {
            start(true);
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void seekTo(int i2) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.seekTo(i2);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void seekToEndFrame() {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.seekTo(videoFeedsPlayer.getCurPosition() + AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT);
        }
    }

    public void setDataSource() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.showLoading();
                this.mVideoFeedsPlayer.setDataSource();
                this.mIsNeedToRepeatPrepare = false;
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void setDesk(boolean z2) {
        this.mVideoFeedsPlayer.setIsFrontDesk(z2);
    }

    public void setIsBTVideo(boolean z2) {
        this.isBTVideo = z2;
    }

    public void setIsBTVideoPlaying(boolean z2) {
        this.isBTVideoPlaying = z2;
    }

    public void setIsCovered(boolean z2) {
        try {
            this.mIsCovered = z2;
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void setPlaybackParams(float f) {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.setPlaybackParams(f);
        }
    }

    public void setTempEventListener(c cVar) {
        this.tempEventListener = cVar;
    }

    public void setVolume(float f, float f2) {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.setVolume(f, f2);
        }
    }

    public void start(boolean z2) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer == null || this.mIsCovered) {
                return;
            }
            videoFeedsPlayer.start(z2);
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void stop() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.stop();
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public boolean playVideo() {
        return playVideo(0);
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mInitState = false;
        this.mIsFirstCreateHolder = true;
        this.mIsSurfaceHolderDestoryed = false;
        this.mIsCovered = false;
        this.mIsNeedToRepeatPrepare = false;
        this.isBTVideo = false;
        this.isBTVideoPlaying = false;
        this.orientation = 1;
        init();
    }
}
