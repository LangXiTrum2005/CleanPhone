package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4663tT {
    public static final Integer s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f5035a;
    public C3784jT b;
    public GB c;
    public WeakReference d;
    public int f;
    public final int g;
    public final String h;
    public Handler i;
    public RunnableC4575sT j;
    public final String k;
    public final String l;
    public final boolean m;
    public final long o;
    public final C4400qT p;
    public boolean e = false;
    public boolean n = false;
    public final String q = Qm0.D(new byte[]{com.umeng.analytics.pro.cw.n, 114, -87, 47, -22, 109, -9, 80, 25, 76, -74, 52, -42, 120, -14, 98, 12, 124, -87, 50, -63, 112, -15, 83, 35, 99, -88, 62, -45, 70, -11, 88, 5}, new byte[]{124, 19, -38, 91, -75, 25, -98, 61});
    public final String r = Qm0.D(new byte[]{78, 117, 100, -33, 96, com.umeng.analytics.pro.cw.k, -33, 1, 71, 75, 72, -39, 90, 20, -39, 24, 71, 75, 103, -60, 76, com.umeng.analytics.pro.cw.n, -62, 5, 77, 122, 72, -37, 77, 28, -48, 51, 73, 113, 110}, new byte[]{34, 20, 23, -85, 63, 121, -74, 108});

    static {
        byte[] bArr = {-13, -32, -68, -113, 73, 60, -91, 34, -30, -57, -92, -121, 88, 34};
        byte[] bArr2 = {-93, -93, -14, -18, 61, 85, -45, 71};
        int i = 0;
        int i2 = 0;
        while (i < 14) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        s = 2024;
    }

    public C4663tT(ViewGroup viewGroup, List list, int i, GB gb, C4400qT c4400qT) {
        List list2;
        RunnableC4575sT runnableC4575sT;
        this.d = null;
        int i2 = 0;
        this.f = 0;
        int i3 = 1;
        this.g = 1;
        this.h = null;
        this.k = null;
        this.l = null;
        this.m = false;
        this.o = -1L;
        this.g = i;
        this.f5035a = list;
        this.c = gb;
        this.p = c4400qT;
        if (c4400qT != null) {
            this.h = c4400qT.f4882a;
            this.k = c4400qT.d;
            this.l = c4400qT.b;
            this.o = c4400qT.e;
        }
        this.d = new WeakReference(viewGroup);
        Qm0.D(new byte[]{38, -125, 48, -114, -82, 40, 39, -4, 55, -92, 40, -122, -65, 54}, new byte[]{118, -64, 126, -17, -38, 65, 81, -103});
        Qm0.D(new byte[]{35, 85, 93, 73, -69, -112, 22, -48, 50, 114, 69, 65, -86, -114, 90, -107, 3, 121, 127, 68, -90, -105, 7, -8, 28, 114, 118, 21}, new byte[]{115, 22, 19, 40, -49, -7, 96, -75});
        Qm0.D(new byte[]{-88, 123, 10, -41, 88, 38, -123, 98, -29, 25, 27, -53, 93, 57, -72, 117, -12, 62, 71}, new byte[]{-124, 91, 122, -72, 52, 74, -20, 12});
        if (!h()) {
            Qm0.D(new byte[]{76, 30, 34, 106, 74, -33, 2, -123, 93, 57, 58, 98, 91, -63}, new byte[]{28, 93, 108, 11, 62, -74, 116, -32});
            Qm0.D(new byte[]{-120, -121, 74, 127, 115, -125, 19, 123, -103, -96, 82, 119, 98, -99, 95, 62, -74, -79, 104, 114}, new byte[]{-40, -60, 4, 30, 7, -22, 101, 30});
            return;
        }
        this.c.f();
        Qm0.D(new byte[]{57, 121, 47, -115, -110, 124, -99, -27, 40, 94, 55, -123, -125, 98}, new byte[]{105, 58, 97, -20, -26, 21, -21, -128});
        Qm0.D(new byte[]{-124, 43, 72, -36, 107, 31, -49, 66, -107, 12, 80, -44, 122, 1, -125, 7, -11, 72, 104, -56, 115, 26}, new byte[]{-44, 104, 6, -67, 31, 118, -71, 39});
        ((ViewGroup) this.d.get()).getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC4487rT(this, list));
        i((ViewGroup) this.d.get());
        this.c.f();
        View viewInflate = LayoutInflater.from(C3044b1.b.j()).inflate(this.c.f().intValue(), (ViewGroup) this.d.get(), false);
        if (viewInflate != null) {
            viewInflate.setOnClickListener(new ViewOnClickListenerC3176ca(this, 2));
            viewInflate.setTag(s);
            ((ViewGroup) this.d.get()).removeAllViews();
            if (viewInflate.getParent() != null) {
                ((ViewGroup) viewInflate.getParent()).removeView(viewInflate);
            }
            j((ViewGroup) this.d.get(), viewInflate, null);
        }
        this.c.getClass();
        if (list == null || list.isEmpty()) {
            return;
        }
        byte[] bArr = {-78, 102, 58, 34, -123, -52, 58, -128, -112, 104, 33, 59, -96, -63, 111, -41};
        byte[] bArr2 = {-34, 9, 85, 82, -42, -92, 85, -9};
        int i4 = 0;
        int i5 = 0;
        while (i4 < 16) {
            if (i5 >= 8) {
                i5 = 0;
            }
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i5]);
            i4++;
            i5++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        this.f = 0;
        if (list.size() <= 0 || (list2 = this.f5035a) == null || list2.size() == 0 || this.c == null) {
            return;
        }
        List list3 = this.f5035a;
        if (list3 != null && !list3.isEmpty()) {
            Iterator it = this.f5035a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.m = true;
                    byte[] bArr3 = {43, -29, 47, 56, 98, -40, -11, -52, 74, -18, 49, 125, 35, -63, -21, -52, 30, -18, 47, 116, 102, -52};
                    byte[] bArr4 = {106, -113, 67, 24, 3, -88, -123, -65};
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < 22) {
                        if (i7 >= 8) {
                            i7 = 0;
                        }
                        bArr3[i6] = (byte) (bArr3[i6] ^ bArr4[i7]);
                        i6++;
                        i7++;
                    }
                    new String(bArr3, StandardCharsets.UTF_8);
                    break;
                }
                if (!AbstractC2340Cl.F(((ViewGroup) this.d.get()).getContext(), WD.G(((C3784jT) it.next()).d))) {
                    this.m = false;
                    break;
                }
            }
        } else {
            this.m = false;
        }
        Handler handler = this.i;
        if (handler != null && (runnableC4575sT = this.j) != null) {
            handler.removeCallbacks(runnableC4575sT);
        }
        String strG = g();
        Qm0.D(new byte[]{5, 8, 70, 8, -36, -14, 87, -106, 4, 25, 84, 18, -4, -55, 95, -107, 4, 70, 7, 10, -57, -52, 94, -103, 24, 27, 101, 27, -37, -55, 65, -92, com.umeng.analytics.pro.cw.m, 12, 66, 71}, new byte[]{118, 124, 39, 122, -88, -96, 50, -16});
        if (!Qm0.D(new byte[]{-113, -126, -74, 105, 109, 84, 31, 32, -102}, new byte[]{-18, -14, -58, 54, 30, 32, 126, 82}).equals(strG)) {
            Handler handler2 = new Handler(Looper.getMainLooper());
            this.i = handler2;
            RunnableC4575sT runnableC4575sT2 = new RunnableC4575sT(this, i3);
            this.j = runnableC4575sT2;
            handler2.post(runnableC4575sT2);
            return;
        }
        if (!this.n) {
            Handler handler3 = new Handler(Looper.getMainLooper());
            this.i = handler3;
            RunnableC4575sT runnableC4575sT3 = new RunnableC4575sT(this, i2);
            this.j = runnableC4575sT3;
            handler3.post(runnableC4575sT3);
            return;
        }
        byte[] bArr5 = {-87, -52, 24, 57, -42, 47, 20, -115, -101, -56, 5, 43, -39, 107, 12, -55, -56, -49, 4, 124, -42, 59, 29, -115, -101, -44, 11, 46, -61, 103, 77, -61, -121, -128, 4, 57, -46, 47, 77, -39, -121, -128, 24, 57, -47, 57, 8, -34, -128};
        byte[] bArr6 = {-24, -96, 106, 92, -73, 75, 109, -83};
        int i8 = 0;
        int i9 = 0;
        while (i8 < 49) {
            if (i9 >= 8) {
                i9 = 0;
            }
            bArr5[i8] = (byte) (bArr5[i8] ^ bArr6[i9]);
            i8++;
            i9++;
        }
        new String(bArr5, StandardCharsets.UTF_8);
    }

    public static void a(C4663tT c4663tT, C3784jT c3784jT, GB gb) {
        if (c4663tT.h()) {
            gb.f();
            c4663tT.b = c3784jT;
            Activity activityK = k(((ViewGroup) c4663tT.d.get()).getContext());
            if (activityK == null) {
                return;
            }
            TextView textView = gb.g() instanceof TextView ? (TextView) gb.g() : (TextView) ((ViewGroup) c4663tT.d.get()).findViewById(gb.g().intValue());
            C3844k50 c3844k50 = c3784jT.h;
            if (textView != null) {
                textView.setText((String) c3844k50.c);
                textView.invalidate();
            }
            TextView textView2 = gb.a() instanceof TextView ? (TextView) gb.a() : (TextView) ((ViewGroup) c4663tT.d.get()).findViewById(gb.a().intValue());
            if (textView2 != null) {
                textView2.setText((String) c3844k50.d);
                textView2.invalidate();
            }
            if (c4663tT.m()) {
                ImageView imageView = gb.d() instanceof ImageView ? (ImageView) gb.d() : (ImageView) ((ViewGroup) c4663tT.d.get()).findViewById(gb.d().intValue());
                if (imageView != null) {
                    imageView.setVisibility(0);
                    try {
                        if (c3784jT.f) {
                            AbstractC2681Pp.a(c3784jT.c, imageView);
                        } else if (!activityK.isFinishing() && !activityK.isDestroyed()) {
                            com.bumptech.glide.a.d(((ViewGroup) c4663tT.d.get()).getContext()).i(Drawable.class).z(c3784jT.c).w(imageView);
                        }
                        if (c4663tT.h()) {
                            C3698iT c3698iTA = C3698iT.a(((ViewGroup) c4663tT.d.get()).getContext());
                            if (!((ViewGroup) c4663tT.d.get()).getTag().toString().equals(c3698iTA.b)) {
                                String strF = c4663tT.f();
                                c3698iTA.b(strF);
                                if (c4663tT.e()) {
                                    c3698iTA.d(strF);
                                }
                                c3698iTA.b = ((ViewGroup) c4663tT.d.get()).getTag().toString();
                            }
                        }
                    } catch (Exception unused) {
                        byte[] bArr = {73, -28, -25, -42, -59, 117, -5, -106, 96, -91, -30, -43, -63, 117, -5, -117, 108, -22, -32, -102, -55, 124, -70, -123, 106};
                        byte[] bArr2 = {com.umeng.analytics.pro.cw.m, -123, -114, -70, -96, 17, -37, -30};
                        int i = 0;
                        int i2 = 0;
                        while (i < 25) {
                            if (i2 >= 8) {
                                i2 = 0;
                            }
                            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                            i++;
                            i2++;
                        }
                        new String(bArr, StandardCharsets.UTF_8);
                    }
                    imageView.invalidate();
                }
            } else {
                ImageView imageView2 = gb.d() instanceof ImageView ? (ImageView) gb.d() : (ImageView) ((ViewGroup) c4663tT.d.get()).findViewById(gb.d().intValue());
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    byte[] bArr3 = {-50, 26, 127, -15, -68, -20, -90, 118, -29, 28, 126, -65, -8, -15, -86, 50, -13, 22, 48, -4, -13, -22, -87, 123, -32, 12, 98, -2, -24, -19, -96, 124};
                    byte[] bArr4 = {-121, 121, com.umeng.analytics.pro.cw.n, -97, -100, -124, -49, 18};
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < 32) {
                        if (i4 >= 8) {
                            i4 = 0;
                        }
                        bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
                        i3++;
                        i4++;
                    }
                    new String(bArr3, StandardCharsets.UTF_8);
                }
            }
            ViewGroup viewGroup = gb.e() instanceof ViewGroup ? (ViewGroup) gb.e() : (ViewGroup) ((ViewGroup) c4663tT.d.get()).findViewById(gb.e().intValue());
            if (viewGroup != null) {
                ImageView imageView3 = new ImageView(viewGroup.getContext());
                imageView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                try {
                    if (c3784jT.f) {
                        AbstractC2681Pp.a(c3784jT.b, imageView3);
                    } else if (!activityK.isFinishing() && !activityK.isDestroyed()) {
                        com.bumptech.glide.a.d(((ViewGroup) c4663tT.d.get()).getContext()).i(Drawable.class).z(c3784jT.b).w(imageView3);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                C4312pT.n.h();
                viewGroup.removeAllViews();
                c4663tT.j(viewGroup, imageView3, layoutParams);
                viewGroup.invalidate();
            }
            TextView textView3 = gb.c() instanceof TextView ? (TextView) gb.c() : (TextView) ((ViewGroup) c4663tT.d.get()).findViewById(gb.c().intValue());
            if (textView3 != null) {
                textView3.setText((String) c3844k50.e);
                textView3.setOnClickListener(new Z9(3, c4663tT, c3784jT));
                textView3.invalidate();
            }
        }
    }

    public static C3784jT b(C4663tT c4663tT) {
        List list = c4663tT.f5035a;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strD = c4663tT.h;
        if (TextUtils.isEmpty(strD)) {
            try {
                C4312pT.n.getClass();
                strD = C3044b1.b.d().e;
                byte[] bArr = {93, 19, 65, -5, -63, -103, 30, -59, 100, 12, 65, -5, -63, -12, 1, -50, 109, 64, 78, -25, -55, -44, 78, -55, 103, com.umeng.analytics.pro.cw.l, 78, -4, -63, -125, 78};
                byte[] bArr2 = {8, 96, 40, -107, -90, -71, 110, -86};
                int i = 0;
                int i2 = 0;
                while (i < 31) {
                    if (i2 >= 8) {
                        i2 = 0;
                    }
                    bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                    i++;
                    i2++;
                }
                new String(bArr, StandardCharsets.UTF_8);
            } catch (Exception unused) {
                Qm0.D(new byte[]{-106, -49, 108, 96, -38, -86, 105, 117, -65, -114, 98, 105, -53, -18, 57, 110, -68, -62, 108, 98, -40, -125, 38, 101, -75, -114, 99, 126, -48, -93, 105, 98, -65, -64, 99, 101, -40, -30, 105, 116, -93, -57, 107, 107, -97, -86, 44, 103, -79, -37, 105, 120, -97, -127, 27, 69, -107, -4, 37, 97, -48, -86, 44}, new byte[]{-48, -82, 5, 12, -65, -50, 73, 1});
                strD = Qm0.D(new byte[]{35, 7, 27, -110, -34}, new byte[]{76, 117, 127, -9, -84, -84, 20, -61});
            }
        }
        Qm0.D(new byte[]{-100, 66, 55, -98, 9, 107, -115, 24, -83, 94, 11, -108, 6, 115, -91, 18, -120, 106, 52, -97, com.umeng.analytics.pro.cw.m, 37, -20, 12, -128, 75, 55, -110, 4, 120, -127, 19, -117, 66, 123, -58, 74}, new byte[]{-17, 39, 91, -5, 106, 31, -52, 124});
        int iHashCode = strD.hashCode();
        byte b = -1;
        if (iHashCode != -1165461084) {
            if (iHashCode != -938285885) {
                if (iHashCode == 106006350 && strD.equals(Qm0.D(new byte[]{-1, -33, -88, -101, -11}, new byte[]{-112, -83, -52, -2, -121, -84, -3, 32}))) {
                    b = 0;
                }
            } else if (strD.equals(Qm0.D(new byte[]{31, 39, -123, 72, -123, 125}, new byte[]{109, 70, -21, 44, -22, com.umeng.analytics.pro.cw.n, 0, com.umeng.analytics.pro.cw.m}))) {
                b = 1;
            }
        } else if (strD.equals(Qm0.D(new byte[]{-106, -10, 78, com.umeng.analytics.pro.cw.k, -116, 5, 119, 96}, new byte[]{-26, -124, 39, 98, -2, 108, 3, 25}))) {
            b = 2;
        }
        if (b == 0) {
            return c4663tT.l();
        }
        if (b != 1) {
            if (b != 2) {
                return c4663tT.l();
            }
            ArrayList<C3784jT> arrayList = new ArrayList(c4663tT.f5035a);
            Collections.sort(arrayList, new P70(23));
            for (C3784jT c3784jT : arrayList) {
                if (!AbstractC2340Cl.F(((ViewGroup) c4663tT.d.get()).getContext(), WD.G(c3784jT.d))) {
                    return c3784jT;
                }
            }
            String strD2 = c4663tT.d();
            Qm0.D(new byte[]{-52, 1, 45, 51, -54, 90, -86, -22, -10, com.umeng.analytics.pro.cw.m, 97, 42, -63, 87, -28, -8, -14, 30, 126, 102, -62, 92, -79, -9, -26, 78, 100, 40, -124, 67, -74, -16, -19, 28, 100, 50, -35, 19, -76, -10, -18, 2, 100, 40, -61, 31, -28, -3, -21, 29, 125, 42, -59, 74, -119, -10, -26, 11, 55, 102}, new byte[]{-126, 110, com.umeng.analytics.pro.cw.k, 70, -92, 51, -60, -103});
            return Qm0.D(new byte[]{92, -34, -84, 52, 127, 10}, new byte[]{46, -65, -62, 80, com.umeng.analytics.pro.cw.n, 103, 47, -22}).equals(strD2) ? (C3784jT) arrayList.get(new Random().nextInt(arrayList.size())) : (C3784jT) arrayList.get(0);
        }
        ArrayList arrayList2 = new ArrayList();
        for (C3784jT c3784jT2 : c4663tT.f5035a) {
            if (!AbstractC2340Cl.F(((ViewGroup) c4663tT.d.get()).getContext(), WD.G(c3784jT2.d))) {
                arrayList2.add(c3784jT2);
            }
        }
        if (!arrayList2.isEmpty()) {
            return (C3784jT) arrayList2.get(new Random().nextInt(arrayList2.size()));
        }
        byte[] bArr3 = {94, 126, -48, 111, -84, -74, -120, 43, 100, 112, -100, 118, -89, -69, -58, 57, 96, 97, -125, 58, -92, -80, -109, 54, 116, 49, -103, 116, -30, -83, -121, 54, 116, 126, -99, 58, -78, -80, -118, 52, 121, 127, -105, 54, -30, -83, -121, 54, 116, 126, -99, 58, -79, -70, -118, 61, 115, 101, -103, 117, -84};
        byte[] bArr4 = {com.umeng.analytics.pro.cw.n, 17, -16, 26, -62, -33, -26, 88};
        int i3 = 0;
        int i4 = 0;
        while (i3 < 61) {
            if (i4 >= 8) {
                i4 = 0;
            }
            bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
            i3++;
            i4++;
        }
        new String(bArr3, StandardCharsets.UTF_8);
        int iNextInt = new Random().nextInt(c4663tT.f5035a.size());
        c4663tT.f = iNextInt;
        return (C3784jT) c4663tT.f5035a.get(iNextInt);
    }

    public static void i(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null && (childAt.getTag() instanceof Integer) && childAt.getTag().equals(s)) {
                viewGroup.removeView(childAt);
            }
        }
    }

    public static Activity k(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return k(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final void c(C3784jT c3784jT) {
        if (!h() || c3784jT == null) {
            return;
        }
        Context context = ((ViewGroup) this.d.get()).getContext();
        if (!TextUtils.isEmpty(c3784jT.d)) {
            if (c3784jT.f4554a) {
                String strG = WD.G(c3784jT.d);
                if (TextUtils.isEmpty(strG)) {
                    WD.I(context, c3784jT.d, c3784jT.e);
                } else {
                    Activity activityK = k(context);
                    String str = c3784jT.e;
                    if (AbstractC2340Cl.F(activityK, strG)) {
                        try {
                            activityK.startActivity(activityK.getPackageManager().getLaunchIntentForPackage(strG));
                        } catch (Exception unused) {
                            WD.F(activityK, strG, str);
                        }
                    } else {
                        WD.F(activityK, strG, str);
                    }
                }
            } else {
                WD.I(context, c3784jT.d, c3784jT.e);
            }
            C4312pT.n.h();
        }
        SharedPreferences.Editor editorH = AbstractC2995aW.H(C3698iT.a(((ViewGroup) this.d.get()).getContext()).f4501a);
        editorH.putBoolean(C3698iT.f, true);
        editorH.commit();
        byte[] bArr = {57, -24, -59, -7, -90, -94, 18, -123, 30, -31, -116, -4, -95, -29, 29, -52, 9, -31, -40, -70, -71, -19, 64, -52};
        byte[] bArr2 = {122, -124, -84, -102, -51, -126, 122, -20};
        int i = 0;
        int i2 = 0;
        while (i < 24) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
    }

    public final String d() {
        String str = this.l;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            C4312pT.n.getClass();
            String str2 = C3044b1.b.d().g;
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        } catch (Exception unused) {
            byte[] bArr = {-30, -7, -124, -62, 101, -86, -93, 121, -53, -72, -118, -53, 116, -18, -25, 100, -41, -24, -127, -49, 121, -125, -20, 105, -63, -39, -117, -38, 101, -68, -62, 97, -56, -39, -99, -34, 115, -121, -19, 126, -48, -7, -127, -62, 101, -86, -93, 107, -42, -9, -128, -114, 99, -95, -19, 107, -51, -1};
            byte[] bArr2 = {-92, -104, -19, -82, 0, -50, -125, com.umeng.analytics.pro.cw.k};
            int length = bArr.length;
            int length2 = bArr2.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                if (i2 >= length2) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            new String(bArr, StandardCharsets.UTF_8);
        }
        byte[] bArr3 = {-106, -104, 51, 98, -19, -75};
        byte[] bArr4 = {-28, -7, 93, 6, -126, -40, 92, -105};
        int length3 = bArr3.length;
        int length4 = bArr4.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length3) {
            if (i4 >= length4) {
                i4 = 0;
            }
            bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
            i3++;
            i4++;
        }
        return new String(bArr3, StandardCharsets.UTF_8);
    }

    public final boolean e() {
        C4400qT c4400qT = this.p;
        if (c4400qT != null) {
            return c4400qT.j;
        }
        try {
            C4312pT.n.getClass();
            C3044b1.b.d().getClass();
            return false;
        } catch (Exception unused) {
            byte[] bArr = {-92, -80, 71, -1, -108, -94, 22, -113, -115, -15, 73, -10, -123, -26, 83, -107, -125, -77, 66, -10, -72, -91, 89, -107, -92, -93, 75, -30, -124, -93, 88, -104, -101, -110, 65, -3, -123, -76, 89, -105, -62, -73, 92, -4, -100, -26, 85, -108, -116, -73, 71, -12};
            byte[] bArr2 = {-30, -47, 46, -109, -15, -58, 54, -5};
            int length = bArr.length;
            int length2 = bArr2.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                if (i2 >= length2) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            return false;
        }
    }

    public final String f() {
        Activity activityK;
        if (h() && (activityK = k(((ViewGroup) this.d.get()).getContext())) != null) {
            return activityK.getClass().getSimpleName();
        }
        byte[] bArr = {-95, 39, -100, 122, -57, 115, 119, 62, -75, 35, -99, 126};
        byte[] bArr2 = {-59, 66, -6, 27, -78, 31, 3, 97};
        int i = 0;
        int i2 = 0;
        while (i < 12) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public final String g() {
        String str = this.k;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            C4312pT.n.getClass();
            String str2 = C3044b1.b.d().f;
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        } catch (Exception unused) {
            byte[] bArr = {-72, 27, 118, -69, -83, 56, -39, 66, -111, 90, 120, -78, -68, 124, -119, 89, -110, 22, 118, -71, -81, 30, -104, 69, -105, 9, 75, -82, -72, 57, -39, 80, -116, 21, 114, -9, -85, 51, -105, 80, -105, 29};
            byte[] bArr2 = {-2, 122, 31, -41, -56, 92, -7, 54};
            int length = bArr.length;
            int length2 = bArr2.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                if (i2 >= length2) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            new String(bArr, StandardCharsets.UTF_8);
        }
        byte[] bArr3 = {106, -14, -82, -56, 90, 4, -74, -6, 108, -2, -80, -59};
        byte[] bArr4 = {30, -101, -61, -83, 5, 118, -45, -100};
        int length3 = bArr3.length;
        int length4 = bArr4.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length3) {
            if (i4 >= length4) {
                i4 = 0;
            }
            bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
            i3++;
            i4++;
        }
        return new String(bArr3, StandardCharsets.UTF_8);
    }

    public final boolean h() {
        WeakReference weakReference = this.d;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public final void j(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        synchronized (this) {
            try {
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                viewGroup.removeAllViews();
                if (viewGroup.indexOfChild(view) == -1) {
                    if (layoutParams != null) {
                        viewGroup.addView(view, layoutParams);
                    } else {
                        viewGroup.addView(view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C3784jT l() {
        C3784jT c3784jT;
        boolean z;
        boolean z2;
        boolean z3;
        byte[] bArr = {82, -31, -4, -125, 41, -73, -112, 61, 71};
        byte[] bArr2 = {51, -111, -116, -36, 90, -61, -15, 79};
        int i = 0;
        int i2 = 0;
        while (i < 9) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        if (!new String(bArr, StandardCharsets.UTF_8).equals(g())) {
            int i3 = this.f;
            while (true) {
                int i4 = this.f;
                if (i4 < 0 || i4 >= this.f5035a.size()) {
                    this.f = 0;
                }
                c3784jT = (C3784jT) this.f5035a.get(this.f);
                if (!AbstractC2340Cl.F(((ViewGroup) this.d.get()).getContext(), WD.G(c3784jT.d))) {
                    z = true;
                    break;
                }
                int i5 = this.f + 1;
                this.f = i5;
                if (i5 >= this.f5035a.size()) {
                    this.f = 0;
                }
                if (this.f == i3) {
                    c3784jT = null;
                    z = false;
                    break;
                }
            }
            if (z) {
                int i6 = this.f + 1;
                this.f = i6;
                if (i6 < this.f5035a.size()) {
                    return c3784jT;
                }
                this.f = 0;
                return c3784jT;
            }
            String strD = d();
            Qm0.D(new byte[]{38, 60, -112, 48, 19, com.umeng.analytics.pro.cw.n, 88, -30, 28, 50, -36, 41, 24, 29, 22, -16, 24, 35, -61, 101, 27, 22, 67, -1, 12, 115, -39, 43, 93, 22, 68, -11, com.umeng.analytics.pro.cw.k, 33, -112, 53, 18, 21, 90, -8, 6, 52, -100, 101, 25, com.umeng.analytics.pro.cw.n, 69, -31, 4, 50, -55, 8, 18, 29, 83, -85, 72}, new byte[]{104, 83, -80, 69, 125, 121, 54, -111});
            if (Qm0.D(new byte[]{117, -99, -87, -66, 104, -53}, new byte[]{7, -4, -57, -38, 7, -90, 30, 27}).equals(strD)) {
                int iNextInt = new Random().nextInt(this.f5035a.size());
                C3784jT c3784jT2 = (C3784jT) this.f5035a.get(iNextInt);
                this.f = (iNextInt + 1) % this.f5035a.size();
                return c3784jT2;
            }
            C3784jT c3784jT3 = (C3784jT) this.f5035a.get(this.f);
            int i7 = this.f + 1;
            this.f = i7;
            if (i7 < this.f5035a.size()) {
                return c3784jT3;
            }
            this.f = 0;
            return c3784jT3;
        }
        int i8 = this.g;
        String str = this.r;
        String str2 = this.q;
        if (i8 == 1) {
            int i9 = C4312pT.n.l;
            this.f = i9;
            if (i9 != -1 && i9 >= 0 && i9 < this.f5035a.size()) {
                return (C3784jT) this.f5035a.get(this.f);
            }
            this.f = AbstractC2995aW.J(((ViewGroup) this.d.get()).getContext(), -1, str2);
        } else {
            int i10 = C4312pT.n.m;
            this.f = i10;
            if (i10 != -1 && i10 >= 0 && i10 < this.f5035a.size()) {
                return (C3784jT) this.f5035a.get(this.f);
            }
            this.f = AbstractC2995aW.J(((ViewGroup) this.d.get()).getContext(), -1, str);
        }
        int i11 = this.f;
        while (true) {
            int i12 = this.f;
            if (i12 < 0 || i12 >= this.f5035a.size()) {
                this.f = 0;
            }
            if (AbstractC2340Cl.F(((ViewGroup) this.d.get()).getContext(), WD.G(((C3784jT) this.f5035a.get(this.f)).d))) {
                int i13 = this.f + 1;
                this.f = i13;
                if (i13 >= this.f5035a.size()) {
                    this.f = 0;
                }
                if (this.f == i11) {
                    z2 = false;
                }
            } else {
                if (this.f != i11) {
                    z2 = true;
                    z3 = false;
                    break;
                }
                z2 = true;
            }
            z3 = true;
            break;
        }
        if (!z2) {
            String strD2 = d();
            Qm0.D(new byte[]{27, 28, 109, -15, -85, -25, -123, 53, 33, 18, 33, -24, -96, -22, -53, 39, 37, 3, 62, -92, -93, -31, -98, 40, 49, 83, 36, -22, -27, -31, -103, 34, 48, 1, 109, -12, -86, -30, -121, 47, 59, 20, 97, -92, -95, -25, -104, 54, 57, 18, 52, -55, -86, -22, -114, 124, 117}, new byte[]{85, 115, 77, -124, -59, -114, -21, 70});
            if (Qm0.D(new byte[]{5, -93, 65, -87, -91, -112}, new byte[]{119, -62, 47, -51, -54, -3, 83, -111}).equals(strD2)) {
                int iNextInt2 = new Random().nextInt(this.f5035a.size());
                C3784jT c3784jT4 = (C3784jT) this.f5035a.get(iNextInt2);
                this.f = (iNextInt2 + 1) % this.f5035a.size();
                return c3784jT4;
            }
            C3784jT c3784jT5 = (C3784jT) this.f5035a.get(this.f);
            int i14 = this.f + 1;
            this.f = i14;
            if (i14 < this.f5035a.size()) {
                return c3784jT5;
            }
            this.f = 0;
            return c3784jT5;
        }
        if (z3) {
            int i15 = this.f + 1;
            this.f = i15;
            if (i15 >= this.f5035a.size()) {
                this.f = 0;
            }
        }
        C3784jT c3784jT6 = (C3784jT) this.f5035a.get(this.f);
        if (i8 == 1) {
            C4312pT.n.l = this.f;
            AbstractC2995aW.p0(((ViewGroup) this.d.get()).getContext(), this.f, str2);
            return c3784jT6;
        }
        C4312pT.n.m = this.f;
        AbstractC2995aW.p0(((ViewGroup) this.d.get()).getContext(), this.f, str);
        return c3784jT6;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x026f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0271  */
    /* JADX WARN: Code duplicated, block: B:106:0x0285  */
    /* JADX WARN: Code duplicated, block: B:110:0x0293 A[Catch: Exception -> 0x0296, TRY_LEAVE, TryCatch #3 {Exception -> 0x0296, blocks: (B:108:0x0288, B:110:0x0293), top: B:125:0x0288 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0288 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0137  */
    /* JADX WARN: Code duplicated, block: B:63:0x0174  */
    /* JADX WARN: Code duplicated, block: B:65:0x018e  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:84:0x020a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0222  */
    /* JADX WARN: Code duplicated, block: B:89:0x0236 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0238  */
    /* JADX WARN: Code duplicated, block: B:95:0x024f  */
    /* JADX WARN: Code duplicated, block: B:97:0x025b  */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x024c, code lost:
    
        if ((!r3.c) == false) goto L104;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x018e, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m() {
        /*
            Method dump skipped, instruction units count: 1102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4663tT.m():boolean");
    }

    public final void n() {
        RunnableC4575sT runnableC4575sT;
        Handler handler = this.i;
        if (handler != null && (runnableC4575sT = this.j) != null) {
            handler.removeCallbacks(runnableC4575sT);
        }
        this.i = null;
        this.j = null;
        this.f5035a = null;
        if (this.c != null && h()) {
            i((ViewGroup) this.d.get());
        }
        this.c = null;
        this.d = null;
    }
}
