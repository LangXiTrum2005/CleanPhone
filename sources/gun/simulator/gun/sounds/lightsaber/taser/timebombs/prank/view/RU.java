package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class RU extends FrameLayout {
    public final Drawable A;
    public final Drawable B;
    public final float C;
    public final float D;
    public final String E;
    public final String F;
    public LU G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public long T;
    public long[] U;
    public boolean[] V;
    public final long[] W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OU f3659a;
    public final boolean[] a0;
    public final CopyOnWriteArrayList b;
    public long b0;
    public final View c;
    public long c0;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final ImageView i;
    public final ImageView j;
    public final View k;
    public final TextView l;
    public final TextView m;
    public final InterfaceC4499rc0 n;
    public final StringBuilder o;
    public final Formatter p;
    public final Ec0 q;
    public final Fc0 r;
    public final MU s;
    public final MU t;
    public final Drawable u;
    public final Drawable v;
    public final Drawable w;
    public final String x;
    public final String y;
    public final String z;

    static {
        AbstractC2944Zs.a("goog.exo.ui");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r7v1, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MU] */
    /* JADX WARN: Type inference failed for: r7v2, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MU] */
    public RU(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        final int i = 0;
        this.L = 5000;
        this.N = 0;
        this.M = 200;
        this.T = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        final int i2 = 1;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.S = false;
        int resourceId = R.layout.exo_player_control_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, UW.c, 0, 0);
            try {
                this.L = typedArrayObtainStyledAttributes.getInt(19, this.L);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(5, R.layout.exo_player_control_view);
                this.N = typedArrayObtainStyledAttributes.getInt(8, this.N);
                this.O = typedArrayObtainStyledAttributes.getBoolean(17, this.O);
                this.P = typedArrayObtainStyledAttributes.getBoolean(14, this.P);
                this.Q = typedArrayObtainStyledAttributes.getBoolean(16, this.Q);
                this.R = typedArrayObtainStyledAttributes.getBoolean(15, this.R);
                this.S = typedArrayObtainStyledAttributes.getBoolean(18, this.S);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(20, this.M));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.b = new CopyOnWriteArrayList();
        this.q = new Ec0();
        this.r = new Fc0();
        StringBuilder sb = new StringBuilder();
        this.o = sb;
        this.p = new Formatter(sb, Locale.getDefault());
        this.U = new long[0];
        this.V = new boolean[0];
        this.W = new long[0];
        this.a0 = new boolean[0];
        OU ou = new OU(this);
        this.f3659a = ou;
        this.s = new Runnable(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MU
            public final /* synthetic */ RU b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                RU ru = this.b;
                switch (i3) {
                    case 0:
                        ru.j();
                        break;
                    default:
                        ru.c();
                        break;
                }
            }
        };
        this.t = new Runnable(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MU
            public final /* synthetic */ RU b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                RU ru = this.b;
                switch (i3) {
                    case 0:
                        ru.j();
                        break;
                    default:
                        ru.c();
                        break;
                }
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        InterfaceC4499rc0 interfaceC4499rc0 = (InterfaceC4499rc0) findViewById(R.id.exo_progress);
        View viewFindViewById = findViewById(R.id.exo_progress_placeholder);
        if (interfaceC4499rc0 != null) {
            this.n = interfaceC4499rc0;
        } else if (viewFindViewById != null) {
            C2757Sn c2757Sn = new C2757Sn(context, attributeSet);
            c2757Sn.setId(R.id.exo_progress);
            c2757Sn.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(c2757Sn, iIndexOfChild);
            this.n = c2757Sn;
        } else {
            this.n = null;
        }
        this.l = (TextView) findViewById(R.id.exo_duration);
        this.m = (TextView) findViewById(R.id.exo_position);
        InterfaceC4499rc0 interfaceC4499rc1 = this.n;
        if (interfaceC4499rc1 != null) {
            ((C2757Sn) interfaceC4499rc1).x.add(ou);
        }
        View viewFindViewById2 = findViewById(R.id.exo_play);
        this.e = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(ou);
        }
        View viewFindViewById3 = findViewById(R.id.exo_pause);
        this.f = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(ou);
        }
        View viewFindViewById4 = findViewById(R.id.exo_prev);
        this.c = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(ou);
        }
        View viewFindViewById5 = findViewById(R.id.exo_next);
        this.d = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(ou);
        }
        View viewFindViewById6 = findViewById(R.id.exo_rew);
        this.h = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(ou);
        }
        View viewFindViewById7 = findViewById(R.id.exo_ffwd);
        this.g = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(ou);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(ou);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(ou);
        }
        View viewFindViewById8 = findViewById(R.id.exo_vr);
        this.k = viewFindViewById8;
        setShowVrButton(false);
        g(viewFindViewById8, false, false);
        Resources resources = context.getResources();
        this.C = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.D = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.u = Ug0.t(context, resources, R.drawable.exo_controls_repeat_off);
        this.v = Ug0.t(context, resources, R.drawable.exo_controls_repeat_one);
        this.w = Ug0.t(context, resources, R.drawable.exo_controls_repeat_all);
        this.A = Ug0.t(context, resources, R.drawable.exo_controls_shuffle_on);
        this.B = Ug0.t(context, resources, R.drawable.exo_controls_shuffle_off);
        this.x = resources.getString(R.string.exo_controls_repeat_off_description);
        this.y = resources.getString(R.string.exo_controls_repeat_one_description);
        this.z = resources.getString(R.string.exo_controls_repeat_all_description);
        this.E = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.F = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.c0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    public static void b(LU lu) {
        C2736Rs c2736Rs = (C2736Rs) lu;
        int iW = c2736Rs.w();
        if (iW == 1) {
            c2736Rs.D();
        } else if (iW == 4) {
            c2736Rs.e(c2736Rs.p(), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, false);
        }
        c2736Rs.J(true);
    }

    public final boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        LU lu = this.G;
        if (lu == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (((C2736Rs) lu).w() != 4) {
                    K9 k9 = (K9) lu;
                    C2736Rs c2736Rs = (C2736Rs) k9;
                    c2736Rs.Q();
                    k9.g(12, c2736Rs.u);
                }
            } else if (keyCode == 89) {
                K9 k10 = (K9) lu;
                C2736Rs c2736Rs2 = (C2736Rs) k10;
                c2736Rs2.Q();
                k10.g(11, -c2736Rs2.t);
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    C2736Rs c2736Rs3 = (C2736Rs) lu;
                    int iW = c2736Rs3.w();
                    if (iW == 1 || iW == 4 || !c2736Rs3.v()) {
                        b(c2736Rs3);
                    } else {
                        c2736Rs3.J(false);
                    }
                } else if (keyCode == 87) {
                    ((K9) lu).f();
                } else if (keyCode == 88) {
                    ((K9) lu).h();
                } else if (keyCode == 126) {
                    b(lu);
                } else if (keyCode == 127) {
                    ((C2736Rs) ((K9) lu)).J(false);
                }
            }
        }
        return true;
    }

    public final void c() {
        if (e()) {
            setVisibility(8);
            for (QU qu : this.b) {
                getVisibility();
                ViewOnLayoutChangeListenerC3083bV viewOnLayoutChangeListenerC3083bV = (ViewOnLayoutChangeListenerC3083bV) qu;
                viewOnLayoutChangeListenerC3083bV.getClass();
                viewOnLayoutChangeListenerC3083bV.c.j();
            }
            removeCallbacks(this.s);
            removeCallbacks(this.t);
            this.T = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
    }

    public final void d() {
        MU mu = this.t;
        removeCallbacks(mu);
        if (this.L <= 0) {
            this.T = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.L;
        this.T = jUptimeMillis + j;
        if (this.H) {
            postDelayed(mu, j);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.t);
        } else if (motionEvent.getAction() == 1) {
            d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        return getVisibility() == 0;
    }

    public final boolean f() {
        LU lu = this.G;
        return (lu == null || ((C2736Rs) lu).w() == 4 || ((C2736Rs) this.G).w() == 1 || !((C2736Rs) this.G).v()) ? false : true;
    }

    public final void g(View view, boolean z, boolean z2) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.C : this.D);
        view.setVisibility(z ? 0 : 8);
    }

    @Nullable
    public LU getPlayer() {
        return this.G;
    }

    public int getRepeatToggleModes() {
        return this.N;
    }

    public boolean getShowShuffleButton() {
        return this.S;
    }

    public int getShowTimeoutMs() {
        return this.L;
    }

    public boolean getShowVrButton() {
        View view = this.k;
        return view != null && view.getVisibility() == 0;
    }

    public final void h() {
        boolean zA;
        boolean zA2;
        boolean zA3;
        boolean zA4;
        boolean zA5;
        if (e() && this.H) {
            LU lu = this.G;
            if (lu != null) {
                K9 k9 = (K9) lu;
                zA = k9.a(5);
                zA3 = k9.a(7);
                zA4 = k9.a(11);
                zA5 = k9.a(12);
                zA2 = k9.a(9);
            } else {
                zA = false;
                zA2 = false;
                zA3 = false;
                zA4 = false;
                zA5 = false;
            }
            g(this.c, this.Q, zA3);
            g(this.h, this.O, zA4);
            g(this.g, this.P, zA5);
            g(this.d, this.R, zA2);
            InterfaceC4499rc0 interfaceC4499rc0 = this.n;
            if (interfaceC4499rc0 != null) {
                ((C2757Sn) interfaceC4499rc0).setEnabled(zA);
            }
        }
    }

    public final void i() {
        boolean z;
        boolean z2;
        if (e() && this.H) {
            boolean zF = f();
            View view = this.e;
            boolean z3 = true;
            if (view != null) {
                z = zF && view.isFocused();
                if (Ug0.f3833a < 21) {
                    z2 = z;
                } else {
                    z2 = zF && NU.a(view);
                }
                view.setVisibility(zF ? 8 : 0);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.f;
            if (view2 != null) {
                z |= !zF && view2.isFocused();
                if (Ug0.f3833a < 21) {
                    z3 = z;
                } else if (zF || !NU.a(view2)) {
                    z3 = false;
                }
                z2 |= z3;
                view2.setVisibility(zF ? 0 : 8);
            }
            if (z) {
                boolean zF2 = f();
                if (!zF2 && view != null) {
                    view.requestFocus();
                } else if (zF2 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z2) {
                boolean zF3 = f();
                if (!zF3 && view != null) {
                    view.sendAccessibilityEvent(8);
                } else {
                    if (!zF3 || view2 == null) {
                        return;
                    }
                    view2.sendAccessibilityEvent(8);
                }
            }
        }
    }

    public final void j() {
        long j;
        long jW;
        if (e() && this.H) {
            LU lu = this.G;
            long j2 = 0;
            if (lu != null) {
                C2736Rs c2736Rs = (C2736Rs) lu;
                long jM = c2736Rs.m() + this.b0;
                long j3 = this.b0;
                c2736Rs.Q();
                if (c2736Rs.h0.f2971a.q()) {
                    jW = c2736Rs.j0;
                } else {
                    DU du = c2736Rs.h0;
                    if (du.k.d != du.b.d) {
                        jW = Ug0.W(du.f2971a.n(c2736Rs.p(), c2736Rs.f3304a, 0L).n);
                    } else {
                        long j4 = du.p;
                        if (c2736Rs.h0.k.a()) {
                            DU du2 = c2736Rs.h0;
                            Ec0 ec0H = du2.f2971a.h(du2.k.f4977a, c2736Rs.n);
                            long jD = ec0H.d(c2736Rs.h0.k.b);
                            j4 = jD == Long.MIN_VALUE ? ec0H.d : jD;
                        }
                        DU du3 = c2736Rs.h0;
                        Gc0 gc0 = du3.f2971a;
                        Object obj = du3.k.f4977a;
                        Ec0 ec0 = c2736Rs.n;
                        gc0.h(obj, ec0);
                        jW = Ug0.W(j4 + ec0.e);
                    }
                }
                j = jW + j3;
                j2 = jM;
            } else {
                j = 0;
            }
            boolean z = j2 != this.c0;
            this.c0 = j2;
            TextView textView = this.m;
            if (textView != null && !this.K && z) {
                textView.setText(Ug0.C(this.o, this.p, j2));
            }
            InterfaceC4499rc0 interfaceC4499rc0 = this.n;
            if (interfaceC4499rc0 != null) {
                ((C2757Sn) interfaceC4499rc0).setPosition(j2);
                ((C2757Sn) this.n).setBufferedPosition(j);
            }
            removeCallbacks(this.s);
            int iW = lu == null ? 1 : ((C2736Rs) lu).w();
            if (lu != null) {
                C2736Rs c2736Rs2 = (C2736Rs) ((K9) lu);
                if (c2736Rs2.w() == 3 && c2736Rs2.v()) {
                    c2736Rs2.Q();
                    if (c2736Rs2.h0.m == 0) {
                        InterfaceC4499rc0 interfaceC4499rc1 = this.n;
                        long jMin = Math.min(interfaceC4499rc1 != null ? ((C2757Sn) interfaceC4499rc1).getPreferredUpdateDelay() : 1000L, 1000 - (j2 % 1000));
                        C2736Rs c2736Rs3 = (C2736Rs) lu;
                        c2736Rs3.Q();
                        float f = c2736Rs3.h0.n.f3024a;
                        postDelayed(this.s, Ug0.k(f > 0.0f ? (long) (jMin / f) : 1000L, this.M, 1000L));
                        return;
                    }
                }
            }
            if (iW == 4 || iW == 1) {
                return;
            }
            postDelayed(this.s, 1000L);
        }
    }

    public final void k() {
        ImageView imageView;
        if (e() && this.H && (imageView = this.i) != null) {
            if (this.N == 0) {
                g(imageView, false, false);
                return;
            }
            LU lu = this.G;
            String str = this.x;
            Drawable drawable = this.u;
            if (lu == null) {
                g(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            g(imageView, true, true);
            C2736Rs c2736Rs = (C2736Rs) lu;
            c2736Rs.Q();
            int i = c2736Rs.E;
            if (i == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (i == 1) {
                imageView.setImageDrawable(this.v);
                imageView.setContentDescription(this.y);
            } else if (i == 2) {
                imageView.setImageDrawable(this.w);
                imageView.setContentDescription(this.z);
            }
            imageView.setVisibility(0);
        }
    }

    public final void l() {
        ImageView imageView;
        if (e() && this.H && (imageView = this.j) != null) {
            LU lu = this.G;
            if (!this.S) {
                g(imageView, false, false);
                return;
            }
            String str = this.F;
            Drawable drawable = this.B;
            if (lu == null) {
                g(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            g(imageView, true, true);
            C2736Rs c2736Rs = (C2736Rs) lu;
            c2736Rs.Q();
            if (c2736Rs.F) {
                drawable = this.A;
            }
            imageView.setImageDrawable(drawable);
            c2736Rs.Q();
            if (c2736Rs.F) {
                str = this.E;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d A[EDGE_INSN: B:17:0x003d->B:18:0x003e BREAK  A[LOOP:0: B:11:0x002b->B:15:0x0038]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6 A[PHI: r4
  0x00a6: PHI (r4v15 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0) = 
  (r4v9 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0)
  (r4v16 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0)
 binds: [B:49:0x00b7, B:44:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    public final void m() {
        boolean z;
        boolean z2;
        long j;
        int i;
        Gc0 gc0;
        Gc0 gc1;
        boolean z3;
        LU lu = this.G;
        if (lu == null) {
            return;
        }
        boolean z4 = this.I;
        boolean z5 = false;
        boolean z6 = true;
        long j2 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        Fc0 fc0 = this.r;
        if (!z4) {
            z = false;
            break;
        }
        Gc0 gc0T = ((C2736Rs) lu).t();
        if (gc0T.p() <= 100) {
            int iP = gc0T.p();
            int i2 = 0;
            while (true) {
                if (i2 >= iP) {
                    z = true;
                    break;
                } else {
                    if (gc0T.n(i2, fc0, 0L).n == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            }
        } else {
            z = false;
            break;
        }
        this.J = z;
        this.b0 = 0L;
        C2736Rs c2736Rs = (C2736Rs) lu;
        Gc0 gc0T2 = c2736Rs.t();
        if (gc0T2.q()) {
            z2 = true;
            j = 0;
            i = 0;
        } else {
            int iP2 = c2736Rs.p();
            boolean z7 = this.J;
            int i3 = z7 ? 0 : iP2;
            int iP3 = z7 ? gc0T2.p() - 1 : iP2;
            long j3 = 0;
            i = 0;
            while (i3 <= iP3) {
                if (i3 == iP2) {
                    this.b0 = Ug0.W(j3);
                }
                gc0T2.o(i3, fc0);
                if (fc0.n == j2) {
                    FW.s(this.J ^ z6);
                    break;
                }
                int i4 = fc0.o;
                while (i4 <= fc0.p) {
                    Ec0 ec0 = this.q;
                    gc0T2.g(i4, ec0, z5);
                    C2 c2 = ec0.g;
                    int i5 = c2.e;
                    while (i5 < c2.b) {
                        long jD = ec0.d(i5);
                        int i6 = iP2;
                        if (jD == Long.MIN_VALUE) {
                            gc0 = gc0T2;
                            long j4 = ec0.d;
                            if (j4 == j2) {
                                gc1 = gc0;
                            } else {
                                jD = j4;
                            }
                            i5++;
                            iP2 = i6;
                            gc0T2 = gc1;
                            j2 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                        } else {
                            gc0 = gc0T2;
                        }
                        long j5 = jD + ec0.e;
                        if (j5 >= 0) {
                            long[] jArr = this.U;
                            if (i == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.U = Arrays.copyOf(jArr, length);
                                this.V = Arrays.copyOf(this.V, length);
                            }
                            this.U[i] = Ug0.W(j3 + j5);
                            boolean[] zArr = this.V;
                            B2 b2A = ec0.g.a(i5);
                            int i7 = b2A.b;
                            if (i7 == -1) {
                                gc1 = gc0;
                            } else {
                                int i8 = 0;
                                while (true) {
                                    if (i8 < i7) {
                                        gc1 = gc0;
                                        int i9 = b2A.e[i8];
                                        if (i9 != 0) {
                                            B2 b2 = b2A;
                                            if (i9 != 1) {
                                                i8++;
                                                gc0 = gc1;
                                                b2A = b2;
                                            }
                                        }
                                        z3 = true;
                                    } else {
                                        gc1 = gc0;
                                        z3 = false;
                                    }
                                    zArr[i] = !z3;
                                    i++;
                                }
                            }
                            z3 = true;
                            zArr[i] = !z3;
                            i++;
                        } else {
                            gc1 = gc0;
                        }
                        i5++;
                        iP2 = i6;
                        gc0T2 = gc1;
                        j2 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                    }
                    i4++;
                    gc0T2 = gc0T2;
                    z5 = false;
                    j2 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                }
                j3 += fc0.n;
                i3++;
                gc0T2 = gc0T2;
                z5 = false;
                z6 = true;
                j2 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            }
            z2 = true;
            j = j3;
        }
        long jW = Ug0.W(j);
        TextView textView = this.l;
        if (textView != null) {
            textView.setText(Ug0.C(this.o, this.p, jW));
        }
        InterfaceC4499rc0 interfaceC4499rc0 = this.n;
        if (interfaceC4499rc0 != null) {
            C2757Sn c2757Sn = (C2757Sn) interfaceC4499rc0;
            c2757Sn.setDuration(jW);
            long[] jArr2 = this.W;
            int length2 = jArr2.length;
            int i10 = i + length2;
            long[] jArr3 = this.U;
            if (i10 > jArr3.length) {
                this.U = Arrays.copyOf(jArr3, i10);
                this.V = Arrays.copyOf(this.V, i10);
            }
            System.arraycopy(jArr2, 0, this.U, i, length2);
            System.arraycopy(this.a0, 0, this.V, i, length2);
            long[] jArr4 = this.U;
            boolean[] zArr2 = this.V;
            if (i10 != 0 && (jArr4 == null || zArr2 == null)) {
                z2 = false;
            }
            FW.h(z2);
            c2757Sn.K = i10;
            c2757Sn.L = jArr4;
            c2757Sn.M = zArr2;
            c2757Sn.e();
        }
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H = true;
        long j = this.T;
        if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                c();
            } else {
                postDelayed(this.t, jUptimeMillis);
            }
        } else if (e()) {
            d();
        }
        i();
        h();
        k();
        l();
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H = false;
        removeCallbacks(this.s);
        removeCallbacks(this.t);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    public void setPlayer(@Nullable LU lu) {
        boolean z;
        FW.s(Looper.myLooper() == Looper.getMainLooper());
        if (lu != null) {
            z = ((C2736Rs) lu).r == Looper.getMainLooper();
        }
        FW.h(z);
        LU lu2 = this.G;
        if (lu2 == lu) {
            return;
        }
        OU ou = this.f3659a;
        if (lu2 != null) {
            ((C2736Rs) lu2).F(ou);
        }
        this.G = lu;
        if (lu != null) {
            ou.getClass();
            ((C2736Rs) lu).l.a(ou);
        }
        i();
        h();
        k();
        l();
        m();
    }

    public void setRepeatToggleModes(int i) {
        this.N = i;
        LU lu = this.G;
        if (lu != null) {
            C2736Rs c2736Rs = (C2736Rs) lu;
            c2736Rs.Q();
            int i2 = c2736Rs.E;
            if (i == 0 && i2 != 0) {
                ((C2736Rs) this.G).K(0);
            } else if (i == 1 && i2 == 2) {
                ((C2736Rs) this.G).K(1);
            } else if (i == 2 && i2 == 1) {
                ((C2736Rs) this.G).K(2);
            }
        }
        k();
    }

    public void setShowFastForwardButton(boolean z) {
        this.P = z;
        h();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.I = z;
        m();
    }

    public void setShowNextButton(boolean z) {
        this.R = z;
        h();
    }

    public void setShowPreviousButton(boolean z) {
        this.Q = z;
        h();
    }

    public void setShowRewindButton(boolean z) {
        this.O = z;
        h();
    }

    public void setShowShuffleButton(boolean z) {
        this.S = z;
        l();
    }

    public void setShowTimeoutMs(int i) {
        this.L = i;
        if (e()) {
            d();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.k;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.M = Ug0.j(i, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            g(view, getShowVrButton(), onClickListener != null);
        }
    }

    public void setProgressUpdateListener(@Nullable PU pu) {
    }
}
