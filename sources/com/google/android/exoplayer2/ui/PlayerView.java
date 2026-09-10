package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A80;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AC;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4038mJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2321Bs;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2736Rs;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4422qh0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ih0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2554Kr;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4597sh0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K9;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LU;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QU;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RU;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SurfaceHolderCallbackC2658Os;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.UW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ug0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ViewOnLayoutChangeListenerC3083bV;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ZU;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewOnLayoutChangeListenerC3083bV f809a;
    public final AspectRatioFrameLayout b;
    public final View c;
    public final View d;
    public final boolean e;
    public final ImageView f;
    public final SubtitleView g;
    public final View h;
    public final TextView i;
    public final RU j;
    public final FrameLayout k;
    public final FrameLayout l;
    public LU m;
    public boolean n;
    public QU o;
    public boolean p;
    public Drawable q;
    public int r;
    public boolean s;
    public CharSequence t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    public PlayerView(Context context, @Nullable AttributeSet attributeSet) {
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z5;
        boolean z6;
        int i7;
        boolean z7;
        boolean z8;
        super(context, attributeSet, 0);
        ViewOnLayoutChangeListenerC3083bV viewOnLayoutChangeListenerC3083bV = new ViewOnLayoutChangeListenerC3083bV(this);
        this.f809a = viewOnLayoutChangeListenerC3083bV;
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = false;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            ImageView imageView = new ImageView(context);
            if (Ug0.f3833a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(Ug0.t(context, resources, 2131230988));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(Ug0.t(context, resources2, 2131230988));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, UW.d, 0, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(23);
                int color = typedArrayObtainStyledAttributes.getColor(23, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(12, R.layout.exo_player_view);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(6, 0);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                int i8 = typedArrayObtainStyledAttributes.getInt(24, 1);
                int i9 = typedArrayObtainStyledAttributes.getInt(14, 0);
                int i10 = typedArrayObtainStyledAttributes.getInt(22, 5000);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(8, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(20, 0);
                this.s = typedArrayObtainStyledAttributes.getBoolean(9, this.s);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(7, true);
                typedArrayObtainStyledAttributes.recycle();
                i3 = color;
                i5 = resourceId;
                z4 = z13;
                i = i9;
                i4 = integer;
                z2 = z11;
                i7 = i10;
                i2 = i8;
                z3 = z12;
                z7 = z10;
                z5 = zHasValue;
                i6 = resourceId2;
                z6 = z9;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i = 0;
            z2 = true;
            z3 = true;
            z4 = true;
            i2 = 1;
            i3 = 0;
            i4 = 0;
            i5 = R.layout.exo_player_view;
            i6 = 0;
            z5 = false;
            z6 = true;
            i7 = 5000;
            z7 = true;
        }
        LayoutInflater.from(context).inflate(i5, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.c = viewFindViewById;
        if (viewFindViewById != null && z5) {
            viewFindViewById.setBackgroundColor(i3);
        }
        if (aspectRatioFrameLayout == null || i2 == 0) {
            this.d = null;
            z8 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i2 != 2) {
                if (i2 == 3) {
                    try {
                        int i11 = A80.l;
                        this.d = (View) A80.class.getConstructor(Context.class).newInstance(context);
                        z8 = true;
                    } catch (Exception e) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    }
                } else if (i2 != 4) {
                    this.d = new SurfaceView(context);
                } else {
                    try {
                        int i12 = C4422qh0.b;
                        this.d = (View) C4422qh0.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    }
                }
                this.d.setLayoutParams(layoutParams);
                this.d.setOnClickListener(viewOnLayoutChangeListenerC3083bV);
                this.d.setClickable(false);
                aspectRatioFrameLayout.addView(this.d, 0);
            } else {
                this.d = new TextureView(context);
            }
            z8 = false;
            this.d.setLayoutParams(layoutParams);
            this.d.setOnClickListener(viewOnLayoutChangeListenerC3083bV);
            this.d.setClickable(false);
            aspectRatioFrameLayout.addView(this.d, 0);
        }
        this.e = z8;
        this.k = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.l = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f = imageView2;
        this.p = z6 && imageView2 != null;
        if (i6 != 0) {
            this.q = ContextCompat.getDrawable(getContext(), i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.g = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.h = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.r = i4;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        RU ru = (RU) findViewById(R.id.exo_controller);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (ru != null) {
            this.j = ru;
        } else if (viewFindViewById3 != null) {
            RU ru2 = new RU(context, attributeSet);
            this.j = ru2;
            ru2.setId(R.id.exo_controller);
            ru2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(ru2, iIndexOfChild);
        } else {
            this.j = null;
        }
        RU ru3 = this.j;
        this.u = ru3 != null ? i7 : 0;
        this.x = z2;
        this.v = z3;
        this.w = z4;
        this.n = z7 && ru3 != null;
        if (ru3 != null) {
            ru3.c();
            this.j.b.add(viewOnLayoutChangeListenerC3083bV);
        }
        if (z7) {
            setClickable(true);
        }
        j();
    }

    public static void a(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    public final boolean b() {
        LU lu = this.m;
        return lu != null && ((C2736Rs) lu).z() && ((C2736Rs) this.m).v();
    }

    public final void c(boolean z2) {
        if (!(b() && this.w) && m()) {
            RU ru = this.j;
            boolean z3 = ru.e() && ru.getShowTimeoutMs() <= 0;
            boolean zE = e();
            if (z2 || z3 || zE) {
                f(zE);
            }
        }
    }

    public final boolean d(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f);
                }
                ImageView imageView = this.f;
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        LU lu = this.m;
        if (lu != null && ((C2736Rs) lu).z()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z2 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        RU ru = this.j;
        if (z2 && m() && !ru.e()) {
            c(true);
        } else {
            if ((!m() || !ru.a(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                if (!z2 || !m()) {
                    return false;
                }
                c(true);
                return false;
            }
            c(true);
        }
        return true;
    }

    public final boolean e() {
        LU lu = this.m;
        if (lu == null) {
            return true;
        }
        int iW = ((C2736Rs) lu).w();
        return this.v && (iW == 1 || iW == 4 || !((C2736Rs) this.m).v());
    }

    public final void f(boolean z2) {
        if (m()) {
            int i = z2 ? 0 : this.u;
            RU ru = this.j;
            ru.setShowTimeoutMs(i);
            if (!ru.e()) {
                ru.setVisibility(0);
                for (QU qu : ru.b) {
                    ru.getVisibility();
                    ViewOnLayoutChangeListenerC3083bV viewOnLayoutChangeListenerC3083bV = (ViewOnLayoutChangeListenerC3083bV) qu;
                    viewOnLayoutChangeListenerC3083bV.getClass();
                    viewOnLayoutChangeListenerC3083bV.c.j();
                }
                ru.i();
                ru.h();
                ru.k();
                ru.l();
                ru.m();
                boolean zF = ru.f();
                View view = ru.f;
                View view2 = ru.e;
                if (!zF && view2 != null) {
                    view2.requestFocus();
                } else if (zF && view != null) {
                    view.requestFocus();
                }
                boolean zF2 = ru.f();
                if (!zF2 && view2 != null) {
                    view2.sendAccessibilityEvent(8);
                } else if (zF2 && view != null) {
                    view.sendAccessibilityEvent(8);
                }
            }
            ru.d();
        }
    }

    public final void g() {
        if (!m() || this.m == null) {
            return;
        }
        RU ru = this.j;
        if (!ru.e()) {
            c(true);
        } else if (this.x) {
            ru.c();
        }
    }

    public List<A70> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            arrayList.add(new A70(frameLayout, 4, "Transparent overlay does not impact viewability", 10));
        }
        RU ru = this.j;
        if (ru != null) {
            arrayList.add(new A70(ru));
        }
        return AC.j(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.k;
        FW.u(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.v;
    }

    public boolean getControllerHideOnTouch() {
        return this.x;
    }

    public int getControllerShowTimeoutMs() {
        return this.u;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.q;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.l;
    }

    @Nullable
    public LU getPlayer() {
        return this.m;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        FW.t(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.g;
    }

    public boolean getUseArtwork() {
        return this.p;
    }

    public boolean getUseController() {
        return this.n;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.d;
    }

    public final void h() {
        Ih0 ih0;
        LU lu = this.m;
        if (lu != null) {
            C2736Rs c2736Rs = (C2736Rs) lu;
            c2736Rs.Q();
            ih0 = c2736Rs.f0;
        } else {
            ih0 = Ih0.e;
        }
        int i = ih0.f3234a;
        int i2 = ih0.b;
        float f = (i2 == 0 || i == 0) ? 0.0f : (i * ih0.d) / i2;
        View view = this.d;
        if (view instanceof TextureView) {
            int i3 = ih0.c;
            if (f > 0.0f && (i3 == 90 || i3 == 270)) {
                f = 1.0f / f;
            }
            int i4 = this.y;
            ViewOnLayoutChangeListenerC3083bV viewOnLayoutChangeListenerC3083bV = this.f809a;
            if (i4 != 0) {
                view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC3083bV);
            }
            this.y = i3;
            if (i3 != 0) {
                view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC3083bV);
            }
            a((TextureView) view, this.y);
        }
        float f2 = this.e ? 0.0f : f;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public final void i() {
        boolean z2;
        View view = this.h;
        if (view != null) {
            LU lu = this.m;
            if (lu == null || ((C2736Rs) lu).w() != 2) {
                z2 = false;
            } else {
                int i = this.r;
                z2 = true;
                if (i != 2 && (i != 1 || !((C2736Rs) this.m).v())) {
                    z2 = false;
                }
            }
            view.setVisibility(z2 ? 0 : 8);
        }
    }

    public final void j() {
        RU ru = this.j;
        if (ru == null || !this.n) {
            setContentDescription(null);
        } else if (ru.getVisibility() == 0) {
            setContentDescription(this.x ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void k() {
        TextView textView = this.i;
        if (textView != null) {
            CharSequence charSequence = this.t;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            LU lu = this.m;
            if (lu != null) {
                C2736Rs c2736Rs = (C2736Rs) lu;
                c2736Rs.Q();
                C2321Bs c2321Bs = c2736Rs.h0.f;
            }
            textView.setVisibility(8);
        }
    }

    public final void l(boolean z2) {
        LU lu = this.m;
        View view = this.c;
        ImageView imageView = this.f;
        if (lu != null && ((K9) lu).a(30)) {
            C2736Rs c2736Rs = (C2736Rs) lu;
            c2736Rs.Q();
            if (!c2736Rs.h0.i.d.f5285a.isEmpty()) {
                if (z2 && !this.s && view != null) {
                    view.setVisibility(0);
                }
                c2736Rs.Q();
                if (c2736Rs.h0.i.d.a(2)) {
                    if (imageView != null) {
                        imageView.setImageResource(android.R.color.transparent);
                        imageView.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (view != null) {
                    view.setVisibility(0);
                }
                if (this.p) {
                    FW.t(imageView);
                    c2736Rs.Q();
                    byte[] bArr = c2736Rs.N.j;
                    if (bArr != null) {
                        if (d(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)))) {
                            return;
                        }
                    }
                    if (d(this.q)) {
                        return;
                    }
                }
                if (imageView != null) {
                    imageView.setImageResource(android.R.color.transparent);
                    imageView.setVisibility(4);
                    return;
                }
                return;
            }
        }
        if (this.s) {
            return;
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            imageView.setVisibility(4);
        }
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final boolean m() {
        if (!this.n) {
            return false;
        }
        FW.t(this.j);
        return true;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m() || this.m == null) {
            return false;
        }
        c(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        g();
        return super.performClick();
    }

    public void setAspectRatioListener(@Nullable W5 w5) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        FW.t(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(w5);
    }

    public void setControllerAutoShow(boolean z2) {
        this.v = z2;
    }

    public void setControllerHideDuringAds(boolean z2) {
        this.w = z2;
    }

    public void setControllerHideOnTouch(boolean z2) {
        FW.t(this.j);
        this.x = z2;
        j();
    }

    public void setControllerShowTimeoutMs(int i) {
        RU ru = this.j;
        FW.t(ru);
        this.u = i;
        if (ru.e()) {
            f(e());
        }
    }

    public void setControllerVisibilityListener(@Nullable QU qu) {
        RU ru = this.j;
        FW.t(ru);
        QU qu2 = this.o;
        if (qu2 == qu) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = ru.b;
        if (qu2 != null) {
            copyOnWriteArrayList.remove(qu2);
        }
        this.o = qu;
        if (qu != null) {
            copyOnWriteArrayList.add(qu);
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        FW.s(this.i != null);
        this.t = charSequence;
        k();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.q != drawable) {
            this.q = drawable;
            l(false);
        }
    }

    public void setErrorMessageProvider(@Nullable InterfaceC2554Kr interfaceC2554Kr) {
        if (interfaceC2554Kr != null) {
            k();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z2) {
        if (this.s != z2) {
            this.s = z2;
            l(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public void setPlayer(@Nullable LU lu) {
        boolean z2;
        FW.s(Looper.myLooper() == Looper.getMainLooper());
        if (lu != null) {
            if (((C2736Rs) lu).r == Looper.getMainLooper()) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        FW.h(z2);
        LU lu2 = this.m;
        if (lu2 == lu) {
            return;
        }
        View view = this.d;
        ViewOnLayoutChangeListenerC3083bV viewOnLayoutChangeListenerC3083bV = this.f809a;
        if (lu2 != null) {
            C2736Rs c2736Rs = (C2736Rs) lu2;
            c2736Rs.F(viewOnLayoutChangeListenerC3083bV);
            if (((K9) lu2).a(27)) {
                if (view instanceof TextureView) {
                    TextureView textureView = (TextureView) view;
                    c2736Rs.Q();
                    if (textureView != null && textureView == c2736Rs.U) {
                        c2736Rs.j();
                    }
                } else if (view instanceof SurfaceView) {
                    SurfaceView surfaceView = (SurfaceView) view;
                    c2736Rs.Q();
                    SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
                    c2736Rs.Q();
                    if (holder != null && holder == c2736Rs.R) {
                        c2736Rs.j();
                    }
                }
            }
        }
        SubtitleView subtitleView = this.g;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.m = lu;
        boolean zM = m();
        RU ru = this.j;
        if (zM) {
            ru.setPlayer(lu);
        }
        i();
        k();
        l(true);
        if (lu == null) {
            if (ru != null) {
                ru.c();
                return;
            }
            return;
        }
        K9 k9 = (K9) lu;
        if (k9.a(27)) {
            if (view instanceof TextureView) {
                TextureView textureView2 = (TextureView) view;
                C2736Rs c2736Rs2 = (C2736Rs) lu;
                c2736Rs2.Q();
                if (textureView2 == null) {
                    c2736Rs2.j();
                } else {
                    c2736Rs2.G();
                    c2736Rs2.U = textureView2;
                    if (textureView2.getSurfaceTextureListener() != null) {
                        AbstractC4038mJ.f();
                    }
                    textureView2.setSurfaceTextureListener(c2736Rs2.w);
                    SurfaceTexture surfaceTexture = textureView2.isAvailable() ? textureView2.getSurfaceTexture() : null;
                    if (surfaceTexture == null) {
                        c2736Rs2.L(null);
                        c2736Rs2.C(0, 0);
                    } else {
                        Surface surface = new Surface(surfaceTexture);
                        c2736Rs2.L(surface);
                        c2736Rs2.Q = surface;
                        c2736Rs2.C(textureView2.getWidth(), textureView2.getHeight());
                    }
                }
            } else if (view instanceof SurfaceView) {
                SurfaceView surfaceView2 = (SurfaceView) view;
                C2736Rs c2736Rs3 = (C2736Rs) lu;
                c2736Rs3.Q();
                if (surfaceView2 instanceof InterfaceC4597sh0) {
                    c2736Rs3.G();
                    c2736Rs3.L(surfaceView2);
                    c2736Rs3.I(surfaceView2.getHolder());
                } else {
                    boolean z3 = surfaceView2 instanceof A80;
                    SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os = c2736Rs3.w;
                    if (z3) {
                        c2736Rs3.G();
                        c2736Rs3.S = (A80) surfaceView2;
                        ZU zuL = c2736Rs3.l(c2736Rs3.x);
                        FW.s(!zuL.g);
                        zuL.d = 10000;
                        A80 a80 = c2736Rs3.S;
                        FW.s(true ^ zuL.g);
                        zuL.e = a80;
                        zuL.c();
                        c2736Rs3.S.f2804a.add(surfaceHolderCallbackC2658Os);
                        c2736Rs3.L(c2736Rs3.S.getVideoSurface());
                        c2736Rs3.I(surfaceView2.getHolder());
                    } else {
                        SurfaceHolder holder2 = surfaceView2 == null ? null : surfaceView2.getHolder();
                        c2736Rs3.Q();
                        if (holder2 == null) {
                            c2736Rs3.j();
                        } else {
                            c2736Rs3.G();
                            c2736Rs3.T = true;
                            c2736Rs3.R = holder2;
                            holder2.addCallback(surfaceHolderCallbackC2658Os);
                            Surface surface2 = holder2.getSurface();
                            if (surface2 == null || !surface2.isValid()) {
                                c2736Rs3.L(null);
                                c2736Rs3.C(0, 0);
                            } else {
                                c2736Rs3.L(surface2);
                                Rect surfaceFrame = holder2.getSurfaceFrame();
                                c2736Rs3.C(surfaceFrame.width(), surfaceFrame.height());
                            }
                        }
                    }
                }
            }
            h();
        }
        if (subtitleView != null && k9.a(28)) {
            C2736Rs c2736Rs4 = (C2736Rs) lu;
            c2736Rs4.Q();
            subtitleView.setCues(c2736Rs4.b0.f3181a);
        }
        viewOnLayoutChangeListenerC3083bV.getClass();
        ((C2736Rs) lu).l.a(viewOnLayoutChangeListenerC3083bV);
        c(false);
    }

    public void setRepeatToggleModes(int i) {
        RU ru = this.j;
        FW.t(ru);
        ru.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        FW.t(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.r != i) {
            this.r = i;
            i();
        }
    }

    public void setShowFastForwardButton(boolean z2) {
        RU ru = this.j;
        FW.t(ru);
        ru.setShowFastForwardButton(z2);
    }

    public void setShowMultiWindowTimeBar(boolean z2) {
        RU ru = this.j;
        FW.t(ru);
        ru.setShowMultiWindowTimeBar(z2);
    }

    public void setShowNextButton(boolean z2) {
        RU ru = this.j;
        FW.t(ru);
        ru.setShowNextButton(z2);
    }

    public void setShowPreviousButton(boolean z2) {
        RU ru = this.j;
        FW.t(ru);
        ru.setShowPreviousButton(z2);
    }

    public void setShowRewindButton(boolean z2) {
        RU ru = this.j;
        FW.t(ru);
        ru.setShowRewindButton(z2);
    }

    public void setShowShuffleButton(boolean z2) {
        RU ru = this.j;
        FW.t(ru);
        ru.setShowShuffleButton(z2);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z2) {
        FW.s((z2 && this.f == null) ? false : true);
        if (this.p != z2) {
            this.p = z2;
            l(false);
        }
    }

    public void setUseController(boolean z2) {
        boolean z3 = true;
        RU ru = this.j;
        FW.s((z2 && ru == null) ? false : true);
        if (!z2 && !hasOnClickListeners()) {
            z3 = false;
        }
        setClickable(z3);
        if (this.n == z2) {
            return;
        }
        this.n = z2;
        if (m()) {
            ru.setPlayer(this.m);
        } else if (ru != null) {
            ru.c();
            ru.setPlayer(null);
        }
        j();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }
}
