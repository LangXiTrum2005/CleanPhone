package sg.bigo.ads.ad.b;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAdView;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.adview.h;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f45407a = 1662622472;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f45408b = 5;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0783a {
        boolean a();
    }

    public static List<View> b(List<View> list) {
        int iIntValue;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (View view : list) {
                if (view != null) {
                    Object tag = view.getTag();
                    if ((tag instanceof Integer) && ((iIntValue = ((Integer) tag).intValue()) == 7 || iIntValue == 2 || iIntValue == 6 || iIntValue == 10 || iIntValue == 26 || iIntValue == 8 || iIntValue == 5 || iIntValue == 9)) {
                        arrayList.add(view);
                    }
                }
            }
        }
        return arrayList;
    }

    private static void b(final View view, final View view2, final int i2, final h hVar, final InterfaceC0783a interfaceC0783a) {
        final int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        final int[] iArr = {0, 0};
        final boolean[] zArr = {true};
        a(view, view2, new View.OnTouchListener() { // from class: sg.bigo.ads.ad.b.a.4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                boolean z2;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    int[] iArr2 = iArr;
                    iArr2[0] = x;
                    iArr2[1] = y;
                    zArr[0] = true;
                    if (view3 instanceof MediaView) {
                        ((MediaView) view3).a(x, y);
                        int unused = a.f45408b = ((Integer) view3.getTag()).intValue();
                    }
                } else if (actionMasked == 2) {
                    if (!a.a(view2, x, y, scaledTouchSlop)) {
                        zArr[0] = false;
                    }
                } else if (actionMasked == 1) {
                    if (zArr[0]) {
                        if (Math.abs(x - iArr[0]) >= scaledTouchSlop || Math.abs(y - iArr[1]) >= scaledTouchSlop) {
                            InterfaceC0783a interfaceC0783a2 = interfaceC0783a;
                            z2 = interfaceC0783a2 != null && interfaceC0783a2.a();
                            if (z2) {
                            }
                        } else {
                            z2 = false;
                        }
                        if (a.a(view3, x, y)) {
                            return false;
                        }
                        if (view3 instanceof MediaView) {
                            view3.setTag(Integer.valueOf(a.f45408b));
                        }
                        Object tag = (!z2 || interfaceC0783a == null) ? view2.getTag() : 30;
                        sg.bigo.ads.common.t.a.a(0, 4, "NativeAdHelper", "target.getTag: ".concat(String.valueOf(tag)));
                        View view4 = view;
                        View view5 = view2;
                        int[] iArr3 = iArr;
                        a.b(view4, view3, view5, x, y, iArr3[0], iArr3[1], i2, hVar, tag);
                    }
                } else if (actionMasked == 3) {
                    zArr[0] = false;
                }
                return true;
            }
        });
    }

    public static List<sg.bigo.ads.core.c.a> a(List<sg.bigo.ads.api.core.c.InterfaceC0832c> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (sg.bigo.ads.api.core.c.InterfaceC0832c interfaceC0832c : list) {
                if (interfaceC0832c != null) {
                    sg.bigo.ads.core.c.a aVar = new sg.bigo.ads.core.c.a();
                    aVar.f48324b = interfaceC0832c.b();
                    aVar.f48323a = interfaceC0832c.a();
                    aVar.f48325c = interfaceC0832c.c();
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, View view2, View view3, int i2, int i3, int i4, int i5, int i6, h hVar, Object obj) {
        while ((view2.getParent() instanceof ViewGroup) && view2 != view && !(view2 instanceof NativeAdView)) {
            i2 += view2.getLeft();
            i4 += view2.getLeft();
            i3 += view2.getTop();
            i5 += view2.getTop();
            view2 = (View) view2.getParent();
        }
        if (obj == null || !(obj instanceof Integer)) {
            obj = view3.getTag();
        }
        hVar.a(i2, i3, i4, i5, i6, obj instanceof Integer ? ((Integer) obj).intValue() : 0);
    }

    public static c a(sg.bigo.ads.api.core.g gVar) {
        m mVarE;
        int iP = gVar.f47032a.P();
        int iW = gVar.f47032a.w();
        int iX = gVar.f47032a.x();
        if (iP == 1 && ((iX == 3 || iX == 4) && iW == 2 && (mVarE = gVar.f47032a.e()) != null && mVarE.a("multi_ads.multi_ads_type") == 1)) {
            return new b(gVar);
        }
        if (iX != 1) {
            if (iX == 2) {
                if (iW == 1) {
                    return new sg.bigo.ads.ad.b.a.a(gVar);
                }
                if (iW == 2) {
                    return new sg.bigo.ads.ad.b.a.b(gVar);
                }
                return null;
            }
            if (iX != 3 && iX != 4 && iX != 12 && iX != 20) {
                switch (iX) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        if (iW == 5) {
                            return new sg.bigo.ads.ad.b.a.c(gVar);
                        }
                        return null;
                    default:
                        if (iW == 1) {
                            return new c(gVar);
                        }
                        if (iW == 2) {
                            return new d(gVar);
                        }
                        if (iW != 5) {
                            return null;
                        }
                        return new sg.bigo.ads.ad.b.a.c(gVar);
                }
            }
        }
        if (iW == 1) {
            return new sg.bigo.ads.ad.b.a.d(gVar);
        }
        if (iW == 2) {
            return new sg.bigo.ads.ad.b.a.e(gVar);
        }
        return null;
    }

    public static p a(c cVar) {
        p pVar;
        String str;
        n nVarAV = ((sg.bigo.ads.core.a.a) cVar.f()).aV();
        if (nVarAV != null) {
            p pVar2 = new p(nVarAV.f47054a, nVarAV.f47055b);
            if (pVar2.a()) {
                sg.bigo.ads.common.t.a.a(0, 3, "nativeRation", "real size");
                return pVar2;
            }
        }
        if (!(cVar instanceof d)) {
            o.a[] aVarArrAx = ((sg.bigo.ads.core.a.a) cVar.f()).ax();
            if (!k.a(aVarArrAx)) {
                pVar = new p(aVarArrAx[0].a(), aVarArrAx[0].b());
                str = "image first size";
                sg.bigo.ads.common.t.a.a(0, 3, "nativeRation", str);
                return pVar;
            }
            return new p(-1, -1);
        }
        sg.bigo.ads.core.f.a.p pVar3 = ((d) cVar).K;
        if (pVar3 != null) {
            pVar = new p(pVar3.x, pVar3.f48538w);
            if (pVar.a()) {
                str = "video vast size";
                sg.bigo.ads.common.t.a.a(0, 3, "nativeRation", str);
                return pVar;
            }
        }
        return new p(-1, -1);
    }

    public static void a(final View view, final View view2, final int i2, final h hVar, int i3) {
        if (hVar == null) {
            view2.setOnTouchListener(null);
            return;
        }
        if (i3 == 2) {
            final int[] iArr = {0, 0};
            a(view, view2, new View.OnTouchListener() { // from class: sg.bigo.ads.ad.b.a.3
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0) {
                        if (view3 instanceof MediaView) {
                            ((MediaView) view3).a(x, y);
                            int unused = a.f45408b = ((Integer) view3.getTag()).intValue();
                        }
                        int[] iArr2 = iArr;
                        iArr2[0] = x;
                        iArr2[1] = y;
                    }
                    if (actionMasked == 1) {
                        if (a.a(view3, x, y)) {
                            return false;
                        }
                        if (view3 instanceof MediaView) {
                            view3.setTag(Integer.valueOf(a.f45408b));
                        }
                        sg.bigo.ads.common.t.a.a(0, 4, "NativeAdHelper", "target.getTag: " + view2.getTag());
                        View view4 = view;
                        View view5 = view2;
                        int[] iArr3 = iArr;
                        a.b(view4, view3, view5, x, y, iArr3[0], iArr3[1], i2, hVar, null);
                    }
                    return true;
                }
            });
        } else if (i3 == 3) {
            b(view, view2, i2, hVar, null);
        } else {
            final int[] iArr2 = {0, 0};
            a(view, view2, new View.OnTouchListener() { // from class: sg.bigo.ads.ad.b.a.2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0) {
                        if (view3 instanceof MediaView) {
                            ((MediaView) view3).a(x, y);
                            int unused = a.f45408b = ((Integer) view3.getTag()).intValue();
                        }
                        int[] iArr3 = iArr2;
                        iArr3[0] = x;
                        iArr3[1] = y;
                    }
                    if (actionMasked == 1) {
                        if (view3 instanceof sg.bigo.ads.api.a) {
                            if (!((sg.bigo.ads.api.a) view3).a(x, y)) {
                                return false;
                            }
                        } else if (view3 == view || view3.getTag() == 1) {
                            if (!u.a(view3, x, y)) {
                                return false;
                            }
                        } else if ("internal_ad_component_view".equals(view3.getTag(a.f45407a)) && !u.a(view3, x, y)) {
                            return false;
                        }
                        if (view3 instanceof MediaView) {
                            view3.setTag(Integer.valueOf(a.f45408b));
                        }
                        sg.bigo.ads.common.t.a.a(0, 4, "NativeAdHelper", "target.getTag: " + view2.getTag());
                        View view4 = view;
                        View view5 = view2;
                        int[] iArr4 = iArr2;
                        a.b(view4, view3, view5, x, y, iArr4[0], iArr4[1], i2, hVar, null);
                    }
                    return true;
                }
            });
        }
    }

    public static void a(View view, View view2, int i2, h hVar, InterfaceC0783a interfaceC0783a) {
        b(view, view2, i2, hVar, interfaceC0783a);
    }

    private static void a(final View view, final View view2, final View.OnTouchListener onTouchListener) {
        view2.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.b.a.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                if (motionEvent.getActionMasked() == 0 && view != null) {
                    Object parent = view2.getParent();
                    if ((parent instanceof View) && u.b(((View) parent).findViewWithTag(4), rawX, rawY)) {
                        return false;
                    }
                }
                return onTouchListener.onTouch(view3, motionEvent);
            }
        });
    }

    public static void a(View view, Object obj) {
        if (view != null) {
            view.setTag(obj);
            view.setTag(f45407a, "internal_ad_component_view");
        }
    }

    public static /* synthetic */ boolean a(View view, int i2, int i3) {
        if (view instanceof MediaView) {
            return !((MediaView) view).a(i2, i3);
        }
        return !u.a(view, i2, i3);
    }

    public static /* synthetic */ boolean a(View view, int i2, int i3, int i4) {
        int i5 = -i4;
        return i2 >= i5 && i3 >= i5 && i2 < (view.getRight() - view.getLeft()) + i4 && i3 < (view.getBottom() - view.getTop()) + i4;
    }
}
