package com.inmobi.media;

import A.RunnableC0883c;
import android.R;
import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3078j5 implements InterfaceC3226sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f23715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3295x f23716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public P f23717c;
    public RelativeLayout d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Y3 f23718e;
    public EnumC3179pa f;
    public float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC3333z5 f23719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3062i5 f23720i;
    public final C3046h5 j;

    public C3078j5(InMobiAdActivity activity) {
        Intrinsics.f(activity, "activity");
        this.f23715a = new WeakReference(activity);
        this.f = AbstractC3195qa.a(U3.g());
        this.g = 1.0f;
        this.f23720i = new C3062i5(this);
        this.j = new C3046h5(this);
    }

    public final void a(Intent intent, SparseArray adContainers) {
        Y3 y3;
        Window window;
        Intrinsics.f(intent, "intent");
        Intrinsics.f(adContainers, "adContainers");
        if (!intent.hasExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX")) {
            b();
            return;
        }
        InterfaceC3295x interfaceC3295x = (InterfaceC3295x) adContainers.get(intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", -1));
        if (interfaceC3295x == null) {
            b();
            return;
        }
        int intExtra = intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 0);
        if (intExtra == 0) {
            InterfaceC3279w fullScreenEventsListener = interfaceC3295x.getFullScreenEventsListener();
            if (fullScreenEventsListener != null) {
                fullScreenEventsListener.a();
            }
            b();
            return;
        }
        if (intent.getBooleanExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", false) && (this.f23715a.get() instanceof InMobiAdActivity)) {
            Object obj = this.f23715a.get();
            Intrinsics.d(obj, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
            if (!((InMobiAdActivity) obj).g) {
                Object obj2 = this.f23715a.get();
                Intrinsics.d(obj2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                ((InMobiAdActivity) obj2).g = true;
                if (!(interfaceC3295x instanceof GestureDetectorOnGestureListenerC3005ec) ? false : ((GestureDetectorOnGestureListenerC3005ec) interfaceC3295x).S0) {
                    InterfaceC3333z5 interfaceC3333z5 = this.f23719h;
                    if (interfaceC3333z5 != null) {
                        ((A5) interfaceC3333z5).a("InMobiActivityViewHandler", "showInImmersiveMode");
                    }
                    Object obj3 = this.f23715a.get();
                    InMobiAdActivity inMobiAdActivity = obj3 instanceof InMobiAdActivity ? (InMobiAdActivity) obj3 : null;
                    if (inMobiAdActivity != null && (window = inMobiAdActivity.getWindow()) != null) {
                        L3 l3 = L3.f22938a;
                        if (l3.z()) {
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            attributes.layoutInDisplayCutoutMode = 3;
                            window.setAttributes(attributes);
                            WindowCompat.a(window, false);
                        } else if (l3.x()) {
                            WindowManager.LayoutParams attributes2 = window.getAttributes();
                            attributes2.layoutInDisplayCutoutMode = 1;
                            window.setAttributes(attributes2);
                            WindowCompat.a(window, false);
                        }
                        if (l3.z()) {
                            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
                            windowInsetsControllerCompat.e();
                            windowInsetsControllerCompat.a(7);
                            windowInsetsControllerCompat.a(128);
                        } else if (l3.F()) {
                            window.getDecorView().setSystemUiVisibility(5638);
                        }
                    }
                } else {
                    Activity activity = (Activity) this.f23715a.get();
                    if (activity != null) {
                        try {
                            activity.requestWindowFeature(1);
                            activity.getWindow().setFlags(1024, 1024);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if ((200 == intExtra && !"html".equals(interfaceC3295x.getMarkupType())) || ((202 == intExtra && !"htmlUrl".equals(interfaceC3295x.getMarkupType())) || (201 == intExtra && !"inmobiJson".equals(interfaceC3295x.getMarkupType())))) {
            InterfaceC3279w fullScreenEventsListener2 = interfaceC3295x.getFullScreenEventsListener();
            if (fullScreenEventsListener2 != null) {
                fullScreenEventsListener2.a();
            }
            b();
            return;
        }
        try {
            this.f23716b = interfaceC3295x;
            interfaceC3295x.setFullScreenActivityContext((Activity) this.f23715a.get());
            a();
            Activity activity2 = (Activity) this.f23715a.get();
            if (activity2 != null) {
                RelativeLayout relativeLayout = new RelativeLayout(activity2);
                relativeLayout.setId(65534);
                this.d = relativeLayout;
            }
            a(interfaceC3295x);
            P p2 = this.f23717c;
            if (p2 != null) {
                p2.f();
            }
            Activity activity3 = (Activity) this.f23715a.get();
            if (activity3 != null) {
                FrameLayout frameLayout = (FrameLayout) activity3.findViewById(R.id.content);
                RelativeLayout relativeLayout2 = frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null;
                RelativeLayout relativeLayout3 = this.d;
                if (relativeLayout3 != null && relativeLayout2 != null) {
                    RelativeLayout relativeLayout4 = (RelativeLayout) relativeLayout2.findViewById(65534);
                    if (relativeLayout4 != null) {
                        relativeLayout2.removeView(relativeLayout4);
                    }
                    relativeLayout2.addView(relativeLayout3);
                    P p3 = this.f23717c;
                    if (p3 != null) {
                        p3.e();
                    }
                }
            }
            if (interfaceC3295x instanceof GestureDetectorOnGestureListenerC3005ec) {
                ((GestureDetectorOnGestureListenerC3005ec) interfaceC3295x).setEmbeddedBrowserJsCallbacks(this.j);
            }
            if ((interfaceC3295x instanceof GestureDetectorOnGestureListenerC3005ec) && (y3 = this.f23718e) != null) {
                y3.setUserLeftApplicationListener(((GestureDetectorOnGestureListenerC3005ec) interfaceC3295x).getListener());
            }
        } catch (Exception e2) {
            interfaceC3295x.setFullScreenActivityContext(null);
            InterfaceC3279w fullScreenEventsListener3 = interfaceC3295x.getFullScreenEventsListener();
            if (fullScreenEventsListener3 != null) {
                fullScreenEventsListener3.a();
            }
            b();
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    public final void b() {
        Activity activity = (Activity) this.f23715a.get();
        if (activity instanceof InMobiAdActivity) {
            ((InMobiAdActivity) activity).finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b  */
    public final void c() {
        V3 v3D;
        Activity activity;
        if (this.f23718e == null) {
            return;
        }
        InterfaceC3295x interfaceC3295x = this.f23716b;
        if (interfaceC3295x == null) {
            v3D = U3.d();
        } else {
            if ((!(interfaceC3295x instanceof GestureDetectorOnGestureListenerC3005ec) ? false : ((GestureDetectorOnGestureListenerC3005ec) interfaceC3295x).S0) || ((activity = (Activity) this.f23715a.get()) != null && B2.a(activity))) {
                v3D = U3.h();
            } else {
                v3D = U3.d();
            }
        }
        float f = v3D.f23292a;
        float f2 = v3D.f23294c;
        float f3 = f * f2;
        float f4 = v3D.f23293b * f2;
        if (AbstractC3195qa.b(this.f)) {
            a(MathKt.b((1 - this.g) * f3), -1);
        } else {
            a(-1, MathKt.b((1 - this.g) * f4));
        }
    }

    public final void d() {
        try {
            Y3 y3 = this.f23718e;
            if (y3 != null) {
                ViewParent parent = y3.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(y3);
                }
                ViewParent parent2 = y3.getParent();
                ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup2 != null) {
                    viewGroup2.post(new RunnableC0883c(y3, 19));
                }
            }
            Y3 y4 = this.f23718e;
            if (y4 != null) {
                C3045h4 c3045h4 = y4.f23365c;
                if (c3045h4 != null) {
                    c3045h4.destroy();
                }
                y4.f23365c = null;
                y4.d = null;
                y4.f23366e = null;
                Df df = y4.g;
                if (df != null) {
                    df.a();
                }
                y4.removeAllViews();
            }
            this.f23718e = null;
            GestureDetectorOnGestureListenerC3005ec.Y0.getClass();
            a(Gb.a("IN_CUSTOM_EXPAND", "onClose"));
        } catch (Exception unused) {
        }
    }

    public final void a() {
        Activity activity = (Activity) this.f23715a.get();
        if (activity == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        if ((frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null) != null) {
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setId(65519);
        relativeLayout.setBackgroundColor(0);
        frameLayout.removeAllViews();
        frameLayout.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        r1 = new com.inmobi.media.V4(r4.f23715a, r5, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.inmobi.media.InterfaceC3295x r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.f23715a
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto Lb
            goto Lf
        Lb:
            android.widget.RelativeLayout r0 = r4.d
            if (r0 != 0) goto L10
        Lf:
            return
        L10:
            java.lang.String r1 = r5.getMarkupType()
            int r2 = r1.hashCode()
            r3 = -1084172778(0xffffffffbf60d616, float:-0.8782667)
            if (r2 == r3) goto L40
            r3 = 3213227(0x3107ab, float:4.50269E-39)
            if (r2 == r3) goto L30
            r3 = 1236050372(0x49aca1c4, float:1414200.5)
            if (r2 != r3) goto L67
            java.lang.String r2 = "htmlUrl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L67
            goto L38
        L30:
            java.lang.String r2 = "html"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L67
        L38:
            com.inmobi.media.V4 r1 = new com.inmobi.media.V4
            java.lang.ref.WeakReference r2 = r4.f23715a
            r1.<init>(r2, r5, r0)
            goto L4f
        L40:
            java.lang.String r2 = "inmobiJson"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L67
            com.inmobi.media.z6 r1 = new com.inmobi.media.z6
            java.lang.ref.WeakReference r2 = r4.f23715a
            r1.<init>(r2, r5, r0)
        L4f:
            r4.f23717c = r1
            com.inmobi.media.pa r0 = r4.f
            r1.a(r0)
            float r0 = r4.g
            r1.f23057c = r0
            boolean r0 = r5 instanceof com.inmobi.media.GestureDetectorOnGestureListenerC3005ec
            if (r0 != 0) goto L60
            r5 = 0
            goto L64
        L60:
            com.inmobi.media.ec r5 = (com.inmobi.media.GestureDetectorOnGestureListenerC3005ec) r5
            boolean r5 = r5.S0
        L64:
            r1.d = r5
            return
        L67:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "InMobiActivityViewHandler: Unknown Markup type"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3078j5.a(com.inmobi.media.x):void");
    }

    public final void a(JSONObject jsonObject) {
        Intrinsics.f(jsonObject, "jsonObject");
        InterfaceC3295x interfaceC3295x = this.f23716b;
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = interfaceC3295x instanceof GestureDetectorOnGestureListenerC3005ec ? (GestureDetectorOnGestureListenerC3005ec) interfaceC3295x : null;
        if (gestureDetectorOnGestureListenerC3005ec != null) {
            gestureDetectorOnGestureListenerC3005ec.a(jsonObject);
        }
    }

    @Override // com.inmobi.media.InterfaceC3226sa
    public final void a(EnumC3179pa orientation) {
        Intrinsics.f(orientation, "orientation");
        if (((Activity) this.f23715a.get()) == null) {
            return;
        }
        P p2 = this.f23717c;
        if (p2 != null) {
            p2.a(orientation);
        }
        EnumC3179pa enumC3179pa = this.f;
        if (enumC3179pa != orientation && AbstractC3195qa.b(enumC3179pa) != AbstractC3195qa.b(orientation)) {
            Objects.toString(orientation);
            this.f = orientation;
            P p3 = this.f23717c;
            if (p3 != null) {
                p3.e();
            }
            c();
            return;
        }
        Objects.toString(orientation);
        this.f = orientation;
    }

    public static final void a(C3078j5 c3078j5) {
        c3078j5.g = 1.0f;
        P p2 = c3078j5.f23717c;
        if (p2 != null) {
            p2.f23057c = 1.0f;
            p2.e();
        }
        Y3 y3 = c3078j5.f23718e;
        if (y3 != null) {
            y3.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        }
        c3078j5.d();
    }

    public static final void a(Y3 this_run) {
        Intrinsics.f(this_run, "$this_run");
        this_run.getParent().requestLayout();
    }

    public final void a(int i2, int i3) {
        RelativeLayout.LayoutParams layoutParamsF;
        Activity activity = (Activity) this.f23715a.get();
        if (activity == null) {
            return;
        }
        AbstractC3195qa.b(this.f);
        if (AbstractC3195qa.b(this.f)) {
            layoutParamsF = androidx.media3.extractor.text.ttml.a.f(i2, i3, 11);
        } else {
            layoutParamsF = androidx.media3.extractor.text.ttml.a.f(i2, i3, 12);
        }
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) activity.findViewById(R.id.content)).findViewById(65519);
        Intrinsics.c(relativeLayout);
        if (((RelativeLayout) relativeLayout.findViewById(65518)) != null) {
            Y3 y3 = this.f23718e;
            if (y3 == null) {
                return;
            }
            y3.setLayoutParams(layoutParamsF);
            return;
        }
        Y3 y4 = this.f23718e;
        if (y4 != null) {
            relativeLayout.addView(y4, layoutParamsF);
        }
    }
}
