package com.startapp.sdk.ads.banner.banner3d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerInterface;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.BannerSize;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject$Size;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.a1;
import com.startapp.sdk.internal.ag;
import com.startapp.sdk.internal.b1;
import com.startapp.sdk.internal.d1;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.gb;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.k1;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.li;
import com.startapp.sdk.internal.rg;
import com.startapp.sdk.internal.sg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class Banner3D extends BannerBase implements AdEventListener, BannerInterface {
    protected boolean addedDisplayEvent;
    protected b1 ads;
    protected List<AdDetails> adsItems;
    protected boolean animation;
    protected boolean attachedToWindow;
    protected boolean callListener;
    protected Camera camera;
    protected int currentBannerIndex;
    protected boolean defaultLoad;
    protected List<d1> faces;
    protected boolean firstRotation;
    protected boolean firstRotationFinished;
    protected BannerListener listener;
    protected boolean loaded;
    protected boolean loading;
    private Runnable mAutoRotation;
    protected Matrix matrix;
    protected BannerOptions options;
    protected AdInformationOverrides overrides;
    protected Paint paint;
    protected boolean rotating;
    protected float rotation;
    protected boolean rotationEnabled;
    protected float startY;
    protected boolean touchDown;
    protected boolean visible;

    public Banner3D(Activity activity) {
        this((Context) activity);
    }

    private void addAdInformationLayout() {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(getFaceWidth(), getFaceHeight());
        layoutParams.addRule(13);
        int faceStartLeft = getFaceStartLeft();
        layoutParams.rightMargin = faceStartLeft;
        layoutParams.leftMargin = faceStartLeft;
        int faceStartTop = getFaceStartTop();
        layoutParams.topMargin = faceStartTop;
        layoutParams.bottomMargin = faceStartTop;
        addView(relativeLayout, layoutParams);
        Context context = getContext();
        AdInformationObject$Size adInformationObject$Size = AdInformationObject$Size.SMALL;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
        AdInformationOverrides adInformationOverrides = this.overrides;
        b1 b1Var = this.ads;
        String requestUrl = b1Var != null ? b1Var.getRequestUrl() : null;
        b1 b1Var2 = this.ads;
        String dParam = b1Var2 != null ? b1Var2.getDParam() : null;
        b1 b1Var3 = this.ads;
        String erid = b1Var3 != null ? b1Var3.getErid() : null;
        b1 b1Var4 = this.ads;
        new com.startapp.sdk.adsbase.adinformation.a(context, adInformationObject$Size, placement, adInformationOverrides, null, requestUrl, dParam, erid, b1Var4 != null ? b1Var4.getEridUrl() : null).a(relativeLayout);
    }

    private void cleanFaces() {
        List<d1> list = this.faces;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (d1 d1Var : this.faces) {
            if (d1Var != null) {
                Bitmap bitmap = d1Var.f40890c;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                Bitmap bitmap2 = d1Var.d;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                d1Var.f40890c = null;
                d1Var.d = null;
                ag agVar = d1Var.g;
                if (agVar != null) {
                    agVar.a("AD_CLOSED_TOO_QUICKLY", null);
                }
                Banner3DView banner3DView = d1Var.f40892h;
                if (banner3DView != null) {
                    banner3DView.removeAllViews();
                    d1Var.f40892h = null;
                }
            }
        }
    }

    private void createFaces(List<AdDetails> list) {
        cleanFaces();
        removeAllViews();
        this.faces = new ArrayList();
        Iterator<AdDetails> it = list.iterator();
        while (it.hasNext()) {
            this.faces.add(new d1(getContext(), this, it.next(), getBannerOptions(), new TrackingParams(getAdTag())));
        }
        this.currentBannerIndex = 0;
    }

    private void dispatchOnDetatchedFromWindow() {
        List<d1> list = this.faces;
        if (list != null) {
            Iterator<d1> it = list.iterator();
            while (it.hasNext()) {
                ag agVar = it.next().g;
                if (agVar != null) {
                    agVar.a("AD_CLOSED_TOO_QUICKLY", null);
                }
            }
        }
    }

    private void drawFace(Canvas canvas, Bitmap bitmap, int i2, int i3, int i4, int i5, float f, float f2) {
        if (this.camera == null) {
            this.camera = new Camera();
        }
        this.camera.save();
        this.camera.translate(0.0f, 0.0f, i5);
        this.camera.rotateX(f2);
        float f3 = -i5;
        this.camera.translate(0.0f, 0.0f, f3);
        if (this.matrix == null) {
            this.matrix = new Matrix();
        }
        this.camera.getMatrix(this.matrix);
        this.camera.restore();
        this.matrix.preTranslate(-i4, f3);
        this.matrix.postScale(f, f);
        this.matrix.postTranslate(i3 + i4, i2 + i5);
        canvas.drawBitmap(bitmap, this.matrix, this.paint);
    }

    private void drawFrame(Canvas canvas) {
        Throwable th;
        Canvas canvas2;
        Banner3D banner3D;
        Canvas canvas3;
        try {
            int faceWidth = getFaceWidth();
            int faceHeight = getFaceHeight();
            int faceStartLeft = getFaceStartLeft();
            int faceStartTop = getFaceStartTop();
            float fA = android.support.v4.media.a.a(1.0f, this.options.g(), (float) Math.pow(Math.abs(this.rotation - 45.0f) / 45.0f, this.options.l()), this.options.g());
            if (!this.firstRotationFinished) {
                try {
                    fA = this.options.g();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            float f = fA;
            Bitmap previousBitmap = getPreviousBitmap();
            Bitmap currentBitmap = getCurrentBitmap();
            if (currentBitmap == null || previousBitmap == null) {
                return;
            }
            float f2 = this.rotation;
            try {
                if (f2 >= 45.0f) {
                    if (f2 < 87.0f) {
                        float fA2 = this.options.c().a() * f2;
                        canvas2 = canvas;
                        drawFace(canvas2, previousBitmap, faceStartTop, faceStartLeft, faceWidth / 2, faceHeight / 2, f, fA2);
                    } else {
                        canvas2 = canvas;
                    }
                    drawFace(canvas2, currentBitmap, faceStartTop, faceStartLeft, faceWidth / 2, faceHeight / 2, f, (this.rotation - 90.0f) * this.options.c().a());
                    if (this.firstRotation) {
                        return;
                    }
                    this.firstRotationFinished = true;
                    return;
                }
                if (f2 > 3.0f) {
                    int i2 = faceWidth / 2;
                    int i3 = faceHeight / 2;
                    float fA3 = (f2 - 90.0f) * this.options.c().a();
                    banner3D = this;
                    canvas3 = canvas;
                    banner3D.drawFace(canvas3, currentBitmap, faceStartTop, faceStartLeft, i2, i3, f, fA3);
                } else {
                    banner3D = this;
                    canvas3 = canvas;
                }
                banner3D.drawFace(canvas3, previousBitmap, faceStartTop, faceStartLeft, faceWidth / 2, faceHeight / 2, f, banner3D.rotation * banner3D.options.c().a());
                return;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        g9.a(th);
    }

    private Bitmap getCurrentBitmap() {
        return this.faces.get(getCurrentBannerIndex()).d;
    }

    private int getFaceHeight() {
        return (int) (this.options.e() * li.a(getContext(), this.options.d()));
    }

    private int getFaceStartLeft() {
        return (getWidth() - getFaceWidth()) / 2;
    }

    private int getFaceStartTop() {
        return (getHeight() - getFaceHeight()) / 2;
    }

    private int getFaceWidth() {
        return (int) (this.options.p() * li.a(getContext(), this.options.o()));
    }

    private Bitmap getPreviousBitmap() {
        return this.faces.get((this.faces.size() + (getCurrentBannerIndex() - 1)) % this.faces.size()).d;
    }

    private int getTotalBaners() {
        return this.faces.size();
    }

    private void initFaces(List<AdDetails> list) {
        if (shouldCreateFaces()) {
            createFaces(list);
        } else {
            initFacesViews();
        }
    }

    private void initFacesViews() {
        Iterator<d1> it = this.faces.iterator();
        while (it.hasNext()) {
            it.next().a(getContext(), getBannerOptions(), this);
        }
    }

    private boolean isEventInsideBanner(MotionEvent motionEvent) {
        int faceWidth = getFaceWidth();
        int faceHeight = getFaceHeight();
        int faceStartLeft = getFaceStartLeft();
        int faceStartTop = getFaceStartTop();
        return motionEvent.getX() >= ((float) faceStartLeft) && motionEvent.getY() >= ((float) faceStartTop) && motionEvent.getX() <= ((float) (faceStartLeft + faceWidth)) && motionEvent.getY() <= ((float) (faceStartTop + faceHeight));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void makeImpression(d1 d1Var) {
        ag agVar;
        Context context = getContext();
        if (d1Var.f40888a.t().length <= 0 || !d1Var.f40891e.compareAndSet(false, true)) {
            agVar = null;
        } else {
            agVar = new ag(context, AdPreferences.Placement.INAPP_BANNER, d1Var.f40888a.t(), d1Var.f, d1Var.f40888a.i() != null ? TimeUnit.SECONDS.toMillis(d1Var.f40888a.i().longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().z()), false, null);
            d1Var.g = agVar;
        }
        if (agVar != null) {
            startVisibilityRunnable(agVar);
        }
    }

    private void nextBanner() {
        this.currentBannerIndex = (this.currentBannerIndex + 1) % getTotalBaners();
    }

    private void prevBanner() {
        this.currentBannerIndex = ((this.currentBannerIndex - 1) + getTotalBaners()) % getTotalBaners();
    }

    private boolean shouldCreateFaces() {
        List<d1> list = this.faces;
        return list == null || list.size() == 0;
    }

    private void showBannerView() {
        setVisibility(0);
        if (this.ads != null) {
            sg sgVar = (sg) this.showIntentionsKeeper.a();
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
            String adId = this.ads.getAdId();
            if (adId != null) {
                sgVar.f41489a.put(new rg(placement), adId);
            }
        }
    }

    private void startRotation() {
        if (this.attachedToWindow && this.drawn) {
            removeCallbacks(this.mAutoRotation);
            post(this.mAutoRotation);
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public String getBannerName() {
        return "StartApp Banner3D";
    }

    public BannerOptions getBannerOptions() {
        return this.options;
    }

    public String getBidToken() {
        b1 b1Var = this.ads;
        if (b1Var == null || b1Var.f41005a.isEmpty()) {
            return null;
        }
        return ((AdDetails) b1Var.f41005a.get(0)).e();
    }

    public int getCurrentBannerIndex() {
        return this.currentBannerIndex;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public int getHeightInDp() {
        return 50;
    }

    public int getNextBannerIndex() {
        return (this.currentBannerIndex + 1) % getTotalBaners();
    }

    public int getOffset() {
        b1 b1Var = this.ads;
        if (b1Var == null) {
            return 0;
        }
        return b1Var.f40825b;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public int getRefreshRate() {
        return BannerMetaData.c().a().j();
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public int getWidthInDp() {
        return 300;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, com.startapp.sdk.ads.banner.BannerInterface
    public void hideBanner() {
        this.visible = false;
        setVisibility(8);
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public void initRuntime() {
        if (this.loading) {
            return;
        }
        this.options = BannerMetaData.c().b();
        this.adsItems = new ArrayList();
        this.overrides = AdInformationOverrides.a();
        cleanFaces();
        this.faces = new ArrayList();
        this.loading = true;
        setBackgroundColor(0);
    }

    public void loadBanners(List<AdDetails> list, boolean z2) {
        b1 b1Var;
        this.adsItems = list;
        if (list == null) {
            setErrorMessage("No ads to load");
            if (z2) {
                k1.a(getContext(), this.listener, (BannerBase) this, (String) null);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<AdDetails> it = list.iterator();
        while (it.hasNext()) {
            sb.append(h0.a(it.next().h(), (String) null));
            sb.append(",");
        }
        BannerSize[] bannerSizeArr = {BannerSize.ZERO};
        if (!Banner3DSize.setOptimiseSize(getContext(), getParent(), getBannerOptions(), this, bannerSizeArr)) {
            setErrorMessage("Error in banner screen size");
            setVisibility(8);
            if (z2) {
                k1.a(getContext(), this.listener, (BannerBase) this, sb.toString());
                return;
            }
            return;
        }
        setMinimumWidth(li.a(getContext(), this.options.o()));
        setMinimumHeight(li.a(getContext(), this.options.d()));
        if (getLayoutParams() != null && getLayoutParams().width == -1) {
            setMinimumWidth(li.a(getContext(), bannerSizeArr[0].getWidth()));
        }
        if (getLayoutParams() != null && getLayoutParams().height == -1) {
            setMinimumHeight(li.a(getContext(), bannerSizeArr[0].getHeight()));
        }
        if (getLayoutParams() != null) {
            if (getLayoutParams().width > 0) {
                setMinimumWidth(getLayoutParams().width);
            }
            if (getLayoutParams().height > 0) {
                setMinimumHeight(getLayoutParams().height);
            }
            if (getLayoutParams().width > 0 && getLayoutParams().height > 0 && (b1Var = this.ads) != null) {
                b1Var.f40826c = true;
            }
        }
        initFaces(list);
        addAdInformationLayout();
        if (this.paint == null) {
            Paint paint = new Paint();
            this.paint = paint;
            paint.setAntiAlias(true);
            this.paint.setFilterBitmap(true);
        }
        if (!this.animation) {
            this.animation = true;
            startRotation();
        }
        if (this.visible) {
            showBannerView();
        }
        if (z2) {
            k1.b(getContext(), this.listener, this, sb.toString());
        }
        onAdLoadedToView();
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        if (this.defaultLoad && !this.loaded) {
            loadBanner(null);
        }
        BannerOptions bannerOptions = this.options;
        if (bannerOptions == null || !bannerOptions.v()) {
            this.firstRotation = false;
            this.firstRotationFinished = true;
        }
        startRotation();
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        removeCallbacks(this.mAutoRotation);
        dispatchOnDetatchedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.drawn && !this.loading) {
            this.drawn = true;
            startRotation();
        }
        if (isInEditMode() || !this.visible || shouldCreateFaces()) {
            return;
        }
        drawFrame(canvas);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public void onFailedToReceiveAd(Ad ad) {
        if (ad != null) {
            setErrorMessage(ad.getErrorMessage());
        }
        k1.a(getContext(), this.listener, (BannerBase) this, (String) null);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public void onReceiveAd(Ad ad) {
        this.loaded = true;
        this.loading = false;
        this.overrides = this.ads.getAdInfoOverride();
        List<AdDetails> list = ((gb) ad).f41005a;
        this.adsItems = list;
        loadBanners(list, this.callListener);
        this.callListener = false;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a1 a1Var = (a1) parcelable;
        super.onRestoreInstanceState(a1Var.getSuperState());
        boolean z2 = a1Var.f40782l;
        this.visible = z2;
        if (z2) {
            this.adsItems = Arrays.asList(a1Var.f40776a);
            this.rotation = a1Var.f40777b;
            this.firstRotation = a1Var.f40778c == 1;
            this.firstRotationFinished = a1Var.d == 1;
            this.currentBannerIndex = a1Var.f40779e;
            d1[] d1VarArr = a1Var.m;
            cleanFaces();
            this.faces = new ArrayList();
            if (d1VarArr != null) {
                for (d1 d1Var : d1VarArr) {
                    this.faces.add(d1Var);
                }
            }
            this.loaded = a1Var.f;
            this.loading = a1Var.g;
            this.defaultLoad = a1Var.f40780h;
            this.overrides = a1Var.f40781i;
            this.options = a1Var.j;
            if (this.adsItems.size() != 0) {
                post(new c(this));
            } else {
                this.defaultLoad = true;
                init();
            }
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.View
    public Parcelable onSaveInstanceState() {
        a1 a1Var = new a1(super.onSaveInstanceState());
        a1Var.f40782l = this.visible;
        List<AdDetails> list = this.adsItems;
        a1Var.f40776a = new AdDetails[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            a1Var.f40776a[i2] = list.get(i2);
        }
        a1Var.f40777b = this.rotation;
        a1Var.f40778c = this.firstRotation ? 1 : 0;
        a1Var.d = this.firstRotationFinished ? 1 : 0;
        a1Var.f40779e = this.currentBannerIndex;
        a1Var.j = this.options;
        a1Var.m = new d1[this.faces.size()];
        a1Var.f = this.loaded;
        a1Var.g = this.loading;
        a1Var.f40781i = this.overrides;
        for (int i3 = 0; i3 < this.faces.size(); i3++) {
            a1Var.m[i3] = this.faces.get(i3);
        }
        return a1Var;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        List<d1> list;
        String str;
        if (!isEventInsideBanner(motionEvent) || (list = this.faces) == null || list.size() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touchDown = true;
            this.startY = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2 && this.startY - motionEvent.getY() >= 10.0f) {
                this.touchDown = false;
                this.startY = motionEvent.getY();
            }
        } else if (this.touchDown) {
            if (this.rotation < 45.0f) {
                prevBanner();
            }
            this.touchDown = false;
            this.rotationEnabled = false;
            setClicked(true);
            postDelayed(new b(this), AdsCommonMetaData.k().y());
            d1 d1Var = this.faces.get(getCurrentBannerIndex());
            Context context = getContext();
            String strP = d1Var.f40888a.p();
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
            boolean zA = h0.a(context);
            ag agVar = d1Var.g;
            if (agVar != null) {
                agVar.a(null, null);
            }
            if (strP != null && !AbstractJsonLexerKt.NULL.equals(strP) && !TextUtils.isEmpty(strP)) {
                h0.a(strP, d1Var.f40888a.o(), d1Var.f40888a.h(), context, d1Var.f);
                str = null;
            } else if (!d1Var.f40888a.D() || zA) {
                str = null;
                h0.a(context, d1Var.f40888a.h(), d1Var.f40888a.y(), d1Var.f, d1Var.f40888a.E() && !zA, false);
            } else {
                h0.a(context, d1Var.f40888a.h(), d1Var.f40888a.y(), d1Var.f40888a.s(), d1Var.f, AdsCommonMetaData.k().y(), AdsCommonMetaData.k().x(), d1Var.f40888a.E(), d1Var.f40888a.F(), false, null);
                str = null;
            }
            k1.a(getContext(), this.listener, (View) this, getCurrentBannerIndex() < this.adsItems.size() ? h0.a(this.adsItems.get(getCurrentBannerIndex()).h(), str) : str);
        }
        return true;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (!z2) {
            this.attachedToWindow = false;
            if (this.rotating) {
                return;
            }
            removeCallbacks(this.mAutoRotation);
            return;
        }
        this.attachedToWindow = true;
        BannerOptions bannerOptions = this.options;
        if (bannerOptions == null || !bannerOptions.v()) {
            this.firstRotation = false;
            this.firstRotationFinished = true;
        }
        startRotation();
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public void reload(String str) {
        this.loaded = false;
        this.loading = true;
        this.animation = false;
        this.rotationEnabled = true;
        this.firstRotation = true;
        this.firstRotationFinished = false;
        this.addedDisplayEvent = false;
        this.drawn = false;
        this.adRulesResult = null;
        cleanFaces();
        this.faces = new ArrayList();
        b1 b1Var = new b1(getContext(), this.eventTracer, this.consentManager, this.adCacheManager, this.videoAdCacheManager, this.webViewFactory, this.httpClient, this.networkApiExecutor, this.motionProcessor, this.webViewCacheLoader, getOffset());
        this.ads = b1Var;
        b1Var.load(prepareAdPreferences(), this);
    }

    public void rotate(float f) {
        float f2 = this.rotation + f;
        this.rotation = f2;
        if (f2 >= 90.0f) {
            nextBanner();
            this.rotation -= 90.0f;
        }
        if (this.rotation <= 0.0f) {
            prevBanner();
            this.rotation += 90.0f;
        }
        invalidate();
    }

    @Override // com.startapp.sdk.ads.banner.BannerInterface
    public void setBannerListener(BannerListener bannerListener) {
        this.listener = bannerListener;
    }

    @Override // com.startapp.sdk.ads.banner.BannerInterface
    public void showBanner() {
        this.visible = true;
        showBannerView();
    }

    public Banner3D(Activity activity, AdPreferences adPreferences) {
        this((Context) activity, adPreferences);
    }

    public Banner3D(Activity activity, BannerListener bannerListener) {
        this((Context) activity, bannerListener);
    }

    public Banner3D(Activity activity, AdPreferences adPreferences, BannerListener bannerListener) {
        this((Context) activity, adPreferences, bannerListener);
    }

    public Banner3D(Activity activity, boolean z2) {
        this((Context) activity, z2);
    }

    public Banner3D(Activity activity, boolean z2, AdPreferences adPreferences) {
        this((Context) activity, z2, adPreferences);
    }

    public Banner3D(Activity activity, AttributeSet attributeSet) {
        this((Context) activity, attributeSet);
    }

    public Banner3D(Activity activity, AttributeSet attributeSet, int i2) {
        this((Context) activity, attributeSet, i2);
    }

    @Deprecated
    public Banner3D(Context context) {
        this(context, true, (AdPreferences) null);
    }

    @Deprecated
    public Banner3D(Context context, AdPreferences adPreferences) {
        this(context, true, adPreferences);
    }

    @Deprecated
    public Banner3D(Context context, BannerListener bannerListener) {
        this(context, true, (AdPreferences) null);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public Banner3D(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        this(context, true, adPreferences);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public Banner3D(Context context, boolean z2) {
        this(context, z2, (AdPreferences) null);
    }

    @Deprecated
    public Banner3D(Context context, boolean z2, AdPreferences adPreferences) {
        this(context, (AttributeSet) null, 0);
        try {
            this.defaultLoad = z2;
            setAdPreferences(adPreferences);
            init();
        } catch (Throwable th) {
            g9.a(th);
        }
    }

    @Deprecated
    public Banner3D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public Banner3D(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, com.startapp.sdk.components.a.a(context).K, com.startapp.sdk.components.a.a(context).j, com.startapp.sdk.components.a.a(context).M, com.startapp.sdk.components.a.a(context).f40730N, com.startapp.sdk.components.a.a(context).f40735b, com.startapp.sdk.components.a.a(context).f40741n, com.startapp.sdk.components.a.a(context).f40724A, com.startapp.sdk.components.a.a(context).f40744w, com.startapp.sdk.components.a.a(context).f40736c, com.startapp.sdk.components.a.a(context).f40743u, com.startapp.sdk.components.a.a(context).f40740l);
    }

    public Banner3D(Context context, AttributeSet attributeSet, int i2, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9, lb lbVar10, lb lbVar11) {
        super(context, attributeSet, i2, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9, lbVar10, lbVar11);
        this.camera = null;
        this.matrix = null;
        this.paint = null;
        this.rotation = 45.0f;
        this.startY = 0.0f;
        this.rotationEnabled = true;
        this.rotating = false;
        this.firstRotation = true;
        this.firstRotationFinished = false;
        this.addedDisplayEvent = false;
        this.touchDown = false;
        this.animation = false;
        this.visible = true;
        this.defaultLoad = true;
        this.loaded = false;
        this.loading = false;
        this.attachedToWindow = false;
        this.callListener = true;
        this.faces = new ArrayList();
        this.currentBannerIndex = 0;
        this.mAutoRotation = new a(this);
        try {
            init();
        } catch (Throwable th) {
            g9.a(th);
        }
    }
}
